/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.finance;

import cis.academic.Academic_offerings;
import cis.academic.Academic_year_fees;
import cis.academic.Academic_years;
import cis.colleges.Colleges;
import cis.courses.Courses;
import cis.departments.Departments;
import cis.enrollments.Enrollment_student_loaded_subjects;
import cis.enrollments.Enrollments;
import cis.users.MyUser;
import cis.utils.Alert;
import cis.utils.DateType;
import cis.utils.Dlg_confirm_action;
import cis.utils.TableRenderer;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.JasperUtil;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.util.ImageRenderer;

/**
 *
 * @author Ronescape
 */
public class Dlg_finance extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_finance
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
    private Dlg_finance(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_finance(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_finance() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_finance myRef;

    private void setThisRef(Dlg_finance myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_finance> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_finance create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_finance create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_finance dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_finance((java.awt.Frame) parent, false);
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
            Dlg_finance dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_finance((java.awt.Dialog) parent, false);
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

        Dlg_finance dialog = Dlg_finance.create(new javax.swing.JFrame(), true);
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
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        tf_field23 = new Field.Search();
        jLabel43 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel44 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        tf_field5 = new Field.Input();
        jLabel13 = new javax.swing.JLabel();
        tf_field6 = new Field.Input();
        jLabel14 = new javax.swing.JLabel();
        tf_field7 = new Field.Input();
        jLabel15 = new javax.swing.JLabel();
        tf_field8 = new Field.Input();
        jPanel12 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        tf_field131 = new Field.Input();
        jLabel77 = new javax.swing.JLabel();
        tf_field132 = new Field.Input();
        jLabel75 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tf_field130 = new javax.swing.JTextArea();
        jLabel73 = new javax.swing.JLabel();
        tf_field125 = new Field.Input();
        jLabel74 = new javax.swing.JLabel();
        tf_field126 = new Field.Input();
        jLabel79 = new javax.swing.JLabel();
        tf_field128 = new Field.Input();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        tf_field133 = new Field.Input();
        tf_field134 = new Field.Input();
        jLabel83 = new javax.swing.JLabel();
        tf_field135 = new Field.Input();
        jPanel16 = new javax.swing.JPanel();
        jButton3 = new Button.Primary();
        jLabel80 = new javax.swing.JLabel();
        tf_field129 = new Field.Combo();
        jButton4 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton5 = new Button.Info();
        jPanel18 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        tf_field18 = new Field.Input();
        jLabel34 = new javax.swing.JLabel();
        tf_field19 = new Field.Input();
        jButton15 = new Button.Success();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_miscellaneous_fees = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        tf_field20 = new Field.Input();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_other_fees = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
        tf_field21 = new Field.Input();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        tf_field14 = new Field.Input();
        tf_field15 = new Field.Combo();
        jLabel32 = new javax.swing.JLabel();
        tf_field17 = new Field.Combo();
        jLabel30 = new javax.swing.JLabel();
        tf_field16 = new Field.Combo();
        jLabel31 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        tf_field22 = new Field.Combo();
        jPanel8 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("Search:");

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

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("Filter:");

        buttonGroup1.add(jCheckBox2);
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setSelected(true);
        jCheckBox2.setText("New Student");

        buttonGroup1.add(jCheckBox3);
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setText("Transfer Student");
        jCheckBox3.setEnabled(false);

        buttonGroup1.add(jCheckBox4);
        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox4.setText("Returning Student");
        jCheckBox4.setEnabled(false);

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("Search by:");

        buttonGroup2.add(jCheckBox5);
        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox5.setText("Student No");

        buttonGroup2.add(jCheckBox6);
        jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox6.setSelected(true);
        jCheckBox6.setText("Name");

        buttonGroup2.add(jCheckBox7);
        jCheckBox7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox7.setText("Enrollment No");

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel13.setOpaque(false);
        jPanel13.setPreferredSize(new java.awt.Dimension(154, 120));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cis/icons2/user.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel14.setOpaque(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("First Name:");

        tf_field5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field5.setFocusable(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Middle Name:");

        tf_field6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field6.setFocusable(false);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Last Name:");

        tf_field7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field7.setFocusable(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Student No.:");

        tf_field8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field8.setFocusable(false);
        tf_field8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_field6)
                    .addComponent(tf_field7)
                    .addComponent(tf_field5)
                    .addComponent(tf_field8))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

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

        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setFocusable(false);

        tf_field130.setColumns(20);
        tf_field130.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_field130.setLineWrap(true);
        tf_field130.setRows(5);
        tf_field130.setFocusable(false);
        jScrollPane3.setViewportView(tf_field130);

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

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel81.setText("Enrollment #:");

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel82.setText("Approved by:");

        tf_field133.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field133.setFocusable(false);
        tf_field133.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field133MouseClicked(evt);
            }
        });
        tf_field133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field133ActionPerformed(evt);
            }
        });

        tf_field134.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field134.setFocusable(false);
        tf_field134.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field134MouseClicked(evt);
            }
        });
        tf_field134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field134ActionPerformed(evt);
            }
        });

        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel83.setText("Advised by:");

        tf_field135.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field135.setFocusable(false);
        tf_field135.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field135MouseClicked(evt);
            }
        });
        tf_field135.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field135ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel83, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel82, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_field133, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_field126, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_field125, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                                .addComponent(tf_field131, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_field132))
                            .addComponent(tf_field128)
                            .addComponent(tf_field134, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tf_field135))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field131, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field132, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field125, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field126, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field128, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field133, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field135, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field134, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mode of Payment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Create Assessment");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel80.setText("Choose:");

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

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cis/icons/cog.png"))); // NOI18N
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel80)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field129)
                        .addGap(0, 0, 0)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field129, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox4))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(tf_field23))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jCheckBox5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox2)
                        .addComponent(jCheckBox3)
                        .addComponent(jCheckBox4)))
                .addGap(1, 1, 1)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7))
                .addGap(1, 1, 1)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Assessment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setMinimumSize(new java.awt.Dimension(626, 0));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel5.setText("Status:");

        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jButton5.setText("Print Assessment");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );

        jTabbedPane1.addTab("Assessment", jPanel9);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1224, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Payment", jPanel18);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tuition Fee", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Fixed Amount:");

        tf_field18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field18.setText("0.00");
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

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Per Unit:");

        tf_field19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field19.setText("0.00");
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

        jButton15.setText("Save");
        jButton15.setToolTipText("Save");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field18, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(tf_field19, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(tf_field18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_field19, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Miscellaneous Fees", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tbl_miscellaneous_fees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_miscellaneous_fees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_miscellaneous_feesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_miscellaneous_fees);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Total Amount:");

        tf_field20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tf_field20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tf_field20.setText("0.00");
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

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("No. of rows:");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("0");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cis/icons/cog.png"))); // NOI18N
        jButton1.setText("Settings");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field20, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Other School Fees", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tbl_other_fees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_other_fees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_other_feesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_other_fees);

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Total Amount:");

        tf_field21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tf_field21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tf_field21.setText("0.00");
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

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("0");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("No. of rows:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cis/icons/cog.png"))); // NOI18N
        jButton2.setText("Settings");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field21, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

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

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Period:");

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

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Department:");

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

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Year/Course:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("School Year:");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("Level/College:");

        tf_field22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field22.setFocusable(false);
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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field17, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field16, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field15, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field14, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field22, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        jTabbedPane2.addTab("Fees", jPanel3);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1013, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Print Preview", jPanel8);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jTabbedPane2)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Maintenance", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void tf_field14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field14MouseClicked

    private void tf_field14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field14ActionPerformed

    private void tf_field15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field15MouseClicked
        init_departments();
    }//GEN-LAST:event_tf_field15MouseClicked

    private void tf_field15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field15ActionPerformed
        init_departments();
    }//GEN-LAST:event_tf_field15ActionPerformed

    private void tf_field16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field16MouseClicked
        init_colleges();
    }//GEN-LAST:event_tf_field16MouseClicked

    private void tf_field16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field16ActionPerformed
        init_colleges();
    }//GEN-LAST:event_tf_field16ActionPerformed

    private void tf_field17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field17MouseClicked
        init_years2();
    }//GEN-LAST:event_tf_field17MouseClicked

    private void tf_field17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field17ActionPerformed
        init_years2();
    }//GEN-LAST:event_tf_field17ActionPerformed

    private void tf_field18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field18MouseClicked

    private void tf_field18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field18ActionPerformed

    private void tf_field19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field19MouseClicked

    private void tf_field19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field19ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        save_tuition_fee();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void tf_field20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field20MouseClicked

    private void tf_field20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field20ActionPerformed

    private void tf_field21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field21MouseClicked

    private void tf_field21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field21ActionPerformed

    private void tf_field22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field22MouseClicked
        init_colleges3();
    }//GEN-LAST:event_tf_field22MouseClicked

    private void tf_field22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field22ActionPerformed
        init_colleges3();
    }//GEN-LAST:event_tf_field22ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        miscellaneous();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        other_fees();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbl_miscellaneous_feesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_miscellaneous_feesMouseClicked
        select_miscellaneous();
    }//GEN-LAST:event_tbl_miscellaneous_feesMouseClicked

    private void tbl_other_feesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_other_feesMouseClicked
        select_other_fees();
    }//GEN-LAST:event_tbl_other_feesMouseClicked

    private void tf_field23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field23MouseClicked
        init_students();
    }//GEN-LAST:event_tf_field23MouseClicked

    private void tf_field23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field23ActionPerformed
        init_students();
    }//GEN-LAST:event_tf_field23ActionPerformed

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

    private void tf_field129MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field129MouseClicked
        init_mode_of_payments();
    }//GEN-LAST:event_tf_field129MouseClicked

    private void tf_field129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field129ActionPerformed
        init_mode_of_payments();
    }//GEN-LAST:event_tf_field129ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        mode_of_payments();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tf_field133MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field133MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field133MouseClicked

    private void tf_field133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field133ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field133ActionPerformed

    private void tf_field134MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field134MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field134MouseClicked

    private void tf_field134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field134ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field134ActionPerformed

    private void tf_field135MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field135MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field135MouseClicked

    private void tf_field135ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field135ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field135ActionPerformed

    private void tf_field8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        save_assessment();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        print_assessment();
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel29;
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
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tbl_miscellaneous_fees;
    private javax.swing.JTable tbl_other_fees;
    private javax.swing.JTextField tf_field125;
    private javax.swing.JTextField tf_field126;
    private javax.swing.JTextField tf_field128;
    private javax.swing.JTextField tf_field129;
    private javax.swing.JTextArea tf_field130;
    private javax.swing.JTextField tf_field131;
    private javax.swing.JTextField tf_field132;
    private javax.swing.JTextField tf_field133;
    private javax.swing.JTextField tf_field134;
    private javax.swing.JTextField tf_field135;
    private javax.swing.JTextField tf_field14;
    private javax.swing.JTextField tf_field15;
    private javax.swing.JTextField tf_field16;
    private javax.swing.JTextField tf_field17;
    private javax.swing.JTextField tf_field18;
    private javax.swing.JTextField tf_field19;
    private javax.swing.JTextField tf_field20;
    private javax.swing.JTextField tf_field21;
    private javax.swing.JTextField tf_field22;
    private javax.swing.JTextField tf_field23;
    private javax.swing.JTextField tf_field5;
    private javax.swing.JTextField tf_field6;
    private javax.swing.JTextField tf_field7;
    private javax.swing.JTextField tf_field8;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();

