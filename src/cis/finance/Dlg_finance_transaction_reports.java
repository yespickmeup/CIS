/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.finance;

import cis.academic.Academic_year_fees;
import cis.enrollments.Enrollment_student_loaded_subjects;
import cis.enrollments.Enrollments;
import cis.users.MyUser;
import cis.utils.DateType;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.JasperUtil;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import synsoftech.fields.Button;

/**
 *
 * @author User
 */
public class Dlg_finance_transaction_reports extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_finance_transaction_reports
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
    private Dlg_finance_transaction_reports(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_finance_transaction_reports(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_finance_transaction_reports() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_finance_transaction_reports myRef;

    private void setThisRef(Dlg_finance_transaction_reports myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_finance_transaction_reports> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_finance_transaction_reports create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_finance_transaction_reports create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_finance_transaction_reports dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_finance_transaction_reports((java.awt.Frame) parent, false);
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
            Dlg_finance_transaction_reports dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_finance_transaction_reports((java.awt.Dialog) parent, false);
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

        Dlg_finance_transaction_reports dialog = Dlg_finance_transaction_reports.create(new javax.swing.JFrame(), true);
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
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new Button.Info();
        jButton2 = new Button.Warning();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Print Assessment");

        jButton2.setText("Delete Assessment");

        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jLabel1.setText("Status:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 310, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Assessment", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 756, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Tuition Payment", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 756, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Add/Drop Subject", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jTabbedPane1)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
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

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
    }

    Finance.transactions transaction = null;

    public void do_pass(Finance.transactions to) {
        transaction = to;
        if (to.trans_type.equalsIgnoreCase("Assessment")) {
            jTabbedPane1.remove(1);
            jTabbedPane1.remove(1);
            set_assessment2();
        }
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

    //<editor-fold defaultstate="collapsed" desc=" list of programs ">
    private void set_assessment2() {

        jProgressBar1.setString("Loading...Please wait...");
        jProgressBar1.setIndeterminate(true);
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {

                List<Enrollment_assessments.to_enrollment_assessments> assessments = Enrollment_assessments.ret_data(" where id='" + transaction.id + "' ");
                Enrollment_assessments.to_enrollment_assessments assess = null;
                Enrollments.to_enrollments enroll = null;
                if (!assessments.isEmpty()) {
                    assess = assessments.get(0);
                    List<Enrollments.to_enrollments> enrolls = Enrollments.ret_data(" where id='" + assess.enrollment_id + "' ");
                    if (!enrolls.isEmpty()) {
                        enroll = enrolls.get(0);
                    }
                }
                String business_name = System.getProperty("school_name", "Colegio de Santa Catalina de Alejandria (COSCA)");
                String address = System.getProperty("address", "Bishop Epifanio B. Surban St. Dumaguete City Negros Oriental, Bishop Epifanio Surban St, Dumaguete, Negros Oriental");
                String date = synsoftech.util.DateType.slash.format(new Date());
                String contact_no = System.getProperty("contact_no", "(035) 225 4831");

                String home = System.getProperty("user.home");
                String SUBREPORT_DIR = home + "\\cis\\";

                String printed_by = MyUser.getUser_screen_name();
                String school_year = enroll.academic_year;
                String semester = enroll.term;
                String student_no = enroll.student_no;
                String student_name = enroll.last_name + ", " + enroll.first_name + " " + enroll.middle_name;
                String student_course = enroll.course_code + " - " + enroll.course_description;
                String student_year_level = enroll.year_level;

                List<Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects> subjects = Enrollment_student_loaded_subjects.ret_data(" where enrollment_id='" + enroll.id + "' and status=1 and is_added=0 ");
                double no_of_units_lab = 0;
                List<cis.reports.Srpt_enrollment_assessment.field> fields = new ArrayList();

                //ret tuition amount
                String where = " where id<>0 ";
                where = where + " and academic_year_id='" + enroll.academic_year_id + "' "
                        + " and department_id='" + enroll.department_id + "' "
                        + " and level_id='" + enroll.level_id + "' "
                        + " and course_id='" + enroll.course_id + "' "
                        + " and period like '" + enroll.year_level + "' "
                        + " and group_id=0 ";
                List<Academic_year_fees.to_academic_year_fees> datas = Academic_year_fees.ret_data(where);
                double tuition_amount = 0;
                double lec_amount_per_unit = 0;
                double lab_amount_per_unit = 0;
                double total_assessment = 0;
                double tution_fee = 0;
                double misc_fee = 0;
                double other_fee = 0;
                double downpayment = 0;
                double payable = 0;

                if (!datas.isEmpty()) {
                    Academic_year_fees.to_academic_year_fees ayf = (Academic_year_fees.to_academic_year_fees) datas.get(0);
                    if (ayf.is_per_unit == 0) {
                        tuition_amount = ayf.amount;
                    } else {
                        lec_amount_per_unit = ayf.per_unit;
                        lab_amount_per_unit = ayf.lab_unit_amount;
                    }
                }

                for (Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects sub : subjects) {
                    String subject_code = sub.subject_code;
                    String description = sub.description;
                    double lec_units = sub.lecture_units;
                    double lab_units = sub.lab_units;
                    double lec_amount = lec_units * lec_amount_per_unit;
                    double lec_amount2 = lec_amount;
                    lec_amount = lec_amount_per_unit;
                    double lab_amount = lab_units * lab_amount_per_unit;
                    double lab_amount2 = lab_amount;
                    lab_amount = lab_amount_per_unit;
                    String room = sub.room;
                    String day = DateType.mwf(sub.day);
                    String time = DateType.daytime(sub.day);
                    time = time.replaceAll("WFM", "MWF");
                    time = time.replaceAll("FM", "MF");
                    String instructor = sub.faculty_name;
                    double amount = lec_amount2 + lab_amount2;
                    tution_fee += amount;
                    cis.reports.Srpt_enrollment_assessment.field f = new cis.reports.Srpt_enrollment_assessment.field(subject_code, description, lec_units, lab_units, lec_amount, lab_amount, room, day, time, instructor, amount);
                    fields.add(f);
                }

                List<cis.reports.Srpt_enrollment_assessment.field_misc> misc = new ArrayList();

                String where2 = " where id<>0 ";
                where2 = where2 + " and academic_year_id='" + enroll.academic_year_id + "' "
                        + " and department_id='" + enroll.department_id + "' "
                        + " and level_id='" + enroll.level_id + "' "
                        + " and course_id='" + enroll.course_id + "' "
                        + " and period like '" + enroll.year_level + "' "
                        + " and group_id=1 ";

                String where3 = " where id<>0 ";
                where3 = where3 + " and academic_year_id='" + enroll.academic_year_id + "' "
                        + " and department_id='" + enroll.department_id + "' "
                        + " and level_id='" + enroll.level_id + "' "
                        + " and course_id='" + enroll.course_id + "' "
                        + " and period like '" + enroll.year_level + "' "
                        + " and group_id=2 ";

                List<Academic_year_fees.to_academic_year_fees> misc_fees = Miscellaneous_fees.ret_data2(where2);
                List<Academic_year_fees.to_academic_year_fees> other_fees = Miscellaneous_fees.ret_data3(where3);
//        System.out.println(where3);
                List<cis.reports.Srpt_enrollment_assessment.field_misc> rpt_fees = new ArrayList();
                for (Academic_year_fees.to_academic_year_fees fee : misc_fees) {
                    cis.reports.Srpt_enrollment_assessment.field_misc f = new cis.reports.Srpt_enrollment_assessment.field_misc(fee.fee, fee.amount);
                    misc.add(f);
                    misc_fee += fee.amount;
                }

                for (Academic_year_fees.to_academic_year_fees fee : other_fees) {
                    cis.reports.Srpt_enrollment_assessment.field_misc f = new cis.reports.Srpt_enrollment_assessment.field_misc(fee.fee, fee.amount);
                    rpt_fees.add(f);
                    other_fee += fee.amount;
                }

                List<Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes> eapm = Enrollment_assessment_payment_modes.ret_data(" where enrollment_id='" + enroll.id + "' ");
                List<cis.reports.Srpt_enrollment_assessment.field_summary> rpt_summary = new ArrayList();

                int payment_count = 3;
                double tuition_fee = tuition_amount;

                total_assessment = tution_fee  + other_fee+misc_fee;
                payable = total_assessment - downpayment;
                for (Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes ea : eapm) {
                    double balance = ea.amount - ea.paid;
                    downpayment += ea.paid;
                    cis.reports.Srpt_enrollment_assessment.field_summary f2 = new cis.reports.Srpt_enrollment_assessment.field_summary(total_assessment, downpayment, payable, ea.mode, ea.to_pay, ea.amount, ea.paid, balance, tuition_fee,misc_fee,other_fee);
                    rpt_summary.add(f2);
                }

                String jrxml = "rpt_enrollment_assessment.jrxml";
                cis.reports.Srpt_enrollment_assessment rpt = new cis.reports.Srpt_enrollment_assessment(business_name, address, contact_no, date, printed_by, school_year, semester, student_no, student_name, student_course, student_year_level, SUBREPORT_DIR, misc, rpt_fees, total_assessment, downpayment, payable, rpt_summary, tuition_fee,misc_fee);
                rpt.fields.addAll(fields);
                report_assessment(rpt, jrxml);
                InputStream is = cis.reports.Srpt_enrollment_assessment.class.getResourceAsStream(jrxml);
                try {
                    JasperReport jasperReport = JasperCompileManager.compileReport(is);
                    jasperPrint = JasperFillManager.fillReport(jasperReport, JasperUtil.
                                                               setParameter(rpt), JasperUtil.makeDatasource(rpt.fields));

                } catch (JRException ex) {
                    Logger.getLogger(Dlg_finance.class.getName()).log(Level.SEVERE, null, ex);
                }

                jProgressBar1.setString("Finished...");
                jProgressBar1.setIndeterminate(false);
            }
        });
        t.start();
    }

    private void set_assessment() {

    }

    private void report_assessment(final cis.reports.Srpt_enrollment_assessment to, String jrxml_name) {
        jPanel17.removeAll();
        jPanel17.setLayout(new BorderLayout());
        try {
            JRViewer viewer = get_viewer_assessment(to, jrxml_name);
            JPanel pnl = new JPanel();
            pnl.add(viewer);
            pnl.setVisible(true);
            pnl.setVisible(true);
            jPanel17.add(viewer);
            jPanel17.setMinimumSize(new Dimension(626, 0));
            jPanel17.setMaximumSize(new Dimension(626, 0));
            jPanel17.setPreferredSize(new Dimension(626, 0));
            jPanel17.updateUI();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer_assessment(cis.reports.Srpt_enrollment_assessment to, String rpt_name) {
        try {
            return JasperUtil.getJasperViewer(
                    compileJasper(rpt_name),
                    JasperUtil.setParameter(to),
                    JasperUtil.makeDatasource(to.fields));
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }
    }

    public static JasperReport compileJasper(String rpt_name) {
        try {
            String jrxml = rpt_name;
            InputStream is = cis.reports.Srpt_enrollment_assessment.class.
                    getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    JasperPrint jasperPrint = null;

    private void print_assessment() {
        try {
            if (jasperPrint != null) {
                JasperPrintManager.printReport(jasperPrint, false);
            }

        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Failed To Print, Please Check the Printer");
            throw new RuntimeException(e);
        }
    }

}
