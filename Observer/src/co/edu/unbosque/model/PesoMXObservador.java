package co.edu.unbosque.model;

public class PesoMXObservador extends Observador{

	private double valorCambio = 19.07;
	
	public PesoMXObservador(Subject sujeto) {
		// TODO Auto-generated constructor stub
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}

	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		System.out.println("MX: "+ sujeto.getEstado() * valorCambio);
	}

}
