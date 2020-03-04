
package aplikasimonitoring;

//KOMPONEN 
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import koneksi.conek;
import javax.swing.table.DefaultTableModel;
//==============================================================================


//FUNCTION DAN VARIABLE AWAL DI DEKLARASIKAN
public class transaksipegawai extends javax.swing.JInternalFrame {
    //VARIABLE DISINI !!!!!
    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    String sql,kodepembayaran;
    int jmlha,jmlanggota,jmltotal,jmlharga,hasil;

    public transaksipegawai() {
        //FUNCTION DISINI !!!
        initComponents();
        autonumber();
        tabelaktivitas();
        tabelpembayaran();
        tampilgrup();
        tampilcompart();
        tampilharga();
        jumlahanggota();
        jumlahgajianggota();
        txtkode.setVisible(false);
    }
    //==========================================================================

    //DONT EDIT THIS
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblaktivitas = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblpembayaran = new javax.swing.JTable();
        Close = new javax.swing.JButton();
        txtaktivitas = new javax.swing.JTextField();
        txtanggota = new javax.swing.JTextField();
        txtha = new javax.swing.JTextField();
        txtgajianggota = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcompart = new javax.swing.JComboBox<>();
        txtgrup = new javax.swing.JComboBox<>();
        txtharga = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtaudit = new com.toedter.calendar.JDateChooser();
        txttanggal = new com.toedter.calendar.JDateChooser();
        btnbayar = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PEMBAYARAN");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 400, 50));

