package co.edu.unbosque.model;
public class Repaso {

	static int numeros[] = {1,2,3,4,5,6,7,8,9,10};

	
	public static void main(String[] args) {
		System.out.println("Original");
		for (int i=0 ; i<10 ; i++) {
			System.out.print(numeros[i]+" ");
		}
		System.out.println("\n");
		System.out.println("i\taux\ta[i]\ta.length-i-1\ta[a.length-i-1]\t");
		System.out.println("-----------------------------------------------------");
		numeros = invertirArreglo(numeros);
		
		System.out.println("\nInvertido");
		
		for (int i=0 ; i<10 ; i++) {
			System.out.print(numeros[i]+" ");
		}		
		
	}

	public static int[] invertirArreglo(int[] a) {
		int aux;
		int i, x;
		for (i = 0 ; i<a.length/2 ; i++) {
			x = a.length-i-1;
			aux = a[x];
			a[x] = a[i];
			a[i] = aux;
			imprimirPruebaEsc(a,aux,i);
		}
		return a;
	}
	
	public static void imprimirPruebaEsc(int[] a, int aux, int i) {
		System.out.println(i+"\t"+aux+"\t"+a[i]+"\t\t"+(a.length-i-1)+"\t"+a[a.length-i-1]+"\t");
	}
	
}
