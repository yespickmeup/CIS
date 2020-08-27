/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.deans_portal;

import cis.academic.Academic_year_period_schedules;
import cis.academic.Academic_years;
import cis.classrooms.Classrooms;
import cis.departments.Departments;
import cis.enrollments.Enrollment_offered_subject_section_room_schedules;
import cis.enrollments.Enrollment_offered_subject_sections;
import cis.utils.DateType;
import cis.utils.TableRenderer;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Toolkit;
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
public class Dlg_room_schedules extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_room_schedules
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
    private Dlg_room_schedules(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_room_schedules(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_room_schedules() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_room_schedules myRef;

    private void setThisRef(Dlg_room_schedules myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_room_schedules> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_room_schedules create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_room_schedules create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_room_schedules dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_room_schedules((java.awt.Frame) parent, false);
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
            Dlg_room_schedules dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_room_schedules((java.awt.Dialog) parent, false);
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

        Dlg_room_schedules dialog = Dlg_room_schedules.create(new javax.swing.JFrame(), true);

        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().
                getWidth());
        int ySize = ((int) tk.getScreenSize().
                getHeight());
        dialog.setSize(xSize, ySize);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_enrollment_offered_subject_section_room_schedules = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tf_field14 = new Field.Combo();
        jLabel36 = new javax.swing.JLabel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jButton16 = new Button.Info();
        jCheckBox16 = new javax.swing.JCheckBox();
        jLabel22 = new javax.swing.JLabel();
        tf_field15 = new Field.Combo();
        jLabel23 = new javax.swing.JLabel();
        tf_field16 = new Field.Combo();
        jLabel24 = new javax.swing.JLabel();
        tf_field17 = new Field.Combo();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tbl_enrollment_offered_subject_section_room_schedules.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_enrollment_offered_subject_section_room_schedules.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_enrollment_offered_subject_section_room_schedulesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_enrollment_offered_subject_section_room_schedules);

        jLabel3.setText("No. of rows:");

        jLabel4.setText("0");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Room:");

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

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Day:");

        buttonGroup1.add(jCheckBox8);
        jCheckBox8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox8.setText("Monday");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox9);
        jCheckBox9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox9.setText("Tuesday");
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox10);
        jCheckBox10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox10.setText("Wednesday");
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox11);
        jCheckBox11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox11.setText("Thursday");
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox12);
        jCheckBox12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox12.setText("Friday");
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox13);
        jCheckBox13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox13.setText("Saturday");
        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox14);
        jCheckBox14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox14.setText("Sunday");
        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });

        jButton16.setText("Print Preview");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox16);
        jCheckBox16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox16.setSelected(true);
        jCheckBox16.setText("All");
        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("School Year:");

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

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Department:");

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

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Term:");

        tf_field17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field17.setFocusable(false);
        tf_field17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field17MouseClicked(evt);
            }
        });
        tf_field17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jCheckBox8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox14))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_field15, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_field14)))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_field17, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addComponent(tf_field16))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox9)
                    .addComponent(jCheckBox10)
                    .addComponent(jCheckBox11)
                    .addComponent(jCheckBox12)
                    .addComponent(jCheckBox13)
                    .addComponent(jCheckBox14)
                    .addComponent(jCheckBox16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Schedules", jPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 824, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Print Preview", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jTabbedPane1)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
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

    private void tbl_enrollment_offered_subject_section_room_schedulesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_enrollment_offered_subject_section_room_schedulesMouseClicked
//        select_schedule();
    }//GEN-LAST:event_tbl_enrollment_offered_subject_section_room_schedulesMouseClicked

    private void tf_field14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field14MouseClicked
        init_classrooms();
    }//GEN-LAST:event_tf_field14MouseClicked

    private void tf_field14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field14ActionPerformed
        init_classrooms();
    }//GEN-LAST:event_tf_field14ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        ret_schedules();
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        ret_schedules();
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        ret_schedules();
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
        ret_schedules();
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        ret_schedules();
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
        ret_schedules();
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed
        ret_schedules();
    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        ret_schedules();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox16ActionPerformed
        ret_schedules();
    }//GEN-LAST:event_jCheckBox16ActionPerformed

    private void tf_field15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field15MouseClicked

    private void tf_field15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field15ActionPerformed

    private void tf_field16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field16MouseClicked
        init_department();
    }//GEN-LAST:event_tf_field16MouseClicked

    private void tf_field16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field16ActionPerformed

    private void tf_field17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field17MouseClicked
        init_term();
    }//GEN-LAST:event_tf_field17MouseClicked

    private void tf_field17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field17ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton16;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl_enrollment_offered_subject_section_room_schedules;
    private javax.swing.JTextField tf_field14;
    private javax.swing.JTextField tf_field15;
    private javax.swing.JTextField tf_field16;
    private javax.swing.JTextField tf_field17;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();

