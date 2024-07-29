package co.edu.unbosque.controller;

import co.edu.unbosque.model.Circulo;
import co.edu.unbosque.model.ClaseX;
import co.edu.unbosque.model.SuNumeroEstaReXException;
import co.edu.unbosque.view.View;

public class Controller {
	
	private ClaseX m;
	private View gui;
	
	public Controller() throws SuNumeroEstaReXException {
		m = new ClaseX();
		gui = new View();
		
		Circulo c = new Circulo();
		
		System.out.println(c);
		
		gui.mostrarResultados(m.ejecutarOtraException());
		//funcionar();
	}
	
	public void funcionar() {
		gui.mostrarResultados(m.procesarDato(gui.pedirDato()));
	}
}
