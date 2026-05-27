package registroAutomatico.modelo;

public class ProductoPerecedero extends Producto {
    private String fechaCaducidad;

    public ProductoPerecedero(String id, String nombre, double precio, Integer cantidad, String fechaCaducidad) {
        super(id, nombre, precio, cantidad);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() { return fechaCaducidad; }
    public void setFechaCaducidad(String fechaCaducidad) { this.fechaCaducidad = fechaCaducidad; }

    @Override
    public String obtenerDetalles() {
        return "Perecedero - ID: " + getId() + " | Nombre: " + getNombre() + " | Vence: " + fechaCaducidad;
    }
}