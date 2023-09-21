package co.edu.unbosque.model;

import java.util.ArrayList;

public class CareTaker {

	private ArrayList<Memento> fechas = new ArrayList<Memento>();
	
	public void agregarMemento(Memento m) {
		fechas.add(m);
	}
	
	public Memento getMemento(int index) {
		return (fechas.get(index));
	}
	
}
