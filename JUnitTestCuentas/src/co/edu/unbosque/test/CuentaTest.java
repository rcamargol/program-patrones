package co.edu.unbosque.test;

import co.edu.unbosque.model.Cuenta;
import co.edu.unbosque.model.Persona;
import junit.framework.TestCase;

public class CuentaTest extends TestCase {
	
	 public void testIngreso() {
		 Persona cliente = new Persona("Jorge Gonzalez","12345");
		 //Persona cliente = new Persona(null,"12345");
		 Cuenta cuenta = new Cuenta(cliente,1,-2);
		 cuenta.ingreso(150);
		 assertEquals("Los saldos NO coinciden",250.0, cuenta.getSaldo());
	 }

}
