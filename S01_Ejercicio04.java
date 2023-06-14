import java.util.Scanner;

public class S01_Ejercicio04 {
    public static void main(String[] args) {
        Scanner objTeclado = new Scanner(System.in);
        Rectangulo objRectangulo = new Rectangulo();
        
        System.out.print("Largo: ");
        objRectangulo.setLargo(objTeclado.nextInt());
        System.out.print("Ancho: ");
        objRectangulo.setAncho(objTeclado.nextInt());
        objTeclado.close();

        System.out.println("Perimetro:\t" + objRectangulo.getPerimetro());
        System.out.println("Area:\t" + objRectangulo.getArea());
        System.out.println("Diagonal:\t" + objRectangulo.getDiagonal());
    }
}
