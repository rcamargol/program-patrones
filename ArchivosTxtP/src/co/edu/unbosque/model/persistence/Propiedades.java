package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {
	
	private String cliente;

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Propiedades() {
		// TODO Auto-generated constructor stub
	}

	private Properties prop = new Properties();
	private String archivoprop = "C:\\data\\config.properties";

	public int escribirPropiedades() {
		try {
			prop.setProperty("nombreCliente", "Jorge Garcia");
			prop.setProperty("nombreArchivo", "archivo.properties");
			prop.setProperty("nombreCodigoFuente", "Propiedades.Java");
			prop.store(new FileOutputStream(archivoprop), null);
		} 
		catch (IOException ex) {
			return -1;
		}
		return 0;
	}	

	/* continua ... */
	
	public String leerPropiedades() {
		String linea="";
		try {
			// leer el archivo de propiedades
		prop.load(new FileInputStream(archivoprop));

		// obtener las propiedades definidas
		prop.list(System.out);
		//Reading each property value
		this.cliente = prop.getProperty("nombreCliente");
		linea += "nombre del Cliente :" + prop.getProperty("nombreCliente")+"\n";
		linea += "nombre del Archivo :" + prop.getProperty("nombreArchivo")+"\n";
		linea += "nombre de la Clase Java :" + prop.getProperty("nombreCodigoFuente")+"\n";
		} 
		catch (IOException ex) {
			return null;
		}
		return linea;
	}
}
