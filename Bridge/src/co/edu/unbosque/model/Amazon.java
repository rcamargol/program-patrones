package co.edu.unbosque.model;

public abstract class Amazon {

	protected InterfaceEnvio interfaceEnvio;
	
	public Amazon(InterfaceEnvio interfaceEnvio) {
		// TODO Auto-generated constructor stub
		this.interfaceEnvio = interfaceEnvio;
	}
	
	public String procesarPedido() {
		return interfaceEnvio.procesarPedido();
	}
	
	public String enviarPaquete() {
		return interfaceEnvio.enviar();
	}
	
	public String entregarPaquete() {
		return interfaceEnvio.entregar();
	}
	
	public void asignarEnvio(InterfaceEnvio envio) {
		this.interfaceEnvio = envio;
	}
	
	public InterfaceEnvio obtenerEnvio() {
		return this.interfaceEnvio;
	}
}
