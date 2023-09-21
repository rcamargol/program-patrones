package co.edu.unbosque.model;

public class CuentaCorriente implements ICuentaBancaria{

	public CuentaCorriente() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void abrirCuenta(Cuenta c) {
		// TODO Auto-generated method stub
		System.out.println("Abriendo cuenta de Corriente para:"+c.getCliente());		
	}

}
