/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.cliente;

import ec.edu.ups.controladores.ControladorCliente;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.principal.VistaPrincipal;
import java.util.ResourceBundle;
import java.util.Set;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Byron PC
 */
public class ListarCliente extends javax.swing.JInternalFrame {
 private ControladorCliente controladorCliente;
    private ResourceBundle mensajes;
    public static String x;
    /**
     * Creates new form ListarCliente
     */
    public ListarCliente(ControladorCliente controladorCliente, ResourceBundle mensajes) {
        initComponents();
        x="x";
         int a=VistaPrincipal.desktopPane.getWidth()-this.getWidth();
        int b=VistaPrincipal.desktopPane.getHeight()-this.getHeight();
        setLocation(a/2,b/2);
        setVisible(true);
        this.controladorCliente = controladorCliente;
        this.mensajes = mensajes;
        llenarDatos();
        cambiarIdioma(mensajes);
    }
  public void llenarDatos(){
        
        DefaultTableModel modelo = (DefaultTableModel) tblcliente.getModel();
        Set<Cliente> lista = controladorCliente.getLista();
        for (Cliente cliente : lista) {
            Object[] datos = {cliente.getCodigo(),
                cliente.getNombre(),
                cliente.getCedula(),
                cliente.getDireccion(),
                cliente.getTelefono() };
            modelo.addRow(datos);
        }
        
  }
  public void cambiarIdioma(ResourceBundle mensajes){
        
        JTableHeader tableHeader = tblcliente.getTableHeader();
        TableColumnModel tableColumnModel = tableHeader.getColumnModel();
        TableColumn tableColumn;
        tableColumn = tableColumnModel.getColumn(0);
        tableColumn.setHeaderValue(mensajes.getString("cliente.codigo"));
        tableColumn = tableColumnModel.getColumn(1);
        tableColumn.setHeaderValue(mensajes.getString("cliente.nombre"));
        tableColumn = tableColumnModel.getColumn(2);
        tableColumn.setHeaderValue(mensajes.getString("cliente.cedula"));
        tableColumn = tableColumnModel.getColumn(3);
        tableColumn.setHeaderValue(mensajes.getString("cliente.direccion"));
        tableColumn = tableColumnModel.getColumn(4);
        tableColumn.setHeaderValue(mensajes.getString("cliente.telefono"));
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblcliente = new javax.swing.JTable();
        jLabellistar = new javax.swing.JLabel();

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

        tblcliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Cedula", "Telefono", "Direccion"
            }
        ));
        jScrollPane1.setViewportView(tblcliente);

        jLabellistar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabellistar.setText("Listar Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabellistar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabellistar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        x=null;
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabellistar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblcliente;
    // End of variables declaration//GEN-END:variables
}
