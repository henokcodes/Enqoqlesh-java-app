/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkokelesh;

import java.awt.Color;
import java.awt.Cursor;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 *
 * @author Administrator
 */
public class startGame extends javax.swing.JFrame {

    /**
     * Creates new form startGame
     */
    Connection con=null;
    PreparedStatement pst=null;
        ResultSet  rs=null;
    int numb=1;
    private String coinV;
    private int gcoin;
  
    public startGame() {
        JOptionPane.showInputDialog("enter your name");
        initComponents();
        this.setLocationRelativeTo(null);
        res();
        showQuestion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        queslbl = new javax.swing.JLabel();
        b3 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lvl = new javax.swing.JLabel();
        coinL = new javax.swing.JLabel();
        hint = new javax.swing.JButton();
        chat = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        queslbl.setFont(new java.awt.Font("Power Geez Unicode1", 1, 18)); // NOI18N
        queslbl.setForeground(new java.awt.Color(255, 255, 255));
        queslbl.setText("Question");

        b3.setFont(new java.awt.Font("Power Geez Unicode1", 1, 12)); // NOI18N
        b3.setText("C");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Power Geez Unicode1", 1, 12)); // NOI18N
        b2.setText("B");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Power Geez Unicode1", 1, 12)); // NOI18N
        b4.setText("D");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Power Geez Unicode1", 1, 12)); // NOI18N
        b1.setText("A");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("c icon");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Timer");

        lvl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lvl.setForeground(new java.awt.Color(255, 255, 255));
        lvl.setText("level ");

        coinL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        coinL.setForeground(new java.awt.Color(255, 255, 255));
        coinL.setText("0");

        hint.setText("Hint");
        hint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hintActionPerformed(evt);
            }
        });

        chat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chat.setForeground(new java.awt.Color(255, 255, 255));
        chat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enkokelesh/internet-chat-3.png"))); // NOI18N
        chat.setText("Get help ");

        jButton6.setText("Main menu");

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enkokelesh/list-remove-3.png"))); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enkokelesh/document-close-2.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(550, 550, 550)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(590, 590, 590)
                        .addComponent(coinL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(hint))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(queslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(chat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lvl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(b1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(b2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(b3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(hint))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(chat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(b4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(lvl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(minimize)
                            .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(367, 367, 367)
                                .addComponent(jButton6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(coinL, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(queslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hintActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     
    }//GEN-LAST:event_formWindowOpened
public void res(){
    try{
         //  Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost/enkoklsh","root","");
        
          String fetch_row="SELECT * FROM questions ";
          pst = con.prepareStatement(fetch_row);
          rs = pst.executeQuery();
          
          
              
            
         
      }catch(Exception e){
          e.printStackTrace();
}}
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        try {
            String value = b1.getText();
            if(value==rs.getString(7)){
                try{
                    int coin = Integer.parseInt(coinV);
       coin+=3;
       String Coin = Integer.toString(coin);
       coinL.setText(Coin);
         rs.next();
         
      }catch(Exception e){
          e.printStackTrace();
      }
                
            }
            else 
                JOptionPane.showMessageDialog(null,"Incorrect answer, try again!!");
        } catch (SQLException ex) {
           
            Logger.getLogger(startGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setBackground(Color.GRAY);
        minimize.setFocusable(true);
        minimize.setForeground(Color.red);
        minimize.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setBackground(Color.BLUE);
        minimize.setFocusable(false);
        minimize.setForeground(Color.BLACK);
    }//GEN-LAST:event_minimizeMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        int returnValue = 0;
        returnValue = JOptionPane.showConfirmDialog(rootPane,"All unsaved data will be lost","Are you sure you want to quit?",YES_NO_OPTION);
        if(returnValue == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_closeMouseEntered

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
       try {
            String value = b3.getText();
            if(value==rs.getString(7)){
                try{
                    int coin = Integer.parseInt(coinV);
       coin+=3;
       String Coin = Integer.toString(coin);
       coinL.setText(Coin);
         rs.next();
         
      }catch(Exception e){
          e.printStackTrace();
      }
                
            }
            else 
                JOptionPane.showMessageDialog(null,"Incorrect answer, try again!!");
        } catch (SQLException ex) {
           
            Logger.getLogger(startGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        try {
            String value = b2.getText();
            if(value==rs.getString(7)){
                try{
         
      coinV= coinL.getText();
       int coin = Integer.parseInt(coinV);
       coin+=3;
       String Coin = Integer.toString(coin);
       coinL.setText(Coin);
         rs.next();
      }catch(Exception e){
          e.printStackTrace();
      }
                
            }
            else 
                JOptionPane.showMessageDialog(null,"Incorrect answer, try again!!");
        } catch (SQLException ex) {
            Logger.getLogger(startGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
       try {
            String value = b4.getText();
            if(value==rs.getString(7)){
                try{
                    int coin = Integer.parseInt(coinV);
       coin+=3;
       String Coin = Integer.toString(coin);
       coinL.setText(Coin);
         rs.next();
         
      }catch(Exception e){
          e.printStackTrace();
      }
                
            }
            else 
                JOptionPane.showMessageDialog(null,"Incorrect answer, try again!!");
        } catch (SQLException ex) {
           
            Logger.getLogger(startGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b4ActionPerformed
void showQuestion(){    
    try {
             if(rs.isLast())
                 JOptionPane.showMessageDialog(rootPane, "done");
             else{
                 rs.next();
                  queslbl.setText(rs.getString(1) + ". "+ rs.getString(2));
              b1.setText(rs.getString(3));
              b2.setText(rs.getString(4));
              b3.setText(rs.getString(5));
              b4.setText(rs.getString(6));
              lvl.setText(rs.getString(8));
             }
           
          
       } catch (SQLException ex) {
           Logger.getLogger(startGame.class.getName()).log(Level.SEVERE, null, ex);
       }
}
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
            java.util.logging.Logger.getLogger(startGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(startGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(startGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(startGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new startGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JLabel chat;
    private javax.swing.JLabel close;
    private javax.swing.JLabel coinL;
    private javax.swing.JButton hint;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lvl;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel queslbl;
    // End of variables declaration//GEN-END:variables
}
