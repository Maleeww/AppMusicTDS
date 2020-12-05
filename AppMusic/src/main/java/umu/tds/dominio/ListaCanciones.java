package umu.tds.dominio;

import java.util.LinkedList;

public class ListaCanciones {
	private String nombre;
	protected LinkedList<Cancion> canciones;
	
	public ListaCanciones(String nombre) {
		this.nombre = nombre;
		//Se le pasa una canción inicial?
	}
	
	public LinkedList<Cancion> getCanciones() {
		return new LinkedList<Cancion>(canciones);
	}

	public String getNombre() {
		return nombre;
	}
	
	public void addCancion(Cancion cancion) {
		canciones.add(cancion);
	}
}