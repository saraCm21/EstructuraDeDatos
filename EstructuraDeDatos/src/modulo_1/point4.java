package modulo_1;

import java.util.Random;
import javax.swing.JOptionPane;

public class point4 {
	public static void main(String[] args) {
		
		int length = (int) ((Math.random()*10)+2);
		int ventas[] = new int[length];
		StringBuilder mensaje = new StringBuilder();
		
		JOptionPane.showMessageDialog(null, "Ingrese el valor de las " + length + " ventas");
		
		for (int i = 0; i < ventas.length; i++) {
			
			ventas[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la venta " + (i+1)));
			
		}
		
		
		int contador2 = 1;
		mensaje.append("Lista de ventas").append("\n");
		for (Integer elemento : ventas) {
		    mensaje.append(contador2 + ". ").append(elemento).append("\n");
		    contador2++;
		}
		
		JOptionPane.showMessageDialog(null, mensaje.toString(), "Contenido del arreglo", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, falling(ventas).toString(), "Contenido del arreglo", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, upward(ventas).toString(), "Contenido del arreglo", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, des(ventas).toString(), "Contenido del arreglo", JOptionPane.INFORMATION_MESSAGE);
		evenOdd(ventas);
	}
 
	private static StringBuilder falling(int lista[]) {
		
//		ORDENAMIENTO POR INSERCION
		
		StringBuilder mensaje = new StringBuilder();

        for (int i = 1; i < lista.length; i++) {
            int valorActual = lista[i];
            int j = i - 1;

            while (j >= 0 && lista[j] > valorActual) {
                lista[j + 1] = lista[j];
                j--;
            }

           lista[j + 1] = valorActual;
        }
		
		mensaje.append("Lista de ventas ascendente ordenada").append("\n");
		for (Integer elemento : lista) {
		    mensaje.append(elemento).append("\n");
		}
		
		return mensaje;
	}
	
	private static StringBuilder upward(int lista[]) {

		StringBuilder mensaje = new StringBuilder();
		int aux;
		
		 for (int i = 0; i < (lista.length-1); i++) {
			 for (int j = 0; j < (lista.length-1); j++) {
				if (lista[j+1] > lista[j] ) {
					
					aux = lista[j+1];
					lista[j+1] = lista[j];
					lista[j] = aux;

				}
			}
		}
		
		mensaje.append("Lista de ventas descendente ordenada").append("\n");
		for (Integer elemento : lista) {
		    mensaje.append(elemento).append("\n");
		}
		
		return mensaje;
	}
	
	private  static StringBuilder des(int lista[]) {
		
		Random random = new Random();
		StringBuilder mensaje = new StringBuilder();
		
		int aux;
		
		 for (int i = 0; i < (lista.length-1); i++) {
			 for (int j = 0; j < (lista.length-1); j++) {
				if (lista[j+1] > lista[j] ) {
					
					aux = lista[j+1];
					lista[j+1] = lista[j];
					lista[j] = aux;

				}
			}
		}

        for (int i = lista.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temporal = lista[i];
            lista[i] = lista[j];
            lista[j] = temporal;
        }
		
        mensaje.append("Lista de ventas desordenada").append("\n");
		for (Integer elemento : lista) {
		    mensaje.append(elemento).append("\n");
		}
		
        return mensaje;
		
	}
	
	private static void evenOdd(int lista[]) {
		
		int even = 0; 
		int odd = 0; 
		int arrayEven[];
		int arrayOdd[];
		int contador = 0;
		int aux;
		StringBuilder mensaje = new StringBuilder();

		
		for(int i = 0; i < lista.length; i++) {
			
			if(lista[i] % 2 == 0) {
				even++;
			}else {
				odd++;
			}
		}
		
		arrayEven = new int[even];
		arrayOdd = new int[odd];
		
		for(int i = 0; i < lista.length; i++) {
			
			if(lista[i] % 2 == 0) {
				arrayEven[contador] = lista[i];
				contador++;
			}
		}
		
		for (int i = 0; i < (arrayEven.length-1); i++) {
			 for (int j = 0; j < (arrayEven.length-1); j++) {
				if (arrayEven[j] > arrayEven[j+1] ) {
					
					aux = arrayEven[j];
					arrayEven[j] = arrayEven[j+1];
					arrayEven[j+1] = aux;

				}
			}
		}
		
		contador = 0;
		
		for(int i = 0; i < lista.length; i++) {
			
			if(lista[i] % 2 != 0) {
				arrayOdd[contador] = lista[i];
				contador++;
			}
		}
		
		for (int i = 0; i < (arrayOdd.length-1); i++) {
			 for (int j = 0; j < (arrayOdd.length-1); j++) {
				if (arrayOdd[j] > arrayOdd[j+1] ) {
					
					aux = arrayOdd[j];
					arrayOdd[j] = arrayOdd[j+1];
					arrayOdd[j+1] = aux;

				}
			}
		}
		
		for (int i = 0; i < arrayEven.length; i++) {
			lista[i] = arrayEven[i];
		}
		
		for (int i = 0; i < arrayOdd.length; i++) {
			int index = i + even;
			lista[index] = arrayOdd[i];
		}

		 mensaje.append("Lista de ventas ordenada en pares e impares").append("\n");
			for (Integer elemento : lista) {
			    mensaje.append(elemento).append("\n");
			}
			
		JOptionPane.showMessageDialog(null, mensaje.toString(), "Contenido del arreglo", JOptionPane.INFORMATION_MESSAGE);

		 
	}

}
