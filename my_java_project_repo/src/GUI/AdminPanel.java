/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import javaproject.Flight;
import javaproject.FlightSys;
import javaproject.TicketSys;


/**
 *
 * @author ugure
 */
public class AdminPanel extends javax.swing.JFrame {

    /**
     * Creates new form AdminPanel
     */
    
    ArrayList<Flight> temp;
    
   
    public AdminPanel() {
        temp = FlightSys.getArr();
        setLocationRelativeTo(null); //center
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        flightTypeCMB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        priceTXT = new javax.swing.JTextField();
        deletedFlTXT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        flightDateTimeTXT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fromToDestTXT = new javax.swing.JTextField();
        addNewFlightBTN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        gateTXT = new javax.swing.JTextField();
        gotoWelcomePage = new javax.swing.JButton();
        adminPanelInfoTXT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        flightNoTXT = new javax.swing.JTextField();
        deleteFlightBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("DELETE FLIGHT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 110, -1));

        flightTypeCMB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Domestic Flight", "International Flight", " ", " " }));
        getContentPane().add(flightTypeCMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 120, -1));

        jLabel2.setText("Price");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));
        getContentPane().add(priceTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 80, -1));

        deletedFlTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletedFlTXTActionPerformed(evt);
            }
        });
        getContentPane().add(deletedFlTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 130, -1));

        jLabel3.setText("Flight No");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel4.setText("Flight Date-Time");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));
        getContentPane().add(flightDateTimeTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 130, -1));

        jLabel5.setText("From to Dest.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));
        getContentPane().add(fromToDestTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 130, -1));

        addNewFlightBTN.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        addNewFlightBTN.setText("ADD NEW FLIGHT");
        addNewFlightBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewFlightBTNActionPerformed(evt);
            }
        });
        getContentPane().add(addNewFlightBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 220, 70));

        jLabel6.setText("Gate");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));
        getContentPane().add(gateTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 80, -1));

        gotoWelcomePage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        gotoWelcomePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoWelcomePageActionPerformed(evt);
            }
        });
        getContentPane().add(gotoWelcomePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 90, 80));

        adminPanelInfoTXT.setEditable(false);
        adminPanelInfoTXT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(adminPanelInfoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 370, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("ADMIN PANEL");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        jLabel8.setText("Flight No");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));
        getContentPane().add(flightNoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 130, -1));

        deleteFlightBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_ticket.png"))); // NOI18N
        deleteFlightBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFlightBTNActionPerformed(evt);
            }
        });
        getContentPane().add(deleteFlightBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 70, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gotoWelcomePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoWelcomePageActionPerformed
       WelcomePage wl = new WelcomePage();
        wl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_gotoWelcomePageActionPerformed

    private void addNewFlightBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewFlightBTNActionPerformed
       String flightNo,flightType,fdt,fromToDest;
       int gate;
       double price;
       
       
       
       
       if(flightNoTXT.getText().isEmpty() ||  flightDateTimeTXT.getText().isEmpty() || fromToDestTXT.getText().isEmpty() || gateTXT.getText().isEmpty() || priceTXT.getText().isEmpty()){
           adminPanelInfoTXT.setText("Please Fill all blanks!!!");
           flightNoTXT.setText("");
           flightDateTimeTXT.setText("");
           fromToDestTXT.setText("");
           gateTXT.setText("");
           priceTXT.setText("");
       }else{
            flightNo = flightNoTXT.getText();
            flightType =(String)flightTypeCMB.getSelectedItem();
            fdt = flightDateTimeTXT.getText();
            fromToDest=fromToDestTXT.getText();
            gate=Integer.parseInt(gateTXT.getText());
             price=Double.parseDouble(priceTXT.getText());
             
           flightNoTXT.setText("");
           flightDateTimeTXT.setText("");
           fromToDestTXT.setText("");
           gateTXT.setText("");
           priceTXT.setText("");
           
           
           
               if(!FlightSys.isFlightIdExists(flightNo)){
                   boolean exp = FlightSys.addFlight(flightType, flightNo, fdt, fromToDest, gate, price,"-", "-", 0.0,"-","-");
                   if(exp){
                       adminPanelInfoTXT.setText("Flight added to the list");
                   }
               }else{
                   adminPanelInfoTXT.setText("Flight No already exist in list!");
               }
           
       }
       
    }//GEN-LAST:event_addNewFlightBTNActionPerformed

    private void deleteFlightBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFlightBTNActionPerformed
        String flightNothatDeleted = deletedFlTXT.getText();
        
        if(!deletedFlTXT.getText().isEmpty()){
            boolean res =FlightSys.removeFlight(flightNothatDeleted);
            if(res){
                adminPanelInfoTXT.setText("Flight deleted!");
            }else{
                adminPanelInfoTXT.setText("Flight no has not found!");
            }
        }else{
            adminPanelInfoTXT.setText("Add a valid flight no!");
        }
    }//GEN-LAST:event_deleteFlightBTNActionPerformed

    private void deletedFlTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletedFlTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletedFlTXTActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewFlightBTN;
    private javax.swing.JTextField adminPanelInfoTXT;
    private javax.swing.JButton deleteFlightBTN;
    private javax.swing.JTextField deletedFlTXT;
    private javax.swing.JTextField flightDateTimeTXT;
    private javax.swing.JTextField flightNoTXT;
    private javax.swing.JComboBox<String> flightTypeCMB;
    private javax.swing.JTextField fromToDestTXT;
    private javax.swing.JTextField gateTXT;
    private javax.swing.JButton gotoWelcomePage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField priceTXT;
    // End of variables declaration//GEN-END:variables
}
