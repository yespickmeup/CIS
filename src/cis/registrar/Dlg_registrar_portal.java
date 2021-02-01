/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.registrar;

import cis.academic.Academic_offering_subjects;
import cis.academic.Academic_offerings;
import cis.academic.Academic_year_period_schedules;
import cis.academic.Academic_year_periods;
import cis.academic.Academic_years;
import cis.colleges.Colleges;
import cis.courses.Courses;
import cis.deans_portal.Dlg_dean_student_advice_details;
import cis.deans_portal.Dlg_dean_student_advice_load_subject;
import cis.departments.Departments;
import cis.enrollments.Enrollment_offered_subjects;
import cis.enrollments.Enrollment_offered_subjects.to_enrollment_offered_subjects;
import cis.enrollments.Enrollment_student_loaded_subjects;
import cis.enrollments.Enrollment_student_loaded_subjects_drop_requests;
import cis.enrollments.Enrollments;
import cis.students.Students;
import cis.students.Students_curriculum;
import cis.subjects.Subject_groupings;
import cis.subjects.Subjects;
import cis.users.MyUser;
import cis.utils.Alert;
import cis.utils.Combo;
import cis.utils.DateType;
import cis.utils.Dlg_confirm_action3;
import cis.utils.Dlg_confirm_delete;
import cis.utils.Dlg_confirm_delete2;
import cis.utils.TableRenderer;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import org.jfree.ui.Align;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.util.ImageRenderer;

/**
 *
 * @author Ronescape
 */
public class Dlg_registrar_portal extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_registrar_portal
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
    private Dlg_registrar_portal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_registrar_portal(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_registrar_portal() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_registrar_portal myRef;

    private void setThisRef(Dlg_registrar_portal myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_registrar_portal> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_registrar_portal create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_registrar_portal create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_registrar_portal dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_registrar_portal((java.awt.Frame) parent, false);
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
            Dlg_registrar_portal dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_registrar_portal((java.awt.Dialog) parent, false);
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

        Dlg_registrar_portal dialog = Dlg_registrar_portal.create(new javax.swing.JFrame(), true);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        tf_field27 = new Field.Search();
        jLabel44 = new javax.swing.JLabel();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        tf_field5 = new Field.Input();
        jLabel14 = new javax.swing.JLabel();
        tf_field6 = new Field.Input();
        jLabel15 = new javax.swing.JLabel();
        tf_field7 = new Field.Input();
        jLabel16 = new javax.swing.JLabel();
        tf_field8 = new Field.Input();
        jButton1 = new javax.swing.JButton();
        jXCollapsiblePane1 = new org.jdesktop.swingx.JXCollapsiblePane();
        jPanel26 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        tf_field131 = new Field.Input();
        jLabel77 = new javax.swing.JLabel();
        tf_field132 = new Field.Input();
        jLabel75 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tf_field130 = new javax.swing.JTextArea();
        jLabel73 = new javax.swing.JLabel();
        tf_field125 = new Field.Input();
        jLabel74 = new javax.swing.JLabel();
        tf_field126 = new Field.Input();
        jLabel79 = new javax.swing.JLabel();
        tf_field128 = new Field.Input();
        jPanel28 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jCheckBox28 = new javax.swing.JCheckBox();
        tf_field9 = new Field.Combo();
        tf_field129 = new Field.Combo();
        jCheckBox29 = new javax.swing.JCheckBox();
        jLabel80 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_enrollment_student_loaded_subjects = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_added_subjects = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_dropped_subjects = new javax.swing.JTable();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        tf_field14 = new Field.Input();
        jLabel30 = new javax.swing.JLabel();
        tf_field22 = new Field.Combo();
        tf_field23 = new Field.Combo();
        jLabel31 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jLabel32 = new javax.swing.JLabel();
        jCheckBox9 = new javax.swing.JCheckBox();
        jLabel33 = new javax.swing.JLabel();
        tf_field24 = new Field.Combo();
        jButton11 = new Button.Info();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jLabel41 = new javax.swing.JLabel();
        tf_field28 = new Field.Combo();
        jCheckBox30 = new javax.swing.JCheckBox();
        jCheckBox31 = new javax.swing.JCheckBox();
        tf_field29 = new Field.Combo();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jCheckBox32 = new javax.swing.JCheckBox();
        tf_field30 = new Field.Combo();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_enrollments = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        tf_field2 = new Field.Combo();
        tf_field3 = new Field.Combo();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        tf_field = new Field.Combo();
        jLabel12 = new javax.swing.JLabel();
        tf_field4 = new Field.Search();
        jButton3 = new Button.Success();
        jPanel5 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        tf_field20 = new Field.Combo();
        tf_field11 = new Field.Combo();
        jCheckBox10 = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jCheckBox11 = new javax.swing.JCheckBox();
        tf_field12 = new Field.Combo();
        tf_field13 = new Field.Combo();
        jCheckBox12 = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jCheckBox20 = new javax.swing.JCheckBox();
        tf_field19 = new Field.Combo();
        tf_field21 = new Field.Combo();
        jCheckBox21 = new javax.swing.JCheckBox();
        jLabel28 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_academic_offering_subjects = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jCheckBox13 = new javax.swing.JCheckBox();
        tf_field15 = new Field.Combo();
        tf_field16 = new Field.Combo();
        jCheckBox14 = new javax.swing.JCheckBox();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jCheckBox15 = new javax.swing.JCheckBox();
        tf_field17 = new Field.Combo();
        tf_field18 = new Field.Search();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jLabel36 = new javax.swing.JLabel();
        tf_field25 = new Field.Combo();
        jLabel37 = new javax.swing.JLabel();
        tf_field26 = new Field.Combo();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_enrollment_offered_subjects = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("Search:");

        tf_field27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field27MouseClicked(evt);
            }
        });
        tf_field27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field27ActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("Search by:");

        buttonGroup2.add(jCheckBox26);
        jCheckBox26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox26.setText("Student No");

        buttonGroup2.add(jCheckBox27);
        jCheckBox27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox27.setSelected(true);
        jCheckBox27.setText("Name");

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel14.setOpaque(false);
        jPanel14.setPreferredSize(new java.awt.Dimension(154, 120));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cis/icons2/user.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel25.setOpaque(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("First Name:");

        tf_field5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field5.setFocusable(false);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Middle Name:");

        tf_field6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field6.setFocusable(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Last Name:");

        tf_field7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field7.setFocusable(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Student No.:");

        tf_field8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field8.setFocusable(false);
        tf_field8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field8ActionPerformed(evt);
            }
        });

        jButton1.setText("+");
        jButton1.setToolTipText("More Details");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_field6)
                    .addComponent(tf_field7)
                    .addComponent(tf_field5)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(tf_field8)
                        .addGap(0, 0, 0)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jXCollapsiblePane1.setBackground(new java.awt.Color(255, 255, 255));
        jXCollapsiblePane1.setCollapsed(true);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel76.setText("Course Code:");

        tf_field131.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field131.setFocusable(false);
        tf_field131.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field131MouseClicked(evt);
            }
        });
        tf_field131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field131ActionPerformed(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel77.setText("No. of Years:");

        tf_field132.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field132.setFocusable(false);
        tf_field132.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field132MouseClicked(evt);
            }
        });
        tf_field132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field132ActionPerformed(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel75.setText("Description:");

        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane5.setFocusable(false);

        tf_field130.setColumns(20);
        tf_field130.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_field130.setLineWrap(true);
        tf_field130.setRows(5);
        tf_field130.setFocusable(false);
        jScrollPane5.setViewportView(tf_field130);

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel73.setText("Department:");

        tf_field125.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field125.setFocusable(false);
        tf_field125.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field125MouseClicked(evt);
            }
        });
        tf_field125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field125ActionPerformed(evt);
            }
        });

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel74.setText("Level/College:");

        tf_field126.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field126.setFocusable(false);
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

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel79.setText("Year:");

        tf_field128.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field128.setText("First Year");
        tf_field128.setFocusable(false);
        tf_field128.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field128MouseClicked(evt);
            }
        });
        tf_field128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field128ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tf_field126, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_field125, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel26Layout.createSequentialGroup()
                        .addComponent(tf_field131, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field132))
                    .addComponent(tf_field128))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field131, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field132, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field125, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field126, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field128, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jXCollapsiblePane1Layout = new javax.swing.GroupLayout(jXCollapsiblePane1.getContentPane());
        jXCollapsiblePane1.getContentPane().setLayout(jXCollapsiblePane1Layout);
        jXCollapsiblePane1Layout.setHorizontalGroup(
            jXCollapsiblePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXCollapsiblePane1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        jXCollapsiblePane1Layout.setVerticalGroup(
            jXCollapsiblePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXCollapsiblePane1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jXCollapsiblePane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXCollapsiblePane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jCheckBox26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox27)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field27)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox26)
                    .addComponent(jCheckBox27))
                .addGap(1, 1, 1)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Other Subjects Enrolled", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Subjects Enrolled", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Year/Level:");

        jCheckBox28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox28.setText("All");
        jCheckBox28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox28ActionPerformed(evt);
            }
        });

        tf_field9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field9.setFocusable(false);
        tf_field9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field9MouseClicked(evt);
            }
        });
        tf_field9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field9ActionPerformed(evt);
            }
        });

        tf_field129.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field129.setFocusable(false);
        tf_field129.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field129MouseClicked(evt);
            }
        });
        tf_field129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field129ActionPerformed(evt);
            }
        });

        jCheckBox29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox29.setText("All");
        jCheckBox29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox29ActionPerformed(evt);
            }
        });

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel80.setText("Period:");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        tbl_enrollment_student_loaded_subjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_enrollment_student_loaded_subjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_enrollment_student_loaded_subjectsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_enrollment_student_loaded_subjects);

        jLabel2.setText("Total no. of subjects:");

        jLabel3.setText("0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field129))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field9)))
                .addContainerGap())
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox28))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field129, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Added Subjects", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tbl_added_subjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_added_subjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_added_subjectsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_added_subjects);

        jLabel4.setText("No. of subjects:");

        jLabel38.setText("0");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel38))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dropped  Subjects", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tbl_dropped_subjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_dropped_subjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dropped_subjectsMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tbl_dropped_subjects);

        jLabel39.setText("Total no. of subjects:");

        jLabel40.setText("0");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)
                        .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Add/Drop Subject", jPanel12);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("School Year:");

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

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Department:");

        tf_field22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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

        tf_field23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field23MouseClicked(evt);
            }
        });
        tf_field23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field23ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Level/College:");

        buttonGroup3.add(jCheckBox7);
        jCheckBox7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox7.setSelected(true);
        jCheckBox7.setText("New Student");
        jCheckBox7.setFocusable(false);

        buttonGroup3.add(jCheckBox8);
        jCheckBox8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox8.setText("Transfer Student");
        jCheckBox8.setEnabled(false);
        jCheckBox8.setFocusable(false);

        buttonGroup3.add(jCheckBox22);
        jCheckBox22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox22.setText("Returning Student");
        jCheckBox22.setEnabled(false);
        jCheckBox22.setFocusable(false);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Type:");

        buttonGroup3.add(jCheckBox9);
        jCheckBox9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox9.setText("All");
        jCheckBox9.setEnabled(false);
        jCheckBox9.setFocusable(false);

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Name:");

        tf_field24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field24MouseClicked(evt);
            }
        });
        tf_field24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field24ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton11.setText("Search");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jCheckBox23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox23.setSelected(true);
        jCheckBox23.setText("All");
        jCheckBox23.setFocusable(false);
        jCheckBox23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox23ActionPerformed(evt);
            }
        });

        jCheckBox24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox24.setSelected(true);
        jCheckBox24.setText("All");
        jCheckBox24.setFocusable(false);
        jCheckBox24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox24ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("Year Level:");

        tf_field28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field28.setText("First Year");
        tf_field28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field28MouseClicked(evt);
            }
        });
        tf_field28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field28ActionPerformed(evt);
            }
        });

        jCheckBox30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox30.setSelected(true);
        jCheckBox30.setText("All");
        jCheckBox30.setFocusable(false);
        jCheckBox30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox30ActionPerformed(evt);
            }
        });

        jCheckBox31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox31.setSelected(true);
        jCheckBox31.setText("All");
        jCheckBox31.setFocusable(false);
        jCheckBox31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox31ActionPerformed(evt);
            }
        });

        tf_field29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field29.setText("First Semester");
        tf_field29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field29MouseClicked(evt);
            }
        });
        tf_field29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field29ActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("Period:");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setText("Course:");

        jCheckBox32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox32.setSelected(true);
        jCheckBox32.setText("All");
        jCheckBox32.setFocusable(false);
        jCheckBox32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox32ActionPerformed(evt);
            }
        });

        tf_field30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field30MouseClicked(evt);
            }
        });
        tf_field30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_field22)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tf_field23, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel23Layout.createSequentialGroup()
                                        .addComponent(jCheckBox7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox22, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_field28, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_field29, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_field24, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                                        .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(437, 437, 437)))
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_field14, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jCheckBox32, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addComponent(tf_field30)))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox23))
                .addGap(1, 1, 1)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox24, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox30)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox31)))
                .addGap(1, 1, 1)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox32, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox7)
                            .addComponent(jCheckBox8)
                            .addComponent(jCheckBox22)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox9))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        tbl_enrollments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_enrollments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_enrollmentsMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tbl_enrollments);

        jLabel34.setText("No. of rows:");

        jLabel35.setText("0");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Applications", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Academic Offering Subjects", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Department:");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setText("All");
        jCheckBox1.setFocusable(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

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

        tf_field3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setSelected(true);
        jCheckBox2.setText("All");
        jCheckBox2.setFocusable(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Level/College:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Group:");

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setSelected(true);
        jCheckBox3.setText("All");
        jCheckBox3.setFocusable(false);
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        tf_field.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field.setFocusable(false);
        tf_field.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_fieldMouseClicked(evt);
            }
        });
        tf_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fieldActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Desc/Code:");

        tf_field4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Add All");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("School Year:");

        tf_field20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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

        jCheckBox10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox10.setText("All");
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Department:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Level/College:");

        jCheckBox11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox11.setText("All");
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });

        tf_field12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field12MouseClicked(evt);
            }
        });
        tf_field12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field12ActionPerformed(evt);
            }
        });

        tf_field13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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

        jCheckBox12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox12.setText("All");
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Course:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Year/Level:");

        jCheckBox20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox20.setText("All");
        jCheckBox20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox20ActionPerformed(evt);
            }
        });

        tf_field19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field19.setFocusable(false);
        tf_field19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field19MouseClicked(evt);
            }
        });
        tf_field19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field19ActionPerformed(evt);
            }
        });

        tf_field21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field21.setFocusable(false);
        tf_field21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field21MouseClicked(evt);
            }
        });
        tf_field21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field21ActionPerformed(evt);
            }
        });

        jCheckBox21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox21.setText("All");
        jCheckBox21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox21ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Period:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jCheckBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(tf_field13))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field19))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_field12)
                                    .addComponent(tf_field11)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(tf_field20, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field21)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox10))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox11))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox12))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox20)
                        .addComponent(tf_field19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox21)
                    .addComponent(tf_field21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jCheckBox1))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_field)
                            .addComponent(tf_field3, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                            .addComponent(tf_field2)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_field4))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox3))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_field4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Subjects", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tbl_academic_offering_subjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_academic_offering_subjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_academic_offering_subjectsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_academic_offering_subjects);

        jLabel5.setText("No. of rows:");

        jLabel6.setText("0");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Offered Subjects", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Department:");

        jCheckBox13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox13.setText("All");
        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });

        tf_field15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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

        tf_field16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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

        jCheckBox14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox14.setSelected(true);
        jCheckBox14.setText("All");
        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Level/College:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Group:");

        jCheckBox15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox15.setSelected(true);
        jCheckBox15.setText("All");
        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });

        tf_field17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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

        tf_field18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field18MouseClicked(evt);
            }
        });
        tf_field18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field18ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Search:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Status:");

        buttonGroup1.add(jCheckBox16);
        jCheckBox16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox16.setSelected(true);
        jCheckBox16.setText("All");
        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox17);
        jCheckBox17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox17.setText("Open");
        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox18);
        jCheckBox18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox18.setText("Full");
        jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox18ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox19);
        jCheckBox19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox19.setText("Closed");
        jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox19ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox25);
        jCheckBox25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox25.setText("Cancelled");
        jCheckBox25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox25ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("School Year:");

        tf_field25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field25.setFocusable(false);
        tf_field25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field25MouseClicked(evt);
            }
        });
        tf_field25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field25ActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Period:");

        tf_field26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field26.setFocusable(false);
        tf_field26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field26MouseClicked(evt);
            }
        });
        tf_field26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_field16)
                            .addComponent(tf_field15)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jCheckBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(tf_field17))
                            .addComponent(tf_field18)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox25)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field26)))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox13))
                .addGap(1, 1, 1)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox14))
                .addGap(1, 1, 1)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox15))
                .addGap(1, 1, 1)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox16)
                    .addComponent(jCheckBox17)
                    .addComponent(jCheckBox18)
                    .addComponent(jCheckBox19)
                    .addComponent(jCheckBox25))
                .addGap(5, 5, 5)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tbl_enrollment_offered_subjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_enrollment_offered_subjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_enrollment_offered_subjectsMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_enrollment_offered_subjects);

        jLabel7.setText("No. of rows:");

        jLabel8.setText("0");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Offer Subjects", jPanel3);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1049, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("Certification of Grades", jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1049, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("Transcript of Records", jPanel16);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Document and Record Request", jPanel13);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTabbedPane1)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jTabbedPane1)
                .addGap(10, 10, 10))
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

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void tf_field11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field11MouseClicked
        init_departments3();
    }//GEN-LAST:event_tf_field11MouseClicked

    private void tf_field11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field11ActionPerformed
        init_departments3();
    }//GEN-LAST:event_tf_field11ActionPerformed

    private void tf_field12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field12MouseClicked
        init_colleges2();
    }//GEN-LAST:event_tf_field12MouseClicked

    private void tf_field12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field12ActionPerformed
        init_colleges2();
    }//GEN-LAST:event_tf_field12ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void tf_field13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field13MouseClicked
        init_programs();
    }//GEN-LAST:event_tf_field13MouseClicked

    private void tf_field13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field13ActionPerformed
        init_programs();
    }//GEN-LAST:event_tf_field13ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        add_all_offering();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
        ret_opened_subjects();
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void tf_field15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field15MouseClicked
        init_department2();
    }//GEN-LAST:event_tf_field15MouseClicked

    private void tf_field15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field15ActionPerformed
        init_department2();
    }//GEN-LAST:event_tf_field15ActionPerformed

    private void tf_field16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field16MouseClicked

    private void tf_field16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field16ActionPerformed

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed
        ret_opened_subjects();
    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox15ActionPerformed
        ret_opened_subjects();
    }//GEN-LAST:event_jCheckBox15ActionPerformed

    private void tf_field17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field17MouseClicked
        init_group2();
    }//GEN-LAST:event_tf_field17MouseClicked

    private void tf_field17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field17ActionPerformed
        init_group2();
    }//GEN-LAST:event_tf_field17ActionPerformed

    private void tf_field18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field18MouseClicked

    private void tf_field18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field18ActionPerformed
        ret_opened_subjects();
    }//GEN-LAST:event_tf_field18ActionPerformed

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox16ActionPerformed
        ret_opened_subjects();
    }//GEN-LAST:event_jCheckBox16ActionPerformed

    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox17ActionPerformed
        ret_opened_subjects();
    }//GEN-LAST:event_jCheckBox17ActionPerformed

    private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox18ActionPerformed
        ret_opened_subjects();
    }//GEN-LAST:event_jCheckBox18ActionPerformed

    private void jCheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox19ActionPerformed
        ret_opened_subjects();
    }//GEN-LAST:event_jCheckBox19ActionPerformed

    private void tbl_academic_offering_subjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_academic_offering_subjectsMouseClicked
        select_offering_subject();
    }//GEN-LAST:event_tbl_academic_offering_subjectsMouseClicked

    private void jCheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox20ActionPerformed
        ret_offering_subjects();
    }//GEN-LAST:event_jCheckBox20ActionPerformed

    private void tf_field19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field19MouseClicked
        init_years2();
    }//GEN-LAST:event_tf_field19MouseClicked

    private void tf_field19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field19ActionPerformed
        init_years2();
    }//GEN-LAST:event_tf_field19ActionPerformed

    private void tbl_enrollment_offered_subjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_enrollment_offered_subjectsMouseClicked
        select_offered_subject();
    }//GEN-LAST:event_tbl_enrollment_offered_subjectsMouseClicked

    private void tf_field20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field20MouseClicked

    private void tf_field20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field20ActionPerformed

    private void jCheckBox21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox21ActionPerformed
        ret_offering_subjects();
    }//GEN-LAST:event_jCheckBox21ActionPerformed

    private void tf_field21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field21MouseClicked
        init_period();
    }//GEN-LAST:event_tf_field21MouseClicked

    private void tf_field21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field21ActionPerformed
        init_period();
    }//GEN-LAST:event_tf_field21ActionPerformed

    private void tf_field14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field14MouseClicked

    private void tf_field14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field14ActionPerformed

    private void tf_field22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field22MouseClicked
        init_departments();
    }//GEN-LAST:event_tf_field22MouseClicked

    private void tf_field22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field22ActionPerformed
        init_departments();
    }//GEN-LAST:event_tf_field22ActionPerformed

    private void tf_field23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field23MouseClicked
        init_colleges();
    }//GEN-LAST:event_tf_field23MouseClicked

    private void tf_field23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field23ActionPerformed
        init_colleges();
    }//GEN-LAST:event_tf_field23ActionPerformed

    private void tf_field24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field24MouseClicked

    private void tf_field24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field24ActionPerformed
        ret_enrollments();
    }//GEN-LAST:event_tf_field24ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        ret_enrollments();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void tbl_enrollmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_enrollmentsMouseClicked
        select_enrollment();
    }//GEN-LAST:event_tbl_enrollmentsMouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        ret_offering_subjects();
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void tf_field2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field2MouseClicked
        init_department();
    }//GEN-LAST:event_tf_field2MouseClicked

    private void tf_field2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field2ActionPerformed
        init_department();
    }//GEN-LAST:event_tf_field2ActionPerformed

    private void tf_field3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field3MouseClicked
