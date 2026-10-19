package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Interface.PeliculasMetodos;
import Modelo.Peliculas;

public class PeliculasImp implements PeliculasMetodos{

	private List<Peliculas> lista = new ArrayList<>();
	
	// Validar que el nombre no se repita
	@Override
	public void guardar(Peliculas pelicula) {
		// TODO Auto-generated method stub
		boolean bandera = false;
		
		for(Peliculas p : lista) {
			if(p.getNombre().equalsIgnoreCase(pelicula.getNombre())) {
				bandera = true;
				System.out.println("\nYa existe esa pelicula\n");
				break;
			}
		}
		
		if(!bandera) {
			lista.add(pelicula);
			System.out.println("\nSe guardo correctamente\n");
		}
		
		
	}

	@Override
	public List<Peliculas> mostrar() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Peliculas buscar(String nombre) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getNombre().equalsIgnoreCase(nombre)) {
				return lista.get(i);
			}
		}
		
		return null;
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		
		Peliculas peliEnco = buscar(nombre);
		
		if(peliEnco != null){
			lista.remove(peliEnco);
			System.out.println("\nSe elimino con exito\n");
		}else
			System.out.println("\nNo existe esa pelicula para eliminar\n");
	}

	@Override
	public Peliculas buscarCa(String categoria) {
		// TODO Auto-generated method stub
		
		//List<Peliculas> resultado = new ArrayList<>();
		
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getCategoria().equalsIgnoreCase(categoria)) {
				return lista.get(i);
				
			}
		}
		
		return null;
	}

	@Override
	public float totalInvertido(Peliculas pelicula) {
		// TODO Auto-generated method stub
		
		float resultado = 0; 
		
		for(Peliculas p: lista) {
			resultado = resultado + p.getPrecio();
		}
		
		return resultado;
	}

}
