package co.edu.unbosque.cursojava;

import java.util.Comparator;

public abstract class FiguraGeometrica {

	public static class ComparadorFigurasPerimetro implements Comparator<FiguraGeometrica> {

		@Override
		public int compare(FiguraGeometrica f1, FiguraGeometrica f2) {
			return f1.calcularPerimetro() - f2.calcularPerimetro();
		}

	}

	public abstract int calcularArea();

	public abstract int calcularPerimetro();

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
	
	
}
