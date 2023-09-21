package co.edu.unbosque.controller;

import co.edu.unbosque.model.Herencia;
import co.edu.unbosque.view.View;

public class Controller {
	
	private Herencia m;
	private View gui;
	
	public Controller() {
		m = new Herencia();
		gui = new View();
		funcionar();
	}
	
	public void funcionar() {
		String texto = "Yo soy: "+m.getE().getNombre() +"\n y e gusta"+ m.getE().dormir();
		texto += " y trabajo: "+m.getE().trabajar();
		gui.mostrarResultados(texto);
	}
}
