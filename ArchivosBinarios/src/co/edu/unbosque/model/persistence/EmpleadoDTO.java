package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class EmpleadoDTO implements Serializable{
	
	private int codigo;
	private String nombre;
	private double salario;
	
	public EmpleadoDTO(int codigo, String nombre, double salario) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.salario = salario;
	}
	
	public EmpleadoDTO() {
		
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
