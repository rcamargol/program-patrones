package co.edu.unbosque.model;

import java.time.LocalDateTime;

public class Horas {

	private LocalDateTime fecha;
	
	public Horas() {
		// TODO Auto-generated constructor stub
	}
	
	public Memento guardarFecha() {
		return new Memento(this.fecha);
	}
	
	public void restaurarFecha(Memento memento) {
		this.fecha = memento.getFecha();
	}
	
	public LocalDateTime getFecha() {
		return this.fecha;
	}
	
	public void asignarFecha(LocalDateTime f) {
		this.fecha = f;
	}

}
