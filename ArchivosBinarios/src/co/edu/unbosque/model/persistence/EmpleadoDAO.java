package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public class EmpleadoDAO {
	
	private ArrayList<EmpleadoDTO> empleados;
	private BinariosFile bf = new BinariosFile(); 

	public EmpleadoDAO() {
		empleados = new ArrayList<EmpleadoDTO>();
	}
	
	public void agregarEmpleado(EmpleadoDTO registro) {
		empleados.add(registro);
		bf.escribirEmpleados(empleados);
		leerEmpleados();
	}
	
	public void leerEmpleados() {
		empleados = bf.leerEmpleados();
	}
	
	//private EmpleadoDTO buscarEmpleado(int indice, EmpleadoDTO emp) {
	
	public void modificarEmpleado(int documento, EmpleadoDTO registro) {
		int indice = 0;
		//int indice = buscarxDocumento(double documento);
		empleados.set(indice, registro);
		bf.escribirEmpleados(empleados);
		leerEmpleados();
	}
	
	public void borrarEmpleado(int indice) {
		empleados.remove(indice);
	}

	public ArrayList<EmpleadoDTO> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<EmpleadoDTO> empleados) {
		this.empleados = empleados;
	}
	
	
}
