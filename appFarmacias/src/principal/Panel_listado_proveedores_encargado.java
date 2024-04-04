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

public class Panel_listado_proveedores_encargado extends javax.swing.JPanel {

    BaseDatosValeria bdmiguel;
    BaseDatos bd;

    Proveedores listaProveedores[];
    DefaultTableModel modelo;

    public Panel_listado_proveedores_encargado(Proveedores[] listado) {
        this.bdmiguel = bdmiguel;
        this.bd = bd;
        this.listaProveedores = listado;
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

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(791, 750));

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Lista de los proveedores");

        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NIT", "Nombre", "Direccion", "Telefono", "correo", "Persona contacto", "Estado"
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
        tablaProveedores.setEnabled(false);
        xd.setViewportView(tablaProveedores);

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
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(xd, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
        );
    }// </editor-fold>//GEN-END:initComponents

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

        revalidate();

    }

    public void imprimirTabla() {
        modelo.setRowCount(0);
        for (int i = 0; listaProveedores[i] != null; i++) {
            String nit = listaProveedores[i].getNit();
            String nombre = listaProveedores[i].getNombre_proveedor();
            String direccion = listaProveedores[i].getDireccion();
            String telefono = listaProveedores[i].getTelefono();
            String correo = listaProveedores[i].getCorreo();
            String persona_contacto = listaProveedores[i].getPersona_contacto();
            String estado = listaProveedores[i].getEstado();

            Object dato = new Object[]{nit, nombre, direccion, telefono, correo, persona_contacto, estado};
            modelo.addRow((Object[]) dato);

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JTable tablaProveedores;
    private javax.swing.JScrollPane xd;
    // End of variables declaration//GEN-END:variables

}
