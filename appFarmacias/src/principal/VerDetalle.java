
package principal;

import java.text.DecimalFormat;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utils.BaseDatosCristian;
import utils.FacturaProductosCristian;


public class VerDetalle extends javax.swing.JPanel {
    BaseDatosCristian bdC;
    MenuEncargado menu;
    FacturaProductosCristian [] listaDetalle;
    DefaultTableModel model;

    public VerDetalle(MenuEncargado menu, String referencia) {
        this.menu = menu;
        this.bdC = menu.bdC;
        this.listaDetalle = this.bdC.Detalle(referencia);
        
        initComponents();
        initAlternComponents();
        imprimirDetalle();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont_principal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        etqTotal = new javax.swing.JLabel();
        etq_totalG = new javax.swing.JLabel();
        btn_volver = new javax.swing.JButton();

        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PRODUCTO", "PRECIO", "CANTIDAD", "SUMA_FINAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaDetalle);

        etqTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqTotal.setText("SUBTOTAL :");

        etq_totalG.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_totalG.setText("0");

        btn_volver.setBackground(new java.awt.Color(144, 177, 239));
        btn_volver.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_volver.setForeground(new java.awt.Color(255, 255, 255));
        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cont_principalLayout = new javax.swing.GroupLayout(cont_principal);
        cont_principal.setLayout(cont_principalLayout);
        cont_principalLayout.setHorizontalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(etqTotal)
                .addGap(18, 18, 18)
                .addComponent(etq_totalG, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                        .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(309, 309, 309))))
        );
        cont_principalLayout.setVerticalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addGap(54, 54, 54)
                .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_totalG, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        this.menu.btn_historial_ventasActionPerformed();
        
    }//GEN-LAST:event_btn_volverActionPerformed
    
    public void initAlternComponents(){
        model = (DefaultTableModel) tablaDetalle.getModel();
        
        tablaDetalle.getColumnModel().getColumn(0).setPreferredWidth(100);
        tablaDetalle.getColumnModel().getColumn(1).setPreferredWidth(100);
        tablaDetalle.getColumnModel().getColumn(2).setPreferredWidth(100);
        tablaDetalle.getColumnModel().getColumn(3).setPreferredWidth(100);

    
        tablaDetalle.getTableHeader().setReorderingAllowed(false);
        tablaDetalle.getTableHeader().setResizingAllowed(false);

        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        tablaDetalle.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tablaDetalle.getColumnModel().getColumn(3).setCellRenderer(centerRender);
    
        tablaDetalle.setRowHeight(25);

    }
    
    public void imprimirDetalle(){
        DecimalFormat formatoDinero = new DecimalFormat("#,###.##");
        model.setRowCount(0);
        
        for (int i = 0; i < listaDetalle.length && listaDetalle[i] != null; i++) {
            String NumReferencia = listaDetalle[i].getProducto();
            String Precio = listaDetalle[i].getPrecioUnitario();
            String cantidad = listaDetalle[i].getCantidad();
            String sub_total = listaDetalle[i].getSub_total();
            String Total = listaDetalle[i].getTotal();
            
            String sumaParcial =formatoDinero.format(Double.parseDouble(sub_total));
            String sumaTotal =formatoDinero.format(Double.parseDouble(Total));
            String valorU = formatoDinero.format(Double.parseDouble(Precio));
            Object historial[] = new Object[]{ NumReferencia, valorU,cantidad,sumaParcial};
            etq_totalG.setText("$"+sumaTotal);
            model.addRow(historial);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_volver;
    private javax.swing.JPanel cont_principal;
    private javax.swing.JLabel etqTotal;
    private javax.swing.JLabel etq_totalG;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDetalle;
    // End of variables declaration//GEN-END:variables
}
