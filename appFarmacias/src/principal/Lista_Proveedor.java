package principal;

import javax.swing.JButton;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import utils.BaseDatos;
import utils.ButtonEditar;
import utils.ButtonRenderer;
import utils.ListaProveedor;
import utils.Usuario;

public class Lista_Proveedor extends javax.swing.JPanel {

    BaseDatos bd;
    DefaultTableModel model = new DefaultTableModel();
    JTable tablaDatos = new javax.swing.JTable();

    public Lista_Proveedor(BaseDatos bd) {
        this.bd = bd;
        initComponents();
        imprimirProveedor();
        
    }
    public void initAternComponents(){
        setLocationRelativeTo(null);
        setVisible(true);
        model = (DefaultTableModel) tablaDatos.getModel();
        
        model = (DefaultTableModel) tablaDatos.getModel();
        
        // Tamaño de Columnas
        tablaDatos.getColumnModel().getColumn(6).setCellEditor(new DefaultCellEditor(new JCheckBox()));
        tablaDatos.getColumnModel().getColumn(6).setCellRenderer(new ButtonRenderer());
        
        tablaDatos.getColumnModel().getColumn(7).setCellEditor(new ButtonEditar(new JCheckBox()));
        tablaDatos.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
        
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

    public void imprimirProveedor(){
        ListaProveedor lista  [] = bd.extraerProveedor();
        model.setRowCount(0);
        for (int i=0; i<lista.length && lista[i]!=null; i++) {
            String NIT = lista[i].getNIT_proveedor();
            String nombre = lista[i].getNombre_proveedor();
            String direccion = lista[i].getDireccion();
            String telefono = lista[i].getTelefono();
            String correo = lista[i].getCorreo();
            String estado = lista[i].getEstado();
            
            Object datos[] = new Object[]{ (i+1), NIT, nombre, telefono, correo, estado};
            model.addRow(datos);
        }
        

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        campoNIT = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JToggleButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIT_proveedor", "nombre_proveedor", "direccion", "telefono", "correo", "perosna_contacto", "estado", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        campoNIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNITActionPerformed(evt);
            }
        });

        btnBuscar.setActionCommand("BUSCAR");
        btnBuscar.setLabel("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(campoNIT, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(460, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campoNITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNITActionPerformed
        
    }//GEN-LAST:event_campoNITActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String NIT = campoNIT.getText();

        if( NIT.equals("")){
            Alerta ventana = new Alerta("Se debe indicar el NIT del proveedor.");
        }else{
              ListaProveedor lista = bd.buscarProveedor(NIT);
            if (lista != null) {
                model.setRowCount(0);
                String NIT_proveedor = lista.getNIT_proveedor();
                String nombre_proveedor = lista.getNombre_proveedor();
                String direccion = lista.getDireccion();
                String telefono = lista.getTelefono();
                String correo = lista.getCorreo();
                String persona_contacto = lista.getPersona_contacto();
                String estado = lista.getEstado();

                Object datos[] = new Object[]{1, NIT_proveedor, nombre_proveedor, direccion, telefono,persona_contacto, correo, estado};
                model.addRow(datos);
                
                System.out.println(NIT_proveedor+" "+nombre_proveedor+" "+direccion+" "+telefono+" "+correo+" "+persona_contacto+" "+estado);
            } else {
            Alerta ventana = new Alerta("No se encontró ningún proveedor con el NIT ingresado.");
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBuscar;
    private javax.swing.JTextField campoNIT;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
