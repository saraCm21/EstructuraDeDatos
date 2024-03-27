package modulo_1;

import java.util.Scanner;

public class ponit5 {
	public static void main(String[] args) {
		
//		TRABAJAR CON MATRICES (TABLAS O ARREGLOS MULTIDIMENCIONALES)
		
		Scanner teclado = new Scanner(System.in);
		String name;
		int rows = 3;
		int columns = 5;
		Object lenguajes[][] = infoLenguajes(rows, columns);
		
		System.out.println("Ingrese el nombre de un lenguaje");
		name = teclado.next();
		name(name, lenguajes);
		coor(name, lenguajes);
		coorRows(lenguajes, columns);
		coorColumn(lenguajes);
		coorRC(lenguajes, columns);
		nameCoor(lenguajes);
		print(lenguajes);
		
	}
	
	private static Object[][] infoLenguajes(int r, int c) {
		
		Scanner teclado = new Scanner(System.in);
		Object lenguajes[][]= new Object[r][c];
	
		
		lenguajes[0][0] = "NOMBRE";
		lenguajes[0][1] = "AÑO";
		lenguajes[0][2] = "AUTOR";
		lenguajes[0][3] = "DETALLES";
		lenguajes[0][4] = "FRAMEWORKS";
		
		for (int i = 1; i <= (r - 1); i++) {
				
				System.out.println("INGRESE LOS DATOS DE LA FILA: NOMBRE, AÑO, AUTOR, DETALLES, FRAMEWORKS");
				lenguajes[i][0] = teclado.next();
				lenguajes[i][1] = teclado.nextInt();
				lenguajes[i][2] = teclado.next();
				lenguajes[i][3] = teclado.next();
				lenguajes[i][4] = teclado.next();
			
		}
		
		return lenguajes;

	}
	
	private static void name(String name, Object lenguajes[][]) {
		
		boolean find = false;
		
		for (int i = 1; i < lenguajes.length; i++) {
			if(name.equalsIgnoreCase((String) lenguajes[i][0])) {
				find = true;
			}
		}
		
		if(find == true) {
			System.out.println("Si se encontro el nombre en la lista");
		}else {
			System.out.println("No se encontro el nombre en la lista");
		}
		
	}
	
	private static void coor(String name, Object lenguajes[][]) {
		
		boolean find = false;

		for (int i = 1; i < lenguajes.length; i++) {
			if(name.equalsIgnoreCase((String) lenguajes[i][0])) {
				System.out.println("El nombre se encuentra en la fila " + (i+1) + ", columna 1");
				find = true;
			}
		}
		
		if (find == false) {
			System.out.println("null");
		}
	}
	
	private static void coorRows(Object lenguajes[][], int colums) {
		
		try {
			
			Scanner teclado = new Scanner(System.in);
			int row;
			
			System.out.println("Ingrese el indice de la fila de la cual quiera saber el contenido");
			row = teclado.nextInt();
			
			for (int i = 0; i < colums ; i++) {
				System.out.print(lenguajes[row][i] + " ");
			}
			
			System.out.println("\n");
			
		} catch (Exception e) {
			System.out.println("El indice es erroneo");
		}
		
	}
	
	private static void coorColumn(Object lenguajes[][]) {
			
		try {
			
			Scanner teclado = new Scanner(System.in);
			int column;
			
			System.out.println("Ingrese el indice de la columna de la cual quiera saber el contenido");
			column = teclado.nextInt();
			
			for (int i = 0; i < lenguajes.length ; i++) {
				System.out.println(lenguajes[i][column] + " ");
			}
			
			System.out.println("\n");
			
		} catch (Exception e) {
			System.out.println("El indice es erroneo");
		}
		
	}
	
	private static void coorRC(Object lenguajes[][], int columnIndex) {
		
		Scanner teclado = new Scanner(System.in);
		int column;
		int row;
		
		System.out.println("Ingrese el indice de la fila de la cual quiera saber el contenido");
		row = teclado.nextInt();
		System.out.println("Ingrese el indice de la columna de la cual quiera saber el contenido");
		column = teclado.nextInt();
		
		try {
			
			System.out.println("El dato que ingreso fue: " + lenguajes[row][column]);
			System.out.println("INFORMACION DE LA FILA");
			
			for (int i = 0; i < columnIndex; i++) {
				
				System.out.print(lenguajes[row][i] + " ");
				
			}
			
			System.out.println("\n");
			
		} catch (Exception e) {
			System.out.println("La coordenada es erronea");		}
	}
	
	private static void nameCoor(Object lenguajes[][]) {
		
		Scanner teclado = new Scanner(System.in);
		boolean find = false;
			
			System.out.println("Ingrese el nombre del lenguaje que quiere buscar");
			String nameL = teclado.next();
			
			for (int i = 0; i < lenguajes.length; i++) {
				if((nameL.equalsIgnoreCase((String) lenguajes[i][0]))){
					System.out.println("Las coordenadas son " + i + ", 0");
					find = true;
				}
			}
			
			if (find == false) {
				System.out.println("No se encontro el nombre");
			}
		
		

	}
	
	private static void print(Object lenguajes[][]) {
			
			for (int i = 0; i < lenguajes.length; i++) {
	            for (int j = 0; j < lenguajes[0].length; j++) {
	                System.out.print(lenguajes[i][j] + " ");
	            }
	            System.out.println();
			}
		}

}
