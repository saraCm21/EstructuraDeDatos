package UdcEstructura_EjercicioPracticoLibretas;

import java.time.LocalDate;

public class Compra {
	
    private int consecutivo;
    private LocalDate fecha;
    private String proveedor;
    private int codigoProducto;
    private double precioCompra;
    private double cantidad;
    private double valorSinIVA;
    private double valorIVA;
    private double valorTotal;

    public Compra() {
    }

    public Compra(int consecutivo, String proveedor, int codigoProducto, double precioCompra,int cantidad) {
        this.consecutivo = consecutivo;
        this.fecha = LocalDate.now();
        this.proveedor = proveedor;
        this.codigoProducto = codigoProducto;
        this.precioCompra = precioCompra;
        this.cantidad = cantidad;
        this.valorSinIVA = precioCompra;
        this.valorIVA = getValorIVA(precioCompra);
        this.valorTotal = getValorTotal(precioCompra);
    }

    public Compra(int consecutivo, String proveedor, int codigoProducto, double precioCompra, double cantidad, double valorSinIVA, double valorIVA, double valorTotal) {
        this.consecutivo = consecutivo;
        this.fecha = LocalDate.now();
        this.proveedor = proveedor;
        this.codigoProducto = codigoProducto;
        this.precioCompra = precioCompra;
        this.cantidad = cantidad;
        this.valorSinIVA = valorSinIVA;
        this.valorIVA = valorIVA;
        this.valorTotal = valorTotal;
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

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorSinIVA() {
        return valorSinIVA;
    }

    public void setValorSinIVA(double valorSinIVA) {
        this.valorSinIVA = valorSinIVA;
    }

    public double getValorIVA(double precio) {
    	
    	double porcentaje;
    	double venta;
    	
    	porcentaje = (precio*19)/100;
    	venta = precio + porcentaje;
        return venta;
    }

    public void setValorIVA(double valorIVA) {
        this.valorIVA = valorIVA;
    }

    public double getValorTotal(double precio) {
    	
    	double total = valorIVA * cantidad;
    	
        return total;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    @Override
    public String toString() {
    	return "Consecutivo: " + consecutivo + "\n" + "Fecha: " + fecha + "\n" + "Proovedor: " + proveedor + "\n" + "Codigo del producto: " + codigoProducto + "\n" + "Precio: " + precioCompra+ "\n" + "Cantidad: " + cantidad + "\n" + "Valor con IVA:" + valorIVA + "\n" + "Valor sin IVA: " + valorSinIVA + "\n" + "Total: " + valorTotal;
    }

}
