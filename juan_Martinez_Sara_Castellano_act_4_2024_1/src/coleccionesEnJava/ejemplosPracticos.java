package coleccionesEnJava;

import java.time.LocalDate;
import java.util.*;

public class ejemplosPracticos {

	public static void main(String[] args) {

		Diccionario();
		Hashtable();
		Vector();
		Enumeration();
		Collections();
		Array();
		List();
		ArrayList();
		LinkedList();
		set();
		SortedSet();
		HashSet();
		TreeSet();
		Map_HashMap();
		TreeMap();
		LinkedHashMap();
	}

	public static void Diccionario() {
		System.out.println();
		System.out.println("*** EJEMPLO PRACTICO DE LA CLASE Dictionary ***");

//		A CONTINUACION TENEMOS UN EJEMPLO EN EL QUE PODEMOS VER COMO SE IMPLEMENTA LA CLASE Dictionary
//		EN ESTA CASO IMAGINEMOS QUE QUEREMOS ORDENAR UNA PEQUEÑA BIBLIOTECA QUE TENEMOS EN CASA USANDO 
//		UN CODIGO QUE INDICA LA UBICACION Y EL GENERO, Y EL NOMBRE DEL LIBRO. 

		Diccionario<String, String> dictionary = new Diccionario<>();
		String[] listaCodigos = { "F1C1-RO", "F2C1-CF", "F3C2-FA", "F4C2-CO", "F5C2-AC" };
		String[] listaNombres = { "A dos metros de ti", "Endgame", "Duna", "Como amigos", "Linea de fuego" };

//		AGREGAR ELEMENTOS AL DICCIONARIO 
		dictionary.put(listaCodigos[0], listaNombres[0]);
		dictionary.put(listaCodigos[1], listaNombres[1]);
		dictionary.put(listaCodigos[2], listaNombres[2]);
		dictionary.put(listaCodigos[3], listaNombres[3]);
		dictionary.put(listaCodigos[4], listaNombres[4]);

//		BUSCAR UN VALOR A TRAVES DE UNA CLAVE
		String value = dictionary.getValue("F1C1-RO");
		System.out.println("El libro que esta buscando se llama: " + value);

		String value2 = dictionary.getValue("F5C2-AC");
		System.out.println("El libro que esta buscando se llama: " + value2);

//		BUSCAR UNA CLAVE A TRAVES DE UN VALOR
		String key = dictionary.getKey("Como amigos");
		System.out.println("El codigo del libro que ingreso es: " + key);

		String key2 = dictionary.getKey("Endgame");
		System.out.println("El codigo del libro que ingreso es: " + key2);

//		ELIMINAR UN LIBRO DE LA BIBLIOTECA 
		String element = "F1C1-RO";
		System.out.println("El elemento que quiere renover es: " + element + " - " + dictionary.getValue("F1C1-RO"));
		dictionary.remove(element);

//		MOSTRAR TODO EL DICCIONARIO DE LA BIBLIOTECA
		dictionary.show();

	}

	private static void Hashtable() {
		System.out.println();
		System.out.println("*** EJEMPLO PRACTICO DE LA CLASE Hashtable ***");

//		A CONTINUACION TENEMOS UN EJEMPLO EN EL QUE PODEMOS VER COMO SE IMPLEMENTA LA SUBCLASE Hashtable DE LA CLASE Dictionary
//		VAMOS A IMPLEMENTAR EL MISMO EJEMPLO ANTERIOR DE ORGANIZAR LOS LIBROS DE UNA BIBLIOTECA PERO AHORA USADO LA CLASE Hashtable
//		ESTO PORQUE LA CLASE Dictionary ES UNA CLASE ABSTRACTA POR LO QUE PODEMOS USAR Dictionary A TRAVES DE LA CLASE Hashtable 

//		CREAMOS UN NUEVO OBJETO DE LA CLASE
		Dictionary<String, String> diccionario = new Hashtable<>();

//		AGREGAMOS CLAVES Y VALORES AL DICCIONARIO
		diccionario.put("F1C1-RO", "A dos metros de ti");
		diccionario.put("F2C1-CF", "Endgame");
		diccionario.put("F3C2-FA", "Duna");
		diccionario.put("F4C2-CO", "Como amigos");
		diccionario.put("F5C2-AC", "Linea de fuego");

//		PARA OBTENER UN VALOR A TRAVES DE UNA CLAVE
		String value = diccionario.get("F3C2-FA");
		System.out.println("El nombre/valor del codigo ingresado es: " + value);

//		PARA ELIMINAR UN ELEMETO DEL DICCIONARIO
		System.out.println("El elemento a borrar es F5C2-AC - Linea de fuego");
		diccionario.remove("F5C2-AC");

//		PARA VER SI EL DICCIONARIO ESTA VACIO
		if (diccionario.isEmpty()) {
			System.out.println("El diccionario esta vacio");
		} else {
			System.out.println("El diccionario tiene elementos");
		}

//		MOSTRAR EL DICCIONARIO 
		System.out.println("///Elementos del diccionario///");
		System.out.println(diccionario.toString());

// 		MOSTRAR LOS VALORES QUE ESTAN EN EL DICCIONARIO
		Enumeration<String> values = diccionario.elements();
		System.out.println("Los valores dentro del diccionario son:");
		while (values.hasMoreElements()) {
			System.out.println(values.nextElement());
		}

	}

