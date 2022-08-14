/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.discount_types;

import cis.credit_cards.*;
import cis.finance.*;
import cis.finance.Miscellaneous_fees.to_miscellaneous_fees;
import cis.users.MyUser;
import cis.utils.Alert;
import cis.utils.DateType;
import cis.utils.Dlg_confirm_action;
import cis.utils.Dlg_confirm_delete;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.util.ImageRenderer;

/**
 *
 * @author Ronescape
 */
public class Dlg_discount_types extends javax.swing.JDialog {

  /**
   * Creates new form Dlg_miscellaneous_fees
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
  private Dlg_discount_types(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    setUndecorated(true);
    initComponents();
    myInit();
  }

  private Dlg_discount_types(java.awt.Dialog parent, boolean modal) {
    super(parent, modal);
    setUndecorated(true);
    initComponents();
    myInit();
  }

  public Dlg_discount_types() {
    super();
    setUndecorated(true);
    initComponents();
    myInit();

  }
  private Dlg_discount_types myRef;

  private void setThisRef(Dlg_discount_types myRef) {
    this.myRef = myRef;
  }
  private static java.util.Map<Object, Dlg_discount_types> dialogContainer = new java.util.HashMap();

  public static void clearUpFirst(java.awt.Window parent) {
    if (dialogContainer.containsKey(parent)) {
      dialogContainer.remove(parent);
    }
  }

  public static Dlg_discount_types create(java.awt.Window parent, boolean modal) {

    if (modal) {
      return create(parent, ModalityType.APPLICATION_MODAL);
    }

    return create(parent, ModalityType.MODELESS);

  }

  public static Dlg_discount_types create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

    if (parent instanceof java.awt.Frame) {

      Dlg_discount_types dialog = dialogContainer.get(parent);

      if (dialog == null) {
        dialog = new Dlg_discount_types((java.awt.Frame) parent, false);
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
      Dlg_discount_types dialog = dialogContainer.get(parent);

      if (dialog == null) {
        dialog = new Dlg_discount_types((java.awt.Dialog) parent, false);
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

    Dlg_discount_types dialog = Dlg_discount_types.create(new javax.swing.JFrame(), true);
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
    tf_field14 = new Field.Input();
    jLabel30 = new javax.swing.JLabel();
    tf_field15 = new Field.Input();
    jScrollPane1 = new javax.swing.JScrollPane();
    tbl_miscellaneous_fees = new javax.swing.JTable();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jButton15 = new Button.Success();
    jButton14 = new Button.Default();
    jCheckBox1 = new javax.swing.JCheckBox();
    jLabel31 = new javax.swing.JLabel();
    jCheckBox2 = new javax.swing.JCheckBox();
    jCheckBox3 = new javax.swing.JCheckBox();
    jCheckBox4 = new javax.swing.JCheckBox();
    tf_field17 = new Field.Input();
    jLabel34 = new javax.swing.JLabel();
    tf_field18 = new Field.Input();
    jLabel35 = new javax.swing.JLabel();
    jCheckBox5 = new javax.swing.JCheckBox();
    jCheckBox6 = new javax.swing.JCheckBox();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

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

    jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel30.setText("Name:");

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

    jLabel1.setText("No. of rows:");

    jLabel2.setText("0");

    jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cis/icons2/icon.png"))); // NOI18N
    jButton15.setToolTipText("Save");
    jButton15.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton15ActionPerformed(evt);
      }
    });

    jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cis/icons2/new-file.png"))); // NOI18N
    jButton14.setToolTipText("New");
    jButton14.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton14ActionPerformed(evt);
      }
    });

    jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox1.setSelected(true);
    jCheckBox1.setText("Is Percent");
    jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox1ActionPerformed(evt);
      }
    });

    jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel31.setText("%");

    jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox2.setSelected(true);
    jCheckBox2.setText("Tuition");
    jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox2ActionPerformed(evt);
      }
    });

    jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox3.setText("Misc");
    jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox3ActionPerformed(evt);
      }
    });

    jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox4.setText("Total");
    jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox4ActionPerformed(evt);
      }
    });

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

    jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel34.setText("%");

    tf_field18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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
    jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox5ActionPerformed(evt);
      }
    });

    jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox6.setSelected(true);
    jCheckBox6.setText("Is Percent");
    jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox6ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(25, 25, 25)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
              .addComponent(jLabel1)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
              .addGap(112, 112, 112)
              .addComponent(tf_field15))
            .addGroup(jPanel1Layout.createSequentialGroup()
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jCheckBox5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(1, 1, 1)
                  .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGap(5, 5, 5)
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                  .addComponent(tf_field18)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                  .addComponent(tf_field17)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                  .addComponent(tf_field14)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        .addGap(25, 25, 25))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(35, 35, 35)
            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(tf_field15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(tf_field14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)))
            .addGap(1, 1, 1)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(tf_field17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(1, 1, 1)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(tf_field18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jCheckBox2)
            .addGap(1, 1, 1)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jCheckBox3)
              .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(1, 1, 1)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jCheckBox4)
              .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(jLabel2))
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

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
      save_record();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void tbl_miscellaneous_feesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_miscellaneous_feesMouseClicked
      select_record();
    }//GEN-LAST:event_tbl_miscellaneous_feesMouseClicked

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
      clear_record();
    }//GEN-LAST:event_jButton14ActionPerformed

  private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
    select_discount_to();
  }//GEN-LAST:event_jCheckBox4ActionPerformed

  private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
    select_discount_to();
  }//GEN-LAST:event_jCheckBox3ActionPerformed

  private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
    select_discount_to();
  }//GEN-LAST:event_jCheckBox2ActionPerformed

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

  private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
    select_percent1();
  }//GEN-LAST:event_jCheckBox1ActionPerformed

  private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
    select_percent2();
  }//GEN-LAST:event_jCheckBox5ActionPerformed

  private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
    select_percent3();
  }//GEN-LAST:event_jCheckBox6ActionPerformed

  /**
   * @param args the command line arguments
   */

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton14;
  private javax.swing.JButton jButton15;
  private javax.swing.JCheckBox jCheckBox1;
  private javax.swing.JCheckBox jCheckBox2;
  private javax.swing.JCheckBox jCheckBox3;
  private javax.swing.JCheckBox jCheckBox4;
  private javax.swing.JCheckBox jCheckBox5;
  private javax.swing.JCheckBox jCheckBox6;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel30;
  private javax.swing.JLabel jLabel31;
  private javax.swing.JLabel jLabel34;
  private javax.swing.JLabel jLabel35;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tbl_miscellaneous_fees;
  private javax.swing.JTextField tf_field14;
  private javax.swing.JTextField tf_field15;
  private javax.swing.JTextField tf_field17;
  private javax.swing.JTextField tf_field18;
  // End of variables declaration//GEN-END:variables

