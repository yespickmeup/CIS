/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.deans_portal;

import cis.academic.Academic_offering_subjects;
import cis.academic.Academic_offering_subjects.to_academic_offering_subjects;
import cis.academic.Academic_offerings;
import cis.academic.Academic_years;
import cis.academic.Dlg_academic_offering_subjects;
import cis.academic.Srpt_list_of_programs;
import cis.colleges.Colleges;
import cis.departments.Departments;
import cis.enrollments.Enrollments;
import cis.enrollments.Enrollments.to_enrollments;
import cis.students.Students;
import cis.users.MyUser;
import cis.utils.Alert;
import cis.utils.DateType;
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
        jPanel23 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_enrollments = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel20 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        tf_field12 = new Field.Combo();
        jCheckBox23 = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jButton8 = new Button.Default();
        jPanel16 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        tf_field4 = new Field.Input();
        jLabel17 = new javax.swing.JLabel();
        tf_field10 = new Field.Input();
        tf_field11 = new Field.Combo();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tf_field104 = new Field.Combo();
        tf_field105 = new Field.Combo();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        tf_field106 = new Field.Combo();
        tf_field107 = new Field.Combo();
        jLabel80 = new javax.swing.JLabel();
        jButton3 = new Button.Primary();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel18 = new javax.swing.JPanel();
        jCheckBox17 = new javax.swing.JCheckBox();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jCheckBox20 = new javax.swing.JCheckBox();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jCheckBox21 = new javax.swing.JCheckBox();
        jLabel89 = new javax.swing.JLabel();
        jCheckBox22 = new javax.swing.JCheckBox();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton7 = new Button.Success();
        jPanel15 = new javax.swing.JPanel();
        jButton9 = new Button.Success();
        jLabel66 = new javax.swing.JLabel();
        jButton10 = new Button.Info();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new Button.Info();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new Button.Primary();
        jButton6 = new Button.Info();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        tf_field6 = new Field.Combo();
        jLabel11 = new javax.swing.JLabel();
        tf_field5 = new Field.Combo();
        jLabel8 = new javax.swing.JLabel();
        tf_field2 = new Field.Combo();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_offerings = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel8 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
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
        jPanel10 = new javax.swing.JPanel();

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

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Level/College:");

        buttonGroup2.add(jCheckBox7);
        jCheckBox7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox7.setText("New Student");
        jCheckBox7.setFocusable(false);

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
        jCheckBox10.setSelected(true);
        jCheckBox10.setText("All");
        jCheckBox10.setFocusable(false);

        jCheckBox11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox11.setSelected(true);
        jCheckBox11.setText("All");
        jCheckBox11.setFocusable(false);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_field15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jCheckBox7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tf_field14)))
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
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox10))
                .addGap(1, 1, 1)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addContainerGap())
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
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
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
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Advising", jPanel21);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enroll", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jTabbedPane6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Search:");

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

        buttonGroup1.add(jCheckBox23);
        jCheckBox23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox23.setSelected(true);
        jCheckBox23.setText("New Student");
        jCheckBox23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Status:");

        buttonGroup1.add(jCheckBox24);
        jCheckBox24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox24.setText("Transferee");
        jCheckBox24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        buttonGroup1.add(jCheckBox25);
        jCheckBox25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox25.setText("Returnee");
        jCheckBox25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cis/icons2/registrar.png"))); // NOI18N
        jButton8.setText("View Profile");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_field12, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jCheckBox23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox23)
                        .addComponent(jCheckBox24)
                        .addComponent(jCheckBox25)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Search Student", jPanel20);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("School Year:");

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

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Date Applied:");

        tf_field10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field10.setFocusable(false);
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

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Choose Department:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Choose Level/College:");

        tf_field104.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field104.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field104MouseClicked(evt);
            }
        });
        tf_field104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field104ActionPerformed(evt);
            }
        });

        tf_field105.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field105.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field105MouseClicked(evt);
            }
        });
        tf_field105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field105ActionPerformed(evt);
            }
        });

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel78.setText("Course:");

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel79.setText("Year:");

        tf_field106.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field106.setFocusable(false);
        tf_field106.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field106MouseClicked(evt);
            }
        });
        tf_field106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field106ActionPerformed(evt);
            }
        });

        tf_field107.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field107.setFocusable(false);
        tf_field107.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field107MouseClicked(evt);
            }
        });
        tf_field107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field107ActionPerformed(evt);
            }
        });

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel80.setText("Period:");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Enroll");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(tf_field106, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel80)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field107, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(tf_field4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field10, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tf_field11)
                    .addComponent(tf_field104)
                    .addComponent(tf_field105))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field104, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field105, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field106, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field107, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane6.addTab("Enroll", jPanel16);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Checklist", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jCheckBox17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel81.setText("Form 138 (Senior High School report card) indicating a general average of at least 80%. Applicants to the");

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel82.setText("Nursing and Physical Therapy Programs are required a general average of at least 85%.");

        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel83.setText("Exams");

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel84.setText("(For applicants to the Nursing, Medical Technology and Physical Therapy Programs) Results of the Qualifying");

        jCheckBox18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jCheckBox19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel85.setText("Two statements of good moral character:  (a) one from the previous school attended, and (b) one from a");

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel86.setText("prominent member of the community");

        jCheckBox20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel87.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel87.setText("One passport size or 2″ x 2″ copy of latest picture");

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel88.setText("Official copy of birth certificate issued by the National Statistics Office (NSO)/Philippine Statistics Authority (PSA)");

        jCheckBox21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel89.setText("Physical examination certification issued by a registered physician attesting to the student’s fitness for");

        jCheckBox22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel90.setText("school. The following tests must be done at the Silliman University Medical Center: chest X-ray, dental");

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel91.setText("and CBC (complete blood count). Those who are unable to undergo these tests during the enrollment");

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel92.setText("period may undertake them within the first week of class.");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jCheckBox19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel85)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jCheckBox17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jCheckBox20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel87))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jCheckBox18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel84)))
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                                .addComponent(jCheckBox21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                                .addComponent(jCheckBox22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox17, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox18, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jCheckBox19, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox20, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox21, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox22, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane3.setViewportView(jPanel18);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane6.addTab("Requirements", jPanel17);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTable3);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setText("Approve");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane6.addTab("Approval", jPanel13);

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton9.setText("Generate Student No");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("000000000000");
        jLabel66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton10.setText("Print Student ID");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Student No", jPanel15);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Subjects Loaded", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTable2);

        jLabel1.setText("No. of rows:");

        jLabel2.setText("0");

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Print Preview");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 102, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Subject Offerings", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jTable1);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Add All");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText("Print Preview");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane6)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Admission", jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
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
            .addGap(0, 973, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Print Preview", jPanel8);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane3)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_field5)
                            .addComponent(tf_field6)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );

        jTabbedPane2.addTab("New/Transfer Student", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Returning", jPanel6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Advising", jPanel2);

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

        tf_field7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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

        tf_field9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
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
            .addGap(0, 306, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("Print Preview", jPanel12);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field9))
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
                            .addComponent(tf_field8)
                            .addComponent(tf_field7))))
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
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
            .addGap(0, 476, Short.MAX_VALUE)
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

    private void tf_field6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field6MouseClicked
        init_colleges2();
    }//GEN-LAST:event_tf_field6MouseClicked

    private void tf_field6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field6ActionPerformed
        init_colleges2();
    }//GEN-LAST:event_tf_field6ActionPerformed

    private void tf_field5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field5MouseClicked
        init_departments2();
    }//GEN-LAST:event_tf_field5MouseClicked

    private void tf_field5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field5ActionPerformed
        init_departments2();
    }//GEN-LAST:event_tf_field5ActionPerformed

    private void tf_field2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field2MouseClicked
