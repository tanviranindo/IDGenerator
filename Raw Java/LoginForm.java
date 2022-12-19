package IDGenerate;

/*
  @author Tanvir
 */

import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class LoginForm extends javax.swing.JFrame {

    static LoginForm loginPage;

    public void Time() {
        Thread clock = new Thread() {
            public void run() {
                while (true) {
                    DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
                    LocalDateTime now = LocalDateTime.now();
                    jClock.setText(time.format(now) + " | " + date.format(now));
                    try {
                        sleep(1000); //could not solve because of class dependency, need to change a lot of things
                    } catch (InterruptedException | IllegalArgumentException ex) {
                        Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                        break;
                    }
                }
            }
        };
        try {
            clock.start();
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }

    public LoginForm() {
        initComponents();
        Time();

    }

    private void initComponents() {

        JPanel jPanel1 = new JPanel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        jTextUserName = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        JButton jButtonLogin = new JButton();
        JButton jButtonReset = new JButton();
        JButton jButtonExit = new JButton();
        JLabel jLabel1 = new JLabel();
        jClock = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(21, 110, 198));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(424, 385));

        jLabel2.setFont(new java.awt.Font("Consolas", Font.BOLD, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Consolas", Font.BOLD, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");

        jTextUserName.setFont(new java.awt.Font("Consolas", Font.PLAIN, 14)); // NOI18N

        jPassword.setFont(new java.awt.Font("Consolas", Font.PLAIN, 14)); // NOI18N

        jButtonLogin.setBackground(new java.awt.Color(255, 255, 255));
        jButtonLogin.setFont(new java.awt.Font("Consolas", Font.BOLD, 14)); // NOI18N
        jButtonLogin.setText("Login");
        jButtonLogin.setAutoscrolls(true);
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jButtonReset.setFont(new java.awt.Font("Consolas", Font.BOLD, 14)); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jButtonExit.setFont(new java.awt.Font("Consolas", Font.BOLD, 14)); // NOI18N
        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/IDGenerate/BRAC_University_logo.png")))); // NOI18N

        jClock.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jClock.setForeground(new java.awt.Color(255, 255, 255));
        jClock.setText("Clock");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(30, 30, 30).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel3).addGap(18, 18, 18).addComponent(jPassword)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel2).addGap(18, 18, 18).addComponent(jTextUserName)).addGroup(jPanel1Layout.createSequentialGroup().addGap(92, 92, 92).addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jButtonExit))).addGap(0, 47, Short.MAX_VALUE)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(101, 101, 101)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(jClock).addContainerGap()))));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(31, 31, 31).addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel2).addComponent(jTextUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(21, 21, 21).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel3)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButtonLogin).addComponent(jButtonReset).addComponent(jButtonExit)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE).addComponent(jClock).addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(0, 0, 0).addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE).addGap(0, 0, 0)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
    }

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {
        jTextUserName.setText(null);
        jPassword.setText(null);
    }

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {
        String username = jTextUserName.getText();
        String password = jPassword.getText();
        if (username.contains("anindo") && password.contains("1234")) {
            jTextUserName.setText(null);
            jPassword.setText(null);
            StudentInformationJar information = new StudentInformationJar();
// try {
//     Database.database();
// } catch (FileNotFoundException ex) {
//     Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
// }
            loginPage.setVisible(false);
            information.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
            jTextUserName.setText(null);
            jPassword.setText(null);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                loginPage = new LoginForm();

                loginPage.setVisible(true);
            }
        });
    }

    private javax.swing.JLabel jClock;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextUserName;
    // End of variables declaration

//    private void systemExit() {
//        WindowEvent a = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
//    }
}
