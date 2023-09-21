package co.edu.unbosque.model;

public class Oracle implements IConexion{
	
	private boolean conexionCorrecta = false;

	public Oracle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String conectar() {
		// TODO Auto-generated method stub
		this.conexionCorrecta = true;
		return "Conextado con BD Oracle";
	}

	@Override
	public boolean conexionEstablecida() {
		// TODO Auto-generated method stub
		return this.conexionCorrecta;
	}

}
