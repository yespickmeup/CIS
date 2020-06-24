/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.accounts_receivables;

import cis.academic.Academic_offerings;
import cis.academic.Academic_year_period_schedules;
import cis.academic.Academic_years;
import cis.colleges.Colleges;
import cis.departments.Departments;
import cis.enrollments.Enrollments;
import static cis.reports.Dlg_list_of_students.loadData_enrollments;
import cis.students.Students;
import cis.students.Students.to_students;
import cis.utils.TableRenderer;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.JasperUtil;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import synsoftech.fields.Button;
import synsoftech.fields.Field;

/**
 *
 * @author User
 */
public class Dlg_ar_student_balances extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_enrollment_assessments
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
    private Dlg_ar_student_balances(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_ar_student_balances(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_ar_student_balances() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_ar_student_balances myRef;

    private void setThisRef(Dlg_ar_student_balances myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_ar_student_balances> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_ar_student_balances create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_ar_student_balances create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_ar_student_balances dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_ar_student_balances((java.awt.Frame) parent, false);
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
            Dlg_ar_student_balances dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_ar_student_balances((java.awt.Dialog) parent, false);
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

        Dlg_ar_student_balances dialog = Dlg_ar_student_balances.create(new javax.swing.JFrame(), true);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_students = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        tf_field13 = new Field.Input();
        jLabel23 = new javax.swing.JLabel();
        jCheckBox10 = new javax.swing.JCheckBox();
        tf_field14 = new Field.Combo();
        tf_field15 = new Field.Combo();
        jCheckBox11 = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jCheckBox12 = new javax.swing.JCheckBox();
        tf_field16 = new Field.Combo();
        jLabel26 = new javax.swing.JLabel();
        tf_field17 = new Field.Input();
        jLabel27 = new javax.swing.JLabel();
        tf_field18 = new Field.Combo();
        jButton5 = new Button.Info();
        tf_field5 = new Field.Input();
        jLabel12 = new javax.swing.JLabel();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tbl_students.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_students.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_studentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_students);

        jLabel1.setText("No. of rows:");

        jLabel2.setText("0");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("School Year:");

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

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Department:");

        jCheckBox10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox10.setSelected(true);
        jCheckBox10.setText("All");
        jCheckBox10.setFocusable(false);
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        tf_field14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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

        jCheckBox11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox11.setSelected(true);
        jCheckBox11.setText("All");
        jCheckBox11.setFocusable(false);
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Level/College:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Course:");

        jCheckBox12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox12.setSelected(true);
        jCheckBox12.setText("All");
        jCheckBox12.setFocusable(false);
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
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

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Semester:");

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

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Year Level:");

        tf_field18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field18.setText("First Year");
        tf_field18.setFocusable(false);
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

        jButton5.setText("Print Preview");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        tf_field5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field5ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Search:");

        jCheckBox15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox15.setSelected(true);
        jCheckBox15.setText("All");
        jCheckBox15.setFocusable(false);
        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });

        jCheckBox13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox13.setSelected(true);
        jCheckBox13.setText("Name");
        jCheckBox13.setFocusable(false);

        jCheckBox14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox14.setText("Student No");
        jCheckBox14.setFocusable(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_field14, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                            .addComponent(tf_field15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_field13, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_field17, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(tf_field16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(tf_field5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jCheckBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_field18, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, 0))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox10)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCheckBox12, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox15)))
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox13)
                        .addComponent(jCheckBox14)))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Query", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jLabel3.setText("Status:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(709, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Print Preview", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jTabbedPane1)
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jTabbedPane1)
                .addGap(5, 5, 5))
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        set_assessment();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tbl_studentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_studentsMouseClicked
        select_enrollment();
    }//GEN-LAST:event_tbl_studentsMouseClicked

    private void tf_field13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field13MouseClicked

    private void tf_field13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field13ActionPerformed

    private void tf_field14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field14MouseClicked
        init_departments();
    }//GEN-LAST:event_tf_field14MouseClicked

    private void tf_field14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field14ActionPerformed
        init_departments();
    }//GEN-LAST:event_tf_field14ActionPerformed

    private void tf_field15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field15MouseClicked
        init_colleges();
    }//GEN-LAST:event_tf_field15MouseClicked

    private void tf_field15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field15ActionPerformed
        init_colleges();
    }//GEN-LAST:event_tf_field15ActionPerformed

    private void tf_field16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field16MouseClicked
        init_courses();
    }//GEN-LAST:event_tf_field16MouseClicked

    private void tf_field16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field16ActionPerformed
        init_courses();
    }//GEN-LAST:event_tf_field16ActionPerformed

    private void tf_field17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field17MouseClicked

    private void tf_field17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field17ActionPerformed

    private void tf_field18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field18MouseClicked
        init_periods();
    }//GEN-LAST:event_tf_field18MouseClicked

    private void tf_field18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field18ActionPerformed
        init_periods();
    }//GEN-LAST:event_tf_field18ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        ret_data();
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
        ret_data();
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        ret_data();
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void tf_field5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field5ActionPerformed
        ret_data();
    }//GEN-LAST:event_tf_field5ActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox15ActionPerformed
        ret_data();
    }//GEN-LAST:event_jCheckBox15ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl_students;
    private javax.swing.JTextField tf_field13;
    private javax.swing.JTextField tf_field14;
    private javax.swing.JTextField tf_field15;
    private javax.swing.JTextField tf_field16;
    private javax.swing.JTextField tf_field17;
    private javax.swing.JTextField tf_field18;
    private javax.swing.JTextField tf_field5;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
