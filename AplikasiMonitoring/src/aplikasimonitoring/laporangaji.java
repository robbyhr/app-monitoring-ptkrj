
package aplikasimonitoring;


//KOMPONEN
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.conek;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
//==============================================================================


//DEKLARASI VARIABLE DAN FUNCTION AWAL DISINI
public class laporangaji extends javax.swing.JInternalFrame {
    public laporangaji() {
        initComponents();
        tabelpembayaran();
        tampilgrup();
        jumlahdata();
    }
//==============================================================================
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeltransaksi = new javax.swing.JTable();
        Close = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtdata = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txttglakhir = new com.toedter.calendar.JDateChooser();
        txttglawal = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtgrup = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("LAPORAN TRANSAKSI");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 390, 50));

        tabeltransaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabeltransaksi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 570, 310));

        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/close.png"))); // NOI18N
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 38, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jLabel2.setText("JUMLAH DATA :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, -1, -1));

        txtdata.setBackground(new java.awt.Color(255, 255, 255));
        txtdata.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        txtdata.setText("0");
        getContentPane().add(txtdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txttglakhir.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jPanel1.add(txttglakhir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 150, 30));

        txttglawal.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jPanel1.add(txttglawal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 150, 30));

        jLabel4.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel4.setText("Tanggal Akhir");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel5.setText("Tanggal Awal");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Trajan Pro", 0, 18)); // NOI18N
        jLabel6.setText("Setting Cetak");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, -1));

        txtgrup.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        txtgrup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgrupActionPerformed(evt);
            }
        });
        jPanel1.add(txtgrup, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 150, 30));

        jLabel3.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel3.setText("Grup");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/print.png"))); // NOI18N
        jButton1.setText("CETAK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 150, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, 330));

        background.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/color.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    //MENAMPILKAN DATA DARI DATABASE KE COMBOBOX
    public void tampilgrup(){
    txtgrup.removeAllItems();
        try{
        txtgrup.addItem("NULL");
        java.sql.Statement statement = (java.sql.Statement)conek.GetConnection().createStatement();
        ResultSet res = statement.executeQuery("SELECT DISTINCT nama_grup FROM tblpembayaran");
        
        while(res.next()){
            String name = res.getString("nama_grup");
            txtgrup.addItem(name);
        }
        res.last();
        }catch (Exception e){
        }
        
    } 
    //==========================================================================
    

    //MENAMPILKAN JUMLAH DATA DENGAN KONDISI
        public void jumlahdata(){
        txtdata.setText("");
        try{
        java.sql.Statement statement = (java.sql.Statement)conek.GetConnection().createStatement();
        ResultSet res = statement.executeQuery("select count(kode_pembayaran) from tblpembayaran");
        
        while(res.next()){
            String jumlah = res.getString("count(kode_pembayaran)");            
            txtdata.setText(jumlah);
            //jmlanggota = Integer.valueOf(txtanggota.getText());
        }
        res.last();
        }catch (Exception e){
        }         
    }
    //==========================================================================
    
        
    //MENAMPILKAN DATA TABLE PEMBAYARAN
    public void tabelpembayaran(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Kode");
        tbl.addColumn("Status");
        tbl.addColumn("Grup");
        tbl.addColumn("Aktivitas");
        tbl.addColumn("Status");
        tbl.addColumn("Jumlah Anggota");
        tbl.addColumn("HA");
        tbl.addColumn("Gaji PerHA");
        tbl.addColumn("Gaji Anggota");
        tbl.addColumn("Total");
        tabeltransaksi.setModel(tbl);
        try{
            java.sql.Statement statement=(java.sql.Statement)conek.GetConnection().createStatement();
            ResultSet res=statement.executeQuery("select * from tblpembayaran");
            while(res.next())
            {
                tbl.addRow(new Object[]{
                   res.getString("kode_pembayaran"),
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
                tabeltransaksi.setModel(tbl);  
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(rootPane,"Salah");
        }
            
    }
    //==========================================================================
    
    
    //BTN CETAK DENGAN PARAMETER IREPORT/JASPER
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection con = null;

        try {
            if (txtgrup.equals("NULL")){
                JOptionPane.showMessageDialog(rootPane, "ADA DATA YANG BELUM DIISI");
            }else{
                String path="src/aplikasimonitoring/laporanpembayaran.jasper";    // letak file report (dalam format jasper)
                Map parameter = new HashMap(3);
                parameter.put("pgrup",txtgrup.getSelectedItem());
                parameter.put("ptglawal", txttglawal.getDate());
                parameter.put("ptglakhir", txttglakhir.getDate());
                
                JasperPrint print = JasperFillManager.fillReport(path,parameter,koneksi.getConnection()); //teskoneksi adalah class koneksi ke database
                JasperViewer.viewReport(print, false);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane,"Dokumen Tidak Ada"+ex);
        }
        
        /*
        try {
            JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream("laporanpembayaran.jasper"), null, koneksi.getConnection());
            JasperViewer.viewReport(jp, false);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        */
    }//GEN-LAST:event_jButton1ActionPerformed
    //==========================================================================
    
    
    //BTN CLOSE DAN KEMBALI KE MENU LAPORAN
    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        laporan lap = new laporan();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(lap);
        lap.show();
        this.dispose();
        dispose();
    }//GEN-LAST:event_CloseActionPerformed
    //==========================================================================
    
    
    //
    private void txtgrupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgrupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgrupActionPerformed
    //==========================================================================

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabeltransaksi;
    private javax.swing.JLabel txtdata;
    private javax.swing.JComboBox<String> txtgrup;
    private com.toedter.calendar.JDateChooser txttglakhir;
    private com.toedter.calendar.JDateChooser txttglawal;
    // End of variables declaration//GEN-END:variables
}
