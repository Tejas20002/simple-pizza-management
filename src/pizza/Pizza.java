/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Frame.java to edit this template
 */
package pizza;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author popeye
 */
public class Pizza extends java.awt.Frame {

    /**
     * Creates new form PizzaFrame
     */
    DefaultTableModel model;
    String item;
    int price;
    Connection con;
    PreparedStatement dta;
    public Pizza() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        label2 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        txtqty = new javax.swing.JSpinner();
        txttotal = new java.awt.Label();
        button1 = new java.awt.Button();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        jPanel2 = new javax.swing.JPanel();
        lbsmall = new javax.swing.JRadioButton();
        lbmed = new javax.swing.JRadioButton();
        lblarge = new javax.swing.JRadioButton();
        lbexlarge = new javax.swing.JRadioButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setAutoscrolls(true);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setInheritsPopupMenu(true);
        jPanel1.setLayout(null);

        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        label1.setText("Size of Pizza");
        jPanel1.add(label1);
        label1.setBounds(10, 60, 112, 26);
        label1.getAccessibleContext().setAccessibleName("label1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price", "Qty", "Total"
            }
        ));
        jTable1.setRowHeight(15);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(160, 60, 452, 260);

        label2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label2.setText("Total");
        jPanel1.add(label2);
        label2.setBounds(620, 150, 60, 50);

        jLabel1.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel1.setText("QTY");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 230, 70, 30);

        txtqty.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        jPanel1.add(txtqty);
        txtqty.setBounds(20, 260, 70, 40);

        txttotal.setAlignment(java.awt.Label.CENTER);
        txttotal.setBackground(new java.awt.Color(255, 255, 255));
        txttotal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txttotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txttotal.setText("0");
        jPanel1.add(txttotal);
        txttotal.setBounds(680, 160, 100, 30);

        button1.setBackground(new java.awt.Color(0, 0, 255));
        button1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button1.setLabel("Add Item");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1);
        button1.setBounds(620, 60, 90, 30);

        jLabel2.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 30, 40, 18);

        name.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jPanel1.add(name);
        name.setBounds(60, 20, 220, 30);

        button2.setBackground(new java.awt.Color(0, 0, 204));
        button2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button2.setLabel("Remove");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel1.add(button2);
        button2.setBounds(620, 110, 90, 30);

        button3.setBackground(new java.awt.Color(0, 0, 255));
        button3.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        button3.setLabel("Submit");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jPanel1.add(button3);
        button3.setBounds(620, 280, 90, 30);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setToolTipText("");
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setFocusCycleRoot(true);

        buttonGroup2.add(lbsmall);
        lbsmall.setText("Smaill");
        lbsmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbsmallActionPerformed(evt);
            }
        });

        buttonGroup2.add(lbmed);
        lbmed.setText("Medium");
        lbmed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbmedActionPerformed(evt);
            }
        });

        buttonGroup2.add(lblarge);
        lblarge.setText("Large");
        lblarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblargeActionPerformed(evt);
            }
        });

        buttonGroup2.add(lbexlarge);
        lbexlarge.setText("Extra Large");
        lbexlarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbexlargeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblarge)
                    .addComponent(lbmed)
                    .addComponent(lbsmall)
                    .addComponent(lbexlarge))
                .addGap(172, 172, 172))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbsmall)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbmed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblarge)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbexlarge)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 90, 90, 140);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void lbmedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbmedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbmedActionPerformed

    private void lbsmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbsmallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbsmallActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
//        if(!lbsmall.isSelected() && !lbmed.isSelected() && !lbsmall.isSelected() && !lbexlarge.isSelected() || txtqty.getValue()!="0"){
//            JOptionPane.showMessageDialog(this, "Insert the Value!");
//        }else{
            if(lbsmall.isSelected() == true){
                item = "Small";
                price = 200;

            }else if(lbmed.isSelected() == true){
                item = "Medium";
                price = 300;

            }else if(lblarge.isSelected() == true){
                item = "Large";
                price = 400;

            }else if(lbexlarge.isSelected() == true){
                item = "ExLarge";
                price = 700;
            }
            int qty = Integer.parseInt(txtqty.getValue().toString());
            int tot = qty * price;

            model = (DefaultTableModel)jTable1.getModel();

            model.addRow(new Object[]

            {
                item,
                price,
                qty,
                tot

            });
            int sum = 0;

            for(int a=0; a<jTable1.getRowCount(); a++)
            {
                sum = sum + Integer.parseInt(jTable1.getValueAt(a, 3).toString()); 
            }
            txttotal.setText(Integer.toString(sum));
//        }
        
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        model.removeRow(jTable1.getSelectedRow());
        int sum = 0;
        for(int a=0; a<jTable1.getRowCount(); a++){
            sum = sum + Integer.parseInt(jTable1.getValueAt(a, 3).toString());
        }
        txttotal.setText(Integer.toString(sum));
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/pizza","popeye","apstndp@20");
            
            String total = txttotal.getText();
            String nameCustomer = name.getText();            
            int row = jTable1.getRowCount();
            LocalTime myDate = LocalTime.now();
            String ins = "INSERT INTO `del`(`user_name`, `item`, `price`, `qty`, `total`, `created_at`)values(?,?,?,?,?,?)";
            
            dta = con.prepareStatement(ins);
            
            String item = "";
            int price;
            int qty;
            int tot = 0;

            for(int i=0; i<jTable1.getRowCount(); i++){
                item = (String)jTable1.getValueAt(i, 0);
                price = (int)jTable1.getValueAt(i, 1);
                qty = (int)jTable1.getValueAt(i, 2);
                tot = (int)jTable1.getValueAt(i, 3);

                dta.setString(1,nameCustomer);
                dta.setString(2,item);
                dta.setInt(3,price);
                dta.setInt(4,qty);
                dta.setInt(5,tot);
                dta.setString(6, myDate.toString());
                dta.executeUpdate();
                        
            }            
            JOptionPane.showMessageDialog(this, "Inserted Complete!!!!!!!!!");
            model.setNumRows(0); 
            txttotal.setText("");
            name.setText("");
            txtqty.setValue(0);
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pizza.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_button3ActionPerformed

    private void lblargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblargeActionPerformed

    private void lbexlargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbexlargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbexlargeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pizza().setVisible(true);
            }
        });
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JRadioButton lbexlarge;
    private javax.swing.JRadioButton lblarge;
    private javax.swing.JRadioButton lbmed;
    private javax.swing.JRadioButton lbsmall;
    private javax.swing.JTextField name;
    private javax.swing.JSpinner txtqty;
    private java.awt.Label txttotal;
    // End of variables declaration//GEN-END:variables

}
