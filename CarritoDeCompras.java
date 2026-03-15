import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/**
 * Gestiona la lógica de los productos seleccionados y el cálculo del total.
 */
public class CarritoDeCompras {
    public static final String MONEDA = "€";
    private static final String CABECERA = "--- Detalles del carrito ---";

    // LinkedHashMap permite manejar Item -> Cantidad de forma eficiente
    private Map<Item, Integer> items;

    public CarritoDeCompras() {
        this.items = new LinkedHashMap<>();
    }

    public void agregarItem(Item item, int cantidad) {
        items.put(item, items.getOrDefault(item, 0) + cantidad);
    }

    public void removerItem(Item item) {
        if (!items.containsKey(item)) {
            throw new NoSuchElementException("El item no existe en el carrito.");
        }
        items.remove(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (Map.Entry<Item, Integer> entry : items.entrySet()) {
            total += entry.getKey().getPrecio() * entry.getValue();
        }
        return total;
    }

    public void mostrarCarrito() {
        System.out.println(CABECERA);
        items.forEach((item, cantidad) -> 
            System.out.println(item.toString() + " | Cantidad: " + cantidad));
        System.out.println("Total: " + MONEDA + calcularTotal());
    }
}