//        init_colleges();
    }//GEN-LAST:event_tf_field3MouseClicked

    private void tf_field3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field3ActionPerformed
//        init_colleges();
    }//GEN-LAST:event_tf_field3ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        ret_offering_subjects();
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void tf_fieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_fieldMouseClicked
        init_group();
    }//GEN-LAST:event_tf_fieldMouseClicked

    private void tf_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fieldActionPerformed
        init_group();
    }//GEN-LAST:event_tf_fieldActionPerformed

    private void tf_field4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field4MouseClicked

    private void tf_field4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field4ActionPerformed
        ret_offering_subjects();
    }//GEN-LAST:event_tf_field4ActionPerformed

    private void jCheckBox25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox25ActionPerformed
        ret_opened_subjects();
    }//GEN-LAST:event_jCheckBox25ActionPerformed

    private void tf_field25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field25MouseClicked
        init_academic_years();
    }//GEN-LAST:event_tf_field25MouseClicked

    private void tf_field25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field25ActionPerformed
        init_academic_years();
    }//GEN-LAST:event_tf_field25ActionPerformed

    private void tf_field26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field26MouseClicked
        init_acad_period_schedules();
    }//GEN-LAST:event_tf_field26MouseClicked

    private void tf_field26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field26ActionPerformed
        init_acad_period_schedules();
    }//GEN-LAST:event_tf_field26ActionPerformed

    private void tf_field27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field27MouseClicked
        init_students(tf_field27);
    }//GEN-LAST:event_tf_field27MouseClicked

    private void tf_field27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field27ActionPerformed
        init_students(tf_field27);
    }//GEN-LAST:event_tf_field27ActionPerformed

    private void tf_field8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field8ActionPerformed

    private void tf_field131MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field131MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field131MouseClicked

    private void tf_field131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field131ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field131ActionPerformed

    private void tf_field132MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field132MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field132MouseClicked

    private void tf_field132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field132ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field132ActionPerformed

    private void tf_field125MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field125MouseClicked
        //        init_departments();
    }//GEN-LAST:event_tf_field125MouseClicked

    private void tf_field125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field125ActionPerformed
        //        init_departments();
    }//GEN-LAST:event_tf_field125ActionPerformed

    private void tf_field126MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field126MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field126MouseClicked

    private void tf_field126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field126ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field126ActionPerformed

    private void tf_field128MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field128MouseClicked

    }//GEN-LAST:event_tf_field128MouseClicked

    private void tf_field128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field128ActionPerformed
        //        init_years();
    }//GEN-LAST:event_tf_field128ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jXCollapsiblePane1.isCollapsed()) {
            jXCollapsiblePane1.setCollapsed(false);
        } else {
            jXCollapsiblePane1.setCollapsed(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox28ActionPerformed
        filter_enrolled_subjects();
    }//GEN-LAST:event_jCheckBox28ActionPerformed

    private void tf_field9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field9MouseClicked
        init_years3(tf_field9);
    }//GEN-LAST:event_tf_field9MouseClicked

    private void tf_field9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field9ActionPerformed
        init_years3(tf_field9);
    }//GEN-LAST:event_tf_field9ActionPerformed

    private void tf_field129MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field129MouseClicked
        init_period3();
    }//GEN-LAST:event_tf_field129MouseClicked

    private void tf_field129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field129ActionPerformed
        init_period3();
    }//GEN-LAST:event_tf_field129ActionPerformed

    private void jCheckBox29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox29ActionPerformed
        filter_enrolled_subjects();
    }//GEN-LAST:event_jCheckBox29ActionPerformed

    private void tbl_enrollment_student_loaded_subjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_enrollment_student_loaded_subjectsMouseClicked
        select_enrolled_subjecst();
    }//GEN-LAST:event_tbl_enrollment_student_loaded_subjectsMouseClicked

    private void tbl_added_subjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_added_subjectsMouseClicked
        select_added_subject();
    }//GEN-LAST:event_tbl_added_subjectsMouseClicked

    private void tbl_dropped_subjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dropped_subjectsMouseClicked
        select_dropped_subjects();
    }//GEN-LAST:event_tbl_dropped_subjectsMouseClicked

    private void tf_field28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field28MouseClicked
        init_year_levels();
    }//GEN-LAST:event_tf_field28MouseClicked

    private void tf_field28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field28ActionPerformed
        init_year_levels();
    }//GEN-LAST:event_tf_field28ActionPerformed

    private void jCheckBox30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox30ActionPerformed
        ret_enrollments();
    }//GEN-LAST:event_jCheckBox30ActionPerformed

    private void jCheckBox31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox31ActionPerformed
        ret_enrollments();
    }//GEN-LAST:event_jCheckBox31ActionPerformed

    private void tf_field29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field29MouseClicked
        init_periods();
    }//GEN-LAST:event_tf_field29MouseClicked

    private void tf_field29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field29ActionPerformed
        init_periods();
    }//GEN-LAST:event_tf_field29ActionPerformed

    private void jCheckBox32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox32ActionPerformed
        ret_enrollments();
    }//GEN-LAST:event_jCheckBox32ActionPerformed

    private void tf_field30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field30MouseClicked
        init_courses();
    }//GEN-LAST:event_tf_field30MouseClicked

    private void tf_field30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field30ActionPerformed
        init_courses();
    }//GEN-LAST:event_tf_field30ActionPerformed

    private void jCheckBox23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox23ActionPerformed
        ret_enrollments();
    }//GEN-LAST:event_jCheckBox23ActionPerformed

    private void jCheckBox24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox24ActionPerformed
        ret_enrollments();
    }//GEN-LAST:event_jCheckBox24ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox31;
    private javax.swing.JCheckBox jCheckBox32;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane5;
    private org.jdesktop.swingx.JXCollapsiblePane jXCollapsiblePane1;
    private javax.swing.JTable tbl_academic_offering_subjects;
    private javax.swing.JTable tbl_added_subjects;
    private javax.swing.JTable tbl_dropped_subjects;
    private javax.swing.JTable tbl_enrollment_offered_subjects;
    private javax.swing.JTable tbl_enrollment_student_loaded_subjects;
    private javax.swing.JTable tbl_enrollments;
    private javax.swing.JTextField tf_field;
    private javax.swing.JTextField tf_field11;
    private javax.swing.JTextField tf_field12;
    private javax.swing.JTextField tf_field125;
    private javax.swing.JTextField tf_field126;
    private javax.swing.JTextField tf_field128;
    private javax.swing.JTextField tf_field129;
    private javax.swing.JTextField tf_field13;
    private javax.swing.JTextArea tf_field130;
    private javax.swing.JTextField tf_field131;
    private javax.swing.JTextField tf_field132;
    private javax.swing.JTextField tf_field14;
    private javax.swing.JTextField tf_field15;
    private javax.swing.JTextField tf_field16;
    private javax.swing.JTextField tf_field17;
    private javax.swing.JTextField tf_field18;
    private javax.swing.JTextField tf_field19;
    private javax.swing.JTextField tf_field2;
    private javax.swing.JTextField tf_field20;
    private javax.swing.JTextField tf_field21;
    private javax.swing.JTextField tf_field22;
    private javax.swing.JTextField tf_field23;
    private javax.swing.JTextField tf_field24;
    private javax.swing.JTextField tf_field25;
    private javax.swing.JTextField tf_field26;
    private javax.swing.JTextField tf_field27;
    private javax.swing.JTextField tf_field28;
    private javax.swing.JTextField tf_field29;
    private javax.swing.JTextField tf_field3;
    private javax.swing.JTextField tf_field30;
    private javax.swing.JTextField tf_field4;
    private javax.swing.JTextField tf_field5;
    private javax.swing.JTextField tf_field6;
    private javax.swing.JTextField tf_field7;
    private javax.swing.JTextField tf_field8;
    private javax.swing.JTextField tf_field9;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        jPanel5.setVisible(false);
        tf_field3.setVisible(false);
        jCheckBox2.setVisible(false);
        jLabel10.setVisible(false);
        jLabel22.setVisible(false);
        jCheckBox14.setVisible(false);
        tf_field16.setVisible(false);

