package co.edu.unbosque.model;

public class OracleBuilder extends ConexionBuilder{

	public OracleBuilder() {
		super.conexion = new CadenaConexion();
	}
	
	@Override
	public void asignarServidor() {
		// TODO Auto-generated method stub
		conexion.servidor = "Servidor Oracle";
	}

	@Override
	public void asignarBD() {
		// TODO Auto-generated method stub
		conexion.nombreBD ="Nombre Instancia Oracle";
	}

	@Override
	public void asignarUsuario() {
		// TODO Auto-generated method stub
		conexion.usuario = "Usuario SQL Oracle";
	}

	@Override
	public void asignarPassword() {
		// TODO Auto-generated method stub
		conexion.password ="Password usuario Oracle";
	}

	public String mostrarResultdos() {
		String cadena = "Datos Conexion Oracle: \n"+conexion.servidor+"\n"+conexion.nombreBD+"\n"; 
		cadena += conexion.usuario+"\n"+conexion.password;
		return cadena;
	}
}
