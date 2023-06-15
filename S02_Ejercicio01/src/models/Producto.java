package models;

/**
 *
 * @author Moisés
 */
public class Producto {
    // Propiedades
    private int codigo;
    private String descripcion;
    private double precio;
    
    // Constructores
    public Producto() {}
    
    public Producto(int cod, String descr, double prec) {
        this.codigo = cod;
        this.descripcion = descr;
        this.precio = prec;
    }
    
    // Métodos
    public void getBuscarByCodigo() {
        // ***** Creamos nuestra Data *****
        Producto p1 = new Producto(10, "Televisor", 1500.0);
        Producto p2 = new Producto(20, "Regriferador", 900.0);
        Producto p3 = new Producto(30, "Licuadora", 350.0);
        Producto p4 = new Producto(40, "Cocina", 800.0);
        Producto p5 = new Producto(50, "Lavadora", 750.0);
    }
    
    // Encapsulados
    /**
     * @return El codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo El codigo a fijar
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return La descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion La descripcion a fijar
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return El precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio El precio a fijar
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
