package co.edu.unbosque.model;

public abstract class CuentaDecorador implements ICuentaBancaria{

	protected ICuentaBancaria cuentaDecorada;
	
	public CuentaDecorador(ICuentaBancaria cuentaDecorada) {
		// TODO Auto-generated constructor stub
		this.cuentaDecorada = cuentaDecorada;
	}

	@Override
	public void abrirCuenta(Cuenta c) {
		this.cuentaDecorada.abrirCuenta(c);
	}
	
}
