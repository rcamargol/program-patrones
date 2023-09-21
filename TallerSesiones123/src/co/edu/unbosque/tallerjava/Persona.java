package co.edu.unbosque.tallerjava;

/*  Clase: Persona
 *  Propósito: Clase abstracta que contiene los datos básicos de las personas del taller: empleados, clietnes y proveedores.
 */


public abstract class Persona {

	protected String nombres;
	protected String apellidos;
	protected String fechaNacimiento;
	protected String genero;
	protected String identificacion;

	public Persona(String nombres, String apellidos, String fechaNacimiento, String genero, String identificacion) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.identificacion = identificacion;
	}

	
	@Override
	public String toString() {
		return "Persona [nombres=" + nombres + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento
				+ ", genero=" + genero + ", identificacion=" + identificacion + "]";
	}



	public abstract String getNombres();



	public void setNombres(String nombres) {
		this.nombres = nombres;
	}



	public abstract String getApellidos();



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public String getFechaNacimiento() {
		return fechaNacimiento;
	}



	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public String getIdentificacion() {
		return identificacion;
	}



	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

}
