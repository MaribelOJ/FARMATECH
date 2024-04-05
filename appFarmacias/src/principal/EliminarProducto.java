
package principal;

import utils.BaseDatos;
import utils.BaseDatosValeria;
import utils.Producto;



public class EliminarProducto extends javax.swing.JPanel {

    BaseDatosValeria bdvaleria;
        BaseDatos bd;
    public EliminarProducto(BaseDatosValeria bdvaleria) {
        this.bdvaleria = bdvaleria;
        this.bd = bd;
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
        campo_medicamento = new javax.swing.JTextField();
        campo_volumen = new javax.swing.JTextField();
        campo_precio = new javax.swing.JTextField();
        campo_fecha = new javax.swing.JTextField();
        campo_ingredientes = new javax.swing.JTextField();
        campo_usos = new javax.swing.JTextField();
        btn_eliminar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("ELIMINAR PRODUCTO");

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

        campo_medicamento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campo_medicamento.setText("medicamento:");

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

        btn_eliminar.setBackground(new java.awt.Color(44, 45, 233));
        btn_eliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_volver.setBackground(new java.awt.Color(0, 0, 0));
        btn_volver.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_volver.setForeground(new java.awt.Color(255, 255, 255));
        btn_volver.setText("VOLVER");

        javax.swing.GroupLayout jPanel_menuLayout = new javax.swing.GroupLayout(jPanel_menu);
        jPanel_menu.setLayout(jPanel_menuLayout);
        jPanel_menuLayout.setHorizontalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menuLayout.createSequentialGroup()
                .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_menuLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_volumen, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_ingredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_medicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_usos, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_menuLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel_menuLayout.setVerticalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campo_medicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(campo_volumen, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campo_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campo_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campo_ingredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campo_usos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Campo_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(229, 229, 229))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Campo_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String id_producto = Campo_buscar.getText();

        if( id_producto.equals("")){
            Alerta ventana = new Alerta("Se debe indicar el codigo de identificación del producto.");
        }else{

            Producto temporal = bdvaleria.buscarProducto(id_producto);
            if (temporal!=null) {
                campo_nombre.setText(temporal.getNombre_producto());
                campo_medicamento.setText(temporal.getMedicamentos());
                campo_volumen.setText(temporal.getVolumen());
                campo_precio.setText(temporal.getPrecio_unitario());
                campo_fecha.setText(temporal.getFecha_vencimiento());
                campo_ingredientes.setText(temporal.getIngredientes());
                campo_usos.setText(temporal.getUsos());

                campo_nombre.setEnabled(true);
                campo_medicamento.setEnabled(true);
                campo_volumen.setEnabled(true);
                campo_precio.setEnabled(true);
                campo_fecha.setEnabled(true);
                campo_ingredientes.setEnabled(true);
                campo_usos.setEnabled(true);

            }else{
                Alerta ventana = new Alerta("El prodducto no existe.");

                campo_nombre.setText("");
                campo_medicamento.setText("");
                campo_volumen.setText("");
                campo_precio.setText("");
                campo_fecha.setText("");
                campo_ingredientes.setText("");
                campo_usos.setText("");

                campo_nombre.setEnabled(false);
                campo_medicamento.setEnabled(false);
                campo_volumen.setEnabled(false);
                campo_precio.setEnabled(false);
                campo_fecha.setEnabled(false);
                campo_ingredientes.setEnabled(false);
                campo_usos.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        String id_producto = Campo_buscar.getText();

        boolean proceso = bdvaleria.eliminarProducto(id_producto);
        if (proceso) {
            System.out.println("Producto Eliminado.");
        } else {
            Alerta ventana = new Alerta("Error al eliminar a la persona.");
        }     //
    }//GEN-LAST:event_btn_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Campo_buscar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JTextField campo_fecha;
    private javax.swing.JTextField campo_ingredientes;
    private javax.swing.JTextField campo_medicamento;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_precio;
    private javax.swing.JTextField campo_usos;
    private javax.swing.JTextField campo_volumen;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_menu;
    // End of variables declaration//GEN-END:variables
}
