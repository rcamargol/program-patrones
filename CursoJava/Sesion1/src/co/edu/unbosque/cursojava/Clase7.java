package co.edu.unbosque.cursojava;

public class Clase7 {

	public static void main (String ... strings ) {
		String cadena1 = "cadena 1";
		String cadena2 = "cadena" + " " + "2";
		String cadena3 = cadena2.replace('2', '3');
		String cadena4 = "cadena".concat(" 4");
		
		System.out.println(cadena1);
		System.out.println(cadena2);
		System.out.println(cadena3);
		System.out.println(cadena4);
		
		String cadena_1 = new String("cadena 1");
		String cadena_2 = new String("cadena").concat(new String(" ")).concat(new String("2"));
		String cadena_3 = cadena2.replace('2', '3');
		String cadena_4 = new String("cadena").concat(" 4");
		
		System.out.println(cadena_1);
		System.out.println(cadena_2);
		System.out.println(cadena_3);
		System.out.println(cadena_4);
	
		if (cadena1.equals(cadena_1)) {
			System.out.println("cadenas 1 iguales");
		}
		
		if (cadena1 == cadena_1) {
			System.out.println("cadenas 1 iguales");
		} else {
			System.out.println("cadenas 1 diferetes");
		}
		
		cadena_1 = "cadena 1";
		if (cadena1 == cadena_1) {
			System.out.println("cadenas 1 iguales");
		} else {
			System.out.println("cadenas 1 diferetes");
		}
		
		cadena_1 = new String("cadena 1");
		cadena_1 = cadena_1.intern();
		if (cadena1 == cadena_1) {
			System.out.println("cadenas 1 iguales");
		} else {
			System.out.println("cadenas 1 diferetes");
		}
		
		String cadenaLarga = "Carreta"; // "Carreta"
		cadenaLarga += " mas carreta"; // "Carreta" " mas carreta" Carreta mas carreta"
		cadenaLarga += " mas carreta"; // "Carreta" " mas carreta" Carreta mas carreta" Carreta mas carreta mas carreta
		cadenaLarga += " mas carreta";
		for (int i = 0; i < 10; i++) {
			cadenaLarga += " mas carreta";
		}
		
		System.gc();
		
		StringBuilder cadenaLarga2 = new StringBuilder("Carreta"); 
		cadenaLarga2.append(" mas carreta");
		cadenaLarga2.append(" mas carreta");
		cadenaLarga2.append(" mas carreta");
		for (int i = 0; i < 10; i++) {
			cadenaLarga2.append(" mas carreta");
		}
		
		System.out.println(cadenaLarga);
		System.out.println(cadenaLarga2);
	}
}
