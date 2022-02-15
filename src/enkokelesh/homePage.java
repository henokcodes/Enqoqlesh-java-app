/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkokelesh;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.Timer;

/**
 *
 * @author Administrator
 */
public class homePage extends javax.swing.JFrame {

    /**
     * Creates new form homePage
     */
    public homePage() {
        initComponents();
        this.setLocationRelativeTo(null);
        play();
        showDate();
        showTime();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        leaderL = new javax.swing.JLabel();
        optionL = new javax.swing.JLabel();
        startL = new javax.swing.JLabel();
        quit = new javax.swing.JLabel();
        storyL = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 700, 450));
        setName("homepage"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 450));
        getContentPane().setLayout(null);

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enkokelesh/document-close-2.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(660, 10, 40, 30);

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
        getContentPane().add(minimize);
        minimize.setBounds(610, 10, 40, 32);

        leaderL.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        leaderL.setForeground(new java.awt.Color(51, 51, 51));
        leaderL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leaderL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enkokelesh/abiword.png"))); // NOI18N
        leaderL.setText("Leaderboard");
        leaderL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                leaderLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                leaderLMouseExited(evt);
            }
        });
        getContentPane().add(leaderL);
        leaderL.setBounds(290, 290, 170, 40);

        optionL.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        optionL.setForeground(new java.awt.Color(51, 51, 51));
        optionL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optionL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enkokelesh/system-settings.png"))); // NOI18N
        optionL.setText("Option");
        optionL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                optionLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                optionLMouseExited(evt);
            }
        });
        getContentPane().add(optionL);
        optionL.setBounds(290, 250, 120, 40);

        startL.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        startL.setForeground(new java.awt.Color(51, 51, 51));
        startL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        startL.setText("start");
        startL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startLMouseExited(evt);
            }
        });
        getContentPane().add(startL);
        startL.setBounds(290, 170, 120, 40);

        quit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        quit.setForeground(new java.awt.Color(255, 51, 51));
        quit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enkokelesh/application-exit-3.png"))); // NOI18N
        quit.setText("Quit");
        quit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                quitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                quitMouseExited(evt);
            }
        });
        getContentPane().add(quit);
        quit.setBounds(580, 390, 80, 30);

        storyL.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        storyL.setForeground(new java.awt.Color(51, 51, 51));
        storyL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        storyL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enkokelesh/book.png"))); // NOI18N
        storyL.setText("Story");
        storyL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                storyLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                storyLMouseExited(evt);
            }
        });
        getContentPane().add(storyL);
        storyL.setBounds(300, 210, 90, 40);

        date.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        date.setText("Date");
        getContentPane().add(date);
        date.setBounds(30, 30, 90, 18);

        time.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        time.setText("Time");
        getContentPane().add(time);
        time.setBounds(30, 10, 110, 18);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enkokelesh/enkokelesh.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 700, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
       int returnValue = 0;
        returnValue = JOptionPane.showConfirmDialog(rootPane,"All unsaved data will be lost","Are you sure you want to quit?",YES_NO_OPTION);
           if(returnValue == JOptionPane.YES_OPTION){
               System.exit(0);
           }
    }//GEN-LAST:event_closeMouseClicked

    private void startLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startLMouseEntered
        
        startL.setBackground(Color.GRAY);
        startL.setFocusable(true);
        startL.setForeground(Color.red);
        startL.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_startLMouseEntered

    private void startLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startLMouseExited
         startL.setBackground(Color.BLUE);
        startL.setFocusable(false);
        startL.setForeground(Color.BLACK);
    }//GEN-LAST:event_startLMouseExited

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_closeMouseEntered

    private void storyLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storyLMouseEntered
        storyL.setBackground(Color.GRAY);
        storyL.setFocusable(true);
        storyL.setForeground(Color.red);
        storyL.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_storyLMouseEntered

    private void optionLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionLMouseEntered
       optionL.setBackground(Color.GRAY);
        optionL.setFocusable(true);
        optionL.setForeground(Color.red);
        optionL.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_optionLMouseEntered

    private void leaderLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaderLMouseEntered
        leaderL.setBackground(Color.GRAY);
        leaderL.setFocusable(true);
        leaderL.setForeground(Color.red);
        leaderL.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_leaderLMouseEntered

    private void quitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitMouseEntered
        quit.setBackground(Color.GRAY);
        quit.setFocusable(true);
        quit.setForeground(Color.red);
        quit.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_quitMouseEntered

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

    private void storyLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storyLMouseExited
        storyL.setBackground(Color.BLUE);
        storyL.setFocusable(false);
        storyL.setForeground(Color.BLACK);
    }//GEN-LAST:event_storyLMouseExited

    private void optionLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionLMouseExited
         optionL.setBackground(Color.BLUE);
        optionL.setFocusable(false);
        optionL.setForeground(Color.BLACK);
    }//GEN-LAST:event_optionLMouseExited

    private void leaderLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaderLMouseExited
        leaderL.setBackground(Color.BLUE);
        leaderL.setFocusable(false);
        leaderL.setForeground(Color.BLACK);
    }//GEN-LAST:event_leaderLMouseExited

    private void quitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitMouseExited
        quit.setBackground(Color.BLUE);
        quit.setFocusable(false);
        quit.setForeground(Color.BLACK);
    }//GEN-LAST:event_quitMouseExited

    private void quitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitMouseClicked
        JOptionPane.showInputDialog("Give us a comment to improve ourselves");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        }
               System.exit(0);
             
    }//GEN-LAST:event_quitMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
            this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void startLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startLMouseClicked
        startGame object = new startGame();
        object.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_startLMouseClicked
void play(){
        String filepath = "C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EnkoklshGui\\src\\enkokelesh\\cool.wav";
        musicClass musicObject = new musicClass();
        musicObject.playMusic(filepath);
    }
    void showDate(){
        Date d =new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        date.setText(s.format(d));
    }
 void showTime()
 {
      new Timer(0, new ActionListener(){

         @Override
         public void actionPerformed(ActionEvent e) {
              Date d =new Date();
        SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
        time.setText(s.format(d));
    }
         }
     ).start();
         

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
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homePage().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel leaderL;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel optionL;
    private javax.swing.JLabel quit;
    private javax.swing.JLabel startL;
    private javax.swing.JLabel storyL;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
