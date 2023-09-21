package co.edu.unbosque.cursojava;

public interface InterfazClasica {

	// Constantes
	public static final String CONSTANTE_1 = "constante1";
	String CONSTANTE_2 = "constante2";
	
	// Defición de metodos
	public abstract void metodo1();
	void metodo2();
	
	private static void algoritmo1() {
		System.out.println("método estático en una interfaz");
	}
	
	static void algoritmo2() {
		algoritmo1();
		System.out.println("otro método estático en una interfaz");
	}
	
	public default void metodo3() {
		System.out.println("método default en una interfaz");
	}
	
	public default void metodo4() {
		System.out.println("otro método default en una interfaz");
	}
}
