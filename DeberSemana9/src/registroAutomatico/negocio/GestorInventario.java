package registroAutomatico.negocio;
import registroAutomatico.modelo.Producto;
import java.util.ArrayList;
import java.util.List;

public class GestorInventario {
    private List<Producto> inventario;

    public GestorInventario() {
        this.inventario = new ArrayList<>();
    }

    // Funcionalidad RF1: Registrar nuevo producto
    public void registrarProducto(Producto p) throws IllegalArgumentException {
        if (p.getNombre() == null || p.getNombre().isEmpty()) {
            throw new IllegalArgumentException("Error: El nombre es obligatorio.");
        }
        if (p.getCantidad() == null) {
            throw new IllegalArgumentException("Error: La cantidad es obligatoria.");
        }
        inventario.add(p);
        System.out.println("Producto registrado con éxito: " + p.getNombre());
    }

    public void listarProductos() {
        System.out.println("\n--- Inventario Actual ---");
        for (Producto p : inventario) {
            // Uso de Polimorfismo
            System.out.println(p.obtenerDetalles() + " | Cantidad: " + p.getCantidad());
        }
    }
}