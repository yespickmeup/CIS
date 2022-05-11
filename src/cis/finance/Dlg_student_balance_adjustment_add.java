/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.finance;

import cis.academic.Academic_years;
import cis.account_types.Account_particulars;
import cis.account_types.Dlg_account_particulars;
import cis.finance.Student_balance_adjustments.to_student_balance_adjustments;
import cis.students.Students;
import cis.users.MyUser;
import cis.utils.Alert;
import cis.utils.DateType;
import cis.utils.Dlg_confirm_action;
import cis.utils.TableRenderer;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.fields.Button;
import synsoftech.fields.Field;

/**
 *
 * @author User
 */
public class Dlg_student_balance_adjustment_add extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_student_balance_adjustment_add
     */
    //<editor-fold defaultstate="collapsed" desc=" callback ">
    private Callback callback;

    public void setCallback(Callback callback) {
        this.callback = callback;

    }

    public static interface Callback {

        void ok(CloseDialog closeDialog, OutputData data);
    }

    public static class InputData {
    }

    public static class OutputData {
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_student_balance_adjustment_add(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_student_balance_adjustment_add(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_student_balance_adjustment_add() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_student_balance_adjustment_add myRef;

    private void setThisRef(Dlg_student_balance_adjustment_add myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_student_balance_adjustment_add> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_student_balance_adjustment_add create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_student_balance_adjustment_add create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_student_balance_adjustment_add dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_student_balance_adjustment_add((java.awt.Frame) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }

        }

        if (parent instanceof java.awt.Dialog) {
            Dlg_student_balance_adjustment_add dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_student_balance_adjustment_add((java.awt.Dialog) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }

        }

        return null;

    }
    //</editor-fold>    

    //<editor-fold defaultstate="collapsed" desc=" main ">
    public static void main(String args[]) {

        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Dlg_student_balance_adjustment_add dialog = Dlg_student_balance_adjustment_add.create(new javax.swing.JFrame(), true);
        dialog.setVisible(true);

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" added ">
    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible == true) {
            getContentPane().removeAll();
            initComponents();
            myInit();
            repaint();
        }

    }

    public javax.swing.JPanel getSurface() {
        return (javax.swing.JPanel) getContentPane();
    }

    public void nullify() {
        myRef.setVisible(false);
        myRef = null;
    }
    //</editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        tf_field126 = new Field.Input();
        jLabel75 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new Button.Success();
        jButton3 = new Button.Default();
        jLabel76 = new javax.swing.JLabel();
        tf_field127 = new Field.Combo();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_student_balance_adjustments = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        tf_field130 = new Field.Input();
        jLabel12 = new javax.swing.JLabel();
        tf_field5 = new Field.Input();
        jLabel14 = new javax.swing.JLabel();
        tf_field7 = new Field.Input();
        jLabel13 = new javax.swing.JLabel();
        tf_field6 = new Field.Input();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel74.setText("Enter amount:");

        tf_field126.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tf_field126.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field126MouseClicked(evt);
            }
        });
        tf_field126.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field126ActionPerformed(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel75.setText("Remarks:");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel76.setText("Particular:");

        tf_field127.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tf_field127.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field127MouseClicked(evt);
            }
        });
        tf_field127.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field127ActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Is Payable?");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Add");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_field126, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 355, Short.MAX_VALUE)
                            .addComponent(jCheckBox2)
                            .addGap(18, 18, 18)
                            .addComponent(jCheckBox1))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_field127)
                            .addGap(1, 1, 1)
                            .addComponent(jButton1))))
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field126, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field127, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        jTabbedPane1.addTab("Payable", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tbl_student_balance_adjustments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbl_student_balance_adjustments);

        jLabel1.setText("No. of rows:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Total Amount:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("0.00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Reports", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel80.setText("Student No.:");

        tf_field130.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field130.setFocusable(false);
        tf_field130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field130ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("First Name:");

        tf_field5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field5.setFocusable(false);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Last Name:");

        tf_field7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field7.setFocusable(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Middle Name:");

        tf_field6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field6.setFocusable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(tf_field130, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(tf_field5, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field6))
                    .addComponent(tf_field7))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field130, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
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
    }// </editor-fold>//GEN-END:initComponents

    private void tf_field126MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field126MouseClicked

    }//GEN-LAST:event_tf_field126MouseClicked

    private void tf_field126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field126ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field126ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        save_adjustment();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        disposed();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tf_field130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field130ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field130ActionPerformed

    private void tf_field127MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field127MouseClicked
        init_particulars();
    }//GEN-LAST:event_tf_field127MouseClicked

    private void tf_field127ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field127ActionPerformed
        init_particulars();
    }//GEN-LAST:event_tf_field127ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        add_particulars();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            jCheckBox2.setVisible(false);
        } else {
            jCheckBox2.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tbl_student_balance_adjustments;
    private javax.swing.JTextField tf_field126;
    private javax.swing.JTextField tf_field127;
    private javax.swing.JTextField tf_field130;
    private javax.swing.JTextField tf_field5;
    private javax.swing.JTextField tf_field6;
    private javax.swing.JTextField tf_field7;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        init_tbl_student_balance_adjustments(tbl_student_balance_adjustments);
        List<Academic_years.to_academic_years> acad_years = Academic_years.ret_data(" where status=1");
        if (!acad_years.isEmpty()) {
            Academic_years.to_academic_years acad = (Academic_years.to_academic_years) acad_years.get(0);
            academic_year_id1 = acad.id;
            academic_year1 = acad.years;
        }
        jCheckBox2.setVisible(false);
        ret_particulars();
    }

    int academic_year_id1 = 0;
    String academic_year1 = "";
    Students.to_students student = null;

    public void do_pass(Students.to_students stud) {
        student = stud;
        tf_field130.setText(student.student_no);
        tf_field5.setText(student.first_name);
        tf_field6.setText(student.middle_name);
        tf_field7.setText(student.last_name);
        ret_adjustments();
        tf_field126.grabFocus();
    }

    // <editor-fold defaultstate="collapsed" desc="Key">
    private void disposed() {
        ok();

    }

    private void init_key() {
        KeyMapping.mapKeyWIFW(getSurface(),
                              KeyEvent.VK_ESCAPE, new KeyAction() {

                          @Override
                          public void actionPerformed(ActionEvent e) {
                              ok1();

                          }
                      });
    }

    private void ok1() {
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData());
        }
    }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" student_balance_adjustments "> 
    public static ArrayListModel tbl_student_balance_adjustments_ALM;
    public static Tblstudent_balance_adjustmentsModel tbl_student_balance_adjustments_M;

    public static void init_tbl_student_balance_adjustments(JTable tbl_student_balance_adjustments) {
        tbl_student_balance_adjustments_ALM = new ArrayListModel();
        tbl_student_balance_adjustments_M = new Tblstudent_balance_adjustmentsModel(tbl_student_balance_adjustments_ALM);
        tbl_student_balance_adjustments.setModel(tbl_student_balance_adjustments_M);
        tbl_student_balance_adjustments.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_student_balance_adjustments.setRowHeight(25);
        int[] tbl_widths_student_balance_adjustments = {100, 120, 120, 80, 80, 80, 80, 80, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_student_balance_adjustments.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_student_balance_adjustments, i, tbl_widths_student_balance_adjustments[i]);
        }
        Dimension d = tbl_student_balance_adjustments.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_student_balance_adjustments.getTableHeader().setPreferredSize(d);
        tbl_student_balance_adjustments.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_student_balance_adjustments.setRowHeight(25);
        tbl_student_balance_adjustments.setFont(new java.awt.Font("Arial", 0, 12));
        TableWidthUtilities.setColumnRightRenderer(tbl_student_balance_adjustments, 5);
        TableWidthUtilities.setColumnRightRenderer(tbl_student_balance_adjustments, 6);
        TableWidthUtilities.setColumnRightRenderer(tbl_student_balance_adjustments, 7);
    }

    public static void loadData_student_balance_adjustments(List<to_student_balance_adjustments> acc) {
        tbl_student_balance_adjustments_ALM.clear();
        tbl_student_balance_adjustments_ALM.addAll(acc);
    }

    public static class Tblstudent_balance_adjustmentsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Date", "Particular", "Remarks", "Payable", "Type", "Amount", "Paid", "Balance", "academic_year_id", "course_id", "course_code", "course_description", "year_level", "term", "department_id", "department", "college_id", "college", "adjustment_amount", "paid", "remarks", "status", "created_at", "created_by", "updated_at", "updated_by"
        };

        public Tblstudent_balance_adjustmentsModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            if (column == 100) {
                return true;
            }
            return false;
        }

        @Override
        public Class getColumnClass(int col) {
            if (col == 1000) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            to_student_balance_adjustments tt = (to_student_balance_adjustments) getRow(row);
            switch (col) {
                case 0:
                    return " " + DateType.convert_slash_datetime(tt.created_at);
                case 1:
                    return " " + tt.particular;
                case 2:
                    return " " + tt.remarks;
                case 3:
                    if (tt.is_payable == 1) {
                        return " Yes";
                    } else {
                        return " No";
                    }
                case 4:
                    if (tt.is_add == 1) {
                        if (tt.is_payable == 1) {
                            return " ";
                        } else {
                            return " Add";
                        }

                    } else {
                        return " Deduct";
                    }
                case 5:
                    if (tt.is_payable == 0 && tt.is_add == 0) {
                        return " -" + FitIn.fmt_wc_0(tt.adjustment_amount) + " ";
                    } else {
                        return " " + FitIn.fmt_wc_0(tt.adjustment_amount) + " ";
                    }

                case 6:
                    return " " + FitIn.fmt_wc_0(tt.paid) + " ";
                case 7:
                    if (tt.is_payable == 0 && tt.is_add == 0) {
                        return " -" + FitIn.fmt_wc_0(tt.adjustment_amount) + " ";
                    } else {
                        return " " + FitIn.fmt_wc_0(tt.adjustment_amount - tt.paid) + " ";
                    }

                case 8:
                    return tt.academic_year_id;
                case 9:
                    return tt.course_id;
                case 10:
                    return tt.course_code;
                case 11:
                    return tt.course_description;
                case 12:
                    return tt.year_level;
                case 13:
                    return tt.term;
                case 14:
                    return tt.department_id;
                case 15:
                    return tt.department;
                case 16:
                    return tt.college_id;
                case 17:
                    return tt.college;
                case 18:
                    return tt.adjustment_amount;
                case 19:
                    return tt.paid;
                case 20:
                    return tt.remarks;
                case 21:
                    return tt.status;
                case 22:
                    return tt.created_at;
                case 23:
                    return tt.created_by;
                case 24:
                    return tt.updated_at;
                default:
                    return tt.updated_by;
            }
        }
    }
