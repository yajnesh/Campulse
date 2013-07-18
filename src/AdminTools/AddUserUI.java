/*
 * Form : AddUserUI
 * Version : 0.0.6
 * Updated: 15-08-2012
 *          18-08-2012 at 6.43 vlaidateUsername() got changed.
 *          19-08-2012 at 11.25 PM reqst afte clear.
 *          23-08-2012 at 2.53 AM validate username updated.
 *          25-08-2012 at 12.56 AM icon added
 *          3-09-2012 at 2.19 PM killing object
 * Note : No bug reported.
 */
package adminTools;

import Run.dbConnect;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Nawaf
 */
public class AddUserUI extends javax.swing.JFrame {

    /**
     * Creates new form AddUserUI
     */
    public AddUserUI() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/main_package/resources/icon.png")).getImage());
        setLocationRelativeTo(null);
        userText.requestFocus();
        adminRadio.setActionCommand("admin");
        tempAdmin.setActionCommand("tempAdmin");
        otherRadio.setActionCommand("other");
        adminRadio.doClick();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        privilageGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        displayLabel = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        addUserIcon = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        passText = new javax.swing.JTextField();
        userText = new javax.swing.JTextField();
        userLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        tempAdmin = new javax.swing.JRadioButton();
        otherRadio = new javax.swing.JRadioButton();
        adminRadio = new javax.swing.JRadioButton();
        notification = new javax.swing.JLabel();
        bad1 = new javax.swing.JLabel();
        bad2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add user");
        setName("addUserUI");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add user"));

        displayLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        displayLabel.setForeground(new java.awt.Color(0, 153, 0));
        displayLabel.setText(" ");

        clearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main_package/resources/Actions-edit-clear-icon.png"))); // NOI18N
        clearButton.setText("  Clear");
        clearButton.setToolTipText("Click to clear all form fields.");
        clearButton.setBorder(null);
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        clearButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                clearButtonFocusGained(evt);
            }
        });
        clearButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                clearButtonKeyPressed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main_package/resources/Button-Add-icon.png"))); // NOI18N
        addButton.setText("Add");
        addButton.setToolTipText("<html>\nStep 1, Fill all form fields.<br>\nStep 2, Click on add button.\n</html>");
        addButton.setBorder(null);
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addButtonMouseEntered(evt);
            }
        });
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        addButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addButtonFocusGained(evt);
            }
        });
        addButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addButtonKeyPressed(evt);
            }
        });

        addUserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main_package/resources/add_male_user.png"))); // NOI18N

        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main_package/resources/home-icon-small.png"))); // NOI18N
        homeButton.setText("Home");
        homeButton.setToolTipText("Click home button to go back to home.");
        homeButton.setBorder(null);
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeButtonMouseEntered(evt);
            }
        });
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        homeButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                homeButtonFocusGained(evt);
            }
        });
        homeButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                homeButtonKeyPressed(evt);
            }
        });

        passText.setToolTipText("Enter username (Case sensitive).");
        passText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passTextMouseEntered(evt);
            }
        });
        passText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passTextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passTextKeyReleased(evt);
            }
        });

        userText.setToolTipText("Enter username (Case sensitive).");
        userText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userTextMouseEntered(evt);
            }
        });
        userText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextActionPerformed(evt);
            }
        });
        userText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userTextFocusGained(evt);
            }
        });
        userText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userTextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userTextKeyReleased(evt);
            }
        });

        userLabel.setText("Username *:");
        userLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userLabelMouseEntered(evt);
            }
        });

        passLabel.setText("Password *:");
        passLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passLabelMouseEntered(evt);
            }
        });

        privilageGroup.add(tempAdmin);
        tempAdmin.setText("Temp admin");
        tempAdmin.setToolTipText("<html>\nPrivilege -  Temp admin<br>\nTemp admin is a temporary  admin.<br>\nMainly for data entry persons.<br>\nAdd and modify permission of student, faculty and  mark.<br>\nCan view all details.\n</html>");
        tempAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tempAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tempAdminMouseEntered(evt);
            }
        });
        tempAdmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tempAdminFocusGained(evt);
            }
        });

        privilageGroup.add(otherRadio);
        otherRadio.setText("Other");
        otherRadio.setToolTipText("<html>\nPrivilege - Other<br>\nOnly view permission.\n</html>");
        otherRadio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        otherRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                otherRadioMouseEntered(evt);
            }
        });
        otherRadio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                otherRadioFocusGained(evt);
            }
        });

        privilageGroup.add(adminRadio);
        adminRadio.setText("Admin");
        adminRadio.setToolTipText("<html>\nPrivilege - Admin<br>\nAdmin have all privilege to to add, modify and  view.\n</html>");
        adminRadio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminRadioMouseEntered(evt);
            }
        });
        adminRadio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                adminRadioFocusGained(evt);
            }
        });

        notification.setForeground(new java.awt.Color(51, 51, 251));
        notification.setText(" ");

        bad1.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        bad1.setForeground(new java.awt.Color(255, 0, 0));
        bad1.setText(" ");

        bad2.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        bad2.setForeground(new java.awt.Color(255, 0, 0));
        bad2.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addUserIcon)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(passLabel)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(userLabel)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(adminRadio)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tempAdmin)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(otherRadio)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bad2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bad1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(notification, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(displayLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {passText, userText});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addButton, clearButton, homeButton});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(displayLabel)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addUserIcon))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userLabel)
                            .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bad1))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passLabel)
                            .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bad2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminRadio)
                            .addComponent(tempAdmin)
                            .addComponent(otherRadio))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton)
                    .addComponent(homeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(notification))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addButton, clearButton, homeButton});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {passText, userText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if ("".equals(userText.getText())) {
            JOptionPane.showMessageDialog(null, "Username field cannot be empty.", "Notification", JOptionPane.INFORMATION_MESSAGE);
            userText.requestFocus();
            return;
        }
        if ("!".equals(bad1.getText())) {
            JOptionPane.showMessageDialog(null, "Please validate username.", "Notification", JOptionPane.INFORMATION_MESSAGE);
            userText.requestFocus();
            return;
        }
        if (validateUserName(userText.getText()) == false) {
            JOptionPane.showMessageDialog(null, "Username alrady used. Please try other.", "Notification", JOptionPane.INFORMATION_MESSAGE);
            userText.requestFocus();
            return;
        }
        if ("".equals(passText.getText())) {
            JOptionPane.showMessageDialog(null, "Password field cannot be empty.", "Notification", JOptionPane.INFORMATION_MESSAGE);
            passText.requestFocus();
            return;
        }
        if ("!".equals(bad2.getText())) {
            JOptionPane.showMessageDialog(null, "Please validate password.", "Notification", JOptionPane.INFORMATION_MESSAGE);
            passText.requestFocus();
            return;
        }
        String createQuery = "Insert into login (User,Pass,Privilege) values('" + (userText.getText()) + "','" + (passText.getText()) + "','" + (privilageGroup.getSelection().getActionCommand()) + "');";
        int successful = 0;

        try {
            successful = dbConnect.getCon().createStatement().executeUpdate(createQuery);
        } catch (SQLException ex) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (successful == 1) {
            String tempUserText = userText.getText();
            String tempPrvilageText = privilageGroup.getSelection().getActionCommand();
            clearButton.doClick();
            displayLabel.setText("<html><b><font color=blue>" + tempUserText + "</b><font color=green> successfully added as <b><font color=blue>" + tempPrvilageText + "</b>.</html>");
        } else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "User adding is not successful.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        homeButton.doClick();
    }//GEN-LAST:event_formWindowClosing

    private void userTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextActionPerformed
    }//GEN-LAST:event_userTextActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        notification.setText(" ");
        userText.setText(null);
        passText.setText(null);
        adminRadio.doClick();
        displayLabel.setText(" ");
        userText.requestFocus();
        bad1.setText(" ");
        bad2.setText(" ");
        userText.requestFocus();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        Run.Runner.RunnerObj.MainUIObj.show();
        this.dispose();
        Run.Runner.RunnerObj.MainUIObj.AddUserUIObj=null;
    }//GEN-LAST:event_homeButtonActionPerformed

    private void userTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userTextKeyReleased
        if (userText.getText().length() > 50) {
            Toolkit.getDefaultToolkit().beep();
            userText.setText(userText.getText().substring(0, 50));
        }
        if (!userText.getText().matches("[a-zA-Z0-9][_a-zA-Z0-9]*")) {
            bad1.setText("!");
        } else {
            bad1.setText(" ");
        }
    }//GEN-LAST:event_userTextKeyReleased

    private boolean validateUserName(String userName) {
        try {
            String sql = "Select count(*) from login where User=\"" + userName + "\"";
            ResultSet rs = dbConnect.getCon().createStatement().executeQuery(sql);
            if (rs.next()) {
                int count = rs.getInt("count(*)");
                if (count == 0) {
                    return true;
                }
            }
            rs.close();
        } catch (SQLException ex) {
            return false;
        }
        return false;
    }
    private void passTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passTextKeyReleased
        if (passText.getText().length() > 50) {
            Toolkit.getDefaultToolkit().beep();
            passText.setText(passText.getText().substring(0, 50));
        }
        if (!passText.getText().matches("[^ ][^ ]*")) {
            bad2.setText("!");
        } else {
            bad2.setText(" ");
        }
    }//GEN-LAST:event_passTextKeyReleased

    private void userTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addButton.requestFocus();
        }
    }//GEN-LAST:event_userTextKeyPressed

    private void passTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addButton.requestFocus();
        }
    }//GEN-LAST:event_passTextKeyPressed

    private void addButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addButton.doClick();
        }
    }//GEN-LAST:event_addButtonKeyPressed

    private void clearButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clearButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            clearButton.doClick();
        }
    }//GEN-LAST:event_clearButtonKeyPressed

    private void homeButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_homeButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            homeButton.doClick();
        }
    }//GEN-LAST:event_homeButtonKeyPressed

    private void userLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userLabelMouseEntered
        notification.setText("Username.");
    }//GEN-LAST:event_userLabelMouseEntered

    private void passLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passLabelMouseEntered
        notification.setText("Password.");
    }//GEN-LAST:event_passLabelMouseEntered

    private void userTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTextMouseEntered
        notification.setText("Enter username (Case sensitive).");
    }//GEN-LAST:event_userTextMouseEntered

    private void userTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userTextFocusGained
        notification.setText("Enter username (Case sensitive).");
    }//GEN-LAST:event_userTextFocusGained

    private void passTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTextMouseEntered
        notification.setText("Enter password (Case sensitive).");
    }//GEN-LAST:event_passTextMouseEntered

    private void adminRadioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminRadioMouseEntered
        notification.setText("User privilege - Admin.");
    }//GEN-LAST:event_adminRadioMouseEntered

    private void adminRadioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adminRadioFocusGained
        notification.setText("User privilege - Admin.");
    }//GEN-LAST:event_adminRadioFocusGained

    private void tempAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tempAdminMouseEntered
        notification.setText("User privilege - Temp admin.");
    }//GEN-LAST:event_tempAdminMouseEntered

    private void tempAdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tempAdminFocusGained
        notification.setText("User privilege - Temp admin.");
    }//GEN-LAST:event_tempAdminFocusGained

    private void otherRadioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otherRadioMouseEntered
        notification.setText("User privilege - Other.");
    }//GEN-LAST:event_otherRadioMouseEntered

    private void otherRadioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_otherRadioFocusGained
        notification.setText("User privilege - Other.");
    }//GEN-LAST:event_otherRadioFocusGained

    private void addButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseEntered
        notification.setText("To add new user account.");
    }//GEN-LAST:event_addButtonMouseEntered

    private void addButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addButtonFocusGained
        notification.setText("To add new user account.");
    }//GEN-LAST:event_addButtonFocusGained

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        notification.setText("To clear the form feilds.");
    }//GEN-LAST:event_clearButtonMouseClicked

    private void clearButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clearButtonFocusGained
        notification.setText("To clear the form feilds.");
    }//GEN-LAST:event_clearButtonFocusGained

    private void homeButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_homeButtonFocusGained
        notification.setText("Go back to home.");
    }//GEN-LAST:event_homeButtonFocusGained

    private void homeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseEntered
        notification.setText("Go back to home.");
    }//GEN-LAST:event_homeButtonMouseEntered
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel addUserIcon;
    private javax.swing.JRadioButton adminRadio;
    private javax.swing.JLabel bad1;
    private javax.swing.JLabel bad2;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel displayLabel;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel notification;
    private javax.swing.JRadioButton otherRadio;
    private javax.swing.JLabel passLabel;
    private javax.swing.JTextField passText;
    private javax.swing.ButtonGroup privilageGroup;
    private javax.swing.JRadioButton tempAdmin;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}