package UdcEstructura_EjercicioPracticoLibretas;

public class NodoProductos {
	
	private Productos productos;
	private NodoProductos siguiente;
	
	public NodoProductos() {
		this.productos = null;
		this.siguiente = null;
	}

	public NodoProductos(Productos productos) {
		super();
		this.productos = productos;
		this.siguiente = null;
	}

	public Productos getProductos() {
		return productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	}

	public NodoProductos getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoProductos siguiente) {
		this.siguiente = siguiente;
	}
	
	
	

}