//        System.setProperty("pool_db", "db_cis_cosca");
//        System.setProperty("pool_password", "password");
        acad_years = Academic_years.ret_data(" where status=1 order by id desc limit 1");
        year_levels = Combo.year_levels();

        deps = Departments.ret_data(" order by department_name  asc ");
        deps2 = deps;
        int dep_id = 0;
        if (!deps2.isEmpty()) {
            Departments.to_departments dep = (Departments.to_departments) deps2.get(0);
            Field.Combo co = (Field.Combo) tf_field2;
            Field.Combo co3 = (Field.Combo) tf_field22;
            co.setText("" + dep.department_name);
            co.setId("" + dep.id);

            Field.Combo co2 = (Field.Combo) tf_field15;
            co2.setText("" + dep.department_name);
            co2.setId("" + dep.id);

            co3.setText("" + dep.department_name);
            co3.setId("" + dep.id);

            colleges2 = Colleges.ret_data(" where department_id='" + co2.getId() + "' ");
            Field.Combo co1 = (Field.Combo) tf_field23;
            if (!colleges2.isEmpty()) {
                Colleges.to_colleges c = (Colleges.to_colleges) colleges2.get(0);
                dep_id = c.id;
                co1.setText("" + c.college_name);
                co1.setId("" + c.id);
            } else {
                co1.setText("");
                co1.setId("");
            }

            ret_periods();
        }

        if (!acad_years.isEmpty()) {
            for (Academic_years.to_academic_years to1 : acad_years) {
                acad = to1;
                Field.Combo year = (Field.Combo) tf_field20;
                Field.Combo year2 = (Field.Combo) tf_field25;
                Field.Input year3 = (Field.Input) tf_field14;

                year.setText(to1.years);
                year.setId("" + to1.id);

                year2.setText(to1.years);
                year2.setId("" + to1.id);
                year3.setText(to1.years);
                year3.setId("" + to1.id);

            }
            String where = "  where academic_year_id='" + acad.id + "' and status=1 and department_id='" + dep_id + "'";
            acad_schedules = Academic_year_period_schedules.ret_data(where);

            if (!acad_schedules.isEmpty()) {
                acad_schedule = acad_schedules.get(0);
                Field.Input tf = (Field.Input) tf_field26;
                tf.setText(acad_schedule.period);
                tf.setId("" + acad_schedule.id);
            }
        }

        init_tbl_academic_offering_subjects(tbl_academic_offering_subjects);
        init_tbl_enrollment_offered_subjects(tbl_enrollment_offered_subjects);
        init_tbl_enrollments(tbl_enrollments);
        init_tbl_enrollment_student_loaded_subjects(tbl_enrollment_student_loaded_subjects);
        init_tbl_added_subjectssubjects(tbl_added_subjects);
        init_tbl_dropped_subjectssubjects(tbl_dropped_subjects);

        ret_offering_subjects();
        ret_opened_subjects();
        tf_field27.grabFocus();
    }
    Academic_years.to_academic_years acad = null;
    List<String> list_year2 = new ArrayList();
    List<String> list_period = new ArrayList();
    List<String> list_year = new ArrayList();
    Academic_year_period_schedules.to_academic_year_period_schedules acad_schedule = null;
    List<Academic_years.to_academic_years> acad_years = new ArrayList();
    List<Academic_year_period_schedules.to_academic_year_period_schedules> acad_schedules = new ArrayList();

    public void do_pass() {

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

    //<editor-fold defaultstate="collapsed" desc=" academic_offering_subjects "> 
    public static ArrayListModel tbl_academic_offering_subjects_ALM;
    public static Tblacademic_offering_subjectsModel tbl_academic_offering_subjects_M;

    private void init_tbl_academic_offering_subjects(JTable tbl_academic_offering_subjects) {
        tbl_academic_offering_subjects_ALM = new ArrayListModel();
        tbl_academic_offering_subjects_M = new Tblacademic_offering_subjectsModel(tbl_academic_offering_subjects_ALM);
        tbl_academic_offering_subjects.setModel(tbl_academic_offering_subjects_M);
        tbl_academic_offering_subjects.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_academic_offering_subjects.setRowHeight(25);
        int[] tbl_widths_academic_offering_subjects = {80, 100, 40, 40, 40, 40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_academic_offering_subjects.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_academic_offering_subjects, i, tbl_widths_academic_offering_subjects[i]);
        }
        Dimension d = tbl_academic_offering_subjects.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_academic_offering_subjects.getTableHeader().setPreferredSize(d);
        tbl_academic_offering_subjects.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_academic_offering_subjects.setRowHeight(25);
        tbl_academic_offering_subjects.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_academic_offering_subjects.getColumnModel().getColumn(4).setCellRenderer(new ImageRenderer());

        TableColumn tc = tbl_academic_offering_subjects.getColumnModel().getColumn(5);
        tc.setCellEditor(tbl_academic_offering_subjects.getDefaultEditor(Boolean.class));
        tc.setCellRenderer(tbl_academic_offering_subjects.getDefaultRenderer(Boolean.class));
        tc.setHeaderRenderer(new CheckBoxHeader(new MyItemListener()));
    }

    class MyItemListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            Object source = e.getSource();
            if (source instanceof AbstractButton == false) {
                return;
            }
            boolean checked = e.getStateChange() == ItemEvent.SELECTED;
            for (int x = 0, y = tbl_academic_offering_subjects.getRowCount(); x < y; x++) {
                tbl_academic_offering_subjects.setValueAt(checked, x, 0);

            }
        }
    }

    class CheckBoxHeader extends JCheckBox
            implements TableCellRenderer, MouseListener {

        protected CheckBoxHeader rendererComponent;
        protected int column;
        protected boolean mousePressed = false;

        public CheckBoxHeader(ItemListener itemListener) {
            rendererComponent = this;
            rendererComponent.addItemListener(itemListener);
        }

        @Override
        public Component getTableCellRendererComponent(
                JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            if (table != null) {
                JTableHeader header = table.getTableHeader();
                if (header != null) {
                    rendererComponent.setForeground(header.getForeground());
                    rendererComponent.setBackground(new java.awt.Color(204, 204, 204));
                    rendererComponent.setHorizontalAlignment(Align.CENTER);
                    rendererComponent.setOpaque(true);
                    header.addMouseListener(rendererComponent);
                }
            }
            setColumn(column);
            rendererComponent.setText("");
            setBorder(UIManager.getBorder("TableHeader.cellBorder"));
            return rendererComponent;
        }

        protected void setColumn(int column) {
            this.column = column;
        }

        public int getColumn() {
            return column;
        }

        protected void handleClickEvent(MouseEvent e) {
            if (mousePressed) {
                mousePressed = false;
                JTableHeader header = (JTableHeader) (e.getSource());
                JTable tableView = header.getTable();
                TableColumnModel columnModel = tableView.getColumnModel();
                int viewColumn = columnModel.getColumnIndexAtX(e.getX());
                int column1 = tableView.convertColumnIndexToModel(viewColumn);
                if (viewColumn == this.column && e.getClickCount() == 1 && column1 != -1) {
                    doClick();
                }
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            handleClickEvent(e);
            ((JTableHeader) e.getSource()).repaint();
            List<Subjects.to_subjects> datas = tbl_academic_offering_subjects_ALM;
            boolean selected = false;
            if (this.isSelected()) {
                selected = true;
            }
            for (Subjects.to_subjects to : datas) {
                to.setSelected(selected);
            }
            e.consume();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            mousePressed = true;
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

    public static void loadData_academic_offering_subjects(List<Subjects.to_subjects> acc) {
        tbl_academic_offering_subjects_ALM.clear();
        tbl_academic_offering_subjects_ALM.addAll(acc);
    }

    public static class Tblacademic_offering_subjectsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Code", "Description", "Lec", "Lab", "", "", "college_id", "college", "department_id", "department", "course_id", "course_code", "course_description", "term", "year_level", "subject_id", "subject_code", "description", "units", "lecture_units", "lab_units", "amount", "is_lab", "max_students", "prerequisite_subject_ids", "subject_group", "subject_group_id", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded", "faculty_id", "faculty_name", "room", "schedule", "room_id"
        };

        public Tblacademic_offering_subjectsModel(ListModel listmodel) {
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
            if (col == 5) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            Subjects.to_subjects tt = (Subjects.to_subjects) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.subject_code;
                case 1:
                    return " " + tt.description;
                case 2:
                    return " " + tt.lecture_units;
                case 3:
                    return " " + tt.lab_units;
                case 4:
                    return "/cis/icons2/plus.png";
                case 5:
                    return tt.selected;
                case 6:
                    return tt.college_id;
                case 7:
                    return tt.college;
                case 8:
                    return tt.department_id;
                case 9:
                    return tt.department;
                case 10:
                    return tt.course_id;
                case 11:
                    return tt.course_code;
                case 12:
                    return tt.course_description;
                case 13:
//                    return tt.term;
                case 14:
//                    return tt.year_level;
                case 15:
//                    return tt.subject_id;
                case 16:
                    return tt.subject_code;
                case 17:
                    return tt.description;
                case 18:
//                    return tt.units;
                case 19:
                    return tt.lecture_units;
                case 20:
                    return tt.lab_units;
                case 21:
                    return tt.amount;
                case 22:
//                    return tt.is_lab;
                case 23:
//                    return tt.max_students;
                case 24:
//                    return tt.prerequisite_subject_ids;
                case 25:
                    return tt.subject_group;
                case 26:
                    return tt.subject_group_id;
                case 27:
                    return tt.created_at;
                case 28:
                    return tt.updated_at;
                case 29:
                    return tt.created_by;
                case 30:
                    return tt.updated_by;
                case 31:
                    return tt.status;
                case 32:
                    return tt.is_uploaded;
                case 33:
//                    return tt.faculty_id;
                case 34:
//                    return tt.faculty_name;
                case 35:
//                    return tt.room;
                case 36:
//                    return tt.schedule;
                default:
                    return tt.is_uploaded;
            }
        }
    }

    private void ret_offering_subjects() {

//        Field.Combo ye = (Field.Combo) tf_field20;
//        Field.Combo cou = (Field.Combo) tf_field13;
//        Field.Combo lev = (Field.Combo) tf_field19;
//        Field.Combo per = (Field.Combo) tf_field21;
//
//        String where = " where id<>0 ";
//        if (!jCheckBox12.isSelected()) {
//            where = where + " and academic_offering_id='" + cou.getId() + "' ";
//        }
//        if (!jCheckBox20.isSelected()) {
//            where = where + " and year_level='" + lev.getText() + "' ";
//        }
//        if (!jCheckBox21.isSelected()) {
//            where = where + " and term='" + per.getText() + "' ";
//        }
//        where = where + "  order by description asc ";
//
//        System.out.println(where);
//        List<Academic_offering_subjects.to_academic_offering_subjects> datas = Academic_offering_subjects.ret_data(where);
//        loadData_academic_offering_subjects(datas);
//        jLabel6.setText("" + datas.size());
        String where = " where id<>0 ";
        String where2 = "";
        String search = tf_field4.getText();
        if (!jCheckBox1.isSelected()) {
            Field.Combo dep = (Field.Combo) tf_field2;
            Field.Combo gr = (Field.Combo) tf_field;

            where = where + " and department_id='" + dep.getId() + "' ";
            where2 = where2 + "  or department_id='" + dep.getId() + "' ";

            if (!jCheckBox3.isSelected()) {
                where = where + " and subject_group_id='" + gr.getId() + "' ";
                where2 = where2 + " and subject_group_id='" + gr.getId() + "' ";
            }
            where = where + " and subject_code like '%" + search + "%' ";

            where = where + where2 + " and description like '%" + search + "%' order by description desc ";
        } else {
            where = " where subject_code like '%" + search + "%' or description like '%" + search + "%' order by description desc ";
        }

//        System.out.println(where);
        List<Subjects.to_subjects> subjects = Subjects.ret_data(where);
        loadData_academic_offering_subjects(subjects);
        jLabel6.setText("" + subjects.size());
    }

    private void add_all_offering() {

        List<Subjects.to_subjects> to_check = new ArrayList();
        List< Subjects.to_subjects> to_add = new ArrayList();
        List< Subjects.to_subjects> selected = tbl_academic_offering_subjects_ALM;

        for (Subjects.to_subjects sel : selected) {
            if (sel.selected) {
                to_check.add(sel);
//                System.out.println(sel.description);
            }
        }
        if (to_check.isEmpty()) {
            Alert.set(0, "Please select subject");
            return;
        }
        Subjects.to_subjects to = (Subjects.to_subjects) to_check.get(0);
        int academic_year_id = acad.id;
        String where = " where academic_year_id='" + academic_year_id + "' ";
        List<Enrollment_offered_subjects.to_enrollment_offered_subjects> datas = Enrollment_offered_subjects.ret_data(where);

        for (Subjects.to_subjects sel : to_check) {
            int exists = 0;
            for (Enrollment_offered_subjects.to_enrollment_offered_subjects to2 : datas) {
                if (sel.id == to2.subject_id) {
                    exists = 1;
                    break;
                }
            }
            if (exists == 0) {
                to_add.add(sel);
            }
        }

        List<Enrollment_offered_subjects.to_enrollment_offered_subjects> open = new ArrayList();
        Window p = (Window) this;
        Dlg_registrar_open_subject_add_section nd = Dlg_registrar_open_subject_add_section.create(p, true);
        nd.setTitle("");
        if (to_add.size() == 1) {
            nd.do_pass(to);
        } else {
            nd.do_pass2(to_add);
        }

        nd.setCallback(new Dlg_registrar_open_subject_add_section.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_registrar_open_subject_add_section.OutputData data) {
                closeDialog.ok();

                for (Subjects.to_subjects add : to_add) {
                    Field.Combo period = (Field.Combo) tf_field26;
                    int id = 0;
                    int academic_offering_subject_id = add.id;
                    int academic_offering_id = 0;
                    int academic_year_id2 = acad.id;
                    String academic_year = acad.years;
                    int level_id = add.level_id;
                    String level = add.level;
                    int college_id = add.college_id;
                    String college = add.college;
                    int department_id = add.department_id;
                    String department = add.department;
                    int course_id = add.course_id;
                    String course_code = add.course_code;
                    String course_description = add.course_description;

                    String term = "";
                    if (!period.getText().isEmpty()) {
                        term = period.getText();
                    }
                    String year_level = "";//add.year_level;
                    int subject_id = add.id;
                    String subject_code = add.subject_code;
                    String description = add.description;
                    double units = 0;
                    double lecture_units = add.lecture_units;
                    double lab_units = add.lab_units;
                    double amount = 0;
                    int is_lab = 0;
                    if (lab_units > 0) {
                        is_lab = 1;
                    }
                    int max_students = data.max_students;
                    String prerequisite_subject_ids = add.prerequisites_course_ids;
                    String subject_group = add.subject_group;
                    int subject_group_id = add.subject_group_id;
                    String faculty_id = "";
                    String faculty_name = "";
                    int room_id = 0;
                    String room = "";
                    String schedule = "";
                    String created_at = DateType.now();
                    String updated_at = DateType.now();
                    String created_by = MyUser.getUser_id();
                    String updated_by = MyUser.getUser_id();
                    int status = 0;
                    int is_uploaded = 0;
                    Enrollment_offered_subjects.to_enrollment_offered_subjects to3 = new Enrollment_offered_subjects.to_enrollment_offered_subjects(id, academic_offering_subject_id, academic_offering_id, academic_year_id2, academic_year, level_id, level, college_id, college, department_id, department, course_id, course_code, course_description, term, year_level, subject_id, subject_code, description, units, lecture_units, lab_units, amount, is_lab, max_students, prerequisite_subject_ids, subject_group, subject_group_id, faculty_id, faculty_name, room_id, room, schedule, created_at, updated_at, created_by, updated_by, status, is_uploaded);
                    String where = " where subject_id ='" + subject_id + "' and academic_year_id='" + acad.id + "' and term like '" + tf_field26.getText() + "' ";
                    List<to_enrollment_offered_subjects> subject_exists = Enrollment_offered_subjects.ret_data(where);
                    if (subject_exists.isEmpty()) {
                        open.add(to3);
                    }

                }
                Enrollment_offered_subjects.add_data(open, data.no_of_sections, data.section_name);
                Alert.set(1, "");
                ret_offering_subjects();
                ret_opened_subjects();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);

    }

    private void select_offering_subject() {
        int row = tbl_academic_offering_subjects.getSelectedRow();
        if (row < 0) {
            return;
        }
        Subjects.to_subjects to = (Subjects.to_subjects) tbl_academic_offering_subjects_ALM.get(row);
        String where = " where subject_id ='" + to.id + "' and academic_year_id='" + acad.id + "' and term like '" + tf_field26.getText() + "' ";
//        System.out.println(where);
        List<to_enrollment_offered_subjects> subject_exists = Enrollment_offered_subjects.ret_data(where);
        if (!subject_exists.isEmpty()) {
            Alert.set(0, "Subject already added!");
            return;
        }

        int col = tbl_academic_offering_subjects.getSelectedColumn();
        if (col == 4) {
            Window p = (Window) this;
            Dlg_registrar_open_subject_add_section nd = Dlg_registrar_open_subject_add_section.create(p, true);
            nd.setTitle("");
            nd.do_pass(to);
            nd.setCallback(new Dlg_registrar_open_subject_add_section.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_registrar_open_subject_add_section.OutputData data) {
                    closeDialog.ok();
                    Field.Combo period = (Field.Combo) tf_field26;

                    int id = 0;
                    int academic_offering_subject_id = to.id;
                    int academic_offering_id = 0;// acad.id;
                    int academic_year_id = acad.id;
                    String academic_year = acad.years;
                    int level_id = to.level_id;
                    String level = to.level;
                    int college_id = to.college_id;
                    String college = to.college;
                    int department_id = to.department_id;
                    String department = to.department;
                    int course_id = to.course_id;
                    String course_code = to.course_code;
                    String course_description = to.course_description;
                    String term = "";
                    if (!period.getText().isEmpty()) {
                        term = period.getText();
                    }
                    String year_level = "";//to.year_level;
                    int subject_id = to.id;
                    String subject_code = to.subject_code;
                    String description = to.description;
                    double units = 0;
                    double lecture_units = to.lecture_units;
                    double lab_units = to.lab_units;
                    double amount = 0;
                    int is_lab = 0;
                    if (lab_units > 0) {
                        is_lab = 1;
                    }
                    int max_students = data.max_students;
                    String prerequisite_subject_ids = to.prerequisites_course_ids;
                    String subject_group = to.subject_group;
                    int subject_group_id = to.subject_group_id;
                    String faculty_id = "";
                    String faculty_name = "";
                    int room_id = 0;
                    String room = "";
                    String schedule = "";
                    String created_at = DateType.now();
                    String updated_at = DateType.now();
                    String created_by = MyUser.getUser_id();
                    String updated_by = MyUser.getUser_id();
                    int status = 0;
                    int is_uploaded = 0;
                    Enrollment_offered_subjects.to_enrollment_offered_subjects to = new Enrollment_offered_subjects.to_enrollment_offered_subjects(id, academic_offering_subject_id, academic_offering_id, academic_year_id, academic_year, level_id, level, college_id, college, department_id, department, course_id, course_code, course_description, term, year_level, subject_id, subject_code, description, units, lecture_units, lab_units, amount, is_lab, max_students, prerequisite_subject_ids, subject_group, subject_group_id, faculty_id, faculty_name, room_id, room, schedule, created_at, updated_at, created_by, updated_by, status, is_uploaded);

                    List<Enrollment_offered_subjects.to_enrollment_offered_subjects> datas = new ArrayList();
                    datas.add(to);
                    Enrollment_offered_subjects.add_data(datas, data.no_of_sections, data.section_name);
                    Alert.set(1, "");
                    ret_offering_subjects();
                    ret_opened_subjects();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 5) {
            if (to.selected) {
                to.setSelected(false);
            } else {
                to.setSelected(true);
            }
            tbl_academic_offering_subjects_M.fireTableDataChanged();
        }
    }
//</editor-fold> 

    //<editor-fold defaultstate="collapsed" desc=" enrollment_offered_subjects "> 
    public static ArrayListModel tbl_enrollment_offered_subjects_ALM;
    public static Tblenrollment_offered_subjectsModel tbl_enrollment_offered_subjects_M;

    public static void init_tbl_enrollment_offered_subjects(JTable tbl_enrollment_offered_subjects) {
        tbl_enrollment_offered_subjects_ALM = new ArrayListModel();
        tbl_enrollment_offered_subjects_M = new Tblenrollment_offered_subjectsModel(tbl_enrollment_offered_subjects_ALM);
        tbl_enrollment_offered_subjects.setModel(tbl_enrollment_offered_subjects_M);
        tbl_enrollment_offered_subjects.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_enrollment_offered_subjects.setRowHeight(25);
        int[] tbl_widths_enrollment_offered_subjects = {70, 100, 50, 60, 60, 120, 0, 30, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_enrollment_offered_subjects.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_enrollment_offered_subjects, i, tbl_widths_enrollment_offered_subjects[i]);
        }
        Dimension d = tbl_enrollment_offered_subjects.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_enrollment_offered_subjects.getTableHeader().setPreferredSize(d);
        tbl_enrollment_offered_subjects.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_enrollment_offered_subjects.setRowHeight(25);
        tbl_enrollment_offered_subjects.setFont(new java.awt.Font("Arial", 0, 12));

        tbl_enrollment_offered_subjects.getColumnModel().getColumn(7).setCellRenderer(new ImageRenderer());
        tbl_enrollment_offered_subjects.getColumnModel().getColumn(8).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_enrollment_offered_subjects(List<to_enrollment_offered_subjects> acc) {
        tbl_enrollment_offered_subjects_ALM.clear();
        tbl_enrollment_offered_subjects_ALM.addAll(acc);
    }

    public static class Tblenrollment_offered_subjectsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Code", "Description", "Units", "Count", "Section", "Instructor", "Status", "", "", "department_id", "department", "course_id", "course_code", "course_description", "term", "year_level", "subject_id", "subject_code", "description", "units", "lecture_units", "lab_units", "amount", "is_lab", "max_students", "prerequisite_subject_ids", "subject_group", "subject_group_id", "faculty_id", "faculty_name", "room_id", "room", "schedule", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded"
        };

        public Tblenrollment_offered_subjectsModel(ListModel listmodel) {
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
            to_enrollment_offered_subjects tt = (to_enrollment_offered_subjects) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.subject_code;
                case 1:
                    return " " + tt.description;
                case 2:
                    return " " + (tt.lecture_units + tt.lab_units);
                case 3:
                    return " " + tt.max_students;
                case 4:
                    return " " + tt.room;
                case 5:
                    return " " + tt.faculty_name;
                case 6:
                    if (tt.status == 0) {
                        return " Posted";
                    } else if (tt.status == 1) {
                        return " Open";
                    } else if (tt.status == 2) {
                        return " Closed";
                    } else {
                        return " Dropped";
                    }
                case 7:
                    return "/cis/icons/cog.png";
                case 8:
                    return "/cis/icons/remove11.png";
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
                    return tt.subject_id;
                case 17:
                    return tt.subject_code;
                case 18:
                    return tt.description;
                case 19:
                    return tt.units;
                case 20:
                    return tt.lecture_units;
                case 21:
                    return tt.lab_units;
                case 22:
                    return tt.amount;
                case 23:
                    return tt.is_lab;
                case 24:
                    return tt.max_students;
                case 25:
                    return tt.prerequisite_subject_ids;
                case 26:
                    return tt.subject_group;
                case 27:
                    return tt.subject_group_id;
                case 28:
                    return tt.faculty_id;
                case 29:
                    return tt.faculty_name;
                case 30:
                    return tt.room_id;
                case 31:
                    return tt.room;
                case 32:
                    return tt.schedule;
                case 33:
                    return tt.created_at;
                case 34:
                    return tt.updated_at;
                case 35:
                    return tt.created_by;
                case 36:
                    return tt.updated_by;
                case 37:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }

    private void ret_opened_subjects() {

        String where = " where eos.id<>0 ";
        String where2 = "";
        String search = tf_field18.getText();
        Field.Combo sy = (Field.Combo) tf_field25;
        Field.Combo period = (Field.Combo) tf_field26;

        if (!jCheckBox13.isSelected()) {
            Field.Combo dep = (Field.Combo) tf_field15;
            Field.Combo gr = (Field.Combo) tf_field17;

            where = where + " and eos.department_id='" + dep.getId() + "' ";
            where2 = where2 + "  or eos.department_id='" + dep.getId() + "' ";
            where = where + " and eos.academic_year_id='" + sy.getId() + "' ";
            where2 = where2 + " and eos.academic_year_id='" + sy.getId() + "' ";

            if (!period.getText().isEmpty()) {
                where = where + " and eos.term like '" + period.getText() + "' ";
                where2 = where2 + " and eos.term like '" + period.getText() + "' ";
            }

            if (!jCheckBox15.isSelected()) {
                where = where + " and eos.subject_group_id='" + gr.getId() + "' ";
                where2 = where2 + " and eos.subject_group_id='" + gr.getId() + "' ";
            }
            where = where + " and eos.subject_code like '%" + search + "%'  ";

            where = where + where2 + " and eos.description like '%" + search + "%' "
                    + " order by eos.description desc ";
        } else {
            Field.Combo dep = (Field.Combo) tf_field15;

            where = where + " and eos.academic_year_id='" + sy.getId() + "' ";
            where2 = where2 + " or eos.academic_year_id='" + sy.getId() + "' ";

            if (!period.getText().isEmpty()) {
                where = where + " and eos.term like '" + period.getText() + "' ";
                where2 = where2 + " and eos.term like '" + period.getText() + "' ";
            }

            where = where + " and eos.subject_code like '%" + search + "%' ";

            where = where + where2 + " and eos.description like '%" + search + "%' "
                    + " order by eos.description desc ";
        }
//        System.out.println(where);
        List<Enrollment_offered_subjects.to_enrollment_offered_subjects> datas = Enrollment_offered_subjects.ret_data2(where);
        loadData_enrollment_offered_subjects(datas);
        jLabel8.setText("" + datas.size());
    }
