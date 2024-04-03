package principal;


import java.awt.Image;
import javax.swing.ImageIcon;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Confirmacion extends javax.swing.JFrame {
    String texto;
    
    public Confirmacion(String text) {
        this.texto = text;
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont_principal = new javax.swing.JPanel();
        etq_mensaje = new javax.swing.JLabel();
        btn_okay = new javax.swing.JButton();
        etq_icono = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cont_principal.setBackground(new java.awt.Color(79, 108, 211));

        etq_mensaje.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etq_mensaje.setForeground(new java.awt.Color(255, 255, 255));
        etq_mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btn_okay.setBackground(new java.awt.Color(144, 177, 239));
        btn_okay.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_okay.setForeground(new java.awt.Color(255, 255, 255));
        btn_okay.setText("Okay");
        btn_okay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cont_principalLayout = new javax.swing.GroupLayout(cont_principal);
        cont_principal.setLayout(cont_principalLayout);
        cont_principalLayout.setHorizontalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                        .addComponent(btn_okay, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                        .addComponent(etq_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                        .addComponent(etq_icono, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))))
        );
        cont_principalLayout.setVerticalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(etq_icono, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_okay, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void initAlternComponents(){
        setLocation(700,350);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Confirmación");
        
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_confirmation.png") ) );

        Image img_confirmation = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_confirmation.png") );
        img_confirmation = img_confirmation.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        etq_icono.setIcon(new ImageIcon(img_confirmation));
              
        etq_mensaje.setText(texto);
    }
    
    private void btn_okayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okayActionPerformed
        dispose();
    }//GEN-LAST:event_btn_okayActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_okay;
    private javax.swing.JPanel cont_principal;
    private javax.swing.JLabel etq_icono;
    private javax.swing.JLabel etq_mensaje;
    // End of variables declaration//GEN-END:variables
}