//</editor-fold> 

    private void ret_adjustments() {
        String where = " where student_id='" + student.id + "' ";
        List<Student_balance_adjustments.to_student_balance_adjustments> datas = Student_balance_adjustments.ret_data(where);
        loadData_student_balance_adjustments(datas);
        jLabel2.setText("" + datas.size());
        double balance = 0;
        for (Student_balance_adjustments.to_student_balance_adjustments ad : datas) {
            if (ad.is_payable == 0 && ad.is_add == 0) {
                balance -= (ad.adjustment_amount - ad.paid);
            } else {
                balance += (ad.adjustment_amount - ad.paid);
            }

        }
        jLabel4.setText("" + FitIn.fmt_wc_0(balance));
    }

    private void save_adjustment() {
        Window p = (Window) this;
        Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_confirm_action.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                closeDialog.ok();

                int id = 0;
                int student_id = student.id;
                String student_no = student.student_no;
                String fname = student.first_name;
                String mi = student.middle_name;
                String lname = student.last_name;
                int is_transferee = student.is_transferee;
                String academic_year = academic_year1;
                int academic_year_id = academic_year_id1;
                int course_id = student.course_id;
                String course_code = student.course_code;
                String course_description = student.course_description;
                String year_level = student.year_level;
                String term = "";
                int department_id = student.department_id;
                String department = student.department;
                int college_id = student.college_id;
                String college = student.college;
                double adjustment_amount = FitIn.toDouble(tf_field126.getText());
                if (adjustment_amount <= 0) {
                    Alert.set(0, "Enter amount");
                    tf_field126.grabFocus();
                    return;
                }
                double paid = 0;
                String remarks = jTextArea1.getText();
                int status = 0;
                String created_at = DateType.now();
                int created_by = FitIn.toInt(MyUser.getUser_id());
                String updated_at = DateType.now();
                int updated_by = FitIn.toInt(MyUser.getUser_id());

                Field.Combo tf = (Field.Combo) tf_field127;
                int particular_id = FitIn.toInt(tf.getId());
                String particular = tf.getText();
                int is_payable = 1;
                if (!jCheckBox1.isSelected()) {
                    is_payable = 0;
                }
                int is_add = 1;
                if (!jCheckBox2.isSelected()) {
                    is_add = 0;
                }
                Student_balance_adjustments.to_student_balance_adjustments to = new to_student_balance_adjustments(id, student_id, student_no, fname, mi, lname, is_transferee, academic_year, academic_year_id, course_id, course_code, course_description, year_level, term, department_id, department, college_id, college, adjustment_amount, paid, remarks, status, created_at, created_by, updated_at, updated_by, particular_id, particular, is_payable, is_add);
                Student_balance_adjustments.add_data(to);
                Alert.set(1, "");
                jTabbedPane1.setSelectedIndex(1);
                ret_adjustments();
            }
        }
        );
        nd.setLocationRelativeTo(
                this);
        nd.setVisible(
                true);
    }

    private void ok() {
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData());
        }
    }

    private void ret_particulars() {
        String where = " order by particular asc ";
        particulars = Account_particulars.ret_data(where);
        if (!particulars.isEmpty()) {
            Account_particulars.to_account_particulars to = (Account_particulars.to_account_particulars) particulars.get(0);
            Field.Combo tf = (Field.Combo) tf_field127;
            tf.setId("" + to.id);
            tf.setText(to.particular);

        }
    }
    List<Account_particulars.to_account_particulars> particulars = new ArrayList();

    private void init_particulars() {
        Object[][] obj = new Object[particulars.size()][1];
        int i = 0;
        for (Account_particulars.to_account_particulars to : particulars) {
            obj[i][0] = " " + to.particular;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field127.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field127, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Account_particulars.to_account_particulars to = particulars.get(data.selected_row);
                tf_field127.setText("" + to.particular);

            }
        });
    }

    private void add_particulars() {
        Window p = (Window) this;
        Dlg_account_particulars nd = Dlg_account_particulars.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_account_particulars.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_account_particulars.OutputData data) {
                closeDialog.ok();
                ret_particulars();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

}
