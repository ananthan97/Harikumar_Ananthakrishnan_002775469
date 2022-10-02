/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;
import model.Employee;
import model.Employees;

/**
 *
 * @author Ananthakrishnan H
 */
public class ViewEmployees extends javax.swing.JPanel {

    /**
     * Creates new form ViewEmployees
     */
    Employees EmployeeList;

    public ViewEmployees(Employees EmployeeList) {
        initComponents();
        this.EmployeeList = EmployeeList;
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeTable = new javax.swing.JTable();
        ViewButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        NameLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        EmployeeIDLabel = new javax.swing.JLabel();
        EmployeeIDTextField = new javax.swing.JTextField();
        AgeLabel = new javax.swing.JLabel();
        AgeTextField = new javax.swing.JTextField();
        GenderTextField = new javax.swing.JTextField();
        GenderLabel = new javax.swing.JLabel();
        StartDateTextField = new javax.swing.JTextField();
        StartDateLabel = new javax.swing.JLabel();
        LevelTextField = new javax.swing.JTextField();
        LevelLabel = new javax.swing.JLabel();
        TeamInfoTextField = new javax.swing.JTextField();
        TeamInfoLabel = new javax.swing.JLabel();
        PositionTitleLabel = new javax.swing.JLabel();
        PositionTitleTextField = new javax.swing.JTextField();
        CellPhoneNumberLabel = new javax.swing.JLabel();
        CellPhoneNumberTextField = new javax.swing.JTextField();
        EmailAddressLabel = new javax.swing.JLabel();
        EmailAddressTextField = new javax.swing.JTextField();
        PhotoLabel = new javax.swing.JLabel();
        PhotoDispLabel = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        SearchTextField = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Employees");

        EmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Employee ID", "Age", "Gender", "Start Date", "Level", "Team info", "Position Title", "Cell phone Number ", "Email address", "Photo"
            }
        ));
        jScrollPane1.setViewportView(EmployeeTable);

        ViewButton.setText("View");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        NameLabel.setText("Name");

        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });

        EmployeeIDLabel.setText("Employee ID");

        AgeLabel.setText("Age");

        GenderLabel.setText("Gender");

        StartDateLabel.setText("Start date");

        LevelLabel.setText("Level");

        TeamInfoLabel.setText("Team Info");

        PositionTitleLabel.setText("Position title");

        CellPhoneNumberLabel.setText("Cell phone number ");

        EmailAddressLabel.setText("email address");

        EmailAddressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailAddressTextFieldActionPerformed(evt);
            }
        });

        PhotoLabel.setText("Photo");

        PhotoDispLabel.setBackground(new java.awt.Color(255, 255, 255));
        PhotoDispLabel.setOpaque(true);

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jLabel2.setText("Search");

        SearchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTextFieldActionPerformed(evt);
            }
        });
        SearchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchTextFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ViewButton)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteButton)
                                .addGap(37, 37, 37)
                                .addComponent(Update)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmployeeIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StartDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LevelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TeamInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PositionTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CellPhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EmployeeIDTextField)
                                    .addComponent(AgeTextField)
                                    .addComponent(GenderTextField)
                                    .addComponent(StartDateTextField)
                                    .addComponent(LevelTextField)
                                    .addComponent(TeamInfoTextField)
                                    .addComponent(PositionTitleTextField)
                                    .addComponent(CellPhoneNumberTextField)
                                    .addComponent(EmailAddressTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(NameTextField))))
                        .addGap(0, 389, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PhotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PhotoDispLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DeleteButton, ViewButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewButton)
                    .addComponent(DeleteButton)
                    .addComponent(Update)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PhotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhotoDispLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EmployeeIDTextField)
                    .addComponent(EmployeeIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AgeTextField)
                    .addComponent(AgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GenderTextField)
                    .addComponent(GenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StartDateTextField)
                    .addComponent(StartDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LevelTextField)
                    .addComponent(LevelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TeamInfoTextField)
                    .addComponent(TeamInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PositionTitleTextField)
                    .addComponent(PositionTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CellPhoneNumberTextField)
                    .addComponent(CellPhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EmailAddressTextField)
                    .addComponent(EmailAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {DeleteButton, ViewButton});

    }// </editor-fold>//GEN-END:initComponents

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = EmployeeTable.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }
        
