package registroAutomatico.modelo;

public abstract class Producto {
    private String id;
    private String nombre;
    private double precio;
    private Integer cantidad; // Usamos Integer para poder validar si es null

    public Producto(String id, String nombre, double precio, Integer cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Getters y Setters (Encapsulamiento)
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public Integer getCantidad() { return cantidad; }
    public void setCantidad(Integer cantidad) { this.cantidad = cantidad; }

    // Método abstracto para polimorfismo
    public abstract String obtenerDetalles();
}

