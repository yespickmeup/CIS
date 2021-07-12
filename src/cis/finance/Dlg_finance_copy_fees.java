/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.finance;

import cis.academic.Academic_year_fees;
import cis.academic.Academic_years;
import cis.colleges.Colleges;
import cis.courses.Courses;
import cis.departments.Departments;
import cis.utils.Alert;
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
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.util.ImageRenderer;

/**
 *
 * @author User
 */
public class Dlg_finance_copy_fees extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_finance_copy_fees
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

        public final List<Academic_year_fees.to_academic_year_fees> fees;

        public OutputData(List<Academic_year_fees.to_academic_year_fees> fees) {
            this.fees = fees;
        }

    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_finance_copy_fees(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_finance_copy_fees(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_finance_copy_fees() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_finance_copy_fees myRef;

    private void setThisRef(Dlg_finance_copy_fees myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_finance_copy_fees> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_finance_copy_fees create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_finance_copy_fees create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_finance_copy_fees dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_finance_copy_fees((java.awt.Frame) parent, false);
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
            Dlg_finance_copy_fees dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_finance_copy_fees((java.awt.Dialog) parent, false);
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

        Dlg_finance_copy_fees dialog = Dlg_finance_copy_fees.create(new javax.swing.JFrame(), true);
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

        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_miscellaneous_fees = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        tf_field20 = new Field.Input();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jButton10 = new Button.Success();
        jPanel7 = new javax.swing.JPanel();
        tf_field14 = new Field.Combo();
        tf_field15 = new Field.Combo();
        jLabel32 = new javax.swing.JLabel();
        tf_period = new Field.Combo();
        jLabel30 = new javax.swing.JLabel();
        tf_field16 = new Field.Combo();
        jLabel31 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        tf_field22 = new Field.Combo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tbl_miscellaneous_fees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_miscellaneous_fees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_miscellaneous_feesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_miscellaneous_fees);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Total Amount:");

        tf_field20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tf_field20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tf_field20.setText("0.00");
        tf_field20.setFocusable(false);
        tf_field20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field20MouseClicked(evt);
            }
        });
        tf_field20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field20ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("No. of rows:");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("0");

        jButton10.setText("Copy");
        jButton10.setFocusable(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tf_field14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field14.setFocusable(false);
        tf_field14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field14MouseClicked(evt);
            }
        });
        tf_field14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field14ActionPerformed(evt);
            }
        });

        tf_field15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field15.setFocusable(false);
        tf_field15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field15MouseClicked(evt);
            }
        });
        tf_field15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field15ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Period:");

        tf_period.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_period.setFocusable(false);
        tf_period.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_periodMouseClicked(evt);
            }
        });
        tf_period.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_periodActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Department:");

        tf_field16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field16.setFocusable(false);
        tf_field16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field16MouseClicked(evt);
            }
        });
        tf_field16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field16ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Year/Course:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("School Year:");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("Level/College:");

        tf_field22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field22.setFocusable(false);
        tf_field22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field22MouseClicked(evt);
            }
        });
        tf_field22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_period, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field16, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field15, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field14, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field22, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_period, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field20, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_miscellaneous_feesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_miscellaneous_feesMouseClicked

    }//GEN-LAST:event_tbl_miscellaneous_feesMouseClicked

    private void tf_field20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field20MouseClicked

    private void tf_field20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field20ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        confirm_action();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void tf_field14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field14MouseClicked
        init_academic_years(tf_field14);
    }//GEN-LAST:event_tf_field14MouseClicked

    private void tf_field14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field14ActionPerformed
        init_academic_years(tf_field14);
    }//GEN-LAST:event_tf_field14ActionPerformed

    private void tf_field15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field15MouseClicked
        init_departments();
    }//GEN-LAST:event_tf_field15MouseClicked

    private void tf_field15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field15ActionPerformed
        init_departments();
    }//GEN-LAST:event_tf_field15ActionPerformed

    private void tf_periodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_periodMouseClicked
        init_years2();
    }//GEN-LAST:event_tf_periodMouseClicked

    private void tf_periodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_periodActionPerformed
        init_years2();
    }//GEN-LAST:event_tf_periodActionPerformed

    private void tf_field16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field16MouseClicked
        init_colleges();
    }//GEN-LAST:event_tf_field16MouseClicked

    private void tf_field16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field16ActionPerformed
        init_colleges();
    }//GEN-LAST:event_tf_field16ActionPerformed

    private void tf_field22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field22MouseClicked
        init_colleges3();
    }//GEN-LAST:event_tf_field22MouseClicked

    private void tf_field22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field22ActionPerformed
        init_colleges3();
    }//GEN-LAST:event_tf_field22ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_miscellaneous_fees;
    private javax.swing.JTextField tf_field14;
    private javax.swing.JTextField tf_field15;
    private javax.swing.JTextField tf_field16;
    private javax.swing.JTextField tf_field20;
    private javax.swing.JTextField tf_field22;
    private javax.swing.JTextField tf_period;
    // End of variables declaration//GEN-END:variables

    private void myInit() {

//        System.setProperty("pool_db", "db_cis_cosca");
//        System.setProperty("pool_password", "password");
        init_key();

        acad_years = Academic_years.ret_data(" where status=1 ");
        acad_years2 = Academic_years.ret_data(" order by id asc ");
        if (!acad_years.isEmpty()) {
            for (Academic_years.to_academic_years to1 : acad_years) {
                Field.Combo year = (Field.Combo) tf_field14;
                year.setText(to1.years);
                year.setId("" + to1.id);
                academic_year_id = to1.id;
            }
        }
        deps = Departments.ret_data(" order by department_name  asc ");
        acad_periods.add("");
        acad_periods.add("First Semester");
        acad_periods.add("Second Semester");
        acad_periods.add("Summer Class");

        init_tbl_miscellaneous_fees(tbl_miscellaneous_fees);

    }

    int academic_year_id = 0;
    List<Academic_years.to_academic_years> acad_years = new ArrayList();
    List<Academic_years.to_academic_years> acad_years2 = new ArrayList();
    List<Departments.to_departments> deps = new ArrayList();

    String o_academic_year;
    String o_academic_year_id;
    String o_period;
    String o_period_id;
    String o_department;
    String o_department_id;
    String o_level;
    String o_level_id;
    String o_course;
    String o_course_id;

    int is_other_fees = 0;

    public void do_pass(String academic_year, String academic_year_id, String period, String period_id, String department, String department_id, String level, String level_id, String course, String course_id, int is_other_fe) {
        Field.Combo acad2 = (Field.Combo) tf_field14;
        Field.Combo per = (Field.Combo) tf_period;
        Field.Combo dep = (Field.Combo) tf_field15;
        Field.Combo lev = (Field.Combo) tf_field22;
        Field.Combo year = (Field.Combo) tf_field16;

        acad2.setText(academic_year);
        acad2.setId(academic_year_id);
        o_academic_year = academic_year;
        o_academic_year_id = academic_year_id;

        per.setText(period);
        per.setId(period_id);
        o_period = period;
        o_period_id = period_id;

        dep.setText(department);
        dep.setId(department_id);
        o_department = department;
        o_department_id = department_id;

        lev.setText(level);
        lev.setId(level_id);
        o_level = level;
        o_level_id = level_id;

        year.setText(course);
        year.setId(course_id);
        o_course = course;
        o_course_id = course_id;

        is_other_fees = is_other_fe;
        ret_data();

    }

    // <editor-fold defaultstate="collapsed" desc="Key">
    private void disposed() {
        this.dispose();
    }

    private void init_key() {
        KeyMapping.mapKeyWIFW(getSurface(),
                              KeyEvent.VK_ESCAPE, new KeyAction() {

                          @Override
                          public void actionPerformed(ActionEvent e) {
//                btn_0.doClick();
                              disposed();
                          }
                      });
    }
    // </editor-fold>

    private void init_academic_years(JTextField tf) {
        Object[][] obj = new Object[acad_years2.size()][1];
        int i = 0;
        for (Academic_years.to_academic_years to : acad_years2) {
            obj[i][0] = " " + to.years;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Academic_years.to_academic_years to = acad_years2.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf;
                co.setText("" + to.years);
                co.setId("" + to.id);
//                System.out.println("id: " + to.id);
            }
        });
    }
    List<String> acad_periods = new ArrayList();

    private void init_years2() {
        Object[][] obj = new Object[acad_periods.size()][1];
        int i = 0;
        for (String to : acad_periods) {
            obj[i][0] = " " + to;

            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_period.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_period, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                String to = acad_periods.get(data.selected_row);
                tf_period.setText("" + to);
                ret_data();
            }
        });
    }

    List<Colleges.to_colleges> colleges2 = new ArrayList();

    private void init_departments() {

        Object[][] obj = new Object[deps.size()][1];
        int i = 0;
        for (Departments.to_departments to : deps) {
            obj[i][0] = " " + to.department_name;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field15.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field15, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Departments.to_departments to = deps.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field15;
                co.setText("" + to.department_name);
                co.setId("" + to.id);
                colleges2 = Colleges.ret_data(" where department_id='" + co.getId() + "' ");
                Field.Combo co1 = (Field.Combo) tf_field22;
                if (!colleges2.isEmpty()) {
                    Colleges.to_colleges c = (Colleges.to_colleges) colleges2.get(0);
                    co1.setText("" + c.college_name);
                    co1.setId("" + c.id);
                } else {
                    co1.setText("");
                    co1.setId("");
                }

            }
        });
    }

    private void init_colleges3() {

        Object[][] obj = new Object[colleges2.size()][1];
        int i = 0;
        for (Colleges.to_colleges to : colleges2) {
            obj[i][0] = " " + to.college_name;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field22.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field22, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Colleges.to_colleges to = colleges2.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field22;
                co.setText("" + to.college_name);
                co.setId("" + to.id);

                Field.Combo year = (Field.Combo) tf_field16;
                Field.Combo per = (Field.Combo) tf_period;
                year.setText("");
                year.setId("");

            }

        });
    }

    private void init_colleges() {

        String where = " where id<>0 ";

        Field.Combo dep = (Field.Combo) tf_field15;
        where = where + " and department_id='" + dep.getId() + "' ";

        Field.Combo col = (Field.Combo) tf_field22;
        where = where + " and college_id='" + col.getId() + "' ";

        List<Courses.to_courses> courses = Courses.ret_data(where);
        Object[][] obj = new Object[courses.size()][3];
        int i = 0;
        for (Courses.to_courses to : courses) {
            obj[i][0] = " " + to.course_code;
            obj[i][1] = " " + to.course_description;
            obj[i][2] = " " + to.no_of_years;

            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {120, (tf_field16.getWidth() - 180), 60};
        int width = 0;
        String[] col_names = {"", "", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup2(tf_field16, obj, labels, tbl_widths_customers, col_names, tf_field16.getWidth() + 100);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Courses.to_courses to = courses.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field16;
                co.setText("" + to.course_description);
                co.setId("" + to.id);

                ret_data();

            }

        });
    }

    //<editor-fold defaultstate="collapsed" desc=" miscellaneous_fees "> 
    public static ArrayListModel tbl_miscellaneous_fees_ALM;
    public static Tblmiscellaneous_feesModel tbl_miscellaneous_fees_M;

    public static void init_tbl_miscellaneous_fees(JTable tbl_miscellaneous_fees) {
        tbl_miscellaneous_fees_ALM = new ArrayListModel();
        tbl_miscellaneous_fees_M = new Tblmiscellaneous_feesModel(tbl_miscellaneous_fees_ALM);
        tbl_miscellaneous_fees.setModel(tbl_miscellaneous_fees_M);
        tbl_miscellaneous_fees.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_miscellaneous_fees.setRowHeight(25);
        int[] tbl_widths_miscellaneous_fees = {100, 80, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_miscellaneous_fees.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_miscellaneous_fees, i, tbl_widths_miscellaneous_fees[i]);
        }
        Dimension d = tbl_miscellaneous_fees.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_miscellaneous_fees.getTableHeader().setPreferredSize(d);
        tbl_miscellaneous_fees.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_miscellaneous_fees.setRowHeight(25);
        tbl_miscellaneous_fees.setFont(new java.awt.Font("Arial", 0, 12));
        TableWidthUtilities.setColumnRightRenderer(tbl_miscellaneous_fees, 1);
        tbl_miscellaneous_fees.getColumnModel().getColumn(2).setCellRenderer(new ImageRenderer());
        tbl_miscellaneous_fees.getColumnModel().getColumn(3).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_miscellaneous_fees(List<Academic_year_fees.to_academic_year_fees> acc) {
        tbl_miscellaneous_fees_ALM.clear();
        tbl_miscellaneous_fees_ALM.addAll(acc);
    }

    public static class Tblmiscellaneous_feesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Miscellaneous:", "Amount", "", "", "updated_at", "created_by", "updated_by", "status", "is_uploaded"
        };

        public Tblmiscellaneous_feesModel(ListModel listmodel) {
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
            Academic_year_fees.to_academic_year_fees tt = (Academic_year_fees.to_academic_year_fees) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.fee;
                case 1:
                    return FitIn.fmt_wc_0(tt.amount) + " ";
                case 2:
                    return "/cis/icons/new-file.png";
                case 3:
                    return "/cis/icons/remove11.png";
                case 4:
                    return tt.updated_at;
                case 5:
                    return tt.created_by;
                case 6:
                    return tt.updated_by;
                case 7:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }

    private void ret_data() {
        Field.Combo acad2 = (Field.Combo) tf_field14;
        Field.Combo dep = (Field.Combo) tf_field15;
        Field.Combo lev = (Field.Combo) tf_field22;
        Field.Combo year = (Field.Combo) tf_field16;
        Field.Combo per = (Field.Combo) tf_period;

        String where = " where id<>0 ";
        int group_id = 1;
        if (is_other_fees == 1) {
            group_id = 2;
        }
        if (acad2.getId().equalsIgnoreCase("1") && !per.getText().equalsIgnoreCase("Summer Class") || acad2.getId().equalsIgnoreCase("9") && !per.getText().equalsIgnoreCase("Summer Class")) {

            where = where + " and academic_year_id='" + acad2.getId() + "' "
                    + " and department_id='" + dep.getId() + "' "
                    + " and level_id='" + lev.getId() + "' "
                    + " and course_id='" + year.getId() + "' "
                    + " and period like 'First Year' "
                    + " and group_id='" + group_id + "' ";
        } else {
            where = where + " and academic_year_id='" + acad2.getId() + "' "
                    + " and department_id='" + dep.getId() + "' "
                    + " and level_id='" + lev.getId() + "' "
                    + " and course_id='" + year.getId() + "' "
                    + " and period like '" + per.getText() + "' "
                    + " and group_id='" + group_id + "' ";
        }

        List<Academic_year_fees.to_academic_year_fees> datas = new ArrayList();
        if (is_other_fees == 0) {
            datas = Miscellaneous_fees.ret_data2(where);
        } else {
            datas = Miscellaneous_fees.ret_data3(where);
        }

        loadData_miscellaneous_fees(datas);

        double amount = 0;
        for (Academic_year_fees.to_academic_year_fees to : datas) {
            amount += to.amount;
        }
        tf_field20.setText(FitIn.fmt_wc_0(amount));
        jLabel37.setText("" + datas.size());
    }

    private void confirm_action() {
        Field.Combo acad2 = (Field.Combo) tf_field14;
        Field.Combo per = (Field.Combo) tf_period;
        Field.Combo dep = (Field.Combo) tf_field15;
        Field.Combo lev = (Field.Combo) tf_field22;
        Field.Combo cour = (Field.Combo) tf_field16;

        if (acad2.getText().equalsIgnoreCase(o_academic_year)
                && acad2.getId().equalsIgnoreCase(o_academic_year_id)
                && per.getText().equalsIgnoreCase(o_period)
                && dep.getText().equalsIgnoreCase(o_department)
                && dep.getId().equalsIgnoreCase(o_department_id)
                && lev.getText().equalsIgnoreCase(o_level)
                && lev.getId().equalsIgnoreCase(o_level_id)
                && cour.getText().equalsIgnoreCase(o_course)
                && cour.getId().equalsIgnoreCase(o_course_id)) {
            Alert.set(0, "Cannot copy original record");
            return;
        }
        Window p = (Window) this;
        Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
        nd.setTitle("");
//        nd.do_pass(services);
        nd.setCallback(new Dlg_confirm_action.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                closeDialog.ok();
                ok2();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void ok2() {

        List<Academic_year_fees.to_academic_year_fees> datas = tbl_miscellaneous_fees_ALM;
        if (datas.isEmpty()) {
            Alert.set(0, "Please select a record to copy!");
            return;
        }
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(datas));
        }
    }
}
