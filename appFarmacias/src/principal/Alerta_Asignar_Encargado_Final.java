
package principal;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import utils.BaseDatosMiguel;

public class Alerta_Asignar_Encargado_Final extends javax.swing.JFrame {
    BaseDatosMiguel bdmiguel;
    
    DefaultComboBoxModel<String> comboBoxModelNombres = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> comboBoxModelDirecciones = new DefaultComboBoxModel<>();
    
    public Alerta_Asignar_Encargado_Final(String cedula) {
        this.bdmiguel = new BaseDatosMiguel();
        initComponents();
        initAlternComponents(cedula);
        
        // Obtener la lista de nombres de farmacias y agregarlas al modelo del JComboBox
        List<String> nombresFarmacias = bdmiguel.cargarNombresFarmacias();
        for (String nombreFarmacia : nombresFarmacias) {
            comboBoxModelNombres.addElement(nombreFarmacia);
        }
        
        // Establecer el modelo del JComboBox de nombres de farmacias
        tablaFarmacias.setModel(comboBoxModelNombres);
        
        // Obtener la dirección de la primera farmacia de la lista y agregarla al modelo del JComboBox de direcciones
        if (!nombresFarmacias.isEmpty()) {
            List<String> direccionesFarmacia = bdmiguel.cargarDireccionesFarmacias(nombresFarmacias.get(0));
            for (String direccionFarmacia : direccionesFarmacia) {
                comboBoxModelDirecciones.addElement(direccionFarmacia);
            }
            // Establecer el modelo del JComboBox de direcciones de farmacias
            tablaDirecciones.setModel(comboBoxModelDirecciones);
        }
        
        // Agregar un ActionListener al JComboBox de nombres de farmacias
        tablaFarmacias.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el nombre de la farmacia seleccionada
                String nombreFarmaciaSeleccionada = (String) tablaFarmacias.getSelectedItem();

                // Obtener las direcciones de la farmacia seleccionada
                List<String> direccionesFarmacia = bdmiguel.cargarDireccionesFarmacias(nombreFarmaciaSeleccionada);

                // Limpiar el modelo del JComboBox de direcciones
                comboBoxModelDirecciones.removeAllElements();

                // Agregar las direcciones al modelo del JComboBox de direcciones
                for (String direccionFarmacia : direccionesFarmacia) {
                    comboBoxModelDirecciones.addElement(direccionFarmacia);
                }

                // Establecer el modelo actualizado del JComboBox de direcciones de farmacias
                tablaDirecciones.setModel(comboBoxModelDirecciones);
            }
        });
    }
    
    private void initAlternComponents(String cedula){
        texto_nombre.setText(bdmiguel.infoPersona(cedula));
        texto_cedula.setText(cedula);
        setTitle("Confirmación de asignar encargado");
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
        jPanel1 = new javax.swing.JPanel();
        etq_titulo_asignar = new javax.swing.JLabel();
        btn_asignar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        texto_cedula = new javax.swing.JLabel();
        texto_nombre = new javax.swing.JLabel();
        tablaFarmacias = new javax.swing.JComboBox<>();
        tablaDirecciones = new javax.swing.JComboBox<>();
        etq_establecimiento = new javax.swing.JLabel();
        etq_establecimiento1 = new javax.swing.JLabel();
        etq_logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Asignar encargado");

        jPanel1.setBackground(new java.awt.Color(79, 108, 211));

        etq_titulo_asignar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_titulo_asignar.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo_asignar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo_asignar.setText("Selecciona el establecimiento al que quieres asignarlo");

        btn_asignar.setBackground(new java.awt.Color(239, 30, 30));
        btn_asignar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_asignar.setForeground(new java.awt.Color(255, 255, 255));
        btn_asignar.setText("Asignar");
        btn_asignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asignarActionPerformed(evt);
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

        texto_cedula.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        texto_cedula.setForeground(new java.awt.Color(255, 255, 255));
        texto_cedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto_cedula.setText("-----");

        texto_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        texto_nombre.setForeground(new java.awt.Color(255, 255, 255));
        texto_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto_nombre.setText("-----");

        tablaFarmacias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tablaDirecciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        etq_establecimiento.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etq_establecimiento.setForeground(new java.awt.Color(255, 255, 255));
        etq_establecimiento.setText("Selecciona el establecimiento:");

        etq_establecimiento1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etq_establecimiento1.setForeground(new java.awt.Color(255, 255, 255));
        etq_establecimiento1.setText("Selecciona la dirección:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texto_cedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(texto_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etq_establecimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tablaDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etq_establecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tablaFarmacias, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etq_titulo_asignar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_asignar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(etq_titulo_asignar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(texto_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(texto_cedula)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tablaFarmacias, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_establecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tablaDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_establecimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btn_asignar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

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
                        .addGap(70, 70, 70)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(etq_titulo)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_asignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asignarActionPerformed
        // Obtener la fecha actual
            java.util.Date fechaInicio = new java.util.Date(); // Fecha actual

            // Obtener el nombre de la farmacia seleccionada
            String nombreFarmaciaSeleccionada = (String) tablaFarmacias.getSelectedItem();
            String direccionFarmaciaSeleccionada = (String) tablaDirecciones.getSelectedItem();
            String estado = "activo";
            String cedula = texto_cedula.getText();
            bdmiguel.asignarEncargadoFarmacia(cedula,nombreFarmaciaSeleccionada,direccionFarmaciaSeleccionada, estado, fechaInicio);
            Confirmacion nuevo = new Confirmacion("Encargado asignado con éxito");
            dispose();
    }//GEN-LAST:event_btn_asignarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

   
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_asignar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JLabel etq_establecimiento;
    private javax.swing.JLabel etq_establecimiento1;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel etq_titulo_asignar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> tablaDirecciones;
    private javax.swing.JComboBox<String> tablaFarmacias;
    private javax.swing.JLabel texto_cedula;
    private javax.swing.JLabel texto_nombre;
    // End of variables declaration//GEN-END:variables
}
