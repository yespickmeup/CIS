/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.accounts_receivables;

import java.awt.BorderLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import javax.swing.SwingUtilities;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;

/**
 *
 * @author User
 */
public class Dlg_accounts_receivables extends javax.swing.JDialog {

  /**
   * Creates new form Dlg_accounts_receivables
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
  private Dlg_accounts_receivables(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    setUndecorated(true);
    initComponents();
    myInit();
  }

  private Dlg_accounts_receivables(java.awt.Dialog parent, boolean modal) {
    super(parent, modal);
    setUndecorated(true);
    initComponents();
    myInit();
  }

  public Dlg_accounts_receivables() {
    super();
    setUndecorated(true);
    initComponents();
    myInit();

  }
  private Dlg_accounts_receivables myRef;

  private void setThisRef(Dlg_accounts_receivables myRef) {
    this.myRef = myRef;
  }
  private static java.util.Map<Object, Dlg_accounts_receivables> dialogContainer = new java.util.HashMap();

  public static void clearUpFirst(java.awt.Window parent) {
    if (dialogContainer.containsKey(parent)) {
      dialogContainer.remove(parent);
    }
  }

  public static Dlg_accounts_receivables create(java.awt.Window parent, boolean modal) {

    if (modal) {
      return create(parent, ModalityType.APPLICATION_MODAL);
    }

    return create(parent, ModalityType.MODELESS);

  }

  public static Dlg_accounts_receivables create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

    if (parent instanceof java.awt.Frame) {

      Dlg_accounts_receivables dialog = dialogContainer.get(parent);

      if (dialog == null) {
        dialog = new Dlg_accounts_receivables((java.awt.Frame) parent, false);
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
      Dlg_accounts_receivables dialog = dialogContainer.get(parent);

      if (dialog == null) {
        dialog = new Dlg_accounts_receivables((java.awt.Dialog) parent, false);
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

    Dlg_accounts_receivables dialog = Dlg_accounts_receivables.create(new javax.swing.JFrame(), true);
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
    jTabbedPane1 = new javax.swing.JTabbedPane();
    jPanel2 = new javax.swing.JPanel();
    jPanel3 = new javax.swing.JPanel();
    jPanel4 = new javax.swing.JPanel();
    jPanel5 = new javax.swing.JPanel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

    jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 925, Short.MAX_VALUE)
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 497, Short.MAX_VALUE)
    );

    jTabbedPane1.addTab("Students Balances", jPanel2);

    jPanel3.setBackground(new java.awt.Color(255, 255, 255));

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 925, Short.MAX_VALUE)
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 497, Short.MAX_VALUE)
    );

    jTabbedPane1.addTab("AR Aging", jPanel3);

    jPanel4.setBackground(new java.awt.Color(255, 255, 255));

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 925, Short.MAX_VALUE)
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 497, Short.MAX_VALUE)
    );

    jTabbedPane1.addTab("SOA", jPanel4);

    jPanel5.setBackground(new java.awt.Color(255, 255, 255));

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 925, Short.MAX_VALUE)
    );
    jPanel5Layout.setVerticalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 497, Short.MAX_VALUE)
    );

    jTabbedPane1.addTab("Student Payments", jPanel5);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(19, 19, 19)
        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
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

  /**
   * @param args the command line arguments
   */

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JPanel jPanel5;
  private javax.swing.JTabbedPane jTabbedPane1;
  // End of variables declaration//GEN-END:variables

  private void myInit() {
    init_key();
  }

  public void do_pass() {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        add_student_balances();
      }
    });
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

  private void add_student_balances() {
    jPanel2.setLayout(new BorderLayout());
    Window p = (Window) this;
    Dlg_ar_aging nd = Dlg_ar_aging.create(p, true);
    jPanel2.add(nd.getSurface());

    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        jPanel2.updateUI();
      }
    });

  }

}