//        System.setProperty("pool_db", "db_cis_cosca");
//        System.setProperty("pool_password", "password");
        init_tbl_enrollment_offered_subject_section_room_schedules(tbl_enrollment_offered_subject_section_room_schedules);

        acad_years = Academic_years.ret_data(" where status=1 order by id desc limit 1");
        departments = Departments.ret_data(" order by department_name asc ");
        classrooms = Classrooms.ret_data(" order by classroom asc ");
        if (!acad_years.isEmpty()) {
            Academic_years.to_academic_years to = (Academic_years.to_academic_years) acad_years.get(0);
            Field.Combo sy = (Field.Combo) tf_field15;
            sy.setText(to.years);
            sy.setId("" + to.id);

            if (!departments.isEmpty()) {
                Departments.to_departments department = (Departments.to_departments) departments.get(0);
                Field.Combo dep = (Field.Combo) tf_field16;
                dep.setText(department.department_name);
                dep.setId("" + department.id);
                if (department.department_name.toUpperCase().contains("TERTIARY") || department.department_name.toUpperCase().contains("SENIOR")) {
                    hide_term(true);

                } else {
                    hide_term(false);
                }

            }

        }

    }

    private void hide_term(boolean stmt) {
        jLabel24.setVisible(stmt);
        tf_field17.setVisible(stmt);
    }
    List<Academic_years.to_academic_years> acad_years = new ArrayList();
    List<String> periods = new ArrayList();
    List<Departments.to_departments> departments = new ArrayList();
    List<Classrooms.to_classrooms> classrooms = new ArrayList();

    public void do_pass(String room_id, String room_name, Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections to) {
        Field.Combo room = (Field.Combo) tf_field14;
        Field.Combo dep = (Field.Combo) tf_field16;
        Field.Combo term = (Field.Combo) tf_field17;
        room.setText(room_name);
        room.setId("" + room_id);
        room.setEnabled(false);
        dep.setText(to.department);
        dep.setId("" + to.department_id);
        term.setText(to.term);
        if (to.department.toUpperCase().contains("TERTIARY") || to.department.toUpperCase().contains("SENIOR")) {
            hide_term(true);

        } else {
            hide_term(false);
        }
        ret_schedules();
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

    //<editor-fold defaultstate="collapsed" desc=" enrollment_offered_subject_section_room_schedules "> 
    public static ArrayListModel tbl_enrollment_offered_subject_section_room_schedules_ALM;
    public static Tblenrollment_offered_subject_section_room_schedulesModel tbl_enrollment_offered_subject_section_room_schedules_M;

    public static void init_tbl_enrollment_offered_subject_section_room_schedules(JTable tbl_enrollment_offered_subject_section_room_schedules) {
        tbl_enrollment_offered_subject_section_room_schedules_ALM = new ArrayListModel();
        tbl_enrollment_offered_subject_section_room_schedules_M = new Tblenrollment_offered_subject_section_room_schedulesModel(tbl_enrollment_offered_subject_section_room_schedules_ALM);
        tbl_enrollment_offered_subject_section_room_schedules.setModel(tbl_enrollment_offered_subject_section_room_schedules_M);
        tbl_enrollment_offered_subject_section_room_schedules.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_enrollment_offered_subject_section_room_schedules.setRowHeight(25);
        int[] tbl_widths_enrollment_offered_subject_section_room_schedules = {100, 100, 80, 120, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_enrollment_offered_subject_section_room_schedules.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_enrollment_offered_subject_section_room_schedules, i, tbl_widths_enrollment_offered_subject_section_room_schedules[i]);
        }
        Dimension d = tbl_enrollment_offered_subject_section_room_schedules.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_enrollment_offered_subject_section_room_schedules.getTableHeader().setPreferredSize(d);
        tbl_enrollment_offered_subject_section_room_schedules.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_enrollment_offered_subject_section_room_schedules.setRowHeight(25);
        tbl_enrollment_offered_subject_section_room_schedules.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_enrollment_offered_subject_section_room_schedules.getColumnModel().getColumn(5).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_enrollment_offered_subject_section_room_schedules(List<Enrollment_offered_subject_section_room_schedules.to_enrollment_offered_subject_section_room_schedules> acc) {
        tbl_enrollment_offered_subject_section_room_schedules_ALM.clear();
        tbl_enrollment_offered_subject_section_room_schedules_ALM.addAll(acc);
    }

    public static class Tblenrollment_offered_subject_section_room_schedulesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Room", "Subject Code", "Day", "Time", "Instructor", "", "academic_year", "level_id", "level", "college_id", "college", "department_id", "department", "course_id", "course_code", "course_description", "term", "year_level", "room_id", "room", "schedule", "day", "time", "start_time", "closing_time", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded"
        };

        public Tblenrollment_offered_subject_section_room_schedulesModel(ListModel listmodel) {
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
            Enrollment_offered_subject_section_room_schedules.to_enrollment_offered_subject_section_room_schedules tt = (Enrollment_offered_subject_section_room_schedules.to_enrollment_offered_subject_section_room_schedules) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.room;
                case 1:
                    return " " + tt.subject_code;
                case 2:
                    return " " + tt.day;
                case 3:
                    String from = DateType.convert_datetime_to_hour_minute(tt.start_time);
                    String to = DateType.convert_datetime_to_hour_minute(tt.closing_time);
                    return " " + from + " - " + to;
                case 4:
                    return " ";
                case 5:
                    return "/cis/icons/remove11.png";
                case 6:
                    return tt.academic_year;
                case 7:
                    return tt.level_id;
                case 8:
                    return tt.level;
                case 9:
                    return tt.college_id;
                case 10:
                    return tt.college;
                case 11:
                    return tt.department_id;
                case 12:
                    return tt.department;
                case 13:
                    return tt.course_id;
                case 14:
                    return tt.course_code;
                case 15:
                    return tt.course_description;
                case 16:
                    return tt.term;
                case 17:
                    return tt.year_level;
                case 18:
                    return tt.room_id;
                case 19:
                    return tt.room;
                case 20:
                    return tt.schedule;
                case 21:
                    return tt.day;
                case 22:
                    return tt.time;
                case 23:
                    return tt.start_time;
                case 24:
                    return tt.closing_time;
                case 25:
                    return tt.created_at;
                case 26:
                    return tt.updated_at;
                case 27:
                    return tt.created_by;
                case 28:
                    return tt.updated_by;
                case 29:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }

    private void ret_schedules() {
        String day = "";
        if (jCheckBox8.isSelected()) {
            day = "Monday";
        }
        if (jCheckBox9.isSelected()) {
            day = "Tuesday";
        }
        if (jCheckBox10.isSelected()) {
            day = "Wednesday";
        }
        if (jCheckBox11.isSelected()) {
            day = "Thursday";
        }
        if (jCheckBox12.isSelected()) {
            day = "Friday";
        }
        if (jCheckBox13.isSelected()) {
            day = "Saturday";
        }
        if (jCheckBox14.isSelected()) {
            day = "Sunday";
        }
        Field.Combo sy = (Field.Combo) tf_field15;
        Field.Combo dep = (Field.Combo) tf_field16;
        Field.Combo room = (Field.Combo) tf_field14;
        Field.Combo term = (Field.Combo) tf_field17;
        String where = " where academic_year_id='" + sy.getId() + "' ";
        if (dep.getText().toUpperCase().contains("TERTIARY") || dep.getText().toUpperCase().contains("SENIOR")) {
            where = where + " and department_id='" + dep.getId() + "' and term like '" + tf_field17.getText() + "' ";

        } else {
            where = where + " and department_id='" + dep.getId() + "' ";
        }

        where = where + " and day like '%" + day + "%' and room_id='" + room.getId() + "' order by start_time asc ";
//        System.out.println(where);
        List<Enrollment_offered_subject_section_room_schedules.to_enrollment_offered_subject_section_room_schedules> datas = Enrollment_offered_subject_section_room_schedules.ret_data(where);

        loadData_enrollment_offered_subject_section_room_schedules(datas);
        jLabel4.setText("" + datas.size());
    }
