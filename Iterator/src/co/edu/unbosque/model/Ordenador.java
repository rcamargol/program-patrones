package co.edu.unbosque.model;

import java.util.ArrayList;

public class Ordenador {

	public ArrayList<String> datos;
	
	public Ordenador() {
		// TODO Auto-generated constructor stu=
		this.datos = new ArrayList();
	}
	
	public String getValor(int pos) {
		String o = null;
		if (pos < datos.size()) {
			return datos.get(pos);
		}
		return o;
	}
	
	public void agregarValor(String valor) {
		datos.add(valor);
	}
	
	public int dimension() {
		return datos.size();
	}
	
	public IteratorOrdenador iterador() {
		return new IteratorOrdenador(this);
	}

}
