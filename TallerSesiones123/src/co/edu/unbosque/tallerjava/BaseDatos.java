package co.edu.unbosque.tallerjava;

import java.util.ArrayList;

/*  Clase: BaseDatos
 *  Propósito: Contiene el repositorio de la información de todos los clientes, proveedores, empleados, productos y departamentos
 */

public class BaseDatos {
	
	private ArrayList <Cliente> clientes;
	private ArrayList <Proveedor> proveedores;
	private ArrayList <Empleado> empleados;
	private ArrayList <Producto> productos;
	private ArrayList <Departamento> departamentos;
	
	public BaseDatos() {
		
		clientes = new ArrayList<Cliente>();
		proveedores = new ArrayList<Proveedor>();
		empleados = new ArrayList<Empleado>();
		productos = new ArrayList<Producto>();
		departamentos = new ArrayList<Departamento>();
	
		//Implementación de tres (3) clientes
		clientes.add(new Cliente("Jorge Alberto", "Rodriguez Gamez", "11-abr-1968", "M", "790211"));
		clientes.add(new Cliente("Adriana Luica", "Lesmes Arango", "21-sep-1998", "F", "3732334"));
		clientes.add(new Cliente("Miguel Angel", "Castro Vargas", "03-dic-2002", "M", "1200023"));

		//Implementación de tres (3) Proveedores
		proveedores.add(new Proveedor("Anderson Luis", "Gonzalez Lin", "05-may-1959", "M", "1298003"));
		proveedores.add(new Proveedor("Pedro Enrique", "Rosero Contreras", "12-oct-1969", "M", "194968"));
		proveedores.add(new Proveedor("Felipe Antonio", "Pantaleo Garcia", "07-nov-1969", "M", "329906"));

		//Implementación de 12 empleados
		empleados.add(new Empleado("Luis Fernando", "Andrade Barrios", "15-abr-2002", "M", "598261", "vendedor",	1500000, "ventas"));
		empleados.add(new Empleado("Juan Pablo", "Arce Carrero", "4-mar-2003", "M", "506493", "contador",2500000, "contabilidad"));
		empleados.add(new Empleado("Paula Alejandra", "Ardila Farfan", "3-sep-2002", "F", "918739", "vendedor",1500000, "ventas"));
		empleados.add(new Empleado("Rafael Eduardo", "Arias Vega", "7-may-2001", "M", "597334", "vendedor",	1500000, "mercadeo"));
		empleados.add(new Empleado("Angee Milena", "Ariza Zabala", "18-abr-2003", "F", "937815", "administrador",3000000, "ventas"));
		empleados.add(new Empleado("Brayan Estiven", "Ayala Forero", "3-ago-2002", "M", "408357", "contador",2500000, "contabilidad"));
		empleados.add(new Empleado("Paola Andrea", "Baron Rodriguez", "16-may-2003", "F", "591675", "vendedor",	1500000, "ventas"));
		empleados.add(new Empleado("Javier Eduardo", "Barreto Sanchez", "5-jul-2001", "M", "250439",	"administrador", 3000000, "contabilidad"));
		empleados.add(new Empleado("Juan Guillermo", "Bedoya Cardona", "29-may-2002", "M", "90793", "administrador", 3000000, "mercadeo"));
		empleados.add(new Empleado("Paola Sofia", "Berdugo Zambrano", "30-jul-2003", "F", "803485",	"secretaria", 900000, "contabilidad"));
		empleados.add(new Empleado("Andres Felipe", "Betancourt Ramirez", "25-nov-2001", "M", "1044343","contador", 2500000, "mercadeo"));
		empleados.add(new Empleado("Yulieth Eliana", "Blanco Molina", "11-abr-2003", "F", "347007",	"secretaria", 900000, "mercadeo"));

		
		//Implementación de 21 productos
		productos.add(new Producto("Melocotones", 16, 2500));
		productos.add(new Producto("Manzanas", 18, 1810));
		productos.add(new Producto("Plátanos", 37, 2900));
		productos.add(new Producto("Lechuga", 40, 2900));
		productos.add(new Producto("Tomates", 11, 2700));
		productos.add(new Producto("Calabaza", 8, 2100));
		productos.add(new Producto("Apio", 21, 1100));
		productos.add(new Producto("Pepino", 34, 1000));
		productos.add(new Producto("Champiñones", 18, 5000));
		productos.add(new Producto("Leche", 35, 5000));
		productos.add(new Producto("Queso", 7, 2600));
		productos.add(new Producto("Huevos", 20, 7500));
		productos.add(new Producto("Requesón", 24, 4500));
		productos.add(new Producto("Crema agria", 38, 6000));
		productos.add(new Producto("Yogur", 32, 5900));
		productos.add(new Producto("Ternera", 38, 8900));
		productos.add(new Producto("Icotea", 2, 28000));
		productos.add(new Producto("Panela", 22, 4500));
		productos.add(new Producto("Limones", 22, 2800));
		productos.add(new Producto("Uchuvas", 5, 8900));
		productos.add(new Producto("Frijoles", 26, 5900));
		
		//Implementación de cada departamento con 3 empleados y un jefe
		departamentos.add(new Departamento("ventas","937815"));
		departamentos.get(0).agregarEmpleados(empleados.get(0));
		departamentos.get(0).agregarEmpleados(empleados.get(2));
		departamentos.get(0).agregarEmpleados(empleados.get(6));
	
		departamentos.add(new Departamento("contabilidad","250439"));
		departamentos.get(1).agregarEmpleados(empleados.get(1));
		departamentos.get(1).agregarEmpleados(empleados.get(5));
		departamentos.get(1).agregarEmpleados(empleados.get(9));
		
		departamentos.add(new Departamento("mercadeo","90793"));
		departamentos.get(2).agregarEmpleados(empleados.get(3));
		departamentos.get(2).agregarEmpleados(empleados.get(10));
		departamentos.get(2).agregarEmpleados(empleados.get(11));
		
		//Implementación de cada proveedor con 7 productos
		proveedores.get(0).agregarProductos(productos.get(0));
		proveedores.get(0).agregarProductos(productos.get(1));
		proveedores.get(0).agregarProductos(productos.get(2));
		proveedores.get(0).agregarProductos(productos.get(3));
		proveedores.get(0).agregarProductos(productos.get(4));
		proveedores.get(0).agregarProductos(productos.get(5));
		proveedores.get(0).agregarProductos(productos.get(6));
		
		proveedores.get(1).agregarProductos(productos.get(7));
		proveedores.get(1).agregarProductos(productos.get(8));
		proveedores.get(1).agregarProductos(productos.get(9));
		proveedores.get(1).agregarProductos(productos.get(10));
		proveedores.get(1).agregarProductos(productos.get(11));
		proveedores.get(1).agregarProductos(productos.get(12));
		proveedores.get(1).agregarProductos(productos.get(13));
	
		proveedores.get(2).agregarProductos(productos.get(14));
		proveedores.get(2).agregarProductos(productos.get(15));
		proveedores.get(2).agregarProductos(productos.get(16));
		proveedores.get(2).agregarProductos(productos.get(17));
		proveedores.get(2).agregarProductos(productos.get(18));
		proveedores.get(2).agregarProductos(productos.get(19));
		proveedores.get(2).agregarProductos(productos.get(20));

	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Proveedor> getProveedores() {
		return proveedores;
	}

	public void setProveedores(ArrayList<Proveedor> proveedores) {
		this.proveedores = proveedores;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public ArrayList<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(ArrayList<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	
}
