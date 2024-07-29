package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.persistence.EmpleadoDTO;
import co.edu.unbosque.model.persistence.Registro;

public class View extends JFrame{

	//Constante generada por Eclipse  
	private static final long serialVersionUID = 1L;
	private PanelEntrada panelEntrada; //Se declara un objeto de tipo PanelEntrada
	private PanelResultados panelResultados; //Se declara un objeto de tipo PanelResultados
	private PanelRegistro panelRegistro;
	
	public View(Controller control) 
	{
		// Definici�n de los par�metros b�sicos de la ventana principal
		
		setSize(500,400); //tama�o en ancho y alto en pixeles
		setResizable(false); //Se puede cambiar el tama�o de la ventana?
		setTitle("T�tulo de la Ventana Principal"); //t�tulo de la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);//qu� debe hacer si cierra la ventana
		setLocationRelativeTo(null); //coloca la ventana al centro de la pantalla
		//Establece el layout (lienzo) que vamos a utilizar dentro de la ventana principal.
		setLayout( new BorderLayout() );
		//Se agrega al layout en la parte NORTH, el panel de entrada definido
		panelEntrada = new PanelEntrada();
		add(panelEntrada,BorderLayout.NORTH);
		//Se agrega al layout en la parte CENTER, el panel de entrada definido
		panelResultados = new PanelResultados();
		add(panelResultados,BorderLayout.CENTER);
		panelRegistro = new PanelRegistro();
		add(panelRegistro,BorderLayout.SOUTH);
		
		//se agrega al boton ActionListener del objeto de Controlador - cambio
		panelEntrada.getButEscribir().addActionListener(control);
		panelEntrada.getButLeer().addActionListener(control);
		panelEntrada.getButLeerReg().addActionListener(control);
		panelEntrada.getButEscribirReg().addActionListener(control);
	}

	public PanelEntrada getPanelEntrada() {
		return panelEntrada;
	}

	public void setPanelEntrada(PanelEntrada panelEntrada) {
		this.panelEntrada = panelEntrada;
	}

	public PanelRegistro getPanelRegistro() {
		return panelRegistro;
	}

	public void setPanelRegistro(PanelRegistro panelRegistro) {
		this.panelRegistro = panelRegistro;
	}

	public PanelResultados getPanelResultados() {
		return panelResultados;
	}

	public void setPanelResultados(PanelResultados panelResultados) {
		this.panelResultados = panelResultados;
	}

	public void escribirMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "archivos binarios", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void mostrarCifras(int numReg, int numeros[], double valores[]) {
		for (int i= 0 ; i<numReg ; i++) {
			getPanelResultados().getTxtMonto().append(String.valueOf(numeros[i])+"\n");
			getPanelResultados().getTxtValores().append(String.valueOf(valores[i])+"\n");
		}	
	}	

	public void mostrarRegistros(int numReg, Registro[] datos) {
		for (int i= 0 ; i<numReg ; i++) {
			getPanelRegistro().getTxtEdad().append(String.valueOf(datos[i].getEdad())+"\n");
			getPanelRegistro().getTxtNombre().append(String.valueOf(datos[i].getNombre())+"\n");
			getPanelRegistro().getTxtSalario().append(String.valueOf(datos[i].getSalario())+"\n");
		}	
	}
	
	public void mostrarEmpleados(ArrayList<EmpleadoDTO> lista) {
		for (int i= 0 ; i<lista.size() ; i++) {
			getPanelRegistro().getTxtEdad().append(String.valueOf(lista.get(i).getNombre())+"\n");
			getPanelRegistro().getTxtNombre().append(String.valueOf(lista.get(i).getCodigo())+"\n");
			getPanelRegistro().getTxtSalario().append(String.valueOf(lista.get(i).getSalario())+"\n");
		}	
	}
	
}