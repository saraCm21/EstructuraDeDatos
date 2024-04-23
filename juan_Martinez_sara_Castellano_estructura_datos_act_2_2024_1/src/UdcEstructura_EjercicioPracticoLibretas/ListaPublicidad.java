package UdcEstructura_EjercicioPracticoLibretas;

public class ListaPublicidad {
	
	private NodoProductos inicio;
	private int size;

	public ListaPublicidad() {
		this.inicio = null;
		this.size = 0;
	}
	
	public NodoProductos getInicio() {
		return inicio;
	}

	public void setInicio(NodoProductos inicio) {
		this.inicio = inicio;
	}
	
	public boolean review() {
		if (size == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean reviewProduc(int codigo) {
		
		NodoProductos aux = inicio;
		
		for (int i = 0; i <= size && aux != null; i++) {
			
			if (aux.getProductos().getCodigo() == codigo && aux != null) {
				return true;
			}
			
			aux = aux.getSiguiente();
		}
		return false;
	}

	public void addProduct(LibretaProductos libreta) {

		NodoProductos aux = libreta.getInicio();
		
		for (int i = 0; i < libreta.getSize() && aux != null; i++) {
			
			if (aux.getProductos().getUnidadesExistencia() > 0) {
				NodoProductos newNodo = new NodoProductos(aux.getProductos());
				
				if(review()) {
					inicio = newNodo;
				}else {
					NodoProductos tem = inicio;
					while (tem.getSiguiente() != null) {
						tem = tem.getSiguiente();
					}
					tem.setSiguiente(newNodo);
				}
				
				size++;
				aux = aux.getSiguiente();
			}
		}
	}

	
	public void show() {
		
		NodoProductos aux = inicio;
		
		if (review()) {
			System.out.println("La lista esta vacia");
		}else {
			while (aux != null) {
				System.out.println(aux.getProductos().toString());
				aux = aux.getSiguiente();
			}
		}
			
		System.out.println("\n");
		
	}

}
