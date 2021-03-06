/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementportal;

import java.awt.Component;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
/**
 *
 * @author Lupe
 */
public class ViewResidentReports extends javax.swing.JFrame {
    final String myDBURL = "jdbc:sqlserver://sql5008.site4now.net:1433;DatabaseName=DB_A47087_smgroup;user=DB_A47087_smgroup_admin;password=ftccgroup1";
    
    private static Connection conn = null;
    private static Statement statement = null;
    /**
     * Creates new form ViewResidentReports
     */
    public ViewResidentReports() {
        initComponents();
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
        ResidentTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jcbResReports = new javax.swing.JComboBox<>();
        jbtnReports = new javax.swing.JButton();
        btnMain = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Viewing Resident Reports");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("View Resident Reports");

        ResidentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ResidentTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(ResidentTable);

        jLabel2.setText("Types of Reports");

        jcbResReports.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Residents", "Current Residents", "Longest Stay Residents", "Disabled Residents", "Avaliable Beds and Lockers", "Expected Residents" }));

        jbtnReports.setText("Generate Report");
        jbtnReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReportsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jcbResReports, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jbtnReports)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jcbResReports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jbtnReports))
        );

        btnMain.setText("Back to Main Menu");
        btnMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(444, 444, 444))))
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(350, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMain)
                .addGap(434, 434, 434))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMain)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Vector<String> columnNames = new Vector<String>();
        Vector<Object> data = new Vector<Object>();
        try
        {
            conn = DriverManager.getConnection(myDBURL);
            statement = conn.createStatement();
            
            ResultSet residents = statement.executeQuery("SELECT * FROM [DB_A47087_smgroup].[dbo].[Resident]");
            ResultSetMetaData residentsMD = residents.getMetaData();
            int columns = residentsMD.getColumnCount();
            
            //Get the data from database
            for (int i = 1; i <= columns; i++)
            {
                columnNames.addElement( residentsMD.getColumnName(i) );
            }
            
            while (residents.next()) 
            {
                Vector<Object> vector = new Vector<Object>();
                for (int columnIndex = 1; columnIndex <= columns; columnIndex++) {
                    vector.add(residents.getObject(columnIndex));
                }
                data.add(vector);
            }
            
            DefaultTableModel resModel = new DefaultTableModel(data,columnNames);
            ResidentTable.setModel(resModel);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        finally 
        {
            try 
            {
                conn.close();
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(ManagementPortal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jbtnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReportsActionPerformed
        // TODO add your handling code here:
        String sql = "";
        switch(jcbResReports.getSelectedIndex())
        {
            case 0:
               sql = "SELECT * FROM [DB_A47087_smgroup].[dbo].[Resident]";
               break;
            case 1:
                sql = "";
                break;
            case 2:
                sql = "";
                break;
            case 3:
                sql = "";
                break;
            case 4:
                sql = "";
                break;
            case 5:
                sql = "";
                break;
            
        }
        
        Vector<String> columnNames = new Vector<String>();
        Vector<Object> data = new Vector<Object>();
        try
        {
            conn = DriverManager.getConnection(myDBURL);
            statement = conn.createStatement();
            
            ResultSet residents = statement.executeQuery(sql);
            ResultSetMetaData residentsMD = residents.getMetaData();
            int columns = residentsMD.getColumnCount();
            
            //Get the data from database
            for (int i = 1; i <= columns; i++)
            {
                columnNames.addElement( residentsMD.getColumnName(i) );
            }
            
            while (residents.next()) 
            {
                Vector<Object> vector = new Vector<Object>();
                for (int columnIndex = 1; columnIndex <= columns; columnIndex++) {
                    vector.add(residents.getObject(columnIndex));
                }
                data.add(vector);
            }
            
            DefaultTableModel resModel = new DefaultTableModel(data,columnNames);
            ResidentTable.setModel(resModel);
            ResidentTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            TableColumnAdjuster tca = new TableColumnAdjuster(ResidentTable);
            tca.adjustColumns();
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        finally 
        {
            try 
            {
                conn.close();
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(ManagementPortal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jbtnReportsActionPerformed

    private void btnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainActionPerformed
        this.setVisible(false);
        MainMenu main = new MainMenu();
        main.setVisible(true);
    }//GEN-LAST:event_btnMainActionPerformed

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
            java.util.logging.Logger.getLogger(ViewResidentReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewResidentReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewResidentReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewResidentReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewResidentReports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ResidentTable;
    private javax.swing.JButton btnMain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnReports;
    private javax.swing.JComboBox<String> jcbResReports;
    // End of variables declaration//GEN-END:variables
}
