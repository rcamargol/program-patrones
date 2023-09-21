package co.edu.unbosque.controller;

import co.edu.unbosque.model.ClaseX;
import co.edu.unbosque.model.NoSeaGuacheException;
import co.edu.unbosque.model.NumerChimboException;
import co.edu.unbosque.view.View;

public class Controller {
	
	private ClaseX m;
	private View gui;
	
	public Controller() {
		int[] a = new int [10];
		for (int i=0; i<10 ; i++) {
			a[i] = i;
		}
		int n = 3;
		
		m = new ClaseX();
		gui = new View();
		//funcionar();
		System.out.println("Resultado de haceAlgo1: "+m.haceAlgo1(n, a));
		System.out.println("Resultado de haceAlgo2: "+m.haceAlgo2(n, a));
	}
	
	public void funcionar() {
		try {
			gui.mostrarResultados(m.generarExcepcion());
		} catch (NumerChimboException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSeaGuacheException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
