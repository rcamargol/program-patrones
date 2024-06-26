package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.model.persistence.CaracteristicaEmisora;

public class Emisora {

	private Archivo archivo;
	private CaracteristicaEmisora caracteristicasEmisora;
	private ArrayList<PistaMusical> pistasMusicales;
	private ParrillaMusical parrillaMusical;
	private String nombreEmisora;
	private String modoTransmision;
	private String tipoDeMusica;
	private String idioma;
	private String[] titulosPanelDatosEmisora;
	private String[] titulosPanelParrilla;
	private String[] titulosPanelAgregarCancion;
	private String[] titulosPanelInformacionEmisora;
	private String[] titulosView;
	private String[] mensajesError;
	private String mensajeAceptar;
	private int contadorCanciones;

	public Emisora() {
		this.archivo = new Archivo();
		this.caracteristicasEmisora = new CaracteristicaEmisora();
		this.pistasMusicales = new ArrayList<PistaMusical>();
		this.parrillaMusical = new ParrillaMusical();
	}
	public void asignarInformacionEmisora(String nombreEmisora, String modoTransmision, String tipoMusica,
			String idioma) {

		this.nombreEmisora = nombreEmisora;
		this.modoTransmision = modoTransmision;
		this.tipoDeMusica = tipoMusica;
		this.idioma = idioma;
	}

	public void gestionarParrilla(String nombreCancion) {

		String[] datosPista = new String[4];

		for (PistaMusical pistaMusical : pistasMusicales) {

			if (pistaMusical.getNombreCancion().equals(nombreCancion)) {
				this.parrillaMusical.agregarPistaMusical(pistaMusical);
				datosPista[0] = pistaMusical.getNombreCancion();
				datosPista[1] = pistaMusical.getNombreAutor();
				datosPista[2] = pistaMusical.getGeneroMusical();
				datosPista[3] = pistaMusical.getNombreArchivoMusica();
				this.archivo.escribir(datosPista);
			}
		}
	}

	public String[] llenarParrilla(String nombreCancion) {
		String[] datosPista = new String[3];

		for (PistaMusical pistaMusical : pistasMusicales) {

			if (pistaMusical.getNombreCancion().equals(nombreCancion)) {
				this.parrillaMusical.agregarPistaMusical(pistaMusical);
				datosPista[0] = pistaMusical.getNombreCancion();
				datosPista[1] = pistaMusical.getNombreAutor();
				datosPista[2] = pistaMusical.getGeneroMusical();

			}
		}
		return datosPista;
	}

	public void gestionarCaracteristicas() {

		try {
			this.nombreEmisora = this.caracteristicasEmisora.leer("nombreEmisora",
					this.caracteristicasEmisora.getArchivoConfiguracion());
			this.modoTransmision = this.caracteristicasEmisora.leer("modoTransmision",
					this.caracteristicasEmisora.getArchivoConfiguracion());
			this.tipoDeMusica = this.caracteristicasEmisora.leer("tipoMusica",
					this.caracteristicasEmisora.getArchivoConfiguracion());
			this.idioma = this.caracteristicasEmisora.leer("idioma",
					this.caracteristicasEmisora.getArchivoConfiguracion());
			this.titulosPanelDatosEmisora = this.caracteristicasEmisora.leer("titulosPanelDatosEmisora").split("~");
			this.titulosPanelParrilla = this.caracteristicasEmisora.leer("titulosPanelParrilla").split("~");
			this.titulosPanelAgregarCancion = this.caracteristicasEmisora.leer("titulosPanelAgregarCancion").split("~");
			this.titulosPanelInformacionEmisora = this.caracteristicasEmisora.leer("titulosPanelInformacionEmisora")
					.split("~");
			this.titulosView = this.caracteristicasEmisora.leer("titulosView").split("~");
			this.mensajesError = this.caracteristicasEmisora.leer("mensajesError").split("~");
			this.mensajeAceptar = this.caracteristicasEmisora.leer("mensajesAceptar");
		} catch (Exception e) {
			// TODO: handle exception
			escribirArchivoEmisora("");
			gestionarCaracteristicas();
		}

	}

