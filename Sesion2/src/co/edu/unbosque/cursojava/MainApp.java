package co.edu.unbosque.cursojava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import co.edu.unbosque.cursojava.interno.Ciculo;
import co.edu.unbosque.cursojava.interno.ClaseD;
import co.edu.unbosque.cursojava.interno.ClaseE;
import co.edu.unbosque.cursojava.interno.Cuadrado;
import co.edu.unbosque.cursojava.interno.Linea;
import co.edu.unbosque.cursojava.interno.Rectangulo;

public class MainApp {

	public static void main(String[] args) {
		ClaseA ca = new ClaseA();
		ClaseB cb = new ClaseB();
		ClaseC cc = new ClaseC();
		ClaseD cd = new ClaseD();
		ClaseE ce = new ClaseE();

		/*
		 * ca.metodo3(); cb.metodo3(); cc.metodoc(); cd.metodoc(); ce.metodo3();
		 */

		figuras();
	}

	public static void figuras() {
		List<FiguraGeometrica> figuras = new ArrayList<>();
		figuras.add(new Ciculo(3));
		figuras.add(new Cuadrado(3));
		figuras.add(new Linea(3));
		figuras.add(new Rectangulo(3, 2));
		// figuras.add(new FiguraGeometrica());
		// figuras.add("");
		// figuras.add(new Cuadrado(3));
		
		System.out.println("***Orden inicial***");
		figuras.stream().forEach(figura -> System.out.println(figura));
		System.out.println();
		
		
		System.out.println("***Orden por área***");
		Collections.sort(figuras, new ComparadorFigurasArea());
		figuras.stream().forEach(figura -> System.out.println(figura));
		System.out.println();
		
		System.out.println("***Orden por perímetro***");
		Collections.sort(figuras, new FiguraGeometrica.ComparadorFigurasPerimetro());
		figuras.stream().forEach(figura -> System.out.println(figura));
		System.out.println();
		
		System.out.println("***Orden por área y perímetro***");
		Comparator<FiguraGeometrica> comparator = new Comparator<>() {
			
			@Override
			public int compare(FiguraGeometrica f1, FiguraGeometrica f2) {
				int resultado = f1.calcularArea() - f2.calcularArea();
				if (resultado == 0) {
					return f1.calcularPerimetro() - f2.calcularPerimetro();
				}
				return resultado;
			}
		};
		Collections.sort(figuras, comparator);
		figuras.stream().forEach(figura -> System.out.println(figura));
		System.out.println();

		/*for (FiguraGeometrica figura : figuras) {
			System.out.println("Area: " + figura.calcularArea());
			System.out.println("Perímetro: " + figura.calcularPerimetro());

			if (figura instanceof DosDimensiones) {
				pintar2D((DosDimensiones) figura);
			}
		}*/

	}

	public static void pintar2D(DosDimensiones figura) {
		System.out.println("pintando en pantalla " + figura.getClass().getSimpleName());
	}

}
