/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.reports;

import cis.academic.Academic_offerings;
import cis.academic.Academic_year_fees;
import cis.academic.Academic_year_period_schedules;
import cis.academic.Academic_years;
import cis.colleges.Colleges;
import cis.departments.Departments;
import cis.enrollments.Enrollment_student_loaded_subjects;
import cis.enrollments.Enrollments;
import cis.enrollments.Enrollments.to_enrollments;
import cis.finance.Dlg_finance;
import cis.finance.Enrollment_assessment_payment_modes;
import cis.finance.Miscellaneous_fees;
import cis.users.MyUser;
import cis.utils.DateType;
import cis.utils.TableRenderer;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.JasperUtil;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRPrintPage;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
import org.jfree.ui.Align;
import synsoftech.fields.Button;
import synsoftech.fields.Field;

/**
 *
 * @author User
 */
public class Dlg_list_of_students extends javax.swing.JDialog {

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
    private Dlg_list_of_students(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_list_of_students(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_list_of_students() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_list_of_students myRef;

    private void setThisRef(Dlg_list_of_students myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_list_of_students> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_list_of_students create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_list_of_students create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_list_of_students dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_list_of_students((java.awt.Frame) parent, false);
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
            Dlg_list_of_students dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_list_of_students((java.awt.Dialog) parent, false);
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

        Dlg_list_of_students dialog = Dlg_list_of_students.create(new javax.swing.JFrame(), true);
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
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_enrollments = new javax.swing.JTable();
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
        tf_field17 = new Field.Combo();
        jLabel27 = new javax.swing.JLabel();
        tf_field18 = new Field.Combo();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jButton5 = new Button.Info();
        tf_field5 = new Field.Input();
        jLabel12 = new javax.swing.JLabel();
        jCheckBox15 = new javax.swing.JCheckBox();
        jLabel28 = new javax.swing.JLabel();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
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
        jScrollPane1.setViewportView(tbl_enrollments);

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
        jLabel26.setText("Period:");

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

        buttonGroup1.add(jCheckBox13);
        jCheckBox13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox13.setSelected(true);
        jCheckBox13.setText("Name");
        jCheckBox13.setFocusable(false);

        buttonGroup1.add(jCheckBox14);
        jCheckBox14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox14.setText("Student No");
        jCheckBox14.setFocusable(false);

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

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Report Type:");

        buttonGroup2.add(jCheckBox16);
        jCheckBox16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox16.setText("List");
        jCheckBox16.setFocusable(false);
        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jCheckBox17);
        jCheckBox17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox17.setText("Subjects Enrolled");
        jCheckBox17.setFocusable(false);
        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jCheckBox18);
        jCheckBox18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox18.setText("Enrollment List");
        jCheckBox18.setFocusable(false);
        jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox18ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jCheckBox19);
        jCheckBox19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox19.setText("Enrollment Summary");
        jCheckBox19.setFocusable(false);
        jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox19ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jCheckBox20);
        jCheckBox20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox20.setSelected(true);
        jCheckBox20.setText("Enrollment Summary [ CHED ]");
        jCheckBox20.setFocusable(false);
        jCheckBox20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox20ActionPerformed(evt);
            }
        });

        jCheckBox21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox21.setText("All");
        jCheckBox21.setFocusable(false);
        jCheckBox21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(tf_field5, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jCheckBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_field18, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_field14)
                                    .addComponent(tf_field15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_field13, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addGap(5, 5, 5)
                                        .addComponent(jCheckBox21, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_field17, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jCheckBox16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox17, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox18, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox20)
                                .addContainerGap())))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox16)
                    .addComponent(jCheckBox17)
                    .addComponent(jCheckBox18)
                    .addComponent(jCheckBox19)
                    .addComponent(jCheckBox20))
                .addGap(5, 5, 5)
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
                        .addComponent(tf_field17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox21)))
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
                    .addComponent(jCheckBox13)
                    .addComponent(jCheckBox14)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Students", jPanel2);

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
            .addGap(0, 534, Short.MAX_VALUE)
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
                .addGap(28, 28, 28)
                .addComponent(jTabbedPane1)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTabbedPane1)
                .addGap(23, 23, 23))
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
        set_report();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tbl_enrollmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_enrollmentsMouseClicked
        select_enrollment();
    }//GEN-LAST:event_tbl_enrollmentsMouseClicked

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
        init_acad_period_schedules();
    }//GEN-LAST:event_tf_field17MouseClicked

    private void tf_field17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field17ActionPerformed
        init_acad_period_schedules();
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

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox16ActionPerformed
        jLabel12.setVisible(true);
        tf_field5.setVisible(true);
        jCheckBox13.setVisible(true);
        jCheckBox14.setVisible(true);
    }//GEN-LAST:event_jCheckBox16ActionPerformed

    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox17ActionPerformed
        jLabel12.setVisible(true);
        tf_field5.setVisible(true);
        jCheckBox13.setVisible(true);
        jCheckBox14.setVisible(true);
    }//GEN-LAST:event_jCheckBox17ActionPerformed

    private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox18ActionPerformed
        jLabel12.setVisible(true);
        tf_field5.setVisible(true);
        jCheckBox13.setVisible(true);
        jCheckBox14.setVisible(true);
    }//GEN-LAST:event_jCheckBox18ActionPerformed

    private void jCheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox19ActionPerformed
        jLabel12.setVisible(false);
        tf_field5.setVisible(false);
        jCheckBox13.setVisible(false);
        jCheckBox14.setVisible(false);
    }//GEN-LAST:event_jCheckBox19ActionPerformed

    private void jCheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox20ActionPerformed

    private void jCheckBox21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox21ActionPerformed
        ret_data();
    }//GEN-LAST:event_jCheckBox21ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
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
    private javax.swing.JTable tbl_enrollments;
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
            acad = to1;
        }

        deps = Departments.ret_data(" order by department_name  asc ");
        if (!deps.isEmpty()) {
            Departments.to_departments to = (Departments.to_departments) deps.get(0);
            Field.Combo dep = (Field.Combo) tf_field14;
            dep.setId("" + to.id);
            dep.setText("" + to.department_name);

            String where = "  where academic_year_id='" + acad.id + "' and status=1 and department_id='" + to.id + "'";
            acad_schedules = Academic_year_period_schedules.ret_data(where);

            if (!acad_schedules.isEmpty()) {
                acad_schedule = acad_schedules.get(0);
                Field.Input tf = (Field.Input) tf_field17;
                tf.setText(acad_schedule.period);
                tf.setId("" + acad_schedule.id);
            }
        }

        init_tbl_enrollments(tbl_enrollments);
        ret_data();
    }
    Academic_years.to_academic_years acad = null;
    Academic_year_period_schedules.to_academic_year_period_schedules acad_schedule = null;
    List<Academic_years.to_academic_years> acad_years = new ArrayList();
    List<Academic_year_period_schedules.to_academic_year_period_schedules> acad_schedules = new ArrayList();

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

    //<editor-fold defaultstate="collapsed" desc=" enrollments "> 
    public static ArrayListModel tbl_enrollments_ALM;
    public static TblenrollmentsModel tbl_enrollments_M;

    public void init_tbl_enrollments(JTable tbl_enrollments) {
        tbl_enrollments_ALM = new ArrayListModel();
        tbl_enrollments_M = new TblenrollmentsModel(tbl_enrollments_ALM);
        tbl_enrollments.setModel(tbl_enrollments_M);
        tbl_enrollments.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_enrollments.setRowHeight(25);
        int[] tbl_widths_enrollments = {100, 100, 180, 100, 100, 80, 80, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_enrollments.length; i < n; i++) {
            if (i == 3) {
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

        TableColumn tc = tbl_enrollments.getColumnModel().getColumn(7);
        tc.setCellEditor(tbl_enrollments.getDefaultEditor(Boolean.class));
        tc.setCellRenderer(tbl_enrollments.getDefaultRenderer(Boolean.class));
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
            for (int x = 0, y = tbl_enrollments.getRowCount(); x < y; x++) {
                tbl_enrollments.setValueAt(checked, x, 0);
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
                    rendererComponent.setBackground(new java.awt.Color(255, 255, 255));
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
            List<to_enrollments> datas = tbl_enrollments_ALM;
            boolean selected = false;
            if (this.isSelected()) {
                selected = true;
            }
            for (to_enrollments to : datas) {
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

    public static void loadData_enrollments(List<to_enrollments> acc) {
        tbl_enrollments_ALM.clear();
        tbl_enrollments_ALM.addAll(acc);
    }

    public static class TblenrollmentsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Enrollment No", "Student No", "Name", "Course", "Year", "Created", "Enrolled", "", "course_description", "term", "encoded_by_id", "encoded_by", "encoded_date", "assessed_by_id", "assessed_by", "assessed_date", "advised_by_id", "advised_by", "advised_date", "approved_by_id", "approved_by", "approved_date", "date_enrolled", "student_id", "student_no", "last_name", "first_name", "middle_name", "nick_name", "current_address", "permanent_address", "email_address", "postal_code", "tel_no", "mobile_no", "date_of_birth", "place_of_birth", "age", "gender", "citizenship", "religion", "civil_status", "spouse_name", "date_of_communion", "date_of_confirmation", "is_right_handed", "is_indigenous", "indigenous_name", "level_id", "level", "college_id", "college", "department_id", "department", "year_level", "year_level_status", "preferred_course1", "preferred_course2", "preferred_course3", "father_name", "father_citizenship", "father_home_address", "father_email_address", "father_mobile_no", "father_occupation", "father_employer", "father_business_address", "father_business_tel_no", "father_educational_attainment", "father_last_school_attended", "mother_name", "mother_citizenship", "mother_home_address", "mother_email_address", "mother_mobile_no", "mother_occupation", "mother_employer", "mother_business_address", "mother_business_tel_no", "mother_educational_attainment", "mother_last_school_attended", "guardian_name", "guardian_mailing_address", "guardian_telephone_no", "grade_school_name", "grade_school_region", "grade_school_school_year", "grade_school_awards", "high_school_name", "high_school_region", "high_school_school_year", "high_school_awards", "college_school_name", "college_school_region", "college_school_school_year", "college_awards", "junior_high_name", "junior_high_region", "junior_high_year", "junior_high_awards", "tesda_name", "tesda_region", "tesda_year", "tesda_awards", "sibling1", "sibling2", "sibling3", "sibling4", "sibling5", "sibling6", "sibling7", "sibling8", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded"
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
            if (col == 7) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            to_enrollments tt = (to_enrollments) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.enrollment_no;
                case 1:
                    if (tt.student_no == null) {
                        return " ";
                    } else {
                        return " " + tt.student_no;
                    }

                case 2:
                    return " " + tt.last_name + ", " + tt.first_name + " " + tt.middle_name;
                case 3:
                    return " " + tt.course_code + " - " + tt.course_description;
                case 4:
                    return " " + tt.year_level;
                case 5:
                    return " " + DateType.convert_slash_datetime(tt.created_at);
                case 6:
                    if (tt.date_enrolled == null) {
                        return "";
                    } else {
                        return " " + DateType.convert_slash_datetime(tt.date_enrolled);
                    }
                case 7:
                    return tt.selected;
                case 8:
                    return tt.course_description;
                case 9:
                    return tt.term;
                case 10:
                    return tt.encoded_by_id;
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
                    return tt.date_enrolled;
                case 23:
                    return tt.student_id;
                case 24:
                    return tt.student_no;
                case 25:
                    return tt.last_name;
                case 26:
                    return tt.first_name;
                case 27:
                    return tt.middle_name;
                case 28:
                    return tt.nick_name;
                case 29:
                    return tt.current_address;
                case 30:
                    return tt.permanent_address;
                case 31:
                    return tt.email_address;
                case 32:
                    return tt.postal_code;
                case 33:
                    return tt.tel_no;
                case 34:
                    return tt.mobile_no;
                case 35:
                    return tt.date_of_birth;
                case 36:
                    return tt.place_of_birth;
                case 37:
                    return tt.age;
                case 38:
                    return tt.gender;
                case 39:
                    return tt.citizenship;
                case 40:
                    return tt.religion;
                case 41:
                    return tt.civil_status;
                case 42:
                    return tt.spouse_name;
                case 43:
                    return tt.date_of_communion;
                case 44:
                    return tt.date_of_confirmation;
                case 45:
                    return tt.is_right_handed;
                case 46:
                    return tt.is_indigenous;
                case 47:
                    return tt.indigenous_name;
                case 48:
                    return tt.level_id;
                case 49:
                    return tt.level;
                case 50:
                    return tt.college_id;
                case 51:
                    return tt.college;
                case 52:
                    return tt.department_id;
                case 53:
                    return tt.department;
                case 54:
                    return tt.year_level;
                case 55:
                    return tt.year_level_status;
                case 56:
                    return tt.preferred_course1;
                case 57:
                    return tt.preferred_course2;
                case 58:
                    return tt.preferred_course3;
                case 59:
                    return tt.father_name;
                case 60:
                    return tt.father_citizenship;
                case 61:
                    return tt.father_home_address;
                case 62:
                    return tt.father_email_address;
                case 63:
                    return tt.father_mobile_no;
                case 64:
                    return tt.father_occupation;
                case 65:
                    return tt.father_employer;
                case 66:
                    return tt.father_business_address;
                case 67:
                    return tt.father_business_tel_no;
                case 68:
                    return tt.father_educational_attainment;
                case 69:
                    return tt.father_last_school_attended;
                case 70:
                    return tt.mother_name;
                case 71:
                    return tt.mother_citizenship;
                case 72:
                    return tt.mother_home_address;
                case 73:
                    return tt.mother_email_address;
                case 74:
                    return tt.mother_mobile_no;
                case 75:
                    return tt.mother_occupation;
                case 76:
                    return tt.mother_employer;
                case 77:
                    return tt.mother_business_address;
                case 78:
                    return tt.mother_business_tel_no;
                case 79:
                    return tt.mother_educational_attainment;
                case 80:
                    return tt.mother_last_school_attended;
                case 81:
                    return tt.guardian_name;
                case 82:
                    return tt.guardian_mailing_address;
                case 83:
                    return tt.guardian_telephone_no;
                case 84:
                    return tt.grade_school_name;
                case 85:
                    return tt.grade_school_region;
                case 86:
                    return tt.grade_school_school_year;
                case 87:
                    return tt.grade_school_awards;
                case 88:
                    return tt.high_school_name;
                case 89:
                    return tt.high_school_region;
                case 90:
                    return tt.high_school_school_year;
                case 91:
                    return tt.high_school_awards;
                case 92:
                    return tt.college_school_name;
                case 93:
                    return tt.college_school_region;
                case 94:
                    return tt.college_school_school_year;
                case 95:
                    return tt.college_awards;
                case 96:
                    return tt.junior_high_name;
                case 97:
                    return tt.junior_high_region;
                case 98:
                    return tt.junior_high_year;
                case 99:
                    return tt.junior_high_awards;
                case 100:
                    return tt.tesda_name;
                case 101:
                    return tt.tesda_region;
                case 102:
                    return tt.tesda_year;
                case 103:
                    return tt.tesda_awards;
                case 104:
                    return tt.sibling1;
                case 105:
                    return tt.sibling2;
                case 106:
                    return tt.sibling3;
                case 107:
                    return tt.sibling4;
                case 108:
                    return tt.sibling5;
                case 109:
                    return tt.sibling6;
                case 110:
                    return tt.sibling7;
                case 111:
                    return tt.sibling8;
                case 112:
                    return tt.created_at;
                case 113:
                    return tt.updated_at;
                case 114:
                    return tt.created_by;
                case 115:
                    return tt.updated_by;
                case 116:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }

    private void ret_data() {
        String where = " where date_enrolled is not null ";
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

        if (!jCheckBox21.isSelected()) {
            String period = tf_field17.getText();
            where = where + " and term like '" + period + "' ";
        }

        where = where + " order by last_name asc ";
//        System.out.println(where);
        List<to_enrollments> datas = Enrollments.ret_data(where);
        loadData_enrollments(datas);
        jLabel2.setText("" + datas.size());
    }
//</editor-fold> 

    private void select_enrollment() {
        int row = tbl_enrollments.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_enrollments to = (to_enrollments) tbl_enrollments_ALM.get(row);
        int col = tbl_enrollments.getSelectedColumn();
        if (col == 7) {
            if (to.isSelected()) {
                to.setSelected(false);
            } else {
                to.setSelected(true);
            }
            tbl_enrollments_M.fireTableDataChanged();
        }
    }

    private void set_report() {
        jTabbedPane1.setSelectedIndex(1);
        jProgressBar1.setString("Loading...Please wait...");
        jProgressBar1.setIndeterminate(true);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                List<Srpt_list_of_students.field> fields = new ArrayList();
                List<to_enrollments> enrollments = tbl_enrollments_ALM;

                for (to_enrollments enroll : enrollments) {
                    if (enroll.isSelected()) {
                        String student_no = enroll.student_no;
                        String name = enroll.last_name + ", " + enroll.first_name + " " + enroll.middle_name;
                        String course = enroll.course_code + " - " + enroll.year_level;
                        double no_of_units = 0;
                        Srpt_list_of_students.field f = new Srpt_list_of_students.field("" + enroll.id, student_no, name, course, no_of_units);
                        fields.add(f);
                    }

                }
                String business_name = System.getProperty("school_name", "Colegio de Santa Catalina de Alejandria (COSCA)");
                String address = System.getProperty("address", "Bishop Epifanio B. Surban St. Dumaguete City Negros Oriental, Bishop Epifanio Surban St, Dumaguete, Negros Oriental");
                String date = synsoftech.util.DateType.slash.format(new Date());
                String contact_no = System.getProperty("contact_no", "(035) 225 4831");
                String printed_by = "Administrator";
                String school_year = tf_field13.getText();
                String semester = tf_field17.getText();
                String jrxml = "rpt_list_of_students.jrxml";
                if (jCheckBox16.isSelected()) {
                    Enrollment_student_loaded_subjects.ret_total_units(fields);
                    Srpt_list_of_students rpt = new Srpt_list_of_students(business_name, address, contact_no, date, printed_by, school_year, semester);
                    rpt.fields.addAll(fields);

                    report_list_of_students(rpt, jrxml);
                } else if (jCheckBox17.isSelected()) {
                    jrxml = "rpt_list_of_students_with_subjects.jrxml";
                    Srpt_list_of_students_with_subjects rpt = new Srpt_list_of_students_with_subjects(business_name, address, contact_no, date, printed_by, school_year, semester);
                    List<Srpt_list_of_students_with_subjects.field> fields2 = Enrollment_student_loaded_subjects.ret_subjects(fields);
                    rpt.fields.addAll(fields2);
                    report_list_of_students_with_subjects(rpt, jrxml);
                } else if (jCheckBox18.isSelected()) {
                    jrxml = "rpt_enrollment_list.jrxml";
                    String department = "All";
                    String college = "All";
                    if (!jCheckBox10.isSelected()) {
                        department = tf_field14.getText();
                    }
                    if (!jCheckBox11.isSelected()) {
                        college = tf_field15.getText();
                    }
                    List<Srpt_enrollment_list.field> f_list = new ArrayList();
                    for (to_enrollments enroll : enrollments) {
                        if (enroll.isSelected()) {
                            String course_id = "" + enroll.course_id;
                            String student_no = enroll.student_no;
                            String name = enroll.last_name + ", " + enroll.first_name + " " + enroll.middle_name;
                            String course = enroll.course_code + " - " + enroll.course_description;
                            String enrollment_id = "" + enroll.id;
                            String date_enrolled = DateType.convert_slash_datetime(enroll.date_enrolled);
                            int age = enroll.age;
                            String gender = "Male";
                            if (enroll.gender == 0) {
                                gender = "Female";
                            }

                            String bday = DateType.convert_slash_datetime2(enroll.date_of_birth);
                            String year_level = enroll.year_level;
                            Srpt_enrollment_list.field f = new Srpt_enrollment_list.field(course_id, enrollment_id, student_no, name, course, date_enrolled, age, gender, bday, year_level);
                            f_list.add(f);

                        }

                    }
                    Srpt_enrollment_list rpt = new Srpt_enrollment_list(business_name, address, contact_no, date, printed_by, school_year, semester, department, college);
                    rpt.fields.addAll(f_list);
                    report_enrollment_list(rpt, jrxml);
                } else if (jCheckBox20.isSelected()) {

                    String department = "All";
                    if (!jCheckBox10.isSelected()) {
                        department = tf_field14.getText();
                    }
                    List<to_enrollments> selected = new ArrayList();
                    for (to_enrollments enroll : enrollments) {
                        if (enroll.isSelected()) {
                            selected.add(enroll);
                        }
                    }
                    List<Srpt_enrollment_summary2.field> fields5 = Srpt_enrollment_summary.ret_data(selected);
                    jrxml = "rpt_enrollment_summary2.jrxml";
                    Srpt_enrollment_summary2 rpt = new Srpt_enrollment_summary2(business_name, address, contact_no, date, printed_by, school_year, semester, department);
                    rpt.fields.addAll(fields5);
                    report_enrollment_summary2(rpt, jrxml);

                } else {

                    List<String> selected_colleges = new ArrayList();
                    if (!jCheckBox11.isSelected()) {
                        Field.Combo tf = (Field.Combo) tf_field15;
                        selected_colleges.add(tf.getId());
                    } else {
                        for (Colleges.to_colleges coll : colleges2) {
                            selected_colleges.add("" + coll.id);
                        }
                    }
                    Field.Input year3 = (Field.Input) tf_field13;
                    String department = tf_field14.getText();
                    if (jCheckBox10.isSelected()) {
                        department = "All";
                    }
                    int continuing_1st = 0;
                    int continuing_2nd = 0;
                    int continuing_3rd = 0;
                    int continuing_4th = 0;
                    int continuing_5th = 0;
                    int new_1st = 0;
                    int new_2nd = 0;
                    int new_3rd = 0;
                    int new_4th = 0;
                    int new_5th = 0;
                    int transferee_1st = 0;
                    int transferee_2nd = 0;
                    int transferee_3rd = 0;
                    int transferee_4th = 0;
                    int transferee_5th = 0;
                    jrxml = "rpt_enrollment_summary.jrxml";
                    Srpt_enrollment_summary rpt = new Srpt_enrollment_summary(business_name, address, contact_no, date, printed_by, school_year, semester, department, continuing_1st, continuing_2nd, continuing_3rd, continuing_4th, continuing_5th, new_1st, new_2nd, new_3rd, new_4th, new_5th, transferee_1st, transferee_2nd, transferee_3rd, transferee_4th, transferee_5th);
                   
                    String term="";
                    if (!jCheckBox21.isSelected()) {
                        term=tf_field17.getText();
                    }
                    rpt = Srpt_enrollment_summary.ret_data(year3.getId(), selected_colleges, rpt,term);
                    report_enrollment_summary(rpt, jrxml);
                }
                jProgressBar1.setString("Finished...");
                jProgressBar1.setIndeterminate(false);
            }
        }
        );
        t.start();

    }

    private void report_list_of_students(final Srpt_list_of_students to, String jrxml_name) {
        jPanel5.removeAll();
        jPanel5.setLayout(new BorderLayout());
        try {
            JRViewer viewer = get_viewer_assessment(to, jrxml_name);
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

    private void report_list_of_students_with_subjects(final Srpt_list_of_students_with_subjects to, String jrxml_name) {
        jPanel5.removeAll();
        jPanel5.setLayout(new BorderLayout());
        try {
            JRViewer viewer = get_viewer_list_with_subjects(to, jrxml_name);
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

    private void report_enrollment_list(final Srpt_enrollment_list to, String jrxml_name) {
        jPanel5.removeAll();
        jPanel5.setLayout(new BorderLayout());
        try {
            JRViewer viewer = get_viewer_enrollment_list(to, jrxml_name);
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

    private void report_enrollment_summary(final Srpt_enrollment_summary to, String jrxml_name) {
        jPanel5.removeAll();
        jPanel5.setLayout(new BorderLayout());
        try {
            JRViewer viewer = get_viewer_summary(to, jrxml_name);
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

    private void report_enrollment_summary2(final Srpt_enrollment_summary2 to, String jrxml_name) {
        jPanel5.removeAll();
        jPanel5.setLayout(new BorderLayout());
        try {
            JRViewer viewer = get_viewer_summary2(to, jrxml_name);
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

    public static JRViewer get_viewer_assessment(Srpt_list_of_students to, String rpt_name) {
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

    public static JRViewer get_viewer_list_with_subjects(Srpt_list_of_students_with_subjects to, String rpt_name) {
        try {
            return JasperUtil.getJasperViewer(
                    compileJasper2(rpt_name),
                    JasperUtil.setParameter(to),
                    JasperUtil.makeDatasource(to.fields));
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }
    }

    public static JRViewer get_viewer_enrollment_list(Srpt_enrollment_list to, String rpt_name) {
        try {
            return JasperUtil.getJasperViewer(
                    compileJasper3(rpt_name),
                    JasperUtil.setParameter(to),
                    JasperUtil.makeDatasource(to.fields));
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }
    }

    public static JRViewer get_viewer_summary(Srpt_enrollment_summary to, String rpt_name) {
        try {
            return JasperUtil.getJasperViewer(
                    compileJasper4(rpt_name),
                    JasperUtil.setParameter(to),
                    JasperUtil.makeDatasource(to.fields));
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }
    }

    public static JRViewer get_viewer_summary2(Srpt_enrollment_summary2 to, String rpt_name) {
        try {
            return JasperUtil.getJasperViewer(
                    compileJasper5(rpt_name),
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
            InputStream is = Srpt_list_of_students.class.
                    getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JasperReport compileJasper2(String rpt_name) {
        try {
            String jrxml = rpt_name;
            InputStream is = Srpt_list_of_students_with_subjects.class.
                    getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JasperReport compileJasper3(String rpt_name) {
        try {
            String jrxml = rpt_name;
            InputStream is = Srpt_enrollment_list.class.
                    getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JasperReport compileJasper4(String rpt_name) {
        try {
            String jrxml = rpt_name;
            InputStream is = Srpt_enrollment_summary.class.
                    getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JasperReport compileJasper5(String rpt_name) {
        try {
            String jrxml = rpt_name;
            InputStream is = Srpt_enrollment_summary2.class.
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

                String where2 = "  where academic_year_id='" + acad.id + "' and status=1 and department_id='" + to.id + "'";
                acad_schedules = Academic_year_period_schedules.ret_data(where2);

                Field.Combo tf = (Field.Combo) tf_field17;
                if (!acad_schedules.isEmpty()) {
                    acad_schedule = acad_schedules.get(0);
                    tf.setText(acad_schedule.period);
                    tf.setId("" + acad_schedule.id);
                } else {
                    tf.setText("");
                    tf.setId("");
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

                Field.Combo cou = (Field.Combo) tf_field16;
                cou.setText(off.course_code + " - " + off.course_description);
                cou.setId("" + off.course_id);
                ret_data();
            }
        });
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

    private void init_acad_period_schedules() {
        Field.Combo dep = (Field.Combo) tf_field14;
        acad_schedules.clear();
        acad_schedules = Academic_year_period_schedules.ret_data(" where status=1 and department_id='" + dep.getId() + "'");

        Object[][] obj = new Object[acad_schedules.size()][1];
        int i = 0;
        for (Academic_year_period_schedules.to_academic_year_period_schedules to : acad_schedules) {
            obj[i][0] = " " + to.period;
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
                Academic_year_period_schedules.to_academic_year_period_schedules to = acad_schedules.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field17;
                co.setText("" + to.period);
                co.setId("" + to.id);

                ret_data();
            }
        });
    }

}
