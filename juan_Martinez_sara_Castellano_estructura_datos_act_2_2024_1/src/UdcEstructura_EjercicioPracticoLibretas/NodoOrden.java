package UdcEstructura_EjercicioPracticoLibretas;

public class NodoOrden {

	private Orden orden;
	private NodoOrden siguiente;
	
	public NodoOrden() {
		this.orden = null;
		this.siguiente = null;
	}

	public NodoOrden(Orden orden) {
		super();
		this.orden = orden;
		this.siguiente = null;
	}

	public Orden getOrder() {
		return orden;
	}

	public void setOrder(Orden orden) {
		this.orden = orden;
	}

	public NodoOrden getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoOrden siguiente) {
		this.siguiente = siguiente;
	}
}
