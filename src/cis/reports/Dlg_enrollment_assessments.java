/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.reports;

import cis.enrollments.Enrollments;
import cis.enrollments.Enrollments.to_enrollments;
import cis.utils.DateType;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.JasperUtil;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRPrintPage;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
import synsoftech.fields.Button;
import synsoftech.fields.Field;

/**
 *
 * @author User
 */
public class Dlg_enrollment_assessments extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_enrollment_assessments
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
    private Dlg_enrollment_assessments(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_enrollment_assessments(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_enrollment_assessments() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_enrollment_assessments myRef;

    private void setThisRef(Dlg_enrollment_assessments myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_enrollment_assessments> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_enrollment_assessments create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_enrollment_assessments create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_enrollment_assessments dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_enrollment_assessments((java.awt.Frame) parent, false);
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
            Dlg_enrollment_assessments dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_enrollment_assessments((java.awt.Dialog) parent, false);
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

        Dlg_enrollment_assessments dialog = Dlg_enrollment_assessments.create(new javax.swing.JFrame(), true);
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_enrollments = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_field5 = new Field.Input();
        jButton5 = new Button.Info();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tbl_enrollments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_enrollments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_enrollmentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_enrollments);

        jLabel1.setText("No. of rows:");

        jLabel2.setText("0");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Search:");

        tf_field5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jButton5.setText("Print Preview");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_field5, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 144, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Assessments", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jLabel3.setText("Status:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(470, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 305, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Print Preview", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jTabbedPane1)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTabbedPane1)
                .addGap(23, 23, 23))
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
        set_assessment();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tbl_enrollmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_enrollmentsMouseClicked
        select_enrollment();
    }//GEN-LAST:event_tbl_enrollmentsMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl_enrollments;
    private javax.swing.JTextField tf_field5;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        System.setProperty("pool_db", "db_cis_cosca");
        System.setProperty("pool_password", "password");

        init_tbl_enrollments(tbl_enrollments);
        ret_data();
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

    //<editor-fold defaultstate="collapsed" desc=" enrollments "> 
    public static ArrayListModel tbl_enrollments_ALM;
    public static TblenrollmentsModel tbl_enrollments_M;

    public static void init_tbl_enrollments(JTable tbl_enrollments) {
        tbl_enrollments_ALM = new ArrayListModel();
        tbl_enrollments_M = new TblenrollmentsModel(tbl_enrollments_ALM);
        tbl_enrollments.setModel(tbl_enrollments_M);
        tbl_enrollments.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_enrollments.setRowHeight(25);
        int[] tbl_widths_enrollments = {100, 180, 100, 100, 80, 80, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_enrollments.length; i < n; i++) {
            if (i == 2) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_enrollments, i, tbl_widths_enrollments[i]);
        }
        Dimension d = tbl_enrollments.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_enrollments.getTableHeader().setPreferredSize(d);
        tbl_enrollments.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_enrollments.setRowHeight(25);
        tbl_enrollments.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_enrollments(List<to_enrollments> acc) {
        tbl_enrollments_ALM.clear();
        tbl_enrollments_ALM.addAll(acc);
    }

    public static class TblenrollmentsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Enrollment No", "Name", "Course", "Year", "Created", "Assessed", "", "course_code", "course_description", "term", "encoded_by_id", "encoded_by", "encoded_date", "assessed_by_id", "assessed_by", "assessed_date", "advised_by_id", "advised_by", "advised_date", "approved_by_id", "approved_by", "approved_date", "date_enrolled", "student_id", "student_no", "last_name", "first_name", "middle_name", "nick_name", "current_address", "permanent_address", "email_address", "postal_code", "tel_no", "mobile_no", "date_of_birth", "place_of_birth", "age", "gender", "citizenship", "religion", "civil_status", "spouse_name", "date_of_communion", "date_of_confirmation", "is_right_handed", "is_indigenous", "indigenous_name", "level_id", "level", "college_id", "college", "department_id", "department", "year_level", "year_level_status", "preferred_course1", "preferred_course2", "preferred_course3", "father_name", "father_citizenship", "father_home_address", "father_email_address", "father_mobile_no", "father_occupation", "father_employer", "father_business_address", "father_business_tel_no", "father_educational_attainment", "father_last_school_attended", "mother_name", "mother_citizenship", "mother_home_address", "mother_email_address", "mother_mobile_no", "mother_occupation", "mother_employer", "mother_business_address", "mother_business_tel_no", "mother_educational_attainment", "mother_last_school_attended", "guardian_name", "guardian_mailing_address", "guardian_telephone_no", "grade_school_name", "grade_school_region", "grade_school_school_year", "grade_school_awards", "high_school_name", "high_school_region", "high_school_school_year", "high_school_awards", "college_school_name", "college_school_region", "college_school_school_year", "college_awards", "junior_high_name", "junior_high_region", "junior_high_year", "junior_high_awards", "tesda_name", "tesda_region", "tesda_year", "tesda_awards", "sibling1", "sibling2", "sibling3", "sibling4", "sibling5", "sibling6", "sibling7", "sibling8", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded"
        };

        public TblenrollmentsModel(ListModel listmodel) {
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
            to_enrollments tt = (to_enrollments) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.enrollment_no;
                case 1:
                    return " " + tt.last_name + ", " + tt.first_name + " " + tt.middle_name;
                case 2:
                    return " " + tt.course_code + " - " + tt.course_description;
                case 3:
                    return " " + tt.year_level;
                case 4:
                    return " " + DateType.convert_slash_datetime(tt.created_at);
                case 5:
                    if (tt.assessed_date == null) {
                        return "";
                    } else {
                        return " " + DateType.convert_slash_datetime(tt.assessed_date);
                    }
                case 6:
                    return tt.selected;
                case 7:
                    return tt.course_code;
                case 8:
                    return tt.course_description;
                case 9:
                    return tt.term;
                case 10:
                    return tt.encoded_by_id;
                case 11:
                    return tt.encoded_by;
                case 12:
                    return tt.encoded_date;
                case 13:
                    return tt.assessed_by_id;
                case 14:
                    return tt.assessed_by;
                case 15:
                    return tt.assessed_date;
                case 16:
                    return tt.advised_by_id;
                case 17:
                    return tt.advised_by;
                case 18:
                    return tt.advised_date;
                case 19:
                    return tt.approved_by_id;
                case 20:
                    return tt.approved_by;
                case 21:
                    return tt.approved_date;
                case 22:
                    return tt.date_enrolled;
                case 23:
                    return tt.student_id;
                case 24:
                    return tt.student_no;
                case 25:
                    return tt.last_name;
                case 26:
                    return tt.first_name;
                case 27:
                    return tt.middle_name;
                case 28:
                    return tt.nick_name;
                case 29:
                    return tt.current_address;
                case 30:
                    return tt.permanent_address;
                case 31:
                    return tt.email_address;
                case 32:
                    return tt.postal_code;
                case 33:
                    return tt.tel_no;
                case 34:
                    return tt.mobile_no;
                case 35:
                    return tt.date_of_birth;
                case 36:
                    return tt.place_of_birth;
                case 37:
                    return tt.age;
                case 38:
                    return tt.gender;
                case 39:
                    return tt.citizenship;
                case 40:
                    return tt.religion;
                case 41:
                    return tt.civil_status;
                case 42:
                    return tt.spouse_name;
                case 43:
                    return tt.date_of_communion;
                case 44:
                    return tt.date_of_confirmation;
                case 45:
                    return tt.is_right_handed;
                case 46:
                    return tt.is_indigenous;
                case 47:
                    return tt.indigenous_name;
                case 48:
                    return tt.level_id;
                case 49:
                    return tt.level;
                case 50:
                    return tt.college_id;
                case 51:
                    return tt.college;
                case 52:
                    return tt.department_id;
                case 53:
                    return tt.department;
                case 54:
                    return tt.year_level;
                case 55:
                    return tt.year_level_status;
                case 56:
                    return tt.preferred_course1;
                case 57:
                    return tt.preferred_course2;
                case 58:
                    return tt.preferred_course3;
                case 59:
                    return tt.father_name;
                case 60:
                    return tt.father_citizenship;
                case 61:
                    return tt.father_home_address;
                case 62:
                    return tt.father_email_address;
                case 63:
                    return tt.father_mobile_no;
                case 64:
                    return tt.father_occupation;
                case 65:
                    return tt.father_employer;
                case 66:
                    return tt.father_business_address;
                case 67:
                    return tt.father_business_tel_no;
                case 68:
                    return tt.father_educational_attainment;
                case 69:
                    return tt.father_last_school_attended;
                case 70:
                    return tt.mother_name;
                case 71:
                    return tt.mother_citizenship;
                case 72:
                    return tt.mother_home_address;
                case 73:
                    return tt.mother_email_address;
                case 74:
                    return tt.mother_mobile_no;
                case 75:
                    return tt.mother_occupation;
                case 76:
                    return tt.mother_employer;
                case 77:
                    return tt.mother_business_address;
                case 78:
                    return tt.mother_business_tel_no;
                case 79:
                    return tt.mother_educational_attainment;
                case 80:
                    return tt.mother_last_school_attended;
                case 81:
                    return tt.guardian_name;
                case 82:
                    return tt.guardian_mailing_address;
                case 83:
                    return tt.guardian_telephone_no;
                case 84:
                    return tt.grade_school_name;
                case 85:
                    return tt.grade_school_region;
                case 86:
                    return tt.grade_school_school_year;
                case 87:
                    return tt.grade_school_awards;
                case 88:
                    return tt.high_school_name;
                case 89:
                    return tt.high_school_region;
                case 90:
                    return tt.high_school_school_year;
                case 91:
                    return tt.high_school_awards;
                case 92:
                    return tt.college_school_name;
                case 93:
                    return tt.college_school_region;
                case 94:
                    return tt.college_school_school_year;
                case 95:
                    return tt.college_awards;
                case 96:
                    return tt.junior_high_name;
                case 97:
                    return tt.junior_high_region;
                case 98:
                    return tt.junior_high_year;
                case 99:
                    return tt.junior_high_awards;
                case 100:
                    return tt.tesda_name;
                case 101:
                    return tt.tesda_region;
                case 102:
                    return tt.tesda_year;
                case 103:
                    return tt.tesda_awards;
                case 104:
                    return tt.sibling1;
                case 105:
                    return tt.sibling2;
                case 106:
                    return tt.sibling3;
                case 107:
                    return tt.sibling4;
                case 108:
                    return tt.sibling5;
                case 109:
                    return tt.sibling6;
                case 110:
                    return tt.sibling7;
                case 111:
                    return tt.sibling8;
                case 112:
                    return tt.created_at;
                case 113:
                    return tt.updated_at;
                case 114:
                    return tt.created_by;
                case 115:
                    return tt.updated_by;
                case 116:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }

    private void ret_data() {
        String where = "";
        List<to_enrollments> datas = Enrollments.ret_data(where);
        loadData_enrollments(datas);
        jLabel2.setText("" + datas.size());
    }
