
package principal;

import java.awt.Image;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import utils.BaseDatosMiguel;


public class Alerta_Eliminar_Encargado extends javax.swing.JFrame {
    private Alerta ventanaAlerta;
    BaseDatosMiguel bdmiguel;
    public Alerta_Eliminar_Encargado() {
        
        this.bdmiguel = new BaseDatosMiguel();
        initComponents();
        initAlternComponents();
    }
    
    private void initAlternComponents(){
        
        setTitle("Eliminación de encargado");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        SwingUtilities.invokeLater(() -> {
            foco.requestFocusInWindow();
        });
        
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_login.png")));
        
        Image icono_logo = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logosinfondo.png"));
        icono_logo = icono_logo.getScaledInstance(100, 99, Image.SCALE_SMOOTH);
        etq_logo.setIcon(new ImageIcon(icono_logo));
        
        String documentoPlaceholder = "Documento:";
        campo_documento.setText(documentoPlaceholder);
        campo_documento.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                String currentText = campo_documento.getText();
                
                if (currentText.equals(documentoPlaceholder)) {
                    campo_documento.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                String currentText = campo_documento.getText();
                
                if (currentText.isEmpty()) {
                    campo_documento.setText(documentoPlaceholder);
                }
            }
        });
        
        
        revalidate();
        repaint();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_titulo = new javax.swing.JLabel();
        fondo = new javax.swing.JPanel();
        campo_documento = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        etq_logo = new javax.swing.JLabel();
        foco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Buscar encargado");

        fondo.setBackground(new java.awt.Color(79, 108, 211));

        campo_documento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campo_documento.setText("jTextField1");

        btn_buscar.setBackground(new java.awt.Color(239, 30, 30));
        btn_buscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_volver.setBackground(new java.awt.Color(144, 177, 239));
        btn_volver.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_volver.setForeground(new java.awt.Color(255, 255, 255));
        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campo_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(campo_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(foco)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(foco)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        dispose();
        ventanaAlerta.dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // Verificar si algún campo está vacío
        if (campo_documento.getText().equals("")) {
            // Mostrar alerta indicando que todos los campos son obligatorios
            Alerta ventana = new Alerta("Todos los campos son obligatorios.");

            // Cerrar la ventana de alerta anterior (si existe)
            if (ventanaAlerta != null) {
                ventanaAlerta.dispose();
            }

            // Asignar la nueva ventana de alerta como la ventana actual
            ventanaAlerta = ventana;

        } else if (campo_documento.getText().equals("Documento:")) {
            // Mostrar alerta indicando que todos los campos son obligatorios
            Alerta ventana = new Alerta("Todos los campos son obligatorios.");

            // Cerrar la ventana de alerta anterior (si existe)
            if (ventanaAlerta != null) {
                ventanaAlerta.dispose();
            }

            // Asignar la nueva ventana de alerta como la ventana actual
            ventanaAlerta = ventana;

        } else {
           
           
            if(bdmiguel.buscarPersona(campo_documento.getText())){
               Alerta_Eliminar_Encargado_Final aviso = new Alerta_Eliminar_Encargado_Final(campo_documento.getText());
               dispose();
           
            }else{
                Alerta ventana =  new Alerta("El encargado no existe en el sistema.");
                
                if (ventanaAlerta != null) {
                    ventanaAlerta.dispose();
                }
                // Asignar la nueva ventana de alerta como la ventana actual
                ventanaAlerta = ventana;
            }
           
            
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

   
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JTextField campo_documento;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel foco;
    private javax.swing.JPanel fondo;
    // End of variables declaration//GEN-END:variables
}
