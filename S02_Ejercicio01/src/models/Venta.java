package models;

/**
 *
 * @author Moisés
 */
public class Venta {
    // Propiedades
    Producto producto;
    int cantidad;
    
    // Constructores
    public Venta() {
    }
    
    public Venta(Producto prod, int cant) {
        this.producto = prod;
        this.cantidad = cant;
    }
    
    // Métodos
    public double total() {
        return this.producto.getPrecio() * this.cantidad;
    }
    
    // Getters y Setters
    /**
     * @return El producto
     */
    public Producto getProducto() {
        return this.producto;
    }

    /**
     * @param producto El producto a fijar
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * @return La cantidad
     */
    public int getCantidad() {
        return this.cantidad;
    }

    /**
     * @param cantidad La cantidad a fijar
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
