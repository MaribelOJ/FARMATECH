
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

        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "PRODUCTO", "PRECIO", "CANTIDAD", "SUB_TOTAL", "IVA", "TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        cont_principalLayout.setVerticalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addGap(371, 371, 371))
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
    
    public void initAlternComponents(){
        model = (DefaultTableModel) tablaDetalle.getModel();
        
        tablaDetalle.getColumnModel().getColumn(0).setPreferredWidth(100);
        tablaDetalle.getColumnModel().getColumn(1).setPreferredWidth(100);
        tablaDetalle.getColumnModel().getColumn(3).setPreferredWidth(100);
        tablaDetalle.getColumnModel().getColumn(4).setPreferredWidth(100);
        tablaDetalle.getColumnModel().getColumn(5).setPreferredWidth(100);
    
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
            String IVA = listaDetalle[i].getIva();
            String Total = listaDetalle[i].getTotal();
            
            String sumaParcial =formatoDinero.format(Double.parseDouble(sub_total));
            String sumaTotal =formatoDinero.format(Double.parseDouble(Total));
            String valorU = formatoDinero.format(Double.parseDouble(Precio));
            Object historial[] = new Object[]{ NumReferencia, valorU,cantidad,sumaParcial,IVA,sumaTotal};
            model.addRow(historial);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cont_principal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDetalle;
    // End of variables declaration//GEN-END:variables
}
