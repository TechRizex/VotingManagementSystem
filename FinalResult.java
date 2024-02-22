
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author amith
 */
public class FinalResult extends javax.swing.JFrame {

    /**
     * Creates new form FinalResult
     */
    public FinalResult() {
        initComponents();
        Connect();
    }
     Connection con;
     PreparedStatement pst;   
     ResultSet rs;
     public void Connect()  
   {
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Voting","root","amit123");
             
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(addvoters.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        incs = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jdu = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inc = new javax.swing.JLabel();
        rjd = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        npp = new javax.swing.JLabel();
        bjp = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        aap = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        bsp = new javax.swing.JLabel();
        cpi = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        aaps = new javax.swing.JButton();
        bjps = new javax.swing.JButton();
        cpis = new javax.swing.JButton();
        npps = new javax.swing.JButton();
        jdus = new javax.swing.JButton();
        bsps = new javax.swing.JButton();
        rjds = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("FINAL RESULTS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 6, 281, -1));

        incs.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        incs.setText("Show Result");
        incs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incsActionPerformed(evt);
            }
        });
        getContentPane().add(incs, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("BJP=");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 51, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("CPI=");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 43, -1));

        jdu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jdu.setText(" ");
        getContentPane().add(jdu, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 43, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("AAP=");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 60, -1));

        inc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        inc.setText(" ");
        getContentPane().add(inc, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 43, -1));

        rjd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rjd.setText(" ");
        getContentPane().add(rjd, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 43, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("BSP=");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 240, 50, -1));

        npp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        npp.setText(" ");
        getContentPane().add(npp, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 43, -1));

        bjp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bjp.setText(" ");
        getContentPane().add(bjp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("RJD=");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 60, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("INC=");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, 60, -1));

        aap.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        aap.setText(" ");
        getContentPane().add(aap, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 43, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("JDU=");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 50, -1));

        bsp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bsp.setText(" ");
        getContentPane().add(bsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 240, 43, -1));

        cpi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cpi.setText(" ");
        getContentPane().add(cpi, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 43, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("NPP=");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 60, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1016, 15, -1, -1));

        aaps.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        aaps.setText("Show Result");
        aaps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aapsActionPerformed(evt);
            }
        });
        getContentPane().add(aaps, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        bjps.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bjps.setText("Show Result");
        bjps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bjpsActionPerformed(evt);
            }
        });
        getContentPane().add(bjps, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        cpis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cpis.setText("Show Result");
        cpis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpisActionPerformed(evt);
            }
        });
        getContentPane().add(cpis, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, -1, -1));

        npps.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        npps.setText("Show Result");
        npps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nppsActionPerformed(evt);
            }
        });
        getContentPane().add(npps, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, -1, -1));

        jdus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jdus.setText("Show Result");
        jdus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdusActionPerformed(evt);
            }
        });
        getContentPane().add(jdus, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, -1, -1));

        bsps.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bsps.setText("Show Result");
        bsps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bspsActionPerformed(evt);
            }
        });
        getContentPane().add(bsps, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 280, -1, -1));

        rjds.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rjds.setText("Show Result");
        rjds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rjdsActionPerformed(evt);
            }
        });
        getContentPane().add(rjds, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, -1, -1));

        setSize(new java.awt.Dimension(1133, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void incsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incsActionPerformed
        // TODO add your handling code here:
      try{
            pst=con.prepareStatement("select count(vote) from votingdetails where choosepartyname='INC'");
            rs=pst.executeQuery();
            inc.removeAll();
            while(rs.next())
            {
                inc.setText(rs.getString(1));
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_incsActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void aapsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aapsActionPerformed
        // TODO add your handling code here:
        try{
            pst=con.prepareStatement("select count(vote) from votingdetails where choosepartyname='AAP'");
            rs=pst.executeQuery();
            aap.removeAll();
            while(rs.next())
            {
                aap.setText(rs.getString(1));
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_aapsActionPerformed

    private void bjpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bjpsActionPerformed
        // TODO add your handling code here:
        try{
            pst=con.prepareStatement("select count(vote) from votingdetails where choosepartyname='BJP'");
            rs=pst.executeQuery();
            bjp.removeAll();
            while(rs.next())
            {
                bjp.setText(rs.getString(1));
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_bjpsActionPerformed

    private void cpisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpisActionPerformed
        // TODO add your handling code here:
        try{
            pst=con.prepareStatement("select count(vote) from votingdetails where choosepartyname='CPI'");
            rs=pst.executeQuery();
            cpi.removeAll();
            while(rs.next())
            {
                cpi.setText(rs.getString(1));
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cpisActionPerformed

    private void nppsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nppsActionPerformed
        // TODO add your handling code here:
        try{
            pst=con.prepareStatement("select count(vote) from votingdetails where choosepartyname='NPP'");
            rs=pst.executeQuery();
            npp.removeAll();
            while(rs.next())
            {
                npp.setText(rs.getString(1));
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_nppsActionPerformed

    private void jdusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdusActionPerformed
        // TODO add your handling code here:
        try{
            pst=con.prepareStatement("select count(vote) from votingdetails where choosepartyname='JDU'");
            rs=pst.executeQuery();
            jdu.removeAll();
            while(rs.next())
            {
                jdu.setText(rs.getString(1));
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jdusActionPerformed

    private void bspsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bspsActionPerformed
        // TODO add your handling code here:
        try{
            pst=con.prepareStatement("select count(vote) from votingdetails where choosepartyname='BSP'");
            rs=pst.executeQuery();
            bsp.removeAll();
            while(rs.next())
            {
                bsp.setText(rs.getString(1));
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_bspsActionPerformed

    private void rjdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rjdsActionPerformed
        // TODO add your handling code here:
        try{
            pst=con.prepareStatement("select count(vote) from votingdetails where choosepartyname='RJD'");
            rs=pst.executeQuery();
            rjd.removeAll();
            while(rs.next())
            {
                rjd.setText(rs.getString(1));
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_rjdsActionPerformed

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
            java.util.logging.Logger.getLogger(FinalResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aap;
    private javax.swing.JButton aaps;
    private javax.swing.JLabel bjp;
    private javax.swing.JButton bjps;
    private javax.swing.JLabel bsp;
    private javax.swing.JButton bsps;
    private javax.swing.JLabel cpi;
    private javax.swing.JButton cpis;
    private javax.swing.JLabel inc;
    private javax.swing.JButton incs;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jdu;
    private javax.swing.JButton jdus;
    private javax.swing.JLabel npp;
    private javax.swing.JButton npps;
    private javax.swing.JLabel rjd;
    private javax.swing.JButton rjds;
    // End of variables declaration//GEN-END:variables
}
