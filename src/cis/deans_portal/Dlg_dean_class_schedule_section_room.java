/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.deans_portal;

import cis.classrooms.Classrooms;
import cis.classrooms.Dlg_classrooms;
import cis.enrollments.Enrollment_offered_subject_section_room_schedules;
import cis.enrollments.Enrollment_offered_subject_section_room_schedules.to_enrollment_offered_subject_section_room_schedules;
import cis.enrollments.Enrollment_offered_subject_sections;
import cis.test.Time;
import cis.users.MyUser;
import cis.utils.Alert;
import cis.utils.DateType;
import cis.utils.Dlg_confirm_action;
import cis.utils.Dlg_confirm_action4;
import cis.utils.Dlg_confirm_delete;
import cis.utils.TableRenderer;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
 * @author Ronescape
 */
public class Dlg_dean_class_schedule_section_room extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_dean_class_schedule_section_room
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
    private Dlg_dean_class_schedule_section_room(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_dean_class_schedule_section_room(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_dean_class_schedule_section_room() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_dean_class_schedule_section_room myRef;

    private void setThisRef(Dlg_dean_class_schedule_section_room myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_dean_class_schedule_section_room> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_dean_class_schedule_section_room create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_dean_class_schedule_section_room create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_dean_class_schedule_section_room dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_dean_class_schedule_section_room((java.awt.Frame) parent, false);
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
            Dlg_dean_class_schedule_section_room dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_dean_class_schedule_section_room((java.awt.Dialog) parent, false);
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

        Dlg_dean_class_schedule_section_room dialog = Dlg_dean_class_schedule_section_room.create(new javax.swing.JFrame(), true);
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
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        tf_field13 = new Field.Combo();
        jLabel35 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        tf_user_screen_name5 = new Field.Combo();
        jLabel18 = new javax.swing.JLabel();
        tf_user_screen_name6 = new Field.Combo();
        tf_user_screen_name7 = new Field.Combo();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        tf_user_screen_name2 = new Field.Combo();
        jLabel20 = new javax.swing.JLabel();
        tf_user_screen_name3 = new Field.Combo();
        tf_user_screen_name4 = new Field.Combo();
        jButton8 = new javax.swing.JButton();
        jButton15 = new Button.Success();
        jButton14 = new Button.Default();
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
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jButton13 = new Button.Success();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Room & Time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Room:");

        tf_field13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field13.setFocusable(false);
        tf_field13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field13MouseClicked(evt);
            }
        });
        tf_field13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field13ActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Day:");

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cis/icons/settings.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setText("Monday");

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setText("Tuesday");

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setText("Wednesday");

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox4.setText("Thursday");

        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox5.setText("Friday");

        jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox6.setText("Saturday");

        jCheckBox7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox7.setText("Sunday");

        jPanel4.setOpaque(false);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Start Time:");

        tf_user_screen_name5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_user_screen_name5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_user_screen_name5.setFocusable(false);
        tf_user_screen_name5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_user_screen_name5MouseClicked(evt);
            }
        });
        tf_user_screen_name5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_user_screen_name5ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText(":");

        tf_user_screen_name6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_user_screen_name6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_user_screen_name6.setText("00");
        tf_user_screen_name6.setFocusable(false);
        tf_user_screen_name6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_user_screen_name6MouseClicked(evt);
            }
        });
        tf_user_screen_name6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_user_screen_name6ActionPerformed(evt);
            }
        });

        tf_user_screen_name7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_user_screen_name7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_user_screen_name7.setText("AM");
        tf_user_screen_name7.setFocusable(false);
        tf_user_screen_name7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_user_screen_name7MouseClicked(evt);
            }
        });
        tf_user_screen_name7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_user_screen_name7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_user_screen_name5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel18)
                .addGap(0, 0, 0)
                .addComponent(tf_user_screen_name6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_user_screen_name7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tf_user_screen_name5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tf_user_screen_name6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tf_user_screen_name7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setOpaque(false);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("End Time:");

        tf_user_screen_name2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_user_screen_name2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_user_screen_name2.setFocusable(false);
        tf_user_screen_name2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_user_screen_name2MouseClicked(evt);
            }
        });
        tf_user_screen_name2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_user_screen_name2ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText(":");

        tf_user_screen_name3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_user_screen_name3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_user_screen_name3.setText("00");
        tf_user_screen_name3.setFocusable(false);
        tf_user_screen_name3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_user_screen_name3MouseClicked(evt);
            }
        });
        tf_user_screen_name3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_user_screen_name3ActionPerformed(evt);
            }
        });

        tf_user_screen_name4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_user_screen_name4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_user_screen_name4.setText("AM");
        tf_user_screen_name4.setFocusable(false);
        tf_user_screen_name4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_user_screen_name4MouseClicked(evt);
            }
        });
        tf_user_screen_name4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_user_screen_name4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_user_screen_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel20)
                .addGap(0, 0, 0)
                .addComponent(tf_user_screen_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_user_screen_name4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tf_user_screen_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tf_user_screen_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tf_user_screen_name4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cis/icons/focus.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jCheckBox5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox7))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel21Layout.createSequentialGroup()
                                .addComponent(tf_field13, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_field13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4)))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cis/icons2/icon.png"))); // NOI18N
        jButton15.setToolTipText("Save");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cis/icons2/new-file.png"))); // NOI18N
        jButton14.setToolTipText("New");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Schedules", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

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

        jButton16.setText("Search");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jCheckBox15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox15.setSelected(true);
        jCheckBox15.setText("All");

        buttonGroup1.add(jCheckBox16);
        jCheckBox16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox16.setSelected(true);
        jCheckBox16.setText("All");
        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
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
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(tf_field14))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(jCheckBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                        .addComponent(jCheckBox14)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox8)
                            .addComponent(jCheckBox9)
                            .addComponent(jCheckBox10)
                            .addComponent(jCheckBox11)
                            .addComponent(jCheckBox12)
                            .addComponent(jCheckBox13)
                            .addComponent(jCheckBox14)
                            .addComponent(jCheckBox16)))
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_field13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field13MouseClicked
        init_room(tf_field13);
    }//GEN-LAST:event_tf_field13MouseClicked

    private void tf_field13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field13ActionPerformed
        init_room(tf_field13);
    }//GEN-LAST:event_tf_field13ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        room();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        save_schedule();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void tf_user_screen_name5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_user_screen_name5MouseClicked
        init_hour(tf_user_screen_name5);
    }//GEN-LAST:event_tf_user_screen_name5MouseClicked

    private void tf_user_screen_name5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_user_screen_name5ActionPerformed
        init_hour(tf_user_screen_name5);
    }//GEN-LAST:event_tf_user_screen_name5ActionPerformed

    private void tf_user_screen_name6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_user_screen_name6MouseClicked
        init_minute(tf_user_screen_name6);
    }//GEN-LAST:event_tf_user_screen_name6MouseClicked

    private void tf_user_screen_name6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_user_screen_name6ActionPerformed
        init_minute(tf_user_screen_name6);
    }//GEN-LAST:event_tf_user_screen_name6ActionPerformed

    private void tf_user_screen_name7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_user_screen_name7MouseClicked
        init_ampm(tf_user_screen_name7);
    }//GEN-LAST:event_tf_user_screen_name7MouseClicked

    private void tf_user_screen_name7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_user_screen_name7ActionPerformed
        init_ampm(tf_user_screen_name7);
    }//GEN-LAST:event_tf_user_screen_name7ActionPerformed

    private void tf_user_screen_name2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_user_screen_name2MouseClicked
        init_hour(tf_user_screen_name2);
    }//GEN-LAST:event_tf_user_screen_name2MouseClicked

    private void tf_user_screen_name2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_user_screen_name2ActionPerformed
        init_hour(tf_user_screen_name2);
    }//GEN-LAST:event_tf_user_screen_name2ActionPerformed

    private void tf_user_screen_name3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_user_screen_name3MouseClicked
        init_minute(tf_user_screen_name3);
    }//GEN-LAST:event_tf_user_screen_name3MouseClicked

    private void tf_user_screen_name3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_user_screen_name3ActionPerformed
        init_minute(tf_user_screen_name3);
    }//GEN-LAST:event_tf_user_screen_name3ActionPerformed

    private void tf_user_screen_name4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_user_screen_name4MouseClicked
        init_ampm(tf_user_screen_name4);
    }//GEN-LAST:event_tf_user_screen_name4MouseClicked

    private void tf_user_screen_name4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_user_screen_name4ActionPerformed
        init_ampm(tf_user_screen_name4);
    }//GEN-LAST:event_tf_user_screen_name4ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        ok();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void tf_field14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field14MouseClicked
        init_room2(tf_field14);
    }//GEN-LAST:event_tf_field14MouseClicked

    private void tf_field14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field14ActionPerformed
        init_room2(tf_field14);
    }//GEN-LAST:event_tf_field14ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        ret_schedules();
    }//GEN-LAST:event_jButton16ActionPerformed

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

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox16ActionPerformed
        ret_schedules();
    }//GEN-LAST:event_jCheckBox16ActionPerformed

    private void tbl_enrollment_offered_subject_section_room_schedulesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_enrollment_offered_subject_section_room_schedulesMouseClicked
        select_schedule();
    }//GEN-LAST:event_tbl_enrollment_offered_subject_section_room_schedulesMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        view_room_schedules();
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbl_enrollment_offered_subject_section_room_schedules;
    private javax.swing.JTextField tf_field13;
    private javax.swing.JTextField tf_field14;
    private javax.swing.JTextField tf_user_screen_name2;
    private javax.swing.JTextField tf_user_screen_name3;
    private javax.swing.JTextField tf_user_screen_name4;
    private javax.swing.JTextField tf_user_screen_name5;
    private javax.swing.JTextField tf_user_screen_name6;
    private javax.swing.JTextField tf_user_screen_name7;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
