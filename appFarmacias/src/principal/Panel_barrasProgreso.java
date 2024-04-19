
package principal;

import java.util.List;
import utils.BaseDatos_Maribel;


public class Panel_barrasProgreso extends javax.swing.JPanel {
    MenuAdmin menu;
    BaseDatos_Maribel bd;
    String periodo;
    int anio;
    String mes;
    int month;
    String [] gananciasyPerdidas1;
    List<String> meses;
    float ganancias;
    float ganancias2;
    float ganancias3;
    float ganancias4;
    
    public Panel_barrasProgreso(MenuAdmin menu,String periodo,List<String> meses){
        this.menu = menu;
        this.bd = menu.bd_mari;
        this.periodo=periodo;
        this.anio = 0;
        this.month = 0;
        this.mes = "";
        this.meses = meses;
        this.month = 0;
        if(this.periodo == null){
            this.periodo = bd.getLastYearwithSalesRecords();
        }else if(this.periodo.length() > 4){
            this.anio = Integer.parseInt(this.periodo.substring(6));
            this.mes =this.periodo.substring(0,3);

            
            for(int i = 0; i < 12 ; i++){
                if(this.meses.get(i).equals(this.mes)){
                    if((i+1)<10){
                        this.periodo = this.periodo.substring(6)+"-0"+(i+1);
                    }else{
                        this.periodo = this.periodo.substring(6)+"-"+(i+1);
                    }
                }
            }
        }
        
        this.gananciasyPerdidas1=bd.calcularGananciasyPerdidas(this.periodo, null);
        this.ganancias=0;
        this.ganancias2=0;
        this.ganancias3=0;
        this.ganancias4=0;
        initComponents();
        initAlternComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont_barras = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        periodo1 = new javax.swing.JLabel();
        bar_mes1 = new javax.swing.JProgressBar();
        periodo2 = new javax.swing.JLabel();
        bar_mes2 = new javax.swing.JProgressBar();
        periodo3 = new javax.swing.JLabel();
        bar_mes3 = new javax.swing.JProgressBar();
        periodo4 = new javax.swing.JLabel();
        bar_mes4 = new javax.swing.JProgressBar();
        etq_year = new javax.swing.JLabel();

        cont_barras.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Progreso Mensual / Anual");

        periodo1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        periodo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        periodo1.setText("Enero:");

        periodo2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        periodo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        periodo2.setText("Febrero:");

        periodo3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        periodo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        periodo3.setText("Marzo:");

        periodo4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        periodo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        periodo4.setText("Abril:");

        etq_year.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_year.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout cont_barrasLayout = new javax.swing.GroupLayout(cont_barras);
        cont_barras.setLayout(cont_barrasLayout);
        cont_barrasLayout.setHorizontalGroup(
            cont_barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(etq_year, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(cont_barrasLayout.createSequentialGroup()
                .addGroup(cont_barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cont_barrasLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(periodo4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bar_mes4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cont_barrasLayout.createSequentialGroup()
                        .addContainerGap(50, Short.MAX_VALUE)
                        .addGroup(cont_barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cont_barrasLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(periodo3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bar_mes3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cont_barrasLayout.createSequentialGroup()
                                .addComponent(periodo2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bar_mes2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(cont_barrasLayout.createSequentialGroup()
                                .addComponent(periodo1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(bar_mes1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        cont_barrasLayout.setVerticalGroup(
            cont_barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_barrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(etq_year, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(cont_barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bar_mes1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_barrasLayout.createSequentialGroup()
                        .addComponent(periodo1)
                        .addGap(8, 8, 8)))
                .addGroup(cont_barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_barrasLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(bar_mes2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cont_barrasLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(periodo2)))
                .addGap(19, 19, 19)
                .addGroup(cont_barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bar_mes3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cont_barrasLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(periodo3)))
                .addGap(19, 19, 19)
                .addGroup(cont_barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_barrasLayout.createSequentialGroup()
                        .addComponent(bar_mes4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_barrasLayout.createSequentialGroup()
                        .addComponent(periodo4)
                        .addGap(40, 40, 40))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_barras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_barras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void initAlternComponents(){

        if(periodo != null){
            if(mes.equals("")){
                anio = Integer.parseInt(periodo);

                periodo1.setText(periodo);
                periodo2.setText(""+(anio-1));
                periodo3.setText(""+(anio-2));
                periodo4.setText(""+(anio-3));
            }else{
                
                for(int i = 0; i < 12 ; i++){
                    if(meses.get(i).equals(mes)){
                        break;
                    }
                    month++;
                }              
                
                periodo1.setText(meses.get(month)+"/"+anio);
                if(month == 0){
                    month = 11;
                    anio--;
                }else{
                    month--;
                }
                periodo2.setText(meses.get(month)+"/"+anio);
                if(month == 0){
                    month = 11;
                    anio--;
                }else{
                    month--;
                }
                periodo3.setText(meses.get(month)+"/"+anio);
                if(month == 0){
                    month = 11;
                    anio--;
                }else{
                    month--;
                }
                periodo4.setText(meses.get(month)+"/"+anio);                 
                
            }
        }
        
        if(gananciasyPerdidas1[0] != null){
            ganancias = Float.parseFloat(gananciasyPerdidas1[0]);
        }
        
        
        Thread hilos = new Thread(){
            public void run(){
                bar_mes1.setMaximum(500000);
                for (int i = 0; i <= ganancias; i++) {
                    bar_mes1.setValue(i);
                }
            }
        };
        hilos.start();
        
        if(mes.equals("")){
            anio--;
            periodo= Integer.toString(anio);
        }else{
            month = Integer.parseInt(this.periodo.substring(5));
            anio = Integer.parseInt(this.periodo.substring(0,4));
            
            if (month > 0 && month < 10){
                month--;
                periodo = anio+"-0"+month;
            }else if(month>=10){
                month--;
                periodo = anio+"-"+month;
            }else{
                month = 12;
                anio --;
                periodo = anio+"-"+month;
            } 
        }
        
        gananciasyPerdidas1 = bd.calcularGananciasyPerdidas(periodo, null);
        
        if(gananciasyPerdidas1[0] != null){
            ganancias2 = Float.parseFloat(gananciasyPerdidas1[0]);
            
        }
        
        Thread hilos2 = new Thread(){
            public void run(){
                bar_mes2.setMaximum(500000);
                for (int i = 0; i <= ganancias2; i++) {
                    bar_mes2.setValue(i);
                }
            }
        };
        hilos2.start();
        
        if(mes.equals("")){
            anio--;
            periodo= Integer.toString(anio);
        }else{
            month = Integer.parseInt(this.periodo.substring(5));
            anio = Integer.parseInt(this.periodo.substring(0,4));
            
            if (month > 0 && month < 10){
                month--;
                periodo = anio+"-0"+month;
            }else if(month>=10){
                month--;
                periodo = anio+"-"+month;
            }else{
                month = 12;
                anio --;
                periodo = anio+"-"+month;
            }   
        }
        
        gananciasyPerdidas1 = bd.calcularGananciasyPerdidas(periodo, null);
        
        if(gananciasyPerdidas1[0] != null){
            ganancias3 = Float.parseFloat(gananciasyPerdidas1[0]);
        }
        
        
        Thread hilos3 = new Thread(){
            public void run(){
                bar_mes3.setMaximum(500000);
                for (int i = 0; i <= ganancias3; i++) {
                    bar_mes3.setValue(i);
                }
            }
        };
        hilos3.start();
        
        if(mes.equals("")){
            anio--;
            periodo= Integer.toString(anio);
        }else{
            month = Integer.parseInt(this.periodo.substring(5));
            anio = Integer.parseInt(this.periodo.substring(0,4));
            
            if (month > 0 && month < 10){
                month--;
                periodo = anio+"-0"+month;
            }else if(month>=10){
                month--;
                periodo = anio+"-"+month;
            }else{
                month = 12;
                anio --;
                periodo = anio+"-"+month;
            } 
        }
        
        gananciasyPerdidas1 = bd.calcularGananciasyPerdidas(periodo, null);
        
        if(gananciasyPerdidas1[0] != null){
            ganancias4 = Float.parseFloat(gananciasyPerdidas1[0]);
        }
        
        
        Thread hilos4 = new Thread(){
            public void run(){
                bar_mes4.setMaximum(500000);
                for (int i = 0; i <= ganancias4; i++) {
                    bar_mes4.setValue(i);
                }
            }
        };
        hilos4.start();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar_mes1;
    private javax.swing.JProgressBar bar_mes2;
    private javax.swing.JProgressBar bar_mes3;
    private javax.swing.JProgressBar bar_mes4;
    private javax.swing.JPanel cont_barras;
    private javax.swing.JLabel etq_year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel periodo1;
    private javax.swing.JLabel periodo2;
    private javax.swing.JLabel periodo3;
    private javax.swing.JLabel periodo4;
    // End of variables declaration//GEN-END:variables
}
