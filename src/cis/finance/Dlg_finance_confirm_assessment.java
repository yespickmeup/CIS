/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.finance;

import cis.academic.Academic_year_fees;
import cis.banks.Banks;
import cis.credit_cards.Credit_cards;
import cis.enrollments.Enrollment_student_loaded_subjects;
import cis.enrollments.Enrollments;
import cis.utils.DateType;
import cis.utils.TableRenderer;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
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
public class Dlg_finance_confirm_assessment extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_finance_confirm_assessment
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

        public final List<Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes> payment_modes;
        public final double tuition_amount;
        public final int no_of_units;
        public final double amount_per_unit;
        public final double tuition_discount;
        public final double miscellaneous_amount;
        public final double miscellaneous_discount;
        public final double other_fees_amount;
        public final double other_fees_discount;

        public final double amount_paid;
        public final double cash;
        public final String discount_name;
        public final double discount_rate;
        public final double discount_amount;
        public final String discount_customer_name;
        public final String discount_customer_id;
        public final String check_bank;
        public final String check_no;
        public final double check_amount;
        public final String check_holder;
        public final String check_date;
        public final String credit_card_type;
        public final double credit_card_rate;
        public final double credit_card_amount;
        public final String credit_card_no;
        public final String credit_card_holder;
        public final String gift_certificate_from;
        public final String gift_certificate_description;
        public final String gift_certificate_no;
        public final double gift_certificate_amount;
        public final String online_bank;
        public final String online_reference_no;
        public final double online_amount;
        public final String online_holder;
        public final String online_date;

        public OutputData(List<Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes> payment_modes, double tuition_amount, int no_of_units, double amount_per_unit, double tuition_discount, double miscellaneous_amount, double miscellaneous_discount, double other_fees_amount, double other_fees_discount, double amount_paid, double cash, String discount_name, double discount_rate, double discount_amount, String discount_customer_name, String discount_customer_id, String check_bank, String check_no, double check_amount, String check_holder, String check_date, String credit_card_type, double credit_card_rate, double credit_card_amount, String credit_card_no, String credit_card_holder, String gift_certificate_from, String gift_certificate_description, String gift_certificate_no, double gift_certificate_amount, String online_bank, String online_reference_no, double online_amount, String online_holder, String online_date) {
            this.payment_modes = payment_modes;
            this.tuition_amount = tuition_amount;
            this.no_of_units = no_of_units;
            this.amount_per_unit = amount_per_unit;
            this.tuition_discount = tuition_discount;
            this.miscellaneous_amount = miscellaneous_amount;
            this.miscellaneous_discount = miscellaneous_discount;
            this.other_fees_amount = other_fees_amount;
            this.other_fees_discount = other_fees_discount;
            this.amount_paid = amount_paid;
            this.cash = cash;
            this.discount_name = discount_name;
            this.discount_rate = discount_rate;
            this.discount_amount = discount_amount;
            this.discount_customer_name = discount_customer_name;
            this.discount_customer_id = discount_customer_id;
            this.check_bank = check_bank;
            this.check_no = check_no;
            this.check_amount = check_amount;
            this.check_holder = check_holder;
            this.check_date = check_date;
            this.credit_card_type = credit_card_type;
            this.credit_card_rate = credit_card_rate;
            this.credit_card_amount = credit_card_amount;
            this.credit_card_no = credit_card_no;
            this.credit_card_holder = credit_card_holder;
            this.gift_certificate_from = gift_certificate_from;
            this.gift_certificate_description = gift_certificate_description;
            this.gift_certificate_no = gift_certificate_no;
            this.gift_certificate_amount = gift_certificate_amount;
            this.online_bank = online_bank;
            this.online_reference_no = online_reference_no;
            this.online_amount = online_amount;
            this.online_holder = online_holder;
            this.online_date = online_date;
        }

    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_finance_confirm_assessment(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_finance_confirm_assessment(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_finance_confirm_assessment() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_finance_confirm_assessment myRef;

    private void setThisRef(Dlg_finance_confirm_assessment myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_finance_confirm_assessment> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_finance_confirm_assessment create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_finance_confirm_assessment create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_finance_confirm_assessment dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_finance_confirm_assessment((java.awt.Frame) parent, false);
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
            Dlg_finance_confirm_assessment dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_finance_confirm_assessment((java.awt.Dialog) parent, false);
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

        Dlg_finance_confirm_assessment dialog = Dlg_finance_confirm_assessment.create(new javax.swing.JFrame(), true);
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
        jLabel76 = new javax.swing.JLabel();
        tf_field131 = new Field.Input();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        tf_field132 = new Field.Input();
        jLabel79 = new javax.swing.JLabel();
        tf_field133 = new Field.Combo();
        jButton3 = new Button.Success();
        jButton4 = new Button.Default();
        jPanel2 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        tf_field134 = new Field.Input();
        jLabel81 = new javax.swing.JLabel();
        tf_field135 = new Field.Input();
        jLabel82 = new javax.swing.JLabel();
        tf_field136 = new Field.Input();
        jLabel83 = new javax.swing.JLabel();
        tf_field137 = new Field.Input();
        jLabel33 = new javax.swing.JLabel();
        tf_field18 = new Field.Input();
        tf_field19 = new Field.Input();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_mode_of_payments = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        tf_field20 = new Field.Input();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        tf_field21 = new Field.Input();
        jPanel6 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        tf_ap_cash7 = new Field.Input();
        jLabel32 = new javax.swing.JLabel();
        tf_credit_card_type = new Field.Combo();
        tf_credit_card_amount = new Field.Input();
        jLabel39 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        lbl_credit_card_rate = new Field.Input();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        tf_prepaid_customer_id3 = new Field.Input();
        tf_prepaid_customer_id4 = new Field.Input();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        tf_prepaid_customer_id5 = new Field.Input();
        jPanel7 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        tf_ap_cash5 = new Field.Input();
        tf_check_bank = new Field.Search();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tf_ap_check_holder = new javax.swing.JTextField();
        tf_ap_check_no = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel76.setText("Enrollment No.:");

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

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel77.setText("Confirm Assessment");

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel78.setText("Name:");

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

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel79.setText("Payment Mode:");

        tf_field133.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tf_field133.setFocusable(false);
        tf_field133.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field133MouseClicked(evt);
            }
        });
        tf_field133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field133ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Ok");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fees", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel80.setText("Tuition Fee:");

        tf_field134.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tf_field134.setFocusable(false);
        tf_field134.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field134MouseClicked(evt);
            }
        });
        tf_field134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field134ActionPerformed(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel81.setText("Miscellaneous Fee:");

        tf_field135.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field135.setFocusable(false);
        tf_field135.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field135MouseClicked(evt);
            }
        });
        tf_field135.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field135ActionPerformed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel82.setText("Other Fees:");

        tf_field136.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field136.setFocusable(false);
        tf_field136.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field136MouseClicked(evt);
            }
        });
        tf_field136.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field136ActionPerformed(evt);
            }
        });

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel83.setText("Total Amount:");

        tf_field137.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tf_field137.setFocusable(false);
        tf_field137.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field137MouseClicked(evt);
            }
        });
        tf_field137.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field137ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Fixed Amount:");

        tf_field18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tf_field18.setText("0.00");
        tf_field18.setFocusable(false);
        tf_field18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field18MouseClicked(evt);
            }
        });
        tf_field18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field18ActionPerformed(evt);
            }
        });

        tf_field19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tf_field19.setText("0.00");
        tf_field19.setFocusable(false);
        tf_field19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field19MouseClicked(evt);
            }
        });
        tf_field19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field19ActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Per Unit:");

        jLabel35.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("( 20 Units )");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel81))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_field135, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_field136, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field137))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_field18, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_field19, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tf_field134)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field134, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addComponent(tf_field19)))
                .addGap(6, 6, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field135, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field136, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field137, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mode of Payments", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tbl_mode_of_payments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_mode_of_payments);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel84.setText("Tendered:");

        tf_field20.setBackground(new java.awt.Color(0, 0, 0));
        tf_field20.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        tf_field20.setForeground(new java.awt.Color(102, 204, 0));
        tf_field20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tf_field20.setText("0.00");
        tf_field20.setFocusable(false);
        tf_field20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field20MouseClicked(evt);
            }
        });
        tf_field20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field20ActionPerformed(evt);
            }
        });

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setText("Amount:");

        tf_field21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf_field21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tf_field21.setText("0.00");
        tf_field21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_field21MouseClicked(evt);
            }
        });
        tf_field21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_field21ActionPerformed(evt);
            }
        });
        tf_field21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_field21KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_field21, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cash", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel50.setText("Amount:");

        tf_ap_cash7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_ap_cash7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ap_cash7ActionPerformed(evt);
            }
        });
        tf_ap_cash7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_ap_cash7KeyReleased(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("Card:");

        tf_credit_card_type.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_credit_card_type.setFocusable(false);
        tf_credit_card_type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_credit_card_typeMouseClicked(evt);
            }
        });
        tf_credit_card_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_credit_card_typeActionPerformed(evt);
            }
        });

        tf_credit_card_amount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_credit_card_amount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tf_credit_card_amount.setText("0.00");
        tf_credit_card_amount.setFocusable(false);

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setText("Rate Amount:");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel37.setText("%");

        lbl_credit_card_rate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_credit_card_rate.setText("0.00");
        lbl_credit_card_rate.setFocusable(false);

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setText("Rate:");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel40.setText("Card #:");

        tf_prepaid_customer_id3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_prepaid_customer_id4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel41.setText("Holder:");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setText("Code:");

        tf_prepaid_customer_id5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lbl_credit_card_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_credit_card_amount, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                    .addComponent(tf_prepaid_customer_id5)
                    .addComponent(tf_prepaid_customer_id4)
                    .addComponent(tf_prepaid_customer_id3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_ap_cash7)
                    .addComponent(tf_credit_card_type))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_credit_card_type, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ap_cash7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_credit_card_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_credit_card_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_prepaid_customer_id3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_prepaid_customer_id4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_prepaid_customer_id5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jTabbedPane1.addTab("Credit Card", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel48.setText("Check Amount:");

        tf_ap_cash5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_ap_cash5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ap_cash5ActionPerformed(evt);
            }
        });
        tf_ap_cash5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_ap_cash5KeyReleased(evt);
            }
        });

        tf_check_bank.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_check_bank.setFocusable(false);
        tf_check_bank.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_check_bankMouseClicked(evt);
            }
        });
        tf_check_bank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_check_bankActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Bank:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Holder:");

        tf_ap_check_holder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_ap_check_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_ap_check_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ap_check_noActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Number:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Date:");

        jDateChooser4.setDate(new Date());
        jDateChooser4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(tf_ap_cash5))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_check_bank)
                            .addComponent(tf_ap_check_no)
                            .addComponent(tf_ap_check_holder)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser4, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ap_cash5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_check_bank, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ap_check_holder, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ap_check_no, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Check", jPanel7);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field20, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_field20)
                    .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(178, 178, 178))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_field133)
                                    .addComponent(tf_field132)
                                    .addComponent(tf_field131)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(50, 50, 50))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field131, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field132, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field133, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
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

    private void tf_field133MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field133MouseClicked
        init_mode_of_payments();
    }//GEN-LAST:event_tf_field133MouseClicked

    private void tf_field133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field133ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field133ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ok();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        disposed();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tf_field134MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field134MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field134MouseClicked

    private void tf_field134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field134ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field134ActionPerformed

    private void tf_field135MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field135MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field135MouseClicked

    private void tf_field135ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field135ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field135ActionPerformed

    private void tf_field136MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field136MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field136MouseClicked

    private void tf_field136ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field136ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field136ActionPerformed

    private void tf_field137MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field137MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field137MouseClicked

    private void tf_field137ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field137ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field137ActionPerformed

    private void tf_field18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field18MouseClicked

    private void tf_field18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field18ActionPerformed

    private void tf_field19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field19MouseClicked

    private void tf_field19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field19ActionPerformed

    private void tf_field20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field20MouseClicked

    private void tf_field20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field20ActionPerformed

    private void tf_field21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_field21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field21MouseClicked

    private void tf_field21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_field21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_field21ActionPerformed

    private void tf_ap_cash7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ap_cash7ActionPerformed

    }//GEN-LAST:event_tf_ap_cash7ActionPerformed

    private void tf_ap_cash7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_ap_cash7KeyReleased
        count_tender();
    }//GEN-LAST:event_tf_ap_cash7KeyReleased

    private void tf_credit_card_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_credit_card_typeActionPerformed
        init_credit_cards();
    }//GEN-LAST:event_tf_credit_card_typeActionPerformed

    private void tf_ap_cash5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ap_cash5ActionPerformed
