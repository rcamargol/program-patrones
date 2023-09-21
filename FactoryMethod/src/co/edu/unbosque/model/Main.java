package co.edu.unbosque.model;

public class Main {
	
	public static void main(String[] args) {
		Configuracion c = new Configuracion();
		//BDGenerica bd = c.crearConexion(c.SQLServer);
		//System.out.println(bd.getCadenaConexion());
		System.out.println(c.getConexion(c.crearConexion(c.SQLServer)));
	}
}
