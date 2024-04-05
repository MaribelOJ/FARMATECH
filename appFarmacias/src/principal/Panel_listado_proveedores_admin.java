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
import utils.BaseDatos;
import utils.BaseDatosValeria;
import utils.Proveedores;
import utils.ButtonEditor;
import utils.ButtonRenderer;

public class Panel_listado_proveedores_admin extends javax.swing.JPanel {

    BaseDatosValeria bdmiguel;
    BaseDatos bd;

    Proveedores listaProveedores_admin[];
    DefaultTableModel modelo;

    public Panel_listado_proveedores_admin(Proveedores[] listado) {
        this.bdmiguel = bdmiguel;
        this.bd = bd;
        this.listaProveedores_admin = listado;
        initComponents();
        initAlternComponents();
        imprimirTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_titulo = new javax.swing.JLabel();
        etq_logo = new javax.swing.JLabel();
        xd = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();
        btn_añadir_proveedor = new javax.swing.JButton();
        btn_actualizar_informacion = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(791, 750));

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Lista de los proveedores");

        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIT", "Nombre", "Direccion", "Telefono", "correo", "Persona contacto", "Estado", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProveedores.setEnabled(false);
        xd.setViewportView(tablaProveedores);

        btn_añadir_proveedor.setBackground(new java.awt.Color(144, 177, 239));
        btn_añadir_proveedor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_añadir_proveedor.setForeground(new java.awt.Color(255, 255, 255));
        btn_añadir_proveedor.setText("Añadir Proveedor");
        btn_añadir_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadir_proveedorActionPerformed(evt);
            }
        });

        btn_actualizar_informacion.setBackground(new java.awt.Color(144, 177, 239));
        btn_actualizar_informacion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_actualizar_informacion.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar_informacion.setText("Actualizar información");
        btn_actualizar_informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar_informacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 187, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(174, 174, 174))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(xd)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(btn_añadir_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(btn_actualizar_informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(xd, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_añadir_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_actualizar_informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizar_informacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_informacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actualizar_informacionActionPerformed

    private void btn_añadir_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadir_proveedorActionPerformed

    }//GEN-LAST:event_btn_añadir_proveedorActionPerformed

    public void initAlternComponents() {
        setVisible(true);
        Image icono_logo = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logoFT.png"));
        icono_logo = icono_logo.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        etq_logo.setIcon(new ImageIcon(icono_logo));

        modelo = (DefaultTableModel) tablaProveedores.getModel();
        tablaProveedores.getTableHeader().setReorderingAllowed(false);
        tablaProveedores.getTableHeader().setResizingAllowed(false);

        tablaProveedores.getTableHeader().setFont(new Font("Arial", Font.BOLD, 15));
        tablaProveedores.getTableHeader().setForeground(Color.WHITE);
        tablaProveedores.getTableHeader().setOpaque(false);
        tablaProveedores.getTableHeader().setBackground(Color.BLUE);

        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        tablaProveedores.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tablaProveedores.getColumnModel().getColumn(1).setCellRenderer(centerRender);
        tablaProveedores.getColumnModel().getColumn(2).setCellRenderer(centerRender);
        tablaProveedores.getColumnModel().getColumn(3).setCellRenderer(centerRender);
        tablaProveedores.getColumnModel().getColumn(4).setCellRenderer(centerRender);
        tablaProveedores.getColumnModel().getColumn(5).setCellRenderer(centerRender);
        tablaProveedores.getColumnModel().getColumn(6).setCellRenderer(centerRender);
        tablaProveedores.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(new JCheckBox()));
        tablaProveedores.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
        tablaProveedores.getColumnModel().getColumn(7).setPreferredWidth(10);

        revalidate();

    }

    public void imprimirTabla() {
        modelo.setRowCount(0);
        for (int i = 0; listaProveedores_admin[i] != null; i++) {
            String nit = listaProveedores_admin[i].getNit();
            String nombre = listaProveedores_admin[i].getNombre_proveedor();
            String direccion = listaProveedores_admin[i].getDireccion();
            String telefono = listaProveedores_admin[i].getTelefono();
            String correo = listaProveedores_admin[i].getCorreo();
            String persona_contacto = listaProveedores_admin[i].getPersona_contacto();
            String estado = listaProveedores_admin[i].getEstado();

            JButton btnEliminar = new JButton();
            btnEliminar.setBackground(Color.white);
            Image icono_eliminar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_eliminar.png"));
            icono_eliminar = icono_eliminar.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btnEliminar.setIcon(new ImageIcon(icono_eliminar));

            Object dato = new Object[]{nit, nombre, direccion, telefono, correo, persona_contacto, estado, btnEliminar};
            modelo.addRow((Object[]) dato);

            btnEliminar.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    
                }
            });

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar_informacion;
    private javax.swing.JButton btn_añadir_proveedor;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JTable tablaProveedores;
    private javax.swing.JScrollPane xd;
    // End of variables declaration//GEN-END:variables

}
