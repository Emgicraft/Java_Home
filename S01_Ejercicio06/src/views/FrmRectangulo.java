package views;

import models.Rectangulo;

/**
 *
 * @author Moisés
 */
public class FrmRectangulo extends javax.swing.JFrame {
    /**
     * Crea un nuevo formulario FrmRectangulo
     */
    public FrmRectangulo() {
        initComponents();
    }

    /**
     * Este método es llamado desde el constructor para inicializar el formulario.
     * ADVERTENCIA: NO modifique este código. El contenido de este método siempre
     * es regenerado por el Editor de formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtLargo = new javax.swing.JTextField();
        txtAncho = new javax.swing.JTextField();
        etiLargo = new javax.swing.JLabel();
        etiAncho = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        txtPerimetro = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        etiPerimetro = new javax.swing.JLabel();
        etiArea = new javax.swing.JLabel();
        txtDiagonal = new javax.swing.JTextField();
        etiDiagonal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rectangulo - Operaciones");
        setName("frameRectangulo"); // NOI18N

        txtLargo.setText("0");

        txtAncho.setText("0");

        etiLargo.setText("Largo:");

        etiAncho.setText("Ancho:");

        btnCalcular.setText("Calcular");
        btnCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcularMouseClicked(evt);
            }
        });

        txtPerimetro.setText("0");

        txtArea.setText("0");

        etiPerimetro.setText("Perimetro:");

        etiArea.setText("Área:");

        txtDiagonal.setText("0");

        etiDiagonal.setText("Diagonal:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiDiagonal)
                    .addComponent(etiLargo)
                    .addComponent(etiAncho)
                    .addComponent(etiPerimetro)
                    .addComponent(etiArea))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtLargo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAncho, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular)
                    .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiagonal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiLargo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiAncho))
                .addGap(18, 18, 18)
                .addComponent(btnCalcular)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiPerimetro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiArea))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiagonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiDiagonal))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseClicked
        // Leer los valores de las cajas de texto
        int largo = Integer.parseInt(txtLargo.getText());
        int ancho = Integer.parseInt(txtAncho.getText());
        
        // Instanciar la clase Rectangulo
        Rectangulo rec = new Rectangulo(largo, ancho);
        
        // Ejecutar los métodos para mostrar los valores en las cajas de texto
        txtPerimetro.setText(String.valueOf(rec.getPerimetro()));
        txtArea.setText(String.valueOf(rec.getArea()));
        txtDiagonal.setText(String.valueOf(rec.getDiagonal()));
    }//GEN-LAST:event_btnCalcularMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel etiAncho;
    private javax.swing.JLabel etiArea;
    private javax.swing.JLabel etiDiagonal;
    private javax.swing.JLabel etiLargo;
    private javax.swing.JLabel etiPerimetro;
    private javax.swing.JTextField txtAncho;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtDiagonal;
    private javax.swing.JTextField txtLargo;
    private javax.swing.JTextField txtPerimetro;
    // End of variables declaration//GEN-END:variables
}
