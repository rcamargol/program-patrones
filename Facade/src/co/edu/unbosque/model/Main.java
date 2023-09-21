package co.edu.unbosque.model;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Desarrollador programador= new Desarrollador();
		Comprador cliente = new Comprador();
		Comercial comercial = new Comercial();
		
		// SIN FACADE
		Quejas queja = new Quejas();
		queja.quejas(comercial);
		queja.quejas(programador);
		queja.quejas(cliente);
		Pedidos pedido = new Pedidos();
		int totalPrecioPedido = 0;
		totalPrecioPedido = pedido.comisionPedido(comercial);
		totalPrecioPedido += pedido.precioProducto(cliente);
		
		// CON FACADE
		Empresa empresa = new Empresa();
		empresa.escucharQuejas(programador);
		empresa.escucharQuejas(comercial);
		empresa.escucharQuejas(cliente);
		totalPrecioPedido = empresa.hacerPedido(comercial, cliente);
		
	}

}
