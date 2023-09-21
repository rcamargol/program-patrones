package co.edu.unbosque.controller;

import co.edu.unbosque.model.Builder;
import co.edu.unbosque.view.View;

public class Controller {
	
	private Builder m;
	private View gui;
	
	public Controller() {
		m = new Builder();
		gui = new View();
		funcionar();
	}
	
	public void funcionar() {
		gui.mostrarResultados(m.hacerBuilder());
	}
}
