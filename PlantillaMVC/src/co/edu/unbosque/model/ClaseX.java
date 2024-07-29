package co.edu.unbosque.model;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class ClaseX {
	ClaseY y;

	public ClaseX() {
		y = new ClaseY();
	}

	public String procesarDato(String dato) {
		return dato + " Proceso en ClaseX";
	}

	public int sumar20alDato(int dato) {
		return dato + 20;
	}

	public ClaseY getY() {
		return y;
	}

	public void setY(ClaseY y) {
		this.y = y;
	}

	public String ejecutarException() {
		int i = 10;
		try {
			if (i < 34) {
				throw new NumeroChimboException();
			}
			
		}
		catch (NumeroChimboException e) {
			return "No socio, "+e.getMessage().toString();
		}
		return "Todo Bien";
	}
	
	public String ejecutarOtraException() throws SuNumeroEstaReXException {
		
		int i = 5;
		
		if(i < 98) {
			throw new SuNumeroEstaReXException();
		}
		
		return "Bacano";
	}
}
