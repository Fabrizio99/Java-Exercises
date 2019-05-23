package facturacion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ColeccionProductos extends javax.swing.JFrame {
    DefaultTableModel modelo;
    Object[] objeto = new Object[4];
    ArrayProducto listaProductos;
    Producto nuevo;
    int filaSeleccionada = -1;
    public ColeccionProductos() {
        initComponents();
        listaProductos = new ArrayProducto();
        modelo = (DefaultTableModel) tablaProductos.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmpCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmpDescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmpPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmpStock = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CODIGO");

        jLabel2.setText("DESCRIPCION");

        jLabel3.setText("PRECIO");

        jLabel4.setText("STOCK");

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnModificar.setText("MODIFICAR");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnConsultar.setText("CONSULTAR");
        btnConsultar.setEnabled(false);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("REGISTRO DE PRODUCTOS");

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción", "Precio", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmpPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmpStock, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmpDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmpCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificar)
                    .addComponent(btnAgregar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnEliminar)
                    .addComponent(btnConsultar))
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(184, 184, 184))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(28, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmpCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmpDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmpPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmpStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar))
                .addGap(18, 18, 18)
                .addComponent(btnConsultar)
                .addContainerGap(253, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(248, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(74, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiarCampos(){
        cmpCodigo.setText("");
        cmpDescripcion.setText("");
        cmpStock.setText("");
        cmpPrecio.setText("");
    }
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        nuevo = new Producto(cmpCodigo.getText(), cmpDescripcion.getText(), Float.parseFloat(cmpPrecio.getText()), Integer.parseInt(cmpStock.getText()));
        listaProductos.adicionarProduccto(nuevo);
        objeto[0] = nuevo.getCodigo();
        objeto[1] = nuevo.getDescripcion();
        objeto[2] = nuevo.getPrecio();
        objeto[3] = nuevo.getStock();
        modelo.addRow(objeto);
        limpiarCampos();
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnConsultar.setEnabled(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(tablaProductos.getSelectedRow() != -1){
            filaSeleccionada = tablaProductos.getSelectedRow();
            listaProductos.eliminarProducto(listaProductos.elementoPosicion(filaSeleccionada));
            modelo.removeRow(filaSeleccionada);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un elemento para eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        filaSeleccionada = tablaProductos.getSelectedRow();
        if(btnModificar.getText().equals("MODIFICAR")){
            if(filaSeleccionada != -1){
                cmpCodigo.setText(listaProductos.elementoPosicion(filaSeleccionada).getCodigo());
                cmpDescripcion.setText(listaProductos.elementoPosicion(filaSeleccionada).getDescripcion());
                cmpPrecio.setText(listaProductos.elementoPosicion(filaSeleccionada).getPrecio()+"");
                cmpStock.setText(listaProductos.elementoPosicion(filaSeleccionada).getStock()+"");
                btnModificar.setText("GUARDAR");
                btnAgregar.setEnabled(false);
                btnEliminar.setEnabled(false);
                btnConsultar.setEnabled(false);
            }else{
                JOptionPane.showMessageDialog(null, "Seleccione un elemento para modificar");
            }
        }else{
            listaProductos.elementoPosicion(filaSeleccionada).setCodigo(cmpCodigo.getText());
            listaProductos.elementoPosicion(filaSeleccionada).setDescripcion(cmpDescripcion.getText());
            listaProductos.elementoPosicion(filaSeleccionada).setPrecio(Float.parseFloat(cmpPrecio.getText()));
            listaProductos.elementoPosicion(filaSeleccionada).setStock(Integer.parseInt(cmpStock.getText()));
            tablaProductos.setValueAt(listaProductos.elementoPosicion(filaSeleccionada).getCodigo(), filaSeleccionada, 0);
            tablaProductos.setValueAt(listaProductos.elementoPosicion(filaSeleccionada).getDescripcion(), filaSeleccionada, 1);
            tablaProductos.setValueAt(listaProductos.elementoPosicion(filaSeleccionada).getPrecio(), filaSeleccionada, 2);
            tablaProductos.setValueAt(listaProductos.elementoPosicion(filaSeleccionada).getStock(), filaSeleccionada, 3);
            btnModificar.setText("MODIFICAR");
            limpiarCampos();
            btnAgregar.setEnabled(true);
            btnEliminar.setEnabled(true);
            btnConsultar.setEnabled(true);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        if(listaProductos.cantidadProducto() == 0){
            JOptionPane.showMessageDialog(null, "Ingrese productos para poder consultar el producto más caro y más barato");
        }else{
            JOptionPane.showMessageDialog(null, "El producto más caro es "+listaProductos.productoMasCaro().getDescripcion()+" y el producto más barato es "+listaProductos.productoMasBarato().getDescripcion());
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAgregar;
    public static javax.swing.JButton btnConsultar;
    public static javax.swing.JButton btnEliminar;
    public static javax.swing.JButton btnLimpiar;
    public static javax.swing.JButton btnModificar;
    public static javax.swing.JTextField cmpCodigo;
    public static javax.swing.JTextField cmpDescripcion;
    public static javax.swing.JTextField cmpPrecio;
    public static javax.swing.JTextField cmpStock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
