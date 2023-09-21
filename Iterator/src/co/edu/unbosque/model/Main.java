package co.edu.unbosque.model;

public class Main {

	public static void main(String args[]){
		Ordenador lista = new Ordenador();
		lista.agregarValor("Pentium 1");
		lista.agregarValor("Pentium 2");
		lista.agregarValor("Pentium 3");
		lista.agregarValor("Pentium 4");
		
		IteratorOrdenador iterador = lista.iterador();
		
		while (iterador.existeSiguiente()) {
			System.out.println(iterador.siguiente());
		}
	}
	
}
