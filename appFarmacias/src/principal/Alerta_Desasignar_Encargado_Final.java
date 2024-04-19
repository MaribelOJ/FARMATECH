
package principal;

import java.awt.Image;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import utils.BaseDatosMiguel;

public class Alerta_Desasignar_Encargado_Final extends javax.swing.JFrame {
    BaseDatosMiguel bdmiguel;
   
    DefaultComboBoxModel<String> comboBoxModelNombres = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> comboBoxModelDirecciones = new DefaultComboBoxModel<>();

    public Alerta_Desasignar_Encargado_Final(String cedula) {
        this.bdmiguel = new BaseDatosMiguel();
        initComponents();
        initAlternComponents(cedula);
        
        
        
        // Obtener la información de la farmacia asignada al usuario
        String nombreFarmaciaAsignada = bdmiguel.obtenerNombreFarmaciaAsignada(cedula);
        String direccionFarmaciaAsignada = bdmiguel.obtenerDireccionFarmaciaAsignada(cedula);

        // Establecer el nombre de la farmacia asignada en el JComboBox de nombres de farmacias
        comboBoxModelNombres.addElement(nombreFarmaciaAsignada);
        tablaFarmacias.setModel(comboBoxModelNombres);

        // Establecer la dirección de la farmacia asignada en el JComboBox de direcciones de farmacias
        comboBoxModelDirecciones.addElement(direccionFarmaciaAsignada);
        tablaDirecciones.setModel(comboBoxModelDirecciones);
    }
    
    public void initAlternComponents(String cedula){
        texto_nombre.setText(bdmiguel.infoPersona(cedula));
        texto_cedula.setText(cedula);
        setTitle("Confirmación de desasignar encargado");
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

        etq_titulo = new javax.swing.JLabel();
        etq_logo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        etq_titulo_desasignar = new javax.swing.JLabel();
        btn_desasignar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        texto_cedula = new javax.swing.JLabel();
        texto_nombre = new javax.swing.JLabel();
        tablaFarmacias = new javax.swing.JComboBox<>();
        tablaDirecciones = new javax.swing.JComboBox<>();
        etq_titulo_desasignar1 = new javax.swing.JLabel();
        etq_titulo_desasignar2 = new javax.swing.JLabel();
        etq_titulo_desasignar3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Desasignar encargado");

        jPanel1.setBackground(new java.awt.Color(79, 108, 211));

        etq_titulo_desasignar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_titulo_desasignar.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo_desasignar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo_desasignar.setText("El encargado con nombre: ");

        btn_desasignar.setBackground(new java.awt.Color(239, 30, 30));
        btn_desasignar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_desasignar.setForeground(new java.awt.Color(255, 255, 255));
        btn_desasignar.setText("Desasignar");
        btn_desasignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desasignarActionPerformed(evt);
            }
        });

        btn_cancelar.setBackground(new java.awt.Color(144, 177, 239));
        btn_cancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("Volver");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        texto_cedula.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        texto_cedula.setForeground(new java.awt.Color(255, 255, 255));
        texto_cedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto_cedula.setText("-----");

        texto_nombre.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        texto_nombre.setForeground(new java.awt.Color(255, 255, 255));
        texto_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto_nombre.setText("-----");

        tablaFarmacias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tablaFarmacias.setFocusable(false);

        tablaDirecciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tablaDirecciones.setFocusable(false);

        etq_titulo_desasignar1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_titulo_desasignar1.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo_desasignar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo_desasignar1.setText("Y cedula:");

        etq_titulo_desasignar2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_titulo_desasignar2.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo_desasignar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo_desasignar2.setText("¿Está seguro de querer desasignar a este encargado?");

        etq_titulo_desasignar3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_titulo_desasignar3.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo_desasignar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo_desasignar3.setText("Esta asginado a este local");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablaDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tablaFarmacias, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_titulo_desasignar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_titulo_desasignar, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etq_titulo_desasignar1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(texto_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(texto_cedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(etq_titulo_desasignar2, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_desasignar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(223, 223, 223)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_titulo_desasignar)
                    .addComponent(texto_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_titulo_desasignar1)
                    .addComponent(texto_cedula))
                .addGap(26, 26, 26)
                .addComponent(etq_titulo_desasignar3)
                .addGap(18, 18, 18)
                .addComponent(tablaFarmacias, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(tablaDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(etq_titulo_desasignar2)
                .addGap(18, 18, 18)
                .addComponent(btn_desasignar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(etq_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    

    
    private void btn_desasignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desasignarActionPerformed
        // Obtener la cédula del encargado
        String cedula = texto_cedula.getText();

        // Desasignar al encargado de la farmacia
        bdmiguel.desasignarEncargadoFarmacia(cedula);


        // Mostrar confirmación
        Confirmacion nuevo = new Confirmacion("Encargado desasignado con éxito");
        dispose();
        
    }//GEN-LAST:event_btn_desasignarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed
    
    
    public static void main(String args[]) {
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_desasignar;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel etq_titulo_desasignar;
    private javax.swing.JLabel etq_titulo_desasignar1;
    private javax.swing.JLabel etq_titulo_desasignar2;
    private javax.swing.JLabel etq_titulo_desasignar3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> tablaDirecciones;
    private javax.swing.JComboBox<String> tablaFarmacias;
    private javax.swing.JLabel texto_cedula;
    private javax.swing.JLabel texto_nombre;
    // End of variables declaration//GEN-END:variables
}
