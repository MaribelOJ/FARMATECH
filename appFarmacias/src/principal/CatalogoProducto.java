
package principal;

import utils.BaseDatos;
import java.sql.Date;
import java.text.SimpleDateFormat;
import utils.BaseDatosCristian;



public class CatalogoProducto extends javax.swing.JPanel {
    BaseDatos bd;
    public CatalogoProducto(BaseDatos bd) {
        this.bd = bd;
        initComponents();
    }

    CatalogoProducto(BaseDatosCristian bd) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void InitAlternComponents(){
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoBuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jButton1.setBackground(new java.awt.Color(34, 30, 239));
        jButton1.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jButton1.setText("BUSCAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(446, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoBuscar;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
