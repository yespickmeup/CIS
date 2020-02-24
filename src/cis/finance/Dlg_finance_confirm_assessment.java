/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.finance;

import cis.academic.Academic_year_fees;
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

        public OutputData(List<Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes> payment_modes, double tuition_amount, int no_of_units, double amount_per_unit, double tuition_discount, double miscellaneous_amount, double miscellaneous_discount, double other_fees_amount, double other_fees_discount) {
            this.payment_modes = payment_modes;
            this.tuition_amount = tuition_amount;
            this.no_of_units = no_of_units;
            this.amount_per_unit = amount_per_unit;
            this.tuition_discount = tuition_discount;
            this.miscellaneous_amount = miscellaneous_amount;
            this.miscellaneous_discount = miscellaneous_discount;
            this.other_fees_amount = other_fees_amount;
            this.other_fees_discount = other_fees_discount;
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
                            .addComponent(tf_field135, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                            .addComponent(tf_field136, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_field137, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
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
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_field133)
                                    .addComponent(tf_field132)
                                    .addComponent(tf_field131))))
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
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_mode_of_payments;
    private javax.swing.JTextField tf_field131;
    private javax.swing.JTextField tf_field132;
    private javax.swing.JTextField tf_field133;
    private javax.swing.JTextField tf_field134;
    private javax.swing.JTextField tf_field135;
    private javax.swing.JTextField tf_field136;
    private javax.swing.JTextField tf_field137;
    private javax.swing.JTextField tf_field18;
    private javax.swing.JTextField tf_field19;
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
        int[] tbl_widths_mode_of_payments = {100, 100, 90, 0, 0, 0, 0, 0, 0};
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
    }

    public static void loadData_mode_of_payments(List<Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes> acc) {
        tbl_mode_of_payments_ALM.clear();
        tbl_mode_of_payments_ALM.addAll(acc);
    }

    public static class Tblmode_of_paymentsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Mode", "Date", "Amount", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded"
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
                    return tt.created_at;
                case 4:
                    return tt.updated_at;
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
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(datas, tuition_amount, no_of_units, amount_per_unit, tuition_discount, miscellaneous_amount, miscellaneous_discount, other_fees_amount, other_fees_discount));
        }
    }
}