//        System.setProperty("pool_db", "db_cis_cosca");
//        System.setProperty("pool_password", "password");
        deps = Departments.ret_data(" order by department_name  asc ");

        acad_years = Academic_years.ret_data(" where status=1 ");
        if (!acad_years.isEmpty()) {
            for (Academic_years.to_academic_years to1 : acad_years) {
                Field.Input year = (Field.Input) tf_field14;
                year.setText(to1.years);
                year.setId("" + to1.id);
                academic_year_id = to1.id;
            }
        }
        ret_mode_of_payments();
        init_tbl_miscellaneous_fees(tbl_miscellaneous_fees);
        init_tbl_other_fees(tbl_other_fees);
        jButton3.setEnabled(false);
    }

    int academic_year_id = 0;
    List<Academic_years.to_academic_years> acad_years = new ArrayList();
    List<Departments.to_departments> deps = new ArrayList();

    private void ret_mode_of_payments() {
        modes = Mode_of_payments.ret_data("");
        if (!modes.isEmpty()) {
            Mode_of_payments.to_mode_of_payments to = (Mode_of_payments.to_mode_of_payments) modes.get(0);
            Field.Combo mo = (Field.Combo) tf_field129;
            mo.setText(to.mode);
            mo.setId("" + to.nos);
        }
    }

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

    List<Colleges.to_colleges> colleges2 = new ArrayList();

    private void init_departments() {
        list_period.clear();
        Object[][] obj = new Object[deps.size()][1];
        int i = 0;
        for (Departments.to_departments to : deps) {
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
                Departments.to_departments to = deps.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field15;
                co.setText("" + to.department_name);
                co.setId("" + to.id);
                colleges2 = Colleges.ret_data(" where department_id='" + co.getId() + "' ");
                Field.Combo co1 = (Field.Combo) tf_field22;
                if (!colleges2.isEmpty()) {
                    Colleges.to_colleges c = (Colleges.to_colleges) colleges2.get(0);
                    co1.setText("" + c.college_name);
                    co1.setId("" + c.id);
                } else {
                    co1.setText("");
                    co1.setId("");
                }

                Field.Combo ye = (Field.Combo) tf_field16;
                ye.setId("");
                ye.setText("");
                Field.Combo pe = (Field.Combo) tf_field17;
                pe.setId("");
                pe.setText("");

                tbl_miscellaneous_fees_ALM.clear();
                tbl_other_fees_ALM.clear();
                tf_field20.setText("0.00");
                jLabel37.setText("0");
                tf_field21.setText("0.00");
                jLabel39.setText("0");

                Field.Input amount = (Field.Input) tf_field18;
                Field.Input per_unit = (Field.Input) tf_field19;
                amount.setText("0.00");
                amount.setId("0");
                per_unit.setText("0.00");
            }
        });
    }
    List<String> list_year2 = new ArrayList();
    List<String> list_period = new ArrayList();
    List<String> list_year = new ArrayList();

    private void init_colleges3() {

        Object[][] obj = new Object[colleges2.size()][1];
        int i = 0;
        for (Colleges.to_colleges to : colleges2) {
            obj[i][0] = " " + to.college_name;
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
                Colleges.to_colleges to = colleges2.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field22;
                co.setText("" + to.college_name);
                co.setId("" + to.id);

                Field.Combo year = (Field.Combo) tf_field16;
                Field.Combo per = (Field.Combo) tf_field17;
                year.setText("");
                year.setId("");
                per.setText("");
                per.setId("");
                tbl_miscellaneous_fees_ALM.clear();
                tbl_other_fees_ALM.clear();
                tf_field20.setText("0.00");
                jLabel37.setText("0");
                tf_field21.setText("0.00");
                jLabel39.setText("0");

                Field.Input amount = (Field.Input) tf_field18;
                Field.Input per_unit = (Field.Input) tf_field19;
                amount.setText("0.00");
                amount.setId("0");
                per_unit.setText("0.00");
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
        int[] tbl_widths_customers = {tf_field17.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field17, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                String to = list_year2.get(data.selected_row);
                tf_field17.setText("" + to);

                ret_data();
                ret_data_other_fees();
                ret_tuition_fee();
            }
        });
    }

    private void init_colleges() {
        list_year2.clear();
        String where = " where id<>0 ";

        Field.Combo dep = (Field.Combo) tf_field15;
        where = where + " and department_id='" + dep.getId() + "' ";

        Field.Combo col = (Field.Combo) tf_field22;
        where = where + " and college_id='" + col.getId() + "' ";

        List<Courses.to_courses> courses = Courses.ret_data(where);
        Object[][] obj = new Object[courses.size()][3];
        int i = 0;
        for (Courses.to_courses to : courses) {
            obj[i][0] = " " + to.course_code;
            obj[i][1] = " " + to.course_description;
            obj[i][2] = " " + to.no_of_years;

            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {80, 250, 60};
        int width = 0;
        String[] col_names = {"", "", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup2(tf_field16, obj, labels, tbl_widths_customers, col_names, 390);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Courses.to_courses to = courses.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field16;
                co.setText("" + to.course_description);
                co.setId("" + to.id);

                String[] year = {"First Year", "Second Year", "Third Year", "Fourt Year", "Fifth Year", "Sixth Year"};
                for (int i = 0; i < to.no_of_years; i++) {
                    list_year2.add(year[i]);
                }
                tf_field17.setText(year[0]);
                ret_data();
                ret_data_other_fees();
                ret_tuition_fee();
            }

        });
    }

    //<editor-fold defaultstate="collapsed" desc=" miscellaneous_fees "> 
    public static ArrayListModel tbl_miscellaneous_fees_ALM;
    public static Tblmiscellaneous_feesModel tbl_miscellaneous_fees_M;

    public static void init_tbl_miscellaneous_fees(JTable tbl_miscellaneous_fees) {
        tbl_miscellaneous_fees_ALM = new ArrayListModel();
        tbl_miscellaneous_fees_M = new Tblmiscellaneous_feesModel(tbl_miscellaneous_fees_ALM);
        tbl_miscellaneous_fees.setModel(tbl_miscellaneous_fees_M);
        tbl_miscellaneous_fees.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_miscellaneous_fees.setRowHeight(25);
        int[] tbl_widths_miscellaneous_fees = {100, 80, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_miscellaneous_fees.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_miscellaneous_fees, i, tbl_widths_miscellaneous_fees[i]);
        }
        Dimension d = tbl_miscellaneous_fees.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_miscellaneous_fees.getTableHeader().setPreferredSize(d);
        tbl_miscellaneous_fees.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_miscellaneous_fees.setRowHeight(25);
        tbl_miscellaneous_fees.setFont(new java.awt.Font("Arial", 0, 12));
        TableWidthUtilities.setColumnRightRenderer(tbl_miscellaneous_fees, 1);
        tbl_miscellaneous_fees.getColumnModel().getColumn(2).setCellRenderer(new ImageRenderer());
        tbl_miscellaneous_fees.getColumnModel().getColumn(3).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_miscellaneous_fees(List<Academic_year_fees.to_academic_year_fees> acc) {
        tbl_miscellaneous_fees_ALM.clear();
        tbl_miscellaneous_fees_ALM.addAll(acc);
    }

    public static class Tblmiscellaneous_feesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Miscellaneous:", "Amount", "", "", "updated_at", "created_by", "updated_by", "status", "is_uploaded"
        };

        public Tblmiscellaneous_feesModel(ListModel listmodel) {
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
            Academic_year_fees.to_academic_year_fees tt = (Academic_year_fees.to_academic_year_fees) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.fee;
                case 1:
                    return FitIn.fmt_wc_0(tt.amount) + " ";
                case 2:
                    return "/cis/icons/new-file.png";
                case 3:
                    return "/cis/icons/remove11.png";
                case 4:
                    return tt.updated_at;
                case 5:
                    return tt.created_by;
                case 6:
                    return tt.updated_by;
                case 7:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }

    //<editor-fold defaultstate="collapsed" desc=" other_fees "> 
    public static ArrayListModel tbl_other_fees_ALM;
    public static Tblother_feesModel tbl_other_fees_M;

    public static void init_tbl_other_fees(JTable tbl_other_fees) {
        tbl_other_fees_ALM = new ArrayListModel();
        tbl_other_fees_M = new Tblother_feesModel(tbl_other_fees_ALM);
        tbl_other_fees.setModel(tbl_other_fees_M);
        tbl_other_fees.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_other_fees.setRowHeight(25);
        int[] tbl_widths_other_fees = {100, 80, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_other_fees.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_other_fees, i, tbl_widths_other_fees[i]);
        }
        Dimension d = tbl_other_fees.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_other_fees.getTableHeader().setPreferredSize(d);
        tbl_other_fees.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_other_fees.setRowHeight(25);
        tbl_other_fees.setFont(new java.awt.Font("Arial", 0, 12));
        TableWidthUtilities.setColumnRightRenderer(tbl_other_fees, 1);
        tbl_other_fees.getColumnModel().getColumn(2).setCellRenderer(new ImageRenderer());
        tbl_other_fees.getColumnModel().getColumn(3).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_other_fees(List<Academic_year_fees.to_academic_year_fees> acc) {
        tbl_other_fees_ALM.clear();
        tbl_other_fees_ALM.addAll(acc);
    }

    public static class Tblother_feesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Miscellaneous:", "Amount", "", "", "updated_at", "created_by", "updated_by", "status", "is_uploaded"
        };

        public Tblother_feesModel(ListModel listmodel) {
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
            Academic_year_fees.to_academic_year_fees tt = (Academic_year_fees.to_academic_year_fees) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.fee;
                case 1:
                    return FitIn.fmt_wc_0(tt.amount) + " ";
                case 2:
                    return "/cis/icons/new-file.png";
                case 3:
                    return "/cis/icons/remove11.png";
                case 4:
                    return tt.updated_at;
                case 5:
                    return tt.created_by;
                case 6:
                    return tt.updated_by;
                case 7:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }

    private void ret_data() {
        Field.Input acad = (Field.Input) tf_field14;
        Field.Combo dep = (Field.Combo) tf_field15;
        Field.Combo lev = (Field.Combo) tf_field22;
        Field.Combo year = (Field.Combo) tf_field16;
        Field.Combo per = (Field.Combo) tf_field17;

        String where = " where id<>0 ";
        where = where + " and academic_year_id='" + acad.getId() + "' "
                + " and department_id='" + dep.getId() + "' "
                + " and level_id='" + lev.getId() + "' "
                + " and course_id='" + year.getId() + "' "
                + " and period like '" + per.getText() + "' "
                + " and group_id=1 ";

        List<Academic_year_fees.to_academic_year_fees> datas = Miscellaneous_fees.ret_data2(where);
        loadData_miscellaneous_fees(datas);

        double amount = 0;
        for (Academic_year_fees.to_academic_year_fees to : datas) {
            amount += to.amount;
        }
        tf_field20.setText(FitIn.fmt_wc_0(amount));
        jLabel37.setText("" + datas.size());
    }

    private void ret_data_other_fees() {
        Field.Input acad = (Field.Input) tf_field14;
        Field.Combo dep = (Field.Combo) tf_field15;
        Field.Combo lev = (Field.Combo) tf_field22;
        Field.Combo year = (Field.Combo) tf_field16;
        Field.Combo per = (Field.Combo) tf_field17;

        String where = " where id<>0 ";
        where = where + " and academic_year_id='" + acad.getId() + "' "
                + " and department_id='" + dep.getId() + "' "
                + " and level_id='" + lev.getId() + "' "
                + " and course_id='" + year.getId() + "' "
                + " and period like '" + per.getText() + "' "
                + " and group_id=2 ";
        List<Academic_year_fees.to_academic_year_fees> datas = Miscellaneous_fees.ret_data3(where);
        loadData_other_fees(datas);

        double amount = 0;
        for (Academic_year_fees.to_academic_year_fees to : datas) {
            amount += to.amount;
        }
        tf_field21.setText(FitIn.fmt_wc_0(amount));
        jLabel39.setText("" + datas.size());
    }

    private void miscellaneous() {
        Window p = (Window) this;
        Dlg_miscellaneous_fees nd = Dlg_miscellaneous_fees.create(p, true);
        nd.setTitle("");
//        nd.do_pass(services);
        nd.setCallback(new Dlg_miscellaneous_fees.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_miscellaneous_fees.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void other_fees() {
        Window p = (Window) this;
        Dlg_other_school_fees nd = Dlg_other_school_fees.create(p, true);
        nd.setTitle("");
//        nd.do_pass(services);
        nd.setCallback(new Dlg_other_school_fees.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_other_school_fees.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void select_miscellaneous() {
        int row = tbl_miscellaneous_fees.getSelectedRow();
        if (row < 0) {
            return;
        }
        Academic_year_fees.to_academic_year_fees to = (Academic_year_fees.to_academic_year_fees) tbl_miscellaneous_fees_ALM.get(row);

        int col = tbl_miscellaneous_fees.getSelectedColumn();
        if (col == 1) {
            Window p = (Window) this;
            Dlg_fee_amount nd = Dlg_fee_amount.create(p, true);
            nd.setTitle("");
            nd.do_pass(to.fee, to.amount);
            nd.setCallback(new Dlg_fee_amount.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_fee_amount.OutputData data) {
                    closeDialog.ok();

                    Field.Input acad = (Field.Input) tf_field14;
                    Field.Combo dep = (Field.Combo) tf_field15;
                    Field.Combo lev = (Field.Combo) tf_field22;
                    Field.Combo year = (Field.Combo) tf_field16;
                    Field.Combo per = (Field.Combo) tf_field17;

                    if (to.id == 0) {
                        int id = 0;
                        int academic_year_id = FitIn.toInt(acad.getId());
                        String academic_year = acad.getText();
                        int department_id = FitIn.toInt(dep.getId());
                        String department = dep.getText();
                        int level_id = FitIn.toInt(lev.getId());
                        String level = lev.getText();
                        int course_id = FitIn.toInt(year.getId());
                        String course = year.getText();
                        String period = per.getText();
                        int group_id = 1;
                        String group_name = "misc";
                        int fee_id = to.fee_id;
                        String fee = to.fee;
                        double amount = data.amount;
                        int is_per_unit = 0;
                        if (jCheckBox1.isSelected()) {
                            is_per_unit = 1;
                        }
                        double per_unit = FitIn.toDouble(tf_field19.getText());
                        String created_at = DateType.now();
                        String updated_at = DateType.now();
                        String created_by = MyUser.getUser_id();
                        String updated_by = MyUser.getUser_id();
                        int status = 0;
                        int is_uploaded = 0;
                        Academic_year_fees.to_academic_year_fees fe = new Academic_year_fees.to_academic_year_fees(id, academic_year_id, academic_year, department_id,
                                                                                                                   department, level_id, level, course_id, course, period, group_id, group_name, fee_id, fee, amount, is_per_unit, per_unit, created_at, updated_at, created_by, updated_by, status, is_uploaded);
                        Academic_year_fees.add_data(fe);
                        Alert.set(1, "");
                        ret_data();
                    } else {
                        int id = to.id;
                        int academic_year_id = FitIn.toInt(acad.getId());
                        String academic_year = acad.getText();
                        int department_id = FitIn.toInt(dep.getId());
                        String department = dep.getText();
                        int level_id = FitIn.toInt(lev.getId());
                        String level = lev.getText();
                        int course_id = FitIn.toInt(year.getId());
                        String course = year.getText();
                        String period = per.getText();
                        int group_id = 1;
                        String group_name = "misc";
                        int fee_id = to.fee_id;
                        String fee = to.fee;
                        double amount = data.amount;
                        int is_per_unit = 0;
                        if (jCheckBox1.isSelected()) {
                            is_per_unit = 1;
                        }
                        double per_unit = FitIn.toDouble(tf_field19.getText());
                        String created_at = DateType.now();
                        String updated_at = DateType.now();
                        String created_by = MyUser.getUser_id();
                        String updated_by = MyUser.getUser_id();
                        int status = 0;
                        int is_uploaded = 0;
                        Academic_year_fees.to_academic_year_fees fe = new Academic_year_fees.to_academic_year_fees(id, academic_year_id, academic_year, department_id,
                                                                                                                   department, level_id, level, course_id, course, period, group_id, group_name, fee_id, fee, amount, is_per_unit, per_unit, created_at, updated_at, created_by, updated_by, status, is_uploaded);
                        Academic_year_fees.update_data2(fe);
                        Alert.set(2, "");
                        ret_data();
                    }

                }
            });
            nd.setLocationRelativeTo(jScrollPane1);
            nd.setVisible(true);
        }

    }

    private void select_other_fees() {
        int row = tbl_other_fees.getSelectedRow();
        if (row < 0) {
            return;
        }
        Academic_year_fees.to_academic_year_fees to = (Academic_year_fees.to_academic_year_fees) tbl_other_fees_ALM.get(row);
        int col = tbl_other_fees.getSelectedColumn();
        if (col == 1) {
            Window p = (Window) this;
            Dlg_fee_amount nd = Dlg_fee_amount.create(p, true);
            nd.setTitle("");
            nd.do_pass(to.fee, to.amount);
            nd.setCallback(new Dlg_fee_amount.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_fee_amount.OutputData data) {
                    closeDialog.ok();
                    Field.Input acad = (Field.Input) tf_field14;
                    Field.Combo dep = (Field.Combo) tf_field15;
                    Field.Combo lev = (Field.Combo) tf_field22;
                    Field.Combo year = (Field.Combo) tf_field16;
                    Field.Combo per = (Field.Combo) tf_field17;

                    if (to.id == 0) {
                        int id = 0;
                        int academic_year_id = FitIn.toInt(acad.getId());
                        String academic_year = acad.getText();
                        int department_id = FitIn.toInt(dep.getId());
                        String department = dep.getText();
                        int level_id = FitIn.toInt(lev.getId());
                        String level = lev.getText();
                        int course_id = FitIn.toInt(year.getId());
                        String course = year.getText();
                        String period = per.getText();
                        int group_id = 2;
                        String group_name = "others";
                        int fee_id = to.fee_id;
                        String fee = to.fee;
                        double amount = data.amount;
                        int is_per_unit = 0;
                        if (jCheckBox1.isSelected()) {
                            is_per_unit = 1;
                        }
                        double per_unit = FitIn.toDouble(tf_field19.getText());
                        String created_at = DateType.now();
                        String updated_at = DateType.now();
                        String created_by = MyUser.getUser_id();
                        String updated_by = MyUser.getUser_id();
                        int status = 0;
                        int is_uploaded = 0;
                        Academic_year_fees.to_academic_year_fees fe = new Academic_year_fees.to_academic_year_fees(id, academic_year_id, academic_year, department_id,
                                                                                                                   department, level_id, level, course_id, course, period, group_id, group_name, fee_id, fee, amount, is_per_unit, per_unit, created_at, updated_at, created_by, updated_by, status, is_uploaded);
                        Academic_year_fees.add_data(fe);
                        Alert.set(1, "");
                        ret_data_other_fees();
                    } else {
                        int id = to.id;
                        int academic_year_id = FitIn.toInt(acad.getId());
                        String academic_year = acad.getText();
                        int department_id = FitIn.toInt(dep.getId());
                        String department = dep.getText();
                        int level_id = FitIn.toInt(lev.getId());
                        String level = lev.getText();
                        int course_id = FitIn.toInt(year.getId());
                        String course = year.getText();
                        String period = per.getText();
                        int group_id = 2;
                        String group_name = "others";
                        int fee_id = to.fee_id;
                        String fee = to.fee;
                        double amount = data.amount;
                        int is_per_unit = 0;
                        if (jCheckBox1.isSelected()) {
                            is_per_unit = 1;
                        }
                        double per_unit = FitIn.toDouble(tf_field19.getText());
                        String created_at = DateType.now();
                        String updated_at = DateType.now();
                        String created_by = MyUser.getUser_id();
                        String updated_by = MyUser.getUser_id();
                        int status = 0;
                        int is_uploaded = 0;
                        Academic_year_fees.to_academic_year_fees fe = new Academic_year_fees.to_academic_year_fees(id, academic_year_id, academic_year, department_id,
                                                                                                                   department, level_id, level, course_id, course, period, group_id, group_name, fee_id, fee, amount, is_per_unit, per_unit, created_at, updated_at, created_by, updated_by, status, is_uploaded);
                        Academic_year_fees.update_data2(fe);
                        Alert.set(2, "");
                        ret_data_other_fees();
                    }

                }
            });
            nd.setLocationRelativeTo(jScrollPane2);
            nd.setVisible(true);
        }

    }

    private void ret_tuition_fee() {
        Field.Input acad = (Field.Input) tf_field14;
        Field.Combo dep = (Field.Combo) tf_field15;
        Field.Combo lev = (Field.Combo) tf_field22;
        Field.Combo year = (Field.Combo) tf_field16;
        Field.Combo per = (Field.Combo) tf_field17;

        String where = " where id<>0 ";
        where = where + " and academic_year_id='" + acad.getId() + "' "
                + " and department_id='" + dep.getId() + "' "
                + " and level_id='" + lev.getId() + "' "
                + " and course_id='" + year.getId() + "' "
                + " and period like '" + per.getText() + "' "
                + " and group_id=0 ";
        List<Academic_year_fees.to_academic_year_fees> datas = Academic_year_fees.ret_data(where);

        if (!datas.isEmpty()) {

            Academic_year_fees.to_academic_year_fees to = (Academic_year_fees.to_academic_year_fees) datas.get(0);
            Field.Input amount = (Field.Input) tf_field18;
            Field.Input per_unit = (Field.Input) tf_field19;
            if (to.is_per_unit == 0) {
                jCheckBox1.setSelected(false);
            } else {
                jCheckBox1.setSelected(true);
            }
            amount.setText(FitIn.fmt_wc_0(to.amount));
            amount.setId("" + to.id);
            per_unit.setText(FitIn.fmt_wc_0(to.per_unit));
        } else {
            Field.Input amount = (Field.Input) tf_field18;
            Field.Input per_unit = (Field.Input) tf_field19;
            amount.setText("0.00");
            amount.setId("0");
            per_unit.setText("0.00");
        }
    }

    private void save_tuition_fee() {

        Field.Input acad = (Field.Input) tf_field14;
        Field.Combo dep = (Field.Combo) tf_field15;
        Field.Combo lev = (Field.Combo) tf_field22;
        Field.Combo year = (Field.Combo) tf_field16;
        Field.Combo per = (Field.Combo) tf_field17;

        Field.Input amount2 = (Field.Input) tf_field18;
        Field.Input per_unit2 = (Field.Input) tf_field19;
        int id2 = FitIn.toInt(amount2.getId());
        if (id2 > 0) {
            int id = id2;
            int academic_year_id2 = FitIn.toInt(acad.getId());
            String academic_year = acad.getText();
            int department_id = FitIn.toInt(dep.getId());
            String department = dep.getText();
            int level_id = FitIn.toInt(lev.getId());
            String level = lev.getText();
            int course_id = FitIn.toInt(year.getId());
            String course = year.getText();
            String period = per.getText();
            int group_id = 0;
            String group_name = "others";
            int fee_id = 0;
            String fee = "Tuition Fee";
            double amount = FitIn.toDouble(amount2.getText());
            int is_per_unit = 0;
            if (jCheckBox1.isSelected()) {
                is_per_unit = 1;
            }
            double per_unit = FitIn.toDouble(tf_field19.getText());
            String created_at = DateType.now();
            String updated_at = DateType.now();
            String created_by = MyUser.getUser_id();
            String updated_by = MyUser.getUser_id();
            int status = 0;
            int is_uploaded = 0;
            Academic_year_fees.to_academic_year_fees fe = new Academic_year_fees.to_academic_year_fees(id, academic_year_id2, academic_year, department_id,
                                                                                                       department, level_id, level, course_id, course, period, group_id, group_name, fee_id, fee, amount, is_per_unit, per_unit, created_at, updated_at, created_by, updated_by, status, is_uploaded);

            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_action.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    Academic_year_fees.update_data_tuition(fe);
                    Alert.set(2, "");
                    ret_tuition_fee();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);

        } else {
            int id = 0;
            int academic_year_id1 = FitIn.toInt(acad.getId());
            String academic_year = acad.getText();
            int department_id = FitIn.toInt(dep.getId());
            String department = dep.getText();
            int level_id = FitIn.toInt(lev.getId());
            String level = lev.getText();
            int course_id = FitIn.toInt(year.getId());
            String course = year.getText();
            String period = per.getText();
            int group_id = 0;
            String group_name = "others";
            int fee_id = 0;
            String fee = "Tuition Fee";
            double amount = FitIn.toDouble(amount2.getText());
            int is_per_unit = 0;
            if (jCheckBox1.isSelected()) {
                is_per_unit = 1;
            }
            double per_unit = FitIn.toDouble(per_unit2.getText());
            String created_at = DateType.now();
            String updated_at = DateType.now();
            String created_by = MyUser.getUser_id();
            String updated_by = MyUser.getUser_id();
            int status = 0;
            int is_uploaded = 0;
            Academic_year_fees.to_academic_year_fees fe = new Academic_year_fees.to_academic_year_fees(id, academic_year_id, academic_year, department_id, department, level_id, level, course_id, course, period, group_id, group_name, fee_id, fee, amount, is_per_unit, per_unit, created_at, updated_at, created_by, updated_by, status, is_uploaded
            );
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_action.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    Academic_year_fees.add_data(fe);
                    Alert.set(1, "");
                    ret_tuition_fee();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);

        }
    }

    Enrollments.to_enrollments enroll = null;

    private void init_students() {
        String where = "";
        List<Enrollments.to_enrollments> datas = Enrollments.ret_data(where);
        Object[][] obj = new Object[datas.size()][5];
        int i = 0;
        for (Enrollments.to_enrollments to : datas) {
            obj[i][0] = " " + to.enrollment_no;
            obj[i][1] = " " + to.first_name;
            obj[i][2] = " " + to.middle_name;
            obj[i][3] = " " + to.last_name;
            obj[i][4] = " " + to.permanent_address;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {100, 150, 100, 150, 200};
        int width = 0;
        String[] col_names = {"", "", "", "", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup2(tf_field23, obj, labels, tbl_widths_customers, col_names, 690);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Enrollments.to_enrollments to = datas.get(data.selected_row);
                enroll = to;
                tf_field8.setText(to.student_no);
                tf_field5.setText(to.first_name);
                tf_field6.setText(to.middle_name);
                tf_field7.setText(to.last_name);

                tf_field7.setText(to.last_name);
                Field.Input course = (Field.Input) tf_field131;
                Field.Input dep = (Field.Input) tf_field125;
                Field.Input lev = (Field.Input) tf_field126;
                Field.Input enoll = (Field.Input) tf_field133;

                course.setText(to.course_code);
                course.setId("" + to.course_id);

                String where = " where course_id='" + to.course_id + "' and academic_year_id='" + to.academic_year_id + "' ";
                List<Academic_offerings.to_academic_offerings> courses = Academic_offerings.ret_data(where);
                if (!courses.isEmpty()) {
                    Academic_offerings.to_academic_offerings course1 = (Academic_offerings.to_academic_offerings) courses.get(0);
                    tf_field132.setText("" + course1.no_of_years);
                }
                tf_field130.setText(to.course_description);

                dep.setText(to.department);
                dep.setId("" + to.department_id);

                lev.setText(to.level);
                lev.setId("" + to.level_id);

                enoll.setText(to.enrollment_no);
                enoll.setId("" + to.id);
                tf_field135.setText(to.advised_by);
                tf_field134.setText(to.approved_by);

                String image_server = System.getProperty("image_server", "192.168.10.127");

                if (!image_server.isEmpty()) {
                    String source = "\\\\" + image_server + "\\cis\\cis_images\\enrollment\\" + to.enrollment_no + ".jpg";
//            System.out.println("source: " + source);
                    File sourceFile = new File(source);
                    BufferedImage img = null;
                    try {
                        img = ImageIO.read(sourceFile);
                        Image dimg = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(),
                                                           Image.SCALE_SMOOTH);
                        ImageIcon imageIcon = new ImageIcon(dimg);
                        jLabel1.setIcon(imageIcon);
                    } catch (IOException e) {
                        System.out.println(e);
                    }

                }

                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        set_assessment();
                    }
                });

            }
        });
    }

    List<Mode_of_payments.to_mode_of_payments> modes = new ArrayList();

    private void init_mode_of_payments() {
        String where = "";

        Object[][] obj = new Object[modes.size()][1];
        int i = 0;
        for (Mode_of_payments.to_mode_of_payments to : modes) {
            obj[i][0] = " " + to.mode;

            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field129.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field129, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Mode_of_payments.to_mode_of_payments to = modes.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field129;
                co.setText(to.mode);
                co.setId("" + to.nos);

            }
        });
    }

    private void mode_of_payments() {

        Window p = (Window) this;
        Dlg_mode_of_payments nd = Dlg_mode_of_payments.create(p, true);
        nd.setTitle("");
//        nd.do_pass(services);
        nd.setCallback(new Dlg_mode_of_payments.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_mode_of_payments.OutputData data) {
                closeDialog.ok();
                ret_mode_of_payments();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    //<editor-fold defaultstate="collapsed" desc=" list of programs ">
    private void set_assessment() {

        jProgressBar1.setString("Loading...Please wait...");
        jProgressBar1.setIndeterminate(true);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                List<Enrollment_assessments.to_enrollment_assessments> assessments = Enrollment_assessments.ret_data(" where enrollment_id='" + enroll.id + "' ");
                if (assessments.isEmpty()) {
                    jProgressBar1.setString("Finished...");
                    jProgressBar1.setIndeterminate(false);
                    jButton3.setEnabled(true);
                    jPanel17.removeAll();
                    jPanel17.setLayout(new BorderLayout());
                    jPanel17.setMinimumSize(new Dimension(626, 0));
                    jPanel17.setMaximumSize(new Dimension(626, 0));
                    jPanel17.setPreferredSize(new Dimension(626, 0));
                    jPanel17.updateUI();
                    return;
                }
                Enrollment_assessments.to_enrollment_assessments assessment = (Enrollment_assessments.to_enrollment_assessments) assessments.get(0);

                String school_name = System.getProperty("school_name", "Colegio de Santa Catalina de Alejandria (COSCA)");
                String address = System.getProperty("address", "Bishop Epifanio B. Surban St. Dumaguete City Negros Oriental, Bishop Epifanio Surban St, Dumaguete, Negros Oriental");
                String date = synsoftech.util.DateType.slash.format(new Date());
                String contact_no = System.getProperty("contact_no", "(035) 225 4831");
                String enrollment_id = "" + assessment.enrollment_id;
                String enrollment_no = assessment.enrollment_no;
                String student_id = "" + assessment.student_id;
                String student_no = assessment.student_no;
                String student_name = assessment.lname + ", " + assessment.fname + " " + assessment.mi;
                String academic_year = assessment.academic_year;
                String course_code = assessment.course_code;
                String course_description = assessment.course_description;
                int no_of_years = FitIn.toInt(assessment.term);
                String level = assessment.level;
                String college = assessment.college;
                String department = assessment.department;
                String year_level = assessment.year_level;
                double tuition_amount = 11500;
                double tuition_discount = 1000;
                int no_of_units = 23;
                double amount_per_unit = 500;
                double miscellaneous_amount = 5000;
                double miscellaneous_discount = 0;
                double other_fees_amount = 1000;
                double other_fees_discount = 0;
                double total_discount = 1000;
                double total_amount_due = 16500;
                String home = System.getProperty("user.home");
                String SUBREPORT_DIR = home + "\\cis\\";
                List<Srpt_enrollment_assessment.field> fields = new ArrayList();
                List<Srpt_enrollment_assessment.field> rpt_subjects = new ArrayList();

                List<Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects> subjects = Enrollment_student_loaded_subjects.ret_data(" where enrollment_id='" + enroll.id + "' ");

                for (Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects sub : subjects) {
                    String subject_code = sub.subject_code;
                    String subject_description = sub.description;
                    String prerequisites = "";
                    double lec_units = sub.lecture_units;
                    double lab_units = sub.lab_units;
                    String faculty_name = sub.faculty_name;
                    String section = sub.section;
                    String room = sub.room;
                    String day = DateType.mwf(sub.day);
                    Srpt_enrollment_assessment.field f = new Srpt_enrollment_assessment.field(subject_code, subject_description, prerequisites, lec_units, lab_units, faculty_name, section, room, day);
                    rpt_subjects.add(f);
                }
                List<Srpt_enrollment_assessment.mode_of_payments> rpt_mode_of_payments = new ArrayList();
                List<Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes> eapm = Enrollment_assessment_payment_modes.ret_data(" where enrollment_id='" + enroll.id + "' ");

                int payment_count = 3;
                for (Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes ea : eapm) {
                    double balance = ea.amount - ea.paid;
                    Srpt_enrollment_assessment.mode_of_payments mop0 = new Srpt_enrollment_assessment.mode_of_payments(ea.mode, ea.to_pay, ea.amount, ea.paid, balance);
                    rpt_mode_of_payments.add(mop0);
                }

                String assessed_by = enroll.assessed_by;

                Srpt_enrollment_assessment rpt = new Srpt_enrollment_assessment(school_name, address, date, contact_no, enrollment_id, enrollment_no, student_id, student_no, student_name, academic_year, course_code, course_description, no_of_years, level, college, department, year_level, tuition_amount, tuition_discount, no_of_units, amount_per_unit, miscellaneous_amount, miscellaneous_discount, other_fees_amount, other_fees_discount, total_discount, total_amount_due, SUBREPORT_DIR, rpt_subjects, rpt_mode_of_payments, assessed_by);

                String jrxml = "enrollment_assessment.jrxml";
                report_assessment(rpt, jrxml);
                InputStream is = Srpt_enrollment_assessment.class.getResourceAsStream(jrxml);
                try {
                    JasperReport jasperReport = JasperCompileManager.compileReport(is);
                    jasperPrint = JasperFillManager.fillReport(jasperReport, JasperUtil.
                                                               setParameter(rpt), JasperUtil.emptyDatasource());

                } catch (JRException ex) {
                    Logger.getLogger(Dlg_finance.class.getName()).log(Level.SEVERE, null, ex);
                }
//                jTabbedPane2.setSelectedIndex(1);
                jProgressBar1.setString("Finished...");
                jProgressBar1.setIndeterminate(false);
            }
        });
        t.start();

    }

    private void report_assessment(final Srpt_enrollment_assessment to, String jrxml_name) {
        jPanel17.removeAll();
        jPanel17.setLayout(new BorderLayout());
        try {
            JRViewer viewer = get_viewer_assessment(to, jrxml_name);
            JPanel pnl = new JPanel();
            pnl.add(viewer);
            pnl.setVisible(true);
            pnl.setVisible(true);
            jPanel17.add(viewer);
            jPanel17.setMinimumSize(new Dimension(626, 0));
            jPanel17.setMaximumSize(new Dimension(626, 0));
            jPanel17.setPreferredSize(new Dimension(626, 0));
            jPanel17.updateUI();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer_assessment(Srpt_enrollment_assessment to, String rpt_name) {
        try {
            return JasperUtil.getJasperViewer(
                    compileJasper(rpt_name),
                    JasperUtil.setParameter(to),
                    JasperUtil.emptyDatasource());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }
    }

    public static JasperReport compileJasper(String rpt_name) {
        try {
            String jrxml = rpt_name;
            InputStream is = Srpt_enrollment_assessment.class.
                    getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    JasperPrint jasperPrint = null;

    private void print_assessment() {
        try {
            if (jasperPrint != null) {
                JasperPrintManager.printReport(jasperPrint, false);
            }

        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Failed To Print, Please Check the Printer");
            throw new RuntimeException(e);
        }
    }
    //</editor-fold>

    private void save_assessment() {

        int id = 0;
        int enrollment_id = enroll.id;
        String enrollment_no = enroll.enrollment_no;
        int student_id = 0;
        String student_no = enroll.student_no;
        String fname = enroll.first_name;
        String lname = enroll.last_name;
        String mi = enroll.middle_name;
        int academic_year_id1 = enroll.academic_year_id;
        String academic_year = enroll.academic_year;
        int curriculum_id = enroll.curriculum_id;
        int course_id = enroll.course_id;
        String course_code = enroll.course_code;
        String course_description = enroll.course_description;
        String term = enroll.term;
        String year_level = enroll.year_level;
        String year_level_status = enroll.year_level_status;
        int level_id = enroll.level_id;
        String level = enroll.level;
        int college_id = enroll.college_id;
        String college = enroll.college;
        int department_id = enroll.department_id;
        String department = enroll.department;
        double tuition_amount = 0;
        int no_of_units = 0;
        double amount_per_unit = 0;
        double tuition_discount = 0;
        double miscellaneous_amount = 0;
        double miscellaneous_discount = 0;
        double other_fees_amount = 0;
        double other_fees_discount = 0;
        Field.Combo mode = (Field.Combo) tf_field129;
        int mode_of_payment = FitIn.toInt(mode.getId());
        String created_at = DateType.now();
        String updated_at = DateType.now();
        String created_by = MyUser.getUser_id();
        String updated_by = MyUser.getUser_id();
        int status = 0;
        int is_uploaded = 0;

        Window p = (Window) this;
        Dlg_finance_confirm_assessment nd = Dlg_finance_confirm_assessment.create(p, true);
        nd.setTitle("");
        nd.do_pass(enroll, mode.getText(), FitIn.toInt(mode.getId()), modes);
        nd.setCallback(new Dlg_finance_confirm_assessment.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_finance_confirm_assessment.OutputData data) {
                closeDialog.ok();
                double tuition_amount = data.tuition_amount;
                int no_of_units = data.no_of_units;
                double amount_per_unit = data.amount_per_unit;
                double tuition_discount = data.tuition_discount;
                double miscellaneous_amount = data.miscellaneous_amount;
                double miscellaneous_discount = data.miscellaneous_discount;
                double other_fees_amount = data.other_fees_amount;
                double other_fees_discount = data.other_fees_discount;
                final Enrollment_assessments.to_enrollment_assessments enrollment = new Enrollment_assessments.to_enrollment_assessments(id, enrollment_id, enrollment_no, student_id, student_no, fname, lname, mi, academic_year_id, academic_year, curriculum_id, course_id, course_code, course_description, term, year_level, year_level_status, level_id, level, college_id, college, department_id, department, tuition_amount, no_of_units, amount_per_unit, tuition_discount, miscellaneous_amount, miscellaneous_discount, other_fees_amount, other_fees_discount, mode_of_payment, created_at, updated_at, created_by, updated_by, status, is_uploaded);

                Enrollment_assessments.add_data2(enrollment, data.payment_modes, data.pay, data.enrollment_payments);
                Alert.set(1, "");
                jButton3.setEnabled(false);
                set_assessment();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }
}
