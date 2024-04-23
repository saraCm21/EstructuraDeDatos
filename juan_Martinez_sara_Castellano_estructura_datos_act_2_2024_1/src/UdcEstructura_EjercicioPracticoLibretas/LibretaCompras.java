package UdcEstructura_EjercicioPracticoLibretas;

public class LibretaCompras {

	private NodoCompra inicio;
	private int size;

	public LibretaCompras() {
		this.inicio = null;
		this.size = 0;
	}
	
	public NodoCompra getInicio() {
		return inicio;
	}

	public void setInicio(NodoCompra inicio) {
		this.inicio = inicio;
	}
	
	public boolean review() {
		if (size == 0) {
			return true;
		}else {
			return false;
		}
	}

	public void addBuys(Compra compra) {

		NodoCompra newNodo = new NodoCompra(compra);
		
		if(review()) {
			inicio = newNodo;
		}else {
			NodoCompra tem = inicio;
			while (tem.getSiguiente() != null) {
				tem = tem.getSiguiente();
			}
			tem.setSiguiente(newNodo);
		}
		
		size++;
	}
	
	public void show() {
		
		NodoCompra aux = inicio;
		
		if (review()) {
			System.out.println("La lista esta vacia");
		}else {
			while (aux != null) {
				System.out.println(aux.getBuys().toString());
				aux = aux.getSiguiente();
			}
		}
			
		System.out.println("\n");
		
	}
}
