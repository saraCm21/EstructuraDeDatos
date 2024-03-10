package modulo_1;

import javax.swing.JOptionPane;

public class point2 {
	public static void main(String[] args) {
		
// 		MANIPULAR ELEMETOS DENTRO DE UN ARREGLO
		
		int length = (int) (Math.random()*10);
		int ventas[] = new int[length];
		int total = 0;
		int promedio;
		StringBuilder mensaje = new StringBuilder();
		
		JOptionPane.showMessageDialog(null, "Ingrese el valor de las " + length + " ventas");
		
		for (int i = 0; i < ventas.length; i++) {
			
			ventas[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la venta " + (i+1)));
			total = total + ventas[i];
			
		}
		
		promedio = total/length;
		
		int contador2 = 1;
		mensaje.append("Lista de ventas").append("\n");
		for (Integer elemento : ventas) {
		    mensaje.append(contador2 + ". ").append(elemento).append("\n");
		    contador2++;
		}
		
		JOptionPane.showMessageDialog(null, mensaje.toString(), "Contenido del arreglo", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "La cantidad de ventas fue " + length);
		JOptionPane.showMessageDialog(null, "El total de ventas fue de " + total);
		JOptionPane.showMessageDialog(null, "El promedio de ventas fue de " + promedio);
		
		
	}
}
