/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.subjects;

import cis.subjects.Subject_prerequisites.to_subject_prerequisites;
import cis.users.MyUser;
import cis.utils.Alert;
import cis.utils.DateType;
import cis.utils.Dlg_confirm_delete;
import cis.utils.TableRenderer;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
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

/**
 *
 * @author Ronescape
 */
public class Dlg_subject_new extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_subject_new
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

        public final String subject_code;
        public final String description;
        public final String group;
        public final String group_id;
        public final int status;
        public final double lec_units;
        public final double lab_units;
        public final List<Subject_prerequisites.to_subject_prerequisites> prerequisites;

        public OutputData(String subject_code, String description, String group, String group_id, int status, double lec_units, double lab_units, List<Subject_prerequisites.to_subject_prerequisites> prerequisites) {
            this.subject_code = subject_code;
            this.description = description;
            this.group = group;
            this.group_id = group_id;
            this.status = status;
            this.lec_units = lec_units;
            this.lab_units = lab_units;
            this.prerequisites = prerequisites;
        }

    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_subject_new(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_subject_new(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_subject_new() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_subject_new myRef;

    private void setThisRef(Dlg_subject_new myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_subject_new> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_subject_new create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_subject_new create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_subject_new dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_subject_new((java.awt.Frame) parent, false);
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
            Dlg_subject_new dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_subject_new((java.awt.Dialog) parent, false);
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

        Dlg_subject_new dialog = Dlg_subject_new.create(new javax.swing.JFrame(), true);
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
        jLabel6 = new javax.swing.JLabel();
        tf_field = new Field.Input();
        tf_field1 = new Field.Input();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_field2 = new Field.Combo();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_field3 = new Field.Input();
        jLabel11 = new javax.swing.JLabel();
        tf_field4 = new Field.Input();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_subject_prerequisites = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        tf_field5 = new Field.Input();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new Button.Default();
        jButton2 = new Button.Success();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Subject Code:");

        tf_field.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        tf_field1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Description:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Group:");

        tf_field2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Active/Inactive");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Status:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Units [Lec]:");

        tf_field3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Units [Lab]:");

        tf_field4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(244, 243, 243));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pre-Requisites", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tbl_subject_prerequisites.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_subject_prerequisites.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_subject_prerequisitesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_subject_prerequisites);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Search Subject:");

        tf_field5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field5ActionPerformed(evt);
            }
        });

        jLabel1.setText("No. of rows:");

        jLabel2.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field5)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(5, 5, 5))
        );

        jButton5.setText("Cancel");
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_field1)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tf_field, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tf_field2)
                                        .addGap(0, 0, 0)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        disposed();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ok();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tf_field2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field2ActionPerformed
        init_groups();
    }//GEN-LAST:event_tf_field2ActionPerformed

    private void tf_field2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field2MouseClicked
        init_groups();
    }//GEN-LAST:event_tf_field2MouseClicked

    private void tf_field5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field5ActionPerformed
        init_search_subjects();
    }//GEN-LAST:event_tf_field5ActionPerformed

    private void tbl_subject_prerequisitesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_subject_prerequisitesMouseClicked
        select_sp();
    }//GEN-LAST:event_tbl_subject_prerequisitesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        groupings();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_subject_prerequisites;
    private javax.swing.JTextField tf_field;
    private javax.swing.JTextField tf_field1;
    private javax.swing.JTextField tf_field2;
    private javax.swing.JTextField tf_field3;
    private javax.swing.JTextField tf_field4;
    private javax.swing.JTextField tf_field5;
    // End of variables declaration//GEN-END:variables

    private void myInit() {

//        System.setProperty("pool_db", "db_cis_cosca");
//        System.setProperty("pool_password", "password");
        init_key();

        init_tbl_subject_prerequisites(tbl_subject_prerequisites);

        group = Subject_groupings.ret_data(" order by description,department asc ");
    }

    int subject_idd = 0;

    public void do_pass(Subjects.to_subjects to) {
        subject_idd = to.id;
        tf_field.setText(to.subject_code);
        tf_field1.setText(to.description);
        tf_field3.setText(FitIn.fmt_woc(to.lecture_units));
        tf_field4.setText(FitIn.fmt_woc(to.lab_units));
        if (to.status == 0) {
            jCheckBox1.setSelected(false);
        } else {
            jCheckBox1.setSelected(true);
        }
        Field.Combo gr = (Field.Combo) tf_field2;
        gr.setText(to.subject_group + " - " + to.department);
        gr.setId("" + to.subject_group_id);
        ret_sp();
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
    //<editor-fold defaultstate="collapsed" desc=" subject_prerequisites "> 
    public static ArrayListModel tbl_subject_prerequisites_ALM;
    public static Tblsubject_prerequisitesModel tbl_subject_prerequisites_M;

    public static void init_tbl_subject_prerequisites(JTable tbl_subject_prerequisites) {
        tbl_subject_prerequisites_ALM = new ArrayListModel();
        tbl_subject_prerequisites_M = new Tblsubject_prerequisitesModel(tbl_subject_prerequisites_ALM);
        tbl_subject_prerequisites.setModel(tbl_subject_prerequisites_M);
        tbl_subject_prerequisites.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_subject_prerequisites.setRowHeight(25);
        int[] tbl_widths_subject_prerequisites = {70, 100, 40, 40, 130, 50, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_subject_prerequisites.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_subject_prerequisites, i, tbl_widths_subject_prerequisites[i]);
        }
        Dimension d = tbl_subject_prerequisites.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_subject_prerequisites.getTableHeader().setPreferredSize(d);
        tbl_subject_prerequisites.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_subject_prerequisites.setRowHeight(25);
        tbl_subject_prerequisites.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_subject_prerequisites(List<to_subject_prerequisites> acc) {
        tbl_subject_prerequisites_ALM.clear();
        tbl_subject_prerequisites_ALM.addAll(acc);
    }

    public static class Tblsubject_prerequisitesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Code", "Description", "Lec", "Lab", "Remarks", "", "created_by", "updated_by", "status", "is_uploaded"
        };

        public Tblsubject_prerequisitesModel(ListModel listmodel) {
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
            to_subject_prerequisites tt = (to_subject_prerequisites) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.subject_code;
                case 1:
                    return " " + tt.description;
                case 2:
                    return " " + FitIn.fmt_woc(tt.lecture_units);
                case 3:
                    return " " + FitIn.fmt_woc(tt.lab_units);
                case 4:
                    return " " + tt.remarks;
                case 5:
                    return " Delete";
                case 6:
                    return tt.created_by;
                case 7:
                    return tt.updated_by;
                case 8:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }

    private void ret_sp() {
        String where = " where ref_subject_id='" + subject_idd + "' ";
        List<Subject_prerequisites.to_subject_prerequisites> datas = Subject_prerequisites.ret_data(where);
        loadData_subject_prerequisites(datas);
        jLabel2.setText("" + datas.size());
    }
