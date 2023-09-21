package co.edu.unbosque.model;

public class SQL implements IConexion{
	
	private boolean conexionCorrecta = false;
	
	public SQL() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String conectar() {
		// TODO Auto-generated method stub
		conexionCorrecta = false;
		return "Conectando con BD SQL";
	}

	@Override
	public boolean conexionEstablecida() {
		// TODO Auto-generated method stub
		return conexionCorrecta;
	}

}
