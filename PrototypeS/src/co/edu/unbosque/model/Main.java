package co.edu.unbosque.model;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mueble mueble = new Mueble();
		mueble.setNombre("SIlla");
		mueble.setNumAsientos(1);
		System.out.println("asientos :"+mueble.getNumAsientos());
		System.out.println("nombre :"+mueble.getNombre());
		
		Mueble clonMueble = (Mueble) mueble.clone();
		//Mueble clonMueble = new Mueble();
		System.out.println("asientos :"+clonMueble.getNumAsientos());
		System.out.println("nombre :"+clonMueble.getNombre());
		
	}

}