//        init_groups();
    }//GEN-LAST:event_tf_field2MouseClicked

    private void tf_field2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field2ActionPerformed
//        init_groups();
    }//GEN-LAST:event_tf_field2ActionPerformed

    private void tbl_offeringsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_offeringsMouseClicked
        select_offering();
    }//GEN-LAST:event_tbl_offeringsMouseClicked

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

    private void tf_field4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field4MouseClicked
        //        init_groups();
    }//GEN-LAST:event_tf_field4MouseClicked

    private void tf_field4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field4ActionPerformed
        //        init_groups();
    }//GEN-LAST:event_tf_field4ActionPerformed

    private void tf_field10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field10MouseClicked

    private void tf_field10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field10ActionPerformed

    private void tf_field11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field11MouseClicked
        //        init_departments();
    }//GEN-LAST:event_tf_field11MouseClicked

    private void tf_field11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field11ActionPerformed
        //        init_departments();
    }//GEN-LAST:event_tf_field11ActionPerformed

    private void tf_field104MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field104MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field104MouseClicked

    private void tf_field104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field104ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field104ActionPerformed

    private void tf_field105MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field105MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field105MouseClicked

    private void tf_field105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field105ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field105ActionPerformed

    private void tf_field106MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field106MouseClicked
        //        init_years();
    }//GEN-LAST:event_tf_field106MouseClicked

    private void tf_field106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field106ActionPerformed
        //        init_years();
    }//GEN-LAST:event_tf_field106ActionPerformed

    private void tf_field107MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field107MouseClicked
        //        init_period();
    }//GEN-LAST:event_tf_field107MouseClicked

    private void tf_field107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field107ActionPerformed
        //        init_period();
    }//GEN-LAST:event_tf_field107ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //        save_application();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tf_field12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field12MouseClicked
        init_students();
    }//GEN-LAST:event_tf_field12MouseClicked

    private void tf_field12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field12ActionPerformed
        init_students();
    }//GEN-LAST:event_tf_field12ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        view_profile();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void tf_field13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field13MouseClicked

    private void tf_field13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field13ActionPerformed

    private void tf_field14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field14MouseClicked

    private void tf_field14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field14ActionPerformed

    private void tf_field15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field15MouseClicked

    private void tf_field15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field15ActionPerformed

    private void tf_field16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field16MouseClicked

    private void tf_field16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field16ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        ret_enrollments();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void tbl_enrollmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_enrollmentsMouseClicked
        select_enrollment();
    }//GEN-LAST:event_tbl_enrollmentsMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable tbl_academic_offering_subjects;
    private javax.swing.JTable tbl_enrollments;
    private javax.swing.JTable tbl_offerings;
    private javax.swing.JTextField tf_field10;
    private javax.swing.JTextField tf_field104;
    private javax.swing.JTextField tf_field105;
    private javax.swing.JTextField tf_field106;
    private javax.swing.JTextField tf_field107;
    private javax.swing.JTextField tf_field11;
    private javax.swing.JTextField tf_field12;
    private javax.swing.JTextField tf_field13;
    private javax.swing.JTextField tf_field14;
    private javax.swing.JTextField tf_field15;
    private javax.swing.JTextField tf_field16;
    private javax.swing.JTextField tf_field2;
    private javax.swing.JTextField tf_field3;
    private javax.swing.JTextField tf_field4;
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
        acad_years = Academic_years.ret_data("");
        if (!acad_years.isEmpty()) {
            for (Academic_years.to_academic_years to1 : acad_years) {
                if (to1.status == 1) {
                    Field.Combo year = (Field.Combo) tf_field2;
                    Field.Combo year2 = (Field.Combo) tf_field3;
                    year.setText(to1.years);
                    year.setId("" + to1.id);
                    year2.setText(to1.years);
                    year2.setId("" + to1.id);
                    break;
                }
            }
        }

        deps = Departments.ret_data(" order by department_name  asc ");
        init_tbl_offerings(tbl_offerings);
        init_tbl_academic_offering_subjects(tbl_academic_offering_subjects);
        init_tbl_enrollments(tbl_enrollments);
    }

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
        int[] tbl_widths_academic_offering_subjects = {70, 100, 40, 40, 150, 140, 70, 140, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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

    public static void loadData_academic_offering_subjects(List<to_academic_offering_subjects> acc) {
        tbl_academic_offering_subjects_ALM.clear();
        tbl_academic_offering_subjects_ALM.addAll(acc);
    }

    public static class Tblacademic_offering_subjectsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Code", "Description", "Lec", "Lab", "Prerequisites", "Instructor", "Room", "Time", "department_id", "department", "course_id", "course_code", "course_description", "term", "year_level", "subject_id", "subject_code", "description", "units", "lecture_units", "lab_units", "amount", "is_lab", "max_students", "prerequisite_subject_ids", "subject_group", "subject_group_id", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded", "faculty_id", "faculty_name", "room", "schedule", "room_id"
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
            to_academic_offering_subjects tt = (to_academic_offering_subjects) getRow(row);
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

        String where = " where academic_offering_id='" + cou.getId() + "' "
                + "   order by course_description asc ";
        List<to_academic_offering_subjects> subjects = Academic_offering_subjects.ret_data_with_prerequisites(where);
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
        to_academic_offering_subjects to = (to_academic_offering_subjects) tbl_academic_offering_subjects_ALM.get(row);
        if (col == 5) {//faculty
            Window p = (Window) this;
            Dlg_dean_portal_add_section nd = Dlg_dean_portal_add_section.create(p, true);
            nd.setTitle("");
            nd.do_pass(to);
            nd.setCallback(new Dlg_dean_portal_add_section.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, Dlg_dean_portal_add_section.OutputData data) {
                    closeDialog.ok();
                    Academic_offering_subjects.update_faculty(to.id, data.faculty_id, data.faculty_name);
                    ret_subjects();
                    Alert.set(2, "");
                }

                @Override
                public void remove(CloseDialog closeDialog) {
                    closeDialog.ok();
                    Academic_offering_subjects.update_faculty_remove(to.id);
                    ret_subjects();
                    Alert.set(2, "");
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 6) {//room

        }
        if (col == 7) {//time

        }
    }

    List<Students.to_students> students = new ArrayList();

    private void init_students() {

        String where = " where concat(first_name,space(1),last_name) like '%" + tf_field12.getText() + "%'  "
                + " or concat(last_name,space(1),first_name) like '%" + tf_field12.getText() + "%' order by last_name asc";

        students = Students.ret_data(where);
        Object[][] obj = new Object[students.size()][1];
        int i = 0;
        for (Students.to_students to : students) {
            obj[i][0] = " " + to.first_name + " " + to.middle_name + " " + to.last_name;
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
                Students.to_students to = students.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field12;
                co.setText("" + to.first_name + " " + to.middle_name + " " + to.last_name);
                co.setId("" + to.id);

            }
        });
    }

    private void view_profile() {
        Field.Combo tf = (Field.Combo) tf_field12;
        int id = FitIn.toInt(tf.getId());
        if (id == 0) {
            Alert.set(0, "Please select student");
            tf_field12.grabFocus();
            return;
        }
        Window p = (Window) this;
        Dlg_dean_student_advice_details nd = Dlg_dean_student_advice_details.create(p, true);
        nd.setTitle("");
//        nd.do_pass(id);
        nd.setCallback(new Dlg_dean_student_advice_details.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_dean_student_advice_details.OutputData data) {
                closeDialog.ok();

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
        int[] tbl_widths_enrollments = {100, 60, 120, 140, 80, 60, 70, 70, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_enrollments.length; i < n; i++) {
            if (i == 0 || i == 2) {
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
        tbl_enrollments.getColumnModel().getColumn(5).setCellRenderer(new ImageRenderer());
        tbl_enrollments.getColumnModel().getColumn(6).setCellRenderer(new ImageRenderer());
        tbl_enrollments.getColumnModel().getColumn(7).setCellRenderer(new ImageRenderer());

    }

    public static void loadData_enrollments(List<to_enrollments> acc) {
        tbl_enrollments_ALM.clear();
        tbl_enrollments_ALM.addAll(acc);
    }

    public static class TblenrollmentsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Name", "Gender", "Address", "Date Added", "Birthdate", "Advised", "Assessed", "Approved", "course_description", "term", "encoded_by_id", "encoded_by", "encoded_date", "assessed_by_id", "assessed_by", "assessed_date", "advised_by_id", "advised_by", "advised_date", "approved_by_id", "approved_by", "approved_date", "student_no", "last_name", "first_name", "middle_name", "nick_name", "current_address", "permanent_address", "email_address", "postal_code", "tel_no", "mobile_no", "date_of_birth", "place_of_birth", "age", "gender", "citizenship", "religion", "civil_status", "spouse_name", "date_of_communion", "date_of_confirmation", "is_right_handed", "is_indigenous", "indigenous_name", "level_id", "level", "college_id", "college", "department_id", "department", "year_level", "year_level_status", "preferred_course1", "preferred_course2", "preferred_course3", "father_name", "father_citizenship", "father_home_address", "father_email_address", "father_mobile_no", "father_occupation", "father_employer", "father_business_address", "father_business_tel_no", "father_educational_attainment", "father_last_school_attended", "mother_name", "mother_citizenship", "mother_home_address", "mother_email_address", "mother_mobile_no", "mother_occupation", "mother_employer", "mother_business_address", "mother_business_tel_no", "mother_educational_attainment", "mother_last_school_attended", "guardian_name", "guardian_mailing_address", "guardian_telephone_no", "grade_school_name", "grade_school_region", "grade_school_school_year", "grade_school_awards", "high_school_name", "high_school_region", "high_school_school_year", "high_school_awards", "college_school_name", "college_school_region", "college_school_school_year", "college_awards", "junior_high_name", "junior_high_region", "junior_high_year", "junior_high_awards", "tesda_name", "tesda_region", "tesda_year", "tesda_awards", "sibling1", "sibling2", "sibling3", "sibling4", "sibling5", "sibling6", "sibling7", "sibling8", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded"
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
                    return " " + tt.last_name + ", " + tt.first_name + " " + tt.middle_name;
                case 1:
                    if (tt.gender == 0) {
                        return " Female";
                    } else {
                        return " Male";
                    }
                case 2:
                    return " " + tt.permanent_address;
                case 3:
                    return " " + DateType.convert_slash_datetime3(tt.created_at);
                case 4:
                    return " " + DateType.convert_slash_datetime2(tt.date_of_birth);
                case 5:
                    if (tt.advised_date == null) {
                        return "/cis/icons2/quit.png";

                    } else {
                        return "/cis/icons2/quit.png";
                    }

                case 6:
                    if (tt.assessed_date == null) {
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
        Window p = (Window) this;
        Dlg_dean_student_advice_details nd = Dlg_dean_student_advice_details.create(p, true);
        nd.setTitle("");
        nd.do_pass(enroll);
        nd.setCallback(new Dlg_dean_student_advice_details.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_dean_student_advice_details.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

}
