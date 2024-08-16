package co.edu.unbosque.model;

public class ClaseX {
	private ClaseY y;
	private Canino canino;
	

	public ClaseX() {
		y = new ClaseY();
		canino = new Canino();
	}

	public String procesarDato(String dato) {
		return dato + " Proceso en ClaseX";
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

	public Canino getCanino() {
		return canino;
	}

	public void setCanino(Canino canino) {
		this.canino = canino;
	}

	
}
