import java.util.Scanner;

public class S01_Ejercicio02 {
    public static void main(String[] args) {
        // ENTRADA
        // Instanciar un objeto tipo Scanner
        Scanner objTeclado = new Scanner(System.in);
        // Leer el largo y el ancho desde el teclado
        System.out.print("Largo: ");
        int largo = objTeclado.nextInt();
        System.out.print("Ancho: ");
        int ancho = objTeclado.nextInt();

        // PROCESO
        // Realizar calculos
        int perimetro = 2*(largo + ancho);
        int area = largo*ancho;
        double diagonal = Math.sqrt(Math.pow(largo, 2) + Math.pow(ancho, 2));

        // SALIDA
        // Imprimir los resultados
        System.out.println("Perimetro:\t" + perimetro);
        System.out.println("Area:\t" + area);
        System.out.println("Diagonal:\t" + diagonal);

        objTeclado.close();
    }
}
