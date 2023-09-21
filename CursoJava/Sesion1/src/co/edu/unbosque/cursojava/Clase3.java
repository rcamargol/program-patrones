package co.edu.unbosque.cursojava;

import java.util.ArrayList;
import java.util.List;

public class Clase3 {

	Clase1 clase1 = new Clase1();
	Clase2 clase2 = null;
	
	private Byte _byte;
	private Short entero_corto;
	private Character caracter;
	private Integer entero;
	private Long entero_grande;
	
	private Float flotante;
	private Double flotante_doble;
	
	public Clase3() {
		clase1.a = 0;
		clase1.b = 0;
		clase1.c = 0;
		//clase1.d = 0;
		
		clase1.metodo1();
		clase1.metodo2();
		clase1.metodo3();
		//clase1.metodo4();
	}
	
	void wrappers() {
		_byte = 0; //128- hasta 127
		_byte = Byte.valueOf((byte)0); 
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
		
		entero_grande = 0L;
		entero_grande = 9_000_000_000L;
		entero_grande = 9_000_000_000l;	
	}
	
	void listarLprmitivos() {
		List<Object> listado = new ArrayList<>();
		listado.add(1);
		listado.add(Integer.valueOf(1));
		
		listado.add(true);
		listado.add(Boolean.valueOf(true));
		
		listado.add('c');
		listado.add(Character.valueOf('c'));
		
		listado.add(3L);
		listado.add(3.4F);
		listado.add(3.4);
		
		
		List<Integer> enteros = new ArrayList<>();
		enteros.add(3);
		enteros.add((int) 3L);
		//enteros.add('c');
		
		int x = 'c';
	}
}