	public boolean agregarPistaMusical(String nombreCancion, String nombreArtista, String generoMusical,
			String nombreArchivoMusica) {

		PistaMusical obj = new PistaMusical();
		obj.setGeneroMusical(generoMusical);
		obj.setNombreCancion(nombreCancion);
		obj.setNombreAutor(nombreArtista);
		obj.setNombreArchivoMusica(nombreArchivoMusica);

		this.pistasMusicales.add(obj);
		if (this.escribirArchivoPistaMusical(nombreCancion, nombreArtista, generoMusical, nombreArchivoMusica))
			return true;
		else
			return false;

	}

	public boolean escribirArchivoEmisora() {

		if (this.caracteristicasEmisora.escribir(
				this.nombreEmisora + "~" + this.modoTransmision + "~" + this.tipoDeMusica + "~" + this.idioma))
			return true;
		else
			return false;

	}

	public boolean escribirArchivoEmisora(String s) {

		if (this.caracteristicasEmisora.escribir(s + "~" + s + "~" + s + "~" + "ES"))
			return true;
		else
			return false;

	}


	public void cargarAtributosArchivoPistas() {

		String[] pistas = this.archivo.leer(this.archivo.getRUTA_PISTAS()).split("\n");

		for (int i = 0; i < pistas.length; i++) {
			String[] atributo = pistas[i].split("~");
			if (atributo.length >= 4) {
				PistaMusical obj = new PistaMusical();
				obj.setNombreCancion(atributo[0]);
				obj.setNombreAutor(atributo[1]);
				obj.setGeneroMusical(atributo[2]);
				obj.setNombreArchivoMusica(atributo[3]);
				this.pistasMusicales.add(obj);
			} else {
				i = pistas.length;
			}
		}
	}

	public void cargarInformacionArchivoParrilla() {

		ArrayList<PistaMusical> pistas = new ArrayList<PistaMusical>();
		String[] pistasArchivo = this.archivo.leer(this.archivo.getRUTA_PARRILLA()).split("\n");

		for (int i = 0; i < pistasArchivo.length; i++) {
			String[] atributo = pistasArchivo[i].split("~");
			if (atributo.length >= 4) {
				PistaMusical obj = new PistaMusical();
				obj.setNombreCancion(atributo[0]);
				obj.setNombreAutor(atributo[1]);
				obj.setGeneroMusical(atributo[2]);
				obj.setNombreArchivoMusica(atributo[3]);
				pistas.add(obj);
			} else {
				i = pistasArchivo.length;
			}
		}
		this.parrillaMusical.cargarParrilla(pistas);
	}

	public String[][] asignarDatosTablaAgregarCancion() {

		String[][] tabla = new String[this.pistasMusicales.size()][4];
		int count = 1;
		for (int i = 0; i < this.pistasMusicales.size(); i++) {
			tabla[i][0] = Integer.toString(count);
			tabla[i][1] = this.pistasMusicales.get(i).getNombreCancion();
			tabla[i][2] = this.pistasMusicales.get(i).getNombreAutor();
			tabla[i][3] = this.pistasMusicales.get(i).getGeneroMusical();
			count++;
		}
		contadorCanciones = count;
		return tabla;
	}

	public String[][] asignarDatosTablaParrilla() {

		String[][] tabla = new String[this.parrillaMusical.getPistasMusicales().size()][4];
		int count = 1;
		for (int i = 0; i < this.parrillaMusical.getPistasMusicales().size(); i++) {
			tabla[i][0] = Integer.toString(count);
			tabla[i][1] = this.parrillaMusical.getPistasMusicales().get(i).getNombreCancion();
			tabla[i][2] = this.parrillaMusical.getPistasMusicales().get(i).getNombreAutor();
			tabla[i][3] = this.parrillaMusical.getPistasMusicales().get(i).getGeneroMusical();
			count++;
		}
		this.parrillaMusical.setContadorParrilla(count);
		return tabla;
	}

	public String[] generarListaDeCancionesDisponibles() {
		String[] salida = new String[this.pistasMusicales.size()];
		for (int i = 0; i < this.pistasMusicales.size(); i++) {
			salida[i] = this.pistasMusicales.get(i).getNombreCancion();
		}
		return salida;
	}

