/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;

/**
 *
 * @author mwathsilu
 */
public class Booking extends javax.swing.JFrame {

    private double cost;

    public Booking() {
        initComponents();
        loadCarRegistrationData();
        loadCusName();
        getprice();
        displayRentedCar();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        renttbl = new javax.swing.JTable();
        cmbv = new javax.swing.JComboBox<>();
        checkind = new com.toedter.calendar.JDateChooser();
        checkoutd = new com.toedter.calendar.JDateChooser();
        pricef = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        dashlbl = new javax.swing.JLabel();
        vlbl = new javax.swing.JLabel();
        clbl = new javax.swing.JLabel();
        inlbl = new javax.swing.JLabel();
        outlbl = new javax.swing.JLabel();
        loglbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        renttxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbc = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        addbtn = new javax.swing.JButton();
        DLTbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(227, 244, 255));

        renttbl.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        renttbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Booking ID ", "Vehicle ID", "Customer ID", "Check-in Date", "Check-out Date", "Recievable"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        renttbl.setGridColor(new java.awt.Color(255, 255, 255));
        renttbl.setRowHeight(40);
        renttbl.setSelectionBackground(new java.awt.Color(51, 0, 102));
        renttbl.setSelectionForeground(new java.awt.Color(153, 204, 255));
        jScrollPane1.setViewportView(renttbl);

        cmbv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbv.setForeground(new java.awt.Color(0, 102, 153));
        cmbv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--" }));

