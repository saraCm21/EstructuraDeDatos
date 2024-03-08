package modulo_1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ponit3 {
	public static void main(String[] args) {
		
//		BUSCAR ELEMENTOS EN UN ARREGLO
		
		ArrayList<Integer> ventas = new ArrayList<>();
		int contador = 0;
		int respuesta;
		StringBuilder mensaje = new StringBuilder();
		
		do {
			
			ventas.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de la venta")));
			respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);
			contador++;
			
		} while (respuesta == JOptionPane.YES_OPTION);	
		
		
		int contador2 = 1;
		
		mensaje.append("Lista de ventas").append("\n");
		for (Integer elemento : ventas) {
		    mensaje.append(contador2 + ". ").append(elemento).append("\n");
		    contador2++;
		}
		
		JOptionPane.showMessageDialog(null, mensaje.toString(), "Contenido del ArrayList", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "La cantidad de ventas fue " + contador);
		JOptionPane.showMessageDialog(null, "El total de ventas fue de " + total(ventas));
		JOptionPane.showMessageDialog(null, "El promedio de ventas fue de " + promedio(ventas));
		JOptionPane.showMessageDialog(null, "La venta mas cercana al promedio es " + nearbySale(promedio(ventas), ventas));
		JOptionPane.showMessageDialog(null, "La venta mayor fue " + mayorSale(ventas));
		JOptionPane.showMessageDialog(null, "La venta menor fue " + menorSale(ventas));
		
		
	}
	
	private static int mayorSale(ArrayList<Integer> lista) {
		
		// ALGORIDMO DE BUSQUEDA DE VALOR MAXIMO
		
		Integer mayor = 0;
		int contador = 0;
		
		for (@SuppressWarnings("unused") Integer integer : lista) {
			if (mayor < lista.get(contador)) {
				mayor = lista.get(contador);
			}
			
			contador++;
		}
		
		return mayor;

	}
	
	private static int menorSale(ArrayList<Integer> lista) {
			
		//  ALGORITMO DE BURBUJA - ORDENAR DE MENOR A MAYOR, EL NUMERO MENOR ES EL PRIMER ELEMENTO DE LA LISTA
		
			Integer aux;
			 for (int i = 0; i < (lista.size()-1); i++) {
				 for (int j = 0; j < (lista.size()-1); j++) {
					if (lista.get(j) > lista.get(j+1) ) {
						
						aux = lista.get(j);
						lista.set(j, lista.get(j+1));
						lista.set(j+1, aux);
	
					}
				}
			}
			
			return lista.get(0);
	
		}
	
	private static int total(ArrayList<Integer> lista) {
		
		int sumatoria = 0;
		int contador = 0;
		
		for (@SuppressWarnings("unused") Integer integer : lista) {
			
			sumatoria = sumatoria + lista.get(contador);
			contador++;
			
		}
		
		return sumatoria;

	}
	
	private static int promedio(ArrayList<Integer> lista) {
			
			int sumatoria = 0;
			int contador = 0;
			int promedio;
			
			for (@SuppressWarnings("unused") Integer integer : lista) {
				
				sumatoria = sumatoria + lista.get(contador);
				contador++;
				
			}
			
			promedio = sumatoria/lista.size();
			return promedio;
	
		}
	
	private static Integer nearbySale(int promedio,ArrayList<Integer> lista) {

		int diferencia;
		int diferenciaMinima = (int) Double.POSITIVE_INFINITY;
		int numeroCercano = 0;
		  
		for (int i = 0; i < lista.size(); i++) {
			
			diferencia = Math.abs(lista.get(i)- promedio);
			if (diferencia < diferenciaMinima) {
				diferenciaMinima = diferencia;
				numeroCercano = lista.get(i);
			}
			
		}
	
	
		return numeroCercano;
	}

}
