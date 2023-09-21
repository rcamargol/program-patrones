package co.edu.unbosque.model;

public abstract class ConexionBuilder {
	
	protected CadenaConexion conexion;
	
	public abstract void asignarServidor(); 
	public abstract void asignarBD(); 
	public abstract void asignarUsuario(); 
	public abstract void asignarPassword(); 

	public CadenaConexion getCadenaConexion() {
		return this.conexion;
	}

}
