package aplikasimonitoring;

//KOMPONEN
import javax.swing.table.DefaultTableModel;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import koneksi.conek;
import javax.swing.table.DefaultTableModel;
//==============================================================================


//LOKASI DIMANA VARIABLE DI KETIK DAN MENAMPILKAN DATA AWAL KETIKA FORM STARTING
public class pendaftaran extends javax.swing.JFrame {
Connection con;
Statement st;
ResultSet rs;
//PreparedStatement ps;
String sql;
    public pendaftaran() {
        initComponents();
        txtnewuser.requestFocus();
        this.setLocationRelativeTo(null);
        //this.setTitle("===== MENU PENDAFTARAN =====");
    }
    //==========================================================================
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        txtnewuser = new javax.swing.JTextField();
        txtnewemail = new javax.swing.JTextField();
        txtnewnohp = new javax.swing.JTextField();
        txtnewpassword = new javax.swing.JPasswordField();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        Close = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtnewpassword1 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnregister = new javax.swing.JButton();
        background1 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnewuser.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        txtnewuser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));
        txtnewuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnewuserKeyTyped(evt);
            }
        });
        getContentPane().add(txtnewuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 220, 30));

        txtnewemail.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        txtnewemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));
        getContentPane().add(txtnewemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 220, 30));

        txtnewnohp.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        txtnewnohp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));
        txtnewnohp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnewnohpKeyTyped(evt);
            }
        });
        getContentPane().add(txtnewnohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 220, 30));

        txtnewpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));
        getContentPane().add(txtnewpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 220, 30));

        jLabel32.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel32.setText("Email");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        jLabel35.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel35.setText("No HP");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/close.png"))); // NOI18N
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 38, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/register.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 130, 40));

        jLabel31.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel31.setText("Password");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 100, -1));

        jLabel33.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel33.setText("Username");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 100, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/SIGNUPICON.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 260, 260));

        jLabel34.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel34.setText("Konfirmasi Password");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 170, -1));

        txtnewpassword1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));
        getContentPane().add(txtnewpassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 220, 30));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTER AKUN");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 0, 220, 40);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 240, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        btnregister.setBackground(new java.awt.Color(51, 153, 255));
        btnregister.setFont(new java.awt.Font("Trajan Pro", 0, 18)); // NOI18N
        btnregister.setForeground(new java.awt.Color(255, 255, 255));
        btnregister.setText("REGISTER");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnregister);
        btnregister.setBounds(30, 370, 220, 40);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 280, 420));

        background1.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/gradient1.jpg"))); // NOI18N
        getContentPane().add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //EXIT FORM DAN KEMBALI KE FORM LOGIN
    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        login baru = new login();
        baru.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CloseActionPerformed
    
    
    //
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed
    //==========================================================================
    
    
    //INPUT UNTUK MEMASUKKAN DATA PENDAFTARAN KE DALAM DATABASE
    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
    String user = txtnewuser.getText();
    String email =txtnewemail.getText();
    String nohp = txtnewnohp.getText();
    String pass = new String (txtnewpassword.getPassword());
    String pass2 = new String (txtnewpassword1.getPassword());
        
   try{
        if (user.equals("") || pass.equals("") || email.equals("") || nohp.equals("") || pass2.equals("")){
            JOptionPane.showMessageDialog(rootPane, "ADA DATA YANG BELUM DI ISI");
        }else{
            if (pass.equals(pass2) && pass != ""){
            Statement statement = (Statement) conek.GetConnection().createStatement();
            statement.executeUpdate("insert into admin VALUES ('" + user + "','" + pass + "','" + email + "','" + nohp + "');");
            statement.close();
            
            JOptionPane.showMessageDialog(rootPane, "BERHASIL REGISTER");
            login baru = new login();
            baru.setVisible(true);
            this.dispose();
        }
        else{
        JOptionPane.showMessageDialog(rootPane, "PASSWORD TIDAK SAMA");
            }
        }
        
        }catch (Exception t){
            JOptionPane.showMessageDialog(rootPane, "GAGAL REGISTER");
        }
    }//GEN-LAST:event_btnregisterActionPerformed
    //==========================================================================
    
    
    //BERFUNGSI INPUT KEYBOARD HANYA DIGIT ANGKA DAN MEMBUAT LIMIT YANG AKAN DI INPUT
    private void txtnewnohpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnewnohpKeyTyped
        char enter=evt.getKeyChar();

        if(!(Character.isDigit(enter)))

        {

            evt.consume();
        }
        if ( txtnewnohp.getText().length() == 12 ) {
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "Maksimal yang dimasukan hanya 12 Angka", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtnewnohpKeyTyped
    //==========================================================================
    
    
    //HANYA TULISAN KECIL DAN TIDAK ADA ANGKA
    private void txtnewuserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnewuserKeyTyped
       char enter=evt.getKeyChar();

        if(!(Character.isLowerCase(enter)))

        {

            evt.consume();
        }
    }//GEN-LAST:event_txtnewuserKeyTyped
    //==========================================================================
    
    
    //==========================================================================
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
            java.util.logging.Logger.getLogger(pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new pendaftaran().setVisible(true);
            }
        });
    }
    //==========================================================================

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JLabel background1;
    private javax.swing.JButton btnregister;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtnewemail;
    private javax.swing.JTextField txtnewnohp;
    private javax.swing.JPasswordField txtnewpassword;
    private javax.swing.JPasswordField txtnewpassword1;
    private javax.swing.JTextField txtnewuser;
    // End of variables declaration//GEN-END:variables
}
