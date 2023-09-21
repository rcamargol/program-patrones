package co.edu.unbosque.model;

import junit.framework.TestCase;

public class CalcTest2V3 extends TestCase {

	Calculadora calc;
	
	public CalcTest2V3() {
		
	}

	protected void setUp() throws Exception {
		calc = new Calculadora();
	}
	
	public void testResta() throws Exception {
			assertEquals("La resta no es correcta",calc.resta(10, 12),-2);
	}

	protected void tearDown() throws Exception {
		System.out.println("cerrar");
	}

}
