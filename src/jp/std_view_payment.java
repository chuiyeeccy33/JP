/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jasmi
 */
public class std_view_payment extends javax.swing.JFrame {
  String username = "";
    String idstd = "";
    /**
     * Creates new form std_view_payment
     */
    public std_view_payment(String user, String stdid) {
        initComponents();
        setTitle("Health Care Fees Payment System");
         this.setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        view_payment.setDragEnabled(false);
        view_payment.setDefaultEditor(Object.class, null);
        username = user;
        idstd = stdid;
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        view_payment = new javax.swing.JTable();
        btnreturn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbltitle = new javax.swing.JLabel();
        lbltitle1 = new javax.swing.JLabel();
        btnpaid = new javax.swing.JButton();
        btnnotpaid = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        view_payment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(view_payment);

        btnreturn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnreturn.setText("Return");
        btnreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreturnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 99, 71));

        lbltitle.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle.setText("View");

        lbltitle1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbltitle1.setText("Payment");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lbltitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltitle1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnpaid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnpaid.setText("View Paid");
        btnpaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpaidActionPerformed(evt);
            }
        });

        btnnotpaid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnnotpaid.setText("View Not Paid");
        btnnotpaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnotpaidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 585, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnnotpaid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnpaid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnreturn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnreturn)
                .addGap(3, 3, 3)
                .addComponent(btnpaid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnnotpaid)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreturnActionPerformed
        new std_button(username,idstd).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnreturnActionPerformed

    private void btnpaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpaidActionPerformed

        String filepath = "C:\\Users\\jasmi\\Documents\\NetBeansProjects\\JP\\Payment.txt";
        File file = new File(filepath);
        BufferedReader br;

        try {

            br = new BufferedReader (new FileReader(file));

            String[] columnName = {"Made by Staff", "Payment ID", "Student ID", "Course" , "Trainer", "Month", "Fee", "Pay Amount", "Balance"};

            DefaultTableModel model = (DefaultTableModel)view_payment.getModel();
            model.setColumnIdentifiers(columnName);
            model.setRowCount(0); //clear the model
            view_payment.revalidate(); //refresh the table

            Object[] details = br.lines().toArray();
            for (Object detail : details) {
                String line = detail.toString().trim();
                String[] row = line.split(",");
                if (idstd.equals(row[2])) {
                model.addRow(row);
                }
            }

        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(view_trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnpaidActionPerformed

    private void btnnotpaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnotpaidActionPerformed

        String filepath = "C:\\Users\\jasmi\\Documents\\NetBeansProjects\\JP\\Charges.txt";
        File file = new File(filepath);
        BufferedReader br;

        try {
            br = new BufferedReader (new FileReader(file));

            String[] columnName = {"Charge ID", "Student ID", "Course" , "Trainer", "Month", "Fee"};

            DefaultTableModel model = (DefaultTableModel)view_payment.getModel();
            model.setColumnIdentifiers(columnName);
            model.setRowCount(0); //clear the model
            view_payment.revalidate(); //refresh the table

            Object[] details = br.lines().toArray();
            for (Object detail : details) {
                String line = detail.toString().trim();
                String[] row = line.split(",");
                if (idstd.equals(row[1])) {
                     model.addRow(row);
                }
               

            }

        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(view_trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnnotpaidActionPerformed

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
            java.util.logging.Logger.getLogger(std_view_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(std_view_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(std_view_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(std_view_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnnotpaid;
    private javax.swing.JButton btnpaid;
    private javax.swing.JButton btnreturn;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lbltitle1;
    private javax.swing.JTable view_payment;
    // End of variables declaration//GEN-END:variables
}
