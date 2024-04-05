
package principal;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import utils.BaseDatosMiguel;

public class Alerta_Eliminar_Encargado_Final extends javax.swing.JFrame {
    BaseDatosMiguel bdmiguel;
    
    public Alerta_Eliminar_Encargado_Final(String cedula) {
        this.bdmiguel = new BaseDatosMiguel();
        initComponents();
        initAlternComponents(cedula);
    }

    private void initAlternComponents(String cedula){
        texto_nombre.setText(bdmiguel.infoPersona(cedula));
        texto_cedula.setText(cedula);
        setTitle("Confirmación de eliminar encargado");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        
        
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_login.png")));
        
        Image icono_logo = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logosinfondo.png"));
        icono_logo = icono_logo.getScaledInstance(100, 99, Image.SCALE_SMOOTH);
        etq_logo.setIcon(new ImageIcon(icono_logo));
        
        revalidate();
        repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etq_titulo_eliminar = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        texto_cedula = new javax.swing.JLabel();
        texto_nombre = new javax.swing.JLabel();
        etq_logo = new javax.swing.JLabel();
        etq_titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(79, 108, 211));

        etq_titulo_eliminar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_titulo_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo_eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo_eliminar.setText("¿Estás seguro de eliminar este encargado?");

        btn_eliminar.setBackground(new java.awt.Color(239, 30, 30));
        btn_eliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("SI");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_cancelar.setBackground(new java.awt.Color(144, 177, 239));
        btn_cancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        texto_cedula.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        texto_cedula.setForeground(new java.awt.Color(255, 255, 255));
        texto_cedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto_cedula.setText("-----");

        texto_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        texto_nombre.setForeground(new java.awt.Color(255, 255, 255));
        texto_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto_nombre.setText("-----");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etq_titulo_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE))
                    .addComponent(texto_cedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(texto_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(etq_titulo_eliminar)
                .addGap(30, 30, 30)
                .addComponent(texto_nombre)
                .addGap(18, 18, 18)
                .addComponent(texto_cedula)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Eliminar encargado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(etq_titulo)
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        bdmiguel.eliminarPersona(texto_cedula.getText());
        Confirmacion nuevo = new Confirmacion("Encargado eliminado con éxito");
        dispose();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    
    public static void main(String args[]) {
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel etq_titulo_eliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel texto_cedula;
    private javax.swing.JLabel texto_nombre;
    // End of variables declaration//GEN-END:variables
}
