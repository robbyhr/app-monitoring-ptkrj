
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


   //VARIABLE DAN FUNCTION AWAL FORM DI DEKLARASIKAN
    public class login extends javax.swing.JFrame {
    Connection con;
    Statement st;
    ResultSet rs;
    //PreparedStatement ps;
    String sql;
    public login() {
        initComponents();
        txtuser.requestFocus();
        //username();
        this.setLocationRelativeTo(null);
        //this.setTitle("===== MENU LOGIN =====");
    }
   //===========================================================================
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        iconkrj = new javax.swing.JLabel();
        labelusername = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        labelpassword = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton();
        btnsignup = new javax.swing.JLabel();
        Close = new javax.swing.JButton();
        background1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconkrj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/krjicon.png"))); // NOI18N
        getContentPane().add(iconkrj, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 200, 210));

        labelusername.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        labelusername.setForeground(new java.awt.Color(255, 255, 255));
        labelusername.setText("USERNAME");
        getContentPane().add(labelusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        txtuser.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        txtuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtuserKeyTyped(evt);
            }
        });
        getContentPane().add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 270, 30));

        labelpassword.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        labelpassword.setForeground(new java.awt.Color(255, 255, 255));
        labelpassword.setText("PASSWORD");
        getContentPane().add(labelpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 270, 30));

        btnlogin.setBackground(new java.awt.Color(51, 153, 255));
        btnlogin.setFont(new java.awt.Font("Trajan Pro", 0, 18)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 270, 50));

        btnsignup.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        btnsignup.setForeground(new java.awt.Color(255, 255, 255));
        btnsignup.setText("Pendaftaran Admin, Buat Akun Baru !");
        btnsignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsignupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsignupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsignupMouseExited(evt);
            }
        });
        getContentPane().add(btnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, -1, 20));

        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/close.png"))); // NOI18N
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 38, -1));

        background1.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/gradient1.jpg"))); // NOI18N
        getContentPane().add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //MENAMPILKAN NAMA USER DI FORM MENUUTAMA
    public void username(){
        menuutama baru = new menuutama();
        String namauser = txtuser.getText();
        baru.username.setText(namauser);
        baru.show();
    }
    //==========================================================================
    
    
    //FUNCTION BERSIHKAN
    private void bersih(){
        txtuser.setText("");
        txtpassword.setText("");
    }
    //===========================================================================
    
    
   //MENUTUP FORM    
    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
     System.exit(0);
    }//GEN-LAST:event_CloseActionPerformed
   //===========================================================================
    
    
    //MEMBUKA FORM LAIN KETIKA DI KLIK
    private void btnsignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsignupMouseClicked
       pendaftaran baru = new pendaftaran();
       baru.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnsignupMouseClicked
    //===========================================================================
    
    
    //CEK FIELD DAN DATABASE SESUAI INPUTAN USER DAN PASSWORD
    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
           try {
            sql = "SELECT * FROM admin WHERE user='"+txtuser.getText()+"' AND password='"+txtpassword.getText()+"'";
            Statement statement = (Statement) conek.GetConnection().createStatement();
            rs = statement.executeQuery(sql);
            if(rs.next()){
                if(txtuser.getText().equals(rs.getString("user")) && txtpassword.getText().equals(rs.getString("password"))){
                    JOptionPane.showMessageDialog(rootPane, "LOGIN BERHASIL");
                    username();
                    this.dispose();

                }
            }else{
                    JOptionPane.showMessageDialog(rootPane, "Username atau Password Salah");
                    bersih();
                    txtuser.requestFocus();

                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "GAGAL LOGIN");
            bersih();
        }
    }//GEN-LAST:event_btnloginActionPerformed
    //===========================================================================
    
    
    //MENGUBAH WARNA KETIKA DIMASUKI
    private void btnsignupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsignupMouseEntered
        btnsignup.setForeground(Color.green);
    }//GEN-LAST:event_btnsignupMouseEntered
    //===========================================================================

    
    //MENGUBAH WARNA KETIKA KELUAR
    private void btnsignupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsignupMouseExited
        btnsignup.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnsignupMouseExited
    //===========================================================================
    
    
    //HANYA TULISAN KECIL SAJA YANG BISA DI INPUT LOWERCASE DAN TIDAK DAPAT ANGKA JUGA
    private void txtuserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyTyped
       char enter=evt.getKeyChar();

        if(!(Character.isLowerCase(enter)))

        {

            evt.consume();
        }
        //if ( txtuser.getText().length() == 12 ) {
        //evt.consume();
        //JOptionPane.showMessageDialog(rootPane, "Maksimal yang dimasukan hanya 12 Angka", "Peringatan", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_txtuserKeyTyped
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    //==========================================================================
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JLabel background1;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel btnsignup;
    private javax.swing.JLabel iconkrj;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel labelpassword;
    private javax.swing.JLabel labelusername;
    private javax.swing.JPasswordField txtpassword;
    public javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
