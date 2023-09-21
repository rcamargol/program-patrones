package co.edu.unbosque.cursojava;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MainApp {

	public static void main(String[] args) {
		
		validador(valor -> valor < 3); 
		System.out.println();
		consumidor((valor) -> System.out.println(valor));
		System.out.println();

		
		System.out.println("*** sumar ***");
		BiFunction<Integer, Integer, Integer> calculadora = new BiFunction<>() {
			
			@Override
			public Integer apply(Integer a, Integer b) {
				return a + b;
			}
		};
		int resultado = calculadora.apply(1, 5);
		System.out.println(resultado);
		System.out.println();
		
		
		
		System.out.println("*** restar ***");
		calculadora = (Integer a, Integer b) -> {
			return a - b;
		};
		resultado = calculadora.apply(1, 5);
		System.out.println(resultado);
		System.out.println();
		
		
		
		System.out.println("*** multiplicar ***");
		calculadora = (Integer a, Integer b) -> a * b;
		resultado = calculadora.apply(1, 5);
		System.out.println(resultado);
		System.out.println();
		
		
		
		System.out.println("*** dividir ***");
		calculadora = (a, b) -> a / b;
		resultado = calculadora.apply(1, 5);
		System.out.println(resultado);
		System.out.println();
		
	}
	
	static void validador(Predicate<Integer> validor) {
		
		List<Integer> enteros = List.of(1,5,8,3,0,9,6);
		
		for (Integer entero : enteros) {
			if (validor.test(entero)) {
				System.out.println(entero);
			}
		}
		
		
	}
	
	static void consumidor(Consumer<Integer> cosumidor) {
		
		List<Integer> enteros = List.of(1,5,8,3,0,9,6);
		
		for (Integer entero : enteros) {
			cosumidor.accept(entero);
		}
		
		
	}

}
