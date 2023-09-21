package co.edu.unbosque.model;

public class MySQLBuilder extends ConexionBuilder{

	public MySQLBuilder() {
		super.conexion = new CadenaConexion();
	}
	
	@Override
	public void asignarServidor() {
		// TODO Auto-generated method stub
		conexion.servidor = "Servidor MySQL ";
	}

	@Override
	public void asignarBD() {
		// TODO Auto-generated method stub
		conexion.nombreBD ="Nombre Instancia MySQL ";
	}

	@Override
	public void asignarUsuario() {
		// TODO Auto-generated method stub
		conexion.usuario = "Usuario MySQL ";
	}

	@Override
	public void asignarPassword() {
		// TODO Auto-generated method stub
		conexion.password ="Password usuario MySQL";
	}
	
	public String toString() {
		String cadena = "Datos Conexion MySQL: \n"+conexion.servidor+"\n"+conexion.nombreBD+"\n"; 
		cadena += conexion.usuario+"\n"+conexion.password;
		return cadena;
	}

}
