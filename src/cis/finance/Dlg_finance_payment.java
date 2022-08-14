/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.finance;

import cis.account_types.Account_particulars;
import cis.account_types.Dlg_account_particulars;
import cis.banks.Banks;
import cis.banks.Dlg_banks;
import cis.collections.Collection;
import cis.credit_cards.Credit_cards;
import cis.customers.Customers;
import cis.downpayments.Downpayments;
import cis.enrollments.Enrollments;
import cis.other_payments.Other_payments;
import cis.students.Students;
import cis.users.Dlg_authenticate;
import cis.users.MyUser;
import cis.utils.Alert;
import cis.utils.DateType;
import cis.utils.Dlg_confirm_action;
import cis.utils.Dlg_confirm_action3;
import cis.utils.Dlg_retry_transaction;
import cis.utils.TableRenderer;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableCellRenderer;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.panels.Loading;

/**
 *
 * @author User
 */
public class Dlg_finance_payment extends javax.swing.JDialog {

  /**
   * Creates new form Dlg_finance_payment
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
  private Dlg_finance_payment(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    setUndecorated(true);
    initComponents();
    myInit();
  }

  private Dlg_finance_payment(java.awt.Dialog parent, boolean modal) {
    super(parent, modal);
    setUndecorated(true);
    initComponents();
    myInit();
  }

  public Dlg_finance_payment() {
    super();
    setUndecorated(true);
    initComponents();
    myInit();

  }
  private Dlg_finance_payment myRef;

  private void setThisRef(Dlg_finance_payment myRef) {
    this.myRef = myRef;
  }
  private static java.util.Map<Object, Dlg_finance_payment> dialogContainer = new java.util.HashMap();

  public static void clearUpFirst(java.awt.Window parent) {
    if (dialogContainer.containsKey(parent)) {
      dialogContainer.remove(parent);
    }
  }

  public static Dlg_finance_payment create(java.awt.Window parent, boolean modal) {

    if (modal) {
      return create(parent, ModalityType.APPLICATION_MODAL);
    }

    return create(parent, ModalityType.MODELESS);

  }

  public static Dlg_finance_payment create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

    if (parent instanceof java.awt.Frame) {

      Dlg_finance_payment dialog = dialogContainer.get(parent);

      if (dialog == null) {
        dialog = new Dlg_finance_payment((java.awt.Frame) parent, false);
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
      Dlg_finance_payment dialog = dialogContainer.get(parent);

      if (dialog == null) {
        dialog = new Dlg_finance_payment((java.awt.Dialog) parent, false);
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

    Dlg_finance_payment dialog = Dlg_finance_payment.create(new javax.swing.JFrame(), true);
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

    jPanel1 = new javax.swing.JPanel();
    jPanel3 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tbl_mode_of_payments = new javax.swing.JTable();
    jLabel83 = new javax.swing.JLabel();
    tf_total_amount = new Field.Input();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel86 = new javax.swing.JLabel();
    tf_customer_name = new Field.Input();
    tf_particular = new Field.Combo();
    jLabel76 = new javax.swing.JLabel();
    jButton2 = new javax.swing.JButton();
    jLabel43 = new javax.swing.JLabel();
    tf_field23 = new Field.Input();
    jPanel4 = new javax.swing.JPanel();
    jLabel84 = new javax.swing.JLabel();
    tf_field20 = new Field.Input();
    jTabbedPane1 = new javax.swing.JTabbedPane();
    jPanel5 = new javax.swing.JPanel();
    jLabel36 = new javax.swing.JLabel();
    tf_field21 = new Field.Input();
    jPanel6 = new javax.swing.JPanel();
    jLabel50 = new javax.swing.JLabel();
    tf_ap_cash7 = new Field.Input();
    jLabel32 = new javax.swing.JLabel();
    tf_credit_card_type = new Field.Combo();
    tf_credit_card_amount = new Field.Input();
    jLabel39 = new javax.swing.JLabel();
    jLabel37 = new javax.swing.JLabel();
    lbl_credit_card_rate = new Field.Input();
    jLabel38 = new javax.swing.JLabel();
    jLabel40 = new javax.swing.JLabel();
    tf_prepaid_customer_id3 = new Field.Input();
    tf_prepaid_customer_id4 = new Field.Input();
    jLabel41 = new javax.swing.JLabel();
    jLabel42 = new javax.swing.JLabel();
    tf_prepaid_customer_id5 = new Field.Input();
    jPanel7 = new javax.swing.JPanel();
    jLabel48 = new javax.swing.JLabel();
    tf_ap_cash5 = new Field.Input();
    tf_check_bank = new Field.Search();
    jLabel20 = new javax.swing.JLabel();
    jLabel21 = new javax.swing.JLabel();
    tf_ap_check_holder = new javax.swing.JTextField();
    tf_ap_check_no = new javax.swing.JTextField();
    jLabel23 = new javax.swing.JLabel();
    jLabel25 = new javax.swing.JLabel();
    jDateChooser4 = new com.toedter.calendar.JDateChooser();
    jPanel2 = new javax.swing.JPanel();
    jLabel49 = new javax.swing.JLabel();
    tf_ap_cash6 = new Field.Input();
    jLabel22 = new javax.swing.JLabel();
    tf_online_bank = new Field.Search();
    jLabel24 = new javax.swing.JLabel();
    tf_ap_check_holder1 = new javax.swing.JTextField();
    jLabel26 = new javax.swing.JLabel();
    tf_ap_check_no1 = new javax.swing.JTextField();
    jLabel27 = new javax.swing.JLabel();
    jDateChooser5 = new com.toedter.calendar.JDateChooser();
    jButton1 = new javax.swing.JButton();
    jLabel85 = new javax.swing.JLabel();
    tf_field22 = new Field.Input();
    jButton4 = new Button.Default();
    jButton3 = new Button.Success();
    jPanel8 = new javax.swing.JPanel();
    jLabel87 = new javax.swing.JLabel();
    tf_customer_name1 = new Field.Input();
    jLabel88 = new javax.swing.JLabel();
    tf_customer_name2 = new Field.Input();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

    jPanel3.setBackground(new java.awt.Color(255, 255, 255));
    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fees", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
    jPanel3.setMinimumSize(new java.awt.Dimension(480, 500));

    jScrollPane1.setMinimumSize(new java.awt.Dimension(480, 500));
    jScrollPane1.setPreferredSize(new java.awt.Dimension(480, 500));

    tbl_mode_of_payments.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {},
        {},
        {},
        {}
      },
      new String [] {

      }
    ));
    jScrollPane1.setViewportView(tbl_mode_of_payments);

    jLabel83.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel83.setText("Total Amount:");

    tf_total_amount.setBackground(new java.awt.Color(204, 204, 204));
    tf_total_amount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
    tf_total_amount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    tf_total_amount.setFocusable(false);
    tf_total_amount.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tf_total_amountMouseClicked(evt);
      }
    });
    tf_total_amount.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_total_amountActionPerformed(evt);
      }
    });

    jLabel1.setText("No. of rows:");

    jLabel2.setText("0");

    jLabel86.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel86.setText("Customer:");

    tf_customer_name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    tf_customer_name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
    tf_customer_name.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tf_customer_nameMouseClicked(evt);
      }
    });
    tf_customer_name.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_customer_nameActionPerformed(evt);
      }
    });
    tf_customer_name.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        tf_customer_nameKeyReleased(evt);
      }
    });

    tf_particular.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    tf_particular.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tf_particularMouseClicked(evt);
      }
    });
    tf_particular.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_particularActionPerformed(evt);
      }
    });

    jLabel76.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel76.setText("Particular:");

    jButton2.setText("+");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel43.setText("Amount:");

    tf_field23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    tf_field23.setHorizontalAlignment(javax.swing.JTextField.LEFT);
    tf_field23.setText("0.00");
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
    tf_field23.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        tf_field23KeyReleased(evt);
      }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel43))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(tf_particular, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(tf_field23, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
            .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tf_total_amount))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jButton2)
            .addGroup(jPanel3Layout.createSequentialGroup()
              .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(tf_customer_name, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addGap(18, 18, 18))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_total_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_customer_name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_particular, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton2))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(jLabel2))
        .addGap(60, 60, 60))
    );

    jPanel4.setBackground(new java.awt.Color(255, 255, 255));
    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
    jPanel4.setMinimumSize(new java.awt.Dimension(404, 437));

    jLabel84.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel84.setText("Tendered:");

    tf_field20.setBackground(new java.awt.Color(0, 0, 0));
    tf_field20.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
    tf_field20.setForeground(new java.awt.Color(102, 204, 0));
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

    jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jPanel5.setBackground(new java.awt.Color(255, 255, 255));

    jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel36.setText("Amount:");

    tf_field21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    tf_field21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    tf_field21.setText("0.00");
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
    tf_field21.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        tf_field21KeyReleased(evt);
      }
    });

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel5Layout.createSequentialGroup()
        .addGap(56, 56, 56)
        .addComponent(jLabel36)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(tf_field21, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(73, Short.MAX_VALUE))
    );
    jPanel5Layout.setVerticalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel5Layout.createSequentialGroup()
        .addGap(90, 90, 90)
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Cash", jPanel5);

    jPanel6.setBackground(new java.awt.Color(255, 255, 255));

    jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel50.setText("Amount:");

    tf_ap_cash7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    tf_ap_cash7.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_ap_cash7ActionPerformed(evt);
      }
    });
    tf_ap_cash7.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        tf_ap_cash7KeyReleased(evt);
      }
    });

    jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel32.setText("Card:");

    tf_credit_card_type.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    tf_credit_card_type.setFocusable(false);
    tf_credit_card_type.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tf_credit_card_typeMouseClicked(evt);
      }
    });
    tf_credit_card_type.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_credit_card_typeActionPerformed(evt);
      }
    });

    tf_credit_card_amount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    tf_credit_card_amount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    tf_credit_card_amount.setText("0.00");
    tf_credit_card_amount.setFocusable(false);

    jLabel39.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
    jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel39.setText("Rate Amount:");

    jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel37.setText("%");

    lbl_credit_card_rate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    lbl_credit_card_rate.setText("0.00");
    lbl_credit_card_rate.setFocusable(false);

    jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel38.setText("Rate:");

    jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel40.setText("Card #:");

    tf_prepaid_customer_id3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    tf_prepaid_customer_id4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel41.setText("Holder:");

    jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel42.setText("Code:");

    tf_prepaid_customer_id5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
      jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel6Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
          .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(jPanel6Layout.createSequentialGroup()
            .addComponent(lbl_credit_card_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel39)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tf_credit_card_amount, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
          .addComponent(tf_prepaid_customer_id5)
          .addComponent(tf_prepaid_customer_id4)
          .addComponent(tf_prepaid_customer_id3, javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(tf_ap_cash7)
          .addComponent(tf_credit_card_type))
        .addContainerGap())
    );
    jPanel6Layout.setVerticalGroup(
      jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel6Layout.createSequentialGroup()
        .addGap(26, 26, 26)
        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(tf_credit_card_type, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_ap_cash7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lbl_credit_card_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_credit_card_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_prepaid_customer_id3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_prepaid_customer_id4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_prepaid_customer_id5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Credit Card", jPanel6);

    jPanel7.setBackground(new java.awt.Color(255, 255, 255));

    jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel48.setText("Check Amount:");

    tf_ap_cash5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    tf_ap_cash5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_ap_cash5ActionPerformed(evt);
      }
    });
    tf_ap_cash5.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        tf_ap_cash5KeyReleased(evt);
      }
    });

    tf_check_bank.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    tf_check_bank.setFocusable(false);
    tf_check_bank.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tf_check_bankMouseClicked(evt);
      }
    });
    tf_check_bank.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_check_bankActionPerformed(evt);
      }
    });

    jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel20.setText("Bank:");

    jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel21.setText("Holder:");

    tf_ap_check_holder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    tf_ap_check_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    tf_ap_check_no.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_ap_check_noActionPerformed(evt);
      }
    });

    jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel23.setText("Number:");

    jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel25.setText("Date:");

    jDateChooser4.setDate(new Date());
    jDateChooser4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
    jPanel7.setLayout(jPanel7Layout);
    jPanel7Layout.setHorizontalGroup(
      jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel7Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel7Layout.createSequentialGroup()
            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addComponent(tf_ap_cash5))
          .addGroup(jPanel7Layout.createSequentialGroup()
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(tf_check_bank)
              .addComponent(tf_ap_check_no)
              .addComponent(tf_ap_check_holder)))
          .addGroup(jPanel7Layout.createSequentialGroup()
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jDateChooser4, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
        .addContainerGap())
    );
    jPanel7Layout.setVerticalGroup(
      jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel7Layout.createSequentialGroup()
        .addGap(26, 26, 26)
        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_ap_cash5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(tf_check_bank, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_ap_check_holder, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(0, 0, 0)
        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_ap_check_no, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(0, 0, 0)
        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Check", jPanel7);

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));

    jLabel49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel49.setText("Amount:");

    tf_ap_cash6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    tf_ap_cash6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_ap_cash6ActionPerformed(evt);
      }
    });
    tf_ap_cash6.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        tf_ap_cash6KeyReleased(evt);
      }
    });

    jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel22.setText("Bank:");

    tf_online_bank.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    tf_online_bank.setFocusable(false);
    tf_online_bank.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tf_online_bankMouseClicked(evt);
      }
    });
    tf_online_bank.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_online_bankActionPerformed(evt);
      }
    });

    jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel24.setText("Holder:");

    tf_ap_check_holder1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel26.setText("Number:");

    tf_ap_check_no1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    tf_ap_check_no1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_ap_check_no1ActionPerformed(evt);
      }
    });

    jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel27.setText("Date:");

    jDateChooser5.setDate(new Date());
    jDateChooser5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jButton1.setText("+");
    jButton1.setFocusable(false);
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addComponent(tf_ap_cash6))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(tf_ap_check_no1)
              .addComponent(tf_ap_check_holder1)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(tf_online_bank)
                .addGap(0, 0, 0)
                .addComponent(jButton1))))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jDateChooser5, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(26, 26, 26)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_ap_cash6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(9, 9, 9)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(tf_online_bank, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(2, 2, 2)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_ap_check_holder1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(0, 0, 0)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_ap_check_no1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(0, 0, 0)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(93, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Online", jPanel2);

    jLabel85.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel85.setText("Or No.:");

    tf_field22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    tf_field22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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
    tf_field22.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        tf_field22KeyReleased(evt);
      }
    });

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jTabbedPane1)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(tf_field20, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
              .addComponent(tf_field22))))
        .addContainerGap())
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(tf_field20)
          .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jTabbedPane1)
        .addContainerGap())
    );

    jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jButton4.setText("Cancel");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton4ActionPerformed(evt);
      }
    });

    jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jButton3.setText("Ok");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton3ActionPerformed(evt);
      }
    });

    jPanel8.setBackground(new java.awt.Color(255, 255, 255));
    jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Student Info"));

    jLabel87.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel87.setText("Student No.:");

    tf_customer_name1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    tf_customer_name1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
    tf_customer_name1.setFocusable(false);
    tf_customer_name1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tf_customer_name1MouseClicked(evt);
      }
    });
    tf_customer_name1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_customer_name1ActionPerformed(evt);
      }
    });
    tf_customer_name1.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        tf_customer_name1KeyReleased(evt);
      }
    });

    jLabel88.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel88.setText("Student Name:");

    tf_customer_name2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    tf_customer_name2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
    tf_customer_name2.setFocusable(false);
    tf_customer_name2.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tf_customer_name2MouseClicked(evt);
      }
    });
    tf_customer_name2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_customer_name2ActionPerformed(evt);
      }
    });
    tf_customer_name2.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        tf_customer_name2KeyReleased(evt);
      }
    });

    javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
    jPanel8.setLayout(jPanel8Layout);
    jPanel8Layout.setHorizontalGroup(
      jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel8Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel8Layout.createSequentialGroup()
            .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tf_customer_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel8Layout.createSequentialGroup()
            .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tf_customer_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel8Layout.setVerticalGroup(
      jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel8Layout.createSequentialGroup()
        .addGap(5, 5, 5)
        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_customer_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_customer_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(31, 31, 31)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(15, 15, 15))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(34, 34, 34)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addContainerGap())
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(13, 13, 13))))
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

    private void tf_total_amountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_total_amountMouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_total_amountMouseClicked

    private void tf_total_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_total_amountActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_total_amountActionPerformed

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

    private void tf_field21KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_field21KeyReleased
      count_tender();
    }//GEN-LAST:event_tf_field21KeyReleased

    private void tf_ap_cash7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ap_cash7ActionPerformed

    }//GEN-LAST:event_tf_ap_cash7ActionPerformed

    private void tf_ap_cash7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_ap_cash7KeyReleased
      count_tender();
    }//GEN-LAST:event_tf_ap_cash7KeyReleased

    private void tf_credit_card_typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_credit_card_typeMouseClicked
      init_credit_cards();
    }//GEN-LAST:event_tf_credit_card_typeMouseClicked

    private void tf_credit_card_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_credit_card_typeActionPerformed
      init_credit_cards();
    }//GEN-LAST:event_tf_credit_card_typeActionPerformed

    private void tf_ap_cash5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ap_cash5ActionPerformed
      //        count_tender();
    }//GEN-LAST:event_tf_ap_cash5ActionPerformed

    private void tf_ap_cash5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_ap_cash5KeyReleased
      count_tender();
    }//GEN-LAST:event_tf_ap_cash5KeyReleased

    private void tf_check_bankMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_check_bankMouseClicked
      init_banks(tf_check_bank);
    }//GEN-LAST:event_tf_check_bankMouseClicked

    private void tf_check_bankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_check_bankActionPerformed
      init_banks(tf_check_bank);
    }//GEN-LAST:event_tf_check_bankActionPerformed

    private void tf_ap_check_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ap_check_noActionPerformed

    }//GEN-LAST:event_tf_ap_check_noActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      disposed();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      confirm();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tf_field22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field22MouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field22MouseClicked

    private void tf_field22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field22ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field22ActionPerformed

    private void tf_field22KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_field22KeyReleased
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field22KeyReleased

    private void tf_ap_cash6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ap_cash6ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_ap_cash6ActionPerformed

    private void tf_ap_cash6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_ap_cash6KeyReleased
      count_tender();
    }//GEN-LAST:event_tf_ap_cash6KeyReleased

    private void tf_online_bankMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_online_bankMouseClicked
      init_banks(tf_online_bank);
    }//GEN-LAST:event_tf_online_bankMouseClicked

    private void tf_online_bankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_online_bankActionPerformed
      init_banks(tf_online_bank);
    }//GEN-LAST:event_tf_online_bankActionPerformed

    private void tf_ap_check_no1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ap_check_no1ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_ap_check_no1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      banks();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tf_customer_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_customer_nameMouseClicked
      init_customers();
    }//GEN-LAST:event_tf_customer_nameMouseClicked

    private void tf_customer_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_customer_nameActionPerformed
      init_customers();
    }//GEN-LAST:event_tf_customer_nameActionPerformed

    private void tf_customer_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_customer_nameKeyReleased
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_customer_nameKeyReleased

    private void tf_particularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_particularMouseClicked
      init_particulars();
    }//GEN-LAST:event_tf_particularMouseClicked

    private void tf_particularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_particularActionPerformed
      init_particulars();
    }//GEN-LAST:event_tf_particularActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      add_particulars();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tf_field23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field23MouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field23MouseClicked

    private void tf_field23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field23ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field23ActionPerformed

    private void tf_field23KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_field23KeyReleased
      double amount = FitIn.toDouble(tf_field23.getText());
      tf_total_amount.setText(FitIn.fmt_wc_0(amount));
    }//GEN-LAST:event_tf_field23KeyReleased

  private void tf_customer_name1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_customer_name1MouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_customer_name1MouseClicked

  private void tf_customer_name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_customer_name1ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_customer_name1ActionPerformed

  private void tf_customer_name1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_customer_name1KeyReleased
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_customer_name1KeyReleased

  private void tf_customer_name2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_customer_name2MouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_customer_name2MouseClicked

  private void tf_customer_name2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_customer_name2ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_customer_name2ActionPerformed

  private void tf_customer_name2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_customer_name2KeyReleased
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_customer_name2KeyReleased

  /**
   * @param args the command line arguments
   */

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private com.toedter.calendar.JDateChooser jDateChooser4;
  private com.toedter.calendar.JDateChooser jDateChooser5;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel20;
  private javax.swing.JLabel jLabel21;
  private javax.swing.JLabel jLabel22;
  private javax.swing.JLabel jLabel23;
  private javax.swing.JLabel jLabel24;
  private javax.swing.JLabel jLabel25;
  private javax.swing.JLabel jLabel26;
  private javax.swing.JLabel jLabel27;
  private javax.swing.JLabel jLabel32;
  private javax.swing.JLabel jLabel36;
  private javax.swing.JLabel jLabel37;
  private javax.swing.JLabel jLabel38;
  private javax.swing.JLabel jLabel39;
  private javax.swing.JLabel jLabel40;
  private javax.swing.JLabel jLabel41;
  private javax.swing.JLabel jLabel42;
  private javax.swing.JLabel jLabel43;
  private javax.swing.JLabel jLabel48;
  private javax.swing.JLabel jLabel49;
  private javax.swing.JLabel jLabel50;
  private javax.swing.JLabel jLabel76;
  private javax.swing.JLabel jLabel83;
  private javax.swing.JLabel jLabel84;
  private javax.swing.JLabel jLabel85;
  private javax.swing.JLabel jLabel86;
  private javax.swing.JLabel jLabel87;
  private javax.swing.JLabel jLabel88;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JPanel jPanel5;
  private javax.swing.JPanel jPanel6;
  private javax.swing.JPanel jPanel7;
  private javax.swing.JPanel jPanel8;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTabbedPane jTabbedPane1;
  private javax.swing.JTextField lbl_credit_card_rate;
  private javax.swing.JTable tbl_mode_of_payments;
  private javax.swing.JTextField tf_ap_cash5;
  private javax.swing.JTextField tf_ap_cash6;
  private javax.swing.JTextField tf_ap_cash7;
  private javax.swing.JTextField tf_ap_check_holder;
  private javax.swing.JTextField tf_ap_check_holder1;
  private javax.swing.JTextField tf_ap_check_no;
  private javax.swing.JTextField tf_ap_check_no1;
  private javax.swing.JTextField tf_check_bank;
  private javax.swing.JTextField tf_credit_card_amount;
  private javax.swing.JTextField tf_credit_card_type;
  private javax.swing.JTextField tf_customer_name;
  private javax.swing.JTextField tf_customer_name1;
  private javax.swing.JTextField tf_customer_name2;
  private javax.swing.JTextField tf_field20;
  private javax.swing.JTextField tf_field21;
  private javax.swing.JTextField tf_field22;
  private javax.swing.JTextField tf_field23;
  private javax.swing.JTextField tf_online_bank;
  private javax.swing.JTextField tf_particular;
  private javax.swing.JTextField tf_prepaid_customer_id3;
  private javax.swing.JTextField tf_prepaid_customer_id4;
  private javax.swing.JTextField tf_prepaid_customer_id5;
  private javax.swing.JTextField tf_total_amount;
  // End of variables declaration//GEN-END:variables

