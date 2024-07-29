public class Repaso {

	public static void main(String[] args) {
		
		int numeros[] = {1,2,3,4,5,6,7,8,9,10};
		int [] numeros2 = new int [10];
		
		for (int i=0 ; i<10 ; i++) {
			System.out.print(numeros[i]+" ");
		}
		
		numeros2 = invertirArreglo(numeros);
		
		System.out.println("Invertido\n");
		
		for (int i=0 ; i<10 ; i++) {
			System.out.print(numeros2[i]+" ");
		}
		
	}

	public static int[] invertirArreglo(int[] a) {
		int aux;
		for (int i = 0 ; i<10 ; i++) {
			aux = a[9-i];
			a[9-i] = a[i];
			a[i] = aux;
			//System.out.println(aux);
			//System.out.println("numero:"+a[i]);
		}
		for (int i=0 ; i<10 ; i++) {
			System.out.print(a[i]+" ");
		}
		return a;
	}
	
}
