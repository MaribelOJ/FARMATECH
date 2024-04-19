
package principal;

import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utils.BaseDatos_Maribel;
import utils.Farmacia;
import utils.Stock;


public class InventarioDesdeAdmin extends javax.swing.JPanel {
    
    BaseDatos_Maribel bd;
    String NIT;
    MenuAdmin menu;
    DefaultTableModel modelo;
    Stock listaProductos[];
    Farmacia [] listaFarmacias;
    int indice;
    String numContenedor;
    
    public InventarioDesdeAdmin(BaseDatos_Maribel bd, String NIT,MenuAdmin menu, String numContenedor) {
        this.bd = bd;
        this.NIT = NIT;
        this.menu= menu;
        this.indice = 0;
        listaProductos = bd.extraerInventario(NIT);
        listaFarmacias = bd.extraerFarmacias();
        this.numContenedor = numContenedor;
        initComponents();
        initAlternComponents();
        imprimirProductos();
    }
    
    
    public void initAlternComponents(){
        
        Image icono_logo = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logoFT.png"));
        icono_logo = icono_logo.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        etq_logo.setIcon(new ImageIcon(icono_logo));
        
        tabla_inventario.setRowHeight(25);
        tabla_inventario.setBackground(Color.WHITE);
        
        
        modelo = (DefaultTableModel) tabla_inventario.getModel();  
            
        tabla_inventario.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabla_inventario.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabla_inventario.getColumnModel().getColumn(2).setPreferredWidth(50);
        
        tabla_inventario.getTableHeader().setReorderingAllowed(false);
        tabla_inventario.getTableHeader().setResizingAllowed(false);
        tabla_inventario.getTableHeader().setBackground(Color.WHITE);
        
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);

        tabla_inventario.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tabla_inventario.getColumnModel().getColumn(1).setCellRenderer(centerRender);
        tabla_inventario.getColumnModel().getColumn(2).setCellRenderer(centerRender);
        
        revalidate();
        repaint();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont_principal = new javax.swing.JPanel();
        etq_logo = new javax.swing.JLabel();
        etq_titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_inventario = new javax.swing.JTable();
        cont_boton = new javax.swing.JPanel();
        btn_volver = new javax.swing.JButton();

        cont_principal.setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Inventario Farmacia");

        javax.swing.GroupLayout cont_principalLayout = new javax.swing.GroupLayout(cont_principal);
        cont_principal.setLayout(cont_principalLayout);
        cont_principalLayout.setHorizontalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE))
                .addContainerGap())
        );
        cont_principalLayout.setVerticalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tabla_inventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID_Producto", "Producto", "Items"
            }
        ));
        jScrollPane1.setViewportView(tabla_inventario);

        cont_boton.setBackground(new java.awt.Color(255, 255, 255));

        btn_volver.setBackground(new java.awt.Color(144, 177, 239));
        btn_volver.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_volver.setForeground(new java.awt.Color(255, 255, 255));
        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cont_botonLayout = new javax.swing.GroupLayout(cont_boton);
        cont_boton.setLayout(cont_botonLayout);
        cont_botonLayout.setHorizontalGroup(
            cont_botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_botonLayout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cont_botonLayout.setVerticalGroup(
            cont_botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_botonLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(cont_boton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cont_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cont_boton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        for(int i= 0; i < listaFarmacias.length && listaFarmacias[i] != null; i++){
            if(listaFarmacias[i].getNIT().equalsIgnoreCase(NIT)){
                indice=i;
                
                break;
            }
        }
        System.out.println("indice lista en inventario: "+ indice);
        this.menu.btn_visualizar_farmaciasActionPerformed(indice,numContenedor);
    }//GEN-LAST:event_btn_volverActionPerformed
    
    public void imprimirProductos(){
        modelo.setRowCount(0);
        
        for (int i=0; i< listaProductos.length && listaProductos[i]!=null; i++) {

            String id_producto = listaProductos[i].getId_producto();
            String nombre = listaProductos[i].getNombre();
            String items = listaProductos[i].getCant_restante();
            
            Object dato[] = new Object[]{ id_producto,nombre,items };
            modelo.addRow(dato);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_volver;
    private javax.swing.JPanel cont_boton;
    private javax.swing.JPanel cont_principal;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_inventario;
    // End of variables declaration//GEN-END:variables
}
