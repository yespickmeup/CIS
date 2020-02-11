/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.deans_portal;

import cis.academic.Academic_offering_subject_section_schedules;
import cis.academic.Academic_offering_subject_section_schedules.to_academic_offering_subject_section_schedules;
import cis.academic.Academic_offering_subject_sections;
import cis.academic.Academic_offering_subject_sections.to_academic_offering_subject_sections;
import cis.academic.Academic_offering_subjects;
import cis.classrooms.Classrooms;
import cis.classrooms.Dlg_classrooms;
import cis.faculty_members.Faculty_members;
import cis.users.MyUser;
import cis.utils.Alert;
import cis.utils.DateType;
import cis.utils.Dlg_confirm_action;
import cis.utils.Dlg_confirm_delete;
import cis.utils.TableRenderer;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.ParseException;
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

/**
 *
 * @author Ronescape
 */
public class Dlg_dean_portal_add_section extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_dean_portal_add_section
     */
    //<editor-fold defaultstate="collapsed" desc=" callback ">
    private Callback callback;

    public void setCallback(Callback callback) {
        this.callback = callback;

    }

    public static interface Callback {

        void ok(CloseDialog closeDialog, OutputData data);

        void remove(CloseDialog closeDialog);
    }

    public static class InputData {
    }

    public static class OutputData {

        public final String faculty_id;
        public final String faculty_name;

        public OutputData(String faculty_id, String faculty_name) {
            this.faculty_id = faculty_id;
            this.faculty_name = faculty_name;
        }

    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_dean_portal_add_section(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_dean_portal_add_section(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_dean_portal_add_section() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_dean_portal_add_section myRef;

    private void setThisRef(Dlg_dean_portal_add_section myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_dean_portal_add_section> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_dean_portal_add_section create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_dean_portal_add_section create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_dean_portal_add_section dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_dean_portal_add_section((java.awt.Frame) parent, false);
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
            Dlg_dean_portal_add_section dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_dean_portal_add_section((java.awt.Dialog) parent, false);
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

        Dlg_dean_portal_add_section dialog = Dlg_dean_portal_add_section.create(new javax.swing.JFrame(), true);
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
        jPanel3 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_academic_offering_subject_sections = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tf_user_screen_name1 = new Field.Search();
        jLabel8 = new javax.swing.JLabel();
        tf_field2 = new Field.Input();
        jLabel15 = new javax.swing.JLabel();
        tf_field8 = new Field.Input();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_field3 = new Field.Input();
        tf_field4 = new Field.Input();
        jButton8 = new javax.swing.JButton();
        jButton12 = new Button.Success();
        jButton11 = new Button.Default();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        tf_field11 = new Field.Input();
        tf_field10 = new Field.Input();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        tf_field13 = new Field.Combo();
        jLabel35 = new javax.swing.JLabel();
        tf_field14 = new Field.Combo();
        jButton7 = new javax.swing.JButton();
        jButton14 = new Button.Default();
        jButton15 = new Button.Success();
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
        jPanel22 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_academic_offering_subject_section_schedules = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton13 = new Button.Success();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Section", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Records", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tbl_academic_offering_subject_sections.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_academic_offering_subject_sections.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_academic_offering_subject_sectionsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_academic_offering_subject_sections);

        jLabel2.setText("0");

        jLabel1.setText("No. of rows:");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Instructor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Instructor:");

        tf_user_screen_name1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_user_screen_name1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_user_screen_name1MouseClicked(evt);
            }
        });
        tf_user_screen_name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_user_screen_name1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Department:");

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

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Group:");

        tf_field8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field8.setFocusable(false);
        tf_field8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field8MouseClicked(evt);
            }
        });
        tf_field8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field8ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Level/College:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Designation:");

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

        jButton8.setText("View Schedules");
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cis/icons2/icon.png"))); // NOI18N
        jButton12.setToolTipText("Save");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cis/icons2/new-file.png"))); // NOI18N
        jButton11.setToolTipText("New");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_field2, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                    .addComponent(tf_field8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_field3)
                                    .addComponent(tf_field4)))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(tf_user_screen_name1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_user_screen_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel16Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1))
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_field2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_field3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(1, 1, 1)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_field8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("End date:");

        tf_field11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field11MouseClicked(evt);
            }
        });
        tf_field11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field11ActionPerformed(evt);
            }
        });

        tf_field10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field10MouseClicked(evt);
            }
        });
        tf_field10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field10ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Section Name:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Max Student:");

        jDateChooser1.setDate(new Date());
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Start Date:");

        jDateChooser2.setDate(new Date());
        jDateChooser2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_field11, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_field10, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cis/icons/settings.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cis/icons2/new-file.png"))); // NOI18N
        jButton14.setToolTipText("New");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cis/icons2/icon.png"))); // NOI18N
        jButton15.setToolTipText("Save");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

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
                .addComponent(tf_user_screen_name5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel18)
                .addGap(0, 0, 0)
                .addComponent(tf_user_screen_name6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_user_screen_name7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(tf_user_screen_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel20)
                .addGap(0, 0, 0)
                .addComponent(tf_user_screen_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_user_screen_name4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
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

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(tf_field13)
                                .addGap(0, 0, 0)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_field14)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        tbl_academic_offering_subject_section_schedules.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbl_academic_offering_subject_section_schedules);

        jLabel3.setText("No. of rows:");

        jLabel4.setText("0");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(381, 381, 381))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_user_screen_name1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_user_screen_name1MouseClicked
        init_users();
    }//GEN-LAST:event_tf_user_screen_name1MouseClicked

    private void tf_user_screen_name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_user_screen_name1ActionPerformed
        init_users();
    }//GEN-LAST:event_tf_user_screen_name1ActionPerformed

    private void tf_field2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field2MouseClicked

    }//GEN-LAST:event_tf_field2MouseClicked

    private void tf_field2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field2ActionPerformed

    }//GEN-LAST:event_tf_field2ActionPerformed

    private void tf_field3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field3MouseClicked

    }//GEN-LAST:event_tf_field3MouseClicked

    private void tf_field3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field3ActionPerformed

    }//GEN-LAST:event_tf_field3ActionPerformed

    private void tf_field4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field4MouseClicked

    }//GEN-LAST:event_tf_field4MouseClicked

    private void tf_field4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field4ActionPerformed

    }//GEN-LAST:event_tf_field4ActionPerformed

    private void tf_field8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field8MouseClicked

    }//GEN-LAST:event_tf_field8MouseClicked

    private void tf_field8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field8ActionPerformed

    }//GEN-LAST:event_tf_field8ActionPerformed

    private void tf_field10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field10MouseClicked

    private void tf_field10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field10ActionPerformed

    private void tf_field11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field11MouseClicked

    private void tf_field11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
      ok();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void tf_field13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field13MouseClicked
        init_room(tf_field13);
    }//GEN-LAST:event_tf_field13MouseClicked

    private void tf_field13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field13ActionPerformed
        init_room(tf_field13);
    }//GEN-LAST:event_tf_field13ActionPerformed

    private void tf_field14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field14MouseClicked
        init_day(tf_field14);
    }//GEN-LAST:event_tf_field14MouseClicked

    private void tf_field14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field14ActionPerformed
        init_day(tf_field14);
    }//GEN-LAST:event_tf_field14ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        room();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        clear_add_section();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        save_section();
    }//GEN-LAST:event_jButton12ActionPerformed

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

    private void tbl_academic_offering_subject_sectionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_academic_offering_subject_sectionsMouseClicked
        select_section();
    }//GEN-LAST:event_tbl_academic_offering_subject_sectionsMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbl_academic_offering_subject_section_schedules;
    private javax.swing.JTable tbl_academic_offering_subject_sections;
    private javax.swing.JTextField tf_field10;
    private javax.swing.JTextField tf_field11;
    private javax.swing.JTextField tf_field13;
    private javax.swing.JTextField tf_field14;
    private javax.swing.JTextField tf_field2;
    private javax.swing.JTextField tf_field3;
    private javax.swing.JTextField tf_field4;
    private javax.swing.JTextField tf_field8;
    private javax.swing.JTextField tf_user_screen_name1;
    private javax.swing.JTextField tf_user_screen_name2;
    private javax.swing.JTextField tf_user_screen_name3;
    private javax.swing.JTextField tf_user_screen_name4;
    private javax.swing.JTextField tf_user_screen_name5;
    private javax.swing.JTextField tf_user_screen_name6;
    private javax.swing.JTextField tf_user_screen_name7;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        System.setProperty("pool_db", "db_cis_cosca");
        System.setProperty("pool_password", "password");

        Field.Combo tf_hour_from = (Field.Combo) tf_user_screen_name5;
        Field.Combo tf_mm_from = (Field.Combo) tf_user_screen_name6;
        tf_hour_from.setPrompt("HH");
        tf_mm_from.setPrompt("MM");

        Field.Combo tf_hour_to = (Field.Combo) tf_user_screen_name2;
        Field.Combo tf_mm_to = (Field.Combo) tf_user_screen_name3;
        tf_hour_to.setPrompt("HH");
        tf_mm_to.setPrompt("MM");

        Field.Combo tf_day = (Field.Combo) tf_field14;
        tf_day.setPrompt("Choose Day");

        init_tbl_academic_offering_subject_sections(tbl_academic_offering_subject_sections);
        init_tbl_academic_offering_subject_section_schedules(tbl_academic_offering_subject_section_schedules);

    }

    Academic_offering_subjects.to_academic_offering_subjects aos = null;

    public void do_pass(Academic_offering_subjects.to_academic_offering_subjects to) {
        aos = to;
        if (to.faculty_id != 0) {
            Field.Search co = (Field.Search) tf_user_screen_name1;
            co.setText("" + to.faculty_name);
            co.setId("" + to.faculty_id);

            List<Faculty_members.to_faculty_members> members = Faculty_members.ret_data(" where id='" + co.getId() + "' ");
            if (!members.isEmpty()) {
                Faculty_members.to_faculty_members fac = (Faculty_members.to_faculty_members) members.get(0);
                tf_field2.setText(fac.department);
                tf_field3.setText(fac.college);
                tf_field8.setText(fac.group_name);
                tf_field4.setText(fac.designation);
                String job = "Fulltime";
                if (fac.is_fulltime == 2) {
                    job = "Parttime";
                }
                if (fac.is_fulltime == 3) {
                    job = "Job Order";
                }
//                tf_field9.setText(job);
            }
        }

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

    private void init_users() {
        Field.Search co = (Field.Search) tf_user_screen_name1;
        String where = " where lname like '%" + co.getText() + "%' order by lname asc  ";
        List<Faculty_members.to_faculty_members> users = Faculty_members.ret_data(where);
        Object[][] obj = new Object[users.size()][1];
        int i = 0;
        for (Faculty_members.to_faculty_members to : users) {
            obj[i][0] = " " + to.lname + ", " + to.fname + " " + to.mi;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_user_screen_name1.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_user_screen_name1, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Faculty_members.to_faculty_members to = users.get(data.selected_row);
                Field.Search co = (Field.Search) tf_user_screen_name1;
                co.setText("" + to.lname + ", " + to.fname + " " + to.mi);
                co.setId("" + to.id);
                tf_field2.setText(to.department);
                tf_field3.setText(to.college);
                tf_field8.setText(to.group_name);
                tf_field4.setText(to.designation);
                String job = "Fulltime";
                if (to.is_fulltime == 2) {
                    job = "Parttime";
                }
                if (to.is_fulltime == 3) {
                    job = "Job Order";
                }
//                tf_field9.setText(job);

            }
        });
    }

    private void confirm() {
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
        Field.Search co = (Field.Search) tf_user_screen_name1;
        int faculty_id = FitIn.toInt(co.getId());
        if (faculty_id == 0) {
            Alert.set(0, "Select Faculty Member");
            tf_user_screen_name1.grabFocus();
            return;
        }
        String faculty_name = co.getText();
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData("", faculty_name));
        }
    }

    private void confirm_remove() {
        Window p = (Window) this;
        Dlg_confirm_delete nd = Dlg_confirm_delete.create(p, true);
        nd.setTitle("");
//        nd.do_pass(services);
        nd.setCallback(new Dlg_confirm_delete.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_delete.OutputData data) {
                closeDialog.ok();
                remove();
            }
        });

        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void remove() {
        if (callback != null) {
            callback.remove(new CloseDialog(this));
        }
    }

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

        String[] min = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
            "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
            "31", "32", "33", "34", "35", "36", "37", "38", "39", "40",
            "41", "42", "44", "44", "45", "46", "47", "48", "49", "40",
            "51", "52", "55", "54", "55", "56", "57", "58", "59",};

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

    private void init_day(JTextField tf1) {
        Field.Combo tf_hour = (Field.Combo) tf1;

        String[] am = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Object[][] obj = new Object[am.length][1];
        for (int i = 0; i < am.length; i++) {
            obj[i][0] = " " + am[i];
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
                String to = am[data.selected_row];
                tf_hour.setText(to);
            }
        });
    }

    //<editor-fold defaultstate="collapsed" desc=" academic_offering_subject_sections "> 
    public static ArrayListModel tbl_academic_offering_subject_sections_ALM;
    public static Tblacademic_offering_subject_sectionsModel tbl_academic_offering_subject_sections_M;

    public static void init_tbl_academic_offering_subject_sections(JTable tbl_academic_offering_subject_sections) {
        tbl_academic_offering_subject_sections_ALM = new ArrayListModel();
        tbl_academic_offering_subject_sections_M = new Tblacademic_offering_subject_sectionsModel(tbl_academic_offering_subject_sections_ALM);
        tbl_academic_offering_subject_sections.setModel(tbl_academic_offering_subject_sections_M);
        tbl_academic_offering_subject_sections.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_academic_offering_subject_sections.setRowHeight(25);
        int[] tbl_widths_academic_offering_subject_sections = {100, 50, 70, 180, 100, 60, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_academic_offering_subject_sections.length; i < n; i++) {

            if (i == 1) {
                continue;
            }

            TableWidthUtilities.setColumnWidth(tbl_academic_offering_subject_sections, i, tbl_widths_academic_offering_subject_sections[i]);
        }
        Dimension d = tbl_academic_offering_subject_sections.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_academic_offering_subject_sections.getTableHeader().setPreferredSize(d);
        tbl_academic_offering_subject_sections.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_academic_offering_subject_sections.setRowHeight(25);
        tbl_academic_offering_subject_sections.setFont(new java.awt.Font("Arial", 0, 12));

    }

    public static void loadData_academic_offering_subject_sections(List<to_academic_offering_subject_sections> acc) {
        tbl_academic_offering_subject_sections_ALM.clear();
        tbl_academic_offering_subject_sections_ALM.addAll(acc);
    }

    public static class Tblacademic_offering_subject_sectionsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Section", "Instructor", "Limit", "Date", "Room", "Day/s", "", "level", "college", "department_id", "department", "course_id", "course_code", "course_description", "term", "year_level", "section", "subject_id", "subject_code", "description", "units", "lecture_units", "lab_units", "amount", "is_lab", "max_students", "prerequisite_subject_ids", "subject_group", "subject_group_id", "faculty_id", "faculty_name", "room_id", "room", "schedule", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded"
        };

        public Tblacademic_offering_subject_sectionsModel(ListModel listmodel) {
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
            to_academic_offering_subject_sections tt = (to_academic_offering_subject_sections) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.section;
                case 1:
                    return " " + tt.faculty_name;
                case 2:
                    return " " + tt.max_students;
                case 3:
                    return " " + DateType.convert_slash_datetime2(tt.start_date) + " / " + DateType.convert_slash_datetime2(tt.end_date);
                case 4:
                    return " " + tt.room;
                case 5:
                    return " MWF";
                case 6:
                    return " Delete";
                case 7:
                    return tt.college_id;
                case 8:
                    return tt.college;
                case 9:
                    return tt.department_id;
                case 10:
                    return tt.department;
                case 11:
                    return tt.course_id;
                case 12:
                    return tt.course_code;
                case 13:
                    return tt.course_description;
                case 14:
                    return tt.term;
                case 15:
                    return tt.year_level;
                case 16:
                    return tt.section;
                case 17:
                    return tt.subject_id;
                case 18:
                    return tt.subject_code;
                case 19:
                    return tt.description;
                case 20:
                    return tt.units;
                case 21:
                    return tt.lecture_units;
                case 22:
                    return tt.lab_units;
                case 23:
                    return tt.amount;
                case 24:
                    return tt.is_lab;
                case 25:
                    return tt.max_students;
                case 26:
                    return tt.prerequisite_subject_ids;
                case 27:
                    return tt.subject_group;
                case 28:
                    return tt.subject_group_id;
                case 29:
                    return tt.faculty_id;
                case 30:
                    return tt.faculty_name;
                case 31:
                    return tt.room_id;
                case 32:
                    return tt.room;
                case 33:
                    return tt.schedule;
                case 34:
                    return tt.created_at;
                case 35:
                    return tt.updated_at;
                case 36:
                    return tt.created_by;
                case 37:
                    return tt.updated_by;
                case 38:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }

    private void ret_data() {
        String where = " where academic_offering_subject_id='" + aos.id + "' ";
        List<to_academic_offering_subject_sections> datas = Academic_offering_subject_sections.ret_data(where);
        loadData_academic_offering_subject_sections(datas);
        jLabel2.setText("" + datas.size());
    }