//</editor-fold> 

    private void init_department() {
        Object[][] obj = new Object[departments.size()][1];
        int i = 0;
        for (Departments.to_departments to : departments) {
            obj[i][0] = " " + to.department_name;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field16.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field16, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Departments.to_departments to = departments.get(data.selected_row);
                Field.Combo dep = (Field.Combo) tf_field16;
                dep.setText(to.department_name);
                dep.setId("" + to.id);

                if (to.department_name.toUpperCase().contains("TERTIARY") || to.department_name.toUpperCase().contains("SENIOR")) {
                    hide_term(true);

                } else {
                    hide_term(false);
                }
                Field.Combo sy = (Field.Combo) tf_field15;
                String where = " where academic_year_id = '" + sy.getId() + "' and department_id='" + dep.getId() + "' ";
                List<Academic_year_period_schedules.to_academic_year_period_schedules> periods1 = Academic_year_period_schedules.ret_data(where);
                if (!periods1.isEmpty()) {
                    Academic_year_period_schedules.to_academic_year_period_schedules acad = (Academic_year_period_schedules.to_academic_year_period_schedules) periods1.get(0);
                    Field.Combo te = (Field.Combo) tf_field17;
                    te.setText(acad.period);
                    te.setId("" + acad.id);
                    periods.clear();
                    for (Academic_year_period_schedules.to_academic_year_period_schedules ac : periods1) {
                        periods.add(ac.period);
                    }
                }
                ret_schedules();
            }
        });
    }

    private void init_term() {

        String where = "";

        Object[][] obj = new Object[periods.size()][1];
        int i = 0;
        for (String to : periods) {
            obj[i][0] = " " + to;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field17.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field17, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                String to = periods.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field17;
                co.setText("" + to);
                ret_schedules();
            }
        });
    }

    private void init_classrooms() {

        String where = "";

        Object[][] obj = new Object[classrooms.size()][1];
        int i = 0;
        for (Classrooms.to_classrooms to : classrooms) {
            obj[i][0] = " " + to.classroom;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field14.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field14, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Classrooms.to_classrooms to = classrooms.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field14;
                co.setText("" + to.classroom);
                co.setId("" + to.id);
                ret_schedules();
            }
        });
    }
}
