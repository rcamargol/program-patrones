package co.edu.unbosque.controller;

public class AplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller c = new Controller();
		int x = 2;
		int a = 10;
		
		// Conjunto de instrucciones 1
		if ((a < 10) || (a > 20)) {
			x = 3;
		}
		else {
			x = 0;
		}
		
		// Conjunto de instrucciones 2
		if ((a >= 10) || (a <= 20)) {
			x = 0;
		}
		else {
			x = 3;
		}
		
		// Conjunto de instrucciones 3
		if ((a > 9) && (a < 21)) {
			x = 0;
		}
		else {
			x = 3;
		}
		
		
	}

}
