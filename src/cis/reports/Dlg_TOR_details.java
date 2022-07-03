/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.reports;

import cis.utils.DateType;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.logging.Level;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import synsoftech.fields.Button;
import synsoftech.fields.Field;

/**
 *
 * @author USER
 */
public class Dlg_TOR_details extends javax.swing.JDialog {

  /**
   * Creates new form Dlg_TOR_details
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

    public final String medium;
    public final String entrance_data;
    public final String major;
    public final String date_of_graduation;
    public final String junior_high;
    public final String junior_high_date;
    public final String senior_high;
    public final String senior_high_date;
    public final String or_no;
    public final String prepared_by;
    public final String registrar;

    public OutputData(String medium, String entrance_data, String major, String date_of_graduation, String junior_high, String junior_high_date, String senior_high, String senior_high_date, String or_no, String prepared_by, String registrar) {
      this.medium = medium;
      this.entrance_data = entrance_data;
      this.major = major;
      this.date_of_graduation = date_of_graduation;
      this.junior_high = junior_high;
      this.junior_high_date = junior_high_date;
      this.senior_high = senior_high;
      this.senior_high_date = senior_high_date;
      this.or_no = or_no;
      this.prepared_by = prepared_by;
      this.registrar = registrar;
    }

  }
//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc=" Constructors ">
  private Dlg_TOR_details(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    setUndecorated(true);
    initComponents();
    myInit();
  }

  private Dlg_TOR_details(java.awt.Dialog parent, boolean modal) {
    super(parent, modal);
    setUndecorated(true);
    initComponents();
    myInit();
  }

  public Dlg_TOR_details() {
    super();
    setUndecorated(true);
    initComponents();
    myInit();

  }
  private Dlg_TOR_details myRef;

  private void setThisRef(Dlg_TOR_details myRef) {
    this.myRef = myRef;
  }
  private static java.util.Map<Object, Dlg_TOR_details> dialogContainer = new java.util.HashMap();

  public static void clearUpFirst(java.awt.Window parent) {
    if (dialogContainer.containsKey(parent)) {
      dialogContainer.remove(parent);
    }
  }

  public static Dlg_TOR_details create(java.awt.Window parent, boolean modal) {

    if (modal) {
      return create(parent, ModalityType.APPLICATION_MODAL);
    }

    return create(parent, ModalityType.MODELESS);

  }

  public static Dlg_TOR_details create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

    if (parent instanceof java.awt.Frame) {

      Dlg_TOR_details dialog = dialogContainer.get(parent);

      if (dialog == null) {
        dialog = new Dlg_TOR_details((java.awt.Frame) parent, false);
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
      Dlg_TOR_details dialog = dialogContainer.get(parent);

      if (dialog == null) {
        dialog = new Dlg_TOR_details((java.awt.Dialog) parent, false);
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

    Dlg_TOR_details dialog = Dlg_TOR_details.create(new javax.swing.JFrame(), true);
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
    jLabel12 = new javax.swing.JLabel();
    tf_medium = new Field.Input();
    jLabel13 = new javax.swing.JLabel();
    tf_entrance = new Field.Input();
    jLabel14 = new javax.swing.JLabel();
    tf_major = new Field.Input();
    jLabel15 = new javax.swing.JLabel();
    jCheckBox13 = new javax.swing.JCheckBox();
    jLabel16 = new javax.swing.JLabel();
    tf_junior = new Field.Input();
    jCheckBox14 = new javax.swing.JCheckBox();
    jLabel17 = new javax.swing.JLabel();
    jLabel18 = new javax.swing.JLabel();
    tf_senior = new Field.Input();
    jCheckBox15 = new javax.swing.JCheckBox();
    jLabel19 = new javax.swing.JLabel();
    jLabel20 = new javax.swing.JLabel();
    tf_prepared_by = new Field.Input();
    tf_field11 = new Field.Input();
    jLabel21 = new javax.swing.JLabel();
    jLabel22 = new javax.swing.JLabel();
    tf_or_no = new Field.Input();
    jButton5 = new Button.Primary();
    jButton6 = new Button.Default();
    jd_graduated = new com.toedter.calendar.JDateChooser();
    jd_junior_graduated = new com.toedter.calendar.JDateChooser();
    jd_senior_graduated = new com.toedter.calendar.JDateChooser();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

    jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel12.setText("Medium of Instruction:");

    tf_medium.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_medium.setText("English CHED School COde: 0729 PRC School Code: 1038");
    tf_medium.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_mediumActionPerformed(evt);
      }
    });

    jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel13.setText("Entrance Data:");

    tf_entrance.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_entrance.setText("Form 137-A");
    tf_entrance.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_entranceActionPerformed(evt);
      }
    });

    jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel14.setText("Major:");

    tf_major.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_major.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_majorActionPerformed(evt);
      }
    });

    jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel15.setText("Date of Graduation:");

    jCheckBox13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox13.setFocusable(false);

    jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel16.setText("Junior High School:");

    tf_junior.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_junior.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_juniorActionPerformed(evt);
      }
    });

    jCheckBox14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox14.setFocusable(false);

    jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel17.setText("Date Graduated:");

    jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel18.setText("Senior High School:");

    tf_senior.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_senior.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_seniorActionPerformed(evt);
      }
    });

    jCheckBox15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox15.setFocusable(false);

    jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel19.setText("Date Graduated:");

    jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel20.setText("Prepared by:");

    tf_prepared_by.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_prepared_by.setText("JUMILAN E. VILLAVECENCIO");
    tf_prepared_by.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_prepared_byActionPerformed(evt);
      }
    });

    tf_field11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_field11.setText("RIZA S. IJAN, MBA");
    tf_field11.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_field11ActionPerformed(evt);
      }
    });

    jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel21.setText("Registrar:");

    jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel22.setText("OR No. / Date:");

    tf_or_no.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    tf_or_no.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_or_noActionPerformed(evt);
      }
    });

    jButton5.setText("Generate");
    jButton5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton5ActionPerformed(evt);
      }
    });

    jButton6.setText("Cancel");
    jButton6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton6ActionPerformed(evt);
      }
    });

    jd_graduated.setDate(new Date());
    jd_graduated.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jd_junior_graduated.setDate(new Date());
    jd_junior_graduated.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jd_senior_graduated.setDate(new Date());
    jd_senior_graduated.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(40, 40, 40)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(tf_major)
                  .addComponent(tf_medium, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                  .addComponent(tf_entrance, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(29, 29, 29))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jCheckBox13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jd_graduated, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jCheckBox15)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jd_senior_graduated, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jCheckBox14)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jd_junior_graduated, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_or_no))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_prepared_by))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_senior))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_junior))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_field11)))
            .addGap(29, 29, 29))))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(60, 60, 60)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(tf_medium, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(tf_entrance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(tf_major, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBox13))
          .addComponent(jd_graduated, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(tf_junior, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBox14))
          .addComponent(jd_junior_graduated, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(tf_senior, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBox15))
          .addComponent(jd_senior_graduated, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(tf_or_no, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(tf_prepared_by, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(tf_field11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(47, 47, 47))
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

  private void tf_mediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_mediumActionPerformed

  }//GEN-LAST:event_tf_mediumActionPerformed

  private void tf_entranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_entranceActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_entranceActionPerformed

  private void tf_majorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_majorActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_majorActionPerformed

  private void tf_juniorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_juniorActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_juniorActionPerformed

  private void tf_seniorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_seniorActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_seniorActionPerformed

  private void tf_prepared_byActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_prepared_byActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_prepared_byActionPerformed

  private void tf_field11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field11ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_field11ActionPerformed

  private void tf_or_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_or_noActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tf_or_noActionPerformed

  private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     ok();
  }//GEN-LAST:event_jButton5ActionPerformed

  private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    disposed();
  }//GEN-LAST:event_jButton6ActionPerformed

  /**
   * @param args the command line arguments
   */

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton5;
  private javax.swing.JButton jButton6;
  private javax.swing.JCheckBox jCheckBox13;
  private javax.swing.JCheckBox jCheckBox14;
  private javax.swing.JCheckBox jCheckBox15;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel15;
  private javax.swing.JLabel jLabel16;
  private javax.swing.JLabel jLabel17;
  private javax.swing.JLabel jLabel18;
  private javax.swing.JLabel jLabel19;
  private javax.swing.JLabel jLabel20;
  private javax.swing.JLabel jLabel21;
  private javax.swing.JLabel jLabel22;
  private javax.swing.JPanel jPanel1;
  private com.toedter.calendar.JDateChooser jd_graduated;
  private com.toedter.calendar.JDateChooser jd_junior_graduated;
  private com.toedter.calendar.JDateChooser jd_senior_graduated;
  private javax.swing.JTextField tf_entrance;
  private javax.swing.JTextField tf_field11;
  private javax.swing.JTextField tf_junior;
  private javax.swing.JTextField tf_major;
  private javax.swing.JTextField tf_medium;
  private javax.swing.JTextField tf_or_no;
  private javax.swing.JTextField tf_prepared_by;
  private javax.swing.JTextField tf_senior;
  // End of variables declaration//GEN-END:variables

  private void myInit() {
    init_key();
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

  private void ok() {
    String medium = tf_medium.getText();
    String entrance_data = tf_entrance.getText();
    String major = tf_major.getText();
    String date_of_graduation = "xxx";
    if (jCheckBox13.isSelected()) {
      date_of_graduation = DateType.slash.format(jd_graduated.getDate());
    }
    String junior_high = tf_junior.getText();
    String junior_high_date = "";
    if (jCheckBox14.isSelected()) {
      junior_high_date = DateType.slash.format(jd_junior_graduated.getDate());
    }
    String senior_high = tf_senior.getText();
    String senior_high_date = "";
    if (jCheckBox15.isSelected()) {
      senior_high_date = DateType.slash.format(jd_senior_graduated.getDate());
    }
    String or_no = tf_or_no.getText();
    String prepared_by = tf_prepared_by.getText();
    String registrar = tf_field11.getText();

    if (callback != null) {
      callback.ok(new CloseDialog(this), new OutputData(medium, entrance_data, major, date_of_graduation, junior_high, junior_high_date, senior_high, senior_high_date, or_no, prepared_by, registrar));
    }
  }
}
