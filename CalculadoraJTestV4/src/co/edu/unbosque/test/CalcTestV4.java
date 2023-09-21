package co.edu.unbosque.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import co.edu.unbosque.model.Calculadora;

public class CalcTestV4 {

	Calculadora calc;
	
	@Before
	public void setUp() throws Exception {
		System.out.println("setup V4");
		calc = new Calculadora();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("TearDown");
		calc.ac();
	}

	@Test
	public void testSuma() {
		System.out.println("Test suma V4.");
		assertEquals("Las sumas no coinciden, debe dar 7",calc.suma(3, 4),7);
	}
	
}
