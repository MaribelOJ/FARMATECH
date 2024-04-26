
package principal;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import utils.BaseDatosMiguel;


public class Panel_factura extends javax.swing.JPanel {
    
    BaseDatosMiguel bdmiguel;
    private Alerta ventanaAlerta;
    MenuEncargado menu;
    private String nombreUsuario;
    
    public Panel_factura(MenuEncargado menu, String nombreUsuario) {
        this.bdmiguel = new BaseDatosMiguel();
        this.menu = menu;
        this.nombreUsuario = nombreUsuario;
        initComponents();
        initAlternComponents();
    }

    public void initAlternComponents(){
        setVisible(true);
        Image icono_logo = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logoFT.png"));
        icono_logo = icono_logo.getScaledInstance(75, 75, Image.SCALE_SMOOTH);
        etq_logo.setIcon(new ImageIcon(icono_logo));
        
        SwingUtilities.invokeLater(() -> {
            campo_documento.requestFocusInWindow();
        });
        
        btn_continuar.setEnabled(false);
        campo_nombre.setEnabled(false);
        revalidate();
        repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido_p = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        etq_logo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        etq_doc = new javax.swing.JLabel();
        campo_documento = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        etq_estado = new javax.swing.JLabel();
        etq_activo = new javax.swing.JLabel();
        etq_nombre = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        btn_continuar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        contenido_p.setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("GENERAR FACTURA");

        jPanel1.setBackground(new java.awt.Color(79, 108, 211));

        etq_doc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_doc.setForeground(new java.awt.Color(255, 255, 255));
        etq_doc.setText("Documento:");

        campo_documento.setBackground(new java.awt.Color(255, 255, 255));
        campo_documento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campo_documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_documentoActionPerformed(evt);
            }
        });

        btn_buscar.setBackground(new java.awt.Color(144, 177, 239));
        btn_buscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        etq_estado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_estado.setForeground(new java.awt.Color(255, 255, 255));
        etq_estado.setText("Estado:");

        etq_activo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_activo.setForeground(new java.awt.Color(0, 0, 0));

        etq_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_nombre.setForeground(new java.awt.Color(255, 255, 255));
        etq_nombre.setText("Nombre:");

        campo_nombre.setBackground(new java.awt.Color(255, 255, 255));
        campo_nombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campo_nombre.setForeground(new java.awt.Color(0, 0, 0));
        campo_nombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campo_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nombreActionPerformed(evt);
            }
        });

        btn_continuar.setBackground(new java.awt.Color(144, 177, 239));
        btn_continuar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_continuar.setForeground(new java.awt.Color(255, 255, 255));
        btn_continuar.setText("Continuar");
        btn_continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_continuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etq_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(etq_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(etq_nombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(etq_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(btn_continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_estado)
                    .addComponent(etq_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_nombre)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(btn_continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout contenido_pLayout = new javax.swing.GroupLayout(contenido_p);
        contenido_p.setLayout(contenido_pLayout);
        contenido_pLayout.setHorizontalGroup(
            contenido_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_pLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(contenido_pLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        contenido_pLayout.setVerticalGroup(
            contenido_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_pLayout.createSequentialGroup()
                .addGroup(contenido_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenido_pLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(93, 93, 93)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido_p, javax.swing.GroupLayout.PREFERRED_SIZE, 762, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido_p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_continuarActionPerformed
        String cedula = campo_documento.getText();
        String nombre = campo_nombre.getText();
        
        if (campo_documento.getText().equals("") || campo_nombre.getText().equals(""))  {
            // Mostrar alerta indicando que todos los campos son obligatorios
            Alerta ventana = new Alerta("Todos los campos son obligatorios.");

            // Cerrar la ventana de alerta anterior (si existe)
            if (ventanaAlerta != null) {
                ventanaAlerta.dispose();
            }

            // Asignar la nueva ventana de alerta como la ventana actual
            ventanaAlerta = ventana;
        
        }else{
            // Verificar si el cliente está registrado
            boolean clienteRegistrado = bdmiguel.buscarCliente(cedula);

            if (!clienteRegistrado) {
                // Si el cliente no está registrado, agregarlo a la base de datos
                bdmiguel.agregarCliente(cedula, nombre);
                // Mostrar un mensaje o realizar alguna acción adicional si lo deseas
            }
            
            Panel_factura_final nuevo = new Panel_factura_final(menu, nombre, nombreUsuario);
            nuevo.setPreferredSize(contenido_p.getPreferredSize());
            nuevo.setSize(contenido_p.getSize());

            contenido_p.removeAll();
            contenido_p.add(nuevo);

            repaint();
            revalidate();
        }
        
    }//GEN-LAST:event_btn_continuarActionPerformed

    private void campo_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nombreActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String cedula = campo_documento.getText();
        boolean clienteRegistrado = bdmiguel.buscarCliente(cedula);
        if (clienteRegistrado) {
            etq_activo.setText("Registrado.");
            etq_activo.setForeground(Color.GREEN); // Cambia el color del texto a verde
            campo_nombre.setText(bdmiguel.obtenerNombreCliente(cedula));
            campo_nombre.setEnabled(false);
            btn_continuar.setEnabled(true);
        } else {
            etq_activo.setText("No registrado.");
            etq_activo.setForeground(Color.RED); // Cambia el color del texto a rojo
            campo_nombre.setText("");
            campo_nombre.setEnabled(true);
            btn_continuar.setEnabled(true);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void campo_documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_documentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_documentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_continuar;
    private javax.swing.JTextField campo_documento;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JPanel contenido_p;
    private javax.swing.JLabel etq_activo;
    private javax.swing.JLabel etq_doc;
    private javax.swing.JLabel etq_estado;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