	private static void Vector() {
		System.out.println();
		System.out.println("*** EJEMPLO PRACTICO DE LA CLASE Vector ***");

//		A CONTINUACION TENEMOS UN EJEMPLO EN EL QUE PODEMOS VER COMO SE IMPLEMENTA LA CLASE Vector 
//		DIGAMOS QUE QUEREMOS GESTIONAR EL ALMACENAMIENTO DE PRODUCTOS DE NUESTRO NUEVO EMPRENDIMIENTO DE MAQUILLAJE

		class Producto {
			private String nombre;
			private String marca;
			private String referencia;
			private String seccion;

			public Producto(String nombre, String marca, String referencia, String seccion) {
				this.nombre = nombre;
				this.marca = marca;
				this.referencia = referencia;
				this.seccion = seccion;
			}

			@Override
			public String toString() {
				return "PRODUCTO// Nombre - " + nombre + " Marca - " + marca + " Referencia - " + referencia
						+ " Sección - " + seccion;
			}
		}

// 		CREAR UN OBJETO DE TIPO VECTOR PARA CREAR EL INVENTARIO DE PRODUCTOS
		Vector<Producto> inventario = new Vector<>();

//		AGREGAMOS VARIOS PRODUCTOS AL INTENTARIO 
		inventario.add(new Producto("eyeliner sky", "NinaLou", "N12-23", "Ojos"));
		inventario.add(new Producto("BB-clean", "Artistry", "N23-01", "Cuidado del rostro"));
		inventario.add(new Producto("Superstay", "Maybelline", "N2542-87", "Labios"));
		inventario.add(new Producto("Master Matte", "Makeup by Mario", "N453-02", "Ojos"));

// 		MOSTAR LA CANTIDAD DE ELEMENTOS DEL INVENTARIO
		System.out.println("NUMERO DE PRODUCTOS EN EL INVENTARIO " + "\n" + inventario.size() + "Productos");

//		LISTA DE PRODUCTOS 
		Enumeration<Producto> productos = inventario.elements();
		System.out.println("Productos en el inventario:");
		while (productos.hasMoreElements()) {
			System.out.println(productos.nextElement());
		}

//     	ELIMINAR UN PRODUCTO POR EL INDICE EN EL VECTOR
		Producto eliminado = inventario.get(1);
		System.out.println("Producto eliminado: " + eliminado);
		inventario.remove(1);

//		MOSTAR EL PRODUCTO EN LA PRIMERA POSICION
		System.out.println("Primer producto en lista " + inventario.firstElement());

//		INSERTAR UN NUEVO PRODUCTO AL INVENTARIO EN UNA POSICION ESPECIFICA 
		inventario.add(3, new Producto("Instan eye", "Maybelline", "N342-98", "Ojos"));

//		LISTA DE PRODUCTOS
		productos = inventario.elements();
		System.out.println("Productos en el inventario:");
		while (productos.hasMoreElements()) {
			System.out.println(productos.nextElement());
		}
	}

	private static void Enumeration() {
		System.out.println();
		System.out.println("*** Ejemplo practico de la clase Enumeration");

//		A CONTINUACION TENEMOS UN EJEMPLO EN EL QUE PODEMOS VER COMO SE IMPLEMENTA LA INTERFAZ Enumeration
//		PARA ESTE EJEMPLO SUPONGAMOS QUE TENEMOS UNA LISTA DE NOMBRES DE ESTUDIANTES MEDIANTE LA CLASE VECTORE Y SE LISTA LA COLECCION CON LA CLASE Enumeration

		class Estudiante {

			private int numero;
			private String nombre;
			private String grado;

			public Estudiante(int numero, String nombre, String grado) {
				this.numero = numero;
				this.nombre = nombre;
				this.grado = grado;
			}

			@Override
			public String toString() {
				return "Estudiante N°: " + numero + " | " + nombre + "Grado: " + grado;
			}

		}

//		CREAR UN OBJETO DE TIPO VECTOR PARA LA LISTA DE ESTUDIANTES
		Vector<Estudiante> listaEstudiantes = new Vector<>();

//		AGREGAMOS ESTUDIANTES A LA LISTA 
		listaEstudiantes.add(new Estudiante(1, "Sara Gomez Lima", "4°1"));
		listaEstudiantes.add(new Estudiante(2, "Vianca Morales Blanco", "4°1"));
		listaEstudiantes.add(new Estudiante(3, "Carlos Vega Castellano", "4°1"));
		listaEstudiantes.add(new Estudiante(4, "Camilo Vasquez Morelo", "4°1"));
		listaEstudiantes.add(new Estudiante(5, "Sofia Blanquiced Blanco", "4°1"));

//		OBTEENER LA ENUMERACION DE LOS ESTUDIANTES EN LISTA
		Enumeration<Estudiante> estudiantes = listaEstudiantes.elements();

//		LISTAMOS LOS ESTUDIANTES CON LA CLASE ENUMERATION
		System.out.println("/// LISTA DE ESTUDIANTES ///");
		while (estudiantes.hasMoreElements()) {
			System.out.println(estudiantes.nextElement());

		}
	}

