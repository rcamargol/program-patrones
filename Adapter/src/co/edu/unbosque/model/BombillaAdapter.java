package co.edu.unbosque.model;

public class BombillaAdapter extends Bombilla {
	
	private Vela v = new Vela();

	public BombillaAdapter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String encender() {
		// TODO Auto-generated method stub
		return v.prenderFuego();
	}

	@Override
	public String aumentarIntensidad() {
		// TODO Auto-generated method stub
		return v.echarCombustible();
	}

	@Override
	public String apagar() {
		// TODO Auto-generated method stub
		return v.soplarParaApagar();
	}

}
