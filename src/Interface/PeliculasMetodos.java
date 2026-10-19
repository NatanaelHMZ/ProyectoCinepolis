package Interface;

import java.util.List;

import Modelo.Peliculas;

public interface PeliculasMetodos {
	
	public void guardar(Peliculas pelicula);
	
	public List<Peliculas> mostrar();
	
	public Peliculas buscar(String nombre);
	
	public void eliminar(String nombre);
	
	public Peliculas buscarCa(String categoria);
	
	public float totalInvertido(Peliculas pelicula);
}
