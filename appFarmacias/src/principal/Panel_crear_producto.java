
package principal;

import java.awt.Image;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import utils.BaseDatosMiguel;

public class Panel_crear_producto extends javax.swing.JPanel {
    
    private Alerta ventanaAlerta;
    DefaultComboBoxModel<String> comboBoxModelNombres = new DefaultComboBoxModel<>();
    BaseDatosMiguel bdmiguel;
    ImageIcon imagenTemporal;
   
    public Panel_crear_producto() {
        this.bdmiguel = new BaseDatosMiguel();
        initComponents();
        initAlternComponents();
        
        // Obtener la lista de nombres de farmacias y agregarlas al modelo del JComboBox
        List<String> nombresProveedor = bdmiguel.cargarNombresProveedores();
        for (String nombreProveedor : nombresProveedor) {
            comboBoxModelNombres.addElement(nombreProveedor);
        }
        
        // Establecer el modelo del JComboBox de nombres de farmacias
        lista_proveedores.setModel(comboBoxModelNombres);
        imagenTemporal = null;
    }

    public void initAlternComponents(){
        setVisible(true);
        Image icono_logo = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logoFT.png"));
        icono_logo = icono_logo.getScaledInstance(85, 85, Image.SCALE_SMOOTH);
        etq_logo.setIcon(new ImageIcon(icono_logo));
        
        String nombrePlaceholder = "Nombre:";
        String cantidadPlaceholder = "Cantidad:";
        String precioPlaceholder = "Precio:";
        String fechaPlaceholder = "Fecha de vencimiento:";
        String ingredientesPlaceholder = "Ingredientes:";
        String usosPlaceholder = "Usos:";
        
        SwingUtilities.invokeLater(() -> {
            foco.requestFocusInWindow();
        });
        
        campo_nombre.setText(nombrePlaceholder);
        campo_cantidad.setText(cantidadPlaceholder);
        campo_precio.setText(precioPlaceholder);
        campo_fecha_vencimiento.setText(fechaPlaceholder);
        campo_ingredientes.setText(ingredientesPlaceholder);
        campo_usos.setText(usosPlaceholder);
        
        //Placeholder para cada campo
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
        
        campo_cantidad.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                String currentText = campo_cantidad.getText();
                
                if (currentText.equals(cantidadPlaceholder)) {
                    campo_cantidad.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                String currentText = campo_cantidad.getText();
                
                if (currentText.isEmpty()) {
                    campo_cantidad.setText(cantidadPlaceholder);
                }
            }
        });
        
        campo_precio.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                String currentText = campo_precio.getText();
                
                if (currentText.equals(precioPlaceholder)) {
                    campo_precio.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                String currentText = campo_precio.getText();
                
                if (currentText.isEmpty()) {
                    campo_precio.setText(precioPlaceholder);
                }
            }
        });
        
        campo_fecha_vencimiento.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                String currentText = campo_fecha_vencimiento.getText();
                
                if (currentText.equals(fechaPlaceholder)) {
                    campo_fecha_vencimiento.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                String currentText = campo_fecha_vencimiento.getText();
                
                if (currentText.isEmpty()) {
                    campo_fecha_vencimiento.setText(fechaPlaceholder);
                }
            }
        });
        
        campo_ingredientes.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                String currentText = campo_ingredientes.getText();
                
                if (currentText.equals(ingredientesPlaceholder)) {
                    campo_ingredientes.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                String currentText = campo_ingredientes.getText();
                
                if (currentText.isEmpty()) {
                    campo_ingredientes.setText(ingredientesPlaceholder);
                }
            }
        });
        
        campo_usos.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                String currentText = campo_usos.getText();
                
                if (currentText.equals(usosPlaceholder)) {
                    campo_usos.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                String currentText = campo_usos.getText();
                
                if (currentText.isEmpty()) {
                    campo_usos.setText(usosPlaceholder);
                }
            }
        });
        
        
        
        revalidate();
        repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_titulo = new javax.swing.JLabel();
        etq_logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        campo_nombre = new javax.swing.JTextField();
        campo_cantidad = new javax.swing.JTextField();
        campo_fecha_vencimiento = new javax.swing.JTextField();
        campo_ingredientes = new javax.swing.JTextField();
        campo_usos = new javax.swing.JTextField();
        campo_precio = new javax.swing.JTextField();
        etq_proveedor = new javax.swing.JLabel();
        lista_proveedores = new javax.swing.JComboBox<>();
        btn_crear = new javax.swing.JButton();
        btnLoadImage = new javax.swing.JButton();
        panelPreview = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        imagenLabel = new javax.swing.JLabel();
        lista_volumen = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        foco = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(762, 730));

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Añadir producto");

        jPanel2.setBackground(new java.awt.Color(79, 108, 211));

        campo_nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campo_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nombreActionPerformed(evt);
            }
        });

        campo_cantidad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        campo_fecha_vencimiento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campo_fecha_vencimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_fecha_vencimientoActionPerformed(evt);
            }
        });

        campo_ingredientes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        campo_usos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        campo_precio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        etq_proveedor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_proveedor.setForeground(new java.awt.Color(255, 255, 255));
        etq_proveedor.setText("Proveedor:");

        lista_proveedores.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lista_proveedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_crear.setBackground(new java.awt.Color(144, 177, 239));
        btn_crear.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_crear.setForeground(new java.awt.Color(255, 255, 255));
        btn_crear.setText("Crear");
        btn_crear.setToolTipText("");
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });

        btnLoadImage.setBackground(new java.awt.Color(144, 177, 239));
        btnLoadImage.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnLoadImage.setForeground(new java.awt.Color(255, 255, 255));
        btnLoadImage.setText("Buscar Imagen");
        btnLoadImage.setFocusable(false);
        btnLoadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadImageActionPerformed(evt);
            }
        });

        imagenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jScrollPane2.setViewportView(imagenLabel);

        javax.swing.GroupLayout panelPreviewLayout = new javax.swing.GroupLayout(panelPreview);
        panelPreview.setLayout(panelPreviewLayout);
        panelPreviewLayout.setHorizontalGroup(
            panelPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        panelPreviewLayout.setVerticalGroup(
            panelPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        );

        lista_volumen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lista_volumen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mg", "ml" }));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Volumen:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelPreview, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLoadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campo_usos)
                    .addComponent(campo_fecha_vencimiento)
                    .addComponent(campo_ingredientes)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_cantidad, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(etq_proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lista_proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lista_volumen, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campo_precio))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campo_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lista_volumen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campo_fecha_vencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campo_ingredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campo_usos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etq_proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lista_proveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(campo_precio, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelPreview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(foco, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(etq_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(62, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 609, Short.MAX_VALUE)
                .addComponent(foco, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(106, 106, 106)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campo_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nombreActionPerformed

    private void campo_fecha_vencimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_fecha_vencimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_fecha_vencimientoActionPerformed

    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed
        // Verificar si algún campo está vacío
        if (campo_nombre.getText().equals("") || campo_cantidad.getText().equals("") || campo_fecha_vencimiento.getText().equals("") || campo_ingredientes.getText().equals("") || campo_usos.getText().equals("") || campo_precio.getText().equals("") || imagenTemporal==null) {
            // Mostrar alerta indicando que todos los campos son obligatorios
            Alerta ventana = new Alerta("Todos los campos son obligatorios.");

            // Cerrar la ventana de alerta anterior (si existe)
            if (ventanaAlerta != null) {
                ventanaAlerta.dispose();
            }

            // Asignar la nueva ventana de alerta como la ventana actual
            ventanaAlerta = ventana;

        } else if (campo_nombre.getText().equals("Nombre:") || campo_cantidad.getText().equals("Cantidad:") || campo_fecha_vencimiento.getText().equals("Fecha de vencimiento:")|| campo_ingredientes.getText().equals("Ingredientes:") || campo_usos.getText().equals("Usos:") || campo_precio.getText().equals("") || imagenTemporal==null) {
            // Mostrar alerta indicando que todos los campos son obligatorios
            Alerta ventana = new Alerta("Todos los campos son obligatorios.");

            // Cerrar la ventana de alerta anterior (si existe)
            if (ventanaAlerta != null) {
                ventanaAlerta.dispose();
            }

            // Asignar la nueva ventana de alerta como la ventana actual
            ventanaAlerta = ventana;

        } else {
            
            String campo_proveedor = (String) lista_proveedores.getSelectedItem();
            String campo_volumen = (String) lista_volumen.getSelectedItem();
            String campo_nombre_str = campo_nombre.getText();
            String campo_cantidad_str = campo_cantidad.getText();
            String campo_fecha_vencimiento_str = campo_fecha_vencimiento.getText();
            String campo_ingredientes_str = campo_ingredientes.getText();
            String campo_usos_str = campo_usos.getText();
            String campo_precio_str = campo_precio.getText();
           
                    
            bdmiguel.uploadPhoto(campo_nombre_str, imagenTemporal, campo_volumen, campo_precio_str, campo_fecha_vencimiento_str, campo_ingredientes_str, campo_usos_str, campo_cantidad_str, campo_proveedor);
            Confirmacion nuevo = new Confirmacion("Producto creado con éxito");
           
        }
    }//GEN-LAST:event_btn_crearActionPerformed

    private void btnLoadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadImageActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Imagen", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(filter);

        int seleccion = fileChooser.showOpenDialog(panelPreview);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            String rutaImagen = fileChooser.getSelectedFile().getAbsolutePath();
            imagenTemporal = new ImageIcon(rutaImagen);
            Image imagen = imagenTemporal.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
            imagenTemporal = new ImageIcon(imagen);

            imagenLabel.setIcon(imagenTemporal);
        }
    }//GEN-LAST:event_btnLoadImageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoadImage;
    private javax.swing.JButton btn_crear;
    private javax.swing.JTextField campo_cantidad;
    private javax.swing.JTextField campo_fecha_vencimiento;
    private javax.swing.JTextField campo_ingredientes;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_precio;
    private javax.swing.JTextField campo_usos;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_proveedor;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel foco;
    private javax.swing.JLabel imagenLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> lista_proveedores;
    private javax.swing.JComboBox<String> lista_volumen;
    private javax.swing.JPanel panelPreview;
    // End of variables declaration//GEN-END:variables
}
