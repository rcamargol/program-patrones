package co.edu.unbosque.model;

public class GestionConexion {

	private IConexion conexion;
	
	public GestionConexion() {
		// TODO Auto-generated constructor stub
	}
	
	public void conexionOracle() {
		this.conexion = new Oracle();
	}
	
	public void conexionSQL() {
		this.conexion = new SQL();
	}
	
	public String conectar() {
		return this.conexion.conectar();
	}
	
	public boolean conexionCorrecta() {
		return this.conexion.conexionEstablecida();
	}

}