        checkind.setForeground(new java.awt.Color(0, 102, 153));
        checkind.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        checkoutd.setForeground(new java.awt.Color(0, 102, 153));
        checkoutd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkoutd.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                checkoutdPropertyChange(evt);
            }
        });

        pricef.setBackground(new java.awt.Color(102, 153, 255));
        pricef.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pricef.setForeground(new java.awt.Color(0, 0, 153));

        jPanel2.setBackground(new java.awt.Color(51, 0, 102));

        dashlbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dashlbl.setForeground(new java.awt.Color(255, 255, 255));
        dashlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashlbl.setText("DASHBOARD");
        dashlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashlblMouseClicked(evt);
            }
        });

        vlbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        vlbl.setForeground(new java.awt.Color(255, 255, 255));
        vlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vlbl.setText("VEHICLE");
        vlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vlblMouseClicked(evt);
            }
        });

        clbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clbl.setForeground(new java.awt.Color(255, 255, 255));
        clbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clbl.setText("CUSTOMER");
        clbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clblMouseClicked(evt);
            }
        });

        inlbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        inlbl.setForeground(new java.awt.Color(255, 255, 255));
        inlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inlbl.setText("CHECK-IN");
        inlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inlblMouseClicked(evt);
            }
        });

        outlbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        outlbl.setForeground(new java.awt.Color(255, 255, 255));
        outlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        outlbl.setText("CHECK-OUT");
        outlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                outlblMouseClicked(evt);
            }
        });

        loglbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loglbl.setForeground(new java.awt.Color(255, 255, 255));
        loglbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loglbl.setText("LOGOUT");
        loglbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loglblMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dashicon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loglbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dashlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dashlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(outlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        renttxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        renttxt.setForeground(new java.awt.Color(0, 102, 153));
        renttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renttxtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Booking ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Vehicle ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Vehicle ID");

        cmbc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbc.setForeground(new java.awt.Color(0, 102, 153));
        cmbc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Check-in");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Check.out");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Recievable");

        addbtn.setBackground(new java.awt.Color(51, 0, 102));
        addbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("SAVE");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        DLTbtn.setBackground(new java.awt.Color(51, 0, 102));
        DLTbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DLTbtn.setForeground(new java.awt.Color(255, 255, 255));
        DLTbtn.setText("DELETE");
        DLTbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DLTbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 44, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(renttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkoutd, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbv, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkind, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pricef, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DLTbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(renttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkoutd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(cmbc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pricef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addbtn)
                        .addGap(27, 27, 27)
                        .addComponent(DLTbtn)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkoutdPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_checkoutdPropertyChange
        calculatePrice();        // TODO add your handling code here:
    }//GEN-LAST:event_checkoutdPropertyChange

    private void dashlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashlblMouseClicked
        Dashboard newform = new Dashboard();
        newform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newform.pack();
        newform.setVisible(true);
        dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_dashlblMouseClicked

    private void vlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vlblMouseClicked
        VehicleRegistration newform = new VehicleRegistration();
        newform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newform.pack();
        newform.setVisible(true);
        dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_vlblMouseClicked

    private void clblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clblMouseClicked
        CustomerRegistration newform = new CustomerRegistration();
        newform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newform.pack();
        newform.setVisible(true);
        dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_clblMouseClicked

    private void inlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inlblMouseClicked
        Booking newform = new Booking();
        newform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newform.pack();
        newform.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_inlblMouseClicked

    private void outlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outlblMouseClicked
        CheckOut newform = new CheckOut();
        newform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newform.pack();
        newform.setVisible(true);
        dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_outlblMouseClicked

    private void loglblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loglblMouseClicked
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to Logout?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            // User clicked "Yes", so proceed with the logout
            dispose();
            LoginForm newform = new LoginForm();
            newform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            newform.pack();
            newform.setVisible(true);
        } else {
            // User clicked "No," so take no action
        }        // TODO add your handling code here:
    }//GEN-LAST:event_loglblMouseClicked

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        saveCarToDatabase();
        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_addbtnActionPerformed

    private void DLTbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DLTbtnActionPerformed
        // Get the selected row index
        int selectedRow = renttbl.getSelectedRow();

        // Check if a row is selected
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Get the value in the first column of the selected row (assuming rentid is in the first column)
        String rentIdToDelete = renttbl.getValueAt(selectedRow, 0).toString();
        String carRegistrationToDelete = renttbl.getValueAt(selectedRow, 1).toString(); // Assuming vid is in the second column

        // Display confirmation dialog
        int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete?", "Confirm Delete", JOptionPane.YES_NO_OPTION);

        if (dialogResult == JOptionPane.YES_OPTION) {
            // Perform the delete operation in the database
            try {
                // Establish a database connection
                try (java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "")) {
                    // Prepare the delete SQL statement
                    String deleteSql = "DELETE FROM booking WHERE rentid = ?";

                    // Create a PreparedStatement with the delete SQL statement
                    try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSql)) {
                        // Set the parameter in the PreparedStatement
                        preparedStatement.setString(1, rentIdToDelete);

                        // Execute the delete statement
                        int rowsAffected = preparedStatement.executeUpdate();

                        // Check if the delete was successful
                        if (rowsAffected > 0) {
                            // Update availability to 'YES' for the corresponding car
                            String updateAvailabilitySql = "UPDATE vehicle SET availability = 'YES' WHERE vid = ?";

                            try (PreparedStatement updateStatement = connection.prepareStatement(updateAvailabilitySql)) {
                                updateStatement.setString(1, carRegistrationToDelete);
                                updateStatement.executeUpdate();
                            }

                            // Remove the selected row from the table
                            DefaultTableModel tableModel = (DefaultTableModel) renttbl.getModel();
                            tableModel.removeRow(selectedRow);

                            JOptionPane.showMessageDialog(this, "Record deleted successfully.", "Delete Successful", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(this, "Failed to delete record.", "Delete Failed", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "SQL Error", JOptionPane.ERROR_MESSAGE);
            }
        }  // TODO add your handling code here:
    }//GEN-LAST:event_DLTbtnActionPerformed

    private void renttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_renttxtActionPerformed

    private void getprice() {
        try {
            String selectedCarRegistration = cmbv.getSelectedItem().toString();
            // Establish a database connection
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "")) {
                // SQL query to retrieve the price of a car based on its registration number
                String sql = "SELECT cost FROM vehicle WHERE vid = ?";

                // Create a PreparedStatement
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, selectedCarRegistration);

                // Execute the query
                ResultSet resultSet = preparedStatement.executeQuery();

                // Check if a result is found
                if (resultSet.next()) {
                    cost = resultSet.getDouble("cost");
                    // You can now use the carPrice variable as needed
                } else {
                    System.out.println("Car not found.");
                }

                // Close the database connection
            } catch (SQLException ex) {
            }
        } catch (Exception e) {
        }
    }

    private void calculatePrice() {
        try {
            // Get the selected rental and return dates from the date pickers
            Date rentalDate = checkind.getDate();
            Date returnsDate = checkoutd.getDate();

            if (rentalDate != null && returnsDate != null) {
                // Calculate the number of milliseconds in a day
                long millisecondsPerDay = 24 * 60 * 60 * 1000;

                // Calculate the number of days between rental and return dates
                long differenceInMilliseconds = returnsDate.getTime() - rentalDate.getTime();
                int numberOfDays = (int) (differenceInMilliseconds / millisecondsPerDay);

                // Get the daily price from your database or wherever it's stored
                // You need to implement this method
                // Calculate the total price
                double totalPrice = numberOfDays * cost;
                pricef.setText("" + totalPrice);

            } else {
                // Handle the case where dates are not selected

            }
        } catch (Exception e) {

        }
    }

    private void displayRentedCar() {
        try {
            try ( // Establish a database connection
                    java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "")) {
                String sql = "SELECT rentid, vid, cid, rentin, rentout, rfee FROM booking";

                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery();

                DefaultTableModel tableModel = (DefaultTableModel) renttbl.getModel();

                while (resultSet.next()) {
                    String rentid = resultSet.getString("rentid");
                    String carRegistration = resultSet.getString("vid");
                    String customerId = resultSet.getString("cid");
                    Date rentdate = resultSet.getDate("rentin");
                    Date returndate = resultSet.getDate("rentout");
                    int RENTFEE = resultSet.getInt("rfee");

                    // Add the fetched data as a new row in the table
                    tableModel.addRow(new Object[]{rentid, carRegistration, customerId, rentdate, returndate, RENTFEE});
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    private void loadCarRegistrationData() {
        try {
            // Establish a database connection
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "")) {
                String sql = "SELECT vid FROM vehicle where availability='YES' ";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery();

                // Create a DefaultComboBoxModel to store the car registration data
                DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

                // Iterate through the result set and add car registration values to the model
                while (resultSet.next()) {
                    String vid = resultSet.getString("vid");
                    comboBoxModel.addElement(vid);
                }

                // Set the model with car registration data to the carCom JComboBox
                cmbv.setModel(comboBoxModel);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    private void loadCusName() {
        try {
            // Establish a database connection
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "")) {
                String sql = "SELECT cid FROM customer";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery();

                // Create a DefaultComboBoxModel to store the car registration data
                DefaultComboBoxModel<String> comboBoxMode2 = new DefaultComboBoxModel<>();

                // Iterate through the result set and add car registration values to the model
                while (resultSet.next()) {
                    String cid = resultSet.getString("cid");
                    comboBoxMode2.addElement(cid);
                }

                // Set the model with car registration data to the carCom JComboBox
                cmbc.setModel(comboBoxMode2);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    private void saveCarToDatabase() {

        String rentid = renttxt.getText();
        String vid = (String) cmbv.getSelectedItem();
        String cid = (String) cmbc.getSelectedItem();
        Date checkin = checkind.getDate();
        Date checkout = checkoutd.getDate();
        double price = Double.parseDouble(pricef.getText());

        try {
            try ( // Establish a database connection
                    java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "")) {
                String sql = "INSERT INTO booking ( rentid, vid, cid, rentin, rentout , rfee) VALUES (?, ?, ?, ?, ?,?)";
                String sqlupdate = "UPDATE vehicle SET availability='NO' where vid=? ";

                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                PreparedStatement preparedStatement2 = connection.prepareStatement(sqlupdate);
                preparedStatement2.setString(1, vid);
                preparedStatement.setString(1, rentid);
                preparedStatement.setString(2, vid);
                preparedStatement.setString(3, cid);
                preparedStatement.setDate(4, new java.sql.Date(checkin.getTime())); // Assuming rentdate is a java.util.Date
                preparedStatement.setDate(5, new java.sql.Date(checkout.getTime()));
                preparedStatement.setDouble(6, price);

                preparedStatement2.executeUpdate();
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Rented successfully.");
                    // Clear the input fields after successful insertion
                    renttxt.setText("");
                    cmbv.setSelectedIndex(0);
                    cmbc.setSelectedIndex(0);
                    checkind.setDate(null);
                    checkoutd.setDate(null);
                    pricef.setText("");

                    DefaultTableModel tableModel = (DefaultTableModel) renttbl.getModel();
                    tableModel.addRow(new Object[]{rentid, vid, cid, checkin, checkout, price});
                } else {
                    JOptionPane.showMessageDialog(this, "Failed Rent");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
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
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DLTbtn;
    private javax.swing.JButton addbtn;
    private com.toedter.calendar.JDateChooser checkind;
    private com.toedter.calendar.JDateChooser checkoutd;
    private javax.swing.JLabel clbl;
    private javax.swing.JComboBox<String> cmbc;
    private javax.swing.JComboBox<String> cmbv;
    private javax.swing.JLabel dashlbl;
    private javax.swing.JLabel inlbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loglbl;
    private javax.swing.JLabel outlbl;
    private javax.swing.JTextField pricef;
    private javax.swing.JTable renttbl;
    private javax.swing.JTextField renttxt;
    private javax.swing.JLabel vlbl;
    // End of variables declaration//GEN-END:variables
}