//</editor-fold> 

    private void save_section() {
        int row = tbl_academic_offering_subject_sections.getSelectedRow();
        if (row < 0) {
            int id = 0;
            int academic_offering_subject_id = aos.id;
            int academic_offering_id = aos.academic_offering_id;
            int academic_year_id = aos.academic_year_id;
            String academic_year = aos.academic_year;
            int level_id = aos.level_id;
            String level = aos.level;
            int college_id = aos.college_id;
            String college = aos.college;
            int department_id = aos.department_id;
            String department = aos.department;
            int course_id = aos.course_id;
            String course_code = aos.course_code;
            String course_description = aos.course_description;
            String term = aos.term;
            String year_level = aos.year_level;
            String section = tf_field10.getText();
            int subject_id = aos.subject_id;
            String subject_code = aos.subject_code;
            String description = aos.description;
            double units = aos.units;
            double lecture_units = aos.lecture_units;
            double lab_units = aos.lab_units;
            double amount = aos.amount;
            int is_lab = aos.is_lab;
            int max_students = FitIn.toInt(tf_field11.getText());
            String prerequisite_subject_ids = aos.prerequisite_subject_ids;
            String subject_group = aos.subject_group;
            int subject_group_id = aos.subject_group_id;
            Field.Search fi = (Field.Search) tf_user_screen_name1;
            int faculty_id = FitIn.toInt(fi.getId());
            String faculty_name = fi.getText();
            int room_id = aos.room_id;
            String room = aos.room;
            String schedule = aos.schedule;
            String start_date = DateType.sf.format(jDateChooser1.getDate());
            String end_date = DateType.sf.format(jDateChooser2.getDate());
            String created_at = DateType.now();
            String updated_at = DateType.now();
            String created_by = MyUser.getUser_id();
            String updated_by = MyUser.getUser_id();
            int status = 1;
            int is_uploaded = 0;
            Academic_offering_subject_sections.to_academic_offering_subject_sections sec = new to_academic_offering_subject_sections(id, academic_offering_subject_id, academic_offering_id, academic_year_id, academic_year, level_id, level, college_id, college, department_id, department, course_id, course_code, course_description, term, year_level, section, subject_id, subject_code, description, units, lecture_units, lab_units, amount, is_lab, max_students, prerequisite_subject_ids, subject_group, subject_group_id, faculty_id, faculty_name, room_id, room, schedule, start_date, end_date, created_at, updated_at, created_by, updated_by, status, is_uploaded);
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
//            nd.do_pass(services);
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    Academic_offering_subject_sections.add_data(sec);
                    ret_data();
                    Alert.set(1, "");
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);

        } else {
            Academic_offering_subject_sections.to_academic_offering_subject_sections to = (Academic_offering_subject_sections.to_academic_offering_subject_sections) tbl_academic_offering_subject_sections_ALM.get(row);

            int id = to.id;
            int academic_offering_subject_id = to.id;
            int academic_offering_id = to.academic_offering_id;
            int academic_year_id = to.academic_year_id;
            String academic_year = to.academic_year;
            int level_id = to.level_id;
            String level = to.level;
            int college_id = to.college_id;
            String college = to.college;
            int department_id = to.department_id;
            String department = to.department;
            int course_id = to.course_id;
            String course_code = to.course_code;
            String course_description = to.course_description;
            String term = to.term;
            String year_level = to.year_level;
            String section = tf_field10.getText();
            int subject_id = to.subject_id;
            String subject_code = to.subject_code;
            String description = to.description;
            double units = to.units;
            double lecture_units = to.lecture_units;
            double lab_units = to.lab_units;
            double amount = to.amount;
            int is_lab = to.is_lab;
            int max_students = FitIn.toInt(tf_field11.getText());
            String prerequisite_subject_ids = to.prerequisite_subject_ids;
            String subject_group = to.subject_group;
            int subject_group_id = to.subject_group_id;
            int faculty_id = to.faculty_id;
            String faculty_name = to.faculty_name;
            int room_id = to.room_id;
            String room = to.room;
            String schedule = to.schedule;
            String start_date = DateType.sf.format(jDateChooser1.getDate());
            String end_date = DateType.sf.format(jDateChooser2.getDate());
            String created_at = to.created_at;
            String updated_at = to.updated_at;
            String created_by = MyUser.getUser_id();
            String updated_by = MyUser.getUser_id();
            int status = to.status;
            int is_uploaded = 2;
            Academic_offering_subject_sections.to_academic_offering_subject_sections sec = new to_academic_offering_subject_sections(id, academic_offering_subject_id, academic_offering_id, academic_year_id, academic_year, level_id, level, college_id, college, department_id, department, course_id, course_code, course_description, term, year_level, section, subject_id, subject_code, description, units, lecture_units, lab_units, amount, is_lab, max_students, prerequisite_subject_ids, subject_group, subject_group_id, faculty_id, faculty_name, room_id, room, schedule, start_date, end_date, created_at, updated_at, created_by, updated_by, status, is_uploaded);
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
//            nd.do_pass(services);
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    Academic_offering_subject_sections.update_data(sec);
                    ret_data();
                    Alert.set(2, "");
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);

        }
    }

    private void select_section() {
        int row = tbl_academic_offering_subject_sections.getSelectedRow();
        if (row < 0) {
            return;
        }

        Academic_offering_subject_sections.to_academic_offering_subject_sections to = (Academic_offering_subject_sections.to_academic_offering_subject_sections) tbl_academic_offering_subject_sections_ALM.get(row);

        tf_field10.setText(to.section);
        tf_field11.setText("" + to.max_students);
        try {
            Date d1 = DateType.sf.parse(to.start_date);
            Date d2 = DateType.sf.parse(to.end_date);
            jDateChooser1.setDate(d1);
            jDateChooser1.setDate(d2);
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_dean_portal_add_section.class.getName()).log(Level.SEVERE, null, ex);
        }

        ret_schedules();
    }

    //<editor-fold defaultstate="collapsed" desc=" academic_offering_subject_section_schedules "> 
    public static ArrayListModel tbl_academic_offering_subject_section_schedules_ALM;
    public static Tblacademic_offering_subject_section_schedulesModel tbl_academic_offering_subject_section_schedules_M;

    public static void init_tbl_academic_offering_subject_section_schedules(JTable tbl_academic_offering_subject_section_schedules) {
        tbl_academic_offering_subject_section_schedules_ALM = new ArrayListModel();
        tbl_academic_offering_subject_section_schedules_M = new Tblacademic_offering_subject_section_schedulesModel(tbl_academic_offering_subject_section_schedules_ALM);
        tbl_academic_offering_subject_section_schedules.setModel(tbl_academic_offering_subject_section_schedules_M);
        tbl_academic_offering_subject_section_schedules.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_academic_offering_subject_section_schedules.setRowHeight(25);
        int[] tbl_widths_academic_offering_subject_section_schedules = {100, 70, 120, 60, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_academic_offering_subject_section_schedules.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_academic_offering_subject_section_schedules, i, tbl_widths_academic_offering_subject_section_schedules[i]);
        }
        Dimension d = tbl_academic_offering_subject_section_schedules.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_academic_offering_subject_section_schedules.getTableHeader().setPreferredSize(d);
        tbl_academic_offering_subject_section_schedules.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_academic_offering_subject_section_schedules.setRowHeight(25);
        tbl_academic_offering_subject_section_schedules.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_academic_offering_subject_section_schedules(List<to_academic_offering_subject_section_schedules> acc) {
        tbl_academic_offering_subject_section_schedules_ALM.clear();
        tbl_academic_offering_subject_section_schedules_ALM.addAll(acc);
    }

    public static class Tblacademic_offering_subject_section_schedulesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Room", "Day/s", "Time", "", "day", "start_time", "end_time", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded"
        };

        public Tblacademic_offering_subject_section_schedulesModel(ListModel listmodel) {
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
            to_academic_offering_subject_section_schedules tt = (to_academic_offering_subject_section_schedules) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.room;
                case 1:
                    return " " + tt.day;
                case 2:
                    return " " + DateType.convert_datetime_to_hour_minute(tt.start_time) + " - " + DateType.convert_datetime_to_hour_minute(tt.end_time);
                case 3:
                    return " Delete";
                case 4:
                    return tt.day;
                case 5:
                    return tt.start_time;
                case 6:
                    return tt.end_time;
                case 7:
                    return tt.created_at;
                case 8:
                    return tt.updated_at;
                case 9:
                    return tt.created_by;
                case 10:
                    return tt.updated_by;
                case 11:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }

    private void ret_schedules() {
        int row = tbl_academic_offering_subject_sections.getSelectedRow();
        if (row < 0) {
            return;
        }

        Academic_offering_subject_sections.to_academic_offering_subject_sections to = (Academic_offering_subject_sections.to_academic_offering_subject_sections) tbl_academic_offering_subject_sections_ALM.get(row);

        String where = " where aoss_id='" + to.id + "' ";
        List<Academic_offering_subject_section_schedules.to_academic_offering_subject_section_schedules> list = Academic_offering_subject_section_schedules.ret_data(where);
        loadData_academic_offering_subject_section_schedules(list);
        jLabel4.setText("" + list.size());
    }