//        System.setProperty("pool_db", "db_cis_cosca");
//        System.setProperty("pool_password", "password");

        init_tbl_enrollment_offered_subject_section_room_schedules(tbl_enrollment_offered_subject_section_room_schedules);
    }
    Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections section = null;

    public void do_pass(Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections to) {
        section = to;
        ret_schedules();
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
        int[] tbl_widths_enrollment_offered_subject_section_room_schedules = {100, 100, 80, 120, 0, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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

    public static void loadData_enrollment_offered_subject_section_room_schedules(List<to_enrollment_offered_subject_section_room_schedules> acc) {
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
            to_enrollment_offered_subject_section_room_schedules tt = (to_enrollment_offered_subject_section_room_schedules) getRow(row);
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

        String where = " where day like '%" + day + "%' and enrollment_offered_subject_section_id='" + section.id + "' order by start_time asc ";

        List<to_enrollment_offered_subject_section_room_schedules> datas = Enrollment_offered_subject_section_room_schedules.ret_data(where);

        loadData_enrollment_offered_subject_section_room_schedules(datas);
        jLabel4.setText("" + datas.size());
    }
//</editor-fold> 

    private void init_hour(JTextField tf1) {
        Field.Combo tf_hour = (Field.Combo) tf1;
        String[] hour = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        String[] min = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
            "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
            "31", "32", "33", "34", "35", "36", "37", "38", "39", "40",
            "41", "42", "44", "44", "45", "46", "47", "48", "49", "40",
            "51", "52", "55", "54", "55", "56", "57", "58", "59",};

        String[] ampm = {"AM", "PM"};
        Object[][] obj = new Object[hour.length][1];
        for (int i = 0; i < hour.length; i++) {
            obj[i][0] = " " + hour[i];
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_hour.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_hour, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                String to = hour[data.selected_row];
                tf_hour.setText(to);
            }
        });
    }

    private void init_minute(JTextField tf1) {
        Field.Combo tf_hour = (Field.Combo) tf1;

        String[] min = {"00", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"
        };

        String[] am = {""};
        Object[][] obj = new Object[min.length][1];
        for (int i = 0; i < min.length; i++) {
            obj[i][0] = " " + min[i];
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_hour.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_hour, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                String to = min[data.selected_row];
                tf_hour.setText(to);
            }
        });

    }

    private void init_ampm(JTextField tf1) {
        Field.Combo tf_hour = (Field.Combo) tf1;

        String[] min = {"AM", "PM"};

        String[] am = {""};
        Object[][] obj = new Object[min.length][1];
        for (int i = 0; i < min.length; i++) {
            obj[i][0] = " " + min[i];
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_hour.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_hour, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                String to = min[data.selected_row];
                tf_hour.setText(to);
            }
        });
    }

    private void room() {
        Window p = (Window) this;
        Dlg_classrooms nd = Dlg_classrooms.create(p, true);
        nd.setTitle("");
//        nd.do_pass(services);
        nd.setCallback(new Dlg_classrooms.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_classrooms.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void init_room(JTextField tf1) {

        Field.Combo tf_hour = (Field.Combo) tf1;

        List<Classrooms.to_classrooms> rooms = Classrooms.ret_data(" order by classroom asc ");

        Object[][] obj = new Object[rooms.size()][1];
        int i = 0;
        for (Classrooms.to_classrooms to : rooms) {
            obj[i][0] = " " + to.classroom;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf1.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_hour, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Classrooms.to_classrooms to = rooms.get(data.selected_row);
                Field.Combo tf_room = (Field.Combo) tf1;
                tf_room.setText(to.classroom);
                tf_room.setId("" + to.id);
            }
        });
    }

    private void init_room2(JTextField tf1) {

        Field.Combo tf_hour = (Field.Combo) tf1;

        List<Classrooms.to_classrooms> rooms = Classrooms.ret_data(" order by classroom asc ");

        Object[][] obj = new Object[rooms.size()][1];
        int i = 0;
        for (Classrooms.to_classrooms to : rooms) {
            obj[i][0] = " " + to.classroom;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf1.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_hour, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Classrooms.to_classrooms to = rooms.get(data.selected_row);
                Field.Combo tf_room = (Field.Combo) tf1;
                tf_room.setText(to.classroom);
                tf_room.setId("" + to.id);
            }
        });
    }

    private void save_schedule() {
        List<String> days = new ArrayList();
        List<String> days2 = new ArrayList();

        Field.Combo ro = (Field.Combo) tf_field13;
        if (ro.getId() == null || ro.getText().isEmpty()) {
            Alert.set(0, "Select a room");
            return;
        }
        int id = 0;
        int enrollment_offered_subject_section_id = section.id;
        int enrollment_offered_subject_id = section.enrollment_offered_subject_id;
        int academic_offering_subject_id = section.academic_offering_subject_id;
        int academic_offering_id = section.academic_offering_id;
        int academic_year_id = section.academic_year_id;
        String academic_year = section.academic_year;
        int level_id = section.level_id;
        String level = section.level;
        int college_id = section.college_id;
        String college = section.college;
        int department_id = section.department_id;
        String department = section.department;
        int course_id = section.course_id;
        String course_code = section.course_code;
        String course_description = section.course_description;
        String term = section.term;
        String year_level = section.year_level;
        int subject_id = section.subject_id;
        String subject_code = section.subject_code;
        String description = section.description;
        int room_id = FitIn.toInt(ro.getId());
        String room = ro.getText();
        String schedule = "";
        String day = "";
        String time = "";

        String date = "2019-01-01 ";
        int hour1 = FitIn.toInt(tf_user_screen_name5.getText());
        int hour2 = FitIn.toInt(tf_user_screen_name2.getText());
        if (tf_user_screen_name7.getText().equalsIgnoreCase("pm")) {
            hour1 = hour1 + 12;
        }
        if (tf_user_screen_name4.getText().equalsIgnoreCase("pm")) {
            hour2 = hour2 + 12;
        }
        String start_time = "" + hour1 + ":" + tf_user_screen_name6.getText() + ":00 ";
        start_time = date + start_time;
        String closing_time = "" + hour2 + ":" + tf_user_screen_name3.getText() + ":00 ";
        closing_time = date + closing_time;

        if (jCheckBox1.isSelected()) {
            days.add("Monday");
        }
        if (jCheckBox2.isSelected()) {
            days.add("Tuesday");
        }
        if (jCheckBox3.isSelected()) {
            days.add("Wednesday");
        }
        if (jCheckBox4.isSelected()) {
            days.add("Thursday");
        }
        if (jCheckBox5.isSelected()) {
            days.add("Friday");
        }
        if (jCheckBox6.isSelected()) {
            days.add("Saturday");
        }
        if (jCheckBox7.isSelected()) {
            days.add("Sunday");
        }

        String created_at = DateType.now();
        String updated_at = DateType.now();
        String created_by = MyUser.getUser_id();
        String updated_by = MyUser.getUser_id();
        int status = section.status;
        int is_uploaded = section.is_uploaded;

        //check if room is occupied at this time and day
        String where = " where academic_year_id='" + section.academic_year_id + "' ";
        if (section.department.toUpperCase().contains("TERTIARY") || section.department.toUpperCase().contains("SENIOR")) {
            where = where + " and department_id='" + section.department_id + "' and term like '" + section.term + "' ";

        } else {
            where = where + " and department_id='" + section.department_id + "' ";
        }

        where = where + "  and room_id='" + ro.getId() + "' order by start_time asc ";
//        System.out.println(where);

        //end of checking
        //Check if exists
//        String where = " where enrollment_offered_subject_section_id='" + section.id + "' order by start_time asc ";
        List<to_enrollment_offered_subject_section_room_schedules> datas = Enrollment_offered_subject_section_room_schedules.ret_data(where);

        for (String day1 : days) {
            int exists = 0;
            for (to_enrollment_offered_subject_section_room_schedules to : datas) {
                if (room.equalsIgnoreCase(to.room) && day1.equalsIgnoreCase(to.day) && subject_id == to.subject_id) {
                    try {
                        Date min = synsoftech.util.DateType.datetime.parse(to.start_time);
                        Date max = synsoftech.util.DateType.datetime.parse(to.closing_time);
                        Date d1 = synsoftech.util.DateType.datetime.parse(start_time);
                        Date d2 = synsoftech.util.DateType.datetime.parse(closing_time);

                        boolean ret = d1.compareTo(min) >= 0 && d1.compareTo(max) <= 0;
                        boolean ret2 = d2.compareTo(min) >= 0 && d2.compareTo(max) <= 0;
                        if (ret) {
                            exists = 1;
                            break;
                        }
                        if (ret2) {
                            exists = 1;
                            break;
                        }
                    } catch (ParseException ex) {
                        Logger.getLogger(Time.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if (exists == 0) {
                days2.add(day1);
            } else {
                Window p = (Window) this;
                Dlg_confirm_action4 nd = Dlg_confirm_action4.create(p, true);
                nd.setTitle("");
                nd.do_pass("<html>Room: <b>" + ro.getText() + "</b> Day: <b>" + day1 + "</b> Time: <b>" + start_time + " - " + closing_time + "</b> Conflict of schedule!</html>");

                nd.setCallback(new Dlg_confirm_action4.Callback() {

                    @Override
                    public void ok(CloseDialog closeDialog, Dlg_confirm_action4.OutputData data) {
                        closeDialog.ok();

                    }
                });
                nd.setLocationRelativeTo(this);
                nd.setVisible(true);
            }
        }

        Enrollment_offered_subject_section_room_schedules.to_enrollment_offered_subject_section_room_schedules to_room = new to_enrollment_offered_subject_section_room_schedules(id, enrollment_offered_subject_section_id, enrollment_offered_subject_id, academic_offering_subject_id, academic_offering_id, academic_year_id, academic_year, level_id, level, college_id, college, department_id, department, course_id, course_code, course_description, term, year_level, subject_id, subject_code, description, room_id, room, schedule, day, time, start_time, closing_time, created_at, updated_at, created_by, updated_by, status, is_uploaded);

        Window p = (Window) this;
        Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
        nd.setTitle("");
//        nd.do_pass(services);
        nd.setCallback(new Dlg_confirm_action.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                closeDialog.ok();
//                System.out.println("to_room: " + to_room);
                Enrollment_offered_subject_section_room_schedules.add_data(to_room, days2);
                Alert.set(1, "");
                ret_schedules();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);

    }

    private void select_schedule() {
        int row = tbl_enrollment_offered_subject_section_room_schedules.getSelectedRow();
        if (row < 0) {
            return;
        }
        Enrollment_offered_subject_section_room_schedules.to_enrollment_offered_subject_section_room_schedules to = (Enrollment_offered_subject_section_room_schedules.to_enrollment_offered_subject_section_room_schedules) tbl_enrollment_offered_subject_section_room_schedules_ALM.get(row);
        int col = tbl_enrollment_offered_subject_section_room_schedules.getSelectedColumn();
        if (col == 5) {
            Window p = (Window) this;
            Dlg_confirm_delete nd = Dlg_confirm_delete.create(p, true);
            nd.setTitle("");
//            nd.do_pass(services);
            nd.setCallback(new Dlg_confirm_delete.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_delete.OutputData data) {
                    closeDialog.ok();
                    Enrollment_offered_subject_section_room_schedules.delete_data(to);
                    Alert.set(3, "");
                    ret_schedules();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
    }

    private void ok() {
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData());
        }
    }

    private void view_room_schedules() {

        Field.Combo room = (Field.Combo) tf_field13;
        if (room.getId() == null || room.getId().isEmpty()) {
            return;
        }
        Window p = (Window) this;
        Dlg_room_schedules nd = Dlg_room_schedules.create(p, true);
        nd.setTitle("");
        nd.do_pass(room.getId(), room.getText(), section);
        nd.setCallback(new Dlg_room_schedules.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_room_schedules.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }
}
