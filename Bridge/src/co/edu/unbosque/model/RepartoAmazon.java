package co.edu.unbosque.model;

public class RepartoAmazon extends Amazon{

	private String numPedido;
	
	public RepartoAmazon(String idPedido) {
		super(new EnvioEspana());
		this.numPedido =idPedido;
		// TODO Auto-generated constructor stub
	}

	public RepartoAmazon(String idPedido, InterfaceEnvio envio) {
		super(envio);
		this.numPedido = idPedido;
	}
	
	public String idPedido() {
		return "Nuestro pedido es: "+this.numPedido;
	}
	
}
