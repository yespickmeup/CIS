/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.deans_portal;

import cis.academic.Academic_offering_subjects;
import cis.academic.Academic_offering_subjects.to_academic_offering_subjects;
import cis.academic.Academic_offerings;
import cis.academic.Academic_year_fees;
import cis.academic.Academic_year_period_schedules;
import cis.academic.Academic_year_periods;
import cis.academic.Academic_years;
import cis.academic.Srpt_academic_offering_subjects;
import cis.enrollments.Dlg_student_enrollment_approved;
import cis.enrollments.Enrollment_department_requirements;
import cis.enrollments.Enrollment_department_requirements.to_enrollment_department_requirements;
import cis.enrollments.Enrollment_offered_subject_sections;
import cis.enrollments.Enrollment_student_loaded_subjects;
import cis.enrollments.Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects;
import cis.enrollments.Enrollments;
import cis.finance.Dlg_finance;
import cis.finance.Enrollment_assessment_payment_modes;
import cis.finance.Enrollment_assessments;
import cis.finance.Miscellaneous_fees;
import cis.finance.Srpt_enrollment_assessment;
import cis.students.Students;
import cis.users.MyUser;
import cis.utils.Alert;
import cis.utils.DateType;
import cis.utils.Dlg_confirm_action;
import cis.utils.Dlg_confirm_delete;
import cis.utils.TableRenderer;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
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
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import org.jfree.ui.Align;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.panels.Loading;
import synsoftech.util.ImageRenderer;

/**
 *
 * @author Ronescape
 */
public class Dlg_dean_student_advice_details extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_student_enrollment
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
    private Dlg_dean_student_advice_details(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_dean_student_advice_details(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_dean_student_advice_details() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_dean_student_advice_details myRef;

    private void setThisRef(Dlg_dean_student_advice_details myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_dean_student_advice_details> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_dean_student_advice_details create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_dean_student_advice_details create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_dean_student_advice_details dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_dean_student_advice_details((java.awt.Frame) parent, false);
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
            Dlg_dean_student_advice_details dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_dean_student_advice_details((java.awt.Dialog) parent, false);
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

        Dlg_dean_student_advice_details dialog = Dlg_dean_student_advice_details.create(new javax.swing.JFrame(), true);
//        Toolkit tk = Toolkit.getDefaultToolkit();
//        int xSize = ((int) tk.getScreenSize().
//                getWidth());
//        int ySize = ((int) tk.getScreenSize().
//                getHeight());
//        dialog.setSize(xSize, ySize);
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
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel31 = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel28 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        tf_field18 = new Field.Input();
        jLabel32 = new javax.swing.JLabel();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jLabel67 = new javax.swing.JLabel();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        tf_field105 = new Field.Input();
        jLabel68 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        tf_field16 = new Field.Input();
        jLabel26 = new javax.swing.JLabel();
        tf_field17 = new Field.Input();
        jLabel22 = new javax.swing.JLabel();
        tf_field14 = new Field.Input();
        jLabel21 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel23 = new javax.swing.JLabel();
        tf_field15 = new Field.Input();
        jLabel24 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel12 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        tf_field11 = new Field.Input();
        jLabel19 = new javax.swing.JLabel();
        tf_field12 = new Field.Input();
        jLabel20 = new javax.swing.JLabel();
        tf_field13 = new Field.Input();
        jLabel16 = new javax.swing.JLabel();
        tf_field9 = new Field.Input();
        jLabel17 = new javax.swing.JLabel();
        tf_field10 = new Field.Input();
        jLabel66 = new javax.swing.JLabel();
        tf_field104 = new Field.Input();
        jPanel13 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        tf_field5 = new Field.Input();
        jLabel13 = new javax.swing.JLabel();
        tf_field6 = new Field.Input();
        jLabel14 = new javax.swing.JLabel();
        tf_lastname = new Field.Input();
        jLabel15 = new javax.swing.JLabel();
        tf_field8 = new Field.Input();
        jButton2 = new Button.Primary();
        jPanel36 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        tf_field19 = new Field.Input();
        tf_field106 = new Field.Input();
        tf_field20 = new Field.Input();
        tf_field109 = new Field.Input();
        tf_field21 = new Field.Input();
        jPanel18 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        tf_field22 = new Field.Input();
        tf_field107 = new Field.Input();
        tf_field23 = new Field.Input();
        tf_field110 = new Field.Input();
        tf_field24 = new Field.Input();
        jPanel19 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        tf_field25 = new Field.Input();
        tf_field108 = new Field.Input();
        tf_field26 = new Field.Input();
        tf_field111 = new Field.Input();
        tf_field27 = new Field.Input();
        jPanel20 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        tf_field112 = new Field.Input();
        tf_field113 = new Field.Input();
        tf_field114 = new Field.Input();
        tf_field115 = new Field.Input();
        tf_field116 = new Field.Input();
        jPanel6 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        tf_field28 = new Field.Input();
        jLabel45 = new javax.swing.JLabel();
        tf_field29 = new Field.Input();
        jLabel46 = new javax.swing.JLabel();
        tf_field30 = new Field.Input();
        jButton12 = new Button.Primary();
        jButton13 = new Button.Default();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        tf_field31 = new Field.Input();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        tf_field32 = new Field.Input();
        jLabel47 = new javax.swing.JLabel();
        tf_field33 = new Field.Input();
        tf_field34 = new Field.Input();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        tf_field35 = new Field.Input();
        tf_field36 = new Field.Input();
        tf_field37 = new Field.Input();
        tf_field38 = new Field.Input();
        tf_field39 = new Field.Input();
        jLabel50 = new javax.swing.JLabel();
        tf_field40 = new Field.Input();
        tf_field41 = new Field.Input();
        jLabel51 = new javax.swing.JLabel();
        tf_field42 = new Field.Input();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        tf_field43 = new Field.Input();
        tf_field44 = new Field.Input();
        tf_field45 = new Field.Input();
        tf_field46 = new Field.Input();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        tf_field47 = new Field.Input();
        tf_field48 = new Field.Input();
        tf_field49 = new Field.Input();
        tf_field50 = new Field.Input();
        jLabel56 = new javax.swing.JLabel();
        tf_field51 = new Field.Input();
        tf_field52 = new Field.Input();
        jPanel8 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        tf_field53 = new Field.Input();
        tf_field54 = new Field.Input();
        tf_field55 = new Field.Input();
        tf_field56 = new Field.Input();
        tf_field57 = new Field.Input();
        tf_field58 = new Field.Input();
        tf_field59 = new Field.Input();
        tf_field60 = new Field.Input();
        tf_field61 = new Field.Input();
        tf_field62 = new Field.Input();
        tf_field63 = new Field.Input();
        tf_field64 = new Field.Input();
        tf_field65 = new Field.Input();
        tf_field66 = new Field.Input();
        tf_field67 = new Field.Input();
        tf_field68 = new Field.Input();
        tf_field69 = new Field.Input();
        tf_field70 = new Field.Input();
        tf_field71 = new Field.Input();
        tf_field72 = new Field.Input();
        tf_field73 = new Field.Input();
        tf_field74 = new Field.Input();
        tf_field75 = new Field.Input();
        tf_field76 = new Field.Input();
        tf_field77 = new Field.Input();
        tf_field78 = new Field.Input();
        tf_field79 = new Field.Input();
        tf_field80 = new Field.Input();
        tf_field81 = new Field.Input();
        tf_field82 = new Field.Input();
        tf_field83 = new Field.Input();
        tf_field84 = new Field.Input();
        tf_field85 = new Field.Input();
        tf_field86 = new Field.Input();
        tf_field87 = new Field.Input();
        tf_field88 = new Field.Input();
        tf_field89 = new Field.Input();
        tf_field90 = new Field.Input();
        tf_field91 = new Field.Input();
        tf_field92 = new Field.Input();
        tf_field93 = new Field.Input();
        tf_field94 = new Field.Input();
        tf_field95 = new Field.Input();
        tf_field96 = new Field.Input();
        tf_field97 = new Field.Input();
        tf_field98 = new Field.Input();
        tf_field99 = new Field.Input();
        tf_field100 = new Field.Input();
        jLabel72 = new javax.swing.JLabel();
        tf_field117 = new Field.Input();
        tf_field118 = new Field.Input();
        tf_field119 = new Field.Input();
        tf_field120 = new Field.Input();
        tf_field121 = new Field.Input();
        tf_field122 = new Field.Input();
        tf_field123 = new Field.Input();
        tf_field124 = new Field.Input();
        jButton3 = new Button.Success();
        jButton4 = new Button.Default();
        jPanel9 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        tf_field101 = new Field.Input();
        tf_field102 = new Field.Input();
        jLabel64 = new javax.swing.JLabel();
        tf_field103 = new Field.Input();
        jLabel65 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        tf_field125 = new Field.Input();
        jLabel74 = new javax.swing.JLabel();
        tf_field126 = new Field.Input();
        jLabel78 = new javax.swing.JLabel();
        tf_field127 = new Field.Search();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_enrollment_department_requirements = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new Button.Primary();
        jLabel79 = new javax.swing.JLabel();
        tf_field128 = new Field.Combo();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        tf_field131 = new Field.Input();
        tf_field132 = new Field.Input();
        jLabel77 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tf_field130 = new javax.swing.JTextArea();
        tf_period = new Field.Combo();
        jLabel84 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel25 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tf_field2 = new Field.Input();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        tf_field3 = new Field.Input();
        jPanel30 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        tf_field4 = new Field.Combo();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_academic_offering_subjects = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        tf_field129 = new Field.Combo();
        jButton1 = new Button.Info();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jButton8 = new Button.Primary();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        tf_field133 = new Field.Combo();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_enrollment_student_loaded_subjects = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        tf_field134 = new Field.Combo();
        jButton7 = new Button.Info();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jButton9 = new Button.Success();
        jPanel24 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jButton6 = new Button.Info();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel27 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jButton10 = new Button.Info();
        jButton11 = new Button.Success();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseClicked(evt);
            }
        });

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel10.setOpaque(false);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Civil Status:");

        buttonGroup5.add(jCheckBox3);
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setSelected(true);
        jCheckBox3.setText("Single");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Date of:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Communion");

        jDateChooser2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        buttonGroup5.add(jCheckBox4);
        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox4.setText("Married");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        buttonGroup5.add(jCheckBox5);
        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox5.setText("Widow");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Confirmation:");

        buttonGroup5.add(jCheckBox6);
        jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox6.setText("Annulled");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel28.setText("If Married Name of Spouse:");

        jDateChooser3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_field18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field18.setEnabled(false);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Are you:");

        buttonGroup7.add(jCheckBox9);
        jCheckBox9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox9.setSelected(true);
        jCheckBox9.setText("Left Handed");

        buttonGroup7.add(jCheckBox10);
        jCheckBox10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox10.setText("Right Handed");

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel67.setText("Member of Indigenous Community?");

        buttonGroup6.add(jCheckBox11);
        jCheckBox11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox11.setText("Yes");
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });

        buttonGroup6.add(jCheckBox12);
        jCheckBox12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox12.setSelected(true);
        jCheckBox12.setText("No");
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        tf_field105.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field105.setEnabled(false);

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel68.setText("Name of the Community:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                                .addComponent(jLabel28)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox9)
                                .addGap(4, 4, 4)
                                .addComponent(jCheckBox10))
                            .addComponent(tf_field18, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field105)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox6)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox9)
                        .addComponent(jCheckBox10)))
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox11)
                    .addComponent(jCheckBox12)
                    .addComponent(tf_field105, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel11.setOpaque(false);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Citizenship:");

        tf_field16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Religion:");

        tf_field17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field17ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Birth Place:");

        tf_field14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Birthdate:");

        jDateChooser1.setDate(new Date());
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Age:");

        tf_field15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field15.setFocusable(false);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Gender:");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Male");

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setText("Female");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field17, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2)
                        .addGap(178, 178, 178))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field14)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox1)
                        .addComponent(jCheckBox2)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel12.setOpaque(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Email Add.:");

        tf_field11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Tel No.:");

        tf_field12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Mobile No.:");

        tf_field13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Permanent Address:");

        tf_field9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Postal Code:");

        tf_field10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel66.setText("Current Address:");

        tf_field104.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(tf_field11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_field12, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_field9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_field13, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_field10))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field104)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field104, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Middle Name:");

        tf_field6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Last Name:");

        tf_lastname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Nick Name:");

        tf_field8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(tf_field5, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field6))
                    .addComponent(tf_lastname)
                    .addComponent(tf_field8))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Info 1", jPanel4);

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Educational Background", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jPanel16.setOpaque(false);

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Grade");
        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Grade School");
        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("Junior High");
        jLabel69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Senior High");
        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("Tesda Trainings Attended");
        jLabel70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("College");
        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setOpaque(false);

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Name and Address of School");
        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field19.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field106.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field106.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field20.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field109.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field109.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field21.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
            .addComponent(tf_field19, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tf_field20)
            .addComponent(tf_field109)
            .addComponent(tf_field21)
            .addComponent(tf_field106)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field106, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field109, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setOpaque(false);

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Region");
        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field22.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field107.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field107.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_field23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field23ActionPerformed(evt);
            }
        });

        tf_field110.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field110.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field24.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
            .addComponent(tf_field22)
            .addComponent(tf_field107, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tf_field110, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tf_field23)
            .addComponent(tf_field24, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field107, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field110, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel19.setOpaque(false);

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Year Attended");
        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field25.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field108.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field108.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field26.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field111.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field111.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field27.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
            .addComponent(tf_field25, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tf_field108, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tf_field26, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tf_field111, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tf_field27, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field108, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field111, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel20.setOpaque(false);

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("Scholarship/Academic Awards");
        jLabel71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field112.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field112.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field113.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field113.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field114.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field114.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field115.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field115.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field116.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field116.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
            .addComponent(tf_field112, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tf_field113, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tf_field114, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tf_field115, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tf_field116, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field112, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field113, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field114, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field115, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field116, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preferred Course", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("1.)");
        jLabel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("2.)");
        jLabel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("3.)");
        jLabel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field30))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_field29)
                            .addComponent(tf_field28))))
                .addGap(13, 13, 13))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_field28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_field30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton12.setText("Next");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton13.setText("Back");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(251, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Info 2", jPanel36);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Family Background", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel40.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Name");
        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field31.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field31.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Father");
        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Mother");
        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field32.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field32.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel47.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Citizenship");
        jLabel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field33.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field33.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field34.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field34.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel48.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Home Address");
        jLabel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel49.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Email Address");
        jLabel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field35.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field35.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field36.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field36.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field37.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field37.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field38.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field38.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field39.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field39.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel50.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Occupation");
        jLabel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field40.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field40.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field41.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field41.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel51.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Tel. No. & Mobile No.");
        jLabel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field42.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field42.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel52.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Employer");
        jLabel52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel53.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Business Address");
        jLabel53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field43.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field43.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field44.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field44.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field45.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field45.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field46.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field46.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel54.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Educational Attainment");
        jLabel54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel55.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Last School Attended");
        jLabel55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field47.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field47.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field48.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field48.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field49.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field49.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field50.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field50.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel56.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Telephone Number");
        jLabel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field51.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field51.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field52.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field52.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(tf_field51)
                                .addGap(1, 1, 1)
                                .addComponent(tf_field52))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(tf_field47)
                                .addGap(1, 1, 1)
                                .addComponent(tf_field49))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(tf_field48)
                                .addGap(1, 1, 1)
                                .addComponent(tf_field50))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_field31))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_field32)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(tf_field33)
                                .addGap(1, 1, 1)
                                .addComponent(tf_field34))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(tf_field35)
                                .addGap(1, 1, 1)
                                .addComponent(tf_field37))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(tf_field36)
                                .addGap(1, 1, 1)
                                .addComponent(tf_field38))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(tf_field42)
                                .addGap(1, 1, 1)
                                .addComponent(tf_field39))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(tf_field40)
                                .addGap(1, 1, 1)
                                .addComponent(tf_field41))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(tf_field43)
                                .addGap(1, 1, 1)
                                .addComponent(tf_field45))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(tf_field44)
                                .addGap(1, 1, 1)
                                .addComponent(tf_field46)))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(tf_field32, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_field31, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_field34, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field33, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_field37, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field35, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_field38, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field36, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_field39, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field42, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_field41, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field40, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_field45, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field43, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_field46, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field44, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_field52, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field51, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_field49, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field47, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_field50, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field48, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Brothers and Sisters (Please list from the eldest to youngest)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Name");
        jLabel57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Age");
        jLabel58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Civil Status");
        jLabel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("School");
        jLabel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Course");
        jLabel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Year");
        jLabel62.setToolTipText("Year Graduated");
        jLabel62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field53.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field53.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field54.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field54.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field55.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field55.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field56.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field56.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field57.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field57.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field58.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field58.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field59.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field59.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field60.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field60.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field61.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field61.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field62.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field62.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field63.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field63.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field64.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field64.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field65.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field65.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field66.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field66.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field67.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field67.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field68.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field68.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field69.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field69.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field70.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field70.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field71.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field71.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field72.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field72.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field73.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field73.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field74.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field74.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field75.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field75.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field76.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field76.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field77.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field77.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field78.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field78.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field79.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field79.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field80.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field80.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field81.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field81.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field82.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field82.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field83.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field83.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field84.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field84.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field85.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field85.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field86.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field86.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field87.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field87.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field88.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field88.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field89.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field89.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_field89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field89ActionPerformed(evt);
            }
        });

        tf_field90.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field90.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field91.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field91.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field92.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field92.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field93.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field93.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field94.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field94.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field95.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field95.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field96.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field96.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field97.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field97.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field98.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field98.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field99.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field99.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field100.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field100.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("Occupation");
        jLabel72.setToolTipText("Year Graduated");
        jLabel72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field117.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field117.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field118.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field118.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field119.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field119.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field120.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field120.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field121.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field121.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_field121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field121ActionPerformed(evt);
            }
        });

        tf_field122.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field122.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field123.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field123.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field124.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field124.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_field71)
                            .addComponent(tf_field65)
                            .addComponent(tf_field59)
                            .addComponent(tf_field53)
                            .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_field72)
                            .addComponent(tf_field66)
                            .addComponent(tf_field60)
                            .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(tf_field54))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_field73)
                            .addComponent(tf_field67)
                            .addComponent(tf_field61)
                            .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(tf_field55))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_field74)
                            .addComponent(tf_field68)
                            .addComponent(tf_field62)
                            .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(tf_field56))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_field75)
                            .addComponent(tf_field69)
                            .addComponent(tf_field63)
                            .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(tf_field57))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field58, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field64, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field70, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field76, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_field77, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                            .addComponent(tf_field90, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_field83, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_field84))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_field78, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(tf_field91, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_field85)
                            .addComponent(tf_field96))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_field79, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(tf_field92, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_field86)
                            .addComponent(tf_field97))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_field80, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                    .addComponent(tf_field98)
                                    .addComponent(tf_field93))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_field81, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                    .addComponent(tf_field94, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_field99))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_field82, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_field95, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_field100, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(tf_field87, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(tf_field88, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(tf_field89, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field117, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field118, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field119, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field120, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tf_field123, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field122, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field124, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field121, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(tf_field117, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(tf_field118, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(tf_field119, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(tf_field120, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(tf_field121, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(tf_field122, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(tf_field123, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(tf_field124, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_field53, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field54, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field55, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field56, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field57, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field58, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_field59, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field60, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field61, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field62, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field63, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field64, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_field65, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field66, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field67, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field68, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field69, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field70, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_field71, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field72, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field73, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field74, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field75, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field76, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_field83, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field85, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field86, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field87, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field88, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field89, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_field90, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field91, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field92, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field93, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field94, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field95, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_field77, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field78, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field79, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field80, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field81, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field82, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_field84, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field96, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field97, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field98, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field99, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field100, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5))
        );

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Guardian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel63.setText("Name:");

        tf_field101.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        tf_field102.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel64.setText("Address:");

        tf_field103.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel65.setText("Tel. No.:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_field101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_field102)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_field103)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field103, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field101, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field102, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jTabbedPane1.addTab("Info 3", jPanel5);

        jTabbedPane2.addTab("Personal Information", jTabbedPane1);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Choose Year/Course", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

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

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel78.setText("Search:");

        tf_field127.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field127.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field127MouseClicked(evt);
            }
        });
        tf_field127.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field127ActionPerformed(evt);
            }
        });

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Requirements", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tbl_enrollment_department_requirements.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_enrollment_department_requirements.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_enrollment_department_requirementsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_enrollment_department_requirements);

        jLabel2.setText("No. of rows:");

        jLabel3.setText("0");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Save");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel79.setText("Year Level:");

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

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel75.setText("Description:");

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

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel77.setText("No. of Years:");

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setFocusable(false);

        tf_field130.setColumns(20);
        tf_field130.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_field130.setLineWrap(true);
        tf_field130.setRows(5);
        tf_field130.setFocusable(false);
        jScrollPane2.setViewportView(tf_field130);

        tf_period.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_period.setFocusable(false);
        tf_period.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_periodMouseClicked(evt);
            }
        });
        tf_period.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_periodActionPerformed(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel84.setText("Period:");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel78, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel79, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_field125)
                            .addComponent(tf_field126)
                            .addComponent(tf_field127)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(tf_field131, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_field132, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(tf_field128, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_period, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field127, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field131, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field132, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field125, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field126, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_period, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field128, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(323, Short.MAX_VALUE)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(287, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Select Level/Course", jPanel15);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Course Outline", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Course Code:");

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

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Course:");

        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setFocusable(false);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setFocusable(false);
        jScrollPane3.setViewportView(jTextArea1);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("No. of years:");

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

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(tf_field3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field2)))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(tf_field2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Year/Level:");

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
        jScrollPane4.setViewportView(tbl_academic_offering_subjects);

        jLabel4.setText("No. of rows:");

        jLabel5.setText("0");

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel80.setText("Period:");

        tf_field129.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field129.setText("First Semester");
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

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBox7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox7.setText("All");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jCheckBox8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox8.setText("All");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jButton8.setText("Add All");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel30Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane4)
                        .addGroup(jPanel30Layout.createSequentialGroup()
                            .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel30Layout.createSequentialGroup()
                                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tf_field129, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel30Layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tf_field4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox7))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field129, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox8)))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Subjects Loaded", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel81.setText("Year/Level:");

        tf_field133.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field133.setText("First Year");
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
        jScrollPane5.setViewportView(tbl_enrollment_student_loaded_subjects);

        jLabel6.setText("No. of rows:");

        jLabel7.setText("0");

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel82.setText("Period:");

        tf_field134.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field134.setText("First Semester");
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

        jButton7.setText("Search");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jCheckBox13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox13.setText("All");
        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });

        jCheckBox14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox14.setText("All");
        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox14, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel32Layout.createSequentialGroup()
                                .addComponent(tf_field134)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel32Layout.createSequentialGroup()
                                .addComponent(tf_field133)
                                .addGap(6, 6, 6)))))
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field133, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox13))
                .addGap(1, 1, 1)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field134, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton9.setText("Finish Advising");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane3.addTab("Subject Loading", jPanel25);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText("Generate");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jProgressBar1.setRequestFocusEnabled(false);
        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(1128, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Print Preview", jPanel24);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Loading", jPanel23);

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Print Preview", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setMinimumSize(new java.awt.Dimension(626, 0));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        jLabel83.setText("Status:");

        jProgressBar2.setString("");
        jProgressBar2.setStringPainted(true);

        jButton10.setText("Print Assessment");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setText("Approve Enrollment Application");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel83)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                                .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel83)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(194, 194, 194))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(58, 58, 58))
        );

        jTabbedPane2.addTab("Assessment", jPanel33);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void tf_field17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field17ActionPerformed

    private void tf_field23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field23ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tf_field89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field89ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field89ActionPerformed

    private void tf_field121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field121ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field121ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        save_application();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton4ActionPerformed

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

    private void tf_field127MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field127MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field127MouseClicked

    private void tf_field127ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field127ActionPerformed
        init_courses();
    }//GEN-LAST:event_tf_field127ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        save_year_course();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tf_field128MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field128MouseClicked
        init_years();
    }//GEN-LAST:event_tf_field128MouseClicked

    private void tf_field128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field128ActionPerformed
