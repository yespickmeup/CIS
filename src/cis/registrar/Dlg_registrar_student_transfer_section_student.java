/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.registrar;

import cis.academic.Academic_years;
import cis.academic.Dlg_academic_offerings;
import static cis.deans_portal.Dlg_dean_student_advice_load_subject.tbl_enrollment_offered_subject_sections_ALM;
import cis.deans_portal.Dlg_dean_student_advice_load_subject_students;
import cis.enrollments.Enrollment_offered_subject_sections;
import cis.enrollments.Enrollment_student_loaded_subjects;
import cis.students.Students;
import cis.test.DayCheck;
import cis.utils.Alert;
import cis.utils.DateType;
import cis.utils.Dlg_confirm_delete2;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Color;
import java.awt.Component;
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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.fields.Field;
import synsoftech.util.ImageRenderer;

/**
 *
 * @author User
 */
public class Dlg_registrar_student_transfer_section_student extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_registrar_student_transfer_section_student
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
    private Dlg_registrar_student_transfer_section_student(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_registrar_student_transfer_section_student(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_registrar_student_transfer_section_student() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_registrar_student_transfer_section_student myRef;

    private void setThisRef(Dlg_registrar_student_transfer_section_student myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_registrar_student_transfer_section_student> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_registrar_student_transfer_section_student create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_registrar_student_transfer_section_student create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_registrar_student_transfer_section_student dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_registrar_student_transfer_section_student((java.awt.Frame) parent, false);
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
            Dlg_registrar_student_transfer_section_student dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_registrar_student_transfer_section_student((java.awt.Dialog) parent, false);
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

        Dlg_registrar_student_transfer_section_student dialog = Dlg_registrar_student_transfer_section_student.create(new javax.swing.JFrame(), true);
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
        jLabel24 = new javax.swing.JLabel();
        tf_field16 = new Field.Input();
        jLabel25 = new javax.swing.JLabel();
        tf_field17 = new Field.Input();
        jLabel26 = new javax.swing.JLabel();
        tf_field18 = new Field.Input();
        jLabel27 = new javax.swing.JLabel();
        tf_field19 = new Field.Input();
        jLabel28 = new javax.swing.JLabel();
        tf_field20 = new Field.Input();
        jPanel3 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        tf_field21 = new Field.Input();
        jLabel30 = new javax.swing.JLabel();
        tf_field22 = new Field.Input();
        jLabel31 = new javax.swing.JLabel();
        tf_field23 = new Field.Input();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel33 = new javax.swing.JLabel();
        tf_field24 = new Field.Input();
        jLabel34 = new javax.swing.JLabel();
        tf_field25 = new Field.Input();
        jLabel35 = new javax.swing.JLabel();
        tf_field26 = new Field.Input();
        jLabel36 = new javax.swing.JLabel();
        tf_field27 = new Field.Input();
        jLabel37 = new javax.swing.JLabel();
        tf_field28 = new Field.Input();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_enrollment_offered_subject_sections = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_enrollment_student_loaded_subjects = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Student No.:");

        tf_field16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tf_field16.setFocusable(false);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Student Name:");

        tf_field17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tf_field17.setFocusable(false);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Course:");

        tf_field18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field18.setFocusable(false);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Year Level:");

        tf_field19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field19.setFocusable(false);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Contact No.:");

        tf_field20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field20.setFocusable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field16, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field20)))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Section Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Subject Code:");

        tf_field21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tf_field21.setFocusable(false);

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Section:");

        tf_field22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tf_field22.setFocusable(false);

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Description:");

        tf_field23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field23.setFocusable(false);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Day:");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Instructor:");

        tf_field24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field24.setFocusable(false);

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Capacity:");

        tf_field25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tf_field25.setFocusable(false);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Pending:");

        tf_field26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tf_field26.setFocusable(false);

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Room:");

        tf_field27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field27.setFocusable(false);

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Status:");

        tf_field28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field28.setFocusable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field27, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field28, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field25, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field26, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field24))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field21, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field22, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field23)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(227, 225, 225));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Section to Transfer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tbl_enrollment_offered_subject_sections.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_enrollment_offered_subject_sections.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_enrollment_offered_subject_sectionsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_enrollment_offered_subject_sections);

        jLabel3.setText("No.of rows:");

        jLabel4.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enrolled Subjects", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tbl_enrollment_student_loaded_subjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_enrollment_student_loaded_subjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_enrollment_student_loaded_subjectsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_enrollment_student_loaded_subjects);

        jLabel1.setText("No. of rows:");

        jLabel2.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void tbl_enrollment_offered_subject_sectionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_enrollment_offered_subject_sectionsMouseClicked
        select_section();
    }//GEN-LAST:event_tbl_enrollment_offered_subject_sectionsMouseClicked

    private void tbl_enrollment_student_loaded_subjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_enrollment_student_loaded_subjectsMouseClicked
        select_enrolled_subject();
    }//GEN-LAST:event_tbl_enrollment_student_loaded_subjectsMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tbl_enrollment_offered_subject_sections;
    private javax.swing.JTable tbl_enrollment_student_loaded_subjects;
    private javax.swing.JTextField tf_field16;
    private javax.swing.JTextField tf_field17;
    private javax.swing.JTextField tf_field18;
    private javax.swing.JTextField tf_field19;
    private javax.swing.JTextField tf_field20;
    private javax.swing.JTextField tf_field21;
    private javax.swing.JTextField tf_field22;
    private javax.swing.JTextField tf_field23;
    private javax.swing.JTextField tf_field24;
    private javax.swing.JTextField tf_field25;
    private javax.swing.JTextField tf_field26;
    private javax.swing.JTextField tf_field27;
    private javax.swing.JTextField tf_field28;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        init_tbl_enrollment_student_loaded_subjects(tbl_enrollment_student_loaded_subjects);
        init_tbl_enrollment_offered_subject_sections(tbl_enrollment_offered_subject_sections);
    }

    Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections section = null;
    Academic_years.to_academic_years acad_year = null;
    String period = "";

    public void do_pass(Dlg_dean_student_advice_load_subject_students.students to, Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections sec, Academic_years.to_academic_years acad, String term) {
        section = sec;
        acad_year = acad;
        period = term;
        Field.Input st = (Field.Input) tf_field16;
        st.setText(to.student_no);
        st.setId("" + to.student_id);
        tf_field17.setText(to.name);
        List<Students.to_students> students = Students.ret_data(" where id='" + to.student_id + "' ");
        if (!students.isEmpty()) {
            Students.to_students student = (Students.to_students) students.get(0);
            tf_field18.setText(student.course_code);
            tf_field19.setText(student.year_level);
            tf_field20.setText(student.mobile_no);
        }
        //set section details
        tf_field21.setText(sec.subject_code);
        tf_field22.setText(sec.section);
        tf_field23.setText(sec.description);
        String day = sec.day.replaceAll("&nbsp;&nbsp;", "");
        day = day.replaceAll("<br>", "\n");
        jTextArea1.setText(day);
        tf_field24.setText(sec.faculty_name);
        tf_field25.setText(sec.created_by);
        tf_field26.setText(sec.updated_by);
        tf_field27.setText(sec.room);
        if (sec.status == 0) {
            tf_field28.setText("Posted");
        } else if (sec.status == 1) {
            String[] cap = sec.created_by.split(" of ");
            int min = FitIn.toInt(cap[0]);
            int max = FitIn.toInt(cap[1]);
            if (min >= max) {
                tf_field28.setText("Full");
            } else {
                tf_field28.setText("Open");
            }

        } else if (sec.status == 2) {
            tf_field28.setText("Closed");
        } else {
            tf_field28.setText("Dropped");
        }

        //retrieve loaded subject
        ret_loaded_subjects();
        //retrived available section
        ret_eos();
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

    //<editor-fold defaultstate="collapsed" desc=" enrollment_student_loaded_subjects "> 
    public static ArrayListModel tbl_enrollment_student_loaded_subjects_ALM;
    public static Tblenrollment_student_loaded_subjectsModel tbl_enrollment_student_loaded_subjects_M;

    public static void init_tbl_enrollment_student_loaded_subjects(JTable tbl_enrollment_student_loaded_subjects) {
        tbl_enrollment_student_loaded_subjects_ALM = new ArrayListModel();
        tbl_enrollment_student_loaded_subjects_M = new Tblenrollment_student_loaded_subjectsModel(tbl_enrollment_student_loaded_subjects_ALM);
        tbl_enrollment_student_loaded_subjects.setModel(tbl_enrollment_student_loaded_subjects_M);
        tbl_enrollment_student_loaded_subjects.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_enrollment_student_loaded_subjects.setRowHeight(25);
        int[] tbl_widths_enrollment_student_loaded_subjects = {100, 100, 0, 0, 60, 60, 70, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_enrollment_student_loaded_subjects.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_enrollment_student_loaded_subjects, i, tbl_widths_enrollment_student_loaded_subjects[i]);
        }
        Dimension d = tbl_enrollment_student_loaded_subjects.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_enrollment_student_loaded_subjects.getTableHeader().setPreferredSize(d);
        tbl_enrollment_student_loaded_subjects.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_enrollment_student_loaded_subjects.setRowHeight(25);
        tbl_enrollment_student_loaded_subjects.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_enrollment_student_loaded_subjects.getColumnModel().getColumn(7).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_enrollment_student_loaded_subjects(List<Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects> acc) {
        tbl_enrollment_student_loaded_subjects_ALM.clear();
        tbl_enrollment_student_loaded_subjects_ALM.addAll(acc);
    }

    public static class Tblenrollment_student_loaded_subjectsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Subject Code", "Description", "Lec", "Lab", "Section", "Room", "Day", "", "academic_offering_subject_id", "academic_offering_id", "academic_year_id", "academic_year", "level_id", "level", "college_id", "college", "department_id", "department", "course_id", "course_code", "course_description", "term", "year_level", "subject_id", "subject_code", "description", "faculty_id", "faculty_name", "section", "room_id", "room", "schedule", "day", "time", "start_time", "closing_time", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded"
        };

        public Tblenrollment_student_loaded_subjectsModel(ListModel listmodel) {
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
                    return " " + tt.lecture_units;
                case 3:
                    return " " + tt.lab_units;
                case 4:
                    return " " + tt.section;
                case 5:
                    return " " + tt.room;
                case 6:
                    String day = DateType.mwf(tt.day);
                    return " " + day;
                case 7:
                    return "/cis/icons/remove11.png";
                case 8:
                    return tt.academic_offering_subject_id;
                case 9:
                    return tt.academic_offering_id;
                case 10:
                    return tt.academic_year_id;
                case 11:
                    return tt.academic_year;
                case 12:
                    return tt.level_id;
                case 13:
                    return tt.level;
                case 14:
                    return tt.college_id;
                case 15:
                    return tt.college;
                case 16:
                    return tt.department_id;
                case 17:
                    return tt.department;
                case 18:
                    return tt.course_id;
                case 19:
                    return tt.course_code;
                case 20:
                    return tt.course_description;
                case 21:
                    return tt.term;
                case 22:
                    return tt.year_level;
                case 23:
                    return tt.subject_id;
                case 24:
                    return tt.subject_code;
                case 25:
                    return tt.description;
                case 26:
                    return tt.faculty_id;
                case 27:
                    return tt.faculty_name;
                case 28:
                    return tt.section;
                case 29:
                    return tt.room_id;
                case 30:
                    return tt.room;
                case 31:
                    return tt.schedule;
                case 32:
                    return tt.day;
                case 33:
                    return tt.time;
                case 34:
                    return tt.start_time;
                case 35:
                    return tt.closing_time;
                case 36:
                    return tt.created_at;
                case 37:
                    return tt.updated_at;
                case 38:
                    return tt.created_by;
                case 39:
                    return tt.updated_by;
                case 40:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }

    private void ret_loaded_subjects() {
        Field.Input tf = (Field.Input) tf_field16;

        String where = " where academic_year_id='" + acad_year.id + "' and term like '" + period + "' and student_id='" + tf.getId() + "' and status<2 order by description asc ";
//        System.out.println(where);
        List<Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects> datas = Enrollment_student_loaded_subjects.ret_data(where);

        loadData_enrollment_student_loaded_subjects(datas);
        jLabel2.setText("" + datas.size());
    }

    //<editor-fold defaultstate="collapsed" desc=" enrollment_offered_subject_sections "> 
    public static ArrayListModel tbl_enrollment_offered_subject_sections_ALM;
    public static Tblenrollment_offered_subject_sectionsModel tbl_enrollment_offered_subject_sections_M;

    public static void init_tbl_enrollment_offered_subject_sections(JTable tbl_enrollment_offered_subject_sections) {
        tbl_enrollment_offered_subject_sections_ALM = new ArrayListModel();
        tbl_enrollment_offered_subject_sections_M = new Tblenrollment_offered_subject_sectionsModel(tbl_enrollment_offered_subject_sections_ALM);
        tbl_enrollment_offered_subject_sections.setModel(tbl_enrollment_offered_subject_sections_M);
        tbl_enrollment_offered_subject_sections.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_enrollment_offered_subject_sections.setRowHeight(25);
        int[] tbl_widths_enrollment_offered_subject_sections = {90, 100, 70, 50, 130, 220, 0, 120, 90, 90, 70, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_enrollment_offered_subject_sections.length; i < n; i++) {
            if (i == 7 || i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_enrollment_offered_subject_sections, i, tbl_widths_enrollment_offered_subject_sections[i]);
        }
        Dimension d = tbl_enrollment_offered_subject_sections.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_enrollment_offered_subject_sections.getTableHeader().setPreferredSize(d);
        tbl_enrollment_offered_subject_sections.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_enrollment_offered_subject_sections.setRowHeight(60);
        tbl_enrollment_offered_subject_sections.setFont(new java.awt.Font("Arial", 0, 12));

        TableColumnModel tcm = tbl_enrollment_offered_subject_sections.getColumnModel();
        TableColumn tm = tcm.getColumn(5);
        tm.setCellRenderer(new Dlg_academic_offerings.Html());
    }

    public static class Html extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
            JLabel lbl = new JLabel();
            lbl.setText(value.toString());
            lbl.setOpaque(true);
            lbl.setBackground(Color.white);
            if (selected) {
                lbl.setBackground(new java.awt.Color(0, 120, 215));
                lbl.setForeground(new java.awt.Color(255, 255, 255));
            }
            return lbl;
        }
    }

    public static void loadData_enrollment_offered_subject_sections(List<Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections> acc) {
        tbl_enrollment_offered_subject_sections_ALM.clear();
        tbl_enrollment_offered_subject_sections_ALM.addAll(acc);
    }

    public static class Tblenrollment_offered_subject_sectionsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Code", "Description", "Section", "Max", "Room", "Day", "Time", "Instructor", "Capacity", "Pending", "Status", "created_by", "updated_by", "status", "is_uploaded"
        };

        public Tblenrollment_offered_subject_sectionsModel(ListModel listmodel) {
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
            Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections tt = (Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.subject_code;
                case 1:
                    return " " + tt.description;
                case 2:
                    return " " + tt.section;
                case 3:
                    return " " + tt.max_students;
                case 4:
                    return " " + tt.room;
                case 5:
                    String html = "<html><body>"
                            + " <p><font size=\"4\" > " + tt.day + "</font></p>"
                            + "</body>"
                            + "</html>";
                    return html;
                case 6:
                    return " " + tt.time;
                case 7:
                    return " " + tt.faculty_name;
                case 8:
                    return " " + tt.created_by;
                case 9:
                    return " " + tt.updated_by;
                case 10:
                    if (tt.status == 0) {
                        return " Posted";
                    } else if (tt.status == 1) {
                        String[] cap = tt.created_by.split(" of ");
                        int min = FitIn.toInt(cap[0]);
                        int max = FitIn.toInt(cap[1]);
                        if (min >= max) {
                            return " Full";
                        } else {
                            return " Open";
                        }

                    } else if (tt.status == 2) {
                        return " Closed";
                    } else {
                        return " Dropped";
                    }
                case 11:
                    return tt.created_by;
                case 12:
                    return tt.updated_by;
                case 13:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }

    private void ret_eos() {
        String where = " where enrollment_offered_subject_id='" + section.enrollment_offered_subject_id + "' and status<2 and id<> '" + section.id + "' order by description,section asc ";
        List<Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections> datas = Enrollment_offered_subject_sections.ret_data2(where);
        loadData_enrollment_offered_subject_sections(datas);
        jLabel4.setText("" + datas.size());

    }

    private void select_section() {
        int row = tbl_enrollment_offered_subject_sections.getSelectedRow();
        if (row < 0) {
            return;
        }
        Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections to = (Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections) tbl_enrollment_offered_subject_sections_ALM.get(row);

        if (to.status == 0) {
            Alert.set(0, "Subject not yet open!");
            return;
        }
        if (to.status == 1) {

            String[] cap = to.created_by.split(" of ");
            int min = FitIn.toInt(cap[0]);
            int max = FitIn.toInt(cap[1]);
            if (min >= max) {
                Alert.set(0, "Section already full!");
                return;
            }
        }

        boolean check = check_if_exists();

        if (check) {
            Alert.set(0, "Day/Time not available!");
            return;
        }

        Window p = (Window) this;
        Dlg_confirm_delete2 nd = Dlg_confirm_delete2.create(p, true);
        nd.setTitle("");
        nd.do_pass("<html>Are you sure you want to transfer <br>Subject Code: <b>" + to.subject_code + "</b><br>Section <b>" + tf_field22.getText() + "</b> to <b>" + to.section
                + "</> </html>");

        nd.setCallback(new Dlg_confirm_delete2.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_delete2.OutputData data) {
                closeDialog.ok();
                
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private boolean check_if_exists() {

        int row = tbl_enrollment_offered_subject_sections.getSelectedRow();
        if (row < 0) {

        }
        Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections eoss = (Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections) tbl_enrollment_offered_subject_sections_ALM.get(row);

        String[] days3 = eoss.day.split("<br>");
        boolean available = true;
        List<Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects> subjects = tbl_enrollment_student_loaded_subjects_ALM;
        Field.Input tf = (Field.Input) tf_field21;
        for (int i = 0; i < days3.length; i++) {
            String d = days3[i];
            d = d.replaceAll("&nbsp;&nbsp;", "");
            String[] dd = d.split(": ");
            String day1 = dd[0];

            List<String> schedules = new ArrayList();
            for (Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects to : subjects) {
                if (to.subject_id != FitIn.toInt(tf.getId())) {

                    schedules.add(to.day);
                }
            }
            available = DayCheck.compare_schedule(d, schedules);

        }

        return available;
    }

    private void select_enrolled_subject() {
        int row = tbl_enrollment_student_loaded_subjects.getSelectedRow();
        if (row < 0) {
            return;
        }
        Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects to = (Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects) tbl_enrollment_student_loaded_subjects_ALM.get(row);
        Window p = (Window) this;
        Dlg_registrar_student_transfer_section_student_section_day nd = Dlg_registrar_student_transfer_section_student_section_day.create(p, true);
        nd.setTitle("");
        nd.do_pass(to.day);
        nd.setCallback(new Dlg_registrar_student_transfer_section_student_section_day.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_registrar_student_transfer_section_student_section_day.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(jScrollPane2);
        nd.setVisible(true);
    }
}
