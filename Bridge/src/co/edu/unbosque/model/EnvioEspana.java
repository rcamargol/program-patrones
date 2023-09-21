package co.edu.unbosque.model;

public class EnvioEspana implements InterfaceEnvio{

	public EnvioEspana() {
		// TODO Auto-generated constructor stub
	}
	public String procesarPedido() {
		// TODO Auto-generated method stub
		return "Pedido Procesado Espa�a";
	}

	@Override
	public String enviar() {
		// TODO Auto-generated method stub
		return "Pedido enviado a Espa�a";
	}

	@Override
	public String entregar() {
		// TODO Auto-generated method stub
		return "Pedido Entregado a Espa�a";
	}

}
