/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.deans_portal;

import cis.academic.Academic_offerings;
import cis.colleges.Colleges;
import cis.departments.Departments;
import cis.students.*;
import cis.enrollments.Enrollments;
import cis.users.MyUser;
import cis.utils.Alert;
import cis.utils.DateType;
import cis.utils.Dlg_confirm_action;
import cis.utils.TableRenderer;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextField;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import synsoftech.fields.Button;
import synsoftech.fields.Field;

/**
 *
 * @author Ronescape
 */
public class Dlg_dean_student_advice_details extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_student_enrollment
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
    private Dlg_dean_student_advice_details(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_dean_student_advice_details(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_dean_student_advice_details() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_dean_student_advice_details myRef;

    private void setThisRef(Dlg_dean_student_advice_details myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_dean_student_advice_details> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_dean_student_advice_details create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_dean_student_advice_details create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_dean_student_advice_details dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_dean_student_advice_details((java.awt.Frame) parent, false);
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
            Dlg_dean_student_advice_details dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_dean_student_advice_details((java.awt.Dialog) parent, false);
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

        Dlg_dean_student_advice_details dialog = Dlg_dean_student_advice_details.create(new javax.swing.JFrame(), true);
//        Toolkit tk = Toolkit.getDefaultToolkit();
//        int xSize = ((int) tk.getScreenSize().
//                getWidth());
//        int ySize = ((int) tk.getScreenSize().
//                getHeight());
//        dialog.setSize(xSize, ySize);
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
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel31 = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel28 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        tf_field18 = new Field.Input();
        jLabel32 = new javax.swing.JLabel();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jLabel67 = new javax.swing.JLabel();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        tf_field105 = new Field.Input();
        jLabel68 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        tf_field16 = new Field.Input();
        jLabel26 = new javax.swing.JLabel();
        tf_field17 = new Field.Input();
        jLabel22 = new javax.swing.JLabel();
        tf_field14 = new Field.Input();
        jLabel21 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel23 = new javax.swing.JLabel();
        tf_field15 = new Field.Input();
        jLabel24 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel12 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        tf_field11 = new Field.Input();
        jLabel19 = new javax.swing.JLabel();
        tf_field12 = new Field.Input();
        jLabel20 = new javax.swing.JLabel();
        tf_field13 = new Field.Input();
        jLabel16 = new javax.swing.JLabel();
        tf_field9 = new Field.Input();
        jLabel17 = new javax.swing.JLabel();
        tf_field10 = new Field.Input();
        jLabel66 = new javax.swing.JLabel();
        tf_field104 = new Field.Input();
        jPanel13 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        tf_field5 = new Field.Input();
        jLabel13 = new javax.swing.JLabel();
        tf_field6 = new Field.Input();
        jLabel14 = new javax.swing.JLabel();
        tf_field7 = new Field.Input();
        jLabel15 = new javax.swing.JLabel();
        tf_field8 = new Field.Input();
        jPanel2 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        tf_field19 = new Field.Input();
        tf_field106 = new Field.Input();
        tf_field20 = new Field.Input();
        tf_field109 = new Field.Input();
        tf_field21 = new Field.Input();
        jPanel18 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        tf_field22 = new Field.Input();
        tf_field107 = new Field.Input();
        tf_field23 = new Field.Input();
        tf_field110 = new Field.Input();
        tf_field24 = new Field.Input();
        jPanel19 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        tf_field25 = new Field.Input();
        tf_field108 = new Field.Input();
        tf_field26 = new Field.Input();
        tf_field111 = new Field.Input();
        tf_field27 = new Field.Input();
        jPanel20 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        tf_field112 = new Field.Input();
        tf_field113 = new Field.Input();
        tf_field114 = new Field.Input();
        tf_field115 = new Field.Input();
        tf_field116 = new Field.Input();
        jButton2 = new Button.Primary();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        tf_field31 = new Field.Input();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        tf_field32 = new Field.Input();
        jLabel47 = new javax.swing.JLabel();
        tf_field33 = new Field.Input();
        tf_field34 = new Field.Input();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        tf_field35 = new Field.Input();
        tf_field36 = new Field.Input();
        tf_field37 = new Field.Input();
        tf_field38 = new Field.Input();
        tf_field39 = new Field.Input();
        jLabel50 = new javax.swing.JLabel();
        tf_field40 = new Field.Input();
        tf_field41 = new Field.Input();
        jLabel51 = new javax.swing.JLabel();
        tf_field42 = new Field.Input();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        tf_field43 = new Field.Input();
        tf_field44 = new Field.Input();
        tf_field45 = new Field.Input();
        tf_field46 = new Field.Input();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        tf_field47 = new Field.Input();
        tf_field48 = new Field.Input();
        tf_field49 = new Field.Input();
        tf_field50 = new Field.Input();
        jLabel56 = new javax.swing.JLabel();
        tf_field51 = new Field.Input();
        tf_field52 = new Field.Input();
        jPanel8 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        tf_field53 = new Field.Input();
        tf_field54 = new Field.Input();
        tf_field55 = new Field.Input();
        tf_field56 = new Field.Input();
        tf_field57 = new Field.Input();
        tf_field58 = new Field.Input();
        tf_field59 = new Field.Input();
        tf_field60 = new Field.Input();
        tf_field61 = new Field.Input();
        tf_field62 = new Field.Input();
        tf_field63 = new Field.Input();
        tf_field64 = new Field.Input();
        tf_field65 = new Field.Input();
        tf_field66 = new Field.Input();
        tf_field67 = new Field.Input();
        tf_field68 = new Field.Input();
        tf_field69 = new Field.Input();
        tf_field70 = new Field.Input();
        tf_field71 = new Field.Input();
        tf_field72 = new Field.Input();
        tf_field73 = new Field.Input();
        tf_field74 = new Field.Input();
        tf_field75 = new Field.Input();
        tf_field76 = new Field.Input();
        tf_field77 = new Field.Input();
        tf_field78 = new Field.Input();
        tf_field79 = new Field.Input();
        tf_field80 = new Field.Input();
        tf_field81 = new Field.Input();
        tf_field82 = new Field.Input();
        tf_field83 = new Field.Input();
        tf_field84 = new Field.Input();
        tf_field85 = new Field.Input();
        tf_field86 = new Field.Input();
        tf_field87 = new Field.Input();
        tf_field88 = new Field.Input();
        tf_field89 = new Field.Input();
        tf_field90 = new Field.Input();
        tf_field91 = new Field.Input();
        tf_field92 = new Field.Input();
        tf_field93 = new Field.Input();
        tf_field94 = new Field.Input();
        tf_field95 = new Field.Input();
        tf_field96 = new Field.Input();
        tf_field97 = new Field.Input();
        tf_field98 = new Field.Input();
        tf_field99 = new Field.Input();
        tf_field100 = new Field.Input();
        jLabel72 = new javax.swing.JLabel();
        tf_field117 = new Field.Input();
        tf_field118 = new Field.Input();
        tf_field119 = new Field.Input();
        tf_field120 = new Field.Input();
        tf_field121 = new Field.Input();
        tf_field122 = new Field.Input();
        tf_field123 = new Field.Input();
        tf_field124 = new Field.Input();
        jButton3 = new Button.Success();
        jButton4 = new Button.Default();
        jPanel9 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        tf_field101 = new Field.Input();
        tf_field102 = new Field.Input();
        jLabel64 = new javax.swing.JLabel();
        tf_field103 = new Field.Input();
        jLabel65 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        tf_field28 = new Field.Input();
        jLabel45 = new javax.swing.JLabel();
        tf_field29 = new Field.Input();
        jLabel46 = new javax.swing.JLabel();
        tf_field30 = new Field.Input();
        jPanel15 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        tf_field125 = new Field.Input();
        jLabel74 = new javax.swing.JLabel();
        tf_field126 = new Field.Input();
        jLabel78 = new javax.swing.JLabel();
        tf_field127 = new Field.Search();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new Button.Primary();
        jLabel79 = new javax.swing.JLabel();
        tf_field128 = new Field.Combo();
        jLabel75 = new javax.swing.JLabel();
        tf_field130 = new Field.Input();
        jLabel76 = new javax.swing.JLabel();
        tf_field131 = new Field.Input();
        tf_field132 = new Field.Input();
        jLabel77 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jButton6 = new Button.Success();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel10.setOpaque(false);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Civil Status:");

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setText("Single");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Date of:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Communion");

        jDateChooser2.setDate(new Date());
        jDateChooser2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox4.setText("Married");

        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox5.setText("Widow");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Confirmation:");

        jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox6.setText("Annulled");

        jLabel28.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel28.setText("If Married Name of Spouse:");

        jDateChooser3.setDate(new Date());
        jDateChooser3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_field18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Are you:");

        jCheckBox9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox9.setSelected(true);
        jCheckBox9.setText("Left Handed");

        jCheckBox10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox10.setText("Right Handed");

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel67.setText("Member of Indigenous Community?");

        jCheckBox11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox11.setText("Yes");

        jCheckBox12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox12.setSelected(true);
        jCheckBox12.setText("No");

        tf_field105.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel68.setText("Name of the Community:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel28)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox9)
                                .addGap(4, 4, 4)
                                .addComponent(jCheckBox10))
                            .addComponent(tf_field18, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field105)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox6)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox9)
                        .addComponent(jCheckBox10)))
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox11)
                    .addComponent(jCheckBox12)
                    .addComponent(tf_field105, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel11.setOpaque(false);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Citizenship:");

        tf_field16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Religion:");

        tf_field17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field17ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Birth Place:");

        tf_field14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Birthdate:");

        jDateChooser1.setDate(new Date());
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Age:");

        tf_field15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Gender:");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Male");

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setText("Female");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field17, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2)
                        .addGap(178, 178, 178))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field14)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox1)
                        .addComponent(jCheckBox2)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel12.setOpaque(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Email Add.:");

        tf_field11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Tel No.:");

        tf_field12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Mobile No.:");

        tf_field13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Permanent Address:");

        tf_field9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Postal Code:");

        tf_field10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel66.setText("Current Address:");

        tf_field104.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(tf_field11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_field12, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_field9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_field13, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_field10))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field104)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field104, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel13.setOpaque(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cis/icons2/user.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel14.setOpaque(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("First Name:");

        tf_field5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Middle Name:");

        tf_field6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Last Name:");

        tf_field7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Nick Name:");

        tf_field8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(tf_field5, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field6))
                    .addComponent(tf_field7)
                    .addComponent(tf_field8))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Educational Background", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jPanel16.setOpaque(false);

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Grade");
        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Grade School");
        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("Junior High");
        jLabel69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Senior High");
        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("Tesda Trainings Attended");
        jLabel70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("College");
        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setOpaque(false);

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Name and Address of School");
        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field19.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field106.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field106.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field20.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field109.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field109.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field21.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
            .addComponent(tf_field19, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tf_field20)
            .addComponent(tf_field109)
            .addComponent(tf_field21)
            .addComponent(tf_field106)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field106, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field109, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setOpaque(false);

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Region");
        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field22.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field107.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field107.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_field23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field23ActionPerformed(evt);
            }
        });

        tf_field110.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field110.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field24.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
            .addComponent(tf_field22)
            .addComponent(tf_field107, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tf_field110, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tf_field23)
            .addComponent(tf_field24, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field107, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field110, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel19.setOpaque(false);

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Year Attended");
        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field25.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field108.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field108.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field26.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field111.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field111.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field27.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
            .addComponent(tf_field25, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tf_field108, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tf_field26, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tf_field111, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tf_field27, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field108, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field111, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel20.setOpaque(false);

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("Scholarship/Academic Awards");
        jLabel71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field112.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field112.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field113.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field113.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field114.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field114.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field115.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field115.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field116.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field116.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
            .addComponent(tf_field112, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tf_field113, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tf_field114, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tf_field115, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tf_field116, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field112, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field113, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field114, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field115, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_field116, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Info 1", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Family Background", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel40.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Name");
        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field31.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field31.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Father");
        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Mother");
        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field32.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field32.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel47.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Citizenship");
        jLabel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field33.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field33.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field34.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field34.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel48.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Home Address");
        jLabel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel49.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Email Address");
        jLabel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field35.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field35.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field36.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field36.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field37.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field37.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field38.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field38.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field39.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field39.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel50.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Occupation");
        jLabel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field40.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field40.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field41.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field41.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel51.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Tel. No. & Mobile No.");
        jLabel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field42.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field42.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel52.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Employer");
        jLabel52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel53.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Business Address");
        jLabel53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field43.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field43.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field44.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field44.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field45.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field45.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field46.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field46.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel54.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Educational Attainment");
        jLabel54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel55.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Last School Attended");
        jLabel55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field47.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field47.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field48.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field48.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field49.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field49.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field50.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field50.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel56.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Telephone Number");
        jLabel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field51.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field51.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field52.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field52.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(tf_field51)
                                .addGap(1, 1, 1)
                                .addComponent(tf_field52))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(tf_field47)
                                .addGap(1, 1, 1)
                                .addComponent(tf_field49))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(tf_field48)
                                .addGap(1, 1, 1)
                                .addComponent(tf_field50))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_field31))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_field32)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(tf_field33)
                                .addGap(1, 1, 1)
                                .addComponent(tf_field34))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(tf_field35)
                                .addGap(1, 1, 1)
                                .addComponent(tf_field37))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(tf_field36)
                                .addGap(1, 1, 1)
                                .addComponent(tf_field38))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(tf_field42)
                                .addGap(1, 1, 1)
                                .addComponent(tf_field39))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(tf_field40)
                                .addGap(1, 1, 1)
                                .addComponent(tf_field41))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(tf_field43)
                                .addGap(1, 1, 1)
                                .addComponent(tf_field45))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(tf_field44)
                                .addGap(1, 1, 1)
                                .addComponent(tf_field46)))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(tf_field32, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_field31, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_field34, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field33, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_field37, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field35, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_field38, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field36, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_field39, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field42, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_field41, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field40, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_field45, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field43, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_field46, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field44, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_field52, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field51, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_field49, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field47, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_field50, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field48, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Brothers and Sisters (Please list from the eldest to youngest)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Name");
        jLabel57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Age");
        jLabel58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Civil Status");
        jLabel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("School");
        jLabel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Course");
        jLabel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Year");
        jLabel62.setToolTipText("Year Graduated");
        jLabel62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field53.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field53.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field54.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field54.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field55.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field55.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field56.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field56.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field57.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field57.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field58.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field58.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field59.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field59.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field60.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field60.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field61.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field61.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field62.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field62.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field63.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field63.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field64.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field64.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field65.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field65.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field66.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field66.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field67.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field67.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field68.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field68.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field69.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field69.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field70.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field70.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field71.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field71.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field72.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field72.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field73.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field73.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field74.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field74.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field75.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field75.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field76.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field76.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field77.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field77.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field78.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field78.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field79.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field79.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field80.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field80.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field81.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field81.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field82.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field82.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field83.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field83.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field84.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field84.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field85.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field85.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field86.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field86.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field87.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field87.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field88.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field88.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field89.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field89.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_field89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field89ActionPerformed(evt);
            }
        });

        tf_field90.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field90.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field91.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field91.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field92.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field92.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field93.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field93.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field94.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field94.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field95.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field95.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field96.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field96.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field97.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field97.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field98.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field98.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field99.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field99.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field100.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field100.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("Occupation");
        jLabel72.setToolTipText("Year Graduated");
        jLabel72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field117.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field117.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field118.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field118.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field119.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field119.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field120.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field120.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field121.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field121.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_field121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field121ActionPerformed(evt);
            }
        });

        tf_field122.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field122.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field123.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field123.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_field124.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_field124.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_field71)
                            .addComponent(tf_field65)
                            .addComponent(tf_field59)
                            .addComponent(tf_field53)
                            .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_field72)
                            .addComponent(tf_field66)
                            .addComponent(tf_field60)
                            .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(tf_field54))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_field73)
                            .addComponent(tf_field67)
                            .addComponent(tf_field61)
                            .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(tf_field55))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_field74)
                            .addComponent(tf_field68)
                            .addComponent(tf_field62)
                            .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(tf_field56))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_field75)
                            .addComponent(tf_field69)
                            .addComponent(tf_field63)
                            .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(tf_field57))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field58, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field64, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field70, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field76, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_field77, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                            .addComponent(tf_field90, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_field83, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_field84))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_field78, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(tf_field91, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_field85)
                            .addComponent(tf_field96))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_field79, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(tf_field92, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_field86)
                            .addComponent(tf_field97))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_field80, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                    .addComponent(tf_field98)
                                    .addComponent(tf_field93))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_field81, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                    .addComponent(tf_field94, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_field99))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_field82, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_field95, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_field100, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(tf_field87, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(tf_field88, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(tf_field89, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field117, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field118, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field119, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field120, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tf_field123, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field122, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field124, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field121, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(tf_field117, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(tf_field118, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(tf_field119, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(tf_field120, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(tf_field121, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(tf_field122, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(tf_field123, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(tf_field124, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_field53, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field54, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field55, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field56, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field57, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field58, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_field59, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field60, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field61, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field62, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field63, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field64, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_field65, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field66, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field67, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field68, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field69, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field70, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_field71, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field72, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field73, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field74, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field75, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field76, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_field83, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field85, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field86, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field87, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field88, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field89, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_field90, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field91, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field92, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field93, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field94, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field95, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_field77, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field78, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field79, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field80, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field81, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field82, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_field84, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field96, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field97, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field98, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field99, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_field100, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5))
        );

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Guardian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel63.setText("Name:");

        tf_field101.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        tf_field102.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel64.setText("Address:");

        tf_field103.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel65.setText("Tel. No.:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_field101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_field102)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_field103)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field103, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field101, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_field102, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preferred Course", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("1.)");
        jLabel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("2.)");
        jLabel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("3.)");
        jLabel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_field30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field30))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_field29)
                            .addComponent(tf_field28))))
                .addGap(13, 13, 13))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_field28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_field30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jTabbedPane1.addTab("Info 2", jPanel5);

        jTabbedPane2.addTab("Personal Information", jTabbedPane1);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Choose Year/Course", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

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
        jLabel74.setText("Level/College:");

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

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel78.setText("Search:");

        tf_field127.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Requirements", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("No. of rows:");

        jLabel3.setText("0");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Save");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel79.setText("Year:");

        tf_field128.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field128.setText("First Year");
        tf_field128.setFocusable(false);
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

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel75.setText("Description:");

        tf_field130.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field130.setFocusable(false);
        tf_field130.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field130MouseClicked(evt);
            }
        });
        tf_field130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field130ActionPerformed(evt);
            }
        });

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel76.setText("Course Code:");

        tf_field131.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field131.setFocusable(false);
        tf_field131.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field131MouseClicked(evt);
            }
        });
        tf_field131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field131ActionPerformed(evt);
            }
        });

        tf_field132.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field132.setFocusable(false);
        tf_field132.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field132MouseClicked(evt);
            }
        });
        tf_field132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field132ActionPerformed(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel77.setText("No. of Years:");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel78, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel79, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_field130)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(tf_field128)
                                .addGap(230, 230, 230))
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_field125)
                            .addComponent(tf_field126)
                            .addComponent(tf_field127)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(tf_field131, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_field132, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field127, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field131, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field132, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field130, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field125, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field126, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field128, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Subject Offerings", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Subject Loads", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText("Finish Advising");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Advice", jPanel15);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 847, Short.MAX_VALUE)
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

    private void tf_field17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field17ActionPerformed

    private void tf_field23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field23ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tf_field89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field89ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field89ActionPerformed

    private void tf_field121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field121ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field121ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        save_application();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tf_field125MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field125MouseClicked
        //        init_departments();
    }//GEN-LAST:event_tf_field125MouseClicked

    private void tf_field125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field125ActionPerformed
        //        init_departments();
    }//GEN-LAST:event_tf_field125ActionPerformed

    private void tf_field126MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field126MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field126MouseClicked

    private void tf_field126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field126ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field126ActionPerformed

    private void tf_field127MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field127MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field127MouseClicked

    private void tf_field127ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field127ActionPerformed
        init_courses();
    }//GEN-LAST:event_tf_field127ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     save_year_course();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tf_field128MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field128MouseClicked
        init_years();
    }//GEN-LAST:event_tf_field128MouseClicked

    private void tf_field128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field128ActionPerformed
        init_years();
    }//GEN-LAST:event_tf_field128ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tf_field130MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field130MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field130MouseClicked

    private void tf_field130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field130ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field130ActionPerformed

    private void tf_field131MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field131MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field131MouseClicked

    private void tf_field131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field131ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field131ActionPerformed

    private void tf_field132MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field132MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field132MouseClicked

    private void tf_field132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field132ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field132ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tf_field10;
    private javax.swing.JTextField tf_field100;
    private javax.swing.JTextField tf_field101;
    private javax.swing.JTextField tf_field102;
    private javax.swing.JTextField tf_field103;
    private javax.swing.JTextField tf_field104;
    private javax.swing.JTextField tf_field105;
    private javax.swing.JTextField tf_field106;
    private javax.swing.JTextField tf_field107;
    private javax.swing.JTextField tf_field108;
    private javax.swing.JTextField tf_field109;
    private javax.swing.JTextField tf_field11;
    private javax.swing.JTextField tf_field110;
    private javax.swing.JTextField tf_field111;
    private javax.swing.JTextField tf_field112;
    private javax.swing.JTextField tf_field113;
    private javax.swing.JTextField tf_field114;
    private javax.swing.JTextField tf_field115;
    private javax.swing.JTextField tf_field116;
    private javax.swing.JTextField tf_field117;
    private javax.swing.JTextField tf_field118;
    private javax.swing.JTextField tf_field119;
    private javax.swing.JTextField tf_field12;
    private javax.swing.JTextField tf_field120;
    private javax.swing.JTextField tf_field121;
    private javax.swing.JTextField tf_field122;
    private javax.swing.JTextField tf_field123;
    private javax.swing.JTextField tf_field124;
    private javax.swing.JTextField tf_field125;
    private javax.swing.JTextField tf_field126;
    private javax.swing.JTextField tf_field127;
    private javax.swing.JTextField tf_field128;
    private javax.swing.JTextField tf_field13;
    private javax.swing.JTextField tf_field130;
    private javax.swing.JTextField tf_field131;
    private javax.swing.JTextField tf_field132;
    private javax.swing.JTextField tf_field14;
    private javax.swing.JTextField tf_field15;
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
    private javax.swing.JTextField tf_field29;
    private javax.swing.JTextField tf_field30;
    private javax.swing.JTextField tf_field31;
    private javax.swing.JTextField tf_field32;
    private javax.swing.JTextField tf_field33;
    private javax.swing.JTextField tf_field34;
    private javax.swing.JTextField tf_field35;
    private javax.swing.JTextField tf_field36;
    private javax.swing.JTextField tf_field37;
    private javax.swing.JTextField tf_field38;
    private javax.swing.JTextField tf_field39;
    private javax.swing.JTextField tf_field40;
    private javax.swing.JTextField tf_field41;
    private javax.swing.JTextField tf_field42;
    private javax.swing.JTextField tf_field43;
    private javax.swing.JTextField tf_field44;
    private javax.swing.JTextField tf_field45;
    private javax.swing.JTextField tf_field46;
    private javax.swing.JTextField tf_field47;
    private javax.swing.JTextField tf_field48;
    private javax.swing.JTextField tf_field49;
    private javax.swing.JTextField tf_field5;
    private javax.swing.JTextField tf_field50;
    private javax.swing.JTextField tf_field51;
    private javax.swing.JTextField tf_field52;
    private javax.swing.JTextField tf_field53;
    private javax.swing.JTextField tf_field54;
    private javax.swing.JTextField tf_field55;
    private javax.swing.JTextField tf_field56;
    private javax.swing.JTextField tf_field57;
    private javax.swing.JTextField tf_field58;
    private javax.swing.JTextField tf_field59;
    private javax.swing.JTextField tf_field6;
    private javax.swing.JTextField tf_field60;
    private javax.swing.JTextField tf_field61;
    private javax.swing.JTextField tf_field62;
    private javax.swing.JTextField tf_field63;
    private javax.swing.JTextField tf_field64;
    private javax.swing.JTextField tf_field65;
    private javax.swing.JTextField tf_field66;
    private javax.swing.JTextField tf_field67;
    private javax.swing.JTextField tf_field68;
    private javax.swing.JTextField tf_field69;
    private javax.swing.JTextField tf_field7;
    private javax.swing.JTextField tf_field70;
    private javax.swing.JTextField tf_field71;
    private javax.swing.JTextField tf_field72;
    private javax.swing.JTextField tf_field73;
    private javax.swing.JTextField tf_field74;
    private javax.swing.JTextField tf_field75;
    private javax.swing.JTextField tf_field76;
    private javax.swing.JTextField tf_field77;
    private javax.swing.JTextField tf_field78;
    private javax.swing.JTextField tf_field79;
    private javax.swing.JTextField tf_field8;
    private javax.swing.JTextField tf_field80;
    private javax.swing.JTextField tf_field81;
    private javax.swing.JTextField tf_field82;
    private javax.swing.JTextField tf_field83;
    private javax.swing.JTextField tf_field84;
    private javax.swing.JTextField tf_field85;
    private javax.swing.JTextField tf_field86;
    private javax.swing.JTextField tf_field87;
    private javax.swing.JTextField tf_field88;
    private javax.swing.JTextField tf_field89;
    private javax.swing.JTextField tf_field9;
    private javax.swing.JTextField tf_field90;
    private javax.swing.JTextField tf_field91;
    private javax.swing.JTextField tf_field92;
    private javax.swing.JTextField tf_field93;
    private javax.swing.JTextField tf_field94;
    private javax.swing.JTextField tf_field95;
    private javax.swing.JTextField tf_field96;
    private javax.swing.JTextField tf_field97;
    private javax.swing.JTextField tf_field98;
    private javax.swing.JTextField tf_field99;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();

        System.setProperty("pool_db", "db_cis_cosca");
        System.setProperty("pool_password", "password");

