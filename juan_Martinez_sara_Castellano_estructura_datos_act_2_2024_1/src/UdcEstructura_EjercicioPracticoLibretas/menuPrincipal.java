package UdcEstructura_EjercicioPracticoLibretas;

import java.util.Scanner;

public class menuPrincipal {

	public static void main(String[] args) {
		
		LibretaCompras listaCompras = new LibretaCompras();
		LibretaProductos listaProductos = new LibretaProductos();
		LibretaClientes listaClientes = new LibretaClientes();
		OrdenDeCompra listaOrden = new OrdenDeCompra();
		menu(listaCompras, listaProductos, listaClientes, listaOrden);
	}
	
	private static void menu(LibretaCompras listaCompras, LibretaProductos listaProductos, LibretaClientes listaClientes, OrdenDeCompra listaOrden) {
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("*** MENU PRINCIPAL***");
			System.out.println("Elija una opcion");
			System.out.println("Agregar un nuevo producto a la libreta - 1");
			System.out.println("Agregar una nueva compra a la libreta - 2");
			System.out.println("Agregar un nuevo cliente a la libreta - 3");
			System.out.println("Agregar una nueva orden de compra - 4");
			System.out.println("Actualizar Producto - 5");
			System.out.println("Lista de productos por comprar - 6");
			System.out.println("Mostrar lista de publicidad - 7");
			System.out.println("Mostrar libreta de productos - 8");
			System.out.println("Mostrar libreta de compras - 9");
			System.out.println("Mostrar libreta de clientes - 10");
			System.out.println("Balance financiero - 11");
			int option = teclado.nextInt();
			
			switch (option) {
			case 1: {
				addProduct(listaProductos);
				menu(listaCompras,listaProductos, listaClientes, listaOrden);
				break;
			}case 2: {
				addBuy(listaCompras);
				menu(listaCompras, listaProductos, listaClientes, listaOrden);
				break;
			}case 3: {
				addConstumer(listaClientes);
				menu(listaCompras, listaProductos, listaClientes, listaOrden);
				break;
			}case 4: {
				addOrder(listaOrden, listaClientes, listaProductos);
				menu(listaCompras, listaProductos, listaClientes, listaOrden);
				break;
			}case 5: {
				updateProduct(listaProductos);
				menu(listaCompras, listaProductos, listaClientes, listaOrden);
				break;
			}case 6: {
				listaProductosComprar(listaProductos);
				menu(listaCompras, listaProductos, listaClientes, listaOrden);
				break;
			}case 7: {
				showAdvertising(listaProductos);
				menu(listaCompras, listaProductos, listaClientes, listaOrden);
				break;
			}case 8: {
				showListaProductos(listaProductos);
				menu(listaCompras, listaProductos, listaClientes, listaOrden);
				break;
			}case 9: {
				showListaCompras(listaCompras);
				menu(listaCompras, listaProductos, listaClientes, listaOrden);
				break;
			}case 10: {
				showListaCliente(listaClientes);
				menu(listaCompras, listaProductos, listaClientes, listaOrden);
				break;
			}case 11: {
				balanceFinanciero(listaProductos, listaOrden);
				menu(listaCompras, listaProductos, listaClientes, listaOrden);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + option);
			}
		}
	}
	
	private static void addProduct(LibretaProductos listaProductos) {
		
		Scanner teclado = new Scanner(System.in);
		String select;
		
		do {
			System.out.println("Ingrese el codigo");
			int codigo = teclado.nextInt();
			if (listaProductos.reviewProduc(codigo)) {
				System.out.println("El producto ya esta registrado");
				break;
			}
			System.out.println("Ingrese el nombre");
			String nombre = teclado.next();
			System.out.println("Ingrese la marca");
			String marca = teclado.next();
			System.out.println("Ingrese el color");
			String color = teclado.next();
			System.out.println("Ingrese el precio de compra");
			double precioC = teclado.nextDouble();
			System.out.println("Ingrese el porcentaje de descuento");
			double descuento = teclado.nextDouble();
			System.out.println("Ingrese las unidades del producto");
			int unidades = teclado.nextInt();
			System.out.println("Ingrese la unidad de medida");
			String medida = teclado.next();
			System.out.println("Ingrese la categoria");
			String categoria = teclado.next();
			
			Productos producto = new Productos(codigo, nombre, marca, color, precioC, descuento, unidades, medida, categoria);
			listaProductos.addProduct(producto);
			
			System.out.println("Desea agregar otro prducto - si/no");
			select = teclado.next();
		}while (select.equalsIgnoreCase("si"));
		
	}
	
	private static void addBuy(LibretaCompras listaCompras) {
		
		Scanner teclado = new Scanner(System.in);
		String select;
		
		do {
			System.out.println("Ingrese el consecutivo");
			int consecutivo = teclado.nextInt(); 
			System.out.println("Ingrese el proovedor");
			String proveedor = teclado.next();
			System.out.println("Ingrese el codigo");
			int codigo = teclado.nextInt();
			System.out.println("Ingrese el precio");
			double precio = teclado.nextDouble();
			System.out.println("Ingrese la cantidad");
			int cantidad = teclado.nextInt();
			
			
			Compra compra = new Compra(consecutivo, proveedor, codigo, precio, cantidad);
			listaCompras.addBuys(compra);
			
			System.out.println("Desea agregar otro prducto - si/no");
			select = teclado.next();
		}while (select.equalsIgnoreCase("si"));
		
	}
	
	private static void addConstumer(LibretaClientes listaClientes) {
		
		Scanner teclado = new Scanner(System.in);
		String select;
		
		do {
			System.out.println("Ingrese la cedula");
			String cedula = teclado.next();
			if (listaClientes.reviewCostumer(cedula)) {
				System.out.println("");
				System.out.println("El cliente ya esta registrado");
				System.out.println("");
				break;
			}
			System.out.println("Ingrese el nombre");
			String nombre = teclado.next();
			System.out.println("Ingrese los apellidos");
			String apellidos = teclado.next();
			System.out.println("Ingrese el genero");
			String genero = teclado.next();
			System.out.println("Ingrese la fecha");
			String fecha = teclado.next();
			System.out.println("Ingrese el telefono");
			String telefono = teclado.next();
			System.out.println("Ingrese el Email");
			String email = teclado.next();
			System.out.println("Ingrese la direccion");
			String direccion =teclado.next();
			
		
			Cliente cliente = new Cliente(cedula, nombre, apellidos, genero, fecha, telefono, email, direccion);
			listaClientes.addCostumer(cliente);
			
			System.out.println("Desea agregar otro cliente - si/no");
			select = teclado.next();
		}while (select.equalsIgnoreCase("si"));
		
	}
	
	private static void addOrder(OrdenDeCompra listaOrden, LibretaClientes listaClientes, LibretaProductos listaProductos){
		
		Scanner teclado = new Scanner(System.in);
		String select;
		
		do {
			System.out.println("Ingrese el consecutivo");
			int cosecutivo = teclado.nextInt();
			System.out.println("Ingrese la cedula");
			String cedula = teclado.next();
			if (listaClientes.reviewCostumer(cedula) == false) {
				System.out.println("EL CLIENTE NO EXISTE, DEBE REGISTRARLO");
				break;
			}
			listaClientes.getCostumer(cedula).setNumeroDeCompras(listaClientes.getCostumer(cedula).getNumeroDeCompras());
			System.out.println("Ingrese el metodo de pago");
			String medioPago = teclado.next();
			System.out.println("Ingrese la modalidad de compra");
			String modalidad = teclado.next();
			System.out.println("Ingrese el descuento de la compra");
			double descuento = teclado.nextDouble();
			
			Orden orden = new Orden(cosecutivo, cedula, medioPago, modalidad, descuento);
			listaOrden.addOrder(orden);
			
			NodoProductos aux2 = listaProductos.getInicio();
			NodoProductos aux = orden.getListaProductos().getInicio();
			
			int unidades;
			int unidadesEnExistencia;
			int total;
			
			for (int i = 0; i < orden.getListaProductos().getSize(); i++) {
				unidades = aux.getProductos().getUnidadesExistencia();
				for (int j = 0; j < listaProductos.getSize(); j++) {
					if(aux.getProductos().getCodigo() == aux2.getProductos().getCodigo()) {
						unidadesEnExistencia = aux2.getProductos().getUnidadesExistencia();
						total = unidadesEnExistencia - unidades;
						aux2.getProductos().setUnidadesExistencia(total);
					}
					aux2 = aux2.getSiguiente();
				}
				aux = aux.getSiguiente();
			}
			
			System.out.println("Desea agregar otra orden - si/no");
			select = teclado.next();
		}while (select.equalsIgnoreCase("si"));
		
	}
	
	private static void updateProduct(LibretaProductos listaProductos){
		
		Scanner teclado = new Scanner(System.in);
		NodoProductos aux = listaProductos.getInicio();
		boolean review = false;
		
		System.out.println("Ingrese el el codigo del producto");
		int codigo = teclado.nextInt();
		
		for (int i = 0; i < listaProductos.getSize() && aux != null; i++) {
			if (aux.getProductos().getCodigo() == codigo) {
				System.out.println("Precio de compra");
				int precio = teclado.nextInt();
				System.out.println("Porcentaje maximo de descuento");
				double porcentaje = teclado.nextDouble();
				System.out.println("Cantidad de unidades");
				int unidades = teclado.nextInt();
				
				aux.getProductos().update(precio, porcentaje, unidades);
				review = true;
				break;
			}
		}
		
		if (review == false) {
			System.out.println("No se encontro en codigo");
		}
		
	}
	
	private static void listaProductosComprar(LibretaProductos listaProductos){
		
		NodoProductos aux = listaProductos.getInicio();
		
		for (int i = 0; i <= listaProductos.getSize() && aux != null; i++) {
			if (aux.getProductos().getUnidadesExistencia() < 5) {
				
				System.out.println("Codigo " + aux.getProductos().getCodigo() + ", " + "Nombre " + aux.getProductos().getNombre() + ", " + "Unidades disponibles " + aux.getProductos().getUnidadesExistencia());
			}
			aux = aux.getSiguiente();
		}
		
		System.out.println("");
		
	}
	
	private static void showListaProductos(LibretaProductos lista){
		lista.show();
	}
	
	private static void showListaCompras(LibretaCompras lista){
		lista.show();
	}

	private static void showListaCliente(LibretaClientes lista){
		lista.show();
	}
	
	private static void showAdvertising(LibretaProductos listaProductos){
		
		ListaPublicidad lista = new ListaPublicidad();
		lista.addProduct(listaProductos);
		lista.show();
		
	}

	private static void balanceFinanciero(LibretaProductos listaProductos, OrdenDeCompra listaOrdenes){
		double totalInvertido = 0;
		double totalVentas = 0;
		double totalDescuento = 0;
		double totalIVA = 0;
		NodoProductos aux  = listaProductos.getInicio();
		NodoOrden aux2 = listaOrdenes.getInicio();
		
		for (int i = 0; i <= listaProductos.getSize() && aux != null; i++) {
			totalInvertido = totalInvertido + aux.getProductos().getTotal();
			aux = aux.getSiguiente();
		}
		
		System.out.println("El total del dinero invertido es: " + totalInvertido);
		
		for (int i = 0; i <= listaOrdenes.getSize() && aux2 != null; i++) {
			totalVentas = totalVentas + aux2.getOrder().getValorTotal();
			aux2 = aux2.getSiguiente();
		}
		
		System.out.println("El total de las ventas fue: " + totalVentas);
		
		aux2 = listaOrdenes.getInicio();
		
		for (int i = 0; i <= listaOrdenes.getSize() && aux2 != null; i++) {
			totalDescuento = totalDescuento + aux2.getOrder().getValorDescuento();
			aux2 = aux2.getSiguiente();
		}
		
		System.out.println("El total de descuentos: " + totalDescuento);
		
		aux2 = listaOrdenes.getInicio();
		
		for (int i = 0; i <= listaOrdenes.getSize() && aux2 != null; i++) {
			totalIVA = totalIVA + aux2.getOrder().getIVA();
			aux2 = aux2.getSiguiente();
		}
		
		System.out.println("El total pagado en impuestos: " + totalIVA);
	}
}

