package pila_ColaLIFO;

import java.util.Scanner;

public class MenuPila_ColaLIFO {
	
	public static void main(String[] args) {
		
		ModeloPila_colaLIFO pila = new ModeloPila_colaLIFO();
		menu(pila);
		
	}
	
	public static void menu(ModeloPila_colaLIFO pila) {
		
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
	
	public static void push(ModeloPila_colaLIFO pila) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el numero que quiere agregar a la pila");
		int value = teclado.nextInt();
		
		pila.Encolar(value);
	
	}
	
	public static void pop(ModeloPila_colaLIFO pila) {
		
		pila.Desencolar();;
	
	}
	
	public static void top(ModeloPila_colaLIFO pila) {
		
		pila.Frente();;
	
	}
	
	public static void show(ModeloPila_colaLIFO pila) {
		
		pila.show();;
	
	}
}
