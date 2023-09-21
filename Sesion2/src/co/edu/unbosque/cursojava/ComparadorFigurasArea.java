package co.edu.unbosque.cursojava;

import java.util.Comparator;

public class ComparadorFigurasArea implements Comparator<FiguraGeometrica> {

	@Override
	public int compare(FiguraGeometrica f1, FiguraGeometrica f2) {
		return f1.calcularArea() - f2.calcularArea();
	}

}
