package UdcEstructura_ModeloDeAlgoritmoDeLista;

import java.util.Random;

public class modeloListaSimple {
	
	private Nodo inicio;
	private int size;

	public modeloListaSimple() {
		this.inicio = null;
		this.size = 0;
	}
	
	
	public int getSize() {
		return size;

	}
	
	public Nodo getInicio() {
		return inicio;
	}

	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}
	
	public boolean review() {
		if (size == 0) {
			return true;
		}else {
			return false;
		}
	}

	public void addValue(int dato) {

		Nodo newNodo = new Nodo(dato);
		
		if(review()) {
			inicio = newNodo;
		}else {
			Nodo tem = inicio;
			while (tem.getSiguiente() != null) {
				tem = tem.getSiguiente();
			}
			tem.setSiguiente(newNodo);
		}
		
		size++;
	}
	
	public int getValue(int position) throws Exception {

		int value; 
		
		if (position >= 0 && position < size) {
			if (position == 0) {
				value = inicio.getValor();
			}else {
				Nodo aux = inicio;
				
				for(int i = 0; i < position; i++) {
					aux = aux.getSiguiente();
				}
				 
				value = aux.getValor(); 
			}
		}else {
			throw new Exception("La posicion es inexistente");
		}
	
		return value;
	
	}
	
	public int getPosition(int value) throws Exception {
		
		int contador = 0;
		Nodo aux = inicio;
		boolean review = false;
		
		for(int i = 0; i < size && value != aux.getValor(); i++ ) {
			
			if(value == aux.getValor()) {
				review = true;
				break;
			}
			
			aux = aux.getSiguiente();
		}
		
		if(review) {
			return contador;
		}else {
			throw new Exception("Valor no encontrado");
		}
		
	}

	public void delete(int value) {
		
		Nodo aux = inicio;
		
		if (value == inicio.getValor()) {
			inicio = aux.getSiguiente();
		}else {
			for(int i = 0; i < size && value != aux.getSiguiente().getValor(); i++){
				aux = aux.getSiguiente();
			}
			
			Nodo siguiente = aux.getSiguiente();
			aux.setSiguiente(siguiente.getSiguiente());
		}
		
		

	}
	public void show() {
		
		Nodo aux = inicio;
		
		if (review()) {
			System.out.println("La lista esta vacia");
		}else {
			while (aux != null) {
				System.out.print(aux.getValor() + " - ");
				aux = aux.getSiguiente();
			}
		}
			
		System.out.println("\n");
		
	}
	
//	ALGORITMOS DE ORDENAMIENTO
	
//	ORDENAMIENTO DE BURBUJA
	
	public void burbuja() {
		
		if(review()) {
			System.out.println("La lista se encuentra vacia");
			return;
		}
		
		boolean change;
		
		do {
			
			Nodo aux = inicio;
			change = false;
			
			do {
				Nodo next = aux.getSiguiente();
				if(next!= null && aux.getValor() > next.getValor()) {
					int tem = aux.getValor();
					aux.setValor(next.getValor());
					next.setValor(tem);
					
					change = true;
				}
				
				aux = next;
			}while(aux != inicio && aux != null);
			
		} while (change);

	}
	
	
//	ORDENAMIENTO ALEATORIO
	
	public void aleatorio() {
		
		if(review() != true) {
			Random random = new Random();
			int s = getSize(); 
			
			
			for(int i = 0; i < (s-1); i++) {
				int p1 = random.nextInt(s);
				int p2 = random.nextInt(s);
				
				change(p1, p2);

			}
		}
		
	}
	
	public Nodo optenerNodo(int position) {
		if (position < 0) {
			return null;
		}
		
		Nodo aux = inicio;
		int contador = 0;
		
		while (contador < position) {
			aux = aux.getSiguiente();
			contador++;
		}
		
		return aux;
	}
	
	public void change(int p1, int p2) {
		
		if (p1 == p2) {
			return;
		}
		
		int min = Math.min(p1, p2);
		int max = Math.max(p1, p2);
		
		Nodo nodoMin = optenerNodo(min);
		Nodo nodoMax = optenerNodo(max);
		
		int tem = nodoMin.getValor();
		nodoMin.setValor(nodoMax.getValor());
		nodoMax.setValor(tem);
	}
	
//	ORDENAMIENTO POR SELECCION 
	
	public void selectionSort() {
		
		int size = getSize();
	
		if (!review()) {
			Nodo actual = inicio;
			
			for (int i = 0; i < (size -1); i++) {
				
				Nodo max = actual;
				Nodo next = actual.getSiguiente();
				
				for (int j = 0; j < size  && next != null; j++) {
					if (max.getValor() < next.getValor()  && next != null) {
						max = next;
					}
					
					next = next.getSiguiente();
				}
				
				if (max != actual) {
					 int tem = actual.getValor();
					 actual.setValor(max.getValor());
					 max.setValor(tem);
				}
				
				actual = actual.getSiguiente();
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
