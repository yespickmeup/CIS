/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.finance;

import cis.academic.Academic_offerings;
import cis.academic.Academic_year_fees;
import cis.academic.Academic_year_other_fees;
import cis.academic.Academic_year_other_fees.to_academic_year_other_fees;
import cis.academic.Academic_year_period_schedules;
import cis.academic.Academic_years;
import cis.cash_drawer.CashDrawer;
import cis.cash_drawer.Dlg_cashin;
import cis.colleges.Colleges;
import cis.courses.Courses;
import cis.departments.Departments;
import cis.discount_types.Dlg_discount_types;
import cis.downpayments.Downpayments;
import cis.enrollments.Enrollment_assessment_discounts;
import cis.enrollments.Enrollment_student_loaded_subjects;
import cis.enrollments.Enrollment_student_loaded_subjects_drop_requests;
import cis.enrollments.Enrollments;
import cis.students.Students;
import cis.students.Students_curriculum;
import cis.users.Dlg_authenticate;
import cis.users.MyUser;
import cis.users.User_previleges;
import cis.utils.Alert;
import cis.utils.DateType;
import cis.utils.Dlg_confirm_action;
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
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
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
    buttonGroup3 = new javax.swing.ButtonGroup();
    jPanel1 = new javax.swing.JPanel();
    jTabbedPane1 = new javax.swing.JTabbedPane();
    jPanel18 = new javax.swing.JPanel();
    jPanel20 = new javax.swing.JPanel();
    jLabel46 = new javax.swing.JLabel();
    jCheckBox8 = new javax.swing.JCheckBox();
    jCheckBox9 = new javax.swing.JCheckBox();
    tf_field25 = new Field.Search();
    jLabel47 = new javax.swing.JLabel();
    jPanel21 = new javax.swing.JPanel();
    jPanel22 = new javax.swing.JPanel();
    jLabel4 = new javax.swing.JLabel();
    jPanel23 = new javax.swing.JPanel();
    jLabel16 = new javax.swing.JLabel();
    tf_field9 = new Field.Input();
    jLabel17 = new javax.swing.JLabel();
    tf_field10 = new Field.Input();
    jLabel18 = new javax.swing.JLabel();
    tf_field11 = new Field.Input();
    jLabel19 = new javax.swing.JLabel();
    tf_field12 = new Field.Input();
    jButton7 = new javax.swing.JButton();
    jXCollapsiblePane1 = new org.jdesktop.swingx.JXCollapsiblePane();
    jPanel24 = new javax.swing.JPanel();
    jLabel78 = new javax.swing.JLabel();
    tf_field136 = new Field.Input();
    jLabel85 = new javax.swing.JLabel();
    jScrollPane5 = new javax.swing.JScrollPane();
    tf_field138 = new javax.swing.JTextArea();
    jLabel86 = new javax.swing.JLabel();
    tf_field127 = new Field.Input();
    jLabel87 = new javax.swing.JLabel();
    tf_field139 = new Field.Input();
    jLabel88 = new javax.swing.JLabel();
    tf_field140 = new Field.Input();
    jTabbedPane5 = new javax.swing.JTabbedPane();
    jPanel29 = new javax.swing.JPanel();
    jPanel25 = new javax.swing.JPanel();
    jScrollPane6 = new javax.swing.JScrollPane();
    tbl_fees = new javax.swing.JTable();
    jPanel26 = new javax.swing.JPanel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jButton6 = new Button.Success();
    jButton8 = new Button.Info();
    jButton13 = new Button.Primary();
    jButton14 = new Button.Primary();
    jButton20 = new Button.Primary();
    jCheckBox11 = new javax.swing.JCheckBox();
    jPanel30 = new javax.swing.JPanel();
    jPanel27 = new javax.swing.JPanel();
    jScrollPane7 = new javax.swing.JScrollPane();
    tbl_transactions = new javax.swing.JTable();
    jButton9 = new Button.Info();
    jButton21 = new Button.Primary();
    jCheckBox12 = new javax.swing.JCheckBox();
    jLabel20 = new javax.swing.JLabel();
    tf_field17 = new Field.Input();
    jLabel21 = new javax.swing.JLabel();
    tf_field31 = new Field.Input();
    jPanel31 = new javax.swing.JPanel();
    jPanel32 = new javax.swing.JPanel();
    jLabel53 = new javax.swing.JLabel();
    jLabel54 = new javax.swing.JLabel();
    jLabel55 = new javax.swing.JLabel();
    jLabel56 = new javax.swing.JLabel();
    jLabel57 = new javax.swing.JLabel();
    jLabel58 = new javax.swing.JLabel();
    jLabel59 = new javax.swing.JLabel();
    jLabel60 = new javax.swing.JLabel();
    jLabel61 = new javax.swing.JLabel();
    jLabel62 = new javax.swing.JLabel();
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
    jButton17 = new Button.Primary();
    jButton18 = new Button.Primary();
    jLabel8 = new javax.swing.JLabel();
    jProgressBar2 = new javax.swing.JProgressBar();
    jLabel22 = new javax.swing.JLabel();
    tf_field13 = new Field.Combo();
    jLabel26 = new javax.swing.JLabel();
    jCheckBox16 = new javax.swing.JCheckBox();
    tf_field26 = new Field.Combo();
    jPanel15 = new javax.swing.JPanel();
    jLabel5 = new javax.swing.JLabel();
    jProgressBar1 = new javax.swing.JProgressBar();
    jButton5 = new Button.Info();
    jTabbedPane3 = new javax.swing.JTabbedPane();
    jPanel19 = new javax.swing.JPanel();
    jScrollPane4 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jPanel17 = new javax.swing.JPanel();
    jButton12 = new Button.Warning();
    jButton19 = new Button.Info();
    jCheckBox13 = new javax.swing.JCheckBox();
    jPanel2 = new javax.swing.JPanel();
    jTabbedPane2 = new javax.swing.JTabbedPane();
    jPanel3 = new javax.swing.JPanel();
    jPanel5 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tbl_miscellaneous_fees = new javax.swing.JTable();
    jLabel35 = new javax.swing.JLabel();
    tf_field20 = new Field.Input();
    jLabel36 = new javax.swing.JLabel();
    jLabel37 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jButton10 = new javax.swing.JButton();
    jPanel6 = new javax.swing.JPanel();
    jScrollPane2 = new javax.swing.JScrollPane();
    tbl_other_fees = new javax.swing.JTable();
    jLabel38 = new javax.swing.JLabel();
    tf_field21 = new Field.Input();
    jLabel39 = new javax.swing.JLabel();
    jLabel40 = new javax.swing.JLabel();
    jButton2 = new javax.swing.JButton();
    jButton11 = new javax.swing.JButton();
    jPanel7 = new javax.swing.JPanel();
    tf_field14 = new Field.Combo();
    tf_field15 = new Field.Combo();
    jLabel32 = new javax.swing.JLabel();
    tf_period = new Field.Combo();
    jLabel30 = new javax.swing.JLabel();
    tf_field16 = new Field.Combo();
    jLabel31 = new javax.swing.JLabel();
    jLabel29 = new javax.swing.JLabel();
    jLabel41 = new javax.swing.JLabel();
    tf_field22 = new Field.Combo();
    jLabel52 = new javax.swing.JLabel();
    tf_year_level = new Field.Combo();
    jTabbedPane4 = new javax.swing.JTabbedPane();
    jPanel4 = new javax.swing.JPanel();
    jLabel33 = new javax.swing.JLabel();
    tf_field18 = new Field.Input();
    jLabel34 = new javax.swing.JLabel();
    tf_field19 = new Field.Input();
    jButton15 = new Button.Success();
    jCheckBox1 = new javax.swing.JCheckBox();
    jLabel45 = new javax.swing.JLabel();
    tf_field24 = new Field.Input();
    jPanel28 = new javax.swing.JPanel();
    jLabel48 = new javax.swing.JLabel();
    tf_field27 = new Field.Input();
    jButton16 = new Button.Success();
    tf_field28 = new Field.Input();
    jLabel49 = new javax.swing.JLabel();
    jLabel50 = new javax.swing.JLabel();
    tf_field29 = new Field.Input();
    jCheckBox10 = new javax.swing.JCheckBox();
    jLabel51 = new javax.swing.JLabel();
    tf_field30 = new Field.Input();
    jPanel8 = new javax.swing.JPanel();
    jPanel33 = new javax.swing.JPanel();
    jButton22 = new Button.Warning();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jPanel18.setBackground(new java.awt.Color(255, 255, 255));

    jPanel20.setBackground(new java.awt.Color(255, 255, 255));
    jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

    jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel46.setText("Search by:");

    buttonGroup3.add(jCheckBox8);
    jCheckBox8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox8.setText("Student No");

    buttonGroup3.add(jCheckBox9);
    jCheckBox9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox9.setSelected(true);
    jCheckBox9.setText("Name");

    tf_field25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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

    jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel47.setText("Search:");

    jPanel21.setBackground(new java.awt.Color(255, 255, 255));
    jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

    jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
    jPanel22.setOpaque(false);
    jPanel22.setPreferredSize(new java.awt.Dimension(154, 120));

    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cis/icons2/user.png"))); // NOI18N
    jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
    jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
    jPanel22.setLayout(jPanel22Layout);
    jPanel22Layout.setHorizontalGroup(
      jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel22Layout.createSequentialGroup()
        .addGap(1, 1, 1)
        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        .addGap(1, 1, 1))
    );
    jPanel22Layout.setVerticalGroup(
      jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel22Layout.createSequentialGroup()
        .addGap(1, 1, 1)
        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGap(1, 1, 1))
    );

    jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
    jPanel23.setOpaque(false);

    jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel16.setText("First Name:");

    tf_field9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_field9.setFocusable(false);

    jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel17.setText("Middle Name:");

    tf_field10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_field10.setFocusable(false);

    jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel18.setText("Last Name:");

    tf_field11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_field11.setFocusable(false);

    jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel19.setText("Student No.:");

    tf_field12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_field12.setFocusable(false);
    tf_field12.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_field12ActionPerformed(evt);
      }
    });

    jButton7.setText("+");
    jButton7.setToolTipText("More Details");
    jButton7.setFocusable(false);
    jButton7.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton7ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
    jPanel23.setLayout(jPanel23Layout);
    jPanel23Layout.setHorizontalGroup(
      jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel23Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
          .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(tf_field10)
          .addComponent(tf_field11)
          .addComponent(tf_field9)
          .addGroup(jPanel23Layout.createSequentialGroup()
            .addComponent(tf_field12)
            .addGap(0, 0, 0)
            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );
    jPanel23Layout.setVerticalGroup(
      jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(5, 5, 5))
    );

    jPanel24.setBackground(new java.awt.Color(255, 255, 255));
    jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

    jLabel78.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel78.setText("Course Code:");

    tf_field136.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_field136.setFocusable(false);
    tf_field136.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tf_field136MouseClicked(evt);
      }
    });
    tf_field136.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_field136ActionPerformed(evt);
      }
    });

    jLabel85.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel85.setText("Description:");

    jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
    jScrollPane5.setFocusable(false);

    tf_field138.setColumns(20);
    tf_field138.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    tf_field138.setLineWrap(true);
    tf_field138.setRows(5);
    tf_field138.setFocusable(false);
    jScrollPane5.setViewportView(tf_field138);

    jLabel86.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel86.setText("Department:");

    tf_field127.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_field127.setFocusable(false);
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

    jLabel87.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel87.setText("Level/College:");

    tf_field139.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_field139.setFocusable(false);
    tf_field139.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tf_field139MouseClicked(evt);
      }
    });
    tf_field139.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_field139ActionPerformed(evt);
      }
    });

    jLabel88.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel88.setText("Year:");

    tf_field140.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_field140.setText("First Year");
    tf_field140.setFocusable(false);
    tf_field140.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tf_field140MouseClicked(evt);
      }
    });
    tf_field140.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_field140ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
    jPanel24.setLayout(jPanel24Layout);
    jPanel24Layout.setHorizontalGroup(
      jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel24Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel78, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
          .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel86, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(tf_field139, javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(tf_field127, javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
          .addComponent(tf_field136, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field140))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel24Layout.setVerticalGroup(
      jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel24Layout.createSequentialGroup()
        .addGap(5, 5, 5)
        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field136, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field127, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field139, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field140, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jXCollapsiblePane1.getContentPane().add(jPanel24);

    javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
    jPanel21.setLayout(jPanel21Layout);
    jPanel21Layout.setHorizontalGroup(
      jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel21Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel21Layout.createSequentialGroup()
            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addComponent(jXCollapsiblePane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
        .addContainerGap())
    );
    jPanel21Layout.setVerticalGroup(
      jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
        .addGap(0, 0, 0)
        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jXCollapsiblePane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
    jPanel20.setLayout(jPanel20Layout);
    jPanel20Layout.setHorizontalGroup(
      jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel20Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel20Layout.createSequentialGroup()
            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5)
            .addComponent(jCheckBox8)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jCheckBox9))
          .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(jPanel20Layout.createSequentialGroup()
            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5)
            .addComponent(tf_field25)))
        .addContainerGap())
    );
    jPanel20Layout.setVerticalGroup(
      jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel20Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jCheckBox8)
          .addComponent(jCheckBox9))
        .addGap(1, 1, 1)
        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jTabbedPane5.setBackground(new java.awt.Color(255, 255, 255));
    jTabbedPane5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jPanel29.setBackground(new java.awt.Color(255, 255, 255));

    jPanel25.setBackground(new java.awt.Color(255, 255, 255));
    jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

    tbl_fees.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {},
        {},
        {},
        {}
      },
      new String [] {

      }
    ));
    tbl_fees.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tbl_feesMouseClicked(evt);
      }
    });
    jScrollPane6.setViewportView(tbl_fees);

    javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
    jPanel25.setLayout(jPanel25Layout);
    jPanel25Layout.setHorizontalGroup(
      jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel25Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane6)
        .addContainerGap())
    );
    jPanel25Layout.setVerticalGroup(
      jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel25Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        .addGap(5, 5, 5))
    );

    jPanel26.setBackground(new java.awt.Color(255, 255, 255));
    jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

    jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel6.setText("0.00");

    jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    jLabel7.setText("Amount Due:");

    jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButton6.setText("Pay");
    jButton6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton6ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
    jPanel26.setLayout(jPanel26Layout);
    jPanel26Layout.setHorizontalGroup(
      jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel26Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel7)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    jPanel26Layout.setVerticalGroup(
      jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel26Layout.createSequentialGroup()
        .addGap(5, 5, 5)
        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(54, Short.MAX_VALUE))
    );

    jButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jButton8.setText("Print Preview");
    jButton8.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton8ActionPerformed(evt);
      }
    });

    jButton13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jButton13.setText("Add Payable");
    jButton13.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton13ActionPerformed(evt);
      }
    });

    jButton14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jButton14.setText("Other Fees");
    jButton14.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton14ActionPerformed(evt);
      }
    });

    jButton20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jButton20.setText("Retrieve Fees");
    jButton20.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton20ActionPerformed(evt);
      }
    });

    jCheckBox11.setText("Auto");

    javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
    jPanel29.setLayout(jPanel29Layout);
    jPanel29Layout.setHorizontalGroup(
      jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel29Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
            .addComponent(jCheckBox11)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );
    jPanel29Layout.setVerticalGroup(
      jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel29Layout.createSequentialGroup()
        .addGap(21, 21, 21)
        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jCheckBox11))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGap(1, 1, 1)
        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    jTabbedPane5.addTab("Fees", jPanel29);

    jPanel30.setBackground(new java.awt.Color(255, 255, 255));

    jPanel27.setBackground(new java.awt.Color(255, 255, 255));
    jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

    tbl_transactions.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {},
        {},
        {},
        {}
      },
      new String [] {

      }
    ));
    tbl_transactions.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tbl_transactionsMouseClicked(evt);
      }
    });
    jScrollPane7.setViewportView(tbl_transactions);

    javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
    jPanel27.setLayout(jPanel27Layout);
    jPanel27Layout.setHorizontalGroup(
      jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel27Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
        .addContainerGap())
    );
    jPanel27Layout.setVerticalGroup(
      jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel27Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        .addContainerGap())
    );

    jButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jButton9.setText("Print Preview");
    jButton9.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton9ActionPerformed(evt);
      }
    });

    jButton21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jButton21.setText("Retrieve Transactions");
    jButton21.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton21ActionPerformed(evt);
      }
    });

    jCheckBox12.setText("Auto");

    jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel20.setText("Verified by:");

    tf_field17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_field17.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_field17ActionPerformed(evt);
      }
    });

    jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel21.setText("Approved by:");

    tf_field31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_field31.setText("Gerani T. Banua");

    javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
    jPanel30.setLayout(jPanel30Layout);
    jPanel30Layout.setHorizontalGroup(
      jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel30Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(jPanel30Layout.createSequentialGroup()
            .addComponent(jCheckBox12)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
            .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(tf_field17)
              .addComponent(tf_field31))
            .addGap(306, 306, 306)))
        .addContainerGap())
    );
    jPanel30Layout.setVerticalGroup(
      jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
        .addGap(25, 25, 25)
        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jCheckBox12)
          .addComponent(jButton9))
        .addGap(18, 18, 18)
        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(7, 7, 7)
        .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );

    jTabbedPane5.addTab("Official Account Statement", jPanel30);

    jPanel31.setBackground(new java.awt.Color(255, 255, 255));

    javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
    jPanel31.setLayout(jPanel31Layout);
    jPanel31Layout.setHorizontalGroup(
      jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 733, Short.MAX_VALUE)
    );
    jPanel31Layout.setVerticalGroup(
      jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 683, Short.MAX_VALUE)
    );

    jTabbedPane5.addTab("Print Preview", jPanel31);

    jPanel32.setBackground(new java.awt.Color(255, 255, 255));
    jPanel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

    jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel53.setText("Screen Name:");

    jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel54.setText("Time In:");

    jLabel55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

    jLabel56.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

    jLabel57.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

    jLabel58.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel58.setText("Time Out:");

    jLabel59.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel59.setText("Cash In:");

    jLabel60.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel60.setText("0.00");
    jLabel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

    jLabel61.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel61.setText("CashCount:");

    jLabel62.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel62.setText("0.00");
    jLabel62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

    javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
    jPanel32.setLayout(jPanel32Layout);
    jPanel32Layout.setHorizontalGroup(
      jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel32Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(jPanel32Layout.createSequentialGroup()
            .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel32Layout.createSequentialGroup()
                .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel32Layout.createSequentialGroup()
                .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        .addContainerGap())
    );
    jPanel32Layout.setVerticalGroup(
      jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel32Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())
    );

    javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
    jPanel18.setLayout(jPanel18Layout);
    jPanel18Layout.setHorizontalGroup(
      jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel18Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jTabbedPane5)
        .addContainerGap())
    );
    jPanel18Layout.setVerticalGroup(
      jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel18Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jTabbedPane5)
          .addGroup(jPanel18Layout.createSequentialGroup()
            .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        .addContainerGap())
    );

    jTabbedPane1.addTab("Payment", jPanel18);

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

    buttonGroup1.add(jCheckBox4);
    jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox4.setText("Returning Student");

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
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
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
              .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(tf_field131)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_field132, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

    jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jButton3.setText("Create Assessment");
    jButton3.setEnabled(false);
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

    jButton17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jButton17.setText("Downpayment");
    jButton17.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton17ActionPerformed(evt);
      }
    });

    jButton18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jButton18.setText("Tuition Discount");
    jButton18.setEnabled(false);
    jButton18.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton18ActionPerformed(evt);
      }
    });

    jLabel8.setText("Status:");

    jProgressBar2.setString("");
    jProgressBar2.setStringPainted(true);

    javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
    jPanel16.setLayout(jPanel16Layout);
    jPanel16Layout.setHorizontalGroup(
      jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel16Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel16Layout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addComponent(jLabel80)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tf_field129)
            .addGap(0, 0, 0)
            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
              .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(176, 176, 176)))
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))))
        .addContainerGap())
    );
    jPanel16Layout.setVerticalGroup(
      jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel8)
          .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(3, 3, 3)
        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(3, 3, 3)
        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(3, 3, 3)
        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(tf_field129, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
          .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
        .addGap(1, 1, 1)
        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(5, 5, 5)
        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

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

    jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel26.setText("Period:");

    jCheckBox16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox16.setText("All");
    jCheckBox16.setFocusable(false);
    jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox16ActionPerformed(evt);
      }
    });

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

    javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
    jPanel10.setLayout(jPanel10Layout);
    jPanel10Layout.setHorizontalGroup(
      jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel10Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel10Layout.createSequentialGroup()
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
            .addGap(0, 6, Short.MAX_VALUE))
          .addGroup(jPanel10Layout.createSequentialGroup()
            .addComponent(jLabel22)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(tf_field13, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel26)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jCheckBox16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tf_field26)))
        .addContainerGap())
    );
    jPanel10Layout.setVerticalGroup(
      jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel10Layout.createSequentialGroup()
        .addGap(3, 3, 3)
        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBox16)
            .addComponent(tf_field26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(tf_field13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(3, 3, 3)
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
        .addGap(3, 3, 3)
        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    jPanel15.setBackground(new java.awt.Color(255, 255, 255));
    jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Assessment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

    jLabel5.setText("Status:");

    jProgressBar1.setString("");
    jProgressBar1.setStringPainted(true);

    jButton5.setText("Print Assessment");
    jButton5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton5ActionPerformed(evt);
      }
    });

    jTabbedPane3.setBackground(new java.awt.Color(255, 255, 255));
    jTabbedPane3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jPanel19.setBackground(new java.awt.Color(255, 255, 255));

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
    jScrollPane4.setViewportView(jTable1);

    jLabel2.setText("Total no. of subjects:");

    jLabel3.setText("0");

    javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
    jPanel19.setLayout(jPanel19Layout);
    jPanel19Layout.setHorizontalGroup(
      jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel19Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
          .addGroup(jPanel19Layout.createSequentialGroup()
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    jPanel19Layout.setVerticalGroup(
      jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel19Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(jLabel3))
        .addContainerGap())
    );

    jTabbedPane3.addTab("Subjects Added", jPanel19);

    jPanel17.setBackground(new java.awt.Color(255, 255, 255));
    jPanel17.setMinimumSize(new java.awt.Dimension(626, 0));

    javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
    jPanel17.setLayout(jPanel17Layout);
    jPanel17Layout.setHorizontalGroup(
      jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 703, Short.MAX_VALUE)
    );
    jPanel17Layout.setVerticalGroup(
      jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 607, Short.MAX_VALUE)
    );

    jTabbedPane3.addTab("Print Preview", jPanel17);

    jButton12.setText("Delete Assessment");
    jButton12.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton12ActionPerformed(evt);
      }
    });

    jButton19.setText("View Assessment");
    jButton19.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton19ActionPerformed(evt);
      }
    });

    jCheckBox13.setSelected(true);
    jCheckBox13.setText("Auto");

    javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
    jPanel15.setLayout(jPanel15Layout);
    jPanel15Layout.setHorizontalGroup(
      jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel15Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jTabbedPane3)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jLabel5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jCheckBox13)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );
    jPanel15Layout.setVerticalGroup(
      jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel15Layout.createSequentialGroup()
        .addGap(0, 0, 0)
        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jCheckBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jTabbedPane3)
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
        .addContainerGap()
        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    jPanel9Layout.setVerticalGroup(
      jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel9Layout.createSequentialGroup()
        .addGap(2, 2, 2)
        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(2, 2, 2))
    );

    jTabbedPane1.addTab("Assessment/Downpayment", jPanel9);

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));

    jTabbedPane2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jPanel3.setBackground(new java.awt.Color(255, 255, 255));
    jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

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

    jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cis/icons/tool.png"))); // NOI18N
    jButton10.setText("Copy");
    jButton10.setFocusable(false);
    jButton10.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton10ActionPerformed(evt);
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
            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );
    jPanel5Layout.setVerticalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel5Layout.createSequentialGroup()
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton1)
          .addComponent(jButton10))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
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

    jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cis/icons/tool.png"))); // NOI18N
    jButton11.setText("Copy");
    jButton11.setFocusable(false);
    jButton11.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton11ActionPerformed(evt);
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
            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );
    jPanel6Layout.setVerticalGroup(
      jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel6Layout.createSequentialGroup()
        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton2)
          .addComponent(jButton11))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
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

    jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel52.setText("Year Level:");

    tf_year_level.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_year_level.setFocusable(false);
    tf_year_level.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tf_year_levelMouseClicked(evt);
      }
    });
    tf_year_level.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_year_levelActionPerformed(evt);
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
            .addComponent(tf_period, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(tf_field22, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel7Layout.createSequentialGroup()
            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tf_year_level, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );
    jPanel7Layout.setVerticalGroup(
      jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel7Layout.createSequentialGroup()
        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_period, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(10, 10, 10)
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
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_year_level, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(10, 10, 10))
    );

    jTabbedPane4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

    jPanel4.setBackground(new java.awt.Color(255, 255, 255));

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

    jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel45.setText("Lab Unit:");

    tf_field24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_field24.setText("0.00");
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

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addGap(110, 110, 110)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(tf_field18)
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addComponent(tf_field19, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(tf_field24))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
            .addComponent(tf_field18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(tf_field19)
              .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addGap(1, 1, 1)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field24))
        .addGap(5, 5, 5)
        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    jTabbedPane4.addTab("Tuition Fee", jPanel4);

    jPanel28.setBackground(new java.awt.Color(255, 255, 255));

    jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel48.setText("Charge Add Subject:");

    tf_field27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_field27.setText("0.00");
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

    jButton16.setText("Save");
    jButton16.setToolTipText("Save");
    jButton16.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton16ActionPerformed(evt);
      }
    });

    tf_field28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_field28.setText("0.00");
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

    jLabel49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel49.setText("Drop Subject:");

    jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel50.setText("Withdrawal of subject deduction of:");

    tf_field29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_field29.setText("0.00");
    tf_field29.setFocusable(false);
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

    jCheckBox10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jCheckBox10.setSelected(true);
    jCheckBox10.setText("Whole Amount");
    jCheckBox10.setFocusable(false);
    jCheckBox10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jCheckBox10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox10ActionPerformed(evt);
      }
    });

    jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel51.setText("Additional enrollment fee if late:");

    tf_field30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_field30.setText("0.00");
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

    javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
    jPanel28.setLayout(jPanel28Layout);
    jPanel28Layout.setHorizontalGroup(
      jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel28Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jCheckBox10)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(tf_field29, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tf_field30, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tf_field27, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tf_field28, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );
    jPanel28Layout.setVerticalGroup(
      jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel28Layout.createSequentialGroup()
        .addGap(31, 31, 31)
        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field27)
          .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field28))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(tf_field29))
          .addComponent(jCheckBox10, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(tf_field30))
          .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())
    );

    jTabbedPane4.addTab("Others", jPanel28);

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
          .addComponent(jTabbedPane4))
        .addGap(25, 25, 25))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGap(25, 25, 25)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
      .addGap(0, 645, Short.MAX_VALUE)
    );

    jTabbedPane2.addTab("Print Preview", jPanel8);

    jPanel33.setBackground(new java.awt.Color(255, 255, 255));

    jButton22.setText("Discount Types");
    jButton22.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton22ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
    jPanel33.setLayout(jPanel33Layout);
    jPanel33Layout.setHorizontalGroup(
      jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel33Layout.createSequentialGroup()
        .addGap(23, 23, 23)
        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(822, Short.MAX_VALUE))
    );
    jPanel33Layout.setVerticalGroup(
      jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel33Layout.createSequentialGroup()
        .addGap(26, 26, 26)
        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(582, Short.MAX_VALUE))
    );

    jTabbedPane2.addTab("Settings", jPanel33);

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        .addContainerGap(155, Short.MAX_VALUE)
        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(142, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(50, 50, 50)
        .addComponent(jTabbedPane2)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Maintenance", jPanel2);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jTabbedPane1)
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(2, 2, 2)
        .addComponent(jTabbedPane1)
        .addContainerGap())
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
      init_academic_years(tf_field14);
    }//GEN-LAST:event_tf_field14MouseClicked

    private void tf_field14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field14ActionPerformed
      init_academic_years(tf_field14);
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

    private void tf_periodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_periodMouseClicked
      init_years2();
    }//GEN-LAST:event_tf_periodMouseClicked

    private void tf_periodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_periodActionPerformed
      init_years2();
    }//GEN-LAST:event_tf_periodActionPerformed

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
//        init_students();
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

    private void tf_field24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field24MouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field24MouseClicked

    private void tf_field24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field24ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field24ActionPerformed

    private void tf_field25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field25MouseClicked
      init_search_student();
    }//GEN-LAST:event_tf_field25MouseClicked

    private void tf_field25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field25ActionPerformed
      init_search_student();
    }//GEN-LAST:event_tf_field25ActionPerformed

    private void tf_field12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field12ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field12ActionPerformed

    private void tf_field136MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field136MouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field136MouseClicked

    private void tf_field136ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field136ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field136ActionPerformed

    private void tf_field127MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field127MouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field127MouseClicked

    private void tf_field127ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field127ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field127ActionPerformed

    private void tf_field139MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field139MouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field139MouseClicked

    private void tf_field139ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field139ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field139ActionPerformed

    private void tf_field140MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field140MouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field140MouseClicked

    private void tf_field140ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field140ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field140ActionPerformed

    private void tbl_feesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_feesMouseClicked
      select_payment();
    }//GEN-LAST:event_tbl_feesMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      fees_payment();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

      if (jXCollapsiblePane1.isCollapsed()) {
        jXCollapsiblePane1.setCollapsed(false);
      } else {
        jXCollapsiblePane1.setCollapsed(true);
      }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void tbl_transactionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_transactionsMouseClicked
      select_transaction();
    }//GEN-LAST:event_tbl_transactionsMouseClicked

    private void tf_field13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field13MouseClicked
      init_academic_years(tf_field13);
    }//GEN-LAST:event_tf_field13MouseClicked

    private void tf_field13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field13ActionPerformed
      init_academic_years(tf_field13);
    }//GEN-LAST:event_tf_field13ActionPerformed

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox16ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox16ActionPerformed

    private void tf_field26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field26MouseClicked
      init_acad_period_schedules();
    }//GEN-LAST:event_tf_field26MouseClicked

    private void tf_field26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field26ActionPerformed
      init_acad_period_schedules();
    }//GEN-LAST:event_tf_field26ActionPerformed

    private void tf_field27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field27MouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field27MouseClicked

    private void tf_field27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field27ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field27ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
      save_academic_other_fees();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void tf_field28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field28MouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field28MouseClicked

    private void tf_field28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field28ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field28ActionPerformed

    private void tf_field29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field29MouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field29MouseClicked

    private void tf_field29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field29ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field29ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
      if (jCheckBox10.isSelected()) {
        tf_field29.setText("0.00");
        tf_field29.setFocusable(false);
      } else {

        tf_field29.setFocusable(true);
      }
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void tf_field30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field30MouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field30MouseClicked

    private void tf_field30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field30ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field30ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      set_payables();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      set_student_ledger();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      copy_fees();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
      copy_other_fees();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void tf_year_levelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_year_levelMouseClicked
      init_years_levels();
    }//GEN-LAST:event_tf_year_levelMouseClicked

    private void tf_year_levelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_year_levelActionPerformed
      init_years_levels();
    }//GEN-LAST:event_tf_year_levelActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
      delete_assessment();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
      add_adjustments();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
      other_payment();
    }//GEN-LAST:event_jButton14ActionPerformed

  private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
    downpayment();
  }//GEN-LAST:event_jButton17ActionPerformed

  private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
    enrollment_discount();
  }//GEN-LAST:event_jButton18ActionPerformed

  private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
    view_assessment();
  }//GEN-LAST:event_jButton19ActionPerformed

  private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
    ret_fees();
  }//GEN-LAST:event_jButton20ActionPerformed

  private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
    ret_transactions();
  }//GEN-LAST:event_jButton21ActionPerformed

  private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
    discount_types();
  }//GEN-LAST:event_jButton22ActionPerformed

  private void tf_field17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field17ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_field17ActionPerformed

  /**
   * @param args the command line arguments
   */

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.ButtonGroup buttonGroup2;
  private javax.swing.ButtonGroup buttonGroup3;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton10;
  private javax.swing.JButton jButton11;
  private javax.swing.JButton jButton12;
  private javax.swing.JButton jButton13;
  private javax.swing.JButton jButton14;
  private javax.swing.JButton jButton15;
  private javax.swing.JButton jButton16;
  private javax.swing.JButton jButton17;
  private javax.swing.JButton jButton18;
  private javax.swing.JButton jButton19;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton20;
  private javax.swing.JButton jButton21;
  private javax.swing.JButton jButton22;
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
  private javax.swing.JCheckBox jCheckBox16;
  private javax.swing.JCheckBox jCheckBox2;
  private javax.swing.JCheckBox jCheckBox3;
  private javax.swing.JCheckBox jCheckBox4;
  private javax.swing.JCheckBox jCheckBox5;
  private javax.swing.JCheckBox jCheckBox6;
  private javax.swing.JCheckBox jCheckBox7;
  private javax.swing.JCheckBox jCheckBox8;
  private javax.swing.JCheckBox jCheckBox9;
  private javax.swing.JLabel jLabel1;
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
  private javax.swing.JLabel jLabel26;
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
  private javax.swing.JLabel jLabel7;
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
  private javax.swing.JLabel jLabel85;
  private javax.swing.JLabel jLabel86;
  private javax.swing.JLabel jLabel87;
  private javax.swing.JLabel jLabel88;
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
  private javax.swing.JTable jTable1;
  private org.jdesktop.swingx.JXCollapsiblePane jXCollapsiblePane1;
  private javax.swing.JTable tbl_fees;
  private javax.swing.JTable tbl_miscellaneous_fees;
  private javax.swing.JTable tbl_other_fees;
  private javax.swing.JTable tbl_transactions;
  private javax.swing.JTextField tf_field10;
  private javax.swing.JTextField tf_field11;
  private javax.swing.JTextField tf_field12;
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
  private javax.swing.JTextField tf_field135;
  private javax.swing.JTextField tf_field136;
  private javax.swing.JTextArea tf_field138;
  private javax.swing.JTextField tf_field139;
  private javax.swing.JTextField tf_field14;
  private javax.swing.JTextField tf_field140;
  private javax.swing.JTextField tf_field15;
  private javax.swing.JTextField tf_field16;
  private javax.swing.JTextField tf_field17;
  private javax.swing.JTextField tf_field18;
  private javax.swing.JTextField tf_field19;
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
  private javax.swing.JTextField tf_field30;
  private javax.swing.JTextField tf_field31;
  private javax.swing.JTextField tf_field5;
  private javax.swing.JTextField tf_field6;
  private javax.swing.JTextField tf_field7;
  private javax.swing.JTextField tf_field8;
  private javax.swing.JTextField tf_field9;
  private javax.swing.JTextField tf_period;
  private javax.swing.JTextField tf_year_level;
  // End of variables declaration//GEN-END:variables

  private void myInit() {
    init_key();
//
//    System.setProperty("pool_db", "db_cis_cosca");
//    System.setProperty("pool_password", "password");
//        System.setProperty("pool_host", "10.0.0.251");
    deps = Departments.ret_data(" order by department_name  asc ");

    acad_years = Academic_years.ret_data(" where status=1 ");
    acad_years2 = Academic_years.ret_data(" order by id asc ");
    if (!acad_years.isEmpty()) {
      for (Academic_years.to_academic_years to1 : acad_years) {
        Field.Combo year = (Field.Combo) tf_field14;
        Field.Combo year2 = (Field.Combo) tf_field13;
        year.setText(to1.years);
        year.setId("" + to1.id);
        year2.setText(to1.years);
        year2.setId("" + to1.id);
        academic_year_id = to1.id;
      }
    }
    acad_periods.add("");
    acad_periods.add("First Semester");
    acad_periods.add("Second Semester");
    acad_periods.add("Summer Class");
    ret_mode_of_payments();
    init_tbl_miscellaneous_fees(tbl_miscellaneous_fees);
    init_tbl_other_fees(tbl_other_fees);
    init_tbl_added_subjectssubjects(jTable1);
    init_tbl_fees(tbl_fees);
    init_tbl_transactionssubjects(tbl_transactions);
    jButton3.setEnabled(false);

    jLabel55.setText(" " + MyUser.getUser_screen_name());

    cashin();

    jLabel80.setVisible(false);
    tf_field129.setVisible(false);
    jButton4.setVisible(false);
    jButton8.setVisible(false);
    tf_field17.setText(MyUser.getUser_screen_name().toUpperCase());
    tf_field25.grabFocus();
  }
  Academic_years.to_academic_years acad = null;
  Academic_year_period_schedules.to_academic_year_period_schedules acad_schedule = null;

  List<Academic_year_period_schedules.to_academic_year_period_schedules> acad_schedules = new ArrayList();

  int academic_year_id = 0;
  List<Academic_years.to_academic_years> acad_years = new ArrayList();
  List<Academic_years.to_academic_years> acad_years2 = new ArrayList();
  List<Departments.to_departments> deps = new ArrayList();

  private void ret_cashin_details() {
    String now = DateType.convert_datetime_sf(DateType.now());
    List<CashDrawer.to_cash_drawer> logs = CashDrawer.ret_data("where user_id='" + MyUser.getUser_id() + "' and Date(time_in)='" + now + "' order by id desc limit 1");

    if (!logs.isEmpty()) {
      CashDrawer.to_cash_drawer to = (CashDrawer.to_cash_drawer) logs.get(0);
      jLabel60.setText(FitIn.fmt_woc_0(to.amount));
      try {
        jLabel56.setText(" " + DateType.convert_slash_datetime2(to.time_in));
      } catch (Exception e) {
      }
      try {
        jLabel57.setText(" " + DateType.convert_slash_datetime2(to.time_out));
      } catch (Exception e) {
      }

    }
  }

  private void cashin() {
    String now = DateType.convert_datetime_sf(DateType.now());
    List<CashDrawer.to_cash_drawer> logs = CashDrawer.ret_data("where user_id='" + MyUser.getUser_id() + "' and Date(time_in)='" + now + "' order by id desc limit 1");

    if (!logs.isEmpty()) {
      CashDrawer.to_cash_drawer to = (CashDrawer.to_cash_drawer) logs.get(0);
      Window p = (Window) this;
      Dlg_cashin nd = Dlg_cashin.create(p, true);
      nd.setTitle("");
      nd.do_pass(to);
      nd.setCallback(new Dlg_cashin.Callback() {

        @Override
        public void ok(CloseDialog closeDialog, Dlg_cashin.OutputData data) {
          ret_cashin_details();
          closeDialog.ok();

        }

        @Override
        public void close(CloseDialog closeDialog, Dlg_cashin.OutputData data) {
          ret_cashin_details();
          closeDialog.ok();
        }

      });
      nd.setLocationRelativeTo(this);
      nd.setVisible(true);
    } else {
      Window p = (Window) this;
      Dlg_cashin nd = Dlg_cashin.create(p, true);
      nd.setTitle("");
      nd.do_pass_new_login();
      nd.setCallback(new Dlg_cashin.Callback() {
        @Override
        public void ok(CloseDialog closeDialog, Dlg_cashin.OutputData data) {
          closeDialog.ok();
          ret_cashin_details();
        }

        @Override
        public void close(CloseDialog closeDialog, Dlg_cashin.OutputData data) {
          closeDialog.ok();
          ret_cashin_details();

        }

      });
      nd.setLocationRelativeTo(this);
      nd.setVisible(true);
    }

  }

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

        tf_year_level.setText("");