//        init_years();
    }//GEN-LAST:event_tf_field128ActionPerformed

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

    private void tbl_enrollment_department_requirementsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_enrollment_department_requirementsMouseClicked
        select_enrollment_requirement();
    }//GEN-LAST:event_tbl_enrollment_department_requirementsMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        set_report();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tf_field2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field2MouseClicked

    }//GEN-LAST:event_tf_field2MouseClicked

    private void tf_field2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field2ActionPerformed

    }//GEN-LAST:event_tf_field2ActionPerformed

    private void tf_field3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field3MouseClicked

    private void tf_field3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field3ActionPerformed

    private void tf_field4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field4MouseClicked
        init_years2(tf_field4);
    }//GEN-LAST:event_tf_field4MouseClicked

    private void tf_field4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field4ActionPerformed
        init_years2(tf_field4);
    }//GEN-LAST:event_tf_field4ActionPerformed

    private void tf_field129MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field129MouseClicked
        init_period();
    }//GEN-LAST:event_tf_field129MouseClicked

    private void tf_field129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field129ActionPerformed
        init_period();
    }//GEN-LAST:event_tf_field129ActionPerformed

    private void tf_field133MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field133MouseClicked
        init_years3(tf_field133);
    }//GEN-LAST:event_tf_field133MouseClicked

    private void tf_field133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field133ActionPerformed
        init_years3(tf_field133);
    }//GEN-LAST:event_tf_field133ActionPerformed

    private void tf_field134MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field134MouseClicked
        init_period2();
    }//GEN-LAST:event_tf_field134MouseClicked

    private void tf_field134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field134ActionPerformed
        init_period2();
    }//GEN-LAST:event_tf_field134ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ret_offered_subjects();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        ret_offered_subjects();
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        ret_offered_subjects();
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void tbl_academic_offering_subjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_academic_offering_subjectsMouseClicked
        select_aos();
    }//GEN-LAST:event_tbl_academic_offering_subjectsMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ret_loaded_subjects();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        add_all_load();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
        ret_loaded_subjects();
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed
        ret_loaded_subjects();
    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void tbl_enrollment_student_loaded_subjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_enrollment_student_loaded_subjectsMouseClicked
        select_loaded_subjects();
    }//GEN-LAST:event_tbl_enrollment_student_loaded_subjectsMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        finish_advising();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        print_assessment();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        confirm_enroll();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        check_status();
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        check_status();
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        check_status();
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        check_status();
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
        check_indigenous();
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        check_indigenous();
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void tf_periodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_periodMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_periodMouseClicked

    private void tf_periodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_periodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_periodActionPerformed

    private void jTabbedPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MouseClicked
        select_tab();
    }//GEN-LAST:event_jTabbedPane2MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
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
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
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
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tbl_academic_offering_subjects;
    private javax.swing.JTable tbl_enrollment_department_requirements;
    private javax.swing.JTable tbl_enrollment_student_loaded_subjects;
    private javax.swing.JTextField tf_field10;
    private javax.swing.JTextField tf_field100;
    private javax.swing.JTextField tf_field101;
    private javax.swing.JTextField tf_field102;
    private javax.swing.JTextField tf_field103;
    private javax.swing.JTextField tf_field104;
    private javax.swing.JTextField tf_field105;
    private javax.swing.JTextField tf_field106;
    private javax.swing.JTextField tf_field107;
    private javax.swing.JTextField tf_field108;
    private javax.swing.JTextField tf_field109;
    private javax.swing.JTextField tf_field11;
    private javax.swing.JTextField tf_field110;
    private javax.swing.JTextField tf_field111;
    private javax.swing.JTextField tf_field112;
    private javax.swing.JTextField tf_field113;
    private javax.swing.JTextField tf_field114;
    private javax.swing.JTextField tf_field115;
    private javax.swing.JTextField tf_field116;
    private javax.swing.JTextField tf_field117;
    private javax.swing.JTextField tf_field118;
    private javax.swing.JTextField tf_field119;
    private javax.swing.JTextField tf_field12;
    private javax.swing.JTextField tf_field120;
    private javax.swing.JTextField tf_field121;
    private javax.swing.JTextField tf_field122;
    private javax.swing.JTextField tf_field123;
    private javax.swing.JTextField tf_field124;
    private javax.swing.JTextField tf_field125;
    private javax.swing.JTextField tf_field126;
    private javax.swing.JTextField tf_field127;
    private javax.swing.JTextField tf_field128;
    private javax.swing.JTextField tf_field129;
    private javax.swing.JTextField tf_field13;
    private javax.swing.JTextArea tf_field130;
    private javax.swing.JTextField tf_field131;
    private javax.swing.JTextField tf_field132;
    private javax.swing.JTextField tf_field133;
    private javax.swing.JTextField tf_field134;
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
    private javax.swing.JTextField tf_field31;
    private javax.swing.JTextField tf_field32;
    private javax.swing.JTextField tf_field33;
    private javax.swing.JTextField tf_field34;
    private javax.swing.JTextField tf_field35;
    private javax.swing.JTextField tf_field36;
    private javax.swing.JTextField tf_field37;
    private javax.swing.JTextField tf_field38;
    private javax.swing.JTextField tf_field39;
    private javax.swing.JTextField tf_field4;
    private javax.swing.JTextField tf_field40;
    private javax.swing.JTextField tf_field41;
    private javax.swing.JTextField tf_field42;
    private javax.swing.JTextField tf_field43;
    private javax.swing.JTextField tf_field44;
    private javax.swing.JTextField tf_field45;
    private javax.swing.JTextField tf_field46;
    private javax.swing.JTextField tf_field47;
    private javax.swing.JTextField tf_field48;
    private javax.swing.JTextField tf_field49;
    private javax.swing.JTextField tf_field5;
    private javax.swing.JTextField tf_field50;
    private javax.swing.JTextField tf_field51;
    private javax.swing.JTextField tf_field52;
    private javax.swing.JTextField tf_field53;
    private javax.swing.JTextField tf_field54;
    private javax.swing.JTextField tf_field55;
    private javax.swing.JTextField tf_field56;
    private javax.swing.JTextField tf_field57;
    private javax.swing.JTextField tf_field58;
    private javax.swing.JTextField tf_field59;
    private javax.swing.JTextField tf_field6;
    private javax.swing.JTextField tf_field60;
    private javax.swing.JTextField tf_field61;
    private javax.swing.JTextField tf_field62;
    private javax.swing.JTextField tf_field63;
    private javax.swing.JTextField tf_field64;
    private javax.swing.JTextField tf_field65;
    private javax.swing.JTextField tf_field66;
    private javax.swing.JTextField tf_field67;
    private javax.swing.JTextField tf_field68;
    private javax.swing.JTextField tf_field69;
    private javax.swing.JTextField tf_field70;
    private javax.swing.JTextField tf_field71;
    private javax.swing.JTextField tf_field72;
    private javax.swing.JTextField tf_field73;
    private javax.swing.JTextField tf_field74;
    private javax.swing.JTextField tf_field75;
    private javax.swing.JTextField tf_field76;
    private javax.swing.JTextField tf_field77;
    private javax.swing.JTextField tf_field78;
    private javax.swing.JTextField tf_field79;
    private javax.swing.JTextField tf_field8;
    private javax.swing.JTextField tf_field80;
    private javax.swing.JTextField tf_field81;
    private javax.swing.JTextField tf_field82;
    private javax.swing.JTextField tf_field83;
    private javax.swing.JTextField tf_field84;
    private javax.swing.JTextField tf_field85;
    private javax.swing.JTextField tf_field86;
    private javax.swing.JTextField tf_field87;
    private javax.swing.JTextField tf_field88;
    private javax.swing.JTextField tf_field89;
    private javax.swing.JTextField tf_field9;
    private javax.swing.JTextField tf_field90;
    private javax.swing.JTextField tf_field91;
    private javax.swing.JTextField tf_field92;
    private javax.swing.JTextField tf_field93;
    private javax.swing.JTextField tf_field94;
    private javax.swing.JTextField tf_field95;
    private javax.swing.JTextField tf_field96;
    private javax.swing.JTextField tf_field97;
    private javax.swing.JTextField tf_field98;
    private javax.swing.JTextField tf_field99;
    private javax.swing.JTextField tf_lastname;
    private javax.swing.JTextField tf_period;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();