//        System.setProperty("pool_db", "db_cis_cosca");
//        System.setProperty("pool_password", "password");

        acad_years = Academic_years.ret_data(" where status=1 limit 1");
        if (!acad_years.isEmpty()) {
            Academic_years.to_academic_years to1 = acad_years.get(0);
            Field.Input year3 = (Field.Input) tf_field13;
            year3.setText(to1.years);
            year3.setId("" + to1.id);
        }

        deps = Departments.ret_data(" order by department_name  asc ");
        List<Academic_year_period_schedules.to_academic_year_period_schedules> periods = Academic_year_period_schedules.ret_data(" where status=1");
        if (!periods.isEmpty()) {
            Academic_year_period_schedules.to_academic_year_period_schedules period = (Academic_year_period_schedules.to_academic_year_period_schedules) periods.get(0);
            Field.Input per = (Field.Input) tf_field17;
            per.setText(period.period);
            per.setId("" + period.id);
        }
        set_periods();

        init_tbl_students(tbl_students);
        ret_data();
    }

    int no_of_years = 4;
    List<String> list_year = new ArrayList();

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

    //<editor-fold defaultstate="collapsed" desc=" students "> 
    public static ArrayListModel tbl_students_ALM;
    public static TblstudentsModel tbl_students_M;

    public static void init_tbl_students(JTable tbl_students) {
        tbl_students_ALM = new ArrayListModel();
        tbl_students_M = new TblstudentsModel(tbl_students_ALM);
        tbl_students.setModel(tbl_students_M);
        tbl_students.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_students.setRowHeight(25);
        int[] tbl_widths_students = {100, 120, 100, 180, 90, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_students.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_students, i, tbl_widths_students[i]);
        }
        Dimension d = tbl_students.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_students.getTableHeader().setPreferredSize(d);
        tbl_students.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_students.setRowHeight(25);
        tbl_students.setFont(new java.awt.Font("Arial", 0, 12));
        TableWidthUtilities.setColumnRightRenderer(tbl_students, 4);
    }

    public static void loadData_students(List<to_students> acc) {
        tbl_students_ALM.clear();
        tbl_students_ALM.addAll(acc);
    }

    public static class TblstudentsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Student No", "Name", "Contact No", "Address", "Balance", "last_name", "first_name", "middle_name", "nick_name", "current_address", "permanent_address", "email_address", "postal_code", "tel_no", "mobile_no", "date_of_birth", "place_of_birth", "age", "gender", "citizenship", "religion", "civil_status", "spouse_name", "date_of_communion", "date_of_confirmation", "is_right_handed", "is_indigenous", "indigenous_name", "level_id", "level", "college_id", "college", "department_id", "department", "year_level", "year_level_status", "preferred_course1", "preferred_course2", "preferred_course3", "father_name", "father_citizenship", "father_home_address", "father_email_address", "father_mobile_no", "father_occupation", "father_employer", "father_business_address", "father_business_tel_no", "father_educational_attainment", "father_last_school_attended", "mother_name", "mother_citizenship", "mother_home_address", "mother_email_address", "mother_mobile_no", "mother_occupation", "mother_employer", "mother_business_address", "mother_business_tel_no", "mother_educational_attainment", "mother_last_school_attended", "guardian_name", "guardian_mailing_address", "guardian_telephone_no", "grade_school_name", "grade_school_region", "grade_school_school_year", "grade_school_awards", "high_school_name", "high_school_region", "high_school_school_year", "high_school_awards", "college_school_name", "college_school_region", "college_school_school_year", "college_awards", "junior_high_name", "junior_high_region", "junior_high_year", "junior_high_awards", "tesda_name", "tesda_region", "tesda_year", "tesda_awards", "sibling1", "sibling2", "sibling3", "sibling4", "sibling5", "sibling6", "sibling7", "sibling8", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded", "course_id", "course_code", "course_description", "date_enrolled", "balance", "prepaid"
        };

        public TblstudentsModel(ListModel listmodel) {
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
            to_students tt = (to_students) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.student_no;
                case 1:
                    return " " + tt.last_name + ", " + tt.first_name + " " + tt.middle_name;
                case 2:
                    return " " + tt.mobile_no;
                case 3:
                    return " " + tt.permanent_address;
                case 4:
                    return FitIn.fmt_wc_0(tt.balance) + " ";
                case 5:
                    return tt.last_name;
                case 6:
                    return tt.first_name;
                case 7:
                    return tt.middle_name;
                case 8:
                    return tt.nick_name;
                case 9:
                    return tt.current_address;
                case 10:
                    return tt.permanent_address;
                case 11:
                    return tt.email_address;
                case 12:
                    return tt.postal_code;
                case 13:
                    return tt.tel_no;
                case 14:
                    return tt.mobile_no;
                case 15:
                    return tt.date_of_birth;
                case 16:
                    return tt.place_of_birth;
                case 17:
                    return tt.age;
                case 18:
                    return tt.gender;
                case 19:
                    return tt.citizenship;
                case 20:
                    return tt.religion;
                case 21:
                    return tt.civil_status;
                case 22:
                    return tt.spouse_name;
                case 23:
                    return tt.date_of_communion;
                case 24:
                    return tt.date_of_confirmation;
                case 25:
                    return tt.is_right_handed;
                case 26:
                    return tt.is_indigenous;
                case 27:
                    return tt.indigenous_name;
                case 28:
                    return tt.level_id;
                case 29:
                    return tt.level;
                case 30:
                    return tt.college_id;
                case 31:
                    return tt.college;
                case 32:
                    return tt.department_id;
                case 33:
                    return tt.department;
                case 34:
                    return tt.year_level;
                case 35:
                    return tt.year_level_status;
                case 36:
                    return tt.preferred_course1;
                case 37:
                    return tt.preferred_course2;
                case 38:
                    return tt.preferred_course3;
                case 39:
                    return tt.father_name;
                case 40:
                    return tt.father_citizenship;
                case 41:
                    return tt.father_home_address;
                case 42:
                    return tt.father_email_address;
                case 43:
                    return tt.father_mobile_no;
                case 44:
                    return tt.father_occupation;
                case 45:
                    return tt.father_employer;
                case 46:
                    return tt.father_business_address;
                case 47:
                    return tt.father_business_tel_no;
                case 48:
                    return tt.father_educational_attainment;
                case 49:
                    return tt.father_last_school_attended;
                case 50:
                    return tt.mother_name;
                case 51:
                    return tt.mother_citizenship;
                case 52:
                    return tt.mother_home_address;
                case 53:
                    return tt.mother_email_address;
                case 54:
                    return tt.mother_mobile_no;
                case 55:
                    return tt.mother_occupation;
                case 56:
                    return tt.mother_employer;
                case 57:
                    return tt.mother_business_address;
                case 58:
                    return tt.mother_business_tel_no;
                case 59:
                    return tt.mother_educational_attainment;
                case 60:
                    return tt.mother_last_school_attended;
                case 61:
                    return tt.guardian_name;
                case 62:
                    return tt.guardian_mailing_address;
                case 63:
                    return tt.guardian_telephone_no;
                case 64:
                    return tt.grade_school_name;
                case 65:
                    return tt.grade_school_region;
                case 66:
                    return tt.grade_school_school_year;
                case 67:
                    return tt.grade_school_awards;
                case 68:
                    return tt.high_school_name;
                case 69:
                    return tt.high_school_region;
                case 70:
                    return tt.high_school_school_year;
                case 71:
                    return tt.high_school_awards;
                case 72:
                    return tt.college_school_name;
                case 73:
                    return tt.college_school_region;
                case 74:
                    return tt.college_school_school_year;
                case 75:
                    return tt.college_awards;
                case 76:
                    return tt.junior_high_name;
                case 77:
                    return tt.junior_high_region;
                case 78:
                    return tt.junior_high_year;
                case 79:
                    return tt.junior_high_awards;
                case 80:
                    return tt.tesda_name;
                case 81:
                    return tt.tesda_region;
                case 82:
                    return tt.tesda_year;
                case 83:
                    return tt.tesda_awards;
                case 84:
                    return tt.sibling1;
                case 85:
                    return tt.sibling2;
                case 86:
                    return tt.sibling3;
                case 87:
                    return tt.sibling4;
                case 88:
                    return tt.sibling5;
                case 89:
                    return tt.sibling6;
                case 90:
                    return tt.sibling7;
                case 91:
                    return tt.sibling8;
                case 92:
                    return tt.created_at;
                case 93:
                    return tt.updated_at;
                case 94:
                    return tt.created_by;
                case 95:
                    return tt.updated_by;
                case 96:
                    return tt.status;
                case 97:
                    return tt.is_uploaded;
                case 98:
                    return tt.course_id;
                case 99:
                    return tt.course_code;
                case 100:
                    return tt.course_description;
                case 101:
                    return tt.date_enrolled;
                case 102:
                    return tt.balance;
                default:
                    return tt.prepaid;
            }
        }
    }

    private void ret_data() {
        String where = " where id is not null ";
        if (!jCheckBox10.isSelected()) {
            Field.Combo dep = (Field.Combo) tf_field14;
            where = where + " and department_id = '" + dep.getId() + "' ";
        }
        if (!jCheckBox11.isSelected()) {
            Field.Combo col = (Field.Combo) tf_field15;
            where = where + " and college_id = '" + col.getId() + "' ";
        }
        if (!jCheckBox12.isSelected()) {
            Field.Combo course = (Field.Combo) tf_field16;
            where = where + " and course_id = '" + course.getId() + "' ";
        }
        if (jCheckBox13.isSelected()) {
            where = where + " and concat(last_name,space(1),first_name) like '%" + tf_field5.getText() + "%' ";
        } else {
            where = where + " and student_no like '%" + tf_field5.getText() + "%' ";
        }
        if (!jCheckBox15.isSelected()) {
            where = where + " and year_level like '" + tf_field18.getText() + "' ";
        }
        where = where + " order by last_name asc ";
//        System.out.println(where);
        List<Students.to_students> datas = Students.ret_data(where);
        loadData_students(datas);
        jLabel2.setText("" + datas.size());
    }

