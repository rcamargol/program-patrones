package co.edu.unbosque.tallerjava;

import java.util.ArrayList;

/*  Clase: Departamento
 *  Propósito: Describe los Departamentos de la empresa, e incluye sus empleados.
 */


public class Departamento {
	
	private String nombre;
	private String director; //viene de empleado
	private ArrayList<Empleado> empleados; //arraylist

	public Departamento(String nombre, String director) {
		empleados = new ArrayList<Empleado>();
		this.nombre = nombre;
		this.director = director;
	}

	public void agregarEmpleados(Empleado empleado) {
		this.empleados.add(empleado);
	}

	
	
	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", director=" + director + ", empleados=" + empleados + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}


}
