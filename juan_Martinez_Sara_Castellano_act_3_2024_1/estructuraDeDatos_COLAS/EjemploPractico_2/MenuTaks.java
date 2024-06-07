package EjemploPractico_2;
import java.util.Scanner;

public class MenuTaks {
	public static void main(String[] args) {
		
		colaTaks colaTareas = new colaTaks();		
		menu(colaTareas);
		
	}
	
	@SuppressWarnings("resource")
	private static void menu(colaTaks colaTareas) {
		Scanner teclado = new Scanner(System.in);
		int opcion;
		
		System.out.println("\n------ Lista de Tareas ------");
		System.out.println("1. Agregar tarea");
		System.out.println("2. Completar tarea");
		System.out.println("3. Mostrar tareas pendientes");
		System.out.println("4. Salir"); 
		System.out.print("Ingrese una opción: ");
		opcion = teclado.nextInt();
		
        switch (opcion) {
        case 1:
        	String nuevaTarea;
            System.out.println("Ingrese la nueva tarea: ");
            nuevaTarea = teclado.nextLine();
            colaTareas.Encolar(nuevaTarea);
            System.out.println("Tarea agregada: " + nuevaTarea);
            menu(colaTareas);
            break;
        case 2:
            if (!colaTareas.isEmpty()) {
                String tareaCompletada = colaTareas.Frente();
                System.out.println("Tarea completada: " + tareaCompletada);
                colaTareas.Desencolar();
            } else {
                System.out.println("No hay tareas pendientes");
            }
            menu(colaTareas);
            break;
        case 3:
            if (!colaTareas.isEmpty()) {
                System.out.println("Tareas pendientes:");
                colaTareas.show();
            } else {
                System.out.println("No hay tareas pendientes");
            }
            menu(colaTareas);
            break;
        case 4:
            System.out.println("Saliendo del programa...");
            break;
        default:
            System.out.println("Por favor, ingrese una opción válida");
            break;
    
        }
	
		
	}
}
