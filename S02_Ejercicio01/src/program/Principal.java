package program;

import views.FrmVenta;

/**
 * Clase principal que contiene el método main para iniciar la aplicación.
 *
 * @author Moisés
 */
public class Principal {
    /**
     * Método main que inicia la aplicación y muestra el formulario de registro.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // Instanciar el Formulario
        FrmVenta ventana = new FrmVenta();
        
        // Centrar la ventana en la pantalla
        ventana.setLocationRelativeTo(null);
        
        // Mostrar el Formulario
        ventana.setVisible(true);
    }
}
