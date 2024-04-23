package UdcEstructura_EjercicioPracticoLibretas;

public class NodoCompra {
	
	private Compra compra;
	private NodoCompra siguiente;
	
	public NodoCompra() {
		this.compra = null;
		this.siguiente = null;
	}

	public NodoCompra(Compra compra) {
		super();
		this.compra = compra;
		this.siguiente = null;
	}

	public Compra getBuys() {
		return compra;
	}

	public void setBuys(Compra compra) {
		this.compra = compra;
	}

	public NodoCompra getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoCompra siguiente) {
		this.siguiente = siguiente;
	}
	

}
