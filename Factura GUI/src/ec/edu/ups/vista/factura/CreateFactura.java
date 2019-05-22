/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.factura;

import ec.edu.ups.controladores.ControladorCliente;
import ec.edu.ups.controladores.ControladorFactura;
import ec.edu.ups.controladores.ControladorFacturaDetalle;
import ec.edu.ups.controladores.ControladorProducto;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Factura;
import ec.edu.ups.modelo.FacturaDetalle;
import ec.edu.ups.modelo.Producto;
import ec.edu.ups.principal.VistaPrincipal;
import static ec.edu.ups.vista.cliente.BorrarCliente.x;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Byron PC
 */
public class CreateFactura extends javax.swing.JInternalFrame {
 private ControladorFactura controladorFactura;
    private ControladorFacturaDetalle controladorFacturaDetalle;
    private ControladorCliente controladorCliente;
    private ControladorProducto controladorProducto;
    private ResourceBundle mensajes;
    private FacturaDetalle facturaDetalle;
    private Factura factura;
    private Producto producto;
    private int contador;
    public static String x;
    private DefaultTableModel modelo1;
    private double totalv,subtotalv,ivav,total1v;
    /**
     * Creates new form CreateFactura
     */
    public CreateFactura(ControladorCliente controladorCliente,ControladorFactura controladorFactura , ControladorFacturaDetalle controladorFacturaDetalle,ControladorProducto controladorProducto, ResourceBundle mensajes) {
        initComponents();
         x="x";
        int a=VistaPrincipal.desktopPane.getWidth()-this.getWidth();
        int b=VistaPrincipal.desktopPane.getHeight()-this.getHeight();
        setLocation(a/2,b/2);
        setVisible(true);
        contador = 0;
        this.controladorFactura = controladorFactura;
        this.controladorCliente = controladorCliente;
        this.controladorFacturaDetalle=controladorFacturaDetalle;
        this.controladorProducto= controladorProducto;
        this.factura = new Factura();
        txtfac.setText(Integer.toString(this.controladorFactura.getCodigo()));
        txtfecha.setText(factura.getFecha());
        this.mensajes = mensajes;
        cambiarIdioma(mensajes);
        modelo1=null;
        producto = null;
        totalv=0;
        subtotalv=0;
        ivav=0;
        total1v=0;
        
    }
public void llenarDatos(){
        
        DefaultTableModel modelo = (DefaultTableModel) tabla1.getModel();
        List<FacturaDetalle> lista = factura.getDetalles();
        while(contador < lista.size()){
            Object[] datos = {factura.getDetalles().get(contador).getCodigo(),
                lista.get(contador).getCantidad(),
                lista.get(contador).getProducto().getNombre(),
                lista.get(contador).getPrecio(),
                lista.get(contador).getSubtotal() };
            modelo.addRow(datos);
            contador++;
        }
        calcularSubtotal();
        txtsubt.setText(Double.toString(factura.getSubtotal()));
        calcularTotal();
        txtto.setText(Double.toString(factura.getTotal()));
        calcularIva();
        txtiva1.setText(Double.toString(factura.getIva()));
                
        
    }
 public void calcularSubtotal(){
        double suma = 0;
        for(int i = 0; i < factura.getDetalles().size(); i++){
            suma += factura.getDetalles().get(i).getSubtotal();
        }
        factura.setSubtotal(suma);
    }
 
