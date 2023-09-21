package co.edu.unbosque.model;

public class Empleado extends Persona{
	
	private String cargo;
	
	public Empleado(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
		this.cargo = "obrero";
	}

	public String trabajar() {
		return super.nombre+" " + this.cargo;
	}
}
