package co.edu.unbosque.cursojava.interno;

import co.edu.unbosque.cursojava.IFuncionalalidadEspecifica;
import co.edu.unbosque.cursojava.ImpFuncionalidad;

public class ClaseExterna {

	public class InnerClass4 {
	}
	
	public static class ImpInnerFuncionalidad implements IFuncionalalidadEspecifica {

		@Override
		public void algoritmo() {
			System.out.println("Implementación interfaz inner clase");
		}
	}
	
	static public class InnerClass5 {
	}
	
	public void metodo() {
		int var;
		class Inner5 {
			
		}
		
		Inner5 i5 = new Inner5();
	}
	
	public void metodo2(IFuncionalalidadEspecifica funcionalidad) {
		funcionalidad.algoritmo();
	}
	
	public static void main(String[] args) {
		class ImpInner2Funcionalidad implements IFuncionalalidadEspecifica {

			@Override
			public void algoritmo() {
				System.out.println("Implementación interfaz inner inner clase");
			}
		}
		
		ImpFuncionalidad imp1 = new ImpFuncionalidad();
		ClaseExterna.ImpInnerFuncionalidad imp2 = new ClaseExterna.ImpInnerFuncionalidad();
		ImpInner2Funcionalidad imp3 = new ImpInner2Funcionalidad();
		IFuncionalalidadEspecifica imp4 = new IFuncionalalidadEspecifica() {

			@Override
			public void algoritmo() {
				System.out.println("Implementación interfaz clase anóonima");
			}
			
		};
		
		ClaseExterna ce = new ClaseExterna();
		ce.metodo2(imp1);
		ce.metodo2(imp2);
		ce.metodo2(imp3);
		ce.metodo2(imp4);
		ce.metodo2(new IFuncionalalidadEspecifica() {

			@Override
			public void algoritmo() {
				System.out.println("Implementación interfaz clase anóonima2");
			}
			
		});
		
		
	}
}

class Default {
	
	ClaseExterna.InnerClass5 i5;
	ClaseExterna.InnerClass4 i4;
	
	public Default() {
		i5 = new ClaseExterna.InnerClass5();
		
		ClaseExterna linea = new ClaseExterna();
		i4 = linea.new InnerClass4();
	}

}