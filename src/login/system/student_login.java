/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.system;
import java.awt.AWTEvent;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Rushabh Daxini
 */
public class student_login extends javax.swing.JFrame {
     public Connection cn;
        public Statement st; 
        public InputStream in;
        public Connection conn=null;
        ResultSet rs=null;
        public PreparedStatement pst=null;
        int curRow=0;
    /**
     * Creates new form student_login
     */
    public student_login() {
        initComponents();
         try{
           Class.forName("com.mysql.jdbc.Driver");
            conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/student?zeroDateTimeBehavior=convertToNull", "root", "");
            //JOptionPane.showMessageDialog(null,"Connected");
//return conn;
            }
       catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
//return null;
            }
        Toolkit toolkit = getToolkit();
        Dimension dim = toolkit.getScreenSize();
        setLocation(dim.width/2 - getWidth()/2,dim.height/2 - getHeight()/2);
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_title = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_username = new javax.swing.JLabel();
        jLabel_password = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        button_login = new javax.swing.JButton();
        button_register = new javax.swing.JButton();
        button_exit = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        button_exit1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_title.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));
        jPanel_title.setOpaque(false);
        jPanel_title.setRequestFocusEnabled(false);
        jPanel_title.setVerifyInputWhenFocusTarget(false);
        jPanel_title.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jLabel2.setText("  STUDENT LOGIN");
        jPanel_title.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 30));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel_title.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 30));

        jLabel_username.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jLabel_username.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_username.setText("Roll number  ");
        jPanel_title.add(jLabel_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 20));

        jLabel_password.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jLabel_password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_password.setText("Password");
        jPanel_title.add(jLabel_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, 20));
        jPanel_title.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 135, -1));

        button_login.setBackground(new java.awt.Color(153, 153, 255));
        button_login.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        button_login.setText("Login");
        button_login.setToolTipText("Login");
        button_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_loginActionPerformed(evt);
            }
        });
        button_login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                button_loginKeyPressed(evt);
            }
        });
        jPanel_title.add(button_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        button_register.setBackground(new java.awt.Color(153, 153, 255));
        button_register.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        button_register.setText("Register");
        button_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_registerActionPerformed(evt);
            }
        });
        jPanel_title.add(button_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        button_exit.setBackground(new java.awt.Color(153, 153, 255));
        button_exit.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        button_exit.setText("Cancel");
        button_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_exitActionPerformed(evt);
            }
        });
        jPanel_title.add(button_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        jToggleButton1.setBackground(new java.awt.Color(153, 153, 255));
        jToggleButton1.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jToggleButton1.setText("Faculty Login");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel_title.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 180, -1));
        jPanel_title.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 135, -1));

        button_exit1.setBackground(new java.awt.Color(153, 153, 255));
        button_exit1.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        button_exit1.setText("Forgot Password ?");
        button_exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_exit1ActionPerformed(evt);
            }
        });
        jPanel_title.add(button_exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 180, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/system/nir.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel_title.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_loginActionPerformed
        // TODO add your handling code here:
        String sql_input = "SELECT * FROM student_details WHERE rollnumber=? and passsword=?";
        try{
            pst=conn.prepareStatement(sql_input);
            pst.setString(1,txt_username.getText());
            pst.setString(2,jPasswordField1.getText());
            rs=pst.executeQuery();
            if (rs.next()){
                about ab= new about(txt_username.getText());
                ab.setVisible(true);
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong rollnumber or password");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_button_loginActionPerformed

    private void button_loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_button_loginKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_loginKeyPressed

    private void button_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_registerActionPerformed

        /*try{
            String sql="SELECT * FROM student_details WHERE rollnumber=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_username.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"rollnumber is taken");
            }
            else {

                String rsq="INSERT INTO student_details(rollnumber,passsword) VALUES(?,?)";
                pst=conn.prepareStatement(rsq);
                pst.setString(1,txt_username.getText());
                pst.setString(2,jPasswordField1.getText());
                //pst.executeQuery();
                 int executeUpdate = pst.executeUpdate();
                 System.out.println("Status : "+executeUpdate); 
                JOptionPane.showMessageDialog(null,"Data added sucessfully!");
                txt_username.setText("");
                jPasswordField1.setText("");
            }

        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,e);
        }*/
        if(txt_username.getText()==null)
            JOptionPane.showMessageDialog(null,"Enter the rollnumber you want to register");
        else{
            //JOptionPane.showMessageDialog(null,"Enter Your password to mail admin. We don't remember passwords.");
            
            JOptionPane.showMessageDialog(null,"Your request for registration is being processed to ADMIN");
            
        }
    }//GEN-LAST:event_button_registerActionPerformed

    private void button_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_exitActionPerformed
        dispose();//System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_button_exitActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        faculty_login fl=new faculty_login();
        fl.setVisible(true);
        dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void button_exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_exit1ActionPerformed
        // TODO add your handling code here:
        Random rand=new Random();
        int code= rand.nextInt(5555)+1;
        //code for mailing the genrated code
        try{             
            String host ="smtp.gmail.com" ;
            String Tosend=txt_username.getText();
            boolean sessionDebug = false;
            Properties prop = System.getProperties();
            prop.put("mail.smtp.starttles.enables", "true");
            prop.put("mail.smtp.host",host);
            prop.put("mail.smtp.port", "587");
            prop.put("mail.smtp.auth", "true");
            prop.put("mail.smtp.starttls.required", "true");
            Tosend+="@nirmauni.ac.in";
        
            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session ses= Session.getDefaultInstance(prop,null);
            ses.setDebug(sessionDebug);
            Message mes = new MimeMessage(ses);
            mes.setFrom(new InternetAddress("14rushabhdaxini@gmail.com"));
            mes.setRecipients(Message.RecipientType.TO,InternetAddress.parse(Tosend));           
            mes.setSubject("Forgot password code");
            mes.setText("Recovery code is "+code+"\n"+"Change Your password with this code and make sure you are not sharing the code with anyone"); 
            Transport transport = ses.getTransport("smtp");
            transport.connect(host,"14rushabhdaxini@gmail.com","changemerd");
            transport.sendMessage(mes, mes.getAllRecipients());
            transport.close();
            JOptionPane.showMessageDialog(null,"Mail sent");
                
        }catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,e);
            
        }
         forgot_password fp=new forgot_password(txt_username.getText(),1,code);
            fp.setVisible(true);
            dispose();        
    }//GEN-LAST:event_button_exit1ActionPerformed

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
            java.util.logging.Logger.getLogger(student_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_exit;
    private javax.swing.JButton button_exit1;
    private javax.swing.JButton button_login;
    private javax.swing.JButton button_register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_title;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}