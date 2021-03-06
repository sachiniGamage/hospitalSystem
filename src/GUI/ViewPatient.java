/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.io.IOException;
import java.sql.Statement;
import physiotherapy.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Vector;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hp
 */
public class ViewPatient extends javax.swing.JFrame {
    JFrame f;

    /**
     * Creates new form ViewPatient
     */
    Patient_Reg regNo[];
    int index;
    int pID ;
    Patient_Reg view1;
    public ViewPatient() {
        initComponents();
        f = new JFrame();
        
    }
    
    public void TbDel(){
        try {
            PreparedStatement pst=null;
            ResultSet rs = null;
                
                Connection conn = DBConnection.connect();
                
            String sql = "SELECT Name,Age,Gender,Address,Occupation,Contact_number,mail,admit,ward From patient from patient";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
        }catch(Exception e){
            
        }
    }
      
    public int binarySearch(String name){
        
         int bottom = 0;
        int top = index-1;
        int middle = (int) Math.floor((bottom+top)/2);
        boolean found =false;
        
        while((bottom<=top) && (found == false)){
            if(regNo[middle].getName().compareTo(name) == 0 ){
                found = true;
                
            }else
                if(regNo[middle].getName().compareTo(name) > 0 ){
                top = middle-1;
            }else{
                    bottom = middle+1;
                }
            middle = (int) Math.floor((bottom+top)/2);
        }
        if(found == false){
            return -1;
        }else{
            return middle;
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnDeletePatient = new javax.swing.JButton();
        btnGetReprt = new javax.swing.JButton();
        btnMonthlyPatient = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaView = new javax.swing.JTextArea();
        btnAddplan = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnADDNewPatient = new javax.swing.JButton();
        btnBackToStart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("View Patient");

        jLabel2.setText(" Register Number:");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDeletePatient.setText("Delete Patient?");
        btnDeletePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePatientActionPerformed(evt);
            }
        });

        btnGetReprt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGetReprt.setText("Get Report");
        btnGetReprt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetReprtActionPerformed(evt);
            }
        });

        btnMonthlyPatient.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMonthlyPatient.setText("Mothly Patients");
        btnMonthlyPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonthlyPatientActionPerformed(evt);
            }
        });

        jTextAreaView.setColumns(20);
        jTextAreaView.setRows(5);
        jScrollPane1.setViewportView(jTextAreaView);

        btnAddplan.setText("Add Physiotheraphy Plan");
        btnAddplan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddplanActionPerformed(evt);
            }
        });

        jButton1.setText("Go To Payments");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(43, 43, 43)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnSearch)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnGetReprt, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDeletePatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAddplan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMonthlyPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(62, 62, 62))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(btnSearch)))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMonthlyPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGetReprt, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddplan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeletePatient, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(80, 80, 80))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        btnADDNewPatient.setText("Add New Patient");
        btnADDNewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDNewPatientActionPerformed(evt);
            }
        });

        btnBackToStart.setText("Back To Home");
        btnBackToStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(btnBackToStart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnADDNewPatient)
                .addGap(136, 136, 136))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnADDNewPatient)
                    .addComponent(btnBackToStart))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnADDNewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDNewPatientActionPerformed
        // TODO add your handling code here:
        PatientReg p1 = new  PatientReg();
        p1.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnADDNewPatientActionPerformed

    private void btnDeletePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePatientActionPerformed
        
        int x = JOptionPane.showConfirmDialog(null,"Do you want to delete ?");
        
        if (x == 0) {
            int srchNo = Integer.parseInt(txtSearch.getText());
            String sql = "DELETE from patient where Reg_no='" + srchNo + "'";
            //to stop sql injection
            PreparedStatement pst=null;
                ResultSet rs = null;
            Connection conn = DBConnection.connect();
            try {
                pst = conn.prepareStatement(sql);
                pst.execute();
                TbDel();
                JOptionPane.showMessageDialog(rootPane, "successfull");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Not successfull");
            }
        }
    }//GEN-LAST:event_btnDeletePatientActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:

                   //to stop sql injection
                PreparedStatement pst=null;
                ResultSet rs = null;
            
            int s = Integer.parseInt(txtSearch.getText());
            
            Connection conn = DBConnection.connect();
            String sql = "select * from patient where Reg_no like " + s ;
            pID = s;

            try {
                pst = conn.prepareStatement(sql);               
                rs = pst.executeQuery();
                
                String name = "";
                String age ="" ;
                String gender = "";
                String addrss="";
                String Occu="";
                String Contct ="";
                String email="";
                String admit="";
                String ward ="";
                String date = "";
                
                while(rs.next()){
                    name = rs.getString("Name");
                    age = rs.getString("Age");
                    gender = rs.getString("Gender");
                    addrss = rs.getString("Address");
                    Occu = rs.getString("Occupation");
                    Contct = rs.getString("Contact_number");
                    email = rs.getString("email");
                    admit = rs.getString("admit");
                    ward = rs.getString("ward");
                    date = rs.getString("date");
                    
                }
                String vw = "name: "+name+"\n" +"Age: " +age+"\n"+"gender: " +gender + "\n"+ "Address: " + addrss+ "\n" +"Occupation: "+Occu+"\n"+
                        "contact number: "+Contct+"\n"+"Email: "+email+"\n"+"Admitted: " +admit+"\n"+"Ward: "+ward + "date: " +date;
                jTextAreaView.setText(vw);
//                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "search fail");
        }
        

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackToStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToStartActionPerformed
        // TODO add your handling code here:
        Start v= new Start();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackToStartActionPerformed

    private void btnMonthlyPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonthlyPatientActionPerformed
        // TODO add your handling code here:
        MonthlyPatientUI v= new MonthlyPatientUI();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMonthlyPatientActionPerformed

    private void btnAddplanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddplanActionPerformed
        // TODO add your handling code here:
        phyPlan v= new phyPlan(pID);
        System.out.println("abc"+pID);
        
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddplanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Payments v= new Payments(pID);
        System.out.println("abc"+pID);
        
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGetReprtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetReprtActionPerformed
        try {
            // TODO add your handling code here:
            PatientReport.Report(pID);
            System.out.println("abc"+pID);
            
            
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(ViewPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGetReprtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADDNewPatient;
    private javax.swing.JButton btnAddplan;
    private javax.swing.JButton btnBackToStart;
    private javax.swing.JButton btnDeletePatient;
    private javax.swing.JButton btnGetReprt;
    private javax.swing.JButton btnMonthlyPatient;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaView;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
