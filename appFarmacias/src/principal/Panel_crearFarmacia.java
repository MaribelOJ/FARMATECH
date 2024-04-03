package principal;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import utils.BaseDatos_Maribel;


public class Panel_crearFarmacia extends javax.swing.JPanel {
    BaseDatos_Maribel bd;
    ImageIcon imagenTemporal;
    
    public Panel_crearFarmacia(BaseDatos_Maribel bd) {
        this.bd = bd;
        
        initComponents();
        initAlternComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont_principal = new javax.swing.JPanel();
        etq_logo = new javax.swing.JLabel();
        etq_titulo = new javax.swing.JLabel();
        etq_nit = new javax.swing.JLabel();
        campo_nit = new javax.swing.JTextField();
        etq_nombre = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        etq_direccion = new javax.swing.JLabel();
        campo_direccion = new javax.swing.JTextField();
        etq_estado = new javax.swing.JLabel();
        campo_estado = new javax.swing.JTextField();
        etq_telefono = new javax.swing.JLabel();
        campo_telefono = new javax.swing.JTextField();
        btn_crear = new javax.swing.JButton();
        btn_subirImagen = new javax.swing.JButton();
        cont_preview = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        etq_imagen = new javax.swing.JLabel();

        cont_principal.setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Nueva Farmacia");

        etq_nit.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etq_nit.setText("NIT");

        campo_nit.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        etq_nombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etq_nombre.setText("Nombre de la Farmacia");

        campo_nombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        etq_direccion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etq_direccion.setText("Dirección");

        campo_direccion.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        etq_estado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etq_estado.setText("Estado");

        campo_estado.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        etq_telefono.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etq_telefono.setText("Telefono");

        campo_telefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btn_crear.setBackground(new java.awt.Color(144, 177, 239));
        btn_crear.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_crear.setForeground(new java.awt.Color(255, 255, 255));
        btn_crear.setText("Crear");
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });

        btn_subirImagen.setBackground(new java.awt.Color(144, 177, 239));
        btn_subirImagen.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_subirImagen.setForeground(new java.awt.Color(255, 255, 255));
        btn_subirImagen.setText("Subir Imagen");
        btn_subirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subirImagenActionPerformed(evt);
            }
        });

        etq_imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jScrollPane1.setViewportView(etq_imagen);

        javax.swing.GroupLayout cont_previewLayout = new javax.swing.GroupLayout(cont_preview);
        cont_preview.setLayout(cont_previewLayout);
        cont_previewLayout.setHorizontalGroup(
            cont_previewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        cont_previewLayout.setVerticalGroup(
            cont_previewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_previewLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout cont_principalLayout = new javax.swing.GroupLayout(cont_principal);
        cont_principal.setLayout(cont_principalLayout);
        cont_principalLayout.setHorizontalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cont_principalLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etq_telefono)
                            .addComponent(campo_estado, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                            .addComponent(etq_estado)
                            .addComponent(campo_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                            .addComponent(etq_direccion)
                            .addComponent(campo_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                            .addComponent(etq_nombre)
                            .addComponent(etq_nit)
                            .addComponent(campo_nit, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                                .addComponent(btn_subirImagen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campo_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                            .addComponent(cont_preview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 182, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cont_principalLayout.setVerticalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_nit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etq_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etq_direccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etq_estado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etq_telefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cont_preview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_subirImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cont_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void initAlternComponents(){
        Image icono_logo = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logoFT.png"));
        icono_logo = icono_logo.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        etq_logo.setIcon(new ImageIcon(icono_logo));
        imagenTemporal = null;
    }
    
    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed
        String NIT = campo_nit.getText();
        String nombre = campo_nombre.getText();
        String direccion = campo_direccion.getText();
        String estado = campo_estado.getText();
        String telefono= campo_telefono.getText();
        boolean registrada=false;
        if(NIT.equals("") || nombre.equals("") || direccion.equals("") || estado.equals("") || telefono.equals("") || imagenTemporal == null ){
            Alerta aviso1 = new Alerta("Todos los campos son obligatorios");
        }else{
            registrada = bd.registrarFarmacia(NIT, nombre, direccion, estado, telefono, imagenTemporal);
        }
        
        campo_nit.setText("");
        campo_nombre.setText("");
        campo_direccion.setText("");
        campo_estado.setText("");
        campo_telefono.setText("");
        etq_imagen.setIcon(null);
        
        if(registrada){
            Confirmacion aviso = new Confirmacion("¡Farmacia creada con éxito!");
        }else{
            Alerta aviso2 = new Alerta("La farmacia no fué creada, intente de nuevo!");
        }
    }//GEN-LAST:event_btn_crearActionPerformed

    private void btn_subirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subirImagenActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Imagen", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(filter);
        
        int seleccion = fileChooser.showOpenDialog(cont_preview);
        if(seleccion == JFileChooser.APPROVE_OPTION){
            String rutaImagen = fileChooser.getSelectedFile().getAbsolutePath();
            imagenTemporal = new ImageIcon(rutaImagen);
            Image imagen = imagenTemporal.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
            imagenTemporal = new ImageIcon(imagen);
            
            etq_imagen.setIcon(imagenTemporal);
        }
    }//GEN-LAST:event_btn_subirImagenActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crear;
    private javax.swing.JButton btn_subirImagen;
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JTextField campo_estado;
    private javax.swing.JTextField campo_nit;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JPanel cont_preview;
    private javax.swing.JPanel cont_principal;
    private javax.swing.JLabel etq_direccion;
    private javax.swing.JLabel etq_estado;
    private javax.swing.JLabel etq_imagen;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_nit;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
