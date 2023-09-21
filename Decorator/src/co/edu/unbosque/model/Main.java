package co.edu.unbosque.model;

public class Main {

	public static void main(String args[]){
		Cuenta c = new Cuenta(1,"Ricardo");
		ICuentaBancaria cuenta = new CuentaAhorro();
		ICuentaBancaria cuentaTipoNomina = new TipoNominaDecorador(cuenta);
		cuentaTipoNomina.abrirCuenta(c);
	}
}
