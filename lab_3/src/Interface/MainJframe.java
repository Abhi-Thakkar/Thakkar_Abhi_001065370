/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import PersonProfile.Address;
import PersonProfile.PersonDetails;
/**
 *
 * @author Abhi
 */
public class MainJframe extends javax.swing.JFrame {
    
    PersonDetails PersonA=new PersonDetails();
    Address workaddress=new Address();
    Address homeaddress=new Address();
    Address localaddress=new Address();

    /**
     * Creates new form MainJframe
     */
    public MainJframe() {
        initComponents();
        displaydetails();
        displayhomeaddress();
        displayworkaddress();
        displaylocaladdress();
    }
    
        public void displaydetails(){
        String firstname=new String("Abhi");
        PersonA.setFirstname(firstname);
       // System.out.println(PersonA.getFirstname());
         firstnametextfield.setText(PersonA.getFirstname());
        
        String lastname=new String("Thakkar");
        PersonA.setLastname(lastname);
        //System.out.println(PersonA.getLastname());
         lastnametextfield.setText(PersonA.getLastname());
        
        String Dateofbirth=new String("01/01/1997");
        PersonA.setDateofbirth(Dateofbirth);
        //System.out.println(PersonA.getDateofbirth());
          dobtextfield.setText(PersonA.getDateofbirth());
          
          String Streetaddress=new String("11/a akshar dham society");
          PersonA.setStreetaddress(Streetaddress);
          addresstextfield.setText(PersonA.getStreetaddress());
    
 
    }
        public void displayhomeaddress(){
        String homeaddress1=new String("11/A Akshardham Soc");
        homeaddress.setStreetline1(homeaddress1);
        homeaddressstreetline1textfield.setText(homeaddress.getStreetline1());
     
        String homeaddress2=new String("old ahmedabad road");
        homeaddress.setStreetline2(homeaddress2);
        homeaddressstreetline2textfield.setText(homeaddress.getStreetline2());
        
        String city=new String("Ahmedabad");
        homeaddress.setCity(city);
        homeaddresscitytextfield.setText(homeaddress.getCity());
        
        String state=new String("gujarat");
        homeaddress.setState(state);
        homeaddressstatetextfield.setText(homeaddress.getState());
        
        String pincode=new String("382425");
        homeaddress.setPincode(pincode);
        homeaddresszipcodetextfield.setText(homeaddress.getPincode());
        
        String country=new String("India");
        homeaddress.setCountry(country);
        homeaddresscountrytextfield.setText(homeaddress.getCountry());
        
        PersonA.setHomeaddress(homeaddress);
       
    }
        public void displayworkaddress(){
            
        String workaddress1=new String("Abc");
        workaddress.setStreetline1(workaddress1);
        workaddressstreetline1textfield.setText(workaddress.getStreetline1());
        
        String workaddress2=new String("Xyz");
        workaddress.setStreetline2(workaddress2);
        workaddressstreetline2textfield.setText(workaddress.getStreetline2());
        
        String city=new String("Ahmedabad");
        workaddress.setCity(city);
        workaddresscitytextfield.setText(workaddress.getCity());
        
        String state=new String("gujarat");
        workaddress.setState(state);
        workaddressstatetextfield.setText(workaddress.getState());
        
        String pincode=new String("1234");
        workaddress.setPincode(pincode);
        workaddresszipcodetextfield.setText(workaddress.getPincode());
        
        String country=new String("India");
        workaddress.setCountry(country);
        workaddresscountrytextfield.setText(workaddress.getCountry());
        PersonA.setWorkaddress(workaddress);
        
    }

