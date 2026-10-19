package Modelo;

public class Peliculas {

	private String nombre;
	private String categoria;
	private float precio;
	private int estreno;
	
	public Peliculas(String nombre, String categoria, float precio, int estreno) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.estreno = estreno;
	}

	@Override
	public String toString() {
		return "Peliculas [nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio + ", estreno="
				+ estreno + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getEstreno() {
		return estreno;
	}

	public void setEstreno(int estreno) {
		this.estreno = estreno;
	}
	
	
	
}
