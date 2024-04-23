package UdcEstructura_EjercicioPracticoLibretas;

public class Productos {
	   private int codigo;
	    private String nombre;
	    private String marca;
	    private String color;
	    private double precioCompra;
	    private double precioVenta;
	    private double porcentajeDescuentoMax;
	    private int unidadesExistencia;
	    private String metricaMedida;
	    private String categoria;
	    private double total;

	    public Productos() {
	    }

	    public Productos(int codigo, String nombre, String marca, String color, double precioCompra, double porcentajeDescuentoMax, int unidadesExistencia, String metricaMedida, String categoria) {
	        this.codigo = codigo;
	        this.nombre = nombre;
	        this.marca = marca;
	        this.color = color;
	        this.precioCompra = precioCompra;
	        this.precioVenta = getPrecioVenta(precioCompra);
	        this.porcentajeDescuentoMax = porcentajeDescuentoMax;
	        this.unidadesExistencia = unidadesExistencia;
	        this.metricaMedida = metricaMedida;
	        this.categoria = categoria;
	    }
	    
	    public Productos(int codigo, double precioVenta, double porcentajeDescuentoMax, int unidadesExistencia) {
	        this.codigo = codigo;
	        this.precioVenta = precioVenta;
	        this.porcentajeDescuentoMax = PorcentajeDescuentoMax(porcentajeDescuentoMax);
	        this.unidadesExistencia = unidadesExistencia;
	    }

	    public int getCodigo() {
	        return codigo;
	    }

	    public void setCodigo(int codigo) {
	        this.codigo = codigo;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getMarca() {
	        return marca;
	    }

	    public void setMarca(String marca) {
	        this.marca = marca;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public double getPrecioCompra() {
	        return precioCompra;
	    }

	    public void setPrecioCompra(double precioCompra) {
	        this.precioCompra = precioCompra;
	    }

	    public double getPrecioVenta(double precioCompra2) {
	    	
	    	double venta;
	    	double porcentaje;
	    	
	    	porcentaje = (precioCompra2 * 40)/100;
	    	venta = porcentaje + precioCompra2;
	        return venta;
	    }

	    public void setPrecioVenta(double precioVenta) {
	        this.precioVenta = precioVenta;
	    }

	    public double PorcentajeDescuentoMax(double porcentajeDescuentoMax) {
	    	double venta;
	    	double porcentaje;
	    	
	    	porcentaje = (precioVenta * porcentajeDescuentoMax)/100;
	    	venta = precioVenta - porcentaje;
	        return venta;
	    }
	    
	    public double getPorcentajeDescuentoMax() {
	        return porcentajeDescuentoMax;
	    }

	    public void setPorcentajeDescuentoMax(double porcentajeDescuentoMax) {
	        this.porcentajeDescuentoMax = porcentajeDescuentoMax;
	    }

	    public int getUnidadesExistencia() {
	        return unidadesExistencia;
	    }

	    public void setUnidadesExistencia(int unidadesExistencia) {
	        this.unidadesExistencia = unidadesExistencia;
	    }

	    public String getMetricaMedida() {
	        return metricaMedida;
	    }

	    public void setMetricaMedida(String metricaMedida) {
	        this.metricaMedida = metricaMedida;
	    }

	    public String getCategoria() {
	        return categoria;
	    }

	    public void setCategoria(String categoria) {
	        this.categoria = categoria;
	    }
	    
	    public void update(double precioC, double porcentaje, int unidades){
	    	setPrecioCompra(precioC);
	    	setPorcentajeDescuentoMax(porcentaje);
	    	int unidadesE = unidades + getUnidadesExistencia();
	    	setUnidadesExistencia(unidadesE);
	    }
	    
	    public double getTotal() {
	    	total = precioCompra * unidadesExistencia;
			return total;
		}

		public void setTotal(double total) {
			this.total = total;
		}

		@Override
	    public String toString() {
	    	// TODO Auto-generated method stub
	    	return "Codigo: " + codigo + "\n" + "Nombre: " + nombre + "\n" + "Marca: " + marca +"\n" +  "Color: " + color + "\n" + "Medida: " + metricaMedida + "\n" + "Precio de compra: " + precioCompra + "\n" + "Precio de venta: " + precioVenta + "\n" + "Descuento: " + porcentajeDescuentoMax  + "\n" + "Unidades existentes: " + unidadesExistencia + "\n" + "Categoria: " + categoria + "\n";
	    }
}