//                Field.Combo pe = (Field.Combo) tf_period;
//                pe.setId("");
//                pe.setText("");

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

        ret_academic_other_fees();
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
        Field.Combo per = (Field.Combo) tf_period;
        year.setText("");
        year.setId("");
//                per.setText("");
//                per.setId("");
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

  List<String> acad_periods = new ArrayList();

  private void init_years2() {
    Object[][] obj = new Object[acad_periods.size()][1];
    int i = 0;
    for (String to : acad_periods) {
      obj[i][0] = " " + to;

      i++;
    }
    JLabel[] labels = {};
    int[] tbl_widths_customers = {tf_period.getWidth()};
    int width = 0;
    String[] col_names = {""};
    TableRenderer tr = new TableRenderer();
    TableRenderer.setPopup(tf_period, obj, labels, tbl_widths_customers, col_names);
    tr.setCallback(new TableRenderer.Callback() {
      @Override
      public void ok(TableRenderer.OutputData data) {
        String to = acad_periods.get(data.selected_row);
        tf_period.setText("" + to);

        if (!tf_field16.getText().isEmpty()) {
          ret_tuition_fee();
          ret_data();
          ret_data_other_fees();
        }

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
    int[] tbl_widths_customers = {140, 270, 40};
    int width = 0;
    String[] col_names = {"", "", ""};
    TableRenderer tr = new TableRenderer();
    TableRenderer.setPopup2(tf_field16, obj, labels, tbl_widths_customers, col_names, 450);
    tr.setCallback(new TableRenderer.Callback() {
      @Override
      public void ok(TableRenderer.OutputData data) {
        Courses.to_courses to = courses.get(data.selected_row);
        Field.Combo co = (Field.Combo) tf_field16;
        co.setText("" + to.course_description);
        co.setId("" + to.id);

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
    Field.Combo acad2 = (Field.Combo) tf_field14;
    Field.Combo dep = (Field.Combo) tf_field15;
    Field.Combo lev = (Field.Combo) tf_field22;
    Field.Combo year = (Field.Combo) tf_field16;
    Field.Combo per = (Field.Combo) tf_period;
    Field.Combo year_level = (Field.Combo) tf_year_level;
    String where = " where id<>0 ";
    if (acad2.getId().equalsIgnoreCase("1") && !per.getText().equalsIgnoreCase("Summer Class") || acad2.getId().equalsIgnoreCase("9") && !per.getText().equalsIgnoreCase("Summer Class")) {

      where = where + " and academic_year_id='" + acad2.getId() + "' "
              + " and department_id='" + dep.getId() + "' "
              + " and level_id='" + lev.getId() + "' "
              + " and course_id='" + year.getId() + "' "
              + " and period like 'First Year' "
              + " and year_level like '" + year_level.getText() + "' "
              + " and group_id=1 ";
    } else {
      where = where + " and academic_year_id='" + acad2.getId() + "' "
              + " and department_id='" + dep.getId() + "' "
              + " and level_id='" + lev.getId() + "' "
              + " and course_id='" + year.getId() + "' "
              + " and period like '" + per.getText() + "' "
              + " and year_level like '" + year_level.getText() + "' "
              + " and group_id=1 ";
    }

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
    Field.Combo acad2 = (Field.Combo) tf_field14;
    Field.Combo dep = (Field.Combo) tf_field15;
    Field.Combo lev = (Field.Combo) tf_field22;
    Field.Combo year = (Field.Combo) tf_field16;
    Field.Combo per = (Field.Combo) tf_period;
    Field.Combo year_level = (Field.Combo) tf_year_level;

    String where = " where id<>0 ";
    if (acad2.getId().equalsIgnoreCase("1") && !per.getText().equalsIgnoreCase("Summer Class") || acad2.getId().equalsIgnoreCase("9") && !per.getText().equalsIgnoreCase("Summer Class")) {
      where = where + " and academic_year_id='" + acad2.getId() + "' "
              + " and department_id='" + dep.getId() + "' "
              + " and level_id='" + lev.getId() + "' "
              + " and course_id='" + year.getId() + "' "
              + " and period like 'First Year' "
              + " and year_level like '" + year_level.getText() + "' "
              + " and group_id=2 ";
    } else {
      where = where + " and academic_year_id='" + acad2.getId() + "' "
              + " and department_id='" + dep.getId() + "' "
              + " and level_id='" + lev.getId() + "' "
              + " and course_id='" + year.getId() + "' "
              + " and period like '" + per.getText() + "' "
              + " and year_level like '" + year_level.getText() + "' "
              + " and group_id=2 ";
    }

    List<Academic_year_fees.to_academic_year_fees> datas = Miscellaneous_fees.ret_data3(where);
//    System.out.println("where: "+where);
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

          Field.Combo acad = (Field.Combo) tf_field14;
          Field.Combo dep = (Field.Combo) tf_field15;
          Field.Combo lev = (Field.Combo) tf_field22;
          Field.Combo year = (Field.Combo) tf_field16;
          Field.Combo per = (Field.Combo) tf_period;

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
            double lab_unit_amount = FitIn.toDouble(tf_field24.getText());
            String year_lvl = to.year_level;
            Academic_year_fees.to_academic_year_fees fe = new Academic_year_fees.to_academic_year_fees(id, academic_year_id, academic_year, department_id,
                                                                                                       department, level_id, level, course_id, course, period, group_id, group_name, fee_id, fee, amount, is_per_unit, per_unit, created_at, updated_at, created_by, updated_by, status, is_uploaded, lab_unit_amount, year_lvl);
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
            double lab_unit_amount = FitIn.toDouble(tf_field24.getText());
            String year_lvl = to.year_level;
            Academic_year_fees.to_academic_year_fees fe = new Academic_year_fees.to_academic_year_fees(id, academic_year_id, academic_year, department_id,
                                                                                                       department, level_id, level, course_id, course, period, group_id, group_name, fee_id, fee, amount, is_per_unit, per_unit, created_at, updated_at, created_by, updated_by, status, is_uploaded, lab_unit_amount, year_lvl);
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
          Field.Combo acad = (Field.Combo) tf_field14;
          Field.Combo dep = (Field.Combo) tf_field15;
          Field.Combo lev = (Field.Combo) tf_field22;
          Field.Combo year = (Field.Combo) tf_field16;
          Field.Combo per = (Field.Combo) tf_period;

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
            double lab_unit_amount = FitIn.toDouble(tf_field24.getText());
            String year_lvl = to.year_level;
            Academic_year_fees.to_academic_year_fees fe = new Academic_year_fees.to_academic_year_fees(id, academic_year_id, academic_year, department_id,
                                                                                                       department, level_id, level, course_id, course, period, group_id, group_name, fee_id, fee, amount, is_per_unit, per_unit, created_at, updated_at, created_by, updated_by, status, is_uploaded, lab_unit_amount, year_lvl);
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
            double lab_unit_amount = FitIn.toDouble(tf_field24.getText());
            String year_lvl = to.year_level;
            Academic_year_fees.to_academic_year_fees fe = new Academic_year_fees.to_academic_year_fees(id, academic_year_id, academic_year, department_id,
                                                                                                       department, level_id, level, course_id, course, period, group_id, group_name, fee_id, fee, amount, is_per_unit, per_unit, created_at, updated_at, created_by, updated_by, status, is_uploaded, lab_unit_amount, year_lvl);
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
    Field.Combo acad2 = (Field.Combo) tf_field14;
    Field.Combo dep = (Field.Combo) tf_field15;
    Field.Combo lev = (Field.Combo) tf_field22;
    Field.Combo year = (Field.Combo) tf_field16;
    Field.Combo per = (Field.Combo) tf_period;
    Field.Combo year_level = (Field.Combo) tf_year_level;

    String where = " where id<>0 ";
    if (acad2.getId().equalsIgnoreCase("1") && !per.getText().equalsIgnoreCase("Summer Class") || acad2.getId().equalsIgnoreCase("9") && !per.getText().equalsIgnoreCase("Summer Class")) {
      where = where + " and academic_year_id='" + acad2.getId() + "' "
              + " and department_id='" + dep.getId() + "' "
              + " and level_id='" + lev.getId() + "' "
              + " and course_id='" + year.getId() + "' "
              + " and period like 'First Year' "
              + " and year_level like '" + year_level.getText() + "' "
              + " and group_id=0 ";
    } else {
      where = where + " and academic_year_id='" + acad2.getId() + "' "
              + " and department_id='" + dep.getId() + "' "
              + " and level_id='" + lev.getId() + "' "
              + " and course_id='" + year.getId() + "' "
              + " and period like '" + per.getText() + "' "
              + " and year_level like '" + year_level.getText() + "' "
              + " and group_id=0 ";
    }

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
      tf_field24.setText(FitIn.fmt_wc_0(to.lab_unit_amount));
    } else {
      Field.Input amount = (Field.Input) tf_field18;
      Field.Input per_unit = (Field.Input) tf_field19;
      amount.setText("0.00");
      amount.setId("0");
      per_unit.setText("0.00");
      tf_field24.setText("0.00");
    }
  }

  private void ret_academic_other_fees() {
    Field.Combo acad2 = (Field.Combo) tf_field14;
    Field.Combo dep = (Field.Combo) tf_field15;
    Field.Combo lev = (Field.Combo) tf_field22;
    Field.Combo year = (Field.Combo) tf_field16;
    Field.Combo per = (Field.Combo) tf_period;

    String where = " where id<>0 ";
    where = where + " and academic_year_id='" + acad2.getId() + "' "
            + " and department_id='" + dep.getId() + "' ";

    List<Academic_year_other_fees.to_academic_year_other_fees> datas = Academic_year_other_fees.ret_data(where);

    if (!datas.isEmpty()) {
      for (Academic_year_other_fees.to_academic_year_other_fees data : datas) {

        if (data.name.equalsIgnoreCase("Charge add subject")) {
          tf_field27.setText(FitIn.fmt_wc_0(data.amount1));
        }
        if (data.name.equalsIgnoreCase("Charge drop subject")) {
          tf_field28.setText(FitIn.fmt_wc_0(data.amount1));
        }
        if (data.name.equalsIgnoreCase("Withdrawal of subject deduction")) {
          if (data.remarks.equalsIgnoreCase("Full")) {
            jCheckBox10.setSelected(true);
            tf_field29.setFocusable(false);
            tf_field29.setText("0.00");
          } else {
            jCheckBox10.setSelected(true);
            tf_field29.setText(FitIn.fmt_wc_0(data.amount1));
          }

        }
        if (data.name.equalsIgnoreCase("Additional enrollment fee if late")) {
          tf_field30.setText(FitIn.fmt_wc_0(data.amount1));
        }
      }
    } else {
      tf_field27.setText(FitIn.fmt_wc_0("0.00"));
      tf_field28.setText(FitIn.fmt_wc_0("0.00"));
      tf_field29.setText(FitIn.fmt_wc_0("0.00"));
      tf_field30.setText(FitIn.fmt_wc_0("0.00"));
      jCheckBox10.setSelected(true);
      tf_field29.setFocusable(false);
    }

  }

  private void save_academic_other_fees() {

    Window p = (Window) this;
    Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
    nd.setTitle("");

    nd.setCallback(new Dlg_confirm_action.Callback() {

      @Override
      public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
        closeDialog.ok();
        Field.Combo acad2 = (Field.Combo) tf_field14;
        Field.Combo dep = (Field.Combo) tf_field15;
        Field.Combo lev = (Field.Combo) tf_field22;
        Field.Combo year = (Field.Combo) tf_field16;
        Field.Combo per = (Field.Combo) tf_period;

        String where = " where id<>0 ";
        where = where + " and academic_year_id='" + acad2.getId() + "' "
                + " and department_id='" + dep.getId() + "' ";
        List<Academic_year_other_fees.to_academic_year_other_fees> datas = Academic_year_other_fees.ret_data(where);
        String[] fees = {"Charge add subject", "Charge drop subject", "Withdrawal of subject deduction", "Additional enrollment fee if late"};
        for (int i = 0; i < fees.length; i++) {
          String name = fees[i];
          Academic_year_other_fees.to_academic_year_other_fees to = null;
          for (Academic_year_other_fees.to_academic_year_other_fees data2 : datas) {
            if (data2.name.equalsIgnoreCase(name)) {
              to = data2;
            }
          }
          String remarks = "";
          double amount = 0;
          if (jCheckBox10.isSelected() && name.equalsIgnoreCase("Withdrawal of subject deduction")) {
            remarks = "Full";
          } else if (name.equalsIgnoreCase("Charge add subject")) {
            amount = FitIn.toDouble(tf_field27.getText());
          } else if (name.equalsIgnoreCase("Charge drop subject")) {
            amount = FitIn.toDouble(tf_field28.getText());
          } else if (!jCheckBox10.isSelected() && name.equalsIgnoreCase("Withdrawal of subject deduction")) {
            amount = FitIn.toDouble(tf_field29.getText());
          } else if (name.equalsIgnoreCase("Additional enrollment fee if late")) {
            amount = FitIn.toDouble(tf_field30.getText());
          }
          if (to == null) {
            to_academic_year_other_fees new_to = new to_academic_year_other_fees(0, FitIn.toInt(acad2.getId()), acad2.getText(), FitIn.toInt(dep.getId()),
                                                                                 dep.getText(), 0, "", 0, "", name, remarks, amount,
                                                                                 0, DateType.now(), DateType.now(), MyUser.getUser_id(), MyUser.getUser_id(), 1);
            Academic_year_other_fees.add_data(new_to);
          } else {

            to_academic_year_other_fees new_to = new to_academic_year_other_fees(to.id, FitIn.toInt(acad2.getId()), acad2.getText(), FitIn.toInt(dep.getId()),
                                                                                 dep.getText(), 0, "", 0, "", name, remarks, amount,
                                                                                 0, DateType.now(), DateType.now(), MyUser.getUser_id(), MyUser.getUser_id(), 1);
            Academic_year_other_fees.update_data2(new_to);
          }
        }
        Alert.set(0, "Successfully saved!");
      }
    });
    nd.setLocationRelativeTo(this);
    nd.setVisible(true);

  }

  private void save_tuition_fee() {

    Field.Combo acad2 = (Field.Combo) tf_field14;
    Field.Combo dep = (Field.Combo) tf_field15;
    Field.Combo lev = (Field.Combo) tf_field22;
    Field.Combo year = (Field.Combo) tf_field16;
    Field.Combo per = (Field.Combo) tf_period;
    Field.Combo year_level = (Field.Combo) tf_year_level;

    Field.Input amount2 = (Field.Input) tf_field18;
    Field.Input per_unit2 = (Field.Input) tf_field19;
    int id2 = FitIn.toInt(amount2.getId());
    if (id2 > 0) {
      int id = id2;
      int academic_year_id2 = FitIn.toInt(acad2.getId());
      String academic_year = acad2.getText();
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
      double lab_unit_amount = FitIn.toDouble(tf_field24.getText());

      Academic_year_fees.to_academic_year_fees fe = new Academic_year_fees.to_academic_year_fees(id, academic_year_id2, academic_year, department_id,
                                                                                                 department, level_id, level, course_id, course, period, group_id, group_name, fee_id, fee, amount, is_per_unit, per_unit, created_at, updated_at, created_by, updated_by, status, is_uploaded, lab_unit_amount, year_level.getText());

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
      int academic_year_id1 = FitIn.toInt(acad2.getId());
      String academic_year = acad2.getText();
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
      double lab_unit_amount = FitIn.toDouble(tf_field24.getText());

      Academic_year_fees.to_academic_year_fees fe = new Academic_year_fees.to_academic_year_fees(id, academic_year_id, academic_year, department_id, department, level_id, level, course_id, course, period, group_id, group_name, fee_id, fee, amount, is_per_unit, per_unit, created_at, updated_at, created_by, updated_by, status, is_uploaded, lab_unit_amount, year_level.getText()
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
  double assessment_sub_total = 0;
  double assessment_tuition = 0;
  double assessment_misc = 0;
  double assessment_other_fees = 0;

  private void init_students() {
    if (tf_field23.getText().isEmpty()) {
      Alert.set(0, "Input Student Name");
      return;
    }
    Field.Combo ac = (Field.Combo) tf_field13;
    String where = " where id<>0 and academic_year_id='" + ac.getId() + "' ";
    if (jCheckBox5.isSelected()) {
      where = where + " and student_no like '%" + tf_field23.getText() + "%' ";
    } else if (jCheckBox6.isSelected()) {

      if (!jCheckBox16.isSelected()) {
        where = where + " and concat(first_name,space(1),last_name) like '%" + tf_field23.getText() + "%' and period like '" + tf_field26.getText() + "' "
                + " or id<>0 and academic_year_id='" + ac.getId() + "' and concat(last_name,space(1),first_name) like '%" + tf_field23.getText() + "%' and period like '" + tf_field26.getText() + "' ";
      } else {
        where = where + " and concat(first_name,space(1),last_name) like '%" + tf_field23.getText() + "%' "
                + " or id<>0 and academic_year_id='" + ac.getId() + "' and concat(last_name,space(1),first_name) like '%" + tf_field23.getText() + "%'";

      }
    } else {
      where = where + " and enrollment_no like '%" + tf_field23.getText() + "%' ";
    }

    where = where + " order by last_name asc ";
//        System.out.println("where: " + where);
    List<Enrollments.to_enrollments> datas = Enrollments.ret_data(where);
    jProgressBar2.setString("Loading...Please wait...");
    jProgressBar2.setIndeterminate(true);
    tf_field23.setEnabled(true);
    Thread t1 = new Thread(new Runnable() {

      @Override
      public void run() {

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
        int[] tbl_widths_customers = {100, 150, 100, 150, 300};
        int width = 0;
        String[] col_names = {"", "", "", "", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup2(tf_field23, obj, labels, tbl_widths_customers, col_names, 800);
        tr.setCallback(new TableRenderer.Callback() {
          @Override
          public void ok(TableRenderer.OutputData data) {
            Enrollments.to_enrollments to = datas.get(data.selected_row);
            List<Students.to_students> students = Students.ret_data(" where id='" + to.student_id + "' ");
            if (!students.isEmpty()) {
              Students.to_students stud = (Students.to_students) students.get(0);
              downpayment_student = stud;
            }
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

            ret_added_subjects(to);
            if (jCheckBox13.isSelected()) {
              view_assessment();
            }
          }
        });

        jProgressBar2.setString("Finished...");
        jProgressBar2.setIndeterminate(false);
        tf_field23.setEnabled(true);
      }
    });
    t1.start();

  }

  private void view_assessment() {
    jButton17.setEnabled(false);

    jProgressBar2.setString("Loading...Please wait...");
    jProgressBar2.setIndeterminate(true);
    tf_field23.setEnabled(false);
    Thread t = new Thread(new Runnable() {
      @Override
      public void run() {
        SwingUtilities.invokeLater(new Runnable() {
          @Override
          public void run() {
            set_assessment2();
            jProgressBar2.setString("Finished...");
            jProgressBar2.setIndeterminate(false);
            tf_field23.setEnabled(true);
            tf_field23.grabFocus();
          }
        });
      }
    });
    t.start();
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
  boolean hasDownpayment = false;

  private void set_assessment2() {

    String where = " where id<>0 ";
    String where3 = " where id<>0 ";
    String where2 = " where id<>0 ";
    if (enroll.academic_year_id == 1 && !enroll.period.equalsIgnoreCase("Summer Class") || enroll.academic_year_id == 9 && !enroll.period.equalsIgnoreCase("Summer Class")) {

      where = where + " and academic_year_id='" + enroll.academic_year_id + "' "
              + " and department_id='" + enroll.department_id + "' "
              + " and level_id='" + enroll.level_id + "' "
              + " and course_id='" + enroll.course_id + "' "
              + " and period like '" + enroll.year_level + "' "
              + " and group_id=0 ";

      where2 = where2 + " and academic_year_id='" + enroll.academic_year_id + "' "
              + " and department_id='" + enroll.department_id + "' "
              + " and level_id='" + enroll.level_id + "' "
              + " and course_id='" + enroll.course_id + "' "
              + " and period like '" + enroll.year_level + "' "
              + " and group_id=1 ";

      where3 = where3 + " and academic_year_id='" + enroll.academic_year_id + "' "
              + " and department_id='" + enroll.department_id + "' "
              + " and level_id='" + enroll.level_id + "' "
              + " and course_id='" + enroll.course_id + "' "
              + " and period like '" + enroll.year_level + "' "
              + " and group_id=2 ";
    } else {
      where = where + " and academic_year_id='" + enroll.academic_year_id + "' "
              + " and department_id='" + enroll.department_id + "' "
              + " and level_id='" + enroll.level_id + "' "
              + " and course_id='" + enroll.course_id + "' "
              + " and period like '" + enroll.period + "' "
              + " and year_level like '" + enroll.year_level + "' "
              + " and group_id=0 ";

      where2 = where2 + " and academic_year_id='" + enroll.academic_year_id + "' "
              + " and department_id='" + enroll.department_id + "' "
              + " and level_id='" + enroll.level_id + "' "
              + " and course_id='" + enroll.course_id + "' "
              + " and period like '" + enroll.period + "' "
              + " and year_level like '" + enroll.year_level + "' "
              + " and group_id=1 ";

      where3 = where3 + " and academic_year_id='" + enroll.academic_year_id + "' "
              + " and department_id='" + enroll.department_id + "' "
              + " and level_id='" + enroll.level_id + "' "
              + " and course_id='" + enroll.course_id + "' "
              + " and period like '" + enroll.period + "' "
              + " and year_level like '" + enroll.year_level + "' "
              + " and group_id=2 ";
    }
    List<Academic_year_fees.to_academic_year_fees> datas = Academic_year_fees.ret_data(where);
    System.out.println(where3);
    List<Academic_year_fees.to_academic_year_fees> misc_fees = Miscellaneous_fees.ret_data2(where2);
    List<Academic_year_fees.to_academic_year_fees> other_fees = Miscellaneous_fees.ret_data3(where3);
//    System.out.println("where3: "+where3);

    List<Enrollment_assessments.to_enrollment_assessments> assessments = Enrollment_assessments.ret_data(" where enrollment_id='" + enroll.id + "' ");

    List<Student_balance_adjustments.to_student_balance_adjustments> special_classes = Student_balance_adjustments.ret_data(" where student_id='" + enroll.student_id + "' and academic_year_id='" + enroll.academic_year_id + "' and particular like '%Special Class%'");

    List<Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects> subjects = Enrollment_student_loaded_subjects.ret_data(" where enrollment_id='" + enroll.id + "' and status<2  ");
    List<Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects> added_subjects = new ArrayList();//Enrollment_student_loaded_subjects.ret_data(" where enrollment_id='" + enroll.id + "' and status<2 and is_added=1  ");
    List<Enrollment_student_loaded_subjects_drop_requests.to_enrollment_student_loaded_subjects_drop_requests> dropped_subjects = Enrollment_student_loaded_subjects_drop_requests.ret_data(" where enrollment_id='" + enroll.id + "' and status=1  ");

    List<Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes> eapm = Enrollment_assessment_payment_modes.ret_data(" where enrollment_id='" + enroll.id + "' ");

    jTabbedPane3.setSelectedIndex(1);
    jProgressBar1.setString("Loading...Please wait...");
    jProgressBar1.setIndeterminate(true);
    Thread t = new Thread(new Runnable() {

      @Override
      public void run() {

        jButton18.setText("Tuition Discount");

        List<Downpayments.to_downpayments> downpayments = Downpayments.ret_data(" where enrollment_id='" + enroll.id + "' and status<>2");
//        System.out.println("downpayments: " + downpayments.size());
        double downpay = 0;
        if (downpayments.isEmpty()) {
          jButton3.setEnabled(false);
          jButton17.setText("Downpayment");
          hasDownpayment = false;

//      return;
        } else {
          double amount = 0;
          Downpayments.to_downpayments down = (Downpayments.to_downpayments) downpayments.get(0);
          amount = down.amount;
          downpay = amount;
          jButton17.setText("Downpayment (" + FitIn.fmt_wc_0(amount) + ")");
          hasDownpayment = true;
        }
        jButton17.setEnabled(true);
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
          jButton18.setEnabled(false);

          assessment_sub_total = 0;
          assessment_tuition = 0;
          assessment_misc = 0;
          assessment_other_fees = 0;
          return;
        }
        jButton18.setEnabled(true);
        Enrollment_assessments.to_enrollment_assessments asessment = (Enrollment_assessments.to_enrollment_assessments) assessments.get(0);
        List<Enrollment_assessment_discounts.to_enrollment_assessment_discounts> discounts = Enrollment_assessment_discounts.ret_data(" where enrollment_id = '" + asessment.enrollment_id + "' and status=1 limit 1");
        double total_discount = 0;
        if (!discounts.isEmpty()) {
          Enrollment_assessment_discounts.to_enrollment_assessment_discounts disc = (Enrollment_assessment_discounts.to_enrollment_assessment_discounts) discounts.get(0);
          jButton18.setText("Tuition Discount " + FitIn.fmt_wc_0(disc.total_discount));
          total_discount = disc.total_discount;
        } else {
          jButton18.setText("Tuition Discount");
        }
        String business_name = System.getProperty("school_name", "Colegio de Santa Catalina de Alejandria (COSCA)");
        String address = System.getProperty("address", "Bishop Epifanio B. Surban St. Dumaguete City Negros Oriental, Bishop Epifanio Surban St, Dumaguete, Negros Oriental");
        String date = synsoftech.util.DateType.slash.format(new Date());
        String contact_no = System.getProperty("contact_no", "(035) 225 4831");

        String home = System.getProperty("user.home");
        String SUBREPORT_DIR = home + "\\cis\\";

        String printed_by = MyUser.getUser_screen_name();
        String school_year = enroll.academic_year;
        String semester = enroll.period;
        String student_no = enroll.student_no;
        String student_name = enroll.last_name + ", " + enroll.first_name + " " + enroll.middle_name;
        String student_course = enroll.course_code + " - " + enroll.course_description;
        String student_year_level = enroll.year_level;

        List<cis.reports.Srpt_enrollment_assessment.field_add_subjects> rpt_added_subjects = new ArrayList();
        List<cis.reports.Srpt_enrollment_assessment.field_add_subjects> rpt_dropped_subjects = new ArrayList();
        double no_of_units_lab = 0;
        List<cis.reports.Srpt_enrollment_assessment.field> fields = new ArrayList();

        //ret tuition amount
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

        //added subjects
        for (Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects sub : added_subjects) {
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
//                    tution_fee += amount;
          String section = sub.section;
          String group = "Added Subjects";
          cis.reports.Srpt_enrollment_assessment.field_add_subjects f = new cis.reports.Srpt_enrollment_assessment.field_add_subjects(subject_code, description, lec_units, lab_units, lec_amount, lab_amount, room, day, time, instructor, amount, section, group);

          rpt_added_subjects.add(f);
        }

        //Dropped subjects
        for (Enrollment_student_loaded_subjects_drop_requests.to_enrollment_student_loaded_subjects_drop_requests sub : dropped_subjects) {
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
//                    amount = amount * -1;
//                    tution_fee += amount;
          String section = sub.section;
          String group = "Dropped Subjects";
          cis.reports.Srpt_enrollment_assessment.field_add_subjects f = new cis.reports.Srpt_enrollment_assessment.field_add_subjects(subject_code, description, lec_units, lab_units, lec_amount, lab_amount, room, day, time, instructor, amount, section, group);

          rpt_dropped_subjects.add(f);
        }
        rpt_added_subjects.addAll(rpt_dropped_subjects);
        //main items
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
//                    System.out.println("Amount: "+amount);
          tution_fee += amount;
          cis.reports.Srpt_enrollment_assessment.field f = new cis.reports.Srpt_enrollment_assessment.field(subject_code, description, lec_units, lab_units, lec_amount, lab_amount, room, day, time, instructor, amount, sub.section);
          fields.add(f);
        }

        List<cis.reports.Srpt_enrollment_assessment.field_misc> misc = new ArrayList();

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
        if (!special_classes.isEmpty()) {
          Student_balance_adjustments.to_student_balance_adjustments special = special_classes.get(0);
          cis.reports.Srpt_enrollment_assessment.field_misc f = new cis.reports.Srpt_enrollment_assessment.field_misc("Special Class", special.adjustment_amount);
          rpt_fees.add(f);
          other_fee += special.adjustment_amount;
        }

        List<cis.reports.Srpt_enrollment_assessment.field_summary> rpt_summary = new ArrayList();

        int payment_count = 3;
        double tuition_fee = tuition_amount;

        total_assessment = tution_fee + other_fee + misc_fee;

        payable = total_assessment - downpay;
        downpayment = downpay;
        double sub_total = total_assessment;

        for (Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes ea : eapm) {
          double balance = ea.amount - ea.paid;
//          downpayment += ea.paid;
          cis.reports.Srpt_enrollment_assessment.field_summary f2 = new cis.reports.Srpt_enrollment_assessment.field_summary(total_assessment, downpayment, payable, ea.mode, ea.to_pay, sub_total, downpayment, (sub_total - downpayment), tution_fee, misc_fee, other_fee, sub_total, "", total_discount);
          rpt_summary.add(f2);
        }
        assessment_sub_total = sub_total;
        assessment_tuition = tution_fee;
        assessment_misc = misc_fee;
        assessment_other_fees = other_fee;

        String jrxml = "rpt_enrollment_assessment.jrxml";
        cis.reports.Srpt_enrollment_assessment rpt = new cis.reports.Srpt_enrollment_assessment(business_name, address, contact_no, date, printed_by, school_year, semester, student_no, student_name, student_course, student_year_level, SUBREPORT_DIR, misc, rpt_fees, total_assessment, downpayment, payable, rpt_summary, tution_fee, misc_fee, rpt_added_subjects, rpt_dropped_subjects);
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

        jProgressBar1.setString("Finished...");
        jProgressBar1.setIndeterminate(false);
      }
    });
    t.start();
  }

  private void set_assessment() {

  }

  private void report_assessment(final cis.reports.Srpt_enrollment_assessment to, String jrxml_name) {
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

  public static JRViewer get_viewer_assessment(cis.reports.Srpt_enrollment_assessment to, String rpt_name) {
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
  //</editor-fold>

  private void save_assessment() {

    int id = 0;
    int enrollment_id = enroll.id;
    String enrollment_no = enroll.enrollment_no;
    int student_id = enroll.student_id;
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
        set_assessment2();

      }
    });
    nd.setLocationRelativeTo(this);
    nd.setVisible(true);
  }

  //<editor-fold defaultstate="collapsed" desc=" table added subjects "> 
  public static ArrayListModel tbl_added_subjects_ALM;
  public static Tbl_added_subjects_Model tbl_added_subjects_M;

  public static void init_tbl_added_subjectssubjects(JTable tbl_added_subjects) {
    tbl_added_subjects_ALM = new ArrayListModel();
    tbl_added_subjects_M = new Tbl_added_subjects_Model(tbl_added_subjects_ALM);
    tbl_added_subjects.setModel(tbl_added_subjects_M);
    tbl_added_subjects.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    tbl_added_subjects.setRowHeight(25);
    int[] tbl_widths_enrollment_student_loaded_subjects = {100, 100, 40, 60, 0, 0};
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
      "Subject Code", "Description", "Units", "Section", "Status", ""
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
          } else {
            return "/cis/icons/remove11.png";
          }

      }
    }
  }

  private void ret_added_subjects(Enrollments.to_enrollments to) {
    Field.Input st = (Field.Input) tf_field8;

    String where = " where enrollment_id = '" + to.id + "' and status<2 order by description asc ";
    System.out.println(where);
    List<Students_curriculum.curriculum> subjects = Students_curriculum.ret_added_subjects(where);
    loadData_added_subjects(subjects);
    jLabel3.setText("" + subjects.size());
  }
  //</editor-fold>

  Students.to_students pay_student = null;
  Students.to_students downpayment_student = null;

  //<editor-fold defaultstate="collapsed" desc=" Payment ">
  private void init_search_student() {
    String where = " where id<>0 ";
    if (jCheckBox8.isSelected()) {
      where = where + " and student_no like '%" + tf_field25.getText() + "%' ";
    } else {
      where = where + " and concat(first_name,space(1),last_name) like '%" + tf_field25.getText() + "%' "
              + " or concat(last_name,space(1),first_name) like '%" + tf_field25.getText() + "%'";
    }
    where = where + " order by last_name asc ";
    List<Students.to_students> datas = Students.ret_data(where);
    Object[][] obj = new Object[datas.size()][5];
    int i = 0;
    for (Students.to_students to : datas) {
      obj[i][0] = " " + to.student_no;
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
    TableRenderer.setPopup2(tf_field25, obj, labels, tbl_widths_customers, col_names, 690);
    tr.setCallback(new TableRenderer.Callback() {
      @Override
      public void ok(TableRenderer.OutputData data) {
        Students.to_students stud = (Students.to_students) datas.get(data.selected_row);
        pay_student = stud;
        Field.Search tf = (Field.Search) tf_field25;
        Field.Input student = (Field.Input) tf_field12;

        student.setText(stud.student_no);
        student.setId("" + stud.id);

        tf_field9.setText(stud.first_name);
        tf_field10.setText(stud.middle_name);
        tf_field11.setText(stud.last_name);
        tf_field136.setText(stud.course_code);
        tf_field138.setText(stud.course_description);
        tf_field127.setText(stud.department);
        tf_field139.setText(stud.college);
        tf_field140.setText(stud.year_level);
        if (jCheckBox11.isSelected()) {
          ret_fees();
        }
        if (jCheckBox12.isSelected()) {
          ret_transactions();
        }

      }
    });
  }

  //</editor-fold>
  //<editor-fold defaultstate="collapsed" desc=" Table fees"> 
  public static ArrayListModel tbl_fees_ALM;
  public static Tbl_fees_Model tbl_fees_M;

  public static void init_tbl_fees(JTable tbl_fees) {
    tbl_fees_ALM = new ArrayListModel();
    tbl_fees_M = new Tbl_fees_Model(tbl_fees_ALM);
    tbl_fees.setModel(tbl_fees_M);
    tbl_fees.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    tbl_fees.setRowHeight(25);
    int[] tbl_widths_enrollment_student_loaded_subjects = {100, 80, 80, 60, 80, 80, 30};
    for (int i = 0, n = tbl_widths_enrollment_student_loaded_subjects.length; i < n; i++) {
      if (i == 0) {
        continue;
      }
      TableWidthUtilities.setColumnWidth(tbl_fees, i, tbl_widths_enrollment_student_loaded_subjects[i]);
    }
    Dimension d = tbl_fees.getTableHeader().getPreferredSize();
    d.height = 25;
    tbl_fees.getTableHeader().setPreferredSize(d);
    tbl_fees.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
    tbl_fees.setRowHeight(35);
    tbl_fees.setFont(new java.awt.Font("Arial", 0, 12));
    tbl_fees.getColumnModel().getColumn(0).setCellRenderer(new Html());
    TableWidthUtilities.setColumnRightRenderer(tbl_fees, 2);
    TableWidthUtilities.setColumnRightRenderer(tbl_fees, 3);
    TableWidthUtilities.setColumnRightRenderer(tbl_fees, 4);
    TableWidthUtilities.setColumnRightRenderer(tbl_fees, 5);
  }

  static class Html extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
      JLabel lbl = new JLabel();
      lbl.setText(value.toString());
      lbl.setOpaque(true);
      lbl.setBackground(Color.white);
      if (selected) {
        lbl.setBackground(new java.awt.Color(4, 176, 217));
        lbl.setForeground(new java.awt.Color(0, 0, 0));
      }
      return lbl;
    }
  }

  public static void loadData_fees(List<Finance.fees> acc) {
    tbl_fees_ALM.clear();
    tbl_fees_ALM.addAll(acc);

  }

  public static class Tbl_fees_Model extends AbstractTableAdapter {

    public static String[] COLUMNS = {
      "Desciption", "Date", "Amount", "Interest", "Paid", "Balance", ""
    };

    public Tbl_fees_Model(ListModel listmodel) {
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
      Finance.fees tt = (Finance.fees) getRow(row);
      switch (col) {
        case 0:
          return "" + tt.title;
        case 1:
          return " " + tt.date;
        case 2:
          return " " + FitIn.fmt_wc_0(tt.amount) + " ";
        case 3:
          return " " + FitIn.fmt_wc_0(tt.interest) + " ";
        case 4:
          return " " + FitIn.fmt_wc_0(tt.paid) + " ";
        case 5:
          return " " + FitIn.fmt_wc_0(tt.balance) + " ";
        default:
          return tt.selected;

      }
    }
  }

  private void ret_fees() {

    Field.Input student = (Field.Input) tf_field12;
    String where = " where studn";
    List<Finance.fees> datas = Finance.ret_data(pay_student);
    loadData_fees(datas);
    double balance = 0;
    for (Finance.fees fee : datas) {
      balance += fee.balance;
    }

    jLabel6.setText(FitIn.fmt_wc_0(balance));
//        jLabel7.setText("" + datas.size());
  }

  private void select_payment() {
    int row = tbl_fees.getSelectedRow();
    if (row < 0) {
      return;
    }
    Finance.fees to = (Finance.fees) tbl_fees_ALM.get(row);
    int col = tbl_fees.getSelectedColumn();
    if (col == 6) {
      if (to.trans_type == 1) {
        if (to.isSelected()) {
          to.setSelected(false);
        } else {
          to.setSelected(true);
        }
        tbl_fees_M.fireTableDataChanged();
      }
    } else {
      if (to.trans_type == 2) { //added subjects
        Window p = (Window) this;
        Dlg_finance_student_payment_details_subjects nd = Dlg_finance_student_payment_details_subjects.create(p, true);
        nd.setTitle("");
        nd.do_pass(pay_student);
        nd.setCallback(new Dlg_finance_student_payment_details_subjects.Callback() {
          @Override
          public void ok(CloseDialog closeDialog, Dlg_finance_student_payment_details_subjects.OutputData data) {
            closeDialog.ok();

            ret_fees();

            if (jCheckBox12.isSelected()) {
              ret_transactions();
            }
          }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
      }
      if (to.trans_type == 3) { //drop subjects
        Window p = (Window) this;
        Dlg_finance_student_payment_details_subjects nd = Dlg_finance_student_payment_details_subjects.create(p, true);
        nd.setTitle("");
        nd.do_pass2(pay_student);
        nd.setCallback(new Dlg_finance_student_payment_details_subjects.Callback() {
          @Override
          public void ok(CloseDialog closeDialog, Dlg_finance_student_payment_details_subjects.OutputData data) {
            closeDialog.ok();
            ret_fees();
            if (jCheckBox12.isSelected()) {
              ret_transactions();
            }
          }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
      }
      if (to.trans_type == 5) { //balance adjustment

        List<Finance.fees> selected = new ArrayList();
        selected.add(to);
        if (selected.isEmpty()) {
          Alert.set(0, "Select Fee/s to pay!");
          return;
        }
        Window p = (Window) this;
        Dlg_finance_payment nd = Dlg_finance_payment.create(p, true);
        nd.setTitle("");
        nd.do_pass2F(selected, pay_student);
        nd.setCallback(new Dlg_finance_payment.Callback() {

          @Override
          public void ok(CloseDialog closeDialog, Dlg_finance_payment.OutputData data) {
            closeDialog.ok();
            ret_fees();
            if (jCheckBox12.isSelected()) {
              ret_transactions();
            }
          }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
      }
    }

  }
//</editor-fold>

  private void fees_payment() {
    List<Finance.fees> fees = tbl_fees_ALM;
    List<Finance.fees> selected = new ArrayList();
    for (Finance.fees fee : fees) {
      if (fee.isSelected()) {
        selected.add(fee);
      }
    }
    if (selected.isEmpty()) {
      Alert.set(0, "Select Fee/s to pay!");
      return;
    }
    Window p = (Window) this;
    Dlg_finance_payment nd = Dlg_finance_payment.create(p, true);
    nd.setTitle("");
    nd.do_pass(selected, pay_student, true);
    nd.setCallback(new Dlg_finance_payment.Callback() {

      @Override
      public void ok(CloseDialog closeDialog, Dlg_finance_payment.OutputData data) {
        closeDialog.ok();
        ret_fees();
        ret_transactions();
      }
    });
    nd.setLocationRelativeTo(this);
    nd.setVisible(true);
  }

  private void other_payment() {

    Window p = (Window) this;
    Dlg_finance_payment nd = Dlg_finance_payment.create(p, true);
    nd.setTitle("");
    nd.do_pass_other_payment();
    nd.setCallback(new Dlg_finance_payment.Callback() {

      @Override
      public void ok(CloseDialog closeDialog, Dlg_finance_payment.OutputData data) {
        closeDialog.ok();

      }
    });
    nd.setLocationRelativeTo(this);
    nd.setVisible(true);
  }

  private void downpayment() {
//    System.out.println("downpayment_student: " + downpayment_student);
//    System.out.println("enroll: " + enroll);

    if (enroll == null) {
      Alert.set(0, "Select a student!");
      return;
    }
    if (hasDownpayment) {
      Alert.set(0, "Already Paid!");
      return;
    }
    Window p = (Window) this;
    Dlg_finance_payment nd = Dlg_finance_payment.create(p, true);
    nd.setTitle("");
    nd.do_pass_downpayment(downpayment_student, enroll);
    nd.setCallback(new Dlg_finance_payment.Callback() {

      @Override
      public void ok(CloseDialog closeDialog, Dlg_finance_payment.OutputData data) {
        closeDialog.ok();
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

  //<editor-fold defaultstate="collapsed" desc=" transactions ">
  //<editor-fold defaultstate="collapsed" desc=" table added subjects "> 
  public static ArrayListModel tbl_transactions_ALM;
  public static Tbl_transactions_Model tbl_transactions_M;

  public static void init_tbl_transactionssubjects(JTable tbl_transactions) {
    tbl_transactions_ALM = new ArrayListModel();
    tbl_transactions_M = new Tbl_transactions_Model(tbl_transactions_ALM);
    tbl_transactions.setModel(tbl_transactions_M);
    tbl_transactions.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    tbl_transactions.setRowHeight(25);
    int[] tbl_widths_enrollment_student_loaded_subjects = {150, 100, 80, 80, 80, 30};
    for (int i = 0, n = tbl_widths_enrollment_student_loaded_subjects.length; i < n; i++) {
      if (i == 1) {
        continue;
      }
      TableWidthUtilities.setColumnWidth(tbl_transactions, i, tbl_widths_enrollment_student_loaded_subjects[i]);
    }
    Dimension d = tbl_transactions.getTableHeader().getPreferredSize();
    d.height = 25;
    tbl_transactions.getTableHeader().setPreferredSize(d);
    tbl_transactions.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
    tbl_transactions.setRowHeight(25);
    tbl_transactions.setFont(new java.awt.Font("Arial", 0, 12));
    tbl_transactions.getColumnModel().getColumn(5).setCellRenderer(new ImageRenderer());
    TableWidthUtilities.setColumnRightRenderer(tbl_transactions, 2);
    TableWidthUtilities.setColumnRightRenderer(tbl_transactions, 3);
    TableWidthUtilities.setColumnRightRenderer(tbl_transactions, 4);
  }

  public static void loadData_transactions(List<Finance.transactions> acc) {
    tbl_transactions_ALM.clear();
    tbl_transactions_ALM.addAll(acc);

  }

  public static class Tbl_transactions_Model extends AbstractTableAdapter {

    public static String[] COLUMNS = {
      "Date", "Transactions", "Debit", "Credit", "Balance", ""
    };

    public Tbl_transactions_Model(ListModel listmodel) {
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
      Finance.transactions tt = (Finance.transactions) getRow(row);
      switch (col) {
        case 0:
          return " " + tt.date;
        case 1:
          return " " + tt.mode;
        case 2:
          return " " + FitIn.fmt_wc_0(tt.debit) + " ";
        case 3:
          return " " + FitIn.fmt_wc_0(tt.credit) + " ";
        case 4:
          return " " + FitIn.fmt_wc_0(tt.balance) + " ";
        default:
          return "/cis/icons/tool.png";

      }
    }
  }

  private void ret_transactions() {
    List<Finance.transactions> transactions = Finance.ret_transactions(pay_student);
    loadData_transactions(transactions);
  }

  private void select_transaction() {
    int row = tbl_transactions.getSelectedRow();
    if (row < 0) {
      return;
    }
    int col = tbl_transactions.getSelectedColumn();
    if (col == 3) {
      Finance.transactions to = (Finance.transactions) tbl_transactions_ALM.get(row);
      Window p = (Window) this;
      Dlg_finance_transaction_reports nd = Dlg_finance_transaction_reports.create(p, true);
      nd.setTitle("");
      nd.do_pass(to);
      nd.setCallback(new Dlg_finance_transaction_reports.Callback() {

        @Override
        public void ok(CloseDialog closeDialog, Dlg_finance_transaction_reports.OutputData data) {
          closeDialog.ok();
        }
      });
      nd.setLocationRelativeTo(this);
      nd.setVisible(true);
    }
  }
  //</editor-fold>

  List<String> periods = new ArrayList();

  private void init_acad_period_schedules() {

    periods.clear();
    periods.add("");
    periods.add("First Semester");
    periods.add("Second Semester");
    periods.add("Summer Class");
    Object[][] obj = new Object[periods.size()][1];
    int i = 0;
    for (String to : periods) {
      obj[i][0] = " " + to;
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
        String to = (String) periods.get(data.selected_row);

        Field.Combo co = (Field.Combo) tf_field26;
        co.setText("" + to);

        ret_data();
      }
    });
  }

  private void init_academic_years(JTextField tf) {
    Object[][] obj = new Object[acad_years2.size()][1];
    int i = 0;
    for (Academic_years.to_academic_years to : acad_years2) {
      obj[i][0] = " " + to.years;
      i++;
    }
    JLabel[] labels = {};
    int[] tbl_widths_customers = {tf.getWidth()};
    int width = 0;
    String[] col_names = {""};
    TableRenderer tr = new TableRenderer();
    TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
    tr.setCallback(new TableRenderer.Callback() {
      @Override
      public void ok(TableRenderer.OutputData data) {
        Academic_years.to_academic_years to = acad_years2.get(data.selected_row);
        Field.Combo co = (Field.Combo) tf;
        co.setText("" + to.years);
        co.setId("" + to.id);

        if (!tf_field16.getText().isEmpty()) {
          ret_tuition_fee();
          ret_data();
          ret_data_other_fees();
        }
      }
    });
  }

  //Payables
  private void set_payables() {
    jTabbedPane5.setSelectedIndex(2);
    jProgressBar1.setString("Loading...Please wait...");
    jProgressBar1.setIndeterminate(true);
    Thread t = new Thread(new Runnable() {

      @Override
      public void run() {

        String business_name = System.getProperty("school_name", "Colegio de Santa Catalina de Alejandria (COSCA)");
        String address = System.getProperty("address", "Bishop Epifanio B. Surban St. Dumaguete City Negros Oriental, Bishop Epifanio Surban St, Dumaguete, Negros Oriental");
        String date = DateType.slash.format(new Date());
        String contact_no = System.getProperty("contact_no", "(035) 225 4831");
        String printed_by = MyUser.getUser_screen_name();
        String student_no = tf_field12.getText();
        String student_name = tf_field11.getText() + ", " + tf_field9.getText() + " " + tf_field10.getText();
        List<Srpt_student_payables.field> fields = new ArrayList();
        List<Finance.fees> fees = tbl_fees_ALM;
        double amount_due = 0;
        for (Finance.fees fee : fees) {

          int id = 0;
          String mode = fee.mode;

          String term = fee.term;
          String year_level = fee.year + " - " + fee.title;
          String academic_year = fee.year;
          String date2 = fee.date;
          double amount = fee.amount;
          double interest = fee.interest;
          double paid = fee.paid;
          double balance = fee.balance;
          double debit = 0;
          double credit = 0;
          amount_due += balance;
          Srpt_student_payables.field f = new Srpt_student_payables.field(id, mode, year_level, academic_year, date, amount, interest, paid, balance, debit, credit);
          fields.add(f);
        }

        String logo_path = System.getProperty("logo_path", "C:\\\\Users\\\\USER\\\\cis\\\\logo.jpg");
        String student_address = pay_student.permanent_address;
        String billing_date = date;
        String verified_by = "";
        String approved_by = "";
        String received_by = "";

        String jrxml = "rpt_student_payables.jrxml";

        Srpt_student_payables rpt = new Srpt_student_payables(business_name, address, contact_no, date, student_no, student_name,
                                                              logo_path, student_address, billing_date, verified_by, approved_by, received_by, amount_due);
        rpt.fields.addAll(fields);
        report_payables(rpt, jrxml);

        InputStream is = Srpt_student_payables.class.getResourceAsStream(jrxml);
        try {
          JasperReport jasperReport = JasperCompileManager.compileReport(is);
          jasperPrint2 = JasperFillManager.fillReport(jasperReport, JasperUtil.
                                                      setParameter(rpt), JasperUtil.makeDatasource(rpt.fields));

        } catch (JRException ex) {
          Logger.getLogger(Dlg_finance.class.getName()).log(Level.SEVERE, null, ex);
        }

        jProgressBar1.setString("Finished...");
        jProgressBar1.setIndeterminate(false);
      }
    });
    t.start();
  }

  private void report_payables(final Srpt_student_payables to, String jrxml_name) {
    jPanel31.removeAll();
    jPanel31.setLayout(new BorderLayout());
    try {
      JRViewer viewer = get_viewer_payables(to, jrxml_name);
      JPanel pnl = new JPanel();
      pnl.add(viewer);
      pnl.setVisible(true);
      pnl.setVisible(true);
      jPanel31.add(viewer);
      jPanel31.setMinimumSize(new Dimension(626, 0));
      jPanel31.setMaximumSize(new Dimension(626, 0));
      jPanel31.setPreferredSize(new Dimension(626, 0));
      jPanel31.updateUI();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public static JRViewer get_viewer_payables(Srpt_student_payables to, String rpt_name) {
    try {
      return JasperUtil.getJasperViewer(
              compileJasper_payables(rpt_name),
              JasperUtil.setParameter(to),
              JasperUtil.makeDatasource(to.fields));
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
    }
  }

  public static JasperReport compileJasper_payables(String rpt_name) {
    try {
      String jrxml = rpt_name;
      InputStream is = Srpt_student_payables.class.
              getResourceAsStream(jrxml);
      JasperReport jasper = JasperCompileManager.compileReport(is);
      return jasper;
    } catch (JRException e) {
      throw new RuntimeException(e);
    }
  }

  JasperPrint jasperPrint2 = null;

  private void print_payables() {
    try {
      if (jasperPrint2 != null) {
        JasperPrintManager.printReport(jasperPrint2, false);
      }

    } catch (JRException e) {
      JOptionPane.showMessageDialog(null, "Failed To Print, Please Check the Printer");
      throw new RuntimeException(e);
    }
  }

  //Student Ledger
  private void set_student_ledger() {
    jTabbedPane5.setSelectedIndex(2);
    jProgressBar1.setString("Loading...Please wait...");
    jProgressBar1.setIndeterminate(true);
    Thread t = new Thread(new Runnable() {

      @Override
      public void run() {

        String business_name = System.getProperty("school_name", "Colegio de Santa Catalina de Alejandria (COSCA)");
        String address = System.getProperty("address", "Bishop Epifanio B. Surban St. Dumaguete City Negros Oriental, Bishop Epifanio Surban St, Dumaguete, Negros Oriental");
        String date = DateType.slash.format(new Date());
        String contact_no = System.getProperty("contact_no", "(035) 225 4831");
        String printed_by = MyUser.getUser_screen_name();
        String student_no = tf_field12.getText();
        String student_name = tf_field11.getText() + ", " + tf_field9.getText() + " " + tf_field10.getText();
        List<Srpt_student_payables.field> fields = new ArrayList();

        List<Finance.transactions> transactions = tbl_transactions_ALM;
        double amount_due = 0;
        for (Finance.transactions to : transactions) {

          int id = 0;
          String mode = to.mode;
          String[] group = mode.split("-");
          mode = group[0];
          String term = to.term;
          String year_level = group[1];
          String academic_year = to.academic_year;
          String date2 = to.date;
          double amount = to.amount;
          double interest = 0;
          double paid = 0;
          double balance = to.balance;
          double debit = to.debit;
          double credit = to.credit;
          amount_due = balance;
          Srpt_student_payables.field f = new Srpt_student_payables.field(id, mode, year_level, academic_year, date, amount, interest, paid, balance, debit, credit);
          fields.add(f);
        }

        String logo_path = System.getProperty("logo_path", "C:\\\\Users\\\\USER\\\\cis\\\\logo.jpg");
        String student_address = pay_student.permanent_address;
        String billing_date = date;
        String verified_by = tf_field17.getText().toUpperCase();
        String approved_by = tf_field31.getText().toUpperCase();
        String received_by = "";

        String jrxml = "rpt_student_payables.jrxml";

        Srpt_student_payables rpt = new Srpt_student_payables(business_name, address, contact_no, date, student_no, student_name,
                                                              logo_path, student_address, billing_date, verified_by, approved_by, received_by, amount_due);
        rpt.fields.addAll(fields);
        report_payables(rpt, jrxml);

        InputStream is = Srpt_student_payables.class.getResourceAsStream(jrxml);
        try {
          JasperReport jasperReport = JasperCompileManager.compileReport(is);
          jasperPrint2 = JasperFillManager.fillReport(jasperReport, JasperUtil.
                                                      setParameter(rpt), JasperUtil.makeDatasource(rpt.fields));

        } catch (JRException ex) {
          Logger.getLogger(Dlg_finance.class.getName()).log(Level.SEVERE, null, ex);
        }

        jProgressBar1.setString("Finished...");
        jProgressBar1.setIndeterminate(false);
      }

    });
    t.start();
  }

  private void set_student_ledger2() {
    jTabbedPane5.setSelectedIndex(2);
    jProgressBar1.setString("Loading...Please wait...");
    jProgressBar1.setIndeterminate(true);
    Thread t = new Thread(new Runnable() {

      @Override
      public void run() {

        String business_name = System.getProperty("school_name", "Colegio de Santa Catalina de Alejandria (COSCA)");
        String address = System.getProperty("address", "Bishop Epifanio B. Surban St. Dumaguete City Negros Oriental, Bishop Epifanio Surban St, Dumaguete, Negros Oriental");
        String date = DateType.slash.format(new Date());
        String contact_no = System.getProperty("contact_no", "(035) 225 4831");
        String printed_by = MyUser.getUser_screen_name();
        String student_no = tf_field12.getText();
        String student_name = tf_field9.getText() + " " + tf_field10.getText() + " " + tf_field11.getText();
        List<Srpt_student_ledger.field> fields = new ArrayList();
        List<Finance.transactions> transactions = tbl_transactions_ALM;
        for (Finance.transactions to : transactions) {
          int id = to.id;
          String mode = to.mode;
          if (mode.contains("-")) {
            String[] m = mode.split("-");
            mode = m[0];
          }
          String term = to.term;
          String year_level = to.year_level;
          String academic_year = to.academic_year + " / " + term;
          String date2 = to.date;
          String debit = FitIn.fmt_wc_0(to.debit);
          String credit = FitIn.fmt_wc_0(to.credit);
          String interest = "";
          double balance = to.balance;
          String or_no = to.or_no;
          double amount = to.debit + to.credit;
          Srpt_student_ledger.field f = new Srpt_student_ledger.field(id, mode, year_level, term, academic_year, date2, debit, credit, interest, balance, or_no, amount);
          fields.add(f);
        }

        String jrxml = "rpt_student_ledger.jrxml";

        Srpt_student_ledger rpt = new Srpt_student_ledger(business_name, address, contact_no, date, student_no, student_name);

        rpt.fields.addAll(fields);
        report_student_ledger(rpt, jrxml);

        InputStream is = Srpt_student_ledger.class.getResourceAsStream(jrxml);
        try {
          JasperReport jasperReport = JasperCompileManager.compileReport(is);
          jasperPrint3 = JasperFillManager.fillReport(jasperReport, JasperUtil.
                                                      setParameter(rpt), JasperUtil.makeDatasource(rpt.fields));

        } catch (JRException ex) {
          Logger.getLogger(Dlg_finance.class.getName()).log(Level.SEVERE, null, ex);
        }

        jProgressBar1.setString("Finished...");
        jProgressBar1.setIndeterminate(false);
      }
    });
    t.start();
  }

  private void report_student_ledger(final Srpt_student_ledger to, String jrxml_name) {
    jPanel31.removeAll();
    jPanel31.setLayout(new BorderLayout());
    try {
      JRViewer viewer = get_viewer_student_ledger(to, jrxml_name);
      JPanel pnl = new JPanel();
      pnl.add(viewer);
      pnl.setVisible(true);
      pnl.setVisible(true);
      jPanel31.add(viewer);
      jPanel31.setMinimumSize(new Dimension(626, 0));
      jPanel31.setMaximumSize(new Dimension(626, 0));
      jPanel31.setPreferredSize(new Dimension(626, 0));
      jPanel31.updateUI();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public static JRViewer get_viewer_student_ledger(Srpt_student_ledger to, String rpt_name) {
    try {
      return JasperUtil.getJasperViewer(
              compileJasper_student_ledger(rpt_name),
              JasperUtil.setParameter(to),
              JasperUtil.makeDatasource(to.fields));
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
    }
  }

  public static JasperReport compileJasper_student_ledger(String rpt_name) {
    try {
      String jrxml = rpt_name;
      InputStream is = Srpt_student_ledger.class.
              getResourceAsStream(jrxml);
      JasperReport jasper = JasperCompileManager.compileReport(is);
      return jasper;
    } catch (JRException e) {
      throw new RuntimeException(e);
    }
  }

  JasperPrint jasperPrint3 = null;

  private void print_student_ledger() {
    try {
      if (jasperPrint3 != null) {
        JasperPrintManager.printReport(jasperPrint3, false);
      }

    } catch (JRException e) {
      JOptionPane.showMessageDialog(null, "Failed To Print, Please Check the Printer");
      throw new RuntimeException(e);
    }
  }

  private void copy_fees() {
    if (tf_field16.getText().isEmpty()) {
      Alert.set(0, "Please select a course!");
      return;
    }
    Field.Combo acad2 = (Field.Combo) tf_field14;
    Field.Combo per = (Field.Combo) tf_period;
    Field.Combo dep = (Field.Combo) tf_field15;
    Field.Combo lev = (Field.Combo) tf_field22;
    Field.Combo year = (Field.Combo) tf_field16;

    Field.Combo year_level = (Field.Combo) tf_year_level;

    String academic_year = acad2.getText();
    String academic_year_id2 = acad2.getId();
    String period = per.getText();
    String period_id = per.getId();
    String department = dep.getText();
    String department_id = dep.getId();
    String level = lev.getText();
    String level_id = lev.getId();
    String course = year.getText();
    String course_id = year.getId();

    Window p = (Window) this;
    Dlg_finance_copy_fees nd = Dlg_finance_copy_fees.create(p, true);
    nd.setTitle("");
    nd.do_pass(academic_year, academic_year_id2, period, period_id, department, department_id, level, level_id, course, course_id, 0, year_level.getText());
    nd.setCallback(new Dlg_finance_copy_fees.Callback() {

      @Override
      public void ok(CloseDialog closeDialog, Dlg_finance_copy_fees.OutputData data) {
        closeDialog.ok();
        Field.Combo acad = (Field.Combo) tf_field14;
        Field.Combo dep = (Field.Combo) tf_field15;
        Field.Combo lev = (Field.Combo) tf_field22;
        Field.Combo year = (Field.Combo) tf_field16;
        Field.Combo per = (Field.Combo) tf_period;
        List<  Academic_year_fees.to_academic_year_fees> fees = tbl_miscellaneous_fees_ALM;
        for (Academic_year_fees.to_academic_year_fees to : fees) {
          for (Academic_year_fees.to_academic_year_fees copy : data.fees) {
            if (to.fee.equalsIgnoreCase(copy.fee)) {

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
                int fee_id = copy.fee_id;
                String fee = copy.fee;
                double amount = copy.amount;
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
                double lab_unit_amount = FitIn.toDouble(tf_field24.getText());
                String year_lvl = year_level.getText();
                Academic_year_fees.to_academic_year_fees fe = new Academic_year_fees.to_academic_year_fees(id, academic_year_id, academic_year, department_id,
                                                                                                           department, level_id, level, course_id, course, period, group_id, group_name, fee_id, fee, amount, is_per_unit, per_unit, created_at, updated_at, created_by, updated_by, status, is_uploaded, lab_unit_amount, year_lvl);
                Academic_year_fees.add_data(fe);

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
                int fee_id = copy.fee_id;
                String fee = copy.fee;
                double amount = copy.amount;
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
                double lab_unit_amount = FitIn.toDouble(tf_field24.getText());
                String year_lvl = year_level.getText();
                Academic_year_fees.to_academic_year_fees fe = new Academic_year_fees.to_academic_year_fees(id, academic_year_id, academic_year, department_id,
                                                                                                           department, level_id, level, course_id, course, period, group_id, group_name, fee_id, fee, amount, is_per_unit, per_unit, created_at, updated_at, created_by, updated_by, status, is_uploaded, lab_unit_amount, year_lvl);
                Academic_year_fees.update_data2(fe);

              }
              break;
            }
          }

        }
        Alert.set(1, "");
        ret_data();
      }
    });
    nd.setLocationRelativeTo(this);
    nd.setVisible(true);
  }

  private void copy_other_fees() {
    if (tf_field16.getText().isEmpty()) {
      Alert.set(0, "Please select a course!");
      return;
    }
    Field.Combo acad2 = (Field.Combo) tf_field14;
    Field.Combo per = (Field.Combo) tf_period;
    Field.Combo dep = (Field.Combo) tf_field15;
    Field.Combo lev = (Field.Combo) tf_field22;
    Field.Combo year = (Field.Combo) tf_field16;
    Field.Combo year_level = (Field.Combo) tf_year_level;

    String academic_year = acad2.getText();
    String academic_year_id2 = acad2.getId();
    String period = per.getText();
    String period_id = per.getId();
    String department = dep.getText();
    String department_id = dep.getId();
    String level = lev.getText();
    String level_id = lev.getId();
    String course = year.getText();
    String course_id = year.getId();

    Window p = (Window) this;
    Dlg_finance_copy_fees nd = Dlg_finance_copy_fees.create(p, true);
    nd.setTitle("");
    nd.do_pass(academic_year, academic_year_id2, period, period_id, department, department_id, level, level_id, course, course_id, 1, year_level.getText());
    nd.setCallback(new Dlg_finance_copy_fees.Callback() {

      @Override
      public void ok(CloseDialog closeDialog, Dlg_finance_copy_fees.OutputData data) {
        closeDialog.ok();
        Field.Combo acad = (Field.Combo) tf_field14;
        Field.Combo dep = (Field.Combo) tf_field15;
        Field.Combo lev = (Field.Combo) tf_field22;
        Field.Combo year = (Field.Combo) tf_field16;
        Field.Combo per = (Field.Combo) tf_period;
        List<  Academic_year_fees.to_academic_year_fees> fees = tbl_other_fees_ALM;
        for (Academic_year_fees.to_academic_year_fees to : fees) {
          for (Academic_year_fees.to_academic_year_fees copy : data.fees) {
            if (to.fee.equalsIgnoreCase(copy.fee)) {

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
                int fee_id = copy.fee_id;
                String fee = copy.fee;
                double amount = copy.amount;
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
                double lab_unit_amount = FitIn.toDouble(tf_field24.getText());
                String year_lvl = year_level.getText();
                Academic_year_fees.to_academic_year_fees fe = new Academic_year_fees.to_academic_year_fees(id, academic_year_id, academic_year, department_id,
                                                                                                           department, level_id, level, course_id, course, period, group_id, group_name, fee_id, fee, amount, is_per_unit, per_unit, created_at, updated_at, created_by, updated_by, status, is_uploaded, lab_unit_amount, year_lvl);
                Academic_year_fees.add_data(fe);

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
                int fee_id = copy.fee_id;
                String fee = copy.fee;
                double amount = copy.amount;
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
                double lab_unit_amount = FitIn.toDouble(tf_field24.getText());
                String year_lvl = year_level.getText();
                Academic_year_fees.to_academic_year_fees fe = new Academic_year_fees.to_academic_year_fees(id, academic_year_id, academic_year, department_id,
                                                                                                           department, level_id, level, course_id, course, period, group_id, group_name, fee_id, fee, amount, is_per_unit, per_unit, created_at, updated_at, created_by, updated_by, status, is_uploaded, lab_unit_amount, year_lvl);
                Academic_year_fees.update_data2(fe);

              }
              break;
            }
          }

        }
        Alert.set(1, "");
        ret_data_other_fees();
      }
    });
    nd.setLocationRelativeTo(this);
    nd.setVisible(true);
  }

  private void init_years_levels() {
    Field.Combo dep = (Field.Combo) tf_field15;

    List<String> year_level = new ArrayList();

    if (dep.getText().equalsIgnoreCase("BASIC EDUCATION")) {
      year_level.add("");
    } else {
      year_level.add("");
      year_level.add("First Year");
      year_level.add("Second Year");
      year_level.add("Third Year");
      year_level.add("Fourth Year");
      year_level.add("Fifth Year");
    }

    Object[][] obj = new Object[year_level.size()][1];
    int i = 0;
    for (String to : year_level) {
      obj[i][0] = " " + to;

      i++;
    }
    JLabel[] labels = {};
    int[] tbl_widths_customers = {tf_year_level.getWidth()};
    int width = 0;
    String[] col_names = {""};
    TableRenderer tr = new TableRenderer();
    TableRenderer.setPopup(tf_year_level, obj, labels, tbl_widths_customers, col_names);
    tr.setCallback(new TableRenderer.Callback() {
      @Override
      public void ok(TableRenderer.OutputData data) {
        String to = year_level.get(data.selected_row);
        tf_year_level.setText("" + to);

        ret_tuition_fee();
        ret_data();
        ret_data_other_fees();

      }
    });
  }

  private void delete_assessment() {

    double amount = 0;
    double paid = 0;
    List<Enrollment_assessments.to_enrollment_assessments> eas = Enrollment_assessments.ret_data(" where enrollment_id='" + enroll.id + "' ");
    for (Enrollment_assessments.to_enrollment_assessments to : eas) {
      amount += to.other_fees_discount;
    }
    List<Enrollment_assessment_payments.to_enrollment_assessment_payments> payments = Enrollment_assessment_payments.ret_data(" where enrollment_id='" + enroll.id + "' ");
    for (Enrollment_assessment_payments.to_enrollment_assessment_payments to : payments) {
      paid += to.amount_paid;
    }
    double total = amount - paid;
    Window p = (Window) this;
    Dlg_authenticate nd = Dlg_authenticate.create(p, true);
    nd.setTitle("");
    nd.do_override_assessment();
    nd.setCallback(new Dlg_authenticate.Callback() {

      @Override
      public void ok(CloseDialog closeDialog, Dlg_authenticate.OutputData data) {
        closeDialog.ok();

        Enrollment_assessments.delete_assessment(enroll, total);
        Alert.set(3, "");
        set_assessment2();
      }
    });
    nd.setLocationRelativeTo(this);
    nd.setVisible(true);
  }

  private void add_adjustments() {
    if (pay_student == null) {
      Alert.set(0, "Select a student!");
      return;
    }
    Window p = (Window) this;
    Dlg_student_balance_adjustment_add nd = Dlg_student_balance_adjustment_add.create(p, true);
    nd.setTitle("");
    nd.do_pass(pay_student);
    nd.setCallback(new Dlg_student_balance_adjustment_add.Callback() {
      @Override
      public void ok(CloseDialog closeDialog, Dlg_student_balance_adjustment_add.OutputData data) {
        closeDialog.ok();
        ret_fees();
        if (jCheckBox12.isSelected()) {
          ret_transactions();
        }
      }
    });
    nd.setLocationRelativeTo(this);
    nd.setVisible(true);
  }

  private void discount_types() {
    Window p = (Window) this;
    Dlg_discount_types nd = Dlg_discount_types.create(p, true);
    nd.setTitle("");
    nd.do_pass();
    nd.setCallback(new Dlg_discount_types.Callback() {
      @Override
      public void ok(CloseDialog closeDialog, Dlg_discount_types.OutputData data) {
        closeDialog.ok();
      }
    });
    nd.setLocationRelativeTo(this);
    nd.setVisible(true);
  }

  private void enrollment_discount() {

    Window p = (Window) this;
    Dlg_finance_assessment_discount nd = Dlg_finance_assessment_discount.create(p, true);
    nd.setTitle("");
    nd.do_pass(enroll, assessment_sub_total, assessment_tuition, assessment_misc, assessment_other_fees);
    nd.setCallback(new Dlg_finance_assessment_discount.Callback() {

      @Override
      public void ok(CloseDialog closeDialog, Dlg_finance_assessment_discount.OutputData data) {
        closeDialog.ok();
        set_assessment2();
      }
    });
    nd.setLocationRelativeTo(this);
    nd.setVisible(true);
  }
}
