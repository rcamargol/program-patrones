package co.edu.unbosque.model;

public class MiServidor extends Servidor {
	
	private String host;
	private int puerto;

	public MiServidor(int p, String h) {
		this.puerto = p;
		this.host = h;
	}
	
	@Override
	public String descargar(String url) {
		// TODO Auto-generated method stub
		return "Descargando de "+ this.host;
	}


}
