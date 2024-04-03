
package principal;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import utils.BaseDatos_Maribel;
import utils.Farmacia;

public class Panel_actualizarFarmacia extends javax.swing.JPanel {

    BaseDatos_Maribel bd;
    String NIT;
    MenuAdmin menu;
    Farmacia propiedad;
    ImageIcon imagenTemporal;
    int indice;
    Farmacia [] listaFarmacias;
    String numContenedor;

    public Panel_actualizarFarmacia(BaseDatos_Maribel bd, String NIT,MenuAdmin menu, String numContenedor) {
        this.bd = bd;
        this.NIT = NIT;
        this.menu= menu;
        this.propiedad = this.bd.buscarFarmacia(this.NIT);
        this.indice = 0;
        listaFarmacias = bd.extraerFarmacias();
        this.numContenedor = numContenedor;
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont_principal = new javax.swing.JPanel();
        etq_logo = new javax.swing.JLabel();
        etq_titulo = new javax.swing.JLabel();
        cont_azul = new javax.swing.JPanel();
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
        etq_foto = new javax.swing.JLabel();
        btn_subirImagen = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        campo_comentario = new javax.swing.JTextArea();
        etq_foto1 = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        cont_preview = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        etq_imagen = new javax.swing.JLabel();

        cont_principal.setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Actualizar Datos");

        cont_azul.setBackground(new java.awt.Color(79, 108, 211));

        etq_nit.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etq_nit.setForeground(new java.awt.Color(255, 255, 255));
        etq_nit.setText("NIT:");

        campo_nit.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        etq_nombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etq_nombre.setForeground(new java.awt.Color(255, 255, 255));
        etq_nombre.setText("Nombre:");

        campo_nombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        etq_direccion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etq_direccion.setForeground(new java.awt.Color(255, 255, 255));
        etq_direccion.setText("Dirección:");

        campo_direccion.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        etq_estado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etq_estado.setForeground(new java.awt.Color(255, 255, 255));
        etq_estado.setText("Estado:");

        campo_estado.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        etq_telefono.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etq_telefono.setForeground(new java.awt.Color(255, 255, 255));
        etq_telefono.setText("Telefono:");

        campo_telefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        etq_foto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etq_foto.setForeground(new java.awt.Color(255, 255, 255));
        etq_foto.setText("Nueva foto:");

        btn_subirImagen.setBackground(new java.awt.Color(144, 177, 239));
        btn_subirImagen.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_subirImagen.setForeground(new java.awt.Color(255, 255, 255));
        btn_subirImagen.setText("Subir Imagen");
        btn_subirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subirImagenActionPerformed(evt);
            }
        });

        campo_comentario.setColumns(20);
        campo_comentario.setRows(5);
        jScrollPane2.setViewportView(campo_comentario);

        etq_foto1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etq_foto1.setForeground(new java.awt.Color(255, 255, 255));
        etq_foto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_foto1.setText("Comenta Cambios en el Estado");

        btn_actualizar.setBackground(new java.awt.Color(239, 30, 30));
        btn_actualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_volver.setBackground(new java.awt.Color(144, 177, 239));
        btn_volver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_volver.setForeground(new java.awt.Color(255, 255, 255));
        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        etq_imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jScrollPane1.setViewportView(etq_imagen);

        javax.swing.GroupLayout cont_previewLayout = new javax.swing.GroupLayout(cont_preview);
        cont_preview.setLayout(cont_previewLayout);
        cont_previewLayout.setHorizontalGroup(
            cont_previewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        cont_previewLayout.setVerticalGroup(
            cont_previewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cont_azulLayout = new javax.swing.GroupLayout(cont_azul);
        cont_azul.setLayout(cont_azulLayout);
        cont_azulLayout.setHorizontalGroup(
            cont_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_azulLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(cont_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_azulLayout.createSequentialGroup()
                        .addComponent(etq_estado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etq_direccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_azulLayout.createSequentialGroup()
                        .addGroup(cont_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(cont_azulLayout.createSequentialGroup()
                                .addGroup(cont_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(cont_azulLayout.createSequentialGroup()
                                        .addComponent(etq_nit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campo_nit))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_azulLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(campo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28)
                                .addGroup(cont_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(cont_azulLayout.createSequentialGroup()
                                        .addComponent(etq_nombre)
                                        .addGap(18, 18, 18)
                                        .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(cont_azulLayout.createSequentialGroup()
                                        .addComponent(etq_telefono)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campo_telefono))))
                            .addGroup(cont_azulLayout.createSequentialGroup()
                                .addComponent(etq_foto)
                                .addGap(18, 18, 18)
                                .addComponent(cont_preview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_subirImagen)))
                        .addGap(54, 54, 54))))
            .addComponent(etq_foto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_azulLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cont_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cont_azulLayout.createSequentialGroup()
                        .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(153, 153, 153))
        );
        cont_azulLayout.setVerticalGroup(
            cont_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_azulLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(cont_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_nit)
                    .addComponent(campo_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_nombre)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cont_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_estado)
                    .addComponent(etq_telefono)
                    .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(cont_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_direccion)
                    .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(cont_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_azulLayout.createSequentialGroup()
                        .addGroup(cont_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cont_azulLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(btn_subirImagen))
                            .addGroup(cont_azulLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(etq_foto)))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_azulLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cont_preview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_foto1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(cont_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout cont_principalLayout = new javax.swing.GroupLayout(cont_principal);
        cont_principal.setLayout(cont_principalLayout);
        cont_principalLayout.setHorizontalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(cont_azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cont_principalLayout.setVerticalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cont_azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void initAlternComponents(){
        
        System.out.println(this.indice);
        imagenTemporal = null;
        
        Image icono_logo = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logoFT.png"));
        icono_logo = icono_logo.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        etq_logo.setIcon(new ImageIcon(icono_logo));
        
        if(propiedad != null){
            campo_nit.setText(propiedad.getNIT());
            campo_nit.setEnabled(false);
            campo_nombre.setText(propiedad.getNombre());
            campo_estado.setText(propiedad.getEstado());
            campo_direccion.setText(propiedad.getDireccion());
            campo_telefono.setText(propiedad.getTelefono());

        }
        
    }
    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        for(int i= 0; i < listaFarmacias.length && listaFarmacias[i] != null; i++){
            if(listaFarmacias[i].getNIT().equalsIgnoreCase(NIT)){
                indice=i;
                break;
            }
        }
        this.menu.btn_visualizar_farmaciasActionPerformed(indice,numContenedor);
    }//GEN-LAST:event_btn_volverActionPerformed

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

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        String NIT = campo_nit.getText();
        String nombre = campo_nombre.getText();
        String direccion = campo_direccion.getText();
        String estado = campo_estado.getText();
        String telefono= campo_telefono.getText();
        String comentario = campo_comentario.getText();
        
        boolean actualizada=false;
        
        if(NIT.equals("") || nombre.equals("") || direccion.equals("") || estado.equals("") || telefono.equals("") || comentario.equals("")){
            Alerta aviso1 = new Alerta("No se permiten campos vacios");
        }else{
            if(estado.equalsIgnoreCase("activo") || estado.equalsIgnoreCase("inaactivo")){
                if(imagenTemporal != null){
                    actualizada = bd.actualizarFarmacia(NIT, nombre, direccion, estado, telefono, imagenTemporal,comentario);
                }else{
                    actualizada = bd.actualizarFarmacia(NIT, nombre, direccion, estado, telefono,comentario);
                }
            }else{
                Alerta aviso1 = new Alerta("Estado no permitido");
            }
        }
      
        if(actualizada){
            Confirmacion aviso = new Confirmacion("¡Farmacia actualizada con éxito!");
        }else{
            Alerta aviso2 = new Alerta("La farmacia no fué actualizada, intente de nuevo!");
        }
        
    }//GEN-LAST:event_btn_actualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_subirImagen;
    private javax.swing.JButton btn_volver;
    private javax.swing.JTextArea campo_comentario;
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JTextField campo_estado;
    private javax.swing.JTextField campo_nit;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JPanel cont_azul;
    private javax.swing.JPanel cont_preview;
    private javax.swing.JPanel cont_principal;
    private javax.swing.JLabel etq_direccion;
    private javax.swing.JLabel etq_estado;
    private javax.swing.JLabel etq_foto;
    private javax.swing.JLabel etq_foto1;
    private javax.swing.JLabel etq_imagen;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_nit;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
