package co.edu.unbosque.model;

public class Main {

	public static void main(String args[]) {
		// TODO Auto-generated constructor stub
		Servidor servidor = new ProxyMiServidor(20,"http://loquesea.com");
		System.out.println(servidor.descargar("descargaPermitida"));
		System.out.println(servidor.descargar("descargaDenegada"));
	}
	
}
