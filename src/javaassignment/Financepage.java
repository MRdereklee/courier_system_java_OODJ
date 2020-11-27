/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Financepage extends javax.swing.JFrame {
    Scanner sc;
    BufferedReader br;
    DefaultTableModel mymodel;

    public Financepage() {
        initComponents();
        tblPay();
        btnProfileShort.setText("Hi, "+ loggedUser.user_name);
    }
    Loginpage loggedUser = new Loginpage();
    int mouseX;
    int mouseY;

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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainYellowPanel = new javax.swing.JPanel();
        WhitePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPay = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();
        btnProfileShort = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        MainYellowPanel.setBackground(new java.awt.Color(255, 204, 102));
        MainYellowPanel.setForeground(new java.awt.Color(51, 51, 255));
        MainYellowPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MainYellowPanelMouseDragged(evt);
            }
        });
        MainYellowPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainYellowPanelMouseClicked(evt);
            }
        });

        WhitePanel.setBackground(new java.awt.Color(255, 255, 255));

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
        jScrollPane1.setViewportView(tblPay);

        javax.swing.GroupLayout WhitePanelLayout = new javax.swing.GroupLayout(WhitePanel);
        WhitePanel.setLayout(WhitePanelLayout);
        WhitePanelLayout.setHorizontalGroup(
            WhitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WhitePanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        WhitePanelLayout.setVerticalGroup(
            WhitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WhitePanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon Images/icons8-in-transit-64.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Courier Service");

        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon Images/icons8-exit-24.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });

        btnProfileShort.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnProfileShort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon Images/icons8-user-24.png"))); // NOI18N
        btnProfileShort.setText("Hi, A001.");
        btnProfileShort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProfileShortMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel11.setText("Finance");

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon Images/main (2).png"))); // NOI18N
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MainYellowPanelLayout = new javax.swing.GroupLayout(MainYellowPanel);
        MainYellowPanel.setLayout(MainYellowPanelLayout);
        MainYellowPanelLayout.setHorizontalGroup(
            MainYellowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WhitePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainYellowPanelLayout.createSequentialGroup()
                .addGroup(MainYellowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainYellowPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(MainYellowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainYellowPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLogout))
                            .addGroup(MainYellowPanelLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(MainYellowPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnProfileShort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHome)))
                .addContainerGap())
        );
        MainYellowPanelLayout.setVerticalGroup(
            MainYellowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainYellowPanelLayout.createSequentialGroup()
                .addGroup(MainYellowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainYellowPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainYellowPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(MainYellowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btnLogout))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addComponent(WhitePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MainYellowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProfileShort, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainYellowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainYellowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        dispose();
        new MainAdmin().setVisible(true);
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnProfileShortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfileShortMouseClicked
        JFrame profileFrame = new Profilepage();
        profileFrame.setLocation(this.getX() + this.getWidth() + 10, this.getY());
        profileFrame.setVisible(true);
    }//GEN-LAST:event_btnProfileShortMouseClicked

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        int confirmation = JOptionPane.YES_OPTION;
        if (JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to logout?", "Confirmation Logout", confirmation) == JOptionPane.YES_OPTION) {
            dispose();
            new Loginpage().setVisible(true);
        }
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void MainYellowPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainYellowPanelMouseClicked
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_MainYellowPanelMouseClicked

    private void MainYellowPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainYellowPanelMouseDragged
        int cur_x = evt.getXOnScreen();
        int cur_y = evt.getYOnScreen();
        
        this.setLocation(cur_x - mouseX, cur_y - mouseY);
    }//GEN-LAST:event_MainYellowPanelMouseDragged

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
            java.util.logging.Logger.getLogger(Financepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Financepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Financepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Financepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Financepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainYellowPanel;
    private javax.swing.JPanel WhitePanel;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel btnProfileShort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPay;
    // End of variables declaration//GEN-END:variables
}
