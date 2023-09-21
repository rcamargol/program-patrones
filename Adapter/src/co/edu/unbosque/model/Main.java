package co.edu.unbosque.model;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BombillaClasica bc = new BombillaClasica();
		System.out.println(bc.encender());
		
		BombillaModerna bm = new BombillaModerna();
		System.out.println(bm.aumentarIntensidad());
		
		BombillaAdapter lavela = new BombillaAdapter();
		System.out.println(lavela.aumentarIntensidad());
	}

}
