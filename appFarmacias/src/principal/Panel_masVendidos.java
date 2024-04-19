
package principal;

import utils.BaseDatos_Maribel;
import utils.masVendidos;


public class Panel_masVendidos extends javax.swing.JPanel {

    BaseDatos_Maribel bd;
    masVendidos [] productos;
    public Panel_masVendidos(MenuAdmin menu) {
        this.bd = menu.bd_mari;
        this.productos = bd.getPopularProducts();
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont_todo = new javax.swing.JPanel();
        etq_subtitulo = new javax.swing.JLabel();
        linea = new javax.swing.JSeparator();
        etq_id = new javax.swing.JLabel();
        etq_cant = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        cant1 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        cant2 = new javax.swing.JLabel();
        id3 = new javax.swing.JLabel();
        cant3 = new javax.swing.JLabel();
        etq_nombre = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();

        cont_todo.setBackground(new java.awt.Color(255, 255, 255));

        etq_subtitulo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etq_subtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_subtitulo.setText("Top productos más vendidos");

        linea.setBackground(new java.awt.Color(0, 0, 0));
        linea.setForeground(new java.awt.Color(0, 0, 0));

        etq_id.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etq_id.setText("ID_producto");

        etq_cant.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etq_cant.setText("Cantidad");

        id1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        id1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cant1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cant1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        id2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        id2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cant2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cant2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        id3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        id3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cant3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cant3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etq_nombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etq_nombre.setText("Nombre");

        name1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        name2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        name2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        name3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        name3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout cont_todoLayout = new javax.swing.GroupLayout(cont_todo);
        cont_todo.setLayout(cont_todoLayout);
        cont_todoLayout.setHorizontalGroup(
            cont_todoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_subtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(cont_todoLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(cont_todoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_todoLayout.createSequentialGroup()
                        .addGroup(cont_todoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_id)
                            .addGroup(cont_todoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(id3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(cont_todoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(cont_todoLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(etq_nombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etq_cant))
                            .addGroup(cont_todoLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(cont_todoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(cont_todoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cant1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                    .addComponent(cant2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cant3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(linea, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 48, Short.MAX_VALUE))
        );
        cont_todoLayout.setVerticalGroup(
            cont_todoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_todoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(etq_subtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(cont_todoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_id)
                    .addComponent(etq_nombre)
                    .addComponent(etq_cant))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cont_todoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cont_todoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cant1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(cont_todoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cont_todoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cant2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(cont_todoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cont_todoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(id3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cant3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_todo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_todo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void initAlternComponents(){
        if(productos[0] != null){     
            id1.setText(productos[0].getId());
            name1.setText(productos[0].getNombre());
            cant1.setText(productos[0].getCantidad());
            
            if(productos[1] != null){
        
                id2.setText(productos[1].getId());
                name2.setText(productos[1].getNombre());
                cant2.setText(productos[1].getCantidad());
                
                if(productos[2] != null){
        
                    id3.setText(productos[2].getId());
                    name3.setText(productos[2].getNombre());
                    cant3.setText(productos[2].getCantidad());
                }
            }
        }
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cant1;
    private javax.swing.JLabel cant2;
    private javax.swing.JLabel cant3;
    private javax.swing.JPanel cont_todo;
    private javax.swing.JLabel etq_cant;
    private javax.swing.JLabel etq_id;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_subtitulo;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel id3;
    private javax.swing.JSeparator linea;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    // End of variables declaration//GEN-END:variables
}
