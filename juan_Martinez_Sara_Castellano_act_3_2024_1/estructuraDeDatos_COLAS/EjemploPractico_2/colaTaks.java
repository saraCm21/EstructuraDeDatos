package EjemploPractico_2;

public class colaTaks {
	protected Nodo inicio;
	protected int size;

	public colaTaks() {
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
	
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}else {
			return false;
		}
	}

	public void Encolar(String dato) {

		Nodo newNodo = new Nodo(dato);
		
		if (isEmpty()) {
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
	
	public String Frente (){

		try {
			Nodo tem = inicio;
			return tem.getValor();
		} catch (Exception e) {
			
		}
		
		return null;
	}
	
	public void Desencolar(){
		Nodo aux = inicio;
		
		try {

			if (aux.getSiguiente() == null) {
				inicio = null;
				size--;
			}else {
				inicio = inicio.getSiguiente();
				size--;
			}
		} catch (Exception e) {
			
		}
	}
	
	public void show() {
		
		
		if (isEmpty()) {
			System.out.println("La cola esta vacia");
		}else {
			Nodo aux = inicio;
			
			while (aux != null) {
				System.out.print(aux.getValor() + " - ");
				aux = aux.getSiguiente();
			}
			
			
		}
			
		System.out.println("\n");
		
	}
}
