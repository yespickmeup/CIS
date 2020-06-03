/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.registrar;

import cis.academic.Academic_offerings;
import cis.academic.Academic_year_period_schedules;
import cis.academic.Academic_year_periods;
import cis.academic.Academic_years;
import cis.colleges.Colleges;
import cis.deans_portal.Dlg_dean_student_advice_details;
import cis.departments.Departments;
import cis.enrollments.Enrollment_offered_subjects;
import cis.enrollments.Enrollment_offered_subjects.to_enrollment_offered_subjects;
import cis.enrollments.Enrollments;
import cis.subjects.Subject_groupings;
import cis.subjects.Subjects;
import cis.users.MyUser;
import cis.utils.Alert;
import cis.utils.DateType;
import cis.utils.Dlg_confirm_delete;
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
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import mijzcx.synapse.desk.utils.CloseDialog;
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
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
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
        tf_field25 = new Field.Input();
        jLabel37 = new javax.swing.JLabel();
        tf_field26 = new Field.Input();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_enrollment_offered_subjects = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        jCheckBox7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox7.setText("New Student");
        jCheckBox7.setFocusable(false);

        jCheckBox8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox8.setText("Transfer Student");
        jCheckBox8.setFocusable(false);

        jCheckBox22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox22.setText("Returning Student");
        jCheckBox22.setFocusable(false);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Type:");

        jCheckBox9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox9.setSelected(true);
        jCheckBox9.setText("All");
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

        jCheckBox24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox24.setSelected(true);
        jCheckBox24.setText("All");
        jCheckBox24.setFocusable(false);

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
                            .addComponent(tf_field23, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jCheckBox7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox22, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tf_field22)))
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
                        .addGap(0, 312, Short.MAX_VALUE)))
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
                        .addComponent(tf_field23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addContainerGap())
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
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
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
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
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
                            .addComponent(tf_field3, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
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
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
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
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
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

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1023, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 774, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Grade Issuance", jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("Certification of Grades", jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
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
                .addGap(21, 21, 21)
                .addComponent(jTabbedPane1)
                .addGap(34, 34, 34))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field22MouseClicked

    private void tf_field22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field22ActionPerformed

    private void tf_field23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field23MouseClicked

    private void tf_field23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field23ActionPerformed

    private void tf_field24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field24MouseClicked

    private void tf_field24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field24ActionPerformed
        // TODO add your handling code here:
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
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field25MouseClicked

    private void tf_field25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field25ActionPerformed

    private void tf_field26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field26MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field26MouseClicked

    private void tf_field26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field26ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
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
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable tbl_academic_offering_subjects;
    private javax.swing.JTable tbl_enrollment_offered_subjects;
    private javax.swing.JTable tbl_enrollments;
    private javax.swing.JTextField tf_field;
    private javax.swing.JTextField tf_field11;
    private javax.swing.JTextField tf_field12;
    private javax.swing.JTextField tf_field13;
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
    private javax.swing.JTextField tf_field3;
    private javax.swing.JTextField tf_field4;
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
        if (!acad_years.isEmpty()) {
            for (Academic_years.to_academic_years to1 : acad_years) {
                acad = to1;
                Field.Combo year = (Field.Combo) tf_field20;
                Field.Input year2 = (Field.Input) tf_field25;
                year.setText(to1.years);
                year.setId("" + to1.id);

                year2.setText(to1.years);
                year2.setId("" + to1.id);

            }
            List<Academic_year_period_schedules.to_academic_year_period_schedules> schedules = Academic_year_period_schedules.ret_data(" where status=1");

            if (!schedules.isEmpty()) {
                acad_schedule = schedules.get(0);
                Field.Input tf = (Field.Input) tf_field26;
                tf.setText(acad_schedule.period);
                tf.setId("" + acad_schedule.id);
            }
        }

        init_tbl_academic_offering_subjects(tbl_academic_offering_subjects);
        init_tbl_enrollment_offered_subjects(tbl_enrollment_offered_subjects);
        init_tbl_enrollments(tbl_enrollments);
        deps = Departments.ret_data(" order by department_name  asc ");
        deps2 = deps;
        if (!deps2.isEmpty()) {
            Departments.to_departments dep = (Departments.to_departments) deps2.get(0);
            Field.Combo co = (Field.Combo) tf_field2;
            co.setText("" + dep.department_name);
            co.setId("" + dep.id);

            Field.Combo co2 = (Field.Combo) tf_field15;
            co2.setText("" + dep.department_name);
            co2.setId("" + dep.id);

        }
        ret_offering_subjects();
        ret_opened_subjects();
    }
    Academic_years.to_academic_years acad = null;
    List<String> list_year2 = new ArrayList();
    List<String> list_period = new ArrayList();
    List<String> list_year = new ArrayList();
    Academic_year_period_schedules.to_academic_year_period_schedules acad_schedule = null;
    List<Academic_years.to_academic_years> acad_years = new ArrayList();

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
                    String term = acad_schedule.period;
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
                Enrollment_offered_subjects.add_data(open, data.no_of_sections, "");
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
                    String term = acad_schedule.period;
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

        String where = " where id<>0 ";
        String where2 = "";
        String search = tf_field18.getText();
        if (!jCheckBox13.isSelected()) {
            Field.Combo dep = (Field.Combo) tf_field15;
            Field.Combo gr = (Field.Combo) tf_field17;

            where = where + " and department_id='" + dep.getId() + "' ";
            where2 = where2 + "  or department_id='" + dep.getId() + "' ";

            if (!jCheckBox15.isSelected()) {
                where = where + " and subject_group_id='" + gr.getId() + "' ";
                where2 = where2 + " and subject_group_id='" + gr.getId() + "' ";
            }
            where = where + " and subject_code like '%" + search + "%' ";

            where = where + where2 + " and description like '%" + search + "%' order by description desc ";
        } else {
            where = " where subject_code like '%" + search + "%' or description like '%" + search + "%' order by description desc ";
        }

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
        int[] tbl_widths_customers = {tf_field21.getWidth()};
        int width = 0;
        String[] col_names = {"", "", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field21, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                String to = list_period.get(data.selected_row);
                tf_field21.setText("" + to);

                ret_offering_subjects();
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
        String where = "";
        List<Enrollments.to_enrollments> enrollments = Enrollments.ret_data(where);
        loadData_enrollments(enrollments);
        jLabel28.setText("" + enrollments.size());
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

}
