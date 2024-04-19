package principal;

import java.awt.Image;
import javax.swing.ImageIcon;
import utils.BaseDatos;

import utils.Usuario;



public class InicioSesion extends javax.swing.JFrame {
    BaseDatos bd;
    
    public InicioSesion(BaseDatos bd) {
        this.bd = bd;
        initComponents();
        initAlternComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont_principal = new javax.swing.JPanel();
        etq_logo = new javax.swing.JLabel();
        etq_titulo = new javax.swing.JLabel();
        cont_credenciales = new javax.swing.JPanel();
        icono_usuario = new javax.swing.JLabel();
        etq_usuario = new javax.swing.JLabel();
        campo_usuario = new javax.swing.JTextField();
        icono_clave = new javax.swing.JLabel();
        etq_clave = new javax.swing.JLabel();
        campo_clave = new javax.swing.JPasswordField();
        btn_ingresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cont_principal.setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etq_titulo.setText("Iniciar Sesión");

        cont_credenciales.setBackground(new java.awt.Color(79, 108, 211));

        icono_usuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        etq_usuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etq_usuario.setText("Usuario:");

        icono_clave.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        etq_clave.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etq_clave.setText("Contraseña:");

        javax.swing.GroupLayout cont_credencialesLayout = new javax.swing.GroupLayout(cont_credenciales);
        cont_credenciales.setLayout(cont_credencialesLayout);
        cont_credencialesLayout.setHorizontalGroup(
            cont_credencialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_credencialesLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(cont_credencialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_credencialesLayout.createSequentialGroup()
                        .addComponent(icono_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etq_usuario))
                    .addGroup(cont_credencialesLayout.createSequentialGroup()
                        .addComponent(icono_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etq_clave)))
                .addGap(6, 6, 6)
                .addGroup(cont_credencialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campo_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(campo_clave))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        cont_credencialesLayout.setVerticalGroup(
            cont_credencialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_credencialesLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(cont_credencialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icono_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cont_credencialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etq_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(cont_credencialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icono_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cont_credencialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etq_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campo_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        btn_ingresar.setBackground(new java.awt.Color(21, 38, 98));
        btn_ingresar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cont_principalLayout = new javax.swing.GroupLayout(cont_principal);
        cont_principal.setLayout(cont_principalLayout);
        cont_principalLayout.setHorizontalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(cont_credenciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                        .addComponent(etq_titulo)
                        .addGap(214, 214, 214))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                        .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                        .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248))))
        );
        cont_principalLayout.setVerticalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cont_credenciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void initAlternComponents(){
        setTitle("User Login");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_menu.png")));
        
        Image icono_logo = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logoFT.png"));
        icono_logo = icono_logo.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        etq_logo.setIcon(new ImageIcon(icono_logo));
        
        Image icono_user = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_user.png"));
        icono_user = icono_user.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        etq_usuario.setIcon(new ImageIcon(icono_user));
        
        Image icono_password = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_pass.png"));
        icono_password = icono_password.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        etq_clave.setIcon(new ImageIcon(icono_password));
        
        revalidate();
    }
    
    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        
        String user = campo_usuario.getText();
        String password = new String(campo_clave.getPassword());
        String nombre_usuario;
              
        
        if(user.equals("")|| password.equals("")){
            System.out.println("Las dos credenciales son requeridas!");
            Alerta ventana = new Alerta("¡Las dos credenciales son requeridas!.");
        }else{
            Usuario usuario = bd.iniciarSesion(user, password);
            if(usuario != null){
                if(usuario.getRol().equals("administrador")){                 
                    System.out.println("Administrador:" + usuario.getNombre());
                    nombre_usuario = usuario.getNombre();
                    MenuAdmin menu = new MenuAdmin (bd, nombre_usuario);
                    dispose();
                }else{
                    System.out.println("Encargado:" + usuario.getNombre());
                    nombre_usuario = usuario.getNombre();
                    MenuEncargado menu = new MenuEncargado(bd, nombre_usuario);

                    dispose();
                }
                campo_usuario.setText("");
                campo_clave.setText("");
                
            }else{
                System.out.println("El usuario o la contraseña son incorrectas");
                //se abre ventana advertencia
                Alerta ventana = new Alerta("El usuario o la contraseña son incorrectas.");
            }
        }
        
    }//GEN-LAST:event_btn_ingresarActionPerformed
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JPasswordField campo_clave;
    private javax.swing.JTextField campo_usuario;
    private javax.swing.JPanel cont_credenciales;
    private javax.swing.JPanel cont_principal;
    private javax.swing.JLabel etq_clave;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel etq_usuario;
    private javax.swing.JLabel icono_clave;
    private javax.swing.JLabel icono_usuario;
    // End of variables declaration//GEN-END:variables
}
