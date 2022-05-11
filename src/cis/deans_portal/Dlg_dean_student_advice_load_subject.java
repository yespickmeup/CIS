/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.deans_portal;

import cis.academic.Academic_offering_subjects;
import cis.academic.Dlg_academic_offerings;
import cis.enrollments.Enrollment_offered_subject_sections;
import cis.enrollments.Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections;
import cis.enrollments.Enrollment_student_loaded_subjects;
import cis.enrollments.Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects;
import cis.enrollments.Enrollments;
import cis.registrar.Dlg_registrar_student_transfer_section;
import cis.school_settings.School_settings;
import cis.test.DayCheck;
import cis.users.Dlg_authenticate;
import cis.users.MyUser;
import cis.users.User_previleges;
import cis.utils.Alert;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.panels.Loading;

/**
 *
 * @author Ronescape
 */
public class Dlg_dean_student_advice_load_subject extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_dean_class_schedule_section
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

        public final to_enrollment_offered_subject_sections to;

        public OutputData(to_enrollment_offered_subject_sections to) {
            this.to = to;
        }

    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_dean_student_advice_load_subject(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_dean_student_advice_load_subject(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_dean_student_advice_load_subject() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_dean_student_advice_load_subject myRef;

    private void setThisRef(Dlg_dean_student_advice_load_subject myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_dean_student_advice_load_subject> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_dean_student_advice_load_subject create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_dean_student_advice_load_subject create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_dean_student_advice_load_subject dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_dean_student_advice_load_subject((java.awt.Frame) parent, false);
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
            Dlg_dean_student_advice_load_subject dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_dean_student_advice_load_subject((java.awt.Dialog) parent, false);
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

        Dlg_dean_student_advice_load_subject dialog = Dlg_dean_student_advice_load_subject.create(new javax.swing.JFrame(), true);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tf_field2 = new Field.Input();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        tf_field3 = new Field.Input();
        jLabel11 = new javax.swing.JLabel();
        tf_field4 = new Field.Input();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_enrollment_offered_subject_sections = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton14 = new Button.Info();
        jButton15 = new Button.Info();
        jButton13 = new Button.Success();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Subject Code:");

        tf_field2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field2.setFocusable(false);
        tf_field2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field2MouseClicked(evt);
            }
        });
        tf_field2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Description:");

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setFocusable(false);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Units:");

        tf_field3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field3.setFocusable(false);
        tf_field3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field3MouseClicked(evt);
            }
        });
        tf_field3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Lecture:");

        tf_field4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field4.setFocusable(false);
        tf_field4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field4MouseClicked(evt);
            }
        });
        tf_field4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field4ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Laboratory:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Prerequisites:");

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setFocusable(false);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setFocusable(false);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_field3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_field4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 515, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addContainerGap())))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_field2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(tf_field2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sections", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tbl_enrollment_offered_subject_sections.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_enrollment_offered_subject_sections.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_enrollment_offered_subject_sectionsMouseClicked(evt);
            }
        });
        tbl_enrollment_offered_subject_sections.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_enrollment_offered_subject_sectionsKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_enrollment_offered_subject_sections);

        jLabel1.setText("No. of rows:");

        jLabel2.setText("0");

        jButton14.setText("Refresh Record");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("Transfer Section");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 977, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jButton13.setText("Ok");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
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

    private void tf_field2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field2MouseClicked

    }//GEN-LAST:event_tf_field2MouseClicked

    private void tf_field2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field2ActionPerformed

    }//GEN-LAST:event_tf_field2ActionPerformed

    private void tf_field3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field3MouseClicked

    private void tf_field3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field3ActionPerformed

    private void tf_field4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field4MouseClicked

    private void tf_field4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field4ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        ok();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void tbl_enrollment_offered_subject_sectionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_enrollment_offered_subject_sectionsMouseClicked
        select_section();
    }//GEN-LAST:event_tbl_enrollment_offered_subject_sectionsMouseClicked

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        search();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void tbl_enrollment_offered_subject_sectionsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_enrollment_offered_subject_sectionsKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_enrollment_offered_subject_sectionsKeyPressed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        transfer_section();
    }//GEN-LAST:event_jButton15ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTable tbl_enrollment_offered_subject_sections;
    private javax.swing.JTextField tf_field2;
    private javax.swing.JTextField tf_field3;
    private javax.swing.JTextField tf_field4;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();

        init_tbl_enrollment_offered_subject_sections(tbl_enrollment_offered_subject_sections);
    }

    Academic_offering_subjects.to_academic_offering_subjects aos = null;
    int academic_year_id = 0;

    List<to_enrollment_student_loaded_subjects> loaded = new ArrayList();
    Enrollments.to_enrollments enroll = null;

    static boolean is_autoload = false;

    public boolean isIs_autoload() {
        return is_autoload;
    }

    public void setIs_autoload(boolean is_autoload) {
        Dlg_dean_student_advice_load_subject.is_autoload = is_autoload;
    }

    public static boolean getIs_autoload() {
        return is_autoload;
    }

    public void do_pass(Academic_offering_subjects.to_academic_offering_subjects to, int academic_year_id1, Enrollments.to_enrollments enroll1, boolean load) {
        enroll = enroll1;
//        System.out.println("enroll1: " + enroll1.id);
        is_autoload = load;
        setIs_autoload(load);
        academic_year_id = academic_year_id1;
        aos = to;
        tf_field2.setText(to.subject_code);
        jTextArea1.setText(to.description);
        tf_field3.setText("" + to.lecture_units);
        tf_field4.setText("" + to.lab_units);
        jTextArea2.setText(to.prerequisite_subject_ids);
//        ret_eos();

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                search();
                String where = " where enrollment_id='" + enroll.id + "' and status<2 ";
                loaded = Enrollment_student_loaded_subjects.ret_data(where);
            }
        });

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

    //<editor-fold defaultstate="collapsed" desc=" enrollment_offered_subject_sections "> 
    public static ArrayListModel tbl_enrollment_offered_subject_sections_ALM;
    public static Tblenrollment_offered_subject_sectionsModel tbl_enrollment_offered_subject_sections_M;

    public static void init_tbl_enrollment_offered_subject_sections(JTable tbl_enrollment_offered_subject_sections) {
        tbl_enrollment_offered_subject_sections_ALM = new ArrayListModel();
        tbl_enrollment_offered_subject_sections_M = new Tblenrollment_offered_subject_sectionsModel(tbl_enrollment_offered_subject_sections_ALM);
        tbl_enrollment_offered_subject_sections.setModel(tbl_enrollment_offered_subject_sections_M);
        tbl_enrollment_offered_subject_sections.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_enrollment_offered_subject_sections.setRowHeight(25);
        int[] tbl_widths_enrollment_offered_subject_sections = {90, 50, 130, 220, 0, 120, 90, 90, 70, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_enrollment_offered_subject_sections.length; i < n; i++) {
            if (i == 5) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_enrollment_offered_subject_sections, i, tbl_widths_enrollment_offered_subject_sections[i]);
        }
        Dimension d = tbl_enrollment_offered_subject_sections.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_enrollment_offered_subject_sections.getTableHeader().setPreferredSize(d);
        tbl_enrollment_offered_subject_sections.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_enrollment_offered_subject_sections.setRowHeight(60);
        tbl_enrollment_offered_subject_sections.setFont(new java.awt.Font("Arial", 0, 12));

        TableColumnModel tcm = tbl_enrollment_offered_subject_sections.getColumnModel();
        TableColumn tm = tcm.getColumn(3);
        tm.setCellRenderer(new Dlg_academic_offerings.Html());
    }

    public static class Html extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
            JLabel lbl = new JLabel();
            lbl.setText(value.toString());
            lbl.setOpaque(true);
            lbl.setBackground(Color.white);
            if (selected) {
                lbl.setBackground(new java.awt.Color(0, 120, 215));
                lbl.setForeground(new java.awt.Color(255, 255, 255));
            }
            return lbl;
        }
    }

    public static void loadData_enrollment_offered_subject_sections(List<to_enrollment_offered_subject_sections> acc) {
        tbl_enrollment_offered_subject_sections_ALM.clear();
        tbl_enrollment_offered_subject_sections_ALM.addAll(acc);
    }

    public static class Tblenrollment_offered_subject_sectionsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Section", "Max", "Room", "Day", "Time", "Instructor", "Capacity", "Pending", "Status", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded"
        };

        public Tblenrollment_offered_subject_sectionsModel(ListModel listmodel) {
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
            to_enrollment_offered_subject_sections tt = (to_enrollment_offered_subject_sections) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.section;
                case 1:
                    return " " + tt.max_students;
                case 2:
                    return " " + tt.room;
                case 3:
//                    if (tt.day == null) {
//                        return " ";
//                    } else {
//                        return " " + tt.day;
//                    }

                    String html = "<html><body>"
                            + " <p><font size=\"4\" > " + tt.day + "</font></p>"
                            + "</body>"
                            + "</html>";
                    return html;
                case 4:

                    return " " + tt.time;
                case 5:
                    return " " + tt.faculty_name;
                case 6:

                    if (!getIs_autoload() && !tt.is_loaded) {
                        return "    Search";
                    } else {
                        return " " + tt.created_by;
                    }

                case 7:
                    if (!getIs_autoload() && !tt.is_loaded) {
                        return "    Search";
                    } else {
                        return " " + tt.updated_by;
                    }

                case 8:
                    if (tt.status == 0) {
                        return " Posted";
                    } else if (tt.status == 1 && tt.is_loaded) {
                        String[] cap = tt.created_by.split(" of ");
                        int min = FitIn.toInt(cap[0]);
                        int max = FitIn.toInt(cap[1]);
                        if (min >= max) {
                            return " Full";
                        } else {
                            return " Open";
                        }

                    } else if (tt.status == 2) {
                        return " Closed";
                    } else {
                        return " Dropped";
                    }
                case 9:
                    return tt.created_at;
                case 10:
                    return tt.updated_at;
                case 11:
                    return tt.created_by;
                case 12:
                    return tt.updated_by;
                case 13:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }

    private void search() {
        Loader_upload_main loader = new Loader_upload_main(this);
        loader.execute();
    }

    private void ret_eos() {
        String where = " where academic_year_id='" + academic_year_id + "' and subject_id ='" + aos.subject_id + "' and status <2 order by section asc ";

        List<to_enrollment_offered_subject_sections> datas = new ArrayList();
        if (is_autoload) {
            datas = Enrollment_offered_subject_sections.ret_data2(where);
        } else {
            datas = Enrollment_offered_subject_sections.ret_data4(where);
        }

        loadData_enrollment_offered_subject_sections(datas);
        jLabel2.setText("" + datas.size());
        if (datas.size() > 0) {
            tbl_enrollment_offered_subject_sections.setRowSelectionInterval(0, 0);
        }
    }
