package UdcEstructura_AlgoritmosDeOrdenamiento;

import java.util.Random;

public class AlgoritmosDeOrdenamiento {
	
	public static void Burbuja(int[] array) {
        int length = array.length;
        
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
	
	 public static void Aleatorio(int[] array) {
	        Random random = new Random();
	        int length = array.length;
	        
	        for (int i = length - 1; i > 0; i--) {
	            int indiceAleatorio = random.nextInt(i + 1);
	            
	            int temp = array[indiceAleatorio];
	            array[indiceAleatorio] = array[i];
	            array[i] = temp;
	        }
	 }
	 
	 public static void Insercion(int[] array) {
        int length = array.length;
        
        for (int i = 1; i < length; i++) {
            int valorActual = array[i];
            int j = i - 1;
            
            while (j >= 0 && array[j] > valorActual) {
                array[j + 1] = array[j];
                j--;
            }
            
            array[j + 1] = valorActual;
        }
	 }
	 
	 public static void porSeleccion(int[] array) {
        int length = array.length;
        
        for (int i = 0; i < length - 1; i++) {
            int indiceMinimo = i;
            
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            
            int temp = array[indiceMinimo];
            array[indiceMinimo] = array[i];
            array[i] = temp;
        }
    }
	 
	 public static void ordenarPorShell(int[] array) {
        int length = array.length;
        
        for (int intervalo = length / 2; intervalo > 0; intervalo /= 2) {
            for (int i = intervalo; i < length; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= intervalo && array[j - intervalo] > temp; j -= intervalo) {
                    array[j] = array[j - intervalo];
                }
                array[j] = temp;
            }
        }
    }

}
