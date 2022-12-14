/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.student_management;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ScoreList extends javax.swing.JFrame {

    ListSubject listSubject = new ListSubject();
    ArrayList<String> listIDSubject = new ArrayList<>();
    ListStudent listStudent = new ListStudent();
    ArrayList<String> listIDStudent = new ArrayList<>();
    ListScore listScore = new ListScore();
    DefaultTableModel defaultTableModel;

    /**
     * Creates new form ScoreList
     */
    public ScoreList() {
        initComponents();
        listSubject.insert();
        listStudent.insert();
        listScore.insert();
        //  listIDSubject=listSubject.returnIDSubject();
        showComboBoxData();
        showComboBoxData1();
        defaultTableModel = (DefaultTableModel) scoreTable.getModel();
        display();
    }

    public void display() {
        if (listScore.getSize() != 0) {
            for (int i = 0; i < listScore.getSize(); i++) {
                showTable((i + 1), listScore.getScoreAtIndex(i));
            }
        }
    }

    public void showTable(int i, ScoreOfStudent s) {
        defaultTableModel.addRow(new Object[]{
            i, s.getIdStudent(), s.getIdSub(), s.getSoTin(), s.getDiemQT(), s.getDiemGK(), s.getDiemKTHP(), s.getDiemTB()
        });
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
        jButton1 = new javax.swing.JButton();
        studentIDLabel = new javax.swing.JLabel();
        studentIdComboBox = new javax.swing.JComboBox<>();
        subjectIDLabel = new javax.swing.JLabel();
        soTinLabel = new javax.swing.JLabel();
        soTinTextFiled = new javax.swing.JTextField();
        diemQTLabel = new javax.swing.JLabel();
        diemQTTextField = new javax.swing.JTextField();
        diemGKLabel = new javax.swing.JLabel();
        diemGKTextField = new javax.swing.JTextField();
        diemKTHPLabel = new javax.swing.JLabel();
        diemKTHPTextField = new javax.swing.JTextField();
        insertScoreButton = new javax.swing.JButton();
        deleteScoreButton = new javax.swing.JButton();
        searchScoreButton = new javax.swing.JButton();
        editScoreButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        scoreTable = new javax.swing.JTable();
        resetScoreButton = new javax.swing.JButton();
        deleteAllScoreButton = new javax.swing.JButton();
        sortByScoreButton = new javax.swing.JButton();
        subjecttIdComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Score List");

        jButton1.setText("Back score");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        studentIDLabel.setText("Student ID");

        studentIdComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdComboBoxActionPerformed(evt);
            }
        });

        subjectIDLabel.setText("Subject ID");

        soTinLabel.setText("So Tin");

        diemQTLabel.setText("diemQT");

        diemGKLabel.setText("diemGK");

        diemKTHPLabel.setText("diemKTHP");

        insertScoreButton.setText("Insert");
        insertScoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertScoreButtonActionPerformed(evt);
            }
        });

        deleteScoreButton.setText("Delete");
        deleteScoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteScoreButtonActionPerformed(evt);
            }
        });

        searchScoreButton.setText("Search");
        searchScoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchScoreButtonActionPerformed(evt);
            }
        });

        editScoreButton.setText("Edit");
        editScoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editScoreButtonActionPerformed(evt);
            }
        });

        scoreTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stt", "Student ID", "Subject ID", "so Tin", "diemQT", "diemGK", "diemKTHP", "diemTB"
            }
        ));
        jScrollPane1.setViewportView(scoreTable);

        resetScoreButton.setText("Reset");

        deleteAllScoreButton.setText("Delete all");

        sortByScoreButton.setText("Sort By Score");
        sortByScoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByScoreButtonActionPerformed(evt);
            }
        });

        subjecttIdComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjecttIdComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(studentIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(studentIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(275, 275, 275)
                                .addComponent(diemQTLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(diemQTTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subjectIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(soTinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(soTinTextFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(subjecttIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(275, 275, 275)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(diemGKLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(diemGKTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(diemKTHPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(diemKTHPTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)))))
                        .addGap(115, 115, 115))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resetScoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(insertScoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deleteScoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sortByScoreButton))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteAllScoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editScoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(118, 118, 118)
                        .addComponent(searchScoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(studentIdComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(studentIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(diemQTTextField)
                        .addComponent(diemQTLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(subjectIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(subjecttIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(diemGKTextField)
                        .addComponent(diemGKLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(soTinTextFiled)
                        .addComponent(soTinLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(diemKTHPTextField)
                        .addComponent(diemKTHPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchScoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteScoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertScoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editScoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteAllScoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortByScoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetScoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.toBack();
        View v = new View();
        v.setVisible(true);
        this.dispose();
        v.toFront();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteScoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteScoreButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteScoreButtonActionPerformed

    private void searchScoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchScoreButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchScoreButtonActionPerformed

    private void editScoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editScoreButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editScoreButtonActionPerformed

    private void sortByScoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByScoreButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortByScoreButtonActionPerformed

    private void studentIdComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdComboBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_studentIdComboBoxActionPerformed

    private void subjecttIdComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjecttIdComboBoxActionPerformed
        // TODO add your handling code here:
        String id = subjecttIdComboBox.getSelectedItem().toString();
        System.out.println("ID: " + id);
        int soTin = listSubject.getSoTinFromID(id);
        soTinTextFiled.setText(String.valueOf(soTin));
    }//GEN-LAST:event_subjecttIdComboBoxActionPerformed

    private void insertScoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertScoreButtonActionPerformed
        // TODO add your handling code here:\
        String idSt = studentIdComboBox.getSelectedItem().toString();
        String idSu = subjecttIdComboBox.getSelectedItem().toString();
        int soTin = Integer.parseInt(soTinTextFiled.getText().toString());
        double diemQT = Double.parseDouble(diemQTTextField.getText().toString());
        double diemGK = Double.parseDouble(diemGKTextField.getText().toString());
        double diemKTHP = Double.parseDouble(diemKTHPTextField.getText().toString());
        double diemTB = ((0.3 * diemQT) + 0.7 * diemGK) * 0.3 + 0.7 * diemKTHP;
        if (listScore.equal(idSt, idSu) == true) {
            JOptionPane.showMessageDialog(this, "This is exist in database");
        } else {
            ScoreOfStudent score = new ScoreOfStudent(idSt, idSu, soTin, diemQT, diemGK, diemKTHP, diemTB);
            listScore.add(score);
            defaultTableModel.setNumRows(0);
            display();
        }

    }//GEN-LAST:event_insertScoreButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ScoreList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScoreList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScoreList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScoreList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScoreList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteAllScoreButton;
    private javax.swing.JButton deleteScoreButton;
    private javax.swing.JLabel diemGKLabel;
    private javax.swing.JTextField diemGKTextField;
    private javax.swing.JLabel diemKTHPLabel;
    private javax.swing.JTextField diemKTHPTextField;
    private javax.swing.JLabel diemQTLabel;
    private javax.swing.JTextField diemQTTextField;
    private javax.swing.JButton editScoreButton;
    private javax.swing.JButton insertScoreButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton resetScoreButton;
    private javax.swing.JTable scoreTable;
    private javax.swing.JButton searchScoreButton;
    private javax.swing.JLabel soTinLabel;
    private javax.swing.JTextField soTinTextFiled;
    private javax.swing.JButton sortByScoreButton;
    private javax.swing.JLabel studentIDLabel;
    private javax.swing.JComboBox<String> studentIdComboBox;
    private javax.swing.JLabel subjectIDLabel;
    private javax.swing.JComboBox<String> subjecttIdComboBox;
    // End of variables declaration//GEN-END:variables

    private void showComboBoxData() {
        ArrayList<String> data = listSubject.returnIDSubject();
        for (String string : data) {
            subjecttIdComboBox.addItem(string);
        }
    }

    private void showComboBoxData1() {
        ArrayList<String> data = listStudent.getIDStudent();
        for (String string : data) {
            studentIdComboBox.addItem(string);
        }
    }
}
