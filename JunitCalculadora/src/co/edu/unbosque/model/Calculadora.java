package co.edu.unbosque.model;

public class Calculadora {

	private static int ans;
	
	public Calculadora() {
		ans = 0;
	}
	
	public int suma(int a, int b) {
		ans = a+b;
		return ans;
	}
	
	public int resta(int a, int b) {
		ans = a-b;
		return ans;
	}
	
	public void ac() {
		ans = 0;
	}
}