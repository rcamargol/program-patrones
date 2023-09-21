package co.edu.unbosque.model;

public class ClaseX {
	ClaseY y;
	private Circulo c;
	
	public ClaseX() {
		y = new ClaseY();
		c = new Circulo();
	}

	public double procesarDato(String dato) {
		c.setRadio(10);
		return c.calcularArea();
	}

	public int sumar20alDato(int dato) {
		return dato+20;
	}
	
	public ClaseY getY() {
		return y;
	}

	public void setY(ClaseY y) {
		this.y = y;
	}
	
	public double calcularArea() {
		double y1, y2, y3;
		
		y1 = y.calcularArea(10.5);
		y2 = y.calcularArea(10, 3);
		
		return y2;
	}

	
}
