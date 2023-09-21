package co.edu.unbosque.model;

public class TipoNominaDecorador extends CuentaDecorador {

	public TipoNominaDecorador(ICuentaBancaria cuentaDecorada) {
		// TODO Auto-generated constructor stub
		super(cuentaDecorada);
	}
	
	public void abrirCuenta(Cuenta c) {
		cuentaDecorada.abrirCuenta(c);
		agregarTipoNomina(c);
	}
	
	public void agregarTipoNomina(Cuenta c) {
		System.out.println("Se agregó tipo Nomina a la cuenta del cliente "+c.getCliente());
	}

}
