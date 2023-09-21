package co.edu.unbosque.ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int suma = 0;
		int[] arreglo = {1,2,3,4,5};

		for (int i=0 ; i<arreglo.length-1; i++)
			suma = suma + arreglo[i];
			System.out.println((suma-6));
		
	}

}
