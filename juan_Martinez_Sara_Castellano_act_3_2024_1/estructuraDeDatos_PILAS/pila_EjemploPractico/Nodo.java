package pila_EjemploPractico;

import javax.swing.ImageIcon;

public class Nodo {
	private ImageIcon valor;
	private Nodo siguiente;
	
	public Nodo() {
		this.valor = null;
		this.siguiente = null;
	}

	public Nodo(ImageIcon valor) {
		super();
		this.valor = valor;
		this.siguiente = null;
	}

	public ImageIcon getValor() {
		return valor;
	}

	public void setValor(ImageIcon valor) {
		this.valor = valor;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
}
