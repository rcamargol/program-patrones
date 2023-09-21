package co.edu.unbosque.cursojava.interno;

import co.edu.unbosque.cursojava.DosDimensiones;
import co.edu.unbosque.cursojava.FiguraGeometrica;

public class Ciculo extends FiguraGeometrica implements DosDimensiones {

	private int radio;
	
	public Ciculo(int radio) {
		this.radio = radio;
	}
	
	@Override
	public int calcularArea() {
		return (int) (Math.PI * radio * radio);
	}

	@Override
	public int calcularPerimetro() {
		return (int) (2 * Math.PI * radio);
	}

}
