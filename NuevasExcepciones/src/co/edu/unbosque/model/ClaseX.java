package co.edu.unbosque.model;

public class ClaseX {
	ClaseY y;
	
	public ClaseX() {
		y = new ClaseY();
	}

	public String procesarDato(String dato) {
		return dato + " Proceso en ClaseX";
	}
	
	public String generarExcepcion() throws NumerChimboException, NoSeaGuacheException {
		int i = 34;
		try {
			if(i < 10) {
				throw new NoMeGustaElNumeroException();
			}
		}
		catch(NoMeGustaElNumeroException e) {
			return "Uich!!!";
		}

		if (i < -20) {
			throw new NoSeaGuacheException(); 
		}
		
		if(i > 20) {
			throw new NumerChimboException("SU numero es rechimbo!");
		}

		return "Ok!";
	}

	public int sumar20alDato(int dato) {
		return dato+20;
	}
	
	public ClaseY getY() {
		return y;
	}

	public void setY(ClaseY y) {
		this.y = y;
	}
	
	public boolean haceAlgo1(int n , int[] a) {
		int i=0;
		boolean s = false;
		for(i=0; i<10; i++) {
			if (n == a[i]) {
				s = true;
			}
			else {
				s = false;
			}
		}
		return s;		
	}

	public boolean haceAlgo2(int n , int[] a) {
		int i=0;
		boolean s = false;
		while (i<10 && !s) {
			if(n == a[i++]) {
				s = true;
			}
			else {
				s = false;
			}
		}
		return s;
	}
	
}
