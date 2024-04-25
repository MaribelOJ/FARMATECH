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
    String Nit_farmacia;
    MenuEncargado menu;
  
    public HistorialVentas( String NIT, MenuEncargado menu) {
        this.menu =menu;
        this.bdC = menu.bdC;
        initComponents();
        this.Nit_farmacia = NIT;
        InitAlternComponents();
        imprimirHistorial();
    }



    public void InitAlternComponents(){
        model = (DefaultTableModel) HistorialDatos.getModel();
        
        HistorialDatos.getColumnModel().getColumn(4).setCellEditor(new ButtonEditor(new JCheckBox()));
        HistorialDatos.getColumnModel().getColumn(4).setCellRenderer(new ButtonRenderDetalle());
        
        HistorialDatos.getColumnModel().getColumn(0).setPreferredWidth(150);
        HistorialDatos.getColumnModel().getColumn(1).setPreferredWidth(180);
        HistorialDatos.getColumnModel().getColumn(2).setPreferredWidth(270);
        HistorialDatos.getColumnModel().getColumn(3).setPreferredWidth(290);
        HistorialDatos.getColumnModel().getColumn(4).setPreferredWidth(250);
    }
    
    public void imprimirHistorial(){
        utils.HistorialVentas lista[] = bdC.obtenerHistorialVentas(Nit_farmacia);
        model.setRowCount(0);
        
        for (int i = 0; i < lista.length && lista[i] != null; i++) {
            String NumReferencia = lista[i].getNumReferencia();
            String Fecha = lista[i].getFecha();
            String Id_cliente = lista[i].getId_cliente();
            String Total = lista[i].getTotal();
            
            JButton btnDetalle = new JButton();
            btnDetalle.setBackground(Color.white);
            Image VerDetalle = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/VerDetalle.png"));
            VerDetalle = VerDetalle.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btnDetalle.setIcon(new ImageIcon(VerDetalle));
            
            
            Object historial[] = new Object[]{ NumReferencia, Fecha, Id_cliente,  Total, btnDetalle};
            model.addRow(historial);
            
            btnDetalle.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                   VerDetalle panel = new VerDetalle(menu, NumReferencia);
                   
                   panel.setPreferredSize(cont_principal.getPreferredSize());
                   panel.setSize(cont_principal.getSize());
                   
                   cont_principal.removeAll();
                   cont_principal.add(panel);
                   
                   repaint();
                   revalidate();
                   
                }
            });
        }
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont_principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        HistorialDatos = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setText("HISTORIAL VENTAS");

        HistorialDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NumReferencia", "Fecha", "Id_cliente", "Total", "Ver"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(HistorialDatos);

        javax.swing.GroupLayout cont_principalLayout = new javax.swing.GroupLayout(cont_principal);
        cont_principal.setLayout(cont_principalLayout);
        cont_principalLayout.setHorizontalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_principalLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1))
                    .addGroup(cont_principalLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        cont_principalLayout.setVerticalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable HistorialDatos;
    private javax.swing.JPanel cont_principal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