//</editor-fold> 

    private void select_offered_subject() {
        int row = tbl_enrollment_offered_subjects.getSelectedRow();
        if (row < 0) {
            return;
        }
        Enrollment_offered_subjects.to_enrollment_offered_subjects to = (Enrollment_offered_subjects.to_enrollment_offered_subjects) tbl_enrollment_offered_subjects_ALM.get(row);
        int col = tbl_enrollment_offered_subjects.getSelectedColumn();
        if (col == 7) {
            Window p = (Window) this;
            Dlg_registrar_offer_subject_status nd = Dlg_registrar_offer_subject_status.create(p, true);
            nd.setTitle("");
            nd.do_pass(to);
            nd.setCallback(new Dlg_registrar_offer_subject_status.Callback() {
                @Override
                public void post(CloseDialog closeDialog, Dlg_registrar_offer_subject_status.OutputData data) {
                    closeDialog.ok();
                    Enrollment_offered_subjects.update_data_status(to.id, 0);
                    Alert.set(2, "");
                    ret_opened_subjects();
                }

                @Override
                public void open(CloseDialog closeDialog, Dlg_registrar_offer_subject_status.OutputData data) {
                    closeDialog.ok();
                    Enrollment_offered_subjects.update_data_status(to.id, 1);
                    Alert.set(2, "");
                    ret_opened_subjects();
                }

                @Override
                public void close(CloseDialog closeDialog, Dlg_registrar_offer_subject_status.OutputData data) {
                    closeDialog.ok();

                }

                @Override
                public void dropped(CloseDialog closeDialog, Dlg_registrar_offer_subject_status.OutputData data) {
                    closeDialog.ok();

                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }

        if (col == 8) {
            Window p = (Window) this;
            Dlg_confirm_delete nd = Dlg_confirm_delete.create(p, true);
            nd.setTitle("");
//            nd.do_pass(services);
            nd.setCallback(new Dlg_confirm_delete.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_delete.OutputData data) {
                    closeDialog.ok();
                    Enrollment_offered_subjects.delete_data(to);
                    Alert.set(3, "");
                    ret_opened_subjects();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
    }

    List<Departments.to_departments> deps = new ArrayList();

    private void init_departments3() {
        Object[][] obj = new Object[deps.size()][1];
        int i = 0;
        for (Departments.to_departments to : deps) {
            obj[i][0] = " " + to.department_name;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field11.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field11, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Departments.to_departments to = deps.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field11;
                co.setText("" + to.department_name);
                co.setId("" + to.id);
                colleges2 = Colleges.ret_data(" where department_id='" + co.getId() + "' ");
                Field.Combo co1 = (Field.Combo) tf_field12;
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
    List<Colleges.to_colleges> colleges2 = new ArrayList();

    private void init_colleges2() {

        Object[][] obj = new Object[colleges2.size()][1];
        int i = 0;
        for (Colleges.to_colleges to : colleges2) {
            obj[i][0] = " " + to.college_name;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field12.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field12, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Colleges.to_colleges to = colleges2.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field12;
                co.setText("" + to.college_name);
                co.setId("" + to.id);

            }

        });
    }

    private void init_programs() {

        Field.Combo year = (Field.Combo) tf_field20;
        Field.Combo dep = (Field.Combo) tf_field11;
        Field.Combo col = (Field.Combo) tf_field12;

        String where = " where academic_year_id='" + year.getId() + "' and department_id='" + dep.getId() + "'  and college_id='" + col.getId() + "'  order by course_description asc ";

        List<Academic_offerings.to_academic_offerings> offerings = Academic_offerings.ret_data(where);

        Object[][] obj = new Object[offerings.size()][2];
        int i = 0;
        for (Academic_offerings.to_academic_offerings to : offerings) {
            obj[i][0] = " " + to.course_code;
            obj[i][1] = " " + to.course_description;
            i++;
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {100, tf_field13.getWidth() - 100};
        int width = 0;
        String[] col_names = {"", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field13, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Academic_offerings.to_academic_offerings to = offerings.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field13;
                co.setText("" + to.course_description);
                co.setId("" + to.id);

                String where2 = " where academic_year_id='" + to.academic_year_id + "' and department_id='" + to.department_id + "' ";
                List<Academic_year_periods.to_academic_year_periods> acad = Academic_year_periods.ret_data(where2);
                String period = "";
                if (!acad.isEmpty()) {
                    Academic_year_periods.to_academic_year_periods ayp = (Academic_year_periods.to_academic_year_periods) acad.get(0);
                    period = ayp.period;
                }

                String[] semester = {"First Semester", "Second Semester", "Summer Class"};
                String[] trimester = {"First Trimester", "Second Trimester", "Summer Class"};
                String[] years = {"First Year", "Second Year", "Third Year", "Fourth Year"};

                for (int i = 0; i < to.no_of_years; i++) {
                    list_year2.add(years[i]);
                }

                if (!list_year2.isEmpty()) {
                    tf_field19.setText("" + list_year2.get(0));
                }

                if (period.equalsIgnoreCase("Semester")) {
                    for (int i = 0; i < semester.length; i++) {
                        list_period.add(semester[i]);
                    }
                }
                if (period.equalsIgnoreCase("Trimester")) {
                    for (int i = 0; i < trimester.length; i++) {
                        list_period.add(trimester[i]);
                    }
                }
                if (!list_period.isEmpty()) {
                    tf_field21.setText("" + list_period.get(0));
                }

                ret_offering_subjects();
            }

        });
    }

    private void init_years2() {
        Object[][] obj = new Object[list_year2.size()][1];
        int i = 0;
        for (String to : list_year2) {
            obj[i][0] = " " + to;

            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field19.getWidth()};
        int width = 0;
        String[] col_names = {"", "", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field19, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                String to = list_year2.get(data.selected_row);
                tf_field19.setText("" + to);

                ret_offering_subjects();
            }
        });
    }

    private void init_period() {
        Object[][] obj = new Object[list_period.size()][1];
        int i = 0;
        for (String to : list_period) {
            obj[i][0] = " " + to;

            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field129.getWidth()};
        int width = 0;
        String[] col_names = {"", "", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field129, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                String to = list_period.get(data.selected_row);
                tf_field129.setText("" + to);

            }
        });
    }

    private void init_period3() {
        Object[][] obj = new Object[list_period3.size()][1];
        int i = 0;
        for (String to : list_period3) {
            obj[i][0] = " " + to;

            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field129.getWidth()};
        int width = 0;
        String[] col_names = {"", "", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field129, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                String to = list_period3.get(data.selected_row);

                tf_field129.setText("" + to);
                filter_enrolled_subjects();

            }
        });
    }

    //<editor-fold defaultstate="collapsed" desc=" enrollments "> 
    public static ArrayListModel tbl_enrollments_ALM;
    public static TblenrollmentsModel tbl_enrollments_M;

    public static void init_tbl_enrollments(JTable tbl_enrollments) {
        tbl_enrollments_ALM = new ArrayListModel();
        tbl_enrollments_M = new TblenrollmentsModel(tbl_enrollments_ALM);
        tbl_enrollments.setModel(tbl_enrollments_M);
        tbl_enrollments.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_enrollments.setRowHeight(25);
        int[] tbl_widths_enrollments = {100, 100, 60, 120, 140, 80, 60, 70, 70, 70, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_enrollments.length; i < n; i++) {
            if (i == 1 || i == 3) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_enrollments, i, tbl_widths_enrollments[i]);
        }
        Dimension d = tbl_enrollments.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_enrollments.getTableHeader().setPreferredSize(d);
        tbl_enrollments.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_enrollments.setRowHeight(25);
        tbl_enrollments.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_enrollments.getColumnModel().getColumn(6).setCellRenderer(new ImageRenderer());
        tbl_enrollments.getColumnModel().getColumn(7).setCellRenderer(new ImageRenderer());
        tbl_enrollments.getColumnModel().getColumn(8).setCellRenderer(new ImageRenderer());
        tbl_enrollments.getColumnModel().getColumn(9).setCellRenderer(new ImageRenderer());
        tbl_enrollments.getColumnModel().getColumn(10).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_enrollments(List<Enrollments.to_enrollments> acc) {
        tbl_enrollments_ALM.clear();
        tbl_enrollments_ALM.addAll(acc);
    }

    public static class TblenrollmentsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Enrollment No", "Name", "Gender", "Address", "Date Added", "Birthdate", "Advised", "Approved", "Assessed", "Enrolled", "", "encoded_by", "encoded_date", "assessed_by_id", "assessed_by", "assessed_date", "advised_by_id", "advised_by", "advised_date", "approved_by_id", "approved_by", "approved_date", "student_no", "last_name", "first_name", "middle_name", "nick_name", "current_address", "permanent_address", "email_address", "postal_code", "tel_no", "mobile_no", "date_of_birth", "place_of_birth", "age", "gender", "citizenship", "religion", "civil_status", "spouse_name", "date_of_communion", "date_of_confirmation", "is_right_handed", "is_indigenous", "indigenous_name", "level_id", "level", "college_id", "college", "department_id", "department", "year_level", "year_level_status", "preferred_course1", "preferred_course2", "preferred_course3", "father_name", "father_citizenship", "father_home_address", "father_email_address", "father_mobile_no", "father_occupation", "father_employer", "father_business_address", "father_business_tel_no", "father_educational_attainment", "father_last_school_attended", "mother_name", "mother_citizenship", "mother_home_address", "mother_email_address", "mother_mobile_no", "mother_occupation", "mother_employer", "mother_business_address", "mother_business_tel_no", "mother_educational_attainment", "mother_last_school_attended", "guardian_name", "guardian_mailing_address", "guardian_telephone_no", "grade_school_name", "grade_school_region", "grade_school_school_year", "grade_school_awards", "high_school_name", "high_school_region", "high_school_school_year", "high_school_awards", "college_school_name", "college_school_region", "college_school_school_year", "college_awards", "junior_high_name", "junior_high_region", "junior_high_year", "junior_high_awards", "tesda_name", "tesda_region", "tesda_year", "tesda_awards", "sibling1", "sibling2", "sibling3", "sibling4", "sibling5", "sibling6", "sibling7", "sibling8", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded"
        };

        public TblenrollmentsModel(ListModel listmodel) {
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
            Enrollments.to_enrollments tt = (Enrollments.to_enrollments) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.enrollment_no;
                case 1:
                    return " " + tt.last_name + ", " + tt.first_name + " " + tt.middle_name;
                case 2:
                    if (tt.gender == 0) {
                        return " Female";
                    } else {
                        return " Male";
                    }
                case 3:
                    return " " + tt.permanent_address;
                case 4:
                    return " " + DateType.convert_slash_datetime3(tt.created_at);
                case 5:
                    return " " + DateType.convert_slash_datetime2(tt.date_of_birth);

                case 6:
                    if (tt.advised_date == null) {
                        return "/cis/icons2/quit.png";

                    } else {
                        return "/cis/icons2/correct (1).png";
                    }
                case 7:
                    if (tt.approved_date == null) {
                        return "/cis/icons2/quit.png";
                    } else {
                        return "/cis/icons2/correct (1).png";
                    }
                case 8:
                    if (tt.assessed_date == null) {
                        return "/cis/icons2/quit.png";
                    } else {
                        return "/cis/icons2/correct (1).png";
                    }
                case 9:
                    if (tt.date_enrolled == null) {
                        return "/cis/icons2/quit.png";
                    } else {
                        return "/cis/icons2/tick (2).png";
                    }
                case 10:
                    return "/cis/icons/remove11.png";
                case 11:
                    return tt.encoded_by;
                case 12:
                    return tt.encoded_date;
                case 13:
                    return tt.assessed_by_id;
                case 14:
                    return tt.assessed_by;
                case 15:
                    return tt.assessed_date;
                case 16:
                    return tt.advised_by_id;
                case 17:
                    return tt.advised_by;
                case 18:
                    return tt.advised_date;
                case 19:
                    return tt.approved_by_id;
                case 20:
                    return tt.approved_by;
                case 21:
                    return tt.approved_date;
                case 22:
                    return tt.student_no;
                case 23:
                    return tt.last_name;
                case 24:
                    return tt.first_name;
                case 25:
                    return tt.middle_name;
                case 26:
                    return tt.nick_name;
                case 27:
                    return tt.current_address;
                case 28:
                    return tt.permanent_address;
                case 29:
                    return tt.email_address;
                case 30:
                    return tt.postal_code;
                case 31:
                    return tt.tel_no;
                case 32:
                    return tt.mobile_no;
                case 33:
                    return tt.date_of_birth;
                case 34:
                    return tt.place_of_birth;
                case 35:
                    return tt.age;
                case 36:
                    return tt.gender;
                case 37:
                    return tt.citizenship;
                case 38:
                    return tt.religion;
                case 39:
                    return tt.civil_status;
                case 40:
                    return tt.spouse_name;
                case 41:
                    return tt.date_of_communion;
                case 42:
                    return tt.date_of_confirmation;
                case 43:
                    return tt.is_right_handed;
                case 44:
                    return tt.is_indigenous;
                case 45:
                    return tt.indigenous_name;
                case 46:
                    return tt.level_id;
                case 47:
                    return tt.level;
                case 48:
                    return tt.college_id;
                case 49:
                    return tt.college;
                case 50:
                    return tt.department_id;
                case 51:
                    return tt.department;
                case 52:
                    return tt.year_level;
                case 53:
                    return tt.year_level_status;
                case 54:
                    return tt.preferred_course1;
                case 55:
                    return tt.preferred_course2;
                case 56:
                    return tt.preferred_course3;
                case 57:
                    return tt.father_name;
                case 58:
                    return tt.father_citizenship;
                case 59:
                    return tt.father_home_address;
                case 60:
                    return tt.father_email_address;
                case 61:
                    return tt.father_mobile_no;
                case 62:
                    return tt.father_occupation;
                case 63:
                    return tt.father_employer;
                case 64:
                    return tt.father_business_address;
                case 65:
                    return tt.father_business_tel_no;
                case 66:
                    return tt.father_educational_attainment;
                case 67:
                    return tt.father_last_school_attended;
                case 68:
                    return tt.mother_name;
                case 69:
                    return tt.mother_citizenship;
                case 70:
                    return tt.mother_home_address;
                case 71:
                    return tt.mother_email_address;
                case 72:
                    return tt.mother_mobile_no;
                case 73:
                    return tt.mother_occupation;
                case 74:
                    return tt.mother_employer;
                case 75:
                    return tt.mother_business_address;
                case 76:
                    return tt.mother_business_tel_no;
                case 77:
                    return tt.mother_educational_attainment;
                case 78:
                    return tt.mother_last_school_attended;
                case 79:
                    return tt.guardian_name;
                case 80:
                    return tt.guardian_mailing_address;
                case 81:
                    return tt.guardian_telephone_no;
                case 82:
                    return tt.grade_school_name;
                case 83:
                    return tt.grade_school_region;
                case 84:
                    return tt.grade_school_school_year;
                case 85:
                    return tt.grade_school_awards;
                case 86:
                    return tt.high_school_name;
                case 87:
                    return tt.high_school_region;
                case 88:
                    return tt.high_school_school_year;
                case 89:
                    return tt.high_school_awards;
                case 90:
                    return tt.college_school_name;
                case 91:
                    return tt.college_school_region;
                case 92:
                    return tt.college_school_school_year;
                case 93:
                    return tt.college_awards;
                case 94:
                    return tt.junior_high_name;
                case 95:
                    return tt.junior_high_region;
                case 96:
                    return tt.junior_high_year;
                case 97:
                    return tt.junior_high_awards;
                case 98:
                    return tt.tesda_name;
                case 99:
                    return tt.tesda_region;
                case 100:
                    return tt.tesda_year;
                case 101:
                    return tt.tesda_awards;
                case 102:
                    return tt.sibling1;
                case 103:
                    return tt.sibling2;
                case 104:
                    return tt.sibling3;
                case 105:
                    return tt.sibling4;
                case 106:
                    return tt.sibling5;
                case 107:
                    return tt.sibling6;
                case 108:
                    return tt.sibling7;
                case 109:
                    return tt.sibling8;
                case 110:
                    return tt.created_at;
                case 111:
                    return tt.updated_at;
                case 112:
                    return tt.created_by;
                case 113:
                    return tt.updated_by;
                case 114:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }
