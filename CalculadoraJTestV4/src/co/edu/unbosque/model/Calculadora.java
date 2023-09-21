package co.edu.unbosque.model;

public class Calculadora {

	private static int ans;
	private static double ans1;
	
	public Calculadora() {
		ans = 0;
		ans1 = 0;
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
	
	public double multiplicacion(int a, int b) {
		ans = a*b;  
		return ans;
	}
}