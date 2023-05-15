/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package presentacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jorge_Gonzalez
 */
public class PanelVerEmpleado extends javax.swing.JPanel {

    File fileContratado,fileDestajo;
    JPanel panel;
    Scanner sc;
    
    /**
     * Creates new form panel3
     */
    public PanelVerEmpleado() {
        initComponents();
    }
    
    public void recogerFile(File f, File e){
        this.fileContratado = f;
        this.fileDestajo = e;
    }
    
    public void recogerPanelInicio(JPanel panel){
        this.panel=panel;
    }
    
    public void crearTablaEContratado(File f){
        hacerTablas(f, tContratado,5);
    }
    
    public void crearTablaEDestajado(File f){
        hacerTablas(f, tDestajado,7);
    }
    
    public void hacerTablas(File f, JTable t, int columnas){
        Object fila[] = new Object[columnas];
        Object filaAux[] = new Object[columnas];
        DefaultTableModel model = (DefaultTableModel) t.getModel();
        int numAux;
        try{
            sc = new Scanner(f);
            while(sc.hasNextLine()){
                numAux=0;
                fila = sc.nextLine().split(", ");
                for(int i = 0; i < t.getRowCount(); i++){
                    for(int j = 0; j < t.getColumnCount(); j++){
                        filaAux[j] = t.getValueAt(i, j);
                    }
                    if(Arrays.equals(fila, filaAux)){
                        numAux=1;
                    }
                }
                if(numAux==0){
                    model.addRow(fila);
                }
            }
        }catch (FileNotFoundException ex){
            System.out.println("non se pode ler do ficheiro");
        }finally{
            sc.close();
        }
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
        tContratado = new javax.swing.JTable();
        bInicio = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tDestajado = new javax.swing.JTable();

        tContratado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Nombre", "Apellidos", "Ingreso", "Sueldo"
            }
        ));
        jScrollPane1.setViewportView(tContratado);

        bInicio.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        bInicio.setText("INICIO");
        bInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInicioActionPerformed(evt);
            }
        });

        bSalir.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        bSalir.setText("SALIR");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        tDestajado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Nombre", "Apellidos", "Ingreso", "Nº Clientes", "Compl.", "Sueldo"
            }
        ));
        jScrollPane2.setViewportView(tDestajado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(bInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInicioActionPerformed
        this.setVisible(false);
        panel.setVisible(true);
    }//GEN-LAST:event_bInicioActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bInicio;
    private javax.swing.JButton bSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tContratado;
    private javax.swing.JTable tDestajado;
    // End of variables declaration//GEN-END:variables
}
