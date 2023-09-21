package co.edu.unbosque.model;

public class Mueble implements Cloneable {

	private int numAsientos;
	private String nombre;
	
	public Mueble() {
		// TODO Auto-generated constructor stub
	}

	public int getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Object clone() {
		//copia superficial
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}
	
}
