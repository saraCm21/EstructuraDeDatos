package pila_ColaLIFO;

import colas_FIFO.ModeloColaFIFO;
import pila_ListaManual.Nodo;

public class ModeloPila_colaLIFO extends ModeloColaFIFO{
	
	
	public void Encolar(int dato) {

		Nodo newNodo = new Nodo(dato);
		
		if (isEmpty()) {
			inicio = newNodo;
		}else {
			Nodo tem = inicio;
			inicio = newNodo;
			inicio.setSiguiente(tem);
		}
		
		size++;
	}

}