//        System.setProperty("pool_db", "db_cis_cosca");
//        System.setProperty("pool_password", "password");
        List<Academic_years.to_academic_years> acad_years = Academic_years.ret_data(" where status=1 ");
        if (!acad_years.isEmpty()) {
            Academic_years.to_academic_years to = (Academic_years.to_academic_years) acad_years.get(0);
//            Field.Input year = (Field.Input) tf_field2;
//            year.setText(to.years);
//            year.setId("" + to.id);
            academic_year_id = to.id;
        }
        init_tbl_enrollment_department_requirements(tbl_enrollment_department_requirements);
        init_tbl_academic_offering_subjects(tbl_academic_offering_subjects);
        init_tbl_enrollment_student_loaded_subjects(tbl_enrollment_student_loaded_subjects);

    }

    Enrollments.to_enrollments enroll = null;
    int academic_offering_id = 0;
    int academic_year_id = 0;

    public void do_pass(Enrollments.to_enrollments student, int is_dean) {
        if (is_dean == 0) {
            jButton9.setText("Approve Advising");
            if (student.advised_date != null && student.approved_date != null && student.assessed_date != null) {
//                if ((student.student_no != null) && (student.is_transferee !=2)) {
//                    jButton11.setEnabled(false);
//                }
                jButton9.setVisible(false);
                jTabbedPane2.setSelectedIndex(3);
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        set_assessment2();
                    }
                });
            } else {
                jTabbedPane2.remove(3);
            }
        } else {
            jTabbedPane2.remove(3);
        }

        enroll = student;
        set_loading_years(enroll.department_id, enroll.course_id);
        list_year2.clear();
        list_period.clear();
        list_year.clear();
        tf_field5.setText(student.first_name);
        tf_field6.setText(student.middle_name);

        tf_lastname.setText(student.last_name);
        tf_field8.setText(student.nick_name);

        tf_field104.setText(student.current_address);
        tf_field9.setText(student.permanent_address);
        tf_field10.setText(student.postal_code);
        tf_field11.setText(student.email_address);
        tf_field12.setText(student.tel_no);
        tf_field13.setText(student.mobile_no);

        try {
            Date d = DateType.sf.parse(student.date_of_birth);
            jDateChooser1.setDate(d);
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_dean_student_advice_details.class.getName()).log(Level.SEVERE, null, ex);
        }
        tf_field15.setText("" + student.age);
        if (student.gender == 1) {
            jCheckBox1.setSelected(true);
        } else {
            jCheckBox2.setSelected(true);
        }

        tf_field14.setText(student.place_of_birth);
        tf_field16.setText(student.citizenship);
        tf_field17.setText(student.religion);

        if (student.civil_status.equals("1")) {
            jCheckBox3.setSelected(true);
        } else if (student.civil_status.equals("2")) {
            jCheckBox4.setSelected(true);
        } else if (student.civil_status.equals("3")) {
            jCheckBox5.setSelected(true);
        } else {
            jCheckBox6.setSelected(true);
        }

        try {
            if (student.date_of_communion != null) {
                Date d1 = DateType.sf.parse(student.date_of_communion);
                jDateChooser2.setDate(d1);
            }
            if (student.date_of_confirmation != null) {
                Date d2 = DateType.sf.parse(student.date_of_confirmation);
                jDateChooser3.setDate(d2);
            }

        } catch (ParseException ex) {

        }
        tf_field18.setText(student.spouse_name);
        tf_field105.setText(student.indigenous_name);
        if (student.is_right_handed == 1) {
            jCheckBox10.setSelected(true);
        } else {
            jCheckBox9.setSelected(true);
        }

        tf_field19.setText(student.grade_school_name);
        tf_field22.setText(student.grade_school_region);
        tf_field25.setText(student.grade_school_school_year);
        tf_field112.setText(student.grade_school_awards);

        tf_field106.setText(student.junior_high_name);
        tf_field107.setText(student.junior_high_region);
        tf_field108.setText(student.junior_high_year);
        tf_field113.setText(student.junior_high_awards);

        tf_field20.setText(student.high_school_name);
        tf_field23.setText(student.high_school_region);
        tf_field26.setText(student.high_school_school_year);
        tf_field114.setText(student.high_school_awards);

        tf_field21.setText(student.college_school_name);
        tf_field24.setText(student.college_school_region);
        tf_field27.setText(student.college_school_school_year);
        tf_field116.setText(student.college_awards);

        tf_field109.setText(student.tesda_name);
        tf_field110.setText(student.tesda_region);
        tf_field111.setText(student.tesda_year);
        tf_field115.setText(student.tesda_awards);

        tf_field28.setText(student.preferred_course1);
        tf_field29.setText(student.preferred_course2);
        tf_field30.setText(student.preferred_course3);

        tf_field31.setText(student.father_name);
        tf_field33.setText(student.father_citizenship);
        tf_field35.setText(student.father_home_address);
        tf_field36.setText(student.father_email_address);
        tf_field42.setText(student.father_mobile_no);
        tf_field40.setText(student.father_occupation);
        tf_field43.setText(student.father_employer);
        tf_field44.setText(student.father_business_address);
        tf_field51.setText(student.father_business_tel_no);
        tf_field47.setText(student.father_educational_attainment);
        tf_field48.setText(student.father_last_school_attended);

        tf_field32.setText(student.mother_name);
        tf_field34.setText(student.mother_citizenship);
        tf_field37.setText(student.mother_home_address);
        tf_field38.setText(student.mother_email_address);
        tf_field39.setText(student.mother_mobile_no);
        tf_field41.setText(student.mother_occupation);
        tf_field45.setText(student.mother_employer);
        tf_field46.setText(student.mother_business_address);
        tf_field52.setText(student.mother_business_tel_no);
        tf_field49.setText(student.mother_educational_attainment);
        tf_field50.setText(student.mother_last_school_attended);

        tf_field101.setText(student.guardian_name);
        tf_field102.setText(student.guardian_mailing_address);
        tf_field103.setText(student.guardian_telephone_no);

        String[] siblings1 = student.sibling1.split("%");
        String[] siblings2 = student.sibling2.split("%");
        String[] siblings3 = student.sibling3.split("%");
        String[] siblings4 = student.sibling4.split("%");
        String[] siblings5 = student.sibling5.split("%");
        String[] siblings6 = student.sibling6.split("%");
        String[] siblings7 = student.sibling7.split("%");
        String[] siblings8 = student.sibling8.split("%");

        try {
            tf_field53.setText(siblings1[0]);
            tf_field54.setText(siblings1[1]);
            tf_field55.setText(siblings1[2]);
            tf_field56.setText(siblings1[3]);
            tf_field57.setText(siblings1[4]);
            tf_field58.setText(siblings1[5]);
            tf_field117.setText(siblings1[6]);

            tf_field59.setText(siblings2[0]);
            tf_field60.setText(siblings2[1]);
            tf_field61.setText(siblings2[2]);
            tf_field62.setText(siblings2[3]);
            tf_field63.setText(siblings2[4]);
            tf_field64.setText(siblings2[5]);
            tf_field118.setText(siblings2[6]);

            tf_field65.setText(siblings3[0]);
            tf_field66.setText(siblings3[1]);
            tf_field67.setText(siblings3[2]);
            tf_field68.setText(siblings3[3]);
            tf_field69.setText(siblings3[4]);
            tf_field70.setText(siblings3[5]);
            tf_field119.setText(siblings3[6]);

            tf_field71.setText(siblings4[0]);
            tf_field72.setText(siblings4[1]);
            tf_field73.setText(siblings4[2]);
            tf_field74.setText(siblings4[3]);
            tf_field75.setText(siblings4[4]);
            tf_field76.setText(siblings4[5]);
            tf_field120.setText(siblings4[6]);

            tf_field83.setText(siblings5[0]);
            tf_field85.setText(siblings5[1]);
            tf_field86.setText(siblings5[2]);
            tf_field87.setText(siblings5[3]);
            tf_field88.setText(siblings5[4]);
            tf_field89.setText(siblings5[5]);
            tf_field121.setText(siblings5[6]);

            tf_field90.setText(siblings6[0]);
            tf_field91.setText(siblings6[1]);
            tf_field92.setText(siblings6[2]);
            tf_field93.setText(siblings6[3]);
            tf_field94.setText(siblings6[4]);
            tf_field95.setText(siblings6[5]);
            tf_field122.setText(siblings6[6]);

            tf_field77.setText(siblings7[0]);
            tf_field78.setText(siblings7[1]);
            tf_field79.setText(siblings7[2]);
            tf_field80.setText(siblings7[3]);
            tf_field81.setText(siblings7[4]);
            tf_field82.setText(siblings7[5]);
            tf_field123.setText(siblings7[6]);

            tf_field84.setText(siblings8[0]);
            tf_field96.setText(siblings8[1]);
            tf_field97.setText(siblings8[2]);
            tf_field98.setText(siblings8[3]);
            tf_field99.setText(siblings8[4]);
            tf_field100.setText(siblings8[5]);
            tf_field124.setText(siblings8[6]);
        } catch (Exception e) {
        }

        Field.Input cou = (Field.Input) tf_field131;
        Field.Input dep = (Field.Input) tf_field125;
        Field.Input lev = (Field.Input) tf_field126;

        cou.setId("" + enroll.course_id);
        cou.setText(enroll.course_code);
        tf_field2.setText(enroll.course_code);
        tf_field130.setText(enroll.course_description);
        tf_field132.setText(enroll.term);

        dep.setId("" + enroll.department_id);
        dep.setText(enroll.department);

        lev.setId("" + enroll.level_id);
        lev.setText(enroll.level);

        if (enroll.department_id != 0) {
            ret_enrollment_requirements();
            tf_field128.setText(enroll.year_level);
        } else {

        }
        tf_period.setText(enroll.period);
        if (enroll.course_id != 0) {

            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    Field.Input cou2 = (Field.Input) tf_field2;
                    cou.setId("" + enroll.course_id);
                    cou.setText(enroll.course_code);
                    jTextArea1.setText(enroll.course_description);
                    String where = " where course_id='" + enroll.course_id + "' and academic_year_id='" + enroll.academic_year_id + "' ";
                    List<Academic_offerings.to_academic_offerings> courses = Academic_offerings.ret_data(where);

                    if (!courses.isEmpty()) {
                        Academic_offerings.to_academic_offerings course = (Academic_offerings.to_academic_offerings) courses.get(0);
                        academic_offering_id = course.id;
                        tf_field3.setText("" + course.no_of_years);

                        String where2 = " where academic_year_id='" + course.academic_year_id + "' and department_id='" + course.department_id + "' ";
                        List<Academic_year_periods.to_academic_year_periods> acad = Academic_year_periods.ret_data(where2);
                        String period = "";
                        if (!acad.isEmpty()) {
                            Academic_year_periods.to_academic_year_periods ayp = (Academic_year_periods.to_academic_year_periods) acad.get(0);
//                            tf_lastname.setText("" + ayp.period);
                            period = ayp.period;
                        }

                        String[] semester = {"First Semester", "Second Semester", "Summer Class"};
                        String[] trimester = {"First Trimester", "Second Trimester", "Summer Class"};
                        String[] years = {"First Year", "Second Year", "Third Year", "Fourth Year", "Fifth Year"};

                        for (int i = 0; i < course.no_of_years; i++) {
                            list_year2.add(years[i]);
                        }

                        if (!list_year2.isEmpty()) {
                            tf_field4.setText("" + list_year2.get(0));
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
                            tf_field129.setText("" + list_period.get(0));
                            period_term = "" + list_period.get(0);
                        }

                    }
                }
            });

        }

        jDateChooser1.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                int year = FitIn.toInt(DateType.y.format(jDateChooser1.getDate()));
                int month = FitIn.toInt(DateType.m1.format(jDateChooser1.getDate()));
                int day = FitIn.toInt(DateType.d.format(jDateChooser1.getDate()));
                int age = DateType.calculateAge(year, month, day);
                tf_field15.setText("" + age);
            }
        });

        //set image 
        String image_server = System.getProperty("image_server", "");

        if (!image_server.isEmpty()) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    String source = "\\\\" + image_server + "\\cis\\cis_images\\enrollments\\" + student.enrollment_no + ".jpg";
