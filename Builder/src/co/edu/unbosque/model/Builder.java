package co.edu.unbosque.model;

public class Builder {
	
	public String hacerBuilder() {
		
		String cadena ="";
		
		Conexion conexion = new Conexion();
		
		conexion.nuevaConexion(new SQLServerBuilder());
		conexion.crearCadenaConexion();
		CadenaConexion cxSQLServer = conexion.conexionLista();
		cadena += cxSQLServer.toString()+"\n";
		
		conexion.nuevaConexion(new MySQLBuilder());
		conexion.crearCadenaConexion();
		CadenaConexion cxMySQL = conexion.conexionLista();
		cadena += cxMySQL.toString()+"\n";
		
		conexion.nuevaConexion(new OracleBuilder());
		conexion.crearCadenaConexion();
		CadenaConexion cxOracle = conexion.conexionLista();
		cadena += cxOracle.toString()+"\n";

		return cadena;
	}
}

