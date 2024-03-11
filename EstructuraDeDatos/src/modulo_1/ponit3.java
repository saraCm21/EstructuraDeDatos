package modulo_1;

import javax.swing.JOptionPane;

public class ponit3 {
	public static void main(String[] args) {
		
//		BUSCAR ELEMENTOS EN UN ARREGLO
		
		int length = (int) (Math.random()*10);
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
		JOptionPane.showMessageDialog(null, "La cantidad de ventas fue " + length);
		JOptionPane.showMessageDialog(null, "El total de ventas fue de " + total(ventas));
		JOptionPane.showMessageDialog(null, "El promedio de ventas fue de " + promedio(total(ventas), length));
		JOptionPane.showMessageDialog(null, "La venta mas cercana al promedio es " + nearbySale(promedio(total(ventas), length), ventas));
		JOptionPane.showMessageDialog(null, "La venta mayor fue " + mayorSale(ventas));
		JOptionPane.showMessageDialog(null, "La venta menor fue " + menorSale(ventas));
		
		
	}
	
	private static int total(int lista[]) {
	
	int sumatoria = 0;
	
	for (int i = 0; i < lista.length; i++) {
		
		sumatoria = sumatoria + lista[i];
	}
	
	return sumatoria;
	
	}
	
	private static int promedio(int total, int tamaño) {
		
		int promedio = total/tamaño;
		
		return promedio;
		
	}
	
	private static int nearbySale(int promedio, int lista[]) {

		int diferencia;
		int diferenciaMinima = (int) Double.POSITIVE_INFINITY;
		int numeroCercano = 0;
		  
		for (int i = 0; i < lista.length; i++) {
			
			diferencia = Math.abs(lista[i]- promedio);
			if (diferencia < diferenciaMinima) {
				diferenciaMinima = diferencia;
				numeroCercano = lista[i];
			}
			
		}
	
	
		return numeroCercano;
	}


	
	private static int mayorSale(int lista[]) {
		
		// ALGORIDMO DE BUSQUEDA DE VALOR MAXIMO
		
		int mayor = 0;
		
	for (int i = 0; i < lista.length; i++) {
		
		if(lista[i] > mayor) {
			mayor = lista[i];
		}
		
	}
		
		return mayor;

	}
	
	private static int menorSale(int lista[]) {
			
		//  ALGORITMO DE BURBUJA - ORDENAR DE MENOR A MAYOR, EL NUMERO MENOR ES EL PRIMER ELEMENTO DE LA LISTA
		
			Integer aux;
			 for (int i = 0; i < (lista.length-1); i++) {
				 for (int j = 0; j < (lista.length-1); j++) {
					if (lista[j] > lista[j+1] ) {
						
						aux = lista[j];
						lista[j] = lista[j+1];
						lista[j+1] = aux;
	
					}
				}
			}
			
			return lista[0];
	
		}

  }