	private static void Collections() {
		System.out.println();
		System.out.println("*** EJEMPLO PRACTICO DE LA CLASE Collections ***");

//		A CONTINUACION TENEMOS UN EJEMPLO EN EL QUE PODEMOS VER COMO SE IMPLEMENTA LA CLASE Collections Y LA INTERFAZ Collection
//		EN ESTE CASO SUPONGAMOS QUE TENEMOS UNA COLECCION DE NUMEROS QUE QUEREMOS MANIPULAR, ESTA CLASE Y ESTA INTERFAZ PERMITEN 
//		TENER UN MARCO DONDE SE PUEDAN MANEJAR COLECCIONES DE DATOS Y METODOS PARA OPERAR Y MANIPULAR DICHAS COLECCIONES 

//		CREAMOS UNA COLECCION DONDE SE ALMACENAN LOS NUMEROS QUE QUEREMOS MANIPULAR (ESTA INTERFAZ ES PRACTICA PARA MANIPULAR 
//		CUALQUIER COLECCION DE ELEMENTOS)
		Collection<Integer> coleccionNumeros = new ArrayList<>();

//		USAMOS .add PARA AGREGAR NUEVOS ELEMNRTOS A LA COLECCION 
		coleccionNumeros.add(12);
		coleccionNumeros.add(1);
		coleccionNumeros.add(9);
		coleccionNumeros.add(89);
		coleccionNumeros.add(21);
		coleccionNumeros.add(34);

//		MOSTRAMOS LOS ELEMENTOS DE LA COLECCION  
		System.out.println("Numeros dentro de la coleccion || " + coleccionNumeros);

//		METODO PARA VERIFICAR SI HAY CIERTOS NUMEROS EN LA COLECCION 
		System.out.println("Numero 10 " + coleccionNumeros.contains(10));
		System.out.println("Numero 21 " + coleccionNumeros.contains(21));

//		ELIMINAR UN NUMERO DETERMINADO DE LA COLECCION 
		coleccionNumeros.remove(9);
		System.out.println("//VERIFICAMOS QUE SE ELIMINO EL NUMERO 9 // " + coleccionNumeros);

//		MIRAR EL TAMAÑO DE LA COLECCION 
		System.out.println("Hay " + coleccionNumeros.size() + " elemntos ");
		System.out.println();

//		PARA HACER USO DE LA CLASE COLLECTIONS CREAMOS UN ARRYLIST QUE CONTENGA TODO LOS NUMEROS DE LA COLECCION PARA USAR LOS METODOS DE DICHA CLASE		
		ArrayList<Integer> listaNumeros = new ArrayList<>(coleccionNumeros);

//		METODO PARA ORGANIZAR LOS ELEMENTOS DE LA LISTA
		Collections.sort(listaNumeros);
		System.out.println("NUMEROS ORGANIZADOS: " + listaNumeros);

//	    METODO PARA INVERTIR EL ORDEN DE LOS NUMEROS
		Collections.reverse(listaNumeros);
		System.out.println("NUMEROS ORDENADOS AL REVERS: " + listaNumeros);

//	    METODO PARA ORGANIZAR DE MANERA ALEATORIA
		Collections.shuffle(listaNumeros);
		System.out.println("NUMEROS ORDENADOS DE MANERA ALEATORIA: " + listaNumeros);

//	    METODO PARA ENCONTRAR EL NUMERO MENOR Y EL MAYOR 
		Integer mayor = Collections.max(listaNumeros);
		Integer menor = Collections.min(listaNumeros);
		System.out.println("El numero mayor es " + mayor + ", El numero menor es " + menor);

//	    RECORRER LA LISTA 
		System.out.println("Recorrer la lista");
		Iterator<Integer> iterator = listaNumeros.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

//      METODO PARA LIMPIAR LA LISTA 
		listaNumeros.clear();
		System.out.println("lista vacia " + listaNumeros);
	}

	private static void Array() {

		System.out.println();
		System.out.println("*** EJEMPLO PRACTICO DE LA CLASE Collections ***");

//		A CONTINUACION SE PRESENTA UN EJEMPLO SENCILLO DE COMO APLICAR LA CLASE Arrays
//		PARA ESTE EJEMPLO PRACTICO SUPONGAMOS QUE TENEMOS LA CALIFICACION DE UN EXAMEN DE 10 ESTUDINATES Y SE DESEA SABER CUAL ES EL MAYOR PUNTAJE
//		EL MENOR PUNTAJE, SE DESEA ORDENARLOS, LISTARLOS, ENCONTRAR UN PUNTAJE ESPECIFICO Y AGREGAR EL PUNTAJE DE 3 ESTUDIANTES MAS

//		SE CREA UN ARRAY PARA GUARDAR LAS CALIFICACIONES 
		double[] notas = { 5, 4.2, 2.1, 3, 4.8, 3.6, 4, 3.2, 1, 2.5 };

//      IMPRIMIR EL ARRY EN CONSOLA
		System.out.println("LISTA DE CALIFICACIONES || " + Arrays.toString(notas));

//      ORGANIZAR LAS NOTAS DE MANERA ASCENDENTE
		Arrays.sort(notas);
		System.out.println("NOTAS ORGANIZADAS || " + Arrays.toString(notas));

//      ASIGNAR MAYOR PUNTAJE Y MENOR PUNTAJE
		double mayor = notas[notas.length - 1];
		double menor = notas[0];
		System.out.println("LA MAYOR CALIFICACION FUE: " + mayor);
		System.out.println("LA MENOR CALIFICACION FUE: " + menor);

//      BUSCAR UNA CALIFICACION ESPECIFICA
		double buscar = 2.1;
		int index = Arrays.binarySearch(notas, buscar);
		if (index >= 0) {
			System.out.println("La calificación " + buscar + " Esta en el puesto: " + (index + 1));
		} else {
			System.out.println("Score " + buscar + " not found");
		}

//     COPIAR EL ARRAY A UN CON UNA LOGITUD DIFERENTE
		double[] copia = Arrays.copyOf(notas, 13);
		System.out.println("NUEVA LISTA DE NOTA: " + Arrays.toString(copia));

//     ASIGNAR LAS NUEVAS TRES NOTA
		copia[10] = 1.2;
		copia[11] = 4.8;
		copia[12] = 3.1;
		System.out.println("LISTA DE NOTAS || " + Arrays.toString(copia));

//     LISTAR LA LISTA DE NOTAS
		System.out.println("///LISTADO DE NOTAS///");
		for (int i = 1; i <= copia.length; i++) {
			System.out.println(i + ". " + copia[i - 1]);
		}

//     COMPARAR DOS ARRAY
		boolean arraysEqual = Arrays.equals(notas, copia);
		System.out.println("lAS LISTAS SON INGUALES: " + arraysEqual);
	}

