/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlador.Controlador;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;




/**
 *
 * @author Luis Ahumada
 */
public class IncidenciaInt extends javax.swing.JFrame {
 public static final String ACEPTAR_Int="boton aceptar incidencia interna";
    /**
     * Creates new form IncidenciaInt
     */
    public IncidenciaInt() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Nueva incidencia interna");
    }
    public Image getIconImage(){
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono.png"));
    return retValue;
    }
    public static boolean siNo() {
    if (JOptionPane.showConfirmDialog(null,"¿Desea guardar nueva incidenca?","Se han validado los datos",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        return true;
    } 
    else {
        return false;
        }
    }

    public static void ticketRepetido(){
JOptionPane.showConfirmDialog(null,"El ticket ya existe.\n Ingrese otro.","Error en ticket",JOptionPane.OK_OPTION);


}
    
    
    
    
    public void ejecutar(){
     setVisible(true);
    
    }
    public void setControlador(Controlador control){
        jButtonAceptar.setActionCommand(ACEPTAR_Int);
        jButtonAceptar.addActionListener(control);
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCancelar = new javax.swing.JButton();
        jButtonAceptar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextSol = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextDesc = new javax.swing.JTextArea();
        jComboBoxLugar = new javax.swing.JComboBox<>();
        jLabelFechaDMA = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelTicket = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabelNuevaIncidencia = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jLabelSol = new javax.swing.JLabel();
        jLabelDescrip = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jLabelLugar = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldTicket = new javax.swing.JTextField();
        jTextFieldDia = new javax.swing.JTextField();
        jTextFieldMes = new javax.swing.JTextField();
        jTextFieldAnio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelFondoIncidenciaInt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCancelar.setBackground(new java.awt.Color(0, 0, 204));
        jButtonCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 100, 30));

        jButtonAceptar.setBackground(new java.awt.Color(0, 0, 204));
        jButtonAceptar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAceptar.setText("Guardar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 100, 30));

        jTextSol.setColumns(20);
        jTextSol.setRows(5);
        jScrollPane2.setViewportView(jTextSol);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 170, 150));

        jTextDesc.setColumns(20);
        jTextDesc.setRows(5);
        jScrollPane1.setViewportView(jTextDesc);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 170, 150));

        jComboBoxLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMPRA", "CREDITO Y COBRANZA", "TESORERIA", "RRHH", "CONTADURIA", "VENTA", "MARKETING", "MESA DE AYUDA" }));
        jComboBoxLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLugarActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 110, -1));

        jLabelFechaDMA.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelFechaDMA.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFechaDMA.setText("(d/m/a)");
        getContentPane().add(jLabelFechaDMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, 20));

        jLabelFecha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFecha.setText("Fecha:");
        getContentPane().add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, 20));

        jLabelTicket.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabelTicket.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTicket.setText("NUEVA INCIDENCIA");
        getContentPane().add(jLabelTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 20));

        jLabelEstado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelEstado.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEstado.setText("Estado:");
        getContentPane().add(jLabelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, 20));
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 90, -1));

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nivel 1", "Nivel 2" }));
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 70, -1));

        jLabelNuevaIncidencia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelNuevaIncidencia.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNuevaIncidencia.setText("Código de Ticket:");
        getContentPane().add(jLabelNuevaIncidencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, 20));

        jLabelTipo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelTipo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTipo.setText("Tipo de Incidencia:");
        getContentPane().add(jLabelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 20));

        jLabelSol.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelSol.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSol.setText("Solución Efectuada");
        getContentPane().add(jLabelSol, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));

        jLabelDescrip.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelDescrip.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescrip.setText("Descripción");
        getContentPane().add(jLabelDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RESUELTA", "PENDIENTE" }));
        jComboBoxEstado.setToolTipText("");
        jComboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 110, -1));

        jLabelLugar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelLugar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLugar.setText("Lugar:");
        getContentPane().add(jLabelLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabelUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuario:");
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 20));

        jTextFieldTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTicketActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 90, -1));

        jTextFieldDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDiaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 20, -1));

        jTextFieldMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMesActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 20, -1));

        jTextFieldAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 50, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Incidencia.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabelFondoIncidenciaInt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        getContentPane().add(jLabelFondoIncidenciaInt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jComboBoxLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLugarActionPerformed

    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoActionPerformed

    private void jTextFieldTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTicketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTicketActionPerformed

    private void jTextFieldDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDiaActionPerformed

    private void jTextFieldAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAnioActionPerformed

    private void jTextFieldMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMesActionPerformed

    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEstadoActionPerformed

    
    public int getCod(){
    return Integer.parseInt(jTextFieldTicket.getText());
    }
    public String getLugar(){
    return jComboBoxLugar.getSelectedItem().toString();
    }
    public boolean getEstado(){
        if(jComboBoxEstado.getSelectedItem().toString()=="RESUELTA"){
        return true;
        }
        else
        {
        return false;
        }
    }
    public int getDia(){
    return Integer.parseInt(jTextFieldDia.getText());
    }
    public int getMes(){
    return Integer.parseInt(jTextFieldMes.getText());
    }
    public int getAnio(){
    return Integer.parseInt(jTextFieldAnio.getText());
    }
    public String getUsuario(){
    return jTextFieldUsuario.getText();
    }
    public int getTipo(){
        
        String aux;
        aux = jComboBoxTipo.getSelectedItem().toString();
        
        if(aux == "Nivel 1"){return 1;}
        else{return 2;}
    }
    public String getDes(){
    return jTextDesc.getText();
    }
    public String getSol(){
    return jTextSol.getText();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JComboBox<String> jComboBoxLugar;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDescrip;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelFechaDMA;
    private javax.swing.JLabel jLabelFondoIncidenciaInt;
    private javax.swing.JLabel jLabelLugar;
    private javax.swing.JLabel jLabelNuevaIncidencia;
    private javax.swing.JLabel jLabelSol;
    private javax.swing.JLabel jLabelTicket;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextDesc;
    private javax.swing.JTextField jTextFieldAnio;
    private javax.swing.JTextField jTextFieldDia;
    private javax.swing.JTextField jTextFieldMes;
    private javax.swing.JTextField jTextFieldTicket;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JTextArea jTextSol;
    // End of variables declaration//GEN-END:variables
}
