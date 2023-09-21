package co.edu.unbosque.model;

import java.util.ArrayList;

public class IteratorOrdenador {

	private ArrayList ordenador;
	private int posicion;
	
	public IteratorOrdenador(Ordenador o) {
		// TODO Auto-generated constructor stub
		this.ordenador = o.datos;
		this.posicion = 0;
	}
	
	public boolean existeSiguiente() {
		if (posicion < ordenador.size()) {
			return true;
		}
		else
			return false;
	}
	
	public Object siguiente() {
		 Object valor = ordenador.get(posicion);
		 posicion++;
		 return valor;
	}

}
