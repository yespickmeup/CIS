/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.reports;

import cis.academic.Academic_offerings;
import cis.academic.Academic_year_period_schedules;
import cis.academic.Academic_years;
import cis.cash_drawer.CashDrawer;
import cis.cash_drawer.S1_cash_drawer;
import cis.collections.Collection;
import cis.collections.Collection.to_collections;
import cis.colleges.Colleges;
import cis.departments.Departments;
import cis.disbursements.S1_disbursements;
import cis.finance.Enrollment_assessments;
import cis.other_payments.Other_payments;
import cis.users.Dlg_authenticate;
import cis.users.MyUser;
import cis.users.User_previlege_others;
import cis.users.User_previleges;
import cis.users.Users;
import cis.utils.Alert;
import cis.utils.DateType;
import cis.utils.TableRenderer;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.JasperUtil;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import java.util.Collections;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.TableWidthUtilities;

/**
 *
 * @author USER
 */
public class Dlg_collections extends javax.swing.JDialog {

  /**
   * Creates new form Dlg_collections
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
  private Dlg_collections(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    setUndecorated(true);
    initComponents();
    myInit();
  }

  private Dlg_collections(java.awt.Dialog parent, boolean modal) {
    super(parent, modal);
    setUndecorated(true);
    initComponents();
    myInit();
  }

  public Dlg_collections() {
    super();
    setUndecorated(true);
    initComponents();
    myInit();

  }
  private Dlg_collections myRef;

  private void setThisRef(Dlg_collections myRef) {
    this.myRef = myRef;
  }
  private static java.util.Map<Object, Dlg_collections> dialogContainer = new java.util.HashMap();

  public static void clearUpFirst(java.awt.Window parent) {
    if (dialogContainer.containsKey(parent)) {
      dialogContainer.remove(parent);
    }
  }

  public static Dlg_collections create(java.awt.Window parent, boolean modal) {

    if (modal) {
      return create(parent, ModalityType.APPLICATION_MODAL);
    }

    return create(parent, ModalityType.MODELESS);

  }

  public static Dlg_collections create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

    if (parent instanceof java.awt.Frame) {

      Dlg_collections dialog = dialogContainer.get(parent);

      if (dialog == null) {
        dialog = new Dlg_collections((java.awt.Frame) parent, false);
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
      Dlg_collections dialog = dialogContainer.get(parent);

      if (dialog == null) {
        dialog = new Dlg_collections((java.awt.Dialog) parent, false);
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

    Dlg_collections dialog = Dlg_collections.create(new javax.swing.JFrame(), true);
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
    jPanel5 = new javax.swing.JPanel();
    jPanel3 = new javax.swing.JPanel();
    jPanel6 = new javax.swing.JPanel();
    jPanel7 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tbl_collections = new javax.swing.JTable();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();
    jLabel13 = new javax.swing.JLabel();
    jLabel14 = new javax.swing.JLabel();
    jLabel15 = new javax.swing.JLabel();
    jLabel17 = new javax.swing.JLabel();
    jPanel4 = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    jProgressBar1 = new javax.swing.JProgressBar();
    jButton5 = new Button.Info();
    jLabel4 = new javax.swing.JLabel();
    jCheckBox1 = new javax.swing.JCheckBox();
    tf_cashier = new Field.Combo();
    jLabel1 = new javax.swing.JLabel();
    jCheckBox4 = new javax.swing.JCheckBox();
    jDateChooser1 = new com.toedter.calendar.JDateChooser();
    jLabel2 = new javax.swing.JLabel();
    jDateChooser2 = new com.toedter.calendar.JDateChooser();
    jLabel16 = new javax.swing.JLabel();
    tf_cashier5 = new Field.Combo();
    jCheckBox5 = new javax.swing.JCheckBox();
    jLabel23 = new javax.swing.JLabel();
    jCheckBox10 = new javax.swing.JCheckBox();
    tf_field14 = new Field.Combo();
    jLabel24 = new javax.swing.JLabel();
    jCheckBox11 = new javax.swing.JCheckBox();
    tf_field15 = new Field.Combo();
    jLabel22 = new javax.swing.JLabel();
    tf_field13 = new Field.Combo();
    jLabel26 = new javax.swing.JLabel();
    jCheckBox21 = new javax.swing.JCheckBox();
    tf_field17 = new Field.Combo();
    jLabel27 = new javax.swing.JLabel();
    jCheckBox15 = new javax.swing.JCheckBox();
    tf_field18 = new Field.Combo();
    jLabel25 = new javax.swing.JLabel();
    jCheckBox12 = new javax.swing.JCheckBox();
    tf_field16 = new Field.Combo();
    jLabel18 = new javax.swing.JLabel();
    jCheckBox6 = new javax.swing.JCheckBox();
    jCheckBox7 = new javax.swing.JCheckBox();
    jCheckBox8 = new javax.swing.JCheckBox();
    jLabel19 = new javax.swing.JLabel();
    tf_cashier6 = new Field.Combo();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

    jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));

    jPanel5.setBackground(new java.awt.Color(255, 255, 255));
    jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Print Preview"));

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 1179, Short.MAX_VALUE)
    );
    jPanel5Layout.setVerticalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 470, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    jTabbedPane1.addTab("Collections Summary", jPanel2);

    jPanel3.setBackground(new java.awt.Color(255, 255, 255));

    jPanel6.setBackground(new java.awt.Color(255, 255, 255));
    jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Print Preview"));

    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
      jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 1179, Short.MAX_VALUE)
    );
    jPanel6Layout.setVerticalGroup(
      jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 470, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    jTabbedPane1.addTab("Collections Report", jPanel3);

    jPanel7.setBackground(new java.awt.Color(255, 255, 255));

    tbl_collections.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {},
        {},
        {},
        {}
      },
      new String [] {

      }
    ));
    tbl_collections.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tbl_collectionsMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tbl_collections);

    jLabel5.setText("No. of rows:");

    jLabel6.setText("0");

    jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel7.setText("Cash:");

    jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel8.setText("0.00");
    jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel9.setText("0.00");
    jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel10.setText("Check:");

    jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel11.setText("0.00");
    jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel12.setText("Credit Card:");

    jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel13.setText("GC:");

    jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel14.setText("0.00");
    jLabel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel15.setText("Online:");

    jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel17.setText("0.00");
    jLabel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
    jPanel7.setLayout(jPanel7Layout);
    jPanel7Layout.setHorizontalGroup(
      jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel7Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1)
          .addGroup(jPanel7Layout.createSequentialGroup()
            .addComponent(jLabel5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(15, 15, 15)
            .addComponent(jLabel10)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(15, 15, 15)
            .addComponent(jLabel12)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(15, 15, 15)
            .addComponent(jLabel13)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(15, 15, 15)
            .addComponent(jLabel15)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );
    jPanel7Layout.setVerticalGroup(
      jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel7Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel15)
            .addComponent(jLabel17))
          .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel13)
            .addComponent(jLabel14))
          .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel12)
            .addComponent(jLabel11))
          .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel10)
            .addComponent(jLabel9))
          .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel5)
            .addComponent(jLabel6)
            .addComponent(jLabel7)
            .addComponent(jLabel8)))
        .addContainerGap())
    );

    jTabbedPane1.addTab("Tabular", jPanel7);

    jPanel4.setBackground(new java.awt.Color(255, 255, 255));
    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Filter")));

    jLabel3.setText("Status:");

    jProgressBar1.setString("");
    jProgressBar1.setStringPainted(true);

    jButton5.setText("Generate Report");
    jButton5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton5ActionPerformed(evt);
      }
    });

    jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel4.setText("Cashier:");

    jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox1.setText("All");

    tf_cashier.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    tf_cashier.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tf_cashierMouseClicked(evt);
      }
    });
    tf_cashier.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_cashierActionPerformed(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel1.setText("Date from:");

    jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jDateChooser1.setDate(new Date());
    jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel2.setText("Date to:");

    jDateChooser2.setDate(new Date());
    jDateChooser2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel16.setText("Time from:");

    tf_cashier5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    tf_cashier5.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tf_cashier5MouseClicked(evt);
      }
    });
    tf_cashier5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_cashier5ActionPerformed(evt);
      }
    });

    buttonGroup2.add(jCheckBox5);
    jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox5.setSelected(true);

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

    jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel24.setText("Level/College:");

    jCheckBox11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox11.setSelected(true);
    jCheckBox11.setText("All");
    jCheckBox11.setFocusable(false);
    jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox11ActionPerformed(evt);
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

    jCheckBox21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox21.setSelected(true);
    jCheckBox21.setText("All");
    jCheckBox21.setFocusable(false);
    jCheckBox21.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox21ActionPerformed(evt);
      }
    });

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

    jCheckBox15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox15.setSelected(true);
    jCheckBox15.setText("All");
    jCheckBox15.setFocusable(false);
    jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox15ActionPerformed(evt);
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

    jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel18.setText("Order by:");

    buttonGroup1.add(jCheckBox6);
    jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox6.setText("Collection No");

    buttonGroup1.add(jCheckBox7);
    jCheckBox7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox7.setSelected(true);
    jCheckBox7.setText("OR No.");

    buttonGroup2.add(jCheckBox8);
    jCheckBox8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel19.setText("Shift:");

    tf_cashier6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    tf_cashier6.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tf_cashier6MouseClicked(evt);
      }
    });
    tf_cashier6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_cashier6ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(4, 4, 4)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jCheckBox4, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addComponent(jCheckBox5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGap(1, 1, 1)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(tf_cashier)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tf_cashier5, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                  .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(2, 2, 2)
                  .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
              .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jCheckBox8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_cashier6)
                .addGap(263, 263, 263))))
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(94, 94, 94)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(tf_field14)
                  .addComponent(tf_field15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
              .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addComponent(jCheckBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(tf_field16, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_field18, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_field13, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel26)
                .addGap(5, 5, 5)
                .addComponent(jCheckBox21, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_field17, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        .addContainerGap())
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel3))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                  .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                      .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addComponent(jCheckBox6)
                      .addComponent(jCheckBox7))
                    .addComponent(tf_cashier, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(1, 1, 1)
                  .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                      .addGap(26, 26, 26)
                      .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_cashier5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox8)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_cashier6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                  .addComponent(jCheckBox1)
                  .addGap(1, 1, 1)
                  .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                      .addGap(26, 26, 26)
                      .addComponent(jCheckBox5))
                    .addComponent(jCheckBox4)))))))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jCheckBox10)
          .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jCheckBox11, javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(tf_field15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(tf_field17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBox21)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCheckBox12, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(tf_field16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(tf_field18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBox15)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jTabbedPane1)
          .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(30, 30, 30))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(28, 28, 28)
        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      generate();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tf_cashierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_cashierMouseClicked
      init_cashier(tf_cashier);
    }//GEN-LAST:event_tf_cashierMouseClicked

    private void tf_cashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cashierActionPerformed
      init_cashier(tf_cashier);
    }//GEN-LAST:event_tf_cashierActionPerformed

    private void tf_cashier5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_cashier5MouseClicked
      if (!jCheckBox5.isSelected()) {
        init_cashdrawer(tf_cashier5);
      }
    }//GEN-LAST:event_tf_cashier5MouseClicked

    private void tf_cashier5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cashier5ActionPerformed
      if (!jCheckBox5.isSelected()) {
        init_cashdrawer(tf_cashier5);
      }
    }//GEN-LAST:event_tf_cashier5ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
//        ret_data();
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void tf_field14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field14MouseClicked
      init_departments();
    }//GEN-LAST:event_tf_field14MouseClicked

    private void tf_field14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field14ActionPerformed
      init_departments();
    }//GEN-LAST:event_tf_field14ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
//        ret_data();
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void tf_field15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field15MouseClicked
      init_colleges();
    }//GEN-LAST:event_tf_field15MouseClicked

    private void tf_field15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field15ActionPerformed
      init_colleges();
    }//GEN-LAST:event_tf_field15ActionPerformed

    private void tf_field13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field13MouseClicked
      init_academic_years(tf_field13);
    }//GEN-LAST:event_tf_field13MouseClicked

    private void tf_field13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field13ActionPerformed
      init_academic_years(tf_field13);
    }//GEN-LAST:event_tf_field13ActionPerformed

    private void jCheckBox21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox21ActionPerformed
//        ret_data();
    }//GEN-LAST:event_jCheckBox21ActionPerformed

    private void tf_field17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field17MouseClicked
      init_acad_period_schedules();
    }//GEN-LAST:event_tf_field17MouseClicked

    private void tf_field17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field17ActionPerformed
      init_acad_period_schedules();
    }//GEN-LAST:event_tf_field17ActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox15ActionPerformed
//        ret_data();
    }//GEN-LAST:event_jCheckBox15ActionPerformed

    private void tf_field18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field18MouseClicked
      init_periods();
    }//GEN-LAST:event_tf_field18MouseClicked

    private void tf_field18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field18ActionPerformed
      init_periods();
    }//GEN-LAST:event_tf_field18ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
//        ret_data();
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void tf_field16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field16MouseClicked
      init_courses();
    }//GEN-LAST:event_tf_field16MouseClicked

    private void tf_field16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field16ActionPerformed
      init_courses();
    }//GEN-LAST:event_tf_field16ActionPerformed

  private void tbl_collectionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_collectionsMouseClicked
    select_collection();
  }//GEN-LAST:event_tbl_collectionsMouseClicked

  private void tf_cashier6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_cashier6MouseClicked
    init_shift();
  }//GEN-LAST:event_tf_cashier6MouseClicked

  private void tf_cashier6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cashier6ActionPerformed
    init_shift();
  }//GEN-LAST:event_tf_cashier6ActionPerformed

  /**
   * @param args the command line arguments
   */

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.ButtonGroup buttonGroup2;
  private javax.swing.JButton jButton5;
  private javax.swing.JCheckBox jCheckBox1;
  private javax.swing.JCheckBox jCheckBox10;
  private javax.swing.JCheckBox jCheckBox11;
  private javax.swing.JCheckBox jCheckBox12;
  private javax.swing.JCheckBox jCheckBox15;
  private javax.swing.JCheckBox jCheckBox21;
  private javax.swing.JCheckBox jCheckBox4;
  private javax.swing.JCheckBox jCheckBox5;
  private javax.swing.JCheckBox jCheckBox6;
  private javax.swing.JCheckBox jCheckBox7;
  private javax.swing.JCheckBox jCheckBox8;
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
  private javax.swing.JLabel jLabel22;
  private javax.swing.JLabel jLabel23;
  private javax.swing.JLabel jLabel24;
  private javax.swing.JLabel jLabel25;
  private javax.swing.JLabel jLabel26;
  private javax.swing.JLabel jLabel27;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JPanel jPanel5;
  private javax.swing.JPanel jPanel6;
  private javax.swing.JPanel jPanel7;
  private javax.swing.JProgressBar jProgressBar1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTabbedPane jTabbedPane1;
  private javax.swing.JTable tbl_collections;
  private javax.swing.JTextField tf_cashier;
  private javax.swing.JTextField tf_cashier5;
  private javax.swing.JTextField tf_cashier6;
  private javax.swing.JTextField tf_field13;
  private javax.swing.JTextField tf_field14;
  private javax.swing.JTextField tf_field15;
  private javax.swing.JTextField tf_field16;
  private javax.swing.JTextField tf_field17;
  private javax.swing.JTextField tf_field18;
  // End of variables declaration//GEN-END:variables

