package co.edu.unbosque.model;

public class Circulo1  extends FiguraCircular1 implements Figura1{
	
	private double radio;

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * radio * radio;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return Math.PI * 2 * radio;
	}

	@Override
	public double calcularDiametro() {
		// TODO Auto-generated method stub
		return 2 * radio;
	}

}