//</editor-fold> 

    private void ret_enrollments() {
        Field.Input year = (Field.Input) tf_field14;
        String where = " where id<>0 and academic_year_id='" + year.getId() + "' ";
        if (!jCheckBox23.isSelected()) {
            Field.Combo dep = (Field.Combo) tf_field22;
            where = where + " and department_id = '" + dep.getId() + "' ";
        }
        if (!jCheckBox24.isSelected()) {
            Field.Combo col = (Field.Combo) tf_field23;
            where = where + " and college_id = '" + col.getId() + "' ";
        }

        if (!jCheckBox32.isSelected()) {
            Field.Combo course = (Field.Combo) tf_field30;
            where = where + " and course_id = '" + course.getId() + "' ";
        }
        if (!jCheckBox30.isSelected()) {
            Field.Combo year_level = (Field.Combo) tf_field28;
            where = where + " and year_level like '" + year_level.getText() + "' ";
        }
        if (!jCheckBox31.isSelected()) {
            Field.Combo period = (Field.Combo) tf_field29;
            where = where + " and period like '" + period.getText() + "' ";
        }
        if (!jCheckBox7.isSelected()) {
            where = where + " and is_transferee = 0 ";
        }
        where = where + " and concat(last_name,space(1),first_name) like '%" + tf_field24.getText() + "%' ";
        where = where + " order by last_name asc ";

        List<Enrollments.to_enrollments> enrollments = Enrollments.ret_data(where);
        loadData_enrollments(enrollments);
        jLabel35.setText("" + enrollments.size());
    }

    private void select_enrollment() {
        int row = tbl_enrollments.getSelectedRow();
        if (row < 0) {
            return;
        }

        Enrollments.to_enrollments enroll = (Enrollments.to_enrollments) tbl_enrollments_ALM.get(row);
        int col = tbl_enrollments.getSelectedColumn();
        if (col == 10) {
            Window p = (Window) this;
            Dlg_confirm_delete nd = Dlg_confirm_delete.create(p, true);
            nd.setTitle("");
//            nd.do_pass(services);
            nd.setCallback(new Dlg_confirm_delete.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_delete.OutputData data) {
                    closeDialog.ok();
                    Enrollments.delete_data2(enroll);
                    Alert.set(3, "");
                    ret_enrollments();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        } else {
            Window p = (Window) this;
            Dlg_dean_student_advice_details nd = Dlg_dean_student_advice_details.create(p, true);
            nd.setTitle("");
            nd.do_pass(enroll, 0);
            nd.setCallback(new Dlg_dean_student_advice_details.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_dean_student_advice_details.OutputData data) {
                    closeDialog.ok();
                    ret_enrollments();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }

    }

    List<Departments.to_departments> deps2 = new ArrayList();

    private void init_department() {
        Object[][] obj = new Object[deps2.size()][1];
        int i = 0;
        for (Departments.to_departments to : deps2) {
            obj[i][0] = " " + to.department_name;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field2.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field2, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Departments.to_departments to = deps2.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field2;
                co.setText("" + to.department_name);
                co.setId("" + to.id);
                String where = " where department_id='" + to.id + "' ";
                groupings = Subject_groupings.ret_data(where);
                if (!groupings.isEmpty()) {
                    Subject_groupings.to_subject_groupings sg = (Subject_groupings.to_subject_groupings) groupings.get(0);
                    Field.Combo co1 = (Field.Combo) tf_field;
                    co1.setText(sg.description);
                    co1.setId("" + sg.id);
                }

                ret_offering_subjects();

            }
        });
    }

    private void init_department2() {
        Object[][] obj = new Object[deps2.size()][1];
        int i = 0;
        for (Departments.to_departments to : deps2) {
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
                Departments.to_departments to = deps2.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field15;
                co.setText("" + to.department_name);
                co.setId("" + to.id);
                String where = " where department_id='" + to.id + "' ";
                groupings2 = Subject_groupings.ret_data(where);
                if (!groupings2.isEmpty()) {
                    Subject_groupings.to_subject_groupings sg = (Subject_groupings.to_subject_groupings) groupings2.get(0);
                    Field.Combo co1 = (Field.Combo) tf_field17;
                    co1.setText(sg.description);
                    co1.setId("" + sg.id);
                }

                String where2 = "  where academic_year_id='" + acad.id + "' and status=1 and department_id='" + to.id + "'";
                acad_schedules = Academic_year_period_schedules.ret_data(where2);

                Field.Combo tf = (Field.Combo) tf_field26;
                if (!acad_schedules.isEmpty()) {
                    acad_schedule = acad_schedules.get(0);

                    tf.setText(acad_schedule.period);
                    tf.setId("" + acad_schedule.id);
                } else {
                    tf.setText("");
                    tf.setId("");
                }

                ret_opened_subjects();

            }
        });
    }

    List<Subject_groupings.to_subject_groupings> groupings = new ArrayList();
    List<Subject_groupings.to_subject_groupings> groupings2 = new ArrayList();

    private void init_group() {
        String where = "";

        Object[][] obj = new Object[groupings.size()][1];
        int i = 0;
        for (Subject_groupings.to_subject_groupings to : groupings) {
            obj[i][0] = " " + to.description;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field2.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Subject_groupings.to_subject_groupings to = groupings.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field;
                co.setText("" + to.description);
                co.setId("" + to.id);

                ret_offering_subjects();
            }
        });
    }

    private void init_group2() {
        String where = "";

        Object[][] obj = new Object[groupings2.size()][1];
        int i = 0;
        for (Subject_groupings.to_subject_groupings to : groupings2) {
            obj[i][0] = " " + to.description;
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
                Subject_groupings.to_subject_groupings to = groupings2.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field17;
                co.setText("" + to.description);
                co.setId("" + to.id);

                ret_opened_subjects();
            }
        });
    }

    private void init_students(JTextField tf) {
        String where = " where id<>0 ";
        if (jCheckBox26.isSelected()) {
            where = where + " and student_no like '%" + tf_field27.getText() + "%' ";
        } else {
            where = where + " and concat(last_name,space(1),first_name) like '%" + tf_field27.getText() + "%' ";
        }
        List<Students.to_students> students = Students.ret_data(where);
        Object[][] obj = new Object[students.size()][2];
        int i = 0;
        for (Students.to_students student : students) {
            obj[i][0] = " " + student.student_no;
            obj[i][1] = " " + student.last_name + ", " + student.first_name + " " + student.middle_name;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {100, tf.getWidth() - 100};
        int width = 0;
        String[] col_names = {"", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Students.to_students to = (Students.to_students) students.get(data.selected_row);
                acad_year_id = to.academic_year_id;
                Field.Input stud = (Field.Input) tf_field8;
                stud.setText(to.student_no);
                stud.setId("" + to.id);
                tf_field5.setText(to.first_name);
                tf_field6.setText(to.middle_name);
                tf_field7.setText(to.last_name);
                Field.Input co = (Field.Input) tf_field131;
                co.setText(to.course_code);
                co.setId("" + to.course_id);
                tf_field130.setText(to.course_description);
                String where = " where id='" + to.course_id + "' ";
                List<Courses.to_courses> courses = Courses.ret_data(where);
                if (!courses.isEmpty()) {
                    Courses.to_courses course = (Courses.to_courses) courses.get(0);
                    tf_field132.setText("" + course.no_of_years);

                }
                tf_field125.setText(to.department);
                tf_field126.setText(to.college);
                tf_field128.setText(to.year_level);
                tf_field9.setText(to.year_level);

                List<Enrollments.to_enrollments> enrollments = Enrollments.ret_data(" where student_id='" + to.id + "' order by id desc limit 1");
                if (enrollments.isEmpty()) {
                    enroll = null;
                } else {
                    enroll = (Enrollments.to_enrollments) enrollments.get(0);
                }
                set_period(to.department);
                ret_enrolled_subjects();
                ret_added_subjects();
                ret_dropped_subjects();
            }
        });
    }
    Enrollments.to_enrollments enroll = null;
    int acad_year_id = 0;

    private void init_years2(JTextField tf) {
        Object[][] obj = new Object[list_year.size()][1];
        int i = 0;
        for (String to : list_year2) {
            obj[i][0] = " " + to;

            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf.getWidth()};
        int width = 0;
        String[] col_names = {"", "", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                String to = list_year2.get(data.selected_row);
                tf.setText("" + to);
            }
        });
    }

    private void init_years3(JTextField tf) {
        Object[][] obj = new Object[list_year3.size()][1];
        int i = 0;
        for (String to : list_year3) {
            obj[i][0] = " " + to;

            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf.getWidth()};
        int width = 0;
        String[] col_names = {"", "", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                String to = list_year3.get(data.selected_row);
                tf.setText("" + to);
                filter_enrolled_subjects();
            }
        });
    }

    List<String> list_year3 = new ArrayList();
    List<String> list_period3 = new ArrayList();

    private void set_period(String department) {
        list_year3.clear();
        list_period3.clear();
        String[] semester = {"First Semester", "Second Semester", "Summer Class"};
        String[] trimester = {"First Trimester", "Second Trimester", "Third Trimester", "Summer Class"};
        String[] years = {"First Year", "Second Year", "Third Year", "Fourth Year", "Fifth Year"};

        int year = FitIn.toInt(tf_field132.getText());

        for (int i = 0; i < year; i++) {
            list_year3.add(years[i]);
        }
        List<Academic_year_periods.to_academic_year_periods> acad_periods = Academic_year_periods.ret_data(" where status=1 ");
        String period = "";
        if (!acad_periods.isEmpty()) {
            Academic_year_periods.to_academic_year_periods acad_period = (Academic_year_periods.to_academic_year_periods) acad_periods.get(0);
            period = acad_period.period;
        }

        if (period.equalsIgnoreCase("Semester")) {
            for (int i = 0; i < semester.length; i++) {
                list_period3.add(semester[i]);
            }
        }
        if (period.equalsIgnoreCase("Trimester")) {
            for (int i = 0; i < trimester.length; i++) {
                list_period3.add(trimester[i]);
            }
        }
        if (!list_period3.isEmpty()) {
            tf_field129.setText("" + list_period3.get(0));
        }

    }
    //<editor-fold defaultstate="collapsed" desc=" table enrolled subjects "> 
    public static ArrayListModel tbl_enrollment_student_loaded_subjects_ALM;
    public static Tblenrollment_student_loaded_subjectsModel tbl_enrollment_student_loaded_subjects_M;

    public static void init_tbl_enrollment_student_loaded_subjects(JTable tbl_enrollment_student_loaded_subjects) {
        tbl_enrollment_student_loaded_subjects_ALM = new ArrayListModel();
        tbl_enrollment_student_loaded_subjects_M = new Tblenrollment_student_loaded_subjectsModel(tbl_enrollment_student_loaded_subjects_ALM);
        tbl_enrollment_student_loaded_subjects.setModel(tbl_enrollment_student_loaded_subjects_M);
        tbl_enrollment_student_loaded_subjects.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_enrollment_student_loaded_subjects.setRowHeight(25);
        int[] tbl_widths_enrollment_student_loaded_subjects = {100, 100, 40, 60, 60, 30};
        for (int i = 0, n = tbl_widths_enrollment_student_loaded_subjects.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_enrollment_student_loaded_subjects, i, tbl_widths_enrollment_student_loaded_subjects[i]);
        }
        Dimension d = tbl_enrollment_student_loaded_subjects.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_enrollment_student_loaded_subjects.getTableHeader().setPreferredSize(d);
        tbl_enrollment_student_loaded_subjects.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_enrollment_student_loaded_subjects.setRowHeight(25);
        tbl_enrollment_student_loaded_subjects.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_enrollment_student_loaded_subjects.getColumnModel().getColumn(5).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_enrollment_student_loaded_subjects(List<Students_curriculum.curriculum> acc) {
        tbl_enrollment_student_loaded_subjects_ALM.clear();
        tbl_enrollment_student_loaded_subjects_ALM.addAll(acc);
    }

    public static class Tblenrollment_student_loaded_subjectsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Subject Code", "Description", "Units", "Section", "Status", ""
        };

        public Tblenrollment_student_loaded_subjectsModel(ListModel listmodel) {
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
            Students_curriculum.curriculum tt = (Students_curriculum.curriculum) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.subject_code;
                case 1:
                    return " " + tt.subject_description;
                case 2:
                    return " " + (tt.lab_units + tt.lec_units);
                case 3:
                    return " " + tt.section;
                case 4:
                    if (tt.status == -1) {
                        return " ";
                    } else if (tt.status == 0) {
                        return " Added";
                    } else if (tt.status == 1) {
                        return " Enrolled";
                    } else if (tt.status == 2) {
                        return " Passed";
                    } else if (tt.status == 3) {
                        return " Failed";
                    } else {
                        return " Dropped";
                    }
                default:
                    if (tt.status == 1) {
                        return "/cis/icons2/quit.png";
                    } else if (tt.status == -1) {
                        return "/cis/icons2/plus.png";
                    } else if (tt.status == 4) {
                        return "/cis/icons2/plus.png";
                    } else {

                        return "/cis/icons/remove11.png";
                    }

            }
        }
    }

    List<Students_curriculum.curriculum> enrolled_subjects = new ArrayList();

    private void ret_enrolled_subjects() {
        Field.Input stud = (Field.Input) tf_field8;
        Field.Input co = (Field.Input) tf_field131;

        List<Students_curriculum.curriculum> datas = Students_curriculum.ret_data(acad_year_id, FitIn.toInt(co.getId()), FitIn.toInt(stud.getId()));
        enrolled_subjects = datas;
        loadData_enrollment_student_loaded_subjects(datas);
        filter_enrolled_subjects();
        jLabel3.setText("" + tbl_enrollment_student_loaded_subjects_ALM.size());
    }

    private void filter_enrolled_subjects() {
        String year_level = "";
        String period = "";
        if (!jCheckBox28.isSelected()) {
            year_level = tf_field9.getText();
        }
        if (!jCheckBox29.isSelected()) {
            period = tf_field129.getText();
        }
        List<Students_curriculum.curriculum> datas = enrolled_subjects;
        List<Students_curriculum.curriculum> datas_filtered = new ArrayList();

        if (year_level.isEmpty()) {

            datas_filtered.addAll(enrolled_subjects);
        } else {
            if (period.isEmpty()) {
                for (Students_curriculum.curriculum cu : datas) {

                    if (cu.year_level.equalsIgnoreCase(year_level)) {
                        datas_filtered.add(cu);
                    }
                }
            } else {
                for (Students_curriculum.curriculum cu : datas) {
                    if (cu.year_level.equalsIgnoreCase(year_level) && cu.term.equalsIgnoreCase(period)) {
                        datas_filtered.add(cu);
                    }
                }
            }
        }

        tbl_enrollment_student_loaded_subjects_ALM.clear();
        loadData_enrollment_student_loaded_subjects(datas_filtered);

    }

    private void select_enrolled_subjecst() {
        int row = tbl_enrollment_student_loaded_subjects.getSelectedRow();
        if (row < 0) {
            return;
        }
        Students_curriculum.curriculum to = (Students_curriculum.curriculum) tbl_enrollment_student_loaded_subjects_ALM.get(row);
        int col = tbl_enrollment_student_loaded_subjects.getSelectedColumn();
        if (col == 5) {
            if (to.status == -1 || to.status == 4) {
                List<Academic_offering_subjects.to_academic_offering_subjects> aoss = Academic_offering_subjects.ret_data(" where subject_id = '" + to.subject_id + "' and course_id ='" + to.course_id + "' and academic_year_id='" + to.academic_year_id + "' ");
                Window p = (Window) this;
                Dlg_dean_student_advice_load_subject nd = Dlg_dean_student_advice_load_subject.create(p, true);
                nd.setTitle("");
                Academic_offering_subjects.to_academic_offering_subjects aos = null;
                if (!aoss.isEmpty()) {
                    aos = (Academic_offering_subjects.to_academic_offering_subjects) aoss.get(0);
                    nd.do_pass(aos, aos.academic_year_id, enroll);
                }
                final Academic_offering_subjects.to_academic_offering_subjects aos2 = aos;
                nd.setCallback(new Dlg_dean_student_advice_load_subject.Callback() {
                    @Override
                    public void ok(CloseDialog closeDialog, Dlg_dean_student_advice_load_subject.OutputData data) {
                        closeDialog.ok();

                        int id = 0;
                        int enrollment_id = enroll.id;
                        String enrollment_no = enroll.enrollment_no;
                        Field.Input stud = (Field.Input) tf_field8;

                        int student_id = FitIn.toInt(stud.getId());
                        String student_no = stud.getText();
                        String fname = tf_field5.getText();
                        String mi = tf_field6.getText();
                        String lname = tf_field7.getText();
                        int enrollment_offered_subject_section_id = data.to.id;
                        int enrollment_offered_subject_id = data.to.enrollment_offered_subject_id;
                        int academic_offering_subject_id = aos2.id;
                        int academic_offering_id = aos2.academic_offering_id;
                        int academic_year_id = aos2.academic_year_id;
                        String academic_year = aos2.academic_year;
                        int level_id = aos2.level_id;
                        String level = aos2.level;
                        int college_id = aos2.college_id;
                        String college = aos2.college;
                        int department_id = aos2.department_id;
                        String department = aos2.department;
                        int course_id = aos2.course_id;
                        String course_code = aos2.course_code;
                        String course_description = aos2.course_description;
                        String term = aos2.term;
                        String year_level = aos2.year_level;
                        int subject_id = aos2.subject_id;
                        String subject_code = aos2.subject_code;
                        String description = aos2.description;
                        int lecture_units = FitIn.toInt("" + aos2.lecture_units);
                        int lab_units = FitIn.toInt("" + to.lab_units);
                        String faculty_id = data.to.faculty_id;
                        String faculty_name = data.to.faculty_name;
                        String section = data.to.section;
                        int room_id = data.to.room_id;
                        String room = data.to.room;
                        String schedule = data.to.schedule;
                        String day = data.to.day;
                        String time = data.to.time;
                        String start_time = null;
                        String closing_time = null;
                        String created_at = DateType.now();
                        String updated_at = DateType.now();
                        String created_by = MyUser.getUser_id();
                        String updated_by = MyUser.getUser_id();
                        int status = 0;
                        int is_uploaded = 0;
                        double final_grade = 0;
                        String final_grade_remarks = "";
                        String final_grade_created_at = DateType.now();
                        String final_grade_created_by = "";
                        Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects load = new Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects(id, enrollment_id, enrollment_no, student_id, student_no, fname, mi, lname, enrollment_offered_subject_section_id, enrollment_offered_subject_id, academic_offering_subject_id, academic_offering_id, academic_year_id, academic_year, level_id, level, college_id, college, department_id, department, course_id, course_code, course_description, term, year_level, subject_id, subject_code, description, lecture_units, lab_units, faculty_id, faculty_name, section, room_id, room, schedule, day, time, start_time, closing_time, created_at, updated_at, created_by, updated_by, status, is_uploaded, 1, final_grade, final_grade_remarks, final_grade_created_at, final_grade_created_by);
                        Enrollment_student_loaded_subjects.add_data(load);

                        ret_enrolled_subjects();
                        ret_added_subjects();
                        Alert.set(1, "");
                    }
                });
                nd.setLocationRelativeTo(this);
                nd.setVisible(true);
            }
            if (to.status == 0) {
                Window p = (Window) this;
                Dlg_confirm_delete2 nd = Dlg_confirm_delete2.create(p, true);
                nd.setTitle("");
                nd.do_pass("<html>Are you sure you want to delete <b>" + to.course_code + " - " + to.course_description + "</b> subject?</html>");

                nd.setCallback(new Dlg_confirm_delete2.Callback() {
                    @Override
                    public void ok(CloseDialog closeDialog, Dlg_confirm_delete2.OutputData data) {
                        closeDialog.ok();
                        Enrollment_student_loaded_subjects.delete_data2(to.id);
                        ret_enrolled_subjects();
                        ret_added_subjects();
                        Alert.set(3, "");
                    }
                });
                nd.setLocationRelativeTo(this);
                nd.setVisible(true);
            }
            if (to.status == 1) {
                final int enrollment_student_loaded_subject_id = to.id;
                List<Students_curriculum.curriculum> drops = tbl_dropped_subjects_ALM;

                int drop_exists = 0;
                for (Students_curriculum.curriculum drop : drops) {
//                    System.out.println("subj: " + drop.subject_code+ " | "+drop.id);
                    if (drop.academic_offering_subject_id == enrollment_student_loaded_subject_id) {
                        drop_exists = 1;
                        break;
                    }
                }
                if (drop_exists == 1) {
                    Alert.set(0, "Drop request already added!");
                    return;
                }

                Window p = (Window) this;
                Dlg_confirm_delete2 nd = Dlg_confirm_delete2.create(p, true);
                nd.setTitle("");
                nd.do_pass("<html>Are you sure you want to drop <b>" + to.course_code + " - " + to.course_description + "</b> subject?</html>");
                nd.setCallback(new Dlg_confirm_delete2.Callback() {
                    @Override
                    public void ok(CloseDialog closeDialog, Dlg_confirm_delete2.OutputData data) {
                        closeDialog.ok();
                        int id = 0;

                        List<Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects> enrollments = Enrollment_student_loaded_subjects.ret_data(" where id='" + to.id + "' ");
                        Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects enroll = enrollments.get(0);
                        int enrollment_id = enroll.enrollment_id;
                        String enrollment_no = enroll.enrollment_no;
                        int student_id = enroll.student_id;
                        String student_no = enroll.student_no;
                        String fname = enroll.fname;
                        String mi = enroll.mi;
                        String lname = enroll.lname;
                        int enrollment_offered_subject_section_id = enroll.enrollment_offered_subject_section_id;
                        int enrollment_offered_subject_id = enroll.enrollment_offered_subject_id;
                        int academic_offering_subject_id = enroll.academic_offering_subject_id;
                        int academic_offering_id = enroll.academic_offering_id;
                        int academic_year_id = enroll.academic_year_id;
                        String academic_year = enroll.academic_year;
                        int level_id = enroll.level_id;
                        String level = enroll.level;
                        int college_id = enroll.college_id;
                        String college = enroll.college;
                        int department_id = enroll.department_id;
                        String department = enroll.department;
                        int course_id = enroll.course_id;
                        String course_code = enroll.course_code;
                        String course_description = enroll.course_description;
                        String term = enroll.term;
                        String year_level = enroll.year_level;
                        int subject_id = enroll.subject_id;
                        String subject_code = enroll.subject_code;
                        String description = enroll.description;
                        int lecture_units = enroll.lecture_units;
                        int lab_units = enroll.lab_units;
                        String faculty_id = enroll.faculty_id;
                        String faculty_name = enroll.faculty_name;
                        String section = enroll.section;
                        int room_id = enroll.room_id;
                        String room = enroll.room;
                        String schedule = enroll.schedule;
                        String day = enroll.day;
                        String time = enroll.time;
                        String start_time = enroll.start_time;
                        String closing_time = enroll.closing_time;
                        String created_at = DateType.now();
                        String updated_at = DateType.now();
                        String created_by = MyUser.getUser_id();
                        String updated_by = MyUser.getUser_id();
                        int status = 0;
                        int is_uploaded = 0;
                        Enrollment_student_loaded_subjects_drop_requests.to_enrollment_student_loaded_subjects_drop_requests to2 = new Enrollment_student_loaded_subjects_drop_requests.to_enrollment_student_loaded_subjects_drop_requests(id, enrollment_student_loaded_subject_id, enrollment_id, enrollment_no, student_id, student_no, fname, mi, lname, enrollment_offered_subject_section_id, enrollment_offered_subject_id, academic_offering_subject_id, academic_offering_id, academic_year_id, academic_year, level_id, level, college_id, college, department_id, department, course_id, course_code, course_description, term, year_level, subject_id, subject_code, description, lecture_units, lab_units, faculty_id, faculty_name, section, room_id, room, schedule, day, time, start_time, closing_time, created_at, updated_at, created_by, updated_by, status, is_uploaded);
                        Enrollment_student_loaded_subjects_drop_requests.add_data(to2);
                        ret_dropped_subjects();
                        Alert.set(1, "");
                    }
                });
                nd.setLocationRelativeTo(this);
                nd.setVisible(true);
            }
        }
    }
