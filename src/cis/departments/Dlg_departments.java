/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.departments;

import cis.colleges.*;
import cis.colleges.Colleges.to_colleges;
import cis.departments.Departments.to_departments;
import cis.users.MyUser;
import cis.users.Users;
import cis.utils.Alert;
import cis.utils.DateType;
import cis.utils.Dlg_confirm_action;
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
public class Dlg_departments extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_colleges
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
    private Dlg_departments(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_departments(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_departments() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_departments myRef;

    private void setThisRef(Dlg_departments myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_departments> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_departments create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_departments create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_departments dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_departments((java.awt.Frame) parent, false);
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
            Dlg_departments dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_departments((java.awt.Dialog) parent, false);
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

        Dlg_departments dialog = Dlg_departments.create(new javax.swing.JFrame(), true);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_colleges = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_field = new Field.Input();
        jLabel7 = new javax.swing.JLabel();
        tf_user_screen_name1 = new Field.Combo();
        jButton5 = new Button.Default();
        jButton2 = new Button.Success();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tbl_colleges.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_colleges.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_collegesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_colleges);

        jLabel1.setText("No. of rows:");

        jLabel2.setText("0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Department:");

        tf_field.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Admin:");

        tf_user_screen_name1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_user_screen_name1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_user_screen_name1MouseClicked(evt);
            }
        });
        tf_user_screen_name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_user_screen_name1ActionPerformed(evt);
            }
        });

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

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Status:");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Active/Inactive");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_field)
                            .addComponent(tf_user_screen_name1))))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_user_screen_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(13, 13, 13))
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
        new_college();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        save_college();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tf_user_screen_name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_user_screen_name1ActionPerformed
        init_users();
    }//GEN-LAST:event_tf_user_screen_name1ActionPerformed

    private void tf_user_screen_name1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_user_screen_name1MouseClicked
        init_users();
    }//GEN-LAST:event_tf_user_screen_name1MouseClicked

    private void tbl_collegesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_collegesMouseClicked
        select_college();
    }//GEN-LAST:event_tbl_collegesMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_colleges;
    private javax.swing.JTextField tf_field;
    private javax.swing.JTextField tf_user_screen_name1;
    // End of variables declaration//GEN-END:variables

    private void myInit() {

        System.setProperty("pool_db", "db_cis_cosca");
        System.setProperty("pool_password", "password");

        init_key();
        init_tbl_colleges(tbl_colleges);
        ret_colleges();
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

    //<editor-fold defaultstate="collapsed" desc=" departments "> 
    public static ArrayListModel tbl_colleges_ALM;
    public static TblcollegesModel tbl_colleges_M;

    public static void init_tbl_colleges(JTable tbl_colleges) {
        tbl_colleges_ALM = new ArrayListModel();
        tbl_colleges_M = new TblcollegesModel(tbl_colleges_ALM);
        tbl_colleges.setModel(tbl_colleges_M);
        tbl_colleges.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_colleges.setRowHeight(25);
        int[] tbl_widths_colleges = {100, 120, 60, 50, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_colleges.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_colleges, i, tbl_widths_colleges[i]);
        }
        Dimension d = tbl_colleges.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_colleges.getTableHeader().setPreferredSize(d);
        tbl_colleges.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_colleges.setRowHeight(25);
        tbl_colleges.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_colleges(List<to_departments> acc) {
        tbl_colleges_ALM.clear();
        tbl_colleges_ALM.addAll(acc);
    }

    public static class TblcollegesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "College", "Admin", "Status", "", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded"
        };

        public TblcollegesModel(ListModel listmodel) {
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
            to_departments tt = (to_departments) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.department_name;
                case 1:
                    return " " + tt.department_admin_name;
                case 2:
                    if (tt.status == 0) {
                        return " Inactive";
                    } else {
                        return " Active";
                    }
                case 3:
                    return " Delete";
                case 4:
                    return tt.created_at;
                case 5:
                    return tt.updated_at;
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

    private void ret_colleges() {
        String where = "";
        List<Departments.to_departments> colleges = Departments.ret_data(where);
        loadData_colleges(colleges);
        jLabel2.setText("" + colleges.size());
    }

    private void new_college() {
        tf_field.setText("");
        Field.Combo ad = (Field.Combo) tf_user_screen_name1;
        ad.setId("");
        ad.setText("");
        tbl_colleges.clearSelection();
        tf_field.grabFocus();
    }

    private void save_college() {
        int row = tbl_colleges.getSelectedRow();
        if (row < 0) {
            int id = 0;
            String department_name = tf_field.getText();
            int college_id = 0;
            Field.Combo co = (Field.Combo) tf_user_screen_name1;
            int department_admin_id = FitIn.toInt(co.getId());
            String department_admin_name = co.getText();
            String created_at = DateType.now();
            String updated_at = DateType.now();
            String created_by = MyUser.getUser_id();
            String updated_by = MyUser.getUser_id();

            int status = 1;
            if (!jCheckBox1.isSelected()) {
                status = 0;
            }
            int is_uploaded = 0;

            Departments.to_departments coll = new Departments.to_departments(id, department_name, college_id, department_admin_id, department_admin_name, created_at, updated_at, created_by, updated_by, status, is_uploaded);

            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    Departments.add_data(coll);
                    Alert.set(1, "");
                    ret_colleges();
                    new_college();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);

        } else {
            Departments.to_departments to = (Departments.to_departments) tbl_colleges_ALM.get(row);
            int id = to.id;
            String department_name = tf_field.getText();
            int college_id = to.college_id;
            Field.Combo co = (Field.Combo) tf_user_screen_name1;
            int department_admin_id = FitIn.toInt(co.getId());
            String department_admin_name = co.getText();
            String created_at = to.created_at;
            String updated_at = DateType.now();
            String created_by = to.created_by;
            String updated_by = MyUser.getUser_id();
            int status = 1;
            if (!jCheckBox1.isSelected()) {
                status = 0;
            }
            int is_uploaded = 2;

            Departments.to_departments coll = new Departments.to_departments(id, department_name, college_id, department_admin_id, department_admin_name, created_at, updated_at, created_by, updated_by, status, is_uploaded);

            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");

            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    Departments.update_data(coll);
                    Alert.set(2, "");
                    ret_colleges();
                    new_college();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);

        }
    }

    private void select_college() {
        int row = tbl_colleges.getSelectedRow();
        if (row < 0) {
            return;
        }
        int col = tbl_colleges.getSelectedColumn();
        Departments.to_departments to = (Departments.to_departments ) tbl_colleges_ALM.get(row);
        if (col == 3) {
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    Departments.delete_data(to);
                    Alert.set(3, "");
                    ret_colleges();
                    new_college();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        } else {

            Field.Combo co = (Field.Combo) tf_user_screen_name1;
            tf_field.setText(to.department_name);
            co.setId("" + to.department_admin_id);
            co.setText(to.department_admin_name);
            if (to.status == 0) {
                jCheckBox1.setSelected(false);
            } else {
                jCheckBox1.setSelected(true);
            }
        }

    }

    private void init_departments() {

        String where = " order by user_screen_name asc  ";
        List<Users.to_users> users = new ArrayList();
        List<Users.to_users> users1 = Users.ret_data(where);
        Users.to_users t = new Users.to_users(0, "", "", "", "", "", "", "", 0,0);
        users.add(t);
        users.addAll(users1);
        Object[][] obj = new Object[users.size()][1];
        int i = 0;
        for (Users.to_users to : users) {
            obj[i][0] = " " + to.user_screen_name;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_user_screen_name1.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_user_screen_name1, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Users.to_users to = users.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_user_screen_name1;
                co.setText("" + to.user_screen_name);
                co.setId("" + to.id);

            }
        });
    }

    private void init_users() {

        String where = " order by user_screen_name asc  ";
        List<Users.to_users> users = new ArrayList();
        List<Users.to_users> users1 = Users.ret_data(where);
        Users.to_users t = new Users.to_users(0, "", "", "", "", "", "", "", 0,0);
        users.add(t);
        users.addAll(users1);
        Object[][] obj = new Object[users.size()][1];
        int i = 0;
        for (Users.to_users to : users) {
            obj[i][0] = " " + to.user_screen_name;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_user_screen_name1.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_user_screen_name1, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Users.to_users to = users.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_user_screen_name1;
                co.setText("" + to.user_screen_name);
                co.setId("" + to.id);

            }
        });
    }

//</editor-fold> 
}