//</editor-fold> 
    private void save_schedule() {
        int row = tbl_academic_offering_subject_sections.getSelectedRow();
        if (row < 0) {
            return;
        }

        Field.Combo rom = (Field.Combo) tf_field13;
        Academic_offering_subject_sections.to_academic_offering_subject_sections to = (Academic_offering_subject_sections.to_academic_offering_subject_sections) tbl_academic_offering_subject_sections_ALM.get(row);
        int id = 0;
        int aoss_id = to.id;
        int room_id = FitIn.toInt(rom.getId());
        String room = rom.getText();
        String day = tf_field14.getText();
        String date = "2019-01-01 ";
        int hour1 = FitIn.toInt(tf_user_screen_name5.getText());
        int hour2 = FitIn.toInt(tf_user_screen_name2.getText());
        if (tf_user_screen_name7.getText().equalsIgnoreCase("pm")) {
            hour1 = hour1 + 12;
        }
        if (tf_user_screen_name4.getText().equalsIgnoreCase("pm")) {
            hour2 = hour2 + 12;
        }
        String start_time = "" + hour1 + ":" + tf_user_screen_name6.getText() + ":00 " + tf_user_screen_name7.getText();
        start_time = date + start_time;
        String end_time = "" + hour2 + ":" + tf_user_screen_name3.getText() + ":00 " + tf_user_screen_name4.getText();
        end_time = date + end_time;

        try {
            Date d1 = DateType.datetime2.parse(start_time);

            start_time = DateType.datetime.format(d1);
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_dean_portal_add_section.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Date d2 = DateType.datetime2.parse(end_time);
            end_time = DateType.datetime.format(d2);
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_dean_portal_add_section.class.getName()).log(Level.SEVERE, null, ex);
        }

        String created_at = DateType.now();
        String updated_at = DateType.now();
        String created_by = MyUser.getUser_id();
        String updated_by = MyUser.getUser_id();
        int status = 1;
        int is_uploaded = 2;

        Academic_offering_subject_section_schedules.to_academic_offering_subject_section_schedules aosss = new to_academic_offering_subject_section_schedules(id, aoss_id, room_id, room, day, start_time, end_time, created_at, updated_at, created_by, updated_by, status, is_uploaded);
        Window p = (Window) this;
        Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
        nd.setTitle("");
