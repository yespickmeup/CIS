/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.finance;

import cis.students.Students;
import cis.students.Students_curriculum;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.util.ImageRenderer;

/**
 *
 * @author User
 */
public class Dlg_finance_student_payment_details_subjects extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_finance_student_payment_details_subjects
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
    private Dlg_finance_student_payment_details_subjects(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_finance_student_payment_details_subjects(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_finance_student_payment_details_subjects() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_finance_student_payment_details_subjects myRef;

    private void setThisRef(Dlg_finance_student_payment_details_subjects myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_finance_student_payment_details_subjects> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_finance_student_payment_details_subjects create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_finance_student_payment_details_subjects create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_finance_student_payment_details_subjects dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_finance_student_payment_details_subjects((java.awt.Frame) parent, false);
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
            Dlg_finance_student_payment_details_subjects dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_finance_student_payment_details_subjects((java.awt.Dialog) parent, false);
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

        Dlg_finance_student_payment_details_subjects dialog = Dlg_finance_student_payment_details_subjects.create(new javax.swing.JFrame(), true);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_added_subjects = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_droped_subjects = new javax.swing.JTable();
        jButton4 = new Button.Default();
        jButton3 = new Button.Success();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Added Subjects", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tbl_added_subjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_added_subjects);

        jLabel1.setText("Total no. of subjects:");

        jLabel2.setText("0");

        tbl_droped_subjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbl_droped_subjects);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Pay");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(12, 12, 12))
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        disposed();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        ok();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_added_subjects;
    private javax.swing.JTable tbl_droped_subjects;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        init_tbl_added_subjectssubjects(tbl_added_subjects);
        init_tbl_dropped_subjectssubjects(tbl_droped_subjects);
    }

    public void do_pass(Students.to_students student) {
        ret_added_subjects(student.id);
        jScrollPane2.setVisible(false);

        jScrollPane1.setMinimumSize(new Dimension(544, 200));
    }

    public void do_pass2(Students.to_students student) {
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Drop Subjects", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jScrollPane1.setVisible(false);
         jScrollPane2.setMinimumSize(new Dimension(544, 200));
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

    //<editor-fold defaultstate="collapsed" desc=" table added subjects "> 
    public static ArrayListModel tbl_added_subjects_ALM;
    public static Tbl_added_subjects_Model tbl_added_subjects_M;

    public static void init_tbl_added_subjectssubjects(JTable tbl_added_subjects) {
        tbl_added_subjects_ALM = new ArrayListModel();
        tbl_added_subjects_M = new Tbl_added_subjects_Model(tbl_added_subjects_ALM);
        tbl_added_subjects.setModel(tbl_added_subjects_M);
        tbl_added_subjects.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_added_subjects.setRowHeight(25);
        int[] tbl_widths_enrollment_student_loaded_subjects = {100, 100, 40, 60, 0, 0};
        for (int i = 0, n = tbl_widths_enrollment_student_loaded_subjects.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_added_subjects, i, tbl_widths_enrollment_student_loaded_subjects[i]);
        }
        Dimension d = tbl_added_subjects.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_added_subjects.getTableHeader().setPreferredSize(d);
        tbl_added_subjects.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_added_subjects.setRowHeight(25);
        tbl_added_subjects.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_added_subjects.getColumnModel().getColumn(5).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_added_subjects(List<Students_curriculum.curriculum> acc) {
        tbl_added_subjects_ALM.clear();
        tbl_added_subjects_ALM.addAll(acc);

    }

    public static class Tbl_added_subjects_Model extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Subject Code", "Description", "Units", "Section", "Status", ""
        };

        public Tbl_added_subjects_Model(ListModel listmodel) {
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
            Students_curriculum.curriculum tt = (Students_curriculum.curriculum) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.subject_code;
                case 1:
                    return " " + tt.subject_description;
                case 2:
                    return " " + (tt.lab_units + tt.lec_units);
                case 3:
                    return " " + tt.section;
                case 4:
                    if (tt.status == -1) {
                        return " ";
                    } else if (tt.status == 0) {
                        return " Added";
                    } else if (tt.status == 1) {
                        return " Enrolled";
                    } else if (tt.status == 2) {
                        return " Passed";
                    } else if (tt.status == 3) {
                        return " Failed";
                    } else {
                        return " Dropped";
                    }
                default:
                    if (tt.status == 1) {
                        return "/cis/icons2/quit.png";
                    } else if (tt.status == -1) {
                        return "/cis/icons2/plus.png";
                    } else {
                        return "/cis/icons/remove11.png";
                    }

            }
        }
    }

    private void ret_added_subjects(int id) {

        String where = " where student_id = '" + id + "' and status=0 order by description asc ";
        List<Students_curriculum.curriculum> subjects = Students_curriculum.ret_added_subjects(where);
        loadData_added_subjects(subjects);
        jLabel2.setText("" + subjects.size());
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" table dropped subjects "> 
    public static ArrayListModel tbl_dropped_subjects_ALM;
    public static Tbl_dropped_subjects_Model tbl_dropped_subjects_M;

    public static void init_tbl_dropped_subjectssubjects(JTable tbl_dropped_subjects) {
        tbl_dropped_subjects_ALM = new ArrayListModel();
        tbl_dropped_subjects_M = new Tbl_dropped_subjects_Model(tbl_dropped_subjects_ALM);
        tbl_dropped_subjects.setModel(tbl_dropped_subjects_M);
        tbl_dropped_subjects.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_dropped_subjects.setRowHeight(25);
        int[] tbl_widths_enrollment_student_loaded_subjects = {100, 100, 40, 60, 0, 0};
        for (int i = 0, n = tbl_widths_enrollment_student_loaded_subjects.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_dropped_subjects, i, tbl_widths_enrollment_student_loaded_subjects[i]);
        }
        Dimension d = tbl_dropped_subjects.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_dropped_subjects.getTableHeader().setPreferredSize(d);
        tbl_dropped_subjects.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_dropped_subjects.setRowHeight(25);
        tbl_dropped_subjects.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_dropped_subjects.getColumnModel().getColumn(5).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_dropped_subjects(List<Students_curriculum.curriculum> acc) {
        tbl_dropped_subjects_ALM.clear();
        tbl_dropped_subjects_ALM.addAll(acc);

    }

    public static class Tbl_dropped_subjects_Model extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Subject Code", "Description", "Units", "Section", "Status", ""
        };

        public Tbl_dropped_subjects_Model(ListModel listmodel) {
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
            Students_curriculum.curriculum tt = (Students_curriculum.curriculum) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.subject_code;
                case 1:
                    return " " + tt.subject_description;
                case 2:
                    return " " + (tt.lab_units + tt.lec_units);
                case 3:
                    return " " + tt.section;
                case 4:
                    if (tt.status == -1) {
                        return " ";
                    } else if (tt.status == 0) {
                        return " Added";
                    } else if (tt.status == 1) {
                        return " Enrolled";
                    } else if (tt.status == 2) {
                        return " Passed";
                    } else if (tt.status == 3) {
                        return " Failed";
                    } else {
                        return " Dropped";
                    }
                default:
                    if (tt.status == 1) {
                        return "/cis/icons2/quit.png";
                    } else if (tt.status == -1) {
                        return "/cis/icons2/plus.png";
                    } else {
                        return "/cis/icons/remove11.png";
                    }

            }
        }
    }

    private void ret_dropped_subjects(int id) {

        String where = " where student_id = '" + id + "' and status=0 order by description asc ";
        List<Students_curriculum.curriculum> subjects = Students_curriculum.ret_dropped_subjects(where);
        loadData_dropped_subjects(subjects);
        jLabel2.setText("" + subjects.size());
    }
//</editor-fold>
}
