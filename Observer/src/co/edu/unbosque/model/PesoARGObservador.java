package co.edu.unbosque.model;

public class PesoARGObservador extends Observador{
	
	private double valorCambio = 29.86;
	
	public PesoARGObservador(Subject sujeto) {
		// TODO Auto-generated constructor stub
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}

	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		System.out.println("ARG: "+sujeto.getEstado() * valorCambio);
	}

}
