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
    private Alerta_Crear_Encargado ventanaAlerta;
    private Alerta_Eliminar_Encargado ventanaAlertaEliminar;
    private Alerta_Asignar_Encargado ventanaAlertaAsignar;
     private Alerta_Desasignar_Encargado ventanaAlertaDesasignar;
    Usuario listaPersonas[];
    DefaultTableModel  modelo;
    boolean ventana_abierta = false;
    
    public Panel_listado_encargados(Usuario[] listado) {
        this.bdmiguel = bdmiguel;
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
        btn_crear_encargado = new javax.swing.JButton();
        btn_eliminar_encargado = new javax.swing.JButton();
        btn_asignar_encargado = new javax.swing.JButton();
        btn_desasignar_encargado = new javax.swing.JButton();
        btn_actualizar_info = new javax.swing.JButton();
        btn_historial_asignaciones = new javax.swing.JButton();

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

        btn_crear_encargado.setBackground(new java.awt.Color(144, 177, 239));
        btn_crear_encargado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_crear_encargado.setForeground(new java.awt.Color(255, 255, 255));
        btn_crear_encargado.setText("Crear encargado");
        btn_crear_encargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_encargadoActionPerformed(evt);
            }
        });

        btn_eliminar_encargado.setBackground(new java.awt.Color(144, 177, 239));
        btn_eliminar_encargado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_eliminar_encargado.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar_encargado.setText("Eliminar encargado");
        btn_eliminar_encargado.setPreferredSize(new java.awt.Dimension(75, 32));
        btn_eliminar_encargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_encargadoActionPerformed(evt);
            }
        });

        btn_asignar_encargado.setBackground(new java.awt.Color(144, 177, 239));
        btn_asignar_encargado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_asignar_encargado.setForeground(new java.awt.Color(255, 255, 255));
        btn_asignar_encargado.setText("Asignar encargado");
        btn_asignar_encargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asignar_encargadoActionPerformed(evt);
            }
        });

        btn_desasignar_encargado.setBackground(new java.awt.Color(144, 177, 239));
        btn_desasignar_encargado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_desasignar_encargado.setForeground(new java.awt.Color(255, 255, 255));
        btn_desasignar_encargado.setText("Desasignar encargado");
        btn_desasignar_encargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desasignar_encargadoActionPerformed(evt);
            }
        });

        btn_actualizar_info.setBackground(new java.awt.Color(144, 177, 239));
        btn_actualizar_info.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_actualizar_info.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar_info.setText("Actualizar información");
        btn_actualizar_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar_infoActionPerformed(evt);
            }
        });

        btn_historial_asignaciones.setBackground(new java.awt.Color(144, 177, 239));
        btn_historial_asignaciones.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_historial_asignaciones.setForeground(new java.awt.Color(255, 255, 255));
        btn_historial_asignaciones.setText("Ver historial asignaciones");
        btn_historial_asignaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_historial_asignacionesActionPerformed(evt);
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
                        .addGap(0, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_crear_encargado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_eliminar_encargado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_asignar_encargado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_desasignar_encargado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_historial_asignaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_actualizar_info, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(174, 174, 174))))
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
                .addGap(18, 18, 18)
                .addComponent(scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_crear_encargado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizar_info, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_asignar_encargado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_desasignar_encargado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar_encargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_historial_asignaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizar_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_infoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actualizar_infoActionPerformed

    private void btn_crear_encargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_encargadoActionPerformed
        if (ventanaAlerta != null) {
            ventanaAlerta.dispose();   
        }
        ventanaAlerta = new Alerta_Crear_Encargado();
        ventanaAlerta.setVisible(true);
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_crear_encargadoActionPerformed

    private void btn_eliminar_encargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_encargadoActionPerformed
        if (ventanaAlertaEliminar != null) {
            ventanaAlertaEliminar.dispose();   
        }
        ventanaAlertaEliminar = new Alerta_Eliminar_Encargado();
        ventanaAlertaEliminar.setVisible(true);
    }//GEN-LAST:event_btn_eliminar_encargadoActionPerformed

    private void btn_historial_asignacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_historial_asignacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_historial_asignacionesActionPerformed

    private void btn_asignar_encargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asignar_encargadoActionPerformed
       
        if (ventanaAlertaAsignar != null) {
            ventanaAlertaAsignar.dispose();   
        }
        ventanaAlertaAsignar = new Alerta_Asignar_Encargado();
        ventanaAlertaAsignar.setVisible(true);
    }//GEN-LAST:event_btn_asignar_encargadoActionPerformed

    private void btn_desasignar_encargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desasignar_encargadoActionPerformed
        if (ventanaAlertaDesasignar != null) {
            ventanaAlertaDesasignar.dispose();   
        }
        ventanaAlertaDesasignar = new Alerta_Desasignar_Encargado();
        ventanaAlertaDesasignar.setVisible(true);
    }//GEN-LAST:event_btn_desasignar_encargadoActionPerformed

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

        repaint();
        revalidate();
    }

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar_info;
    private javax.swing.JButton btn_asignar_encargado;
    private javax.swing.JButton btn_crear_encargado;
    private javax.swing.JButton btn_desasignar_encargado;
    private javax.swing.JButton btn_eliminar_encargado;
    private javax.swing.JButton btn_historial_asignaciones;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JScrollPane scrollpane;
    private javax.swing.JTable tablaPersonas;
    // End of variables declaration//GEN-END:variables

    
}
