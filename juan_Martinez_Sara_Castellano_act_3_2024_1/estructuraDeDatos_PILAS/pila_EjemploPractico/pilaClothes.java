package pila_EjemploPractico;

import java.util.Random;

import javax.swing.ImageIcon;

public class pilaClothes {
	private Nodo inicio;
	private int size;

	public pilaClothes() {
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
	
	public boolean EMPTY() {
		if (size == 0) {
			return true;
		}else {
			return false;
		}
	}

	public void PUSH(ImageIcon icono) {

		Nodo newNodo = new Nodo(icono);
		
		if (EMPTY()) {
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
	
	public ImageIcon TOP(){

		try {

				Nodo tem = inicio;
				while (tem.getSiguiente() != null) {
					tem = tem.getSiguiente();
				}	
				
				return tem.getValor();

		} catch (Exception e) {
		}
		
		
		return null;
	}
	
	public void POP() {
		
		try {
			Nodo aux = inicio;
			int index = size - 2;
			
			if (aux.getSiguiente() == null) {
				inicio = null;
				size--;
			}else {
				for (int i = 0; i < index && aux != null; i++) {
					aux = aux.getSiguiente();
				}
				
				aux.setSiguiente(null);
				size--;
			}
		} catch (Exception e) {
			
		}
	}
		
	public void aleatorio() {
			
			if(EMPTY() != true) {
				Random random = new Random();
				int s = getSize(); 
				
				
				for(int i = 0; i < (s-1); i++) {
					int p1 = random.nextInt(s);
					int p2 = random.nextInt(s);
					
					change(p1, p2);

				}
			}
	}
		
	public Nodo optenerNodo(int position) {
		if (position < 0) {
			return null;
		}
		
		Nodo aux = inicio;
		int contador = 0;
		
		while (contador < position) {
			aux = aux.getSiguiente();
			contador++;
		}
		
		return aux;
	}
	
	public void change(int p1, int p2) {
		
		if (p1 == p2) {
			return;
		}
		
		int min = Math.min(p1, p2);
		int max = Math.max(p1, p2);
		
		Nodo nodoMin = optenerNodo(min);
		Nodo nodoMax = optenerNodo(max);
		
		ImageIcon tem = nodoMin.getValor();
		nodoMin.setValor(nodoMax.getValor());
		nodoMax.setValor(tem);
	}
	

	

}