//</editor-fold> 

    //<editor-fold defaultstate="collapsed" desc=" Loader Post And Finalize ">
    public class Loader_upload_main extends SwingWorker {

        private Loading dialog;

        public Loader_upload_main(JDialog dlg) {

            dialog = new Loading();
            Toolkit tk = Toolkit.getDefaultToolkit();
            int xSize = ((int) tk.getScreenSize().
                    getWidth());
            int ySize = ((int) tk.getScreenSize().
                    getHeight());
            dialog.setSize(xSize, ySize);
            dialog.setPreferredSize(new Dimension(xSize, ySize));
            dialog.setAlwaysOnTop(true);
            addPropertyChangeListener(new PropertyChangeListener() {
                @Override
                public void propertyChange(PropertyChangeEvent evt) {
                    if ("state".equals(evt.getPropertyName())) {
                        if (getState() == SwingWorker.StateValue.STARTED) {
                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    if (getState() == SwingWorker.StateValue.STARTED) {
                                        dialog.setVisible(true);
                                    }
                                }
                            });
                        }
                    }
                }
            });
        }

        @Override
        protected Object doInBackground() throws Exception {
            ret_eos();
            return null;
        }

        @Override
        protected void done() {
            dialog.dispose();
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                }
            });
        }
    }

    //</editor-fold>
    private void ok() {
        int row = tbl_enrollment_offered_subject_sections.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_enrollment_offered_subject_sections to = (to_enrollment_offered_subject_sections) tbl_enrollment_offered_subject_sections_ALM.get(row);
        if (!to.is_loaded) {
            Alert.set(0, "Please search student count!");
            return;
        }
        double total_units = to.lab_units + to.lecture_units;
        if (to.status == 0) {
            Alert.set(0, "Subject not yet open!");
            return;
        }
        if (to.status == 1) {

            String[] cap = to.created_by.split(" of ");
            int min = FitIn.toInt(cap[0]);
            int max = FitIn.toInt(cap[1]);
            if (min >= max) {
                Alert.set(0, "Section already full!");
                return;
            }
        }

        boolean exist = false;
        for (to_enrollment_student_loaded_subjects to2 : loaded) {
            if (to2.subject_id == to.subject_id) {

                exist = true;
                break;
            }
        }
        if (exist) {
            Alert.set(0, "Subject already added!");
            return;
        }

        boolean check = check_if_exists();

//        if (check) {
//            Alert.set(0, "Day/Time not available!");
//            return;
//        }
        int count = Enrollments.ret_subject_load_count(enroll.id);
        List<School_settings.to_school_settings> settings = School_settings.ret_data(" where name like 'Subject Loading overload' ");
        double maxx = 0;
        double load = 0;
        if (!settings.isEmpty()) {
            School_settings.to_school_settings set = (School_settings.to_school_settings) settings.get(0);
            maxx = set.amount;
            load = set.amount2;
        }
//        System.out.println("Count: "+(count + total_units));
//        System.out.println("maxx: "+maxx);
        if ((count + total_units) >= maxx) {

            if ((count + total_units) > (maxx + load)) {
//                System.out.println("setting: " + (maxx + load));
//                System.out.println("count: " + (count + total_units));
                Alert.set(0, "Cannot proceed, limit reached!");
                return;
            } else {
                Alert.set(0, "Max subject load reached! Override to continue");
                Window p = (Window) this;
                Dlg_authenticate nd = Dlg_authenticate.create(p, true);
                nd.setTitle("");
//                nd.do_pass(services);
                nd.setCallback(new Dlg_authenticate.Callback() {

                    @Override
                    public void ok(CloseDialog closeDialog, Dlg_authenticate.OutputData data) {
                        closeDialog.ok();
                        ok2(to);
                    }
                });
                nd.setLocationRelativeTo(this);
                nd.setVisible(true);
            }
        } else {
            ok2(to);
        }

    }

    private void ok2(to_enrollment_offered_subject_sections to) {

        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(to));
        }
    }

    private boolean check_if_exists() {

        int row = tbl_enrollment_offered_subject_sections.getSelectedRow();
        if (row < 0) {

        }
        to_enrollment_offered_subject_sections eoss = (to_enrollment_offered_subject_sections) tbl_enrollment_offered_subject_sections_ALM.get(row);

        String[] days3 = eoss.day.split("<br>");
        boolean available = true;
        for (int i = 0; i < days3.length; i++) {
            String d = days3[i];
            d = d.replaceAll("&nbsp;&nbsp;", "");
            String[] dd = d.split(": ");
            String day1 = dd[0];

            List<String> schedules = new ArrayList();
            for (to_enrollment_student_loaded_subjects to : loaded) {
                schedules.add(to.day);
            }
            available = DayCheck.compare_schedule(d, schedules);

        }

        return available;
    }

    private void select_section() {
        int row = tbl_enrollment_offered_subject_sections.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_enrollment_offered_subject_sections to = (to_enrollment_offered_subject_sections) tbl_enrollment_offered_subject_sections_ALM.get(row);

        int col = tbl_enrollment_offered_subject_sections.getSelectedColumn();
        if (col == 6 || col == 7) {
            if (to.is_loaded) {
                Window p = (Window) this;
                Dlg_dean_student_advice_load_subject_students nd = Dlg_dean_student_advice_load_subject_students.create(p, true);
                nd.setTitle("");
                nd.do_pass(to);
                nd.setCallback(new Dlg_dean_student_advice_load_subject_students.Callback() {

                    @Override
                    public void ok(CloseDialog closeDialog, Dlg_dean_student_advice_load_subject_students.OutputData data) {
                        closeDialog.ok();

                    }
                });
                nd.setLocationRelativeTo(this);
                nd.setVisible(true);
            } else {
//                System.out.println("searching...");
                List<String> datas = Enrollment_offered_subject_sections.getStudentCount(to.id, to.max_students);
                if (!datas.isEmpty()) {
//                    System.out.println("datas.get(0): " + datas.get(0));
                    to.setCreated_by(datas.get(0));
                    to.setUpdated_by(datas.get(1));
                    to.setIs_loaded(true);
                    tbl_enrollment_offered_subject_sections_M.fireTableCellUpdated(row, 6);
                    tbl_enrollment_offered_subject_sections_M.fireTableCellUpdated(row, 7);
                }

            }

        }
    }

    private void transfer_section() {
        String wheree = " where user_id='" + MyUser.getUser_id() + "' and privilege like '" + "Transfer Section - (Add)" + "' limit 1";

        List<User_previleges.to_user_privileges> privileges = User_previleges.ret_data(wheree);
        if (privileges.isEmpty()) {
            Alert.set(0, "Privilege not added!");
            return;
        }
        Window p = (Window) this;
        Dlg_registrar_student_transfer_section nd = Dlg_registrar_student_transfer_section.create(p, true);
        nd.setTitle("");
//        nd.do_pass(services);
        nd.setCallback(new Dlg_registrar_student_transfer_section.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_registrar_student_transfer_section.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }
}