//        List<Academic_years.to_academic_years> acad_years = Academic_years.ret_data(" where status=1 ");
//
//        if (!acad_years.isEmpty()) {
//            Academic_years.to_academic_years to = (Academic_years.to_academic_years) acad_years.get(0);
//            Field.Input year = (Field.Input) tf_field2;
//            year.setText(to.years);
//            year.setId("" + to.id);
//        }
    }

    Enrollments.to_enrollments enroll = null;

    public void do_pass(Enrollments.to_enrollments student) {
        enroll = student;
        tf_field5.setText(student.first_name);
        tf_field6.setText(student.middle_name);

        tf_field7.setText(student.last_name);
        tf_field8.setText(student.nick_name);

        tf_field104.setText(student.current_address);
        tf_field9.setText(student.permanent_address);
        tf_field10.setText(student.postal_code);
        tf_field11.setText(student.email_address);
        tf_field12.setText(student.tel_no);
        tf_field13.setText(student.mobile_no);

        try {
            Date d = DateType.sf.parse(student.date_of_birth);
            jDateChooser1.setDate(d);
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_dean_student_advice_details.class.getName()).log(Level.SEVERE, null, ex);
        }
        tf_field15.setText("" + student.age);
        if (student.gender == 1) {
            jCheckBox1.setSelected(true);
        } else {
            jCheckBox2.setSelected(true);
        }

        tf_field14.setText(student.place_of_birth);
        tf_field16.setText(student.citizenship);
        tf_field17.setText(student.religion);

        if (student.civil_status.equals("1")) {
            jCheckBox3.setSelected(true);
        } else if (student.civil_status.equals("2")) {
            jCheckBox4.setSelected(true);
        } else if (student.civil_status.equals("3")) {
            jCheckBox5.setSelected(true);
        } else {
            jCheckBox6.setSelected(true);
        }

        try {
            Date d1 = DateType.sf.parse(student.date_of_communion);
            jDateChooser2.setDate(d1);
            Date d2 = DateType.sf.parse(student.date_of_confirmation);
            jDateChooser3.setDate(d2);
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_dean_student_advice_details.class.getName()).log(Level.SEVERE, null, ex);
        }
        tf_field18.setText(student.spouse_name);
        tf_field105.setText(student.indigenous_name);
        if (student.is_right_handed == 1) {
            jCheckBox10.setSelected(true);
        } else {
            jCheckBox9.setSelected(true);
        }

        tf_field19.setText(student.grade_school_name);
        tf_field22.setText(student.grade_school_region);
        tf_field25.setText(student.grade_school_school_year);
        tf_field112.setText(student.grade_school_awards);

        tf_field106.setText(student.junior_high_name);
        tf_field107.setText(student.junior_high_region);
        tf_field108.setText(student.junior_high_year);
        tf_field113.setText(student.junior_high_awards);

        tf_field20.setText(student.high_school_name);
        tf_field23.setText(student.high_school_region);
        tf_field26.setText(student.high_school_school_year);
        tf_field114.setText(student.high_school_awards);

        tf_field21.setText(student.college_school_name);
        tf_field24.setText(student.college_school_region);
        tf_field27.setText(student.college_school_school_year);
        tf_field116.setText(student.college_awards);

        tf_field109.setText(student.tesda_name);
        tf_field110.setText(student.tesda_region);
        tf_field111.setText(student.tesda_year);
        tf_field115.setText(student.tesda_awards);

        tf_field28.setText(student.preferred_course1);
        tf_field29.setText(student.preferred_course2);
        tf_field30.setText(student.preferred_course3);

        tf_field31.setText(student.father_name);
        tf_field33.setText(student.father_citizenship);
        tf_field35.setText(student.father_home_address);
        tf_field36.setText(student.father_email_address);
        tf_field42.setText(student.father_mobile_no);
        tf_field40.setText(student.father_occupation);
        tf_field43.setText(student.father_employer);
        tf_field44.setText(student.father_business_address);
        tf_field51.setText(student.father_business_tel_no);
        tf_field47.setText(student.father_educational_attainment);
        tf_field48.setText(student.father_last_school_attended);

        tf_field32.setText(student.mother_name);
        tf_field34.setText(student.mother_citizenship);
        tf_field37.setText(student.mother_home_address);
        tf_field38.setText(student.mother_email_address);
        tf_field39.setText(student.mother_mobile_no);
        tf_field41.setText(student.mother_occupation);
        tf_field45.setText(student.mother_employer);
        tf_field46.setText(student.mother_business_address);
        tf_field52.setText(student.mother_business_tel_no);
        tf_field49.setText(student.mother_educational_attainment);
        tf_field50.setText(student.mother_last_school_attended);

        tf_field101.setText(student.guardian_name);
        tf_field102.setText(student.guardian_mailing_address);
        tf_field103.setText(student.guardian_telephone_no);

        String[] siblings1 = student.sibling1.split("%");
        String[] siblings2 = student.sibling2.split("%");
        String[] siblings3 = student.sibling3.split("%");
        String[] siblings4 = student.sibling4.split("%");
        String[] siblings5 = student.sibling5.split("%");
        String[] siblings6 = student.sibling6.split("%");
        String[] siblings7 = student.sibling7.split("%");
        String[] siblings8 = student.sibling8.split("%");

        tf_field53.setText(siblings1[0]);
        tf_field54.setText(siblings1[1]);
        tf_field55.setText(siblings1[2]);
        tf_field56.setText(siblings1[3]);
        tf_field57.setText(siblings1[4]);
        tf_field58.setText(siblings1[5]);
        tf_field117.setText(siblings1[6]);

        tf_field59.setText(siblings2[0]);
        tf_field60.setText(siblings2[1]);
        tf_field61.setText(siblings2[2]);
        tf_field62.setText(siblings2[3]);
        tf_field63.setText(siblings2[4]);
        tf_field64.setText(siblings2[5]);
        tf_field118.setText(siblings2[6]);

        tf_field65.setText(siblings3[0]);
        tf_field66.setText(siblings3[1]);
        tf_field67.setText(siblings3[2]);
        tf_field68.setText(siblings3[3]);
        tf_field69.setText(siblings3[4]);
        tf_field70.setText(siblings3[5]);
        tf_field119.setText(siblings3[6]);

        tf_field71.setText(siblings4[0]);
        tf_field72.setText(siblings4[1]);
        tf_field73.setText(siblings4[2]);
        tf_field74.setText(siblings4[3]);
        tf_field75.setText(siblings4[4]);
        tf_field76.setText(siblings4[5]);
        tf_field120.setText(siblings4[6]);

        tf_field83.setText(siblings5[0]);
        tf_field85.setText(siblings5[1]);
        tf_field86.setText(siblings5[2]);
        tf_field87.setText(siblings5[3]);
        tf_field88.setText(siblings5[4]);
        tf_field89.setText(siblings5[5]);
        tf_field121.setText(siblings5[6]);

        tf_field90.setText(siblings6[0]);
        tf_field91.setText(siblings6[1]);
        tf_field92.setText(siblings6[2]);
        tf_field93.setText(siblings6[3]);
        tf_field94.setText(siblings6[4]);
        tf_field95.setText(siblings6[5]);
        tf_field122.setText(siblings6[6]);

        tf_field77.setText(siblings7[0]);
        tf_field78.setText(siblings7[1]);
        tf_field79.setText(siblings7[2]);
        tf_field80.setText(siblings7[3]);
        tf_field81.setText(siblings7[4]);
        tf_field82.setText(siblings7[5]);
        tf_field123.setText(siblings7[6]);

        tf_field84.setText(siblings8[0]);
        tf_field96.setText(siblings8[1]);
        tf_field97.setText(siblings8[2]);
        tf_field98.setText(siblings8[3]);
        tf_field99.setText(siblings8[4]);
        tf_field100.setText(siblings8[5]);
        tf_field124.setText(siblings8[6]);

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

    List<String> list_year = new ArrayList();

    private void init_years() {
        Object[][] obj = new Object[list_year.size()][1];
        int i = 0;
        for (String to : list_year) {
            obj[i][0] = " " + to;

            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field128.getWidth()};
        int width = 0;
        String[] col_names = {"", "", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field128, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                String to = list_year.get(data.selected_row);
                tf_field128.setText("" + to);

            }
        });
    }

    private void save_application() {
        int id = 0;
        int is_transferee = 0;
//        if (jCheckBox8.isSelected()) {
//            is_transferee = 1;
//        }
//        Field.Input ay = (Field.Input) tf_field2;

        int academic_year_id = 0;//FitIn.toInt(ay.getId());
        String academic_year = "";// ay.getText();
        String student_no = null;
        String last_name = tf_field7.getText();
        String first_name = tf_field5.getText();
        String middle_name = tf_field6.getText();
        String nick_name = tf_field8.getText();
        String permanent_address = tf_field9.getText();
        String email_address = tf_field11.getText();
        String postal_code = tf_field10.getText();
        String tel_no = tf_field12.getText();
        String mobile_no = tf_field13.getText();
        String date_of_birth = DateType.sf.format(jDateChooser1.getDate());
        String place_of_birth = tf_field14.getText();
        int age = FitIn.toInt(tf_field15.getText());
        int gender = 0;
        if (jCheckBox1.isSelected()) {
            gender = 1;
        }
        String citizenship = tf_field16.getText();
        String religion = tf_field17.getText();
        String civil_status = "1";
        if (jCheckBox4.isSelected()) {
            civil_status = "2";
        }
        if (jCheckBox5.isSelected()) {
            civil_status = "3";
        }
        if (jCheckBox6.isSelected()) {
            civil_status = "4";
        }
        String spouse_name = tf_field18.getText();
        String date_of_communion = DateType.sf.format(jDateChooser2.getDate());
        String date_of_confirmation = DateType.sf.format(jDateChooser3.getDate());
        int is_right_hande = 0;
        if (jCheckBox10.isSelected()) {
            is_right_hande = 1;
        }
        int level_id = 0;
        String level = null;
        int college_id = 0;
        String college = null;
        int department_id = 0;
        String department = null;
        String year_level = null;
        String year_level_status = null;

        String preferred_course1 = tf_field28.getText();
        String preferred_course2 = tf_field29.getText();
        String preferred_course3 = tf_field30.getText();
        String father_name = tf_field31.getText();
        String father_citizenship = tf_field33.getText();
        String father_home_address = tf_field35.getText();
        String father_email_address = tf_field36.getText();
        String father_mobile_no = tf_field42.getText();
        String father_occupation = tf_field40.getText();
        String father_employer = tf_field43.getText();
        String father_business_address = tf_field44.getText();
        String father_business_tel_no = tf_field51.getText();
        String father_educational_attainment = tf_field47.getText();
        String father_last_school_attended = tf_field48.getText();

        String mother_name = tf_field32.getText();
        String mother_citizenship = tf_field34.getText();
        String mother_home_address = tf_field37.getText();
        String mother_email_address = tf_field38.getText();
        String mother_mobile_no = tf_field39.getText();
        String mother_occupation = tf_field41.getText();
        String mother_employer = tf_field45.getText();
        String mother_business_address = tf_field46.getText();
        String mother_business_tel_no = tf_field52.getText();
        String mother_educational_attainment = tf_field49.getText();
        String mother_last_school_attended = tf_field50.getText();

        String guardian_name = tf_field101.getText();
        String guardian_mailing_address = tf_field102.getText();
        String guardian_telephone_no = tf_field103.getText();

        String grade_school_name = tf_field19.getText();
        String grade_school_region = tf_field22.getText();
        String grade_school_school_year = tf_field25.getText();
        String grade_school_awards = tf_field112.getText();

        String high_school_name = tf_field20.getText();
        String high_school_region = tf_field23.getText();
        String high_school_school_year = tf_field26.getText();
        String high_school_awards = tf_field114.getText();

        String college_school_name = tf_field21.getText();
        String college_school_region = tf_field24.getText();
        String college_school_school_year = tf_field27.getText();
        String college_awards = tf_field116.getText();

        String junior_high_name = tf_field106.getText();
        String junior_high_region = tf_field107.getText();
        String junior_high_year = tf_field108.getText();
        String junior_high_awards = tf_field113.getText();

        String tesda_name = tf_field109.getText();
        String tesda_region = tf_field110.getText();
        String tesda_year = tf_field111.getText();
        String tesda_awards = tf_field115.getText();

        String sibling1 = concat_s(tf_field53, tf_field54, tf_field55, tf_field56, tf_field57, tf_field58);
        String sibling2 = concat_s(tf_field59, tf_field60, tf_field61, tf_field62, tf_field63, tf_field64);
        String sibling3 = concat_s(tf_field65, tf_field66, tf_field67, tf_field68, tf_field69, tf_field70);
        String sibling4 = concat_s(tf_field71, tf_field72, tf_field73, tf_field74, tf_field75, tf_field76);
        String sibling5 = concat_s(tf_field83, tf_field85, tf_field86, tf_field87, tf_field88, tf_field89);
        String sibling6 = concat_s(tf_field90, tf_field91, tf_field92, tf_field93, tf_field94, tf_field95);
        String sibling7 = concat_s(tf_field77, tf_field78, tf_field79, tf_field80, tf_field81, tf_field82);
        String sibling8 = concat_s(tf_field84, tf_field96, tf_field97, tf_field98, tf_field99, tf_field100);
        String created_at = DateType.now();
        String updated_at = DateType.now();
        String created_by = MyUser.getUser_id();
        String updated_by = MyUser.getUser_id();
        int status = 0;
        int is_uploaded = 0;

        Students.to_students student = new Students.to_students(id, is_transferee, academic_year_id, academic_year, student_no, last_name, first_name, middle_name, nick_name, permanent_address, permanent_address, email_address, postal_code, tel_no, mobile_no, date_of_birth, place_of_birth, age, gender, citizenship, religion, civil_status, spouse_name, date_of_communion, date_of_confirmation, is_right_hande, is_uploaded, spouse_name, level_id, level, college_id, college, department_id, department, year_level, year_level_status, preferred_course1, preferred_course2, preferred_course3, father_name, father_citizenship, father_home_address, father_email_address, father_mobile_no, father_occupation, father_employer, father_business_address, father_business_tel_no, father_educational_attainment, father_last_school_attended, mother_name, mother_citizenship, mother_home_address, mother_email_address, mother_mobile_no, mother_occupation, mother_employer, mother_business_address, mother_business_tel_no, mother_educational_attainment, mother_last_school_attended, guardian_name, guardian_mailing_address, guardian_telephone_no, grade_school_name, grade_school_region, grade_school_school_year, grade_school_awards, high_school_name, high_school_region, high_school_school_year, high_school_awards, college_school_name, college_school_region, college_school_school_year, college_awards, junior_high_name, junior_high_region, junior_high_year, junior_high_awards, tesda_name, tesda_region, tesda_year, tesda_awards, sibling1, sibling2, sibling3, sibling4, sibling5, sibling6, sibling7, sibling8, created_at, updated_at, created_by, updated_by, status, is_uploaded);

        Window p = (Window) this;
        Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
        nd.setTitle("");
//        nd.do_pass(services);
        nd.setCallback(new Dlg_confirm_action.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                closeDialog.ok();

                Students.add_data(student);
                Alert.set(1, "");
                clear_fields();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private String concat_s(JTextField tf1, JTextField tf2, JTextField tf3, JTextField tf4, JTextField tf5, JTextField tf6) {
        String ret = tf1.getText() + "%" + tf2.getText() + "%" + tf3.getText() + "%" + tf4.getText() + "%" + tf5.getText() + "%" + tf6.getText();
        return ret;
    }

    private void clear_fields() {
        JTextField[] tfs = {tf_field7, tf_field5, tf_field6, tf_field8, tf_field9, tf_field11, tf_field10, tf_field12, tf_field13, tf_field14, tf_field15,
            tf_field16, tf_field17, tf_field18, tf_field28, tf_field29, tf_field30, tf_field31, tf_field33, tf_field35, tf_field36, tf_field42, tf_field40, tf_field43,
            tf_field44, tf_field51, tf_field47, tf_field48, tf_field32, tf_field34, tf_field37, tf_field38, tf_field39, tf_field41, tf_field45, tf_field46, tf_field52,
            tf_field49, tf_field50, tf_field101, tf_field102, tf_field103, tf_field19, tf_field22, tf_field25, tf_field20, tf_field23, tf_field26, tf_field21, tf_field24, tf_field27,
            tf_field53, tf_field54, tf_field55, tf_field56, tf_field57, tf_field58, tf_field59, tf_field60, tf_field61, tf_field62, tf_field63, tf_field64,
            tf_field65, tf_field66, tf_field67, tf_field68, tf_field69, tf_field70, tf_field71, tf_field72, tf_field73, tf_field74, tf_field75, tf_field76,
            tf_field83, tf_field85, tf_field86, tf_field87, tf_field88, tf_field89, tf_field90, tf_field91, tf_field92, tf_field93, tf_field94, tf_field95,
            tf_field77, tf_field78, tf_field79, tf_field80, tf_field81, tf_field82, tf_field84, tf_field96, tf_field97, tf_field98, tf_field99, tf_field100

        };

        for (JTextField tf : tfs) {
            tf.setText("");
        }
        tf_field5.grabFocus();
    }

    private void init_courses() {
        String where = " where course_code like '%" + tf_field127.getText() + "%' and academic_year_id='" + enroll.academic_year_id + "' and status=1 "
                + " or course_description like '%" + tf_field127.getText() + "%' and academic_year_id='" + enroll.academic_year_id + "'  and status=1 "
                + " order by course_description asc ";
        List<Academic_offerings.to_academic_offerings> offer = Academic_offerings.ret_data(where);
        Object[][] obj = new Object[offer.size()][3];
        int i = 0;
        for (Academic_offerings.to_academic_offerings to : offer) {
            obj[i][0] = " " + to.course_code;
            obj[i][1] = " " + to.course_description;
            obj[i][2] = " " + to.no_of_years;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {100, tf_field127.getWidth() + 150, 50};
        int width = 0;
        String[] col_names = {"", "", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup2(tf_field127, obj, labels, tbl_widths_customers, col_names, tf_field127.getWidth() + 200);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Academic_offerings.to_academic_offerings off = offer.get(data.selected_row);

                Field.Input cou = (Field.Input) tf_field131;
                Field.Input dep = (Field.Input) tf_field125;
                Field.Input lev = (Field.Input) tf_field126;

                cou.setText(off.course_code);
                cou.setId("" + off.id);
                tf_field132.setText("" + off.no_of_years);
                tf_field130.setText(off.course_description);

                dep.setId("" + off.department_id);
                dep.setText(off.department_name);

                lev.setId("" + off.college_id);
                lev.setText(off.college);

                String[] years = {"First Year", "Second Year", "Third Year", "Fourth Year"};
                for (int i = 0; i < off.no_of_years; i++) {
                    list_year.add(years[i]);
                }

            }
        });
    }

    private void save_year_course() {

        Window p = (Window) this;
        Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
        nd.setTitle("");
//        nd.do_pass(services);
        nd.setCallback(new Dlg_confirm_action.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                closeDialog.ok();
                Field.Input cou = (Field.Input) tf_field131;
                Field.Input dep = (Field.Input) tf_field125;
                Field.Input lev = (Field.Input) tf_field126;

                int id = enroll.id;
                int course_id = FitIn.toInt(cou.getId());
                String course_code = cou.getText();
                String course_description = tf_field130.getText();
                int level_id = 0;
                String level = "";
                int college_id = FitIn.toInt(lev.getId());;
                String college = lev.getText();;
                int department_id = FitIn.toInt(dep.getId());
                String department = dep.getText();
                String year_level = tf_field128.getText();
                Enrollments.update_enroll_course(id, course_id, course_code, course_description, level_id, level, college_id, college, department_id, department, year_level);
                Alert.set(2, "");
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }
}
