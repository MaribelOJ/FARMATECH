
package principal;

import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utils.BaseDatos;
import utils.BaseDatosCristian;
import utils.ButtonRenderer;
import utils.ListaProveedor;


public class HistorialVentas extends javax.swing.JPanel {
    BaseDatos bd;
    DefaultTableModel model = new DefaultTableModel();
    JTable tablaDatos = new javax.swing.JTable();
  
    public HistorialVentas(BaseDatos bd) {
        this.bd = bd;
        InitAlternComponents();
        initComponents();
    }

    HistorialVentas(BaseDatosCristian bd) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void InitAlternComponents(){
        setLocationRelativeTo(null);
        setVisible(true);
        model = (DefaultTableModel) tablaDatos.getModel();
        
        model = (DefaultTableModel) tablaDatos.getModel();
        
        // Tamaño de Columnas
        tablaDatos.getColumnModel().getColumn(6).setCellEditor(new DefaultCellEditor(new JCheckBox()));
        tablaDatos.getColumnModel().getColumn(6).setCellRenderer(new ButtonRenderer());
        
        
        
        // Tamaño de Columnas
        tablaDatos.getColumnModel().getColumn(0).setPreferredWidth(50);
        tablaDatos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tablaDatos.getColumnModel().getColumn(2).setPreferredWidth(150);
        tablaDatos.getColumnModel().getColumn(3).setPreferredWidth(50);
        tablaDatos.getColumnModel().getColumn(4).setPreferredWidth(150);
        tablaDatos.getColumnModel().getColumn(5).setPreferredWidth(10);
        tablaDatos.getColumnModel().getColumn(6).setPreferredWidth(10);
        tablaDatos.getColumnModel().getColumn(7).setPreferredWidth(10);
        
        // Ajuste del Orden y Ancho de Columnas
        tablaDatos.getTableHeader().setReorderingAllowed(false);
        tablaDatos.getTableHeader().setResizingAllowed(false);
        
        // Centrar contenido de columnas
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        tablaDatos.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tablaDatos.getColumnModel().getColumn(3).setCellRenderer(centerRender);
        tablaDatos.getColumnModel().getColumn(4).setCellRenderer(centerRender);
        
        // Ajuste del Orden y Ancho de Columnas
        tablaDatos.getTableHeader().setReorderingAllowed(false);
        tablaDatos.getTableHeader().setResizingAllowed(false);
        
        
         // Alto de las filas
        tablaDatos.setRowHeight(20);
    }
    public void imprimirHistorial(){
        HistorialVentas lista  [] = bd.HistorialVentas();
        model.setRowCount(0);
        for (int i=0; i<lista.length && lista[i]!=null; i++) {
            String NIT = lista[i].getNumReferencia();
            String nombre = lista[i].getNombre_proveedor();
            String direccion = lista[i].getDireccion();
            String telefono = lista[i].getTelefono();
            String correo = lista[i].getCorreo();
            String estado = lista[i].getEstado();
            
            Object datos[] = new Object[]{ (i+1), NIT, nombre, telefono, correo, estado};
            model.addRow(datos);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "numReferencia", "nombre_producto", "fecha", "id_cliente", "nombre_cliente", "total", "VER DETALLE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
