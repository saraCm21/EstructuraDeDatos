package coleccionesEnJava;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.List;

public class Diccionario<K, V> extends Dictionary<K, V>  {
    private List<K> keys;
    private List<V> values;
 
    public Diccionario() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }   
 
    public int size() {
        return keys.size();
    }

    public boolean isEmpty() {
        return keys.isEmpty();
    }

    public V getValue(Object key) {
        int index = keys.indexOf(key);
        if (index == -1) {
            return null;
        }
        return values.get(index);
    }
    
    public K getKey(Object value) {
        int index = values.indexOf(value);
        if (index == -1) {
            return null;
        }
        return keys.get(index);
    }

    public V put(K key, V value) {
        int index = keys.indexOf(key);
        if (index == -1) {
            keys.add(key);
            values.add(value);
            return null;
        } else {
            return values.set(index, value);
        }
    }

    public V remove(Object key) {
        int index = keys.indexOf(key);
        if (index == -1) {
            return null;
        } else {
            keys.remove(index);
            return values.remove(index);
        }
    }
    
    public void show() {
        if (this.isEmpty()) {
            System.out.println("El diccionario esta vacio");
        } else {
            System.out.println("DICCIONARIO");
            for (int i = 0; i < keys.size(); i++) {
                System.out.println(keys.get(i) + ": " + values.get(i));
            }
        }
    }

	@Override
	public Enumeration<K> keys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enumeration<V> elements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}



}



