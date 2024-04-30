package cola_LIFO;

import colas_FIFO.ModeloColaFIFO;
import pila_ListaManual.Nodo;

public class ModeloColaLIFO extends ModeloColaFIFO{

	public ModeloColaLIFO() {
		super();
	}
	
	public void Desencolar(){
		
		
		try {
			Nodo aux = inicio;
			int index = size - 2;
			
			if (aux.getSiguiente() == null) {
				System.out.println("El elemento elimidado fue: " + aux.getValor());
				inicio = null;
				size--;
			}else {
				for (int i = 0; i < index && aux != null; i++) {
					aux = aux.getSiguiente();
				}
				
				System.out.println("El elemento elimidado fue: " + aux.getSiguiente().getValor());
				aux.setSiguiente(null);
				size--;
			}
		} catch (Exception e) {
			System.out.println("La cola esta vacia");
		}

	}
	
	public void Frente (){

		if (isEmpty()) {
			System.out.println("La cola esta vacia");
		}else {
			Nodo tem = inicio;
			while (tem.getSiguiente() != null) {
				tem = tem.getSiguiente();
			}
			
			System.out.println("El elemento inferior es: " + tem.getValor());
			
		}
	}
	
	
	
}
