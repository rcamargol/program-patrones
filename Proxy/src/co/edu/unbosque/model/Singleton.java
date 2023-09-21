package co.edu.unbosque.model;

public class Singleton{

	private static Singleton singletonEjemplo = null;
	public String texto = null;
	public int numero;
	
	private Singleton(String valor) {
		// TODO Auto-generated constructor stub
		this.texto = valor;
		this.numero = 0x2f;
	}

	public static Singleton getSingleton() {
		if (singletonEjemplo == null)
			singletonEjemplo = new Singleton("Creada");
		return singletonEjemplo;
	}

	public String asignarCadena(String cadena) {
		return "Cadena Cx asignada:"+cadena;
	}
}
