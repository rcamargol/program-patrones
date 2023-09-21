package co.edu.unbosque.tallerjava;

/*  Clase: Empleado
 *  Propósito: Describe Empleados de la empresa 
 */


public class Empleado extends Persona{

	private String cargo;
	private double salario;
	private String departamento;


	public Empleado(String nombres, String apellidos, String fechaNacimiento, String genero, String identificacion,
			String cargo, double salario, String departamento) {
		super(nombres, apellidos, fechaNacimiento, genero, identificacion);
		this.cargo = cargo;
		this.salario = salario;
		this.departamento = departamento;
	}



	@Override
	public String toString() {
		return "Empleado [nombres=" + nombres + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento
				+ ", genero=" + genero + ", identificacion=" + identificacion + ", cargo=" + cargo + ", salario="
				+ salario + ", Departamento=" + departamento + "]";
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



	public String getCargo() {
		return cargo;
	}



	public void setCargo(String cargo) {
		this.cargo = cargo;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public String getDepartamento() {
		return departamento;
	}



	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

}
