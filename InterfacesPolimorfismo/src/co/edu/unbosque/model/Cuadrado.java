/**
 * 
 */
package co.edu.unbosque.model;

/**
 * @author RicardoD
 *
 */
public class Cuadrado implements Figura{

	/**
	 * 
	 */
	private int lado;
	
	public Cuadrado() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return lado * lado;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return lado * 4;
	}

}
