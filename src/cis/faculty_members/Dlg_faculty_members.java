/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.faculty_members;

import cis.colleges.Colleges;
import cis.colleges.Dlg_colleges;
import cis.departments.Departments;
import cis.departments.Dlg_departments;
import cis.faculty_members.Faculty_members.to_faculty_members;
import cis.users.MyUser;
import cis.utils.Alert;
import cis.utils.Dlg_confirm_action;
import cis.utils.Dlg_confirm_delete;
import cis.utils.TableRenderer;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JLabel;
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
import synsoftech.util.DateType;

/**
 *
 * @author Ronescape
 */
public class Dlg_faculty_members extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_faculty_members
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
    private Dlg_faculty_members(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_faculty_members(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_faculty_members() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_faculty_members myRef;

    private void setThisRef(Dlg_faculty_members myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_faculty_members> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_faculty_members create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_faculty_members create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_faculty_members dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_faculty_members((java.awt.Frame) parent, false);
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
            Dlg_faculty_members dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_faculty_members((java.awt.Dialog) parent, false);
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

        Dlg_faculty_members dialog = Dlg_faculty_members.create(new javax.swing.JFrame(), true);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        tf_field5 = new Field.Input();
        jLabel13 = new javax.swing.JLabel();
        tf_field6 = new Field.Input();
        jLabel14 = new javax.swing.JLabel();
        tf_field7 = new Field.Input();
        jLabel8 = new javax.swing.JLabel();
        tf_field2 = new Field.Combo();
        tf_field3 = new Field.Combo();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tf_field8 = new Field.Combo();
        jLabel11 = new javax.swing.JLabel();
        tf_field4 = new Field.Combo();
        jLabel16 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jButton5 = new Button.Default();
        jButton2 = new Button.Success();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_faculty_members = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tf_field9 = new Field.Combo();
        tf_field10 = new Field.Combo();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tf_field11 = new Field.Combo();
        tf_field12 = new Field.Combo();
        jLabel21 = new javax.swing.JLabel();
        tf_field13 = new Field.Search();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("First Name:");

        tf_field5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Middle Name:");

        tf_field6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Last Name:");

        tf_field7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Department:");

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

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Level/College:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Group:");

        tf_field8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field8.setFocusable(false);
        tf_field8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field8MouseClicked(evt);
            }
        });
        tf_field8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field8ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Designation:");

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

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Employment:");

        buttonGroup1.add(jCheckBox1);
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Fulltime");

        buttonGroup1.add(jCheckBox2);
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setText("Partime");

        buttonGroup1.add(jCheckBox3);
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setText("Job Order");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Status:");

        buttonGroup2.add(jCheckBox4);
        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox4.setSelected(true);
        jCheckBox4.setText("Active");

        buttonGroup2.add(jCheckBox5);
        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox5.setText("Inactive");

        jButton5.setText("New");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cis/icons/settings.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cis/icons/settings.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cis/icons/settings.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cis/icons/settings.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox3)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_field8)
                                    .addComponent(tf_field2))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(tf_field5, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tf_field6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_field7, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jCheckBox4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_field4)
                                            .addComponent(tf_field3))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_field2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_field3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox5))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tbl_faculty_members.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_faculty_members.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_faculty_membersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_faculty_members);

        jLabel1.setText("No. of rows:");

        jLabel2.setText("0");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Department:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Group:");

        tf_field9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field9.setFocusable(false);
        tf_field9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field9MouseClicked(evt);
            }
        });
        tf_field9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field9ActionPerformed(evt);
            }
        });

        tf_field10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field10.setFocusable(false);
        tf_field10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field10MouseClicked(evt);
            }
        });
        tf_field10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field10ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Level/College:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Designation:");

        tf_field11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field11.setFocusable(false);
        tf_field11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field11MouseClicked(evt);
            }
        });
        tf_field11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field11ActionPerformed(evt);
            }
        });

        tf_field12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field12.setFocusable(false);
        tf_field12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field12MouseClicked(evt);
            }
        });
        tf_field12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field12ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Name:");

        tf_field13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field13ActionPerformed(evt);
            }
        });

        jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox6.setSelected(true);
        jCheckBox6.setText("All");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox7.setSelected(true);
        jCheckBox7.setText("All");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jCheckBox8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox8.setSelected(true);
        jCheckBox8.setText("All");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jCheckBox9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox9.setSelected(true);
        jCheckBox9.setText("All");
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox6)
                                    .addComponent(jCheckBox7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_field9)
                                    .addComponent(tf_field10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox8)
                                    .addComponent(jCheckBox9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_field11)
                                    .addComponent(tf_field12)))
                            .addComponent(tf_field13))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox6))
                                .addGap(1, 1, 1))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_field11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheckBox8)))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox7)
                            .addComponent(jCheckBox9)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tf_field9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(tf_field10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
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

    private void tf_field2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field2MouseClicked
        init_departments();
    }//GEN-LAST:event_tf_field2MouseClicked

    private void tf_field2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field2ActionPerformed
        init_departments();
    }//GEN-LAST:event_tf_field2ActionPerformed

    private void tf_field3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field3MouseClicked
        init_colleges();
    }//GEN-LAST:event_tf_field3MouseClicked

    private void tf_field3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field3ActionPerformed
        init_colleges();
    }//GEN-LAST:event_tf_field3ActionPerformed

    private void tf_field4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field4MouseClicked
        init_designation();
    }//GEN-LAST:event_tf_field4MouseClicked

    private void tf_field4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field4ActionPerformed
        init_designation();
    }//GEN-LAST:event_tf_field4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        clear_fm();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        save_fm();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        group();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        designation();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tf_field8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field8ActionPerformed
        init_groups();
    }//GEN-LAST:event_tf_field8ActionPerformed

    private void tf_field8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field8MouseClicked
        init_groups();
    }//GEN-LAST:event_tf_field8MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        department();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        colleges();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tf_field9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field9MouseClicked
        init_departments2();
    }//GEN-LAST:event_tf_field9MouseClicked

    private void tf_field9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field9ActionPerformed
        init_departments2();
    }//GEN-LAST:event_tf_field9ActionPerformed

    private void tf_field10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field10MouseClicked
        init_groups2();
    }//GEN-LAST:event_tf_field10MouseClicked

    private void tf_field10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field10ActionPerformed
        init_groups2();
    }//GEN-LAST:event_tf_field10ActionPerformed

    private void tf_field11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field11MouseClicked
        init_colleges2();
    }//GEN-LAST:event_tf_field11MouseClicked

    private void tf_field11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field11ActionPerformed
        init_colleges2();
    }//GEN-LAST:event_tf_field11ActionPerformed

    private void tf_field12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field12MouseClicked
        init_designation2();
    }//GEN-LAST:event_tf_field12MouseClicked

    private void tf_field12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field12ActionPerformed
        init_designation2();
    }//GEN-LAST:event_tf_field12ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        ret_members();
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        ret_members();
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        ret_members();
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        ret_members();
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void tf_field13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field13ActionPerformed
        ret_members();
    }//GEN-LAST:event_tf_field13ActionPerformed

    private void tbl_faculty_membersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_faculty_membersMouseClicked
        select_fm();
    }//GEN-LAST:event_tbl_faculty_membersMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_faculty_members;
    private javax.swing.JTextField tf_field10;
    private javax.swing.JTextField tf_field11;
    private javax.swing.JTextField tf_field12;
    private javax.swing.JTextField tf_field13;
    private javax.swing.JTextField tf_field2;
    private javax.swing.JTextField tf_field3;
    private javax.swing.JTextField tf_field4;
    private javax.swing.JTextField tf_field5;
    private javax.swing.JTextField tf_field6;
    private javax.swing.JTextField tf_field7;
    private javax.swing.JTextField tf_field8;
    private javax.swing.JTextField tf_field9;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        System.setProperty("pool_db", "db_cis_cosca");
        System.setProperty("pool_password", "password");

        List<Faculty_member_designation_groups.to_faculty_member_designation_groups> groups = Faculty_member_designation_groups.ret_data(" order by group_name asc ");

        if (!groups.isEmpty()) {
            Faculty_member_designation_groups.to_faculty_member_designation_groups to = (Faculty_member_designation_groups.to_faculty_member_designation_groups) groups.get(0);
            Field.Combo co = (Field.Combo) tf_field8;
            co.setText("" + to.group_name);
            co.setId("" + to.id);

            Field.Combo co2 = (Field.Combo) tf_field10;
            co2.setText("" + to.group_name);
            co2.setId("" + to.id);

            List<Faculty_member_designations.to_faculty_member_designations> des = Faculty_member_designations.ret_data(" where group_id='" + co.getId() + "' order by designation asc ");
            if (!des.isEmpty()) {
                Faculty_member_designations.to_faculty_member_designations t = (Faculty_member_designations.to_faculty_member_designations) des.get(0);
                Field.Combo de = (Field.Combo) tf_field4;
                de.setText("" + t.designation);
                de.setId("" + t.designation);

                Field.Combo de2 = (Field.Combo) tf_field12;
                de2.setText("" + t.designation);
                de2.setId("" + t.designation);

            }
        }

        List<Departments.to_departments> deps = Departments.ret_data(" order by department_name  asc ");
        if (!deps.isEmpty()) {
            Departments.to_departments to = (Departments.to_departments) deps.get(0);
            Field.Combo co = (Field.Combo) tf_field2;
            co.setText("" + to.department_name);
            co.setId("" + to.id);

            Field.Combo de2 = (Field.Combo) tf_field9;
            de2.setText("" + to.department_name);
            de2.setId("" + to.id);

            List<Colleges.to_colleges> colleges = Colleges.ret_data(" where department_id='" + co.getId() + "' order by college_name ");

            if (!colleges.isEmpty()) {
                Colleges.to_colleges coll = (Colleges.to_colleges) colleges.get(0);
                Field.Combo co1 = (Field.Combo) tf_field3;
                co1.setText(coll.college_name);
                co1.setId("" + coll.id);

                Field.Combo col3 = (Field.Combo) tf_field11;
                col3.setText("" + coll.college_name);
                col3.setId("" + coll.id);
            }
        }

        init_tbl_faculty_members(tbl_faculty_members);
        ret_members();

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

    private void init_groups() {
        List<Faculty_member_designation_groups.to_faculty_member_designation_groups> groups = Faculty_member_designation_groups.ret_data(" order by group_name asc ");
        Object[][] obj = new Object[groups.size()][1];
        int i = 0;
        for (Faculty_member_designation_groups.to_faculty_member_designation_groups to : groups) {
            obj[i][0] = " " + to.group_name;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field8.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field8, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Faculty_member_designation_groups.to_faculty_member_designation_groups to = groups.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field8;
                co.setText("" + to.group_name);
                co.setId("" + to.id);

                List<Faculty_member_designations.to_faculty_member_designations> des = Faculty_member_designations.ret_data(" where group_id='" + co.getId() + "' order by designation asc ");
                if (!des.isEmpty()) {
                    Faculty_member_designations.to_faculty_member_designations t = (Faculty_member_designations.to_faculty_member_designations) des.get(0);
                    Field.Combo de = (Field.Combo) tf_field4;
                    de.setText("" + t.designation);
                    de.setId("" + t.designation);
                }
            }
        });
    }

    private void init_groups2() {
        List<Faculty_member_designation_groups.to_faculty_member_designation_groups> groups = Faculty_member_designation_groups.ret_data(" order by group_name asc ");
        Object[][] obj = new Object[groups.size()][1];
        int i = 0;
        for (Faculty_member_designation_groups.to_faculty_member_designation_groups to : groups) {
            obj[i][0] = " " + to.group_name;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field10.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field10, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Faculty_member_designation_groups.to_faculty_member_designation_groups to = groups.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field10;
                co.setText("" + to.group_name);
                co.setId("" + to.id);

                List<Faculty_member_designations.to_faculty_member_designations> des = Faculty_member_designations.ret_data(" where group_id='" + co.getId() + "' order by designation asc ");
                if (!des.isEmpty()) {
                    Faculty_member_designations.to_faculty_member_designations t = (Faculty_member_designations.to_faculty_member_designations) des.get(0);
                    Field.Combo de = (Field.Combo) tf_field12;
                    de.setText("" + t.designation);
                    de.setId("" + t.designation);
                }
                ret_members();
            }
        });
    }

    private void init_designation() {
        Field.Combo gr = (Field.Combo) tf_field8;
        List<Faculty_member_designations.to_faculty_member_designations> groups = Faculty_member_designations.ret_data(" where group_id='" + gr.getId() + "' order by designation asc ");

        Object[][] obj = new Object[groups.size()][1];
        int i = 0;
        for (Faculty_member_designations.to_faculty_member_designations to : groups) {
            obj[i][0] = " " + to.designation;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field4.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field4, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Faculty_member_designations.to_faculty_member_designations to = groups.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field4;
                co.setText("" + to.designation);
                co.setId("" + to.id);

            }
        });
    }

    private void init_designation2() {
        Field.Combo gr = (Field.Combo) tf_field10;
        List<Faculty_member_designations.to_faculty_member_designations> groups = Faculty_member_designations.ret_data(" where group_id='" + gr.getId() + "' order by designation asc ");

        Object[][] obj = new Object[groups.size()][1];
        int i = 0;
        for (Faculty_member_designations.to_faculty_member_designations to : groups) {
            obj[i][0] = " " + to.designation;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field12.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field12, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Faculty_member_designations.to_faculty_member_designations to = groups.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field12;
                co.setText("" + to.designation);
                co.setId("" + to.id);

                ret_members();
            }
        });
    }

    private void group() {
        Window p = (Window) this;
        Dlg_faculty_member_designation_group nd = Dlg_faculty_member_designation_group.create(p, true);
        nd.setTitle("");
//        nd.do_pass(services);
        nd.setCallback(new Dlg_faculty_member_designation_group.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_faculty_member_designation_group.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void designation() {
        Window p = (Window) this;
        Dlg_faculty_member_designations nd = Dlg_faculty_member_designations.create(p, true);
        nd.setTitle("");
//        nd.do_pass(services);
        nd.setCallback(new Dlg_faculty_member_designations.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_faculty_member_designations.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void init_departments() {
        List<Departments.to_departments> deps = Departments.ret_data(" order by department_name  asc ");

        Object[][] obj = new Object[deps.size()][1];
        int i = 0;
        for (Departments.to_departments to : deps) {
            obj[i][0] = " " + to.department_name;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field2.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field2, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Departments.to_departments to = deps.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field2;
                co.setText("" + to.department_name);
                co.setId("" + to.id);

                List<Colleges.to_colleges> colleges = Colleges.ret_data(" where department_id='" + co.getId() + "' order by college_name ");

                if (!colleges.isEmpty()) {
                    Colleges.to_colleges coll = (Colleges.to_colleges) colleges.get(0);
                    Field.Combo co1 = (Field.Combo) tf_field3;
                    co1.setText(coll.college_name);
                    co1.setId("" + coll.id);
                }

            }
        });
    }

    private void init_departments2() {
        List<Departments.to_departments> deps = Departments.ret_data(" order by department_name  asc ");

        Object[][] obj = new Object[deps.size()][1];
        int i = 0;
        for (Departments.to_departments to : deps) {
            obj[i][0] = " " + to.department_name;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field9.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field9, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Departments.to_departments to = deps.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field9;
                co.setText("" + to.department_name);
                co.setId("" + to.id);

                List<Colleges.to_colleges> colleges = Colleges.ret_data(" where department_id='" + co.getId() + "' order by college_name ");

                if (!colleges.isEmpty()) {
                    Colleges.to_colleges coll = (Colleges.to_colleges) colleges.get(0);
                    Field.Combo co1 = (Field.Combo) tf_field11;
                    co1.setText(coll.college_name);
                    co1.setId("" + coll.id);
                }
                ret_members();

            }
        });
    }

    private void init_colleges() {

        Field.Combo co2 = (Field.Combo) tf_field2;
        List<Colleges.to_colleges> colleges = Colleges.ret_data(" where department_id='" + co2.getId() + "' order by college_name ");

        Object[][] obj = new Object[colleges.size()][1];
        int i = 0;
        for (Colleges.to_colleges to : colleges) {
            obj[i][0] = " " + to.college_name;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field3.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field3, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Colleges.to_colleges to = colleges.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field3;
                co.setText("" + to.college_name);
                co.setId("" + to.id);

            }
        });
    }

    private void init_colleges2() {

        Field.Combo co2 = (Field.Combo) tf_field9;
        List<Colleges.to_colleges> colleges = Colleges.ret_data(" where department_id='" + co2.getId() + "' order by college_name ");

        Object[][] obj = new Object[colleges.size()][1];
        int i = 0;
        for (Colleges.to_colleges to : colleges) {
            obj[i][0] = " " + to.college_name;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field11.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field11, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Colleges.to_colleges to = colleges.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field11;
                co.setText("" + to.college_name);
                co.setId("" + to.id);
                ret_members();

            }
        });
    }

    private void department() {
        Window p = (Window) this;
        Dlg_departments nd = Dlg_departments.create(p, true);
        nd.setTitle("");
//        nd.do_pass(services);
        nd.setCallback(new Dlg_departments.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_departments.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void colleges() {
        Window p = (Window) this;
        Dlg_colleges nd = Dlg_colleges.create(p, true);
        nd.setTitle("");
//        nd.do_pass(services);
        nd.setCallback(new Dlg_colleges.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_colleges.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    //<editor-fold defaultstate="collapsed" desc=" save ">
    //<editor-fold defaultstate="collapsed" desc=" faculty_members "> 
    public static ArrayListModel tbl_faculty_members_ALM;
    public static Tblfaculty_membersModel tbl_faculty_members_M;

    public static void init_tbl_faculty_members(JTable tbl_faculty_members) {
        tbl_faculty_members_ALM = new ArrayListModel();
        tbl_faculty_members_M = new Tblfaculty_membersModel(tbl_faculty_members_ALM);
        tbl_faculty_members.setModel(tbl_faculty_members_M);
        tbl_faculty_members.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_faculty_members.setRowHeight(25);
        int[] tbl_widths_faculty_members = {120, 200, 200, 200, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_faculty_members.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_faculty_members, i, tbl_widths_faculty_members[i]);
        }
        Dimension d = tbl_faculty_members.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_faculty_members.getTableHeader().setPreferredSize(d);
        tbl_faculty_members.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_faculty_members.setRowHeight(25);
        tbl_faculty_members.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_faculty_members(List<to_faculty_members> acc) {
        tbl_faculty_members_ALM.clear();
        tbl_faculty_members_ALM.addAll(acc);
    }

    public static class Tblfaculty_membersModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Name", "Department", "College", "Designation", "Status", "", "level", "college_id", "college", "department_id", "department", "is_fulltime", "is_acad", "dean_college_id", "dean_college_name", "rank_id", "rank", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded"
        };

        public Tblfaculty_membersModel(ListModel listmodel) {
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
            to_faculty_members tt = (to_faculty_members) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.fname + " " + tt.mi + " " + tt.lname;
                case 1:
                    return " " + tt.department;
                case 2:
                    return " " + tt.college;
                case 3:
                    return " " + tt.designation + " - " + tt.group_name;
                case 4:
                    return " Delete";
                case 5:
                    return tt.level_id;
                case 6:
                    return tt.level;
                case 7:
                    return tt.college_id;
                case 8:
                    return tt.college;
                case 9:
                    return tt.department_id;
                case 10:
                    return tt.department;
                case 11:
                    return tt.is_fulltime;
                case 12:
                    return tt.is_acad;
                case 13:
                    return tt.dean_college_id;
                case 14:
                    return tt.dean_college_name;
                case 15:
                    return tt.dean_college_name;
                case 16:
                    return tt.dean_college_name;
                case 17:
                    return tt.created_at;
                case 18:
                    return tt.updated_at;
                case 19:
                    return tt.created_by;
                case 20:
                    return tt.updated_by;
                case 21:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }

    private void ret_members() {
        String where = "";
        List<Faculty_members.to_faculty_members> members = Faculty_members.ret_data(where);
        loadData_faculty_members(members);
        jLabel2.setText("" + members.size());
    }
//</editor-fold> 

    private void save_fm() {
        int row = tbl_faculty_members.getSelectedRow();
        Field.Combo dep = (Field.Combo) tf_field2;
        Field.Combo col = (Field.Combo) tf_field3;
        Field.Combo gr = (Field.Combo) tf_field8;
        Field.Combo des = (Field.Combo) tf_field4;
        if (row < 0) {

            int id = 0;
            String fname = tf_field5.getText();
            String lname = tf_field7.getText();
            String mi = tf_field6.getText();
            int level_id = 0;
            String level = "";
            int college_id = FitIn.toInt(col.getId());
            String college = col.getText();
            int department_id = FitIn.toInt(dep.getId());
            String department = dep.getText();
            int group_id = FitIn.toInt(gr.getId());
            String group_name = gr.getText();
            int designation_id = FitIn.toInt(des.getId());
            String designation = des.getText();
            int is_fulltime = 3;
            if (jCheckBox1.isSelected()) {
                is_fulltime = 1;
            }
            if (jCheckBox2.isSelected()) {
                is_fulltime = 2;
            }

            int is_acad = 0;
            int dean_college_id = 0;
            String dean_college_name = "";
            String created_at = DateType.now();
            String updated_at = DateType.now();
            String created_by = MyUser.getUser_id();
            String updated_by = MyUser.getUser_id();
            int status = 1;
            int is_uploaded = 0;

            Faculty_members.to_faculty_members to = new to_faculty_members(id, fname, lname, mi, level_id, level, college_id, college, department_id, department, group_id, group_name, designation_id, designation, is_fulltime, is_acad, dean_college_id, dean_college_name, created_at, updated_at, created_by, updated_by, status, is_uploaded);
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
//            nd.do_pass(services);
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    Faculty_members.add_data(to);
                    ret_members();
                    Alert.set(1, "");
                    clear_fm();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);

        } else {
            Faculty_members.to_faculty_members to2 = (Faculty_members.to_faculty_members) tbl_faculty_members_ALM.get(row);

            int id = to2.id;
            String fname = tf_field5.getText();
            String lname = tf_field7.getText();
            String mi = tf_field6.getText();
            int level_id = to2.level_id;
            String level = to2.level;
            int college_id = FitIn.toInt(col.getId());
            String college = col.getText();
            int department_id = FitIn.toInt(dep.getId());
            String department = dep.getText();
            int group_id = FitIn.toInt(gr.getId());
            String group_name = gr.getText();
            int designation_id = FitIn.toInt(des.getId());
            String designation = des.getText();
            int is_fulltime = 3;
            if (jCheckBox1.isSelected()) {
                is_fulltime = 1;
            }
            if (jCheckBox2.isSelected()) {
                is_fulltime = 2;
            }

            int is_acad = to2.is_acad;
            int dean_college_id = to2.dean_college_id;
            String dean_college_name = to2.dean_college_name;
            String created_at = to2.created_at;
            String updated_at = DateType.now();
            String created_by = to2.created_by;
            String updated_by = MyUser.getUser_id();
            int status = to2.status;
            int is_uploaded = 2;

            Faculty_members.to_faculty_members to = new to_faculty_members(id, fname, lname, mi, level_id, level, college_id, college, department_id, department, group_id, group_name, designation_id, designation, is_fulltime, is_acad, dean_college_id, dean_college_name, created_at, updated_at, created_by, updated_by, status, is_uploaded);
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
//            nd.do_pass(services);
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    Faculty_members.update_data(to);
                    ret_members();
                    Alert.set(2, "");
                    clear_fm();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);

        }
    }

    private void select_fm() {
        int row = tbl_faculty_members.getSelectedRow();
        if (row < 0) {
            return;
        }
        int col2 = tbl_faculty_members.getSelectedColumn();
        Faculty_members.to_faculty_members to = (Faculty_members.to_faculty_members) tbl_faculty_members_ALM.get(row);
        if (col2 == 4) {
            Window p = (Window) this;
            Dlg_confirm_delete nd = Dlg_confirm_delete.create(p, true);
            nd.setTitle("");
//            nd.do_pass(services);
            nd.setCallback(new Dlg_confirm_delete.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_delete.OutputData data) {
                    closeDialog.ok();
                    Faculty_members.delete_data(to);
                    ret_members();
                    Alert.set(3, "");
                    clear_fm();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        } else {
            Field.Combo dep = (Field.Combo) tf_field2;
            Field.Combo col = (Field.Combo) tf_field3;
            Field.Combo gr = (Field.Combo) tf_field8;
            Field.Combo des = (Field.Combo) tf_field4;

            tf_field5.setText(to.fname);
            tf_field6.setText(to.mi);
            tf_field7.setText(to.lname);

            dep.setText(to.department);
            dep.setId("" + to.department_id);
            col.setText(to.college);
            col.setId("" + to.college_id);
            gr.setText(to.group_name);
            gr.setId("" + to.group_id);
            des.setText(to.designation);
            des.setId("" + to.designation_id);
            if (to.is_fulltime == 1) {
                jCheckBox1.setSelected(true);
            }
            if (to.is_fulltime == 2) {
                jCheckBox2.setSelected(true);
            }
            if (to.is_fulltime == 3) {
                jCheckBox3.setSelected(true);
            }

            if (to.status == 1) {
                jCheckBox4.setSelected(true);
            } else {
                jCheckBox5.setSelected(true);
            }
        }
    }

    private void clear_fm() {
        tf_field5.setText("");
        tf_field6.setText("");
        tf_field7.setText("");
        tbl_faculty_members.clearSelection();
        tf_field5.grabFocus();
    }
    //</editor-fold>
}
