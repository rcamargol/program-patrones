package co.edu.unbosque.model;

public class Empresa {

	public Quejas q;
	public Pedidos p;
	
	public Empresa() {
		// TODO Auto-generated constructor stub
		q = new Quejas();
		p = new Pedidos();
	}
	
	public void escucharQuejas(Persona p) {
		if (p.getClass() == new Comprador().getClass()) {
			System.out.println(q.quejas( (Comprador)p ));
		}
		else if (p.getClass() == new Desarrollador().getClass()) {
			System.out.println(q.quejas( (Desarrollador) p));
		}
		else{
			System.out.println(q.quejas( (Comercial) p));
		}
	}
	
	public int hacerPedido(Comercial comercial, Comprador cliente ) {
		return p.comisionPedido(comercial)+ p.precioProducto(cliente);
	}
	
}
