package co.edu.unbosque.model;

public class EnvioPortugal implements InterfaceEnvio {

	public EnvioPortugal() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String procesarPedido() {
		// TODO Auto-generated method stub
		return "Envio Procesado Portugal";
	}

	@Override
	public String enviar() {
		// TODO Auto-generated method stub
		return "Pedido enviado a Portugal";
	}

	@Override
	public String entregar() {
		// TODO Auto-generated method stub
		return "Pedido Entregado a Portugal";
	}

}
