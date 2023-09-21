package co.edu.unbosque.model;

import junit.framework.TestCase;

public class CalcTestV3 extends TestCase {

	Calculadora calc;
	
	public CalcTestV3() {
		
	}

	protected void setUp() throws Exception {
		System.out.println("Haciendo setUp..");
		calc = new Calculadora();
	}
	
	public void testSuma() {
		assertEquals("Las sumas NO son iguales",calc.suma(4, 5),9);
	}


	protected void tearDown() throws Exception {
		System.out.println("finalizando..");
		calc.ac();
	}
	
}
