package principal;
import java.awt.Image;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.ImageIcon;
import utils.BaseDatos;
import utils.BaseDatosMiguel;
import utils.BaseDatos_Maribel;
import utils.Usuario;
import utils.BaseDatosValeria;
import utils.Proveedores;


public class MenuAdmin extends javax.swing.JFrame {
    
    BaseDatos bd;
    int indice;
    String numContenedor;

    
    BaseDatosMiguel bdmiguel=new BaseDatosMiguel();
    
    BaseDatos_Maribel bd_mari;
        
    Connection conexion = bdmiguel.getConexion();
    Statement manipularBD = bdmiguel.getManipularBD();
    
    BaseDatosValeria bdvaleria = new BaseDatosValeria();
    
    public MenuAdmin(BaseDatos bd, String nombre_usuario) {
        this.bd = bd;
        this.bdmiguel = bdmiguel;
        this.bd_mari = new BaseDatos_Maribel();
        this.bdvaleria = bdvaleria;
        this.indice =0;
        this.numContenedor="";
        initComponents();
        initAlternComponents(nombre_usuario);
        
        
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
        etq_logo_admin.setIcon(new ImageIcon(icono_logo_admin));
        
        etq_nombre.setText(nombre_usuario);

        revalidate();
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_control = new javax.swing.JPanel();
        etq_texto_admin = new javax.swing.JLabel();
        etq_logo_admin = new javax.swing.JLabel();
        etq_texto_panel = new javax.swing.JLabel();
        btn_visualizar_encargado = new javax.swing.JButton();
        btn_visualizar_farmacias = new javax.swing.JButton();
        btn_crear_farmacia = new javax.swing.JButton();
        btn_informe_ventas = new javax.swing.JButton();
        btn_lista_proveedores = new javax.swing.JButton();
        btn_administar_encargados = new javax.swing.JButton();
        panel_bienvenida = new javax.swing.JPanel();
        etq_logo = new javax.swing.JLabel();
        etq_titulo = new javax.swing.JLabel();
        etq_nombre = new javax.swing.JLabel();
        etq_texto_continuar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_control.setBackground(new java.awt.Color(79, 108, 211));

        etq_texto_admin.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etq_texto_admin.setForeground(new java.awt.Color(255, 255, 255));
        etq_texto_admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_texto_admin.setText("ADMIN");

        etq_texto_panel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etq_texto_panel.setForeground(new java.awt.Color(255, 255, 255));
        etq_texto_panel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_texto_panel.setText("Panel de control");

        btn_visualizar_encargado.setBackground(new java.awt.Color(144, 177, 239));
        btn_visualizar_encargado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_visualizar_encargado.setForeground(new java.awt.Color(255, 255, 255));
        btn_visualizar_encargado.setText("Visualizar encargados");
        btn_visualizar_encargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_visualizar_encargadoActionPerformed(evt);
            }
        });

        btn_visualizar_farmacias.setBackground(new java.awt.Color(144, 177, 239));
        btn_visualizar_farmacias.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_visualizar_farmacias.setForeground(new java.awt.Color(255, 255, 255));
        btn_visualizar_farmacias.setText("Visualizar farmacias");
        btn_visualizar_farmacias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_visualizar_farmaciasActionPerformed(evt);
            }
        });

        btn_crear_farmacia.setBackground(new java.awt.Color(144, 177, 239));
        btn_crear_farmacia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_crear_farmacia.setForeground(new java.awt.Color(255, 255, 255));
        btn_crear_farmacia.setText("Crear farmacia");
        btn_crear_farmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_farmaciaActionPerformed(evt);
            }
        });

        btn_informe_ventas.setBackground(new java.awt.Color(144, 177, 239));
        btn_informe_ventas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_informe_ventas.setForeground(new java.awt.Color(255, 255, 255));
        btn_informe_ventas.setText("Informe de ventas");
        btn_informe_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_informe_ventasActionPerformed(evt);
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

        btn_administar_encargados.setBackground(new java.awt.Color(144, 177, 239));
        btn_administar_encargados.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_administar_encargados.setForeground(new java.awt.Color(255, 255, 255));
        btn_administar_encargados.setText("Administrar encargados");
        btn_administar_encargados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_administar_encargadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_controlLayout = new javax.swing.GroupLayout(panel_control);
        panel_control.setLayout(panel_controlLayout);
        panel_controlLayout.setHorizontalGroup(
            panel_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_controlLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(panel_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etq_texto_admin, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(etq_logo_admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_controlLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(panel_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_controlLayout.createSequentialGroup()
                        .addComponent(etq_texto_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_controlLayout.createSequentialGroup()
                        .addGroup(panel_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_visualizar_farmacias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_crear_farmacia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_informe_ventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_lista_proveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_visualizar_encargado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_administar_encargados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32))))
        );
        panel_controlLayout.setVerticalGroup(
            panel_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_controlLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(etq_logo_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_texto_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_texto_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_administar_encargados, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_visualizar_encargado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_visualizar_farmacias, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_crear_farmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_informe_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_lista_proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        panel_bienvenida.setBackground(new java.awt.Color(255, 255, 255));
        panel_bienvenida.setPreferredSize(new java.awt.Dimension(791, 500));

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
                .addContainerGap(184, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_control, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_bienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void btn_lista_proveedoresActionPerformed(){
        
        btn_lista_proveedoresActionPerformed(null);
    }
    
    private void btn_lista_proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lista_proveedoresActionPerformed
        Proveedores listado[] = bdvaleria.listaProveedores_admin();
        Panel_listado_proveedores_admin nuevo = new Panel_listado_proveedores_admin (listado, this);

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
    
    private void btn_visualizar_encargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_visualizar_encargadoActionPerformed
        Usuario listado[]= bdmiguel.listaEncargados();
        Panel_listado_encargados nuevo = new Panel_listado_encargados(listado);
        
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
    }//GEN-LAST:event_btn_visualizar_encargadoActionPerformed

    private void btn_crear_farmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_farmaciaActionPerformed
        Panel_crearFarmacia registro= new Panel_crearFarmacia(bd_mari);
        
        registro.setPreferredSize(panel_bienvenida.getPreferredSize());
        registro.setSize(panel_bienvenida.getSize());
         
        panel_bienvenida.removeAll();

        panel_bienvenida.add(registro);

        repaint();
        revalidate();
    }//GEN-LAST:event_btn_crear_farmaciaActionPerformed

    public void btn_visualizar_farmaciasActionPerformed(int indice,String contenedor){
        this.indice = indice;
        this.numContenedor=contenedor;
        btn_visualizar_farmaciasActionPerformed(null);
    }
    
    private void btn_visualizar_farmaciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_visualizar_farmaciasActionPerformed
        Panel_visualizarFarmacias vista= new Panel_visualizarFarmacias(bd_mari,this,indice, numContenedor);
//        Panel_visualizarFarmaciasOscar vista= new Panel_visualizarFarmaciasOscar(this);
        
        vista.setPreferredSize(panel_bienvenida.getPreferredSize());
        vista.setSize(panel_bienvenida.getSize());
         
        panel_bienvenida.removeAll();

        panel_bienvenida.add(vista);
        this.indice=0;
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_visualizar_farmaciasActionPerformed

    private void btn_administar_encargadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_administar_encargadosActionPerformed
        Panel_administrar_encargado nuevo = new Panel_administrar_encargado();
        
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
    }//GEN-LAST:event_btn_administar_encargadosActionPerformed

    private void btn_informe_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_informe_ventasActionPerformed

        Panel_informeVentas resumen = new Panel_informeVentas(this);
        resumen.setPreferredSize(panel_bienvenida.getPreferredSize());
        resumen.setSize(panel_bienvenida.getSize());
        panel_bienvenida.removeAll();
        panel_bienvenida.add(resumen);
        repaint();
        revalidate();
        
    }//GEN-LAST:event_btn_informe_ventasActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_administar_encargados;
    private javax.swing.JButton btn_crear_farmacia;
    private javax.swing.JButton btn_informe_ventas;
    private javax.swing.JButton btn_lista_proveedores;
    private javax.swing.JButton btn_visualizar_encargado;
    private javax.swing.JButton btn_visualizar_farmacias;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_logo_admin;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_texto_admin;
    private javax.swing.JLabel etq_texto_continuar;
    private javax.swing.JLabel etq_texto_panel;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JPanel panel_bienvenida;
    private javax.swing.JPanel panel_control;
    // End of variables declaration//GEN-END:variables
}
