package principal;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import utils.BaseDatos;
import utils.BaseDatosCristian;
import utils.Usuario;
import javax.swing.UIManager;
import utils.BaseDatosValeria;
import utils.Producto;
import utils.Proveedores;
import utils.BaseDatosCristian;
import utils.BaseDatos_Maribel;
import utils.Stock1;



public class MenuEncargado extends javax.swing.JFrame {
    BaseDatosCristian bdC = new BaseDatosCristian();
    BaseDatos bd;
    BaseDatosValeria bdvaleria = new BaseDatosValeria();
    BaseDatos_Maribel bdM =new BaseDatos_Maribel();
    String NIT_farmacia;
    String id_usuario;
    int pagina;
    private String nombreUsuario;
    
    public MenuEncargado(BaseDatos bd, String nombreUsuario, String id_usuario) {
        this.bd = bd;
        this.id_usuario = id_usuario;
        this.NIT_farmacia = bdvaleria.buscarAsignacion(id_usuario);
        this.pagina = 1;
        initComponents();
        initAlternComponents(nombreUsuario);
        this.nombreUsuario = nombreUsuario;
    }
    
    public void initAlternComponents(String nombre_usuario){
        setTitle("Menu Principal");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
        
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_login.png")));
        
        Image icono_logo = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logoFT.png"));
        icono_logo = icono_logo.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        etq_logo.setIcon(new ImageIcon(icono_logo));
        
        Image icono_logo_admin = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_menu.png"));
        icono_logo_admin = icono_logo_admin.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        etq_logo_encargado.setIcon(new ImageIcon(icono_logo_admin));
        
        Image icono_logo_cerrar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_cerrar.png"));
        icono_logo_cerrar = icono_logo_cerrar.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        cerrar_sesion.setIcon(new ImageIcon(icono_logo_cerrar));
        
        etq_nombre.setText(nombre_usuario);
        
        
        revalidate();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_control = new javax.swing.JPanel();
        etq_texto_encargado = new javax.swing.JLabel();
        etq_logo_encargado = new javax.swing.JLabel();
        etq_texto_panel = new javax.swing.JLabel();
        btn_historial_ventas = new javax.swing.JButton();
        btn_catalogo = new javax.swing.JButton();
        btn_añadir_prod_stock = new javax.swing.JButton();
        btn_editar_prod = new javax.swing.JButton();
        btn_factura = new javax.swing.JButton();
        btn_lista_proveedores = new javax.swing.JButton();
        btn_Stock = new javax.swing.JButton();
        cerrar_sesion = new javax.swing.JButton();
        panel_bienvenida = new javax.swing.JPanel();
        etq_logo = new javax.swing.JLabel();
        etq_titulo = new javax.swing.JLabel();
        etq_nombre = new javax.swing.JLabel();
        etq_texto_continuar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_control.setBackground(new java.awt.Color(79, 108, 211));

        etq_texto_encargado.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etq_texto_encargado.setForeground(new java.awt.Color(255, 255, 255));
        etq_texto_encargado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_texto_encargado.setText("ENCARGADO");

        etq_texto_panel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etq_texto_panel.setForeground(new java.awt.Color(255, 255, 255));
        etq_texto_panel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_texto_panel.setText("Panel de control");

        btn_historial_ventas.setBackground(new java.awt.Color(144, 177, 239));
        btn_historial_ventas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_historial_ventas.setForeground(new java.awt.Color(255, 255, 255));
        btn_historial_ventas.setText("Historial ventas");
        btn_historial_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_historial_ventasActionPerformed(evt);
            }
        });

        btn_catalogo.setBackground(new java.awt.Color(144, 177, 239));
        btn_catalogo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_catalogo.setForeground(new java.awt.Color(255, 255, 255));
        btn_catalogo.setText("Catálogo");
        btn_catalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_catalogoActionPerformed(evt);
            }
        });

        btn_añadir_prod_stock.setBackground(new java.awt.Color(144, 177, 239));
        btn_añadir_prod_stock.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_añadir_prod_stock.setForeground(new java.awt.Color(255, 255, 255));
        btn_añadir_prod_stock.setText("Añadir Producto a Stock");
        btn_añadir_prod_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadir_prod_stockActionPerformed(evt);
            }
        });

        btn_editar_prod.setBackground(new java.awt.Color(144, 177, 239));
        btn_editar_prod.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_editar_prod.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar_prod.setText("Editar Producto");
        btn_editar_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_prodActionPerformed(evt);
            }
        });

        btn_factura.setBackground(new java.awt.Color(144, 177, 239));
        btn_factura.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_factura.setForeground(new java.awt.Color(255, 255, 255));
        btn_factura.setText("Factura");
        btn_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_facturaActionPerformed(evt);
            }
        });

        btn_lista_proveedores.setBackground(new java.awt.Color(144, 177, 239));
        btn_lista_proveedores.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_lista_proveedores.setForeground(new java.awt.Color(255, 255, 255));
        btn_lista_proveedores.setText("Lista de proveedores");
        btn_lista_proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lista_proveedoresActionPerformed(evt);
            }
        });

        btn_Stock.setBackground(new java.awt.Color(144, 177, 239));
        btn_Stock.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_Stock.setForeground(new java.awt.Color(255, 255, 255));
        btn_Stock.setText("Stock");
        btn_Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StockActionPerformed(evt);
            }
        });

        cerrar_sesion.setBorder(null);
        cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_sesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_controlLayout = new javax.swing.GroupLayout(panel_control);
        panel_control.setLayout(panel_controlLayout);
        panel_controlLayout.setHorizontalGroup(
            panel_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_controlLayout.createSequentialGroup()
                .addGroup(panel_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_controlLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etq_texto_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_controlLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panel_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_factura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_editar_prod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_catalogo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_historial_ventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_añadir_prod_stock, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(btn_lista_proveedores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
            .addGroup(panel_controlLayout.createSequentialGroup()
                .addGroup(panel_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_controlLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(panel_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_texto_encargado)
                            .addComponent(etq_logo_encargado, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_controlLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_controlLayout.setVerticalGroup(
            panel_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_controlLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(etq_logo_encargado, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_texto_encargado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_texto_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btn_historial_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_catalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_añadir_prod_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_editar_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_lista_proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        panel_bienvenida.setBackground(new java.awt.Color(255, 255, 255));

        etq_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Bienvenido a FARMATECH ");

        etq_nombre.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etq_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_nombre.setText("-----");

        etq_texto_continuar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etq_texto_continuar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_texto_continuar.setText("Selecciona una opción para continuar.");

        javax.swing.GroupLayout panel_bienvenidaLayout = new javax.swing.GroupLayout(panel_bienvenida);
        panel_bienvenida.setLayout(panel_bienvenidaLayout);
        panel_bienvenidaLayout.setHorizontalGroup(
            panel_bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bienvenidaLayout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addGroup(panel_bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bienvenidaLayout.createSequentialGroup()
                        .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bienvenidaLayout.createSequentialGroup()
                        .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(303, 303, 303))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bienvenidaLayout.createSequentialGroup()
                        .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bienvenidaLayout.createSequentialGroup()
                        .addComponent(etq_texto_continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))))
        );
        panel_bienvenidaLayout.setVerticalGroup(
            panel_bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bienvenidaLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(etq_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_nombre)
                .addGap(44, 44, 44)
                .addComponent(etq_texto_continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_control, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_bienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_control, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_bienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void btn_catalogoActionPerformed(){
        btn_catalogoActionPerformed(null);
    }
    
    public void btn_catalogoActionPerformed(int pag){
        this.pagina=pag;
        btn_catalogoActionPerformed(null);
    }
    
    private void btn_catalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_catalogoActionPerformed
            
            CatalogoProducto catalogo = new CatalogoProducto(this,this.pagina);
            catalogo.setPreferredSize( panel_bienvenida.getPreferredSize() );
            catalogo.setSize( panel_bienvenida.getSize() );
            
            // Eliminar el contenido del contentPrincipal
            panel_bienvenida.removeAll();
            
            // Agregar dentro de contentPrincipal el contenedor nuevo.
            panel_bienvenida.add(catalogo);
            
            repaint();
            revalidate();        
    }//GEN-LAST:event_btn_catalogoActionPerformed
    
    public void btn_historial_ventasActionPerformed(){
        btn_historial_ventasActionPerformed(null);
    }
    
    
    private void btn_historial_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_historial_ventasActionPerformed
        HistorialVentas historial = new HistorialVentas(NIT_farmacia,this);
        historial.setPreferredSize( panel_bienvenida.getPreferredSize() );
        historial.setSize( panel_bienvenida.getSize() );
        
        // Eliminar el contenido del contentPrincipal
        panel_bienvenida.removeAll();
        
        // Agregar dentro de contentPrincipal el contenedor nuevo.
        panel_bienvenida.add(historial);
        
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_historial_ventasActionPerformed

    private void btn_añadir_prod_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadir_prod_stockActionPerformed
        Panel_crear_producto nuevo = new Panel_crear_producto();
        
        // Ajustar el tamaño del contenedor nuevo
        nuevo.setPreferredSize(panel_bienvenida.getPreferredSize());
        nuevo.setSize(panel_bienvenida.getSize());

        
        // Eliminar el contenido del principal
        panel_bienvenida.removeAll();
        
        
        // Agregar dentro del contenido principal el contenido nuevo
        panel_bienvenida.add(nuevo);
        // Hacer Repaint() y Revalidate()
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_añadir_prod_stockActionPerformed
    
    public void btn_editar_prodActionPerformed(){
        btn_editar_prodActionPerformed(null);
    }
    
    private void btn_editar_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_prodActionPerformed
        EditarProducto nuevo = new EditarProducto(id_usuario,this);

        // Ajustar el tamaño del contenedor nuevo
        nuevo.setPreferredSize(panel_bienvenida.getPreferredSize());
        nuevo.setSize(panel_bienvenida.getSize());

        // Eliminar el contenido del principal
        panel_bienvenida.removeAll();

        // Agregar dentro del contenido principal el contenido nuevo
        panel_bienvenida.add(nuevo);
        //Hacer Repaint() y Revalidate()
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_editar_prodActionPerformed

    private void btn_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facturaActionPerformed
        Panel_factura nuevo = new Panel_factura(this, nombreUsuario);
        
         // Ajustar el tamaño del contenedor nuevo
        nuevo.setPreferredSize(panel_bienvenida.getPreferredSize());
        nuevo.setSize(panel_bienvenida.getSize());

        // Eliminar el contenido del principal
        panel_bienvenida.removeAll();

        // Agregar dentro del contenido principal el contenido nuevo
        panel_bienvenida.add(nuevo);
        // Hacer Repaint() y Revalidate()
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_facturaActionPerformed

    private void btn_lista_proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lista_proveedoresActionPerformed
        Proveedores listado[] = bdvaleria.listaProveedores();
        Panel_listado_proveedores_encargado nuevo = new Panel_listado_proveedores_encargado(listado);

        // Ajustar el tamaño del contenedor nuevo
        nuevo.setPreferredSize(panel_bienvenida.getPreferredSize());
        nuevo.setSize(panel_bienvenida.getSize());

        // Eliminar el contenido del principal
        panel_bienvenida.removeAll();

        // Agregar dentro del contenido principal el contenido nuevo
        panel_bienvenida.add(nuevo);
        // Hacer Repaint() y Revalidate()
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_lista_proveedoresActionPerformed
    public void btn_StockActionPerformed(){
        btn_StockActionPerformed(null);
    }
    
    private void btn_StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StockActionPerformed

        Stock1 listado[] = bdvaleria.listaStock(NIT_farmacia);
        Panel_listado_stock nuevo = new Panel_listado_stock(listado, this);

        // Ajustar el tamaño del contenedor nuevo
        nuevo.setPreferredSize(panel_bienvenida.getPreferredSize());
        nuevo.setSize(panel_bienvenida.getSize());

        // Eliminar el contenido del principal
        panel_bienvenida.removeAll();

        // Agregar dentro del contenido principal el contenido nuevo
        panel_bienvenida.add(nuevo);
        // Hacer Repaint() y Revalidate()
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_StockActionPerformed

    private void cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_sesionActionPerformed
        // Establecer el texto de los botones y el estilo del cuadro de diálogo
        UIManager.put("OptionPane.yesButtonText", "Sí");
        UIManager.put("OptionPane.noButtonText", "No");
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 18)); // Cambiar la fuente del mensaje
        UIManager.put("Button.background", new Color(255,255,255)); // Color de fondo del botón No
        UIManager.put("Button.foreground", Color.BLACK); // Color de texto del botón No
        UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.BOLD, 18)); // Cambiar la fuente de los botones del cuadro de diálogo

        // Mostrar el cuadro de diálogo de confirmación
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas cerrar sesión?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (confirmacion == JOptionPane.YES_OPTION) {
            // Cerrar sesión y volver a la ventana de inicio de sesión
            InicioSesion ventana_sesion = new InicioSesion(bd);
            dispose(); // Cerrar la ventana actual
        }
    }//GEN-LAST:event_cerrar_sesionActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Stock;
    private javax.swing.JButton btn_añadir_prod_stock;
    private javax.swing.JButton btn_catalogo;
    private javax.swing.JButton btn_editar_prod;
    private javax.swing.JButton btn_factura;
    private javax.swing.JButton btn_historial_ventas;
    private javax.swing.JButton btn_lista_proveedores;
    private javax.swing.JButton cerrar_sesion;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_logo_encargado;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_texto_continuar;
    private javax.swing.JLabel etq_texto_encargado;
    private javax.swing.JLabel etq_texto_panel;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JPanel panel_bienvenida;
    private javax.swing.JPanel panel_control;
    // End of variables declaration//GEN-END:variables
}
