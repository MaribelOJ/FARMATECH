
package principal;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utils.BaseDatos_Maribel;
import utils.ButtonEditor;
import utils.ButtonRenderer;
import utils.Factura;
import utils.FacturaProductos;

public class Panel_detalleFacturas extends javax.swing.JPanel {

    BaseDatos_Maribel bd;
    String numFactura;
    DefaultTableModel modelo;
    Panel_visualizarFarmacias panel;
    String NIT;
    FacturaProductos listaProductos[];
    String numContenedor;
    
    public Panel_detalleFacturas( BaseDatos_Maribel bd,String NIT, String numFactura,Panel_visualizarFarmacias panel,String numContenedor) {
        this.bd = bd;
        this.numFactura= numFactura;
        this.panel=panel;
        this.NIT=NIT;
        listaProductos = this.bd.extraerProductosFactura(this.numFactura);
        this.numContenedor=numContenedor;
        initComponents();
        initAlternComponents();
        imprimirDetalle();
    }
    
    public void initAlternComponents(){
        Image icono_logo = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logoFT.png"));
        icono_logo = icono_logo.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        etq_logo.setIcon(new ImageIcon(icono_logo));
        
        
        etq_numReferencia.setText("Numero de Referencia: "+ this.numFactura);
        tabla_detalles.setRowHeight(25);
        tabla_detalles.setBackground(Color.decode("#4F6CD3"));
        tabla_detalles.setGridColor(Color.WHITE);
        tabla_detalles.setForeground(Color.WHITE);
        
        modelo = (DefaultTableModel) tabla_detalles.getModel();
                    
        tabla_detalles.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabla_detalles.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabla_detalles.getColumnModel().getColumn(2).setPreferredWidth(100);

        
        tabla_detalles.getTableHeader().setReorderingAllowed(false);
        tabla_detalles.getTableHeader().setResizingAllowed(false);

        
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);

        tabla_detalles.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tabla_detalles.getColumnModel().getColumn(1).setCellRenderer(centerRender);
        tabla_detalles.getColumnModel().getColumn(2).setCellRenderer(centerRender);

        
        revalidate();
        repaint();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont_principal = new javax.swing.JPanel();
        etq_logo = new javax.swing.JLabel();
        etq_titulo = new javax.swing.JLabel();
        cont_azul = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_detalles = new javax.swing.JTable();
        btn_volver = new javax.swing.JButton();
        etq_numReferencia = new javax.swing.JLabel();
        etq_total = new javax.swing.JLabel();

        cont_principal.setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Detalle de Venta");

        cont_azul.setBackground(new java.awt.Color(79, 108, 211));

        tabla_detalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Productos", "Precio Unitario", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tabla_detalles);

        btn_volver.setBackground(new java.awt.Color(144, 177, 239));
        btn_volver.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_volver.setForeground(new java.awt.Color(255, 255, 255));
        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        etq_numReferencia.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_numReferencia.setForeground(new java.awt.Color(255, 255, 255));
        etq_numReferencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_numReferencia.setText("Numero de refencia: ");

        etq_total.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_total.setForeground(new java.awt.Color(255, 255, 255));
        etq_total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_total.setText("Total:");

        javax.swing.GroupLayout cont_azulLayout = new javax.swing.GroupLayout(cont_azul);
        cont_azul.setLayout(cont_azulLayout);
        cont_azulLayout.setHorizontalGroup(
            cont_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_numReferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_azulLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268))
            .addGroup(cont_azulLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addComponent(etq_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cont_azulLayout.setVerticalGroup(
            cont_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_azulLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(etq_numReferencia)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(etq_total)
                .addGap(18, 18, 18)
                .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout cont_principalLayout = new javax.swing.GroupLayout(cont_principal);
        cont_principal.setLayout(cont_principalLayout);
        cont_principalLayout.setHorizontalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(cont_azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        cont_principalLayout.setVerticalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_titulo)
                .addGap(45, 45, 45)
                .addComponent(cont_azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
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
    
    public void imprimirDetalle(){
        modelo.setRowCount(0);
        String txt ="";
        
        for (int i=0; i< listaProductos.length && listaProductos[i]!=null; i++) {
            
            String producto = listaProductos[i].getProducto();
            String precio = listaProductos[i].getPrecioUnitario();
            String cantidad = listaProductos[i].getCantidad();
            txt ="Total: " + listaProductos[i].getTotal();
            
            Object dato[] = new Object[]{ producto,precio,cantidad};
            modelo.addRow(dato);
            
        }
        
        etq_total.setText(txt);
    }
    
    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
       this.panel.mostrarFacturas(NIT,numContenedor);
    }//GEN-LAST:event_btn_volverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_volver;
    private javax.swing.JPanel cont_azul;
    private javax.swing.JPanel cont_principal;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_numReferencia;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel etq_total;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_detalles;
    // End of variables declaration//GEN-END:variables
}
