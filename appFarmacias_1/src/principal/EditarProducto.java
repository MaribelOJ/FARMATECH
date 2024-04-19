package principal;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import utils.BaseDatos;
import utils.BaseDatosValeria;
import utils.Producto;

public class EditarProducto extends javax.swing.JPanel {

    BaseDatosValeria bdvaleria;
    BaseDatos bd;
    String id_usuario;
    ImageIcon imagenTemporal;

    public EditarProducto(BaseDatosValeria bdvaleria, String id_usuario) {
        this.bdvaleria = bdvaleria;
        this.id_usuario = id_usuario;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        Campo_buscar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jPanel_menu = new javax.swing.JPanel();
        campo_nombre = new javax.swing.JTextField();
        campo_volumen = new javax.swing.JTextField();
        campo_precio = new javax.swing.JTextField();
        campo_fecha = new javax.swing.JTextField();
        campo_ingredientes = new javax.swing.JTextField();
        campo_usos = new javax.swing.JTextField();
        imagenLabel = new javax.swing.JLabel();
        btn_editar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        btn_subirImagen = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("EDITAR PRODUCTO");

        Campo_buscar.setBackground(new java.awt.Color(230, 230, 230));
        Campo_buscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        btn_buscar.setBackground(new java.awt.Color(78, 75, 242));
        btn_buscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jPanel_menu.setBackground(new java.awt.Color(79, 108, 210));

        campo_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campo_nombre.setText("Nombre:");

        campo_volumen.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campo_volumen.setText("volumen:");

        campo_precio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campo_precio.setText("Precio unitario:");

        campo_fecha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campo_fecha.setText("Fecha vencimiento:");

        campo_ingredientes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campo_ingredientes.setText("Ingredientes:");

        campo_usos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campo_usos.setText("Usos:");

        btn_editar.setBackground(new java.awt.Color(44, 45, 233));
        btn_editar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setText("EDITAR");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_volver.setBackground(new java.awt.Color(0, 0, 0));
        btn_volver.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_volver.setForeground(new java.awt.Color(255, 255, 255));
        btn_volver.setText("VOLVER");

        btn_subirImagen.setBackground(new java.awt.Color(144, 177, 239));
        btn_subirImagen.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_subirImagen.setForeground(new java.awt.Color(255, 255, 255));
        btn_subirImagen.setText("Subir Imagen");
        btn_subirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subirImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_menuLayout = new javax.swing.GroupLayout(jPanel_menu);
        jPanel_menu.setLayout(jPanel_menuLayout);
        jPanel_menuLayout.setHorizontalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menuLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(campo_usos, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_ingredientes, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_fecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addComponent(campo_precio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_volumen, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(50, 50, 50)
                .addComponent(imagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menuLayout.createSequentialGroup()
                .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_menuLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_subirImagen))
                    .addGroup(jPanel_menuLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)
                        .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(128, 128, 128))
        );
        jPanel_menuLayout.setVerticalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menuLayout.createSequentialGroup()
                .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_menuLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campo_volumen, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_ingredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_usos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(btn_subirImagen)
                .addGap(34, 34, 34)
                .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 234, Short.MAX_VALUE)
                .addComponent(Campo_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(331, 331, 331))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Campo_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String id_producto = Campo_buscar.getText();

        if (id_producto.equals("")) {
            Alerta ventana = new Alerta("Se debe indicar el codigo de identificación del producto.");
        } else {
            try {
                Producto temporal = bdvaleria.buscarProducto( id_producto );
                if (temporal != null) {
                    campo_nombre.setText(temporal.getNombre_producto());
                    campo_volumen.setText(temporal.getVolumen());
                    campo_precio.setText(temporal.getPrecio_unitario());
                    campo_fecha.setText(temporal.getFecha_vencimiento());
                    campo_ingredientes.setText(temporal.getIngredientes());
                    campo_usos.setText(temporal.getUsos());
                    
                    campo_nombre.setEnabled(true);
                    campo_volumen.setEnabled(true);
                    campo_precio.setEnabled(true);
                    campo_fecha.setEnabled(true);
                    campo_ingredientes.setEnabled(true);
                    campo_usos.setEnabled(true);
                    if ( temporal.getMedicamento() != null) {
                        Image foto = temporal.getMedicamento();
                        foto = foto.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
                        
                        imagenLabel.setIcon(new ImageIcon(foto));
                    } else {
                        imagenLabel.setIcon(null);
                    }
                    
                } else {
                    Alerta ventana = new Alerta("El producto no existe.");
                    
                    campo_nombre.setText("");
                    campo_volumen.setText("");
                    campo_precio.setText("");
                    campo_fecha.setText("");
                    campo_ingredientes.setText("");
                    campo_usos.setText("");
                    
                    campo_nombre.setEnabled(false);
                    campo_volumen.setEnabled(false);
                    campo_precio.setEnabled(false);
                    campo_fecha.setEnabled(false);
                    campo_ingredientes.setEnabled(false);
                    campo_usos.setEnabled(false);
                }
            } catch (IOException ex) {
                Logger.getLogger(EditarProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed

        String id_producto = Campo_buscar.getText();
        String nombres = campo_nombre.getText();
        String volumen = campo_volumen.getText();
        String precio = campo_precio.getText();
        String fecha = campo_fecha.getText();
        String ingredientes = campo_ingredientes.getText();
        String usos = campo_usos.getText();
        

        

        if (nombres.equals("") || volumen.equals("") || precio.equals("") || fecha.equals("") || ingredientes.equals("") || usos.equals("")) {
            Alerta ventana = new Alerta("Todos los campos son Obligatorios.");
        } else {
            /*if(imagenTemporal != null){
                boolean proceso = bdvaleria.actualizarProductoEditar(id_producto, nombres, volumen, precio, fecha, ingredientes, usos, imagenTemporal);
                    
                }else{
                    boolean proceso = bdvaleria.actualizarProductoEditar(id_producto, nombres, volumen, precio, fecha, ingredientes, usos);
                }*/
            
            /*if (proceso) {
                System.out.println("Producto " + id_producto + " editado con exito.");
            } else {
                Alerta ventana = new Alerta("Error al editar a la persona");
            }*/
        }


    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_subirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subirImagenActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Imagen", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(filter);

        int seleccion = fileChooser.showOpenDialog(imagenLabel);
        if(seleccion == JFileChooser.APPROVE_OPTION){
            String rutaImagen = fileChooser.getSelectedFile().getAbsolutePath();
            imagenTemporal = new ImageIcon(rutaImagen);
            Image imagen = imagenTemporal.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
            imagenTemporal = new ImageIcon(imagen);

            imagenLabel.setIcon(imagenTemporal);
        }
    }//GEN-LAST:event_btn_subirImagenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Campo_buscar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_subirImagen;
    private javax.swing.JButton btn_volver;
    private javax.swing.JTextField campo_fecha;
    private javax.swing.JTextField campo_ingredientes;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_precio;
    private javax.swing.JTextField campo_usos;
    private javax.swing.JTextField campo_volumen;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel imagenLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_menu;
    // End of variables declaration//GEN-END:variables
}
