/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import business.Product;
import business.productDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Abhi
 */
public class viewproductJPanel extends javax.swing.JPanel {
    private JPanel userprocesscontainer;
    private Product product;
    //private manageproductJPanel m=new manageproductJPanel(userprocesscontainer, null);
   
    /**
     * Creates new form viewproductJPanel
     */
    
    viewproductJPanel(JPanel userprocesscontainer, Product product) {
        initComponents();
         this.userprocesscontainer= userprocesscontainer;
        this.product = product;
        populateproductdetails();
        savejButton.setEnabled(false);
        updatejButton.setEnabled(true);
        
    }
    private void populateproductdetails(){
        productnamejTextField.setText(product.getProductName());
        availiblityjTextField.setText(String.valueOf(product.getAvailnumber()));
        pricejTextField.setText(String.valueOf(product.getPrice()));
        descriptionjTextField.setText(product.getDescription());
        productnamejTextField.setEditable(false);
        availiblityjTextField.setEditable(false);
        pricejTextField.setEditable(false);
        descriptionjTextField.setEditable(false);
        
        
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
        jLabel2 = new javax.swing.JLabel();
        productnamejTextField = new javax.swing.JTextField();
        availiblityjTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pricejTextField = new javax.swing.JTextField();
        descriptionjTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        backjButton = new javax.swing.JButton();
        savejButton = new javax.swing.JButton();
        updatejButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIEW PRODUCT");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText(" PRODUCT NAME*:");

        productnamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productnamejTextFieldActionPerformed(evt);
            }
        });

        availiblityjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availiblityjTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("AVAILIBLITY*:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("PRICE*:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("DESCRIPTION:");

        backjButton.setText("< BACK");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        savejButton.setText("SAVE");
        savejButton.setEnabled(false);
        savejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savejButtonActionPerformed(evt);
            }
        });

        updatejButton.setText("UPDATE");
        updatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatejButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(savejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(updatejButton)
                .addContainerGap(215, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(100, 100, 100)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(availiblityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(productnamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pricejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(descriptionjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 210, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savejButton)
                    .addComponent(updatejButton))
                .addGap(123, 123, 123))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(35, 35, 35)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(productnamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(availiblityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(pricejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(descriptionjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(133, 133, 133)
                    .addComponent(backjButton)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void availiblityjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availiblityjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availiblityjTextFieldActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        userprocesscontainer.remove(this);
        CardLayout layout =(CardLayout) userprocesscontainer.getLayout();
        
        Component[] comps = userprocesscontainer.getComponents();
        for(Component comp : comps)
        {
            if(comp instanceof manageproductJPanel)
            {
                manageproductJPanel panel = (manageproductJPanel)comp;
                panel.populateTable();
            }
        }
         
        //m.populateTable();
        layout.previous(userprocesscontainer);
        
        
    }//GEN-LAST:event_backjButtonActionPerformed

    private void updatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatejButtonActionPerformed
        // TODO add your handling code here:
        productnamejTextField.setEditable(true);
        availiblityjTextField.setEditable(true);
        pricejTextField.setEditable(true);
        descriptionjTextField.setEditable(true);
        savejButton.setEnabled(true);
         updatejButton.setEnabled(false);
    }//GEN-LAST:event_updatejButtonActionPerformed

    private void savejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savejButtonActionPerformed
        // TODO add your handling code here:
        
        
        
        String productName; 
        double price; 
        int availnumber; 
        
        String description = new String();
        try {
            productName=productnamejTextField.getText();
            if(productName==null || productName.isEmpty()){
                
                throw new NullPointerException("NO name entered"); 
                
          }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Product name is empty");
            return;
        }
        try{
            description=descriptionjTextField.getText();
            if(description==null || description.isEmpty()){
                throw new NullPointerException("No description entered");
            }
            
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Description is empty");
            
        }
        try
           {
               availnumber=Integer.parseInt(availiblityjTextField.getText());
           }
           catch(NumberFormatException e)
           {
                JOptionPane.showMessageDialog(null,"please enter valid availability");
                return;
           }
        try
            {
                price=Double.parseDouble(pricejTextField.getText());
            }
            catch(NumberFormatException e)
            {
              //  e.printStackTrace();
                JOptionPane.showMessageDialog(null,"please enter valid price");
                return;
            }
        
        
        
        
        JOptionPane.showMessageDialog(null,"Product Updated successfully");
        
        
        
        product.setProductName(productnamejTextField.getText());
        product.setDescription(descriptionjTextField.getText());
        product.setAvailnumber(Integer.parseInt(availiblityjTextField.getText()));
        product.setPrice(Double.parseDouble(pricejTextField.getText()));
        
      //  availiblityjTextField.setText(String.valueOf(product.getAvailnumber()));
      //  product.setDescription(descriptionjTextField.getText());
     //   pricejTextField.setText(String.valueOf(product.getPrice()));
       
       
        
       productnamejTextField.setText(product.getProductName());
        availiblityjTextField.setText(String.valueOf(product.getAvailnumber()));
        pricejTextField.setText(String.valueOf(product.getPrice()));
        descriptionjTextField.setText(product.getDescription());
        //populateproductdetails(); 
        
        
        
        
        
        
        
        productnamejTextField.setEditable(false);
        availiblityjTextField.setEditable(false);
        pricejTextField.setEditable(false);
        descriptionjTextField.setEditable(false);
        savejButton.setEnabled(false);
        updatejButton.setEnabled(true);
        
        
        
        
        
    }//GEN-LAST:event_savejButtonActionPerformed

    private void productnamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productnamejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productnamejTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availiblityjTextField;
    private javax.swing.JButton backjButton;
    private javax.swing.JTextField descriptionjTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField pricejTextField;
    private javax.swing.JTextField productnamejTextField;
    private javax.swing.JButton savejButton;
    private javax.swing.JButton updatejButton;
    // End of variables declaration//GEN-END:variables
}
