package aplikasimonitoring;

//KOMPONEN
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
//==============================================================================


//LOKASI FUNCTION DAN VARIABLE PUBLIC DI TENTUKAN
public class menuutama extends javax.swing.JFrame {
int timedate = 0;
int i = 0;
String siangmalam;
    public menuutama() {
        initComponents();
        //*
        waktu();
        //*/
       this.setLocationRelativeTo(null);    
       //this.setTitle("===== MENU UTAMA =====");
       //btndata.enable(false);
    }        
    //==========================================================================
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        panellogin2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panellogin1 = new javax.swing.JPanel();
        iconuser = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        paneltime2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        paneltime1 = new javax.swing.JPanel();
        date1 = new javax.swing.JLabel();
        time2 = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        Close = new javax.swing.JButton();
        btngrup = new javax.swing.JButton();
        btndata = new javax.swing.JButton();
        btncari = new javax.swing.JButton();
        btnactivityawal = new javax.swing.JButton();
        btnaudit = new javax.swing.JButton();
        btnlaporan = new javax.swing.JButton();
        labeljudul1 = new javax.swing.JLabel();
        labeljudul2 = new javax.swing.JLabel();
        iconkrj = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setForeground(new java.awt.Color(255, 51, 102));

        panellogin2.setBackground(new java.awt.Color(255, 255, 255));
        panellogin2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        panellogin2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel1.setText("USER LOGIN");
        panellogin2.add(jLabel1);
        jLabel1.setBounds(40, 10, 124, 19);

        jDesktopPane1.add(panellogin2);
        panellogin2.setBounds(1060, 100, 210, 40);

        panellogin1.setBackground(new java.awt.Color(255, 255, 255));
        panellogin1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        panellogin1.setLayout(null);

        iconuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/user.png"))); // NOI18N
        panellogin1.add(iconuser);
        iconuser.setBounds(80, 30, 100, 100);

        username.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        username.setText("USER");
        panellogin1.add(username);
        username.setBounds(100, 140, 70, 20);

        btnlogout.setBackground(new java.awt.Color(0, 204, 204));
        btnlogout.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        btnlogout.setText("LOGOUT");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        panellogin1.add(btnlogout);
        btnlogout.setBounds(50, 180, 150, 40);

        jDesktopPane1.add(panellogin1);
        panellogin1.setBounds(1040, 120, 250, 240);

        paneltime2.setBackground(new java.awt.Color(255, 255, 255));
        paneltime2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        paneltime2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel6.setText("TIME");
        paneltime2.add(jLabel6);
        jLabel6.setBounds(50, 10, 60, 19);

        jDesktopPane1.add(paneltime2);
        paneltime2.setBounds(1090, 390, 150, 40);

        paneltime1.setBackground(new java.awt.Color(255, 255, 255));
        paneltime1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        paneltime1.setLayout(null);

        date1.setFont(new java.awt.Font("Prestige Elite Std", 1, 24)); // NOI18N
        date1.setText("DATE");
        paneltime1.add(date1);
        date1.setBounds(60, 60, 130, 30);

        time2.setFont(new java.awt.Font("Prestige Elite Std", 1, 24)); // NOI18N
        time2.setText("AMPM");
        paneltime1.add(time2);
        time2.setBounds(160, 30, 60, 30);

        time1.setFont(new java.awt.Font("Prestige Elite Std", 1, 24)); // NOI18N
        time1.setText("TIME");
        paneltime1.add(time1);
        time1.setBounds(50, 30, 130, 30);

        jDesktopPane1.add(paneltime1);
        paneltime1.setBounds(1040, 410, 250, 100);

        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/close.png"))); // NOI18N
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        jDesktopPane1.add(Close);
        Close.setBounds(1270, 10, 40, 40);

