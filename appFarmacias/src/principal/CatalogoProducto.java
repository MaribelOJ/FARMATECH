
package principal;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.io.IOException;
import utils.BaseDatos;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.io.IOException;
import utils.BaseDatosCristian;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import utils.BaseDatosCristian;
import utils.ProductosCristian;
import javax.swing.JFrame;
import javax.swing.JPanel;




public class CatalogoProducto extends javax.swing.JPanel {
    BaseDatosCristian bdC;
    BaseDatos bd;
    
    ProductosCristian [] listaProductos;
    int pagina;
    MenuEncargado menu;
    GridBagConstraints restricciones;
    
    
    public CatalogoProducto(BaseDatos bd) throws IOException {
        this.bdC = bdC;
        this.menu = menu;
        
        this.listaProductos = bdC.extraerProducto();
        this.pagina = 1;
        cargarPagina();
    }

 

    @SuppressWarnings("unchecked")
    public void InitAlternComponents(){
        Image icono_logo = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logoFT.png"));
        icono_logo = icono_logo.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        etq_logo.setIcon(new ImageIcon(icono_logo));
        
        contenedor_Paginador.setLayout(new GridBagLayout());
        contenedor_Paginador.setPreferredSize(new Dimension(715, 330));
        
        restricciones = new GridBagConstraints();
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        
    }
    
   public void cargarPagina() {
        if (this.pagina - 1 == 0) {
            btn_atras.setEnabled(false);
        }
        contenedor_Paginador.removeAll();
        for (int i = 0; i < 3; i++) {
            int indice = (3 * (pagina - 1)) + i; // Corrección en el cálculo del índice
        
            JPanel contenedor = null;
            if (indice < listaProductos.length && listaProductos[indice] != null) {
                

            } else {
                contenedor = new JPanel();
                contenedor.setPreferredSize(new Dimension(233, 321)); // Corrección en la asignación del tamaño
                btn_siguiente.setEnabled(false);
            }
            restricciones.gridx = i;
            restricciones.gridy = 0;
            contenedor_Paginador.add(contenedor, restricciones);
        }
        this.menu.revalidate();
        this.menu.repaint();
    }
  

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor_catalogo = new javax.swing.JPanel();
        contenedor_Paginador = new javax.swing.JPanel();
        btn_atras = new javax.swing.JButton();
        btn_siguiente = new javax.swing.JButton();
        campoBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        etq_titulo = new javax.swing.JLabel();
        etq_logo = new javax.swing.JLabel();

        javax.swing.GroupLayout contenedor_PaginadorLayout = new javax.swing.GroupLayout(contenedor_Paginador);
        contenedor_Paginador.setLayout(contenedor_PaginadorLayout);
        contenedor_PaginadorLayout.setHorizontalGroup(
            contenedor_PaginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        contenedor_PaginadorLayout.setVerticalGroup(
            contenedor_PaginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        btn_atras.setText("ATRAS");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        btn_siguiente.setText("SIGUIENTE");
        btn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguienteActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(34, 30, 239));
        btnBuscar.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedor_catalogoLayout = new javax.swing.GroupLayout(contenedor_catalogo);
        contenedor_catalogo.setLayout(contenedor_catalogoLayout);
        contenedor_catalogoLayout.setHorizontalGroup(
            contenedor_catalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_catalogoLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(contenedor_Paginador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(contenedor_catalogoLayout.createSequentialGroup()
                .addGroup(contenedor_catalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedor_catalogoLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(btn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedor_catalogoLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedor_catalogoLayout.setVerticalGroup(
            contenedor_catalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_catalogoLayout.createSequentialGroup()
                .addGroup(contenedor_catalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(32, 32, 32)
                .addComponent(contenedor_Paginador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contenedor_catalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_atras, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btn_siguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        etq_titulo.setFont(new java.awt.Font("Arial", 2, 36)); // NOI18N
        etq_titulo.setText("CATALOGO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenedor_catalogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(contenedor_catalogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        if (this.pagina+1 < this.listaProductos.length) {
            btn_atras.setEnabled(true);
            this.pagina++;
            cargarPagina();
        }
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguienteActionPerformed
        if (this.pagina-1 > 0) {
            btn_siguiente.setEnabled(true);
            this.pagina--;
            cargarPagina();
        }
    }//GEN-LAST:event_btn_siguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_siguiente;
    private javax.swing.JTextField campoBuscar;
    private javax.swing.JPanel contenedor_Paginador;
    private javax.swing.JPanel contenedor_catalogo;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_titulo;
    // End of variables declaration//GEN-END:variables


    

   

    

   

   
}
