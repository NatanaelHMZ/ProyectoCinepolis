package Main;

import java.util.Scanner;

import Implementacion.PeliculasImp;
import Modelo.Peliculas;

public class Principal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lectura = null;
		
		String nombre;
		String categoria;
		float precio;
		int estreno, menuPrincipal;
		
		Peliculas pelicula = null;
		
		PeliculasImp imp = new PeliculasImp();
		
		do {
			System.out.println("BIENVENIDO AL MENU CINEPOLIS");
			System.out.println("1---ALTA");
			System.out.println("2---MOSTRAR");
			System.out.println("3---BUSCAR POR NOMBRE");
			System.out.println("4---EDITAR PRECIO POR NOMBRE");
			System.out.println("5---ELIMINAR");
			System.out.println("6---BUSCAR POR CATEGORIA");
			System.out.println("7---CALCULAR EL TOTAL DEL DIENERO INVERTIDO");
			System.out.println("8---SALIR");
			
			lectura = new Scanner(System.in);
			menuPrincipal = lectura.nextInt();
			
			switch (menuPrincipal) {
			case 1:
				
				try {
					
					System.out.print("\nIngresa el nombre de la pelicula: ");
					lectura = new Scanner(System.in);
					nombre = lectura.nextLine();
					
					System.out.print("Ingresa la categoria de la pelicula:");
					lectura =  new Scanner(System.in);
					categoria = lectura.nextLine();
					
					System.out.print("Ingresa el precio de la pelicula: ");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();
					
					System.out.print("Ingresa el año de la pelicula: ");
					lectura = new Scanner(System.in);
					estreno = lectura.nextInt();
					
					pelicula = new Peliculas(nombre, categoria, precio, estreno);
					imp.guardar(pelicula);
					
					//System.out.println("\nSe guardo correctamente\n");
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("\nNo se pudo guardar la pelicula\n");
				}
				
				break;

			case 2:
				
				if(imp.mostrar().isEmpty())					
					System.out.println("\nNo hay registros\n");
				else
					System.out.println(imp.mostrar());
				
				break;
			case 3:
				
				if(imp.mostrar().isEmpty())
					System.out.println("\nNo hay registros\n");
				else {
					System.out.println("Ingrese el nombre de la pelicula: ");
					lectura = new Scanner(System.in);
					nombre = lectura.nextLine();
					
					pelicula = imp.buscar(nombre);
					
					if(pelicula != null)
						System.out.println("\n" + pelicula);
					else
						System.out.println("\nNo existe esa pelicula\n");
					
				}
				
				break;
			case 4:
				
				if(imp.mostrar().isEmpty())
					System.out.println("\nNo hay registros\n");
				else {
					System.out.println("Ingrese el nombre de la pelicula: ");
					lectura = new Scanner(System.in);
					nombre = lectura.nextLine();
					
					pelicula = imp.buscar(nombre);
					
					if(pelicula != null) {
						System.out.println("\nSe encontro la pelicula: " + pelicula.getNombre() + ", para editar su precio.");
						
						System.out.print("\nIngrese el nuevo precio: ");
						lectura = new Scanner(System.in);
						precio = lectura.nextFloat();
						pelicula.setPrecio(precio);
						
						System.out.println("\nSe edito correctamente\n");
					}
					else
						System.out.println("\nNo existe esa pelicula\n");
				}
				
				break;
			case 5:
				
				if(imp.mostrar().isEmpty())
					System.out.println("\nNo hay registros\n");
				else {
					System.out.print("Ingrese el nombre de la pelicula para eliminar: ");
					lectura = new Scanner(System.in);
					nombre = lectura.nextLine();
					
					imp.eliminar(nombre);
				}
				
				break;
			case 6:
				
				if(imp.mostrar().isEmpty())
					System.out.println("\nNo hay registros\n");
				else {
					System.out.println("Ingrese el nombre de la categoria de la pelicula: ");
					lectura = new Scanner(System.in);
					categoria = lectura.nextLine();
					
					pelicula = imp.buscarCa(categoria);
					
					
					if(pelicula != null) 
						System.out.println("\n" + pelicula);	
					
					else
						System.out.println("\nNo existe esa categoria\n");
				}
				
				break;
			case 7:
				
				System.out.println("\nEl total invertido es: " + imp.totalInvertido(pelicula) + "\n");
				
				break;
			case 8:
				System.out.println("Adios!");
				break;
			}
			
			
		}while(menuPrincipal < 8);
	}

}