  private void myInit() {
    init_key();
//    System.setProperty("pool_db", "db_cis_cosca");
//    System.setProperty("pool_password", "password");

    init_tbl_miscellaneous_fees(tbl_miscellaneous_fees);
    ret_data();
//        jLabel30.setVisible(false);
//        tf_field15.setVisible(false);
  }

  public void do_pass() {

  }

  // <editor-fold defaultstate="collapsed" desc="Key">
  private void disposed() {
    ok();
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

  private void ok() {
    if (callback != null) {
      callback.ok(new CloseDialog(this), new OutputData());
    }
  }
  // </editor-fold>

  //<editor-fold defaultstate="collapsed" desc=" discount rates "> 
  public static ArrayListModel tbl_miscellaneous_fees_ALM;
  public static Tblmiscellaneous_feesModel tbl_miscellaneous_fees_M;

  public static void init_tbl_miscellaneous_fees(JTable tbl_miscellaneous_fees) {
    tbl_miscellaneous_fees_ALM = new ArrayListModel();
    tbl_miscellaneous_fees_M = new Tblmiscellaneous_feesModel(tbl_miscellaneous_fees_ALM);
    tbl_miscellaneous_fees.setModel(tbl_miscellaneous_fees_M);
    tbl_miscellaneous_fees.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    tbl_miscellaneous_fees.setRowHeight(25);
    int[] tbl_widths_miscellaneous_fees = {100, 80, 80, 80, 30, 30, 0, 0, 0};
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
    TableWidthUtilities.setColumnRightRenderer(tbl_miscellaneous_fees, 2);
    TableWidthUtilities.setColumnRightRenderer(tbl_miscellaneous_fees, 3);
    tbl_miscellaneous_fees.getColumnModel().getColumn(4).setCellRenderer(new ImageRenderer());
    tbl_miscellaneous_fees.getColumnModel().getColumn(5).setCellRenderer(new ImageRenderer());
  }

  public static void loadData_miscellaneous_fees(List<Discount_types.to_discount_types> acc) {
    tbl_miscellaneous_fees_ALM.clear();
    tbl_miscellaneous_fees_ALM.addAll(acc);
  }

  public static class Tblmiscellaneous_feesModel extends AbstractTableAdapter {

    public static String[] COLUMNS = {
      "Discount", "Tuition", "Misc", "Total", "", "", "updated_by", "status", "is_uploaded"
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
      Discount_types.to_discount_types tt = (Discount_types.to_discount_types) getRow(row);
      switch (col) {
        case 0:
          return " " + tt.discount_name;
        case 1:
          if (tt.is_tuition_percent == 1) {
            return " " + FitIn.fmt_wc_0(tt.tuition_rate) + " % ";
          } else {
            return " " + FitIn.fmt_wc_0(tt.tuition_amount) + " ";
          }

        case 2:
          if (tt.is_misc_percent == 1) {
            return " " + FitIn.fmt_wc_0(tt.misc_rate) + " % ";
          } else {
            return " " + FitIn.fmt_wc_0(tt.misc_amount) + " ";
          }
        case 3:
          if (tt.is_total_percent == 1) {
            return " " + FitIn.fmt_wc_0(tt.total_rate) + " % ";
          } else {
            return " " + FitIn.fmt_wc_0(tt.total_amount) + " ";
          }
        case 4:
          return "/cis/icons/new-file.png";
        case 5:
          return "/cis/icons/remove11.png";
        case 6:
          return "/cis/icons/new-file.png";
        case 7:
          return "/cis/icons/remove11.png";
        default:
          return tt.discount_name;
      }
    }
  }

  private void ret_data() {
    String where = " order by discount_name asc";
    List<Discount_types.to_discount_types> datas = Discount_types.ret_data(where);
    loadData_miscellaneous_fees(datas);
    jLabel2.setText("" + datas.size());
  }
//</editor-fold> 

  private void select_discount_to() {
    if (jCheckBox4.isSelected()) {
      jCheckBox2.setSelected(false);
      jCheckBox3.setSelected(false);
    } else {

    }
  }

  private void select_percent1() {
    if (jCheckBox1.isSelected()) {
      jLabel31.setVisible(true);
    } else {
      jLabel31.setVisible(false);
    }
  }

  private void select_percent2() {
    if (jCheckBox5.isSelected()) {
      jLabel34.setVisible(true);
    } else {
      jLabel34.setVisible(false);
    }
  }

  private void select_percent3() {
    if (jCheckBox6.isSelected()) {
      jLabel35.setVisible(true);
    } else {
      jLabel35.setVisible(false);
    }
  }

  private void save_record() {
    int row = tbl_miscellaneous_fees.getSelectedRow();
    if (row < 0) {
      int id = 0;
      String discount_name = tf_field15.getText();
      if (discount_name.isEmpty()) {
        Alert.set(0, "Input Name!");
        return;
      }
      double tuition_rate = 0;
      double tuition_amount = 0;
      int is_tution = 0;
      int is_tuition_percent = 0;
      if (jCheckBox2.isSelected()) {
        is_tution = 1;
        if (jCheckBox1.isSelected()) {
          is_tuition_percent = 1;
          tuition_rate = FitIn.toDouble(tf_field14.getText());
          if (tuition_rate == 0) {
            Alert.set(0, "Input Rate");
            tf_field14.grabFocus();
            return;
          }
        } else {
          tuition_amount = FitIn.toDouble(tf_field14.getText());
          if (tuition_amount == 0) {
            Alert.set(0, "Input Amount");
            tf_field14.grabFocus();
            return;
          }
        }
      }

      double misc_rate = 0;
      double misc_amount = 0;
      int is_misc = 0;
      int is_misc_percent = 0;

      if (jCheckBox3.isSelected()) {
        is_misc = 1;

        if (jCheckBox5.isSelected()) {
          is_misc_percent = 1;
          misc_rate = FitIn.toDouble(tf_field17.getText());
          if (misc_rate == 0) {
            Alert.set(0, "Input Rate");
            tf_field17.grabFocus();
            return;
          }
        } else {
          misc_amount = FitIn.toDouble(tf_field17.getText());
          if (misc_amount == 0) {
            Alert.set(0, "Input Amount");
            tf_field17.grabFocus();
            return;
          }
        }
      }

      double total_rate = 0;
      double total_amount = 0;
      int is_total = 0;
      int is_total_percent = 0;
      if (jCheckBox4.isSelected()) {
        is_total = 1;

        if (jCheckBox6.isSelected()) {
          is_total_percent = 1;
          total_rate = FitIn.toDouble(tf_field18.getText());
          if (total_rate == 0) {
            Alert.set(0, "Input Rate");
            tf_field18.grabFocus();
            return;
          }
        } else {
          total_amount = FitIn.toDouble(tf_field18.getText());
          if (total_amount == 0) {
            Alert.set(0, "Input Amount");
            tf_field18.grabFocus();
            return;
          }
        }
      }

      String created_at = DateType.now();
      int created_by = FitIn.toInt(MyUser.getUser_id());

      Discount_types.to_discount_types discount = new Discount_types.to_discount_types(id, discount_name, is_tution, is_tuition_percent, tuition_rate, tuition_amount, is_misc, is_misc_percent, misc_rate, misc_amount, is_total, is_total_percent, total_rate, total_amount, created_at, created_by);

      Window p = (Window) this;
      Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
      nd.setTitle("");
      nd.setCallback(new Dlg_confirm_action.Callback() {
        @Override
        public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
          closeDialog.ok();
          Discount_types.add_data(discount);
          Alert.set(1, "");
          ret_data();
          tf_field14.setText("");
          tf_field15.setText("");
          tf_field14.grabFocus();
        }
      });
      nd.setLocationRelativeTo(this);
      nd.setVisible(true);

    } else {
      Discount_types.to_discount_types to = (Discount_types.to_discount_types) tbl_miscellaneous_fees_ALM.get(row);
      int id = to.id;
      String discount_name = tf_field15.getText();
      if (discount_name.isEmpty()) {
        Alert.set(0, "Input Name!");
        return;
      }
      double tuition_rate = 0;
      double tuition_amount = 0;
      int is_tution = 0;
      int is_tuition_percent = 0;
      if (jCheckBox2.isSelected()) {
        is_tution = 1;
        if (jCheckBox1.isSelected()) {
          is_tuition_percent = 1;
          tuition_rate = FitIn.toDouble(tf_field14.getText());
          if (tuition_rate == 0) {
            Alert.set(0, "Input Rate");
            tf_field14.grabFocus();
            return;
          }
        } else {
          tuition_amount = FitIn.toDouble(tf_field14.getText());
          if (tuition_amount == 0) {
            Alert.set(0, "Input Amount");
            tf_field14.grabFocus();
            return;
          }
        }
      }

      double misc_rate = 0;
      double misc_amount = 0;
      int is_misc = 0;
      int is_misc_percent = 0;

      if (jCheckBox3.isSelected()) {
        is_misc = 1;

        if (jCheckBox5.isSelected()) {
          is_misc_percent = 1;
          misc_rate = FitIn.toDouble(tf_field17.getText());
          if (misc_rate == 0) {
            Alert.set(0, "Input Rate");
            tf_field17.grabFocus();
            return;
          }
        } else {
          misc_amount = FitIn.toDouble(tf_field17.getText());
          if (misc_amount == 0) {
            Alert.set(0, "Input Amount");
            tf_field17.grabFocus();
            return;
          }
        }
      }

      double total_rate = 0;
      double total_amount = 0;
      int is_total = 0;
      int is_total_percent = 0;
      if (jCheckBox4.isSelected()) {
        is_total = 1;

        if (jCheckBox6.isSelected()) {
          is_total_percent = 1;
          total_rate = FitIn.toDouble(tf_field18.getText());
          if (total_rate == 0) {
            Alert.set(0, "Input Rate");
            tf_field18.grabFocus();
            return;
          }
        } else {
          total_amount = FitIn.toDouble(tf_field18.getText());
          if (total_amount == 0) {
            Alert.set(0, "Input Amount");
            tf_field18.grabFocus();
            return;
          }
        }
      }

      String created_at = to.created_at;
      int created_by = to.created_by;

      Discount_types.to_discount_types discount = new Discount_types.to_discount_types(id, discount_name, is_tution, is_tuition_percent, tuition_rate, tuition_amount, is_misc, is_misc_percent, misc_rate, misc_amount, is_total, is_total_percent, total_rate, total_amount, created_at, created_by);

      Window p = (Window) this;
      Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
      nd.setTitle("");
      nd.setCallback(new Dlg_confirm_action.Callback() {
        @Override
        public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
          closeDialog.ok();
          Discount_types.update_data(discount);
          Alert.set(2, "");
          ret_data();
          clear_record();
        }
      });
      nd.setLocationRelativeTo(this);
      nd.setVisible(true);
    }

  }

  private void clear_record() {
    tf_field15.setText("");
    tf_field14.setText("");
    tf_field17.setText("");
    tf_field18.setText("");

    jCheckBox1.setSelected(true);
    jCheckBox5.setSelected(true);
    jCheckBox6.setSelected(true);

    jCheckBox2.setSelected(true);
    jCheckBox3.setSelected(false);
    jCheckBox4.setSelected(false);

    tf_field15.grabFocus();
    tbl_miscellaneous_fees.clearSelection();
  }

  private void select_record() {
    int row = tbl_miscellaneous_fees.getSelectedRow();
    if (row < 0) {
      return;
    }
    int col = tbl_miscellaneous_fees.getSelectedColumn();
    Discount_types.to_discount_types to = (Discount_types.to_discount_types) tbl_miscellaneous_fees_ALM.get(row);
    if (col == 4) {

      if (to.is_tuition_percent == 1) {
        jCheckBox1.setSelected(true);
        tf_field14.setText(FitIn.fmt_wc_0(to.tuition_rate));
      } else {
        jCheckBox1.setSelected(false);
        tf_field14.setText(FitIn.fmt_wc_0(to.tuition_amount));
      }
      if (to.is_tution == 1) {
        jCheckBox2.setSelected(true);
      } else {
        jCheckBox2.setSelected(false);
      }

      if (to.is_misc_percent == 1) {
        jCheckBox5.setSelected(true);
        tf_field17.setText(FitIn.fmt_wc_0(to.misc_rate));
      } else {
        jCheckBox5.setSelected(false);
        tf_field17.setText(FitIn.fmt_wc_0(to.misc_amount));
      }
      if (to.is_misc == 1) {
        jCheckBox3.setSelected(true);
      } else {
        jCheckBox3.setSelected(false);
      }

      if (to.is_total_percent == 1) {
        jCheckBox6.setSelected(true);
        tf_field18.setText(FitIn.fmt_wc_0(to.total_rate));
      } else {
        jCheckBox6.setSelected(false);
        tf_field18.setText(FitIn.fmt_wc_0(to.total_amount));
      }
      if (to.is_total == 1) {
        jCheckBox4.setSelected(true);
      } else {
        jCheckBox4.setSelected(false);
      }

    }
    if (col == 5) {
      Window p = (Window) this;
      Dlg_confirm_delete nd = Dlg_confirm_delete.create(p, true);
      nd.setTitle("");
      nd.setCallback(new Dlg_confirm_delete.Callback() {
        @Override
        public void ok(CloseDialog closeDialog, Dlg_confirm_delete.OutputData data) {
          closeDialog.ok();
          Discount_types.delete_data(to);
          Alert.set(3, "");
          ret_data();
          clear_record();
        }
      });
      nd.setLocationRelativeTo(this);
      nd.setVisible(true);
    }
  }
}
