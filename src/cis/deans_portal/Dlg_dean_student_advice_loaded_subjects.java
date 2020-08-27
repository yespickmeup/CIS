/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.deans_portal;

import cis.academic.Academic_offering_subjects.to_academic_offering_subjects;
import cis.enrollments.Enrollment_student_loaded_subjects;
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
import synsoftech.util.ImageRenderer;

/**
 *
 * @author User
 */
public class Dlg_dean_student_advice_loaded_subjects extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_dean_student_advice_loaded_subjects
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
    private Dlg_dean_student_advice_loaded_subjects(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_dean_student_advice_loaded_subjects(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_dean_student_advice_loaded_subjects() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_dean_student_advice_loaded_subjects myRef;

    private void setThisRef(Dlg_dean_student_advice_loaded_subjects myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_dean_student_advice_loaded_subjects> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_dean_student_advice_loaded_subjects create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_dean_student_advice_loaded_subjects create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_dean_student_advice_loaded_subjects dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_dean_student_advice_loaded_subjects((java.awt.Frame) parent, false);
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
            Dlg_dean_student_advice_loaded_subjects dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_dean_student_advice_loaded_subjects((java.awt.Dialog) parent, false);
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

        Dlg_dean_student_advice_loaded_subjects dialog = Dlg_dean_student_advice_loaded_subjects.create(new javax.swing.JFrame(), true);
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
        init_tbl_added_subjectssubjects = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton14 = new Button.Success();
        jButton15 = new Button.Default();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        init_tbl_added_subjectssubjects1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ready for Loading", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        init_tbl_added_subjectssubjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(init_tbl_added_subjectssubjects);

        jLabel1.setText("No. of rows:");

        jLabel2.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jButton14.setText("Save");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("Cancel");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Not Added Subjects", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        init_tbl_added_subjectssubjects1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(init_tbl_added_subjectssubjects1);

        jLabel3.setText("No. of rows:");

        jLabel4.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
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

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        disposed();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        ok();
    }//GEN-LAST:event_jButton14ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable init_tbl_added_subjectssubjects;
    private javax.swing.JTable init_tbl_added_subjectssubjects1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        init_tbl_added_subjectssubjects(init_tbl_added_subjectssubjects);
        init_tbl_not_added_subjectssubjects(init_tbl_added_subjectssubjects1);
    }

    public void do_pass(List<Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects> loads, List<to_academic_offering_subjects> not_loaded) {
        loadData_added_subjects(loads);
        jLabel2.setText("" + loads.size());

        loadData_not_added_subjects(not_loaded);
        jLabel4.setText("" + not_loaded.size());

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

    public static void loadData_added_subjects(List<Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects> acc) {
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
            Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects tt = (Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.subject_code;
                case 1:
                    return " " + tt.description;
                case 2:
                    return " " + (tt.lab_units + tt.lecture_units);
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

    //<editor-fold defaultstate="collapsed" desc=" table added subjects "> 
    public static ArrayListModel tbl_not_added_subjects_ALM;
    public static Tbl_not_added_subjects_Model tbl_not_added_subjects_M;

    public static void init_tbl_not_added_subjectssubjects(JTable tbl_not_added_subjects) {
        tbl_not_added_subjects_ALM = new ArrayListModel();
        tbl_not_added_subjects_M = new Tbl_not_added_subjects_Model(tbl_not_added_subjects_ALM);
        tbl_not_added_subjects.setModel(tbl_not_added_subjects_M);
        tbl_not_added_subjects.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_not_added_subjects.setRowHeight(25);
        int[] tbl_widths_enrollment_student_loaded_subjects = {100, 100, 40, 0, 0, 0};
        for (int i = 0, n = tbl_widths_enrollment_student_loaded_subjects.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_not_added_subjects, i, tbl_widths_enrollment_student_loaded_subjects[i]);
        }
        Dimension d = tbl_not_added_subjects.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_not_added_subjects.getTableHeader().setPreferredSize(d);
        tbl_not_added_subjects.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_not_added_subjects.setRowHeight(25);
        tbl_not_added_subjects.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_not_added_subjects.getColumnModel().getColumn(5).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_not_added_subjects(List<to_academic_offering_subjects> acc) {
        tbl_not_added_subjects_ALM.clear();
        tbl_not_added_subjects_ALM.addAll(acc);

    }

    public static class Tbl_not_added_subjects_Model extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Subject Code", "Description", "Units", "Section", "Status", ""
        };

        public Tbl_not_added_subjects_Model(ListModel listmodel) {
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
            to_academic_offering_subjects tt = (to_academic_offering_subjects) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.subject_code;
                case 1:
                    return " " + tt.description;
                case 2:
                    return " " + (tt.lab_units + tt.lecture_units);
                case 3:
                    return " " + tt.description;
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

    private void ok() {
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData());
        }
    }
}
