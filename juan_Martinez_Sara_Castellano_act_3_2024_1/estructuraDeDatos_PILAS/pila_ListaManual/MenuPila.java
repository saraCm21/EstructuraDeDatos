package pila_ListaManual;

import java.util.Scanner;

public class MenuPila {
	
	public static void main(String[] args) {
		
		ModeloPila pila = new ModeloPila();
		menu(pila);
		
	}
	
	public static void menu(ModeloPila pila) {
		
		Scanner teclado = new Scanner(System.in);
		int selec;
		
		System.out.println("*** MUNU ***");
		System.out.println("1. Agragar elemento a la pila");
		System.out.println("2. Eliminar elemento de la pila");
		System.out.println("3. Ver elemento superior");
		System.out.println("4. Mostrar la pila");
		System.out.println("5. salir");
		selec = teclado.nextInt();
		
		switch (selec) {
		case 1: {
			push(pila);
			menu(pila);
			break;
		}case 2: {
			pop(pila);
			menu(pila);
			break;
		}case 3: { 
			top(pila);
			menu(pila);
			break;
		}case 4: {
			show(pila);
			menu(pila);
			break;
		}case 5: {
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + selec);
		}

	}
	
	public static void push(ModeloPila pila) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el numero que quiere agregar a la pila");
		int value = teclado.nextInt();
		
		pila.PUSH(value);

	}
	
	public static void pop(ModeloPila pila) {
		
		pila.POP();;

	}
	
	public static void top(ModeloPila pila) {
		
		pila.TOP();;

	}
	
	public static void show(ModeloPila pila) {
		
		pila.show();;

	}
}
