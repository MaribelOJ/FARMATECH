
package principal;

import java.sql.Date;
import java.text.SimpleDateFormat;
import utils.BaseDatos;
public class AgregarProducto extends javax.swing.JPanel {

  BaseDatos bd;
  
    public AgregarProducto(BaseDatos bd) {
        this.bd = bd;
        initComponents();
    }

    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        contentPrincipal = new javax.swing.JPanel();
        nombreProducto = new javax.swing.JTextField();
        volumenProducto = new javax.swing.JTextField();
        precioProducto = new javax.swing.JTextField();
        fechaProductos = new javax.swing.JTextField();
        ingredientesProductos = new javax.swing.JTextField();
        usosProductos = new javax.swing.JTextField();
        btnAñadirProducto = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        id_Producto = new javax.swing.JTextField();

        titulo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        titulo.setText("AÑADIR PRODUCTO");

        contentPrincipal.setBackground(new java.awt.Color(79, 108, 211));

        nombreProducto.setForeground(new java.awt.Color(102, 102, 102));
        nombreProducto.setText("NOMBRE:");

        volumenProducto.setForeground(new java.awt.Color(102, 102, 102));
        volumenProducto.setText("VOLUMEN:");

        precioProducto.setForeground(new java.awt.Color(102, 102, 102));
        precioProducto.setText("PRECIO UNITARIO:");

        fechaProductos.setForeground(new java.awt.Color(102, 102, 102));
        fechaProductos.setText("FECHA VENCIMIENTO (DD-MM-YY):");
        fechaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaProductosActionPerformed(evt);
            }
        });

        ingredientesProductos.setForeground(new java.awt.Color(102, 102, 102));
        ingredientesProductos.setText("INGREDIENTES:");

        usosProductos.setForeground(new java.awt.Color(102, 102, 102));
        usosProductos.setText("USOS:");

        btnAñadirProducto.setBackground(new java.awt.Color(0, 0, 204));
        btnAñadirProducto.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnAñadirProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadirProducto.setText("AÑADIR");
        btnAñadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirProductoActionPerformed(evt);
            }
        });

        jToggleButton1.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("VOLVER");

        id_Producto.setForeground(new java.awt.Color(102, 102, 102));
        id_Producto.setText("ID_PRODUCTO");

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(btnAñadirProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombreProducto)
                    .addComponent(volumenProducto)
                    .addComponent(precioProducto)
                    .addComponent(fechaProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                    .addComponent(ingredientesProductos)
                    .addComponent(usosProductos)
                    .addComponent(id_Producto))
                .addGap(19, 19, 19))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(id_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(volumenProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(precioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fechaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ingredientesProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usosProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAñadirProducto)
                    .addComponent(jToggleButton1))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(contentPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(titulo)))
                .addContainerGap(873, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(contentPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirProductoActionPerformed
        String id_producto = id_Producto.getText();
        String nombre = nombreProducto.getText();
        String volumen = volumenProducto.getText();
        String precio = precioProducto.getText();
        String fecha = fechaProductos.getText();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String ingrediente = ingredientesProductos.getText();
        String usos = usosProductos.getText();
        
        
        if(id_producto.equals("")|| nombre.equals("")|| volumen.equals("") || precio.equals("")|| fecha.equals("") || ingrediente.equals("") || usos.equals("")){
            Alerta ventana = new Alerta("Todos los campos son requeridos"); 
        }else{
            boolean ingreso = bd.insertarProducto(id_producto, nombre, volumen, precio, fecha, ingrediente, usos);
            Alerta ventana = new Alerta("Producto ingresado");
        }
        
    }//GEN-LAST:event_btnAñadirProductoActionPerformed

    private void fechaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaProductosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAñadirProducto;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JTextField fechaProductos;
    private javax.swing.JTextField id_Producto;
    private javax.swing.JTextField ingredientesProductos;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField nombreProducto;
    private javax.swing.JTextField precioProducto;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField usosProductos;
    private javax.swing.JTextField volumenProducto;
    // End of variables declaration//GEN-END:variables
}