//</editor-fold> 
//</editor-fold> 
    List<Academic_years.to_academic_years> acad_years = new ArrayList();

    private void select_enrollment() {
//        int row = tbl_enrollments.getSelectedRow();
//        if (row < 0) {
//            return;
//        }
//        to_enrollments to = (to_enrollments) tbl_enrollments_ALM.get(row);
//        int col = tbl_enrollments.getSelectedColumn();
//        if (col == 7) {
//            if (to.isSelected()) {
//                to.setSelected(false);
//            } else {
//                to.setSelected(true);
//            }
//            tbl_enrollments_M.fireTableDataChanged();
//        }
    }

    private void set_assessment() {
        jTabbedPane1.setSelectedIndex(1);
        jProgressBar1.setString("Loading...Please wait...");
        jProgressBar1.setIndeterminate(true);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                String business_name = System.getProperty("school_name", "Colegio de Santa Catalina de Alejandria (COSCA)");
                String address = System.getProperty("address", "Bishop Epifanio B. Surban St. Dumaguete City Negros Oriental, Bishop Epifanio Surban St, Dumaguete, Negros Oriental");
                String date = synsoftech.util.DateType.slash.format(new Date());
                String contact_no = System.getProperty("contact_no", "(035) 225 4831");
                String printed_by = "Administrator";
                String school_year = tf_field13.getText();
                String semester = tf_field17.getText();
                String department = tf_field14.getText();
                if (jCheckBox10.isSelected()) {
                    department = "All";
                }
                String college = tf_field15.getText();
                if (jCheckBox11.isSelected()) {
                    college = "All";
                }

                String year_level = tf_field18.getText();
                if (jCheckBox15.isSelected()) {
                    year_level = "All";
                }
                String course = tf_field16.getText();
                if (jCheckBox12.isSelected()) {
                    course = "All";
                }

                List<Srpt_ar_student_balances.field> fields = new ArrayList();
                List<Students.to_students> datas = tbl_students_ALM;
                for (Students.to_students to : datas) {

                    String student_no = to.student_no;
                    String student_name = to.last_name + ", " + to.first_name + " " + to.middle_name;
                    String contact_no1 = to.mobile_no;
                    String address1 = to.permanent_address;
                    double balance = to.balance;
                    Srpt_ar_student_balances.field f = new Srpt_ar_student_balances.field(student_no, student_name, contact_no1, address1, balance);
                    fields.add(f);
                }
                String jrxml = "rpt_ar_student_balances.jrxml";

                Srpt_ar_student_balances rpt = new Srpt_ar_student_balances(business_name, address, contact_no, date, printed_by, school_year, semester, department, college, course);

                rpt.fields.addAll(fields);

                report_class_list(rpt, jrxml);
                jProgressBar1.setString("Finished...");
                jProgressBar1.setIndeterminate(false);

            }
        });
        t.start();

    }

    private void report_class_list(final Srpt_ar_student_balances to, String jrxml_name) {
        jPanel5.removeAll();
        jPanel5.setLayout(new BorderLayout());
        try {
            JRViewer viewer = get_viewer_class_list(to, jrxml_name);
            JPanel pnl = new JPanel();
            pnl.add(viewer);
            pnl.setVisible(true);
            pnl.setVisible(true);
            jPanel5.add(viewer);

            jPanel5.updateUI();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer_class_list(Srpt_ar_student_balances to, String rpt_name) {
        try {
            return JasperUtil.getJasperViewer(
                    compileJasper(rpt_name),
                    JasperUtil.setParameter(to),
                    JasperUtil.makeDatasource(to.fields));
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }
    }

    public static JasperReport compileJasper(String rpt_name) {
        try {
            String jrxml = rpt_name;
            InputStream is = Srpt_ar_student_balances.class.
                    getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    List<Departments.to_departments> deps = new ArrayList();
    List<Colleges.to_colleges> colleges2 = new ArrayList();

    private void init_departments() {
        Object[][] obj = new Object[deps.size()][1];
        int i = 0;
        for (Departments.to_departments to : deps) {
            obj[i][0] = " " + to.department_name;
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
                Departments.to_departments to = deps.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field14;
                co.setText("" + to.department_name);
                co.setId("" + to.id);

                colleges2 = Colleges.ret_data(" where department_id='" + co.getId() + "' ");
                Field.Combo co1 = (Field.Combo) tf_field15;
                if (!colleges2.isEmpty()) {
                    Colleges.to_colleges c = (Colleges.to_colleges) colleges2.get(0);
                    co1.setText("" + c.college_name);
                    co1.setId("" + c.id);
                } else {
                    co1.setText("");
                    co1.setId("");
                }
                ret_data();

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
        int[] tbl_widths_customers = {tf_field15.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field15, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Colleges.to_colleges to = colleges2.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field15;
                co.setText("" + to.college_name);
                co.setId("" + to.id);

                ret_data();
            }

        });
    }

    private void init_courses() {
        Field.Input year3 = (Field.Input) tf_field13;

        String where = " where course_code like '%" + tf_field16.getText() + "%' and academic_year_id='" + year3.getId() + "' and status=1 "
                + " or course_description like '%" + tf_field16.getText() + "%' and academic_year_id='" + year3.getId() + "'  and status=1 "
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
        int[] tbl_widths_customers = {80, tf_field16.getWidth() - 80};
        int width = 0;
        String[] col_names = {"", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup2(tf_field16, obj, labels, tbl_widths_customers, col_names, tf_field16.getWidth());
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Academic_offerings.to_academic_offerings off = offer.get(data.selected_row);
                no_of_years = off.no_of_years;
                set_periods();
                Field.Combo cou = (Field.Combo) tf_field16;
                cou.setText(off.course_code + " - " + off.course_description);
                cou.setId("" + off.course_id);
                ret_data();
            }
        });
    }

    private void set_periods() {
        list_year.clear();
        String[] years = {"First Year", "Second Year", "Third Year", "Fourth Year", "Fifth Year"};
        for (int i = 0; i < no_of_years; i++) {
            list_year.add(years[i]);
        }
        tf_field18.setText("First Year");
    }

    private void init_periods() {

        Object[][] obj = new Object[list_year.size()][1];
        int i = 0;
        for (String to : list_year) {
            obj[i][0] = " " + to;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field18.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field18, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                String to = list_year.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field18;
                co.setText("" + to);
                ret_data();
            }

        });
    }

}
