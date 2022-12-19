package IDGenerate;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

import static IDGenerate.LoginForm.loginPage;
import static java.lang.Thread.sleep;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Tanvir Anindo
 */
public class StudentInformationJar extends JFrame {

    public void Time() {
        Thread clock = new Thread() {
            public void run() {
                while (true) {
                    DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
                    LocalDateTime now = LocalDateTime.now();
                    jClock.setText(time.format(now) + " | " + date.format(now));
                    jClock1.setText(time.format(now) + " | " + date.format(now));
                    jClock2.setText(time.format(now) + " | " + date.format(now));
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                        break;
                    }
                }
            }
        };
        clock.start();
    }

    static StudentInformationJar student;

    public StudentInformationJar() {
        initComponents();
        Time();
    }


    private void initComponents() {

        // Variables declaration - do not modify//GEN-BEGIN:variables
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        JLabel jLabel5 = new JLabel();
        JLabel jLabel6 = new JLabel();
        JLabel jLabel7 = new JLabel();
        JLabel jLabel8 = new JLabel();
        JLabel jLabel9 = new JLabel();
        JLabel jLabel10 = new JLabel();
        JLabel jLabel11 = new JLabel();
        JLabel jLabel12 = new JLabel();
        JLabel jLabel13 = new JLabel();
        JLabel jLabel14 = new JLabel();
        JLabel jLabel15 = new JLabel();
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();
        JPanel jPanel4 = new JPanel();
        JPanel jPanel5 = new JPanel();
        JPanel jPanel6 = new JPanel();
        JScrollPane jScrollPane2 = new JScrollPane();
        JScrollPane jScrollPane3 = new JScrollPane();
        JScrollPane jScrollPane4 = new JScrollPane();
        JScrollPane jScrollPane5 = new JScrollPane();
        JScrollPane jScrollPane6 = new JScrollPane();
        JScrollPane jScrollPane7 = new JScrollPane();
        JButton jButtonExit = new JButton();
        JButton jButtonExit1 = new JButton();
        JButton jButtonExit2 = new JButton();
        JButton jButtonLogOut = new JButton();
        JButton jButtonLogOut1 = new JButton();
        JButton jButtonLogOut2 = new JButton();
        JButton submit = new JButton();
        JLabel jFinalComment = new JLabel();
        JButton jSearchByID = new JButton();
        JButton jButtonClear = new JButton();
        JTabbedPane jAbout = new JTabbedPane();

        jYear = new JComboBox<>();
        jName = new JTextField();
        jSemester = new JComboBox<>();
        jDepartment = new JComboBox<>();
        jSlot = new JComboBox<>();
        jFatherName = new JTextPane();
        jMotherName = new JTextPane();
        jContact = new JTextPane();
        jGender = new JComboBox<>();
        jMail = new JTextPane();
        jCategory = new JComboBox<>();
        jClock = new JLabel();
        jSearch = new JTextPane();
        jOutputTable = new JTable();
        jClock1 = new JLabel();
        jClock2 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(21, 110, 198));

        jAbout.setBackground(new Color(21, 110, 198));
        jAbout.setFont(new Font("Consolas", Font.BOLD, 14)); // NOI18N

        jPanel1.setBackground(new Color(21, 110, 198));
        jPanel1.setFont(new Font("Consolas", Font.PLAIN, 14)); // NOI18N

        jYear.setFont(new Font("Consolas", 0, 14)); // NOI18N
        String pYear = Integer.toString((Calendar.getInstance().get(Calendar.YEAR)) - 1);
        String cYear = Integer.toString((Calendar.getInstance().get(Calendar.YEAR)));
        String fYear = Integer.toString((Calendar.getInstance().get(Calendar.YEAR)) + 1);
        jYear.setModel(new DefaultComboBoxModel<>(new String[]{"Select", pYear, cYear, fYear}));
        jYear.addActionListener(this::jYearActionPerformed);

        jLabel1.setFont(new Font("Consolas", Font.BOLD, 14)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("Name");

        jName.setFont(new Font("Consolas", Font.PLAIN, 14)); // NOI18N

        jLabel2.setFont(new Font("Consolas", Font.BOLD, 14)); // NOI18N
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText("Semester");

        jSemester.setFont(new Font("Consolas", Font.PLAIN, 14)); // NOI18N
        jSemester.setModel(new DefaultComboBoxModel<>(new String[]{"Select", "Spring", "Summer", "Fall"}));
        jSemester.addActionListener(this::jSemesterActionPerformed);

        jDepartment.setFont(new Font("Consolas", Font.PLAIN, 14)); // NOI18N
        jDepartment.setModel(new DefaultComboBoxModel<>(new String[]{"Select", "CSE", "CS", "EEE", "ECE", "BBA", "ARC", "PHR", "ANT"}));
        jDepartment.addActionListener(this::jDepartmentActionPerformed);

        jLabel3.setFont(new Font("Consolas", Font.BOLD, 14)); // NOI18N
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setText("Department");

        jLabel4.setFont(new Font("Consolas", Font.BOLD, 14)); // NOI18N
        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setText("Slot");

        jSlot.setFont(new Font("Consolas", Font.PLAIN, 14)); // NOI18N
        jSlot.setModel(new DefaultComboBoxModel<>(new String[]{"Select", "1", "2", "3"}));
        jSlot.addActionListener(this::jSlotActionPerformed);

        jLabel5.setFont(new Font("Consolas", Font.BOLD, 14)); // NOI18N
        jLabel5.setForeground(new Color(255, 255, 255));
        jLabel5.setText("Year");

        submit.setText("Submit");
        submit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });
        submit.addActionListener(this::submitActionPerformed);

        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(this::jButtonExitActionPerformed);

        jButtonLogOut.setText("Log Out");
        jButtonLogOut.addActionListener(this::jButtonLogOutActionPerformed);

        jLabel6.setFont(new Font("Consolas", Font.BOLD, 14)); // NOI18N
        jLabel6.setForeground(new Color(255, 255, 255));
        jLabel6.setText("Father's Name");

        jFatherName.setFont(new Font("Consolas", Font.PLAIN, 14)); // NOI18N
        jScrollPane3.setViewportView(jFatherName);

        jLabel7.setFont(new Font("Consolas", Font.BOLD, 14)); // NOI18N
        jLabel7.setForeground(new Color(255, 255, 255));
        jLabel7.setText("Contact Number");

        jMotherName.setFont(new Font("Consolas", Font.PLAIN, 14)); // NOI18N
        jScrollPane4.setViewportView(jMotherName);

        jContact.setFont(new Font("Consolas", Font.PLAIN, 14)); // NOI18N
        jScrollPane5.setViewportView(jContact);

        jLabel8.setFont(new Font("Consolas", Font.BOLD, 14)); // NOI18N
        jLabel8.setForeground(new Color(255, 255, 255));
        jLabel8.setText("Mail");

        jGender.setFont(new Font("Consolas", Font.PLAIN, 14)); // NOI18N
        jGender.setModel(new DefaultComboBoxModel<>(new String[]{"Select", "Male", "Female", "Others"}));
        jGender.addActionListener(this::jGenderActionPerformed);

        jLabel9.setFont(new Font("Consolas", Font.BOLD, 14)); // NOI18N
        jLabel9.setForeground(new Color(255, 255, 255));
        jLabel9.setText("Gender");

        jLabel10.setFont(new Font("Consolas", Font.BOLD, 14)); // NOI18N
        jLabel10.setForeground(new Color(255, 255, 255));
        jLabel10.setText("Category");

        jLabel11.setFont(new Font("Consolas", Font.BOLD, 14)); // NOI18N
        jLabel11.setForeground(new Color(255, 255, 255));
        jLabel11.setText("Mother's Name");

        jMail.setFont(new Font("Consolas", Font.PLAIN, 14)); // NOI18N
        jScrollPane6.setViewportView(jMail);

        jCategory.setFont(new Font("Consolas", Font.PLAIN, 14)); // NOI18N
        jCategory.setModel(new DefaultComboBoxModel<>(new String[]{"Select", "National", "International"}));

        jLabel12.setFont(new Font("Consolas", Font.BOLD, 24)); // NOI18N
        jLabel12.setForeground(new Color(255, 255, 255));
        jLabel12.setText("REGISTRATION FORM");

        jLabel14.setForeground(new Color(255, 255, 255));
        jLabel14.setText("Shortcut to Switch: Ctrl+Tab");

        jClock.setFont(new Font("Consolas", Font.PLAIN, 14)); // NOI18N
        jClock.setForeground(new Color(255, 255, 255));
        jClock.setText("HH:MM:SS");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(42, 42, 42).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(jLabel5, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel3, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE).addComponent(jLabel2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE).addComponent(jLabel8, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE).addComponent(jLabel9, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE).addComponent(jLabel4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jSlot, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE).addComponent(jYear, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE).addComponent(jSemester, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE).addComponent(jDepartment, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)).addGap(0, 0, Short.MAX_VALUE)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE).addGap(384, 384, 384)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel12).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE).addComponent(jName, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)))).addGap(0, 0, Short.MAX_VALUE))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE).addComponent(jLabel11)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jGender, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(jLabel10).addGap(18, 18, 18).addComponent(jCategory, 0, 1, Short.MAX_VALUE)).addComponent(jScrollPane6, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE).addComponent(jScrollPane5, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)).addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jButtonExit, GroupLayout.Alignment.TRAILING).addComponent(jButtonLogOut, GroupLayout.Alignment.TRAILING))).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGap(237, 237, 237).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jClock).addGap(155, 155, 155).addComponent(jLabel14)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(submit).addGap(0, 0, Short.MAX_VALUE))))).addGap(38, 38, 38)))));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(20, 20, 20).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jButtonExit).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jButtonLogOut).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 450, Short.MAX_VALUE).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel14).addComponent(jClock)).addGap(3, 3, 3)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel12).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)).addGap(13, 13, 13).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(jLabel6).addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(13, 13, 13).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(jLabel11).addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jScrollPane5, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addComponent(jLabel7, GroupLayout.Alignment.TRAILING)).addGap(18, 18, 18).addComponent(jLabel8)).addComponent(jScrollPane6, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel9).addComponent(jCategory, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addComponent(jLabel10).addComponent(jGender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(34, 34, 34).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel3).addComponent(jDepartment, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel2).addComponent(jSemester, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel4).addComponent(jSlot, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(17, 17, 17).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addComponent(jLabel5)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(submit).addGap(0, 0, Short.MAX_VALUE)))));

        jAbout.addTab("New", jPanel1);

        jPanel4.setBackground(new Color(21, 110, 198));

        jButtonExit1.setFont(new Font("Consolas", Font.PLAIN, 14)); // NOI18N
        jButtonExit1.setText("Exit");
        jButtonExit1.addActionListener(this::jButtonExit1ActionPerformed);

        jButtonLogOut1.setFont(new Font("Consolas", Font.PLAIN, 14)); // NOI18N
        jButtonLogOut1.setText("Log Out");
        jButtonLogOut1.addActionListener(this::jButtonLogOut1ActionPerformed);

        jSearchByID.setFont(new Font("Consolas", Font.PLAIN, 14)); // NOI18N
        jSearchByID.setText("Search");
        jSearchByID.addActionListener(this::jSearchByIDActionPerformed);

        jSearch.setFont(new Font("Consolas", Font.PLAIN, 14)); // NOI18N
        jScrollPane2.setViewportView(jSearch);

        jButtonClear.setFont(new Font("Consolas", Font.PLAIN, 14)); // NOI18N
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(this::jButtonClearActionPerformed);

        jOutputTable.setFont(new Font("Consolas", Font.PLAIN, 14)); // NOI18N
        jOutputTable.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{{"ID", null}, {"Name", null}, {"Father's Name", null}, {"Mother's Name", null}, {"Contact", null}, {"Mail", null}, {"Gender", null}, {"Catagory", null}, {"Department", null}, {"Semester", null}, {"Slot", null}, {"Year", null}, {"G-Suit", null}}, new String[]{"Type", "Information"}) {
            final boolean[] canEdit = new boolean[]{false, false};

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jOutputTable.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        jOutputTable.setRowHeight(18);
        jScrollPane7.setViewportView(jOutputTable);

        jLabel13.setFont(new Font("Consolas", Font.PLAIN, 24)); // NOI18N
        jLabel13.setForeground(new Color(255, 255, 255));
        jLabel13.setText("SEARCH BY ANY UNIQUE INFORMATION");

        jClock1.setFont(new Font("Consolas", Font.PLAIN, 14)); // NOI18N
        jClock1.setForeground(new Color(255, 255, 255));
        jClock1.setText("HH:MM:SS");

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(jButtonLogOut1).addComponent(jButtonExit1)).addGap(57, 57, 57)).addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addGap(29, 29, 29).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel13).addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 591, GroupLayout.PREFERRED_SIZE).addComponent(jScrollPane7, GroupLayout.PREFERRED_SIZE, 591, GroupLayout.PREFERRED_SIZE))).addGroup(jPanel4Layout.createSequentialGroup().addGap(182, 182, 182).addComponent(jSearchByID, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE).addGap(26, 26, 26).addComponent(jButtonClear)).addGroup(jPanel4Layout.createSequentialGroup().addGap(299, 299, 299).addComponent(jClock1))).addContainerGap(59, Short.MAX_VALUE)));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addGap(24, 24, 24).addComponent(jButtonExit1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jButtonLogOut1).addGap(5, 5, 5).addComponent(jLabel13).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jButtonClear).addComponent(jSearchByID)).addGap(18, 18, 18).addComponent(jScrollPane7, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE).addComponent(jClock1).addGap(0, 0, 0)));

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        jAbout.addTab("Search", jPanel2);

        jPanel5.setBackground(new Color(21, 110, 198));

        jButtonExit2.setText("Exit");
        jButtonExit2.addActionListener(this::jButtonExit2ActionPerformed);

        jButtonLogOut2.setText("Log Out");
        jButtonLogOut2.addActionListener(this::jButtonLogOut2ActionPerformed);

        jLabel15.setFont(new Font("Consolas", Font.BOLD, 18)); // NOI18N
        jLabel15.setText("Student Registration and ID Generator");

        jFinalComment.setFont(new Font("Consolas", Font.PLAIN, 14)); // NOI18N
        jFinalComment.setText("<html>\n<br>This application was created only for learning purpose and for submitting it as a project.<br/>\n<br>For sourcecode - https://github.com/tanviranindo/IDGenerator<br/>\n<br>This application was created by a BRACU Student (19101268)<br/>\n<br>Thanks to - Sir Tawhid Anwar,Tanjid Ahmed, Tashdid Jonayed<br/>\n</html>");

        GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addGap(69, 69, 69).addComponent(jLabel15)).addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addComponent(jFinalComment, GroupLayout.PREFERRED_SIZE, 489, GroupLayout.PREFERRED_SIZE))).addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addComponent(jLabel15).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jFinalComment, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE).addGap(49, 49, 49)));

        jClock2.setFont(new Font("Consolas", Font.PLAIN, 14)); // NOI18N
        jClock2.setForeground(new Color(255, 255, 255));
        jClock2.setText("HH:MM:SS");

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap(87, Short.MAX_VALUE).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup().addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jButtonExit2, GroupLayout.Alignment.TRAILING).addComponent(jButtonLogOut2, GroupLayout.Alignment.TRAILING)).addContainerGap()).addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup().addComponent(jClock2).addGap(294, 294, 294)).addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup().addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addGap(83, 83, 83)))));
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(jButtonExit2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jButtonLogOut2).addGap(53, 53, 53).addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE).addComponent(jClock2).addGap(0, 0, 0)));

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 679, Short.MAX_VALUE).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 543, Short.MAX_VALUE).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jAbout.addTab("About", jPanel3);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(0, 0, 0).addComponent(jAbout, GroupLayout.PREFERRED_SIZE, 642, GroupLayout.PREFERRED_SIZE)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jAbout, GroupLayout.Alignment.TRAILING));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogOut1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonLogOut1ActionPerformed
        loginPage.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonLogOut1ActionPerformed

    private void jButtonExit1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonExit1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExit1ActionPerformed

    private void jButtonExit2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonExit2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExit2ActionPerformed

    private void jButtonLogOut2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonLogOut2ActionPerformed
        loginPage.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonLogOut2ActionPerformed

    private void jButtonClearActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        jSearch.setText(null);
        for (int i = 0; i < 13; i++) {
            jOutputTable.setValueAt(null, i, 1);
        }
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jSearchByIDActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jSearchByIDActionPerformed
        String search = jSearch.getText();
        try {
            SearchFromCSV.SearchByID(search);
            String[] forOutput = SearchFromCSV.SearchByID(search);
            for (int i = 0; i < 13; i++) {
                jOutputTable.setValueAt(forOutput[i], i, 1);
            }
        } catch (IOException ex) {
            Logger.getLogger(StudentInformationJar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jSearchByIDActionPerformed

    private void jGenderActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGenderActionPerformed

    private void jButtonLogOutActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
        loginPage.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonLogOutActionPerformed

    private void jButtonExitActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void submitActionPerformed(ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String[] pass = new String[11];
        pass[0] = jName.getText();
        pass[1] = jFatherName.getText();
        pass[2] = jMotherName.getText();
        pass[3] = jContact.getText();
        pass[4] = jMail.getText();
        pass[5] = String.valueOf(jGender.getSelectedIndex());
        pass[6] = String.valueOf(jCategory.getSelectedIndex());
        pass[7] = String.valueOf(jDepartment.getSelectedIndex());
        pass[8] = String.valueOf(jSemester.getSelectedIndex());
        pass[9] = String.valueOf(jSlot.getSelectedIndex());
        pass[10] = String.valueOf(jYear.getSelectedIndex());

        try {
            Tester.nonMain(pass);
            resetSet();
        } catch (IOException e) {
            Logger.getLogger(StudentInformationJar.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void submitMouseClicked(MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
        JOptionPane.showMessageDialog(null, "Successfully saved!", "Success", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_submitMouseClicked

    private void jSlotActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jSlotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSlotActionPerformed

    private void jDepartmentActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDepartmentActionPerformed

    private void jSemesterActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jSemesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSemesterActionPerformed

    private void jYearActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jYearActionPerformed

    private void resetSet() {
        jName.setText(null);
        jFatherName.setText(null);
        jMotherName.setText(null);
        jContact.setText(null);
        jMail.setText(null);
        jGender.setSelectedIndex(0);
        jCategory.setSelectedIndex(0);
        jDepartment.setSelectedIndex(0);
        jSemester.setSelectedIndex(0);
        jSlot.setSelectedIndex(0);
        jYear.setSelectedIndex(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void nonMain(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold default state="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentInformationJar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(() -> {
            student = new StudentInformationJar();
            student.setVisible(true);
        });
    }

    private JComboBox<String> jCategory;
    private JLabel jClock;
    private JLabel jClock1;
    private JLabel jClock2;
    private JTextPane jContact;
    private JComboBox<String> jDepartment;
    private JTextPane jFatherName;
    private JComboBox<String> jGender;
    private JTextPane jMail;
    private JTextPane jMotherName;
    private JTextField jName;
    private JTable jOutputTable;
    private JTextPane jSearch;
    private JComboBox<String> jSemester;
    private JComboBox<String> jSlot;
    private JComboBox<String> jYear;
    // End of variables declaration//GEN-END:variables

}