//</editor-fold> 

    private void ok() {

        String subject_code = tf_field.getText();
        String description = tf_field1.getText();
        Field.Combo gr = (Field.Combo) tf_field2;
        String group1 = gr.getText();
        String group_id = gr.getId();
        int status = 0;
        if (jCheckBox1.isSelected()) {
            status = 1;
        }
        double lec_units = FitIn.toDouble(tf_field3.getText());
        double lab_units = FitIn.toDouble(tf_field4.getText());
        List<Subject_prerequisites.to_subject_prerequisites> prerequisites = tbl_subject_prerequisites_ALM;
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(subject_code, description, group1, group_id, status, lec_units, lab_units, prerequisites));
        }
    }

    List<Subject_groupings.to_subject_groupings> group = new ArrayList();

    private void init_groups() {
        Object[][] obj = new Object[group.size()][1];
        int i = 0;
        for (Subject_groupings.to_subject_groupings to : group) {
            obj[i][0] = " " + to.description + " - " + to.department;
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
                Subject_groupings.to_subject_groupings to = group.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field2;
                co.setText("" + to.description + " - " + to.department);
                co.setId("" + to.id);

            }
        });
    }

    private void init_search_subjects() {
        String search = tf_field5.getText();
        String where = " where subject_code like '%" + search + "%' or description like '%" + search + "%' order by description asc ";
        List<Subjects.to_subjects> subjects = Subjects.ret_data(where);
        Object[][] obj = new Object[subjects.size()][4];
        int i = 0;
        for (Subjects.to_subjects to : subjects) {
            obj[i][0] = " " + to.subject_code;
            obj[i][1] = " " + to.description;
            obj[i][2] = " " + FitIn.fmt_woc(to.lecture_units);
            obj[i][3] = " " + FitIn.fmt_woc(to.lab_units);
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {80, tf_field5.getWidth() - 140, 30, 30};
        int width = 0;
        String[] col_names = {"", "", "", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field5, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {

                Subjects.to_subjects to = subjects.get(data.selected_row);
                remarks(to);

            }
        });
    }

    private void remarks(Subjects.to_subjects to) {
        Window p = (Window) this;
        Dlg_subject_new_remarks nd = Dlg_subject_new_remarks.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_subject_new_remarks.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_subject_new_remarks.OutputData data) {
                closeDialog.ok();
                if (subject_idd == 0) {
                    int id = 0;
                    int ref_subject_id = 0;
                    int main_subject_id = to.id;
                    String subject_code = to.subject_code;
                    String description = to.description;
                    double lecture_units = to.lecture_units;
                    double lab_units = to.lab_units;
                    String remarks = data.remarks;
                    String created_at = DateType.now();
                    String updated_at = DateType.now();
                    String created_by = MyUser.getUser_id();
                    String updated_by = MyUser.getUser_id();
                    int status = 1;
                    int is_uploaded = 0;
                    Subject_prerequisites.to_subject_prerequisites sp = new to_subject_prerequisites(id, ref_subject_id, main_subject_id, subject_code, description, lecture_units, lab_units, remarks, created_at, updated_at, created_by, updated_by, status, is_uploaded);

                    tbl_subject_prerequisites_ALM.add(sp);
                    Alert.set(1, "");
                    jLabel2.setText("" + tbl_subject_prerequisites_ALM.size());
                } else {
                    int id = 0;
                    int ref_subject_id = subject_idd;
                    int main_subject_id = to.id;
                    String subject_code = to.subject_code;
                    String description = to.description;
                    double lecture_units = to.lecture_units;
                    double lab_units = to.lab_units;
                    String remarks = data.remarks;
                    String created_at = DateType.now();
                    String updated_at = DateType.now();
                    String created_by = MyUser.getUser_id();
                    String updated_by = MyUser.getUser_id();
                    int status = 1;
                    int is_uploaded = 0;
                    Subject_prerequisites.to_subject_prerequisites sp = new to_subject_prerequisites(id, ref_subject_id, main_subject_id, subject_code, description, lecture_units, lab_units, remarks, created_at, updated_at, created_by, updated_by, status, is_uploaded);
                    Subject_prerequisites.add_data(sp);
                    Alert.set(1, "");
                    ret_sp();
                }
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void select_sp() {
        int row = tbl_subject_prerequisites.getSelectedRow();
        if (row < 0) {
            return;
        }
        int col = tbl_subject_prerequisites.getSelectedColumn();
        if (col == 5) {//delete
            Window p = (Window) this;
            Dlg_confirm_delete nd = Dlg_confirm_delete.create(p, true);
            nd.setTitle("");
//            nd.do_pass(services);
            nd.setCallback(new Dlg_confirm_delete.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_delete.OutputData data) {
                    closeDialog.ok();
                    if (subject_idd == 0) {
                        tbl_subject_prerequisites_ALM.remove(row);
                    } else {
                        Subject_prerequisites.to_subject_prerequisites to = (Subject_prerequisites.to_subject_prerequisites) tbl_subject_prerequisites_ALM.get(row);
                        Subject_prerequisites.delete_data(to);
                        Alert.set(3, "");
                        ret_sp();
                    }
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        } else {
            Subject_prerequisites.to_subject_prerequisites to = (Subject_prerequisites.to_subject_prerequisites) tbl_subject_prerequisites_ALM.get(row);

            if (subject_idd == 0) {
                Window p = (Window) this;
                Dlg_subject_new_remarks nd = Dlg_subject_new_remarks.create(p, true);
                nd.setTitle("");
                nd.do_pass(to.remarks);
                nd.setCallback(new Dlg_subject_new_remarks.Callback() {

                    @Override
                    public void ok(CloseDialog closeDialog, Dlg_subject_new_remarks.OutputData data) {
                        closeDialog.ok();
                        to.setRemarks(data.remarks);
                        tbl_subject_prerequisites_M.fireTableDataChanged();
                    }
                });
                nd.setLocationRelativeTo(this);
                nd.setVisible(true);
            } else {
                Window p = (Window) this;
                Dlg_subject_new_remarks nd = Dlg_subject_new_remarks.create(p, true);
                nd.setTitle("");
                nd.do_pass(to.remarks);
                nd.setCallback(new Dlg_subject_new_remarks.Callback() {

                    @Override
                    public void ok(CloseDialog closeDialog, Dlg_subject_new_remarks.OutputData data) {
                        closeDialog.ok();
                        int id = to.id;
                        int ref_subject_id = to.ref_subject_id;
                        int main_subject_id = to.main_subject_id;
                        String subject_code = to.subject_code;
                        String description = to.description;
                        double lecture_units = to.lecture_units;
                        double lab_units = to.lab_units;
                        String remarks = data.remarks;
                        String created_at = to.created_at;
                        String updated_at = DateType.now();
                        String created_by = to.created_by;
                        String updated_by = MyUser.getUser_id();
                        int status = to.status;
                        int is_uploaded = 2;
                        Subject_prerequisites.to_subject_prerequisites sp = new to_subject_prerequisites(id, ref_subject_id, main_subject_id, subject_code, description, lecture_units, lab_units, remarks, created_at, updated_at, created_by, updated_by, status, is_uploaded);
                        Subject_prerequisites.update_data(sp);
                        Alert.set(2, "");
                        ret_sp();
                    }
                });
                nd.setLocationRelativeTo(this);
                nd.setVisible(true);
            }
        }
    }

    private void groupings() {
        Window p = (Window) this;
        Dlg_subject_groupings nd = Dlg_subject_groupings.create(p, true);
        nd.setTitle("");
//        nd.do_pass(services);
        nd.setCallback(new Dlg_subject_groupings.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_subject_groupings.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }
}
