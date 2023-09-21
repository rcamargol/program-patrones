package co.edu.unbosque.controller;

import co.edu.unbosque.model.EjercicioArchivo;
import co.edu.unbosque.view.View;

public class Controller {
	
	private View gui;
	private EjercicioArchivo m;
	
	public Controller() {
		m = new EjercicioArchivo();
		gui = new View();
		funcionar();
	}
	
	public void funcionar() {
		gui.escribirDato(m.gestionarArchivoCadena());
	}
}
