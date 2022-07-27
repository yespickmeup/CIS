/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.finance;

import cis.academic.Academic_offerings;
import cis.colleges.Colleges;
import cis.departments.Departments;
import static cis.finance.Dlg_finance.loadData_fees;
import static cis.finance.Dlg_finance.tbl_fees_ALM;
import static cis.finance.Dlg_finance.tbl_fees_M;
import cis.students.Students;
import cis.users.MyUser;
import cis.utils.Alert;
import cis.utils.Combo;
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
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.util.DateType;
import synsoftech.util.ImageRenderer;

/**
 *
 * @author USER
 */
public class Dlg_finance_payment_encoding extends javax.swing.JDialog {

  /**
   * Creates new form Dlg_finance_payment_encoding
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
  private Dlg_finance_payment_encoding(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    setUndecorated(true);
    initComponents();
    myInit();
  }

  private Dlg_finance_payment_encoding(java.awt.Dialog parent, boolean modal) {
    super(parent, modal);
    setUndecorated(true);
    initComponents();
    myInit();
  }

  public Dlg_finance_payment_encoding() {
    super();
    setUndecorated(true);
    initComponents();
    myInit();

  }
  private Dlg_finance_payment_encoding myRef;

  private void setThisRef(Dlg_finance_payment_encoding myRef) {
    this.myRef = myRef;
  }
  private static java.util.Map<Object, Dlg_finance_payment_encoding> dialogContainer = new java.util.HashMap();

  public static void clearUpFirst(java.awt.Window parent) {
    if (dialogContainer.containsKey(parent)) {
      dialogContainer.remove(parent);
    }
  }

  public static Dlg_finance_payment_encoding create(java.awt.Window parent, boolean modal) {

    if (modal) {
      return create(parent, ModalityType.APPLICATION_MODAL);
    }

    return create(parent, ModalityType.MODELESS);

  }

  public static Dlg_finance_payment_encoding create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

    if (parent instanceof java.awt.Frame) {

      Dlg_finance_payment_encoding dialog = dialogContainer.get(parent);

      if (dialog == null) {
        dialog = new Dlg_finance_payment_encoding((java.awt.Frame) parent, false);
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
      Dlg_finance_payment_encoding dialog = dialogContainer.get(parent);

      if (dialog == null) {
        dialog = new Dlg_finance_payment_encoding((java.awt.Dialog) parent, false);
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

    Dlg_finance_payment_encoding dialog = Dlg_finance_payment_encoding.create(new javax.swing.JFrame(), true);
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

    jPopupMenu1 = new javax.swing.JPopupMenu();
    jMenuItem1 = new javax.swing.JMenuItem();
    buttonGroup1 = new javax.swing.ButtonGroup();
    jPanel1 = new javax.swing.JPanel();
    jTabbedPane1 = new javax.swing.JTabbedPane();
    jPanel2 = new javax.swing.JPanel();
    jPanel4 = new javax.swing.JPanel();
    jLabel73 = new javax.swing.JLabel();
    tf_field125 = new Field.Combo();
    jLabel74 = new javax.swing.JLabel();
    tf_field126 = new Field.Combo();
    jLabel75 = new javax.swing.JLabel();
    tf_field127 = new Field.Combo();
    jCheckBox1 = new javax.swing.JCheckBox();
    jCheckBox2 = new javax.swing.JCheckBox();
    jCheckBox3 = new javax.swing.JCheckBox();
    jLabel76 = new javax.swing.JLabel();
    tf_field128 = new Field.Search();
    jLabel30 = new javax.swing.JLabel();
    jCheckBox17 = new javax.swing.JCheckBox();
    tf_field18 = new Field.Combo();
    jPanel5 = new javax.swing.JPanel();
    jButton2 = new Button.Search();
    jLabel31 = new javax.swing.JLabel();
    jCheckBox18 = new javax.swing.JCheckBox();
    jCheckBox19 = new javax.swing.JCheckBox();
    jCheckBox20 = new javax.swing.JCheckBox();
    jCheckBox21 = new javax.swing.JCheckBox();
    jPanel3 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tbl_students = new javax.swing.JTable();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jProgressBar1 = new javax.swing.JProgressBar();
    jButton3 = new javax.swing.JButton();
    jTabbedPane2 = new javax.swing.JTabbedPane();
    jPanel7 = new javax.swing.JPanel();
    jPanel25 = new javax.swing.JPanel();
    jScrollPane6 = new javax.swing.JScrollPane();
    tbl_fees = new javax.swing.JTable();
    jPanel26 = new javax.swing.JPanel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jButton6 = new Button.Success();
    jPanel6 = new javax.swing.JPanel();
    jScrollPane2 = new javax.swing.JScrollPane();
    tbl_transactions = new javax.swing.JTable();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();

    jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jMenuItem1.setText("Adjustments");
    jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jMenuItem1MouseClicked(evt);
      }
    });
    jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItem1ActionPerformed(evt);
      }
    });
    jPopupMenu1.add(jMenuItem1);

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

    jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));

    jPanel4.setBackground(new java.awt.Color(255, 255, 255));
    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Filter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
    jPanel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
    jLabel74.setText("College/Level:");

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

    jLabel75.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel75.setText("Course/Program:");

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

    jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox1.setText("All");

    jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox2.setSelected(true);
    jCheckBox2.setText("All");

    jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox3.setSelected(true);
    jCheckBox3.setText("All");

    jLabel76.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel76.setText("Search:");

    tf_field128.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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

    jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel30.setText("Year Level:");

    jCheckBox17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox17.setSelected(true);
    jCheckBox17.setText("All");
    jCheckBox17.setFocusable(false);
    jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox17ActionPerformed(evt);
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

    jPanel5.setBackground(new java.awt.Color(255, 255, 255));

    jButton2.setText("Search Records");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    jPanel5Layout.setVerticalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel31.setText("Type:");

    buttonGroup1.add(jCheckBox18);
    jCheckBox18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox18.setText("New");
    jCheckBox18.setFocusable(false);
    jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox18ActionPerformed(evt);
      }
    });

    buttonGroup1.add(jCheckBox19);
    jCheckBox19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox19.setText("Transferee");
    jCheckBox19.setFocusable(false);
    jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox19ActionPerformed(evt);
      }
    });

    buttonGroup1.add(jCheckBox20);
    jCheckBox20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox20.setText("Returnee");
    jCheckBox20.setFocusable(false);
    jCheckBox20.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox20ActionPerformed(evt);
      }
    });

    buttonGroup1.add(jCheckBox21);
    jCheckBox21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jCheckBox21.setSelected(true);
    jCheckBox21.setText("All");
    jCheckBox21.setFocusable(false);
    jCheckBox21.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox21ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jCheckBox3))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(tf_field127)
              .addComponent(tf_field125, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)))
          .addComponent(tf_field128))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
          .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jCheckBox2)
              .addComponent(jCheckBox17, javax.swing.GroupLayout.Alignment.TRAILING))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(tf_field18)
              .addComponent(tf_field126)))
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addComponent(jCheckBox21)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jCheckBox18, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jCheckBox19)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jCheckBox20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(tf_field125, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(tf_field126, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jCheckBox1)
              .addComponent(jCheckBox2))
            .addGap(1, 1, 1)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(tf_field127, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jCheckBox3)
              .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(tf_field18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jCheckBox17))
            .addGap(1, 1, 1)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(tf_field128, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jCheckBox18)
              .addComponent(jCheckBox19)
              .addComponent(jCheckBox20)
              .addComponent(jCheckBox21))))
        .addGap(5, 5, 5))
    );

    jPanel3.setBackground(new java.awt.Color(255, 255, 255));
    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List of Students", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

    tbl_students.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {},
        {},
        {},
        {}
      },
      new String [] {

      }
    ));
    tbl_students.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tbl_studentsMouseClicked(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        tbl_studentsMousePressed(evt);
      }
      public void mouseReleased(java.awt.event.MouseEvent evt) {
        tbl_studentsMouseReleased(evt);
      }
    });
    jScrollPane1.setViewportView(tbl_students);

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel1.setText("No.of rows:");

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel2.setText("0");

    jButton1.setText("Sync Balances 2");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jProgressBar1.setStringPainted(true);

    jButton3.setText("Sync Balances 1");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton3ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jButton1)
            .addComponent(jButton3))
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(jLabel2))
        .addGap(7, 7, 7))
    );

    jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
    jTabbedPane2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
        .addContainerGap())
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
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    jPanel26Layout.setVerticalGroup(
      jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel26Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())
    );

    javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
    jPanel7.setLayout(jPanel7Layout);
    jPanel7Layout.setHorizontalGroup(
      jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 678, Short.MAX_VALUE)
      .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
          .addGap(8, 8, 8)
          .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGap(8, 8, 8)))
    );
    jPanel7Layout.setVerticalGroup(
      jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 452, Short.MAX_VALUE)
      .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
          .addContainerGap()
          .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap()))
    );

    jTabbedPane2.addTab("Payables", jPanel7);

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
      public void mousePressed(java.awt.event.MouseEvent evt) {
        tbl_transactionsMousePressed(evt);
      }
      public void mouseReleased(java.awt.event.MouseEvent evt) {
        tbl_transactionsMouseReleased(evt);
      }
    });
    jScrollPane2.setViewportView(tbl_transactions);

    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel3.setText("No.of rows:");

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel4.setText("0");

    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
      jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel6Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
          .addGroup(jPanel6Layout.createSequentialGroup()
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    jPanel6Layout.setVerticalGroup(
      jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel6Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(jLabel4))
        .addContainerGap())
    );

    jTabbedPane2.addTab("Ledger", jPanel6);

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jTabbedPane2)))
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jTabbedPane2))
        .addContainerGap())
    );

    jTabbedPane1.addTab("Payment", jPanel2);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jTabbedPane1)
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addComponent(jTabbedPane1)
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGap(0, 0, 0))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void tf_field125MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field125MouseClicked
      init_departments();
    }//GEN-LAST:event_tf_field125MouseClicked

    private void tf_field125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field125ActionPerformed
      //        init_departments();
    }//GEN-LAST:event_tf_field125ActionPerformed

    private void tf_field126MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field126MouseClicked
      init_colleges2();
    }//GEN-LAST:event_tf_field126MouseClicked

    private void tf_field126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field126ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field126ActionPerformed

    private void tf_field127MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field127MouseClicked
      init_programs();
    }//GEN-LAST:event_tf_field127MouseClicked

    private void tf_field127ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field127ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field127ActionPerformed

    private void tf_field128MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field128MouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_field128MouseClicked

    private void tf_field128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field128ActionPerformed
      ret_students();
    }//GEN-LAST:event_tf_field128ActionPerformed

    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox17ActionPerformed

    }//GEN-LAST:event_jCheckBox17ActionPerformed

    private void tf_field18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field18MouseClicked
      init_year_levels();
    }//GEN-LAST:event_tf_field18MouseClicked

    private void tf_field18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field18ActionPerformed
      init_year_levels();
    }//GEN-LAST:event_tf_field18ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      ret_students();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox18ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox18ActionPerformed

    private void jCheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox19ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox19ActionPerformed

    private void jCheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox20ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox20ActionPerformed

    private void jCheckBox21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox21ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox21ActionPerformed

    private void tbl_studentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_studentsMouseClicked
      select_student();
    }//GEN-LAST:event_tbl_studentsMouseClicked

    private void tbl_studentsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_studentsMousePressed
      show_popup(evt);
    }//GEN-LAST:event_tbl_studentsMousePressed

    private void tbl_studentsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_studentsMouseReleased
      show_popup(evt);
    }//GEN-LAST:event_tbl_studentsMouseReleased

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
      add_adjustments();
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      add_adjustments();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tbl_transactionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_transactionsMouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_tbl_transactionsMouseClicked

    private void tbl_transactionsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_transactionsMousePressed
      // TODO add your handling code here:
    }//GEN-LAST:event_tbl_transactionsMousePressed

    private void tbl_transactionsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_transactionsMouseReleased
      // TODO add your handling code here:
    }//GEN-LAST:event_tbl_transactionsMouseReleased

    private void tbl_feesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_feesMouseClicked
      select_payment();
    }//GEN-LAST:event_tbl_feesMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      fees_payment();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      synch_balances2();
    }//GEN-LAST:event_jButton1ActionPerformed

  private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    synch_balances();
  }//GEN-LAST:event_jButton3ActionPerformed

  /**
   * @param args the command line arguments
   */

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton6;
  private javax.swing.JCheckBox jCheckBox1;
  private javax.swing.JCheckBox jCheckBox17;
  private javax.swing.JCheckBox jCheckBox18;
  private javax.swing.JCheckBox jCheckBox19;
  private javax.swing.JCheckBox jCheckBox2;
  private javax.swing.JCheckBox jCheckBox20;
  private javax.swing.JCheckBox jCheckBox21;
  private javax.swing.JCheckBox jCheckBox3;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel30;
  private javax.swing.JLabel jLabel31;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel73;
  private javax.swing.JLabel jLabel74;
  private javax.swing.JLabel jLabel75;
  private javax.swing.JLabel jLabel76;
  private javax.swing.JMenuItem jMenuItem1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel25;
  private javax.swing.JPanel jPanel26;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JPanel jPanel5;
  private javax.swing.JPanel jPanel6;
  private javax.swing.JPanel jPanel7;
  private javax.swing.JPopupMenu jPopupMenu1;
  private javax.swing.JProgressBar jProgressBar1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane6;
  private javax.swing.JTabbedPane jTabbedPane1;
  private javax.swing.JTabbedPane jTabbedPane2;
  private javax.swing.JTable tbl_fees;
  private javax.swing.JTable tbl_students;
  private javax.swing.JTable tbl_transactions;
  private javax.swing.JTextField tf_field125;
  private javax.swing.JTextField tf_field126;
  private javax.swing.JTextField tf_field127;
  private javax.swing.JTextField tf_field128;
  private javax.swing.JTextField tf_field18;
  // End of variables declaration//GEN-END:variables

