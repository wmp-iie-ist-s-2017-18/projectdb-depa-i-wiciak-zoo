/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectdb;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author MICHAL
 */
public class Employees extends javax.swing.JFrame {

    /**
     * Creates new form Employees
     */
    String connector = "org.postgresql.Driver";
    String url = "jdbc:postgresql://localhost:5432/zoo";
    String user = "testuser";
    String password = "password";

    public Employees() {
        initComponents();
        centerFrame();
        fillCombo();
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
        jPanel2 = new javax.swing.JPanel();
        jPanel_edit = new javax.swing.JPanel();
        lbl_first_name = new javax.swing.JLabel();
        txt_first_name = new javax.swing.JTextField();
        lbll_last_name = new javax.swing.JLabel();
        txt_last_name = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_rmv = new javax.swing.JButton();
        btn_rst = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        lbl_first_name1 = new javax.swing.JLabel();
        box1 = new javax.swing.JComboBox<>();
        btn_assign = new javax.swing.JButton();
        btn_unassign = new javax.swing.JButton();
        btn_list = new javax.swing.JPanel();
        lbl_list = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(76, 41, 211));
        jPanel2.setPreferredSize(new java.awt.Dimension(286, 525));

        jPanel_edit.setBackground(new java.awt.Color(76, 41, 211));

        lbl_first_name.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbl_first_name.setForeground(new java.awt.Color(204, 204, 204));
        lbl_first_name.setText("First name");

        txt_first_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_first_name.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_first_name.setPreferredSize(new java.awt.Dimension(4, 20));

        lbll_last_name.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbll_last_name.setForeground(new java.awt.Color(204, 204, 204));
        lbll_last_name.setText("Last name");

        txt_last_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_last_name.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_last_name.setPreferredSize(new java.awt.Dimension(4, 20));

