package co.edu.unbosque.model;

public class EnvioMexico implements InterfaceEnvio{

	public EnvioMexico() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String procesarPedido() {
		// TODO Auto-generated method stub
		return "Pedido Proceado Mexico";
	}

	@Override
	public String enviar() {
		// TODO Auto-generated method stub
		return "Pedido enviado a Mexico";
	}

	@Override
	public String entregar() {
		// TODO Auto-generated method stub
		return "Pedido Entregado a Mexico";
	}
	
}
