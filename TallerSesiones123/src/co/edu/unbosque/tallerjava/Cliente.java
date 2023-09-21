package co.edu.unbosque.tallerjava;

import java.util.ArrayList;

/*  Clase: Cliente
 *  Propósito: Describe al cliente -- hereda de la Clase Abstracta Persona.
 */
public class Cliente extends Persona{

	private ArrayList<Pago> pagosRealizados = new ArrayList<Pago>();

	public Cliente(String nombres, String apellidos, String fechaNacimiento, String genero, String identificacion) {
		super(nombres, apellidos, fechaNacimiento, genero, identificacion);
	}

	public void agregarPagos(Pago pago) {
		this.pagosRealizados.add(pago);
	}
	
	
	@Override
	public String toString() {
		return "\nDatos del Cliente: \nnombres=" + nombres + "\napellidos=" + apellidos + "\nfechaNacimiento=" + fechaNacimiento
				+ "\ngenero=" + genero + "\nidentificacion=" + identificacion + "\n\nPagos Realizados:\n" + pagosRealizados;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return super.apellidos;
	}

	public void setApellidos(String apellidos) {
		super.apellidos = apellidos;
	}

	public String getFechaNacimiento() {
		return super.fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		super.fechaNacimiento = fechaNacimiento;
	}

	public String getGenero() {
		return super.genero;
	}

	public void setGenero(String genero) {
		super.genero = genero;
	}

	public String getIdentificacion() {
		return super.identificacion;
	}

	public void setIdentificacion(String identificacion) {
		super.identificacion = identificacion;
	}

	public ArrayList<Pago> getPagosRealizados() {
		return pagosRealizados;
	}

	public void setPagosRealizados(ArrayList<Pago> pagosRealizados) {
		this.pagosRealizados = pagosRealizados;
	}

}
