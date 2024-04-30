package cola_LIFO;

import java.util.Scanner;

public class MenuColaLIFO {
	
	public static void main(String[] args) {
		
		ModeloColaLIFO cola = new ModeloColaLIFO();
			menu(cola);
			
		}
		
		public static void menu(ModeloColaLIFO cola){
			
			Scanner teclado = new Scanner(System.in);
			int selec;
			
			System.out.println("*** MUNU ***");
			System.out.println("1. Agregar elemento a la cola");
			System.out.println("2. Eliminar elemento de la cola");
			System.out.println("3. Ver elemento inferior");
			System.out.println("4. Mostrar la cola");
			System.out.println("5. salir");
			selec = teclado.nextInt();
			
			switch (selec) {
			case 1: {
				Encolar(cola);
				menu(cola);
				break;
			}case 2: {
				Desencolar(cola);
				menu(cola);
				break;
			}case 3: { 
				Frente(cola);
				menu(cola);
				break;
			}case 4: {
				show(cola);
				menu(cola);
				break;
			}case 5: {
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + selec);
			}

		}
		
		public static void Encolar(ModeloColaLIFO cola) {
			
			Scanner teclado = new Scanner(System.in);
			System.out.println("Ingrese el numero que quiere agregar a la pila");
			int value = teclado.nextInt();
			
			cola.Encolar(value);

		}
		
		public static void Desencolar(ModeloColaLIFO cola){
			
			cola.Desencolar();;

		}
		
		public static void Frente
		(ModeloColaLIFO cola) {
			
			cola.Frente();;

		}
		
		public static void show(ModeloColaLIFO cola) {
			
			cola.show();;

		}
}
