package UdcEstructura_EjercicioPracticoLibretas;

public class NodoCliente {
	
	private Cliente cliente;
	private NodoCliente siguiente;
	
	public NodoCliente() {
		this.cliente = null;
		this.siguiente = null;
	}

	public NodoCliente(Cliente cliente) {
		super();
		this.cliente = cliente;
		this.siguiente = null; 
	}

	public Cliente getCostumer() {
		return cliente;
	}

	public void setCostumer(Cliente cliente) {
		this.cliente = cliente;
	}

	public NodoCliente getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoCliente siguiente) {
		this.siguiente = siguiente;
	}

}
