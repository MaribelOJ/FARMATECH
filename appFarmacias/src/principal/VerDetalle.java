
package principal;

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

        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PRODUCTO", "PRECIO", "CANTIDAD", "TOTAL"
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

        javax.swing.GroupLayout cont_principalLayout = new javax.swing.GroupLayout(cont_principal);
        cont_principal.setLayout(cont_principalLayout);
        cont_principalLayout.setHorizontalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        cont_principalLayout.setVerticalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void initAlternComponents(){
        model = (DefaultTableModel) tablaDetalle.getModel();

    }
    
    public void imprimirDetalle(){
        
        model.setRowCount(0);
        
        for (int i = 0; i < listaDetalle.length && listaDetalle[i] != null; i++) {
            String NumReferencia = listaDetalle[i].getProducto();
            String Fecha = listaDetalle[i].getPrecioUnitario();
            String Id_cliente = listaDetalle[i].getCantidad();
            String Total = listaDetalle[i].getSuma_total();
            
            Object historial[] = new Object[]{ NumReferencia, Fecha, Id_cliente,Total};
            model.addRow(historial);
        }
        
        
                      
          

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cont_principal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDetalle;
    // End of variables declaration//GEN-END:variables
}
