
package principal;

import java.awt.Image;
import javax.swing.ImageIcon;
import utils.BaseDatosMiguel;

public class Panel_administrar_encargado extends javax.swing.JPanel {
    BaseDatosMiguel bdmiguel;
    private Alerta_Crear_Encargado ventanaAlerta;
    private Alerta_Eliminar_Encargado ventanaAlertaEliminar;
    private Alerta_Asignar_Encargado ventanaAlertaAsignar;
    private Alerta_Desasignar_Encargado ventanaAlertaDesasignar;
    private Alerta_Actualizar_Encargado ventanaAlertaActualizar;
    private Alerta_Historial_Encargado ventanaAlertaHistorial;
    boolean ventana_abierta = false;
  
    public Panel_administrar_encargado() {
        this.bdmiguel = new BaseDatosMiguel();
        initComponents();
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        setVisible(true);
        Image icono_logo = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logoFT.png"));
        icono_logo = icono_logo.getScaledInstance(125, 125, Image.SCALE_SMOOTH);
        etq_logo.setIcon(new ImageIcon(icono_logo));
        
        revalidate();
        repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_titulo = new javax.swing.JLabel();
        etq_logo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_crear_encargado = new javax.swing.JButton();
        btn_eliminar_encargado = new javax.swing.JButton();
        btn_asignar_encargado = new javax.swing.JButton();
        btn_desasignar_encargado = new javax.swing.JButton();
        btn_actualizar_info = new javax.swing.JButton();
        btn_historial_asignaciones = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Administrar Encargado");

        jPanel1.setBackground(new java.awt.Color(79, 108, 211));

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
        btn_eliminar_encargado.setPreferredSize(new java.awt.Dimension(75, 38));
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

        jLabel1.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Elige una opción");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_desasignar_encargado, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_crear_encargado, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_eliminar_encargado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_actualizar_info, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btn_historial_asignaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_asignar_encargado, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_crear_encargado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_asignar_encargado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminar_encargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_desasignar_encargado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_actualizar_info, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_historial_asignaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 625, Short.MAX_VALUE)
                        .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_eliminar_encargadoActionPerformed

    private void btn_asignar_encargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asignar_encargadoActionPerformed
        if (ventanaAlertaAsignar != null) {
            ventanaAlertaAsignar.dispose();
        }
        ventanaAlertaAsignar = new Alerta_Asignar_Encargado();
        ventanaAlertaAsignar.setVisible(true);
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_asignar_encargadoActionPerformed

    private void btn_desasignar_encargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desasignar_encargadoActionPerformed
        if (ventanaAlertaDesasignar != null) {
            ventanaAlertaDesasignar.dispose();
        }
        ventanaAlertaDesasignar = new Alerta_Desasignar_Encargado();
        ventanaAlertaDesasignar.setVisible(true);
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_desasignar_encargadoActionPerformed

    private void btn_actualizar_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_infoActionPerformed
        if (ventanaAlertaActualizar != null) {
            ventanaAlertaActualizar.dispose();
        }
        ventanaAlertaActualizar = new Alerta_Actualizar_Encargado();
        ventanaAlertaActualizar.setVisible(true);
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_actualizar_infoActionPerformed

    private void btn_historial_asignacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_historial_asignacionesActionPerformed
        if (ventanaAlertaHistorial != null) {
            ventanaAlertaHistorial.dispose();
        }
        ventanaAlertaHistorial = new Alerta_Historial_Encargado();
        ventanaAlertaHistorial.setVisible(true);
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_historial_asignacionesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar_info;
    private javax.swing.JButton btn_asignar_encargado;
    private javax.swing.JButton btn_crear_encargado;
    private javax.swing.JButton btn_desasignar_encargado;
    private javax.swing.JButton btn_eliminar_encargado;
    private javax.swing.JButton btn_historial_asignaciones;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
