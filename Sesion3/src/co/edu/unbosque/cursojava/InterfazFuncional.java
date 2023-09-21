package co.edu.unbosque.cursojava;

@FunctionalInterface
public interface InterfazFuncional {

	// Constantes
	int MAX = Integer.MAX_VALUE;
	
	// Métodos default
	default void metodo1() {
	}
	
	// Métodos estáticos
	static void metodo2() {
	}
	
	void metodo3();
}
