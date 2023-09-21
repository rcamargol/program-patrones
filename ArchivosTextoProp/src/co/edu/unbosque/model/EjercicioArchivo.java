package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.EjemploFile;
import co.edu.unbosque.model.persistence.Propiedades;

public class EjercicioArchivo{
	
	public String gestionarArchivoCadena() {
		
		EjemploFile archivo = new EjemploFile();
		
		archivo.escribirArchivo("Dato de tipo String");
		return "leí este dato : "+archivo.leerArchivo();
		
	}
	
	public String gestionarPropiedades() {
		Propiedades prop = new Propiedades();
		
		prop.escribirPropiedades();
		return "Se leyeron estas propiedades: "+"\n"+prop.leerPropiedades();
	}
	
}



