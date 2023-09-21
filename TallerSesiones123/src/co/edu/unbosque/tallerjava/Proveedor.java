package co.edu.unbosque.tallerjava;

import java.util.ArrayList;

/*  Clase: Proveedor
 *  Propósito: Describe los proveedores 
 */


public class Proveedor extends Persona{
	
	private ArrayList <Producto> productos; //esto es un arraylist


	public Proveedor(String nombres, String apellidos, String fechaNacimiento, String genero, String identificacion) {
		super(nombres, apellidos, fechaNacimiento, genero, identificacion);
		productos = new ArrayList<Producto>();
	}

	public void agregarProductos(Producto producto) {
		this.productos.add(producto);
	}
	
	

	@Override
	public String toString() {
		return "Proveedor [nombres=" + nombres + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento
				+ ", genero=" + genero + ", identificacion=" + identificacion + ", productos=" + productos + "]";
	}

	@Override
	public String getNombres() {
		// TODO Auto-generated method stub
		return this.nombres;
	}

	@Override
	public String getApellidos() {
		// TODO Auto-generated method stub
		return this.apellidos;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

}
