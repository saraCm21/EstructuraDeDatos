package pila_ListaManual;

public class ModeloPila {
	
	private Nodo inicio;
	private int size;

	public ModeloPila() {
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
	
	public boolean EMPTY() {
		if (size == 0) {
			return true;
		}else {
			return false;
		}
	}

	public void PUSH(int dato) {

		Nodo newNodo = new Nodo(dato);
		
		if (EMPTY()) {
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
	
	public void TOP (){

		if (EMPTY()) {
			System.out.println("La pila esta vacia");
		}else {
			Nodo tem = inicio;
			while (tem.getSiguiente() != null) {
				tem = tem.getSiguiente();
			}
			
			System.out.println("El elemento superior es: " + tem.getValor());
			
		}
	}
	
	public void POP() {
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

	}
	public void show() {
		
		int index = size;
		
		if (EMPTY()) {
			System.out.println("La pila esta vacia");
		}else {
			for (int i = 0; i < size; i++) {
				Nodo aux = inicio;
				int now = 1;
				
				while (aux != null) {
					if (now == index) {
						System.out.print(aux.getValor() + " - ");
					}
					aux = aux.getSiguiente();
					now++;
				}
				
				index--;
			}
			
		}
			
		System.out.println("\n");
		
	}
}
