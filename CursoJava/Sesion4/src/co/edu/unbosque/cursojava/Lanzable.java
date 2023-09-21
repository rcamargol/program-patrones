package co.edu.unbosque.cursojava;

public class Lanzable extends RuntimeException {

	int dato;
	
	void lanzar() {
		throw this;
	}
}
