import java.util.Scanner;

public class S01_Ejercicio03 {
    public static void main(String[] args) {
        // ENTRADA
        // Instanciar un objeto tipo Scanner
        Scanner objTeclado = new Scanner(System.in);
        // Leer el largo y el ancho desde el teclado
        System.out.print("Largo: ");
        int largo = objTeclado.nextInt();
        System.out.print("Ancho: ");
        int ancho = objTeclado.nextInt();
        objTeclado.close();

        // Instanciar mi clase Rectangulo
        Rectangulo objRectangulo = new Rectangulo();

        //Asignar valores a las propiedades
        objRectangulo.largo = largo;
        objRectangulo.ancho = ancho;

        // Ejecutar el método
        objRectangulo.imprimirResultados();
    }
}
