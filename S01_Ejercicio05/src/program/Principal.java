package program;

import java.util.Scanner;
import models.Rectangulo;

/**
 *
 * @author Moisés
 */
public class Principal {
    /**
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Rectangulo rec = new Rectangulo();
        
        System.out.print("Largo: ");
        rec.setLargo(teclado.nextInt());
        System.out.print("Ancho: ");
        rec.setAncho(teclado.nextInt());
        
        System.out.println("Perimetro:\t" + rec.getPerimetro());
        System.out.println("Area:\t" + rec.getArea());
        System.out.println("Diagonal:\t" + rec.getDiagonal());
    }
}
