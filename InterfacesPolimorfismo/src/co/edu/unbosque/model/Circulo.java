/**
 * 
 */
package co.edu.unbosque.model;

/**
 * @author RicardoD
 *
 */
public class Circulo extends ClaseY implements Figura {

	/**
	 * 
	 */
	
	private int radio;
	
	public Circulo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * radio * 2;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		super.haceAlgo();
		return Math.PI * radio * radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	

}
