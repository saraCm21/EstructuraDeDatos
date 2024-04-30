package colas_FIFO;

import pila_ListaManual.Nodo;

public class ModeloColaFIFO {
	
	protected Nodo inicio;
	protected int size;

	public ModeloColaFIFO() {
		this.inicio = null;
		this.size = 0;
	}
	
	public int getSize() { 
		return size;
	}
	
	public Nodo getInicio() {
		return inicio;
	}

	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}
	
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}else {
			return false;
		}
	}

	public void Encolar(int dato) {

		Nodo newNodo = new Nodo(dato);
		
		if (isEmpty()) {
			inicio = newNodo;
		}else {
			Nodo tem = inicio;
			while (tem.getSiguiente() != null) {
				tem = tem.getSiguiente();
			}
			
			tem.setSiguiente(newNodo);
		}
		
		size++;
	}
	
	public void Frente (){

		if (isEmpty()) {
			System.out.println("La cola esta vacia");
		}else {
			Nodo tem = inicio;
			System.out.println("El elemento superior es: " + tem.getValor());
		}
	}
	
	public void Desencolar(){
		Nodo aux = inicio;
		
		try {

			if (aux.getSiguiente() == null) {
				System.out.println("El elemento elimidado fue: " + aux.getValor());
				inicio = null;
				size--;
			}else {
				System.out.println("El elemento elimidado fue: " + inicio.getValor());
				inicio = inicio.getSiguiente();
				size--;
			}
		} catch (Exception e) {
			System.out.println("La cola esta vacia");
		}
	}
	
	public void show() {
		
		
		if (isEmpty()) {
			System.out.println("La cola esta vacia");
		}else {
			Nodo aux = inicio;
			
			while (aux != null) {
				System.out.print(aux.getValor() + " - ");
				aux = aux.getSiguiente();
			}
			
			
		}
			
		System.out.println("\n");
		
	}

}
