/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.VitalSignHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chief_kmv
 */
public class AbnormalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AbnormalJPanel
     */
    private VitalSignHistory vsh;
    private double maxbp;
    private double minbp;
    public AbnormalJPanel(VitalSignHistory vsh, double maxbp, double minbp) {
        initComponents();
        this.vsh = vsh;
        this.maxbp = maxbp;
        this.minbp = minbp;
        populateTable();
    }
    
      private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblVitalSigns.getModel();
        dtm.setRowCount(0);
        for(VitalSigns vs: vsh.getAbnormalList(maxbp,minbp) ){
        
            Object row[] = new Object[2];
            row[0]=vs;
            row[1]=vs.getBloodPressure();
            dtm.addRow(row);
            
        }
      }
       private void setFieldEnabled(boolean b){
        
        txtTemperature.setEnabled(b);
        txtBloodPressure.setEnabled(b);
        txtPulse.setEnabled(b);
        txtDate.setEnabled(b);
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVitalSigns = new javax.swing.JTable();
        txtTemperature = new javax.swing.JTextField();
        ViewDetails_Button = new javax.swing.JButton();
        Delete_Button = new javax.swing.JButton();
        txtBloodPressure = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Update_Button = new javax.swing.JButton();
        Confirm_Button = new javax.swing.JButton();

        tblVitalSigns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Blood Pressure"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVitalSigns);

        txtTemperature.setEnabled(false);

        ViewDetails_Button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ViewDetails_Button.setText("View Details");
        ViewDetails_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetails_ButtonActionPerformed(evt);
            }
        });

        Delete_Button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Delete_Button.setText("Delete");
        Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_ButtonActionPerformed(evt);
            }
        });

        txtBloodPressure.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Blood Pressure");

        txtPulse.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Pulse");

        txtDate.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Date");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Abnormal Vital Sign");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Temperature");

        Update_Button.setText("Update");
        Update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_ButtonActionPerformed(evt);
            }
        });

        Confirm_Button.setText("Confirm");
        Confirm_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(350, 350, 350)
                                .addComponent(jLabel1)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(320, 320, 320)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(ViewDetails_Button)
                                    .addGap(40, 40, 40)
                                    .addComponent(Delete_Button))
                                .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Update_Button)
                                .addComponent(Confirm_Button))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewDetails_Button)
                    .addComponent(Delete_Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(Update_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(Confirm_Button)
                .addGap(154, 154, 154))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 987, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ViewDetails_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetails_ButtonActionPerformed
        // TODO add your handling code here:
        int selectedrow = tblVitalSigns.getSelectedRow();
        if(selectedrow >= 0){
            VitalSigns vs = (VitalSigns)tblVitalSigns.getValueAt(selectedrow,0);
            txtBloodPressure.setText(String.valueOf(vs.getBloodPressure()));
            txtTemperature.setText(String.valueOf(vs.getTemperature()));
            txtPulse.setText(String.valueOf(vs.getPulse()));
            txtDate.setText(vs.getDate());
        }
        else
        JOptionPane.showMessageDialog(null,"select row");
    }//GEN-LAST:event_ViewDetails_ButtonActionPerformed

    private void Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_ButtonActionPerformed
        // TODO add your handling code here:
        int selectedrow = tblVitalSigns.getSelectedRow();
        if(selectedrow >= 0)
        {
            VitalSigns vs = (VitalSigns)tblVitalSigns.getValueAt(selectedrow,0);
            vsh.deleteVitals(vs);
            JOptionPane.showMessageDialog(null,"Abnormal sign deleted");
            populateTable();
        }

        else
        JOptionPane.showMessageDialog(null,"select row");
    }//GEN-LAST:event_Delete_ButtonActionPerformed

    private void Update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_ButtonActionPerformed
        // TODO add your handling code here:
        setFieldEnabled(true);
        Confirm_Button.setEnabled(true);

        int selectRow = tblVitalSigns.getSelectedRow();

        if(selectRow>=0){
            VitalSigns vs= (VitalSigns)tblVitalSigns.getValueAt(selectRow,0);

            txtTemperature.setText(vs.getTemperature()+"");
            txtBloodPressure.setText(vs.getBloodPressure()+"");
            txtPulse.setText(vs.getPulse()+"");
            txtDate.setText(vs.getDate());

        }
        else {
            JOptionPane.showMessageDialog(null,"Please select a row");
        }
    }//GEN-LAST:event_Update_ButtonActionPerformed

    private void Confirm_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm_ButtonActionPerformed
        // TODO add your handling code here:
        Confirm_Button.setEnabled(true);
        int selectRow = tblVitalSigns.getSelectedRow();
        if(selectRow>=0){

            VitalSigns vs = (VitalSigns)tblVitalSigns.getValueAt(selectRow,0);
            vs.setTemperature(Double.parseDouble(txtTemperature.getText()));
            vs.setBloodPressure(Double.parseDouble(txtBloodPressure.getText()));
            vs.setPulse(Integer.parseInt(txtPulse.getText()));
            vs.setDate(txtDate.getText());

            JOptionPane.showMessageDialog(null,"vital signs successfully updated");
            populateTable();
            setFieldEnabled(false);
            Confirm_Button.setEnabled(false);
        }
        else JOptionPane.showMessageDialog(null,"Please select a row");
    }//GEN-LAST:event_Confirm_ButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirm_Button;
    private javax.swing.JButton Delete_Button;
    private javax.swing.JButton Update_Button;
    private javax.swing.JButton ViewDetails_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVitalSigns;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}