	private static void List() {
		System.out.println();
		System.out.println("*** EJEMPLO PRACTICO DE LA CLASE List ***");

//		A CONTINUACION TENEMOS UN EJEMPLO EN EL QUE PODEMOS VER COMO SE IMPLEMENTA LA INTERFAZ List
//		PARA ESTE EJEMPLO SUPONGAMOS QUE QUEREMOS GESTIONAR UNA LISTA CONTIENE LOS PENDIENTES ACADEMICOS DE UN ESTUDIANTE

//	    CREAR UN LISTA QUE CONTENTRA LAS TAREAS PENDIENTES
		List<String> pendientes = new ArrayList<>();

//      AÑADIR NUVAS TAREAS A LA LISTA
		pendientes.add("Actividad de multiplos - matematicas");
		pendientes.add("Exposicion Atomos - naturales");
		pendientes.add("Puntillismo - arte");
		pendientes.add("Taller - ingles");

//      SE MUESTRA LA LISTA DE TAREAS POR CONSOLA
		System.out.println("/// ACTIVIDADES PENDIENTES///");
		int contador = 1;
		for (Iterator iterator = pendientes.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(contador + ". " + string);
			contador++;
		}
		System.out.println();

//      OBTENER UNA TAREA ESPECIFICA
		String task = pendientes.get(2);
		System.out.println("Peniente N°2: " + task);

//      ELIMINAR UNA TAREA DE LA LISTA
		pendientes.remove("Actividad de multiplos - matematicas");
		System.out.println("Despues de eliminar la tarea 1");
		contador = 1;
		for (Iterator iterator = pendientes.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(contador + ". " + string);
			contador++;
		}
		System.out.println();

//      AÑADIR UNA TAREA A UNA POSICION ESPECIFICA
		pendientes.add(1, "Evaluacion - sociales");
		System.out.println("Se añadio una nueva tarea");
		contador = 1;
		for (Iterator iterator = pendientes.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(contador + ". " + string);
			contador++;
		}
		System.out.println();

//      VERIFICAR SI UNA LISTA CONTIENE UNA TAREA ESPEIFICA
		boolean containsTask = pendientes.contains("Actividad de multiplos - matematicas");
		System.out.println("La tarea 'Actividad de multiplos - matematicas' se encuentra en la lista: " + containsTask);

//      OBTENER UNA SUBLISTA DE TAREAS
		List<String> subList = pendientes.subList(1, 3);
		System.out.println("Sublista de las tareas index 1 a 3: " + subList);

//      LIMPIAR LA LISTA
		pendientes.clear();
		System.out.println("After clearing the list: " + pendientes);
	}

	private static void ArrayList() {

		System.out.println();
		System.out.println("*** EJEMPLO PRACTICO DE LA CLASE Dictionary ***");

//		A CONTINUACION TENEMOS UN EJEMPLO EN EL QUE PODEMOS VER COMO SE IMPLEMENTA LA CLASE ArrayList
//		PARA ESTE EJEMPLO SUPONGAMOS QUE QUEREMOS CREAR UNA PEQUEÑA APP PARA MANEJAR EL INVENTARIO DE UNA PEQUEÑA TIENDA 

		class Product {

			private String nombre;
			private double precio;
			private int cantidad;

			public Product(String name, double price, int quantity) {
				this.nombre = name;
				this.precio = price;
				this.cantidad = quantity;
			}

			@Override
			public String toString() {
				return "Producto{name ='" + nombre + "', price =" + precio + ", quantity =" + cantidad + "}";
			}

			public void setQuantity(int i) {
				this.cantidad = i;

			}

			public Object getName() {
				return nombre;
			}
		}

//		CREAMOS UN NUEVO ARRAYLIST PARA ALMACENAR LOS PRODUCTOS DEL INVENTARIO
		ArrayList<Product> inventario = new ArrayList<>();

//      AÑADIR PRODUCTOS AL INVENTARIO
		inventario.add(new Product("Manzana verde", 1200.29, 10));
		inventario.add(new Product("Arroz Diana", 2800.49, 25));
		inventario.add(new Product("Lentejas Cosecha", 1200.99, 15));
		inventario.add(new Product("Doritos", 2500.99, 12));
		inventario.add(new Product("Cebollas", 500.78, 28));

//      MOSTRAR EL INVENTARIO
		System.out.println("INVENTARIO: " + inventario);

//      OBTENER Y MOSTRAR UN PRODUCTO ESPECIFICO
		Product producto = inventario.get(2);
		System.out.println("Producto numero 1: " + producto);

//      ACTUALIZAR LA CANTIDAD DEL ALGUN PRODUCTO
		producto.setQuantity(20);
		System.out.println("INVENTARIO: " + inventario);

//      ELIMINAR UN PRODUCTO DEL INVENTARIO
		inventario.remove(3);
		System.out.println("Inventario despues de eliminar el producto index 3: " + inventario);

//      AÑADIR UN PRODUCTO EN UNA POSICION
		inventario.add(0, new Product("Pan Bimbo", 1500.21, 21));
		System.out.println("Nuevo producto al inventario " + inventario);

//		VERIFICAR SI UN PRODUCTO ESTA EN EL INVENTARIO
		boolean con = false;
		for (Product p : inventario) {
			if (p.getName().equals("Manzana verde")) {
				con = true;
				break;
			}
		}
		System.out.println("Hay 'Manzanas verdes': " + con);

//      OBTENER LA CANTIDAD DE PRODUCTOS EN EL INVENTARIO
		int size = inventario.size();
		System.out.println("El numero de productos en el iventario es: " + size);

//      LIMPIAR EL INVENTARIO
		inventario.clear();
		System.out.println("Inventario vacio " + inventario);

//      VERIFICAR SI EL INVENTARIO ESTA VACIO
		boolean isEmpty = inventario.isEmpty();
		System.out.println("¿El inventario esta vacio? " + isEmpty);
	}