	public void verificarExtensionArchivo(String rutaArchivo, String nombreCancion)
			throws ExtensionIncorrectaException, CancionIgualException {

		String mimeType = rutaArchivo.substring(rutaArchivo.lastIndexOf(".") + 1, rutaArchivo.length());
		if (!mimeType.contains("mp3"))
			throw new ExtensionIncorrectaException(mensajesError[2]);

		for (PistaMusical pistaMusical : pistasMusicales)
			if (nombreCancion.equals(pistaMusical.getNombreCancion().trim()))
				throw new CancionIgualException(mensajesError[3]);
	}

	public boolean escribirArchivoPistaMusical(String nombreCancion, String nombreArtista, String generoMusical,
			String nombreArchivoMusica) {

		if (this.archivo
				.escribir(nombreCancion + "~" + nombreArtista + "~" + generoMusical + "~" + nombreArchivoMusica))
			return true;
		else
			return false;
	}

	public Archivo getArchivo() {
		return archivo;
	}

	public void setArchivo(Archivo archivo) {
		this.archivo = archivo;
	}

	public CaracteristicaEmisora getCaracteristicasEmisora() {
		return caracteristicasEmisora;
	}

	public void setCaracteristicasEmisora(CaracteristicaEmisora caracteristicasEmisora) {
		this.caracteristicasEmisora = caracteristicasEmisora;
	}

	public ArrayList<PistaMusical> getPistasMusicales() {
		return pistasMusicales;
	}

	public void setPistasMusicales(ArrayList<PistaMusical> pistasMusicales) {
		this.pistasMusicales = pistasMusicales;
	}

	public ParrillaMusical getParrillaMusical() {
		return parrillaMusical;
	}

	public void setParrillaMusical(ParrillaMusical parrillaMusical) {
		this.parrillaMusical = parrillaMusical;
	}

	public String getNombreEmisora() {
		return nombreEmisora;
	}

	public void setNombreEmisora(String nombreEmisora) {
		this.nombreEmisora = nombreEmisora;
	}

	public String getModoTransmision() {
		return modoTransmision;
	}

	public void setModoTransmision(String modoTransmision) {
		this.modoTransmision = modoTransmision;
	}

	public String getTipoDeMusica() {
		return tipoDeMusica;
	}

	public void setTipoDeMusica(String tipoDeMusica) {
		this.tipoDeMusica = tipoDeMusica;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String[] getTitulosPanelDatosEmisora() {
		return titulosPanelDatosEmisora;
	}

	public void setTitulosPanelDatosEmisora(String[] titulosPanelDatosEmisora) {
		this.titulosPanelDatosEmisora = titulosPanelDatosEmisora;
	}

	public String[] getTitulosPanelParrilla() {
		return titulosPanelParrilla;
	}

	public void setTitulosPanelParrilla(String[] titulosPanelParrilla) {
		this.titulosPanelParrilla = titulosPanelParrilla;
	}

	public String[] getTitulosPanelAgregarCancion() {
		return titulosPanelAgregarCancion;
	}

	public void setTitulosPanelAgregarCancion(String[] titulosPanelAgregarCancion) {
		this.titulosPanelAgregarCancion = titulosPanelAgregarCancion;
	}

	public String[] getTitulosPanelInformacionEmisora() {
		return titulosPanelInformacionEmisora;
	}

	public void setTitulosPanelInformacionEmisora(String[] titulosPanelInformacionEmisora) {
		this.titulosPanelInformacionEmisora = titulosPanelInformacionEmisora;
	}

	public String[] getTitulosView() {
		return titulosView;
	}

	public void setTitulosView(String[] titulosView) {
		this.titulosView = titulosView;
	}

	public String[] getMensajesError() {
		return mensajesError;
	}

	public void setMensajesError(String[] mensajesError) {
		this.mensajesError = mensajesError;
	}

	public String getMensajeAceptar() {
		return mensajeAceptar;
	}

	public void setMensajeAceptar(String mensajeAceptar) {
		this.mensajeAceptar = mensajeAceptar;
	}

	public int getContadorCanciones() {
		return contadorCanciones;
	}

	public void setContadorCanciones(int contadorCanciones) {
		this.contadorCanciones = contadorCanciones;
	}

}
