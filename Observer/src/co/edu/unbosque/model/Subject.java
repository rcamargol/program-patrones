package co.edu.unbosque.model;

import java.util.ArrayList;

public class Subject {

	private ArrayList<Observador> observadores = new ArrayList<Observador>();
	private int estado;

	public Subject() {
		// TODO Auto-generated constructor stub
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
		notificarTodosObservadores();
	}
	
	public void agregar(Observador observador) {
		observadores.add(observador);
	}

	public void notificarTodosObservadores() {
		for (Observador observador : observadores) {
			observador.actualizar();
		}
	}

}
