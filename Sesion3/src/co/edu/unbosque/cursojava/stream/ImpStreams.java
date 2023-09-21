package co.edu.unbosque.cursojava.stream;

import java.util.List;
import java.util.function.Predicate;

public class ImpStreams {

	public static void main(String[] args) {
		
		List<String> ciudades = List.of("Bogotá","Cali","Medellín","Barranquilla","Cúcuta","Bucaramanga");
		
		/*for (String ciudad : ciudades) {
			System.out.println(ciudad);
		}*/
		
		System.out.println();
		ciudades.stream().forEach(ciudad -> System.out.println(ciudad));
		
		/*System.out.println();
		ciudades.parallelStream().forEach(ciudad -> System.out.println(ciudad));*/
		
		System.out.println();
		Predicate<String> test = ciudad -> ciudad.startsWith("B");
		ciudades.stream().
			filter(test).
			forEach(ciudad -> System.out.println(ciudad));
		
		System.out.println();
		ciudades.stream().
			filter(test.negate()).
			forEach(ciudad -> System.out.println(ciudad));
		
		System.out.println();
		ciudades.stream().
			map(ciudad -> ciudad.toUpperCase()).
			filter(test).
			sorted((c1, c2) -> c1.compareTo(c2)).
			forEach(ciudad -> System.out.println(ciudad));
	}
	
}
