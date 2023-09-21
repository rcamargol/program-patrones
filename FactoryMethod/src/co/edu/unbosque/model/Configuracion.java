package co.edu.unbosque.model;

public class Configuracion {
	
	public final int SQLServer = 1;
	public final int Oracle = 2;
	public final int MySQL = 3;
	
	public Configuracion(){
		
	}
	
	public BDGenerica crearConexion(int BD) {

		BDGenerica bd = null;
		
		switch(BD) {
			case 1: 
				bd = new SQLServer();
				break;
			case 2:
				bd = new Oracle();
				break;
			case 3:
				bd = new MySQL();
				break;
		}
		return bd;
	}
	
	public String getConexion(BDGenerica bd) {
		return bd.getCadenaConexion();
	}
}
