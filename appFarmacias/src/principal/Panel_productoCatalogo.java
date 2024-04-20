
package principal;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import utils.BaseDatos_Maribel;
import utils.Catalogo;


public class Panel_productoCatalogo extends javax.swing.JPanel {

    BaseDatos_Maribel bd;
    Catalogo [] listaCatalogo;
    int indice;    

        
    public Panel_productoCatalogo(BaseDatos_Maribel bd,Catalogo [] lista, int indice) {
        this.bd = bd;
        this.indice = indice;
        this.listaCatalogo =lista;

        initComponents();
        initAlternComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        farmacia = new javax.swing.JPanel();
        etq_img = new javax.swing.JLabel();
        etq_nombre = new javax.swing.JLabel();
        btn_usos = new javax.swing.JButton();
        etq_precio = new javax.swing.JLabel();
        etq_cant = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        farmacia.setBackground(new java.awt.Color(204, 204, 204));
        farmacia.setPreferredSize(new java.awt.Dimension(233, 330));

        etq_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etq_nombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_nombre.setForeground(new java.awt.Color(188, 13, 13));
        etq_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btn_usos.setBackground(new java.awt.Color(79, 108, 211));
        btn_usos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_usos.setForeground(new java.awt.Color(255, 255, 255));
        btn_usos.setText("Usos");
        btn_usos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usosActionPerformed(evt);
            }
        });

        etq_precio.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etq_precio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_precio.setText("$0.0");
        etq_precio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        etq_cant.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etq_cant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_cant.setText("Stock: 0");
        etq_cant.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout farmaciaLayout = new javax.swing.GroupLayout(farmacia);
        farmacia.setLayout(farmaciaLayout);
        farmaciaLayout.setHorizontalGroup(
            farmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(farmaciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(farmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etq_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, farmaciaLayout.createSequentialGroup()
                        .addComponent(etq_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(etq_cant, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, farmaciaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_usos, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        farmaciaLayout.setVerticalGroup(
            farmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(farmaciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_img, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_usos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(farmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_precio)
                    .addComponent(etq_cant))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(farmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(farmacia, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void initAlternComponents(){
        
        Image foto = listaCatalogo[indice].getFoto();
        foto = foto.getScaledInstance(200, 200, Image.SCALE_SMOOTH);        
        etq_img.setIcon(new ImageIcon(foto));
        
        etq_cant.setText("Stock: "+listaCatalogo[indice].getCant_restante());
        etq_nombre.setText(listaCatalogo[indice].getNombre_producto()+ " "+ listaCatalogo[indice].getVolumen());
        etq_precio.setText(listaCatalogo[indice].getPrecio_unitario());
    }

    
    private void btn_usosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usosActionPerformed
       
    }//GEN-LAST:event_btn_usosActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_usos;
    private javax.swing.JLabel etq_cant;
    private javax.swing.JLabel etq_img;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_precio;
    private javax.swing.JPanel farmacia;
    // End of variables declaration//GEN-END:variables
}
