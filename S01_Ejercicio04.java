import java.util.Scanner;

public class S01_Ejercicio04 {
    public static void main(String[] args) {
        Scanner objTeclado = new Scanner(System.in);
        
        System.out.print("Largo: ");
        int largo = objTeclado.nextInt();
        System.out.print("Ancho: ");
        int ancho = objTeclado.nextInt();
        objTeclado.close();

        Rectangulo objRectangulo = new Rectangulo(largo, ancho);

        System.out.println("Perimetro:\t" + objRectangulo.getPerimetro());
        System.out.println("Area:\t" + objRectangulo.getArea());
        System.out.println("Diagonal:\t" + objRectangulo.getDiagonal());
    }
}
