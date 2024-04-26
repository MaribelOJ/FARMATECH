
package principal;


import utils.BaseDatosMiguel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utils.ButtonEditor;
import utils.ButtonRenderer;

public class Panel_factura_final extends javax.swing.JPanel {

    BaseDatosMiguel bdmiguel;
    private Alerta ventanaAlerta;
    private FormularioEdicion ventanaEdicion;
    private EliminarProductoTabla ventanaEliminacion;
    int contador_subtotal = 0;
    
    public Panel_factura_final(MenuEncargado menu) {
        initComponents();
        this.bdmiguel = new BaseDatosMiguel();
        initAlternComponents();
       
       
    }
    
    
    public void initAlternComponents(){
         setVisible(true);
        Image icono_logo = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logoFT.png"));
        icono_logo = icono_logo.getScaledInstance(75, 75, Image.SCALE_SMOOTH);
        etq_logo.setIcon(new ImageIcon(icono_logo));

        tabla_productos.getTableHeader().setReorderingAllowed(false);
        tabla_productos.getTableHeader().setResizingAllowed(false);

        tabla_productos.getTableHeader().setFont(new Font("Arial", Font.BOLD, 15));
        tabla_productos.getTableHeader().setForeground(Color.WHITE);
        tabla_productos.getTableHeader().setOpaque(false);
        tabla_productos.getTableHeader().setBackground(new Color(79, 108, 211));

        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        tabla_productos.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tabla_productos.getColumnModel().getColumn(1).setCellRenderer(centerRender);
        tabla_productos.getColumnModel().getColumn(2).setCellRenderer(centerRender);
        tabla_productos.getColumnModel().getColumn(3).setCellRenderer(centerRender);
       

        tabla_productos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabla_productos.getColumnModel().getColumn(1).setPreferredWidth(75);
        tabla_productos.getColumnModel().getColumn(2).setPreferredWidth(75);
        tabla_productos.getColumnModel().getColumn(3).setPreferredWidth(100);
        

        tabla_productos.getColumnModel().getColumn(4).setCellEditor(new ButtonEditor(new JCheckBox()));
        tabla_productos.getColumnModel().getColumn(4).setCellRenderer(new ButtonRenderer());
        tabla_productos.getColumnModel().getColumn(4).setPreferredWidth(25);

       
        tabla_productos.getColumnModel().getColumn(5).setCellEditor(new ButtonEditor(new JCheckBox()));
        tabla_productos.getColumnModel().getColumn(5).setCellRenderer(new ButtonRenderer());
        tabla_productos.getColumnModel().getColumn(5).setPreferredWidth(25);

        lista_productos.removeAllItems(); // Limpiar el JComboBox
        List<String> listaDeProductos = bdmiguel.obtenerListaDeProductos();
        for (String producto : listaDeProductos) {
            lista_productos.addItem(producto);
        }

        String productoSeleccionado = (String) lista_productos.getSelectedItem();

        campo_nombre_producto.setText(productoSeleccionado);

        lista_productos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String productoSeleccionado = (String) lista_productos.getSelectedItem();

                campo_nombre_producto.setText(productoSeleccionado);

            }
        });

        revalidate();
        repaint();
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_titulo = new javax.swing.JLabel();
        etq_logo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        etq_factura = new javax.swing.JLabel();
        etq_nombre = new javax.swing.JLabel();
        campo_nombre_producto = new javax.swing.JTextField();
        etq_cantidad = new javax.swing.JLabel();
        campo_cantidad_producto = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        lista_productos = new javax.swing.JComboBox<>();
        scrollpane = new javax.swing.JScrollPane();
        tabla_productos = new javax.swing.JTable();
        etq_subtotal = new javax.swing.JLabel();
        etq_iva = new javax.swing.JLabel();
        etq_total = new javax.swing.JLabel();
        btn_generar_factura = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("REGISTRAR PRODUCTOS");

        jPanel1.setBackground(new java.awt.Color(79, 108, 211));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        etq_factura.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_factura.setForeground(new java.awt.Color(255, 255, 255));
        etq_factura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_factura.setText("FACTURA");

        etq_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_nombre.setForeground(new java.awt.Color(255, 255, 255));
        etq_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_nombre.setText("Nombre del producto");

        campo_nombre_producto.setBackground(new java.awt.Color(255, 255, 255));
        campo_nombre_producto.setForeground(new java.awt.Color(0, 0, 0));

        etq_cantidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_cantidad.setForeground(new java.awt.Color(255, 255, 255));
        etq_cantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_cantidad.setText("Cantidad");

        campo_cantidad_producto.setBackground(new java.awt.Color(255, 255, 255));
        campo_cantidad_producto.setForeground(new java.awt.Color(0, 0, 0));
        campo_cantidad_producto.setText("1");
        campo_cantidad_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_cantidad_productoActionPerformed(evt);
            }
        });

        btn_agregar.setBackground(new java.awt.Color(144, 177, 239));
        btn_agregar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        lista_productos.setBackground(new java.awt.Color(255, 255, 255));
        lista_productos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lista_productos.setForeground(new java.awt.Color(0, 0, 0));
        lista_productos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_factura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(campo_nombre_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lista_productos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campo_cantidad_producto, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(etq_cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(etq_factura)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etq_nombre)
                            .addComponent(etq_cantidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_cantidad_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lista_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campo_nombre_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        tabla_productos.setAutoCreateRowSorter(true);
        tabla_productos.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tabla_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Precio unitario", "Subtotal", "Editar", "Eliminar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollpane.setViewportView(tabla_productos);

        etq_subtotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_subtotal.setForeground(new java.awt.Color(0, 0, 0));
        etq_subtotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_subtotal.setText("SUBTOTAL: $");

        etq_iva.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_iva.setForeground(new java.awt.Color(0, 0, 0));
        etq_iva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_iva.setText("IVA: $");

        etq_total.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_total.setForeground(new java.awt.Color(0, 0, 0));
        etq_total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_total.setText("TOTAL: $");

        btn_generar_factura.setBackground(new java.awt.Color(144, 177, 239));
        btn_generar_factura.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_generar_factura.setForeground(new java.awt.Color(255, 255, 255));
        btn_generar_factura.setText("Generar Factura");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etq_iva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etq_subtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                            .addComponent(etq_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(btn_generar_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etq_subtotal)
                .addGap(12, 12, 12)
                .addComponent(etq_iva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_total)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btn_generar_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed

        String nombreProducto = campo_nombre_producto.getText();
        String cantidadTexto = campo_cantidad_producto.getText();

        if (campo_nombre_producto.getText().equals("") || campo_cantidad_producto.getText().equals(""))  {
            // Mostrar alerta indicando que todos los campos son obligatorios
            Alerta ventana = new Alerta("Todos los campos son obligatorios.");

            // Cerrar la ventana de alerta anterior (si existe)
            if (ventanaAlerta != null) {
                ventanaAlerta.dispose();
            }

            // Asignar la nueva ventana de alerta como la ventana actual
            ventanaAlerta = ventana;

        } else {
            // Verificar si el producto ya existe en la tabla
            DefaultTableModel model = (DefaultTableModel) tabla_productos.getModel();
            int rowCount = model.getRowCount();
            boolean productoExistente = false;
            for (int i = 0; i < rowCount; i++) {
                String producto = (String) model.getValueAt(i, 0);
                if (producto.equalsIgnoreCase(nombreProducto)) {
                    // El producto ya existe en la tabla
                    int cantidadActual = (int) model.getValueAt(i, 1);
                    int cantidadNueva = Integer.parseInt(cantidadTexto);
                    int nuevaCantidad = cantidadActual + cantidadNueva;

                    // Actualizar la cantidad en la tabla
                    model.setValueAt(nuevaCantidad, i, 1);

                    // Recalcular subtotal y otros totales
                    int precioUnitario = (int) model.getValueAt(i, 2);
                    int nuevoSubtotal = nuevaCantidad * precioUnitario;
                    model.setValueAt(nuevoSubtotal, i, 3);

                    productoExistente = true;
                    break;
                }
            }

            if (!productoExistente) {
                // El producto no existe en la tabla, agregar nueva fila
                if (bdmiguel.obtenerPrecioUnitario(nombreProducto) != 0) {
                    if (!cantidadTexto.matches("\\d+")) {
                        // Mostrar alerta indicando que la cantidad debe ser un número
                        Alerta ventana = new Alerta("La cantidad debe ser un número.");

                        // Cerrar la ventana de alerta anterior (si existe)
                        if (ventanaAlerta != null) {
                            ventanaAlerta.dispose();
                        }

                        // Asignar la nueva ventana de alerta como la ventana actual
                        ventanaAlerta = ventana;

                        return; // Salir del método, ya que la validación falló
                    }

                    int cantidad = Integer.parseInt(cantidadTexto);
                    int subtotal = bdmiguel.obtenerPrecioUnitario(nombreProducto) * cantidad;
                    contador_subtotal += subtotal;

                    // Calcular IVA
                    int iva = (int) (contador_subtotal * 0.19);

                    // Calcular total
                    int total = contador_subtotal + iva;

                    etq_subtotal.setText("SUBTOTAL: $" + contador_subtotal);
                    etq_iva.setText("IVA: $" + iva);
                    etq_total.setText("TOTAL: $" + total);

                    // Agregar el producto a la tabla
                    imprimirtabla(nombreProducto, cantidad, subtotal);
                } else {
                    Alerta ventana = new Alerta("Producto no encontrado.");

                    // Cerrar la ventana de alerta anterior (si existe)
                    if (ventanaAlerta != null) {
                        ventanaAlerta.dispose();
                    }

                    // Asignar la nueva ventana de alerta como la ventana actual
                    ventanaAlerta = ventana; 
                }
            }
            actualizarTotales();
            
    }
       
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void campo_cantidad_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_cantidad_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_cantidad_productoActionPerformed
    
    public void imprimirtabla(String nombreProducto, int cantidad, int subtotal) {
       DefaultTableModel model = (DefaultTableModel) tabla_productos.getModel();

       JButton btnEliminar = new JButton();
       btnEliminar.setBackground(Color.white);
       Image icono_eliminar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_eliminar.png"));
       icono_eliminar = icono_eliminar.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
       btnEliminar.setIcon(new ImageIcon(icono_eliminar));

       JButton btnEditar = new JButton();
       btnEditar.setBackground(Color.white);
       Image icono_Editar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_editar.png"));
       icono_Editar = icono_Editar.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
       btnEditar.setIcon(new ImageIcon(icono_Editar));

       Object[] rowData = {nombreProducto, cantidad, bdmiguel.obtenerPrecioUnitario(nombreProducto), subtotal, btnEditar, btnEliminar};
       model.addRow(rowData);

       final int posicion = model.getRowCount() - 1;
       btnEditar.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               int fila = tabla_productos.rowAtPoint(btnEditar.getLocation());
               FormularioEdicion ventana = new FormularioEdicion(Panel_factura_final.this, fila, tabla_productos);
               if (ventanaEdicion != null) {
                   ventanaEdicion.dispose(); // Cerrar la ventana existente
               }
               // Abrir una nueva ventana de edición
               ventanaEdicion = ventana;
               
              
           }
       });

       btnEliminar.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
                int fila = tabla_productos.rowAtPoint(btnEliminar.getLocation());
                EliminarProductoTabla ventana = new EliminarProductoTabla(Panel_factura_final.this, fila, tabla_productos);
                if (ventanaEliminacion != null) {
                    ventanaEliminacion.dispose(); // Cerrar la ventana existente
                }
                // Abrir una nueva ventana de eliminación
                ventanaEliminacion = ventana;
                
               
           }
       });
       actualizarTotales();
    
   }
    
    
    public void actualizarTotales() {
        // Calcular subtotal
        int subtotal = 0;
        for (int i = 0; i < tabla_productos.getRowCount(); i++) {
            subtotal += (int) tabla_productos.getValueAt(i, 3);
        }

        // Calcular IVA
        int iva = (int) (subtotal * 0.19);

        // Calcular total
        int total = subtotal + iva;

        // Actualizar etiquetas
        etq_subtotal.setText("SUBTOTAL: $" + subtotal);
        etq_iva.setText("IVA: $" + iva);
        etq_total.setText("TOTAL: $" + total);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_generar_factura;
    private javax.swing.JTextField campo_cantidad_producto;
    private javax.swing.JTextField campo_nombre_producto;
    private javax.swing.JLabel etq_cantidad;
    private javax.swing.JLabel etq_factura;
    private javax.swing.JLabel etq_iva;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_subtotal;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel etq_total;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> lista_productos;
    private javax.swing.JScrollPane scrollpane;
    private javax.swing.JTable tabla_productos;
    // End of variables declaration//GEN-END:variables
}
