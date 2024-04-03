package principal;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import principal.MenuAdmin;
import utils.BaseDatos_Maribel;
import utils.ButtonEditor;
import utils.ButtonRenderer;
import utils.Factura;
import utils.Farmacia;


public class VentasDesdeAdmin extends javax.swing.JPanel {
    
    BaseDatos_Maribel bd;
    String NIT;
    MenuAdmin menu;
    DefaultTableModel modelo;
    Factura ListaFacturas[];
    Panel_visualizarFarmacias panel;
    int indice;
    Farmacia [] listaFarmacias;
    String numContenedor;
    
    public VentasDesdeAdmin(BaseDatos_Maribel bd, String NIT,MenuAdmin menu,Panel_visualizarFarmacias panel,String numContenedor) {
        this.bd = bd;
        this.NIT = NIT;
        this.menu= menu;
        this.panel=panel;
        this.indice =0;
        this.numContenedor=numContenedor;
        listaFarmacias = bd.extraerFarmacias();
        ListaFacturas = this.bd.extraerFacturas(this.NIT);

        initComponents();
        initAlternComponents();
        imprimirFacturas();
    }
    
    public void initAlternComponents(){
        Image icono_logo = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logoFT.png"));
        icono_logo = icono_logo.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        etq_logo.setIcon(new ImageIcon(icono_logo));
        
        tabla_facturas.setRowHeight(25);
        tabla_facturas.setBackground(Color.WHITE);
        
        
        modelo = (DefaultTableModel) tabla_facturas.getModel();
        tabla_facturas.getColumnModel().getColumn(4).setCellEditor(new ButtonEditor(new JCheckBox()));
        tabla_facturas.getColumnModel().getColumn(4).setCellRenderer(new ButtonRenderer());
            
        tabla_facturas.getColumnModel().getColumn(0).setPreferredWidth(30);
        tabla_facturas.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabla_facturas.getColumnModel().getColumn(2).setPreferredWidth(100);
        tabla_facturas.getColumnModel().getColumn(3).setPreferredWidth(30);
        tabla_facturas.getColumnModel().getColumn(4).setPreferredWidth(50);
        
        tabla_facturas.getTableHeader().setReorderingAllowed(false);
        tabla_facturas.getTableHeader().setResizingAllowed(false);
        
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);

        tabla_facturas.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tabla_facturas.getColumnModel().getColumn(1).setCellRenderer(centerRender);
        tabla_facturas.getColumnModel().getColumn(2).setCellRenderer(centerRender);
        tabla_facturas.getColumnModel().getColumn(3).setCellRenderer(centerRender);

        
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
        tabla_facturas = new javax.swing.JTable();
        btn_volver = new javax.swing.JButton();

        cont_principal.setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Registro de Ventas");

        cont_azul.setBackground(new java.awt.Color(79, 108, 211));

        tabla_facturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID_VENTA", "FECHA", "ID_CLIENTE", "TOTAL", "VER DETALLE"
            }
        ));
        jScrollPane1.setViewportView(tabla_facturas);

        btn_volver.setBackground(new java.awt.Color(144, 177, 239));
        btn_volver.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_volver.setForeground(new java.awt.Color(255, 255, 255));
        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cont_azulLayout = new javax.swing.GroupLayout(cont_azul);
        cont_azul.setLayout(cont_azulLayout);
        cont_azulLayout.setHorizontalGroup(
            cont_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_azulLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_azulLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269))
        );
        cont_azulLayout.setVerticalGroup(
            cont_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_azulLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
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
                .addContainerGap(64, Short.MAX_VALUE))
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

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        for(int i= 0; i < listaFarmacias.length && listaFarmacias[i] != null; i++){
            if(listaFarmacias[i].getNIT().equalsIgnoreCase(NIT)){
                indice=i;
                break;
            }
        }
        this.menu.btn_visualizar_farmaciasActionPerformed(indice,numContenedor);
    }//GEN-LAST:event_btn_volverActionPerformed
    
    public void imprimirFacturas(){
        modelo.setRowCount(0);
        
        for (int i=0; i< ListaFacturas.length && ListaFacturas[i]!=null; i++) {
            
            String numReferencia = ListaFacturas[i].getNumReferencia();
            String fecha = ListaFacturas[i].getFecha();
            String id_cliente = ListaFacturas[i].getId_cliente();
            String total=ListaFacturas[i].getTotal();
            
            JButton btnDetalle = new JButton("Ver"); 
            btnDetalle.setBackground(Color.decode("#90B1EF"));
            btnDetalle.setForeground(Color.WHITE);
                        

            Object dato[] = new Object[]{ numReferencia,fecha,id_cliente,total, btnDetalle };
            modelo.addRow(dato);
            
            btnDetalle.addActionListener(new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent e) {
                    panel.mostrarDetalle(NIT, numReferencia,numContenedor);
                    
                }
            });

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_volver;
    private javax.swing.JPanel cont_azul;
    private javax.swing.JPanel cont_principal;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_facturas;
    // End of variables declaration//GEN-END:variables
}