        btn_add.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btn_add.setText("Add");
        btn_add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.cyan, java.awt.Color.cyan, java.awt.Color.cyan, java.awt.Color.cyan));
        btn_add.setMaximumSize(new java.awt.Dimension(83, 26));
        btn_add.setMinimumSize(new java.awt.Dimension(29, 26));
        btn_add.setPreferredSize(new java.awt.Dimension(83, 26));
        btn_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_addMousePressed(evt);
            }
        });
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_rmv.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btn_rmv.setText("Remove");
        btn_rmv.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.cyan, java.awt.Color.cyan, java.awt.Color.cyan, java.awt.Color.cyan));
        btn_rmv.setMaximumSize(new java.awt.Dimension(83, 26));
        btn_rmv.setMinimumSize(new java.awt.Dimension(53, 26));
        btn_rmv.setPreferredSize(new java.awt.Dimension(83, 26));
        btn_rmv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_rmvMousePressed(evt);
            }
        });
        btn_rmv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rmvActionPerformed(evt);
            }
        });

        btn_rst.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btn_rst.setText("Clear");
        btn_rst.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.cyan, java.awt.Color.cyan, java.awt.Color.cyan, java.awt.Color.cyan));
        btn_rst.setMaximumSize(new java.awt.Dimension(83, 26));
        btn_rst.setMinimumSize(new java.awt.Dimension(36, 26));
        btn_rst.setPreferredSize(new java.awt.Dimension(83, 26));
        btn_rst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_rstMousePressed(evt);
            }
        });
        btn_rst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rstActionPerformed(evt);
            }
        });

        btn_update.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btn_update.setText("Update");
        btn_update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.cyan, java.awt.Color.cyan, java.awt.Color.cyan, java.awt.Color.cyan));
        btn_update.setMaximumSize(new java.awt.Dimension(83, 26));
        btn_update.setMinimumSize(new java.awt.Dimension(47, 26));
        btn_update.setPreferredSize(new java.awt.Dimension(83, 26));
        btn_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_updateMousePressed(evt);
            }
        });

        lbl_first_name1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbl_first_name1.setForeground(new java.awt.Color(204, 204, 204));
        lbl_first_name1.setText("Assign an animal");

        btn_assign.setText("Assign");
        btn_assign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_assignActionPerformed(evt);
            }
        });

        btn_unassign.setText("Unaasign");
        btn_unassign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_unassignActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_editLayout = new javax.swing.GroupLayout(jPanel_edit);
        jPanel_edit.setLayout(jPanel_editLayout);
        jPanel_editLayout.setHorizontalGroup(
            jPanel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_editLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_editLayout.createSequentialGroup()
                        .addGroup(jPanel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_first_name, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_last_name, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_editLayout.createSequentialGroup()
                        .addGroup(jPanel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_add, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(btn_rst, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_rmv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(59, 59, 59))))
            .addGroup(jPanel_editLayout.createSequentialGroup()
                .addGroup(jPanel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_editLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(lbl_first_name))
                    .addGroup(jPanel_editLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(lbll_last_name))
                    .addGroup(jPanel_editLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(lbl_first_name1))
                    .addGroup(jPanel_editLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_assign)
                        .addGap(12, 12, 12)
                        .addComponent(btn_unassign)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_editLayout.setVerticalGroup(
            jPanel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_editLayout.createSequentialGroup()
                .addComponent(lbl_first_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbll_last_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_first_name1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_assign)
                    .addComponent(btn_unassign))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_rmv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_rst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        btn_list.setBackground(new java.awt.Color(76, 41, 211));
        btn_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_listMousePressed(evt);
            }
        });
        btn_list.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_list.setBackground(new java.awt.Color(222, 222, 222));
        lbl_list.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbl_list.setForeground(new java.awt.Color(204, 204, 204));
        lbl_list.setText("Show all employees");
        btn_list.add(lbl_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_list, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_list, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_employee", "first_name", "last_name"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setIntercellSpacing(new java.awt.Dimension(10, 10));
        jTable1.setRowHeight(30);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        lblStatus.setBackground(new java.awt.Color(204, 204, 204));
        lblStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(204, 204, 204));
        lblStatus.setText("Status:");
        lblStatus.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(lblStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMousePressed
        // TODO add your handling code here:
        //do poprawki
        resetColor(btn_list);
        if (txt_first_name.getText().isEmpty() || txt_last_name.getText().isEmpty()) {
            lblStatus.setForeground(Color.red);
            lblStatus.setText("Enter all details!");
        } else {
            saveData();
        }
    }//GEN-LAST:event_btn_addMousePressed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_rmvMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_rmvMousePressed
        // TODO add your handling code here:
        resetColor(btn_list);
        remove();
        alterId();
    }//GEN-LAST:event_btn_rmvMousePressed

    private void btn_rmvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rmvActionPerformed

    }//GEN-LAST:event_btn_rmvActionPerformed

    private void btn_rstMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_rstMousePressed
        // TODO add your handling code here:
        clearFields();
        resetColor(btn_list);
    }//GEN-LAST:event_btn_rstMousePressed

    private void btn_rstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rstActionPerformed
        // TODO add your handling code here:
        resetColor(btn_list);
    }//GEN-LAST:event_btn_rstActionPerformed

    private void btn_updateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateMousePressed
        // TODO add your handling code here:
        resetColor(btn_list);
        update();
    }//GEN-LAST:event_btn_updateMousePressed

    private void btn_listMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listMousePressed
        // TODO add your handling code here:
        setColor(btn_list);
        loadData();

    }//GEN-LAST:event_btn_listMousePressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        txt_first_name.setText(model.getValueAt(i, 1).toString());
        txt_last_name.setText(model.getValueAt(i, 2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MousePressed

    private void btn_assignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_assignActionPerformed
        // TODO add your handling code here:
        assign();
    }//GEN-LAST:event_btn_assignActionPerformed

    private void btn_unassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_unassignActionPerformed
        // TODO add your handling code here:
        unassign();
    }//GEN-LAST:event_btn_unassignActionPerformed

    private void clearFields() {
        txt_first_name.setText("");
        txt_last_name.setText("");
        resetColor(btn_list);
    }

    private void setColor(JPanel panel) {
        panel.setBackground(new Color(135, 112, 225));
    }

    private void resetColor(JPanel panel) {
        panel.setBackground(new Color(76, 41, 211));
    }

    private void centerFrame() {
        Toolkit toolkit;
        toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    private void loadData() {
        try {
            Class.forName(connector);
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from employees order by 1;");
            {

                while (jTable1.getRowCount() > 0) {
                    ((DefaultTableModel) jTable1.getModel()).removeRow(0);
                }

                int col = rs.getMetaData().getColumnCount();

                while (rs.next()) {
                    Object[] rows = new Object[col];
                    for (int i = 1; i <= col; i++) {
                        rows[i - 1] = rs.getObject(i);
                    }
                    ((DefaultTableModel) jTable1.getModel()).insertRow(rs.getRow() - 1, rows);
                }
                rs.close();
                st.close();
                con.close();
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void saveData() {

        String first_name = txt_first_name.getText();
        String last_name = txt_last_name.getText();
        try {
            Class.forName(connector);
            try (Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement("insert into employees values(nextval('id_eseq'),?,?);")) {
                pst.setString(1, first_name);
                pst.setString(2, last_name);
                int i = pst.executeUpdate();
                if (i > 0) {
                    JOptionPane.showMessageDialog(null, "Employee added!");
                    lblStatus.setForeground(new Color(0, 179, 0));
                    lblStatus.setText("A new employee hired!");
                    loadData();
                    clearFields();
                } else {
                    JOptionPane.showMessageDialog(null, "Employee saving failed!");
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void update() {

        String first_name = txt_first_name.getText();
        String last_name = txt_last_name.getText();
        try {
            Class.forName(connector);
            int row = jTable1.getSelectedRow();
            if (jTable1.isRowSelected(row)) {
                String value = (jTable1.getModel().getValueAt(row, 0).toString());
                try (Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement("update employees set first_name = ?, last_name = ? where id_employee = " + value)) {
                    pst.setString(1, first_name);
                    pst.setString(2, last_name);
                    int i = pst.executeUpdate();
                    if (i > 0) {
                        JOptionPane.showMessageDialog(null, "Employee's data updated!");
                        lblStatus.setForeground(new Color(0, 179, 0));
                        lblStatus.setText("Data of the employee changed!");
                        loadData();
                        clearFields();
                    } else {
                        JOptionPane.showMessageDialog(null, "Employee's data saving failed!");
                    }
                    pst.close();
                    con.close();
                }
            } else {
                JOptionPane.showMessageDialog(null, "To update an employee's data you must first click on the selected row in the table.");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void remove() {
        try {
            Class.forName(connector);
            Connection con = DriverManager.getConnection(url, user, password);
            int row = jTable1.getSelectedRow();
            if (jTable1.isRowSelected(row)) {
                String value = (jTable1.getModel().getValueAt(row, 0).toString());
                String query = "delete from employees where id_employee = " + value;
                PreparedStatement pst = con.prepareStatement(query);
                pst.executeUpdate();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                loadData();
                JOptionPane.showMessageDialog(null, "The employee fired!");
                clearFields();
            } else {
                JOptionPane.showMessageDialog(null, "To remove an employee you must first click on the selected row in the table.");
            }

        } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void alterId() {
        try {
            Class.forName(connector);
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt;
            try (
                    Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    ResultSet rs = st.executeQuery("select * from employees")) {
                int id;
                if (rs.last()) {
                    id = rs.getInt("id_employee");
                    id++;
                    pstmt = con.prepareStatement("alter sequence id_eseq restart with " + id);
                    pstmt.executeUpdate();
                    pstmt.close();
                } else {
                    pstmt = con.prepareStatement("alter sequence id_eseq restart with 1");
                    pstmt.executeUpdate();
                    pstmt.close();
                }
                rs.close();
                st.close();
                con.close();
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void fillCombo() {
        try {
            Class.forName(connector);
            Connection con = DriverManager.getConnection(url, user, password);
            String sql = "SELECT * FROM animals ORDER BY 1;";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                box1.addItem(name);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void assign() {
        try {
            Class.forName(connector);
            Connection con = DriverManager.getConnection(url, user, password);
            int row = jTable1.getSelectedRow();
            if (jTable1.isRowSelected(row)) {
                int result = 1;
                String animal_name = (String) box1.getSelectedItem();
                int e_id = (int) (jTable1.getModel().getValueAt(row, 0));
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select cage_nr from animals where name = '" + animal_name + "';");
                while (rs.next()) {
                    result = rs.getInt("cage_nr");
                }
                PreparedStatement pst = con.prepareStatement("insert into employees_cages values(?,?)");
                pst.setInt(1, e_id);
                pst.setInt(2, result);
                int i = pst.executeUpdate();
                if (i > 0) {
                    JOptionPane.showMessageDialog(null, animal_name + " already has an assigned caretaker!");
                    clearFields();
                } else {
                    JOptionPane.showMessageDialog(null, "Assigning the animal failed!");
                }

            } else {
                JOptionPane.showMessageDialog(null, "First you must select an already added employee from the table.");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void unassign() {
        try {
            Class.forName(connector);
            Connection con = DriverManager.getConnection(url, user, password);
            int row = jTable1.getSelectedRow();
            if (jTable1.isRowSelected(row)) {
                int result = 1;
                String animal_name = (String) box1.getSelectedItem();
                Statement st = con.createStatement();
                String value = (jTable1.getModel().getValueAt(row, 0).toString());
                ResultSet rs = st.executeQuery("select cage_nr from animals where name = '" + animal_name + "';");
                while (rs.next()) {
                    result = rs.getInt("cage_nr");
                }
                String query = "delete from employees_cages where id_employee = " + value + " and cage_nr = " + result;
                PreparedStatement pst = con.prepareStatement(query);
                int i = pst.executeUpdate();
                if (i > 0) {
                    JOptionPane.showMessageDialog(null, "The employee stopped to look after the animal.");
                    clearFields();
                } else {
                    JOptionPane.showMessageDialog(null, "Unassigning the animal failed!\nMaybe this employee does not look after this animal");
                }
            } else {
                JOptionPane.showMessageDialog(null, "First you must select an already added employee from the table.");
            }

        } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box1;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_assign;
    private javax.swing.JPanel btn_list;
    private javax.swing.JButton btn_rmv;
    private javax.swing.JButton btn_rst;
    private javax.swing.JButton btn_unassign;
    private javax.swing.JButton btn_update;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_edit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lbl_first_name;
    private javax.swing.JLabel lbl_first_name1;
    private javax.swing.JLabel lbl_list;
    private javax.swing.JLabel lbll_last_name;
    private javax.swing.JTextField txt_first_name;
    private javax.swing.JTextField txt_last_name;
    // End of variables declaration//GEN-END:variables
}
