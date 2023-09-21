package co.edu.unbosque.model;

public class CuentaAhorro implements ICuentaBancaria{

	public CuentaAhorro() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void abrirCuenta(Cuenta c) {
		// TODO Auto-generated method stub
		System.out.println("Abriendo cuenta de Ahorro para:"+c.getCliente());
	}

}
