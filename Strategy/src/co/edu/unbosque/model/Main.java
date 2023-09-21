package co.edu.unbosque.model;

public class Main {

	public static void main(String args[]) {
		GestionConexion gesConex = new GestionConexion();
		gesConex.conexionSQL();
		System.out.println(gesConex.conectar());
		
		if(!gesConex.conexionCorrecta()) {
			gesConex.conexionOracle();
			System.out.println(gesConex.conectar());
		}
	}
}
