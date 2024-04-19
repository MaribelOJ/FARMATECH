package principal;

import java.awt.Image;
import javax.swing.table.DefaultTableModel;
import utils.BaseDatos;
import utils.BaseDatosCristian;
import utils.ButtonRenderer;

public class HistorialVentas extends javax.swing.JPanel {
    
    BaseDatosCristian bdC;
    
    DefaultTableModel model;

  
    public HistorialVentas(BaseDatosCristian bd) {
        this.bdC = bd;
        initComponents();
        InitAlternComponents();
        imprimirHistorial();
    }



    public void InitAlternComponents(){
        setVisible(true);
         model = (DefaultTableModel) HistorialDatos.getModel();
        
        HistorialDatos.getColumnModel().getColumn(0).setPreferredWidth(200);
        HistorialDatos.getColumnModel().getColumn(1).setPreferredWidth(200);
        HistorialDatos.getColumnModel().getColumn(2).setPreferredWidth(300);
        HistorialDatos.getColumnModel().getColumn(3).setPreferredWidth(300);
        HistorialDatos.getColumnModel().getColumn(4).setPreferredWidth(200);
        HistorialDatos.getColumnModel().getColumn(5).setPreferredWidth(200);
    }
    
    public void imprimirHistorial(){
        utils.HistorialVentas lista[] = bdC.obtenerHistorialVentas;
        model.setRowCount(0);
        System.out.println("lista : "+lista[0]);
        for (int i = 0; i < lista.length && lista[i] != null; i++) {
            String numReferencia = lista[i].getNumReferencia();
            String nombre_producto = lista[i].getNombre_producto();
            String fecha = lista[i].getFecha();
            String id_cliente = lista[i].getId_cliente();
            String nombre_cliente = lista[i].getNombre_cliente();
            String total = lista[i].getTotal();
            
            Object historial[] = new Object[]{ (i+1), numReferencia, nombre_producto, fecha, id_cliente,nombre_cliente,  total};
            model.addRow(historial);
        }
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        HistorialDatos = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setText("HISTORIAL VENTAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        HistorialDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "numReferencia", "nombre_producto", "fecha", "id_cliente", "nombre_cliente", "total", "Ver detalle"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(HistorialDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable HistorialDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