//</editor-fold> 

    //<editor-fold defaultstate="collapsed" desc=" table added subjects "> 
    public static ArrayListModel tbl_added_subjects_ALM;
    public static Tbl_added_subjects_Model tbl_added_subjects_M;

    public static void init_tbl_added_subjectssubjects(JTable tbl_added_subjects) {
        tbl_added_subjects_ALM = new ArrayListModel();
        tbl_added_subjects_M = new Tbl_added_subjects_Model(tbl_added_subjects_ALM);
        tbl_added_subjects.setModel(tbl_added_subjects_M);
        tbl_added_subjects.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_added_subjects.setRowHeight(25);
        int[] tbl_widths_enrollment_student_loaded_subjects = {100, 100, 40, 60, 60, 30};
        for (int i = 0, n = tbl_widths_enrollment_student_loaded_subjects.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_added_subjects, i, tbl_widths_enrollment_student_loaded_subjects[i]);
        }
        Dimension d = tbl_added_subjects.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_added_subjects.getTableHeader().setPreferredSize(d);
        tbl_added_subjects.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_added_subjects.setRowHeight(25);
        tbl_added_subjects.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_added_subjects.getColumnModel().getColumn(5).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_added_subjects(List<Students_curriculum.curriculum> acc) {
        tbl_added_subjects_ALM.clear();
        tbl_added_subjects_ALM.addAll(acc);

    }

    public static class Tbl_added_subjects_Model extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Subject Code", "Description", "Units", "Section", "Paid", ""
        };

        public Tbl_added_subjects_Model(ListModel listmodel) {
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
            Students_curriculum.curriculum tt = (Students_curriculum.curriculum) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.subject_code;
                case 1:
                    return " " + tt.subject_description;
                case 2:
                    return " " + (tt.lab_units + tt.lec_units);
                case 3:
                    return " " + tt.section;
                case 4:
                    if (tt.is_paid == 0) {
                        return " No";
                    } else {
                        return " Yes";
                    }
                default:
                    if (tt.status == 1) {
                        return "/cis/icons2/quit.png";
                    } else if (tt.status == -1) {
                        return "/cis/icons2/plus.png";
                    } else {
                        if (tt.is_paid == 1) {
                            return "/cis/icons/like.png";
                        } else {
                            return "/cis/icons/remove11.png";
                        }

                    }

            }
        }
    }

    private void ret_added_subjects() {
        Field.Input st = (Field.Input) tf_field8;

        String where = " where student_id = '" + st.getId() + "' and status=0 order by description asc ";
        List<Students_curriculum.curriculum> subjects = Students_curriculum.ret_added_subjects(where);
//        System.out.println("subjects: " + subjects.size());
        loadData_added_subjects(subjects);
        jLabel38.setText("" + subjects.size());
    }

    private void select_added_subject() {
        int row = tbl_added_subjects.getSelectedRow();
        if (row < 0) {
            return;
        }
        int col = tbl_added_subjects.getSelectedColumn();
        if (col == 5) {
            final Students_curriculum.curriculum to = (Students_curriculum.curriculum) tbl_added_subjects_ALM.get(row);

            if (to.status == 0) {
                if (to.is_paid == 1) {
                    Window p = (Window) this;
                    Dlg_confirm_action3 nd = Dlg_confirm_action3.create(p, true);
                    nd.setTitle("");
                    nd.do_pass("<html>Are you sure you want to approve <b>" + to.subject_code + " - " + to.subject_description + "</b> subject?</html>");
                    nd.setCallback(new Dlg_confirm_action3.Callback() {
                        @Override
                        public void ok(CloseDialog closeDialog, Dlg_confirm_action3.OutputData data) {
                            closeDialog.ok();
                            Enrollment_student_loaded_subjects.approve_subject(to.id);
                            ret_enrolled_subjects();
                            ret_added_subjects();
                            Alert.set(2, "");
                        }
                    });
                    nd.setLocationRelativeTo(this);
                    nd.setVisible(true);
                } else {
                    Window p = (Window) this;
                    Dlg_confirm_delete2 nd = Dlg_confirm_delete2.create(p, true);
                    nd.setTitle("");
                    nd.do_pass("<html>Are you sure you want to delete <b>" + to.subject_code + " - " + to.subject_description + "</b> subject?</html>");

                    nd.setCallback(new Dlg_confirm_delete2.Callback() {
                        @Override
                        public void ok(CloseDialog closeDialog, Dlg_confirm_delete2.OutputData data) {
                            closeDialog.ok();
                            Enrollment_student_loaded_subjects.delete_data2(to.id);
                            ret_enrolled_subjects();
                            ret_added_subjects();
                            Alert.set(3, "");
                        }
                    });
                    nd.setLocationRelativeTo(this);
                    nd.setVisible(true);
                }

            }

        }

    }