  private void myInit() {
//        System.setProperty("pool_db", "db_cis_cosca");
//        System.setProperty("pool_password", "password");
    init_key();
    init_tbl_students(tbl_students);
    init_tbl_transactions(tbl_transactions);
    init_tbl_fees(tbl_fees);
    deps = Departments.ret_data(" order by department_name  asc ");
    year_levels = Combo.year_levels();
    if (!deps.isEmpty()) {
      Departments.to_departments dep = (Departments.to_departments) deps.get(0);
      Field.Combo tf_dep = (Field.Combo) tf_field125;
      tf_dep.setText(dep.department_name);
      tf_dep.setId("" + dep.id);
      colleges2 = Colleges.ret_data(" where department_id='" + dep.id + "' ");
      Field.Combo co1 = (Field.Combo) tf_field126;
      if (!colleges2.isEmpty()) {
        Colleges.to_colleges c = (Colleges.to_colleges) colleges2.get(0);
        co1.setText("" + c.college_name);
        co1.setId("" + c.id);
      } else {
        co1.setText("");
        co1.setId("");
      }
    }
    String env = System.getProperty("environment", "development");
    if (env.equalsIgnoreCase("development")) {
      jButton1.setVisible(true);
      jButton3.setVisible(true);
      jProgressBar1.setVisible(true);
    } else {
      jButton1.setVisible(false);
      jButton3.setVisible(false);
      jProgressBar1.setVisible(false);
    }
  }

