package principal;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utils.BaseDatosMiguel;
import utils.Usuario;

public class Panel_listado_encargados extends javax.swing.JPanel {
    BaseDatosMiguel bdmiguel;
    Usuario listaPersonas[];
    DefaultTableModel  modelo;
    boolean ventana_abierta = false;
    
    
    public Panel_listado_encargados(Usuario[] listado) {
        this.bdmiguel = new BaseDatosMiguel();
        this.listaPersonas = listado;
        initComponents();
        initAlternComponents();
        imprimirTabla();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_titulo = new javax.swing.JLabel();
        etq_logo = new javax.swing.JLabel();
        scrollpane = new javax.swing.JScrollPane();
        tablaPersonas = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(791, 750));

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Lista de los encargados");

        tablaPersonas.setAutoCreateRowSorter(true);
        tablaPersonas.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Documento", "Nombre", "Usuario", "Establecimiento", "Estado", "Fecha inicio", "Fecha fin"
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
        tablaPersonas.setEnabled(false);
        scrollpane.setViewportView(tablaPersonas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 187, Short.MAX_VALUE)
                        .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(scrollpane)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void initAlternComponents(){
        setVisible(true);
        Image icono_logo = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logoFT.png"));
        icono_logo = icono_logo.getScaledInstance(125, 125, Image.SCALE_SMOOTH);
        etq_logo.setIcon(new ImageIcon(icono_logo));
        
        modelo = (DefaultTableModel) tablaPersonas.getModel();
        
        tablaPersonas.getTableHeader().setReorderingAllowed(false);
        tablaPersonas.getTableHeader().setResizingAllowed(false);
        
        tablaPersonas.getTableHeader().setFont(new Font("Arial",Font.BOLD,15));
        tablaPersonas.getTableHeader().setForeground(Color.WHITE);
        tablaPersonas.getTableHeader().setOpaque(false);
        tablaPersonas.getTableHeader().setBackground(new Color(79, 108, 211));
        
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        tablaPersonas.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tablaPersonas.getColumnModel().getColumn(1).setCellRenderer(centerRender);
        tablaPersonas.getColumnModel().getColumn(2).setCellRenderer(centerRender);
        tablaPersonas.getColumnModel().getColumn(3).setCellRenderer(centerRender);
        tablaPersonas.getColumnModel().getColumn(4).setCellRenderer(centerRender);
        tablaPersonas.getColumnModel().getColumn(5).setCellRenderer(centerRender);
        tablaPersonas.getColumnModel().getColumn(6).setCellRenderer(centerRender);
        
        tablaPersonas.getColumnModel().getColumn(0).setPreferredWidth(50);
        tablaPersonas.getColumnModel().getColumn(1).setPreferredWidth(75);
        tablaPersonas.getColumnModel().getColumn(2).setPreferredWidth(75);
        tablaPersonas.getColumnModel().getColumn(3).setPreferredWidth(100);
        tablaPersonas.getColumnModel().getColumn(4).setPreferredWidth(25);
        tablaPersonas.getColumnModel().getColumn(5).setPreferredWidth(50);
        tablaPersonas.getColumnModel().getColumn(6).setPreferredWidth(40);
        
        revalidate();
        repaint();
    }
    
    
    
    public void imprimirTabla() {
        modelo.setRowCount(0);
        if (listaPersonas != null) {
            for (int i = 0; i < listaPersonas.length && listaPersonas[i] != null; i++) {
                String cedula = listaPersonas[i].getCedula();
                String nombre = listaPersonas[i].getNombre();
                String usuario = listaPersonas[i].getUsuario();
                String establecimiento = listaPersonas[i].getEstablecimiento();
                String estado = listaPersonas[i].getEstado();
                String fecha_inicio = listaPersonas[i].getFecha_inicio();
                String fecha_fin = listaPersonas[i].getFecha_termino();
                Object dato = new Object[]{cedula, nombre, usuario, establecimiento, estado, fecha_inicio, fecha_fin};
                modelo.addRow((Object[]) dato);
            }
        }

        tablaPersonas.repaint();
        tablaPersonas.revalidate();
    }

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JScrollPane scrollpane;
    private javax.swing.JTable tablaPersonas;
    // End of variables declaration//GEN-END:variables

    
}