//</editor-fold> 

    //<editor-fold defaultstate="collapsed" desc=" table dropped subjects "> 
    public static ArrayListModel tbl_dropped_subjects_ALM;
    public static Tbl_dropped_subjects_Model tbl_dropped_subjects_M;

    public static void init_tbl_dropped_subjectssubjects(JTable tbl_dropped_subjects) {
        tbl_dropped_subjects_ALM = new ArrayListModel();
        tbl_dropped_subjects_M = new Tbl_dropped_subjects_Model(tbl_dropped_subjects_ALM);
        tbl_dropped_subjects.setModel(tbl_dropped_subjects_M);
        tbl_dropped_subjects.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_dropped_subjects.setRowHeight(25);
        int[] tbl_widths_enrollment_student_loaded_subjects = {100, 100, 40, 60, 60, 30};
        for (int i = 0, n = tbl_widths_enrollment_student_loaded_subjects.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_dropped_subjects, i, tbl_widths_enrollment_student_loaded_subjects[i]);
        }
        Dimension d = tbl_dropped_subjects.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_dropped_subjects.getTableHeader().setPreferredSize(d);
        tbl_dropped_subjects.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_dropped_subjects.setRowHeight(25);
        tbl_dropped_subjects.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_dropped_subjects.getColumnModel().getColumn(5).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_dropped_subjects(List<Students_curriculum.curriculum> acc) {
        tbl_dropped_subjects_ALM.clear();
        tbl_dropped_subjects_ALM.addAll(acc);

    }

    public static class Tbl_dropped_subjects_Model extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Subject Code", "Description", "Units", "Section", "Paid", ""
        };

        public Tbl_dropped_subjects_Model(ListModel listmodel) {
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
            Students_curriculum.curriculum tt = (Students_curriculum.curriculum) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.subject_code;
                case 1:
                    return " " + tt.subject_description;
                case 2:
                    return " " + (tt.lab_units + tt.lec_units);
                case 3:
                    return " " + tt.section;
                case 4:

                    if (tt.is_paid == 0) {
                        return " No";
                    } else {
                        return " Yes";
                    }
                default:
                    if (tt.status == 1) {
                        return "/cis/icons2/quit.png";
                    } else if (tt.status == -1) {
                        return "/cis/icons2/plus.png";
                    } else {
                        if (tt.is_paid == 1) {
                            return "/cis/icons/like.png";
                        } else {
                            return "/cis/icons/remove11.png";
                        }

                    }

            }
        }
    }

    private void ret_dropped_subjects() {
        Field.Input st = (Field.Input) tf_field8;
        String where = " where student_id = '" + st.getId() + "' and status=0  order by description asc ";
        List<Students_curriculum.curriculum> subjects = Students_curriculum.ret_dropped_subjects(where);
        loadData_dropped_subjects(subjects);
        jLabel40.setText("" + subjects.size());
    }

    private void select_dropped_subjects() {
        int row = tbl_dropped_subjects.getSelectedRow();
        if (row < 0) {
            return;
        }
        int col = tbl_dropped_subjects.getSelectedColumn();
        if (col == 5) {
            Students_curriculum.curriculum to = (Students_curriculum.curriculum) tbl_dropped_subjects_ALM.get(row);
            System.out.println("sls_id: " + to.sls_id);
            if (to.status == 0) {
                if (to.is_paid == 1) {
                    Window p = (Window) this;
                    Dlg_confirm_action3 nd = Dlg_confirm_action3.create(p, true);
                    nd.setTitle("");
                    nd.do_pass("<html>Are you sure you want to approve dropping <b>" + to.subject_code + " - " + to.subject_description + "</b> subject?</html>");
                    nd.setCallback(new Dlg_confirm_action3.Callback() {
                        @Override
                        public void ok(CloseDialog closeDialog, Dlg_confirm_action3.OutputData data) {
                            closeDialog.ok();

                            Enrollment_student_loaded_subjects_drop_requests.approve_data(to.id, to.sls_id);
                            ret_dropped_subjects();
                            ret_enrolled_subjects();
                            Alert.set(2, "");
                        }
                    });
                    nd.setLocationRelativeTo(this);
                    nd.setVisible(true);
                } else {
                    Window p = (Window) this;
                    Dlg_confirm_delete2 nd = Dlg_confirm_delete2.create(p, true);
                    nd.setTitle("");
                    nd.do_pass("<html>Are you sure you want to delete <b>" + to.subject_code + " - " + to.subject_description + "</b> subject?</html>");
                    nd.setCallback(new Dlg_confirm_delete2.Callback() {
                        @Override
                        public void ok(CloseDialog closeDialog, Dlg_confirm_delete2.OutputData data) {
                            closeDialog.ok();
                            Enrollment_student_loaded_subjects_drop_requests.delete_data2(to.id);
                            ret_dropped_subjects();
                            Alert.set(3, "");
                        }
                    });
                    nd.setLocationRelativeTo(this);
                    nd.setVisible(true);
                }

            }
        }
    }
