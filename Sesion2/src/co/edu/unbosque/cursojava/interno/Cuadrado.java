package co.edu.unbosque.cursojava.interno;

import co.edu.unbosque.cursojava.DosDimensiones;

public class Cuadrado extends Rectangulo implements DosDimensiones {

	public Cuadrado(int l) {
		super(l, l); // contructor del papá -> new Rectangulo(l, l);
	}	
	

	@Override
	public int calcularPerimetro() {
		return super.calcularPerimetro() + 1;
	}
}
