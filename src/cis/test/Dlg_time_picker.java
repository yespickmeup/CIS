/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.test;

import cis.faculty_members.Faculty_members;
import cis.utils.TableRenderer;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JLabel;
import javax.swing.JTextField;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import synsoftech.fields.Field;

/**
 *
 * @author Ronescape
 */
public class Dlg_time_picker extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_time_picker
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
    private Dlg_time_picker(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_time_picker(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_time_picker() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_time_picker myRef;

    private void setThisRef(Dlg_time_picker myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_time_picker> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_time_picker create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_time_picker create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_time_picker dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_time_picker((java.awt.Frame) parent, false);
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
            Dlg_time_picker dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_time_picker((java.awt.Dialog) parent, false);
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

        Dlg_time_picker dialog = Dlg_time_picker.create(new javax.swing.JFrame(), true);
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
        jLabel7 = new javax.swing.JLabel();
        tf_user_screen_name2 = new Field.Combo();
        jLabel8 = new javax.swing.JLabel();
        tf_user_screen_name3 = new Field.Combo();
        tf_user_screen_name4 = new Field.Combo();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tf_user_screen_name5 = new Field.Combo();
        jLabel10 = new javax.swing.JLabel();
        tf_user_screen_name6 = new Field.Combo();
        tf_user_screen_name7 = new Field.Combo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel2.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("To:");

        tf_user_screen_name2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_user_screen_name2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_user_screen_name2.setFocusable(false);
        tf_user_screen_name2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_user_screen_name2MouseClicked(evt);
            }
        });
        tf_user_screen_name2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_user_screen_name2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText(":");

        tf_user_screen_name3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_user_screen_name3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_user_screen_name3.setFocusable(false);
        tf_user_screen_name3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_user_screen_name3MouseClicked(evt);
            }
        });
        tf_user_screen_name3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_user_screen_name3ActionPerformed(evt);
            }
        });

        tf_user_screen_name4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_user_screen_name4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_user_screen_name4.setText("AM");
        tf_user_screen_name4.setFocusable(false);
        tf_user_screen_name4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_user_screen_name4MouseClicked(evt);
            }
        });
        tf_user_screen_name4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_user_screen_name4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_user_screen_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel8)
                .addGap(0, 0, 0)
                .addComponent(tf_user_screen_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_user_screen_name4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tf_user_screen_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tf_user_screen_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tf_user_screen_name4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setOpaque(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("From:");

        tf_user_screen_name5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_user_screen_name5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_user_screen_name5.setFocusable(false);
        tf_user_screen_name5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_user_screen_name5MouseClicked(evt);
            }
        });
        tf_user_screen_name5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_user_screen_name5ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText(":");

        tf_user_screen_name6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_user_screen_name6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_user_screen_name6.setFocusable(false);
        tf_user_screen_name6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_user_screen_name6MouseClicked(evt);
            }
        });
        tf_user_screen_name6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_user_screen_name6ActionPerformed(evt);
            }
        });

        tf_user_screen_name7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_user_screen_name7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_user_screen_name7.setText("AM");
        tf_user_screen_name7.setFocusable(false);
        tf_user_screen_name7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_user_screen_name7MouseClicked(evt);
            }
        });
        tf_user_screen_name7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_user_screen_name7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_user_screen_name5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel10)
                .addGap(0, 0, 0)
                .addComponent(tf_user_screen_name6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_user_screen_name7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tf_user_screen_name5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tf_user_screen_name6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tf_user_screen_name7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(425, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
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

    private void tf_user_screen_name2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_user_screen_name2MouseClicked
        init_hour(tf_user_screen_name2);
    }//GEN-LAST:event_tf_user_screen_name2MouseClicked

    private void tf_user_screen_name2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_user_screen_name2ActionPerformed
        init_hour(tf_user_screen_name2);
    }//GEN-LAST:event_tf_user_screen_name2ActionPerformed

    private void tf_user_screen_name3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_user_screen_name3MouseClicked
        init_minute(tf_user_screen_name3);
    }//GEN-LAST:event_tf_user_screen_name3MouseClicked

    private void tf_user_screen_name3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_user_screen_name3ActionPerformed
        init_minute(tf_user_screen_name3);
    }//GEN-LAST:event_tf_user_screen_name3ActionPerformed

    private void tf_user_screen_name4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_user_screen_name4MouseClicked
        init_ampm(tf_user_screen_name4);
    }//GEN-LAST:event_tf_user_screen_name4MouseClicked

    private void tf_user_screen_name4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_user_screen_name4ActionPerformed
        init_ampm(tf_user_screen_name4);
    }//GEN-LAST:event_tf_user_screen_name4ActionPerformed

    private void tf_user_screen_name5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_user_screen_name5MouseClicked
        init_hour(tf_user_screen_name5);
    }//GEN-LAST:event_tf_user_screen_name5MouseClicked

    private void tf_user_screen_name5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_user_screen_name5ActionPerformed
        init_hour(tf_user_screen_name5);
    }//GEN-LAST:event_tf_user_screen_name5ActionPerformed

    private void tf_user_screen_name6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_user_screen_name6MouseClicked
        init_minute(tf_user_screen_name6);
    }//GEN-LAST:event_tf_user_screen_name6MouseClicked

    private void tf_user_screen_name6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_user_screen_name6ActionPerformed
        init_minute(tf_user_screen_name6);
    }//GEN-LAST:event_tf_user_screen_name6ActionPerformed

    private void tf_user_screen_name7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_user_screen_name7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_user_screen_name7MouseClicked

    private void tf_user_screen_name7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_user_screen_name7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_user_screen_name7ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField tf_user_screen_name2;
    private javax.swing.JTextField tf_user_screen_name3;
    private javax.swing.JTextField tf_user_screen_name4;
    private javax.swing.JTextField tf_user_screen_name5;
    private javax.swing.JTextField tf_user_screen_name6;
    private javax.swing.JTextField tf_user_screen_name7;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        Field.Combo tf_hour_from = (Field.Combo) tf_user_screen_name5;
        Field.Combo tf_mm_from = (Field.Combo) tf_user_screen_name6;
        tf_hour_from.setPrompt("HH");
        tf_mm_from.setPrompt("MM");

        Field.Combo tf_hour_to = (Field.Combo) tf_user_screen_name2;
        Field.Combo tf_mm_to = (Field.Combo) tf_user_screen_name3;
        tf_hour_to.setPrompt("HH");
        tf_mm_to.setPrompt("MM");

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

    private void init_hour(JTextField tf1) {
        Field.Combo tf_hour = (Field.Combo) tf1;
        String[] hour = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        String[] min = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
            "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
            "31", "32", "33", "34", "35", "36", "37", "38", "39", "40",
            "41", "42", "44", "44", "45", "46", "47", "48", "49", "40",
            "51", "52", "55", "54", "55", "56", "57", "58", "59",};

        String[] ampm = {"AM", "PM"};
        Object[][] obj = new Object[hour.length][1];
        for (int i = 0; i < hour.length; i++) {
            obj[i][0] = " " + hour[i];
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_hour.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_hour, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                String to = hour[data.selected_row];
                tf_hour.setText(to);
            }
        });
    }

    private void init_minute(JTextField tf1) {
        Field.Combo tf_hour = (Field.Combo) tf1;

        String[] min = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
            "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
            "31", "32", "33", "34", "35", "36", "37", "38", "39", "40",
            "41", "42", "44", "44", "45", "46", "47", "48", "49", "40",
            "51", "52", "55", "54", "55", "56", "57", "58", "59",};

        String[] am = {""};
        Object[][] obj = new Object[min.length][1];
        for (int i = 0; i < min.length; i++) {
            obj[i][0] = " " + min[i];
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_hour.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_hour, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                String to = min[data.selected_row];
                tf_hour.setText(to);
            }
        });
    }

    private void init_ampm(JTextField tf1) {
        Field.Combo tf_hour = (Field.Combo) tf1;

        String[] min = {"AM", "PM"};

        String[] am = {""};
        Object[][] obj = new Object[min.length][1];
        for (int i = 0; i < min.length; i++) {
            obj[i][0] = " " + min[i];
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_hour.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_hour, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                String to = min[data.selected_row];
                tf_hour.setText(to);
            }
        });
    }

}
