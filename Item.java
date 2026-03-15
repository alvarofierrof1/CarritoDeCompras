/**
 * Representa un producto individual con validaciones de precio.
 * @author TuNombre
 */
public class Item {
    // Uso de constantes (Hiperparámetros)
    private static final double PRECIO_MINIMO = 0.0;
    private static final double PRECIO_MAXIMO = 10000.0;

    private String nombre;
    private double precio;

    public Item(String nombre, double precio) {
        setNombre(nombre);
        setPrecio(precio);
    }

    public String getNombre() { return nombre; }
    
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }

    public void setPrecio(double precio) {
        if (precio < PRECIO_MINIMO || precio > PRECIO_MAXIMO) {
            throw new IllegalArgumentException("Precio no válido para el negocio.");
        }
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + " - " + CarritoDeCompras.MONEDA + precio;
    }
}