  private void myInit() {
    init_key();
    init_tbl_mode_of_payments(tbl_mode_of_payments);
    tf_field21.grabFocus();
    hide_other_payments(false);
    jPanel3.setMinimumSize(new Dimension(450, 500));
    jPanel4.setMinimumSize(new Dimension(404, 437));
    ret_particulars();
    jPanel8.setVisible(false);
  }

  private void hide_other_payments(boolean stmt) {
    jLabel86.setVisible(stmt);
    tf_customer_name.setVisible(stmt);
    jLabel76.setVisible(stmt);
    tf_particular.setVisible(stmt);
    jButton2.setVisible(stmt);
    jLabel43.setVisible(stmt);
    tf_field23.setVisible(stmt);

    jLabel83.setVisible(!stmt);
    tf_total_amount.setVisible(!stmt);

    jScrollPane1.setVisible(!stmt);
    jLabel1.setVisible(!stmt);
    jLabel2.setVisible(!stmt);

  }
  Students.to_students pay_stud = null;
  Enrollments.to_enrollments enroll = null;
  boolean has_or = false;
  boolean is_other_payment = false;
  boolean is_downpayment = false;

  public void do_pass_other_payment() {
    hide_other_payments(true);
    tf_customer_name.grabFocus();
    is_other_payment = true;
    is_downpayment = false;
  }

