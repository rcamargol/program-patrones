package co.edu.unbosque.model.persistence;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;

// En esta clase se implementan los m�todos b�sicos de lectura y escritura
// de los dos ejemplos de clase, por esta raz�n, van aqu�.

public class BinariosFile {

	
	private String ruta = "./data/prueba.out";
	private String rutaReg = "./data/registro.out";
	private String rutaEmp = "./data/empleados.out";

	private int REGISTROS = 10;
	private File f; 
	private FileOutputStream fos;     
	private DataOutputStream dos;
	private FileInputStream fis;     
	private DataInputStream dis;

	private int numeros[];
	private double valores[];
	private Registro reg;
	private Registro[] datos;
	private ArrayList<EmpleadoDTO> lista;
	
	//private ArrayList<Registro> empleados;
	

	public int getREGISTROS() {
		return REGISTROS;
	}

	public void setREGISTROS(int rEGISTROS) {
		REGISTROS = rEGISTROS;
	}

	
	public double[] getValores() {
		return valores;
	}

	public void setValores(double[] valores) {
		this.valores = valores;
	}

	public BinariosFile() {
		// TODO Auto-generated constructor stub
		numeros = new int[10];
		valores = new double[10];
		datos = new Registro[10];
	}

	public String escribirArchivoBinario() {
		String mensaje="Archivo Generado Exitosamente!";
		f=new File(ruta);
		Random r=new Random(); 
		//double d=18.76353; 
		try{     
			fos=new FileOutputStream(f);     
			dos=new DataOutputStream(fos);     
			for (int i=0;i<REGISTROS;i++){ 
				dos.writeInt(i);
				dos.writeDouble(r.nextDouble());//N� aleatorio     
			}     
			dos.close();
		} 
		catch(FileNotFoundException e){     
			mensaje= "No se encontro el archivo"; 
		} 
		catch(IOException e){     
			mensaje = "Error al escribir"; 
		}
		return mensaje;
	}
	
	public void leerArchivoBinario() {
		f = new File(ruta);
		try {
			fis = new FileInputStream(f);
			dis = new DataInputStream(fis);
			for (int i=0; i<REGISTROS ; i++){
				//System.out.println(dis.readDouble());
				numeros[i] = dis.readInt();
				valores[i] = dis.readDouble();
			}
			dis.close();
		}
		catch(IOException e){     
			e.printStackTrace(); 
		} 
	}

	public String escribirRegistro() {
		String mensaje = "Registro de Empleado Ingresado!";
		Registro staff[] = new Registro[3];
		staff[0] = new Registro("Empleado apellido1",23,1000);
		staff[1] = new Registro("Empleado apellido2",45,4000);
		staff[2] = new Registro("Empleado apellido3",37,8000);
			
		//empleados.add(new Registro("Empleado apellido1",23,1000));
		//empleados.add(new Registro("Empleado apellido2",45,4000));
		//empleados.add(new Registro("Empleado apellido3",37,8000));
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaReg));
			out.writeObject(staff);
			//out.writeObject(empleados);
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
		return mensaje;
	}
	
	public void leerRegistro() {
        ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(rutaReg));
	        datos = (Registro[])in.readObject();
			//empleados = (ArrayList<Registro>)in.readObject();
	        in.close();
	        for (int i = 0; i < datos.length; i++) {
	            //System.out.println(datos[i].getEdad());
	            //System.out.println(datos[i].getNombre());
	            //System.out.println(datos[i].getSalario());
	        	System.out.println(datos[i]);
	        }

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String escribirEmpleados(ArrayList<EmpleadoDTO> lista) {
		String mensaje = "Lista de Empleados Registrada!";
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaEmp));
			out.writeObject(lista);
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
		return mensaje;
	}
	
	public ArrayList<EmpleadoDTO> leerEmpleados() {
		lista = null;
        ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(rutaEmp));
	        lista = (ArrayList<EmpleadoDTO>)in.readObject();
	        in.close();
	        for (int i = 0; i < lista.size(); i++) {
	        		System.out.println(lista.get(i).getCodigo());
	        }

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public Registro[] getDatos() {
		return datos;
	}

	public void setDatos(Registro[] datos) {
		this.datos = datos;
	}

	public int[] getNumeros() {
		return numeros;
	}

	public void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}

	public ArrayList<EmpleadoDTO> getLista() {
		return lista;
	}

	public void setLista(ArrayList<EmpleadoDTO> lista) {
		this.lista = lista;
	}

	
	
}