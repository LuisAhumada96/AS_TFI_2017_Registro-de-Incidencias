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
public class IncidenciaExt extends javax.swing.JFrame {
 public static final String ACEPTAR_Ext="boton aceptar incidencia externa";
    /**
     * Creates new form IncidenciaInt
     */
    public IncidenciaExt() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Nueva incidencia externa");
    }
    public Image getIconImage(){
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono.png"));
    return retValue;
    }


    public void ejecutar(){
     setVisible(true);
    
    }
    public void setControlador(Controlador control){
        jButtonAceptar1.setActionCommand(ACEPTAR_Ext);
        jButtonAceptar1.addActionListener(control);
    }
public static boolean siNo() {
    if (JOptionPane.showConfirmDialog(null, "¿Desea guardar nueva incidenca?","Se han validado los datos",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        return true;
    } 
    else {
        return false;
        }
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCancelar1 = new javax.swing.JButton();
        jButtonAceptar1 = new javax.swing.JButton();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTextSol1 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextDesc = new javax.swing.JTextArea();
        jComboBoxLugar1 = new javax.swing.JComboBox<>();
        jLabelFechaDMA = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelTicket = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jTextFieldUsuario1 = new javax.swing.JTextField();
        jComboBoxTipo1 = new javax.swing.JComboBox<>();
        jLabelNuevaIncidencia = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jLabelSol = new javax.swing.JLabel();
        jLabelDescrip = new javax.swing.JLabel();
        jComboBoxEstado1 = new javax.swing.JComboBox<>();
        jLabelLugar = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldDia1 = new javax.swing.JTextField();
        jTextFieldMes1 = new javax.swing.JTextField();
        jTextFieldAnio1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelFondoIncidenciaExt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCancelar1.setBackground(new java.awt.Color(0, 0, 204));
        jButtonCancelar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCancelar1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar1.setText("Cancelar");
        jButtonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 100, 30));

        jButtonAceptar1.setBackground(new java.awt.Color(0, 0, 204));
        jButtonAceptar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonAceptar1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAceptar1.setText("Guardar");
        jButtonAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 100, 30));

        jTextSol1.setColumns(20);
        jTextSol1.setRows(5);
        jScrollPane21.setViewportView(jTextSol1);

        getContentPane().add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 170, 150));

        jTextDesc.setColumns(20);
        jTextDesc.setRows(5);
        jScrollPane11.setViewportView(jTextDesc);

        getContentPane().add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 170, 150));

        jComboBoxLugar1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SUCURSAL 1", "SUCURSAL 2", "SUCURSAL 3", "SUCURSAL 4", "SUCURSAL 5", "SUCURSAL 6", "SUCURSAL 7", "SUCURSAL 8", "SUCURSAL 9", "SUCURSAL 10", "SUCURSAL 11", "SUCURSAL 12", "SUCURSAL 13", "SUCURSAL 14", "SUCURSAL 15", "SUCURSAL 16", "SUCURSAL 17", "SUCURSAL 18", "SUCURSAL 19", "SUCURSAL 20", "SUCURSAL 21", "SUCURSAL 22", "SUCURSAL 23", "SUCURSAL 24", "SUCURSAL 25", "SUCURSAL 26" }));
        jComboBoxLugar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLugar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxLugar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 110, -1));

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
        getContentPane().add(jTextFieldUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 90, -1));

        jComboBoxTipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nivel 1", "Nivel 2" }));
        jComboBoxTipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipo1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxTipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 70, -1));

        jLabelNuevaIncidencia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelNuevaIncidencia.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNuevaIncidencia.setText("Número:");
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

        jComboBoxEstado1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RESUELTA", "PENDIENTE" }));
        jComboBoxEstado1.setToolTipText("");
        jComboBoxEstado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstado1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxEstado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 110, -1));

        jLabelLugar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelLugar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLugar.setText("Lugar:");
        getContentPane().add(jLabelLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabelUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuario:");
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 20));

        jTextFieldDia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDia1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 20, -1));

        jTextFieldMes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMes1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 20, -1));

        jTextFieldAnio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnio1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAnio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 50, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Incidencia.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabelFondoIncidenciaExt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        getContentPane().add(jLabelFondoIncidenciaExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptar1ActionPerformed
        
    }//GEN-LAST:event_jButtonAceptar1ActionPerformed

    private void jButtonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelar1ActionPerformed

    private void jComboBoxLugar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLugar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLugar1ActionPerformed

    private void jComboBoxTipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipo1ActionPerformed

    private void jTextFieldDia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDia1ActionPerformed

    private void jTextFieldAnio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAnio1ActionPerformed

    private void jTextFieldMes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMes1ActionPerformed

    private void jComboBoxEstado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEstado1ActionPerformed

        public String getLugar(){
    return jComboBoxLugar1.getSelectedItem().toString();
    }
    public boolean getEstado(){
        if(jComboBoxEstado1.getSelectedItem().toString()=="RESUELTA"){
        return true;
        }
        else
        {
        return false;
        }
    }
    public int getDia(){
    return Integer.parseInt(jTextFieldDia1.getText());
    }
    public int getMes(){
    return Integer.parseInt(jTextFieldMes1.getText());
    }
    public int getAnio(){
    return Integer.parseInt(jTextFieldAnio1.getText());
    }
    public String getUsuario(){
    return jTextFieldUsuario1.getText();
    }
    public int getTipo(){
        
        String aux;
        aux = jComboBoxTipo1.getSelectedItem().toString();
        
        if(aux == "Nivel 1"){return 1;}
        else{return 2;}
    }
    public String getDes(){
    return jTextDesc.getText();
    }
    public String getSol(){
    return jTextSol1.getText();
    }
    
    public void setNum(int num){
        jLabelNuevaIncidencia.setText("Número: " + num);
    }
    
    
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar1;
    private javax.swing.JButton jButtonCancelar1;
    private javax.swing.JComboBox<String> jComboBoxEstado1;
    private javax.swing.JComboBox<String> jComboBoxLugar1;
    private javax.swing.JComboBox<String> jComboBoxTipo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDescrip;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelFechaDMA;
    private javax.swing.JLabel jLabelFondoIncidenciaExt;
    private javax.swing.JLabel jLabelLugar;
    private javax.swing.JLabel jLabelNuevaIncidencia;
    private javax.swing.JLabel jLabelSol;
    private javax.swing.JLabel jLabelTicket;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JTextArea jTextDesc;
    private javax.swing.JTextField jTextFieldAnio1;
    private javax.swing.JTextField jTextFieldDia1;
    private javax.swing.JTextField jTextFieldMes1;
    private javax.swing.JTextField jTextFieldUsuario1;
    private javax.swing.JTextArea jTextSol1;
    // End of variables declaration//GEN-END:variables
}
