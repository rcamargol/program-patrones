package co.edu.unbosque.model;

public class Cuenta {

	private int id ;
	private String cliente;
	
	public Cuenta(int cuenta, String cliente) {
		// TODO Auto-generated constructor stub
		this.id = cuenta;
		this.cliente = cliente;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

}
