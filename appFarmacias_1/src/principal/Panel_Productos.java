
package principal;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import utils.BaseDatos;
import utils.BaseDatosCristian;
import utils.Producto;
import utils.ProductosCristian;

public class Panel_Productos extends javax.swing.JPanel {
    BaseDatosCristian bdC;
    CatalogoProducto panel;
    String id_producto;
    Producto busqueda;
    
    public Panel_Productos(BaseDatos bd, String id_producto, String valueOf, BaseDatosCristian bdC) {
       this.bdC = bdC;
        this.panel=panel;
        this.id_producto = id_producto;
        Producto busqueda = bdC.buscarProducto(id_producto);
        initComponents();
        InitAlternComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Productos = new javax.swing.JPanel();
        etq_imagenProducto = new javax.swing.JLabel();
        etq_nombreProducto = new javax.swing.JLabel();
        panelPrecio = new javax.swing.JPanel();
        etq_precio = new javax.swing.JLabel();
        btn_usos = new javax.swing.JButton();
        panelStock = new javax.swing.JPanel();
        etq_stock = new javax.swing.JLabel();

        etq_nombreProducto.setText("--");

        panelPrecio.setBackground(new java.awt.Color(79, 108, 211));

        etq_precio.setFont(new java.awt.Font("Arial Black", 2, 10)); // NOI18N
        etq_precio.setText("---");

        javax.swing.GroupLayout panelPrecioLayout = new javax.swing.GroupLayout(panelPrecio);
        panelPrecio.setLayout(panelPrecioLayout);
        panelPrecioLayout.setHorizontalGroup(
            panelPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrecioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_precio, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPrecioLayout.setVerticalGroup(
            panelPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrecioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_precio)
                .addContainerGap())
        );

        btn_usos.setBackground(new java.awt.Color(79, 108, 211));
        btn_usos.setFont(new java.awt.Font("Arial Black", 2, 10)); // NOI18N
        btn_usos.setText("USOS");
        btn_usos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usosActionPerformed(evt);
            }
        });

        panelStock.setBackground(new java.awt.Color(79, 108, 211));

        etq_stock.setFont(new java.awt.Font("Arial Black", 2, 10)); // NOI18N
        etq_stock.setText("---");

        javax.swing.GroupLayout panelStockLayout = new javax.swing.GroupLayout(panelStock);
        panelStock.setLayout(panelStockLayout);
        panelStockLayout.setHorizontalGroup(
            panelStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_stock, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelStockLayout.setVerticalGroup(
            panelStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout ProductosLayout = new javax.swing.GroupLayout(Productos);
        Productos.setLayout(ProductosLayout);
        ProductosLayout.setHorizontalGroup(
            ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_imagenProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etq_nombreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ProductosLayout.createSequentialGroup()
                        .addComponent(panelPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_usos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(panelStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ProductosLayout.setVerticalGroup(
            ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_imagenProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_nombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_usos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(521, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(Productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

     public void InitAlternComponents(){
        Image medicamento = busqueda.getMedicamentos();
        medicamento = medicamento.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        etq_imagenProducto.setIcon(new ImageIcon (medicamento));
        
        etq_nombreProducto.setText(busqueda.getNombre_producto());
        etq_precio.setText(busqueda.getPrecio_unitario());
        
        
      if (Integer.parseInt(busqueda.getStock()) <= 0) {
          etq_stock.setText(busqueda.getStock());
          etq_stock.setForeground(Color.red);
        }else{
          etq_stock.setText(busqueda.getStock());
      }
    }
    private void btn_usosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usosActionPerformed
        
    }//GEN-LAST:event_btn_usosActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Productos;
    private javax.swing.JButton btn_usos;
    private javax.swing.JLabel etq_imagenProducto;
    private javax.swing.JLabel etq_nombreProducto;
    private javax.swing.JLabel etq_precio;
    private javax.swing.JLabel etq_stock;
    private javax.swing.JPanel panelPrecio;
    private javax.swing.JPanel panelStock;
    // End of variables declaration//GEN-END:variables
}