  List<Departments.to_departments> deps = new ArrayList();

  private void init_departments() {
    Object[][] obj = new Object[deps.size()][1];
    int i = 0;
    for (Departments.to_departments to : deps) {
      obj[i][0] = " " + to.department_name;
      i++;
    }
    JLabel[] labels = {};
    int[] tbl_widths_customers = {tf_field125.getWidth()};
    int width = 0;
    String[] col_names = {""};
    TableRenderer tr = new TableRenderer();
    TableRenderer.setPopup(tf_field125, obj, labels, tbl_widths_customers, col_names);
    tr.setCallback(new TableRenderer.Callback() {
      @Override
      public void ok(TableRenderer.OutputData data) {
        Departments.to_departments to = deps.get(data.selected_row);
        Field.Combo co = (Field.Combo) tf_field125;
        co.setText("" + to.department_name);
        co.setId("" + to.id);
        colleges2 = Colleges.ret_data(" where department_id='" + co.getId() + "' ");
        Field.Combo co1 = (Field.Combo) tf_field126;
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
    int[] tbl_widths_customers = {tf_field126.getWidth()};
    int width = 0;
    String[] col_names = {""};
    TableRenderer tr = new TableRenderer();
    TableRenderer.setPopup(tf_field126, obj, labels, tbl_widths_customers, col_names);
    tr.setCallback(new TableRenderer.Callback() {
      @Override
      public void ok(TableRenderer.OutputData data) {
        Colleges.to_colleges to = colleges2.get(data.selected_row);
        Field.Combo co = (Field.Combo) tf_field126;
        co.setText("" + to.college_name);
        co.setId("" + to.id);
      }
    });
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

  private void init_programs() {

//        Field.Combo year = (Field.Combo) tf_field3;
    Field.Combo dep = (Field.Combo) tf_field125;
    Field.Combo col = (Field.Combo) tf_field126;
    String where = " where department_id='" + dep.getId() + "'  and college_id='" + col.getId() + "'  order by course_description asc ";
    List<Academic_offerings.to_academic_offerings> offerings = Academic_offerings.ret_data(where);
    Object[][] obj = new Object[offerings.size()][2];
    int i = 0;
    for (Academic_offerings.to_academic_offerings to : offerings) {
      obj[i][0] = " " + to.course_code;
      obj[i][1] = " " + to.course_description;
      i++;
    }
    JLabel[] labels = {};
    int[] tbl_widths_customers = {100, tf_field127.getWidth() - 100};
    int width = 0;
    String[] col_names = {"", ""};
    TableRenderer tr = new TableRenderer();
    TableRenderer.setPopup(tf_field127, obj, labels, tbl_widths_customers, col_names);
    tr.setCallback(new TableRenderer.Callback() {
      @Override
      public void ok(TableRenderer.OutputData data) {
        Academic_offerings.to_academic_offerings to = offerings.get(data.selected_row);
        Field.Combo co = (Field.Combo) tf_field127;
        co.setText("" + to.course_description);
        co.setId("" + to.id);
      }
    });
  }

  //<editor-fold defaultstate="collapsed" desc=" students "> 
  public static ArrayListModel tbl_students_ALM;
  public static TblstudentsModel tbl_students_M;

  public static void init_tbl_students(JTable tbl_students) {
    tbl_students_ALM = new ArrayListModel();
    tbl_students_M = new TblstudentsModel(tbl_students_ALM);
    tbl_students.setModel(tbl_students_M);
    tbl_students.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    tbl_students.setRowHeight(25);
    int[] tbl_widths_students = {100, 220, 0, 0, 0, 80, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    for (int i = 0, n = tbl_widths_students.length; i < n; i++) {
      if (i == 1) {
        continue;
      }
      TableWidthUtilities.setColumnWidth(tbl_students, i, tbl_widths_students[i]);
    }
    Dimension d = tbl_students.getTableHeader().getPreferredSize();
    d.height = 25;
    tbl_students.getTableHeader().setPreferredSize(d);
    tbl_students.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
    tbl_students.setRowHeight(25);
    tbl_students.setFont(new java.awt.Font("Arial", 0, 12));
    tbl_students.getColumnModel().getColumn(6).setCellRenderer(new ImageRenderer());
    TableWidthUtilities.setColumnRightRenderer(tbl_students, 5);
  }

  public static void loadData_students(List<Students.to_students> acc) {
    tbl_students_ALM.clear();
    tbl_students_ALM.addAll(acc);
  }

  public static class TblstudentsModel extends AbstractTableAdapter {

    public static String[] COLUMNS = {
      "Student No", "Name", "BirthDate", "Address", "Course/Year", "", "", "", "Balance", "", "permanent_address", "email_address", "postal_code", "tel_no", "mobile_no", "date_of_birth", "place_of_birth", "age", "gender", "citizenship", "religion", "civil_status", "spouse_name", "date_of_communion", "date_of_confirmation", "is_right_handed", "is_indigenous", "indigenous_name", "level_id", "level", "college_id", "college", "department_id", "department", "year_level", "year_level_status", "preferred_course1", "preferred_course2", "preferred_course3", "father_name", "father_citizenship", "father_home_address", "father_email_address", "father_mobile_no", "father_occupation", "father_employer", "father_business_address", "father_business_tel_no", "father_educational_attainment", "father_last_school_attended", "mother_name", "mother_citizenship", "mother_home_address", "mother_email_address", "mother_mobile_no", "mother_occupation", "mother_employer", "mother_business_address", "mother_business_tel_no", "mother_educational_attainment", "mother_last_school_attended", "guardian_name", "guardian_mailing_address", "guardian_telephone_no", "grade_school_name", "grade_school_region", "grade_school_school_year", "grade_school_awards", "high_school_name", "high_school_region", "high_school_school_year", "high_school_awards", "college_school_name", "college_school_region", "college_school_school_year", "college_awards", "junior_high_name", "junior_high_region", "junior_high_year", "junior_high_awards", "tesda_name", "tesda_region", "tesda_year", "tesda_awards", "sibling1", "sibling2", "sibling3", "sibling4", "sibling5", "sibling6", "sibling7", "sibling8", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded"
    };

    public TblstudentsModel(ListModel listmodel) {
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
      Students.to_students tt = (Students.to_students) getRow(row);
      switch (col) {
        case 0:
          return " " + tt.student_no;
        case 1:
          return " " + tt.last_name + ", " + tt.first_name + " " + tt.middle_name;
        case 2:
          return " " + DateType.convert_slash_datetime2(tt.date_of_birth);
        case 3:
          return " " + tt.permanent_address;
        case 4:
          if (tt.course_code == null) {
            return "";
          } else {
            return " " + tt.course_code + " - " + tt.year_level;
          }

        case 5:
          return " " + FitIn.fmt_wc_0(tt.balance) + " ";
        case 6:
          return "/cis/icons2/more-button-of-three-dots.png";
        case 7:
          return tt.middle_name;
        case 8:
          return tt.nick_name;
        case 9:
          return tt.current_address;
        case 10:
          return tt.permanent_address;
        case 11:
          return tt.email_address;
        case 12:
          return tt.postal_code;
        case 13:
          return tt.tel_no;
        case 14:
          return tt.mobile_no;
        case 15:
          return tt.date_of_birth;
        case 16:
          return tt.place_of_birth;
        case 17:
          return tt.age;
        case 18:
          return tt.gender;
        case 19:
          return tt.citizenship;
        case 20:
          return tt.religion;
        case 21:
          return tt.civil_status;
        case 22:
          return tt.spouse_name;
        case 23:
          return tt.date_of_communion;
        case 24:
          return tt.date_of_confirmation;
        case 25:
          return tt.is_right_handed;
        case 26:
          return tt.is_indigenous;
        case 27:
          return tt.indigenous_name;
        case 28:
          return tt.level_id;
        case 29:
          return tt.level;
        case 30:
          return tt.college_id;
        case 31:
          return tt.college;
        case 32:
          return tt.department_id;
        case 33:
          return tt.department;
        case 34:
          return tt.year_level;
        case 35:
          return tt.year_level_status;
        case 36:
          return tt.preferred_course1;
        case 37:
          return tt.preferred_course2;
        case 38:
          return tt.preferred_course3;
        case 39:
          return tt.father_name;
        case 40:
          return tt.father_citizenship;
        case 41:
          return tt.father_home_address;
        case 42:
          return tt.father_email_address;
        case 43:
          return tt.father_mobile_no;
        case 44:
          return tt.father_occupation;
        case 45:
          return tt.father_employer;
        case 46:
          return tt.father_business_address;
        case 47:
          return tt.father_business_tel_no;
        case 48:
          return tt.father_educational_attainment;
        case 49:
          return tt.father_last_school_attended;
        case 50:
          return tt.mother_name;
        case 51:
          return tt.mother_citizenship;
        case 52:
          return tt.mother_home_address;
        case 53:
          return tt.mother_email_address;
        case 54:
          return tt.mother_mobile_no;
        case 55:
          return tt.mother_occupation;
        case 56:
          return tt.mother_employer;
        case 57:
          return tt.mother_business_address;
        case 58:
          return tt.mother_business_tel_no;
        case 59:
          return tt.mother_educational_attainment;
        case 60:
          return tt.mother_last_school_attended;
        case 61:
          return tt.guardian_name;
        case 62:
          return tt.guardian_mailing_address;
        case 63:
          return tt.guardian_telephone_no;
        case 64:
          return tt.grade_school_name;
        case 65:
          return tt.grade_school_region;
        case 66:
          return tt.grade_school_school_year;
        case 67:
          return tt.grade_school_awards;
        case 68:
          return tt.high_school_name;
        case 69:
          return tt.high_school_region;
        case 70:
          return tt.high_school_school_year;
        case 71:
          return tt.high_school_awards;
        case 72:
          return tt.college_school_name;
        case 73:
          return tt.college_school_region;
        case 74:
          return tt.college_school_school_year;
        case 75:
          return tt.college_awards;
        case 76:
          return tt.junior_high_name;
        case 77:
          return tt.junior_high_region;
        case 78:
          return tt.junior_high_year;
        case 79:
          return tt.junior_high_awards;
        case 80:
          return tt.tesda_name;
        case 81:
          return tt.tesda_region;
        case 82:
          return tt.tesda_year;
        case 83:
          return tt.tesda_awards;
        case 84:
          return tt.sibling1;
        case 85:
          return tt.sibling2;
        case 86:
          return tt.sibling3;
        case 87:
          return tt.sibling4;
        case 88:
          return tt.sibling5;
        case 89:
          return tt.sibling6;
        case 90:
          return tt.sibling7;
        case 91:
          return tt.sibling8;
        case 92:
          return tt.created_at;
        case 93:
          return tt.updated_at;
        case 94:
          return tt.created_by;
        case 95:
          return tt.updated_by;
        case 96:
          return tt.status;
        default:
          return tt.is_uploaded;
      }
    }
  }

  private void ret_students() {

    String where = " where id<>0  ";
    if (!jCheckBox1.isSelected()) {
      Field.Combo dep = (Field.Combo) tf_field125;
      where = where + " and department_id = '" + dep.getId() + "' ";
    }
    if (!jCheckBox2.isSelected()) {
      Field.Combo col = (Field.Combo) tf_field126;
      where = where + " and college_id = '" + col.getId() + "' ";
    }

    if (!jCheckBox3.isSelected()) {
      Field.Combo course = (Field.Combo) tf_field127;
      where = where + " and course_id = '" + course.getId() + "' ";
    }
    if (!jCheckBox17.isSelected()) {
      Field.Combo year_level = (Field.Combo) tf_field18;
      where = where + " and year_level like '" + year_level.getText() + "' ";
    }
    if (!jCheckBox17.isSelected()) {
      Field.Combo period = (Field.Combo) tf_field18;
      where = where + " and year_level like '" + period.getText() + "' ";
    }

    if (!jCheckBox21.isSelected()) {
      int is_transferee = 0;
      if (jCheckBox19.isSelected()) {
        is_transferee = 1;
      }
      if (jCheckBox20.isSelected()) {
        is_transferee = 2;
      }
      where = where + " and is_transferee='" + is_transferee + "' ";
    }
//        if (!jCheckBox7.isSelected()) {
//            where = where + " and is_transferee = 0 ";
//        }
    where = where + " and concat(last_name,space(1),first_name) like '%" + tf_field128.getText() + "%' ";
    where = where + " order by last_name asc ";
    System.out.println(where);
    List<Students.to_students> students = Students.ret_data(where);
    loadData_students(students);
    jLabel2.setText("" + students.size());

  }
//</editor-fold> 

  List<String> year_levels = new ArrayList();

  private void init_year_levels() {
    Object[][] obj = new Object[year_levels.size()][1];
    int i = 0;
    for (String to : year_levels) {
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
        String to = year_levels.get(data.selected_row);
        tf_field18.setText("" + to);

      }
    });
  }

  private void show_popup(MouseEvent evt) {
    if (evt.isPopupTrigger()) {
      int row = tbl_students.getSelectedRow();
      if (row < 0) {
        return;
      }

      int col = tbl_students.getSelectedColumn();
      if (col == 6) {
        jPopupMenu1.show(tbl_students, evt.getX(), evt.getY());
      }

    }
  }

  private void select_student() {
    int row = tbl_students.getSelectedRow();
    if (row < 0) {
      return;
    }
    Students.to_students stud = (Students.to_students) tbl_students_ALM.get(row);

    List<Finance.transactions> transactions = Finance.ret_transactions(stud);
    loadData_transactions(transactions);
    jLabel4.setText("" + transactions.size());

    List<Finance.fees> datas = Finance.ret_data(stud);
    loadData_fees(datas);
    double balance = 0;
    for (Finance.fees fee : datas) {
      balance += fee.balance;
    }

    jLabel6.setText(FitIn.fmt_wc_0(balance));

  }

  //<editor-fold defaultstate="collapsed" desc=" table added subjects "> 
  public static ArrayListModel tbl_transactions_ALM;
  public static Tbl_transactions_Model tbl_transactions_M;

  public static void init_tbl_transactions(JTable tbl_transactions) {
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

  private void synch_balances() {

    jProgressBar1.setString("Loading...Please wait...");
    jProgressBar1.setIndeterminate(true);
    Thread t = new Thread(new Runnable() {

      @Override
      public void run() {

        List<Students.to_students> students = tbl_students_ALM;

        for (Students.to_students stud : students) {

          List<Finance.transactions> transactions = Finance.ret_transactions(stud);
          loadData_transactions(transactions);
          jLabel4.setText("" + transactions.size());

          //Check Balance
          double ledger_balance = 0;
          if (!transactions.isEmpty()) {
            Finance.transactions to = (Finance.transactions) transactions.get(transactions.size() - 1);
            ledger_balance = to.balance;
          }
          if (ledger_balance != stud.balance) {
            Students.update_student_balance(stud, ledger_balance);
          }
        }

        Alert.set(0, "Updated successfully!");
        jProgressBar1.setString("Finished...");
        jProgressBar1.setIndeterminate(false);
      }
    });
    t.start();

  }

  private void synch_balances2() {

    jProgressBar1.setString("Loading...Please wait...");
    jProgressBar1.setIndeterminate(true);
    Thread t = new Thread(new Runnable() {

      @Override
      public void run() {

        List<Students.to_students> students = tbl_students_ALM;

        for (Students.to_students student : students) {

          List<Finance.transactions> transactions = Finance.ret_transactions(student);
          loadData_transactions(transactions);
          jLabel4.setText("" + transactions.size());

          //Check Balance
          double ledger_balance = 0;
          if (!transactions.isEmpty()) {
            Finance.transactions to = (Finance.transactions) transactions.get(transactions.size() - 1);
            ledger_balance = to.balance;
          }
          int id = 0;
          int student_id = student.id;
          String student_no = student.student_no;
          String fname = student.first_name;
          String mi = student.middle_name;
          String lname = student.last_name;
          int is_transferee = student.is_transferee;
          String academic_year = "2021 - 2022";
          int academic_year_id = 10;
          int course_id = student.course_id;
          String course_code = student.course_code;
          String course_description = student.course_description;
          String year_level = student.year_level;
          String term = "Summer Class";
          int department_id = student.department_id;
          String department = student.department;
          int college_id = student.college_id;
          String college = student.college;
          double adjustment_amount = ledger_balance;

          double paid = 0;
          String remarks = "Adjustment-Zero Out Balance";
          int status = 0;
          String created_at = cis.utils.DateType.now();
          int created_by = FitIn.toInt(MyUser.getUser_id());
          String updated_at = cis.utils.DateType.now();
          int updated_by = FitIn.toInt(MyUser.getUser_id());

          int particular_id = 1;
          String particular = "Back Account";
          int is_payable = 0;
          int is_add = 0;
//          if (adjustment_amount < 0) {
//            is_add = 1;
//          }
          Student_balance_adjustments.to_student_balance_adjustments to = new Student_balance_adjustments.to_student_balance_adjustments(id, student_id, student_no, fname, mi, lname, is_transferee, academic_year, academic_year_id, course_id, course_code, course_description, year_level, term, department_id, department, college_id, college, adjustment_amount, paid, remarks, status, created_at, created_by, updated_at, updated_by, particular_id, particular, is_payable, is_add);
          Student_balance_adjustments.add_data(to);
        }

        Alert.set(0, "Updated successfully!");
        jProgressBar1.setString("Finished...");
        jProgressBar1.setIndeterminate(false);
      }
    });
    t.start();

  }

//</editor-fold>
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
      if (to.trans_type == 5) { //balance adjustment

        int row2 = tbl_students.getSelectedRow();
        if (row2 < 0) {
          return;
        }
        Students.to_students stud = (Students.to_students) tbl_students_ALM.get(row2);

        List<Finance.fees> selected = new ArrayList();
        selected.add(to);
        if (selected.isEmpty()) {
          Alert.set(0, "Select Fee/s to pay!");
          return;
        }
        Window p = (Window) this;
        Dlg_finance_payment nd = Dlg_finance_payment.create(p, true);
        nd.setTitle("");
        nd.do_pass2F(selected, stud);
        nd.setCallback(new Dlg_finance_payment.Callback() {

          @Override
          public void ok(CloseDialog closeDialog, Dlg_finance_payment.OutputData data) {
            closeDialog.ok();
            ret_students();
            tbl_students.setRowSelectionInterval(row2, row2);
            select_student();
          }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
      }
    }

  }

  private void fees_payment() {
    int row = tbl_students.getSelectedRow();
    if (row < 0) {
      return;
    }
    Students.to_students stud = (Students.to_students) tbl_students_ALM.get(row);
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
    nd.do_pass(selected, stud, false);
    nd.setCallback(new Dlg_finance_payment.Callback() {
      @Override
      public void ok(CloseDialog closeDialog, Dlg_finance_payment.OutputData data) {
        closeDialog.ok();
        ret_students();
        tbl_students.setRowSelectionInterval(row, row);
        select_student();
      }
    });
    nd.setLocationRelativeTo(this);
    nd.setVisible(true);
  }

  private void add_adjustments() {
    int row = tbl_students.getSelectedRow();
    if (row < 0) {
      return;
    }
    Students.to_students stud = (Students.to_students) tbl_students_ALM.get(row);
    Window p = (Window) this;
    Dlg_student_balance_adjustment_add nd = Dlg_student_balance_adjustment_add.create(p, true);
    nd.setTitle("");
    nd.do_pass(stud);
    nd.setCallback(new Dlg_student_balance_adjustment_add.Callback() {
      @Override
      public void ok(CloseDialog closeDialog, Dlg_student_balance_adjustment_add.OutputData data) {
        closeDialog.ok();
        ret_students();
        tbl_students.setRowSelectionInterval(row, row);
        select_student();
      }
    });
    nd.setLocationRelativeTo(this);
    nd.setVisible(true);
  }

}