  public void do_pass(List<Finance.fees> fees, Students.to_students stud, boolean _has_or) {
    is_other_payment = false;
    is_downpayment = false;

    pay_stud = stud;
    has_or = _has_or;
    loadData_mode_of_payments(fees);
    jLabel2.setText("" + fees.size());
    double amount = 0;
    for (Finance.fees fee : fees) {
      amount += fee.balance;
    }
    tf_total_amount.setText(FitIn.fmt_wc_0(amount));
  }
  int is_adjustment = 0;

  public void do_pass2F(List<Finance.fees> fees, Students.to_students stud) {
    is_other_payment = false;
    is_adjustment = 1;
    has_or = true;
    pay_stud = stud;
    loadData_mode_of_payments(fees);
    jLabel2.setText("" + fees.size());
    double amount = 0;
    for (Finance.fees fee : fees) {
      amount += fee.balance;
    }
    tf_total_amount.setText(FitIn.fmt_wc_0(amount));
  }

  public void do_pass_downpayment(Students.to_students stud, Enrollments.to_enrollments to) {
    is_downpayment = true;
    is_other_payment = false;
    has_or = true;
    if (stud != null) {
      pay_stud = stud;
    }

    enroll = to;
    hide_other_payments(true);
    jLabel86.setVisible(false);
    tf_customer_name.setVisible(false);

    jLabel76.setVisible(false);
    tf_particular.setVisible(false);
    jButton2.setVisible(false);
    tf_customer_name.setText("");

    tf_customer_name1.setText(enroll.student_no);
    tf_customer_name2.setText(enroll.last_name + ", " + enroll.first_name + " " + enroll.middle_name);

    Field.Input tf = (Field.Input) tf_customer_name;
    tf.setId("" + enroll.student_id);
    tf.setText(enroll.last_name + ", " + enroll.first_name + " " + enroll.middle_name);

    jPanel8.setVisible(true);

    tf_field23.grabFocus();

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

  private void init_credit_cards() {
    String search = tf_credit_card_type.getText();

    String where = "  order by card asc";
    List<Credit_cards.to_credit_cards> credit_card_list = Credit_cards.ret_data(where);
    Object[][] obj = new Object[credit_card_list.size()][2];
    int i = 0;
    for (Credit_cards.to_credit_cards to : credit_card_list) {
      obj[i][0] = " " + to.card;
      obj[i][1] = " " + FitIn.fmt_wc_0(to.amount);
      i++;
    }
    JLabel[] labels = {};
    int[] tbl_widths_customers = {tf_credit_card_type.getWidth() - 50, 50};
    int width = 0;
    String[] col_names = {"", ""};
    TableRenderer tr = new TableRenderer();
    TableRenderer.setPopup(tf_credit_card_type, obj, labels, tbl_widths_customers, col_names);
    tr.setCallback(new TableRenderer.Callback() {
      @Override
      public void ok(TableRenderer.OutputData data) {
        Credit_cards.to_credit_cards to = credit_card_list.get(data.selected_row);
        lbl_credit_card_rate.setText(FitIn.fmt_wc_0(to.amount));
        tf_credit_card_type.setText(to.card);
        double credit_card_amount = FitIn.toDouble(tf_ap_cash7.getText());
        double rate = FitIn.toDouble(lbl_credit_card_rate.getText());
        rate = rate / 100;
        rate = rate * credit_card_amount;
        rate = credit_card_amount + rate;
        tf_credit_card_amount.setText(FitIn.fmt_wc_0(rate));
      }
    });
  }

  private void init_banks(JTextField tf) {

    String where = "  order by bank asc";
    List<Banks.to_banks> bank_list = Banks.ret_data(where);
    Object[][] obj = new Object[bank_list.size()][1];
    int i = 0;
    for (Banks.to_banks to : bank_list) {

      obj[i][0] = " " + to.bank;
      i++;
    }
    JLabel[] labels = {};
    int[] tbl_widths_customers = {tf.getWidth()};
    int width = 0;
    String[] col_names = {"", ""};
    TableRenderer tr = new TableRenderer();
    TableRenderer.
            setPopup(tf, obj, labels, tbl_widths_customers, col_names);
    tr.setCallback(new TableRenderer.Callback() {
      @Override
      public void ok(TableRenderer.OutputData data) {
        Banks.to_banks to = bank_list.get(data.selected_row);
        tf.setText(to.bank);

      }
    });
  }

  private void count_tender() {
    double cash = FitIn.toDouble(tf_field21.getText());
    double check = FitIn.toDouble(tf_ap_cash5.getText());
    double credit_card = FitIn.toDouble(tf_ap_cash7.getText());
    double online = FitIn.toDouble(tf_ap_cash6.getText());

    double tendered = FitIn.toDouble(tf_total_amount.getText());
    double total_tendered = cash + check + credit_card + online;

    tf_field20.setText(FitIn.fmt_wc_0(total_tendered));

    if (tf_ap_cash7.hasFocus()) {
      double credit_card_amount = FitIn.toDouble(tf_ap_cash7.getText());
      double rate = FitIn.toDouble(lbl_credit_card_rate.getText());
      rate = rate / 100;
      rate = rate * credit_card_amount;
      rate = credit_card_amount + rate;
      tf_credit_card_amount.setText(FitIn.fmt_wc_0(rate));
    }

    double remaining = tendered - total_tendered;

    double total_for_cash = check + credit_card + online;
    double total_for_check = cash + credit_card + online;
    double total_for_credit_card = cash + check + online;
    double total_for_online = cash + check + credit_card;

    if (remaining < 0 && tf_field21.hasFocus()) {
      remaining = (tendered - total_for_cash);
      tf_field21.setText(FitIn.fmt_wc_0(remaining));
    }
    if (remaining < 0 && tf_ap_cash5.hasFocus()) {
      remaining = (tendered - total_for_check);
      tf_ap_cash5.setText(FitIn.fmt_wc_0(remaining));
    }

    if (remaining < 0 && tf_ap_cash7.hasFocus()) {
      remaining = (tendered - total_for_credit_card);
      tf_ap_cash7.setText(FitIn.fmt_wc_0(remaining));
    }

    if (remaining < 0 && tf_ap_cash6.hasFocus()) {
      remaining = (tendered - total_for_online);
      tf_ap_cash6.setText(FitIn.fmt_wc_0(remaining));
    }

    total_tendered = cash + check + credit_card + online;
    tf_field20.setText(FitIn.fmt_wc_0(total_tendered));
    if (total_tendered > tendered) {
      tf_field20.setText(FitIn.fmt_wc_0(tendered));
    }
    set_paid();
  }

  //<editor-fold defaultstate="collapsed" desc=" mode_of_payments "> 
  public static ArrayListModel tbl_mode_of_payments_ALM;
  public static Tblmode_of_paymentsModel tbl_mode_of_payments_M;

  public static void init_tbl_mode_of_payments(JTable tbl_mode_of_payments) {
    tbl_mode_of_payments_ALM = new ArrayListModel();
    tbl_mode_of_payments_M = new Tblmode_of_paymentsModel(tbl_mode_of_payments_ALM);
    tbl_mode_of_payments.setModel(tbl_mode_of_payments_M);
    tbl_mode_of_payments.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    tbl_mode_of_payments.setRowHeight(25);
    int[] tbl_widths_mode_of_payments = {100, 0, 70, 70, 70, 0, 0, 0, 0};
    for (int i = 0, n = tbl_widths_mode_of_payments.length; i < n; i++) {
      if (i == 0) {
        continue;
      }
      TableWidthUtilities.setColumnWidth(tbl_mode_of_payments, i, tbl_widths_mode_of_payments[i]);
    }
    Dimension d = tbl_mode_of_payments.getTableHeader().getPreferredSize();
    d.height = 25;
    tbl_mode_of_payments.getTableHeader().setPreferredSize(d);
    tbl_mode_of_payments.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
    tbl_mode_of_payments.setRowHeight(35);
    tbl_mode_of_payments.setFont(new java.awt.Font("Arial", 0, 12));
    TableWidthUtilities.setColumnRightRenderer(tbl_mode_of_payments, 2);
    TableWidthUtilities.setColumnRightRenderer(tbl_mode_of_payments, 3);
    TableWidthUtilities.setColumnRightRenderer(tbl_mode_of_payments, 4);
    tbl_mode_of_payments.getColumnModel().getColumn(0).setCellRenderer(new Html());
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

  public static void loadData_mode_of_payments(List<Finance.fees> acc) {
    tbl_mode_of_payments_ALM.clear();
    tbl_mode_of_payments_ALM.addAll(acc);
  }

  public static class Tblmode_of_paymentsModel extends AbstractTableAdapter {

    public static String[] COLUMNS = {
      "Mode", "Date", "Amount", "Paid", "Balance", "created_by", "updated_by", "status", "is_uploaded"
    };

    public Tblmode_of_paymentsModel(ListModel listmodel) {
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
      Finance.fees tt = (Finance.fees) getRow(row);
      switch (col) {
        case 0:
          return tt.title;
        case 1:
          return " " + tt.deadline;
        case 2:
          return " " + FitIn.fmt_wc_0(tt.amount) + " ";
        case 3:
          return " " + FitIn.fmt_wc_0(tt.paid + tt.new_payment) + " ";
        case 4:
          return " " + FitIn.fmt_wc_0(tt.amount - (tt.paid + tt.new_payment)) + " ";
        case 5:
          return "";
        case 6:
          return "";
        case 7:
          return "";
        default:
          return "";
      }
    }
  }
//</editor-fold> 

  private void set_paid() {
    double tendered = FitIn.toDouble(tf_field20.getText());
    double total = tendered;
    List<Finance.fees> modes = tbl_mode_of_payments_ALM;
    for (Finance.fees mode : modes) {
      double amount = (mode.amount - mode.paid);
      double prev_total = total;
      total = total - amount;
      if (total >= 0) {
        mode.setNew_payment(amount);
      } else {
        if (prev_total >= 0) {
          mode.setNew_payment(prev_total);
        } else {
          mode.setNew_payment(0);
        }
      }
    }
    tbl_mode_of_payments_M.fireTableDataChanged();
  }

  private void override() {
    Window p = (Window) this;
    Dlg_authenticate nd = Dlg_authenticate.create(p, true);
    nd.setTitle("");
    nd.do_override_downpayment();
    nd.setCallback(new Dlg_authenticate.Callback() {

      @Override
      public void ok(CloseDialog closeDialog, Dlg_authenticate.OutputData data) {
        closeDialog.ok();
        pay4();
      }

    });
    nd.setLocationRelativeTo(this);
    nd.setVisible(true);
  }

  private void confirm() {
    String name = tf_customer_name.getText();
    if (!name.isEmpty()) {
      List<Customers.to_customers> datas = Customers.ret_data("where name like '%" + name + "%' limit 1 ");
      if (datas.isEmpty()) {

        Customers.to_customers to = new Customers.to_customers(0, name);
        Customers.add_data(to);
      }
    }
    if (tf_particular.getText().equalsIgnoreCase("Back Account")) {
      Alert.set(0, "Please Select other particular!");
      return;
    }
    if (is_other_payment || is_downpayment) {
      double amount = FitIn.toDouble(tf_total_amount.getText());
      if (amount <= 0) {
        if (is_downpayment) {
          Alert.set(0, "Enter Amount");
          Window p = (Window) this;
          Dlg_confirm_action3 nd = Dlg_confirm_action3.create(p, true);
          nd.setTitle("");
          nd.do_pass("Confirm override?");
          nd.setCallback(new Dlg_confirm_action3.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action3.OutputData data) {
              closeDialog.ok();
              override();
            }
          });
          nd.setLocationRelativeTo(this);
          nd.setVisible(true);
        } else {
          Alert.set(0, "Enter Amount");
          return;
        }

      }
      double tendered = FitIn.toDouble(tf_field20.getText());
      if (amount != tendered) {
        Alert.set(0, "No enough amount entered");
        return;
      }
    }

    System.out.println("is_downpayment: " + is_downpayment);

    Window p = (Window) this;
    Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
    nd.setTitle("");
//        nd.do_pass(services);
    nd.setCallback(new Dlg_confirm_action.Callback() {

      @Override
      public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
        closeDialog.ok();
        if (is_downpayment) {
          pay4();
        } else {
          if (is_other_payment == true) {
            pay3();
          } else {
            if (is_adjustment == 1) {
              pay1();

            } else {
              pay2();
            }
          }
        }

      }
    });
    nd.setLocationRelativeTo(this);
    nd.setVisible(true);
  }

  private void pay1() {
    Loader1 loader = new Loader1(this);
    loader.execute();
  }

  private void pay2() {
    Loader2 loader = new Loader2(this);
    loader.execute();
  }

  private void pay3() {
    Loader3 loader = new Loader3(this);
    loader.execute();
  }

  private void pay4() {
    Loader4 loader = new Loader4(this);
    loader.execute();
  }

  private void pay_other_payment() {
    System.out.println("pay_other_payment!");
    int id = 0;
    String reference_no = tf_field22.getText();
    Field.Input tf = (Field.Input) tf_customer_name;
    String customer_id = tf.getId();
    String customer_name = tf.getText();
    double amount = FitIn.toDouble(tf_field23.getText());
    Field.Combo tf2 = (Field.Combo) tf_particular;
    int particular_id = FitIn.toInt(tf2.getId());
    String particular = tf2.getText();
    String created_at = DateType.now();
    String updated_at = DateType.now();
    int created_by = FitIn.toInt(MyUser.getUser_id());
    int updated_by = FitIn.toInt(MyUser.getUser_id());
    int status = 0;
    int collection_id = 0;
    String collection_no = "";
    Other_payments.to_other_payments payment = new Other_payments.to_other_payments(id, reference_no, customer_id, customer_name, amount, particular_id, particular, created_at, updated_at, created_at, updated_at, status, collection_id, collection_no);

    String or_no = tf_field22.getText();
    String payment_type = particular;
    double amount_paid = FitIn.toDouble(tf_field20.getText());
    double cash = FitIn.toDouble(tf_field21.getText());
    String discount_name = "";
    double discount_rate = 0;
    double discount_amount = 0;
    String discount_customer_name = "";
    String discount_customer_id = "";
    double check_amount = FitIn.toDouble(tf_ap_cash5.getText());
    String check_bank = tf_check_bank.getText();
    String check_no = tf_ap_check_no.getText();
    String check_holder = tf_ap_check_holder.getText();
    String check_date = DateType.sf.format(jDateChooser4.getDate());
    String credit_card_type = tf_credit_card_type.getText();
    double credit_card_rate = FitIn.toDouble(lbl_credit_card_rate.getText());
    double credit_card_amount = FitIn.toDouble(tf_ap_cash7.getText());
    String credit_card_no = tf_prepaid_customer_id3.getText();
    String gift_certificate_from = "";
    String gift_certificate_description = "";
    String gift_certificate_no = "";
    double gift_certificate_amount = 0;
    String online_bank = tf_online_bank.getText();
    String online_reference_no = tf_ap_check_no1.getText();
    double online_amount = FitIn.toDouble(tf_ap_cash6.getText());
    String online_holder = tf_ap_check_holder1.getText();
    String online_date = DateType.sf.format(jDateChooser5.getDate());
    int is_uploaded = 0;
    int ref_id = 0;

    String school_year = "2021 - 2022";
    String period = "First Semester";
    String year_level = "";
    String department_id = "";
    String department = "";
    String college_id = "";
    String college = "";
    String course_id = "";
    String course = "";

    Collection.to_collections to_collections = new Collection.to_collections(id, collection_no, or_no, payment_type, amount_paid, cash, discount_name, discount_rate, discount_amount, discount_customer_name, discount_customer_id, check_amount, check_bank, check_no, check_holder, check_date, credit_card_type, credit_card_rate, credit_card_amount, credit_card_no, gift_certificate_from, gift_certificate_description, gift_certificate_no, gift_certificate_amount, online_bank, online_reference_no, online_amount, online_holder, online_date, created_at, updated_at, "" + created_by, "" + updated_by, status, is_uploaded, ref_id, school_year, period, year_level, department_id, department, college_id, college, course_id, course, customer_id, customer_id, customer_name);

    String or = Other_payments.pay(payment, to_collections);
    c_transaction_no = or;
    c_gross_amount = amount_paid;
    c_cash = cash;
    c_credit_card = credit_card_amount;
    c_gc = gift_certificate_amount;
    c_check = check_amount;
    c_online = online_amount;
    Alert.set(1, "Payment Successful!");
  }

  private void pay_downpayment() {

    int id = 0;
    double amount = FitIn.toDouble(tf_total_amount.getText());
    String created_at = DateType.now();
    String updated_at = DateType.now();
    int created_by = FitIn.toInt(MyUser.getUser_id());
    int updated_by = FitIn.toInt(MyUser.getUser_id());
    int status = 0;
    int collection_id = 0;
    String collection_no = "";

    int enrollment_id = enroll.id;
    String enrollment_no = enroll.enrollment_no;
    int academic_year_id = enroll.academic_year_id;
    String academic_year = enroll.academic_year;
    String student_id = "" + enroll.student_id;
    String student_no = enroll.student_no;
    String student_name = enroll.first_name + " " + enroll.middle_name + " " + enroll.last_name;
    System.out.println("Downpayment! " + enroll.first_name);
    Downpayments.to_downpayments downpayment = new Downpayments.to_downpayments(id, enrollment_id, enrollment_no, academic_year_id, academic_year, student_id, student_no, student_name, amount, "" + created_by, "" + updated_by, created_at, updated_at, status, collection_id, collection_no);

    String or_no = tf_field22.getText();
    String payment_type = "Downpayment";
    double amount_paid = FitIn.toDouble(tf_field20.getText());
    double cash = FitIn.toDouble(tf_field21.getText());
    String discount_name = "";
    double discount_rate = 0;
    double discount_amount = 0;
    String discount_customer_name = "";
    String discount_customer_id = "";
    double check_amount = FitIn.toDouble(tf_ap_cash5.getText());
    String check_bank = tf_check_bank.getText();
    String check_no = tf_ap_check_no.getText();
    String check_holder = tf_ap_check_holder.getText();
    String check_date = DateType.sf.format(jDateChooser4.getDate());
    String credit_card_type = tf_credit_card_type.getText();
    double credit_card_rate = FitIn.toDouble(lbl_credit_card_rate.getText());
    double credit_card_amount = FitIn.toDouble(tf_ap_cash7.getText());
    String credit_card_no = tf_prepaid_customer_id3.getText();
    String gift_certificate_from = "";
    String gift_certificate_description = "";
    String gift_certificate_no = "";
    double gift_certificate_amount = 0;
    String online_bank = tf_online_bank.getText();
    String online_reference_no = tf_ap_check_no1.getText();
    double online_amount = FitIn.toDouble(tf_ap_cash6.getText());
    String online_holder = tf_ap_check_holder1.getText();
    String online_date = DateType.sf.format(jDateChooser5.getDate());
    int is_uploaded = 0;
    int ref_id = 0;

    String school_year = enroll.academic_year;
    String period = enroll.period;
    String year_level = enroll.year_level;
    String department_id = "" + enroll.department_id;
    String department = enroll.department;
    String college_id = "" + enroll.college_id;
    String college = "" + enroll.college;
    String course_id = "" + enroll.course_id;
    String course = "" + enroll.course_code;

    Collection.to_collections to_collections = new Collection.to_collections(id, collection_no, or_no, payment_type, amount_paid, cash, discount_name, discount_rate, discount_amount, discount_customer_name, discount_customer_id, check_amount, check_bank, check_no, check_holder, check_date, credit_card_type, credit_card_rate, credit_card_amount, credit_card_no, gift_certificate_from, gift_certificate_description, gift_certificate_no, gift_certificate_amount, online_bank, online_reference_no, online_amount, online_holder, online_date, created_at, updated_at, "" + created_by, "" + updated_by, status, is_uploaded, ref_id, school_year, period, year_level, department_id, department, college_id, college, course_id, course, student_id, student_no, student_name);

    String or = Downpayments.pay(downpayment, to_collections);

    c_transaction_no = or;
    c_gross_amount = amount_paid;
    c_cash = cash;
    c_credit_card = credit_card_amount;
    c_gc = gift_certificate_amount;
    c_check = check_amount;
    c_online = online_amount;

    Alert.set(1, "Payment Successful!");
  }

  private void pay_adjustment() {
    int id = 0;
    int sba_id = 0;
    double adjustment_amount = 0;
    List<Finance.fees> fees = tbl_mode_of_payments_ALM;
    if (!fees.isEmpty()) {
      Finance.fees to = (Finance.fees) fees.get(0);
      sba_id = to.id;
      adjustment_amount = to.amount;
    }
    int student_id = pay_stud.id;
    String student_no = pay_stud.student_no;
    String fname = pay_stud.first_name;
    String mi = pay_stud.middle_name;
    String lname = pay_stud.last_name;

    double paid = FitIn.toDouble(tf_field20.getText());
    String remarks = "";
    int status = 0;
    String created_at = DateType.now();
    String updated_at = DateType.now();
    int created_by = FitIn.toInt(MyUser.getUser_id());
    int updated_by = FitIn.toInt(MyUser.getUser_id());

    List<Student_balance_adjustments.to_student_balance_adjustments> sba = Student_balance_adjustments.ret_data(" where id = '" + sba_id + "' ");

    int particular_id = 0;
    String particular = "";
    if (!sba.isEmpty()) {
      Student_balance_adjustments.to_student_balance_adjustments sb = (Student_balance_adjustments.to_student_balance_adjustments) sba.get(0);
      particular_id = sb.particular_id;
      particular = sb.particular;
    }

    // Collection
    String collection_no = "";
    String or_no = tf_field22.getText();
    String payment_type = particular;
    double amount_paid = FitIn.toDouble(tf_field20.getText());
    double cash = FitIn.toDouble(tf_field21.getText());
    String discount_name = "";
    double discount_rate = 0;
    double discount_amount = 0;
    String discount_customer_name = "";
    String discount_customer_id = "";
    double check_amount = FitIn.toDouble(tf_ap_cash5.getText());
    String check_bank = tf_check_bank.getText();
    String check_no = tf_ap_check_no.getText();
    String check_holder = tf_ap_check_holder.getText();
    String check_date = DateType.sf.format(jDateChooser4.getDate());
    String credit_card_type = tf_credit_card_type.getText();
    double credit_card_rate = FitIn.toDouble(lbl_credit_card_rate.getText());
    double credit_card_amount = FitIn.toDouble(tf_ap_cash7.getText());
    String credit_card_no = tf_prepaid_customer_id3.getText();
    String gift_certificate_from = "";
    String gift_certificate_description = "";
    String gift_certificate_no = "";
    double gift_certificate_amount = 0;
    String online_bank = tf_online_bank.getText();
    String online_reference_no = tf_ap_check_no1.getText();
    double online_amount = FitIn.toDouble(tf_ap_cash6.getText());
    String online_holder = tf_ap_check_holder1.getText();
    String online_date = DateType.sf.format(jDateChooser5.getDate());
    int is_uploaded = 0;
    int ref_id = 0;

    String school_year = "2021 - 2022";
    String period = "First Semester";
    String year_level = pay_stud.year_level;
    String department_id = "" + pay_stud.department_id;
    String department = pay_stud.department;
    String college_id = "" + pay_stud.college_id;
    String college = pay_stud.college;
    String course_id = "" + pay_stud.course_id;
    String course = pay_stud.course_code;

    String student_name = pay_stud.first_name + " " + pay_stud.middle_name + " " + pay_stud.last_name;
    Collection.to_collections collection = new Collection.to_collections(id, collection_no, or_no, payment_type, amount_paid, cash, discount_name, discount_rate, discount_amount, discount_customer_name, discount_customer_id, check_amount, check_bank, check_no, check_holder, check_date, credit_card_type, credit_card_rate, credit_card_amount, credit_card_no, gift_certificate_from, gift_certificate_description, gift_certificate_no, gift_certificate_amount, online_bank, online_reference_no, online_amount, online_holder, online_date, created_at, updated_at, "" + created_by, "" + updated_by, status, is_uploaded, ref_id, school_year, period, year_level, department_id, department, college_id, college, course_id, course, "" + student_id, student_no, student_name);

    int collection_id = 0;
    String collection_sales_no = "";

    Student_balance_adjustment_payments.to_student_balance_adjustment_payments payment = new Student_balance_adjustment_payments.to_student_balance_adjustment_payments(id, sba_id, student_id, student_no, fname, mi, lname, adjustment_amount, paid, remarks, status, created_at, created_by, updated_at, updated_by, particular_id, particular, collection_id, collection_no, collection_sales_no);
    String or = Student_balance_adjustments.add_payment(payment, pay_stud, has_or, collection);
    c_transaction_no = or;
    c_gross_amount = amount_paid;
    c_cash = cash;
    c_credit_card = credit_card_amount;
    c_gc = gift_certificate_amount;
    c_check = check_amount;
    c_online = online_amount;
    Alert.set(1, "Payment Successful!");

  }

  private void pay() {
    List<Finance.fees> modes = tbl_mode_of_payments_ALM;
    int id = 0;
    int ea_id = 0;
    int ea_enrollment_id = 0;
    String ea_enrollment_no = "";
    int ea_academic_year_id = 0;
    String ea_academic_year = "";
    int student_id = 0;
    if (!modes.isEmpty()) {
      Finance.fees fee = modes.get(0);
      String where = " where id='" + fee.id + "' ";
      List<Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes> eapm = Enrollment_assessment_payment_modes.ret_data(where);
      if (!eapm.isEmpty()) {
        Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes eap = (Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes) eapm.get(0);
        ea_id = eap.enrollment_assessment_id;
        ea_enrollment_id = eap.enrollment_id;
        ea_enrollment_no = eap.enrollment_no;
        ea_academic_year_id = eap.academic_year_id;
        ea_academic_year = eap.academic_year;
      }
    }

    int enrollment_assessment_id = ea_id;
    int enrollment_id = ea_enrollment_id;
    String enrollment_no = ea_enrollment_no;
    int academic_year_id = ea_academic_year_id;
    String academic_year = ea_academic_year;

    double amount_paid = FitIn.toDouble(tf_field20.getText());
    double cash = FitIn.toDouble(tf_field21.getText());
    String discount_name = "";
    double discount_rate = 0;
    double discount_amount = 0;
    String discount_customer_name = "";
    String discount_customer_id = "";
    String check_bank = tf_check_bank.getText();
    String check_no = tf_ap_check_no.getText();
    double check_amount = FitIn.toDouble(tf_ap_cash5.getText());
    String check_holder = tf_ap_check_holder.getText();
    String check_date = DateType.sf.format(jDateChooser4.getDate());
    String credit_card_type = tf_credit_card_type.getText();
    double credit_card_rate = FitIn.toDouble(lbl_credit_card_rate.getText());
    double credit_card_amount = FitIn.toDouble(tf_ap_cash7.getText());
    String credit_card_no = tf_prepaid_customer_id3.getText();
    String credit_card_holder = tf_prepaid_customer_id4.getText();
    String gift_certificate_from = "";
    String gift_certificate_description = "";
    String gift_certificate_no = "";
    double gift_certificate_amount = 0;
    String online_bank = tf_online_bank.getText();
    String online_reference_no = tf_ap_check_no1.getText();
    double online_amount = FitIn.toDouble(tf_ap_cash6.getText());
    String online_holder = tf_ap_check_holder1.getText();
    String online_date = DateType.sf.format(jDateChooser5.getDate());
    String created_at = DateType.now();
    String updated_at = DateType.now();
    String created_by = MyUser.getUser_id();
    String updated_by = MyUser.getUser_id();
    int status = 0;
    int is_uploaded = 0;
    int collection_id = 0;
    String collection_no = "";
    String collection_sales_no = tf_field22.getText();

    Enrollment_assessment_payments.to_enrollment_assessment_payments eap = new Enrollment_assessment_payments.to_enrollment_assessment_payments(id, enrollment_assessment_id, enrollment_id, enrollment_no, academic_year_id, academic_year, amount_paid, cash, discount_name, discount_rate, discount_amount, discount_customer_name, discount_customer_id, check_bank, check_no, check_amount, check_holder, check_date, credit_card_type, credit_card_rate, credit_card_amount, credit_card_no, credit_card_holder, gift_certificate_from, gift_certificate_description, gift_certificate_no, gift_certificate_amount, online_bank, online_reference_no, online_amount, online_holder, online_date, created_at, updated_at, created_by, updated_by, status, is_uploaded, collection_id, collection_no, collection_sales_no);
//        List<Enrollment_assessment_payment_details.to_enrollment_assessment_payment_details> payments = new ArrayList();
    List<Finance.fees> list = tbl_mode_of_payments_ALM;
    List<Enrollment_assessment_payment_details.to_enrollment_assessment_payment_details> eapd = new ArrayList();
    for (Finance.fees fee : list) {
      if (fee.trans_type == 1) {
        int id1 = 0;
        int enrollment_assessment_payment_id = 0;
        String mode = fee.mode;
        int mode_order = 100;
        String to_pay = DateType.convert_dash_date5(fee.date);
        double amount = fee.amount - fee.paid;
        double discount = 0;
        double paid = fee.new_payment;
        Enrollment_assessment_payment_details.to_enrollment_assessment_payment_details details = new Enrollment_assessment_payment_details.to_enrollment_assessment_payment_details(id, enrollment_assessment_payment_id, enrollment_assessment_id, enrollment_id, enrollment_no, academic_year_id, academic_year, mode, mode_order, to_pay, amount, discount, paid, created_at, updated_at, created_by, updated_by, status, is_uploaded);
        eapd.add(details);
      }
    }

    String or_no = tf_field22.getText();
    String payment_type = "Tuition";
    int ref_id = 0;

    String school_year = "2021 - 2022";
    String period = "First Semester";
    String year_level = pay_stud.year_level;
    String department_id = "" + pay_stud.department_id;
    String department = pay_stud.department;
    String college_id = "" + pay_stud.college_id;
    String college = pay_stud.college;
    String course_id = "" + pay_stud.course_id;
    String course = pay_stud.course_code;
    String student_name = pay_stud.first_name + " " + pay_stud.middle_name + " " + pay_stud.last_name;
    Collection.to_collections to_collections = new Collection.to_collections(id, collection_no, or_no, payment_type, amount_paid, cash, discount_name, discount_rate, discount_amount, discount_customer_name, discount_customer_id, check_amount, check_bank, check_no, check_holder, check_date, credit_card_type, credit_card_rate, credit_card_amount, credit_card_no, gift_certificate_from, gift_certificate_description, gift_certificate_no, gift_certificate_amount, online_bank, online_reference_no, online_amount, online_holder, online_date, created_at, updated_at, created_by, updated_by, status, is_uploaded, ref_id, school_year, period, year_level, department_id, department, college_id, college, course_id, course, "" + pay_stud.id, pay_stud.student_no, student_name);

    String or = Enrollment_assessments.add_data3(eap, eapd, pay_stud, has_or, to_collections);
    c_transaction_no = or;
    c_gross_amount = amount_paid;
    c_cash = cash;
    c_credit_card = credit_card_amount;
    c_gc = gift_certificate_amount;
    c_check = check_amount;
    c_online = online_amount;
    Alert.set(1, "");

  }

  public class Loader1 extends SwingWorker {

    private Loading dialog;

    public Loader1(JDialog dlg) {

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
      pay_adjustment();
      return null;
    }

    @Override
    protected void done() {
      dialog.dispose();
      SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
          set_change();
        }
      });
    }

  }

  public class Loader2 extends SwingWorker {

    private Loading dialog;

    public Loader2(JDialog dlg) {

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
      pay();
      return null;
    }

    @Override
    protected void done() {
      dialog.dispose();
      SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
          set_change();
        }
      });
    }

  }

  public class Loader3 extends SwingWorker {

    private Loading dialog;

    public Loader3(JDialog dlg) {

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
      pay_other_payment();
      return null;
    }

    @Override
    protected void done() {
      dialog.dispose();
      SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
          set_change();
        }
      });
    }

  }

  public class Loader4 extends SwingWorker {

    private Loading dialog;

    public Loader4(JDialog dlg) {

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
      pay_downpayment();
      return null;
    }

    @Override
    protected void done() {
      dialog.dispose();
      SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
          set_change();
        }
      });
    }

  }

  String c_transaction_no = "";
  double c_gross_amount = 0;
  double c_cash = 0;
  double c_credit_card = 0;
  double c_gc = 0;
  double c_check = 0;
  double c_online = 0;

  private void set_change() {

    System.out.println("c_transaction_no: " + c_transaction_no);
    System.out.println("c_gross_amount: " + c_gross_amount);
    System.out.println("c_cash: " + c_cash);
    System.out.println("c_credit_card: " + c_credit_card);
    System.out.println("c_gc: " + c_gc);
    if (c_transaction_no.isEmpty()) {

      Window p = (Window) this;
      Dlg_retry_transaction nd = Dlg_retry_transaction.create(p, true);
      nd.setTitle("");
//      nd.do_pass(services);
      nd.setCallback(new Dlg_retry_transaction.Callback() {

        @Override
        public void ok(CloseDialog closeDialog, Dlg_retry_transaction.OutputData data) {
          closeDialog.ok();
          confirm();
        }
      });
      nd.setLocationRelativeTo(this);
      nd.setVisible(true);
    } else {
      List<Finance.fees> acc = tbl_mode_of_payments_ALM;

      Window p = (Window) Dlg_finance_payment.this;
      Dlg_touchscreen_change nd = Dlg_touchscreen_change.create(p, true);
      nd.setTitle("");

      nd.do_pass(acc, c_transaction_no, c_gross_amount, c_cash, c_credit_card, c_gc, c_check, c_online);
      nd.setCallback(new Dlg_touchscreen_change.Callback() {
        @Override
        public void ok(CloseDialog closeDialog, Dlg_touchscreen_change.OutputData data) {
          closeDialog.ok();

          System.out.println("Transaction Settled");
          System.out.println("Clearing Fields.......");

          c_transaction_no = "";
          c_gross_amount = 0;
          c_cash = 0;
          c_credit_card = 0;
          c_gc = 0;
          c_check = 0;
          c_online = 0;
          enroll = null;
          pay_stud = null;
          Field.Input tf = (Field.Input) tf_customer_name;
          tf.setId("");
          tf.setText("");
          ok1();
        }
      });
      nd.setLocationRelativeTo(null);
      nd.setVisible(true);
    }

  }

  private void ok1() {
    if (callback != null) {
      callback.ok(new CloseDialog(this), new OutputData());
    }
  }

  private void banks() {
    Window p = (Window) this;
    Dlg_banks nd = Dlg_banks.create(p, true);
    nd.setTitle("");
    nd.do_pass();
    nd.setCallback(new Dlg_banks.Callback() {

      @Override
      public void ok(CloseDialog closeDialog, Dlg_banks.OutputData data) {
        closeDialog.ok();

      }
    });
    nd.setLocationRelativeTo(this);
    nd.setVisible(true);
  }

  private void add_particulars() {
    Window p = (Window) this;
    Dlg_account_particulars nd = Dlg_account_particulars.create(p, true);
    nd.setTitle("");
    nd.do_pass();
    nd.setCallback(new Dlg_account_particulars.Callback() {

      @Override
      public void ok(CloseDialog closeDialog, Dlg_account_particulars.OutputData data) {
        closeDialog.ok();
        ret_particulars();
      }
    });
    nd.setLocationRelativeTo(this);
    nd.setVisible(true);
  }
  List<Account_particulars.to_account_particulars> particulars = new ArrayList();

  private void init_particulars() {
    Object[][] obj = new Object[particulars.size()][1];
    int i = 0;
    for (Account_particulars.to_account_particulars to : particulars) {
      obj[i][0] = " " + to.particular;
      i++;
    }
    JLabel[] labels = {};
    int[] tbl_widths_customers = {tf_particular.getWidth()};
    int width = 0;
    String[] col_names = {""};
    TableRenderer tr = new TableRenderer();
    TableRenderer.setPopup(tf_particular, obj, labels, tbl_widths_customers, col_names);
    tr.setCallback(new TableRenderer.Callback() {
      @Override
      public void ok(TableRenderer.OutputData data) {
        Account_particulars.to_account_particulars to = particulars.get(data.selected_row);
        tf_particular.setText("" + to.particular);

      }
    });
  }

  private void ret_particulars() {
    String where = " order by particular asc ";
    particulars = Account_particulars.ret_data(where);
    if (!particulars.isEmpty()) {
      Account_particulars.to_account_particulars to = (Account_particulars.to_account_particulars) particulars.get(0);
      Field.Combo tf = (Field.Combo) tf_particular;
      tf.setId("" + to.id);
      tf.setText(to.particular);

    }
  }

  List<Customers.to_customers> customers = new ArrayList();

  private void init_customers() {
    String name = tf_customer_name.getText();
    if (!name.isEmpty()) {
      List<Customers.to_customers> datas = Customers.ret_data("where name like '%" + name + "%' ");
      customers = datas;

    }
    Object[][] obj = new Object[customers.size()][1];
    int i = 0;
    for (Customers.to_customers to : customers) {
      obj[i][0] = " " + to.name;
      i++;
    }
    JLabel[] labels = {};
    int[] tbl_widths_customers = {tf_customer_name.getWidth()};
    int width = 0;
    String[] col_names = {""};
    TableRenderer tr = new TableRenderer();
    TableRenderer.setPopup(tf_customer_name, obj, labels, tbl_widths_customers, col_names);
    tr.setCallback(new TableRenderer.Callback() {
      @Override
      public void ok(TableRenderer.OutputData data) {
        Customers.to_customers to = customers.get(data.selected_row);
        tf_customer_name.setText("" + to.name);

      }
    });
  }

}
