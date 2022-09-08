/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.finance;

import cis.discount_types.Discount_types;
import cis.discount_types.Dlg_discount_types;
import cis.enrollments.Enrollment_assessment_discounts;
import cis.enrollments.Enrollments;
import cis.users.MyUser;
import cis.utils.Alert;
import cis.utils.DateType;
import cis.utils.Dlg_confirm_action;
import cis.utils.Dlg_confirm_delete;
import cis.utils.TableRenderer;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.panels.Loading;

/**
 *
 * @author USER
 */
public class Dlg_finance_assessment_discount extends javax.swing.JDialog {

  /**
   * Creates new form Dlg_finance_assessment_discount
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
  private Dlg_finance_assessment_discount(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    setUndecorated(true);
    initComponents();
    myInit();
  }

  private Dlg_finance_assessment_discount(java.awt.Dialog parent, boolean modal) {
    super(parent, modal);
    setUndecorated(true);
    initComponents();
    myInit();
  }

  public Dlg_finance_assessment_discount() {
    super();
    setUndecorated(true);
    initComponents();
    myInit();

  }
  private Dlg_finance_assessment_discount myRef;

  private void setThisRef(Dlg_finance_assessment_discount myRef) {
    this.myRef = myRef;
  }
  private static java.util.Map<Object, Dlg_finance_assessment_discount> dialogContainer = new java.util.HashMap();

  public static void clearUpFirst(java.awt.Window parent) {
    if (dialogContainer.containsKey(parent)) {
      dialogContainer.remove(parent);
    }
  }

  public static Dlg_finance_assessment_discount create(java.awt.Window parent, boolean modal) {

    if (modal) {
      return create(parent, ModalityType.APPLICATION_MODAL);
    }

    return create(parent, ModalityType.MODELESS);

  }

  public static Dlg_finance_assessment_discount create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

    if (parent instanceof java.awt.Frame) {

      Dlg_finance_assessment_discount dialog = dialogContainer.get(parent);

      if (dialog == null) {
        dialog = new Dlg_finance_assessment_discount((java.awt.Frame) parent, false);
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
      Dlg_finance_assessment_discount dialog = dialogContainer.get(parent);

      if (dialog == null) {
        dialog = new Dlg_finance_assessment_discount((java.awt.Dialog) parent, false);
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

    Dlg_finance_assessment_discount dialog = Dlg_finance_assessment_discount.create(new javax.swing.JFrame(), true);
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
    jPanel2 = new javax.swing.JPanel();
    jCheckBox1 = new javax.swing.JCheckBox();
    jLabel30 = new javax.swing.JLabel();
    jLabel31 = new javax.swing.JLabel();
    jCheckBox3 = new javax.swing.JCheckBox();
    tf_field14 = new Field.Input();
    tf_field15 = new Field.Combo();
    jCheckBox4 = new javax.swing.JCheckBox();
    tf_field17 = new Field.Input();
    jLabel34 = new javax.swing.JLabel();
    tf_field18 = new Field.Input();
    jLabel35 = new javax.swing.JLabel();
    jCheckBox5 = new javax.swing.JCheckBox();
    jCheckBox6 = new javax.swing.JCheckBox();
    jCheckBox2 = new javax.swing.JCheckBox();
    jButton1 = new javax.swing.JButton();
    jPanel3 = new javax.swing.JPanel();
    tf_field21 = new Field.Input();
    jLabel32 = new javax.swing.JLabel();
    tf_field16 = new Field.Input();
    jLabel33 = new javax.swing.JLabel();
    tf_field19 = new Field.Input();
    jLabel36 = new javax.swing.JLabel();
    tf_field20 = new Field.Input();
    jLabel37 = new javax.swing.JLabel();
    jLabel42 = new javax.swing.JLabel();
    tf_field26 = new Field.Input();
    jPanel4 = new javax.swing.JPanel();
    tf_field22 = new Field.Input();
    jLabel38 = new javax.swing.JLabel();
    tf_field23 = new Field.Input();
    jLabel39 = new javax.swing.JLabel();
    tf_asssessment_no = new Field.Input();
    jLabel40 = new javax.swing.JLabel();
    tf_field25 = new Field.Input();
    jLabel41 = new javax.swing.JLabel();
    jButton12 = new Button.Success();
    jButton13 = new Button.Default();
    jButton14 = new Button.Warning();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204))));

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Choose Discount"));
    jPanel2.setOpaque(false);

    jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox1.setSelected(true);
    jCheckBox1.setText("Is Percent");
    jCheckBox1.setEnabled(false);
    jCheckBox1.setFocusable(false);
    jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox1ActionPerformed(evt);
      }
    });

    jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel30.setText("Discount:");

    jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel31.setText("%");

    jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox3.setText("Misc");
    jCheckBox3.setEnabled(false);
    jCheckBox3.setFocusable(false);
    jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox3ActionPerformed(evt);
      }
    });

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

    tf_field15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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

    jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox4.setText("Total");
    jCheckBox4.setEnabled(false);
    jCheckBox4.setFocusable(false);
    jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox4ActionPerformed(evt);
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

    jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel34.setText("%");

    tf_field18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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

    jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel35.setText("%");

    jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox5.setSelected(true);
    jCheckBox5.setText("Is Percent");
    jCheckBox5.setEnabled(false);
    jCheckBox5.setFocusable(false);
    jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox5ActionPerformed(evt);
      }
    });

    jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox6.setSelected(true);
    jCheckBox6.setText("Is Percent");
    jCheckBox6.setEnabled(false);
    jCheckBox6.setFocusable(false);
    jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox6ActionPerformed(evt);
      }
    });

    jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox2.setSelected(true);
    jCheckBox2.setText("Tuition");
    jCheckBox2.setEnabled(false);
    jCheckBox2.setFocusable(false);
    jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox2ActionPerformed(evt);
      }
    });

    jButton1.setText("jButton1");
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
        .addGap(22, 22, 22)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jCheckBox5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jCheckBox6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(5, 5, 5)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(tf_field18, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
              .addComponent(tf_field17, javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(tf_field14, javax.swing.GroupLayout.Alignment.TRAILING)))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(112, 112, 112)
            .addComponent(tf_field15, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(tf_field15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(tf_field14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)))
            .addGap(2, 2, 2)
            .addComponent(tf_field17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(2, 2, 2)
            .addComponent(tf_field18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jCheckBox2)
            .addGap(1, 1, 1)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jCheckBox3)
              .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(1, 1, 1)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jCheckBox4)
              .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Amount"));
    jPanel3.setOpaque(false);

    tf_field21.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
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

    jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel32.setText("Total Assessment:");

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

    jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel33.setText("Tuition:");

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

    jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel36.setText("Miscellaneous:");

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

    jLabel37.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
    jLabel37.setText("Total Discount:");

    jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel42.setText("Other Fees:");

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

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGap(24, 24, 24)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(11, 11, 11)))
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(tf_field26)
          .addComponent(tf_field16, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
          .addComponent(tf_field19, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
          .addComponent(tf_field20, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
          .addComponent(tf_field21, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE))
        .addGap(47, 47, 47))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())
    );

    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Detail"));
    jPanel4.setOpaque(false);

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

    jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel38.setText("Enrollment No.:");

    tf_field23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_field23.setFocusable(false);
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

    jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel39.setText("Assessment No.:");

    tf_asssessment_no.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_asssessment_no.setFocusable(false);
    tf_asssessment_no.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tf_asssessment_noMouseClicked(evt);
      }
    });
    tf_asssessment_no.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_asssessment_noActionPerformed(evt);
      }
    });

    jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel40.setText("Student No.:");

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

    jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel41.setText("Name:");

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addGap(24, 24, 24)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
          .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
          .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(tf_field23, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_asssessment_no, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field25, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field22, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(47, 47, 47))
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_asssessment_no, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tf_field22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jButton12.setText("Save");
    jButton12.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton12ActionPerformed(evt);
      }
    });

    jButton13.setText("Close");
    jButton13.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton13ActionPerformed(evt);
      }
    });

    jButton14.setText("Delete Discount");
    jButton14.setEnabled(false);
    jButton14.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton14ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addGroup(jPanel1Layout.createSequentialGroup()
              .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(20, 20, 20))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(35, 35, 35)
        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(63, Short.MAX_VALUE))
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

  private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
//    select_discount_to();
  }//GEN-LAST:event_jCheckBox2ActionPerformed

  private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
//    select_discount_to();
  }//GEN-LAST:event_jCheckBox3ActionPerformed

  private void tf_field15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field15MouseClicked
    init_discounts(tf_field15);
  }//GEN-LAST:event_tf_field15MouseClicked

  private void tf_field15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field15ActionPerformed
    init_discounts(tf_field15);
  }//GEN-LAST:event_tf_field15ActionPerformed

  private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
//    select_discount_to();
  }//GEN-LAST:event_jCheckBox4ActionPerformed

  private void tf_field17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field17MouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_field17MouseClicked

  private void tf_field17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field17ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_field17ActionPerformed

  private void tf_field18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field18MouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_field18MouseClicked

  private void tf_field18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field18ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_field18ActionPerformed

  private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
//    select_percent2();
  }//GEN-LAST:event_jCheckBox5ActionPerformed

  private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
//    select_percent3();
  }//GEN-LAST:event_jCheckBox6ActionPerformed

  private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
//    select_percent1();
  }//GEN-LAST:event_jCheckBox1ActionPerformed

  private void tf_field14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field14MouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_field14MouseClicked

  private void tf_field14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field14ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_field14ActionPerformed

  private void tf_field16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field16MouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_field16MouseClicked

  private void tf_field16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field16ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_field16ActionPerformed

  private void tf_field19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field19MouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_field19MouseClicked

  private void tf_field19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field19ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_field19ActionPerformed

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

  private void tf_asssessment_noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_asssessment_noMouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_asssessment_noMouseClicked

  private void tf_asssessment_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_asssessment_noActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_asssessment_noActionPerformed

  private void tf_field25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field25MouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_field25MouseClicked

  private void tf_field25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field25ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_field25ActionPerformed

  private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
    confirm();
  }//GEN-LAST:event_jButton12ActionPerformed

  private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
    disposed();
  }//GEN-LAST:event_jButton13ActionPerformed

  private void tf_field26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field26MouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_field26MouseClicked

  private void tf_field26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field26ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_field26ActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    discount_types();
  }//GEN-LAST:event_jButton1ActionPerformed

  private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
    confirm_delete();
  }//GEN-LAST:event_jButton14ActionPerformed

  /**
   * @param args the command line arguments
   */

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton12;
  private javax.swing.JButton jButton13;
  private javax.swing.JButton jButton14;
  private javax.swing.JCheckBox jCheckBox1;
  private javax.swing.JCheckBox jCheckBox2;
  private javax.swing.JCheckBox jCheckBox3;
  private javax.swing.JCheckBox jCheckBox4;
  private javax.swing.JCheckBox jCheckBox5;
  private javax.swing.JCheckBox jCheckBox6;
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
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JTextField tf_asssessment_no;
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
  private javax.swing.JTextField tf_field25;
  private javax.swing.JTextField tf_field26;
  // End of variables declaration//GEN-END:variables

