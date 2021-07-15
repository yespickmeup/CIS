/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.users;

import cis.colleges.Colleges;
import cis.departments.Departments;
import cis.users.User_departments.to_user_departments;
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
 * @author User
 */
public class Dlg_user_department extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_user_department
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
    private Dlg_user_department(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_user_department(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_user_department() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_user_department myRef;

    private void setThisRef(Dlg_user_department myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_user_department> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_user_department create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_user_department create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_user_department dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_user_department((java.awt.Frame) parent, false);
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
            Dlg_user_department dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_user_department((java.awt.Dialog) parent, false);
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

        Dlg_user_department dialog = Dlg_user_department.create(new javax.swing.JFrame(), true);
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
        tf_field14 = new Field.Combo();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_user_departments = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new Button.Primary();
        jLabel24 = new javax.swing.JLabel();
        tf_field15 = new Field.Combo();

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

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Department:");

        tbl_user_departments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_user_departments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_user_departmentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_user_departments);

        jLabel1.setText("No. of rows:");

        jLabel2.setText("0");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Level/College:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_field14)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tf_field15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(16, 16, 16))
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
        init_departments();
    }//GEN-LAST:event_tf_field14MouseClicked

    private void tf_field14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field14ActionPerformed
        init_departments();
    }//GEN-LAST:event_tf_field14ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        save();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_user_departmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_user_departmentsMouseClicked
        select_department();
    }//GEN-LAST:event_tbl_user_departmentsMouseClicked

    private void tf_field15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field15MouseClicked
        init_colleges();
    }//GEN-LAST:event_tf_field15MouseClicked

    private void tf_field15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field15ActionPerformed
        init_colleges();
    }//GEN-LAST:event_tf_field15ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_user_departments;
    private javax.swing.JTextField tf_field14;
    private javax.swing.JTextField tf_field15;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
//        System.setProperty("pool_db", "db_cis_cosca");
//        System.setProperty("pool_password", "password");
        init_key();
        deps = Departments.ret_data(" order by department_name  asc ");
        if (!deps.isEmpty()) {
            Departments.to_departments to = (Departments.to_departments) deps.get(0);
            Field.Combo dep = (Field.Combo) tf_field14;
            dep.setId("" + to.id);
            dep.setText("" + to.department_name);

        }
        init_tbl_user_departments(tbl_user_departments);
    }
    Users.to_users user = null;

    public void do_pass(Users.to_users to) {
        user = to;
        ret_data();
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
        int[] tbl_widths_customers = {tf_field14.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field14, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Departments.to_departments to = deps.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field14;
                co.setText("" + to.department_name);
                co.setId("" + to.id);

                colleges2 = Colleges.ret_data(" where department_id='" + co.getId() + "' ");
                Field.Combo co1 = (Field.Combo) tf_field15;
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
    //<editor-fold defaultstate="collapsed" desc=" user_departments "> 
    public static ArrayListModel tbl_user_departments_ALM;
    public static Tbluser_departmentsModel tbl_user_departments_M;

    public static void init_tbl_user_departments(JTable tbl_user_departments) {
        tbl_user_departments_ALM = new ArrayListModel();
        tbl_user_departments_M = new Tbluser_departmentsModel(tbl_user_departments_ALM);
        tbl_user_departments.setModel(tbl_user_departments_M);
        tbl_user_departments.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_user_departments.setRowHeight(25);
        int[] tbl_widths_user_departments = {100, 50, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_user_departments.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_user_departments, i, tbl_widths_user_departments[i]);
        }
        Dimension d = tbl_user_departments.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_user_departments.getTableHeader().setPreferredSize(d);
        tbl_user_departments.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_user_departments.setRowHeight(25);
        tbl_user_departments.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_user_departments(List<to_user_departments> acc) {
        tbl_user_departments_ALM.clear();
        tbl_user_departments_ALM.addAll(acc);
    }

    public static class Tbluser_departmentsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Department", "", "user_screen_name", "created_at", "updated_at", "created_by", "updated_by", "status"
        };

        public Tbluser_departmentsModel(ListModel listmodel) {
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
            to_user_departments tt = (to_user_departments) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.college;
                case 1:
                    return " Delete";
                case 2:
                    return tt.user_screen_name;
                case 3:
                    return tt.created_at;
                case 4:
                    return tt.updated_at;
                case 5:
                    return tt.created_by;
                case 6:
                    return tt.updated_by;
                default:
                    return tt.status;
            }
        }
    }

    private void ret_data() {
        String where = " where user_id='" + user.id + "' order by department asc ";
        List<User_departments.to_user_departments> datas = User_departments.ret_data(where);
        loadData_user_departments(datas);
        jLabel2.setText("" + datas.size());
    }
//</editor-fold> 

    private void save() {
        String college1 = tf_field15.getText();
        if (college1.isEmpty()) {
            Alert.set(0, "Please select a department!");
            tf_field14.grabFocus();
            return;
        }
        Field.Combo co = (Field.Combo) tf_field14;
        Field.Combo c = (Field.Combo) tf_field15;
        int id = 0;
        int user_id = user.id;
        String user_screen_name = user.user_screen_name;
        String department = co.getText();
        int department_id = FitIn.toInt(co.getId());
        String college = c.getText();
        String college_id = c.getId();
        String created_at = DateType.now();
        String updated_at = DateType.now();
        int created_by = FitIn.toInt(MyUser.getUser_id());
        int updated_by = FitIn.toInt(MyUser.getUser_id());
        int status = 0;
        User_departments.to_user_departments to = new to_user_departments(id, user_id, user_screen_name, department, department_id, college, college_id, created_at, updated_at, created_by, updated_by, status);
        User_departments.add_data(to);
        ret_data();
        Alert.set(1, "");
    }

    private void select_department() {
        int row = tbl_user_departments.getSelectedRow();
        if (row < 0) {
            return;
        }
        int col = tbl_user_departments.getSelectedColumn();
        if (col == 1) {
            final User_departments.to_user_departments to = (User_departments.to_user_departments) tbl_user_departments_ALM.get(row);
            Window p = (Window) this;
            Dlg_confirm_delete nd = Dlg_confirm_delete.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_delete.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_delete.OutputData data) {
                    closeDialog.ok();
                    User_departments.delete_data(to);
                    ret_data();
                    Alert.set(3, "");
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }

    }

    private void init_colleges() {

        Object[][] obj = new Object[colleges2.size()][1];
        int i = 0;
        for (Colleges.to_colleges to : colleges2) {
            obj[i][0] = " " + to.college_name;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field15.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field15, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {

                Colleges.to_colleges to = colleges2.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field15;
                co.setText("" + to.college_name);
                co.setId("" + to.id);

            }

        });
    }

}
