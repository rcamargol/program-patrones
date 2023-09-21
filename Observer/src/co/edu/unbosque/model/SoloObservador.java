package co.edu.unbosque.model;

public class SoloObservador extends Observador{
	
	private double valorCambio = 3.25;

	public SoloObservador(Subject sujeto) {
		// TODO Auto-generated constructor stub
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}

	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		System.out.println("PEN: "+ sujeto.getEstado() * valorCambio);
	}

}
