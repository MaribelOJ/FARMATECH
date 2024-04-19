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

public class HistorialVentas extends javax.swing.JPanel {
    
    BaseDatosCristian bd;
    
    DefaultTableModel model;
    JTable tablaDatos;
  
    public HistorialVentas(BaseDatosCristian bd) {
        this.bd = bd;
        initComponents();
        InitAlternComponents();
        imprimirHistorial();
    }

    public void InitAlternComponents(){
        setVisible(true);
        model = new DefaultTableModel(); // Crear un nuevo modelo de tabla
        tablaDatos = new javax.swing.JTable(model); // Asignar el modelo a la tabla
        
        // Añadir columnas vacías si es necesario
        if (model.getColumnCount() < 7) {
            for (int i = model.getColumnCount(); i < 7; i++) {
                model.addColumn(""); 
            }
        }
    
        // Asignar el editor y renderizador de la sexta columna (índice 5)
        if (model.getColumnCount() >= 7) {
            tablaDatos.getColumnModel().getColumn(6).setCellEditor(new DefaultCellEditor(new JCheckBox()));
            tablaDatos.getColumnModel().getColumn(6).setCellRenderer(new ButtonRenderer());
        }
        
        // Tamaño de Columnas
        tablaDatos.getColumnModel().getColumn(0).setPreferredWidth(50);
        tablaDatos.getColumnModel().getColumn(1).setPreferredWidth(100);
        tablaDatos.getColumnModel().getColumn(2).setPreferredWidth(100);
        tablaDatos.getColumnModel().getColumn(3).setPreferredWidth(100);
        tablaDatos.getColumnModel().getColumn(4).setPreferredWidth(100);
        tablaDatos.getColumnModel().getColumn(5).setPreferredWidth(100);
        
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
        utils.HistorialVentas lista[] = bd.obtenerHistorialVentas();

        model.setRowCount(0);
        for (int i = 0; i < lista.length && lista[i] != null; i++) {
            String numReferencia = lista[i].getNumReferencia();
            String nombre_producto = lista[i].getNombre_producto();
            String fecha = lista[i].getFecha();
            String id_cliente = lista[i].getId_cliente();
            String nombre_cliente = lista[i].getNombre_cliente();
            String total = lista[i].getTotal();
            
            Object datos[] = new Object[]{ (i+1), numReferencia, nombre_producto, fecha, id_cliente,nombre_cliente,  total};
            model.addRow(datos);
        }
    }

    // Otras partes del código omitidas para mayor claridad


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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
