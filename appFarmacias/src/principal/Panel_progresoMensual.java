
package principal;


public class Panel_progresoMensual extends javax.swing.JPanel {

    public Panel_progresoMensual() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont_barras = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mes1 = new javax.swing.JLabel();
        bar_mes1 = new javax.swing.JProgressBar();
        mes2 = new javax.swing.JLabel();
        bar_mes2 = new javax.swing.JProgressBar();
        mes3 = new javax.swing.JLabel();
        bar_mes3 = new javax.swing.JProgressBar();
        mes4 = new javax.swing.JLabel();
        bar_mes4 = new javax.swing.JProgressBar();

        cont_barras.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Progreso Mensual");

        mes1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mes1.setText("Enero:");

        mes2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mes2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mes2.setText("Febrero:");

        mes3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mes3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mes3.setText("Marzo:");

        mes4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mes4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mes4.setText("Abril:");

        javax.swing.GroupLayout cont_barrasLayout = new javax.swing.GroupLayout(cont_barras);
        cont_barras.setLayout(cont_barrasLayout);
        cont_barrasLayout.setHorizontalGroup(
            cont_barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_barrasLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(cont_barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_barrasLayout.createSequentialGroup()
                        .addComponent(mes3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(bar_mes3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cont_barrasLayout.createSequentialGroup()
                        .addComponent(mes2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(bar_mes2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cont_barrasLayout.createSequentialGroup()
                        .addComponent(mes1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(bar_mes1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cont_barrasLayout.createSequentialGroup()
                        .addComponent(mes4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(bar_mes4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        cont_barrasLayout.setVerticalGroup(
            cont_barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_barrasLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(cont_barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cont_barrasLayout.createSequentialGroup()
                        .addComponent(mes1)
                        .addGap(34, 34, 34)
                        .addComponent(mes2)
                        .addGap(8, 8, 8))
                    .addGroup(cont_barrasLayout.createSequentialGroup()
                        .addComponent(bar_mes1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bar_mes2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(cont_barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_barrasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(bar_mes3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(cont_barrasLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(mes3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(cont_barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bar_mes4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cont_barrasLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(mes4)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_barras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_barras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar_mes1;
    private javax.swing.JProgressBar bar_mes2;
    private javax.swing.JProgressBar bar_mes3;
    private javax.swing.JProgressBar bar_mes4;
    private javax.swing.JPanel cont_barras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mes1;
    private javax.swing.JLabel mes2;
    private javax.swing.JLabel mes3;
    private javax.swing.JLabel mes4;
    // End of variables declaration//GEN-END:variables
}
