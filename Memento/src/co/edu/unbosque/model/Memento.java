package co.edu.unbosque.model;

import java.time.LocalDateTime;

public class Memento {

	private LocalDateTime fecha;
	
	public Memento(LocalDateTime tiempo) {
		// TODO Auto-generated constructor stub
		this.fecha = tiempo;
	}
	
	public LocalDateTime getFecha() {
		return this.fecha;
	}

}