//        DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
        Employee selectedEmployee = (Employee) EmployeeTable.getValueAt(selectedRowIndex, 0);
        NameTextField.setText(selectedEmployee.getName());
        EmployeeIDTextField.setText(selectedEmployee.getEmployeeID());
        AgeTextField.setText(String.valueOf( selectedEmployee.getAge()));
        GenderTextField.setText(selectedEmployee.getGender());
        StartDateTextField.setText(selectedEmployee.getStartDate());
        LevelTextField.setText(selectedEmployee.getLevel());
        TeamInfoTextField.setText(selectedEmployee.getTeamInfo());
        PositionTitleTextField.setText(selectedEmployee.getPositionTitle());
        CellPhoneNumberTextField.setText(String.valueOf(selectedEmployee.getCellPhoneNumber()));
        EmailAddressTextField.setText(selectedEmployee.getEmail());
        ImageIcon imageIcon = new ImageIcon(selectedEmployee.getPhoto());
        Image image = imageIcon.getImage().getScaledInstance(PhotoDispLabel.getWidth(), PhotoDispLabel.getHeight(), Image.SCALE_SMOOTH);
        PhotoDispLabel.setIcon(new ImageIcon(image));
        
        
    }//GEN-LAST:event_ViewButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = EmployeeTable.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
        Employee selectedEmployee = (Employee) model.getValueAt(selectedRowIndex,0);
        EmployeeList.deleteEmployee(selectedEmployee);
        JOptionPane.showMessageDialog(this, "Vital signs deleted");
//        
        populateTable();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextFieldActionPerformed

    private void EmailAddressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailAddressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailAddressTextFieldActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = EmployeeTable.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to Update");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
        Employee selectedEmployee = (Employee) model.getValueAt(selectedRowIndex, 0);
        
        selectedEmployee.setName(NameTextField.getText());
        selectedEmployee.setEmployeeID(EmployeeIDTextField.getText());
        selectedEmployee.setAge(Integer.parseInt(AgeTextField.getText()));
        selectedEmployee.setGender(GenderTextField.getText());
        selectedEmployee.setStartDate(StartDateTextField.getText());
        selectedEmployee.setLevel(LevelTextField.getText());
        selectedEmployee.setTeamInfo(TeamInfoTextField.getText());
        selectedEmployee.setPositionTitle(PositionTitleTextField.getText());
        selectedEmployee.setCellPhoneNumber(Double.parseDouble(CellPhoneNumberTextField.getText()));
        selectedEmployee.setEmail(EmailAddressTextField.getText());
        
        
        
        populateTable();
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void SearchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTextFieldActionPerformed

    private void SearchTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTextFieldKeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        EmployeeTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(SearchTextField.getText().trim()));
    }//GEN-LAST:event_SearchTextFieldKeyPressed

    private void SearchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTextFieldKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        EmployeeTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(SearchTextField.getText().trim()));
    }//GEN-LAST:event_SearchTextFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JTextField AgeTextField;
    private javax.swing.JLabel CellPhoneNumberLabel;
    private javax.swing.JTextField CellPhoneNumberTextField;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel EmailAddressLabel;
    private javax.swing.JTextField EmailAddressTextField;
    private javax.swing.JLabel EmployeeIDLabel;
    private javax.swing.JTextField EmployeeIDTextField;
    private javax.swing.JTable EmployeeTable;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JTextField GenderTextField;
    private javax.swing.JLabel LevelLabel;
    private javax.swing.JTextField LevelTextField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel PhotoDispLabel;
    private javax.swing.JLabel PhotoLabel;
    private javax.swing.JLabel PositionTitleLabel;
    private javax.swing.JTextField PositionTitleTextField;
    private javax.swing.JTextField SearchTextField;
    private javax.swing.JLabel StartDateLabel;
    private javax.swing.JTextField StartDateTextField;
    private javax.swing.JLabel TeamInfoLabel;
    private javax.swing.JTextField TeamInfoTextField;
    private javax.swing.JButton Update;
    private javax.swing.JButton ViewButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
        Object[] newIdentifiers = new Object[]{"Name", "Employee ID", "Age", "Gender", "Start Date", "Level", "Team info", "Position Title", "Cell phone", "Email", "Photo"};
        model.setColumnIdentifiers(newIdentifiers);
        model.setRowCount(0);
        for (Employee employee : EmployeeList.getEmployeeList()) {

            Object[] row = new Object[11];
            row[0] = employee;
            row[1] = employee.getEmployeeID();
            row[2] = employee.getAge();
            row[3] = employee.getGender();
            row[4] = employee.getStartDate();
            row[5] = employee.getLevel();
            row[6] = employee.getTeamInfo();
            row[7] = employee.getPositionTitle();
            row[8] = employee.getCellPhoneNumber();
            row[9] = employee.getEmail();
            ImageIcon imageIcon = new ImageIcon(employee.getPhoto());
            Image Icon = imageIcon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            JLabel imageLabel = new JLabel();
            imageLabel.setIcon(new ImageIcon(Icon));
            EmployeeTable.getColumn("Photo").setCellRenderer(new myTableCellRenderer());
            row[10] = imageLabel;

            model.addRow(row);
        }
    }

    class myTableCellRenderer implements TableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            TableColumn tb = EmployeeTable.getColumn("Photo");
            tb.setMaxWidth(60);
            tb.setMinWidth(60);
            EmployeeTable.setRowHeight(60);
            return (Component) value;
        }

    }
}
