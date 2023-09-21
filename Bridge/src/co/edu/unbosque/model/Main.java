package co.edu.unbosque.model;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Envio a España por Defecto
		RepartoAmazon reparto = new RepartoAmazon("123456");
		System.out.println(reparto.procesarPedido());
		System.out.println(reparto.enviarPaquete());
		System.out.println(reparto.entregarPaquete());
		//Envio a Mexico
		reparto.asignarEnvio(new EnvioMexico());
		System.out.println(reparto.procesarPedido());
		System.out.println(reparto.enviarPaquete());
		System.out.println(reparto.entregarPaquete());
	}

}
