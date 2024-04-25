package principal;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utils.BaseDatosValeria;
import utils.ButtonEditor;
import utils.ButtonRenderer;
import utils.Stock1;

public class Panel_listado_stock extends javax.swing.JPanel {

    BaseDatosValeria bdvaleria;

    Stock1 listaStock[];
    DefaultTableModel modelo;
    MenuEncargado menu;
    String NIT;
    
    public Panel_listado_stock(Stock1[] listado, MenuEncargado menu) {
        this.bdvaleria = menu.bdvaleria;
        this.menu = menu;
        this.listaStock = listado;
        this.NIT = menu.NIT_farmacia;
        initComponents();
        initAlternComponents();
        imprimirTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont_principal = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        etq_logo = new javax.swing.JLabel();
        xd = new javax.swing.JScrollPane();
        tablaStock = new javax.swing.JTable();
        Campo_buscar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(791, 750));

        cont_principal.setBackground(new java.awt.Color(255, 255, 255));
        cont_principal.setPreferredSize(new java.awt.Dimension(791, 750));

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("STOCK");

        tablaStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre producto", "Proveedor", "Cant entrante", "Cant restante", "Estado", "Comentario", ""
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
        xd.setViewportView(tablaStock);

        Campo_buscar.setBackground(new java.awt.Color(230, 230, 230));
        Campo_buscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        btn_buscar.setBackground(new java.awt.Color(78, 75, 242));
        btn_buscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cont_principalLayout = new javax.swing.GroupLayout(cont_principal);
        cont_principal.setLayout(cont_principalLayout);
        cont_principalLayout.setHorizontalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_principalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                                .addComponent(Campo_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(220, 220, 220))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)))
                        .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cont_principalLayout.createSequentialGroup()
                        .addComponent(xd, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cont_principalLayout.setVerticalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_principalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cont_principalLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Campo_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(xd, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cont_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cont_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        /*String id_nombre = Campo_buscar.getText();

        if (id_nombre.equals("")) {
            Alerta ventana = new Alerta("Se debe indicar el codigo de identificación del producto.");
        } else {
            try {
                Stock1 temporal = bdvaleria.buscarProducto(id_producto);
                if (temporal != null) {
                    campo_nombre.setText(temporal.getNombre_producto());
                    campo_volumen.setText(temporal.getVolumen());
                    campo_precio.setText(temporal.getPrecio_unitario());
                    campo_fecha.setText(temporal.getFecha_vencimiento());
                    campo_ingredientes.setText(temporal.getIngredientes());
                    campo_usos.setText(temporal.getUsos());

                    campo_nombre.setEnabled(true);
                    campo_volumen.setEnabled(true);
                    campo_precio.setEnabled(true);
                    campo_fecha.setEnabled(true);
                    campo_ingredientes.setEnabled(true);
                    campo_usos.setEnabled(true);
                    if (temporal.getMedicamento() != null) {
                        Image foto = temporal.getMedicamento();
                        foto = foto.getScaledInstance(250, 250, Image.SCALE_SMOOTH);

                        imagenLabel.setIcon(new ImageIcon(foto));
                    } else {
                        imagenLabel.setIcon(null);
                    }

                } else {
                    Alerta ventana = new Alerta("El producto no existe.");

                    campo_nombre.setText("");
                    campo_volumen.setText("");
                    campo_precio.setText("");
                    campo_fecha.setText("");
                    campo_ingredientes.setText("");
                    campo_usos.setText("");

                    campo_nombre.setEnabled(false);
                    campo_volumen.setEnabled(false);
                    campo_precio.setEnabled(false);
                    campo_fecha.setEnabled(false);
                    campo_ingredientes.setEnabled(false);
                    campo_usos.setEnabled(false);
                }
            } catch (IOException ex) {
                Logger.getLogger(EditarProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
    }//GEN-LAST:event_btn_buscarActionPerformed

    public void initAlternComponents() {
        setVisible(true);
        Image icono_logo = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logoFT.png"));
        icono_logo = icono_logo.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        etq_logo.setIcon(new ImageIcon(icono_logo));

        modelo = (DefaultTableModel) tablaStock.getModel();
        tablaStock.getTableHeader().setReorderingAllowed(false);
        tablaStock.getTableHeader().setResizingAllowed(false);

        tablaStock.getTableHeader().setFont(new Font("Arial", Font.BOLD, 15));
        tablaStock.getTableHeader().setForeground(Color.WHITE);
        tablaStock.getTableHeader().setOpaque(false);
        tablaStock.getTableHeader().setBackground(Color.BLUE);

        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        tablaStock.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tablaStock.getColumnModel().getColumn(1).setCellRenderer(centerRender);
        tablaStock.getColumnModel().getColumn(2).setCellRenderer(centerRender);
        tablaStock.getColumnModel().getColumn(3).setCellRenderer(centerRender);
        tablaStock.getColumnModel().getColumn(4).setCellRenderer(centerRender);
        tablaStock.getColumnModel().getColumn(5).setCellRenderer(centerRender);
        tablaStock.getColumnModel().getColumn(6).setCellEditor(new ButtonEditor(new JCheckBox()));
        tablaStock.getColumnModel().getColumn(6).setCellRenderer(new ButtonRenderer());
        tablaStock.getColumnModel().getColumn(6).setPreferredWidth(10);

        revalidate();

    }

    public void imprimirTabla() {
        modelo.setRowCount(0);
        for (int i = 0; listaStock[i] != null; i++) {
            String nombre = listaStock[i].getNombre_producto();
            String proveedor = listaStock[i].getProveedor();
            String cant_entrante = listaStock[i].getCant_entrante();
            String cant_restante = listaStock[i].getCant_restante();
            String estado = listaStock[i].getEstado();
            String comentario = listaStock[i].getEstado();

            JButton btnEditar = new JButton();
            btnEditar.setBackground(Color.white);
            Image icono_editar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_editar.png"));
            icono_editar = icono_editar.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btnEditar.setIcon(new ImageIcon(icono_editar));

            Object dato = new Object[]{nombre, proveedor, cant_entrante, cant_restante, estado,comentario, btnEditar};
            modelo.addRow((Object[]) dato);

            btnEditar.addActionListener(new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent e) {
                   
                }
            });

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Campo_buscar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JPanel cont_principal;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JTable tablaStock;
    private javax.swing.JScrollPane xd;
    // End of variables declaration//GEN-END:variables

}
