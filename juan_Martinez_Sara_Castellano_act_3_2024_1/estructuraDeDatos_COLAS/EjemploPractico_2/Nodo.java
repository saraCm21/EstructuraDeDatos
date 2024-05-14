package EjemploPractico_2;

public class Nodo {
	private String valor;
	private Nodo siguiente;
	
	public Nodo() {
		this.valor = null;
		this.siguiente = null;
	}

	public Nodo(String valor) {
		super();
		this.valor = valor;
		this.siguiente = null;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
}
