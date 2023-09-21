package co.edu.unbosque.model;

import java.time.LocalDateTime;

public class Main {

	public static void main(String args[]) throws InterruptedException {
		CareTaker caretaker = new CareTaker();
		Horas c1 = new Horas();
		c1.asignarFecha(LocalDateTime.now());
		Thread.sleep(5000);
		
		Horas c2 = new Horas();
		c2.asignarFecha(LocalDateTime.now());
		
		caretaker.agregarMemento(c1.guardarFecha());
		caretaker.agregarMemento(c2.guardarFecha());
		
		Memento memento1 = caretaker.getMemento(0);
		Memento memento2 = caretaker.getMemento(1);
		
		LocalDateTime f1 = memento1.getFecha();
		LocalDateTime f2 = memento2.getFecha();
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());
	}
	
}
