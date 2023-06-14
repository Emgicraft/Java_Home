public class Rectangulo {
    // Propiedades
    public int largo;
    public int ancho;

    //Métodos
    public void imprimirResultados() {
        // Realizar calculos
        int perimetro = 2*(this.largo + this.ancho);
        int area = this.largo*this.ancho;
        double diagonal = Math.sqrt(Math.pow(this.largo, 2) + Math.pow(this.ancho, 2));
        // Mostrar los resultados
        System.out.println("Perimetro:\t" + perimetro);
        System.out.println("Area:\t" + area);
        System.out.println("Diagonal:\t" + diagonal);
    }

    // Getters y Setters
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
        return diagonal;
    }
}
