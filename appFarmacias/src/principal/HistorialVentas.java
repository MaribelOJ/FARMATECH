package principal;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import utils.BaseDatos;
import utils.BaseDatosCristian;
import utils.ButtonEditor;
import utils.ButtonRenderer;
import utils.ButtonRenderer;
import utils.ButtonEditor;
import utils.ButtonRenderDetalle;



public class HistorialVentas extends javax.swing.JPanel {
    
    BaseDatosCristian bdC;
    HistorialVentas [] lista;
    DefaultTableModel model;
    JPanel panelBienvenida;


  
    public HistorialVentas(BaseDatosCristian bd) {
        this.bdC = bd;
        initComponents();
        this.panelBienvenida = panelBienvenida;
        InitAlternComponents();
        imprimirHistorial();
    }



    public void InitAlternComponents(){
        setVisible(true);
        model = (DefaultTableModel) HistorialDatos.getModel();
        
        HistorialDatos.getColumnModel().getColumn(6).setCellEditor(new ButtonEditor(new JCheckBox()));
        HistorialDatos.getColumnModel().getColumn(6).setCellRenderer(new ButtonRenderDetalle());
        
        HistorialDatos.getColumnModel().getColumn(0).setPreferredWidth(150);
        HistorialDatos.getColumnModel().getColumn(1).setPreferredWidth(180);
        HistorialDatos.getColumnModel().getColumn(2).setPreferredWidth(270);
        HistorialDatos.getColumnModel().getColumn(3).setPreferredWidth(290);
        HistorialDatos.getColumnModel().getColumn(4).setPreferredWidth(250);
        HistorialDatos.getColumnModel().getColumn(5).setPreferredWidth(100);
        HistorialDatos.getColumnModel().getColumn(6).setPreferredWidth(100);
    }
    
    public void imprimirHistorial(){
        utils.HistorialVentas lista[] = bdC.obtenerHistorialVentas();
        model.setRowCount(0);
        
        for (int i = 0; i < lista.length && lista[i] != null; i++) {
            String NumReferencia = lista[i].getNumReferencia();
            String Nombre_producto = lista[i].getNombre_producto();
            String Fecha = lista[i].getFecha();
            String Id_cliente = lista[i].getId_cliente();
            String Nombre_cliente = lista[i].getNombre_cliente();
            String Total = lista[i].getTotal();
            
            JButton btnDetalle = new JButton();
            btnDetalle.setBackground(Color.white);
            Image VerDetalle = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/VerDetalle.png"));
            VerDetalle = VerDetalle.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btnDetalle.setIcon(new ImageIcon(VerDetalle));
            
            
            Object historial[] = new Object[]{ NumReferencia, Nombre_producto, Fecha, Id_cliente, Nombre_cliente,  Total, btnDetalle};
            model.addRow(historial);
            
            btnDetalle.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                   VerDetalle panel = new VerDetalle(panelBienvenida);
                   JPanel parent = (JPanel) getParent();
                   parent.removeAll();
                   parent.add(panel);
                   parent.revalidate();
                   parent.repaint();
                }
            });
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
                "NumReferencia", "Nombre_producto", "Fecha", "Id_cliente", "Nombre_cliente", "Total", "Ver"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
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