        btngrup.setBackground(new java.awt.Color(255, 204, 0));
        btngrup.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btngrup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/group2.png"))); // NOI18N
        btngrup.setText("Team Tenaga Kerja");
        btngrup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrupActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btngrup);
        btngrup.setBounds(20, 200, 237, 85);

        btndata.setBackground(new java.awt.Color(0, 255, 255));
        btndata.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btndata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/pesonal.png"))); // NOI18N
        btndata.setText("Data Tenaga Kerja");
        btndata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndataActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btndata);
        btndata.setBounds(20, 100, 237, 85);

        btncari.setBackground(new java.awt.Color(255, 0, 51));
        btncari.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btncari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/search.png"))); // NOI18N
        btncari.setText("Cari Tenaga Kerja");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btncari);
        btncari.setBounds(20, 300, 237, 85);

        btnactivityawal.setBackground(new java.awt.Color(204, 0, 204));
        btnactivityawal.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnactivityawal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/work.png"))); // NOI18N
        btnactivityawal.setText("Aktivitas");
        btnactivityawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactivityawalActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnactivityawal);
        btnactivityawal.setBounds(20, 400, 237, 85);

        btnaudit.setBackground(new java.awt.Color(255, 255, 0));
        btnaudit.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnaudit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/money.png"))); // NOI18N
        btnaudit.setText("Transaksi");
        btnaudit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnauditActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnaudit);
        btnaudit.setBounds(20, 500, 237, 85);

        btnlaporan.setBackground(new java.awt.Color(0, 0, 0));
        btnlaporan.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnlaporan.setForeground(new java.awt.Color(255, 255, 255));
        btnlaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/report.png"))); // NOI18N
        btnlaporan.setText("LAPORAN");
        btnlaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlaporanActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnlaporan);
        btnlaporan.setBounds(20, 600, 237, 85);

        labeljudul1.setFont(new java.awt.Font("Tw Cen MT", 3, 36)); // NOI18N
        labeljudul1.setText("Aplikasi Monitoring Karyawan");
        jDesktopPane1.add(labeljudul1);
        labeljudul1.setBounds(450, 10, 408, 100);

        labeljudul2.setFont(new java.awt.Font("Tw Cen MT", 3, 48)); // NOI18N
        labeljudul2.setText("PT. KARUNIA RIMBA JAYA");
        jDesktopPane1.add(labeljudul2);
        labeljudul2.setBounds(390, 60, 507, 100);

        iconkrj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/krjicon.png"))); // NOI18N
        jDesktopPane1.add(iconkrj);
        iconkrj.setBounds(460, 190, 390, 388);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/color.jpg"))); // NOI18N
        jDesktopPane1.add(background);
        background.setBounds(0, 0, 1320, 720);

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    //MENMEBUNYIKAN BUTTON KETIKA DI KLIK
    /*public static void buttonnyala(int i){
    //int i = 0;
        if (i == 0){
            btndata.enable(true);
            i = i + 1;
        }else{
            btndata.enable(false);
        }
    }
    */
    //==========================================================================
    
    //BERFUNGSI UNTUK MENAMPILKAN WAKTU DAN TANGGAL PADA TEXT FIELD
    public void waktu(){
        new Thread(){
            public void run(){
                while (timedate == 0){
                    Calendar cal = new GregorianCalendar();
                    int detik = cal.get(Calendar.SECOND);
                    int menit = cal.get(Calendar.MINUTE);
                    int jam   = cal.get(Calendar.HOUR_OF_DAY);
                    int hari  = cal.get(Calendar.DAY_OF_MONTH);
                    int bulan = cal.get(Calendar.MONTH)+1;
                    int tahun = cal.get(Calendar.YEAR);
                    int ampm  = cal.get(Calendar.AM_PM);
                    
                    if (ampm == 1){
                        siangmalam = "PM";
                    }else{
                        siangmalam = "AM";
                    }
                    
                    String tanggal1= jam +":"+ menit +":"+detik;
                    String tanggal2= bulan +"-"+ hari +"-"+tahun;
                    
                    time1.setText(tanggal1);
                    date1.setText(tanggal2);
                    time2.setText(siangmalam);
                    //time2.setText(tanggal3);

                } 
            }
        }.start();
        
    }
    //==========================================================================
    
    
    //MENAMPILKAN FORM DATA PEGAWAI
    private void btndataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndataActionPerformed
      datapegawai datap = new datapegawai();
      jDesktopPane1.add(datap);
      datap.setVisible(true);
    }//GEN-LAST:event_btndataActionPerformed
    //==========================================================================
    
    
    //MENAMPILKAN DATA FORM CARI
    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
      caripegawai carip = new caripegawai();
      jDesktopPane1.add(carip);
      carip.setVisible(true);
    }//GEN-LAST:event_btncariActionPerformed
    //==========================================================================
    
    
    //MENAMPILKAN DATA AKTIVITAS
    private void btnactivityawalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactivityawalActionPerformed
        aktivitaspegawai gajip = new aktivitaspegawai();
        jDesktopPane1.add(gajip);
        gajip.setVisible(true);
    }//GEN-LAST:event_btnactivityawalActionPerformed
    //==========================================================================
    
    
    //MENAMPILKAN DATA GAJI/ TRANSKASI
    private void btnauditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnauditActionPerformed
      transaksipegawai statusp = new transaksipegawai();
      jDesktopPane1.add(statusp);
      statusp.setVisible(true);
    }//GEN-LAST:event_btnauditActionPerformed
    //==========================================================================
    
    
    //MENAMPILKAN DATA LAPORAN
    private void btnlaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlaporanActionPerformed
      laporan laporanp = new laporan();
      jDesktopPane1.add(laporanp);
      laporanp.setVisible(true);
    }//GEN-LAST:event_btnlaporanActionPerformed

    
    //MENAMPILKAN DATA GRUP PEGAWAI
    private void btngrupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrupActionPerformed
      grouppegawai groupp = new grouppegawai();
      jDesktopPane1.add(groupp);
      groupp.setVisible(true);
    }//GEN-LAST:event_btngrupActionPerformed
    //==========================================================================
    
    
    //BERFUNGSI UNTUK LOGOUT/ KEMBALI KE MENU LOGIN
    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
       timedate = 1;
       new login().show();
       this.dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed
    //==========================================================================
    
    
    //BERFUNGSI UNTUK CLOSE PROGRAM
    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
       System.exit(0);
    }//GEN-LAST:event_CloseActionPerformed
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
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new menuutama().setVisible(true);
            }
        });
    }
    //==========================================================================
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnactivityawal;
    private javax.swing.JButton btnaudit;
    private javax.swing.JButton btncari;
    public static javax.swing.JButton btndata;
    private javax.swing.JButton btngrup;
    private javax.swing.JButton btnlaporan;
    private javax.swing.JButton btnlogout;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel iconkrj;
    private javax.swing.JLabel iconuser;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labeljudul1;
    private javax.swing.JLabel labeljudul2;
    private javax.swing.JPanel panellogin1;
    private javax.swing.JPanel panellogin2;
    private javax.swing.JPanel paneltime1;
    private javax.swing.JPanel paneltime2;
    private javax.swing.JLabel time1;
    private javax.swing.JLabel time2;
    public javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
