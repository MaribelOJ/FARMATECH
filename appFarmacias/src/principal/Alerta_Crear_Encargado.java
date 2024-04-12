
package principal;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import utils.BaseDatosMiguel;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

public class Alerta_Crear_Encargado extends javax.swing.JFrame {

    private Alerta ventanaAlerta;
    DefaultComboBoxModel<String> comboBoxModelNombres = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> comboBoxModelDirecciones = new DefaultComboBoxModel<>();
    BaseDatosMiguel bdmiguel;
    
    public Alerta_Crear_Encargado() {
        this.bdmiguel = new BaseDatosMiguel();
        initComponents();
        initAlternComponents();
        
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
    
    private void initAlternComponents(){
        setTitle("Creación de encargado");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        SwingUtilities.invokeLater(() -> {
            foco.requestFocusInWindow();
        });
        
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_login.png")));
        
        Image icono_logo = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logosinfondo.png"));
        icono_logo = icono_logo.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        etq_logo.setIcon(new ImageIcon(icono_logo));
        
        String documentoPlaceholder = "Documento:";
        String nombrePlaceholder = "Nombres:";
        String usuarioPlaceholder = "Usuario:";
        String clavePlaceholder = "Clave:";

        campo_documento.setText(documentoPlaceholder);
        campo_nombre.setText(nombrePlaceholder);
        campo_usuario.setText(usuarioPlaceholder);
        campo_clave.setText(clavePlaceholder);
        
        //Placeholder para cada campo
        campo_documento.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                String currentText = campo_documento.getText();
                
                if (currentText.equals(documentoPlaceholder)) {
                    campo_documento.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                String currentText = campo_documento.getText();
                
                if (currentText.isEmpty()) {
                    campo_documento.setText(documentoPlaceholder);
                }
            }
        });