  private void myInit() {
    init_key();
  }

  Enrollment_assessments.to_enrollment_assessments assessment = null;
  int discount_id = 0;

  public void do_pass(Enrollments.to_enrollments enroll, double assessment_sub_total, double assessment_tuition, double assessment_misc, double assessment_other_fess) {

    assessment = null;
    discount_id = 0;
    List<Enrollment_assessments.to_enrollment_assessments> assessments = Enrollment_assessments.ret_data(" where enrollment_id='" + enroll.id + "' ");
    if (!assessments.isEmpty()) {
      Enrollment_assessments.to_enrollment_assessments to = (Enrollment_assessments.to_enrollment_assessments) assessments.get(0);
      assessment = to;

      tf_field23.setText(to.enrollment_no);
      tf_asssessment_no.setText("" + to.id);
      tf_field25.setText(to.student_no);
      tf_field22.setText(to.lname + ", " + to.fname + " " + to.mi);

      tf_field16.setText(FitIn.fmt_wc_0(assessment_sub_total));
      tf_field19.setText(FitIn.fmt_wc_0(assessment_tuition));
      tf_field20.setText(FitIn.fmt_wc_0(assessment_misc));
      tf_field26.setText(FitIn.fmt_wc_0(assessment_other_fess));

      ret_discount();
    }
    ret_discounts();
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

  private void ret_discount() {
    List<Enrollment_assessment_discounts.to_enrollment_assessment_discounts> discounts = Enrollment_assessment_discounts.ret_data(" where enrollment_id = '" + assessment.enrollment_id + "' and status=1 limit 1");

    if (!discounts.isEmpty()) {
      jButton14.setEnabled(true);

      Enrollment_assessment_discounts.to_enrollment_assessment_discounts discount = (Enrollment_assessment_discounts.to_enrollment_assessment_discounts) discounts.get(0);
      discount_id = discount.id;
      if (discount.is_tution == 1) {
        jCheckBox2.setSelected(true);
        if (discount.is_tuition_percent == 1) {
          jCheckBox1.setSelected(true);
          tf_field14.setText(FitIn.fmt_wc_0((discount.tuition_rate)));
          jLabel31.setVisible(true);
        } else {
          jCheckBox1.setSelected(false);
          tf_field14.setText(FitIn.fmt_wc_0((discount.tuition_amount)));
          jLabel31.setVisible(false);
        }
      }
      if (discount.is_tution == 0) {
        jCheckBox2.setSelected(false);
        tf_field14.setText("");
      }

      if (discount.is_misc == 1) {
        jCheckBox3.setSelected(true);
        if (discount.is_misc_percent == 1) {
          jCheckBox5.setSelected(true);
          tf_field17.setText(FitIn.fmt_wc_0((discount.misc_rate)));
          jLabel34.setVisible(true);
        } else {
          jCheckBox5.setSelected(false);
          tf_field17.setText(FitIn.fmt_wc_0((discount.misc_amount)));
          jLabel34.setVisible(false);
        }
      } else {
        jCheckBox3.setSelected(false);
        tf_field17.setText("");
      }

      if (discount.is_total == 1) {
        jCheckBox4.setSelected(true);
        if (discount.is_total_percent == 1) {
          jCheckBox6.setSelected(true);
          tf_field18.setText(FitIn.fmt_wc_0((discount.total_rate)));
          jLabel35.setVisible(true);
        } else {
          jCheckBox6.setSelected(false);
          tf_field18.setText(FitIn.fmt_wc_0((discount.total_amount)));
          jLabel35.setVisible(false);
        }
      } else {
        jCheckBox6.setSelected(false);
        tf_field18.setText("");
      }
      tf_field16.setText(FitIn.fmt_wc_0(discount.total_assessment));
      tf_field19.setText(FitIn.fmt_wc_0(discount.total_tuition_fee));
      tf_field20.setText(FitIn.fmt_wc_0(discount.total_misc));
      tf_field26.setText(FitIn.fmt_wc_0(discount.total_other_fees));
      tf_field21.setText(FitIn.fmt_wc_0(discount.total_discount));
      tf_field15.setText(discount.discount_name);

      jButton12.setEnabled(false);
    } else {
      jButton14.setEnabled(false);
      tf_field21.setText("");
      jButton12.setEnabled(true);
    }
  }
  List<Discount_types.to_discount_types> discounts = new ArrayList();

  private void ret_discounts() {
    discounts = Discount_types.ret_data(" order by discount_name asc ");

  }

  private void init_discounts(JTextField tf) {
    if (!jButton14.isEnabled()) {
      Object[][] obj = new Object[discounts.size()][1];
      int i = 0;
      for (Discount_types.to_discount_types to : discounts) {
        obj[i][0] = " " + to.discount_name;
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
          Discount_types.to_discount_types to = discounts.get(data.selected_row);
          Field.Combo co = (Field.Combo) tf;
          co.setText("" + to.discount_name);
          co.setId("" + to.id);

          if (to.is_tution == 1) {
            jCheckBox2.setSelected(true);
            if (to.is_tuition_percent == 1) {
              jCheckBox1.setSelected(true);
              tf_field14.setText(FitIn.fmt_wc_0((to.tuition_rate)));
              jLabel31.setVisible(true);
            } else {
              jCheckBox1.setSelected(false);
              tf_field14.setText(FitIn.fmt_wc_0((to.tuition_amount)));
              jLabel31.setVisible(false);
            }
          }
          if (to.is_tution == 0) {
            jCheckBox2.setSelected(false);
            tf_field14.setText("");
          }

          if (to.is_misc == 1) {
            jCheckBox3.setSelected(true);
            if (to.is_misc_percent == 1) {
              jCheckBox5.setSelected(true);
              tf_field17.setText(FitIn.fmt_wc_0((to.misc_rate)));
              jLabel34.setVisible(true);
            } else {
              jCheckBox5.setSelected(false);
              tf_field17.setText(FitIn.fmt_wc_0((to.misc_amount)));
              jLabel34.setVisible(false);
            }
          } else {
            jCheckBox3.setSelected(false);
            tf_field17.setText("");
          }

          if (to.is_total == 1) {
            jCheckBox4.setSelected(true);
            if (to.is_total_percent == 1) {
              jCheckBox6.setSelected(true);
              tf_field18.setText(FitIn.fmt_wc_0((to.total_rate)));
              jLabel35.setVisible(true);
            } else {
              jCheckBox6.setSelected(false);
              tf_field18.setText(FitIn.fmt_wc_0((to.total_amount)));
              jLabel35.setVisible(false);
            }
          } else {
            jCheckBox6.setSelected(false);
            tf_field18.setText("");
          }
          calculate_discount(to);
        }
      });
    }
  }

  private void calculate_discount(Discount_types.to_discount_types to) {
    double assessment = FitIn.toDouble(tf_field16.getText());
    double tuition_fee = FitIn.toDouble(tf_field19.getText());
    double misc = FitIn.toDouble(tf_field20.getText());

    double total_total = 0;
    double total_tuition = 0;
    double total_misc = 0;
    double sum = 0;
    if (to.is_total == 1 && to.is_total_percent == 1) {
      total_total = (assessment * to.total_rate) / 100;
    }
    if (to.is_total == 1 && to.is_total_percent == 0) {
      total_total = to.total_amount;
    }

    if (to.is_tution == 1 && to.is_tuition_percent == 1) {
      total_tuition = (tuition_fee * to.tuition_rate) / 100;
    }
    if (to.is_tution == 1 && to.is_tuition_percent == 0) {
      total_tuition = to.tuition_amount;
    }

    if (to.is_misc == 1 && to.is_misc_percent == 1) {
      total_misc = (tuition_fee * to.misc_rate) / 100;
    }
    if (to.is_misc == 1 && to.is_misc_percent == 0) {
      total_misc = to.misc_amount;
    }
    sum = total_total + total_tuition + total_misc;
    tf_field21.setText(FitIn.fmt_wc_0(sum));
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
        ret_discounts();
      }
    });
    nd.setLocationRelativeTo(this);
    nd.setVisible(true);
  }

  private void confirm() {
    if (tf_field15.getText().isEmpty()) {
      Alert.set(0, "Select a discount!");
      return;
    }
    if (FitIn.toDouble(tf_field21.getText()) == 0) {
      Alert.set(0, "Enter Amount!");
      return;
    }
    Window p = (Window) this;
    Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
    nd.setTitle("");
//    nd.do_pass(services);
    nd.setCallback(new Dlg_confirm_action.Callback() {

      @Override
      public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
        closeDialog.ok();
        call_loader();
      }
    });
    nd.setLocationRelativeTo(this);
    nd.setVisible(true);
  }

  private void call_loader() {
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
      save_transaction();
      return null;
    }

    @Override
    protected void done() {
      dialog.dispose();
      SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
          ok();
        }
      });
    }

  }

  private void save_transaction() {
    int id = 0;
    int enrollment_assessment_id = assessment.id;
    String enrollment_assessment_no = "" + assessment.id;
    int enrollment_id = assessment.enrollment_id;
    String enrollment_no = assessment.enrollment_no;
    int academic_year_id = assessment.academic_year_id;
    String academic_year = assessment.academic_year;
    String discount_name = tf_field15.getText();

    int is_tution = 0;
    int is_tuition_percent = 0;
    double tuition_rate = 0;
    double tuition_amount = 0;
    if (jCheckBox2.isSelected()) {
      is_tution = 1;
      if (jCheckBox1.isSelected()) {
        is_tuition_percent = 1;
        tuition_rate = FitIn.toDouble(tf_field14.getText());
      }
      if (!jCheckBox1.isSelected()) {
        tuition_amount = FitIn.toDouble(tf_field14.getText());
      }
    }

    int is_misc = 0;
    int is_misc_percent = 0;
    double misc_rate = 0;
    double misc_amount = 0;

    if (jCheckBox3.isSelected()) {
      is_misc = 1;
      if (jCheckBox5.isSelected()) {
        is_misc_percent = 1;
        misc_rate = FitIn.toDouble(tf_field17.getText());
      }
      if (!jCheckBox5.isSelected()) {
        misc_amount = FitIn.toDouble(tf_field17.getText());
      }
    }

    int is_total = 0;
    int is_total_percent = 0;
    double total_rate = 0;
    double total_amount = 0;

    if (jCheckBox4.isSelected()) {
      is_total = 1;
      if (jCheckBox6.isSelected()) {
        is_total_percent = 1;
        total_rate = FitIn.toDouble(tf_field18.getText());
      }
      if (!jCheckBox6.isSelected()) {
        total_amount = FitIn.toDouble(tf_field18.getText());
      }
    }

    double total_tuition_fee = FitIn.toDouble(tf_field19.getText());
    double total_misc = FitIn.toDouble(tf_field20.getText());
    double total_assessment = FitIn.toDouble(tf_field16.getText());
    double total_discount = FitIn.toDouble(tf_field21.getText());
    double total_other_fees = FitIn.toDouble(tf_field26.getText());

    int student_id = assessment.student_id;
    String student_no = assessment.student_no;
    String student_name = assessment.lname + ", " + assessment.fname + " " + assessment.mi;

    String created_at = DateType.now();
    String updated_at = DateType.now();
    String created_by = MyUser.getUser_id();
    String updated_by = MyUser.getUser_id();
    int status = 1;
    Enrollment_assessment_discounts.to_enrollment_assessment_discounts discount = new Enrollment_assessment_discounts.to_enrollment_assessment_discounts(id, enrollment_assessment_id, enrollment_assessment_no, enrollment_id, enrollment_no, academic_year_id, academic_year, discount_name, is_tution, is_tuition_percent, tuition_rate, tuition_amount, is_misc, is_misc_percent, misc_rate, misc_amount, is_total, is_total_percent, total_rate, total_amount, total_tuition_fee, total_misc, total_assessment, total_discount, total_other_fees, student_id, student_no, student_name, created_at, updated_at, created_by, updated_by, status);
    Enrollment_assessment_discounts.add_data(discount);
    Alert.set(1, updated_by);
  }

  private void ok() {
    if (callback != null) {
      callback.ok(new CloseDialog(this), new OutputData());
    }
  }

  private void confirm_delete() {
    Window p = (Window) this;
    Dlg_confirm_delete nd = Dlg_confirm_delete.create(p, true);
    nd.setTitle("");
//    nd.do_pass(services);
    nd.setCallback(new Dlg_confirm_delete.Callback() {

      @Override
      public void ok(CloseDialog closeDialog, Dlg_confirm_delete.OutputData data) {
        closeDialog.ok();
        delete();
      }
    });
    nd.setLocationRelativeTo(this);
    nd.setVisible(true);
  }

  private void delete() {
    if (discount_id != 0) {
      Enrollment_assessment_discounts.delete_data2(discount_id, assessment.student_id, FitIn.toDouble(tf_field21.getText()));
      ret_discount();
      Alert.set(3, "");
      tf_field15.setText("");
    }
  }
}
