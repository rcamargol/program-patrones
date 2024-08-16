package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
	
	public void mostrarResultados(String dato) {
		JOptionPane.showMessageDialog(null, dato);
	}
	
	public void mostrarResultadoEntero(int dato) {
		JOptionPane.showMessageDialog(null, dato);
	}
	
	public String pedirDato() {
		String dato = "";
		dato = JOptionPane.showInputDialog(null, "Entre Dato:");
		return dato;
	}
	
	public int pedirDatoEntero() {
		int numero = 0;
		numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Entre N�mero:"));
		return numero;
	}
	
	public void mostrarArreglo(int[] a) {
		String cadena="";
		for (int i=0 ; i<a.length ; i++) {
			cadena = cadena + a[i]+" ";
		}
		mostrarResultados(cadena);
	}
}