//</editor-fold>

    List<String> periods = new ArrayList();

    private void ret_periods() {
        Field.Input year = (Field.Input) tf_field14;
        Field.Combo dep = (Field.Combo) tf_field22;
        String where = " where academic_year_id = '" + year.getId() + "' and department_id='" + dep.getId() + "' ";
        List<Academic_year_periods.to_academic_year_periods> periods1 = Academic_year_periods.ret_data(where);
        if (!periods1.isEmpty()) {
            Academic_year_periods.to_academic_year_periods acad = (Academic_year_periods.to_academic_year_periods) periods1.get(0);
            String per = acad.period;
            periods = Combo.periods(per);
//            System.out.println("peiord: " + periods.size());
        }
    }

    private void init_periods() {
        Object[][] obj = new Object[periods.size()][1];
        int i = 0;
        for (String to : periods) {
            obj[i][0] = " " + to;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field29.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field29, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                String to = periods.get(data.selected_row);
                tf_field29.setText("" + to);
                ret_enrollments();
            }
        });
    }

    List<String> year_levels = new ArrayList();

    private void init_year_levels() {
        Object[][] obj = new Object[year_levels.size()][1];
        int i = 0;
        for (String to : year_levels) {
            obj[i][0] = " " + to;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field28.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field28, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                String to = year_levels.get(data.selected_row);
                tf_field28.setText("" + to);
                ret_enrollments();
            }
        });
    }

    private void init_courses() {
        Field.Input year3 = (Field.Input) tf_field14;
        String where = " where id<>0 ";

        Field.Combo dep = (Field.Combo) tf_field22;
        Field.Combo col = (Field.Combo) tf_field23;

        where = where + " and department_id = '" + dep.getId() + "' ";
        where = where + " and college_id = '" + col.getId() + "' ";

        where = where + " and course_code like '%" + tf_field30.getText() + "%' and academic_year_id='" + year3.getId() + "' and status=1 "
                + " or department_id = '" + dep.getId() + "' and college_id = '" + col.getId() + "' and course_description like '%" + tf_field30.getText() + "%' and academic_year_id='" + year3.getId() + "'  and status=1 "
                + " order by course_description asc ";
        List<Academic_offerings.to_academic_offerings> offer = Academic_offerings.ret_data(where);
        Object[][] obj = new Object[offer.size()][2];
        int i = 0;
        for (Academic_offerings.to_academic_offerings to : offer) {
            obj[i][0] = " " + to.course_code;
            obj[i][1] = " " + to.course_description;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {80, tf_field30.getWidth() - 80};
        int width = 0;
        String[] col_names = {"", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup2(tf_field30, obj, labels, tbl_widths_customers, col_names, tf_field30.getWidth());
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Academic_offerings.to_academic_offerings off = offer.get(data.selected_row);
//                no_of_years = off.no_of_years;
//                set_periods();
                Field.Combo cou = (Field.Combo) tf_field30;
                cou.setText(off.course_code + " - " + off.course_description);
                cou.setId("" + off.course_id);
//                ret_data();
                ret_enrollments();
            }
        });
    }

    private void init_departments() {
        Object[][] obj = new Object[deps.size()][1];
        int i = 0;
        for (Departments.to_departments to : deps) {
            obj[i][0] = " " + to.department_name;
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
                Departments.to_departments to = deps.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field22;
                co.setText("" + to.department_name);
                co.setId("" + to.id);

                colleges2 = Colleges.ret_data(" where department_id='" + co.getId() + "' ");
                Field.Combo co1 = (Field.Combo) tf_field23;
                if (!colleges2.isEmpty()) {
                    Colleges.to_colleges c = (Colleges.to_colleges) colleges2.get(0);
                    co1.setText("" + c.college_name);
                    co1.setId("" + c.id);
                } else {
                    co1.setText("");
                    co1.setId("");
                }
                ret_periods();
                ret_enrollments();
            }
        });
    }

    private void init_colleges() {

        Object[][] obj = new Object[colleges2.size()][1];
        int i = 0;
        for (Colleges.to_colleges to : colleges2) {
            obj[i][0] = " " + to.college_name;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field23.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field23, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Colleges.to_colleges to = colleges2.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field23;
                co.setText("" + to.college_name);
                co.setId("" + to.id);
                ret_enrollments();
            }

        });
    }

    private void init_academic_years() {
        Object[][] obj = new Object[acad_years.size()][1];
        int i = 0;
        for (Academic_years.to_academic_years to : acad_years) {
            obj[i][0] = " " + to.years;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field25.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field25, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Academic_years.to_academic_years to = acad_years.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field25;
                co.setText("" + to.years);
                co.setId("" + to.id);

            }
        });
    }

    private void init_acad_period_schedules() {
        Field.Combo dep = (Field.Combo) tf_field15;
        acad_schedules.clear();
        acad_schedules = Academic_year_period_schedules.ret_data(" where status=1 and department_id='" + dep.getId() + "'");

        Object[][] obj = new Object[acad_schedules.size()][1];
        int i = 0;
        for (Academic_year_period_schedules.to_academic_year_period_schedules to : acad_schedules) {
            obj[i][0] = " " + to.period;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field26.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field26, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Academic_year_period_schedules.to_academic_year_period_schedules to = acad_schedules.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field26;
                co.setText("" + to.period);
                co.setId("" + to.id);

                ret_opened_subjects();
            }
        });
    }

}
