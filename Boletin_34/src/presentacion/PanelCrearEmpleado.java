/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package presentacion;

import datos.ListaEmpleados;
import entidades.*;
import java.io.File;
import java.util.GregorianCalendar;
import javax.swing.JPanel;

/**
 *
 * @author Jorge_Gonzalez
 */
public class PanelCrearEmpleado extends javax.swing.JPanel {
    ListaEmpleados lista = new ListaEmpleados();
    EContratado contratado;
    EDestajo destajado;
    String DNI, nombre, apellidos;
    int ano, mes, dia, nClientes;
    float soldo, complemento;
    GregorianCalendar calendario;
    
    File fileContratado,fileDestajo;
    
    JPanel panel;
    
    GUI ventana;
    
    /**
     * Creates new form panel2
     */
    public PanelCrearEmpleado() {
        initComponents();
        eDestajo.setVisible(false);
        lDestajo.setVisible(false);
        eError.setVisible(false);
        
    }

    public void recogerFile(File f, File e){
        this.fileContratado = f;
        this.fileDestajo = e;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboEmpleado = new javax.swing.JComboBox<>();
        eEmpleado = new javax.swing.JLabel();
        lNombre = new javax.swing.JTextField();
        eNombre = new javax.swing.JLabel();
        lApellidos = new javax.swing.JTextField();
        eApellidos = new javax.swing.JLabel();
        eCambia = new javax.swing.JLabel();
        lCambia = new javax.swing.JTextField();
        bEngadir = new javax.swing.JButton();
        eNombre2 = new javax.swing.JLabel();
        lDNI = new javax.swing.JTextField();
        eFecha = new javax.swing.JLabel();
        lAno = new javax.swing.JTextField();
        eAno = new javax.swing.JLabel();
        eMes = new javax.swing.JLabel();
        lMes = new javax.swing.JTextField();
        eDia = new javax.swing.JLabel();
        lDia = new javax.swing.JTextField();
        lDestajo = new javax.swing.JTextField();
        eDestajo = new javax.swing.JLabel();
        bVolver = new javax.swing.JButton();
        eError = new javax.swing.JLabel();

        comboEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contratado", "Destajo" }));
        comboEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEmpleadoActionPerformed(evt);
            }
        });

        eEmpleado.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        eEmpleado.setText("¿Qué tipo de empleado quieres añadir?");

        lNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNombreActionPerformed(evt);
            }
        });

        eNombre.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        eNombre.setText("¿Cuál es su nombre?");

        lApellidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lApellidosActionPerformed(evt);
            }
        });

        eApellidos.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        eApellidos.setText("¿Cuál son sus apellidos?");

        eCambia.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        eCambia.setText("¿Cuál es su sueldo básico?");

        lCambia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lCambia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lCambiaActionPerformed(evt);
            }
        });

        bEngadir.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        bEngadir.setText("Añadir empleado");
        bEngadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEngadirActionPerformed(evt);
            }
        });

        eNombre2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        eNombre2.setText("¿Cuál es su DNI?");

        lDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lDNIActionPerformed(evt);
            }
        });

        eFecha.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        eFecha.setText("¿Fecha de entrada?");

        lAno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lAnoActionPerformed(evt);
            }
        });

        eAno.setText("Año");

        eMes.setText("Mes");

        lMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lMesActionPerformed(evt);
            }
        });

        eDia.setText("Dia");

        lDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lDiaActionPerformed(evt);
            }
        });

        lDestajo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lDestajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lDestajoActionPerformed(evt);
            }
        });

        eDestajo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        eDestajo.setText("¿Cuál es su complemento?");

        bVolver.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        bVolver.setText("VOLVER");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });

        eError.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        eError.setForeground(new java.awt.Color(255, 51, 0));
        eError.setText("Por favor rellene todos los huecos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eNombre2)
                    .addComponent(lDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(eFecha))
                            .addComponent(lNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(eNombre)
                        .addGap(87, 87, 87))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(comboEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(eEmpleado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eCambia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eDestajo))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eApellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(lApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(eAno))
                                    .addComponent(lAno, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lMes, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(eMes)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(eDia))
                                    .addComponent(lDia, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lCambia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lDestajo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)))
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(bEngadir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(bVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(eError)))
                .addGap(0, 193, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(eError)
                .addGap(18, 18, 18)
                .addComponent(eEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eNombre2)
                        .addGap(18, 18, 18)
                        .addComponent(lDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eApellidos)
                        .addGap(18, 18, 18)
                        .addComponent(lApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eFecha)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lMes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(eAno)
                                    .addComponent(eMes))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eDia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lDia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eDestajo)
                    .addComponent(eCambia))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDestajo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCambia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEngadir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void comboEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEmpleadoActionPerformed
        if(comboEmpleado.getSelectedIndex()==0){
            eCambia.setText("¿Cuál es su sueldo básico?");
            eDestajo.setVisible(false);
            lDestajo.setVisible(false);
        }
        else{
            eCambia.setText("¿Cuántos clientes tiene captado?");
            eDestajo.setVisible(true);
            lDestajo.setVisible(true);
        }
    }//GEN-LAST:event_comboEmpleadoActionPerformed

    private void lNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNombreActionPerformed

    private void lApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lApellidosActionPerformed

    private void lCambiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lCambiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lCambiaActionPerformed

    private void lDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lDNIActionPerformed

    private void lAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lAnoActionPerformed

    private void lMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lMesActionPerformed

    private void lDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lDiaActionPerformed

    private void lDestajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lDestajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lDestajoActionPerformed

    private void bEngadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEngadirActionPerformed
        eError.setVisible(false);
        //EContratado
        if(comboEmpleado.getSelectedIndex()==0){
            if(!lDNI.getText().equals("") && !lNombre.getText().equals("") && !lApellidos.getText().equals("") && !lAno.getText().equals("") && !lMes.getText().equals("") && !lDia.getText().equals("") && !lCambia.getText().equals("")){
                darValoresVariables();
                try{
                    soldo = (float) Float.parseFloat(lCambia.getText());
                                        
                }catch(Exception e){
                    eError.setText("El sueldo tiene que ser un numero");
                    eError.setVisible(true);
                }
                calendario = new GregorianCalendar(ano,mes,dia);
                contratado = new EContratado(DNI,nombre,apellidos,calendario,soldo);
                    
                lista.engadirEmpleadoContratado(fileContratado, contratado);
                vaciarCampos();
            }
            else{
                eError.setText("¡Por favor, rellene todos los campos!");
                eError.setVisible(true);
                
            }
        }
        //EDestajo
        else{
            if(!lDNI.getText().equals("") && !lNombre.getText().equals("") && !lApellidos.getText().equals("") && !lAno.getText().equals("") && !lMes.getText().equals("") && !lDia.getText().equals("") && !lCambia.getText().equals("") && !lDestajo.getText().equals("")){
                darValoresVariables();
                try{
                    nClientes = Integer.parseInt(lCambia.getText());
                    complemento = Float.parseFloat(lDestajo.getText());                    
                }catch(Exception e){
                    eError.setVisible(true);
                    eError.setText("El numero de clientes o el complemento tienen que ser numeros");
                }
                calendario = new GregorianCalendar(ano,mes,dia);
                destajado = new EDestajo(DNI,nombre,apellidos,calendario,nClientes,complemento);
                    
                lista.engadirEmpleadoDestajado(fileDestajo, destajado);
                vaciarCampos();
            }
            else{
                eError.setVisible(true);
                eError.setText("¡Por favor, rellene todos los campos!");
            }
        }
    }//GEN-LAST:event_bEngadirActionPerformed

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        this.setVisible(false);
        panel.setVisible(true);
    }//GEN-LAST:event_bVolverActionPerformed

    public void recogerPanelInicio(JPanel panel){
        this.panel=panel;
    }
    
    private void vaciarCampos(){
        lAno.setText("");
        lMes.setText("");
        lDia.setText("");
        lNombre.setText("");
        lDNI.setText("");
        lApellidos.setText("");
        lCambia.setText("");
        lDestajo.setText("");
    }
    
    private void darValoresVariables(){
        DNI = lDNI.getText();
        nombre = lNombre.getText();
        apellidos = lApellidos.getText();
        try{
            ano = Integer.parseInt(lAno.getText());
            mes = Integer.parseInt(lMes.getText());
            dia = Integer.parseInt(lDia.getText());
        }catch(Exception e){
            eError.setText("¡La fecha no puede tener ni letra ni comas ni puntos!");
            eError.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEngadir;
    private javax.swing.JButton bVolver;
    private javax.swing.JComboBox<String> comboEmpleado;
    private javax.swing.JLabel eAno;
    private javax.swing.JLabel eApellidos;
    private javax.swing.JLabel eCambia;
    private javax.swing.JLabel eDestajo;
    private javax.swing.JLabel eDia;
    private javax.swing.JLabel eEmpleado;
    private javax.swing.JLabel eError;
    private javax.swing.JLabel eFecha;
    private javax.swing.JLabel eMes;
    private javax.swing.JLabel eNombre;
    private javax.swing.JLabel eNombre2;
    private javax.swing.JTextField lAno;
    private javax.swing.JTextField lApellidos;
    private javax.swing.JTextField lCambia;
    private javax.swing.JTextField lDNI;
    private javax.swing.JTextField lDestajo;
    private javax.swing.JTextField lDia;
    private javax.swing.JTextField lMes;
    private javax.swing.JTextField lNombre;
    // End of variables declaration//GEN-END:variables
}