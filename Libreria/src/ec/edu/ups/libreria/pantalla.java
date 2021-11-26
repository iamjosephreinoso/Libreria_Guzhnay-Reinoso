package ec.edu.ups.libreria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class pantalla {
	
	public void menu() {
		
		List<libro> ListaLibros = new ArrayList<libro>();
		Scanner teclado = new Scanner(System.in);
		int op = 0;
		do{
		System.out.println("*********** MENÜ ***********");
		System.out.println("1. Agregar Libro");
		System.out.println("2. Eliminar Libro");
		System.out.println("3. Listar Libro");
		System.out.println("4. Salir");
		op = teclado.nextInt();
		switch(op) {
			case 1:
				System.out.println("Escoja 1. Digital o 2. Físico");
				int op2 = teclado.nextInt();
				switch(op2) {
					case 1:
						System.out.println("***** INGRESE LIBRO DIGITAL *****");
						libroDigital l = new libroDigital();
						System.out.println("Titulo del Libro");
						teclado.nextLine();
						l.setTitulo(teclado.nextLine());
						System.out.println("Edición del Libro");
						l.setEdicion(teclado.nextInt());
						System.out.println("Nombre del Autor");
						teclado.nextLine();
						l.setAutor(teclado.nextLine());
						System.out.println("Precio del Libro");
						l.setPrecio(teclado.nextDouble());
						ListaLibros.add(l);
						l.calcularPrecio();
						break;
					case 2:
						System.out.println("***** INGRESE LIBRO FISICO *****");
						libroFisico f = new libroFisico();
						System.out.println("Titulo del Libro");
						teclado.nextLine();
						f.setTitulo(teclado.nextLine());
						System.out.println("Edición del Libro");
						f.setEdicion(teclado.nextInt());
						teclado.nextLine();
						System.out.println("Nombre del Autor");
						f.setAutor(teclado.nextLine());
						System.out.println("Precio del Libro");
						f.setPrecio(teclado.nextDouble());
						ListaLibros.add(f);
						f.calcularPrecio();
						break;
				}
				break;
			case 2:
				System.out.println("***** ELIMINAR LIBRO *****");
				System.out.println("Titulo del Libro");
				teclado.nextLine();
				String titulo = teclado.nextLine();
				int posicion = 0;
				for(int i = 0; i < ListaLibros.size(); i++) {
					if(titulo.equalsIgnoreCase(ListaLibros.get(i).getTitulo())) {
						posicion = i;
					}
				}
				ListaLibros.remove(posicion);
				break;
			case 3:
				for (libro libro: ListaLibros) {
					System.out.println(libro.toString());
					
				}
				break;
		}
		}while(op<=4);
	}
}
