package co.edu.unbosque.cursojava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class MainApp {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			lanzarExcepciones();
		} catch (Lanzable lanzable) {
			// TODO Auto-generated catch block
			System.out.println("Lanzable = " + lanzable.dato);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

	private static void lanzarExcepciones() {
		// int a = 2/0;
		String b = null;
		// b.length();


		File file = new File("ruta_archivo");
		//FileInputStream ii = new FileInputStream(file);
		
		lanzarSLimple();
	}

	private static void lanzarSLimple() {
		
		System.out.println("Lógina compleja");
		Lanzable lanzable = new Lanzable();
		lanzable.dato = 1000;
		lanzable.lanzar();
		//throw lanzable;
	}
	
}
