package co.edu.unbosque.test;

import co.edu.unbosque.model.Cuenta;
import co.edu.unbosque.model.Persona;
import junit.framework.TestCase;

public class RetiroTest extends TestCase {
	
	 public void testRetiro() {
		 Persona cliente = new Persona("Jorge Gonzalez","12345");
		 //Persona cliente = new Persona(null,"12345");
		 Cuenta cuenta = new Cuenta(cliente,1,1000);
		 cuenta.retiro(150);
		 assertEquals("Los saldos NO coinciden por retiro",850.0, cuenta.getSaldo());
	 }
	 
}