//            System.out.println("source: " + source);
                    File sourceFile = new File(source);
                    if (sourceFile.exists()) {
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
//
                    } else {

                        try {
                            String home = System.getProperty("user.home", "C:\\Users\\Guinness");
                            FileInputStream inputStream = null;
                            File sourceFile1 = new File("\\\\" + image_server + "\\cis\\cis_images\\enrollment\\" + student.enrollment_no + ".jpg");
                            File destinationFile = new File(home + "\\images_cis\\enrollments\\" + student.enrollment_no + ".jpg");
                            inputStream = new FileInputStream(sourceFile1);
                            FileOutputStream outputStream = new FileOutputStream(destinationFile);
                            FileChannel inChannel = inputStream.getChannel();
                            FileChannel outChannel = outputStream.getChannel();
                            try {
                                inChannel.transferTo(0, inChannel.size(), outChannel);

                            } finally {
                                inChannel.close();
                                outChannel.close();
                                inputStream.close();
                                outputStream.close();

                                String orig_file = home + "\\images_cis\\enrollments\\" + student.enrollment_no + ".jpg";
                                File sourceFile2 = new File(orig_file);
                                BufferedImage img = null;
                                try {
                                    img = ImageIO.read(sourceFile2);
                                    Image dimg = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(),
                                                                       Image.SCALE_SMOOTH);
                                    ImageIcon imageIcon = new ImageIcon(dimg);
                                    jLabel1.setIcon(imageIcon);
                                } catch (IOException e) {
                                    System.out.println(e);
                                }
                            }
                        } catch (IOException e) {
                            System.out.println(e);
                        }

                    }
                }
            });

        }
        ret_loaded_subjects();
    }

    String period_term = "First Semester";

    private void check_status() {
        if (jCheckBox4.isSelected()) {
            tf_field18.setEnabled(true);
        } else {
            tf_field18.setEnabled(false);
            tf_field18.setText("");
        }
    }

    private void check_indigenous() {
        if (jCheckBox11.isSelected()) {
            tf_field105.setEnabled(true);
        } else {
            tf_field105.setEnabled(false);
            tf_field105.setText("");
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
                              ok();
                          }
                      });
    }

    private void ok() {
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData());
        }
    }
    // </editor-fold>
    List<String> list_year2 = new ArrayList();
    List<String> list_period = new ArrayList();
    List<String> list_year = new ArrayList();

    private void init_years() {
        Object[][] obj = new Object[list_year2.size()][1];
        int i = 0;
        for (String to : list_year2) {
            obj[i][0] = " " + to;

            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field128.getWidth()};
        int width = 0;
        String[] col_names = {"", "", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field128, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                String to = list_year.get(data.selected_row);
                tf_field128.setText("" + to);

            }
        });
    }

    private void init_years2(JTextField tf) {
        Object[][] obj = new Object[list_year2.size()][1];
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
                ret_offered_subjects();
            }
        });
    }

    private void init_years3(JTextField tf) {
        Object[][] obj = new Object[list_year2.size()][1];
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
                ret_loaded_subjects();
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
                ret_offered_subjects();
            }
        });
    }

    private void init_period2() {
        Object[][] obj = new Object[list_period.size()][1];
        int i = 0;
        for (String to : list_period) {
            obj[i][0] = " " + to;

            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field134.getWidth()};
        int width = 0;
        String[] col_names = {"", "", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field134, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                String to = list_period.get(data.selected_row);
                tf_field134.setText("" + to);
                ret_loaded_subjects();
            }
        });
    }

    private void save_application() {

        if (tf_field5.getText().isEmpty()) {
            tf_field5.grabFocus();
            Alert.set(0, "Input First name");
            return;
        }
        if (tf_lastname.getText().isEmpty()) {
            tf_lastname.grabFocus();
            Alert.set(0, "Input Last name");
            return;
        }
        int age2 = FitIn.toInt(tf_field15.getText());
        if (age2 <= 3) {
            Alert.set(0, "Input Birthdate");
            return;
        }

        int id = enroll.id;
        String enrollment_no = enroll.enrollment_no;
        int is_transferee = enroll.is_transferee;

        int academic_year_id = enroll.academic_year_id;
        String academic_year = enroll.academic_year;
        int curriculum_id = enroll.curriculum_id;
        int course_id = 0;
        String course_code = "";
        String course_description = "";
        String term = "";
        String encoded_by_id = MyUser.getUser_id();
        String encoded_by = MyUser.getUser_screen_name();
        String encoded_date = DateType.now();
        String assessed_by_id = "";
        String assessed_by = "";
        String assessed_date = null;
        String advised_by_id = "";
        String advised_by = "";
        String advised_date = null;
        String approved_by_id = "";
        String approved_by = "";
        String approved_date = null;
        String student_no = null;
        String last_name = tf_lastname.getText();
        String first_name = tf_field5.getText();
        String middle_name = tf_field6.getText();
        String nick_name = tf_field8.getText();
        String current_address = tf_field104.getText();
        String permanent_address = tf_field9.getText();
        String email_address = tf_field11.getText();
        String postal_code = tf_field10.getText();
        String tel_no = tf_field12.getText();
        String mobile_no = tf_field13.getText();
        String date_of_birth = DateType.sf.format(jDateChooser1.getDate());
        String place_of_birth = tf_field14.getText();
        int age = FitIn.toInt(tf_field15.getText());
        int gender = 0;
        if (jCheckBox1.isSelected()) {
            gender = 1;
        }
        String citizenship = tf_field16.getText();
        String religion = tf_field17.getText();
        String civil_status = "1";
        if (jCheckBox4.isSelected()) {
            civil_status = "2";
        }
        if (jCheckBox5.isSelected()) {
            civil_status = "3";
        }
        if (jCheckBox6.isSelected()) {
            civil_status = "4";
        }
        String spouse_name = tf_field18.getText();
        String date_of_communion = null;
        String date_of_confirmation = null;
        try {
            date_of_communion = DateType.sf.format(jDateChooser2.getDate());
            date_of_confirmation = DateType.sf.format(jDateChooser3.getDate());
        } catch (Exception e) {
        }
        int is_right_hande = 0;
        if (jCheckBox10.isSelected()) {
            is_right_hande = 1;
        }

        int is_indigenous = 0;
        if (jCheckBox11.isSelected()) {
            is_indigenous = 1;
        }
        String indigenous_name = tf_field105.getText();

        int level_id = 0;
        String level = null;
        int college_id = 0;
        String college = null;
        int department_id = 0;
        String department = null;
        String year_level = null;
        String year_level_status = null;

        String preferred_course1 = tf_field28.getText();
        String preferred_course2 = tf_field29.getText();
        String preferred_course3 = tf_field30.getText();

        String father_name = tf_field31.getText();
        String father_citizenship = tf_field33.getText();
        String father_home_address = tf_field35.getText();
        String father_email_address = tf_field36.getText();
        String father_mobile_no = tf_field42.getText();
        String father_occupation = tf_field40.getText();
        String father_employer = tf_field43.getText();
        String father_business_address = tf_field44.getText();
        String father_business_tel_no = tf_field51.getText();
        String father_educational_attainment = tf_field47.getText();
        String father_last_school_attended = tf_field48.getText();

        String mother_name = tf_field32.getText();
        String mother_citizenship = tf_field34.getText();
        String mother_home_address = tf_field37.getText();
        String mother_email_address = tf_field38.getText();
        String mother_mobile_no = tf_field39.getText();
        String mother_occupation = tf_field41.getText();
        String mother_employer = tf_field45.getText();
        String mother_business_address = tf_field46.getText();
        String mother_business_tel_no = tf_field52.getText();
        String mother_educational_attainment = tf_field49.getText();
        String mother_last_school_attended = tf_field50.getText();

        String guardian_name = tf_field101.getText();
        String guardian_mailing_address = tf_field102.getText();
        String guardian_telephone_no = tf_field103.getText();

        String grade_school_name = tf_field19.getText();
        String grade_school_region = tf_field22.getText();
        String grade_school_school_year = tf_field25.getText();
        String grade_school_awards = tf_field112.getText();

        String high_school_name = tf_field20.getText();
        String high_school_region = tf_field23.getText();
        String high_school_school_year = tf_field26.getText();
        String high_school_awards = tf_field114.getText();

        String college_school_name = tf_field21.getText();
        String college_school_region = tf_field24.getText();
        String college_school_school_year = tf_field27.getText();
        String college_awards = tf_field116.getText();

        String junior_high_name = tf_field106.getText();
        String junior_high_region = tf_field107.getText();
        String junior_high_year = tf_field108.getText();
        String junior_high_awards = tf_field113.getText();

        String tesda_name = tf_field109.getText();
        String tesda_region = tf_field110.getText();
        String tesda_year = tf_field111.getText();
        String tesda_awards = tf_field115.getText();

        String sibling1 = concat_s(tf_field53, tf_field54, tf_field55, tf_field56, tf_field57, tf_field58, tf_field117);
        String sibling2 = concat_s(tf_field59, tf_field60, tf_field61, tf_field62, tf_field63, tf_field64, tf_field118);
        String sibling3 = concat_s(tf_field65, tf_field66, tf_field67, tf_field68, tf_field69, tf_field70, tf_field119);
        String sibling4 = concat_s(tf_field71, tf_field72, tf_field73, tf_field74, tf_field75, tf_field76, tf_field120);
        String sibling5 = concat_s(tf_field83, tf_field85, tf_field86, tf_field87, tf_field88, tf_field89, tf_field121);
        String sibling6 = concat_s(tf_field90, tf_field91, tf_field92, tf_field93, tf_field94, tf_field95, tf_field122);
        String sibling7 = concat_s(tf_field77, tf_field78, tf_field79, tf_field80, tf_field81, tf_field82, tf_field122);
        String sibling8 = concat_s(tf_field84, tf_field96, tf_field97, tf_field98, tf_field99, tf_field100, tf_field124);

        String created_at = DateType.now();
        String updated_at = DateType.now();
        String created_by = MyUser.getUser_id();
        String updated_by = MyUser.getUser_id();
        int status = 0;
        int is_uploaded = 0;
        String date_enrolled = "";
        int student_id = 0;
        String period = "";
        Enrollments.to_enrollments enroll2 = new Enrollments.to_enrollments(id, enrollment_no, is_transferee, academic_year_id, academic_year, curriculum_id, course_id, course_code, course_description, term, encoded_by_id, encoded_by, encoded_date, assessed_by_id, assessed_by, assessed_date, advised_by_id, advised_by, advised_date, approved_by_id, approved_by, approved_date, student_no, last_name, first_name, middle_name, nick_name, current_address, permanent_address, email_address, postal_code, tel_no, mobile_no, date_of_birth, place_of_birth, age, gender, citizenship, religion, civil_status, spouse_name, date_of_communion, date_of_confirmation, is_right_hande, is_indigenous, indigenous_name, level_id, level, college_id, college, department_id, department, year_level, year_level_status, preferred_course1, preferred_course2, preferred_course3, father_name, father_citizenship, father_home_address, father_email_address, father_mobile_no, father_occupation, father_employer, father_business_address, father_business_tel_no, father_educational_attainment, father_last_school_attended, mother_name, mother_citizenship, mother_home_address, mother_email_address, mother_mobile_no, mother_occupation, mother_employer, mother_business_address, mother_business_tel_no, mother_educational_attainment, mother_last_school_attended, guardian_name, guardian_mailing_address, guardian_telephone_no, grade_school_name, grade_school_region, grade_school_school_year, grade_school_awards, high_school_name, high_school_region, high_school_school_year, high_school_awards, college_school_name, college_school_region, college_school_school_year, college_awards, junior_high_name, junior_high_region, junior_high_year, junior_high_awards, tesda_name, tesda_region, tesda_year, tesda_awards, sibling1, sibling2, sibling3, sibling4, sibling5, sibling6, sibling7, sibling8, created_at, updated_at, created_by, updated_by, status, is_uploaded, date_enrolled, student_id, false, period);

        Window p = (Window) this;
        Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
        nd.setTitle("");
//        nd.do_pass(services);
        nd.setCallback(new Dlg_confirm_action.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                closeDialog.ok();

                Enrollments.update_data(enroll2);
                Alert.set(2, "");

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private String concat_s(JTextField tf1, JTextField tf2, JTextField tf3, JTextField tf4, JTextField tf5, JTextField tf6, JTextField tf7) {
        String ret = tf1.getText() + "%" + tf2.getText() + "%" + tf3.getText() + "%" + tf4.getText() + "%" + tf5.getText() + "%" + tf6.getText() + "%" + tf7.getText();
        return ret;
    }

    private void clear_fields() {
        JTextField[] tfs = {tf_lastname, tf_field5, tf_field6, tf_field8, tf_field9, tf_field11, tf_field10, tf_field12, tf_field13, tf_field14, tf_field15,
            tf_field16, tf_field17, tf_field18, tf_field28, tf_field29, tf_field30, tf_field31, tf_field33, tf_field35, tf_field36, tf_field42, tf_field40, tf_field43,
            tf_field44, tf_field51, tf_field47, tf_field48, tf_field32, tf_field34, tf_field37, tf_field38, tf_field39, tf_field41, tf_field45, tf_field46, tf_field52,
            tf_field49, tf_field50, tf_field101, tf_field102, tf_field103, tf_field19, tf_field22, tf_field25, tf_field20, tf_field23, tf_field26, tf_field21, tf_field24, tf_field27,
            tf_field53, tf_field54, tf_field55, tf_field56, tf_field57, tf_field58, tf_field59, tf_field60, tf_field61, tf_field62, tf_field63, tf_field64,
            tf_field65, tf_field66, tf_field67, tf_field68, tf_field69, tf_field70, tf_field71, tf_field72, tf_field73, tf_field74, tf_field75, tf_field76,
            tf_field83, tf_field85, tf_field86, tf_field87, tf_field88, tf_field89, tf_field90, tf_field91, tf_field92, tf_field93, tf_field94, tf_field95,
            tf_field77, tf_field78, tf_field79, tf_field80, tf_field81, tf_field82, tf_field84, tf_field96, tf_field97, tf_field98, tf_field99, tf_field100

        };

        for (JTextField tf : tfs) {
            tf.setText("");
        }
        tf_field5.grabFocus();
    }

    private void init_courses() {
        String where = " where course_code like '%" + tf_field127.getText() + "%' and academic_year_id='" + enroll.academic_year_id + "' and status=1 "
                + " or course_description like '%" + tf_field127.getText() + "%' and academic_year_id='" + enroll.academic_year_id + "'  and status=1 "
                + " order by course_description asc ";
        List<Academic_offerings.to_academic_offerings> offer = Academic_offerings.ret_data(where);
        Object[][] obj = new Object[offer.size()][3];
        int i = 0;
        for (Academic_offerings.to_academic_offerings to : offer) {
            obj[i][0] = " " + to.course_code;
            obj[i][1] = " " + to.course_description;
            obj[i][2] = " " + to.no_of_years;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {100, tf_field127.getWidth() - 150, 50};
        int width = 0;
        String[] col_names = {"", "", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup2(tf_field127, obj, labels, tbl_widths_customers, col_names, tf_field127.getWidth() + 200);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Academic_offerings.to_academic_offerings off = offer.get(data.selected_row);

                Field.Input cou = (Field.Input) tf_field131;
                Field.Input dep = (Field.Input) tf_field125;
                Field.Input lev = (Field.Input) tf_field126;

                cou.setText(off.course_code);
                cou.setId("" + off.course_id);
                tf_field132.setText("" + off.no_of_years);
                tf_field130.setText(off.course_description);

                dep.setId("" + off.department_id);
                dep.setText(off.department_name);

                lev.setId("" + off.college_id);
                lev.setText(off.college);

                String[] years = {"First Year", "Second Year", "Third Year", "Fourth Year", "Fifth Year"};
                for (int i = 0; i < off.no_of_years; i++) {
                    list_year.add(years[i]);
                }
                String period = "First Semester";
                String where = " where academic_year_id='" + academic_year_id + "' and department_id ='" + dep.getId() + "' and status=1 ";
                List<Academic_year_period_schedules.to_academic_year_period_schedules> periods = Academic_year_period_schedules.ret_data(where);
                if (!periods.isEmpty()) {
                    Academic_year_period_schedules.to_academic_year_period_schedules per = (Academic_year_period_schedules.to_academic_year_period_schedules) periods.get(0);
                    period = per.period;
                    tf_period.setText(period);
                }
            }
        });
    }

    private void save_year_course() {

        Window p = (Window) this;
        Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
        nd.setTitle("");
//        nd.do_pass(services);
        nd.setCallback(new Dlg_confirm_action.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                closeDialog.ok();
                Field.Input cou = (Field.Input) tf_field131;
                Field.Input dep = (Field.Input) tf_field125;
                Field.Input lev = (Field.Input) tf_field126;

                int id = enroll.id;
                int course_id = FitIn.toInt(cou.getId());
                String course_code = cou.getText();
                String course_description = tf_field130.getText();
                int level_id = FitIn.toInt(lev.getId());
                String level = lev.getText();
                int college_id = FitIn.toInt(lev.getId());
                String college = lev.getText();
                int department_id = FitIn.toInt(dep.getId());
                String department = dep.getText();
                String year_level = tf_field128.getText();
                String term = tf_field132.getText();
                String period = tf_period.getText();
                Enrollments.update_enroll_course(id, course_id, course_code, course_description, level_id, level, college_id, college, department_id, department, year_level, term, period);
                Alert.set(2, "");

                tf_field2.setText(course_code);
                jTextArea1.setText(course_description);
                tf_field3.setText(tf_field132.getText());

                ret_enrollment_requirements();
                set_loading_years(department_id, course_id);
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void set_loading_years(int department_id, int course_id) {

        String where = " where course_id='" + course_id + "' and academic_year_id='" + enroll.academic_year_id + "' ";
        List<Academic_offerings.to_academic_offerings> courses = Academic_offerings.ret_data(where);
        if (!courses.isEmpty()) {
            Academic_offerings.to_academic_offerings course = (Academic_offerings.to_academic_offerings) courses.get(0);
            academic_offering_id = course.id;
        }

        int no_of_years = FitIn.toInt(tf_field132.getText());
        String where2 = " where academic_year_id='" + enroll.academic_year_id + "' and department_id='" + department_id + "' ";
        List<Academic_year_periods.to_academic_year_periods> acad = Academic_year_periods.ret_data(where2);
        String period = "";
        if (!acad.isEmpty()) {
            Academic_year_periods.to_academic_year_periods ayp = (Academic_year_periods.to_academic_year_periods) acad.get(0);
            tf_lastname.setText("" + ayp.period);
            period = ayp.period;
        }

        String[] semester = {"First Semester", "Second Semester", "Summer Class"};
        String[] trimester = {"First Trimester", "Second Trimester", "Summer Class"};
        String[] years = {"First Year", "Second Year", "Third Year", "Fourth Year", "Fifth Year"};

        for (int i = 0; i < no_of_years; i++) {
            list_year2.add(years[i]);
        }

        if (!list_year2.isEmpty()) {
            tf_field4.setText("" + list_year2.get(0));
        }
        System.out.println("list_year2: " + list_year2.size());
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
            tf_field129.setText("" + list_period.get(0));
        }
    }

    //<editor-fold defaultstate="collapsed" desc=" enrollment_department_requirements "> 
    public static ArrayListModel tbl_enrollment_department_requirements_ALM;
    public static Tblenrollment_department_requirementsModel tbl_enrollment_department_requirements_M;

    public static void init_tbl_enrollment_department_requirements(JTable tbl_enrollment_department_requirements) {
        tbl_enrollment_department_requirements_ALM = new ArrayListModel();
        tbl_enrollment_department_requirements_M = new Tblenrollment_department_requirementsModel(tbl_enrollment_department_requirements_ALM);
        tbl_enrollment_department_requirements.setModel(tbl_enrollment_department_requirements_M);
        tbl_enrollment_department_requirements.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_enrollment_department_requirements.setRowHeight(25);
        int[] tbl_widths_enrollment_department_requirements = {100, 40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_enrollment_department_requirements.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_enrollment_department_requirements, i, tbl_widths_enrollment_department_requirements[i]);
        }
        Dimension d = tbl_enrollment_department_requirements.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_enrollment_department_requirements.getTableHeader().setPreferredSize(d);
        tbl_enrollment_department_requirements.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_enrollment_department_requirements.setRowHeight(25);
        tbl_enrollment_department_requirements.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_enrollment_department_requirements(List<to_enrollment_department_requirements> acc) {
        tbl_enrollment_department_requirements_ALM.clear();
        tbl_enrollment_department_requirements_ALM.addAll(acc);
    }

    public static class Tblenrollment_department_requirementsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Requirement", "", "enrollment_no", "academic_year_id", "academic_year", "department_id", "department", "requirements", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded"
        };

        public Tblenrollment_department_requirementsModel(ListModel listmodel) {
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
            if (col == 1) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            to_enrollment_department_requirements tt = (to_enrollment_department_requirements) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.requirements;
                case 1:
                    return tt.selected;
                case 2:
                    return tt.enrollment_no;
                case 3:
                    return tt.academic_year_id;
                case 4:
                    return tt.academic_year;
                case 5:
                    return tt.department_id;
                case 6:
                    return tt.department;
                case 7:
                    return tt.requirements;
                case 8:
                    return tt.created_at;
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

    private void ret_enrollment_requirements() {
        Field.Input dep = (Field.Input) tf_field125;
        int department_id = FitIn.toInt(dep.getId());
        int enrollment_id = enroll.id;
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                List<to_enrollment_department_requirements> datas = Enrollment_department_requirements.ret_data_selected(department_id, enrollment_id);
                loadData_enrollment_department_requirements(datas);
                jLabel3.setText("" + datas.size());
            }
        });

    }

    private void select_enrollment_requirement() {
        int row = tbl_enrollment_department_requirements.getSelectedRow();
        if (row < 0) {
            return;
        }

        to_enrollment_department_requirements to = (to_enrollment_department_requirements) tbl_enrollment_department_requirements_ALM.get(row);
        int col = tbl_enrollment_department_requirements.getSelectedColumn();
        if (col == 1) {
            System.out.println("to: " + to.id);
            if (to.id == 0) {
                Field.Input cou = (Field.Input) tf_field131;
                Field.Input dep = (Field.Input) tf_field125;
                Field.Input lev = (Field.Input) tf_field126;

                int id = 0;
                int enrollment_id = enroll.id;
                String enrollment_no = enroll.enrollment_no;
                int academic_year_id = enroll.academic_year_id;
                String academic_year = enroll.academic_year;
                int department_id = FitIn.toInt(dep.getId());
                String department = dep.getText();
                int department_requirement_id = to.is_uploaded;
                String requirements = to.requirements;
                String created_at = DateType.now();
                String updated_at = DateType.now();
                String created_by = MyUser.getUser_id();
                String updated_by = MyUser.getUser_id();
                int status = 1;
                int is_uploaded = 0;
                boolean selected = false;

                Window p = (Window) this;
                Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
                nd.setTitle("");

                nd.setCallback(new Dlg_confirm_action.Callback() {

                    @Override
                    public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                        closeDialog.ok();
                        to_enrollment_department_requirements to2 = new to_enrollment_department_requirements(id, enrollment_id, enrollment_no, academic_year_id, academic_year, department_id, department, department_requirement_id, requirements, created_at, updated_at, created_by, updated_by, status, is_uploaded, selected);
                        Enrollment_department_requirements.add_data(to2);
                        Alert.set(1, "");
                        ret_enrollment_requirements();
                    }
                });
                nd.setLocationRelativeTo(jScrollPane1);
                nd.setVisible(true);

            } else {

                Window p = (Window) this;
                Dlg_confirm_delete nd = Dlg_confirm_delete.create(p, true);
                nd.setTitle("");
//                nd.do_pass(services);
                nd.setCallback(new Dlg_confirm_delete.Callback() {

                    @Override
                    public void ok(CloseDialog closeDialog, Dlg_confirm_delete.OutputData data) {
                        closeDialog.ok();
                        Enrollment_department_requirements.delete_data(to);
                        Alert.set(3, "");
                        ret_enrollment_requirements();
                    }
                });
                nd.setLocationRelativeTo(jScrollPane1);
                nd.setVisible(true);

            }
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

                String course = "Bachelor of Science Major in Philosophy";

                String school_name = System.getProperty("school_name", "Colegio de Santa Catalina de Alejandria");
                String school_year = enroll.academic_year;
                String date_printed = DateType.month_date.format(new Date());
                String printed_by = MyUser.getUser_screen_name();
                Field.Input cou = (Field.Input) tf_field131;

                String where = " where academic_offering_id='" + cou.getId() + "' ";
                List<Srpt_academic_offering_subjects.field> fields = Srpt_academic_offering_subjects.ret_data_with_prerequisites(where);
                String jrxml = "rpt_academic_offering_subjects.jrxml";
                Srpt_academic_offering_subjects rpt = new Srpt_academic_offering_subjects(school_name, school_year, date_printed, printed_by, course);
                rpt.fields.addAll(fields);

                report_subjects(rpt, jrxml);
                jTabbedPane1.setSelectedIndex(1);
                jProgressBar1.setString("Finished...");
                jProgressBar1.setIndeterminate(false);
            }
        });
        t.start();

    }

    private void report_subjects(final Srpt_academic_offering_subjects to, String jrxml_name) {
        jPanel27.removeAll();
        jPanel27.setLayout(new BorderLayout());
        try {
            JRViewer viewer = get_viewer_subjects(to, jrxml_name);
            JPanel pnl = new JPanel();
            pnl.add(viewer);
            pnl.setVisible(true);
            pnl.setVisible(true);
            jPanel27.add(viewer);
            jPanel27.updateUI();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer_subjects(Srpt_academic_offering_subjects to, String rpt_name) {
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
            InputStream is = Srpt_academic_offering_subjects.class.
                    getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    //<editor-fold defaultstate="collapsed" desc=" academic_offering_subjects "> 
    public static ArrayListModel tbl_academic_offering_subjects_ALM;
    public static Tblacademic_offering_subjectsModel tbl_academic_offering_subjects_M;

    private void init_tbl_academic_offering_subjects(JTable tbl_academic_offering_subjects) {
        tbl_academic_offering_subjects_ALM = new ArrayListModel();
        tbl_academic_offering_subjects_M = new Tblacademic_offering_subjectsModel(tbl_academic_offering_subjects_ALM);
        tbl_academic_offering_subjects.setModel(tbl_academic_offering_subjects_M);
        tbl_academic_offering_subjects.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_academic_offering_subjects.setRowHeight(25);
        int[] tbl_widths_academic_offering_subjects = {100, 100, 40, 40, 40, 40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
            List<to_academic_offering_subjects> datas = tbl_academic_offering_subjects_ALM;
            boolean selected = false;
            if (this.isSelected()) {
                selected = true;
            }
            for (to_academic_offering_subjects to : datas) {
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

    public static void loadData_academic_offering_subjects(List<to_academic_offering_subjects> acc) {
        tbl_academic_offering_subjects_ALM.clear();
        tbl_academic_offering_subjects_ALM.addAll(acc);
    }

    public static class Tblacademic_offering_subjectsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Subject Code", "Description", "Lec", "Lab", "", "", "college_id", "college", "department_id", "department", "course_id", "course_code", "course_description", "term", "year_level", "subject_id", "subject_code", "description", "units", "lecture_units", "lab_units", "amount", "is_lab", "max_students", "prerequisite_subject_ids", "subject_group", "subject_group_id", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded", "faculty_id", "faculty_name", "room", "schedule", "room_id"
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
            to_academic_offering_subjects tt = (to_academic_offering_subjects) getRow(row);
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

    private void ret_offered_subjects() {
        String where = " where id<>0 ";
        if (!jCheckBox7.isSelected()) {
            where = where + " and year_level like '" + tf_field4.getText() + "' ";
        }
        if (!jCheckBox8.isSelected()) {
            where = where + " and term like '" + tf_field129.getText() + "' ";
        }
        where = where + " and academic_offering_id='" + academic_offering_id + "' order by description asc  ";
//        System.out.println("where: " + where);;
        List<to_academic_offering_subjects> subjects = Academic_offering_subjects.ret_data(where);
        loadData_academic_offering_subjects(subjects);
        jLabel5.setText("" + subjects.size());
    }

    private void select_aos() {
        int row = tbl_academic_offering_subjects.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_academic_offering_subjects to = (to_academic_offering_subjects) tbl_academic_offering_subjects_ALM.get(row);
        int col = tbl_academic_offering_subjects.getSelectedColumn();
        if (col == 4) {
            Window p = (Window) this;
            Dlg_dean_student_advice_load_subject nd = Dlg_dean_student_advice_load_subject.create(p, true);
            nd.setTitle("");
            nd.do_pass(to, academic_year_id, enroll);
            nd.setCallback(new Dlg_dean_student_advice_load_subject.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, Dlg_dean_student_advice_load_subject.OutputData data) {
                    closeDialog.ok();
                    int id = 0;
                    int enrollment_id = enroll.id;
                    String enrollment_no = enroll.enrollment_no;
                    int student_id = 0;
                    String student_no = "";
                    String fname = enroll.first_name;
                    String mi = enroll.middle_name;
                    String lname = enroll.last_name;
                    int enrollment_offered_subject_section_id = data.to.id;
                    int enrollment_offered_subject_id = data.to.enrollment_offered_subject_id;
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
                    int subject_id = to.subject_id;
                    String subject_code = to.subject_code;
                    String description = to.description;
                    int lecture_units = FitIn.toInt("" + to.lecture_units);
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
                    Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects load = new Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects(id, enrollment_id, enrollment_no, student_id, student_no, fname, mi, lname, enrollment_offered_subject_section_id, enrollment_offered_subject_id, academic_offering_subject_id, academic_offering_id, academic_year_id, academic_year, level_id, level, college_id, college, department_id, department, course_id, course_code, course_description, term, year_level, subject_id, subject_code, description, lecture_units, lab_units, faculty_id, faculty_name, section, room_id, room, schedule, day, time, start_time, closing_time, created_at, updated_at, created_by, updated_by, status, is_uploaded, 0, final_grade, final_grade_remarks, final_grade_created_at, final_grade_created_by);
                    Enrollment_student_loaded_subjects.add_data(load);
                    Alert.set(1, "");
                    ret_loaded_subjects();
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

    private void add_all_load() {
        List<to_academic_offering_subjects> subjects = tbl_academic_offering_subjects_ALM;
        List<to_academic_offering_subjects> subjects_selected = new ArrayList();

        for (to_academic_offering_subjects to : subjects) {
            if (to.selected) {
                subjects_selected.add(to);
            }
        }
        if (subjects_selected.isEmpty()) {
            Alert.set(0, "No subjects selected!");
            return;
        }

        String where = " where enrollment_id='" + enroll.id + "'";
        List<to_academic_offering_subjects> to_add = new ArrayList();
        List<to_academic_offering_subjects> to_add2 = new ArrayList();
        List<Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects> loaded = Enrollment_student_loaded_subjects.ret_data(where);
        for (to_academic_offering_subjects to : subjects_selected) {
            int exist = 0;
            for (Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects load : loaded) {
                if (to.subject_id == load.subject_id) {
                    exist = 1;
                    break;
                }
            }
            if (exist == 0) {
                if (to.status == 1) {
                    to_add.add(to);
                }

            }
        }

        List<Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects> loads = new ArrayList();
        List<to_academic_offering_subjects> not_loaded = new ArrayList();
        for (to_academic_offering_subjects to : to_add) {
//            String where3 = " where academic_offering_subject_id='" + to.id + "' order by section asc ";
            String where3 = " where academic_year_id='" + academic_year_id + "' and subject_id ='" + to.subject_id + "' order by section asc ";

            List<Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections> datas = Enrollment_offered_subject_sections.ret_data2(where3);
//            System.out.println("datas: " + datas.size());

            if (datas.size() > 0) {
                Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections sec = null;
                for (int i = 0; i < datas.size(); i++) {
                    Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections sec2 = (Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections) datas.get(i);
                    String[] cap = sec2.created_by.split(" of ");
                    int min = FitIn.toInt(cap[0]);
                    int max = FitIn.toInt(cap[1]);
                    if (min < max) {
                        sec = sec2;
                        break;
                    }
                }

                int id = 0;
                int enrollment_id = enroll.id;
                String enrollment_no = enroll.enrollment_no;
                int student_id = 0;
                String student_no = "";
                String fname = enroll.first_name;
                String mi = enroll.middle_name;
                String lname = enroll.last_name;
                int enrollment_offered_subject_section_id = sec.id;
                int enrollment_offered_subject_id = sec.enrollment_offered_subject_id;
                int academic_offering_subject_id = to.id;
                int academic_offering_id1 = to.academic_offering_id;
                int academic_year_id1 = to.academic_year_id;
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
                int subject_id = to.subject_id;
                String subject_code = to.subject_code;
                String description = to.description;
                int lecture_units = FitIn.toInt("" + to.lecture_units);
                int lab_units = FitIn.toInt("" + to.lab_units);
                String faculty_id = sec.faculty_id;
                String faculty_name = sec.faculty_name;
                String section = sec.section;
                int room_id = sec.room_id;
                String room = sec.room;
                String schedule = sec.schedule;
                String day = sec.day;
                String time = sec.time;
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
                if (!day.isEmpty() && sec != null) {
                    Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects load = new Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects(id, enrollment_id, enrollment_no, student_id, student_no, fname, mi, lname, enrollment_offered_subject_section_id, enrollment_offered_subject_id, academic_offering_subject_id, academic_offering_id, academic_year_id1, academic_year, level_id, level, college_id, college, department_id, department, course_id, course_code, course_description, term, year_level, subject_id, subject_code, description, lecture_units, lab_units, faculty_id, faculty_name, section, room_id, room, schedule, day, time, start_time, closing_time, created_at, updated_at, created_by, updated_by, status, is_uploaded, 0, final_grade, final_grade_remarks, final_grade_created_at, final_grade_created_by);
                    loads.add(load);
                } else {
                    not_loaded.add(to);
                }

            } else {
                not_loaded.add(to);
            }

        }
        Window p = (Window) this;
        Dlg_dean_student_advice_loaded_subjects nd = Dlg_dean_student_advice_loaded_subjects.create(p, true);
        nd.setTitle("");
        nd.do_pass(loads, not_loaded);
        nd.setCallback(new Dlg_dean_student_advice_loaded_subjects.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_dean_student_advice_loaded_subjects.OutputData data) {
                closeDialog.ok();
                Enrollment_student_loaded_subjects.add_data_all(loads);
                Alert.set(1, "");
                ret_loaded_subjects();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
//        Window p = (Window) this;
//        Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
//        nd.setTitle("");
//
//        nd.setCallback(new Dlg_confirm_action.Callback() {
//
//            @Override
//            public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
//                closeDialog.ok();
//                Enrollment_student_loaded_subjects.add_data_all(loads);
//                Alert.set(1, "");
//                ret_loaded_subjects();
//            }
//        });
//        nd.setLocationRelativeTo(this);
//        nd.setVisible(true);

    }
//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" enrollment_student_loaded_subjects "> 
    public static ArrayListModel tbl_enrollment_student_loaded_subjects_ALM;
    public static Tblenrollment_student_loaded_subjectsModel tbl_enrollment_student_loaded_subjects_M;

    public static void init_tbl_enrollment_student_loaded_subjects(JTable tbl_enrollment_student_loaded_subjects) {
        tbl_enrollment_student_loaded_subjects_ALM = new ArrayListModel();
        tbl_enrollment_student_loaded_subjects_M = new Tblenrollment_student_loaded_subjectsModel(tbl_enrollment_student_loaded_subjects_ALM);
        tbl_enrollment_student_loaded_subjects.setModel(tbl_enrollment_student_loaded_subjects_M);
        tbl_enrollment_student_loaded_subjects.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_enrollment_student_loaded_subjects.setRowHeight(25);
        int[] tbl_widths_enrollment_student_loaded_subjects = {100, 100, 40, 40, 60, 60, 70, 40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
        tbl_enrollment_student_loaded_subjects.getColumnModel().getColumn(7).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_enrollment_student_loaded_subjects(List<to_enrollment_student_loaded_subjects> acc) {
        tbl_enrollment_student_loaded_subjects_ALM.clear();
        tbl_enrollment_student_loaded_subjects_ALM.addAll(acc);
    }

    public static class Tblenrollment_student_loaded_subjectsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Subject Code", "Description", "Lec", "Lab", "Section", "Room", "Day", "", "academic_offering_subject_id", "academic_offering_id", "academic_year_id", "academic_year", "level_id", "level", "college_id", "college", "department_id", "department", "course_id", "course_code", "course_description", "term", "year_level", "subject_id", "subject_code", "description", "faculty_id", "faculty_name", "section", "room_id", "room", "schedule", "day", "time", "start_time", "closing_time", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded"
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
            to_enrollment_student_loaded_subjects tt = (to_enrollment_student_loaded_subjects) getRow(row);
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
                    return " " + tt.section;
                case 5:
                    return " " + tt.room;
                case 6:
                    return " " + tt.day;
                case 7:
                    return "/cis/icons/remove11.png";
                case 8:
                    return tt.academic_offering_subject_id;
                case 9:
                    return tt.academic_offering_id;
                case 10:
                    return tt.academic_year_id;
                case 11:
                    return tt.academic_year;
                case 12:
                    return tt.level_id;
                case 13:
                    return tt.level;
                case 14:
                    return tt.college_id;
                case 15:
                    return tt.college;
                case 16:
                    return tt.department_id;
                case 17:
                    return tt.department;
                case 18:
                    return tt.course_id;
                case 19:
                    return tt.course_code;
                case 20:
                    return tt.course_description;
                case 21:
                    return tt.term;
                case 22:
                    return tt.year_level;
                case 23:
                    return tt.subject_id;
                case 24:
                    return tt.subject_code;
                case 25:
                    return tt.description;
                case 26:
                    return tt.faculty_id;
                case 27:
                    return tt.faculty_name;
                case 28:
                    return tt.section;
                case 29:
                    return tt.room_id;
                case 30:
                    return tt.room;
                case 31:
                    return tt.schedule;
                case 32:
                    return tt.day;
                case 33:
                    return tt.time;
                case 34:
                    return tt.start_time;
                case 35:
                    return tt.closing_time;
                case 36:
                    return tt.created_at;
                case 37:
                    return tt.updated_at;
                case 38:
                    return tt.created_by;
                case 39:
                    return tt.updated_by;
                case 40:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }

    private void ret_loaded_subjects() {
        String where = " where id<>0 ";
        Field.Combo year = (Field.Combo) tf_field133;
        Field.Combo period = (Field.Combo) tf_field134;

        where = where + " and enrollment_id='" + enroll.id + "' ";
        if (!jCheckBox13.isSelected()) {
            where = where + " and year_level like '" + year.getText() + "' ";
        }
        if (!jCheckBox14.isSelected()) {
            where = where + " and term like '" + period.getText() + "' ";
        }
        where = where + " order by description asc ";
        List<to_enrollment_student_loaded_subjects> datas = Enrollment_student_loaded_subjects.ret_data2(where);

        loadData_enrollment_student_loaded_subjects(datas);
        jLabel7.setText("" + datas.size());
    }

    private void select_loaded_subjects() {
        int row = tbl_enrollment_student_loaded_subjects.getSelectedRow();
        if (row < 0) {
            return;
        }
        int col = tbl_enrollment_student_loaded_subjects.getSelectedColumn();
        if (col == 7) {
            to_enrollment_student_loaded_subjects to = (to_enrollment_student_loaded_subjects) tbl_enrollment_student_loaded_subjects_ALM.get(row);
            Window p = (Window) this;
            Dlg_confirm_delete nd = Dlg_confirm_delete.create(p, true);
            nd.setTitle("");
//        nd.do_pass(services);
            nd.setCallback(new Dlg_confirm_delete.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_delete.OutputData data) {
                    closeDialog.ok();
                    Enrollment_student_loaded_subjects.delete_data(to);
                    Alert.set(3, "");
                    ret_loaded_subjects();
                }
            });
            nd.setLocationRelativeTo(jScrollPane5);
            nd.setVisible(true);
        }

    }

    private void finish_advising() {

        if (jButton9.getText().equalsIgnoreCase("Approve Advising")) {
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
//        nd.do_pass(services);
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    Enrollments.approve_advising(enroll, period_term);
                    Alert.set(2, "");
                    ok2();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        } else {
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
//        nd.do_pass(services);
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    Enrollments.finish_advising(enroll);
                    Alert.set(2, "");
                    ok2();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }

    }

    private void ok2() {
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData());
        }
    }
//</editor-fold> 

    //<editor-fold defaultstate="collapsed" desc=" list of programs ">
    private void set_assessment2() {

        jProgressBar2.setString("Loading...Please wait...");
        jProgressBar2.setIndeterminate(true);
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {

                List<Enrollment_assessments.to_enrollment_assessments> assessments = Enrollment_assessments.ret_data(" where enrollment_id='" + enroll.id + "' ");
                if (assessments.isEmpty()) {
                    jProgressBar2.setString("Finished...");
                    jProgressBar2.setIndeterminate(false);

                    jPanel35.removeAll();
                    jPanel35.setLayout(new BorderLayout());
                    jPanel35.setMinimumSize(new Dimension(626, 0));
                    jPanel35.setMaximumSize(new Dimension(626, 0));
                    jPanel35.setPreferredSize(new Dimension(626, 0));
                    jPanel35.updateUI();
                    return;
                }

                Enrollment_assessments.to_enrollment_assessments assessment = (Enrollment_assessments.to_enrollment_assessments) assessments.get(0);

                String business_name = System.getProperty("school_name", "Colegio de Santa Catalina de Alejandria (COSCA)");
                String address = System.getProperty("address", "Bishop Epifanio B. Surban St. Dumaguete City Negros Oriental, Bishop Epifanio Surban St, Dumaguete, Negros Oriental");
                String date = synsoftech.util.DateType.slash.format(new Date());
                String contact_no = System.getProperty("contact_no", "(035) 225 4831");

                String home = System.getProperty("user.home");
                String SUBREPORT_DIR = home + "\\cis\\";

                String printed_by = MyUser.getUser_screen_name();
                String school_year = enroll.academic_year;
                String semester = enroll.term;
                String student_no = enroll.student_no;
                String student_name = enroll.last_name + ", " + enroll.first_name + " " + enroll.middle_name;
                String student_course = enroll.course_code + " - " + enroll.course_description;
                String student_year_level = enroll.year_level;

                List<Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects> subjects = Enrollment_student_loaded_subjects.ret_data(" where enrollment_id='" + enroll.id + "' and status<2  ");
                double no_of_units_lab = 0;
                List<cis.reports.Srpt_enrollment_assessment.field> fields = new ArrayList();

                //ret tuition amount
                String where = " where id<>0 ";
                where = where + " and academic_year_id='" + enroll.academic_year_id + "' "
                        + " and department_id='" + enroll.department_id + "' "
                        + " and level_id='" + enroll.level_id + "' "
                        + " and course_id='" + enroll.course_id + "' "
                        + " and period like '" + enroll.year_level + "' "
                        + " and group_id=0 ";
                List<Academic_year_fees.to_academic_year_fees> datas = Academic_year_fees.ret_data(where);
                double tuition_amount = 0;
                double lec_amount_per_unit = 0;
                double lab_amount_per_unit = 0;
                double total_assessment = 0;
                double tution_fee = 0;
                double misc_fee = 0;
                double other_fee = 0;
                double downpayment = 0;
                double payable = 0;

                if (!datas.isEmpty()) {
                    Academic_year_fees.to_academic_year_fees ayf = (Academic_year_fees.to_academic_year_fees) datas.get(0);
                    if (ayf.is_per_unit == 0) {
                        tuition_amount = ayf.amount;
                        tution_fee = tuition_amount;
                    } else {
                        lec_amount_per_unit = ayf.per_unit;
                        lab_amount_per_unit = ayf.lab_unit_amount;
                    }
                }

                for (Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects sub : subjects) {
                    String subject_code = sub.subject_code;
                    String description = sub.description;
                    double lec_units = sub.lecture_units;
                    double lab_units = sub.lab_units;
                    double lec_amount = lec_units * lec_amount_per_unit;
                    double lec_amount2 = lec_amount;
                    lec_amount = lec_amount_per_unit;
                    double lab_amount = lab_units * lab_amount_per_unit;
                    double lab_amount2 = lab_amount;
                    lab_amount = lab_amount_per_unit;
                    String room = sub.room;
                    String day = DateType.mwf(sub.day);
                    String time = DateType.daytime(sub.day);
                    time = time.replaceAll("WFM", "MWF");
                    time = time.replaceAll("FM", "MF");
                    String instructor = sub.faculty_name;
                    double amount = lec_amount2 + lab_amount2;
                    tution_fee += amount;
                    cis.reports.Srpt_enrollment_assessment.field f = new cis.reports.Srpt_enrollment_assessment.field(subject_code, description, lec_units, lab_units, lec_amount, lab_amount, room, day, time, instructor, amount);
                    fields.add(f);
                }

                List<cis.reports.Srpt_enrollment_assessment.field_misc> misc = new ArrayList();

                String where2 = " where id<>0 ";
                where2 = where2 + " and academic_year_id='" + enroll.academic_year_id + "' "
                        + " and department_id='" + enroll.department_id + "' "
                        + " and level_id='" + enroll.level_id + "' "
                        + " and course_id='" + enroll.course_id + "' "
                        + " and period like '" + enroll.year_level + "' "
                        + " and group_id=1 ";

                String where3 = " where id<>0 ";
                where3 = where3 + " and academic_year_id='" + enroll.academic_year_id + "' "
                        + " and department_id='" + enroll.department_id + "' "
                        + " and level_id='" + enroll.level_id + "' "
                        + " and course_id='" + enroll.course_id + "' "
                        + " and period like '" + enroll.year_level + "' "
                        + " and group_id=2 ";

                List<Academic_year_fees.to_academic_year_fees> misc_fees = Miscellaneous_fees.ret_data2(where2);
                List<Academic_year_fees.to_academic_year_fees> other_fees = Miscellaneous_fees.ret_data3(where3);
//        System.out.println(where3);
                List<cis.reports.Srpt_enrollment_assessment.field_misc> rpt_fees = new ArrayList();
                for (Academic_year_fees.to_academic_year_fees fee : misc_fees) {
                    cis.reports.Srpt_enrollment_assessment.field_misc f = new cis.reports.Srpt_enrollment_assessment.field_misc(fee.fee, fee.amount);
                    misc.add(f);
                    misc_fee += fee.amount;
                }

                for (Academic_year_fees.to_academic_year_fees fee : other_fees) {
                    cis.reports.Srpt_enrollment_assessment.field_misc f = new cis.reports.Srpt_enrollment_assessment.field_misc(fee.fee, fee.amount);
                    rpt_fees.add(f);
                    other_fee += fee.amount;
                }

                List<Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes> eapm = Enrollment_assessment_payment_modes.ret_data(" where enrollment_id='" + enroll.id + "' ");
                List<cis.reports.Srpt_enrollment_assessment.field_summary> rpt_summary = new ArrayList();

                int payment_count = 3;
                double tuition_fee = tution_fee;

                total_assessment = tution_fee + other_fee + misc_fee;
                payable = total_assessment - downpayment;
                double sub_total = total_assessment;
                for (Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes ea : eapm) {
                    double balance = ea.amount - ea.paid;
                    downpayment += ea.paid;
                    cis.reports.Srpt_enrollment_assessment.field_summary f2 = new cis.reports.Srpt_enrollment_assessment.field_summary(total_assessment, downpayment, payable, ea.mode, ea.to_pay, ea.amount, ea.paid, balance, tuition_fee, misc_fee, other_fee, sub_total);
                    rpt_summary.add(f2);
                }

                String jrxml = "rpt_enrollment_assessment.jrxml";
                cis.reports.Srpt_enrollment_assessment rpt = new cis.reports.Srpt_enrollment_assessment(business_name, address, contact_no, date, printed_by, school_year, semester, student_no, student_name, student_course, student_year_level, SUBREPORT_DIR, misc, rpt_fees, total_assessment, downpayment, payable, rpt_summary, tuition_fee, misc_fee);
                rpt.fields.addAll(fields);
                report_assessment(rpt, jrxml);
                InputStream is = cis.reports.Srpt_enrollment_assessment.class.getResourceAsStream(jrxml);
                try {
                    JasperReport jasperReport = JasperCompileManager.compileReport(is);
                    jasperPrint = JasperFillManager.fillReport(jasperReport, JasperUtil.
                                                               setParameter(rpt), JasperUtil.makeDatasource(rpt.fields));

                } catch (JRException ex) {
                    Logger.getLogger(Dlg_finance.class.getName()).log(Level.SEVERE, null, ex);
                }

                jProgressBar2.setString("Finished...");
                jProgressBar2.setIndeterminate(false);
            }
        });
        t.start();
    }

    private void set_assessment() {

    }

    private void report_assessment(final cis.reports.Srpt_enrollment_assessment to, String jrxml_name) {
        jPanel35.removeAll();
        jPanel35.setLayout(new BorderLayout());
        try {
            JRViewer viewer = get_viewer_assessment(to, jrxml_name);
            JPanel pnl = new JPanel();
            pnl.add(viewer);
            pnl.setVisible(true);
            pnl.setVisible(true);
            jPanel35.add(viewer);
            jPanel35.setMinimumSize(new Dimension(626, 0));
            jPanel35.setMaximumSize(new Dimension(626, 0));
            jPanel35.setPreferredSize(new Dimension(626, 0));
            jPanel35.updateUI();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer_assessment(cis.reports.Srpt_enrollment_assessment to, String rpt_name) {
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

    public static JasperReport compileJasper2(String rpt_name) {
        try {
            String jrxml = rpt_name;
            InputStream is = cis.reports.Srpt_enrollment_assessment.class.
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

    private void enroll_student() {
        Window p = (Window) this;
        Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_confirm_action.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                closeDialog.ok();
                proceed_to_enrollment_2();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void proceed_to_enrollment_2() {
        Loader loader = new Loader(this);
        loader.execute();
    }

    public class Loader extends SwingWorker {

        private Loading dialog;

        public Loader(JDialog dlg) {

            dialog = new Loading();
            Toolkit tk = Toolkit.getDefaultToolkit();
            int xSize = ((int) tk.getScreenSize().
                    getWidth());
            int ySize = ((int) tk.getScreenSize().
                    getHeight());
            dialog.setSize(xSize, ySize);
            dialog.setPreferredSize(new Dimension(xSize, ySize));
            dialog.setAlwaysOnTop(true);
            addPropertyChangeListener(new PropertyChangeListener() {
                @Override
                public void propertyChange(PropertyChangeEvent evt) {
                    if ("state".equals(evt.getPropertyName())) {
                        if (getState() == SwingWorker.StateValue.STARTED) {
                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    if (getState() == SwingWorker.StateValue.STARTED) {
                                        dialog.setVisible(true);
                                    }
                                }
                            });
                        }
                    }
                }
            });
        }

        @Override
        protected Object doInBackground() throws Exception {
            enroll();
            return null;
        }

        @Override
        protected void done() {
            dialog.dispose();
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    enrolled();
                }
            });
        }

    }

    String stud_no = null;

    private void enrolled() {

    }

    private void confirm_enroll() {
        Window p = (Window) this;
        Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
        nd.setTitle("");
//        nd.do_pass(services);
        nd.setCallback(new Dlg_confirm_action.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                closeDialog.ok();
                enroll();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void enroll() {

        int id = 0;
        int is_transferee = enroll.is_transferee;
        int academic_year_id2 = enroll.academic_year_id;
        String academic_year = enroll.academic_year;
        String student_no = "";
        String last_name = enroll.last_name;
        String first_name = enroll.first_name;
        String middle_name = enroll.middle_name;
        String nick_name = enroll.nick_name;
        String current_address = enroll.current_address;
        String permanent_address = enroll.permanent_address;
        String email_address = enroll.email_address;
        String postal_code = enroll.postal_code;
        String tel_no = enroll.tel_no;
        String mobile_no = enroll.mobile_no;
        String date_of_birth = enroll.date_of_birth;
        String place_of_birth = enroll.place_of_birth;
        int age = enroll.age;
        int gender = enroll.gender;
        String citizenship = enroll.citizenship;
        String religion = enroll.religion;
        String civil_status = enroll.civil_status;
        String spouse_name = enroll.spouse_name;
        String date_of_communion = enroll.date_of_communion;
        String date_of_confirmation = enroll.date_of_confirmation;
        int is_right_handed = enroll.is_right_handed;
        int is_indigenous = enroll.is_indigenous;
        String indigenous_name = enroll.indigenous_name;
        int level_id = enroll.level_id;
        String level = enroll.level;
        int college_id = enroll.college_id;
        String college = enroll.college;
        int department_id = enroll.department_id;
        String department = enroll.department;
        String year_level = enroll.year_level;
        String year_level_status = enroll.year_level_status;
        String preferred_course1 = enroll.preferred_course1;
        String preferred_course2 = enroll.preferred_course2;
        String preferred_course3 = enroll.preferred_course3;
        String father_name = enroll.father_name;
        String father_citizenship = enroll.father_citizenship;
        String father_home_address = enroll.father_home_address;
        String father_email_address = enroll.father_email_address;
        String father_mobile_no = enroll.father_mobile_no;
        String father_occupation = enroll.father_occupation;
        String father_employer = enroll.father_employer;
        String father_business_address = enroll.father_business_address;
        String father_business_tel_no = enroll.father_business_tel_no;
        String father_educational_attainment = enroll.father_educational_attainment;
        String father_last_school_attended = enroll.father_last_school_attended;
        String mother_name = enroll.mother_name;
        String mother_citizenship = enroll.mother_citizenship;
        String mother_home_address = enroll.mother_home_address;
        String mother_email_address = enroll.mother_email_address;
        String mother_mobile_no = enroll.mother_mobile_no;
        String mother_occupation = enroll.mother_occupation;
        String mother_employer = enroll.mother_employer;
        String mother_business_address = enroll.mother_business_address;
        String mother_business_tel_no = enroll.mother_business_tel_no;
        String mother_educational_attainment = enroll.mother_educational_attainment;
        String mother_last_school_attended = enroll.mother_last_school_attended;
        String guardian_name = enroll.guardian_name;
        String guardian_mailing_address = enroll.guardian_mailing_address;
        String guardian_telephone_no = enroll.guardian_telephone_no;
        String grade_school_name = enroll.grade_school_name;
        String grade_school_region = enroll.grade_school_region;
        String grade_school_school_year = enroll.grade_school_school_year;
        String grade_school_awards = enroll.grade_school_awards;
        String high_school_name = enroll.high_school_name;
        String high_school_region = enroll.high_school_region;
        String high_school_school_year = enroll.high_school_school_year;
        String high_school_awards = enroll.high_school_awards;
        String college_school_name = enroll.college_school_name;
        String college_school_region = enroll.college_school_region;
        String college_school_school_year = enroll.college_school_school_year;
        String college_awards = enroll.college_awards;
        String junior_high_name = enroll.junior_high_name;
        String junior_high_region = enroll.junior_high_region;
        String junior_high_year = enroll.junior_high_year;
        String junior_high_awards = enroll.junior_high_awards;
        String tesda_name = enroll.tesda_name;
        String tesda_region = enroll.tesda_region;
        String tesda_year = enroll.tesda_year;
        String tesda_awards = enroll.tesda_awards;
        String sibling1 = enroll.sibling1;
        String sibling2 = enroll.sibling2;
        String sibling3 = enroll.sibling3;
        String sibling4 = enroll.sibling4;
        String sibling5 = enroll.sibling5;
        String sibling6 = enroll.sibling6;
        String sibling7 = enroll.sibling7;
        String sibling8 = enroll.sibling8;
        String created_at = DateType.now();
        String updated_at = DateType.now();
        String created_by = MyUser.getUser_id();
        String updated_by = MyUser.getUser_id();
        int status = 0;
        int is_uploaded = 0;
        int course_id = enroll.course_id;
        String course_code = enroll.course_code;
        String course_description = enroll.course_description;
        String date_enrolled = DateType.sf.format(new Date());
        double balance = 0;
        double prepaid = 0;

        List<Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes> eapm = Enrollment_assessment_payment_modes.ret_data(" where enrollment_id='" + enroll.id + "' ");

        for (Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes ea : eapm) {
            balance += ea.amount - ea.paid;
        }

        Students.to_students student = new Students.to_students(id, is_transferee, academic_year_id2, academic_year, student_no, last_name, first_name, middle_name, nick_name, current_address, permanent_address, email_address, postal_code, tel_no, mobile_no, date_of_birth, place_of_birth, age, gender, citizenship, religion, civil_status, spouse_name, date_of_communion, date_of_confirmation, is_right_handed, is_indigenous, indigenous_name, level_id, level, college_id, college, department_id, department, year_level, year_level_status, preferred_course1, preferred_course2, preferred_course3, father_name, father_citizenship, father_home_address, father_email_address, father_mobile_no, father_occupation, father_employer, father_business_address, father_business_tel_no, father_educational_attainment, father_last_school_attended, mother_name, mother_citizenship, mother_home_address, mother_email_address, mother_mobile_no, mother_occupation, mother_employer, mother_business_address, mother_business_tel_no, mother_educational_attainment, mother_last_school_attended, guardian_name, guardian_mailing_address, guardian_telephone_no, grade_school_name, grade_school_region, grade_school_school_year, grade_school_awards, high_school_name, high_school_region, high_school_school_year, high_school_awards, college_school_name, college_school_region, college_school_school_year, college_awards, junior_high_name, junior_high_region, junior_high_year, junior_high_awards, tesda_name, tesda_region, tesda_year, tesda_awards, sibling1, sibling2, sibling3, sibling4, sibling5, sibling6, sibling7, sibling8, created_at, updated_at, created_by, updated_by, status, is_uploaded, course_id, course_code, course_description, date_enrolled, balance, prepaid);
        String en_no = Students.add_data_enroll(student, enroll);
        try {
            send_image_to_server(enroll.enrollment_no, en_no);
        } catch (IOException e) {
            System.out.println(e);
        }

        Window p = (Window) this;
        Dlg_student_enrollment_approved nd = Dlg_student_enrollment_approved.create(p, true);
        nd.setTitle("");
        nd.do_pass(enroll, en_no);
        nd.setCallback(new Dlg_student_enrollment_approved.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_student_enrollment_approved.OutputData data) {
                closeDialog.ok();

                jButton11.setEnabled(false);
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        set_assessment2();
                    }
                });

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void send_image_to_server(String enrollment_no, String student_no) throws IOException {

        FileInputStream inputStream = null;
        String image_server = System.getProperty("image_server", "");
        System.out.println("image_server: " + image_server);
        if (!image_server.isEmpty()) {
            File sourceFile = new File("\\\\" + image_server + "\\cis\\cis_images\\enrollment\\" + enrollment_no + ".jpg");
            File destinationFile = new File("\\\\" + image_server + "\\cis\\cis_images\\students\\" + student_no + ".jpg");
            inputStream = new FileInputStream(sourceFile);
            FileOutputStream outputStream = new FileOutputStream(destinationFile);
            FileChannel inChannel = inputStream.getChannel();
            FileChannel outChannel = outputStream.getChannel();
            try {
                inChannel.transferTo(0, inChannel.size(), outChannel);
            } finally {

                inChannel.close();
                outChannel.close();
                inputStream.close();
                outputStream.close();

                if (sourceFile.delete()) {
                    System.out.println("Local image deleted");
                } else {
                    System.out.println("Failed to delete local image");
                }
            }
        }
    }

    private void select_tab() {
        int tab = jTabbedPane2.getSelectedIndex();
        if (tab == 2) {
            tf_field4.setText(tf_field128.getText());
            ret_offered_subjects();
        }
    }
}
