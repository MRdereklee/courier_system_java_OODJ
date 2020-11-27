/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;


import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Khloe Lai
 */
public class Reportpage extends javax.swing.JFrame {
    Scanner sc;
    BufferedReader br;
    DefaultTableModel mymodel;
    
    public Reportpage() {
        initComponents();
        tblOrder();
        tblPay();
        tblEmp();
        btnProfileShort.setText("Hi, "+ loggedUser.user_name);
    }
    Loginpage loggedUser = new Loginpage();
    String role = loggedUser.role;
    int mouseX;
    int mouseY;
    
    private void tblOrder(){
         String[]columnsName ={"Order ID","Delivery Date","Receiver Date","Status","Weight",
                                "Receiver Name","Receiver Address","Sender Name","Sender Address"};
        String filename = "Order.txt";
     try {
         br = new BufferedReader(new FileReader(filename));
     } catch (FileNotFoundException ex) {
         Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
     }
            mymodel =(DefaultTableModel)tblOrder.getModel();
            mymodel.setColumnIdentifiers(columnsName);// set the headers

            //clears the table modelbefore display the data
            mymodel.setRowCount(0);
            tblOrder.revalidate(); //reset the Jtable

            Object[] records = br.lines().toArray();

            for (int index = 0; index < records.length; index++){
                String eachline = records[index].toString();
                String[]row = eachline.split(";");
                String OID = row[0];
                String ODelDate = row[1];
                String ORecDate = row[2];
                String OStatus = row[3];
                String OWeight = row[4];
                String ORecName = row[5];
                String ORecAdd = row[6];
                String OSendName = row[7];
                String OSendAdd = row[8];
                
                String[] data = {OID, ODelDate, ORecDate, OStatus, OWeight, ORecName, ORecAdd, OSendName, OSendAdd };
                mymodel.addRow(data);

            }
        }
      private void tblPay(){
         String[]columnsName ={"Order ID","Payment Date","Payment Method","Amount (RM)"};
        String filename = "Payment.txt";
     try {
         br = new BufferedReader(new FileReader(filename));
     } catch (FileNotFoundException ex) {
         Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
     }
            mymodel =(DefaultTableModel)tblPay.getModel();
            mymodel.setColumnIdentifiers(columnsName);// set the headers

            //clears the table modelbefore display the data
            mymodel.setRowCount(0);
            tblPay.revalidate(); //reset the Jtable

            Object[] records = br.lines().toArray();

            for (int index = 0; index < records.length; index++){
                String eachline = records[index].toString();
                String[]row = eachline.split(";");
                mymodel.addRow(row);

            }
        }
      
      
      public void tblEmp() {
        String[]columnsName ={"Employee ID","First Name","Last Name","Age", "Gender", "Email", "Phone Number", "Salary", "Role"};
        
        try {
            FileReader staffList = new FileReader("Staff.txt");
            FileReader DriverList = new FileReader("Driver.txt");
            FileReader AdminList = new FileReader("Admin.txt");

            BufferedReader br_staff = new BufferedReader(staffList);
            BufferedReader br_driver = new BufferedReader(DriverList);
            BufferedReader br_admin = new BufferedReader(AdminList);

            mymodel = (DefaultTableModel) tblEmp.getModel();
            mymodel.setColumnIdentifiers(columnsName);//
            mymodel.setRowCount(0);
            
            ArrayList<String> records = new ArrayList<String>();
            while (br_staff.ready()) {
                records.add(br_staff.readLine());
            }

            while (br_admin.ready()) {
                records.add(br_admin.readLine());
            }

            while (br_driver.ready()) {
                records.add(br_driver.readLine());
            }

            for (int index = 0; index < records.size(); index++){
                String eachline = records.get(index);
                String[] data = eachline.split(";");

                String tb_id = data[0];
                String tb_username = data[1];
                String tb_fname = data[3];
                String tb_lname = data[4];
                String tb_age = data[5];
                String tb_gender;
                if ("0".equals(data[6]) ) {
                     tb_gender = "Male";
                }
                else if ("1".equals(data[6])){
                     tb_gender = "Female";
                }
                else {
                     tb_gender = "Other";
                }
                String tb_email = data[7];
                String tb_pnumber = data[8];
                String tb_salary = data[9];
                String tb_role = data[10];
                
                String[] row = {tb_id, tb_username, tb_fname, tb_lname, tb_age, tb_gender, tb_email, tb_pnumber, tb_salary, tb_role};
                mymodel.addRow(row);
            }
        }
        catch (IOException ex) {
            
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

        YellowMainPanel = new javax.swing.JPanel();
        MainWhitePanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        EmpPanel = new javax.swing.JPanel();
        ScrollEmployee = new javax.swing.JScrollPane();
        tblEmp = new javax.swing.JTable();
        btnGenEmp = new javax.swing.JButton();
        OrderPanel = new javax.swing.JPanel();
        ScrollOrder = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        btnGenOrd = new javax.swing.JButton();
        PaymentPanel = new javax.swing.JPanel();
        ScrollPayment = new javax.swing.JScrollPane();
        tblPay = new javax.swing.JTable();
        btnGenPay = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();
        btnProfileShort = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        YellowMainPanel.setBackground(new java.awt.Color(255, 204, 102));
        YellowMainPanel.setForeground(new java.awt.Color(51, 51, 255));
        YellowMainPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                YellowMainPanelMouseDragged(evt);
            }
        });
        YellowMainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YellowMainPanelMouseClicked(evt);
            }
        });

        MainWhitePanel.setBackground(new java.awt.Color(255, 255, 255));

        EmpPanel.setBackground(new java.awt.Color(255, 255, 255));

        tblEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblEmp.setFocusable(false);
        tblEmp.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblEmp.setRowHeight(25);
        tblEmp.setSelectionBackground(new java.awt.Color(255, 204, 102));
        tblEmp.setShowVerticalLines(false);
        ScrollEmployee.setViewportView(tblEmp);

        btnGenEmp.setBackground(new java.awt.Color(0, 0, 0));
        btnGenEmp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGenEmp.setForeground(java.awt.Color.white);
        btnGenEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconbtn/report.png"))); // NOI18N
        btnGenEmp.setText("GENERATE");
        btnGenEmp.setToolTipText("");
        btnGenEmp.setBorderPainted(false);
        btnGenEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGenEmp.setFocusCycleRoot(true);
        btnGenEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EmpPanelLayout = new javax.swing.GroupLayout(EmpPanel);
        EmpPanel.setLayout(EmpPanelLayout);
        EmpPanelLayout.setHorizontalGroup(
            EmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmpPanelLayout.createSequentialGroup()
                .addComponent(ScrollEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmpPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGenEmp)
                .addContainerGap())
        );
        EmpPanelLayout.setVerticalGroup(
            EmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmpPanelLayout.createSequentialGroup()
                .addComponent(ScrollEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenEmp)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Employee", EmpPanel);

        OrderPanel.setBackground(new java.awt.Color(255, 255, 255));

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblOrder.setRowHeight(25);
        tblOrder.setSelectionBackground(new java.awt.Color(255, 204, 102));
        ScrollOrder.setViewportView(tblOrder);

        btnGenOrd.setBackground(new java.awt.Color(0, 0, 0));
        btnGenOrd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGenOrd.setForeground(java.awt.Color.white);
        btnGenOrd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconbtn/report.png"))); // NOI18N
        btnGenOrd.setText("GENERATE");
        btnGenOrd.setToolTipText("");
        btnGenOrd.setBorderPainted(false);
        btnGenOrd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGenOrd.setFocusCycleRoot(true);
        btnGenOrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenOrdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OrderPanelLayout = new javax.swing.GroupLayout(OrderPanel);
        OrderPanel.setLayout(OrderPanelLayout);
        OrderPanelLayout.setHorizontalGroup(
            OrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrderPanelLayout.createSequentialGroup()
                .addComponent(ScrollOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGenOrd)
                .addContainerGap())
        );
        OrderPanelLayout.setVerticalGroup(
            OrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderPanelLayout.createSequentialGroup()
                .addComponent(ScrollOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenOrd)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Order", OrderPanel);

        PaymentPanel.setBackground(new java.awt.Color(255, 255, 255));

        tblPay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblPay.setRowHeight(25);
        tblPay.setSelectionBackground(new java.awt.Color(255, 204, 102));
        ScrollPayment.setViewportView(tblPay);

        btnGenPay.setBackground(new java.awt.Color(0, 0, 0));
        btnGenPay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGenPay.setForeground(java.awt.Color.white);
        btnGenPay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconbtn/report.png"))); // NOI18N
        btnGenPay.setText("GENERATE");
        btnGenPay.setToolTipText("");
        btnGenPay.setBorderPainted(false);
        btnGenPay.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGenPay.setFocusCycleRoot(true);
        btnGenPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenPayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PaymentPanelLayout = new javax.swing.GroupLayout(PaymentPanel);
        PaymentPanel.setLayout(PaymentPanelLayout);
        PaymentPanelLayout.setHorizontalGroup(
            PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaymentPanelLayout.createSequentialGroup()
                .addComponent(ScrollPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaymentPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGenPay)
                .addContainerGap())
        );
        PaymentPanelLayout.setVerticalGroup(
            PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentPanelLayout.createSequentialGroup()
                .addComponent(ScrollPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenPay)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Payment", PaymentPanel);

        javax.swing.GroupLayout MainWhitePanelLayout = new javax.swing.GroupLayout(MainWhitePanel);
        MainWhitePanel.setLayout(MainWhitePanelLayout);
        MainWhitePanelLayout.setHorizontalGroup(
            MainWhitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainWhitePanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        MainWhitePanelLayout.setVerticalGroup(
            MainWhitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainWhitePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon Images/icons8-in-transit-64.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Courier Service");

        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon Images/icons8-exit-24.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });

        btnProfileShort.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnProfileShort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon Images/icons8-user-24.png"))); // NOI18N
        btnProfileShort.setText("Hi, A001.");
        btnProfileShort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProfileShort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProfileShortMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel11.setText("Report");

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon Images/main (2).png"))); // NOI18N
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout YellowMainPanelLayout = new javax.swing.GroupLayout(YellowMainPanel);
        YellowMainPanel.setLayout(YellowMainPanelLayout);
        YellowMainPanelLayout.setHorizontalGroup(
            YellowMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainWhitePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(YellowMainPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(YellowMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(YellowMainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout)
                        .addGap(27, 27, 27))
                    .addGroup(YellowMainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(YellowMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnProfileShort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHome)
                .addContainerGap())
        );
        YellowMainPanelLayout.setVerticalGroup(
            YellowMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YellowMainPanelLayout.createSequentialGroup()
                .addGroup(YellowMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(YellowMainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(YellowMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogout)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(YellowMainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addComponent(MainWhitePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(YellowMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProfileShort, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(YellowMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(YellowMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenPayActionPerformed
 MessageFormat title = new MessageFormat("Payment Report");
        MessageFormat footer = new MessageFormat("Courier Service System");
        try{
            tblPay.print(JTable.PrintMode.FIT_WIDTH,title,footer);
        }
        catch(PrinterException e){
           JOptionPane.showMessageDialog(rootPane,"Unable to Print!"+e.getMessage());
        }
    }//GEN-LAST:event_btnGenPayActionPerformed

    private void btnProfileShortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfileShortMouseClicked
        JFrame profileFrame = new Profilepage();
        profileFrame.setLocation(this.getX() + this.getWidth() + 10, this.getY());
        profileFrame.setVisible(true);
    }//GEN-LAST:event_btnProfileShortMouseClicked

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        dispose();
        new MainAdmin().setVisible(true);
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnGenEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenEmpActionPerformed
        MessageFormat title = new MessageFormat("Employee Report");
        MessageFormat footer = new MessageFormat("Courier Service System");
        try{
            tblOrder.print(JTable.PrintMode.FIT_WIDTH,title,footer);
        }
        catch(PrinterException e){
           JOptionPane.showMessageDialog(rootPane,"Unable to Print!"+e.getMessage());
        }
    }//GEN-LAST:event_btnGenEmpActionPerformed

    private void btnGenOrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenOrdActionPerformed
        MessageFormat title = new MessageFormat("Order Report");
        MessageFormat footer = new MessageFormat("Courier Service System");
        try{
            tblOrder.print(JTable.PrintMode.FIT_WIDTH,title,footer);
        }
        catch(PrinterException e){
           JOptionPane.showMessageDialog(rootPane,"Unable to Print!"+e.getMessage());
        }
    }//GEN-LAST:event_btnGenOrdActionPerformed

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        int confirmation = JOptionPane.YES_OPTION;
        if (JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to logout?", "Confirmation Logout", confirmation) == JOptionPane.YES_OPTION) {
            dispose();
            new Loginpage().setVisible(true);
        }
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void YellowMainPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YellowMainPanelMouseClicked
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_YellowMainPanelMouseClicked

    private void YellowMainPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YellowMainPanelMouseDragged
        int cur_x = evt.getXOnScreen();
        int cur_y = evt.getYOnScreen();
        
        this.setLocation(cur_x - mouseX, cur_y - mouseY);
    }//GEN-LAST:event_YellowMainPanelMouseDragged

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
            java.util.logging.Logger.getLogger(Reportpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EmpPanel;
    private javax.swing.JPanel MainWhitePanel;
    private javax.swing.JPanel OrderPanel;
    private javax.swing.JPanel PaymentPanel;
    private javax.swing.JScrollPane ScrollEmployee;
    private javax.swing.JScrollPane ScrollOrder;
    private javax.swing.JScrollPane ScrollPayment;
    private javax.swing.JPanel YellowMainPanel;
    private javax.swing.JButton btnGenEmp;
    private javax.swing.JButton btnGenOrd;
    private javax.swing.JButton btnGenPay;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel btnProfileShort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblEmp;
    private javax.swing.JTable tblOrder;
    public javax.swing.JTable tblPay;
    // End of variables declaration//GEN-END:variables
}
