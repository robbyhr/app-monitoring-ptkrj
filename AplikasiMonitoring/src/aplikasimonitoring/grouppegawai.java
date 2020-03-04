package aplikasimonitoring;


//KOMPONEN
import javax.swing.table.DefaultTableModel;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import koneksi.conek;
//==============================================================================


//FUNCTION DAN VARIABLE DI DEKLARASIKAN DI AWAL
public class grouppegawai extends javax.swing.JInternalFrame {
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    String sql;
    public grouppegawai() {
        initComponents();
        datatable();
        autonumbergroup();
    }
    //==========================================================================

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblgrup = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtnamagrup = new javax.swing.JTextField();
        txtkodegrup = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        Close = new javax.swing.JButton();
        btninput = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        kosong = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblgrup.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tblgrup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblgrupMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblgrup);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 360, 220));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("GROUP");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 230, 50));

        txtnamagrup.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        getContentPane().add(txtnamagrup, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 230, 30));

        txtkodegrup.setEditable(false);
        txtkodegrup.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        txtkodegrup.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(txtkodegrup, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 230, 30));

        jLabel32.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel32.setText("KODE");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 20));

        jLabel31.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel31.setText("NAMA GROUP");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 20));

        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/close.png"))); // NOI18N
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 38, -1));

        btninput.setBackground(new java.awt.Color(255, 204, 0));
        btninput.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        btninput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/addpersonal.png"))); // NOI18N
        btninput.setText("INPUT");
        btninput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninputActionPerformed(evt);
            }
        });
        getContentPane().add(btninput, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 140, 55));

        btnhapus.setBackground(new java.awt.Color(255, 204, 0));
        btnhapus.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/delete.png"))); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 140, 55));

        kosong.setBackground(new java.awt.Color(255, 204, 0));
        kosong.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        kosong.setForeground(new java.awt.Color(255, 255, 255));
        kosong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/clear.png"))); // NOI18N
        kosong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kosongActionPerformed(evt);
            }
        });
        getContentPane().add(kosong, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 60, 55));

        background.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/color.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    //KOSONGKAN TEXT FIELD
    private void kosongkan(){
    txtkodegrup.setText("");
    txtnamagrup.setText("");
    autonumbergroup();
    }
    //==========================================================================
    
    
    //MENAMPILKAN DATABASE KEDALAM TABLE
    public void datatable() {
      DefaultTableModel tbl= new DefaultTableModel();
        tbl.addColumn("Kode");
        tbl.addColumn("Group");
        try{
            java.sql.Statement statement=(java.sql.Statement)conek.GetConnection().createStatement();
            ResultSet res=statement.executeQuery("select * from tblgrup");
            while(res.next())
            {
                tbl.addRow(new Object[]{
                   res.getString("kode_grup"),
                   res.getString("nama_grup"),
                });
                tblgrup.setModel(tbl);  
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(rootPane,"Salah");
        }
    }
    //==========================================================================
    
    //KELUAR
    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        dispose();
    }//GEN-LAST:event_CloseActionPerformed
    //==========================================================================
    
    
    //EVENT KETIKA KLIK TABLE
    private void tblgrupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblgrupMouseClicked
      txtkodegrup.setText(tblgrup.getValueAt(tblgrup.getSelectedRow(), 0).toString());
      txtnamagrup.setText(tblgrup.getValueAt(tblgrup.getSelectedRow(), 1).toString());      
    }//GEN-LAST:event_tblgrupMouseClicked
    //==========================================================================
    
    
    //INPUT DATA KE DALAM DATABASE
    private void btninputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputActionPerformed
         try{
            sql = "SELECT * FROM tblgrup WHERE nama_grup='"+txtnamagrup.getText()+"'";
            Statement statement = (Statement) conek.GetConnection().createStatement();
            rs = statement.executeQuery(sql);
            if(rs.next()){
                if(txtnamagrup.getText().equals(rs.getString("nama_grup")) ){
                    JOptionPane.showMessageDialog(rootPane, "DATA ADA YANG SAMA!");
                    kosongkan();
                }
            }else{
                    statement.executeUpdate("insert into tblgrup VALUES ('" + txtkodegrup.getText() + "','" + txtnamagrup.getText() + "');");
                    statement.close();
                    JOptionPane.showMessageDialog(rootPane, "DATA BERHASIL DISIMPAN");
                    kosongkan();
                }
            
            /*
            Statement statement = (Statement) conek.GetConnection().createStatement();
            statement.executeUpdate("insert into tblgroup VALUES ('" + txtkodegrup.getText() + "','" + txtnamagrup.getText() + "');");
            statement.close();
            JOptionPane.showMessageDialog(rootPane, "DATA BERHASIL DISIMPAN");
            kosongkan();
            */
        }catch (Exception t){
            JOptionPane.showMessageDialog(rootPane, "DATA GAGAL DISIMPAN");
        }
         datatable();
    }//GEN-LAST:event_btninputActionPerformed
    //==========================================================================
    
    
    //BUTTON HAPUS
    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        try {
        Statement statement = (Statement) conek.GetConnection().createStatement();
        statement.executeUpdate("DELETE from tblgrup where kode_grup=('" + txtkodegrup.getText() + "');");
        statement.executeUpdate("DELETE from tblpegawai where grup=('" + txtnamagrup.getText() + "');");
        statement.executeUpdate("DELETE from tblaktivitas where nama_grup=('" + txtnamagrup.getText() + "');");
        
         JOptionPane.showMessageDialog(rootPane, "DATA BERHASIL TERHAPUS");
        kosongkan();
        }catch (Exception t ) {
            JOptionPane.showMessageDialog(rootPane, "GAGAL TERHAPUS");
        }
        
        datatable();
    }//GEN-LAST:event_btnhapusActionPerformed
    //==========================================================================
    
    
    //KOSONGKAN FIELD
    private void kosongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kosongActionPerformed
        autonumbergroup();
        txtnamagrup.setText("");
    }//GEN-LAST:event_kosongActionPerformed
    //==========================================================================

    
    //MENGATUR FIELD KODE, MENJADI AUTO NUMBER
    private void autonumbergroup(){
        try {
            sql="select * from tblgrup order by kode_grup desc";
            Statement statement = (Statement) conek.GetConnection().createStatement();
            rs=statement.executeQuery(sql);
            if (rs.next()) {
                String kode = rs.getString("kode_grup").substring(1);
                String AN = "" + (Integer.parseInt(kode) + 1);
                String Nol = "";

                if(AN.length()==1)
                {Nol = "0";}
                else if(AN.length()==2)
                {Nol = "";}

               txtkodegrup.setText("G" + Nol + AN);
            } else {
               txtkodegrup.setText("G01");
            }

           }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           }
        //datacombo();
    }
    //==========================================================================
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btninput;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kosong;
    private javax.swing.JTable tblgrup;
    private javax.swing.JTextField txtkodegrup;
    private javax.swing.JTextField txtnamagrup;
    // End of variables declaration//GEN-END:variables
}