    public void displaylocaladdress(){
        String localaddress1=new String("XYZ");
        localaddress.setStreetline1(localaddress1);
        localaddressstreetline1textfield.setText(localaddress.getStreetline1());
        
        String localaddress2=new String("ABC");
        localaddress.setStreetline2(localaddress2);
        localaddressstreetline2textfield.setText(localaddress.getStreetline2());
        
        String city=new String("Boston");
        localaddress.setCity(city);
        localaddresscitytextfield.setText(localaddress.getCity());
        
        String state=new String("MA");
        localaddress.setState(state);
        localaddressstatetextfield.setText(localaddress.getState());
        
        String pincode=new String("4321");
        localaddress.setPincode(pincode);
        localaddresszipcodetextfield.setText(localaddress.getPincode());
        
        String country=new String("United States");
        localaddress.setCountry(country);
        localaddresscountrytextfield.setText(localaddress.getCountry());
        
        PersonA.setLocaladdress(localaddress);
        //System.out.println(PersonA.localaddress.getAddress1());
        //System.out.println(PersonA.localaddress.getAddress2());
        //System.out.println(PersonA.localaddress.getCity());
        //System.out.println(PersonA.localaddress.getState());
        //System.out.println(PersonA.localaddress.getPincode());
        //System.out.println(PersonA.localaddress.getCountry());
    
    }
    
    
/*
    
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FirstnameJlabel = new javax.swing.JLabel();
        Lastnamelabel = new javax.swing.JLabel();
        Addresslabel = new javax.swing.JLabel();
        Doblabel = new javax.swing.JLabel();
        firstnametextfield = new javax.swing.JTextField();
        lastnametextfield = new javax.swing.JTextField();
        addresstextfield = new javax.swing.JTextField();
        dobtextfield = new javax.swing.JTextField();
        workaddresspanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        workaddressstreetline1textfield = new javax.swing.JTextField();
        workaddressstreetline2textfield = new javax.swing.JTextField();
        workaddresscitytextfield = new javax.swing.JTextField();
        workaddressstatetextfield = new javax.swing.JTextField();
        workaddresszipcodetextfield = new javax.swing.JTextField();
        workaddresscountrytextfield = new javax.swing.JTextField();
        localaddresspanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        localaddressstreetline1textfield = new javax.swing.JTextField();
        localaddressstreetline2textfield = new javax.swing.JTextField();
        localaddresscitytextfield = new javax.swing.JTextField();
        localaddressstatetextfield = new javax.swing.JTextField();
        localaddresszipcodetextfield = new javax.swing.JTextField();
        localaddresscountrytextfield = new javax.swing.JTextField();
        homeaddresspanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        homeaddressstreetline1textfield = new javax.swing.JTextField();
        homeaddressstreetline2textfield = new javax.swing.JTextField();
        homeaddresscitytextfield = new javax.swing.JTextField();
        homeaddressstatetextfield = new javax.swing.JTextField();
        homeaddresszipcodetextfield = new javax.swing.JTextField();
        homeaddresscountrytextfield = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 204));

        FirstnameJlabel.setText("First Name");

        Lastnamelabel.setText("Last Name");

        Addresslabel.setText("Street Address");

        Doblabel.setText("DOB(mm/dd/yyyy)");

        addresstextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresstextfieldActionPerformed(evt);
            }
        });

        workaddresspanel.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("WorkAddress");

        jLabel4.setText("Street Line:1");

        jLabel5.setText("Street Line:2");

        jLabel6.setText("City:");

        jLabel7.setText("State");

        jLabel8.setText("Zip Code:");

        jLabel9.setText("Country:");

        workaddressstreetline2textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workaddressstreetline2textfieldActionPerformed(evt);
            }
        });

        workaddresscitytextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workaddresscitytextfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout workaddresspanelLayout = new javax.swing.GroupLayout(workaddresspanel);
        workaddresspanel.setLayout(workaddresspanelLayout);
        workaddresspanelLayout.setHorizontalGroup(
            workaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workaddresspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(workaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(workaddresspanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(workaddressstreetline1textfield))
                    .addComponent(jLabel1)
                    .addGroup(workaddresspanelLayout.createSequentialGroup()
                        .addGroup(workaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(workaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(workaddresszipcodetextfield)
                            .addComponent(workaddresscitytextfield)
                            .addComponent(workaddressstatetextfield)
                            .addComponent(workaddressstreetline2textfield)
                            .addComponent(workaddresscountrytextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        workaddresspanelLayout.setVerticalGroup(
            workaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workaddresspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(workaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(workaddressstreetline1textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(workaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(workaddressstreetline2textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(workaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(workaddresscitytextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(workaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(workaddressstatetextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(workaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(workaddresszipcodetextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(workaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(workaddresscountrytextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        localaddresspanel.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("LocalAddress");

        jLabel11.setText("Street Line:1");

        jLabel12.setText("Street Line:2");

        jLabel13.setText("City:");

        jLabel14.setText("State");

        jLabel15.setText("Zip Code:");

        jLabel16.setText("Country:");

        localaddressstreetline2textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localaddressstreetline2textfieldActionPerformed(evt);
            }
        });

        localaddresscitytextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localaddresscitytextfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout localaddresspanelLayout = new javax.swing.GroupLayout(localaddresspanel);
        localaddresspanel.setLayout(localaddresspanelLayout);
        localaddresspanelLayout.setHorizontalGroup(
            localaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(localaddresspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(localaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(localaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(localaddresspanelLayout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(localaddressstreetline1textfield))
                        .addGroup(localaddresspanelLayout.createSequentialGroup()
                            .addGroup(localaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15)
                                .addComponent(jLabel16))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(localaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(localaddresszipcodetextfield)
                                .addComponent(localaddresscitytextfield)
                                .addComponent(localaddressstatetextfield)
                                .addComponent(localaddressstreetline2textfield)
                                .addComponent(localaddresscountrytextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        localaddresspanelLayout.setVerticalGroup(
            localaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(localaddresspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(localaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(localaddressstreetline1textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(localaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(localaddressstreetline2textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(localaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(localaddresscitytextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(localaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(localaddressstatetextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(localaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(localaddresszipcodetextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(localaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(localaddresscountrytextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        homeaddresspanel.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("HomeAddress");

        jLabel17.setText("Street Line:1");

        jLabel18.setText("Street Line:2");

        jLabel19.setText("City:");

        jLabel20.setText("State");

        jLabel21.setText("Zip Code:");

        jLabel22.setText("Country:");

        homeaddressstreetline2textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeaddressstreetline2textfieldActionPerformed(evt);
            }
        });

        homeaddresscitytextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeaddresscitytextfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homeaddresspanelLayout = new javax.swing.GroupLayout(homeaddresspanel);
        homeaddresspanel.setLayout(homeaddresspanelLayout);
        homeaddresspanelLayout.setHorizontalGroup(
            homeaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeaddresspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homeaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(homeaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(homeaddresspanelLayout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(homeaddressstreetline1textfield))
                        .addGroup(homeaddresspanelLayout.createSequentialGroup()
                            .addGroup(homeaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18)
                                .addComponent(jLabel19)
                                .addComponent(jLabel20)
                                .addComponent(jLabel21)
                                .addComponent(jLabel22))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(homeaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(homeaddresszipcodetextfield)
                                .addComponent(homeaddresscitytextfield)
                                .addComponent(homeaddressstatetextfield)
                                .addComponent(homeaddressstreetline2textfield)
                                .addComponent(homeaddresscountrytextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        homeaddresspanelLayout.setVerticalGroup(
            homeaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeaddresspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(homeaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(homeaddressstreetline1textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(homeaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(homeaddressstreetline2textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(homeaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(homeaddresscitytextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(homeaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(homeaddressstatetextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(homeaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(homeaddresszipcodetextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(homeaddresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(homeaddresscountrytextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        jLabel10.setText("PERSON PROFILE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FirstnameJlabel)
                                    .addComponent(Lastnamelabel)
                                    .addComponent(Addresslabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lastnametextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                            .addComponent(firstnametextfield))
                                        .addGap(109, 109, 109)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Doblabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dobtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(addresstextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(workaddresspanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(localaddresspanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(homeaddresspanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel10)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstnameJlabel)
                    .addComponent(firstnametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Doblabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lastnamelabel)
                    .addComponent(lastnametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Addresslabel)
                    .addComponent(addresstextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(localaddresspanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeaddresspanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(workaddresspanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addresstextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresstextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresstextfieldActionPerformed

    private void workaddressstreetline2textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workaddressstreetline2textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workaddressstreetline2textfieldActionPerformed

    private void workaddresscitytextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workaddresscitytextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workaddresscitytextfieldActionPerformed

    private void localaddressstreetline2textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localaddressstreetline2textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localaddressstreetline2textfieldActionPerformed

    private void localaddresscitytextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localaddresscitytextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localaddresscitytextfieldActionPerformed

    private void homeaddressstreetline2textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeaddressstreetline2textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeaddressstreetline2textfieldActionPerformed

    private void homeaddresscitytextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeaddresscitytextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeaddresscitytextfieldActionPerformed

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
    private javax.swing.JLabel Addresslabel;
    private javax.swing.JLabel Doblabel;
    private javax.swing.JLabel FirstnameJlabel;
    private javax.swing.JLabel Lastnamelabel;
    private javax.swing.JTextField addresstextfield;
    private javax.swing.JTextField dobtextfield;
    private javax.swing.JTextField firstnametextfield;
    private javax.swing.JTextField homeaddresscitytextfield;
    private javax.swing.JTextField homeaddresscountrytextfield;
    private javax.swing.JPanel homeaddresspanel;
    private javax.swing.JTextField homeaddressstatetextfield;
    private javax.swing.JTextField homeaddressstreetline1textfield;
    private javax.swing.JTextField homeaddressstreetline2textfield;
    private javax.swing.JTextField homeaddresszipcodetextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastnametextfield;
    private javax.swing.JTextField localaddresscitytextfield;
    private javax.swing.JTextField localaddresscountrytextfield;
    private javax.swing.JPanel localaddresspanel;
    private javax.swing.JTextField localaddressstatetextfield;
    private javax.swing.JTextField localaddressstreetline1textfield;
    private javax.swing.JTextField localaddressstreetline2textfield;
    private javax.swing.JTextField localaddresszipcodetextfield;
    private javax.swing.JTextField workaddresscitytextfield;
    private javax.swing.JTextField workaddresscountrytextfield;
    private javax.swing.JPanel workaddresspanel;
    private javax.swing.JTextField workaddressstatetextfield;
    private javax.swing.JTextField workaddressstreetline1textfield;
    private javax.swing.JTextField workaddressstreetline2textfield;
    private javax.swing.JTextField workaddresszipcodetextfield;
    // End of variables declaration//GEN-END:variables
}