//        count_tender();
    }//GEN-LAST:event_tf_ap_cash5ActionPerformed

    private void tf_ap_cash5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_ap_cash5KeyReleased
        count_tender();
    }//GEN-LAST:event_tf_ap_cash5KeyReleased

    private void tf_check_bankMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_check_bankMouseClicked
        init_banks();
    }//GEN-LAST:event_tf_check_bankMouseClicked

    private void tf_check_bankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_check_bankActionPerformed
        init_banks();
    }//GEN-LAST:event_tf_check_bankActionPerformed

    private void tf_ap_check_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ap_check_noActionPerformed

    }//GEN-LAST:event_tf_ap_check_noActionPerformed

    private void tf_credit_card_typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_credit_card_typeMouseClicked
        init_credit_cards();
    }//GEN-LAST:event_tf_credit_card_typeMouseClicked

    private void tf_field21KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_field21KeyReleased
        count_tender();
    }//GEN-LAST:event_tf_field21KeyReleased

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lbl_credit_card_rate;
    private javax.swing.JTable tbl_mode_of_payments;
    private javax.swing.JTextField tf_ap_cash5;
    private javax.swing.JTextField tf_ap_cash7;
    private javax.swing.JTextField tf_ap_check_holder;
    private javax.swing.JTextField tf_ap_check_no;
    private javax.swing.JTextField tf_check_bank;
    private javax.swing.JTextField tf_credit_card_amount;
    private javax.swing.JTextField tf_credit_card_type;
    private javax.swing.JTextField tf_field131;
    private javax.swing.JTextField tf_field132;
    private javax.swing.JTextField tf_field133;
    private javax.swing.JTextField tf_field134;
    private javax.swing.JTextField tf_field135;
    private javax.swing.JTextField tf_field136;
    private javax.swing.JTextField tf_field137;
    private javax.swing.JTextField tf_field18;
    private javax.swing.JTextField tf_field19;
    private javax.swing.JTextField tf_field20;
    private javax.swing.JTextField tf_field21;
    private javax.swing.JTextField tf_prepaid_customer_id3;
    private javax.swing.JTextField tf_prepaid_customer_id4;
    private javax.swing.JTextField tf_prepaid_customer_id5;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        init_tbl_mode_of_payments(tbl_mode_of_payments);
    }

    List<Mode_of_payments.to_mode_of_payments> modess = null;

    public void do_pass(Enrollments.to_enrollments to, String payment_mode, int payment_mode_no, List<Mode_of_payments.to_mode_of_payments> modes1) {
        modess = modes1;
        tf_field131.setText(to.enrollment_no);
        tf_field132.setText(to.last_name + ", " + to.first_name + " " + to.middle_name);
        Field.Combo pm = (Field.Combo) tf_field133;
        pm.setId("" + payment_mode_no);
        pm.setText("" + payment_mode);

        String where = " where id<>0 ";
        where = where + " and academic_year_id='" + to.academic_year_id + "' "
                + " and department_id='" + to.department_id + "' "
                + " and level_id='" + to.level_id + "' "
                + " and course_id='" + to.course_id + "' "
                + " and period like '" + to.year_level + "' "
                + " and group_id=0 ";
        List<Academic_year_fees.to_academic_year_fees> datas = Academic_year_fees.ret_data(where);

        if (!datas.isEmpty()) {

            Academic_year_fees.to_academic_year_fees to2 = (Academic_year_fees.to_academic_year_fees) datas.get(0);
            Field.Input amount = (Field.Input) tf_field18;
            Field.Input per_unit = (Field.Input) tf_field19;
            if (to2.is_per_unit == 0) {
                tf_field19.setEnabled(false);
                tf_field19.setText("");

                amount.setText(FitIn.fmt_wc_0(to2.amount));
                amount.setId("" + to.id);
            } else {
                tf_field18.setEnabled(false);
                tf_field18.setText("");
                per_unit.setText(FitIn.fmt_wc_0(to2.per_unit));
            }
        }

        // Search Tuition Details
        int no_of_units = 0;
        List<Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects> subjects = Enrollment_student_loaded_subjects.ret_data(" where enrollment_id='" + to.id + "'");
        for (Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects subject : subjects) {
            no_of_units += (subject.lecture_units + subject.lab_units);
        }
        jLabel35.setText("" + no_of_units + " unit/s");

        if (!tf_field18.isEnabled()) { //per unit
            double amount = no_of_units * FitIn.toDouble(tf_field19.getText());
            tf_field134.setText(FitIn.fmt_wc_0(amount));
        } else {
            double amount = FitIn.toDouble(tf_field18.getText());
            tf_field134.setText(FitIn.fmt_wc_0(amount));
        }

        //Search Miscellaneous
        String where2 = " where id<>0 ";
        where2 = where2 + " and academic_year_id='" + to.academic_year_id + "' "
                + " and department_id='" + to.department_id + "' "
                + " and level_id='" + to.level_id + "' "
                + " and course_id='" + to.course_id + "' "
                + " and period like '" + to.year_level + "' "
                + " and group_id=1 ";

        List<Academic_year_fees.to_academic_year_fees> datas2 = Miscellaneous_fees.ret_data2(where2);
        double amount = 0;
        for (Academic_year_fees.to_academic_year_fees mis : datas2) {
            amount += mis.amount;
        }
        tf_field135.setText(FitIn.fmt_wc_0(amount));

        //Ret Other Fees
        String where3 = " where id<>0 ";
        where3 = where3 + " and academic_year_id='" + to.academic_year_id + "' "
                + " and department_id='" + to.department_id + "' "
                + " and level_id='" + to.level_id + "' "
                + " and course_id='" + to.course_id + "' "
                + " and period like '" + to.year_level + "' "
                + " and group_id=2 ";
        List<Academic_year_fees.to_academic_year_fees> datas3 = Miscellaneous_fees.ret_data3(where3);
        double amount3 = 0;
        for (Academic_year_fees.to_academic_year_fees mis : datas3) {
            amount3 += mis.amount;
        }
        tf_field136.setText(FitIn.fmt_wc_0(amount3));

        double total = FitIn.toDouble(tf_field134.getText()) + amount + amount3;
        tf_field137.setText(FitIn.fmt_wc_0(total));

        change_payment_modes();// 
        tf_field21.grabFocus();
    }

    private void init_mode_of_payments() {
        String where = "";

        Object[][] obj = new Object[modess.size()][1];
        int i = 0;
        for (Mode_of_payments.to_mode_of_payments to : modess) {
            obj[i][0] = " " + to.mode;

            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_field133.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_field133, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Mode_of_payments.to_mode_of_payments to = modess.get(data.selected_row);
                Field.Combo co = (Field.Combo) tf_field133;
                co.setText(to.mode);
                co.setId("" + to.nos);
                change_payment_modes();

            }
        });
    }

    private void change_payment_modes() {
        double total = FitIn.toDouble(tf_field137.getText());
        Field.Combo cm = (Field.Combo) tf_field133;
        int payment_mode_no = FitIn.toInt(cm.getId());
        List< Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes> modes = new ArrayList();
        double downpayment = 2000;
        String date = DateType.sf.format(new Date());
        if (payment_mode_no == 1) {
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p1 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "Full Payment", 0, date, total, 0, 0, "", "", "", "", 0, 0);
            modes.add(p1);
        }
        if (payment_mode_no == 2) {

            double to_pay = total - downpayment;
            to_pay = to_pay / 2;
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p1 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "Downpayment", 0, date, downpayment, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p2 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "1st Payment", 1, date, to_pay, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p3 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "2nd Payment", 2, date, to_pay, 0, 0, "", "", "", "", 0, 0);
            modes.add(p1);
            modes.add(p2);
            modes.add(p3);
        }

        if (payment_mode_no == 3) {
            double to_pay = total - downpayment;
            to_pay = to_pay / 3;
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p1 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "Downpayment", 0, date, downpayment, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p2 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "1st Payment", 1, date, to_pay, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p3 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "2nd Payment", 2, date, to_pay, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p4 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "3rd Payment", 3, date, to_pay, 0, 0, "", "", "", "", 0, 0);

            modes.add(p1);
            modes.add(p2);
            modes.add(p3);
            modes.add(p4);
        }
        if (payment_mode_no == 4) {
            double to_pay = total - downpayment;
            to_pay = to_pay / 4;
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p1 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "Downpayment", 0, date, downpayment, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p2 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "1st Payment", 1, date, to_pay, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p3 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "2nd Payment", 2, date, to_pay, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p4 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "3rd Payment", 3, date, to_pay, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p5 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "4th Payment", 4, date, to_pay, 0, 0, "", "", "", "", 0, 0);

            modes.add(p1);
            modes.add(p2);
            modes.add(p3);
            modes.add(p4);
            modes.add(p5);
        }
        if (payment_mode_no == 5) {
            double to_pay = total - downpayment;
            to_pay = to_pay / 5;
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p1 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "Downpayment", 0, date, downpayment, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p2 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "1st Payment", 1, date, to_pay, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p3 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "2nd Payment", 2, date, to_pay, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p4 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "3rd Payment", 3, date, to_pay, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p5 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "4th Payment", 4, date, to_pay, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p6 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "5th Payment", 5, date, to_pay, 0, 0, "", "", "", "", 0, 0);

            modes.add(p1);
            modes.add(p2);
            modes.add(p3);
            modes.add(p4);
            modes.add(p5);
            modes.add(p6);
        }
        loadData_mode_of_payments(modes);
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
    //<editor-fold defaultstate="collapsed" desc=" mode_of_payments "> 
    public static ArrayListModel tbl_mode_of_payments_ALM;
    public static Tblmode_of_paymentsModel tbl_mode_of_payments_M;

    public static void init_tbl_mode_of_payments(JTable tbl_mode_of_payments) {
        tbl_mode_of_payments_ALM = new ArrayListModel();
        tbl_mode_of_payments_M = new Tblmode_of_paymentsModel(tbl_mode_of_payments_ALM);
        tbl_mode_of_payments.setModel(tbl_mode_of_payments_M);
        tbl_mode_of_payments.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_mode_of_payments.setRowHeight(25);
        int[] tbl_widths_mode_of_payments = {100, 80, 80, 80, 80, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_mode_of_payments.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_mode_of_payments, i, tbl_widths_mode_of_payments[i]);
        }
        Dimension d = tbl_mode_of_payments.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_mode_of_payments.getTableHeader().setPreferredSize(d);
        tbl_mode_of_payments.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_mode_of_payments.setRowHeight(25);
        tbl_mode_of_payments.setFont(new java.awt.Font("Arial", 0, 12));
        TableWidthUtilities.setColumnRightRenderer(tbl_mode_of_payments, 2);
        TableWidthUtilities.setColumnRightRenderer(tbl_mode_of_payments, 3);
        TableWidthUtilities.setColumnRightRenderer(tbl_mode_of_payments, 4);
    }

    public static void loadData_mode_of_payments(List<Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes> acc) {
        tbl_mode_of_payments_ALM.clear();
        tbl_mode_of_payments_ALM.addAll(acc);
    }

    public static class Tblmode_of_paymentsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Mode", "Date", "Amount", "Paid", "Balance", "created_by", "updated_by", "status", "is_uploaded"
        };

        public Tblmode_of_paymentsModel(ListModel listmodel) {
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
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes tt = (Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.mode;
                case 1:
                    return " " + DateType.convert_slash_datetime2(tt.to_pay);
                case 2:
                    return " " + FitIn.fmt_wc_0(tt.amount) + " ";
                case 3:
                    return " " + FitIn.fmt_wc_0(tt.paid) + " ";
                case 4:
                    return " " + FitIn.fmt_wc_0(tt.amount - tt.paid) + " ";
                case 5:
                    return tt.created_by;
                case 6:
                    return tt.updated_by;
                case 7:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }
//</editor-fold> 

    private void ok() {
        List<Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes> datas = tbl_mode_of_payments_ALM;
        double tuition_amount = FitIn.toDouble(tf_field134.getText());  //unit/s
        String un = jLabel35.getText();
        un = un.replaceAll(" unit/s", "");
        int no_of_units = FitIn.toInt(un);
        double amount_per_unit = FitIn.toDouble(tf_field19.getText());
        double tuition_discount = 0;
        double miscellaneous_amount = FitIn.toDouble(tf_field135.getText());
        double miscellaneous_discount = 0;
        double other_fees_amount = FitIn.toDouble(tf_field136.getText());
        double other_fees_discount = FitIn.toDouble(tf_field137.getText());

        double amount_paid = FitIn.toDouble(tf_field20.getText());
        double cash = FitIn.toDouble(tf_field21.getText());
        String discount_name = "";
        double discount_rate = 0;
        double discount_amount = 0;
        String discount_customer_name = "";
        String discount_customer_id = "";
        String check_bank = tf_check_bank.getText();
        String check_no = tf_ap_check_no.getText();
        double check_amount = FitIn.toDouble(tf_ap_cash5.getText());
        String check_holder = tf_ap_check_holder.getText();
        String check_date = DateType.sf.format(jDateChooser4.getDate());
        String credit_card_type = tf_credit_card_type.getText();
        double credit_card_rate = FitIn.toDouble(lbl_credit_card_rate.getText());
        double credit_card_amount = FitIn.toDouble(tf_credit_card_amount.getText());
        String credit_card_no = tf_prepaid_customer_id3.getText();
        String credit_card_holder = tf_prepaid_customer_id4.getText();
        String gift_certificate_from = "";
        String gift_certificate_description = "";
        String gift_certificate_no = "";
        double gift_certificate_amount = 0;
        String online_bank = "";
        String online_reference_no = "";
        double online_amount = 0;
        String online_holder = "";
        String online_date = null;

        List<Enrollment_assessment_payment_details.to_enrollment_assessment_payment_details> payments = new ArrayList();
        List< Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes> modes = tbl_mode_of_payments_ALM;
        for (Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes mode : modes) {
            
        }
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(datas, tuition_amount, no_of_units, amount_per_unit, tuition_discount, miscellaneous_amount, miscellaneous_discount, other_fees_amount, other_fees_discount, amount_paid, cash, discount_name, discount_rate, discount_amount, discount_customer_name, discount_customer_id, check_bank, check_no, check_amount, check_holder, check_date, credit_card_type, credit_card_rate, credit_card_amount, credit_card_no, credit_card_holder, gift_certificate_from, gift_certificate_description, gift_certificate_no, gift_certificate_amount, online_bank, online_reference_no, online_amount, online_holder, online_date));
        }
    }

    private void init_credit_cards() {
        String search = tf_credit_card_type.getText();

        String where = "  order by card asc";
        List<Credit_cards.to_credit_cards> credit_card_list = Credit_cards.ret_data(where);
        Object[][] obj = new Object[credit_card_list.size()][2];
        int i = 0;
        for (Credit_cards.to_credit_cards to : credit_card_list) {
            obj[i][0] = " " + to.card;
            obj[i][1] = " " + FitIn.fmt_wc_0(to.amount);
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_credit_card_type.getWidth() - 50, 50};
        int width = 0;
        String[] col_names = {"", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_credit_card_type, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Credit_cards.to_credit_cards to = credit_card_list.get(data.selected_row);
                lbl_credit_card_rate.setText(FitIn.fmt_wc_0(to.amount));
                tf_credit_card_type.setText(to.card);
                double credit_card_amount = FitIn.toDouble(tf_ap_cash7.getText());
                double rate = FitIn.toDouble(lbl_credit_card_rate.getText());
                rate = rate / 100;
                rate = rate * credit_card_amount;
                rate = credit_card_amount + rate;
                tf_credit_card_amount.setText(FitIn.fmt_wc_0(rate));
            }
        });
    }

    private void init_banks() {

        String where = "  order by bank asc";
        List<Banks.to_banks> bank_list = Banks.ret_data(where);
        Object[][] obj = new Object[bank_list.size()][1];
        int i = 0;
        for (Banks.to_banks to : bank_list) {

            obj[i][0] = " " + to.bank;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_check_bank.getWidth()};
        int width = 0;
        String[] col_names = {"", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.
                setPopup(tf_check_bank, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Banks.to_banks to = bank_list.get(data.selected_row);
                tf_check_bank.setText(to.bank);

            }
        });
    }

    private void count_tender() {
        double cash = FitIn.toDouble(tf_field21.getText());
        double check = FitIn.toDouble(tf_ap_cash5.getText());
        double credit_card = FitIn.toDouble(tf_ap_cash7.getText());

        double tendered = FitIn.toDouble(tf_field137.getText());
        double total_tendered = cash + check + credit_card;

        tf_field20.setText(FitIn.fmt_wc_0(total_tendered));

        if (tf_ap_cash7.hasFocus()) {
            double credit_card_amount = FitIn.toDouble(tf_ap_cash7.getText());
            double rate = FitIn.toDouble(lbl_credit_card_rate.getText());
            rate = rate / 100;
            rate = rate * credit_card_amount;
            rate = credit_card_amount + rate;
            tf_credit_card_amount.setText(FitIn.fmt_wc_0(rate));
        }

        double remaining = tendered - total_tendered;

        double total_for_cash = check + credit_card;
        double total_for_check = cash + credit_card;

        double total_for_credit_card = cash + check;

        if (remaining < 0 && tf_field21.hasFocus()) {
            remaining = (tendered - total_for_cash);
            tf_field21.setText(FitIn.fmt_wc_0(remaining));
        }
        if (remaining < 0 && tf_ap_cash5.hasFocus()) {
            remaining = (tendered - total_for_check);
            tf_ap_cash5.setText(FitIn.fmt_wc_0(remaining));
        }

        if (remaining < 0 && tf_ap_cash7.hasFocus()) {
            remaining = (tendered - total_for_credit_card);
            tf_ap_cash7.setText(FitIn.fmt_wc_0(remaining));
        }

        total_tendered = cash + check + credit_card;
        tf_field20.setText(FitIn.fmt_wc_0(total_tendered));
        set_paid();
    }

    private void set_paid() {
        double tendered = FitIn.toDouble(tf_field20.getText());
        double total = tendered;
        List<Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes> modes = tbl_mode_of_payments_ALM;
        for (Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes mode : modes) {
            double amount = mode.amount;
            double prev_total = total;
            total = total - amount;
            if (total >= 0) {
                mode.setPaid(amount);
            } else {
                if (prev_total >= 0) {
                    mode.setPaid(prev_total);
                } else {
                    mode.setPaid(0);
                }
            }
        }
        tbl_mode_of_payments_M.fireTableDataChanged();
    }

}