	private static void LinkedList() {
		System.out.println();
		System.out.println("*** EJEMPLO PRACTICO DE LA CLASE LinkedList ***");

//		A CONTINUACION TENEMOS UN EJEMPLO EN EL QUE PODEMOS VER COMO SE IMPLEMENTA LA CLASE LinkedList
//		SUPONGAMOS QUE QUEREMOS MANEJAR UNA LISTA DE REPRODUCCION DE MUSICA 

		class Cancion {
			private String titulo;
			private String artista;
			private int duracion;

			public Cancion(String titulo, String artista, int duracion) {
				this.titulo = titulo;
				this.artista = artista;
				this.duracion = duracion;
			}

			public String getTitle() {
				return titulo;
			}

			public String getArtist() {
				return artista;
			}

			public int getDuration() {
				return duracion;
			}

			@Override
			public String toString() {
				return "Titulo = " + titulo + " | Artista = " + artista + " | Duracion = " + duracion + " secundos";
			}
		}

//      CREAR UNA LISTA DE RESPRODUCCION USANDO LinkedList
		LinkedList<Cancion> playlist = new LinkedList<>();

//      AÑADIR CANCIONES A LA LISTA DE REPRODUCCION
		playlist.add(new Cancion("Bohemian Rhapsody", "Queen", 354));
		playlist.add(new Cancion("Imagine", "John Lennon", 183));
		playlist.add(new Cancion("Flaca", "Nappa", 391));

//      MOSTRAR LA LISTA DE REPRODUCCION
		System.out.println("///Playlist///");
		for (Iterator iterator = playlist.iterator(); iterator.hasNext();) {
			Cancion cancion = (Cancion) iterator.next();
			System.out.println(cancion.toString());
		}
		System.out.println();

//     	AÑADIR UNA CANCION AL PRINCIPIO
		playlist.addFirst(new Cancion("She goes ", "bad bunny", 482));
		System.out.println("///Playlist///");
		for (Iterator iterator = playlist.iterator(); iterator.hasNext();) {
			Cancion cancion = (Cancion) iterator.next();
			System.out.println(cancion.toString());
		}
		System.out.println();

//      AÑADIR UNA CANCION AL FINAL
		playlist.addLast(new Cancion("Pa quererte", "rels b", 431));
		System.out.println("///Playlist///");
		for (Iterator iterator = playlist.iterator(); iterator.hasNext();) {
			Cancion cancion = (Cancion) iterator.next();
			System.out.println(cancion.toString());
		}
		System.out.println();

//      OBTENER UNA CANCION ESPECIFICA 
		Cancion song = playlist.get(2);
		System.out.println("Cancion numero 3: " + song);

//      ELIIMINAR LA PRIMERA Y LA ULTIMA CANCION 
		playlist.removeFirst();
		playlist.removeLast();
		System.out.println("///Playlist///");
		for (Iterator iterator = playlist.iterator(); iterator.hasNext();) {
			Cancion cancion = (Cancion) iterator.next();
			System.out.println(cancion.toString());
		}
		System.out.println();

//      VERIFICAR SI HAY UNA CANCION ESPECIFICA
		boolean containsSong = false;
		for (Cancion s : playlist) {
			if (s.getTitle().equals("Imagine")) {
				containsSong = true;
				break;
			}
		}
		System.out.println("Esta la cancion 'Imagine': " + containsSong);

//      VACIAR LISTA DE REPRODUCCION
		playlist.clear();
		System.out.println("Lista vacia" + playlist);

	}

