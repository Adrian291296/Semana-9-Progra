package registroAutomatico.modelo;

public class ProductoNoPerecedero extends Producto {
    private int mesesGarantia;

    public ProductoNoPerecedero(String id, String nombre, double precio, Integer cantidad, int mesesGarantia) {
        super(id, nombre, precio, cantidad);
        this.mesesGarantia = mesesGarantia;
    }

    public int getMesesGarantia() { return mesesGarantia; }
    public void setMesesGarantia(int mesesGarantia) { this.mesesGarantia = mesesGarantia; }

    @Override
    public String obtenerDetalles() {
        return "No Perecedero - ID: " + getId() + " | Nombre: " + getNombre() + " | Garantía: " + mesesGarantia + " meses";
    }
}