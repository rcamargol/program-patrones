package co.edu.unbosque.cursojava;

public class Clase1 {

	public int a;
	int b;
	protected int c;
	private int d;

	private byte _byte;
	private short entero_corto;
	private char caracter;
	private int entero;
	private long entero_grande;
	
	private float flotante;
	private double flotante_doble;
	
	public Clase1() {
		_byte = 0; //128- hasta 127
		_byte = (byte) 300;
		
		int x = 6;
		
		_byte = 1 + 5;
		_byte = (byte) (_byte + 20);
		
		
		entero_corto = 0;
		entero_corto = (byte) 300;
		entero_corto = 1 + 5;
		entero_corto = (short)(_byte + 20);
		
		caracter = '0';
		caracter = 0;
		caracter = (byte) 300;
		caracter = 1 + 5;
		caracter = (char)(_byte * 20);
		
		caracter = '\u1805';
		System.out.println(caracter);
		
		entero = 1000000;
		entero = 1_000_000;
		//entero = 3_000_000_000;
		
		entero_grande = 0;
		entero_grande = (byte) 300;
		entero_grande = 1 + 5;
		entero_grande = (_byte + 20);
		entero_grande = 9_000_000_000L;
		entero_grande = 9_000_000_000l;		
				
		
		flotante = 0;
		flotante = 2_000_000;
		flotante = 9_000_000_000L;
		
		flotante = 0.01F;
		flotante = 0.01f;
		flotante = 1234.56E2F;
		flotante = (float)1234.56E2;
		
		flotante = 0.01F;
		flotante = 0.01f;
		flotante = 1234.56E2F;		
		// 6,5 * 10^5 = 6_500_000
		flotante = (float) 6.5e5;
		flotante = 6.5e5F;
		flotante = 6.5E5F;
		flotante = 6_000.5E1_0F;

		flotante_doble = 0.01;
		flotante_doble = 0.01;
		flotante_doble = 1234.56E2;
		flotante_doble = 6.5e5;
		flotante_doble = 6.5e5F;
		flotante_doble = 6.5E5F;
		flotante_doble = 6_000.5E1_0F;
		
//		private double flotante_doble;
	}
	
	public static void main(String ... args) {
		new Clase1();
	}
	
	public void metodo1() {

	}

	void metodo2() {

	}

	protected void metodo3() {

	}

	private void metodo4() {

	}
}

class Clase2 {

}

class Clase5 {

}
