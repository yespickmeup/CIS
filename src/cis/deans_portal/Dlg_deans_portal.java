/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.deans_portal;

import cis.academic.Academic_offerings;
import cis.academic.Academic_year_period_schedules;
import cis.academic.Academic_year_periods;
import cis.academic.Academic_years;
import cis.academic.Dlg_academic_offering_subjects;
import cis.academic.Srpt_list_of_programs;
import cis.colleges.Colleges;
import cis.departments.Departments;
import cis.enrollments.Enrollment_offered_subjects;
import cis.enrollments.Enrollments;
import cis.enrollments.Enrollments.to_enrollments;
import cis.users.MyUser;
import cis.users.Users;
import cis.utils.Alert;
import cis.utils.Combo;
import cis.utils.DateType;
import cis.utils.Dlg_confirm_delete;
import cis.utils.TableRenderer;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
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
import synsoftech.util.ImageRenderer;

/**
 *
 * @author Ronescape
 */
public class Dlg_deans_portal extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_deans_portal
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
    private Dlg_deans_portal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_deans_portal(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_deans_portal() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_deans_portal myRef;

    private void setThisRef(Dlg_deans_portal myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_deans_portal> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_deans_portal create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_deans_portal create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_deans_portal dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_deans_portal((java.awt.Frame) parent, false);
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
            Dlg_deans_portal dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_deans_portal((java.awt.Dialog) parent, false);
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

        Dlg_deans_portal dialog = Dlg_deans_portal.create(new javax.swing.JFrame(), true);
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
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        tf_field13 = new Field.Input();
        jLabel23 = new javax.swing.JLabel();
        tf_field14 = new Field.Combo();
        tf_field15 = new Field.Combo();
        jLabel24 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        jCheckBox9 = new javax.swing.JCheckBox();
        jLabel26 = new javax.swing.JLabel();
        tf_field16 = new Field.Combo();
        jButton11 = new Button.Info();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        tf_field18 = new Field.Combo();
        jLabel30 = new javax.swing.JLabel();
        tf_field19 = new Field.Combo();
        jCheckBox18 = new javax.swing.JCheckBox();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jCheckBox19 = new javax.swing.JCheckBox();
        tf_field20 = new Field.Combo();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_enrollments = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tf_field3 = new Field.Combo();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tf_field7 = new Field.Combo();
        tf_field8 = new Field.Combo();
        jLabel15 = new javax.swing.JLabel();
        tf_field9 = new Field.Combo();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_academic_offering_subjects = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jPanel12 = new javax.swing.JPanel();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        tf_field17 = new Field.Combo();
        jButton12 = new Button.Info();
        jLabel33 = new javax.swing.JLabel();
        tf_field21 = new Field.Combo();
        jCheckBox20 = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tf_field2 = new Field.Combo();
        jLabel11 = new javax.swing.JLabel();
        tf_field5 = new Field.Combo();
        jLabel12 = new javax.swing.JLabel();
        tf_field6 = new Field.Combo();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_offerings = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel8 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Level/College:");

        buttonGroup2.add(jCheckBox7);
        jCheckBox7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox7.setText("New Student");
        jCheckBox7.setFocusable(false);
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jCheckBox8);
        jCheckBox8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox8.setText("Transfer Student");
        jCheckBox8.setFocusable(false);

        buttonGroup2.add(jCheckBox13);
        jCheckBox13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox13.setText("Returning Student");
        jCheckBox13.setFocusable(false);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Type:");

        buttonGroup2.add(jCheckBox9);
        jCheckBox9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox9.setSelected(true);
        jCheckBox9.setText("All");
        jCheckBox9.setFocusable(false);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Name:");

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

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton11.setText("Search");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jCheckBox10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox10.setText("All");
        jCheckBox10.setFocusable(false);

        jCheckBox11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox11.setSelected(true);
        jCheckBox11.setText("All");
        jCheckBox11.setFocusable(false);
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });

        jCheckBox17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox17.setSelected(true);
        jCheckBox17.setText("All");
        jCheckBox17.setFocusable(false);
        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17ActionPerformed(evt);
            }
        });

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

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Year Level:");

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

        jCheckBox18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox18.setText("All");
        jCheckBox18.setFocusable(false);
        jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox18ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Period:");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Course:");

        jCheckBox19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox19.setSelected(true);
        jCheckBox19.setText("All");
        jCheckBox19.setFocusable(false);
        jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox19ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jCheckBox19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addComponent(tf_field20))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_field14)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jCheckBox7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(tf_field15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_field18, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_field19, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_field16, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                                        .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(437, 437, 437)))
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_field13, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 312, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox10))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_field15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox17)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox18)))
                .addGap(1, 1, 1)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox7)
                            .addComponent(jCheckBox8)
                            .addComponent(jCheckBox13)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox9))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel27.setText("No. of rows:");

        jLabel28.setText("0");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Advising", jPanel21);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("School Year:");

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

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Department:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Level/College:");
        jLabel14.setEnabled(false);

        tf_field7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field7.setEnabled(false);
        tf_field7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field7MouseClicked(evt);
            }
        });
        tf_field7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field7ActionPerformed(evt);
            }
        });

        tf_field8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Course/Program:");
        jLabel15.setEnabled(false);

        tf_field9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field9.setEnabled(false);
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

        jTabbedPane5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

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
        jScrollPane2.setViewportView(tbl_academic_offering_subjects);

        jLabel6.setText("No. of rows:");

        jLabel7.setText("0");

        jLabel10.setText("Status:");

        jProgressBar2.setString("");
        jProgressBar2.setStringPainted(true);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane5.addTab("Subjects", jPanel11);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 973, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("Print Preview", jPanel12);

        jCheckBox12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox12.setText("All");
        jCheckBox12.setFocusable(false);
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        jCheckBox14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox14.setSelected(true);
        jCheckBox14.setText("All");
        jCheckBox14.setEnabled(false);
        jCheckBox14.setFocusable(false);
        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });

        jCheckBox15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox15.setSelected(true);
        jCheckBox15.setText("All");
        jCheckBox15.setEnabled(false);
        jCheckBox15.setFocusable(false);
        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Code/Description:");

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

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton12.setText("Search");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Period:");

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

        jCheckBox20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox20.setText("All");
        jCheckBox20.setFocusable(false);
        jCheckBox20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane5)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(tf_field3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(tf_field7, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_field9, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(tf_field8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_field21, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox20))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox12)))
                .addGap(1, 1, 1)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox14)
                    .addComponent(tf_field9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox15)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jTabbedPane5)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Offered Subjects", jPanel9);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Print Preview", jPanel10);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Class Scheduling", jPanel4);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setOpaque(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("School Year:");

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

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Department:");

        tf_field5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field5MouseClicked(evt);
            }
        });
        tf_field5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field5ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Level/College:");

        tf_field6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field6MouseClicked(evt);
            }
        });
        tf_field6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field6ActionPerformed(evt);
            }
        });

        jTabbedPane3.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        tbl_offerings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_offerings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_offeringsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_offerings);

        jLabel3.setText("No. of rows:");

        jLabel4.setText("0");

        jLabel5.setText("Status:");

        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane3.addTab("List of Programs", jPanel7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Print Preview", jPanel8);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_field5)
                                    .addComponent(tf_field6)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_field2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTabbedPane3)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane3)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Programs", jPanel2);

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

    private void tf_field3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field3MouseClicked

    private void tf_field3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field3ActionPerformed

    private void tf_field7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field7MouseClicked
        init_colleges3();
    }//GEN-LAST:event_tf_field7MouseClicked

    private void tf_field7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field7ActionPerformed
        init_colleges3();
    }//GEN-LAST:event_tf_field7ActionPerformed

    private void tf_field8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field8MouseClicked
        init_departments3();
    }//GEN-LAST:event_tf_field8MouseClicked

    private void tf_field8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field8ActionPerformed
        init_departments3();
    }//GEN-LAST:event_tf_field8ActionPerformed

    private void tf_field9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field9MouseClicked
        init_programs();
    }//GEN-LAST:event_tf_field9MouseClicked

    private void tf_field9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field9ActionPerformed
        init_programs();
    }//GEN-LAST:event_tf_field9ActionPerformed

    private void tbl_academic_offering_subjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_academic_offering_subjectsMouseClicked
        select_subject();
    }//GEN-LAST:event_tbl_academic_offering_subjectsMouseClicked

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
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field16MouseClicked

    private void tf_field16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field16ActionPerformed
        ret_enrollments();
    }//GEN-LAST:event_tf_field16ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        ret_enrollments();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void tbl_enrollmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_enrollmentsMouseClicked
        select_enrollment();
    }//GEN-LAST:event_tbl_enrollmentsMouseClicked

    private void tf_field17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field17MouseClicked

    private void tf_field17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field17ActionPerformed
        ret_subjects();
    }//GEN-LAST:event_tf_field17ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        ret_subjects();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void tbl_offeringsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_offeringsMouseClicked
        select_offering();
    }//GEN-LAST:event_tbl_offeringsMouseClicked

    private void tf_field2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field2ActionPerformed
        //        init_groups();
    }//GEN-LAST:event_tf_field2ActionPerformed

    private void tf_field2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field2MouseClicked
        //        init_groups();
    }//GEN-LAST:event_tf_field2MouseClicked

    private void tf_field5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field5ActionPerformed
        init_departments2();
    }//GEN-LAST:event_tf_field5ActionPerformed

    private void tf_field5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field5MouseClicked
        init_departments2();
    }//GEN-LAST:event_tf_field5MouseClicked

    private void tf_field6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field6ActionPerformed
        init_colleges2();
    }//GEN-LAST:event_tf_field6ActionPerformed

    private void tf_field6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field6MouseClicked
        init_colleges2();
    }//GEN-LAST:event_tf_field6MouseClicked

    private void tf_field18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field18MouseClicked
        init_year_levels();
    }//GEN-LAST:event_tf_field18MouseClicked

    private void tf_field18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field18ActionPerformed
        init_year_levels();
    }//GEN-LAST:event_tf_field18ActionPerformed

    private void tf_field19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field19MouseClicked
        init_periods();
    }//GEN-LAST:event_tf_field19MouseClicked

    private void tf_field19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field19ActionPerformed
        init_periods();
    }//GEN-LAST:event_tf_field19ActionPerformed

    private void jCheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox19ActionPerformed
        ret_enrollments();
    }//GEN-LAST:event_jCheckBox19ActionPerformed

    private void tf_field20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field20MouseClicked
        init_courses();
    }//GEN-LAST:event_tf_field20MouseClicked

    private void tf_field20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field20ActionPerformed
        init_courses();
    }//GEN-LAST:event_tf_field20ActionPerformed

    private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox18ActionPerformed
        ret_enrollments();
    }//GEN-LAST:event_jCheckBox18ActionPerformed

    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox17ActionPerformed
        ret_enrollments();
    }//GEN-LAST:event_jCheckBox17ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        ret_enrollments();
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
        ret_enrollments();
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        ret_subjects();
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed
        ret_subjects();
    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox15ActionPerformed
        ret_subjects();
    }//GEN-LAST:event_jCheckBox15ActionPerformed

    private void tf_field21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field21MouseClicked
        init_periods2();
    }//GEN-LAST:event_tf_field21MouseClicked

    private void tf_field21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field21ActionPerformed
        init_periods2();
    }//GEN-LAST:event_tf_field21ActionPerformed

    private void jCheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox20ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable tbl_academic_offering_subjects;
    private javax.swing.JTable tbl_enrollments;
    private javax.swing.JTable tbl_offerings;
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
    private javax.swing.JTextField tf_field3;
    private javax.swing.JTextField tf_field5;
    private javax.swing.JTextField tf_field6;
    private javax.swing.JTextField tf_field7;
    private javax.swing.JTextField tf_field8;
    private javax.swing.JTextField tf_field9;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        System.setProperty("pool_db", "db_cis_cosca");
        System.setProperty("pool_password", "password");
        init_key();
        acad_years = Academic_years.ret_data(" where status=1");
        year_levels = Combo.year_levels();
        if (!acad_years.isEmpty()) {
            for (Academic_years.to_academic_years to1 : acad_years) {
                if (to1.status == 1) {
                    Field.Combo year = (Field.Combo) tf_field2;
                    Field.Combo year2 = (Field.Combo) tf_field3;
                    Field.Input year3 = (Field.Input) tf_field13;
                    year.setText(to1.years);
                    year.setId("" + to1.id);
                    year2.setText(to1.years);
                    year2.setId("" + to1.id);
                    year3.setText(to1.years);
                    year3.setId("" + to1.id);
                    break;
                }
            }
        }
        deps = Departments.ret_data(" order by department_name  asc ");
        if (!deps.isEmpty()) {
            Departments.to_departments to = (Departments.to_departments) deps.get(0);
            Field.Combo dep = (Field.Combo) tf_field14;
            Field.Combo dep2 = (Field.Combo) tf_field8;
            dep.setId("" + to.id);
            dep.setText("" + to.department_name);
            dep2.setId("" + to.id);
            dep2.setText("" + to.department_name);

            colleges2 = Colleges.ret_data(" where department_id='" + dep.getId() + "' ");
            Field.Combo co1 = (Field.Combo) tf_field15;
            if (!colleges2.isEmpty()) {
                Colleges.to_colleges c = (Colleges.to_colleges) colleges2.get(0);
                co1.setText("" + c.college_name);
                co1.setId("" + c.id);
            } else {
                co1.setText("");
                co1.setId("");
            }
            ret_periods();
            ret_periods2();
        }
        init_tbl_offerings(tbl_offerings);
        init_tbl_academic_offering_subjects(tbl_academic_offering_subjects);
        init_tbl_enrollments(tbl_enrollments);
    }

    List<Academic_years.to_academic_years> acad_years = new ArrayList();

    public void do_pass() {
        int user_id = FitIn.toInt(MyUser.getUser_id());
        List<Users.to_users> users = Users.ret_data(" where id='" + user_id + "' limit 1");
        if (!users.isEmpty()) {
            Users.to_users user = (Users.to_users) users.get(0);
            List<Colleges.to_colleges> colleges = Colleges.ret_data(" where college_admin_id='" + user.faculty_id + "' limit 1");
            if (!colleges.isEmpty()) {

                Colleges.to_colleges college = (Colleges.to_colleges) colleges.get(0);
                Field.Combo co = (Field.Combo) tf_field14;
                Field.Combo co2 = (Field.Combo) tf_field15;
                co.setText("" + college.department_name);
                co.setId("" + college.department_id);

                co2.setText("" + college.college_name);
                co2.setId("" + college.id);

            }
        } else {

        }
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

    List<Departments.to_departments> deps = new ArrayList();

    private void init_departments2() {
        Object[][] obj = new Object[deps.size()][1];
        int i = 0;
        for (Departments.to_departments to : deps) {
            obj[i][0] = " " + to.department_name;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field5.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field5, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Departments.to_departments to = deps.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field5;
                co.setText("" + to.department_name);
                co.setId("" + to.id);
                colleges2 = Colleges.ret_data(" where department_id='" + co.getId() + "' ");
                Field.Combo co1 = (Field.Combo) tf_field6;
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

    private void init_departments3() {
        Object[][] obj = new Object[deps.size()][1];
        int i = 0;
        for (Departments.to_departments to : deps) {
            obj[i][0] = " " + to.department_name;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field8.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field8, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Departments.to_departments to = deps.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field8;
                co.setText("" + to.department_name);
                co.setId("" + to.id);
                colleges2 = Colleges.ret_data(" where department_id='" + co.getId() + "' ");
                Field.Combo co1 = (Field.Combo) tf_field7;
                if (!colleges2.isEmpty()) {
                    Colleges.to_colleges c = (Colleges.to_colleges) colleges2.get(0);
                    co1.setText("" + c.college_name);
                    co1.setId("" + c.id);
                } else {
                    co1.setText("");
                    co1.setId("");
                }
                ret_periods2();
                set_period2();
                ret_subjects();

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
        int[] tbl_widths_customers = {tf_field6.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field6, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Colleges.to_colleges to = colleges2.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field6;
                co.setText("" + to.college_name);
                co.setId("" + to.id);

                ret_offerings();
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
        int[] tbl_widths_customers = {tf_field7.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field7, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Colleges.to_colleges to = colleges2.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field7;
                co.setText("" + to.college_name);
                co.setId("" + to.id);
                ret_subjects();
            }

        });
    }

    private void init_programs() {

        Field.Combo year = (Field.Combo) tf_field3;
        Field.Combo dep = (Field.Combo) tf_field8;
        Field.Combo col = (Field.Combo) tf_field7;

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
        int[] tbl_widths_customers = {100, tf_field9.getWidth() - 100};
        int width = 0;
        String[] col_names = {"", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field9, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Academic_offerings.to_academic_offerings to = offerings.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field9;
                co.setText("" + to.course_description);
                co.setId("" + to.id);

                ret_subjects();
            }

        });
    }

    //<editor-fold defaultstate="collapsed" desc=" offerings "> 
    public static ArrayListModel tbl_offerings_ALM;
    public static TblofferingsModel tbl_offerings_M;

    public static void init_tbl_offerings(JTable tbl_offerings) {
        tbl_offerings_ALM = new ArrayListModel();
        tbl_offerings_M = new TblofferingsModel(tbl_offerings_ALM);
        tbl_offerings.setModel(tbl_offerings_M);
        tbl_offerings.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_offerings.setRowHeight(25);
        int[] tbl_widths_courses = {70, 100, 50, 100, 0, 0, 0, 40, 50, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_courses.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_offerings, i, tbl_widths_courses[i]);
        }
        Dimension d = tbl_offerings.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_offerings.setRowHeight(25);
        tbl_offerings.getTableHeader().setPreferredSize(d);
        tbl_offerings.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));

        tbl_offerings.setFont(new java.awt.Font("Arial", 0, 12));

        TableColumnModel tcm = tbl_offerings.getColumnModel();
        TableColumn tm = tcm.getColumn(1);
        tm.setCellRenderer(new Html2());

    }

    public static void loadData_offerings(List<Academic_offerings.to_academic_offerings> acc) {
        tbl_offerings_ALM.clear();
        tbl_offerings_ALM.addAll(acc);
    }

    public static class Html2 extends DefaultTableCellRenderer {

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

    public static class TblofferingsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Code", "Description", "Years", "Studies", "Status", "", "", "", "", "updated_at", "created_by", "updated_by", "status", "is_uploaded"
        };

        public TblofferingsModel(ListModel listmodel) {
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
            if (col == 6) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            Academic_offerings.to_academic_offerings tt = (Academic_offerings.to_academic_offerings) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.course_code;
                case 1:
                    String des = tt.course_description;
                    int syl = tt.course_description.length();
                    if (syl > 50) {
                        des = des.substring(0, 49) + "...";
                    }
                    String html = "<html><body>"
                            + "&nbsp <font size=\"4\" > " + des + "</font><br>"
                            //                            + "&nbsp  " + tt.department_name + " - " + tt.college + "&emsp;" + "<br>"
                            + "</body>"
                            + "</html>";
                    return html;

                case 2:
                    return " " + tt.no_of_years;
                case 3:
                    return " " + tt.studies;
                case 4:
                    if (tt.status == 0) {
                        return " Inactive";
                    } else {
                        return " Active";
                    }
                case 5:
                    return " Delete";
                case 6:
                    return tt.selected;
                case 7:
                    return " View";
                case 8:
                    return " Delete";
                case 9:
                    return tt.updated_at;
                case 10:
                    return tt.created_by;
                case 11:
                    return tt.updated_by;
                case 12:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }

    private void ret_offerings() {
        Field.Combo tf = (Field.Combo) tf_field2;
        String where = " where academic_year_id='" + tf.getId() + "' ";

        List<Academic_offerings.to_academic_offerings> datas = Academic_offerings.ret_data(where);
        loadData_offerings(datas);
        jLabel4.setText("" + datas.size());

        set_report();

    }

    private void select_offering() {
        int row = tbl_offerings.getSelectedRow();
        if (row < 0) {
            return;
        }
        int col = tbl_offerings.getSelectedColumn();
        Academic_offerings.to_academic_offerings to = (Academic_offerings.to_academic_offerings) tbl_offerings_ALM.get(row);
        if (col == 7) {
            Window p = (Window) this;
            Dlg_academic_offering_subjects nd = Dlg_academic_offering_subjects.create(p, true);
            nd.setTitle("");
            nd.do_pass(to);
            nd.setCallback(new Dlg_academic_offering_subjects.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, Dlg_academic_offering_subjects.OutputData data) {
                    closeDialog.ok();

                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" list of programs ">
    private void set_report() {

        jProgressBar1.setString("Loading...Please wait...");
        jProgressBar1.setIndeterminate(true);
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {

                Field.Combo sy = (Field.Combo) tf_field2;
                Field.Combo dep = (Field.Combo) tf_field5;
                Field.Combo co = (Field.Combo) tf_field6;

                String department = "All";
                String college = "All";
                String where = " where id<>0 ";
                where = where + " and academic_year_id='" + sy.getId() + "' ";
                where = where + " and department_id='" + dep.getId() + "' ";
                where = where + " and college_id='" + co.getId() + "' ";
                department = dep.getText();
                college = co.getText();
//                if (!jCheckBox6.isSelected()) {
//                   
//                 
//                    if (!jCheckBox7.isSelected()) {
//                      
//                       
//                    }
//                }

                String school_name = System.getProperty("school_name", "Colegio de Santa Catalina de Alejandria");
                String school_year = sy.getText();
                String date_printed = DateType.month_date.format(new Date());
                String printed_by = MyUser.getUser_screen_name();

                List<Srpt_list_of_programs.field> fields = Srpt_list_of_programs.ret_data(where);
                String jrxml = "rpt_list_of_programs.jrxml";

                Srpt_list_of_programs rpt = new Srpt_list_of_programs(school_name, school_year, date_printed, printed_by, department, college);
                rpt.fields.addAll(fields);

                report_programs(rpt, jrxml);
//                jTabbedPane3.setSelectedIndex(1);
                jProgressBar1.setString("Finished...");
                jProgressBar1.setIndeterminate(false);
            }
        });
        t.start();

    }

    private void report_programs(final Srpt_list_of_programs to, String jrxml_name) {
        jPanel8.removeAll();
        jPanel8.setLayout(new BorderLayout());
        try {
            JRViewer viewer = get_viewer_programs(to, jrxml_name);
            JPanel pnl = new JPanel();
            pnl.add(viewer);
            pnl.setVisible(true);
            pnl.setVisible(true);
            jPanel8.add(viewer);
            jPanel8.updateUI();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer_programs(Srpt_list_of_programs to, String rpt_name) {
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
            InputStream is = Srpt_list_of_programs.class.
                    getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" academic_offering_subjects "> 
    public static ArrayListModel tbl_academic_offering_subjects_ALM;
    public static Tblacademic_offering_subjectsModel tbl_academic_offering_subjects_M;

    public static void init_tbl_academic_offering_subjects(JTable tbl_academic_offering_subjects) {
        tbl_academic_offering_subjects_ALM = new ArrayListModel();
        tbl_academic_offering_subjects_M = new Tblacademic_offering_subjectsModel(tbl_academic_offering_subjects_ALM);
        tbl_academic_offering_subjects.setModel(tbl_academic_offering_subjects_M);
        tbl_academic_offering_subjects.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_academic_offering_subjects.setRowHeight(25);
        int[] tbl_widths_academic_offering_subjects = {70, 100, 40, 40, 80, 160, 100, 140, 60, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
    }

    public static void loadData_academic_offering_subjects(List<Enrollment_offered_subjects.to_enrollment_offered_subjects> acc) {
        tbl_academic_offering_subjects_ALM.clear();
        tbl_academic_offering_subjects_ALM.addAll(acc);
    }

    public static class Tblacademic_offering_subjectsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Code", "Description", "Lec", "Lab", "Section", "Instructor", "Room", "Time", "Status", "department", "course_id", "course_code", "course_description", "term", "year_level", "subject_id", "subject_code", "description", "units", "lecture_units", "lab_units", "amount", "is_lab", "max_students", "prerequisite_subject_ids", "subject_group", "subject_group_id", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded", "faculty_id", "faculty_name", "room", "schedule", "room_id"
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
            if (col == 1000) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            Enrollment_offered_subjects.to_enrollment_offered_subjects tt = (Enrollment_offered_subjects.to_enrollment_offered_subjects) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.subject_code;
                case 1:
                    return " " + tt.description;
                case 2:
                    return " " + FitIn.fmt_woc(tt.lecture_units);
                case 3:
                    return " " + FitIn.fmt_woc(tt.lab_units);
                case 4:
                    return " " + tt.prerequisite_subject_ids;
                case 5:
                    return " " + tt.faculty_name;
                case 6:
                    return " " + tt.room;
                case 7:
                    return " " + tt.schedule;
                case 8:
                    if (tt.status == 0) {
                        return " Posted";
                    } else if (tt.status == 1) {
                        return " Open";
                    } else if (tt.status == 2) {
                        return " Closed";
                    } else {
                        return " Dropped";
                    }

                case 9:
                    return tt.department;
                case 10:
                    return tt.course_id;
                case 11:
                    return tt.course_code;
                case 12:
                    return tt.course_description;
                case 13:
                    return tt.term;
                case 14:
                    return tt.year_level;
                case 15:
                    return tt.subject_id;
                case 16:
                    return tt.subject_code;
                case 17:
                    return tt.description;
                case 18:
                    return tt.units;
                case 19:
                    return tt.lecture_units;
                case 20:
                    return tt.lab_units;
                case 21:
                    return tt.amount;
                case 22:
                    return tt.is_lab;
                case 23:
                    return tt.max_students;
                case 24:
                    return tt.prerequisite_subject_ids;
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
                    return tt.faculty_id;
                case 34:
                    return tt.faculty_name;
                case 35:
                    return tt.room;
                case 36:
                    return tt.schedule;
                default:
                    return tt.room_id;
            }
        }
    }

    private void ret_subjects() {

        Field.Combo year = (Field.Combo) tf_field3;
        Field.Combo dep = (Field.Combo) tf_field8;
        Field.Combo col = (Field.Combo) tf_field7;
        Field.Combo cou = (Field.Combo) tf_field9;

        String where = " where eos.id<>0 ";
        String term = tf_field21.getText();
        if (!jCheckBox12.isSelected()) {

            if (!jCheckBox20.isSelected()) {

                where = where + " and eos.department_id='" + dep.getId() + "' "
                        + " and eos.description like '%" + tf_field17.getText() + "%' "
                        + " and term like '" + term + "' "
                        + " or eos.id<>0  and eos.department_id='" + dep.getId() + "' "
                        + " and eos.subject_code like '%" + tf_field17.getText() + "%' "
                        + " and term like '" + term + "' ";
            } else {
                where = where + " and eos.department_id='" + dep.getId() + "' "
                        + " and eos.description like '%" + tf_field17.getText() + "%' "
                        + " or eos.id<>0  and eos.department_id='" + dep.getId() + "' and eos.subject_code like '%" + tf_field17.getText() + "%' ";

            }

        } else {

            if (!jCheckBox20.isSelected()) {
                where = where + " and eos.description like '%" + tf_field17.getText() + "%' "
                        + " and eos.subject_code like '%" + tf_field17.getText() + "%' "
                        + " and term like '" + term + "' ";
            } else {
                where = where + " and eos.description like '%" + tf_field17.getText() + "%' "
                        + " and eos.subject_code like '%" + tf_field17.getText() + "%' ";
            }
        }

        where = where + " order by eos.description asc ";
//        System.out.println("where+ " + where);
        List<Enrollment_offered_subjects.to_enrollment_offered_subjects> subjects = Enrollment_offered_subjects.ret_data2(where);
        loadData_academic_offering_subjects(subjects);
        jLabel7.setText("" + subjects.size());

    }
//</editor-fold> 

    private void select_subject() {
        int row = tbl_academic_offering_subjects.getSelectedRow();
        if (row < 0) {
            return;
        }
        int col = tbl_academic_offering_subjects.getSelectedColumn();
        Enrollment_offered_subjects.to_enrollment_offered_subjects to = (Enrollment_offered_subjects.to_enrollment_offered_subjects) tbl_academic_offering_subjects_ALM.get(row);
        Window p = (Window) this;
        Dlg_dean_class_schedule_section nd = Dlg_dean_class_schedule_section.create(p, true);
        nd.setTitle("");
        nd.do_pass(to);
        nd.setCallback(new Dlg_dean_class_schedule_section.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_dean_class_schedule_section.OutputData data) {
                closeDialog.ok();
                ret_subjects();
            }

        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
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
        int[] tbl_widths_enrollments = {100, 100, 60, 120, 140, 80, 60, 70, 70, 70, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
    }

    public static void loadData_enrollments(List<to_enrollments> acc) {
        tbl_enrollments_ALM.clear();
        tbl_enrollments_ALM.addAll(acc);
    }

    public static class TblenrollmentsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Enrollment No", "Name", "Gender", "Course", "Date Added", "Birthdate", "Advised", "Approved", "Assessed", "Enrolled", "", "encoded_by", "encoded_date", "assessed_by_id", "assessed_by", "assessed_date", "advised_by_id", "advised_by", "advised_date", "approved_by_id", "approved_by", "approved_date", "student_no", "last_name", "first_name", "middle_name", "nick_name", "current_address", "permanent_address", "email_address", "postal_code", "tel_no", "mobile_no", "date_of_birth", "place_of_birth", "age", "gender", "citizenship", "religion", "civil_status", "spouse_name", "date_of_communion", "date_of_confirmation", "is_right_handed", "is_indigenous", "indigenous_name", "level_id", "level", "college_id", "college", "department_id", "department", "year_level", "year_level_status", "preferred_course1", "preferred_course2", "preferred_course3", "father_name", "father_citizenship", "father_home_address", "father_email_address", "father_mobile_no", "father_occupation", "father_employer", "father_business_address", "father_business_tel_no", "father_educational_attainment", "father_last_school_attended", "mother_name", "mother_citizenship", "mother_home_address", "mother_email_address", "mother_mobile_no", "mother_occupation", "mother_employer", "mother_business_address", "mother_business_tel_no", "mother_educational_attainment", "mother_last_school_attended", "guardian_name", "guardian_mailing_address", "guardian_telephone_no", "grade_school_name", "grade_school_region", "grade_school_school_year", "grade_school_awards", "high_school_name", "high_school_region", "high_school_school_year", "high_school_awards", "college_school_name", "college_school_region", "college_school_school_year", "college_awards", "junior_high_name", "junior_high_region", "junior_high_year", "junior_high_awards", "tesda_name", "tesda_region", "tesda_year", "tesda_awards", "sibling1", "sibling2", "sibling3", "sibling4", "sibling5", "sibling6", "sibling7", "sibling8", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded"
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
            to_enrollments tt = (to_enrollments) getRow(row);
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
                    String college = tt.college;
                    String course = tt.course_description;
                    if (college == null) {
                        college = "";
                    }
                    if (course == null) {
                        course = "";
                    }
                    if (college.isEmpty() && course.isEmpty()) {
                        return " ";
                    } else {
                        return " " + course + " - " + college;
                    }
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
                    return " Delete";
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
        Field.Combo year = (Field.Combo) tf_field2;
        String where = " where id<>0 and academic_year_id='" + year.getId() + "' ";
        if (!jCheckBox10.isSelected()) {
            Field.Combo dep = (Field.Combo) tf_field14;
            where = where + " and department_id = '" + dep.getId() + "' ";
        }
        if (!jCheckBox11.isSelected()) {
            Field.Combo col = (Field.Combo) tf_field15;
            where = where + " and college_id = '" + col.getId() + "' ";
        }

        if (!jCheckBox19.isSelected()) {
            Field.Combo course = (Field.Combo) tf_field20;
            where = where + " and course_id = '" + course.getId() + "' ";
        }
        if (!jCheckBox17.isSelected()) {
            Field.Combo year_level = (Field.Combo) tf_field18;
            where = where + " and year_level like '" + year_level.getText() + "' ";
        }
        if (!jCheckBox18.isSelected()) {
            Field.Combo period = (Field.Combo) tf_field19;
            where = where + " and period like '" + period.getText() + "' ";
        }
        if (jCheckBox7.isSelected()) {
            where = where + " and is_transferee =1 ";
        } else if (jCheckBox8.isSelected()) {
            where = where + " and is_transferee =0 ";
        } else if (jCheckBox13.isSelected()) {
            where = where + " and is_transferee =2 ";
        }
        where = where + " and concat(last_name,space(1),first_name) like '%" + tf_field16.getText() + "%' ";
        where = where + " order by last_name asc ";

        List<Enrollments.to_enrollments> enrollments = Enrollments.ret_data(where);
        loadData_enrollments(enrollments);
        jLabel28.setText("" + enrollments.size());
    }

    private void select_enrollment() {
        int row = tbl_enrollments.getSelectedRow();
        if (row < 0) {
            return;
        }
        int col = tbl_enrollments.getSelectedColumn();
        Enrollments.to_enrollments enroll = (Enrollments.to_enrollments) tbl_enrollments_ALM.get(row);

        if (col == 6) {

            Window p = (Window) this;
            Dlg_dean_student_advice_details nd = Dlg_dean_student_advice_details.create(p, true);
            nd.setTitle("");
            nd.do_pass(enroll, 1);
            nd.setCallback(new Dlg_dean_student_advice_details.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, Dlg_dean_student_advice_details.OutputData data) {
                    closeDialog.ok();
                    ret_enrollments();
                }
            });
            nd.setLocationRelativeTo(null);
            nd.setVisible(true);
        }
        if (col == 10) {
            if (enroll.advised_date != null) {
                Alert.set(0, "Cannot delete record!");
                return;
            }
            Window p = (Window) this;
            Dlg_confirm_delete nd = Dlg_confirm_delete.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_delete.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_delete.OutputData data) {
                    closeDialog.ok();
                    Enrollments.delete_data(enroll);
                    Alert.set(3, "");
                    ret_enrollments();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }

    }

    //Advising 
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
                ret_periods();
                set_period();
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
                ret_enrollments();
            }

        });
    }

    private void init_courses() {
        Field.Input year3 = (Field.Input) tf_field13;
        String where = " where id<>0 ";

        Field.Combo dep = (Field.Combo) tf_field14;
        Field.Combo col = (Field.Combo) tf_field15;

        where = where + " and department_id = '" + dep.getId() + "' ";
        where = where + " and college_id = '" + col.getId() + "' ";

        where = where + " and course_code like '%" + tf_field20.getText() + "%' and academic_year_id='" + year3.getId() + "' and status=1 "
                + " or department_id = '" + dep.getId() + "' and college_id = '" + col.getId() + "' and course_description like '%" + tf_field20.getText() + "%' and academic_year_id='" + year3.getId() + "'  and status=1 "
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
        int[] tbl_widths_customers = {80, tf_field20.getWidth() - 80};
        int width = 0;
        String[] col_names = {"", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup2(tf_field20, obj, labels, tbl_widths_customers, col_names, tf_field20.getWidth());
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Academic_offerings.to_academic_offerings off = offer.get(data.selected_row);
//                no_of_years = off.no_of_years;
//                set_periods();
                Field.Combo cou = (Field.Combo) tf_field20;
                cou.setText(off.course_code + " - " + off.course_description);
                cou.setId("" + off.course_id);
//                ret_data();
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
        int[] tbl_widths_customers = {tf_field18.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field18, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                String to = year_levels.get(data.selected_row);
                tf_field18.setText("" + to);
                ret_enrollments();
            }
        });
    }

    List<String> periods = new ArrayList();
    List<String> periods2 = new ArrayList();

    private void ret_periods() {
        Field.Input year = (Field.Input) tf_field13;
        Field.Combo dep = (Field.Combo) tf_field14;
        String where = " where academic_year_id = '" + year.getId() + "' and department_id='" + dep.getId() + "' ";
        List<Academic_year_periods.to_academic_year_periods> periods1 = Academic_year_periods.ret_data(where);
        if (!periods1.isEmpty()) {
            Academic_year_periods.to_academic_year_periods acad = (Academic_year_periods.to_academic_year_periods) periods1.get(0);
            String per = acad.period;
            periods = Combo.periods(per);
//            System.out.println("" + periods.size());
        }
    }

    private void ret_periods2() {
        Field.Input year = (Field.Input) tf_field13;
        Field.Combo dep = (Field.Combo) tf_field8;
        String where = " where academic_year_id = '" + year.getId() + "' and department_id='" + dep.getId() + "' ";
        List<Academic_year_periods.to_academic_year_periods> periods1 = Academic_year_periods.ret_data(where);
        if (!periods1.isEmpty()) {
            Academic_year_periods.to_academic_year_periods acad = (Academic_year_periods.to_academic_year_periods) periods1.get(0);
            String per = acad.period;
            periods2 = Combo.periods(per);
//            System.out.println("" + periods.size());
        }
    }

    private void init_periods() {
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
        int[] tbl_widths_customers = {tf_field19.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field19, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Academic_year_period_schedules.to_academic_year_period_schedules to = (Academic_year_period_schedules.to_academic_year_period_schedules) acad_schedules.get(data.selected_row);
                tf_field19.setText("" + to.period);
                ret_enrollments();
            }
        });
    }

    private void init_periods2() {
        Field.Combo dep = (Field.Combo) tf_field8;
        acad_schedules2.clear();
        acad_schedules2 = Academic_year_period_schedules.ret_data(" where status=1 and department_id='" + dep.getId() + "'");

        Object[][] obj = new Object[acad_schedules2.size()][1];
        int i = 0;
        for (Academic_year_period_schedules.to_academic_year_period_schedules to : acad_schedules2) {
            obj[i][0] = " " + to.period;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field21.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field21, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Academic_year_period_schedules.to_academic_year_period_schedules to = (Academic_year_period_schedules.to_academic_year_period_schedules) acad_schedules.get(data.selected_row);
                tf_field21.setText("" + to.period);

            }
        });
    }

    List<Academic_year_period_schedules.to_academic_year_period_schedules> acad_schedules = new ArrayList();
    Academic_year_period_schedules.to_academic_year_period_schedules acad_schedule = null;
    List<Academic_year_period_schedules.to_academic_year_period_schedules> acad_schedules2 = new ArrayList();
    Academic_year_period_schedules.to_academic_year_period_schedules acad_schedule2 = null;

    private void set_period() {
        Field.Input sy = (Field.Input) tf_field13;
        Field.Combo dep = (Field.Combo) tf_field14;
        String where2 = "  where academic_year_id='" + sy.getId() + "' and status=1 and department_id='" + dep.getId() + "'";
        acad_schedules = Academic_year_period_schedules.ret_data(where2);

        Field.Combo tf = (Field.Combo) tf_field19;
        if (!acad_schedules.isEmpty()) {
            acad_schedule = acad_schedules.get(0);

            tf.setText(acad_schedule.period);
            tf.setId("" + acad_schedule.id);
        } else {
            tf.setText("");
            tf.setId("");
        }
    }

    private void set_period2() {
        Field.Input sy = (Field.Input) tf_field13;
        Field.Combo dep = (Field.Combo) tf_field8;
        String where2 = "  where academic_year_id='" + sy.getId() + "' and status=1 and department_id='" + dep.getId() + "'";
        acad_schedules2 = Academic_year_period_schedules.ret_data(where2);

        Field.Combo tf = (Field.Combo) tf_field21;
        if (!acad_schedules2.isEmpty()) {
            acad_schedule2 = acad_schedules2.get(0);

            tf.setText(acad_schedule2.period);
            tf.setId("" + acad_schedule2.id);
        } else {
            tf.setText("");
            tf.setId("");
        }
    }
}