        tblaktivitas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblaktivitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblaktivitasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblaktivitas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 460, 190));

        tblpembayaran.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblpembayaran);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 890, 180));

        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/close.png"))); // NOI18N
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 38, -1));

        txtaktivitas.setEditable(false);
        txtaktivitas.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        getContentPane().add(txtaktivitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 230, 30));

        txtanggota.setEditable(false);
        txtanggota.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        getContentPane().add(txtanggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 230, 30));

        txtha.setEditable(false);
        txtha.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        getContentPane().add(txtha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 230, 30));

        txtgajianggota.setEditable(false);
        txtgajianggota.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        getContentPane().add(txtgajianggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 200, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel7.setText("Gaji PerAnggota");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel6.setText("HA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel5.setText("Anggota");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel4.setText("Aktivitas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RP.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel2.setText("Grup");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("RP.");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel9.setText("Harga");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel3.setText("Compart");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel12.setText("Tanggal Audit");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel8.setText("Tanggal Pembayaran");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        txtcompart.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        txtcompart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcompartActionPerformed(evt);
            }
        });
        getContentPane().add(txtcompart, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 230, 30));

        txtgrup.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        txtgrup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgrupActionPerformed(evt);
            }
        });
        getContentPane().add(txtgrup, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 230, 30));

        txtharga.setEditable(false);
        txtharga.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        getContentPane().add(txtharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 200, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daftar Aktivitas Karyawan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trajan Pro", 0, 14))); // NOI18N
        jPanel1.setOpaque(false);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 480, 220));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daftar Pembayaran Karyawan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trajan Pro", 0, 14))); // NOI18N
        jPanel2.setOpaque(false);
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 910, 210));

        txtaudit.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        getContentPane().add(txtaudit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 230, 30));

        txttanggal.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        getContentPane().add(txttanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 230, 30));

        btnbayar.setBackground(new java.awt.Color(255, 204, 0));
        btnbayar.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        btnbayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/Money2.png"))); // NOI18N
        btnbayar.setText("Bayar Gaji Pegawai");
        btnbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbayarActionPerformed(evt);
            }
        });
        getContentPane().add(btnbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 240, 60));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/color.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 690));

        txtkode.setEditable(false);
        getContentPane().add(txtkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //==============================================================================
    
    
    //MENAMPILKAN DATA DARI DATABASE KE COMBOBOX
    public void tampilgrup(){
    txtgrup.removeAllItems();
        try{
        java.sql.Statement statement = (java.sql.Statement)conek.GetConnection().createStatement();
        ResultSet res = statement.executeQuery("SELECT DISTINCT nama_grup FROM tblaktivitas");
        
        while(res.next()){
            String name = res.getString("nama_grup");
            txtgrup.addItem(name);
        }
        res.last();
        }catch (Exception e){
        }
        
    }
    //==========================================================================
    
    
    //MENAMPILKAN DATA DARI DATABASE KE COMBOBOX
    public void tampilcompart(){
    txtcompart.removeAllItems();
        try{
        java.sql.Statement statement = (java.sql.Statement)conek.GetConnection().createStatement();
        ResultSet res = statement.executeQuery("select * from tblaktivitas where nama_grup='"+txtgrup.getSelectedItem()+"'");
        
        while(res.next()){
            String lokasi = res.getString("compart");            
            txtcompart.addItem(lokasi);
            
        }
        res.last();
        }catch (Exception e){
        }        
       jmlha = Integer.valueOf(txtha.getText()); 
    }
    //==========================================================================
    
    
    //MENAMPILKAN DATA GAJI DI TEXTFIELD KETIKA COMBOBOX DI SELECTED
    public void tampilharga(){
       try{
       Statement statement = (Statement)conek.GetConnection().createStatement();
       ResultSet res = statement.executeQuery("select * from tblaktivitas where compart='"+ txtcompart.getSelectedItem() +"' AND nama_grup= '"+txtgrup.getSelectedItem()+"'");  
     
        while(res.next()){
            String price = res.getString("harga");
            String aktivitas = res.getString("pekerjaan");
            String hektar = res.getString("ha");
            txtharga.setText(price);
            txtaktivitas.setText(aktivitas);                        
            txtha.setText(hektar);
        }
        res.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
       jmlharga = Integer.valueOf(txtharga.getText());
       jmlha = Integer.valueOf(txtha.getText());
    }
    //==========================================================================
    
    
    //MENAMPILKAN JUMLAH DATA DENGAN KONDISI
        public void jumlahanggota(){
        try{
        java.sql.Statement statement = (java.sql.Statement)conek.GetConnection().createStatement();
        ResultSet res = statement.executeQuery("select count(nama) from tblpegawai where grup='"+txtgrup.getSelectedItem()+"'");
        
        while(res.next()){
            String jumlah = res.getString("count(nama)");            
            txtanggota.setText(jumlah);
            //jmlanggota = Integer.valueOf(txtanggota.getText());
        }
        res.last();
        }catch (Exception e){
        }         
    }
    //==========================================================================
    
        
    //MENGATUR FIELD KODE, MENJADI AUTO NUMBER
    private void autonumber(){
        //txtkode.setVisible(false);
        txtkode.setText("");

        try{
        sql = "select * from tblpembayaran order by kode_pembayaran desc";
        Statement st = (Statement) conek.getConnection().createStatement();
        rs = st.executeQuery(sql);
                if (rs.next()) {
                String kode = rs.getString("kode_pembayaran").substring(1);
                String AN = "" + (Integer.parseInt(kode) + 1);
                String Nol = "";

                if(AN.length()==1)
                {Nol = "00";}
                else if(AN.length()==2)
                {Nol = "0";}
                else if(AN.length()==3)
                {Nol = "";}

               txtkode.setText("B" + Nol + AN);
            } else {
               txtkode.setText("B001");
               //kodepembayaran = "B" + Nol + AN;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"DATABASE BELUM NYALA!");
        }
    }
    //==========================================================================
        
        
    //MENAMPILKAN JUMLAH DATA DENGAN KONDISI
        public void jumlahgajianggota(){
            
            jmlha = Integer.valueOf(txtha.getText());
            jmlharga = Integer.valueOf(txtharga.getText());
            jmlanggota = Integer.valueOf(txtanggota.getText());
            
            if (jmlanggota == 0){
                txtgajianggota.setText("0");
            }else{
                jmltotal = jmlharga * jmlha;
                hasil = jmltotal / jmlanggota;
                txtgajianggota.setText(Integer.toString(hasil));  
            }

            
    }
    //==========================================================================    
    
        
    //MENAMPILKAN DATA TABLE AKTIVITAS
    public void tabelaktivitas() {
      DefaultTableModel tbl= new DefaultTableModel();
        tbl.addColumn("Group");
        tbl.addColumn("Compart");
        tbl.addColumn("Activity");
        tbl.addColumn("HA");
        tbl.addColumn("Harga");
        tbl.addColumn("Total");
        tblaktivitas.setModel(tbl);
        try{
            java.sql.Statement statement=(java.sql.Statement)conek.GetConnection().createStatement();
            ResultSet res=statement.executeQuery("select * from tblaktivitas");
            while(res.next())
            {
                tbl.addRow(new Object[]{
                   res.getString("nama_grup"),
                   res.getString("compart"),
                   res.getString("pekerjaan"),
                   res.getInt("ha"),
                   res.getInt("harga"),
                   res.getInt("total")
                });
                tblaktivitas.setModel(tbl);  
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(rootPane,"Salah");
        }
    }
    //==========================================================================
    
    
    //MENAMPILKAN DATA TABLE PEMBAYARAN
    public void tabelpembayaran(){
        DefaultTableModel tbl = new DefaultTableModel();
        //tbl.addColumn("Kode");
        tbl.addColumn("TGL Audit");
        tbl.addColumn("TGL Pembayaran");
        tbl.addColumn("Status");
        tbl.addColumn("Grup");
        tbl.addColumn("Aktivitas");
        tbl.addColumn("JML Anggota");
        tbl.addColumn("HA");
        tbl.addColumn("Gaji PerHA");
        tbl.addColumn("Gaji Anggota");
        tbl.addColumn("Total");
        tblpembayaran.setModel(tbl);
        try{
            java.sql.Statement statement=(java.sql.Statement)conek.GetConnection().createStatement();
            ResultSet res=statement.executeQuery("select * from tblpembayaran");
            while(res.next())
            {
                tbl.addRow(new Object[]{
                   res.getString("tanggal_audit"),
                   res.getString("tanggal_pembayaran"),                    
                   res.getString("status_pembayaran"),
                   res.getString("nama_grup"),
                   res.getString("nama_aktivitas"),
                   res.getInt("jumlah_anggota"),
                   res.getInt("ha"),
                   res.getInt("harga"),
                   res.getInt("gaji_peranggota"),
                   res.getInt("total")
                });
                tblpembayaran.setModel(tbl);  
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(rootPane,"Salah");
        }
            
    }
    //==========================================================================
    
        
    //CLOSE FORM
    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        dispose();
    }//GEN-LAST:event_CloseActionPerformed
    //==========================================================================
    
    
    //MENGINPUTKAN DATA KEDALAM DATABASE
    private void btnbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbayarActionPerformed
        String status = "Selesai";
        String formattanggal ="yyyy-MM-dd" ; 
        SimpleDateFormat ft = new SimpleDateFormat(formattanggal); //ft = FORMAT TANGGAL
        String tglbayar = String.valueOf(ft.format(txttanggal.getDate()));
        String tglaudit = String.valueOf(ft.format(txtaudit.getDate()));
        try{
            if (tglaudit.equals("") || tglbayar.equals("")){
                JOptionPane.showMessageDialog(rootPane, "ADA DATA YANG BELUM DI ISI");
            }else{          
                Statement statement = (Statement) conek.GetConnection().createStatement();
                statement.executeUpdate("insert into tblpembayaran VALUES ('" + txtkode.getText() + "','" + tglaudit + "','" + tglbayar + "','" + status + "','" + txtgrup.getSelectedItem() +"','" + txtaktivitas.getText() +"','" + txtcompart.getSelectedItem() + "','" + txtanggota.getText() +"','" + txtha.getText() +"','" + txtharga.getText() +"','" + jmltotal +"','" +  txtgajianggota.getText() +"');");
                statement.executeUpdate("DELETE from tblaktivitas where compart=('" + txtcompart.getSelectedItem() + "');");
                statement.close();
                JOptionPane.showMessageDialog(rootPane, "PEMBAYARAN BERHASIL DISIMPAN"); 
                txttanggal.setDateFormatString("");
                txtaudit.setDateFormatString("");
            }
        }catch (Exception t){
            JOptionPane.showMessageDialog(rootPane, "PEMBAYARAN GAGAL DISIMPAN");
        } 
        autonumber();
        tabelpembayaran();
        tabelaktivitas();
        tampilgrup();
    }//GEN-LAST:event_btnbayarActionPerformed
    //==========================================================================
    
    
    //AKSI PERFORMA
    private void txtgrupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgrupActionPerformed
        tampilcompart();
        tampilharga();
        jumlahanggota();
        jumlahgajianggota();
    }//GEN-LAST:event_txtgrupActionPerformed
    //========================================================================== 
   
    
    //AKSI PERFOMA
    private void txtcompartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcompartActionPerformed
        tampilharga();
        jumlahanggota();
        jumlahgajianggota();
    }//GEN-LAST:event_txtcompartActionPerformed
    //==========================================================================
    
    
    //EVENT KETIKA MENGKLIK MOUSE
    private void tblaktivitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblaktivitasMouseClicked
     //txttanggal.setText(tblaktivitas.getValueAt(tblaktivitas.getSelectedRow(),0).toString());
    txtgrup.setSelectedItem(tblaktivitas.getValueAt(tblaktivitas.getSelectedRow(),0).toString());
    txtcompart.setSelectedItem(tblaktivitas.getValueAt(tblaktivitas.getSelectedRow(),1).toString());
    txtaktivitas.setText(tblaktivitas.getValueAt(tblaktivitas.getSelectedRow(),2).toString());
    txtha.setText(tblaktivitas.getValueAt(tblaktivitas.getSelectedRow(),3).toString());
    txtharga.setText(tblaktivitas.getValueAt(tblaktivitas.getSelectedRow(),4).toString());
    }//GEN-LAST:event_tblaktivitasMouseClicked
    //==========================================================================


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnbayar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblaktivitas;
    private javax.swing.JTable tblpembayaran;
    private javax.swing.JTextField txtaktivitas;
    private javax.swing.JTextField txtanggota;
    private com.toedter.calendar.JDateChooser txtaudit;
    private javax.swing.JComboBox<String> txtcompart;
    private javax.swing.JTextField txtgajianggota;
    private javax.swing.JComboBox<String> txtgrup;
    private javax.swing.JTextField txtha;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtkode;
    private com.toedter.calendar.JDateChooser txttanggal;
    // End of variables declaration//GEN-END:variables
}
