
package principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import utils.BaseDatos_Maribel;
import utils.Farmacia;


public class Panel_visualizarFarmaciasOscar extends javax.swing.JPanel {
    
    BaseDatos_Maribel bd;
    Farmacia [] listaFarmacias;
    int pagina;
    
    MenuAdmin menu;
    GridBagConstraints restricciones;
            
    public Panel_visualizarFarmaciasOscar(MenuAdmin menu) {
        this.bd=menu.bd_mari;
        this.menu = menu;
        
        initComponents();
        initAlternComponents();
        
        this.listaFarmacias = this.bd.extraerFarmacias();
        this.pagina = 1;
        cargarPagina();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont_principal = new javax.swing.JPanel();
        contentFarmacias = new javax.swing.JPanel();
        contentPaginador = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        etq_titulo = new javax.swing.JLabel();
        etq_logo = new javax.swing.JLabel();

        cont_principal.setBackground(new java.awt.Color(255, 255, 255));

        contentFarmacias.setBackground(new java.awt.Color(255, 255, 255));
        contentFarmacias.setPreferredSize(new java.awt.Dimension(249, 332));

        javax.swing.GroupLayout contentPaginadorLayout = new javax.swing.GroupLayout(contentPaginador);
        contentPaginador.setLayout(contentPaginadorLayout);
        contentPaginadorLayout.setHorizontalGroup(
            contentPaginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
        );
        contentPaginadorLayout.setVerticalGroup(
            contentPaginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 334, Short.MAX_VALUE)
        );

        btnAtras.setText("ANTERIOR");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnSiguiente.setText("SIGUIENTE");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentFarmaciasLayout = new javax.swing.GroupLayout(contentFarmacias);
        contentFarmacias.setLayout(contentFarmaciasLayout);
        contentFarmaciasLayout.setHorizontalGroup(
            contentFarmaciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentFarmaciasLayout.createSequentialGroup()
                .addGroup(contentFarmaciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentFarmaciasLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(contentPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentFarmaciasLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        contentFarmaciasLayout.setVerticalGroup(
            contentFarmaciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentFarmaciasLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(contentPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contentFarmaciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        etq_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Lista de Farmacias");

        javax.swing.GroupLayout cont_principalLayout = new javax.swing.GroupLayout(cont_principal);
        cont_principal.setLayout(cont_principalLayout);
        cont_principalLayout.setHorizontalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contentFarmacias, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                    .addGroup(cont_principalLayout.createSequentialGroup()
                        .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        cont_principalLayout.setVerticalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contentFarmacias, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void initAlternComponents(){
        Image icono_logo = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logoFT.png"));
        icono_logo = icono_logo.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        etq_logo.setIcon(new ImageIcon(icono_logo));
        
        contentPaginador.setLayout(new GridBagLayout());
        contentPaginador.setPreferredSize(new Dimension(715, 330));
        
        restricciones = new GridBagConstraints();
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
    }
    
    public void cargarPagina(){
        if (this.pagina-1 == 0) {
            btnAtras.setEnabled(false);
        }
        contentPaginador.removeAll();
        for (int i=0; i<3; i++) {
            int indice = (3*(pagina-1))+i;
            
            JPanel conten = null;
            if (indice<listaFarmacias.length && listaFarmacias[indice]!=null) {
                conten = new Panel_farmacia(bd, listaFarmacias[indice].getNIT(), String.valueOf(i) , null);
            }else{
                conten = new JPanel();
                conten.setPreferredSize(new Dimension(233, 321));
                btnSiguiente.setEnabled(false);
            }
            
            restricciones.gridx = i;
            restricciones.gridy = 0;
            contentPaginador.add(conten, restricciones);
        }
        
        this.menu.revalidate();
        this.menu.repaint();
    }
    
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        if (this.pagina-1 > 0) {
            btnSiguiente.setEnabled(true);
            this.pagina--;
            cargarPagina();
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if (this.pagina+1 < this.listaFarmacias.length) {
            btnAtras.setEnabled(true);
            this.pagina++;
            cargarPagina();
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JPanel cont_principal;
    private javax.swing.JPanel contentFarmacias;
    private javax.swing.JPanel contentPaginador;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_titulo;
    // End of variables declaration//GEN-END:variables
}
