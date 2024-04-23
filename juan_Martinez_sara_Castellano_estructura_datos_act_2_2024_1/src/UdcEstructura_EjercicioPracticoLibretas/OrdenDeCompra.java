package UdcEstructura_EjercicioPracticoLibretas;

public class OrdenDeCompra {
	private NodoOrden inicio;
	private int size;

	public OrdenDeCompra() {
		this.inicio = null;
		this.size = 0;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public NodoOrden getInicio() {
		return inicio;
	}

	public void setInicio(NodoOrden inicio) {
		this.inicio = inicio;
	}
	
	public boolean review() {
		if (size == 0) {
			return true;
		}else {
			return false;
		}
	}
	

	public void addOrder(Orden orden) {

		NodoOrden newNodo = new NodoOrden(orden);
		
		if(review()) {
			inicio = newNodo;
		}else {
			NodoOrden tem = inicio;
			while (tem.getSiguiente() != null) {
				tem = tem.getSiguiente();
			}
			tem.setSiguiente(newNodo);
		}
		
		size++;
	}
	
	
	public void show() {
		
		NodoOrden aux = inicio;
		
		if (review()) {
			System.out.println("La lista esta vacia");
		}else {
			while (aux != null) {
				System.out.println(aux.getOrder().toString());
				aux.getOrder().getListaProductos().show();
				aux = aux.getSiguiente();
			}
		}
			
		System.out.println("\n");
	}
}

