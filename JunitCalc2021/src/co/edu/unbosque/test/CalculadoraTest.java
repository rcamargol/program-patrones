package co.edu.unbosque.test;

import co.edu.unbosque.model.Calculadora;
import junit.framework.TestCase;

public class CalculadoraTest extends TestCase {
	
	Calculadora calc;
	int i = 0;
	int j = 0;
	
	public CalculadoraTest() {
		i++;
		System.out.println("Constructor "+i);
	}
	
	
	public void testSuma() {
		j++;
		System.out.println("test suma "+j);
		assertEquals("Las sumas NO coinciden",9, calc.suma(4, 5));
	}
	

	public void setUp() throws Exception {
		System.out.println("Inicializando calc en setUp");
		calc = new Calculadora();
	}

	public void testResta() {
		j++;
		System.out.println("test resta "+j);
		assertEquals("La resta no es correcta",-2,calc.resta(12, 10));
	}
	
	public void tearDown() throws Exception{
		System.out.println("FInalizando test suma, ejecutando ac");
		calc.ac();
	}
	
}
