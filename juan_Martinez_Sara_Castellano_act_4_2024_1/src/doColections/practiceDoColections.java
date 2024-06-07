package doColections;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class practiceDoColections {
	
	public static void main(String[] args) {
			
		Persona p1 = new Persona("Carlos", 32, "Ingeniero");
		Persona p2 = new Persona("Lina", 21, "Medico");
		Persona p3 = new Persona("Marcos", 26, "Psicologo");
		Persona p4 = new Persona("Camilo", 38, "Matematico");
		Persona p5 = new Persona("Sara", 41, "Contadora");
			
		List<Persona> listPersona = new ArrayList<>();
		Set<Persona> setPersona = new HashSet<>();
		Map<String, Persona> mapPersona = new HashMap<>();
		Stack<Persona> stackPersona = new Stack<>();
		Queue<Persona> queuePersona = new LinkedList<Persona>();
		
//		LIST 
		System.out.println("///TRABAJO CON LA COLECCION LIST///  \n");
		
//		AGREGAR OBJETOS A LA LISTA
		listPersona.add(p1);
		listPersona.add(p2);
		listPersona.add(p3);
		listPersona.add(p4);
		listPersona.add(p5);
		
//		BUSCAR UN OBJETO EN LA LISTA POR EL NOMBRE 
		String name = "Sara";
		for (Persona persona : listPersona) {
			if(persona.getName().equalsIgnoreCase(name)) {
				System.out.println("Persona encontrada");
				System.out.println(persona.toString());
			};
		}
		
//		INSERTAR OBJETO 
		listPersona.add(3, new Persona("Maria", 24, "Contador"));
		
//		ELIMINAR OBJETOS 
		listPersona.remove(p3);
		
//		BUSCAR SI EL OBJETO EXISTE EN LA LISTA
		boolean contet = listPersona.contains(p1);
		if (contet == true) {
			System.out.println(p1.getName() + " Se encuentra en la lista");
		}else {
			System.out.println(p1.getName() + " No se encuentra en la lista");
		}
		
//		MOSTRAR LISTA
		System.out.println();
		for (Persona persona : listPersona) {
			System.out.println(persona.toString());
		}
		
		
//		SET 
		System.out.println(" \n ///TRABAJO CON LA COLECCION SET///  \n");
		
//		AGREGAR OBJETOS AL SET
		setPersona.add(p1);
		setPersona.add(p2);
		setPersona.add(p3);
		setPersona.add(p4);
		setPersona.add(p5);

//		BUSCAR UN OBJETO EN EL SET POR EL NOMBRE 
		boolean contet1 = false;
		name = "Luna";
		for (Persona persona : setPersona) {
			if (persona.getName().equalsIgnoreCase(name)) {
				System.out.println("Persona encontrada");
				System.out.println(persona.toString());
				contet = true;
			}
		}
		
		if (contet1 == false) {
			System.out.println(name + " no se encuetra en la coleccion");
		}
		
		
//		INSERTAR OBJETO 
		setPersona.add(new Persona("Miguel", 24, "Chef"));
		
//		ELIMINAR OBJETOS 
		setPersona.remove(p3);
		
//		BUSCAR SI EL OBJETO EXISTE EN EL SET
		boolean contet2 = setPersona.contains(p4);
		if (contet2 == true) {
			System.out.println(p4.getName() + " Se encuentra en la lista");
		}else {
			System.out.println(p4.getName() + " No se encuentra en la lista");
		}
		
//		MOSTRAR SET
		System.out.println();
		for (Persona persona : setPersona) {
			System.out.println(persona.toString());
		}
		
		
//		MAP
		System.out.println(" \n ///TRABAJO CON LA COLECCION MAP///  \n");
		
//		AGREGAR OBJETOS AL MAP
		mapPersona.put("N°1", p1);
		mapPersona.put("N°2", p2);
		mapPersona.put("N°3", p3);
		mapPersona.put("N°4", p4);
		mapPersona.put("N°5", p5);
		
//		BUSCAR UN OBJETO EN EL MAPA POR LA CLAVE
		name = "Camilo";
		for (Entry<String, Persona> entry : mapPersona.entrySet()) {
			if (entry.getValue().getName().equalsIgnoreCase(name)) {
				System.out.println("Persona encontrada");
				System.out.println(entry.getKey().toString() + " " + entry.getValue().toString());
			}
		}
		
//		INSERTAR OBJETO 
		mapPersona.put("N°6", new Persona("Carolina", 45, "Biologa"));
		
//		ELIMINAR OBJETO 
		mapPersona.remove("N°4");
		
//		BUSCAR SI EL OBJETO EXISTE EN EL MAPA
		boolean contet3 = mapPersona.containsValue(p4);
		if (contet3 == true) {
			System.out.println(p4.getName() + " Se encuentra en la lista");
		}else {
			System.out.println(p4.getName() + " No se encuentra en la lista");
		}
		
//		MOSTRAR MAPA 
		System.out.println();
		for (Entry<String, Persona> entry : mapPersona.entrySet()) {
			System.out.println(entry.getKey().toString() + " " + entry.getValue().toString());			
		}
		
		
//		STACK
		System.out.println(" \n ///TRABAJO CON LA COLECCION STACK///  \n");
		
		stackPersona.push(p1);
		stackPersona.push(p2);
		stackPersona.push(p3);
		stackPersona.push(p4);
		stackPersona.push(p5);
		
//		BUSCAR UN OBJETO EN LA PILA POR EL NOMBRE 
		name = "Sara";
		for (Persona persona : stackPersona) {
			if(persona.getName().equalsIgnoreCase(name)) {
				System.out.println("Persona encontrada");
				System.out.println(persona.toString());
			};
		}
		
//		INSERTAR OBJETO 
		stackPersona.push(new Persona("Sofia", 20, "Estudiante"));
		
//		ELIMINAR UN OBJETO
		stackPersona.pop();
		
		
//		BUSCAR SI EL OBJETO EXISTE EN LA PILA
		boolean contet4 = stackPersona.contains(p1);
		if (contet4 == true) {
			System.out.println(p1.getName() + " Se encuentra en la lista");
		}else {
			System.out.println(p1.getName() + " No se encuentra en la lista");
		}
		
//		MOSTRAR PILA
		System.out.println();
		for (Persona persona : stackPersona) {
			System.out.println(persona.toString());
		}

		
//		MOSTRAR QUEUE
		System.out.println(" \n ///TRABAJO CON LA COLECCION QUEUE///  \n");

//		AÑADIR ELEMNETOS A LA COLA 
		queuePersona.add(p1);
		queuePersona.add(p2);
		queuePersona.add(p3);
		queuePersona.add(p4);
		queuePersona.add(p5);
		
//		BUSCAR UN OBJETO EN LA COLA POR EL NOMBRE 
		name = "Lina";
		for (Persona persona : queuePersona) {
			if(persona.getName().equalsIgnoreCase(name)) {
				System.out.println("Persona encontrada");
				System.out.println(persona.toString());
			};
		}
		
//		INSERTAR OBJETO 
		queuePersona.offer(new Persona("Sofia", 20, "Estudiante"));
		
//		ELIMINAR UN OBJETO
		queuePersona.poll();
		
//		BUSCAR SI EL OBJETO EXISTE EN LA COLA
		boolean contet5 = queuePersona.contains(p1);
		if (contet5 == true) {
			System.out.println(p1.getName() + " Se encuentra en la lista");
		}else {
			System.out.println(p1.getName() + " No se encuentra en la lista");
		}
		
//		MOSTRAR COLA 
		System.out.println();
		for (Persona persona : queuePersona) {
			System.out.println(persona.toString());
		}
		
		
//		RECORRER COLECCIONES 
		System.out.println("///RECORRER COLECCIONES///");

//		LIST 
		System.out.println("\nLISTA");
		System.out.println("FOR");
		for (int i = 0; i < listPersona.size(); i++) {
			Persona persona = listPersona.get(i);
			System.out.println(persona);
		}
		
		System.out.println("\nFOREACH");
		for (Persona persona : listPersona) {
			System.out.println(persona);
		}
		
		System.out.println("\nWHILE");
		Iterator<Persona> iterador = listPersona.iterator();
		while (iterador.hasNext()) {
			Persona persona = iterador.next();
			System.out.println(persona);
		}
		
		System.out.println("\nDO WHILE");
		 iterador = listPersona.iterator();
		do {
			Persona persona = iterador.next();
			System.out.println(persona);
		} while (iterador.hasNext());
		
		System.out.println("\nLISTA ORDENADA");
		listPersona.sort(Comparator.comparing(Persona::getName));
		for (Persona persona : listPersona) {
			System.out.println(persona);
		}
		
//		SET
		System.out.println("\nSET");
		System.out.println("FOR");
		List<Persona> coleccion = new ArrayList<Persona>(setPersona);
		for (int i = 0; i < setPersona.size(); i++) {
			Persona persona = coleccion.get(i);
			System.out.println(persona);
		}
		
		System.out.println("\nFOREACH");
		for (Persona persona : setPersona) {
			System.out.println(persona.toString());
		}
		
		System.out.println("\nWHILE");
		iterador = setPersona.iterator();
		while (iterador.hasNext()) {
			Persona persona = iterador.next();
			System.out.println(persona);
		}
		
		System.out.println("\nDO WHILE");
		iterador = setPersona.iterator();
		do {
			Persona persona = iterador.next();
			System.out.println(persona);
		} while (iterador.hasNext());
		
//		MAP
		System.out.println("\nSET");
		System.out.println("FOR");
		List<Map.Entry<String, Persona>> entryList = new ArrayList<>(mapPersona.entrySet());
		for (int i = 0; i < mapPersona.size(); i++) {
			Map.Entry<String, Persona> entry = entryList.get(i);
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("\nFOREACH");
		for (Entry<String, Persona> entry : entryList) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println("\nWHILE");
		Iterator<Map.Entry<String, Persona>> iterator1 = mapPersona.entrySet().iterator();
		while (iterator1.hasNext()) {
			Map.Entry<String, Persona> entry = iterator1.next();			
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println("\nDo WHILE");
		iterator1 = mapPersona.entrySet().iterator();
		do {
			Map.Entry<String, Persona> entry = iterator1.next();			
			System.out.println(entry.getKey() + " " + entry.getValue());
		} while (iterator1.hasNext());
		

//		USO DE STREAM 
		
		System.out.println("\nLISTA - STREAM");
		listPersona.stream().forEach(persona -> System.out.println(persona));
		
		System.out.println("\nSET - STREAM");
		setPersona.stream().forEach(persona -> System.out.println(persona));
		
		System.out.println("\nMAP - STREAM");
		mapPersona.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
		
		
//		USO DE FUNCION FLECHA
		System.out.println("\nLISTA - LAMBDA");
		listPersona.forEach(persona -> System.out.println(persona));
		
		System.out.println("\nSET - LAMBDA");
		setPersona.forEach(persona -> System.out.println(persona));
		
		System.out.println("\nMAP - LAMBDA");
		mapPersona.forEach((key, value) -> System.out.println( key + "" + value));
		
//		CONVERTIR LIST - ARRAY
		System.out.println("\nDe un array a una lista");
		Integer[] array = {1, 2, 3, 4,  5, 6};
		List<Integer> numerosList = new ArrayList<>(Arrays.asList(array));
		numerosList.forEach(t -> System.out.println(t));
		
		System.out.println("\nDe una lista a un array");
		Object[] array1 = numerosList.toArray();
		Arrays.stream(array1).forEach(t -> System.out.println(t));
		
		System.out.println("DOS FORMAS DE UNIR LISTAS");
		List<Integer> list = Arrays.asList(1, 3,5,7,9);
		List<Integer> list2 = Arrays.asList(2,4,6,8,10);
		List<Integer> listJoi = new ArrayList<Integer>(list);
		
//		AGREGANDO TODA LA COLECCION DE DATOS DE LA SEGUNDA LISTA
		listJoi.addAll(list2);

		System.out.println(listJoi);
		
//		USANDO METODOS DE STREAM
		Stream.concat(list.stream(), list2.stream()).collect(Collectors.toList());
		System.out.println(listJoi);
		
		Collections.shuffle(listJoi);
		System.out.println("LISTA DESORDENADA");
		System.out.println(listJoi);
		
		
//		ORDENAR UNA COLECCION DE OBJETOS USANDO STREM 
		List<Estudiante> students = new ArrayList<>();
		students.add(new Estudiante(7514, "Sara", "Castellano", "F", 3));
		students.add(new Estudiante(7515, "Juan", "Martinez", "M", 1));
		students.add(new Estudiante(7501, "Carolina", "Arias", "F", 3));
		students.add(new Estudiante(7523, "Vianca", "Ruiz", "F", 4));
		students.add(new Estudiante(7521, "Javier", "Zarate", "M", 2));
		students.add(new Estudiante(7523, "Rosa", "Villadiego", "F", 3));
		students.add(new Estudiante(7523, "Jhon", "Blanco", "M", 3));
		students.add(new Estudiante(7510, "Pedro", "Romero", "M", 4));
		students.add(new Estudiante(7510, "Samira", "Castro", "F", 5));
		students.add(new Estudiante(7505, "Valentina", "Woud", "F", 5));

		
		System.out.println("\nLISTA ORDENADA USANDO METODOS DE STREAM");
		List<Estudiante> sortName = students.stream().sorted((n1, n2) -> n1.getLastName().compareTo(n2.getLastName())).collect(Collectors.toList());
		sortName.forEach(persona -> System.out.println(persona));
		
		System.out.println("\nSUBLISTA FILTRADA POR SEMESTRE USANDO METODOS DE STREAM");
		List<Estudiante> listSemester = students.stream().filter(student -> student.getSemester() == 3).collect(Collectors.toList());
		listSemester.forEach(estudiante -> System.out.println(estudiante));
		
		System.out.println("\nCOLLECCION FILTRADA POR SEMESTRE Y GENERO USANDO METODOS DE STREAM");
		List<Estudiante> listSemesterGender = students.stream().filter(student -> student.getGender().equalsIgnoreCase("F") && student.getSemester() == 3).collect(Collectors.toList());
		listSemesterGender.forEach(estudiante -> System.out.println(estudiante));
		
		System.out.println("\nPRIMER ESTUDINTE EN LA COLECCION USANDO METODOS DE STREAM");
		System.out.println(listSemester.stream().findFirst().toString());
		
		System.out.println("\nCOLECCION DE ESTUDIANTES LLAMADOS JHON USANDO METODOS DE STREAM");
		List<Estudiante> jhon = sortName.stream().filter(t -> t.getName().equalsIgnoreCase("Jhon")).collect(Collectors.toList());
		System.out.println(jhon);
		
		System.out.println("\nCOLECCION DE ESTUDIANTES DE 2 A 5 SEMESTRE USANDO METODOS DE STREAM");
		List<Estudiante> listSemesterAt = students.stream().filter(student -> 3 <= student.getSemester() || student.getSemester() >= 5).collect(Collectors.toList());
		List<Estudiante> sortSemester = listSemesterAt.stream().sorted((n1, n2) -> Integer.compare(n1.getSemester(), n2.getSemester())).collect(Collectors.toList());
		sortSemester.forEach(estudiante -> System.out.println(estudiante));

		
		
		
		
	}
}
