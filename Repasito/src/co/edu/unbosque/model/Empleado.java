package co.edu.unbosque.model;

public class Empleado extends Persona{

	private double salario;
	private String cargo;

	public Empleado(String nombre, int edad, double salario, String cargo) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
		this.cargo = cargo;
		this.salario = salario;
	}

	public String trabajar() {
		String cadena;
		cadena="Mi nombre es "+ super.nombre + " y me da mamera camellar";
		cadena+=" y ademas "+super.comer();
		return cadena;
	}

}
