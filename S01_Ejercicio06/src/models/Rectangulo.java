package models;

/**
 *
 * @author Moisés
 */
public class Rectangulo {
    // Propiedades
    private int largo;
    private int ancho;

    // Constructores
    public Rectangulo() {
        System.out.println("Este es el 1er constructor de Rectangulo.");
    }

    public Rectangulo(int l, int a) {
        System.out.println("Este es el 2do constructor de Rectangulo.");
        this.largo = l;
        this.ancho = a;
    }

    // Métodos
    // Getters y Setters
    // Encapsulados
    /**
     * Retorna el valor de la propiedad {@code largo}
     * 
     * @return {@code largo} -> Valor de tipo {@code int}
     */
    public int getLargo() {
        return largo;
    }

    public void setLargo(int valor) {
        this.largo = valor;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int valor) {
        this.ancho = valor;
    }

    // Calculos
    public int getPerimetro() {
        int perimetro = 2*(this.largo + this.ancho);
        return perimetro;
    }

    public int getArea() {
        int area = this.largo*this.ancho;
        return area;
    }

    public double getDiagonal() {
        double diagonal = Math.sqrt(Math.pow(this.largo, 2) + Math.pow(this.ancho, 2));
        return Math.round(diagonal*Math.pow(10, 4))/Math.pow(10, 4);
    }
}
