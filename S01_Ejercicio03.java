import java.util.Scanner;

public class S01_Ejercicio03 {
    public static void main(String[] args) {
        // ENTRADA
        // Instanciar un objeto tipo Scanner
        Scanner objTeclado = new Scanner(System.in);
        // Instanciar mi clase Rectangulo
        Rectangulo objRectangulo = new Rectangulo();
        // Asignar valores a las propiedades
        // Leeyendo el largo y el ancho desde el teclado
        System.out.print("Largo: ");
        objRectangulo.largo = objTeclado.nextInt();
        System.out.print("Ancho: ");
        objRectangulo.ancho = objTeclado.nextInt();
        objTeclado.close();

        // Ejecutar el método
        objRectangulo.imprimirResultados();
    }
}
