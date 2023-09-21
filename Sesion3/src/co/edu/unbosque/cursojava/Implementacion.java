package co.edu.unbosque.cursojava;

public class Implementacion implements InterfazClasica, OtraInterface {

	@Override
	public void metodo1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void metodo2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void metodo3() {
		// TODO Auto-generated method stub
	}

	public static void main(String[] args) {
		String x = Implementacion.CONSTANTE_1;
		String y = Implementacion.CONSTANTE_2;
		
		Implementacion imp = new Implementacion();
		imp.metodo3();
	}
}
