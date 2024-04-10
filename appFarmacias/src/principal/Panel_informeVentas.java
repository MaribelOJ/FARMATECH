
package principal;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.SpinnerListModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import utils.BaseDatos_Maribel;
import utils.Farmacia;


public class Panel_informeVentas extends javax.swing.JPanel {

    MenuAdmin menu;
    BaseDatos_Maribel bd;
    DefaultComboBoxModel<String> comboBoxModelTipos = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> comboBoxModelFarmacias = new DefaultComboBoxModel<>();
    Farmacia [] listaFarmacias;
    int primeranio;
    
    public Panel_informeVentas(MenuAdmin menu) {
        this.bd = menu.bd_mari;
        this.menu = menu;
        this.listaFarmacias = bd.extraerFarmacias();
        this.primeranio = 0;
        initComponents();
        initAlternComponents();
        generarOpcionesInforme();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Informe Ventas");

        etq_Tipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etq_Tipo.setText("Selecciona Tipo:");

        javax.swing.GroupLayout cont_tipo_informeLayout = new javax.swing.GroupLayout(cont_tipo_informe);
        cont_tipo_informe.setLayout(cont_tipo_informeLayout);
        cont_tipo_informeLayout.setHorizontalGroup(
            cont_tipo_informeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_tipo_informeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cont_tipo_informeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tiposInforme, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cont_tipo_informeLayout.createSequentialGroup()
                        .addGroup(cont_tipo_informeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(icono_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etq_Tipo))
                        .addGap(0, 54, Short.MAX_VALUE)))
                .addContainerGap())
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
        etq_periodo.setText("Selecciona Periodo:");

        period_time.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout cont_mes_yearLayout = new javax.swing.GroupLayout(cont_mes_year);
        cont_mes_year.setLayout(cont_mes_yearLayout);
        cont_mes_yearLayout.setHorizontalGroup(
            cont_mes_yearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_mes_yearLayout.createSequentialGroup()
                .addGroup(cont_mes_yearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_mes_yearLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etq_periodo))
                    .addGroup(cont_mes_yearLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(period_time, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_mes_yearLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(icono_calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_gananciasLayout.createSequentialGroup()
                .addGap(0, 54, Short.MAX_VALUE)
                .addComponent(icono_ganar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
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
                        .addComponent(valor_perdidas, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_perdidasLayout.createSequentialGroup()
                .addGap(0, 54, Short.MAX_VALUE)
                .addComponent(icono_perder, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
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
        etq_farmacias.setText("Selecciona Farmacia:");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_farmaciasLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(icono_farmacias, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        cont_farmaciasLayout.setVerticalGroup(
            cont_farmaciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_farmaciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_farmacias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icono_farmacias, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(farmacias, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(cont_farmacias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(cont_tipo_informe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(cont_mes_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(cont_ganancias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(cont_perdidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 76, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cont_tipo_informe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cont_farmacias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cont_mes_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cont_ganancias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cont_perdidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(328, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void initAlternComponents(){
        
        Image icono_logo = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logoFT.png"));
        icono_logo = icono_logo.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        etq_logo.setIcon(new ImageIcon(icono_logo));
        
        Image icono1 = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/iforme.png"));
        icono1= icono1.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        icono_tipo.setIcon(new ImageIcon(icono1));
        
        Image icono2 = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/calendar.png"));
        icono2= icono2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        icono_calendario.setIcon(new ImageIcon(icono2));
        
        Image icono3 = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_ganar.png"));
        icono3= icono3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        icono_ganar.setIcon(new ImageIcon(icono3));
        
        Image icono4 = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_perder.png"));
        icono4= icono4.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        icono_perder.setIcon(new ImageIcon(icono4));
        
    }

    public void generarOpcionesInforme(){

               
        int cont = 0;
        comboBoxModelFarmacias.addElement("todas");
        for (int i = 0 ; i < listaFarmacias.length && listaFarmacias[i] != null ; i++) {
            comboBoxModelFarmacias.addElement(listaFarmacias[i].getNIT());
            cont++;
        }
        
        farmacias.setModel(comboBoxModelFarmacias);
            
        if(cont == 0){
            farmacias.setEnabled(false);
            tiposInforme.setEnabled(false);
            period_time.setEnabled(false);
        }
        
        comboBoxModelTipos.addElement("Mensual");
        comboBoxModelTipos.addElement("Anual");
        tiposInforme.setModel(comboBoxModelTipos);
        
        
        
        farmacias.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String farmaciaSeleccionada = (String) farmacias.getSelectedItem();

                valor_ganancias.setText("");
                valor_perdidas.setText("");
                
                if(farmaciaSeleccionada.equals("todas")){
                    primeranio = Integer.parseInt(bd.getFirstYearwithSalesRecords(null));
                }else{
                    primeranio = Integer.parseInt(bd.getFirstYearwithSalesRecords(farmaciaSeleccionada));
                }

            }
        });
        
        tiposInforme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String tipoSeleccionado = (String) tiposInforme.getSelectedItem();

                valor_ganancias.setText("");
                valor_perdidas.setText("");
                
                if(tipoSeleccionado.equals("Mensual")){
                    List<String> meses = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");
                    SpinnerListModel spinnerModelMeses = new SpinnerListModel(meses);
                    period_time.setModel(spinnerModelMeses);
                }else{
                    List<String> anios = new ArrayList<>();
                    int anioActual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
                    for (int i = anioActual; i >= primeranio; i--) {
                        anios.add(String.valueOf(i));
                    }
                    
                    SpinnerListModel spinnerModelAnios = new SpinnerListModel(anios);
                    period_time.setModel(spinnerModelAnios);
                }

            }
        });
        
        period_time.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int valorSeleccionado = (int) period_time.getValue();
                System.out.println("Valor seleccionado: " + valorSeleccionado);
            }
        });
        
        
        
        
        
        
        
        
        

             
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cont_farmacias;
    private javax.swing.JPanel cont_ganancias;
    private javax.swing.JPanel cont_mes_year;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner period_time;
    private javax.swing.JComboBox<String> tiposInforme;
    private javax.swing.JLabel valor_ganancias;
    private javax.swing.JLabel valor_perdidas;
    // End of variables declaration//GEN-END:variables
}
