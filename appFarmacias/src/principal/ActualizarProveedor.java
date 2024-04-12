package principal;
import utils.BaseDatosValeria;
import utils.Proveedores;

public class ActualizarProveedor extends javax.swing.JPanel {

    BaseDatosValeria bdvaleria;
    MenuAdmin menu;

    public ActualizarProveedor(MenuAdmin menu) {
        this.bdvaleria =menu.bdvaleria;
        this.menu= menu;
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
        campo_nit = new javax.swing.JTextField();
        campo_nombre = new javax.swing.JTextField();
        campo_direccion = new javax.swing.JTextField();
        campo_telefono = new javax.swing.JTextField();
        campo_correo = new javax.swing.JTextField();
        campoPersona = new javax.swing.JTextField();
        campo_Estado = new javax.swing.JTextField();
        btn_actualizar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("ACTUALIZAR PROVEEDOR");

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

        campo_nit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campo_nit.setText("NIT:");

        campo_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campo_nombre.setText("Nombre:");

        campo_direccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campo_direccion.setText("Dirección:");

        campo_telefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campo_telefono.setText("Telefono:");

        campo_correo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campo_correo.setText("Correo:");

        campoPersona.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoPersona.setText("persona_contacto");

        campo_Estado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campo_Estado.setText("Estado:");

        btn_actualizar.setBackground(new java.awt.Color(44, 45, 233));
        btn_actualizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar.setText("ACTUALIZAR");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_volver.setBackground(new java.awt.Color(0, 0, 0));
        btn_volver.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_volver.setForeground(new java.awt.Color(255, 255, 255));
        btn_volver.setText("VOLVER");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_menuLayout = new javax.swing.GroupLayout(jPanel_menu);
        jPanel_menu.setLayout(jPanel_menuLayout);
        jPanel_menuLayout.setHorizontalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menuLayout.createSequentialGroup()
                .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_menuLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_menuLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel_menuLayout.setVerticalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menuLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(campo_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campo_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campo_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jPanel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Campo_buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)))))
                .addContainerGap(107, Short.MAX_VALUE))
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
                .addGap(5, 5, 5)
                .addComponent(jPanel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
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

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        String nit = campo_nit.getText();
        String nombre = campo_nombre.getText();
        String direccion = campo_direccion.getText();
        String telefono = campo_telefono.getText();
        String correo = campo_correo.getText();
        String persona = campoPersona.getText();
        String estado = campo_Estado.getText();

        if( nit.equals("") ||nombre.equals("") || direccion.equals("") || telefono.equals("") || correo.equals("") || persona.equals("")|| estado.equals("") ){
            Alerta ventana = new Alerta("Todos los campos son Obligatorios.");
        }else{
            boolean proceso = bdvaleria.actualizarProveedor(nit,nombre, direccion, telefono, correo, persona, estado);
            if (proceso) {
                System.out.println("Proveedor "+nombre+" actualizado con exito.");
                campo_nit.setText("");
                campo_nombre.setText("");
                campo_direccion.setText("");
                campo_telefono.setText("");
                campo_correo.setText("");
                campoPersona.setText("");
                campo_Estado.setText("");
            }else{
                System.out.println("Proveedor "+nombre+" presento ERROR al actualizar.");
            }
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String nit = Campo_buscar.getText();

        if (nit.equals("")) {
            Alerta ventana = new Alerta("Se debe indicar el nit del proveedor.");
        } else {

            Proveedores temporal = bdvaleria.buscarProveedor(nit);
            if (temporal != null) {
                campo_nit.setText(temporal.getNit());
                campo_nombre.setText(temporal.getNombre_proveedor());
                campo_direccion.setText(temporal.getDireccion());
                campo_telefono.setText(temporal.getTelefono());
                campo_correo.setText(temporal.getCorreo());
                campoPersona.setText(temporal.getPersona_contacto());
                campo_Estado.setText(temporal.getEstado());
                
                campo_nit.setEnabled(true);
                campo_nombre.setEnabled(true);
                campo_direccion.setEnabled(true);
                campo_telefono.setEnabled(true);
                campo_correo.setEnabled(true);
                campoPersona.setEnabled(true);
                campo_Estado.setEnabled(true);

            } else {
                Alerta ventana = new Alerta("El proveedor no existe.");
                
                campo_nit.setText("");
                campo_nombre.setText("");
                campo_direccion.setText("");
                campo_telefono.setText("");
                campo_correo.setText("");
                campoPersona.setText("");
                campo_Estado.setText("");
                

                campo_nombre.setEnabled(false);
                campo_direccion.setEnabled(false);
                campo_telefono.setEnabled(false);
                campo_correo.setEnabled(false);
                campoPersona.setEnabled(false);
                campo_Estado.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        this.menu.btn_lista_proveedoresActionPerformed();
    }//GEN-LAST:event_btn_volverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Campo_buscar;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JTextField campoPersona;
    private javax.swing.JTextField campo_Estado;
    private javax.swing.JTextField campo_correo;
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JTextField campo_nit;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_menu;
    // End of variables declaration//GEN-END:variables
}
