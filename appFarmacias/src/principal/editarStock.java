
package principal;

import utils.BaseDatosValeria;
import utils.Stock1;


public class editarStock extends javax.swing.JFrame {

    BaseDatosValeria bdvaleria;
    Panel_listado_stock panel;
    MenuEncargado menu;
    Stock1 listado[];
    String id_stock;
    int posicion;

    public editarStock(Panel_listado_stock panel, int i, String id_stock,MenuEncargado menu) {
        this.bdvaleria = menu.bdvaleria;
        this.menu = menu;
        this.panel = panel;
        this.id_stock = id_stock;
        this.posicion = i;
        initComponents();
        initAlternComponents();
    }

    public void initAlternComponents() {
        setTitle("Formulario de Edicion");
        setVisible(true);
        setLocationRelativeTo(null);

        campo_nombre.setText(panel.listaStock[posicion].getNombre_producto());
        campo_proveedor.setText(panel.listaStock[posicion].getProveedor());
        cant_entrante.setText(panel.listaStock[posicion].getCant_entrante());
        cant_restante.setText(panel.listaStock[posicion].getCant_restante());
        campo_estado.setText(panel.listaStock[posicion].getEstado());
        campo_comentario.setText(panel.listaStock[posicion].getComentario());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_menu = new javax.swing.JPanel();
        nombre_label = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        proveedor_label = new javax.swing.JLabel();
        campo_proveedor = new javax.swing.JTextField();
        CantEnt_label = new javax.swing.JLabel();
        cant_entrante = new javax.swing.JTextField();
        CantRes_label = new javax.swing.JLabel();
        cant_restante = new javax.swing.JTextField();
        estado_label = new javax.swing.JLabel();
        campo_estado = new javax.swing.JTextField();
        comentario_label = new javax.swing.JLabel();
        campo_comentario = new javax.swing.JTextField();
        btn_editar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel_menu.setBackground(new java.awt.Color(79, 108, 210));

        nombre_label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nombre_label.setForeground(new java.awt.Color(255, 255, 255));
        nombre_label.setText("Nombre:");

        campo_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        proveedor_label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        proveedor_label.setForeground(new java.awt.Color(255, 255, 255));
        proveedor_label.setText("Proveedor:");

        campo_proveedor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        CantEnt_label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CantEnt_label.setForeground(new java.awt.Color(255, 255, 255));
        CantEnt_label.setText("Cant entrante");

        cant_entrante.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        CantRes_label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CantRes_label.setForeground(new java.awt.Color(255, 255, 255));
        CantRes_label.setText("Cant restante");

        cant_restante.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        estado_label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        estado_label.setForeground(new java.awt.Color(255, 255, 255));
        estado_label.setText("Estado:");

        campo_estado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        comentario_label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        comentario_label.setForeground(new java.awt.Color(255, 255, 255));
        comentario_label.setText("Comentario:");

        campo_comentario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

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
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_menuLayout = new javax.swing.GroupLayout(jPanel_menu);
        jPanel_menu.setLayout(jPanel_menuLayout);
        jPanel_menuLayout.setHorizontalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menuLayout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_menuLayout.createSequentialGroup()
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)
                        .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_menuLayout.createSequentialGroup()
                        .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombre_label, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CantRes_label)
                            .addComponent(estado_label)
                            .addComponent(comentario_label)
                            .addComponent(proveedor_label)
                            .addComponent(CantEnt_label, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campo_nombre)
                            .addComponent(campo_proveedor)
                            .addComponent(cant_entrante, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cant_restante, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campo_estado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campo_comentario, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(86, 86, 86))
        );
        jPanel_menuLayout.setVerticalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menuLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campo_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proveedor_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cant_entrante, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CantEnt_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cant_restante, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CantRes_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estado_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_comentario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comentario_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed

        String nombres = campo_nombre.getText();
        String proveedor = campo_proveedor.getText();
        String cant_entrantes = cant_entrante.getText();
        String cant_restantes = cant_restante.getText();
        String estado = campo_estado.getText();
        String comentario = campo_comentario.getText();
        boolean proceso = false;
        if (nombres.equals("") || proveedor.equals("") || cant_entrantes.equals("") || cant_restantes.equals("") || estado.equals("")) {
            Alerta ventana = new Alerta("Todos los campos son Obligatorios.");
        } else {

            proceso = bdvaleria.actualizarStock(id_stock, nombres, proveedor, cant_entrantes, cant_restantes, estado, comentario);

            if (proceso) {
                dispose();
                menu.btn_StockActionPerformed();
                menu.setVisible(true);
                Confirmacion resp = new Confirmacion("Producto " + nombres + " editado");
            } else {
                Alerta ventana = new Alerta("Error al editar en el stock");
            }
        }

    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        dispose();
        menu.btn_StockActionPerformed();
        menu.setVisible(true);
        
    }//GEN-LAST:event_btn_volverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CantEnt_label;
    private javax.swing.JLabel CantRes_label;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JTextField campo_comentario;
    private javax.swing.JTextField campo_estado;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_proveedor;
    private javax.swing.JTextField cant_entrante;
    private javax.swing.JTextField cant_restante;
    private javax.swing.JLabel comentario_label;
    private javax.swing.JLabel estado_label;
    private javax.swing.JPanel jPanel_menu;
    private javax.swing.JLabel nombre_label;
    private javax.swing.JLabel proveedor_label;
    // End of variables declaration//GEN-END:variables
}
