package co.edu.unbosque.tallerjava;

import java.time.LocalDate;
import java.util.ArrayList;

/*  Clase: Pago
 *  Propósito: Relación de los Pagos que hace un cliente.
 */
public class Pago {
	
	private LocalDate fechaPago;
	private String cliente;
	private ArrayList<Producto> productos = new ArrayList<Producto>();//ArrayList<String> nombreArrayList = new ArrayList<String>();
	private double valorTotal;
	private double impuestos;
	private double valorNeto;
	
	public Pago(LocalDate fechaPago, String cliente, double valorNeto) {
		this.fechaPago = fechaPago;
		this.cliente = cliente;
		this.valorNeto = valorNeto;
	}
	
	public Pago(LocalDate fechaPago, String cliente) {
		this.fechaPago = fechaPago;
		this.cliente = cliente;
		this.valorNeto = 0.0;
	}

	public void agregarProductos(Producto producto) {
		this.productos.add(producto);
	}
	
	public void calcularValorTotal() {
		 productos.stream().forEach((p)->{
			 this.valorTotal+=(p.getValorUnitario() * p.getCantidad());
		 });
	}
	
	public void calcularImpuestos() {
		//Se asume un valor de IVA del 19%
		this.impuestos = this.valorTotal * 0.19;
	}
	
	public void calcularValorNeto() {
		this.valorNeto = this.valorTotal + this.impuestos;
	}
	
	public void calcularPagoTotal() {
		this.calcularValorTotal();
		this.calcularImpuestos();
		this.calcularValorNeto();
	}
	
	
	
	@Override
	public String toString() {
		String cadena = "\n*** Pago [fechaPago=" + fechaPago + "\tcliente=" + cliente + "]\n";
				cadena +="productos=" + productos + "\n*** valorTotal="
				+ valorTotal + "\timpuestos=" + impuestos + "\tvalorNeto=" + valorNeto + "]";
		//"\n*** Pago [fechaPago=" + fechaPago + "\tcliente=" + cliente + "]\nproductos=" + productos + "\n*** valorTotal="
				//+ valorTotal + "\timpuestos=" + impuestos + "\tvalorNeto=" + valorNeto + "]";
		return cadena;
	}

	public LocalDate getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	public double getValorNeto() {
		return valorNeto;
	}

	public void setValorNeto(double valorNeto) {
		this.valorNeto = valorNeto;
	}

}
