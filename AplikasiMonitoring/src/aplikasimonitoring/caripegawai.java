    
package aplikasimonitoring;

//KOMPONEN
import javax.swing.table.DefaultTableModel;
import com.mysql.jdbc.Statement;
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

//DEKLARASI VARIABLE DAN FUNCTION AWAL DI SINI
public class caripegawai extends javax.swing.JInternalFrame {
    public caripegawai() {
        initComponents();
        tabeldata();
    }
    //==========================================================================
          
    
    //MENYAMBUNGKAN DATABASE KE DALAM TABLE
    public void tabeldata() {
        DefaultTableModel tbl= new DefaultTableModel();
        //tbl.addColumn("Kode");
        tbl.addColumn("Nama");
        tbl.addColumn("Group");
        tbl.addColumn("KTP");
        tbl.addColumn("Tgl Lahir");
        tbl.addColumn("Tmpt Lahir");
        tbl.addColumn("Ijasah");
        tbl.addColumn("Status");
        tbl.addColumn("Pengalaman");
        tbl.addColumn("Telepon");
        tbl.addColumn("Alamat");
        tabelcari.setModel(tbl);
        try{
            Statement statement=(Statement)conek.GetConnection().createStatement();
            ResultSet res=statement.executeQuery("select * from tblpegawai");
            while(res.next())
            {
                tbl.addRow(new Object[]{
                   //res.getString("kode"),
                   res.getString("nama"),
                   res.getString("grup"),
                   res.getString("ktp"),
                   res.getString("tgllahir"),
                   res.getString("tmptlahir"),
                   res.getString("ijasah"),
                   res.getString("status"),
                   res.getString("pengalaman"),
                   res.getString("telp"),
                   res.getString("alamat")
                   
                });
                tabelcari.setModel(tbl);  
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(rootPane,"Salah");
        }
    }
    //==========================================================================

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        btncari = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelcari = new javax.swing.JTable();
        txtcari = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CARI");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 50));

        btncari.setBackground(new java.awt.Color(255, 204, 0));
        btncari.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        btncari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/find.png"))); // NOI18N
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });
        getContentPane().add(btncari, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 60, 55));

        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/close.png"))); // NOI18N
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, 38, -1));

        tabelcari.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelcari);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 1100, 400));

        txtcari.setFont(new java.awt.Font("Trajan Pro", 0, 18)); // NOI18N
        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });
        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcariKeyPressed(evt);
            }
        });
        getContentPane().add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 240, 30));

        jLabel22.setFont(new java.awt.Font("Trajan Pro", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Masukkan Nama / Grup");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/color.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //KELUAR
    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        dispose();
    }//GEN-LAST:event_CloseActionPerformed
    //==========================================================================
    
    
    //==========================================================================
    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
   
    }//GEN-LAST:event_txtcariActionPerformed
    //==========================================================================
    
    
    //BUTTON MENCARI DATA YANG TELAH DI INPUT
    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
              try{
            String cari = txtcari.getText();
            Statement statement = (Statement)conek.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select * from tblpegawai where nama LIKE '%" +cari+ "%'"+" OR grup LIKE '%" +cari+ "%'");
                                                                                                                              
            DefaultTableModel tbl = new DefaultTableModel();
            //tbl.addColumn("Kode");
            tbl.addColumn("Nama");
            tbl.addColumn("Group");
            tbl.addColumn("KTP");
            tbl.addColumn("Tgl Lahir");
            tbl.addColumn("Tmpt Lahir");
            tbl.addColumn("Ijasah");
            tbl.addColumn("Status");
            tbl.addColumn("Pengalaman");
            tbl.addColumn("Telepon");
            tbl.addColumn("Alamat");
            tabelcari.setModel(tbl);
            
            while(res.next()) {
                tbl.addRow(new Object[]{
                   res.getString("nama"),
                   res.getString("grup"),
                   res.getString("ktp"),
                   res.getString("tgllahir"),
                   res.getString("tmptlahir"),
                   res.getString("ijasah"),
                   res.getString("status"),
                   res.getString("pengalaman"),
                   res.getString("telp"),
                   res.getString("alamat")
                });
                tabelcari.setModel(tbl);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Salah");
        }
    }//GEN-LAST:event_btncariActionPerformed
    //==========================================================================
    
    
    //EVENT MENAMPILKAN DATA YANG DI CARI KETIKA KEYPAD DITEKAN
    private void txtcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyPressed
      try{
            String cari = txtcari.getText();
            Statement statement = (Statement)conek.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select * from tblpegawai where nama LIKE '%" +cari+ "%'"+" OR grup LIKE '%" +cari+ "%'");
                                                                                                                              
            DefaultTableModel tbl = new DefaultTableModel();
            //tbl.addColumn("Kode");
            tbl.addColumn("Nama");
            tbl.addColumn("Group");
            tbl.addColumn("KTP");
            tbl.addColumn("Tgl Lahir");
            tbl.addColumn("Tmpt Lahir");
            tbl.addColumn("Ijasah");
            tbl.addColumn("Status");
            tbl.addColumn("Pengalaman");
            tbl.addColumn("Telepon");
            tbl.addColumn("Alamat");
            tabelcari.setModel(tbl);
            
            while(res.next()) {
                tbl.addRow(new Object[]{
                   res.getString("nama"),
                   res.getString("grup"),
                   res.getString("ktp"),
                   res.getString("tgllahir"),
                   res.getString("tmptlahir"),
                   res.getString("ijasah"),
                   res.getString("status"),
                   res.getString("pengalaman"),
                   res.getString("telp"),
                   res.getString("alamat")
                });
                tabelcari.setModel(tbl);
              
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Salah");
        } 
    }//GEN-LAST:event_txtcariKeyPressed
    //==========================================================================

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JLabel background;
    private javax.swing.JButton btncari;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelcari;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables
}
