package co.edu.unbosque.cursojava.interno;

import co.edu.unbosque.cursojava.DosDimensiones;
import co.edu.unbosque.cursojava.FiguraGeometrica;

public class Rectangulo extends FiguraGeometrica implements DosDimensiones {

	private int base;
	private int altura;

	public Rectangulo(int b, int a) {
		base = b;
		altura = a;
	}
	@Override
	public int calcularArea() {
		return base * altura;
	}

	@Override
	public int calcularPerimetro() {
		return (base * 2) + (altura * 2);
	}
	

}