	private static void set() {
		System.out.println();
		System.out.println("*** EJEMPLO PRACTICO DE LA CLASE Dictionary ***");

//		A CONTINUACION TENEMOS UN EJEMPLO EN EL QUE PODEMOS VER COMO SE IMPLEMENTA LA INTERFAZ Set
//		SUPONGAMOS QUE QUEREMOS LLEVAR EL CONTROL DE LA VENTA DE BOLETAS PARA UNA RIFA, HAY QUE TENER EN CUENTA QUE LA MISMA PERSONA
//		NO PUEDE COMPRAR DOS BOLETAS Y EL NUMERO DE BOLETA NO SE PUEDE REPETIR

		Set<BoletaRifa> rifaTickets = new HashSet<>();

//      AÑADIR TICKET

		BoletaRifa.addTicket(rifaTickets, new BoletaRifa(1, "SARA"));
		BoletaRifa.addTicket(rifaTickets, new BoletaRifa(2, "JUAN"));
		BoletaRifa.addTicket(rifaTickets, new BoletaRifa(3, "CARLOS"));
		BoletaRifa.addTicket(rifaTickets, new BoletaRifa(1, "SARA"));
		BoletaRifa.addTicket(rifaTickets, new BoletaRifa(4, "LINA"));

//      MOSTRAR LAS BOLETAS
		System.out.println("Boletas registradas: " + rifaTickets);

//      VERIFICAR SI UNA BOLETA ESTA REGISTRADA
		BoletaRifa verificar = new BoletaRifa(2, "CAMILO");
		if (rifaTickets.contains(verificar)) {
			System.out.println("Ticket esta registrado: " + verificar);
		} else {
			System.out.println("Ticket no esta registrado: " + verificar);
		}

//      ELIMINAR UNA BOLETA
		rifaTickets.remove(verificar);
		System.out.println("Boletas registradas: " + rifaTickets);

//      MOSTRAR EL NUEMERO DE BOLETAS REGISTRADAS
		System.out.println("Numero de boletas registradas: " + rifaTickets.size());

//      MOSTRAR TODA LA LISTA
		System.out.println("///LISTA DE RIFA///");
		for (BoletaRifa ticket : rifaTickets) {
			System.out.println(ticket);
		}
	}

	private static void SortedSet() {
		System.out.println();
		System.out.println("*** EJEMPLO PRACTICO DE LA CLASE SortedSet ***");

//		A CONTINUACION TENEMOS UN EJEMPLO EN EL QUE PODEMOS VER COMO SE IMPLEMENTA LA INTERFAZ SortedSet A TRAVES DE LA CLASE TreeSet
//		PARA ESTE EJEMPLO PRACTICO SE REQUIERE UN ALGORITMO QUE AYUDE CON LA GESTION DE LAS FECHAS DE EVENTOS 
//		ES NECESARIO QUE LAS FECHAS ESTEN ORGANIZADAS PARA MOSTRAR  CUANDO ES EL PROXIMO EVENTO

//		CREAMOS EL SORTDSET PARA ALMACENAR TODAS LAS FECHAS DE LOS EVENTOS
		SortedSet<LocalDate> fechas = new TreeSet<>();

//      AÑADIR FECHAS AL SORTDSET 
		fechas.add(LocalDate.of(2024, 6, 10));
		fechas.add(LocalDate.of(2024, 5, 23));
		fechas.add(LocalDate.of(2024, 7, 8));
		fechas.add(LocalDate.of(2024, 7, 19));
		fechas.add(LocalDate.of(2024, 5, 30));

//      MOSTRAR POR CONSOLA LAS FECHAS ORDENADAS
		System.out.println("///Eventos Proximos///");
		for (LocalDate localDate : fechas) {
			System.out.println(localDate);
		}

//      MOSTRAR EL EXENTO PROXIMO (EL EVENTO QUE ESTA AL INICIO)
		System.out.println("Evento proximo el: " + fechas.first());

//      OBTENER LOS EVENTOS HASTA UNA FECHA DETERMINADA
		LocalDate sub = LocalDate.of(2024, 7, 1);
		java.util.SortedSet<LocalDate> subeventos = fechas.headSet(sub);
		System.out.println("Eventos antes de la fecha " + sub + ": ");
		for (LocalDate localDate : subeventos) {
			System.out.println(localDate);
		}
	}

	private static void HashSet() {
		System.out.println();
		System.out.println("*** EJEMPLO PRACTICO DE LA CLASE HashSet ***");

//		A CONTINUACION TENEMOS UN EJEMPLO EN EL QUE PODEMOS VER COMO SE IMPLEMENTA LA CLASE HashSet
//		PARA ESTE EJEMPLO QUEREMOS VALIDAR QUE NO HAYAN LIBRO DUBLICADOS DENTRO DE UNA BIBLIOTECA PARA LLEVAR UN ORDEN DE ELLOS 

		class Libro {
			private String titulo;
			private String autor;

			public Libro(String titulo, String autor) {
				this.titulo = titulo;
				this.autor = autor;
			}

			public String getTitle() {
				return titulo;
			}

			public String getAuthor() {
				return autor;
			}

			@Override
			public boolean equals(Object o) {
				if (this == o)
					return true;
				if (o == null || getClass() != o.getClass())
					return false;
				Libro book = (Libro) o;
				return titulo.equals(book.titulo) && autor.equals(book.autor);
			}

			@Override
			public int hashCode() {
				return Objects.hash(titulo, autor);
			}

			@Override
			public String toString() {
				return titulo + " - " + autor;
			}
		}

//     	CREAR UN HASHSET PARA ALAMCENER LOS DATOS DE LOS LIBROS
		HashSet<Libro> biblioteca = new HashSet<>();

//      AÑADIR LIBROS A LA INTERFAZ 
		biblioteca.add(new Libro("El Hobbit", "J.R.R. Tolkien"));
		biblioteca.add(new Libro("Endgame", "James Frey"));
		biblioteca.add(new Libro("100 años de soledad", "Gabriel Garcia Marquez"));
		biblioteca.add(new Libro("Cure", "Adriana Godoy"));

//      INTENTAR AÑADIR UN LIBRO REPEDITO
		biblioteca.add(new Libro("El Hobbit", "J.R.R. Tolkien"));

//    	MOSTRAR TODOS LOS LIBROS
		System.out.println("/// LIBROS EN LA BIBLIOTECA///");
		for (Libro libro : biblioteca) {
			System.out.println(libro);
		}
		System.out.println();

//      COMPROBAR SI HAY UN DETERMINADO LIBRO EN LA BIBLIOTECA
		Libro busqueda = new Libro("Endgame", "James Frey");
		if (biblioteca.contains(busqueda)) {
			System.out.println("El libro " + busqueda.getTitle() + " está en la biblioteca.");
		} else {
			System.out.println("El libro " + busqueda.getTitle() + " no está en la biblioteca.");
		}

		Libro busqueda2 = new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez");
		if (biblioteca.contains(busqueda2)) {
			System.out.println("El libro " + busqueda2.getTitle() + " está en la biblioteca.");
		} else {
			System.out.println("El libro " + busqueda2.getTitle() + " no está en la biblioteca.");
		}
	}

