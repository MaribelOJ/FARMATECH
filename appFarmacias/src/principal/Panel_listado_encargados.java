package principal;
import java.awt.Image;
import javax.swing.ImageIcon;
import utils.BaseDatos;
import utils.Usuario;

public class Panel_listado_encargados extends javax.swing.JPanel {
    
    BaseDatos bd;
    
    public Panel_listado_encargados() {
        this.bd = bd;
        initComponents();
        initAlternComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_titulo = new javax.swing.JLabel();
        etq_logo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(791, 750));

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Lista de los encargados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(546, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void initAlternComponents(){
        
        Image icono_logo = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logoFT.png"));
        icono_logo = icono_logo.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        etq_logo.setIcon(new ImageIcon(icono_logo));
        
        revalidate();
        
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_titulo;
    // End of variables declaration//GEN-END:variables

    
}
