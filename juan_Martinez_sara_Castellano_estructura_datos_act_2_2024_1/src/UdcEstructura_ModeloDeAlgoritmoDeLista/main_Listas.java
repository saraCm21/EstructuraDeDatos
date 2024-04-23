package UdcEstructura_ModeloDeAlgoritmoDeLista;

import java.util.Scanner;

public class main_Listas {
	
	public static void main(String[] args) {
		
		modeloListaSimple lista = new modeloListaSimple();
		lista = menu(lista);
		
	}
	
	public static modeloListaSimple menu(modeloListaSimple lista) {
		
		Scanner teclado = new Scanner(System.in);
		int number;
		
		System.out.println("MENU");
		System.out.println("Agregar elemento a la lista - 1");
		System.out.println("Optener elemento por posicion - 2");
		System.out.println("Optener posicion por elemento - 3");
		System.out.println("Eliminar elemento - 4");
		System.out.println("Mostrar la lista - 5");
		System.out.println("Menu de ordenamientos - 6");
		System.out.println("Salis - 7");
		number = teclado.nextInt();
		
		switch (number) {
		case 1: {
			lista = addElement(lista);
			System.out.println("\n");
			menu(lista);
			break;
		}case 2: {
			getValue(lista);
			System.out.println("\n");
			menu(lista);
			break;
		}case 3: {
			getValue(lista);
			System.out.println("\n");
			menu(lista);
			break;
		}case 4: {
			lista = delete(lista);
			System.out.println("\n");
			menu(lista);
			break;
		}case 5: {
			lista.show();
			System.out.println("\n");
			menu(lista);
			break;
		}case 6: {
			int option;
			System.out.println("Menu ordenamiento");
			System.out.println("Ordenar de manera ascendente - 1");
			System.out.println("Ordenar de manera aleatoria - 2");
			System.out.println("Ordenar de manera descendente - 3");
			option = teclado.nextInt();
			
			switch (option) {
			case 1: {
				ordenarAscendente(lista);
				System.out.println("\n");
				break;
			}case 2: {
				ordenarAleatorio(lista);
				System.out.println("\n");
				break;
			}case 3: {
				ordenarSeleccion(lista);
				System.out.println("\n");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + option);
			}
			
			menu(lista);
			break;
		}case 7: {
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + number);
		}
		
		return lista;
	}
	
	public static modeloListaSimple addElement(modeloListaSimple lista) {
		
		Scanner teclado = new Scanner(System.in);
		int value;
		
		System.out.println("Ingrese el elemento");
		value = teclado.nextInt();
		lista.addValue(value);
		
		return lista;

	}
	
	public static void getValue(modeloListaSimple lista) {
		
		Scanner teclado = new Scanner(System.in);
		int position;
		
		System.out.println("Ingrese la posicion del elemento que quiere buscar");
		position = teclado.nextInt();
		
		try {
			System.out.println(lista.getValue(position));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getPosition(modeloListaSimple lista) {
		
		Scanner teclado = new Scanner(System.in);
		int value;
		
		System.out.println("Ingrese el valor del que quiere saber su posicion");
		value = teclado.nextInt();
		
		try {
			System.out.println(lista.getValue(value));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static modeloListaSimple delete(modeloListaSimple lista) {
			
		Scanner teclado = new Scanner(System.in);
		int value;
		
		System.out.println("Ingrese el valor del que desea eliminar");
		value = teclado.nextInt();
		
		try {
			lista.delete(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public static void ordenarAscendente(modeloListaSimple lista) {
		
		lista.burbuja();
		lista.show();
	}
	
	public static void ordenarAleatorio(modeloListaSimple lista){
		
		lista.aleatorio();
		lista.show();
	}

	public static void ordenarSeleccion(modeloListaSimple lista){
		
		lista.selectionSort();
		lista.show();
	}
	
	
	
	
}
