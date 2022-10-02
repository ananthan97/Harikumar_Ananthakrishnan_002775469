/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Employee;
import model.Employees;

/**
 *
 * @author Ananthakrishnan H
 */
public class AddEmployee extends javax.swing.JPanel {

    /**
     * Creates new form AddEmployee
     */
    Employees EmployeeList;
    Image image;
    public AddEmployee(Employees EmployeeList) {
        initComponents();
        this.EmployeeList = EmployeeList;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        EmployeeIdLabel = new javax.swing.JLabel();
        EmpIdTextField = new javax.swing.JTextField();
        AgeTextField = new javax.swing.JTextField();
        AgeLabel = new javax.swing.JLabel();
        GenderLabel = new javax.swing.JLabel();
        GenderTextField = new javax.swing.JTextField();
        StartDateLabel = new javax.swing.JLabel();
        StartDateTextField = new javax.swing.JTextField();
        LevelLabel = new javax.swing.JLabel();
        LevelTextField = new javax.swing.JTextField();
        TeamInfoTextField = new javax.swing.JTextField();
        TeamInfoLabel = new javax.swing.JLabel();
        PositionLabel = new javax.swing.JLabel();
        PositionTitleTextField = new javax.swing.JTextField();
        PhoneNumberLabel = new javax.swing.JLabel();
        PhoneNumberTextField = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();
        PhotoLabel = new javax.swing.JLabel();
        imgDisplayLabel = new javax.swing.JLabel();
        BrowseButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Employee");

        NameLabel.setText("Name");

        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });

        EmployeeIdLabel.setText("Employee ID");

        EmpIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpIdTextFieldActionPerformed(evt);
            }
        });

        AgeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeTextFieldActionPerformed(evt);
            }
        });

        AgeLabel.setText("Age");

        GenderLabel.setText("Gender");

        GenderTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderTextFieldActionPerformed(evt);
            }
        });

        StartDateLabel.setText("Start Date");

        StartDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartDateTextFieldActionPerformed(evt);
            }
        });

        LevelLabel.setText("Level");

        LevelTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LevelTextFieldActionPerformed(evt);
            }
        });

        TeamInfoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeamInfoTextFieldActionPerformed(evt);
            }
        });

        TeamInfoLabel.setText("Team Info");

        PositionLabel.setText("Position Title");

        PositionTitleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PositionTitleTextFieldActionPerformed(evt);
            }
        });

        PhoneNumberLabel.setText("Cell Phone Number");

        PhoneNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberTextFieldActionPerformed(evt);
            }
        });

        EmailLabel.setText("Email Address");

        EmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextFieldActionPerformed(evt);
            }
        });

        PhotoLabel.setText("Photo");

        imgDisplayLabel.setOpaque(true);

        BrowseButton.setText("Browse");
        BrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseButtonActionPerformed(evt);
            }
        });

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EmployeeIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(AgeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(GenderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(StartDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(LevelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(TeamInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(PositionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(PhoneNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(EmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(PhotoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PhoneNumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(PositionTitleTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(TeamInfoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(LevelTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(StartDateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(GenderTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(AgeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(EmpIdTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(NameTextField)
                            .addComponent(EmailTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(imgDisplayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addComponent(BrowseButton)
                        .addGap(0, 175, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(SaveButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BrowseButton, SaveButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BrowseButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmployeeIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StartDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StartDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LevelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TeamInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TeamInfoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PositionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PositionTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PhotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imgDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(72, 72, 72)
                .addComponent(SaveButton)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BrowseButton, SaveButton});

    }// </editor-fold>//GEN-END:initComponents

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextFieldActionPerformed

    private void EmpIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpIdTextFieldActionPerformed

    private void AgeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeTextFieldActionPerformed

    private void GenderTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderTextFieldActionPerformed

    private void StartDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartDateTextFieldActionPerformed

    private void LevelTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LevelTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LevelTextFieldActionPerformed

    private void TeamInfoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeamInfoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TeamInfoTextFieldActionPerformed

    private void PositionTitleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PositionTitleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PositionTitleTextFieldActionPerformed

    private void PhoneNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumberTextFieldActionPerformed

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextFieldActionPerformed

    private void BrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser browseImageFile = new JFileChooser();
        FileNameExtensionFilter fileNameExtensionFilter = new FileNameExtensionFilter("IMAGES","png","jpg","jpeg");
        browseImageFile.addChoosableFileFilter(fileNameExtensionFilter);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
        if(showOpenDialogue == JFileChooser.APPROVE_OPTION){
            File selectedImageFile = browseImageFile.getSelectedFile();
            String selectedImageFilePath = selectedImageFile.getAbsolutePath();
            JOptionPane.showMessageDialog(null, selectedImageFilePath);
            ImageIcon imageIcon = new ImageIcon(selectedImageFilePath);
            image = imageIcon.getImage().getScaledInstance(imgDisplayLabel.getWidth(), imgDisplayLabel.getHeight(), Image.SCALE_SMOOTH);
            imgDisplayLabel.setIcon(new ImageIcon(image));
        }
    }//GEN-LAST:event_BrowseButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:
        String Name = NameTextField.getText();
        String EmployeeId = EmpIdTextField.getText();
        int Age = Integer.parseInt(AgeTextField.getText());
        String Gender = GenderTextField.getText();
        String StartDate = StartDateTextField.getText();
        String Level = LevelTextField.getText();
        String TeamInfo = TeamInfoTextField.getText();
        String PostionTitle = PositionTitleTextField.getText();
        double CellPhoneNumber = Double.parseDouble(PhoneNumberTextField.getText());
        String email = EmailTextField.getText();
        Image Photo = image;
        
        Employee employee = EmployeeList.addNewEmployee();
        employee.setName(Name);
        employee.setEmployeeID(EmployeeId);
        employee.setAge(Age);
        employee.setGender(Gender);
        employee.setStartDate(StartDate);
        employee.setLevel(Level);
        employee.setTeamInfo(TeamInfo);
        employee.setPositionTitle(PostionTitle);
        employee.setCellPhoneNumber(CellPhoneNumber);
        employee.setEmail(email);
        employee.setPhoto(Photo);
        JOptionPane.showMessageDialog(this, "New Employee Added");
        
        NameTextField.setText("");
        EmpIdTextField.setText("");
        AgeTextField.setText("");
        GenderTextField.setText("");
        StartDateTextField.setText("");
        LevelTextField.setText("");
        TeamInfoTextField.setText("");
        PositionTitleTextField.setText("");
        PhoneNumberTextField.setText("");
        EmailTextField.setText("");
        imgDisplayLabel.setIcon(null);
        imgDisplayLabel.revalidate();
        
        
    }//GEN-LAST:event_SaveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JTextField AgeTextField;
    private javax.swing.JButton BrowseButton;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JTextField EmpIdTextField;
    private javax.swing.JLabel EmployeeIdLabel;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JTextField GenderTextField;
    private javax.swing.JLabel LevelLabel;
    private javax.swing.JTextField LevelTextField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel PhoneNumberLabel;
    private javax.swing.JTextField PhoneNumberTextField;
    private javax.swing.JLabel PhotoLabel;
    private javax.swing.JLabel PositionLabel;
    private javax.swing.JTextField PositionTitleTextField;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel StartDateLabel;
    private javax.swing.JTextField StartDateTextField;
    private javax.swing.JLabel TeamInfoLabel;
    private javax.swing.JTextField TeamInfoTextField;
    private javax.swing.JLabel imgDisplayLabel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