  private void myInit() {
    init_key();

//    System.setProperty("pool_db", "db_cis_cosca");
//    System.setProperty("pool_password", "password");
//        System.setProperty("pool_host", "10.0.0.251");
    init_tbl_collections(tbl_collections);
    setAcad();
    ret_users();

    shifts.clear();
    shifts.add("08:00am - 12:00pm");
    shifts.add("01:00pm - 05:00pm");
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

  //<editor-fold defaultstate="collapsed" desc=" collections "> 
  public static ArrayListModel tbl_collections_ALM;
  public static TblcollectionsModel tbl_collections_M;

  public static void init_tbl_collections(JTable tbl_collections) {
    tbl_collections_ALM = new ArrayListModel();
    tbl_collections_M = new TblcollectionsModel(tbl_collections_ALM);
    tbl_collections.setModel(tbl_collections_M);
    tbl_collections.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    tbl_collections.setRowHeight(25);
    int[] tbl_widths_collections = {120, 100, 150, 100, 80, 80, 80, 80, 60, 60, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    for (int i = 0, n = tbl_widths_collections.length; i < n; i++) {
      if (i == 3 || i == 4) {
        continue;
      }
      TableWidthUtilities.setColumnWidth(tbl_collections, i, tbl_widths_collections[i]);
    }
    Dimension d = tbl_collections.getTableHeader().getPreferredSize();
    d.height = 25;
    tbl_collections.getTableHeader().setPreferredSize(d);
    tbl_collections.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
    tbl_collections.setRowHeight(25);
    tbl_collections.setFont(new java.awt.Font("Arial", 0, 12));
  }

  public static void loadData_collections(List<to_collections> acc) {
    tbl_collections_ALM.clear();
    tbl_collections_ALM.addAll(acc);
  }

  public static class TblcollectionsModel extends AbstractTableAdapter {

    public static String[] COLUMNS = {
      "Collection No", "OR No", "Date/Time", "Particular", "Payor", "Cash", "Check", "Online", "Status", "", "", "check_amount", "check_bank", "check_no", "check_holder", "check_date", "credit_card_type", "credit_card_rate", "credit_card_amount", "credit_card_no", "gift_certificate_from", "gift_certificate_description", "gift_certificate_no", "gift_certificate_amount", "online_bank", "online_reference_no", "online_amount", "online_holder", "online_date", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded", "ref_id", "school_year", "period", "year_level", "department_id", "department", "college_id", "college", "course_id", "course", "student_id", "student_no", "student_name"
    };

    public TblcollectionsModel(ListModel listmodel) {
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
      to_collections tt = (to_collections) getRow(row);
      switch (col) {
        case 0:
          return " " + tt.collection_no;
        case 1:
          return " " + tt.or_no;
        case 2:
          return " " + DateType.convert_slash_datetime3(tt.created_at);
        case 3:
          return " " + tt.payment_type;
        case 4:
          return " " + tt.student_name;
        case 5:
          return " " + FitIn.fmt_wc_0(tt.cash);
        case 6:
          return " " + FitIn.fmt_wc_0(tt.check_amount);
        case 7:
          return " " + FitIn.fmt_wc_0(tt.online_amount);
        case 8:
          if (tt.status == 0) {
            return " Counted";
          } else {
            return "    Void";
          }
        case 9:
          if (tt.status == 0) {
            return "   Void";
          } else {
            return "";
          }
        case 10:
          return tt.check_bank;
        case 11:
          return tt.check_bank;
        case 12:
          return tt.check_bank;
        case 13:
          return tt.check_no;
        case 14:
          return tt.check_holder;
        case 15:
          return tt.check_date;
        case 16:
          return tt.credit_card_type;
        case 17:
          return tt.credit_card_rate;
        case 18:
          return tt.credit_card_amount;
        case 19:
          return tt.credit_card_no;
        case 20:
          return tt.gift_certificate_from;
        case 21:
          return tt.gift_certificate_description;
        case 22:
          return tt.gift_certificate_no;
        case 23:
          return tt.gift_certificate_amount;
        case 24:
          return tt.online_bank;
        case 25:
          return tt.online_reference_no;
        case 26:
          return tt.online_amount;
        case 27:
          return tt.online_holder;
        case 28:
          return tt.online_date;
        case 29:
          return tt.created_at;
        case 30:
          return tt.updated_at;
        case 31:
          return tt.created_by;
        case 32:
          return tt.updated_by;
        case 33:
          return tt.status;
        case 34:
          return tt.is_uploaded;
        case 35:
          return tt.ref_id;
        case 36:
          return tt.school_year;
        case 37:
          return tt.period;
        case 38:
          return tt.year_level;
        case 39:
          return tt.department_id;
        case 40:
          return tt.department;
        case 41:
          return tt.college_id;
        case 42:
          return tt.college;
        case 43:
          return tt.course_id;
        case 44:
          return tt.course;
        case 45:
          return tt.student_id;
        case 46:
          return tt.student_no;
        default:
          return tt.student_name;
      }
    }
  }
//</editor-fold> 

  List<Academic_years.to_academic_years> acad_years = new ArrayList();
  List<Academic_years.to_academic_years> acad_years2 = new ArrayList();
  int no_of_years = 4;
  List<String> list_year = new ArrayList();

  private void setAcad() {
    acad_years = Academic_years.ret_data(" where status=1 limit 1");
    acad_years2 = Academic_years.ret_data(" order by id asc ");
    if (!acad_years.isEmpty()) {
      Academic_years.to_academic_years to1 = acad_years.get(0);
      Field.Combo year3 = (Field.Combo) tf_field13;
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

    list_year.add("");
    list_year.add("First Year");
    list_year.add("Second Year");
    list_year.add("Third Year");
    list_year.add("Fourth Year");
    list_year.add("Fifth Year");

  }

  private void ret_users() {
    user_list = Users.ret_data(" order by user_screen_name asc ");
    List<Users.to_users> finance = new ArrayList();
    List<User_previleges.to_user_privileges> privileges = User_previleges.ret_data(" where privilege_id=4 group by user_id ");
    for (User_previleges.to_user_privileges pr : privileges) {
      for (Users.to_users user : user_list) {
        if (FitIn.toInt(pr.user_id) == user.id) {
          finance.add(user);

        }
      }
    }
    user_list = finance;
    Collections.sort(user_list, new Comparator<Users.to_users>() {
               @Override
               public int compare(Users.to_users o1, Users.to_users o2) {
                 return o1.getUser_screen_name().compareTo(o2.getUser_screen_name());
               }
             });
  }
  Academic_years.to_academic_years acad = null;
  Academic_year_period_schedules.to_academic_year_period_schedules acad_schedule = null;
  List<Academic_year_period_schedules.to_academic_year_period_schedules> acad_schedules = new ArrayList();

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

      }

    });
  }

  private void init_courses() {
    Field.Combo year3 = (Field.Combo) tf_field13;

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

      }

    });
  }

  private void init_acad_period_schedules() {
    Field.Combo dep = (Field.Combo) tf_field14;

    Field.Combo acad1 = (Field.Combo) tf_field13;
    acad_schedules.clear();
    acad_schedules = Academic_year_period_schedules.ret_data(" where academic_year_id='" + acad1.getId() + "'  and department_id='" + dep.getId() + "'");

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

      }
    });
  }

  List<Users.to_users> user_list = new ArrayList();

  private void init_cashier(final JTextField tf) {

    Object[][] obj = new Object[user_list.size()][1];
    int i = 0;
    for (Users.to_users to : user_list) {

      obj[i][0] = " " + to.user_screen_name;

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
        Field.Combo f = (Field.Combo) tf_cashier;
        Users.to_users to = (Users.to_users) user_list.get(data.selected_row);

        f.setId("" + to.id);
        f.setText(to.user_screen_name);
      }
    });
  }

  private void init_cashdrawer(final JTextField tf) {
    String where = " where id<>0 ";
    if (!jCheckBox1.isSelected()) {
      Field.Combo f = (Field.Combo) tf_cashier;
      where = where + " and user_id='" + f.getId() + "' ";
    }
    if (!jCheckBox4.isSelected()) {
      String date_from = DateType.sf.format(jDateChooser1.getDate());
      String date_to = DateType.sf.format(jDateChooser2.getDate());
      where = where + " and Date(time_in) between '" + date_from + "' and '" + date_to + " '";
    }

    final List<S1_cash_drawer.to_cash_drawer> drawers = S1_cash_drawer.ret_where(where);

    Object[][] obj = new Object[drawers.size()][4];
    int i = 0;
    for (S1_cash_drawer.to_cash_drawer to : drawers) {

      obj[i][0] = " " + to.user_screen_name;
      obj[i][1] = " " + DateType.convert_slash_datetime3(to.time_in);
      String time_out = "";
      obj[i][2] = " ";
      if (to.time_out != null) {
        obj[i][2] = " " + DateType.convert_slash_datetime3(to.time_out);
      }

      obj[i][3] = " " + FitIn.fmt_wc_0(to.amount);
      i++;
    }
    JLabel[] labels = {};
    int[] tbl_widths_customers = {80, 100, 120, 80,};
    int width = 0;
    String[] col_names = {"", "", "", ""};
    TableRenderer tr = new TableRenderer();
    TableRenderer.setPopup2(tf, obj, labels, tbl_widths_customers, col_names, 450);
    tr.setCallback(new TableRenderer.Callback() {
      @Override
      public void ok(TableRenderer.OutputData data) {
        Field.Combo f = (Field.Combo) tf_cashier5;
        S1_cash_drawer.to_cash_drawer to = (S1_cash_drawer.to_cash_drawer) drawers.get(data.selected_row);
        String cashin = DateType.convert_slash_datetime3(to.time_in);
        String cashout = "";
        if (to.time_out != null) {
          cashout = DateType.convert_slash_datetime3(to.time_out);
        } else {
          Alert.set(0, "Choose another record!");
          return;
        }
        f.setText(cashin + " - " + cashout);
//
//                f.setId("" + to.id);
//                f.setText(to.screen_name);
      }
    });
  }

  private void generate() {
    int selected = jTabbedPane1.getSelectedIndex();
    if (selected == 0) {
      generate_report1();
    } else {
      generate_report2();
    }
  }

  private void generate_report1() {

    jProgressBar1.setString("Loading...Please wait...");
    jProgressBar1.setIndeterminate(true);
    Thread t = new Thread(new Runnable() {
      @Override
      public void run() {

        String business_name = System.getProperty("school_name", "Colegio de Santa Catalina de Alejandria (COSCA)");
        String address = System.getProperty("address", "Bishop Epifanio B. Surban St. Dumaguete City Negros Oriental, Bishop Epifanio Surban St, Dumaguete, Negros Oriental");
        String contact_no = System.getProperty("contact_no", "(035) 225 4831");
        String school_year = tf_field13.getText();
        String semester = "All";
        if (!jCheckBox21.isSelected()) {
          semester = tf_field17.getText();
        }
        String department = "All";
        if (!jCheckBox10.isSelected()) {
          department = tf_field14.getText();
        }
        String college = "All";
        if (!jCheckBox11.isSelected()) {
          college = tf_field15.getText();
        }
        String year_level = "All";
        if (!jCheckBox15.isSelected()) {
          year_level = tf_field18.getText();
        }
        String user = "All";
        if (!jCheckBox1.isSelected()) {
          user = tf_cashier.getText();
        }
        String date = "All";
        if (!jCheckBox4.isSelected()) {
          date = DateType.slash.format(jDateChooser1.getDate()) + " - " + DateType.slash.format(jDateChooser2.getDate());
        }
        String printed_by = MyUser.getUser_screen_name().toUpperCase();

        String user_id = MyUser.getUser_id();
        String where = " where id<>0 ";

        String where2 = " where id<>0 ";
        String where3 = " where id<>0 ";
        if (!jCheckBox1.isSelected()) {
          where = where + " and created_by = '" + user_id + "' ";
          where2 = where2 + " and user_id = '" + user_id + "' ";
          where3 = where3 + " and user_id = '" + user_id + "' ";
        }

        if (!jCheckBox5.isSelected() && !tf_cashier5.getText().isEmpty()) {
          try {
            String[] dates = tf_cashier5.getText().split("- ");
//                            System.out.println("dates[0]: " + dates[0]);
//                            System.out.println("dates[1]: " + dates[1]);
            Date d1 = DateType.slash_w_time.parse(dates[0]);
            Date d2 = DateType.slash_w_time.parse(dates[1]);

//                            date_from_sales = DateType.datetime.format(d1.getDate());
            String date_from_sales = DateType.convert_slash_datetime_sf2(dates[0]);
            String date_to_sales = DateType.convert_slash_datetime_sf2(dates[1]);

            where = where + " and created_at between '" + date_from_sales + "' and '" + date_to_sales + "'";
            where2 = where2 + " and time_in between '" + date_from_sales + "' and '" + date_to_sales + "'";
            where3 = where3 + " and date_added between '" + date_from_sales + "' and '" + date_to_sales + "'";
            date = tf_cashier5.getText();
          } catch (ParseException ex) {
            Logger.getLogger(Dlg_collections.class.getName()).log(Level.SEVERE, null, ex);
          }
        }

        if (jCheckBox8.isSelected() && !tf_cashier6.getText().isEmpty()) {
          String date1 = DateType.sf.format(jDateChooser1.getDate());
          String date_from_sales = "";
          String date_to_sales = "";
          if (tf_cashier6.getText().equals(("08:00am - 12:00pm"))) {
            date_from_sales = date1 + " 07:30:00";
            date_to_sales = date1 + " 12:30:00";
            date = date1 + " 08:00 AM - " + " - " + date1 + " 12:00 PM";
          }
          if (tf_cashier6.getText().equals(("01:00pm - 05:00pm"))) {
            date_from_sales = date1 + " 13:00:00";
            date_to_sales = date1 + " 17:30:00";
            date = date1 + " 01:00 PM - " + " - " + date1 + " 05:00 PM";
          }

          where = where + " and created_at between '" + date_from_sales + "' and '" + date_to_sales + "'";
          where2 = where2 + " and time_in between '" + date_from_sales + "' and '" + date_to_sales + "'";
          where3 = where3 + " and date_added between '" + date_from_sales + "' and '" + date_to_sales + "'";

        }

        if (jCheckBox4.isSelected()) {
          String date_from = DateType.sf.format(jDateChooser1.getDate());
          String date_to = DateType.sf.format(jDateChooser2.getDate());

          where = where + " and Date(created_at) between '" + date_from + "' and '" + date_to + "'";
          where2 = where2 + " and Date(time_in) between '" + date_from + "' and '" + date_to + "'";
          where3 = where3 + " and Date(date_added) between '" + date_from + "' and '" + date_to + "'";
        }
//        if (!jCheckBox4.isSelected() && !jCheckBox5.isSelected()) {
//          String date_from = DateType.sf.format(jDateChooser1.getDate());
//          String date_to = DateType.sf.format(jDateChooser2.getDate());
//
//          where = where + " and Date(created_at) between '" + date_from + "' and '" + date_to + "'";
//          where2 = where2 + " and Date(time_in) between '" + date_from + "' and '" + date_to + "'";
//          where3 = where3 + " and Date(date_added) between '" + date_from + "' and '" + date_to + "'";
//        }

        String order_by = " order by collection_no asc ";
        if (jCheckBox7.isSelected()) {
          order_by = " order by or_no, created_by asc ";
        }
//        System.out.println(where);
        List<Collection.to_collections> datas = Collection.ret_data(where + order_by);
        double cash = 0;
        double credit_card = 0;
        double check = 0;
        double online = 0;
        double gc = 0;
        for (Collection.to_collections to : datas) {
          if (to.status == 0) {
            cash += to.cash;
            credit_card += to.credit_card_amount;
            check += to.check_amount;
            online += to.online_amount;
            gc += to.gift_certificate_amount;
          }
        }
        jLabel8.setText(FitIn.fmt_wc_0(cash) + " ");
        jLabel11.setText(FitIn.fmt_wc_0(credit_card) + " ");
        jLabel9.setText(FitIn.fmt_wc_0(check) + " ");
        jLabel17.setText(FitIn.fmt_wc_0(online) + " ");
        jLabel14.setText(FitIn.fmt_wc_0(gc) + " ");

        List<Other_payments.to_other_payments> others = Other_payments.ret_data(where);
        List<S1_disbursements.to_disbursements> disbursements = S1_disbursements.ret_data(where3);

        double cashin_beg = 0;
        double cash_sales = 0;
        double receipts_total = 0;
        double receipts_line_discount = 0;
        double receipts_sale_discount = 0;
        double receipts_sub_total = 0;
        double receipt_net_total = 0;

        double check_amount = 0;
        double credit_card_amount = 0;
        double gc_amount = 0;
        double online_amount = 0;

        double sf_cash = 0;
        double sf_cebuana = 0;
        double sf_palawan = 0;
        double sf_ml = 0;
        double sf_gcash = 0;
        double sf_check = 0;
        double sf_credit_card = 0;

        double canteen_cash = 0;
        double canteen_cebuana = 0;
        double canteen_palawan = 0;
        double canteen_ml = 0;
        double canteen_gcash = 0;
        double canteen_check = 0;
        double canteen_credit_card = 0;

        double books_cash = 0;
        double books_cebuana = 0;
        double books_palawan = 0;
        double books_ml = 0;
        double books_gcash = 0;
        double books_check = 0;
        double books_credit_card = 0;

        double oi_cash = 0;
        double oi_cebuana = 0;
        double oi_palawan = 0;
        double oi_ml = 0;
        double oi_gcash = 0;
        double oi_check = 0;
        double oi_credit_card = 0;

        for (Collection.to_collections to : datas) {
          if (to.status == 0) {
            check_amount += to.check_amount;
            credit_card_amount += to.credit_card_amount;
            gc_amount += to.gift_certificate_amount;
            online_amount += to.online_amount;
            receipts_total += to.amount_paid;
            receipts_sale_discount += to.discount_amount;

//            sf_cash += to.cash;
//            System.out.println("sf_cash: "+sf_cash);
            if (to.payment_type.equalsIgnoreCase("Tuition")) {
              sf_cash += to.cash;
              if (to.online_amount > 0 && to.online_bank.equalsIgnoreCase(("GCash"))) {
                sf_gcash += to.online_amount;
              }
              if (to.online_amount > 0 && to.online_bank.equalsIgnoreCase(("Cebuana"))) {
                sf_cebuana += to.online_amount;
              }
              if (to.online_amount > 0 && to.online_bank.equalsIgnoreCase(("Palawan"))) {
                sf_palawan += to.online_amount;
              }
              if (to.online_amount > 0 && to.online_bank.equalsIgnoreCase(("MLhuillier"))) {
                sf_ml += to.online_amount;
              }
            } else if (to.payment_type.equalsIgnoreCase("Canteen")) {
              canteen_cash += to.cash;
              if (to.online_amount > 0 && to.online_bank.equalsIgnoreCase(("GCash"))) {
                canteen_gcash += to.online_amount;
              }
              if (to.online_amount > 0 && to.online_bank.equalsIgnoreCase(("Cebuana"))) {
                canteen_cebuana += to.online_amount;
              }
              if (to.online_amount > 0 && to.online_bank.equalsIgnoreCase(("Palawan"))) {
                canteen_palawan += to.online_amount;
              }
              if (to.online_amount > 0 && to.online_bank.equalsIgnoreCase(("MLhuillier"))) {
                canteen_ml += to.online_amount;
              }
            } else if (to.payment_type.equalsIgnoreCase("Books")) {
              books_cash += to.cash;
              if (to.online_amount > 0 && to.online_bank.equalsIgnoreCase(("GCash"))) {
                books_gcash += to.online_amount;
              }
              if (to.online_amount > 0 && to.online_bank.equalsIgnoreCase(("Cebuana"))) {
                books_cebuana += to.online_amount;
              }
              if (to.online_amount > 0 && to.online_bank.equalsIgnoreCase(("Palawan"))) {
                books_palawan += to.online_amount;
              }
              if (to.online_amount > 0 && to.online_bank.equalsIgnoreCase(("MLhuillier"))) {
                books_ml += to.online_amount;
              }
            } else {
              oi_cash += to.cash;
              if (to.online_amount > 0 && to.online_bank.equalsIgnoreCase(("GCash"))) {
                oi_gcash += to.online_amount;
              }
              if (to.online_amount > 0 && to.online_bank.equalsIgnoreCase(("Cebuana"))) {
                oi_cebuana += to.online_amount;
              }
              if (to.online_amount > 0 && to.online_bank.equalsIgnoreCase(("Palawan"))) {
                oi_palawan += to.online_amount;
              }
              if (to.online_amount > 0 && to.online_bank.equalsIgnoreCase(("MLhuillier"))) {
                oi_ml += to.online_amount;
              }
            }
          }

        }

        cash_sales = sf_cash + canteen_cash + books_cash + oi_cash;
        double cebuana_total = sf_cebuana;
        double palawan_total = sf_palawan;
        double ml_total = sf_ml;
        double gcash_total = sf_gcash;
        double check_total = check_amount;
        double credit_card_total = 0;
        double disbursement = 0;
        for (S1_disbursements.to_disbursements dis : disbursements) {
          disbursement += dis.amount;
        }
        List<CashDrawer.to_cash_drawer> drawer = CashDrawer.ret_where(where2);
        System.out.println(where2);
        double bills_thousand = 0;
        double bills_five_hundred = 0;
        double bills_two_hundred = 0;
        double bills_one_hundred = 0;
        double bills_fifty = 0;
        double bills_twenty = 0;
        double coins_ten = 0;
        double coins_five = 0;
        double coins_one = 0;
        double coins_point_fifty = 0;
        double coins_point_twenty_five = 0;
        double coins_point_ten = 0;
        double coins_point_zero_five = 0;
        double count_bills_thousand = 0;
        double count_bills_five_hundred = 0;
        double count_bills_two_hundred = 0;
        double count_bills_one_hundred = 0;
        double count_bills_fifty = 0;
        double count_bills_twenty = 0;
        double count_coins_ten = 0;
        double count_coins_five = 0;
        double count_coins_one = 0;
        double count_coins_point_fifty = 0;
        double count_coins_point_twenty_five = 0;
        double count_coins_point_ten = 0;
        double count_coins_point_zero_five = 0;
        double cc_total = 0;
        double cc_last_remittance = 0;
        double cc_cashin_end = 0;

        for (CashDrawer.to_cash_drawer dr : drawer) {
          cashin_beg += dr.amount;
          count_bills_thousand += dr.thousand;
          count_bills_five_hundred += dr.five_hundred;
          count_bills_two_hundred += dr.two_hundred;
          count_bills_one_hundred += dr.one_hundred;
          count_bills_fifty += dr.fifty;
          count_bills_twenty += dr.twenty;
          count_coins_ten += dr.ten;
          count_coins_five += dr.five;
          count_coins_one += dr.one;
          count_coins_point_fifty += dr.point_five;
          count_coins_point_twenty_five += dr.point_two_five;
          count_coins_point_ten += dr.point_ten;
          count_coins_point_zero_five += dr.point_zero_five;

        }

        receipt_net_total = cash_sales - disbursement;

        bills_thousand = 1000 * count_bills_thousand;
        bills_five_hundred = 500 * count_bills_five_hundred;
        bills_two_hundred = 200 * count_bills_two_hundred;
        bills_one_hundred = 100 * count_bills_one_hundred;
        bills_fifty = 50 * count_bills_fifty;
        bills_twenty = 20 * count_bills_twenty;
        coins_ten = 10 * count_coins_ten;
        coins_five = 5 * count_coins_five;
        coins_one = 1 * count_coins_one;
        coins_point_fifty = .5 * count_coins_point_fifty;
        coins_point_twenty_five = .25 * count_coins_point_twenty_five;
        coins_point_ten = .10 * count_coins_point_ten;
        coins_point_zero_five = .05 * count_coins_point_zero_five;

        double ccs = bills_thousand + bills_five_hundred + bills_two_hundred + bills_one_hundred + bills_fifty
                + bills_twenty + coins_ten + coins_five + coins_one + coins_point_fifty + coins_point_twenty_five
                + coins_point_ten + coins_point_zero_five;

        cc_total = ccs;
        String status = "[Equal]";
        double status_amount = cc_total - receipt_net_total;
        if (status_amount < 0) {
          status = "[Short]";
        }
        if (status_amount > 0) {
          status = "[Over]";
        }

        List<Srpt_collections.field> fields = new ArrayList();

        String course = "All";
        String jrxml = "rpt_collections.jrxml";

        Srpt_collections rpt = new Srpt_collections(business_name, address, contact_no, school_year, semester, department, college, year_level, user, date, printed_by, cashin_beg, cash_sales, receipts_total, receipts_line_discount, receipts_sale_discount, receipts_sub_total, receipt_net_total, check_amount, credit_card_amount, gc_amount, online_amount, bills_thousand, bills_five_hundred, bills_two_hundred, bills_one_hundred, bills_fifty, bills_twenty, coins_ten, coins_five, coins_one, coins_point_fifty, coins_point_twenty_five, coins_point_ten, coins_point_zero_five, count_bills_thousand, count_bills_five_hundred, count_bills_two_hundred, count_bills_one_hundred, count_bills_fifty, count_bills_twenty, count_coins_ten, count_coins_five, count_coins_one, count_coins_point_fifty, count_coins_point_twenty_five, count_coins_point_ten, count_coins_point_zero_five, cc_total, cc_last_remittance, cc_cashin_end, disbursement, fields, status, status_amount, course, sf_cash, sf_cebuana, sf_palawan, sf_ml, sf_gcash, sf_check, sf_credit_card, canteen_cash, canteen_cebuana, canteen_palawan, canteen_ml, canteen_gcash, canteen_check, canteen_credit_card, books_cash, books_cebuana, books_palawan, books_ml, books_gcash, books_check, books_credit_card, oi_cash, oi_cebuana, oi_palawan, oi_ml, oi_gcash, oi_check, oi_credit_card, cebuana_total, palawan_total, ml_total, gcash_total, check_total, credit_card_total);

        rpt.fields.addAll(fields);
        loadData_collections(datas);
        jLabel6.setText("" + datas.size());
        report_class_list(rpt, jrxml);
        jProgressBar1.setString("Finished...");
        jProgressBar1.setIndeterminate(false);

      }
    });
    t.start();

  }

  private void generate_report2() {

    jProgressBar1.setString("Loading...Please wait...");
    jProgressBar1.setIndeterminate(true);
    Thread t = new Thread(new Runnable() {
      @Override
      public void run() {

        String business_name = System.getProperty("school_name", "Colegio de Santa Catalina de Alejandria (COSCA)");
        String address = System.getProperty("address", "Bishop Epifanio B. Surban St. Dumaguete City Negros Oriental, Bishop Epifanio Surban St, Dumaguete, Negros Oriental");
        String contact_no = System.getProperty("contact_no", "(035) 225 4831");
        String school_year = tf_field13.getText();
        String semester = "All";
        if (!jCheckBox21.isSelected()) {
          semester = tf_field17.getText();
        }
        String department = "All";
        if (!jCheckBox10.isSelected()) {
          department = tf_field14.getText();
        }
        String college = "All";
        if (!jCheckBox11.isSelected()) {
          college = tf_field15.getText();
        }
        String year_level = "All";
        if (!jCheckBox15.isSelected()) {
          year_level = tf_field18.getText();
        }
        String user = "All";
        if (!jCheckBox1.isSelected()) {
          user = tf_cashier.getText();
        }
        String date = "All";
        if (!jCheckBox4.isSelected()) {
          date = DateType.slash.format(jDateChooser1.getDate()) + " - " + DateType.slash.format(jDateChooser2.getDate());
        }
        String printed_by = MyUser.getUser_screen_name().toUpperCase();

        String user_id = MyUser.getUser_id();
        String where = " where id<>0 ";

        String where2 = " where id<>0 ";
        String where3 = " where id<>0 ";
        if (!jCheckBox1.isSelected()) {
          where = where + " and created_by = '" + user_id + "' ";
          where2 = where2 + " and user_id = '" + user_id + "' ";
          where3 = where3 + " and user_id = '" + user_id + "' ";
        }

        if (!jCheckBox5.isSelected() && !tf_cashier5.getText().isEmpty()) {
          try {
            String[] dates = tf_cashier5.getText().split("- ");
//                            System.out.println("dates[0]: " + dates[0]);
//                            System.out.println("dates[1]: " + dates[1]);
            Date d1 = DateType.slash_w_time.parse(dates[0]);
            Date d2 = DateType.slash_w_time.parse(dates[1]);

//                            date_from_sales = DateType.datetime.format(d1.getDate());
            String date_from_sales = DateType.convert_slash_datetime_sf2(dates[0]);
            String date_to_sales = DateType.convert_slash_datetime_sf2(dates[1]);

            where = where + " and created_at between '" + date_from_sales + "' and '" + date_to_sales + "'";
            where2 = where2 + " and time_in between '" + date_from_sales + "' and '" + date_to_sales + "'";
            where3 = where3 + " and date_added between '" + date_from_sales + "' and '" + date_to_sales + "'";
            date = tf_cashier5.getText();
          } catch (ParseException ex) {
            Logger.getLogger(Dlg_collections.class.getName()).log(Level.SEVERE, null, ex);
          }
        }
        if (jCheckBox8.isSelected() && !tf_cashier6.getText().isEmpty()) {
          String date1 = DateType.sf.format(jDateChooser1.getDate());
          String date_from_sales = "";
          String date_to_sales = "";
          if (tf_cashier6.getText().equals(("08:00am - 12:00pm"))) {
            date_from_sales = date1 + " 07:30:00";
            date_to_sales = date1 + " 12:30:00";
            date = date1 + " 08:00 AM - " + " - " + date1 + " 12:00 PM";
          }
          if (tf_cashier6.getText().equals(("01:00pm - 05:00pm"))) {
            date_from_sales = date1 + " 13:00:00";
            date_to_sales = date1 + " 17:30:00";
            date = date1 + " 01:00 PM - " + " - " + date1 + " 05:00 PM";
          }

          where = where + " and created_at between '" + date_from_sales + "' and '" + date_to_sales + "'";
          where2 = where2 + " and time_in between '" + date_from_sales + "' and '" + date_to_sales + "'";
          where3 = where3 + " and date_added between '" + date_from_sales + "' and '" + date_to_sales + "'";

        }
        if (jCheckBox4.isSelected()) {
          String date_from = DateType.sf.format(jDateChooser1.getDate());
          String date_to = DateType.sf.format(jDateChooser2.getDate());

          where = where + " and Date(created_at) between '" + date_from + "' and '" + date_to + "'";
          where2 = where2 + " and Date(time_in) between '" + date_from + "' and '" + date_to + "'";
          where3 = where3 + " and Date(date_added) between '" + date_from + "' and '" + date_to + "'";
        }
        String order_by = " order by collection_no asc ";
        if (jCheckBox7.isSelected()) {
          order_by = " order by or_no, created_by asc ";
        }
        List<Collection.to_collections> datas2 = Collection.ret_data(where + order_by);
        double cash = 0;
        double credit_card = 0;
        double check = 0;
        double online = 0;
        double gc = 0;
        for (Collection.to_collections to : datas2) {
          if (to.status == 0) {
            cash += to.cash;
            credit_card += to.credit_card_amount;
            check += to.check_amount;
            online += to.online_amount;
            gc += to.gift_certificate_amount;
          }
        }
        jLabel8.setText(FitIn.fmt_wc_0(cash) + " ");
        jLabel11.setText(FitIn.fmt_wc_0(credit_card) + " ");
        jLabel9.setText(FitIn.fmt_wc_0(check) + " ");
        jLabel17.setText(FitIn.fmt_wc_0(online) + " ");
        jLabel14.setText(FitIn.fmt_wc_0(gc) + " ");

        String jrxml = "rpt_collection_report.jrxml";

        List<Srpt_collection_report.field> datas = Srpt_collection_report.ret_data(where + order_by);

        Srpt_collection_report rpt = new Srpt_collection_report(business_name, address, contact_no, school_year, semester, department, college, year_level, user, date, printed_by);
        rpt.fields.addAll(datas);

        report_collection(rpt, jrxml);
        loadData_collections(datas2);
        jLabel6.setText("" + datas2.size());
        jProgressBar1.setString("Finished...");
        jProgressBar1.setIndeterminate(false);

      }
    });
    t.start();

  }

  private void report_class_list(final Srpt_collections to, String jrxml_name) {
    jPanel5.removeAll();
    jPanel5.setLayout(new BorderLayout());
    try {
      JRViewer viewer = get_viewer_collections(to, jrxml_name);
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

  public static JRViewer get_viewer_collections(Srpt_collections to, String rpt_name) {
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
      InputStream is = Srpt_collections.class.
              getResourceAsStream(jrxml);
      JasperReport jasper = JasperCompileManager.compileReport(is);
      return jasper;
    } catch (JRException e) {
      throw new RuntimeException(e);
    }
  }

  private void report_collection(final Srpt_collection_report to, String jrxml_name) {
    jPanel6.removeAll();
    jPanel6.setLayout(new BorderLayout());
    try {
      JRViewer viewer = get_viewer_collections_report(to, jrxml_name);
      JPanel pnl = new JPanel();
      pnl.add(viewer);
      pnl.setVisible(true);
      pnl.setVisible(true);
      jPanel6.add(viewer);

      jPanel6.updateUI();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public static JRViewer get_viewer_collections_report(Srpt_collection_report to, String rpt_name) {
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
      InputStream is = Srpt_collection_report.class.
              getResourceAsStream(jrxml);
      JasperReport jasper = JasperCompileManager.compileReport(is);
      return jasper;
    } catch (JRException e) {
      throw new RuntimeException(e);
    }
  }

  private void edit_date(to_collections collection) {

    Window p = (Window) this;
    Dlg_collection_edit_date nd = Dlg_collection_edit_date.create(p, true);
    nd.setTitle("");
    nd.do_pass(collection.created_at);
    nd.setCallback(new Dlg_collection_edit_date.Callback() {

      @Override
      public void ok(CloseDialog closeDialog, Dlg_collection_edit_date.OutputData data) {
        closeDialog.ok();
        Collection.update_or_date(collection, data.date);
        Alert.set(2, "");
        generate();
      }
    });
    nd.setLocationRelativeTo(this);
    nd.setVisible(true);
  }

  private void edit_or(to_collections collection) {

    Window p = (Window) this;
    Dlg_collection_edit_OR nd = Dlg_collection_edit_OR.create(p, true);
    nd.setTitle("");
    nd.do_pass(collection.or_no);
    nd.setCallback(new Dlg_collection_edit_OR.Callback() {

      @Override
      public void ok(CloseDialog closeDialog, Dlg_collection_edit_OR.OutputData data) {
        closeDialog.ok();
        Collection.update_or_no(collection, data.name);
        Alert.set(2, "");
        generate();
      }
    });
    nd.setLocationRelativeTo(this);
    nd.setVisible(true);
  }

  private void select_collection() {
    int row = tbl_collections.getSelectedRow();
    if (row < 0) {
      return;
    }
    int col = tbl_collections.getSelectedColumn();
    to_collections collection = (to_collections) tbl_collections_ALM.get(row);
    if (collection.status == 2) {
      Alert.set(0, "Collection already cancelled!");
      return;
    }
    if (col == 1) {

      Window p = (Window) this;
      Dlg_authenticate nd = Dlg_authenticate.create(p, true);
      nd.setTitle("");
      nd.do_pass();
      nd.setCallback(new Dlg_authenticate.Callback() {

        @Override
        public void ok(CloseDialog closeDialog, Dlg_authenticate.OutputData data) {
          closeDialog.ok();
          String where2 = " where user_name like '" + MyUser.getUser_name() + "' and  name like '" + "Override OR Date - (Add)" + "'";
          List<User_previlege_others.to_user_previlege_others> privs = User_previlege_others.ret_data(where2);
          if (!privs.isEmpty()) {
            edit_or(collection);
          } else {
            Alert.set(0, "Privilege not added!");
            return;
          }

        }
      });
      nd.setLocationRelativeTo(this);
      nd.setVisible(true);

    }
    if (col == 2) {
      Window p = (Window) this;
      Dlg_authenticate nd = Dlg_authenticate.create(p, true);
      nd.setTitle("");
      nd.do_pass();
      nd.setCallback(new Dlg_authenticate.Callback() {
        @Override
        public void ok(CloseDialog closeDialog, Dlg_authenticate.OutputData data) {
          closeDialog.ok();
          String where2 = " where user_name like '" + MyUser.getUser_name() + "' and  name like '" + "Override OR Date - (Add)" + "'";
          List<User_previlege_others.to_user_previlege_others> privs = User_previlege_others.ret_data(where2);
          if (!privs.isEmpty()) {
            edit_date(collection);
          } else {
            Alert.set(0, "Privilege not added!");
            return;
          }
        }
      });
      nd.setLocationRelativeTo(this);
      nd.setVisible(true);
    }

    if (col == 3) {
      Window p = (Window) this;
      Dlg_collection_edit_payment_type nd = Dlg_collection_edit_payment_type.create(p, true);
      nd.setTitle("");
      nd.do_pass(collection.payment_type);
      nd.setCallback(new Dlg_collection_edit_payment_type.Callback() {

        @Override
        public void ok(CloseDialog closeDialog, Dlg_collection_edit_payment_type.OutputData data) {
          closeDialog.ok();
          Collection.update_payment_type(collection, data.name);
          Alert.set(2, "");
          generate();
        }
      });
      nd.setLocationRelativeTo(this);
      nd.setVisible(true);
    }
    if (col == 4) {
      Window p = (Window) this;
      Dlg_collection_edit_payor nd = Dlg_collection_edit_payor.create(p, true);
      nd.setTitle("");
      nd.do_pass(collection.student_name);
      nd.setCallback(new Dlg_collection_edit_payor.Callback() {

        @Override
        public void ok(CloseDialog closeDialog, Dlg_collection_edit_payor.OutputData data) {
          closeDialog.ok();
          Collection.update_name(collection, data.name);
          Alert.set(2, "");
          generate();
        }
      });
      nd.setLocationRelativeTo(this);
      nd.setVisible(true);
    }
    if (col == 9) {
      Window p = (Window) this;
      Dlg_authenticate nd = Dlg_authenticate.create(p, true);
      nd.setTitle("");
      nd.do_pass();
      nd.setCallback(new Dlg_authenticate.Callback() {

        @Override
        public void ok(CloseDialog closeDialog, Dlg_authenticate.OutputData data) {
          closeDialog.ok();
          String wheree = " where user_id='" + MyUser.getUser_id() + "' and privilege like '" + "Collections Report - (Delete)" + "' limit 1";

          List<User_previleges.to_user_privileges> privileges = User_previleges.ret_data(wheree);
          if (privileges.isEmpty()) {
            Alert.set(0, "Privilege not added!");
            return;
          }
//          System.out.println("Deleted!");
          Enrollment_assessments.void_collection(collection);
          Alert.set(3, "");
          generate();
//        set_assessment2();
        }
      });
      nd.setLocationRelativeTo(this);
      nd.setVisible(true);
    }
  }
  List<String> shifts = new ArrayList();

  private void init_shift() {

    Object[][] obj = new Object[shifts.size()][1];
    int i = 0;
    for (String to : shifts) {
      obj[i][0] = " " + to;
      i++;
    }
    JLabel[] labels = {};
    int[] tbl_widths_customers = {tf_cashier6.getWidth()};
    int width = 0;
    String[] col_names = {""};
    TableRenderer tr = new TableRenderer();
    TableRenderer.setPopup(tf_cashier6, obj, labels, tbl_widths_customers, col_names);
    tr.setCallback(new TableRenderer.Callback() {
      @Override
      public void ok(TableRenderer.OutputData data) {
        String to = shifts.get(data.selected_row);
        Field.Combo co = (Field.Combo) tf_cashier6;
        co.setText("" + to);

      }

    });
  }
}
