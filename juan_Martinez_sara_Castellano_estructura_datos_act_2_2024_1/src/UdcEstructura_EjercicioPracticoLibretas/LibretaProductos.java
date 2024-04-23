package UdcEstructura_EjercicioPracticoLibretas;

public class LibretaProductos {

	private NodoProductos inicio;
	private int size;

	public LibretaProductos() {
		this.inicio = null;
		this.size = 0;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
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
	
	public Productos getProduc(int codigo) {
		
		NodoProductos aux = inicio;
		
		for (int i = 0; i <= size && aux != null; i++) {
			
			if (aux.getProductos().getCodigo() == codigo && aux != null) {
				return aux.getProductos();
			}
			
			aux = aux.getSiguiente();
		}
		return null;
	}

	public void addProduct(Productos productos) {

		NodoProductos newNodo = new NodoProductos(productos);
		
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
