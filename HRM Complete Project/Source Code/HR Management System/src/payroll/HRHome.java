/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

/**
 *
 * 
 */
public class HRHome extends javax.swing.JFrame {

    /**
     * Creates new form hrhome
     */
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    hrp1 a1 =new hrp1();
    String newpass,f1;
    public HRHome() {
        initComponents();
    }
    public void formclose()
    {
        WindowEvent winclosingevent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclosingevent);    
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
        jPanel1.setBackground(new Color(204, 204, 255));
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setBackground(new Color(204, 204, 255));
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 18));
        jButton1 = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Tahoma", Font.BOLD, 18));
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBorder(new TitledBorder(null, "HR LOGIN", TitledBorder.LEADING, TitledBorder.TOP, null, null));

        jLabel1.setText("USERNAME:");

        jButton1.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        jLabel2.setText("PASSWORD:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap(64, Short.MAX_VALUE)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel2, Alignment.TRAILING)
        				.addComponent(jLabel1, Alignment.TRAILING))
        			.addPreferredGap(ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(username, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
        				.addComponent(password, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        		.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        			.addContainerGap(159, Short.MAX_VALUE)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
        			.addGap(125))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(username, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(29)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
        			.addComponent(jButton1)
        			.addGap(23))
        );
        jPanel2.setLayout(jPanel2Layout);

        back.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        back.setText("GO TO HOME PAGE");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        
        lblHrPage = new JLabel();
        lblHrPage.setBackground(new Color(204, 153, 153));
        lblHrPage.setText("HR PAGE");
        lblHrPage.setHorizontalAlignment(SwingConstants.CENTER);
        lblHrPage.setFont(new Font("Lucida Fax", Font.BOLD, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
        			.addGap(22)
        			.addComponent(lblHrPage, GroupLayout.PREFERRED_SIZE, 586, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(154, Short.MAX_VALUE))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(709, Short.MAX_VALUE)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(114))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(819, Short.MAX_VALUE)
        			.addComponent(back)
        			.addGap(231))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(20)
        			.addComponent(lblHrPage, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(back)
        			.addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        getContentPane().add(jPanel1);

        setSize(new Dimension(635, 453));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       conn=Connect.ConnectDB();
        String Sql;
        Sql = "select * from hr where username=? and password=?";
        try
        {
            newpass=password.getText();
           try
            {
            //code to generate hash
            MessageDigest md = MessageDigest.getInstance("MD5");		
            byte code1[] = md.digest(newpass.getBytes());
            BigInteger number1 = new BigInteger(1,code1);
            f1 = ""+number1.toString(16);						
            System.out.println("Hash is "+f1);				
            }
            catch(NoSuchAlgorithmException ex)
            {
                    System.out.println("\n\n Not happening");
            }
            pst=conn.prepareStatement(Sql);
            pst.setString(1,username.getText());
            //pst.setString(2, f1);
            pst.setString(2, password.getText());
            rs=pst.executeQuery();
            if(rs.next())
            {
                getContentPane().removeAll();
                getContentPane().add(a1);
                repaint();
                setVisible(true);              
            }        
            else
            {
                JOptionPane.showMessageDialog(null,"invalid userid/password","access denied",JOptionPane.ERROR_MESSAGE);
                
            }
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
           if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
       conn=Connect.ConnectDB();
        String Sql="select * from hr where username=? and password=?";
        try
        {
            pst=conn.prepareStatement(Sql);
            pst.setString(1,username.getText());
            pst.setString(2,password.getText());
            rs=pst.executeQuery();
            if(rs.next())
            {
                getContentPane().removeAll();
                getContentPane().add(a1);
                repaint();
                setVisible(true);                              
            }        
            else
            {
                JOptionPane.showMessageDialog(null,"invalid userid/password","access denied",JOptionPane.ERROR_MESSAGE);
                
            }
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        formclose();
        home s2=new home();
        s2.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(HRHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HRHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HRHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HRHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HRHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    private JLabel lblHrPage;
    // End of variables declaration//GEN-END:variables
}