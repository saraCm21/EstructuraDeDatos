package UdcEstructura_EjercicioPracticoLibretas;

public class Cliente {

    private String cedula;
    private String nombre;
    private String apellidos;
    private String genero;
    private String fechaNacimiento;
    private String telefono;
    private String email;
    private String direccion;
    private String estado;
    private int numeroDeCompras = 0;
    public Cliente() {
    }

    public Cliente(String cedula, String nombre, String apellidos, String genero, String fechaNacimiento, String telefono, String email, String direccion) {
        this.cedula = cedula; 
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.numeroDeCompras = getNumeroDeCompras();
        this.estado = getEstado();
        
    }

	public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
    	
    	if (numeroDeCompras == 0) {
    		estado = "referido";
    		return estado;
    	}else {
    		estado = "VIP";
    		return estado;
    	}
    	
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumeroDeCompras() {
        return numeroDeCompras;
    }

    public void setNumeroDeCompras(int numeroDeCompras) {
    	
    	numeroDeCompras ++;
        this.numeroDeCompras = numeroDeCompras;
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "Cedula:" + cedula + "\n" + "Nombre: " + nombre + "\n" + "Apellidos: " + apellidos + "\n" + "Genero: " + genero + "\n" + "Fecha: " + fechaNacimiento + "\n" + "Telefono: " + telefono + "\n" + "Email: " + email + "\n" + "Direccion: " + direccion + "\n" + "Numero de compras: " + numeroDeCompras + "\n" + "Estado: " + getEstado() + "\n" ;
    }
}
