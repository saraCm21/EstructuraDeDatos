package UdcEstructura_EjercicioPracticoLibretas;

public class LibretaClientes {
	
	private NodoCliente inicio;
	private int size;

	public LibretaClientes() {
		this.inicio = null;
		this.size = 0;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public NodoCliente getInicio() {
		return inicio;
	}

	public void setInicio(NodoCliente inicio) {
		this.inicio = inicio;
	}
	
	public boolean review() {
		if (size == 0) {
			return true;
		}else {
			return false;
		}
	}
	

	public void addCostumer(Cliente cliente) {

		NodoCliente newNodo = new NodoCliente(cliente);
		
		if(review()) {
			inicio = newNodo;
		}else {
			NodoCliente tem = inicio;
			while (tem.getSiguiente() != null) {
				tem = tem.getSiguiente();
			}
			tem.setSiguiente(newNodo);
		}
		
		size++;
	}
	
	 public boolean reviewCostumer(String cedula) {
			
			NodoCliente aux = inicio;
			
			for (int i = 0; i <= size && aux != null; i++) {
				
				if (aux.getCostumer().getCedula().equalsIgnoreCase(cedula) && aux != null) {
					return true;
				}
				
				aux = aux.getSiguiente();
			}
			return false;
		}
	 
	 public Cliente getCostumer(String cedula) {
			
			NodoCliente aux = inicio;
			
			for (int i = 0; i <= size && aux != null; i++) {
				
				if (aux.getCostumer().getCedula().equalsIgnoreCase(cedula) && aux != null) {
					return aux.getCostumer();
				}
				
				aux = aux.getSiguiente();
			}
			return null;
		}
	
	public void show() {
		
		NodoCliente aux = inicio;
		
		if (review()) {
			System.out.println("La lista esta vacia");
		}else {
			while (aux != null) {
				System.out.println(aux.getCostumer().toString());
				aux = aux.getSiguiente();
			}
		}
			
		System.out.println("\n");
		
	}

}
