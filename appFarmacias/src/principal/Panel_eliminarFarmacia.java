/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package principal;

import java.awt.Image;
import javax.swing.ImageIcon;
import utils.BaseDatos_Maribel;
import utils.Farmacia;

public class Panel_eliminarFarmacia extends javax.swing.JPanel {

    BaseDatos_Maribel bd;
    String NIT;
    MenuAdmin menu;
    int indice;
    Farmacia [] listaFarmacias;
    String numContenedor;
    
    public Panel_eliminarFarmacia(BaseDatos_Maribel bd, String NIT,MenuAdmin menu, String numContenedor) {
        this.bd = bd;
        this.NIT = NIT;
        this.menu= menu;
        this.indice=0;
        listaFarmacias = new Farmacia[100];
        this.numContenedor=numContenedor;
        initComponents();
        initAlternComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont_principal = new javax.swing.JPanel();
        etq_logo = new javax.swing.JLabel();
        etq_titulo = new javax.swing.JLabel();
        cont_azul = new javax.swing.JPanel();
        etq_pregunta1 = new javax.swing.JLabel();
        etq_pregunta2 = new javax.swing.JLabel();
        etq_pregunta3 = new javax.swing.JLabel();
        btn_si = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();

        cont_principal.setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Eliminar Farmacia");

        cont_azul.setBackground(new java.awt.Color(79, 108, 211));

        etq_pregunta1.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        etq_pregunta1.setForeground(new java.awt.Color(255, 255, 255));
        etq_pregunta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_pregunta1.setText("¿Estas seguro de querer ");

        etq_pregunta2.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        etq_pregunta2.setForeground(new java.awt.Color(255, 255, 255));
        etq_pregunta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_pregunta2.setText("eliminar este ");

        etq_pregunta3.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        etq_pregunta3.setForeground(new java.awt.Color(255, 255, 255));
        etq_pregunta3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_pregunta3.setText("estableciemiento?");

        btn_si.setBackground(new java.awt.Color(239, 30, 30));
        btn_si.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_si.setForeground(new java.awt.Color(255, 255, 255));
        btn_si.setText("SI");
        btn_si.setToolTipText("");
        btn_si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siActionPerformed(evt);
            }
        });

        btn_volver.setBackground(new java.awt.Color(144, 177, 239));
        btn_volver.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_volver.setForeground(new java.awt.Color(255, 255, 255));
        btn_volver.setText("Volver");
        btn_volver.setToolTipText("");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cont_azulLayout = new javax.swing.GroupLayout(cont_azul);
        cont_azul.setLayout(cont_azulLayout);
        cont_azulLayout.setHorizontalGroup(
            cont_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_pregunta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(etq_pregunta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(etq_pregunta3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_azulLayout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addGroup(cont_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_si, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(172, 172, 172))
        );
        cont_azulLayout.setVerticalGroup(
            cont_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_azulLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(etq_pregunta1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_pregunta2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_pregunta3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(btn_si, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout cont_principalLayout = new javax.swing.GroupLayout(cont_principal);
        cont_principal.setLayout(cont_principalLayout);
        cont_principalLayout.setHorizontalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(etq_titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(cont_azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        cont_principalLayout.setVerticalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(cont_azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
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
    }
    
    private void btn_siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siActionPerformed
        
        boolean eliminada = false;
        
        eliminada = bd.eliminarFarmacia(NIT);
        
        if(eliminada){
            Confirmacion aviso = new Confirmacion("La farmacia fue eliminada con exito!");    
        }
        
    }//GEN-LAST:event_btn_siActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        
        listaFarmacias = bd.extraerFarmacias();
        for(int i= 0; i < listaFarmacias.length && listaFarmacias[i] != null; i++){
            if(listaFarmacias[i].getNIT().equalsIgnoreCase(NIT)){
                indice=i;
                break;
            }
        }
        this.menu.btn_visualizar_farmaciasActionPerformed(indice,numContenedor);
    }//GEN-LAST:event_btn_volverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_si;
    private javax.swing.JButton btn_volver;
    private javax.swing.JPanel cont_azul;
    private javax.swing.JPanel cont_principal;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_pregunta1;
    private javax.swing.JLabel etq_pregunta2;
    private javax.swing.JLabel etq_pregunta3;
    private javax.swing.JLabel etq_titulo;
    // End of variables declaration//GEN-END:variables
}
