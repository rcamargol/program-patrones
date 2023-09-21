package co.edu.unbosque.tallerjava;

/*  Clase: Producto
 *  Propósito: Describe los productos que el cliente puede adquirir, y el proveedor ofrecer
 */

public class Producto {
	
	private String nombre;
	private Integer cantidad;
	private double valorUnitario;
	
	public Producto(String nombre, Integer cantidad, double valorUnitario) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.valorUnitario = valorUnitario;
	}


	@Override
	public String toString() {
		String cadena = "nombre=" + nombre + " cantidad=" + cantidad + " valorUnitario=" + valorUnitario + "\n";
		//"\nProducto [nombre=" + nombre + "\tcantidad=" + cantidad + "\tvalorUnitario=" + valorUnitario + "]\n"		
		return cadena;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Integer getCantidad() {
		return cantidad;
	}



	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}



	public double getValorUnitario() {
		return valorUnitario;
	}



	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

}
