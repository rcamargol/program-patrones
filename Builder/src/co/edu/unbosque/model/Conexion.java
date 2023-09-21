package co.edu.unbosque.model;

public class Conexion {

	private ConexionBuilder conexionBuilder;
	
	public Conexion() {
		// TODO Auto-generated constructor stub
	}
	
	public void nuevaConexion(ConexionBuilder conBuilder) {
		this.conexionBuilder = conBuilder;
	}
	
	public void crearCadenaConexion() {
		this.conexionBuilder.asignarServidor();
		this.conexionBuilder.asignarBD();
		this.conexionBuilder.asignarUsuario();
		this.conexionBuilder.asignarPassword();
	}
	
	public CadenaConexion conexionLista() {
		return conexionBuilder.getCadenaConexion();
	}

}
