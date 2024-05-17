package co.edu.unbosque.model;

public class Circulo implements Figura{
	
	private double radio;
	
	
	public Circulo() {
		
	}
	
	public Circulo(double radio) {
		
	}
	
	public Circulo (Object cualquierCosa) {
		
	}
	

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		this.radio = Math.PI * radio * radio;
		return this.radio;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}	
	public double calcularArea(double radio) {
		return Math.PI * radio * radio;
	}
	
	public double calcularArea(double radio, double pi) {
		pi = Math.PI;
		return pi * radio * radio;
	}
}
