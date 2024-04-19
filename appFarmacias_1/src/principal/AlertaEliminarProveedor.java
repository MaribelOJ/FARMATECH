package principal;

import utils.BaseDatos;
import utils.BaseDatosValeria;
import utils.Proveedores;



public class AlertaEliminarProveedor extends javax.swing.JFrame {
    BaseDatosValeria bdvaleria;
    MenuAdmin menu;
    Proveedores proveedor;
    String nit;
    public AlertaEliminarProveedor( MenuAdmin menu, String nit, BaseDatosValeria bdvaleria) {
        this.nit = nit;
        this.menu=menu;
        this.bdvaleria = bdvaleria;
        proveedor = this.bdvaleria.buscarProveedor(nit);
        initComponents();
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        setTitle("Confirmación Eliminación");
        setVisible(true);
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_eliminar.png") ) );
        
        String text = proveedor.getNombre_proveedor();
        etqProveedor.setText(text);
    }
    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorFormulario1 = new javax.swing.JPanel();
        btnEliminar1 = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        etqTexto = new javax.swing.JLabel();
        etqProveedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        contenedorFormulario1.setBackground(new java.awt.Color(79, 108, 211));

        btnEliminar1.setBackground(new java.awt.Color(207, 46, 66));
        btnEliminar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar1.setText("ELIMINAR");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        btnCancelar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar1.setText("CANCELAR");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        etqTexto.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        etqTexto.setForeground(new java.awt.Color(255, 255, 255));
        etqTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTexto.setText("¿Estás seguro de eliminar este proveedor?");

        etqProveedor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqProveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout contenedorFormulario1Layout = new javax.swing.GroupLayout(contenedorFormulario1);
        contenedorFormulario1.setLayout(contenedorFormulario1Layout);
        contenedorFormulario1Layout.setHorizontalGroup(
            contenedorFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFormulario1Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addGroup(contenedorFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(contenedorFormulario1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                    .addComponent(etqProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        contenedorFormulario1Layout.setVerticalGroup(
            contenedorFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFormulario1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(etqTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(etqProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar1)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorFormulario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(contenedorFormulario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        bdvaleria.eliminarProveedor(nit);
        this.menu.btn_lista_proveedoresActionPerformed();
        dispose();

    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelar1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JPanel contenedorFormulario1;
    private javax.swing.JLabel etqProveedor;
    private javax.swing.JLabel etqTexto;
    // End of variables declaration//GEN-END:variables
}
