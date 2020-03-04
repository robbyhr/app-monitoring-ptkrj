
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

//DEKLARASI FUNCTION DAN VARIABLE AWAL
public class laporanaktivitas extends javax.swing.JInternalFrame {
 
    public laporanaktivitas() {
        initComponents();
        datatable();
        jumlahdata();
    }
//==============================================================================
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Close = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaktivitas = new javax.swing.JTable();
        txtdata = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/close.png"))); // NOI18N
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 38, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("LAPORAN AKTIVITAS");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 370, 50));

        tabelaktivitas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaktivitas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 490, 200));

        txtdata.setBackground(new java.awt.Color(255, 255, 255));
        txtdata.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        txtdata.setText("0");
        getContentPane().add(txtdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jLabel2.setText("JUMLAH DATA :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Trajan Pro", 0, 18)); // NOI18N
        jLabel7.setText("Setting Cetak");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, -1));

        jButton3.setBackground(new java.awt.Color(255, 204, 0));
        jButton3.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/print.png"))); // NOI18N
        jButton3.setText("CETAK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 150, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, 220));

        background.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/color.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    //MENAMPILKAN JUMLAH DATA DENGAN KONDISI
    public void jumlahdata(){
        txtdata.setText("");
        try{
        java.sql.Statement statement = (java.sql.Statement)conek.GetConnection().createStatement();
        ResultSet res = statement.executeQuery("select count(compart) from tblaktivitas");
        
        while(res.next()){
            String jumlah = res.getString("count(compart)");            
            txtdata.setText(jumlah);
            //jmlanggota = Integer.valueOf(txtanggota.getText());
        }
        res.last();
        }catch (Exception e){
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
        tabelaktivitas.setModel(tbl);
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
                tabelaktivitas.setModel(tbl);  
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(rootPane,"Salah");
        }
    }
    //==========================================================================
    
        
    //BUTON CLOSE DAN KEMBALI KE MENU LAPORAN
    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        laporan lap = new laporan();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(lap);
        lap.show();
        this.dispose();
        dispose();
    }//GEN-LAST:event_CloseActionPerformed
    //==========================================================================
    
    
    //UNTUK CETAK DENGAN PARAMETER IREPORT
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Connection con = null;

        try {
            String path="src/aplikasimonitoring/laporanaktivitas.jasper";    // letak file report (dalam format jasper)
            Map parameter = new HashMap(1);
            JasperPrint print = JasperFillManager.fillReport(path,parameter,koneksi.getConnection()); //teskoneksi adalah class koneksi ke database
            JasperViewer.viewReport(print, false);

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
    }//GEN-LAST:event_jButton3ActionPerformed
    //==========================================================================

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaktivitas;
    private javax.swing.JLabel txtdata;
    // End of variables declaration//GEN-END:variables
}
