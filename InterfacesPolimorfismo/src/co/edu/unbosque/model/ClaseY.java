package co.edu.unbosque.model;

public class ClaseY {

	protected String haceAlgo() {
		return "no hago nada, y qué!!";
	}

	protected String hacerNada() {
		return null;
	}

	public double calcularArea() {
		return 0;
	}

	public double calcularArea(int lado) {
		return lado * lado;
	}

	public double calcularArea(int base, int altura) {
		return ((base * altura) / 2);
	}

	public double calcularArea(double radio) {
		return (radio * Math.PI);
	}

	public String hacerPolimorfismo() {

		Persona personas[];

		personas = new Persona[3];
		
		Persona p = new Persona();
		Alumno a = new Alumno();
		Profesor pr = new Profesor();
		
		p = a;
		p = pr;
		
		String linea = "";

		personas[0] = new Persona();
		personas[1] = new Alumno();
		personas[2] = new Profesor();
		for (int i = 0; i < 3; i++)
			linea += personas[i] + " \n";

		linea += new Persona();

		return linea;
	}

}
