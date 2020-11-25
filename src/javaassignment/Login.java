/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

import java.awt.Color;

/**
 *
 * @author sengk
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTop = new javax.swing.JPanel();
        jPanelMain = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        txtboxUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        txtboxPassword = new javax.swing.JPasswordField();
        btnFgtPassword = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        chbxShowPassword = new javax.swing.JCheckBox();
        lblLogo = new javax.swing.JLabel();
        lblCompanyName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 2000));
        setUndecorated(true);
        setResizable(false);

        jPanelTop.setBackground(new java.awt.Color(255, 204, 102));
        jPanelTop.setForeground(new java.awt.Color(51, 51, 255));

        jPanelMain.setBackground(new java.awt.Color(255, 255, 255));

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExit.setForeground(java.awt.Color.white);
        btnExit.setText("EXIT");
        btnExit.setBorderPainted(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnExit.setPreferredSize(new java.awt.Dimension(69, 23));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtboxUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtboxUsername.setForeground(java.awt.Color.gray);
        txtboxUsername.setText("Enter the username...");
        txtboxUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtboxUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtboxUsernameFocusLost(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(0, 0, 0));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.setBorderPainted(false);
        btnLogin.setMaximumSize(new java.awt.Dimension(59, 23));
        btnLogin.setMinimumSize(new java.awt.Dimension(59, 23));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtboxPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtboxPassword.setForeground(java.awt.Color.gray);
        txtboxPassword.setText("Enter the password...");
        txtboxPassword.setEchoChar((char)0);
        txtboxPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtboxPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtboxPasswordFocusLost(evt);
            }
        });

        btnFgtPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFgtPassword.setText("Forgot Password?");
        btnFgtPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFgtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFgtPasswordMouseClicked(evt);
            }
        });

        lblLogin.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lblLogin.setText("Login");

        chbxShowPassword.setText("Show Password");
        chbxShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxShowPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(lblLogin))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(btnFgtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtboxUsername)
                            .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtboxPassword))
                        .addGap(18, 18, 18)
                        .addComponent(chbxShowPassword)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblLogin)
                .addGap(18, 18, 18)
                .addComponent(txtboxUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtboxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxShowPassword))
                .addGap(18, 18, 18)
                .addComponent(btnFgtPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon Images/icons8-in-transit-64.png"))); // NOI18N

        lblCompanyName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCompanyName.setText("Courier Service");

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblLogo)
                .addGap(18, 18, 18)
                .addComponent(lblCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTopLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblCompanyName))
                    .addGroup(jPanelTopLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        //Confirmation box
        
        //Exit Application
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        new Main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtboxUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxUsernameFocusGained
        if ( txtboxUsername.getText().equals("Enter the username...")) {
            txtboxUsername.setText("");
            txtboxUsername.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtboxUsernameFocusGained

    private void txtboxUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxUsernameFocusLost
        
        if ( txtboxUsername.getText().equals("")) {
            txtboxUsername.setText("Enter the username...");
            txtboxUsername.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtboxUsernameFocusLost

    private void txtboxPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxPasswordFocusGained
        String check_pass = new String(txtboxPassword.getPassword());
        if ( check_pass.equals("Enter the password...")) {
            txtboxPassword.setText("");
            txtboxPassword.setEchoChar('\u25cf');
            txtboxPassword.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtboxPasswordFocusGained

    private void txtboxPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxPasswordFocusLost
        String check_pass = new String(txtboxPassword.getPassword());
        if ( check_pass.equals("")) {
            txtboxPassword.setText("Enter the password...");
            txtboxPassword.setEchoChar((char)0);
            txtboxPassword.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtboxPasswordFocusLost

    private void chbxShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxShowPasswordActionPerformed
        String check_pass = new String(txtboxPassword.getPassword());
        if (chbxShowPassword.isSelected() ) {
            txtboxPassword.setEchoChar((char)0);
        }
        else if (!(chbxShowPassword.isSelected()) & (check_pass.equals("") | check_pass.equals("Enter the password...") ) ) {
            txtboxPassword.setEchoChar((char)0);
        }
        else {
            txtboxPassword.setEchoChar('\u25cf');
        }
    }//GEN-LAST:event_chbxShowPasswordActionPerformed

    private void btnFgtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFgtPasswordMouseClicked
        new ForgotpasswordFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFgtPasswordMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel btnFgtPassword;
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox chbxShowPassword;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JLabel lblCompanyName;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPasswordField txtboxPassword;
    private javax.swing.JTextField txtboxUsername;
    // End of variables declaration//GEN-END:variables
}
