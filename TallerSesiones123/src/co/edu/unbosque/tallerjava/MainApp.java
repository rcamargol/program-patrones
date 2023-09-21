package co.edu.unbosque.tallerjava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/* Programa: Taller Sesiones 1,2,3
 * Autor: Ing. Ricardo David Camargo Lemos
 * Universidad El Bosque
 * Correo: rcamargol@unbosque.edu.co
 * Curso: Lenguaje Java -- Programación Orientada a Objetos
 */


/*  Clase: MainApp
 *  Propósito: Punto principal de ejecución del programa
 */

public class MainApp {

	private static BaseDatos bd;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instancia de clase BaseDatos con toda la información de clientes, productos, proveedores, Empleados y departamentos
		bd = new BaseDatos();

		//Agregar tres pagos de dos (2) productos cada uno para cliente1
		Cliente cliente1 = bd.getClientes().get(0);
		cliente1.agregarPagos(hacerPagos(cliente1, convertirFecha("2021-06-04"), 2));
		cliente1.agregarPagos(hacerPagos(cliente1, convertirFecha("2021-06-07"), 2));
		cliente1.agregarPagos(hacerPagos(cliente1, convertirFecha("2021-06-10"), 2));

		//Agregar dos pagos de cuatro (4) productos cada uno para cliente2
		Cliente cliente2 = bd.getClientes().get(1);
		cliente2.agregarPagos(hacerPagos(cliente2, convertirFecha("2021-04-11"), 4));
		cliente2.agregarPagos(hacerPagos(cliente2, convertirFecha("2021-05-21"), 4));

		//Agregar un pago de siete (7) productos cada uno para cliente3
		Cliente cliente3 = bd.getClientes().get(2);
		cliente3.agregarPagos(hacerPagos(cliente3, convertirFecha("2021-08-10"), 7));
		//Impresion de datos de los tres clientes
		System.out.println("*** Datos de los Tres Clientes");
		System.out.println(cliente1);
		System.out.println(cliente2);
		System.out.println(cliente3);
		generarReportesPersonas();
		generarReportePagos();
		generarReporteProveedores();
		generarReporteSumaSalarios();
		
	}

	public static LocalDate convertirFecha(String fecha) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate fecha1 = LocalDate.parse(fecha, formatter);
		return fecha1;
	}
	
	public static Pago hacerPagos(Cliente cliente, LocalDate fechaPago, int numProductos) {
		int i, numero, numero2;
		Producto producto;
		Pago pago = new Pago(fechaPago, cliente.getIdentificacion());
		for (i = 0; i < numProductos; i++) {
			numero = (int) (Math.random() * 10);
			numero2 = (int) (Math.random() * 10) + 1;
			producto = new Producto(bd.getProductos().get(numero).getNombre(), 
									numero2,
									bd.getProductos().get(numero).getValorUnitario());
			pago.agregarProductos(producto);
		}
		pago.calcularPagoTotal();
		return pago;
	}
	
	public static void generarReportesPersonas() {
		System.out.println("\n\n*** Reportes de Personas y de Nombres Ordenado Alfabeticamente");
		List<ArrayList<? extends Persona>> personas = List.of(bd.getClientes(),bd.getProveedores(),bd.getEmpleados());
		ArrayList<String> nombres = new ArrayList<String>();
		for(ArrayList<? extends Persona> persona : personas) {
			for (int i=0 ; i<persona.size();i++) {
				nombres.add(persona.get(i).getNombres()+"-"+persona.get(i).getApellidos());
			}
		}

		//Reporte de todos los nombres
		System.out.println("\n>> Reporte todos los nombres de Personas:\n");
		nombres.stream().forEach(nombre -> System.out.println(nombre));
		
		//Reporte ordenado por nombres imprimiendo solo el nombre
		System.out.println("\n>> Reporte de Nombres Ordenado\n");
		nombres.stream().
			sorted().
			forEach(nombre -> System.out.println(nombre.split("-")[0]));
	}
	
	//Reportes de: a) pagos por cliente y fecha ordenada, y b) Total de Pagos por cliente.
	public static void generarReportePagos() {
		System.out.println("\n\n*** Reporte Compra por Fecha Ordenada y Valor Total de Pagos");
		for (Cliente cliente : bd.getClientes()) {
			double totalPagos = 0.0;
			List<LocalDate> fechas = new ArrayList<LocalDate>();
			for(Pago pago : cliente.getPagosRealizados()) {
				totalPagos += pago.getValorNeto();
				fechas.add(pago.getFechaPago());
			}	
			System.out.println("\nCliente:"+cliente.getNombres()+" "+cliente.getApellidos());
			fechas.stream().
			sorted().forEach(fecha -> System.out.println("   Fecha Compra Ordenada:"+fecha));
			System.out.println("   \nTotal Pagos: $"+totalPagos);
		}

	}
	
	public static void generarReporteProveedores() {
		System.out.println("\n\n*** Reporte Proveedores con productos de inicial en Vocal");
		List<String> vocales = new ArrayList<String>();
		vocales.add("A");
		vocales.add("E");
		vocales.add("I");
		vocales.add("O");
		vocales.add("U");
		for (Proveedor proveedor : bd.getProveedores()) {
			List<String> productos = new ArrayList<String>();
			for (Producto producto : proveedor.getProductos()) {
				for(String letra : vocales) {
					if(producto.getNombre().startsWith(letra))
						productos.add(producto.getNombre());
				}
			}
			if (productos.size() > 0) {
				System.out.println("\n  Proveedor:"+proveedor.getNombres()+" "+proveedor.getApellidos());
				System.out.println("   "+productos);
			}
		}
	}
	
	public static void generarReporteSumaSalarios() {
		System.out.println("\n\n*** Reporte Salarios por Departamento");
		double totalSalarios;
		String nomDepto;
		for (Departamento depto : bd.getDepartamentos()) {
			nomDepto = depto.getNombre();
			totalSalarios = 0;
			for(Empleado emp : depto.getEmpleados()) {
				totalSalarios += emp.getSalario(); 
			}
			System.out.println("\nNombre Departamento:"+nomDepto);
			System.out.println("Valor Total de Los Salarios:$"+totalSalarios);
		}
	}
}
