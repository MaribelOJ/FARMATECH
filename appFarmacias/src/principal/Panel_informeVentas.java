
package principal;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import utils.BaseDatos_Maribel;
import utils.Farmacia;


public class Panel_informeVentas extends javax.swing.JPanel {

    MenuAdmin menu;
    BaseDatos_Maribel bd;
    DefaultComboBoxModel<String> comboBoxModelTipos;
    DefaultComboBoxModel<String> comboBoxModelFarmacias;
    List<String> anios ;
    List<String> mesesVentas;
    List<String> meses;
    Farmacia [] listaFarmacias;
    String [] firstDate;
    String [] gananciasyPerdidas;  
    int primermes;
    int primeranio;
    int mesActual;
    int anioActual;
    String farmaciaSeleccionada;
    String tipoSeleccionado;
    SpinnerListModel spinnerModelPeriodo;
    GridBagConstraints restricciones;
    
    public Panel_informeVentas(MenuAdmin menu) {
        this.bd = menu.bd_mari;
        this.menu = menu;
        this.listaFarmacias = bd.extraerFarmacias();
        this.primeranio = 0;
        this.primermes = 0;
        this.firstDate = new String[2];
        this.gananciasyPerdidas = new String[2];
        this.mesActual = java.util.Calendar.getInstance().get(java.util.Calendar.MONTH);
        this.anioActual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        this.meses = Arrays.asList("Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic");
        this.farmaciaSeleccionada="";
        this.tipoSeleccionado ="";
        this.anios = new ArrayList<>();
        this.mesesVentas = new ArrayList<>();
        this.comboBoxModelTipos = new DefaultComboBoxModel<>();
        this.comboBoxModelFarmacias = new DefaultComboBoxModel<>();
        this.spinnerModelPeriodo = new SpinnerListModel();
        initComponents();
        initAlternComponents();
        cargardatosExtra(null);
        generarOpcionesInforme();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont_opciones = new javax.swing.JPanel();
        etq_logo = new javax.swing.JLabel();
        etq_titulo = new javax.swing.JLabel();
        cont_tipo_informe = new javax.swing.JPanel();
        etq_Tipo = new javax.swing.JLabel();
        tiposInforme = new javax.swing.JComboBox<>();
        icono_tipo = new javax.swing.JLabel();
        cont_mes_year = new javax.swing.JPanel();
        etq_periodo = new javax.swing.JLabel();
        icono_calendario = new javax.swing.JLabel();
        period_time = new javax.swing.JSpinner();
        cont_ganancias = new javax.swing.JPanel();
        etq_ganancias = new javax.swing.JLabel();
        icono_ganar = new javax.swing.JLabel();
        valor_ganancias = new javax.swing.JLabel();
        cont_perdidas = new javax.swing.JPanel();
        etq_perdidas = new javax.swing.JLabel();
        valor_perdidas = new javax.swing.JLabel();
        icono_perder = new javax.swing.JLabel();
        cont_farmacias = new javax.swing.JPanel();
        etq_farmacias = new javax.swing.JLabel();
        farmacias = new javax.swing.JComboBox<>();
        icono_farmacias = new javax.swing.JLabel();
        cont_datosExtra = new javax.swing.JPanel();

        cont_opciones.setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Informe Ventas");

        etq_Tipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etq_Tipo.setText("Tipo:");

        icono_tipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout cont_tipo_informeLayout = new javax.swing.GroupLayout(cont_tipo_informe);
        cont_tipo_informe.setLayout(cont_tipo_informeLayout);
        cont_tipo_informeLayout.setHorizontalGroup(
            cont_tipo_informeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_tipo_informeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cont_tipo_informeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tiposInforme, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cont_tipo_informeLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(etq_Tipo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(cont_tipo_informeLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(icono_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        cont_tipo_informeLayout.setVerticalGroup(
            cont_tipo_informeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_tipo_informeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_Tipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icono_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(tiposInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        etq_periodo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etq_periodo.setText("Periodo:");

        icono_calendario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        period_time.setModel(new javax.swing.SpinnerListModel(new String[] {"empty"}));
        period_time.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout cont_mes_yearLayout = new javax.swing.GroupLayout(cont_mes_year);
        cont_mes_year.setLayout(cont_mes_yearLayout);
        cont_mes_yearLayout.setHorizontalGroup(
            cont_mes_yearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_mes_yearLayout.createSequentialGroup()
                .addGroup(cont_mes_yearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_mes_yearLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(cont_mes_yearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_periodo)
                            .addComponent(period_time, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cont_mes_yearLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(icono_calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cont_mes_yearLayout.setVerticalGroup(
            cont_mes_yearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_mes_yearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_periodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(icono_calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(period_time, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        etq_ganancias.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etq_ganancias.setText("Ganancias:");

        valor_ganancias.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        valor_ganancias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valor_ganancias.setText("$0.00");

        javax.swing.GroupLayout cont_gananciasLayout = new javax.swing.GroupLayout(cont_ganancias);
        cont_ganancias.setLayout(cont_gananciasLayout);
        cont_gananciasLayout.setHorizontalGroup(
            cont_gananciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_gananciasLayout.createSequentialGroup()
                .addGroup(cont_gananciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_gananciasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etq_ganancias))
                    .addGroup(cont_gananciasLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(valor_ganancias, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_gananciasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(icono_ganar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        cont_gananciasLayout.setVerticalGroup(
            cont_gananciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_gananciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_ganancias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(icono_ganar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valor_ganancias, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        etq_perdidas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etq_perdidas.setText("Perdidas:");

        valor_perdidas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        valor_perdidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valor_perdidas.setText("$0.00");

        icono_perder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout cont_perdidasLayout = new javax.swing.GroupLayout(cont_perdidas);
        cont_perdidas.setLayout(cont_perdidasLayout);
        cont_perdidasLayout.setHorizontalGroup(
            cont_perdidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_perdidasLayout.createSequentialGroup()
                .addGroup(cont_perdidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_perdidasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etq_perdidas))
                    .addGroup(cont_perdidasLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(valor_perdidas, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cont_perdidasLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(icono_perder, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        cont_perdidasLayout.setVerticalGroup(
            cont_perdidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_perdidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_perdidas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(icono_perder, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valor_perdidas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        etq_farmacias.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etq_farmacias.setText("Farmacia:");

        icono_farmacias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout cont_farmaciasLayout = new javax.swing.GroupLayout(cont_farmacias);
        cont_farmacias.setLayout(cont_farmaciasLayout);
        cont_farmaciasLayout.setHorizontalGroup(
            cont_farmaciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_farmaciasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cont_farmaciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(farmacias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cont_farmaciasLayout.createSequentialGroup()
                        .addComponent(etq_farmacias)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(cont_farmaciasLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(icono_farmacias, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        cont_farmaciasLayout.setVerticalGroup(
            cont_farmaciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_farmaciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_farmacias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icono_farmacias, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(farmacias, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        cont_datosExtra.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout cont_datosExtraLayout = new javax.swing.GroupLayout(cont_datosExtra);
        cont_datosExtra.setLayout(cont_datosExtraLayout);
        cont_datosExtraLayout.setHorizontalGroup(
            cont_datosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        cont_datosExtraLayout.setVerticalGroup(
            cont_datosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cont_opcionesLayout = new javax.swing.GroupLayout(cont_opciones);
        cont_opciones.setLayout(cont_opcionesLayout);
        cont_opcionesLayout.setHorizontalGroup(
            cont_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_opcionesLayout.createSequentialGroup()
                .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_opcionesLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(cont_farmacias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(cont_tipo_informe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(cont_mes_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(cont_opcionesLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(cont_ganancias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(cont_perdidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(cont_datosExtra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cont_opcionesLayout.setVerticalGroup(
            cont_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_opcionesLayout.createSequentialGroup()
                .addGroup(cont_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_opcionesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cont_opcionesLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(cont_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cont_tipo_informe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cont_farmacias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cont_mes_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cont_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cont_ganancias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cont_perdidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(cont_datosExtra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void initAlternComponents(){
        
        Image icono_logo = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logoFT.png"));
        icono_logo = icono_logo.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        etq_logo.setIcon(new ImageIcon(icono_logo));
        
        Image icono0 = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_farmacia.png"));
        icono0= icono0.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        icono_farmacias.setIcon(new ImageIcon(icono0));
        
        Image icono1 = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/iforme.png"));
        icono1= icono1.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        icono_tipo.setIcon(new ImageIcon(icono1));
        
        Image icono2 = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/calendar.png"));
        icono2= icono2.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        icono_calendario.setIcon(new ImageIcon(icono2));
        
        Image icono3 = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_ganar.png"));
        icono3= icono3.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        icono_ganar.setIcon(new ImageIcon(icono3));
        
        Image icono4 = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_perder.png"));
        icono4= icono4.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        icono_perder.setIcon(new ImageIcon(icono4));    
        
       cont_datosExtra.setLayout(new GridBagLayout());
       cont_datosExtra.setPreferredSize(new Dimension(715, 330));
        
        restricciones = new GridBagConstraints();
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 50;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        
    }
    
    public void cargardatosExtra(String periodo){
        String period = periodo;
        Panel_progresoMensual izquierda = new Panel_progresoMensual(this.menu,period);
        izquierda.setPreferredSize(new Dimension(386, 316));  

        restricciones.gridx = 0;
        restricciones.gridy = 0;
        cont_datosExtra.add(izquierda,restricciones);
        
        Panel_masVendidos derecha = new Panel_masVendidos();
        derecha.setPreferredSize(new Dimension(392, 316));  

        restricciones.gridx = 1;
        restricciones.gridy = 0;
        cont_datosExtra.add(derecha,restricciones);
        this.menu.revalidate();
        this.menu.repaint();
    }

    public void generarOpcionesInforme(){
               
        period_time.setEnabled(false);
        tiposInforme.setEnabled(false);
               
        int cont = 0;
        comboBoxModelFarmacias.addElement("Seleccionar");
        comboBoxModelFarmacias.addElement("todas");
        for (int i = 0 ; i < listaFarmacias.length && listaFarmacias[i] != null ; i++) {
            comboBoxModelFarmacias.addElement(listaFarmacias[i].getNIT());
            cont++;
        }
        
        farmacias.setModel(comboBoxModelFarmacias);
                    
        comboBoxModelTipos.addElement("Seleccionar");
        comboBoxModelTipos.addElement("Mensual");
        comboBoxModelTipos.addElement("Anual");
        tiposInforme.setModel(comboBoxModelTipos);
        
              
        mesesVentas.add("Seleccionar");
  
        spinnerModelPeriodo = new SpinnerListModel(mesesVentas);
        period_time.setModel(spinnerModelPeriodo);

        
        if(cont == 0){
            farmacias.setEnabled(false);
        }
        
        
        farmacias.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                farmaciaSeleccionada = (String) farmacias.getSelectedItem();
                
                if(!farmaciaSeleccionada.equals("Seleccionar")){
                    
                    if(farmaciaSeleccionada.equals("todas")){
                        firstDate = bd.getFirstDatewithSalesRecords(null);
                        primeranio = Integer.parseInt(firstDate[0]);
                        primermes = Integer.parseInt(firstDate[1]);
                    }else{
                        firstDate = bd.getFirstDatewithSalesRecords(farmaciaSeleccionada);
                        primeranio = Integer.parseInt(firstDate[0]);
                        primermes = Integer.parseInt(firstDate[1]);
                    }

                    tiposInforme.setSelectedIndex(0);
                    SpinnerListModel model = (SpinnerListModel) period_time.getModel();
                    Object primerValor = model.getList().get(0);
                    period_time.setValue(primerValor);
                    tiposInforme.setEnabled(true);
                }
            }
            
          
        });
        
        tiposInforme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                tipoSeleccionado = (String) tiposInforme.getSelectedItem();

                valor_ganancias.setText("");
                valor_perdidas.setText("");
                if(!tipoSeleccionado.equals("Seleccionar")){  
                                        
                    if(tipoSeleccionado.equals("Mensual")){
                        
                        for(int i = anioActual; i >= primeranio;i--){
                            
                            for(int j = mesActual; j >= 0; j--){

                                mesesVentas.add(meses.get(j)+" - "+ i);
                                
                                if(j == (primermes-1) && i == primeranio){
                                    break;
                                }
                                
                            }
                            
                            mesActual = 11;
                        }
                        
                        spinnerModelPeriodo = new SpinnerListModel(mesesVentas);
                        period_time.setModel(spinnerModelPeriodo);
                    }else{
                        anios.add("Seleccionar");
                        for (int i = anioActual; i >= primeranio; i--) {
                            anios.add(String.valueOf(i));
                        }

                        spinnerModelPeriodo = new SpinnerListModel(anios);
                        period_time.setModel(spinnerModelPeriodo);
                    }
                    
                    period_time.setEnabled(true);
                }

            }
        });

        if(!farmaciaSeleccionada.equals("Seleccionar") && !tipoSeleccionado.equals("Seleccionar")){
            
        
            period_time.addChangeListener(new ChangeListener() {
                public void stateChanged(ChangeEvent e) {
                    String valorSeleccionado = (String) period_time.getValue();
                    
                    System.out.println("fecha: "+valorSeleccionado);
                    System.out.println("tipo informe: "+ tipoSeleccionado);
                    System.out.println("farmacia: "+ farmaciaSeleccionada);
                    
                    if(!valorSeleccionado.equals("Seleccionar")){
                        String fecha = valorSeleccionado;
                        if(tipoSeleccionado.equals("Mensual")){       
                                
                            for(int i = 0; i < 12 ; i++){
                                if(meses.get(i).equals(fecha.substring(0, 3))){
                                    if((i+1)<10){
                                        fecha = fecha.substring(6)+"-0"+(i+1);
                                    }else{
                                        fecha = fecha.substring(6)+"-"+(i+1);
                                    }
                                }
                            }
                            
                            if(farmaciaSeleccionada.equals("todas")){
                                gananciasyPerdidas = bd.calcularGananciasyPerdidas(fecha, null);
                            }else{

                                gananciasyPerdidas = bd.calcularGananciasyPerdidas(fecha, farmaciaSeleccionada);
                            }
                            
                        }else{
                            if(farmaciaSeleccionada.equals("todas")){
                                gananciasyPerdidas = bd.calcularGananciasyPerdidas(valorSeleccionado, null);
                            }else{
                                
                                for(int i = 0; i < 12 ; i++){
                                    if(meses.get(i).equals(fecha.substring(0, 3))){
                                        if((i+1)<10){
                                            fecha = fecha.substring(6)+"-0"+(i+1);
                                        }else{
                                            fecha = fecha.substring(6)+"-"+(i+1);
                                        }
                                    }
                                }

                                gananciasyPerdidas = bd.calcularGananciasyPerdidas(fecha, farmaciaSeleccionada);
                            }
                        }
                        cargardatosExtra(fecha);
                    }
                  
                }
            });
        }
      
        
        String ganancia="";
        String perdida="";

        if(gananciasyPerdidas[0] == null){
            ganancia="$0.00";
        }else{
            ganancia="$"+gananciasyPerdidas[0];
        }

        if(gananciasyPerdidas[1] == null){
            perdida = "$0.00";
        }else{
            perdida = "$"+gananciasyPerdidas[1];
        }

        valor_ganancias.setText(ganancia);
        valor_perdidas.setText(perdida);
                        
        revalidate();
        repaint();
          
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cont_datosExtra;
    private javax.swing.JPanel cont_farmacias;
    private javax.swing.JPanel cont_ganancias;
    private javax.swing.JPanel cont_mes_year;
    private javax.swing.JPanel cont_opciones;
    private javax.swing.JPanel cont_perdidas;
    private javax.swing.JPanel cont_tipo_informe;
    private javax.swing.JLabel etq_Tipo;
    private javax.swing.JLabel etq_farmacias;
    private javax.swing.JLabel etq_ganancias;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_perdidas;
    private javax.swing.JLabel etq_periodo;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JComboBox<String> farmacias;
    private javax.swing.JLabel icono_calendario;
    private javax.swing.JLabel icono_farmacias;
    private javax.swing.JLabel icono_ganar;
    private javax.swing.JLabel icono_perder;
    private javax.swing.JLabel icono_tipo;
    private javax.swing.JSpinner period_time;
    private javax.swing.JComboBox<String> tiposInforme;
    private javax.swing.JLabel valor_ganancias;
    private javax.swing.JLabel valor_perdidas;
    // End of variables declaration//GEN-END:variables
}
