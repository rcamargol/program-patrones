package co.edu.unbosque.model;

public class SQLServerBuilder extends ConexionBuilder{

	public SQLServerBuilder() {
		super.conexion = new CadenaConexion();
	}
	
	@Override
	public void asignarServidor() {
		// TODO Auto-generated method stub
		conexion.servidor = "Servidor SQL Server";
	}

	@Override
	public void asignarBD() {
		// TODO Auto-generated method stub
		conexion.nombreBD ="Nombre Instancia SQL Server";
	}

	@Override
	public void asignarUsuario() {
		// TODO Auto-generated method stub
		conexion.usuario = "Usuario SQL Server";
	}

	@Override
	public void asignarPassword() {
		// TODO Auto-generated method stub
		conexion.password ="Password usuario SQL Server";
	}
	
	public String toString() {
		String cadena = "Datos Conexion SQL Server: \n"+conexion.servidor+"\n"+conexion.nombreBD+"\n"; 
		cadena += conexion.usuario+"\n"+conexion.password;
		return cadena;
	}

}