 public void calcularIva(){
     double iva=0;
     for(int i=0 ; i<factura.getDetalles().size();i++){
     iva=factura.getSubtotal()*0.12;
 }
     factura.setIva(iva);
 }
  public void calcularTotal(){
        double total = factura.getSubtotal() + (factura.getSubtotal()*factura.getIva());
        factura.setTotal(total);
    }
  public void cambiarIdioma(ResourceBundle mensajes){
        
        jLabelfacturanu.setText(mensajes.getString("factura.numero"));
        jLabelcodigo.setText(mensajes.getString("cliente.codigo"));
        jLabelnombre.setText(mensajes.getString("cliente.nombre"));
        jLabelcedula.setText(mensajes.getString("cliente.cedula"));
        jLabeldireccion.setText(mensajes.getString("cliente.direccion"));
        jLabeltelefono.setText(mensajes.getString("cliente.telefono"));
        jLabelfecha.setText(mensajes.getString("factura.fecha"));
        jLabeliva.setText(mensajes.getString("factura.iva"));
        
        
      
        btnbuscar.setText(mensajes.getString("boton.buscar"));
        
        
        btnbuscar.setText(mensajes.getString("boton.buscar"));
        btncrear.setText(mensajes.getString("boton.crear"));
        
        JTableHeader tableHeader = tabla1.getTableHeader();
        TableColumnModel tableColumnModel = tableHeader.getColumnModel();
        TableColumn tableColumn;
        tableColumn = tableColumnModel.getColumn(0);
        tableColumn.setHeaderValue(mensajes.getString("cliente.codigo"));
        tableColumn = tableColumnModel.getColumn(1);
        tableColumn.setHeaderValue(mensajes.getString("factura.cantidad"));
        tableColumn = tableColumnModel.getColumn(2);
        tableColumn.setHeaderValue(mensajes.getString("factura.producto"));
        tableColumn = tableColumnModel.getColumn(3);
        tableColumn.setHeaderValue(mensajes.getString("factura.precio"));
        tableHeader.repaint();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelcedula = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        jLabelnombre = new javax.swing.JLabel();
        jLabeldireccion = new javax.swing.JLabel();
        jLabeltelefono = new javax.swing.JLabel();
        jLabelcodigo = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtdir = new javax.swing.JTextField();
        txttele = new javax.swing.JTextField();
        txtcod = new javax.swing.JTextField();
        jLabelsubtotal = new javax.swing.JLabel();
        txtsubt = new javax.swing.JTextField();
        jLabeliva = new javax.swing.JLabel();
        txtiva1 = new javax.swing.JTextField();
        jLabeltotal = new javax.swing.JLabel();
        txtto = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jLabelfecha = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        jLabelfacturanu = new javax.swing.JLabel();
        txtfac = new javax.swing.JTextField();
        btncrear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Factura");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Factura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(153, 0, 153))); // NOI18N

        jLabelcedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelcedula.setText("Cédula a Buscar");

        jLabelnombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelnombre.setText("Nombre");

        jLabeldireccion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabeldireccion.setText("Dirección");

        jLabeltelefono.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabeltelefono.setText("Teléfono");

        jLabelcodigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelcodigo.setText("Codigo");

        txtnombre.setEditable(false);

        txtdir.setEditable(false);

        txttele.setEditable(false);

        txtcod.setEditable(false);

        jLabelsubtotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelsubtotal.setText("Subtotal");

        jLabeliva.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabeliva.setText("IVA 12%");

        jLabeltotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabeltotal.setText("Total");

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jLabelfecha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelfecha.setText("Fecha");

        txtfecha.setEditable(false);
        txtfecha.setEnabled(false);
        txtfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaActionPerformed(evt);
            }
        });

        jLabelfacturanu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelfacturanu.setText("Codigo Factura");

        txtfac.setEditable(false);
        txtfac.setEnabled(false);

        btncrear.setText("Crear");
        btncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "0", null, null, null}
            },
            new String [] {
                "Codigo", "Cantidad", "Producto", "Precio U.", "Precio T."
            }
        ));
        tabla1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabla1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tabla1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabeltelefono)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txttele, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabeldireccion)
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtdir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabelnombre))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelfecha)
                                            .addComponent(jLabelcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabelfacturanu)))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfac, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelsubtotal)
                                    .addComponent(jLabeliva)
                                    .addComponent(jLabeltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtiva1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtsubt, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabelcedula)
                        .addGap(26, 26, 26)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnbuscar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(btncrear, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar)
                    .addComponent(jLabelcedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelnombre)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelfecha)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelcodigo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabeldireccion)
                            .addComponent(txtdir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabeltelefono)
                        .addComponent(txttele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelfacturanu)
                        .addComponent(txtfac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelsubtotal)
                    .addComponent(txtsubt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeliva)
                    .addComponent(txtiva1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabeltotal)
                    .addComponent(txtto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncrear)
                    .addComponent(jButton1))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        Cliente cliente = new Cliente();

        cliente = controladorCliente.readCedula(String.valueOf(txtcedula.getText()));

        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "El cliente no existe");
        } else {
            txtnombre.setText(cliente.getNombre());
            txtcedula.setText(cliente.getCedula());
            txtdir.setText(cliente.getDireccion());
            txttele.setText(cliente.getTelefono());
            txtcod.setText(String.valueOf(cliente.getCodigo()));
        }

    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaActionPerformed

    private void btncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearActionPerformed
        // TODO add your handling code here:
        //llamar controlador create
        Date date = new Date();
        factura.setFecha(date);
        Cliente cliente= controladorCliente.readCedula(txtcedula.getText());
        factura.setCliente(cliente);
        controladorFactura.create(factura);
        factura.setIva(ivav);
        factura.setSubtotal(subtotalv);
        factura.setTotal(totalv);
        for(int i=0;i<tabla1.getRowCount()-1;i++){
            System.out.println(i);
            facturaDetalle= new FacturaDetalle();
            facturaDetalle.setCodigo(Integer.parseInt(tabla1.getValueAt(i, 0).toString()));
            double cant = Double.parseDouble(tabla1.getValueAt(i, 1).toString());
            int c = (int)cant;
            facturaDetalle.setCantidad(c);
            facturaDetalle.setProducto(controladorProducto.read(Integer.parseInt(tabla1.getValueAt(i, 0).toString())));
            //facturaDetalle.setPrecio(Double.parseDouble(tabla1.getValueAt(i, 3).toString()));
            //facturaDetalle.setSubtotal(Double.parseDouble(tabla1.getValueAt(i, 4).toString()));
            factura.añadirFacturaDetalle(facturaDetalle);
            
    }
        controladorFactura.create(factura);
        
        contador=0;
        
        Factura factu = new Factura();
        llenarDatos();
        vaciarTabla();
        txtfac.setText(Integer.toString(controladorFactura.getCodigo()));
        factu.setNumeroFactura(Integer.parseInt(txtfac.getText()));
        JOptionPane.showMessageDialog(null, "Se ha creado la factura!!");
        System.out.println(factura);
        txtfac.setText(Integer.toString(controladorFactura.getCodigo()-1));
       
        txtcedula.setText("");
        txtcod.setText("");
        txtdir.setText("");
        txtiva1.setText("");
        txtnombre.setText("");
        txtsubt.setText("");
        txttele.setText("");
        txtto.setText("");
    }//GEN-LAST:event_btncrearActionPerformed
  public void vaciarTabla(){
        DefaultTableModel modelo = (DefaultTableModel) tabla1.getModel();
        int filas=tabla1.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
    }
    
    public void vaciarFila(int num){
        DefaultTableModel modelo = (DefaultTableModel) tabla1.getModel();
        modelo.removeRow(num);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        x=null;
    }//GEN-LAST:event_formInternalFrameClosing

    private void tabla1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla1KeyReleased
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==KeyEvent.VK_ENTER){
            int fila= tabla1.getSelectedRow();
            int columna = tabla1.getSelectedColumn();
            int codigo=0;
            Object[]datos2={"", 0, "", "", ""};
            if(columna==0){
                codigo = Integer.parseInt(tabla1.getValueAt(fila, columna).toString());
                producto=controladorProducto.read(codigo);
                double precio= producto.getPrecio();
                int cant = Integer.parseInt(tabla1.getValueAt(fila, 1).toString());
                modelo1= (DefaultTableModel)tabla1.getModel();
                modelo1.removeRow(fila);
                total1v=precio*cant;
                Object[]datos={codigo,cant,producto.getNombre(),producto.getPrecio(),total1v};
                modelo1.addRow(datos);
                modelo1.addRow(datos2);

            }else if(columna==1){
                System.out.println(columna);
                codigo=Integer.parseInt(tabla1.getValueAt(fila, columna-1).toString());
                int cant = Integer.parseInt(tabla1.getValueAt(fila, columna).toString());
                modelo1.removeRow(fila);
                modelo1.removeRow(tabla1.getRowCount()-1);
                total1v=producto.getPrecio()*cant;
                Object[] datos={codigo,cant,producto.getNombre(),producto.getPrecio(),total1v};
                modelo1.addRow(datos);
                modelo1.addRow(datos2);
            }
            subtotalv= total1v + subtotalv ;
            ivav= subtotalv *0.12;
            totalv=subtotalv + ivav;
            txtsubt.setText(String.valueOf(subtotalv));
            txtiva1.setText(String.valueOf(ivav));
            txtto.setText(String.valueOf(totalv));

        }
    }//GEN-LAST:event_tabla1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncrear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelcedula;
    private javax.swing.JLabel jLabelcodigo;
    private javax.swing.JLabel jLabeldireccion;
    private javax.swing.JLabel jLabelfacturanu;
    private javax.swing.JLabel jLabelfecha;
    private javax.swing.JLabel jLabeliva;
    private javax.swing.JLabel jLabelnombre;
    private javax.swing.JLabel jLabelsubtotal;
    private javax.swing.JLabel jLabeltelefono;
    private javax.swing.JLabel jLabeltotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtdir;
    private javax.swing.JTextField txtfac;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtiva1;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtsubt;
    private javax.swing.JTextField txttele;
    private javax.swing.JTextField txtto;
    // End of variables declaration//GEN-END:variables
}
