package co.edu.unbosque.model;

public class ProxyMiServidor extends Servidor{
	
	private int puerto;
	private String host;
	private MiServidor miServidor;
	
	public ProxyMiServidor(int p, String h) {
		// TODO Auto-generated constructor stub
		this.puerto = p;
		this.host = h;
		this.miServidor = null;
	}

	@Override
	public String descargar(String url) {
		// TODO Auto-generated method stub
		String resultado = "";
		if(archivoRestringido(url)) {
			if(miServidor == null)
				miServidor = new MiServidor(puerto, host);
			resultado = miServidor.descargar(url);
		}
		else
			resultado = "Desde esta URL no se puede descargar";
		return resultado;
	}
	
	public Boolean archivoRestringido(String ruta) {
		Boolean descargaPermitida = false;
		if(ruta == "descargaPermitida")
			descargaPermitida = true;
		return descargaPermitida;
	}

}
