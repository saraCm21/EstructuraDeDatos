package modulo_1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class point1 {
	public static void main(String[] args) {
		
	/*
	 * DECLARAR Y DEFINIR ARREGLOS
	 */
	
	// DECLARACION Y ASIGNACION MANUELMENTE
		
		byte[] arreglo1 = new byte [5];
		arreglo1[0] = 5;
		arreglo1[1] = 6;
		arreglo1[2] = 1;
		arreglo1[3] = 8;
		arreglo1[4] = 0;
		
		System.out.println("CONTENIDO ARREGLO DE DATOS TIPO BYTE");
		for (byte b : arreglo1) {
			System.out.print(b + ", ");
		}
		
		System.out.println("\n");
		
		char[] arreglo2 = new char [5];
		arreglo2[0] = 'd';
		arreglo2[1] = 'a';
		arreglo2[2] = 't';
		arreglo2[3] = 'o';
		arreglo2[4] = 's';
		
		System.out.println("CONTENIDO ARREGLO DE DATOS TIPO CHARACTER");
		for (char c : arreglo2) {
			System.out.print(c + ", ");
		}
		
		System.out.println("\n");
		
		short[] arreglo3 = new short [5];
		arreglo3[0] = 20;
		arreglo3[1] = 30;
		arreglo3[2] = 40;
		arreglo3[3] = 50;
		arreglo3[4] = 60;
		
		System.out.println("CONTENIDO ARREGLO DE DATOS TIPO SHORT");
		for (short s : arreglo3) {
			System.out.print(s + ", ");
		}
		
		System.out.println("\n");
		
		long[] arreglo4 = new long [5];
		arreglo4[0] = 2538300;
		arreglo4[1] = 73826;
		arreglo4[2] = 2555;
		arreglo4[3] = 1000;
		arreglo4[4] = 600;
		
		System.out.println("CONTENIDO ARREGLO DE DATOS TIPO LONG");
		for (long l : arreglo4) {
			System.out.print(l + ", ");
		}
		
		System.out.println("\n");
		
		int[] arreglo5 = new int[5];
		arreglo5[0] = 2020;
		arreglo5[1] = 2021;
		arreglo5[2] = 2022;
		arreglo5[3] = 2023;
		arreglo5[4] = 2024;
		
		System.out.println("CONTENIDO ARREGLO DE DATOS TIPO INT");
		for (int i : arreglo5) {
			System.out.print(i + ", ");
		}
		
		System.out.println("\n");
		
		float[] arreglo6 = new float [5];
		arreglo6[0] = 1.5f;
		arreglo6[1] = 5.5f;
		arreglo6[2] = 3.7f;
		arreglo6[3] = 6.6f;
		arreglo6[4] = 4.4f;
		
		System.out.println("CONTENIDO ARREGLO DE DATOS TIPO FLOAT");
		for (float f : arreglo6) {
			System.out.print(f + ", ");
		}
		
		System.out.println("\n");
		
		double[] arreglo7 = new double [5];
		arreglo7[0] = 34.9;
		arreglo7[1] = 15.55;
		arreglo7[2] = 7.9;
		arreglo7[3] = 1062.4;
		arreglo7[4] = 12.836;
	
		System.out.println("CONTENIDO ARREGLO DE DATOS TIPO DOUBLE");
		for (double d : arreglo7) {
			System.out.print(d + ", ");
		}
		
		System.out.println("\n");
		
		Object[] arreglo8 = new Object [5];
		arreglo8[0] = "Hola mundo";
		arreglo8[1] = 67;
		arreglo8[2] = false;
		arreglo8[3] = 'l';
		arreglo8[4] = 23.8;
	
		System.out.println("CONTENIDO ARREGLO DE DATOS TIPO OBJECT");
		for (Object o : arreglo8) {
			System.out.print(o + ", ");
		}
		
		System.out.println("\n");
		
//	DECLARACION Y ASIGNACION DE DATOS POR CONSOLA 
		
		Scanner teclado = new Scanner(System.in);
		String[] nombres = new String[5];
		int[] edades = new int[5];
		
		for(int i = 0; i < nombres.length; i++) {
			System.out.println("Escriba el nombre numero " + (i+1));
			nombres[i] = teclado.next();
			
			System.out.println("Escriba la edad de la persona");
			edades[i] = teclado.nextInt();
		}
		
		System.out.println("Los nombres son");
		for (String i : nombres) {
			System.out.print(i + ", ");
		}
		
		System.out.println("Los nombres son");
		for (int i : edades) {
			System.out.print(i + ", ");
		}
		
// DECLARAR Y DEFINIR UN ARREGLO DE TIPO STRING EN UNA VARIABLE LLAMADA DATASTRUCTS Y USAR UNA SINTAXIS DE LLAVES 
		
		String[] dataStructs = {"Listas: ", "Colas: ", "Pilas: ", "Mapas: ", "Conjuntos: "};
		String[] caracteristicas = new String[5];
		
		for (int i = 0; i < caracteristicas.length; i++) {
			caracteristicas[i] = JOptionPane.showInputDialog(null, "Ingrese las caracteristicas numero " + (i+1));
			
		}
		
		for (int i = 0; i < caracteristicas.length; i++) {
			JOptionPane.showMessageDialog(null, dataStructs[i] + caracteristicas[i]);
			
		}
		
//		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
		
		
		
		
		
		
		
	}
}