//</editor-fold> 

    private void select_enrollment() {
        int row = tbl_enrollments.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_enrollments to = (to_enrollments) tbl_enrollments_ALM.get(row);
        int col = tbl_enrollments.getSelectedColumn();
        if (col == 6) {
            if (to.isSelected()) {
                to.setSelected(false);
            } else {
                to.setSelected(true);
            }
            tbl_enrollments_M.fireTableDataChanged();
        }
    }

    private void set_assessment() {
        jTabbedPane1.setSelectedIndex(1);
        jProgressBar1.setString("Loading...Please wait...");
        jProgressBar1.setIndeterminate(true);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                String business_name = System.getProperty("school_name", "Colegio de Santa Catalina de Alejandria (COSCA)");
                String address = System.getProperty("address", "Bishop Epifanio B. Surban St. Dumaguete City Negros Oriental, Bishop Epifanio Surban St, Dumaguete, Negros Oriental");
                String date = synsoftech.util.DateType.slash.format(new Date());
                String contact_no = System.getProperty("contact_no", "(035) 225 4831");

                String home = System.getProperty("user.home");
                String SUBREPORT_DIR = home + "\\cis\\";

                String printed_by = "Administrator";
                String school_year = "2020 - 2021";
                String semester = "First Semester";

                String student_no = "2020001";
                String student_name = "Ronald Pascua";
                String student_course = "Bachelor of Science in Information Technology";
                String student_year_level = "First Year";
                List<  Srpt_enrollment_assessment.field> fields = new ArrayList();
                for (int i = 0; i < 10; i++) {
                    String subject_code = "BA0" + i;
                    String description = "Physical Education";
                    double lec_units = 3;
                    double lab_units = 0;
                    double lec_amount = 385;
                    double lab_amount = 500;
                    String room = "Room1";
                    String day = "MWF";
                    String time = "8:00am - 9:00am";
                    String instructor = "Juan Dela Cruz";
                    double amount = 2000;
                    Srpt_enrollment_assessment.field f = new Srpt_enrollment_assessment.field(subject_code, description, lec_units, lab_units, lec_amount, lab_amount, room, day, time, instructor, amount);
                    fields.add(f);
                }
                List<Srpt_enrollment_assessment.field_misc> misc = new ArrayList();
                List<Srpt_enrollment_assessment.field_misc> rpt_fees = new ArrayList();
                for (int i = 0; i < 10; i++) {
                    Srpt_enrollment_assessment.field_misc f = new Srpt_enrollment_assessment.field_misc("Miscelleneous", 200);
                    misc.add(f);
                }
                for (int i = 0; i < 14; i++) {
                    Srpt_enrollment_assessment.field_misc f = new Srpt_enrollment_assessment.field_misc("Other Fees", 100);
                    rpt_fees.add(f);
                }

                List<Srpt_enrollment_assessment.field_summary> rpt_summary = new ArrayList();

                double total_assessment = 1000;
                double downpayment = 500;
                double payable = 500;

                Srpt_enrollment_assessment.field_summary f2 = new Srpt_enrollment_assessment.field_summary(total_assessment, downpayment, payable);
                rpt_summary.add(f2);
                String jrxml = "rpt_enrollment_assessment.jrxml";
                Srpt_enrollment_assessment rpt = new Srpt_enrollment_assessment(business_name, address, contact_no, date, printed_by, school_year, semester, student_no, student_name, student_course, student_year_level, SUBREPORT_DIR, misc, rpt_fees, total_assessment, downpayment, payable, rpt_summary);
                rpt.fields.addAll(fields);
                report_assessment(rpt, jrxml);

                jProgressBar1.setString("Finished...");
                jProgressBar1.setIndeterminate(false);
            }
        });
        t.start();

    }

    private void report_assessment(final Srpt_enrollment_assessment to, String jrxml_name) {
        jPanel5.removeAll();
        jPanel5.setLayout(new BorderLayout());
        try {
//            JasperViewer viewer =
            JPanel pnl = get_viewer_assessment(to, jrxml_name);
//            pnl.add(viewer);
//            pnl.setVisible(true);
            jPanel5.add(pnl);
            jPanel5.updateUI();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JPanel get_viewer_assessment(Srpt_enrollment_assessment to, String rpt_name) {
        try {
//            JRViewer viewer = JasperUtil.getJasperViewer(
//                    compileJasper(rpt_name),
//                    JasperUtil.setParameter(to),
//                    JasperUtil.makeDatasource(to.fields));
            List<JasperPrint> reportPages = new ArrayList();
            JasperPrint report = new JasperPrint();

            JasperPrint jp1 = JasperFillManager.fillReport(compileJasper(rpt_name), JasperUtil.setParameter(to), JasperUtil.makeDatasource(to.fields));
            JasperPrint jp2 = JasperFillManager.fillReport(compileJasper(rpt_name), JasperUtil.setParameter(to), JasperUtil.makeDatasource(to.fields));

            List<JRPrintPage> object = jp2.getPages();
            for (JRPrintPage obj : object) {
                jp1.addPage(obj);
            }

            JasperViewer jasperViewer = new JasperViewer(jp1, false);

            JPanel pnl = (javax.swing.JPanel) jasperViewer.getContentPane();

            return pnl;
        } catch (JRException e) {
            throw new RuntimeException(e);
        } finally {
        }
    }

    public static JasperReport compileJasper(String rpt_name) {
        try {
            String jrxml = rpt_name;
            InputStream is = Srpt_enrollment_assessment.class.
                    getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

}
