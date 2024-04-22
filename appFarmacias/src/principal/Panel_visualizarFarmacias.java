
package principal;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import utils.BaseDatos_Maribel;
import utils.Farmacia;


public class Panel_visualizarFarmacias extends javax.swing.JPanel {
    BaseDatos_Maribel bd;
    Farmacia [] listaFarmacias;
    int cont;
    int indice;
    int letrasBorradas;

    MenuAdmin menu;
    String numContenedor;

    
    public Panel_visualizarFarmacias(BaseDatos_Maribel bd, MenuAdmin menu,int indice, String numContenedor) {
        this.bd=bd;
        this.listaFarmacias = this.bd.extraerFarmacias();
        this.menu = menu;
        this.cont = 0;
        this.indice = indice;
        this.letrasBorradas=0;
        this.numContenedor=numContenedor;
        initComponents();
        initAlternComponents();
        
        
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont_principal = new javax.swing.JPanel();
        farmacia1 = new javax.swing.JPanel();
        farmacia2 = new javax.swing.JPanel();
        etq_img2 = new javax.swing.JLabel();
        etq_nit2 = new javax.swing.JLabel();
        etq_estado2 = new javax.swing.JLabel();
        btn_inventario2 = new javax.swing.JButton();
        btn_eliminar2 = new javax.swing.JButton();
        btn_ventas2 = new javax.swing.JButton();
        btn_editar2 = new javax.swing.JButton();
        farmacia3 = new javax.swing.JPanel();
        campo_busqueda = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        etq_titulo = new javax.swing.JLabel();
        etq_logo = new javax.swing.JLabel();
        btn_next = new javax.swing.JButton();
        btn_rewind = new javax.swing.JButton();

        cont_principal.setBackground(new java.awt.Color(255, 255, 255));

        farmacia1.setBackground(new java.awt.Color(255, 255, 255));
        farmacia1.setPreferredSize(new java.awt.Dimension(249, 332));

        javax.swing.GroupLayout farmacia1Layout = new javax.swing.GroupLayout(farmacia1);
        farmacia1.setLayout(farmacia1Layout);
        farmacia1Layout.setHorizontalGroup(
            farmacia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );
        farmacia1Layout.setVerticalGroup(
            farmacia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );

        farmacia2.setBackground(new java.awt.Color(43, 138, 250));
        farmacia2.setPreferredSize(new java.awt.Dimension(249, 332));

        etq_img2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etq_nit2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_nit2.setForeground(new java.awt.Color(75, 75, 75));
        etq_nit2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etq_estado2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_estado2.setForeground(new java.awt.Color(188, 13, 13));
        etq_estado2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btn_inventario2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_inventario2.setForeground(new java.awt.Color(85, 115, 221));
        btn_inventario2.setText("Inventario");
        btn_inventario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inventario2ActionPerformed(evt);
            }
        });

        btn_eliminar2.setBackground(new java.awt.Color(239, 30, 30));
        btn_eliminar2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_eliminar2.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar2.setText("Eliminar");
        btn_eliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar2ActionPerformed(evt);
            }
        });

        btn_ventas2.setBackground(new java.awt.Color(239, 218, 30));
        btn_ventas2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_ventas2.setForeground(new java.awt.Color(255, 255, 255));
        btn_ventas2.setText("Ventas");
        btn_ventas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ventas2ActionPerformed(evt);
            }
        });

        btn_editar2.setBackground(new java.awt.Color(144, 177, 239));
        btn_editar2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_editar2.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar2.setText("Editar");
        btn_editar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout farmacia2Layout = new javax.swing.GroupLayout(farmacia2);
        farmacia2.setLayout(farmacia2Layout);
        farmacia2Layout.setHorizontalGroup(
            farmacia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(farmacia2Layout.createSequentialGroup()
                .addGroup(farmacia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(farmacia2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etq_img2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(farmacia2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(etq_nit2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(farmacia2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(farmacia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_ventas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_inventario2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(farmacia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_eliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_editar2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(farmacia2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etq_estado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        farmacia2Layout.setVerticalGroup(
            farmacia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(farmacia2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(etq_estado2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_nit2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_img2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(farmacia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_inventario2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(farmacia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ventas2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editar2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        farmacia3.setBackground(new java.awt.Color(255, 255, 255));
        farmacia3.setPreferredSize(new java.awt.Dimension(249, 332));

        javax.swing.GroupLayout farmacia3Layout = new javax.swing.GroupLayout(farmacia3);
        farmacia3.setLayout(farmacia3Layout);
        farmacia3Layout.setHorizontalGroup(
            farmacia3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 232, Short.MAX_VALUE)
        );
        farmacia3Layout.setVerticalGroup(
            farmacia3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );

        campo_busqueda.setToolTipText("");
        campo_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterBuscar(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                borrarBusqueda(evt);
            }
        });

        btn_buscar.setBorderPainted(false);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        etq_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Lista de Farmacias");

        btn_next.setBorderPainted(false);
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        btn_rewind.setBorderPainted(false);
        btn_rewind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rewindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cont_principalLayout = new javax.swing.GroupLayout(cont_principal);
        cont_principal.setLayout(cont_principalLayout);
        cont_principalLayout.setHorizontalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(farmacia1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_principalLayout.createSequentialGroup()
                        .addComponent(btn_rewind, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(farmacia2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(farmacia3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                        .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                        .addComponent(campo_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232))))
        );
        cont_principalLayout.setVerticalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_principalLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(campo_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cont_principalLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(farmacia2, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                    .addComponent(farmacia3, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                    .addComponent(farmacia1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_next, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(btn_rewind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56))
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
        
        btn_next.setBackground(Color.WHITE);
        Image icono_next = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_next.png"));
        icono_next = icono_next.getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        btn_next.setIcon(new ImageIcon(icono_next));
        btn_next.setForeground(new Color(0, 0, 200));
        
        btn_rewind.setBackground(Color.WHITE);
        Image icono_rewind = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_rewind.png"));
        icono_rewind = icono_rewind.getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        btn_rewind.setIcon(new ImageIcon(icono_rewind));
        btn_rewind.setForeground(new Color(0, 0, 200));
        
        btn_buscar.setBackground(Color.WHITE);
        Image icono_buscar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_busqueda.png"));
        icono_buscar = icono_buscar.getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        btn_buscar.setIcon(new ImageIcon(icono_buscar));
        btn_buscar.setForeground(new Color(0, 0, 200));
        
        for(int i=0; i < listaFarmacias.length && listaFarmacias[i] != null; i++){
            cont++;                   
        }
       
             
        if(listaFarmacias[indice] == null){
            
            btn_next.setEnabled(false);
            btn_rewind.setEnabled(false);
            btn_buscar.setEnabled(false);
            
            farmacia2.setBackground(Color.GRAY);
            Image foto = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/no_disponible.png"));
            foto = foto.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            etq_img2.setIcon(new ImageIcon(foto));
            btn_editar2.setEnabled(false);
            btn_eliminar2.setEnabled(false);
            btn_inventario2.setEnabled(false);
            btn_ventas2.setEnabled(false);
            
            Mensaje_informativo msj = new Mensaje_informativo("No se ha registrado ninguna farmacia hasta el momento");
   
        }else{
            
            if(listaFarmacias[indice].getEstado().equalsIgnoreCase("activo")){
                etq_estado2.setForeground(Color.GREEN);
                etq_estado2.setText("Activo");
            }else{
                etq_estado2.setForeground(Color.RED);
                etq_estado2.setText("Inactivo");
            }
            
            Image foto = listaFarmacias[indice].getFoto();
            foto = foto.getScaledInstance(150, 150, Image.SCALE_SMOOTH);        
            etq_img2.setIcon(new ImageIcon(foto));
            etq_nit2.setText(listaFarmacias[indice].getNIT());
            btn_rewind.setEnabled(false);    
            btn_next.setEnabled(false);    
            
                
            if((indice + 1) % 3 == 0 && cont > 3){
                
                indice -=3;
            }else if(((indice + 2) % 3 == 0) && indice < cont - 1 && cont > 3){
  
                indice -= 2;
            
            }else{ 
                if(indice != 0 && indice < cont-1){
                    indice -=1;
                
                }else if(numContenedor.equals("1") && indice >= cont-1){
                    indice++;
                }
            }

        }

        if(cont > 1){
            btn_next.setEnabled(true);
            
            if(listaFarmacias[indice + 1] == null && !numContenedor.equals("1") || indice  == cont-1){
                btn_next.setEnabled(false);
                if(listaFarmacias[indice-1] != null && cont > 1){
                    btn_rewind.setEnabled(true);
                }
            }
        }
         
        repaint();
        revalidate();
        
    }
    
    
    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed

            
            if(indice>0){
                btn_next.setEnabled(true);
                btn_rewind.setEnabled(true);
            }


            if(indice < cont-2 && indice > (cont-1)/2 && numContenedor.equals("2")){
                
               indice +=2;

            }
            
            
            
            if(listaFarmacias[indice+3] != null) {


                //farmacia2
                if(indice !=0 && (indice +1) % 3 == 0){
                   indice++;
                }
                
                numContenedor="2";
                Panel_farmacia cont2 = new Panel_farmacia(bd, listaFarmacias[indice].getNIT(),numContenedor, this);
                cont2.setPreferredSize(farmacia2.getPreferredSize());
                cont2.setSize(farmacia2.getSize());
                farmacia2.removeAll();
                farmacia2.add(cont2);

                //farmacia1
                indice++;
                numContenedor="1";
                Panel_farmacia cont1 = new Panel_farmacia(bd, listaFarmacias[indice].getNIT(),numContenedor, this);
                cont1.setPreferredSize(farmacia1.getPreferredSize());
                cont1.setSize(farmacia1.getSize());
                farmacia1.removeAll();
                farmacia1.add(cont1);
                
                //farmacia3
                indice++;
                numContenedor="3";
                Panel_farmacia cont3 = new Panel_farmacia(bd, listaFarmacias[indice].getNIT(),numContenedor, this);
                cont3.setPreferredSize(farmacia3.getPreferredSize());
                cont3.setSize(farmacia3.getSize());
                farmacia3.removeAll();
                farmacia3.add(cont3);


            }else if(indice == cont-1 || listaFarmacias[indice + 2] == null && (indice + 1) == cont-1 ){
                farmacia1.removeAll();
                farmacia1.setBackground(Color.WHITE); 
                farmacia3.removeAll();
                farmacia3.setBackground(Color.WHITE);

                indice++;
                numContenedor="2";
                Panel_farmacia cont2 = new Panel_farmacia(bd, listaFarmacias[indice].getNIT(),numContenedor, this);
                cont2.setPreferredSize(farmacia2.getPreferredSize());
                cont2.setSize(farmacia2.getSize());
                farmacia2.removeAll();
                farmacia2.add(cont2);

            }else{
                farmacia3.removeAll();
                farmacia3.setBackground(Color.WHITE);
                
                if(indice > cont -1 && numContenedor.equals("1")){
                    indice-=3;
                }

                indice++;
                numContenedor="2";
                Panel_farmacia cont2 = new Panel_farmacia(bd, listaFarmacias[indice].getNIT(),numContenedor, this);
                cont2.setPreferredSize(farmacia2.getPreferredSize());
                cont2.setSize(farmacia2.getSize());
                farmacia2.removeAll();
                farmacia2.add(cont2);

                indice++;
                numContenedor="1";
                Panel_farmacia cont1 = new Panel_farmacia(bd, listaFarmacias[indice].getNIT(),numContenedor, this);
                cont1.setPreferredSize(farmacia1.getPreferredSize());
                cont1.setSize(farmacia1.getSize());
                farmacia1.removeAll();
                farmacia1.add(cont1);

            }

            if(indice == cont-1 ){
                btn_next.setEnabled(false);
                btn_rewind.setEnabled(true);
            }
                          
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_rewindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rewindActionPerformed
        
        if((cont-1) > 2 && indice <= cont-1){
            
            if(indice > 0){
                btn_rewind.setEnabled(true);
                btn_next.setEnabled(true);
            }
        
            if((indice + 1) % 3 == 0){
                indice -= 2;
            }else if(indice == cont-1 && (indice + 2) % 3 == 0){

                indice--;                                  
            }

            //farmacia3
            indice--;
            numContenedor="3";
            Panel_farmacia cont3 = new Panel_farmacia(bd, listaFarmacias[indice].getNIT(),numContenedor, this);
            cont3.setPreferredSize(farmacia3.getPreferredSize());
            cont3.setSize(farmacia3.getSize());
            farmacia3.removeAll();
            farmacia3.add(cont3);

            //farmacia1
            indice--;

            numContenedor="1";
            Panel_farmacia cont1 = new Panel_farmacia(bd, listaFarmacias[indice].getNIT(),numContenedor, this);
            cont1.setPreferredSize(farmacia1.getPreferredSize());
            cont1.setSize(farmacia1.getSize());
            farmacia1.removeAll();
            farmacia1.add(cont1);

            //farmacia2
            indice--;
            numContenedor="2";
            Panel_farmacia cont2 = new Panel_farmacia(bd, listaFarmacias[indice].getNIT(),numContenedor, this);
            cont2.setPreferredSize(farmacia2.getPreferredSize());
            cont2.setSize(farmacia2.getSize());
            farmacia2.removeAll();
            farmacia2.add(cont2);

            if(indice==0){
               btn_rewind.setEnabled(false);
               btn_next.setEnabled(true);
               indice+=2;                                 
            } 
        }else if(indice > cont-1 ){
            indice--;        
            numContenedor="1";
            Panel_farmacia cont1 = new Panel_farmacia(bd, listaFarmacias[indice].getNIT(),numContenedor, this);
            cont1.setPreferredSize(farmacia1.getPreferredSize());
            cont1.setSize(farmacia1.getSize());
            farmacia1.removeAll();
            farmacia1.add(cont1);
            
            indice--;
            numContenedor="2";
            Panel_farmacia cont2 = new Panel_farmacia(bd, listaFarmacias[indice].getNIT(),numContenedor, this);
            cont2.setPreferredSize(farmacia2.getPreferredSize());
            cont2.setSize(farmacia2.getSize());
            farmacia2.removeAll();
            farmacia2.add(cont2);
            
            
        }else{
            indice--;
            farmacia1.removeAll();
            farmacia2.removeAll();
            
            if(indice == 1){
                indice--;
            }
            numContenedor="2";
            Panel_farmacia cont2 = new Panel_farmacia(bd, listaFarmacias[indice].getNIT(),numContenedor, this);
            cont2.setPreferredSize(farmacia2.getPreferredSize());
            cont2.setSize(farmacia2.getSize());
            farmacia2.removeAll();
            farmacia2.add(cont2);
            

            if(indice==0){
               btn_rewind.setEnabled(false);
               btn_next.setEnabled(true);
            }
        }
            repaint();
            revalidate(); 
    }//GEN-LAST:event_btn_rewindActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String NIT = campo_busqueda.getText();
        Farmacia busqueda = bd.buscarFarmacia(NIT);
        Panel_visualizarFarmacias panelactual = this;
        
        if (busqueda!=null && busqueda.getFoto()!=null) {
            numContenedor="2";
            Panel_farmacia displaySearch = new Panel_farmacia(bd, NIT,numContenedor,panelactual);
            displaySearch.setPreferredSize(farmacia1.getPreferredSize());
            displaySearch.setSize(farmacia1.getSize());
            farmacia1.removeAll();
            farmacia1.setBackground(Color.WHITE);
            farmacia2.removeAll();
            farmacia2.add(displaySearch);
            farmacia3.removeAll();
            farmacia3.setBackground(Color.WHITE);
            repaint();
            revalidate();
            
        }
        
            
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void enterBuscar(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterBuscar
       int teclado = evt.getKeyCode();
        
        if(teclado == 10){
            btn_next.setEnabled(false);
            btn_rewind.setEnabled(false);
            String NIT = campo_busqueda.getText();
            Farmacia busqueda = bd.buscarFarmacia(NIT);
            
            Panel_visualizarFarmacias panelactual = this;

            if (busqueda!=null && busqueda.getFoto()!=null) {
                numContenedor="2";
                Panel_farmacia displaySearch = new Panel_farmacia(bd, NIT,numContenedor,panelactual);
                displaySearch.setPreferredSize(farmacia1.getPreferredSize());
                displaySearch.setSize(farmacia1.getSize());
                farmacia1.removeAll();
                farmacia1.setBackground(Color.WHITE);
                farmacia2.removeAll();
                farmacia2.add(displaySearch);
                farmacia3.removeAll();
                farmacia3.setBackground(Color.WHITE);
                repaint();
                revalidate();

            }
        }
    }//GEN-LAST:event_enterBuscar

    private void borrarBusqueda(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_borrarBusqueda
        int teclado = evt.getKeyCode();
        numContenedor="2";
        if(teclado == 8){
            letrasBorradas++;
            if(letrasBorradas == 4){
                this.menu.btn_visualizar_farmaciasActionPerformed(0,numContenedor);
                btn_next.setEnabled(true);
                btn_rewind.setEnabled(true);
            }
            
            String NIT=campo_busqueda.getText();
            if(letrasBorradas <4 && NIT.equals("")){
                this.menu.btn_visualizar_farmaciasActionPerformed(0,numContenedor);
            }
        }
    }//GEN-LAST:event_borrarBusqueda

    private void btn_inventario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inventario2ActionPerformed
        String NIT = etq_nit2.getText();
        numContenedor="2";
        InventarioDesdeAdmin ventana = new InventarioDesdeAdmin(bd,NIT, menu, numContenedor);
        ventana.setPreferredSize(cont_principal.getPreferredSize());
        ventana.setSize(cont_principal.getSize());

        cont_principal.removeAll();

        cont_principal.add(ventana);
        
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_inventario2ActionPerformed

    private void btn_ventas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ventas2ActionPerformed
        String NIT = etq_nit2.getText();
        Panel_visualizarFarmacias panelactual = this;
        numContenedor="2";
        VentasDesdeAdmin  ventana = new VentasDesdeAdmin(bd,NIT, menu, panelactual,numContenedor);
        ventana.setPreferredSize(cont_principal.getPreferredSize());
        ventana.setSize(cont_principal.getSize());

        cont_principal.removeAll();

        cont_principal.add(ventana);
        
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_ventas2ActionPerformed

    private void btn_editar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar2ActionPerformed
        String NIT = etq_nit2.getText();
        numContenedor="2";
        Panel_actualizarFarmacia ventana = new Panel_actualizarFarmacia(bd,NIT, menu,numContenedor);
        ventana.setPreferredSize(cont_principal.getPreferredSize());
        ventana.setSize(cont_principal.getSize());

        cont_principal.removeAll();

        cont_principal.add(ventana);
        
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_editar2ActionPerformed

    private void btn_eliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar2ActionPerformed
        String NIT = etq_nit2.getText();
        numContenedor="2";
        Panel_eliminarFarmacia ventana = new Panel_eliminarFarmacia(bd,NIT, menu,numContenedor);
        ventana.setPreferredSize(cont_principal.getPreferredSize());
        ventana.setSize(cont_principal.getSize());

        cont_principal.removeAll();

        cont_principal.add(ventana);
        
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_eliminar2ActionPerformed
    
    public void mostrarInventario(String num, String contenedor){
        String NIT = num;
        numContenedor=contenedor;
       
        InventarioDesdeAdmin ventana = new InventarioDesdeAdmin(bd,NIT, menu,numContenedor);
        ventana.setPreferredSize(cont_principal.getPreferredSize());
        ventana.setSize(cont_principal.getSize());

        cont_principal.removeAll();

        cont_principal.add(ventana);
        
        repaint();
        revalidate();
    }

    public void mostrarFacturas(String num, String contenedor){
        String NIT = num;
        numContenedor=contenedor;
        Panel_visualizarFarmacias panelactual = this;
        VentasDesdeAdmin ventana = new VentasDesdeAdmin(bd,NIT, menu,panelactual,numContenedor);
        ventana.setPreferredSize(cont_principal.getPreferredSize());
        ventana.setSize(cont_principal.getSize());

        cont_principal.removeAll();

        cont_principal.add(ventana);
        
        repaint();
        revalidate();
    }
    
    public void mostrarDetalle(String nit, String num, String contenedor){
        String NIT = nit;
        String numReferencia = num;
        numContenedor=contenedor;
        
        Panel_visualizarFarmacias panelactual = this;
        
        Panel_detalleFacturas ventana = new Panel_detalleFacturas(bd,NIT,numReferencia,panelactual,numContenedor);
        
        ventana.setPreferredSize(cont_principal.getPreferredSize());
        ventana.setSize(cont_principal.getSize());

        cont_principal.removeAll();

        cont_principal.add(ventana);
        
        repaint();
        revalidate();
    }
    
    public void mostrarEditor(String num ,String contenedor){
        String NIT = num;
        numContenedor=contenedor;
               
        Panel_actualizarFarmacia ventana = new Panel_actualizarFarmacia(bd, NIT, menu, numContenedor);
        ventana.setPreferredSize(cont_principal.getPreferredSize());
        ventana.setSize(cont_principal.getSize());

        cont_principal.removeAll();

        cont_principal.add(ventana);
        
        repaint();
        revalidate();
    }
    
    public void mostrarValidacion(String num, String contenedor){
        String NIT = num;
        numContenedor=contenedor;
        Panel_eliminarFarmacia ventana = new Panel_eliminarFarmacia(bd,NIT, menu,numContenedor);
        ventana.setPreferredSize(cont_principal.getPreferredSize());
        ventana.setSize(cont_principal.getSize());

        cont_principal.removeAll();

        cont_principal.add(ventana);
        
        repaint();
        revalidate();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_editar2;
    private javax.swing.JButton btn_eliminar2;
    private javax.swing.JButton btn_inventario2;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_rewind;
    private javax.swing.JButton btn_ventas2;
    private javax.swing.JTextField campo_busqueda;
    private javax.swing.JPanel cont_principal;
    private javax.swing.JLabel etq_estado2;
    private javax.swing.JLabel etq_img2;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_nit2;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JPanel farmacia1;
    private javax.swing.JPanel farmacia2;
    private javax.swing.JPanel farmacia3;
    // End of variables declaration//GEN-END:variables
}
