
package principal;

import utils.BaseDatos_Maribel;


public class Panel_progresoMensual extends javax.swing.JPanel {
    MenuAdmin menu;
    BaseDatos_Maribel bd;
    String periodo;
    int anio;
    String [] gananciasyPerdidas1;
    float ganancias;
    float ganancias2;
    float ganancias3;
    float ganancias4;
    public Panel_progresoMensual(MenuAdmin menu,String periodo) {
        this.menu = menu;
        this.bd = menu.bd_mari;
        this.periodo=periodo;
        
        if(this.periodo == null){
            this.periodo = bd.getLastYearwithSalesRecords();
        }
        this.anio = 0;
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
        mes1 = new javax.swing.JLabel();
        bar_mes1 = new javax.swing.JProgressBar();
        mes2 = new javax.swing.JLabel();
        bar_mes2 = new javax.swing.JProgressBar();
        mes3 = new javax.swing.JLabel();
        bar_mes3 = new javax.swing.JProgressBar();
        mes4 = new javax.swing.JLabel();
        bar_mes4 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();

        cont_barras.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Progreso Mensual");

        mes1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mes1.setText("Enero:");

        mes2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mes2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mes2.setText("Febrero:");

        mes3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mes3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mes3.setText("Marzo:");

        mes4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mes4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mes4.setText("Abril:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout cont_barrasLayout = new javax.swing.GroupLayout(cont_barras);
        cont_barras.setLayout(cont_barrasLayout);
        cont_barrasLayout.setHorizontalGroup(
            cont_barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(cont_barrasLayout.createSequentialGroup()
                .addGroup(cont_barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cont_barrasLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mes4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bar_mes4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cont_barrasLayout.createSequentialGroup()
                        .addContainerGap(50, Short.MAX_VALUE)
                        .addGroup(cont_barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cont_barrasLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(mes3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bar_mes3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cont_barrasLayout.createSequentialGroup()
                                .addComponent(mes2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bar_mes2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(cont_barrasLayout.createSequentialGroup()
                                .addComponent(mes1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(cont_barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bar_mes1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_barrasLayout.createSequentialGroup()
                        .addComponent(mes1)
                        .addGap(8, 8, 8)))
                .addGroup(cont_barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_barrasLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(bar_mes2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cont_barrasLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(mes2)))
                .addGap(19, 19, 19)
                .addGroup(cont_barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bar_mes3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cont_barrasLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(mes3)))
                .addGap(19, 19, 19)
                .addGroup(cont_barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_barrasLayout.createSequentialGroup()
                        .addComponent(bar_mes4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_barrasLayout.createSequentialGroup()
                        .addComponent(mes4)
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
            anio = Integer.parseInt(periodo);
            
            mes1.setText(periodo);
            mes2.setText(""+(anio-1)+"");
            mes3.setText(""+(anio-2)+"");
            mes4.setText(""+(anio-3)+"");
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
        
        anio--;
        gananciasyPerdidas1 = bd.calcularGananciasyPerdidas(Integer.toString(anio), null);
        
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
        
        anio--;
        gananciasyPerdidas1 = bd.calcularGananciasyPerdidas(Integer.toString(anio), null);
        
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
        
        anio--;
        gananciasyPerdidas1 = bd.calcularGananciasyPerdidas(Integer.toString(anio), null);
        
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel mes1;
    private javax.swing.JLabel mes2;
    private javax.swing.JLabel mes3;
    private javax.swing.JLabel mes4;
    // End of variables declaration//GEN-END:variables
}