	private static void TreeSet() {
		System.out.println();
		System.out.println("*** EJEMPLO PRACTICO DE LA CLASE TreeSet ***");

//		A CONTINUACION TENEMOS UN EJEMPLO EN EL QUE PODEMOS VER COMO SE IMPLEMENTA LA CLASE TreeSet
//		EN ESTE EJEMPLO PRACTICO SE REQUIERE IMPLIMENTAR UN CODIGO QUE ORGANICE UN CONJUNTO DE PALABRAS DE 
//		MANERA ALFABETICA

//		CREAMOS TreeSet PARA ALMACENAR TODAS LAS PALBARAS
		TreeSet<String> palabras = new TreeSet<>();

//      AÑADIR LAS PALABRAS
		palabras.add("Bogotá");
		palabras.add("Lapiz");
		palabras.add("Arbol");
		palabras.add("Cuna");
		palabras.add("zafiro");

//      AQUI SE INTENTARA AÑADIR PALABRAS REPEDITAS
		palabras.add("Bogotá");
		palabras.add("Cuna");

//      MOSTRAR TODAS LAS PALABRAS GUARDADAS (ESTARAN EN ORDEN ALFABETICO Y SIN REPETIRSE
		System.out.println("PALABRAS ORGANIZADAS DE FORMA ALFABETICA:");
		for (String city : palabras) {
			System.out.println(city);
		}
		System.out.println();

//      MOSTRAR TODAS LAS PALABRAS ALMACENADAS
		System.out.println("NUMERO DE PALABRAS ALMACENADAS: " + palabras.size());

//      BUSCAR LA PRIMERA Y LA ULTIMA PALABRA DE FORMA ALFABETICA
		String primera = palabras.first();
		String ultima = palabras.last();
		System.out.println("Primera palabra: " + primera);
		System.out.println("Última palabra: " + ultima);

//      MOSTRAR LA PALABRA QUE ESTA JUSTO DESPUES DE LA PALABRA INGRESADA (EL VALOR MAYOR)
		String nn = palabras.higher("Cuna");
		System.out.println("Plabra mayor a Cuna: " + nn);
	}

	private static void Map_HashMap() {
		System.out.println();
		System.out.println("*** EJEMPLO PRACTICO DE LA INTERFAZ Map Y LA CLASE HashMap ***");

//		A CONTINUACION TENEMOS UN EJEMPLO EN EL QUE PODEMOS VER COMO SE IMPLEMENTA LA INTERFAZ Map A TRAVES DE LA CLASE HashMap
//		PARA ESTE EJEMPLO SUPONGAMOS QUE QUEREMOS REGISTAR LAS CALIFICACIONES DE VARIOS ESTUDIANTES EN EL AREA DE MATEMATICAS

//	   	CREAR EL MAPA PARA ALMACENAR LAS CALIFICACIONES DE LOS ESTUDIANTES
		Map<String, List<Double>> mapaDeNotas = new HashMap<>();

//      AGREGAR AL MAPA LOS ESTUIDNATES Y SUS CALIFICACIONES
		addNota(mapaDeNotas, "Juan", 4.5);
		addNota(mapaDeNotas, "María", 3.2);
		addNota(mapaDeNotas, "Pedro", 4.8);
		addNota(mapaDeNotas, "Luisa", 2.9);
		addNota(mapaDeNotas, "Juan", 5.0);
		addNota(mapaDeNotas, "María", 4.2);
		addNota(mapaDeNotas, "María", 1.2);
		addNota(mapaDeNotas, "Luisa", 4.9);

//      MOSTRAR EL MAPA
		System.out.println("Calificaciones de estudiantes:");
		for (Map.Entry<String, List<Double>> entry : mapaDeNotas.entrySet()) {
			String studiante = entry.getKey();
			List<Double> notas = entry.getValue();
			System.out.println("Estudiante: " + studiante + ", Calificaciones: " + notas);
		}
	}

//	METODO PARA ALMACENAR UNA NUEVA CALIFICACION
	public static void addNota(Map<String, List<Double>> map, String studiante, double nota) {
		if (!map.containsKey(studiante)) {
			map.put(studiante, new ArrayList<>());
		}
		map.get(studiante).add(nota);
	}

