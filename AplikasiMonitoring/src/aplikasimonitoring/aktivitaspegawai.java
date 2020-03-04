
package aplikasimonitoring;

//KOMPONEN 
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import koneksi.conek;
import koneksi.koneksi;
import javax.swing.table.DefaultTableModel;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.view.JasperViewer;
public class aktivitaspegawai extends javax.swing.JInternalFrame {
//==============================================================================


    //==========================================================================
    public aktivitaspegawai() {
        initComponents(); 
        comboboxgrup();
        comboboxactivity();
        datatable();
        tampilharga();
    }
    //==========================================================================
    
    
    //MENAMPILKAN SUPPLIER KE COMBO BOX
    public void comboboxgrup()
    {
    txtgrup.removeAllItems();
        try{
        java.sql.Statement statement = (java.sql.Statement)conek.GetConnection().createStatement();
        ResultSet res = statement.executeQuery("select * from tblgrup");
        
        while(res.next()){
            String name = res.getString("nama_grup");
            txtgrup.addItem(name);
        }
        res.close();
        }catch (Exception e){
        }  
    }
    //==========================================================================
    
    
    //MENAMPILKAN SUPPLIER KE COMBO BOX
    public void comboboxactivity()
    {
    txtschedule.removeAllItems();
       try{
       Statement statement = (Statement)conek.GetConnection().createStatement();
       ResultSet res = statement.executeQuery("select * from tblactivity");
        
        //String query = "select * from tblactivity where name=?";
        //PreparedStatement pst=conek.prepareStatement(query);
        //pst.setString(1, (String)txtschedule.getSelectedItem());
        //ResultSet res =pst.executeQuery();
     
        while(res.next()){
        String name = res.getString("nama_activity");
        txtschedule.addItem(name);
        
            //if (txtschedule.getSelectedItem().equals(name)){
            //  String price = res.getString("harga_activity");
            //                txtharga.setText(price);
                            
            //}
            //String price = res.getString("harga_activity");
            //txtharga.setText(price);
            
        }
        res.close();
        }catch (Exception e){
        }
    }
    //==========================================================================
    
    
    //MENAMPILKAN DATA HARGA YANG DI YG DI AMBIL DARI DATABASE LEWAT COMBOBOX GRUP
    public void tampilharga(){
    txtharga.setText("");    
       try{
       Statement statement = (Statement)conek.GetConnection().createStatement();
       ResultSet res = statement.executeQuery("select harga_activity from tblactivity where nama_activity='"+txtschedule.getSelectedItem()+"'");
        
     
        while(res.next()){
            String price = res.getString("harga_activity");
            txtharga.setText(price);
           
        }
        res.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    //==========================================================================
    
     
    //INI UNTUK MENYAMBUNGKAN TABLE DATABASE KE DALAM TABLE DI NETBIN
    public void datatable(){
        DefaultTableModel tbl= new DefaultTableModel();
        tbl.addColumn("Tanggal");
        tbl.addColumn("Group");
        tbl.addColumn("Activity");
        tbl.addColumn("Compart");
        tbl.addColumn("Status");
        tbl.addColumn("HA");
        tbl.addColumn("Harga");
        tabelactivity.setModel(tbl);
        try{
            java.sql.Statement statement=(java.sql.Statement)conek.GetConnection().createStatement();
            ResultSet res=statement.executeQuery("select * from tblaktivitas");
            while(res.next())
            {
                tbl.addRow(new Object[]{
                   res.getString("tanggal"),
                   res.getString("nama_grup"),
                   res.getString("pekerjaan"),
                   res.getString("compart"),
                   res.getString("status"),
                   res.getInt("ha"),
                   res.getInt("harga")
                });
                tabelactivity.setModel(tbl);  
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(rootPane,"Salah");
        }
    }
    //==========================================================================
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        txtgrup = new javax.swing.JComboBox<>();
        txtcompart = new javax.swing.JTextField();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        buttoninput = new javax.swing.JButton();
        icon = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtschedule = new javax.swing.JComboBox<>();
        txtha = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelactivity = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        kosong = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txttanggal = new com.toedter.calendar.JDateChooser();
        background = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtgrup.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        getContentPane().add(txtgrup, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 200, 30));

        txtcompart.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        txtcompart.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(txtcompart, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 210, 30));

        btnedit.setBackground(new java.awt.Color(255, 204, 0));
        btnedit.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/edit.png"))); // NOI18N
        btnedit.setText("EDIT");
        btnedit.setSelected(true);
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        getContentPane().add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, 55));

        btnhapus.setBackground(new java.awt.Color(255, 204, 0));
        btnhapus.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/delete.png"))); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.setSelected(true);
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, 55));

        buttoninput.setBackground(new java.awt.Color(255, 204, 0));
        buttoninput.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        buttoninput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/schedule.png"))); // NOI18N
        buttoninput.setText("INPUT");
        buttoninput.setSelected(true);
        buttoninput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoninputActionPerformed(evt);
            }
        });
        getContentPane().add(buttoninput, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, 55));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/editicon.png"))); // NOI18N
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        jLabel15.setFont(new java.awt.Font("Trajan Pro", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("MENU");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel12.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel12.setText("Harga");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, -1, -1));

        txtschedule.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        txtschedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtscheduleActionPerformed(evt);
            }
        });
        getContentPane().add(txtschedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 200, 30));

        txtha.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        getContentPane().add(txtha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 210, 30));

        txtharga.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        txtharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaActionPerformed(evt);
            }
        });
        getContentPane().add(txtharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 210, 30));

        tabelactivity.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelactivity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelactivityMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelactivity);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 770, 180));

        jLabel8.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel8.setText("Compart");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, -1, -1));

        jLabel9.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel9.setText("Group");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        jLabel11.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel11.setText("Tanggal");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        jLabel13.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel13.setText("Activity");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        jLabel14.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel14.setText("Ha");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, -1));

        kosong.setBackground(new java.awt.Color(255, 204, 0));
        kosong.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        kosong.setForeground(new java.awt.Color(255, 255, 255));
        kosong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/clear.png"))); // NOI18N
        kosong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kosongActionPerformed(evt);
            }
        });
        getContentPane().add(kosong, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 60, 55));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/close.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 38, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("AKTIVITAS");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 250, 50));

        txttanggal.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        getContentPane().add(txttanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 200, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/color.jpg"))); // NOI18N
        background.setText("z\n");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //TOMBOL KELUAR
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
    //==========================================================================
    
    
    //MENGINPUTKAN DATA KE DALAM DATABASE
    private void buttoninputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoninputActionPerformed
        int total,harga1,ha1;
        String ha= txtha.getText();
        String formattanggal ="yyyy-MM-dd" ; 
        SimpleDateFormat ft = new SimpleDateFormat(formattanggal); //ft = FORMAT TANGGAL
        String tanggal = String.valueOf(ft.format(txttanggal.getDate()));
        String compart = txtcompart.getText();
        String harga = txtharga.getText();
        String status = "Proses";
        String grup       = (String) txtgrup.getSelectedItem();
        String aktivitas  = (String) txtschedule.getSelectedItem();
        
        harga1 = Integer.valueOf(txtharga.getText());
        ha1 = Integer.valueOf(txtha.getText());
        total = harga1 * ha1;  
        //jTextField1.setText(Integer.toString(total));
        
        
        try{
            Statement statement = (Statement) conek.GetConnection().createStatement();
            statement.executeUpdate("insert into tblaktivitas VALUES ('" + tanggal + "','" + grup + "','" + aktivitas + "','" + compart +"','" + status +"','" + ha + "','" + harga +"','" + total +"');");
            statement.close();
            JOptionPane.showMessageDialog(rootPane, "DATA ERHASIL DISIMPAN");
        }catch (Exception t){
            JOptionPane.showMessageDialog(rootPane, "DATA GAGAL DISIMPAN");
        }
        datatable();
    }//GEN-LAST:event_buttoninputActionPerformed
    //==========================================================================
    
    
   //==========================================================================
    
    
    //MENGHAPUS DATA DIDALAM DATABASE
    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
               try {
        Statement statement = (Statement) conek.GetConnection().createStatement();
        statement.executeUpdate("DELETE from tblaktivitas where compart=('" + txtcompart.getText() + "');");
        JOptionPane.showMessageDialog(rootPane, "AKTIVITAS BERHASIL TERHAPUS");

        }catch (Exception t ) {
            JOptionPane.showMessageDialog(rootPane, "GAGAL TERHAPUS");
        }
        datatable();
    }//GEN-LAST:event_btnhapusActionPerformed
    //==========================================================================
    //
    public void hapusdatakaryawan(){
        
    }
    
    //MENAMPILKAN DATA TABLE KE FIELD KETIKA DIKLIK (EVENT BUTTON CLICK)
    private void tabelactivityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelactivityMouseClicked
        try {
            DefaultTableModel tabel= (DefaultTableModel)tabelactivity.getModel();
            String formattanggal ="yyyy-MM-dd" ;
            Date tanggal = new SimpleDateFormat(formattanggal).parse((String)tabel.getValueAt(tabelactivity.getSelectedRow(), 0)); //ft = FORMAT TANGGAL
            txttanggal.setDate(tanggal);
            txtgrup.setSelectedItem(tabelactivity.getValueAt(tabelactivity.getSelectedRow(),1).toString());
            txtschedule.setSelectedItem(tabelactivity.getValueAt(tabelactivity.getSelectedRow(),2).toString());
            txtcompart.setText(tabelactivity.getValueAt(tabelactivity.getSelectedRow(),3).toString());
            txtha.setText(tabelactivity.getValueAt(tabelactivity.getSelectedRow(),5).toString());
            txtharga.setText(tabelactivity.getValueAt(tabelactivity.getSelectedRow(),6).toString());
        } catch (ParseException ex) {
            Logger.getLogger(aktivitaspegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabelactivityMouseClicked
    //==========================================================================
    
    
    //==========================================================================
    private void txthargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaActionPerformed

    }//GEN-LAST:event_txthargaActionPerformed
    //==========================================================================
    
    
    //MENAMPILKAN DATA TAMPIL KETIKA DI ACTION/KLIK (EVENT ACTION)
    private void txtscheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtscheduleActionPerformed
      tampilharga();
    }//GEN-LAST:event_txtscheduleActionPerformed
    //==========================================================================
    
    
    //KOSONGKAN
    private void kosongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kosongActionPerformed
       txtha.setText("");
       txttanggal.setDate(null);
       txtcompart.setText("");
       comboboxactivity();
       comboboxgrup();
       tampilharga();
    }//GEN-LAST:event_kosongActionPerformed
    //==========================================================================
    
    
    //EDIT DATA AKTIVITAS
    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        int total,harga1,ha1;
        String ha= txtha.getText();
        String formattanggal ="yyyy-MM-dd" ; 
        SimpleDateFormat ft = new SimpleDateFormat(formattanggal); //ft = FORMAT TANGGAL
        String tanggal = String.valueOf(ft.format(txttanggal.getDate()));
        //String tanggal = String.valueOf(txttanggal.getDate());
        //String tanggal = txttanggal.getText();
        String compart = txtcompart.getText();
        String harga = txtharga.getText();
        String status = "Proses";
        String grup       = (String) txtgrup.getSelectedItem();
        String aktivitas  = (String) txtschedule.getSelectedItem();
        
        harga1 = Integer.valueOf(txtharga.getText());
        ha1 = Integer.valueOf(txtha.getText());
        total = harga1 * ha1;  
        //jTextField1.setText(Integer.toString(total));
        
        
        try{
            Statement statement = (Statement) conek.GetConnection().createStatement();
            statement.executeUpdate("UPDATE tblaktivitas SET tanggal='" + tanggal + "',nama_grup='" + txtgrup.getSelectedItem() + "',pekerjaan='" + txtschedule.getSelectedItem() + "',status='" + status +"',ha='"+ txtha.getText() +"',harga='"+ txtharga.getText() +"',total='"+ total +"' WHERE compart='" + txtcompart.getText() +"'");
            statement.close();
            JOptionPane.showMessageDialog(rootPane, "DATA BERHASIL DISIMPAN");
        }catch (Exception t){
            JOptionPane.showMessageDialog(rootPane, "DATA GAGAL DISIMPAN");
        }
        datatable();
    }//GEN-LAST:event_btneditActionPerformed
    //==========================================================================
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton buttoninput;
    private javax.swing.JLabel icon;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kosong;
    private javax.swing.JTable tabelactivity;
    private javax.swing.JTextField txtcompart;
    private javax.swing.JComboBox<String> txtgrup;
    private javax.swing.JTextField txtha;
    private javax.swing.JTextField txtharga;
    private javax.swing.JComboBox<String> txtschedule;
    private com.toedter.calendar.JDateChooser txttanggal;
    // End of variables declaration//GEN-END:variables
}
