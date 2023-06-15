package program;

import views.FrmRectangulo;

/**
 *
 * @author Moisés
 */
public class Principal {
    /**
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // Instanciar el Formulario
        FrmRectangulo ventana = new FrmRectangulo();
        // Centrar la ventana en la pantalla
        ventana.setLocationRelativeTo(null);
        // Mostrar el Formulario
        ventana.setVisible(true);
    }
}
