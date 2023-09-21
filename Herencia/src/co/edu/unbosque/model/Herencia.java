package co.edu.unbosque.model;

public class Herencia {
	private Persona p;
	private Empleado e;
	
	public Empleado getE() {
		return e;
	}

	public void setE(Empleado e) {
		this.e = e;
	}

	public Persona getP() {
		return p;
	}

	public void setP(Persona p) {
		this.p = p;
	}

	public Herencia() {
		p = new Persona("Romelu Lukaku", 29);
		e = new Empleado("Jorge Vadano", 62);
	}

	public String procesarDato(String dato) {
		return dato + " Proceso en ClaseX";
	}

	public int sumar20alDato(int dato) {
		return dato+20;
	}
	
}
