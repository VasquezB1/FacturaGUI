/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.cliente;

import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;
import ec.edu.ups.controladores.ControladorCliente;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.principal.VistaPrincipal;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author Byron PC
 */
public class CrearCliente extends javax.swing.JInternalFrame {
private ControladorCliente controladorCliente;
   public static String x;
    private ResourceBundle mensajes;
    /**
     * Creates new form CrearCliente
     */
    public CrearCliente(ControladorCliente controladorCliente, ResourceBundle mensajes) {
        initComponents();
         x="x";
         int a=VistaPrincipal.desktopPane.getWidth()-this.getWidth();
        int b=VistaPrincipal.desktopPane.getHeight()-this.getHeight();
        setLocation(a/2,b/2);
        setVisible(true);
         this.controladorCliente = controladorCliente;
        this.mensajes = mensajes;
        txtcodigo.setText(Integer.toString(this.controladorCliente.getCodigo()));
        cambiarIdioma(mensajes);
    }
 public void cambiarIdioma(ResourceBundle mensajes){
        jLabeltitulo.setText(mensajes.getString("cliente.titulo"));
        jPaneltitulo.setToolTipText(mensajes.getString("cliente.titulo"));
        btncancelar.setText(mensajes.getString("boton.cancelar"));
        jLabelcodigo.setText(mensajes.getString("cliente.codigo"));
        jLabelnombre.setText(mensajes.getString("cliente.nombre"));
        jLabelcedula.setText(mensajes.getString("cliente.cedula"));
        jLabeldireccion.setText(mensajes.getString("cliente.direccion"));
        jLabeltelefono.setText(mensajes.getString("cliente.telefono"));
        btnaceptar.setText(mensajes.getString("boton.crear"));
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabeltitulo = new javax.swing.JLabel();
        jPaneltitulo = new javax.swing.JPanel();
        jLabelnombre = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabelcedula = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        jLabeldireccion = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jLabeltelefono = new javax.swing.JLabel();
        txttelefono3 = new javax.swing.JTextField();
        jLabelcodigo = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        btnaceptar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();

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

        jLabeltitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabeltitulo.setText("Crear Cliente");

        jPaneltitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(153, 0, 153))); // NOI18N

        jLabelnombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelnombre.setText("Nombre");

        jLabelcedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelcedula.setText("Cédula");

        jLabeldireccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabeldireccion.setText("Dirección");

        jLabeltelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabeltelefono.setText("Teléfono");

        jLabelcodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelcodigo.setText("Codigo");

        txtcodigo.setEditable(false);
        txtcodigo.setEnabled(false);

        btnaceptar.setText("Aceptar");
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPaneltituloLayout = new javax.swing.GroupLayout(jPaneltitulo);
        jPaneltitulo.setLayout(jPaneltituloLayout);
        jPaneltituloLayout.setHorizontalGroup(
            jPaneltituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneltituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneltituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnaceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPaneltituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPaneltituloLayout.createSequentialGroup()
                            .addComponent(jLabeltelefono)
                            .addGap(27, 27, 27)
                            .addComponent(txttelefono3))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPaneltituloLayout.createSequentialGroup()
                            .addComponent(jLabelnombre)
                            .addGap(31, 31, 31)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPaneltituloLayout.createSequentialGroup()
                            .addComponent(jLabelcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtcedula))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPaneltituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneltituloLayout.createSequentialGroup()
                        .addComponent(jLabeldireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPaneltituloLayout.createSequentialGroup()
                        .addComponent(jLabelcodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPaneltituloLayout.setVerticalGroup(
            jPaneltituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneltituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneltituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelnombre)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeldireccion)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPaneltituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneltituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelcodigo)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPaneltituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeltelefono)
                    .addComponent(txttelefono3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPaneltituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaceptar)
                    .addComponent(btncancelar))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabeltitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPaneltitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabeltitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPaneltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
        // TODO add your handling code here:
        //btnguardar.setText("Se ha guardado el cliente");
        Cliente cliente = new Cliente();
        cliente.setNombre(txtnombre.getText());
        cliente.setDireccion(txtdireccion.getText());
        cliente.setCedula(txtcedula.getText());
        cliente.setTelefono(txttelefono3.getText());       
       
        txtnombre.setText("");
        txtdireccion.setText("");
        txtcedula.setText("");
        txttelefono3.setText("");
        
        controladorCliente.create(cliente);
        txtcodigo.setText(Integer.toString(this.controladorCliente.getCodigo()));
        JOptionPane.showMessageDialog(null, "Cliente Creado");
    }//GEN-LAST:event_btnaceptarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        setVisible(false);

    }//GEN-LAST:event_btncancelarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        x=null;
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JLabel jLabelcedula;
    private javax.swing.JLabel jLabelcodigo;
    private javax.swing.JLabel jLabeldireccion;
    private javax.swing.JLabel jLabelnombre;
    private javax.swing.JLabel jLabeltelefono;
    private javax.swing.JLabel jLabeltitulo;
    private javax.swing.JPanel jPaneltitulo;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono3;
    // End of variables declaration//GEN-END:variables
}
