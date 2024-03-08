package modulo_1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class point2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> ventas = new ArrayList<>();
		int contador = 0;
		int total = 0;
		int respuesta;
		int promedio;
		StringBuilder mensaje = new StringBuilder();
		
		do {
			
			ventas.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de la venta")));
			respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);
			total = total + ventas.get(contador);
			contador++;
			
		} while (respuesta == JOptionPane.YES_OPTION);	
		
		promedio = total/contador;
		
		contador = 1;
		
		mensaje.append("Lista de ventas").append("\n");
		for (Integer elemento : ventas) {
		    mensaje.append(contador + ". ").append(elemento).append("\n");
		    contador++;
		}
		
		JOptionPane.showMessageDialog(null, mensaje.toString(), "Contenido del ArrayList", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "La centidad de ventas fue " + contador);
		JOptionPane.showMessageDialog(null, "El total de ventas fue de " + total);
		JOptionPane.showMessageDialog(null, "El promedio de ventas fue de " + promedio);
		
		
	}
}