//        nd.do_pass(services);
        nd.setCallback(new Dlg_confirm_action.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                closeDialog.ok();
                Academic_offering_subject_section_schedules.add_data(aosss);
                Alert.set(1, day);
                ret_schedules();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);

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

        int row = tbl_academic_offering_subject_sections.getSelectedRow();
        if (row < 0) {
            Alert.set(0, "Please select Section!");
            return;
        }

        Field.Combo tf_hour = (Field.Combo) tf1;

        List<Classrooms.to_classrooms> rooms = Classrooms.ret_data(" order by classroom asc ");

        Object[][] obj = new Object[rooms.size()][1];
        int i = 0;
        for (Classrooms.to_classrooms to : rooms) {
            obj[i][0] = " " + to.classroom;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field13.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_hour, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Classrooms.to_classrooms to = rooms.get(data.selected_row);
                Field.Combo tf_room = (Field.Combo) tf_field13;
                tf_room.setText(to.classroom);
                tf_room.setId("" + to.id);
            }
        });
    }

    private void clear_add_section() {
        tf_field10.setText("");
        tf_field11.setText("");
        tbl_academic_offering_subject_sections.clearSelection();
        tbl_academic_offering_subject_section_schedules_ALM.clear();
        tf_field13.setText("");
        tf_field14.setText("");

        tf_user_screen_name5.setText("");
        tf_user_screen_name6.setText("");
        tf_user_screen_name2.setText("");
        tf_user_screen_name3.setText("");
    }

    private void ok() {
        String faculty_names = "";
        String faculty_ids = "";
        int i = 0;
        List<to_academic_offering_subject_sections> datas = tbl_academic_offering_subject_sections_ALM;
        for (to_academic_offering_subject_sections to : datas) {
          
            if (i == 0) {
                faculty_names = to.faculty_name;
                faculty_ids = "" + to.faculty_id;
            } else {
                faculty_names = faculty_names + ", " + to.faculty_name;
                faculty_ids = faculty_ids + ", " + to.faculty_id;
            }
            i++;
        }
      
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(faculty_ids, faculty_names));
        }
    }

}
