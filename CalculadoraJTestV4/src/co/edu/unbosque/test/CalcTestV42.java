package co.edu.unbosque.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import co.edu.unbosque.model.Calculadora;

public class CalcTestV42 {

	Calculadora calc;
	
	@Before
	public void setUp() throws Exception {
		calc = new Calculadora();
		System.out.println("inicio");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("final");
	}

	@Test
	public void testResta() {
		assertEquals("La resta debe ser -120",calc.resta(120, 240),-120);
	}

}