	private static void TreeMap() {
		System.out.println();
		System.out.println("*** EJEMPLO PRACTICO DE LA CLASE TreeMap ***");

//		A CONTINUACION TENEMOS UN EJEMPLO EN EL QUE PODEMOS VER COMO SE IMPLEMENTA LA INTERFAZ TreeMap
//		VOLVIENDO AL EJEMPLO ANTERIOR, AHORA SE REQUIERE QUE LA LISA DE LOS ESTUDINATES CON SUS NOTAS ESTE ORDENADA ALFABETICAMENTE
//		ESE ORDEN ALFABETICO SE REALIZARA DE MANERA AUTOMATICA POR LA INTERFAZ 

//      CREAR EL TREEMAP PARA ALMACENAR A LOS ESTUDIANTES Y SUS CALIFICACIONES
		TreeMap<String, List<Double>> calificaciones = new TreeMap<>();

//      AGREGAR NUEVOS ESTUDIANTES 
		addNota(calificaciones, "Juan", 4.5);
		addNota(calificaciones, "Maria", 3.2);
		addNota(calificaciones, "Pedro", 2.8);
		addNota(calificaciones, "Luisa", 4.9);
		addNota(calificaciones, "Luisa", 5.0);
		addNota(calificaciones, "Juan", 4.0);
		addNota(calificaciones, "Pedro", 1.5);
		addNota(calificaciones, "Maria", 2.3);
		addNota(calificaciones, "Juan", 4.6);

//      MOSTRAR EL MAPA DE CALIFICACIONES 
		System.out.println("CALIFICACIONES");
		for (Map.Entry<String, List<Double>> entry : calificaciones.entrySet()) {
			String estudiante = entry.getKey();
			List<Double> notas = entry.getValue();
			System.out.println("Estudiante: " + estudiante + ", Calificaciones: " + notas);
		}

//      CALCULAR EL PROMEDIO
		String promedioEstudiante = "Juan";
		List<Double> estudianteNotas = calificaciones.get(promedioEstudiante);
		if (estudianteNotas != null) {
			double total = 0.0;
			for (Double nota : estudianteNotas) {
				total += nota;
			}
			double promedio = total / estudianteNotas.size();
			System.out.println("Promedio de calificaciones de " + promedioEstudiante + ": " + promedio);
		} else {
			System.out.println("No se encontraron calificaciones del estudiante " + promedioEstudiante);
		}
	}

// METODOS PARA AGARGAR UNA CALIFICACION
	public static void addNota(TreeMap<String, List<Double>> map, String estudiante, double nota) {
		map.computeIfAbsent(estudiante, k -> new ArrayList<>()).add(nota);
	}

	private static void LinkedHashMap() {
		System.out.println();
		System.out.println("*** EJEMPLO PRACTICO DE LA CLASE LinkedHashMap ***");

//		A CONTINUACION TENEMOS UN EJEMPLO EN EL QUE PODEMOS VER COMO SE IMPLEMENTA LA INTERFAZ LinkedHashMap
//		PARA ESTE EJEMPLO SE DESEA REALIZAR UN ALGORITMO QUE REGISTRE LA HORA DE LLEGADA DE VARIAS PERSONAS A UNA CLASE DE ARTE 
//		LA LISTA DE LAS PERSONAS ESTARA ORDENADA POR ORDEN DE LLEGADA

//	    CREAR UN LINKEDHASHMAP PARA MANTENER EL ORDEN DE LLEGADA
		LinkedHashMap<String, String> llegadaClaseDeArtes = new LinkedHashMap<>();

//		 AGREGAR ESTUDIANTES Y SUS HORAS DE LLEGADA AL MAPA
		llegadaClaseDeArtes.put("Juan", "08:00 AM");
		llegadaClaseDeArtes.put("María", "08:05 AM");
		llegadaClaseDeArtes.put("Pedro", "08:10 AM");
		llegadaClaseDeArtes.put("Luisa", "08:15 AM");
		llegadaClaseDeArtes.put("Ana", "08:20 AM");

//		MOSTRAR EL MAPA
		System.out.println("Lista de estudiantes por orden de llegada");
		for (Map.Entry<String, String> entry : llegadaClaseDeArtes.entrySet()) {
			System.out.println("Nombre: " + entry.getKey() + ", Hora de llegada: " + entry.getValue());
		}

//		CONSULTAR LA HORA DE LLEGADA DE UN ESTUDIANTE ESPECÍFICO
		String estudiante = "Pedro";
		String horaLlegada = llegadaClaseDeArtes.get(estudiante);
		System.out.println("\nLa hora de llegada de " + estudiante + " es " + horaLlegada);
		System.out.println();

//		ELIMINAR UN ESTUDIANTE DE LA LISTA
		llegadaClaseDeArtes.remove("María");
		System.out.println("Se elimino a Maria de la lista");
		System.out.println("\nLISTA");
		for (Map.Entry<String, String> entry : llegadaClaseDeArtes.entrySet()) {
			System.out.println("Nombre: " + entry.getKey() + ", Hora de llegada: " + entry.getValue());
		}

//		AGREGAR UN NUEVO ESTUDIANTE
		llegadaClaseDeArtes.put("Carlos", "08:25 AM");
		System.out.println("\nSe agrego a Carlos a la lista");
		System.out.println("\nLISTA");
		for (Map.Entry<String, String> entry : llegadaClaseDeArtes.entrySet()) {
			System.out.println("Nombre: " + entry.getKey() + ", Hora de llegada: " + entry.getValue());
		}
	}
}
