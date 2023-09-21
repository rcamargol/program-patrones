package co.edu.unbosque.model;

public class Main {

	public static void main(String args[]){
		Subject subject = new Subject();
		
		new SoloObservador(subject);
		new PesoARGObservador(subject);
		new PesoMXObservador(subject);
		
		System.out.println("Si desea cambiar 10 dolares:");
		subject.setEstado(10);
		System.out.println("Si desea cambiar 100 dolares:");
		subject.setEstado(100);
		
	}
	
}
