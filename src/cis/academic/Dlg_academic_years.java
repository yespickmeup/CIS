/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.academic;

import cis.academic.Academic_year_period_schedules.to_academic_year_period_schedules;
import cis.academic.Academic_years.to_academic_years;
import cis.departments.Departments;
import cis.users.MyUser;
import cis.utils.Alert;
import cis.utils.DateType;
import cis.utils.Dlg_confirm_action;
import cis.utils.Dlg_confirm_delete;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import synsoftech.util.ImageRenderer;

/**
 *
 * @author Ronescape
 */
public class Dlg_academic_years extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_academic_years
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
    private Dlg_academic_years(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_academic_years(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_academic_years() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_academic_years myRef;

    private void setThisRef(Dlg_academic_years myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_academic_years> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_academic_years create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_academic_years create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_academic_years dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_academic_years((java.awt.Frame) parent, false);
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
            Dlg_academic_years dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_academic_years((java.awt.Dialog) parent, false);
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

        Dlg_academic_years dialog = Dlg_academic_years.create(new javax.swing.JFrame(), true);
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
        jLabel6 = new javax.swing.JLabel();
        tf_field = new Field.Input();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton5 = new Button.Default();
        jButton2 = new Button.Success();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_academic_years = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_colleges = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_academic_year_period_schedules = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Years:");

        tf_field.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_field.setFocusable(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Date Start:");

        jDateChooser1.setDate(new Date());
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("End:");

        jDateChooser2.setDate(new Date());
        jDateChooser2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_field)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_field, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tbl_academic_years.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_academic_years.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_academic_yearsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_academic_years);

        jLabel1.setText("No. of rows:");

        jLabel2.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Periods", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

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
        jScrollPane2.setViewportView(tbl_colleges);

        jLabel3.setText("No. of rows:");

        jLabel4.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Schedules", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tbl_academic_year_period_schedules.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_academic_year_period_schedules.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_academic_year_period_schedulesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_academic_year_period_schedules);

        jLabel5.setText("No. of rows:");

        jLabel9.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new_year();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        save_year();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbl_academic_yearsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_academic_yearsMouseClicked
        select_year();
    }//GEN-LAST:event_tbl_academic_yearsMouseClicked

    private void tbl_collegesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_collegesMouseClicked
        select_period();
    }//GEN-LAST:event_tbl_collegesMouseClicked

    private void tbl_academic_year_period_schedulesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_academic_year_period_schedulesMouseClicked
        select_schedule();
    }//GEN-LAST:event_tbl_academic_year_period_schedulesMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbl_academic_year_period_schedules;
    private javax.swing.JTable tbl_academic_years;
    private javax.swing.JTable tbl_colleges;
    private javax.swing.JTextField tf_field;
    // End of variables declaration//GEN-END:variables

    private void myInit() {

        init_key();
//        System.setProperty("pool_db", "db_cis_cosca");
//        System.setProperty("pool_password", "password");

        init_tbl_academic_years(tbl_academic_years);
        ret_years();

        init_years();

        init_tbl_colleges(tbl_colleges);
        init_tbl_academic_year_period_schedules(tbl_academic_year_period_schedules);
    }

    private void init_years() {
        jDateChooser1.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                String date_from = DateType.y.format(jDateChooser1.getDate());
                String date_to = DateType.y.format(jDateChooser2.getDate());
                tf_field.setText(date_from + " - " + date_to);
            }
        });
        jDateChooser2.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                String date_from = DateType.y.format(jDateChooser1.getDate());
                String date_to = DateType.y.format(jDateChooser2.getDate());
                tf_field.setText(date_from + " - " + date_to);
            }
        });

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

    //<editor-fold defaultstate="collapsed" desc=" academic_years "> 
    public static ArrayListModel tbl_academic_years_ALM;
    public static Tblacademic_yearsModel tbl_academic_years_M;

    public static void init_tbl_academic_years(JTable tbl_academic_years) {
        tbl_academic_years_ALM = new ArrayListModel();
        tbl_academic_years_M = new Tblacademic_yearsModel(tbl_academic_years_ALM);
        tbl_academic_years.setModel(tbl_academic_years_M);
        tbl_academic_years.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_academic_years.setRowHeight(25);
        int[] tbl_widths_academic_years = {100, 100, 100, 80, 50, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_academic_years.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_academic_years, i, tbl_widths_academic_years[i]);
        }
        Dimension d = tbl_academic_years.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_academic_years.getTableHeader().setPreferredSize(d);
        tbl_academic_years.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_academic_years.setRowHeight(25);
        tbl_academic_years.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_academic_years(List<to_academic_years> acc) {
        tbl_academic_years_ALM.clear();
        tbl_academic_years_ALM.addAll(acc);
    }

    public static class Tblacademic_yearsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Years", "Start", "End", "Status", "", "updated_at", "created_by", "updated_by", "status", "is_uploaded"
        };

        public Tblacademic_yearsModel(ListModel listmodel) {
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
            to_academic_years tt = (to_academic_years) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.years;
                case 1:
                    return " " + tt.date_from;
                case 2:
                    return " " + tt.date_to;
                case 3:
                    if (tt.status == 0) {
                        return " ";
                    } else {
                        return " Active";
                    }

                case 4:
                    return " Delete";
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

    private void ret_years() {
        String where = "";
        List<Academic_years.to_academic_years> datas = Academic_years.ret_data(where);
        loadData_academic_years(datas);
        jLabel2.setText("" + datas.size());
    }
//</editor-fold> 

    private void new_year() {
        tf_field.setText("");
        tbl_academic_years.clearSelection();

    }

    private void save_year() {
        int row = tbl_academic_years.getSelectedRow();
        if (row < 0) {
            int id = 0;
            String years = tf_field.getText();
            String date_from = DateType.sf.format(jDateChooser1.getDate());
            String date_to = DateType.sf.format(jDateChooser2.getDate());
            String created_at = DateType.now();
            String updated_at = DateType.now();
            String created_by = MyUser.getUser_id();
            String updated_by = MyUser.getUser_id();
            int status = 0;
            int is_uploaded = 0;

            Academic_years.to_academic_years to = new to_academic_years(id, years, date_from, date_to, created_at, updated_at, created_by, updated_by, status, is_uploaded);
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
//            nd.do_pass(services);
            nd.setCallback(new Dlg_confirm_action.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();

                    Academic_years.add_data(to);
                    Alert.set(1, "");
                    ret_years();
                    new_year();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);

        } else {
            Academic_years.to_academic_years t = (Academic_years.to_academic_years) tbl_academic_years_ALM.get(row);
            int id = t.id;
            String years = tf_field.getText();
            String date_from = DateType.sf.format(jDateChooser1.getDate());
            String date_to = DateType.sf.format(jDateChooser2.getDate());
            String created_at = t.created_at;
            String updated_at = DateType.now();
            String created_by = t.created_by;
            String updated_by = MyUser.getUser_id();
            int status = t.status;
            int is_uploaded = 2;

            Academic_years.to_academic_years to = new to_academic_years(id, years, date_from, date_to, created_at, updated_at, created_by, updated_by, status, is_uploaded);
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");

            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    Academic_years.update_data(to);
                    Alert.set(2, "");
                    ret_years();
                    new_year();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);

        }
    }

    private void select_year() {
        int row = tbl_academic_years.getSelectedRow();
        if (row < 0) {
            return;
        }
        int col = tbl_academic_years.getSelectedColumn();
        Academic_years.to_academic_years to = (Academic_years.to_academic_years) tbl_academic_years_ALM.get(row);
        if (col == 4) {
            Window p = (Window) this;
            Dlg_confirm_delete nd = Dlg_confirm_delete.create(p, true);
            nd.setTitle("");
//            nd.do_pass(services);
            nd.setCallback(new Dlg_confirm_delete.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_delete.OutputData data) {
                    closeDialog.ok();
                    Academic_years.delete_data(to);
                    Alert.set(3, "");
                    tbl_colleges_ALM.clear();
                    tbl_academic_year_period_schedules_ALM.clear();
                    jLabel4.setText("");
                    jLabel9.setText("");
                    ret_years();
                    new_year();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        } else if (col == 3) {
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
//        nd.do_pass(services);
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    int row = tbl_academic_years.getSelectedRow();
                    if (row < 0) {
                        return;
                    }
                    int col = tbl_academic_years.getSelectedColumn();
                    Academic_years.to_academic_years to = (Academic_years.to_academic_years) tbl_academic_years_ALM.get(row);
                    Academic_years.set_active_year(to.id);
                    Alert.set(2, "");
                    ret_years();

                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        } else {
            tf_field.setText(to.years);
            try {
                Date d1 = DateType.sf.parse(to.date_from);
                Date d2 = DateType.sf.parse(to.date_to);
                jDateChooser1.setDate(d1);
                jDateChooser2.setDate(d2);
            } catch (ParseException ex) {
                Logger.getLogger(Dlg_academic_years.class.getName()).log(Level.SEVERE, null, ex);
            }
            tbl_academic_year_period_schedules_ALM.clear();
            ret_periods(to);
        }
    }

    private void set_active_year() {

    }

    //<editor-fold defaultstate="collapsed" desc=" departments "> 
    public static ArrayListModel tbl_colleges_ALM;
    public static TblcollegesModel tbl_colleges_M;

    public static void init_tbl_colleges(JTable tbl_colleges) {
        tbl_colleges_ALM = new ArrayListModel();
        tbl_colleges_M = new TblcollegesModel(tbl_colleges_ALM);
        tbl_colleges.setModel(tbl_colleges_M);
        tbl_colleges.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_colleges.setRowHeight(25);
        int[] tbl_widths_colleges = {100, 100, 30, 0, 0, 0, 0, 0, 0, 0};
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
        tbl_colleges.getColumnModel().getColumn(2).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_colleges(List<Departments.to_departments> acc) {
        tbl_colleges_ALM.clear();
        tbl_colleges_ALM.addAll(acc);
    }

    public static class TblcollegesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Department", "Period", "", "", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded"
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
            Departments.to_departments tt = (Departments.to_departments) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.department_name;
                case 1:
                    return " " + tt.updated_by;
                case 2:
                    return "/cis/icons/edit.png";
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

    private void ret_periods(Academic_years.to_academic_years to) {
        String where = " ";
        List<Departments.to_departments> datas = Departments.ret_periods(where, "" + to.id);
        loadData_colleges(datas);
        jLabel4.setText("" + datas.size());
    }

    private void select_period() {
        int row = tbl_colleges.getSelectedRow();
        if (row < 0) {
            return;
        }

        int row2 = tbl_academic_years.getSelectedRow();
        Academic_years.to_academic_years acad = (Academic_years.to_academic_years) tbl_academic_years_ALM.get(row2);

        Departments.to_departments dep = (Departments.to_departments) tbl_colleges_ALM.get(row);
        int col = tbl_colleges.getSelectedColumn();
        if (col == 2) {
            if (dep.created_by.isEmpty()) {
                Window p = (Window) this;
                Dlg_academic_year_periods nd = Dlg_academic_year_periods.create(p, true);
                nd.setTitle("");
//            nd.do_pass(services);
                nd.setCallback(new Dlg_academic_year_periods.Callback() {

                    @Override
                    public void ok(CloseDialog closeDialog, Dlg_academic_year_periods.OutputData data) {
                        closeDialog.ok();
                        int id = 0;
                        int academic_year_id = acad.id;
                        int department_id = dep.id;
                        String department = dep.department_name;
                        String years = acad.years;
                        String period = "Whole";
                        if (data.period == 2) {
                            period = "Semester";
                        }
                        if (data.period == 3) {
                            period = "Trimester";
                        }
                        if (data.period == 4) {
                            period = "Four Quarters";
                        }

                        String date_from = acad.date_from;
                        String date_to = acad.date_to;
                        String created_at = DateType.now();
                        String updated_at = DateType.now();
                        String created_by = MyUser.getUser_id();
                        String updated_by = MyUser.getUser_id();
                        int status = 1;
                        int is_uploaded = 0;
                        Academic_year_periods.to_academic_year_periods to = new Academic_year_periods.to_academic_year_periods(id, academic_year_id, department_id, department, years, period, date_from, date_to, created_at, updated_at, created_by, updated_by, status, is_uploaded);
                        Academic_year_periods.add_data(to);
                        Alert.set(1, "");

                        ret_periods(acad);
                    }

                    @Override
                    public void period(CloseDialog closeDialog, Dlg_academic_year_periods.OutputData2 data) {
                        closeDialog.ok();
                    }

                });
                nd.setLocationRelativeTo(this);
                nd.setVisible(true);
            } else {

                Window p = (Window) this;
                Dlg_academic_year_periods nd = Dlg_academic_year_periods.create(p, true);
                nd.setTitle("");
                int period = 1;
                if (dep.updated_by.equalsIgnoreCase("Semester")) {
                    period = 2;
                }
                if (dep.updated_by.equalsIgnoreCase("Trimester")) {
                    period = 3;
                }
                if (dep.updated_by.equalsIgnoreCase("Four Quarters")) {
                    period = 4;
                }

                nd.do_pass(period);
                nd.setCallback(new Dlg_academic_year_periods.Callback() {

                    @Override
                    public void ok(CloseDialog closeDialog, Dlg_academic_year_periods.OutputData data) {
                        closeDialog.ok();

                        int id = FitIn.toInt(dep.created_by);
                        int academic_year_id = acad.id;
                        int department_id = dep.id;
                        String department = dep.department_name;
                        String years = acad.years;
                        String period = "Whole";
                        if (data.period == 2) {
                            period = "Semester";
                        }
                        if (data.period == 3) {
                            period = "Trimester";
                        }
                        if (data.period == 4) {
                            period = "Four Quarters";
                        }

                        String date_from = acad.date_from;
                        String date_to = acad.date_to;
                        String created_at = DateType.now();
                        String updated_at = DateType.now();
                        String created_by = MyUser.getUser_id();
                        String updated_by = MyUser.getUser_id();
                        int status = 1;
                        int is_uploaded = 2;
                        Academic_year_periods.to_academic_year_periods to = new Academic_year_periods.to_academic_year_periods(id, academic_year_id, department_id, department, years, period, date_from, date_to, created_at, updated_at, created_by, updated_by, status, is_uploaded);

                        if (!dep.updated_by.equalsIgnoreCase(period)) {
                            Academic_year_periods.update_data2(to);
                            Alert.set(2, "");
                            ret_periods(acad);

                        }

                    }

                    @Override
                    public void period(CloseDialog closeDialog, Dlg_academic_year_periods.OutputData2 data) {
                        closeDialog.ok();
                        String where = " where academic_year_period_id = '" + FitIn.toInt(dep.created_by) + "' and period like '" + FitIn.toInt(dep.created_by) + "' ";
                        List<Academic_year_period_schedules.to_academic_year_period_schedules> periods = Academic_year_period_schedules.ret_data(where);
                        if (periods.isEmpty()) {
                            int id = 0;
                            int academic_year_period_id = FitIn.toInt(dep.created_by);
                            List<Academic_year_periods.to_academic_year_periods> acad_year_periods = Academic_year_periods.ret_data(" where id='" + academic_year_period_id + "' ");
                            int department_id = 0;
                            String department = "";
                            if (!acad_year_periods.isEmpty()) {
                                Academic_year_periods.to_academic_year_periods acad_year_period = acad_year_periods.get(0);
                                department_id = acad_year_period.department_id;
                                department = acad_year_period.department;
                            }
                            int academic_year_id = acad.id;
                            String years = acad.years;
                            String period = data.period;
                            String date_from = null;
                            String date_to = null;
                            String created_at = DateType.now();
                            String updated_at = DateType.now();
                            String created_by = MyUser.getUser_id();
                            String updated_by = MyUser.getUser_id();
                            int status = 0;
                            int is_uploaded = 0;
                            String enrollment_starts = "";
                            String enrollment_ends = "";
                            String add_drop_starts = "";
                            String add_drop_ends = "";
                            Academic_year_period_schedules.to_academic_year_period_schedules to = new to_academic_year_period_schedules(id, academic_year_period_id, academic_year_id, department_id, department, years, period, date_from, date_to, created_at, updated_at, created_by, updated_by, status, is_uploaded, enrollment_starts, enrollment_ends, add_drop_ends, add_drop_ends);
                            Academic_year_period_schedules.add_data(to);
                            Alert.set(1, "");
                            ret_periods(acad);

                        } else {
                            Alert.set(0, "Period already added");

                        }
                    }

                });
                nd.setLocationRelativeTo(this);
                nd.setVisible(true);

            }
        } else {
            ret_aps();
        }

    }

    //<editor-fold defaultstate="collapsed" desc=" academic_year_period_schedules "> 
    public static ArrayListModel tbl_academic_year_period_schedules_ALM;
    public static Tblacademic_year_period_schedulesModel tbl_academic_year_period_schedules_M;

    public static void init_tbl_academic_year_period_schedules(JTable tbl_academic_year_period_schedules) {
        tbl_academic_year_period_schedules_ALM = new ArrayListModel();
        tbl_academic_year_period_schedules_M = new Tblacademic_year_period_schedulesModel(tbl_academic_year_period_schedules_ALM);
        tbl_academic_year_period_schedules.setModel(tbl_academic_year_period_schedules_M);
        tbl_academic_year_period_schedules.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_academic_year_period_schedules.setRowHeight(25);
        int[] tbl_widths_academic_year_period_schedules = {130, 150, 150, 150, 60, 40, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_academic_year_period_schedules.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_academic_year_period_schedules, i, tbl_widths_academic_year_period_schedules[i]);
        }
        Dimension d = tbl_academic_year_period_schedules.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_academic_year_period_schedules.getTableHeader().setPreferredSize(d);
        tbl_academic_year_period_schedules.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_academic_year_period_schedules.setRowHeight(25);
        tbl_academic_year_period_schedules.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_academic_year_period_schedules.getColumnModel().getColumn(5).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_academic_year_period_schedules(List<to_academic_year_period_schedules> acc) {
        tbl_academic_year_period_schedules_ALM.clear();
        tbl_academic_year_period_schedules_ALM.addAll(acc);

    }

    public static class Tblacademic_year_period_schedulesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Period", "Schedule", "Enrollment", "Add/Drop", "Status", "", "period", "date_from", "date_to", "created_at", "updated_at", "created_by", "updated_by", "status", "is_uploaded"
        };

        public Tblacademic_year_period_schedulesModel(ListModel listmodel) {
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
            to_academic_year_period_schedules tt = (to_academic_year_period_schedules) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.period;
                case 1:

                    String from = "";
                    String to = "";
                    if (tt.date_from != null) {
                        from = DateType.convert_slash_datetime2(tt.date_from);
                    }
                    if (tt.date_to != null) {
                        to = DateType.convert_slash_datetime2(tt.date_to);
                    }

                    if (from.isEmpty() && to.isEmpty()) {
                        return " ";
                    } else {
                        return " " + from + " - " + to;
                    }

                case 2:
                    String enrollment_starts = "";
                    String enrollment_ends = "";
                    if (tt.enrollment_starts != null) {
                        enrollment_starts = DateType.convert_slash_datetime2(tt.enrollment_starts);
                    }
                    if (tt.enrollment_ends != null) {
                        enrollment_ends = DateType.convert_slash_datetime2(tt.enrollment_ends);
                    }

                    if (enrollment_starts.isEmpty() && enrollment_ends.isEmpty()) {
                        return " ";
                    } else {
                        return " " + enrollment_starts + " - " + enrollment_ends;
                    }
                case 3:
                    String add_drop_starts = "";
                    String add_drop_ends = "";
                    if (tt.add_drop_starts != null) {
                        add_drop_starts = DateType.convert_slash_datetime2(tt.add_drop_starts);
                    }
                    if (tt.add_drop_ends != null) {
                        add_drop_ends = DateType.convert_slash_datetime2(tt.add_drop_ends);
                    }

                    if (add_drop_starts.isEmpty() && add_drop_ends.isEmpty()) {
                        return " ";
                    } else {
                        return " " + add_drop_starts + " - " + add_drop_ends;
                    }
                case 4:
                    if (tt.status == 1) {
                        return " Open";
                    } else if (tt.status == 2) {
                        return " Closed";
                    } else {
                        return " ";
                    }
                case 5:
                    return "/cis/icons/edit.png";
                case 6:
                    return tt.period;
                case 7:
                    return tt.date_from;
                case 8:
                    return tt.date_to;
                case 9:
                    return tt.created_at;
                case 10:
                    return tt.updated_at;
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

    private void ret_aps() {
        int row = tbl_colleges.getSelectedRow();
        if (row < 0) {
            return;
        }
        Departments.to_departments to = (Departments.to_departments) tbl_colleges_ALM.get(row);

        String where = " where academic_year_period_id='" + to.created_by + "' ";

        List<Academic_year_period_schedules.to_academic_year_period_schedules> datas = Academic_year_period_schedules.ret_data(where);
        loadData_academic_year_period_schedules(datas);
        jLabel9.setText("" + datas.size());
    }

    private void select_schedule() {
        int row = tbl_academic_year_period_schedules.getSelectedRow();
        if (row < 0) {
            return;
        }
        Academic_year_period_schedules.to_academic_year_period_schedules to = (Academic_year_period_schedules.to_academic_year_period_schedules) tbl_academic_year_period_schedules_ALM.get(row);
        int col = tbl_academic_year_period_schedules.getSelectedColumn();
        if (col == 2) {
            Window p = (Window) this;
            Dlg_academic_year_period_enrollment_schedule nd = Dlg_academic_year_period_enrollment_schedule.create(p, true);
            nd.setTitle("");
//            nd.do_pass(services);
            nd.setCallback(new Dlg_academic_year_period_enrollment_schedule.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_academic_year_period_enrollment_schedule.OutputData data) {
                    closeDialog.ok();
                    Academic_year_period_schedules.update_enrollment(to.id, data.from, data.to);
                    Alert.set(2, "");
                    ret_aps();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 5 || col == 1) {
            Window p = (Window) this;
            Dlg_academic_year_period_schedule_date nd = Dlg_academic_year_period_schedule_date.create(p, true);
            nd.setTitle("");
            nd.do_pass(to.date_from, to.date_to);
            nd.setCallback(new Dlg_academic_year_period_schedule_date.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, Dlg_academic_year_period_schedule_date.OutputData data) {
                    closeDialog.ok();
                    Academic_year_period_schedules.update_date(to.id, data.from, data.to);
                    Alert.set(2, "");
                    ret_aps();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 4) {
            Window p = (Window) this;
            Dlg_academic_year_period_schedule_status nd = Dlg_academic_year_period_schedule_status.create(p, true);
            nd.setTitle("");
            nd.do_pass(to.status);
            nd.setCallback(new Dlg_academic_year_period_schedule_status.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, Dlg_academic_year_period_schedule_status.OutputData data) {
                    closeDialog.ok();
                    Academic_year_period_schedules.update_status(to.id, data.status);
                    Alert.set(2, "");
                    ret_aps();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 3) {
            Window p = (Window) this;
            Dlg_academic_year_period_schedule_date nd = Dlg_academic_year_period_schedule_date.create(p, true);
            nd.setTitle("");
            nd.do_pass(to.add_drop_starts, to.add_drop_ends);
            nd.setCallback(new Dlg_academic_year_period_schedule_date.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, Dlg_academic_year_period_schedule_date.OutputData data) {
                    closeDialog.ok();
                    Academic_year_period_schedules.update_add_drop(to.id, data.from, data.to);
                    Alert.set(2, "");
                    ret_aps();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }

    }
//</editor-fold> 
}
