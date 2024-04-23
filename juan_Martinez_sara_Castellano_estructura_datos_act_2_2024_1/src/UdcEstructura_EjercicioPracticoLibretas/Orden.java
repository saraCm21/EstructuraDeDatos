package UdcEstructura_EjercicioPracticoLibretas;

import java.time.LocalDate;
import java.util.Scanner;

public class Orden {
    private int consecutivo;
    private LocalDate fecha;
    private String cedulaCliente;
    private String medioPago;
    private String modalidad;
    private double descuento;
    private LibretaProductos listaProductos = new LibretaProductos();
    private double valorSinIVA;
    private double valorDescuento;
    private double valorIVA;
    private double valorTotal;
    private String estado = "Pendiente";

    public Orden() {
    }

    public Orden(int consecutivo, String cedulaCliente, String medioPago, String modalidad, double descuento) {
        this.consecutivo = consecutivo;
        this.fecha = LocalDate.now();
        this.cedulaCliente = cedulaCliente;
        this.medioPago = medioPago;
        this.modalidad = modalidad;
        this.descuento = descuento;
        this.listaProductos = addProduct();;
        this.valorSinIVA = getValorSinIVA();
        this.valorIVA = getValorIVA();
        this.valorDescuento = getValorDescuento();
        this.valorTotal = getValorTotal();
        this.estado = getEstado();
        
    }

    public LibretaProductos getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(LibretaProductos listaProductos) {
		this.listaProductos = listaProductos;
	}

	public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getValorSinIVA() {
    	
    	double total = 0;
    	NodoProductos aux = listaProductos.getInicio();
    	for (int i = 0; i < listaProductos.getSize(); i++) {
    		total = total + aux.getProductos().getPorcentajeDescuentoMax();
    		aux = aux.getSiguiente();
		}
        return total;
    }

    public void setValorSinIVA(double valorSinIVA) {
        this.valorSinIVA = valorSinIVA;
    }

    public double getValorDescuento() {
    	double valor = getValorIVA();
    	valorDescuento = (valor*descuento)/100;
        return valorDescuento;
    }

    public void setValorDescuento(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public double getValorIVA() {
    	double porcentaje;
    	double venta;
    	double valor = getValorSinIVA();
    	
    	porcentaje = (valor*19)/100;
    	venta = valor + porcentaje;
        return venta;
    }
    
    public double getIVA() {
    	double porcentaje;
    	double valor = getValorSinIVA();
    	
    	porcentaje = (valor*19)/100;
        return porcentaje;
    }

    public void setValorIVA(double valorIVA) {
        this.valorIVA = valorIVA;
    }

    public double getValorTotal() {
    	valorTotal = valorIVA - valorDescuento;
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public LibretaProductos addProduct() {
		
		Scanner teclado = new Scanner(System.in);
		String select;
		
		do {
			System.out.println("Ingrese el codigo");
			int codigo = teclado.nextInt();
			System.out.println("Ingrese el precio de venta");
			double precioV = teclado.nextDouble();
			System.out.println("Ingrese el porcentaje de descuento");
			double descuento = teclado.nextDouble();
			System.out.println("Ingrese las unidades del producto");
			int unidades = teclado.nextInt();
			
			Productos producto = new Productos(codigo, precioV, descuento, unidades);
			listaProductos.addProduct(producto);
			
			System.out.println("Desea agregar otro prducto - si/no");
			select = teclado.next();
		}while (select.equalsIgnoreCase("si"));
		
		return listaProductos;
	}
    
    @Override
    public String toString() {
    	return "Consecutivo: " + consecutivo + "\n" + "Fecha: " + fecha + "\n" + "Cedula del cliente: " + cedulaCliente + "\n" + "Metodo de pago: " + medioPago + "\n" + "Modalidad de compra: " + modalidad + "\n" + "Descuento de la compra: " + descuento + "\n" + "Total sin IVA: " + valorSinIVA + "\n" + "Total con IVA: " + valorIVA + "\n" + "Valor de descuento: " + valorDescuento + "\n" + "TOTAL: " + valorTotal + "\n" + "ITEMS" + "\n"  ;
    }
}
