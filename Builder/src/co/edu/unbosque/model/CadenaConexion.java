package co.edu.unbosque.model;

public class CadenaConexion {
	
	public String servidor;
	public String nombreBD;
	public String usuario;
	public String password;

	public CadenaConexion() {
		
	}
	
	public CadenaConexion(String servidor, String nombreBD, String usuario, String password) {
		this.servidor = servidor;
		this.nombreBD = nombreBD;
		this.usuario = usuario;
		this.password = password;
	}
	
}