        campo_nombre.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                String currentText = campo_nombre.getText();
                if (currentText.equals(nombrePlaceholder)) {
                    campo_nombre.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                String currentText = campo_nombre.getText();
                if (currentText.isEmpty()) {
                    campo_nombre.setText(nombrePlaceholder);
                }
            }
        });

        campo_usuario.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                String currentText = campo_usuario.getText();
                if (currentText.equals(usuarioPlaceholder)) {
                    campo_usuario.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                String currentText = campo_usuario.getText();
                if (currentText.isEmpty()) {
                    campo_usuario.setText(usuarioPlaceholder);
                }
            }
        });

        campo_clave.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                String currentText = campo_clave.getText();
                if (currentText.equals(clavePlaceholder)) {
                    campo_clave.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                String currentText = campo_clave.getText();
                if (currentText.isEmpty()) {
                    campo_clave.setText(clavePlaceholder);
                }
            }
        });

        revalidate();
        repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        btn_volver = new javax.swing.JButton();
        btn_crear_encargado = new javax.swing.JButton();
        campo_documento = new javax.swing.JTextField();
        campo_nombre = new javax.swing.JTextField();
        campo_usuario = new javax.swing.JTextField();
        campo_clave = new javax.swing.JTextField();
        tablaFarmacias = new javax.swing.JComboBox<>();
        etq_establecimiento = new javax.swing.JLabel();
        tablaDirecciones = new javax.swing.JComboBox<>();
        etq_establecimiento1 = new javax.swing.JLabel();
        etq_titulo = new javax.swing.JLabel();
        etq_logo = new javax.swing.JLabel();
        foco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(79, 108, 211));

        btn_volver.setBackground(new java.awt.Color(102, 102, 255));
        btn_volver.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_volver.setForeground(new java.awt.Color(255, 255, 255));
        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        btn_crear_encargado.setBackground(new java.awt.Color(239, 30, 30));
        btn_crear_encargado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_crear_encargado.setForeground(new java.awt.Color(255, 255, 255));
        btn_crear_encargado.setText("Crear");
        btn_crear_encargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_encargadoActionPerformed(evt);
            }
        });

        campo_documento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campo_documento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        campo_documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_documentoActionPerformed(evt);
            }
        });

        campo_nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campo_nombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        campo_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nombreActionPerformed(evt);
            }
        });

        campo_usuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campo_usuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        campo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_usuarioActionPerformed(evt);
            }
        });

        campo_clave.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campo_clave.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        campo_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_claveActionPerformed(evt);
            }
        });

        tablaFarmacias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        etq_establecimiento.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etq_establecimiento.setForeground(new java.awt.Color(255, 255, 255));
        etq_establecimiento.setText("Selecciona el establecimiento:");

        tablaDirecciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        etq_establecimiento1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etq_establecimiento1.setForeground(new java.awt.Color(255, 255, 255));
        etq_establecimiento1.setText("Selecciona la dirección:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(62, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campo_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campo_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(etq_establecimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                    .addComponent(etq_establecimiento1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tablaDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tablaFarmacias, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_crear_encargado, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(campo_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(campo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(campo_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tablaFarmacias, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_establecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tablaDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_establecimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(btn_crear_encargado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Crear encargado");

        etq_logo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(702, 702, 702)
                .addComponent(foco)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(foco)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    
    private void btn_crear_encargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_encargadoActionPerformed
        // Verificar si algún campo está vacío
        if (campo_documento.getText().equals("") || campo_nombre.getText().equals("") || campo_usuario.getText().equals("") || campo_clave.getText().equals("")) {
            // Mostrar alerta indicando que todos los campos son obligatorios
            Alerta ventana = new Alerta("Todos los campos son obligatorios.");

            // Cerrar la ventana de alerta anterior (si existe)
            if (ventanaAlerta != null) {
                ventanaAlerta.dispose();
            }

            // Asignar la nueva ventana de alerta como la ventana actual
            ventanaAlerta = ventana;

        } else if (campo_documento.getText().equals("Documento:") || campo_nombre.getText().equals("Nombres:") || campo_usuario.getText().equals("Usuario:") || campo_clave.getText().equals("Clave:")) {
            // Mostrar alerta indicando que todos los campos son obligatorios
            Alerta ventana = new Alerta("Todos los campos son obligatorios.");

            // Cerrar la ventana de alerta anterior (si existe)
            if (ventanaAlerta != null) {
                ventanaAlerta.dispose();
            }

            // Asignar la nueva ventana de alerta como la ventana actual
            ventanaAlerta = ventana;

        } else {
            // Si todos los campos están llenos, crear el encargado y mostrar la confirmación
            String cedula = campo_documento.getText();
            String nombre = campo_nombre.getText();
            String usuario = campo_usuario.getText();
            String clave = campo_clave.getText();
            // Obtener la fecha actual
            java.util.Date fechaInicio = new java.util.Date(); // Fecha actual

            // Obtener el nombre de la farmacia seleccionada
            String nombreFarmaciaSeleccionada = (String) tablaFarmacias.getSelectedItem();
            String direccionFarmaciaSeleccionada = (String) tablaDirecciones.getSelectedItem();

            // Llamar al método para agregar el encargado a la base de datos con la fecha de inicio
            if (bdmiguel.agregarEncargado(cedula, nombre, usuario, clave, nombreFarmaciaSeleccionada, direccionFarmaciaSeleccionada, fechaInicio)) {
                Confirmacion ventana = new Confirmacion("Encargado creado con éxito.");
                ventanaAlerta = null; // Limpiar la referencia a la ventana de alerta
                

                // Cerrar la ventana actual
                dispose(); 
            } else {
                // Mostrar una alerta indicando que no se pudo agregar el encargado
                Alerta ventana = new Alerta("Ya existe alguien con este documento.");
                
               if (ventanaAlerta != null) {
                ventanaAlerta.dispose();
            }

                // Asignar la nueva ventana de alerta como la ventana actual
                ventanaAlerta = ventana;
            }
        }
    }//GEN-LAST:event_btn_crear_encargadoActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        dispose();
        ventanaAlerta.dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void campo_documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_documentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_documentoActionPerformed

    private void campo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_usuarioActionPerformed

    private void campo_claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_claveActionPerformed

    private void campo_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nombreActionPerformed

   
    public static void main(String args[]) {
      

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crear_encargado;
    private javax.swing.JButton btn_volver;
    private javax.swing.JTextField campo_clave;
    private javax.swing.JTextField campo_documento;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_usuario;
    private javax.swing.JLabel etq_establecimiento;
    private javax.swing.JLabel etq_establecimiento1;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel foco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JComboBox<String> tablaDirecciones;
    private javax.swing.JComboBox<String> tablaFarmacias;
    // End of variables declaration//GEN-END:variables
}
