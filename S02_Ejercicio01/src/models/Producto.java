package models;

import java.util.ArrayList;

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
    public Producto getBuscarByCodigo(int codBuscado) {
        // ***** Data de Productos *****
        // Instanciar 5 productos
        Producto p1 = new Producto(10, "Televisor", 1250.0);
        Producto p2 = new Producto(20, "Regriferador", 900.0);
        Producto p3 = new Producto(30, "Licuadora", 350.0);
        Producto p4 = new Producto(40, "Cocina", 800.0);
        Producto p5 = new Producto(50, "Lavadora", 750.0);
        
        // Instanciar un ArrayList de Productos
        ArrayList<Producto> listaProductos = new ArrayList();
        
        // Agregar los productos a la lista
        listaProductos.add(p1);
        listaProductos.add(p2);
        listaProductos.add(p3);
        listaProductos.add(p4);
        listaProductos.add(p5);
        
        // Instanciar variable Producto
        Producto prod = new Producto();
        
        // Busqueda del producto
        for (Producto p : listaProductos) {
            if (p.getCodigo() == codBuscado) {
                prod = p; break;
            }
        }
        
        return prod;
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
