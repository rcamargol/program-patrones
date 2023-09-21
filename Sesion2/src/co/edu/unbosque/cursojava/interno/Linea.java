package co.edu.unbosque.cursojava.interno;

import co.edu.unbosque.cursojava.FiguraGeometrica;

public class Linea extends FiguraGeometrica {

	private int tamanio;

	public Linea(int tamanio) {
		this.tamanio = tamanio;
	}

	@Override
	public int calcularArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int calcularPerimetro() {
		// TODO Auto-generated method stub
		return tamanio;
	}
}