/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Profile.Product;

/**
 *
 * @author Abhi
 */
public class MainJframe extends javax.swing.JFrame {

    /**
     * Creates new form MainJframe
     */
    private Product product;
    public MainJframe() {
        initComponents();
        product=new Product();
        
           }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        CrontrolJpanel = new javax.swing.JPanel();
        CreateJbutton = new javax.swing.JButton();
        VeiwJbutton = new javax.swing.JButton();
        DisplayJpanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CrontrolJpanel.setBackground(new java.awt.Color(204, 204, 204));

        CreateJbutton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        CreateJbutton.setText("CREATE");
        CreateJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateJbuttonActionPerformed(evt);
            }
        });

        VeiwJbutton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        VeiwJbutton.setText("VIEW");
        VeiwJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VeiwJbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CrontrolJpanelLayout = new javax.swing.GroupLayout(CrontrolJpanel);
        CrontrolJpanel.setLayout(CrontrolJpanelLayout);
        CrontrolJpanelLayout.setHorizontalGroup(
            CrontrolJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrontrolJpanelLayout.createSequentialGroup()
                .addGroup(CrontrolJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(VeiwJbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CreateJbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        CrontrolJpanelLayout.setVerticalGroup(
            CrontrolJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrontrolJpanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(CreateJbutton)
                .addGap(31, 31, 31)
                .addComponent(VeiwJbutton)
                .addContainerGap(4740, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(CrontrolJpanel);

        DisplayJpanel.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout DisplayJpanelLayout = new javax.swing.GroupLayout(DisplayJpanel);
        DisplayJpanel.setLayout(DisplayJpanelLayout);
        DisplayJpanelLayout.setHorizontalGroup(
            DisplayJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 944, Short.MAX_VALUE)
        );
        DisplayJpanelLayout.setVerticalGroup(
            DisplayJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4898, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(DisplayJpanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateJbuttonActionPerformed
        // TODO add your handling code here:
        CreateJpanel CreateJpanel=new CreateJpanel(product);
        jSplitPane1.setRightComponent(CreateJpanel);
    }//GEN-LAST:event_CreateJbuttonActionPerformed

    private void VeiwJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VeiwJbuttonActionPerformed
        // TODO add your handling code here:
        ViewJpanel ViewJpanel=new ViewJpanel(product);
        jSplitPane1.setRightComponent(ViewJpanel);
    }//GEN-LAST:event_VeiwJbuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateJbutton;
    private javax.swing.JPanel CrontrolJpanel;
    private javax.swing.JPanel DisplayJpanel;
    private javax.swing.JButton VeiwJbutton;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
