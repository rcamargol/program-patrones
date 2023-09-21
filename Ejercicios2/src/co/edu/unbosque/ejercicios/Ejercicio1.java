package co.edu.unbosque.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= 10, b=1;
		
		System.out.println("Digite el valor de x:");
		Scanner dato = new Scanner(System.in);
		int x = dato.nextInt();
		while(i >= x) {
			b = b+i;
			i--;
		}
		System.out.println(2*b);
		
	}

}
