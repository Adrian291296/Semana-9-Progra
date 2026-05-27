import registroAutomatico.modelo.*;
import registroAutomatico.negocio.GestorInventario;


void main() {
    GestorInventario gestor = new GestorInventario();

    System.out.println("--- PRUEBA CP1: Validación de registro ---");
    try {
        // Simulamos el ingreso de datos faltantes (cantidad vacía/null)
        Producto pInvalido = new ProductoNoPerecedero("001", "Tornillo", 0.50, null, 12);
        gestor.registrarProducto(pInvalido);
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage()); // Debe mostrar el error de cantidad obligatoria
    }

    System.out.println("\n--- PRUEBA: Registro exitoso usando Polimorfismo ---");
    try {
        Producto p1 = new ProductoPerecedero("002", "Leche", 1.20, 50, "2026-06-01");
        Producto p2 = new ProductoNoPerecedero("003", "Martillo", 15.00, 10, 24);

        gestor.registrarProducto(p1);
        gestor.registrarProducto(p2);
        gestor.listarProductos();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
