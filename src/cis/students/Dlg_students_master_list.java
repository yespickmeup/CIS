/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.students;

import cis.academic.Academic_offerings;
import cis.colleges.Colleges;
import cis.departments.Departments;
import cis.students.Students.to_students;
import cis.utils.Alert;
import cis.utils.TableRenderer;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Toolkit;
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
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.util.DateType;

/**
 *
 * @author User
 */
public class Dlg_students_master_list extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_students_master_list
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
    private Dlg_students_master_list(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_students_master_list(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_students_master_list() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_students_master_list myRef;

    private void setThisRef(Dlg_students_master_list myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_students_master_list> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_students_master_list create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_students_master_list create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_students_master_list dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_students_master_list((java.awt.Frame) parent, false);
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
            Dlg_students_master_list dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_students_master_list((java.awt.Dialog) parent, false);
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

        Dlg_students_master_list dialog = Dlg_students_master_list.create(new javax.swing.JFrame(), true);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
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
        jButton1 = new Button.Primary();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_students = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Filter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
        jCheckBox2.setText("All");

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        jButton1.setText("New Record");
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tf_field125, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_field126))
                            .addComponent(tf_field127)))
                    .addComponent(tf_field128))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field125, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field126, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field127, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox3))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field128, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

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
        jScrollPane1.setViewportView(tbl_students);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new_record();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_students;
    private javax.swing.JTextField tf_field125;
    private javax.swing.JTextField tf_field126;
    private javax.swing.JTextField tf_field127;
    private javax.swing.JTextField tf_field128;
    // End of variables declaration//GEN-END:variables
    private void myInit() {

//        System.setProperty("pool_db", "db_cis_cosca");
//        System.setProperty("pool_password", "password");
        init_key();
        init_tbl_students(tbl_students);
        deps = Departments.ret_data(" order by department_name  asc ");

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
        int[] tbl_widths_students = {100, 180, 80, 120, 140, 70, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_students.length; i < n; i++) {
            if (i == 3) {
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
    }

    public static void loadData_students(List<to_students> acc) {
        tbl_students_ALM.clear();
        tbl_students_ALM.addAll(acc);
    }

    public static class TblstudentsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Student No", "Name", "BirthDate", "Address", "Course/Year", "Status", "", "", "", "current_address", "permanent_address", "email_address", "postal_code", "tel_no", "mobile_no", "date_of_birth", "place_of_birth", "age", "gender", "citizenship", "religion", "civil_status", "spouse_name", "date_of_communion", "date_of_confirmation", "is_right_handed", "is_indigenous", "indigenous_name", "level_id", "level", "college_id", "college", "department_id", "department", "year_level", "year_level_status", "preferred_course1", "preferred_course2", "preferred_course3", "father_name", "father_citizenship", "father_home_address", "father_email_address", "father_mobile_no", "father_occupation", "father_employer", "father_business_address", "father_business_tel_no", "father_educational_attainment", "father_last_school_attended", "mother_name", "mother_citizenship", "mother_home_address", "mother_email_address", "mother_mobile_no", "mother_occupation", "mother_employer", "mother_business_address", "mother_business_tel_no", "mother_educational_attainment", "mother_last_school_attended", "guardian_name", "guardian_mailing_address", "guardian_telephone_no", "grade_school_name", "grade_school_region", "grade_school_school_year", "grade_school_awards", "high_school_name", "high_school_region", "high_school_school_year", "high_school_awards", "college_school_name", "college_school_region", "college_school_school_year", "college_awards", "junior_high_name", "junior_high_region", "junior_high_year", "junior_high_awards", "tesda_name", "tesda_region", "tesda_year", "tesda_awards", "sibling1", "sibling2", "sibling3", "sibling4", "sibling5", "sibling6", "sibling7", "sibling8", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded"
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
            to_students tt = (to_students) getRow(row);
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
                    return " " + tt.course_code + " - " + tt.year_level;
                case 5:
                    return " " + tt.year_level_status;
                case 6:
                    return tt.first_name;
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
        String where = "";
        List<Students.to_students> students = Students.ret_data(where);
        loadData_students(students);

    }
//</editor-fold> 

    private void new_record() {
        Window p = (Window) this;
        Dlg_student_masterlist_new_record nd = Dlg_student_masterlist_new_record.create(p, true);
        nd.setTitle("");
//        nd.do_pass(services);
        nd.setCallback(new Dlg_student_masterlist_new_record.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_student_masterlist_new_record.OutputData data) {
                closeDialog.ok();
                Students.manual_enroll(data.student);
                Alert.set(1, "");
                ret_students();
            }
        });
        nd.setLocationRelativeTo(null);
        nd.setVisible(true);
    }

}
