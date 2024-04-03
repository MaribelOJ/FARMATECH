
package principal;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import utils.BaseDatos_Maribel;
import utils.Farmacia;

public class Panel_farmacia extends javax.swing.JPanel {

    BaseDatos_Maribel bd;
    Farmacia busqueda;
    Panel_visualizarFarmacias panel;
    String NIT;
    String numContenedor;
        
    public Panel_farmacia(BaseDatos_Maribel bd, String NIT,String numContenedor, Panel_visualizarFarmacias panel) {
        this.bd = bd;
        this.panel=panel;
        this.NIT = NIT;
        busqueda=bd.buscarFarmacia(NIT);
        this.numContenedor = numContenedor;
        initComponents();
        initAlternComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        farmacia = new javax.swing.JPanel();
        etq_img = new javax.swing.JLabel();
        etq_nit = new javax.swing.JLabel();
        etq_estado = new javax.swing.JLabel();
        btn_inventario = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_ventas = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();

        farmacia.setBackground(new java.awt.Color(43, 138, 250));
        farmacia.setPreferredSize(new java.awt.Dimension(249, 332));

        etq_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etq_nit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_nit.setForeground(new java.awt.Color(75, 75, 75));
        etq_nit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etq_estado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_estado.setForeground(new java.awt.Color(188, 13, 13));
        etq_estado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btn_inventario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_inventario.setForeground(new java.awt.Color(85, 115, 221));
        btn_inventario.setText("Inventario");
        btn_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inventarioActionPerformed(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(239, 30, 30));
        btn_eliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_ventas.setBackground(new java.awt.Color(239, 218, 30));
        btn_ventas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_ventas.setForeground(new java.awt.Color(255, 255, 255));
        btn_ventas.setText("Ventas");
        btn_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ventasActionPerformed(evt);
            }
        });

        btn_editar.setBackground(new java.awt.Color(144, 177, 239));
        btn_editar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout farmaciaLayout = new javax.swing.GroupLayout(farmacia);
        farmacia.setLayout(farmaciaLayout);
        farmaciaLayout.setHorizontalGroup(
            farmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, farmaciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(farmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etq_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(farmaciaLayout.createSequentialGroup()
                        .addComponent(btn_ventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etq_nit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etq_estado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(farmaciaLayout.createSequentialGroup()
                        .addComponent(btn_inventario, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        farmaciaLayout.setVerticalGroup(
            farmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(farmaciaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(etq_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_img, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(farmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(farmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(farmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(farmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void initAlternComponents(){
        
        Image foto = busqueda.getFoto();
        foto = foto.getScaledInstance(200, 200, Image.SCALE_SMOOTH);        
        etq_img.setIcon(new ImageIcon(foto));
        
        etq_nit.setText(busqueda.getNIT());
        
        if(busqueda.getEstado().equalsIgnoreCase("activo")){
            etq_estado.setForeground(Color.GREEN);
            etq_estado.setText("Activo");
        }else{
            etq_estado.setText("Inactivo");
        }  
    }

    
    private void btn_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inventarioActionPerformed
        String num = etq_nit.getText(); 
        panel.mostrarInventario(num, numContenedor);
       
    }//GEN-LAST:event_btn_inventarioActionPerformed

    private void btn_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ventasActionPerformed
        String num = etq_nit.getText(); 
        panel.mostrarFacturas(num, numContenedor);
    }//GEN-LAST:event_btn_ventasActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        String num = etq_nit.getText(); 
        panel.mostrarEditor(num,numContenedor);
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        String num = etq_nit.getText(); 
        panel.mostrarValidacion(num,numContenedor);
    }//GEN-LAST:event_btn_eliminarActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_inventario;
    private javax.swing.JButton btn_ventas;
    private javax.swing.JLabel etq_estado;
    private javax.swing.JLabel etq_img;
    private javax.swing.JLabel etq_nit;
    private javax.swing.JPanel farmacia;
    // End of variables declaration//GEN-END:variables
}
