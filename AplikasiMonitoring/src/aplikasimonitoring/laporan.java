
package aplikasimonitoring;

//KOMPONEN
import javax.swing.JDesktopPane;
//==========================================================================

    //FUNCTION DAN VARIABLE AWAL DI DEKLARASIKAN
    public class laporan extends javax.swing.JInternalFrame {
    //VARIABLE DISINI !!!!!
    public laporan() {
        initComponents();
        //FUNCTION DISINI !!!!
    }
    //==========================================================================
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        Close = new javax.swing.JButton();
        btnlaporan = new javax.swing.JButton();
        btnlaporan1 = new javax.swing.JButton();
        btnlaporan2 = new javax.swing.JButton();
        btnlaporan3 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("LAPORAN");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 230, 50));

        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/close.png"))); // NOI18N
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 38, -1));

        btnlaporan.setBackground(new java.awt.Color(255, 204, 0));
        btnlaporan.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        btnlaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/report.png"))); // NOI18N
        btnlaporan.setText("LAPORAN DATA TENAGA KERJA");
        btnlaporan.setSelected(true);
        btnlaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlaporanActionPerformed(evt);
            }
        });
        getContentPane().add(btnlaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 330, 70));

        btnlaporan1.setBackground(new java.awt.Color(255, 204, 0));
        btnlaporan1.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        btnlaporan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/report.png"))); // NOI18N
        btnlaporan1.setText("LAPORAN DATA GAJI");
        btnlaporan1.setSelected(true);
        btnlaporan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlaporan1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnlaporan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 330, 70));

        btnlaporan2.setBackground(new java.awt.Color(255, 204, 0));
        btnlaporan2.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        btnlaporan2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/report.png"))); // NOI18N
        btnlaporan2.setText("LAPORAN DATA GRUP");
        btnlaporan2.setSelected(true);
        btnlaporan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlaporan2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnlaporan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 330, 70));

        btnlaporan3.setBackground(new java.awt.Color(255, 204, 0));
        btnlaporan3.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        btnlaporan3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/report.png"))); // NOI18N
        btnlaporan3.setText("LAPORAN DATA AKTIVITAS");
        btnlaporan3.setSelected(true);
        btnlaporan3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlaporan3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnlaporan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 330, 70));

        background.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/color.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //MEMBUKA FORM LAPORAN PEGAWAI
    private void btnlaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlaporanActionPerformed
        laporanpegawai laporanp = new laporanpegawai();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(laporanp);
        laporanp.show();
        this.dispose();
    }//GEN-LAST:event_btnlaporanActionPerformed
    //==========================================================================
    
    
    //MEMBUKA FORM LAPORAN GAJI
    private void btnlaporan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlaporan1ActionPerformed
        laporangaji laporangj = new laporangaji();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(laporangj);
        laporangj.show();
        this.dispose();
    }//GEN-LAST:event_btnlaporan1ActionPerformed
    //==========================================================================
    
    
    //MEMBUKA FORM LAPORAN GRUP
    private void btnlaporan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlaporan2ActionPerformed
        laporangrup laporang = new laporangrup();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(laporang);
        laporang.show();
        this.dispose();
    }//GEN-LAST:event_btnlaporan2ActionPerformed
    //==========================================================================
    
    
    //BTN KELUAR
    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        dispose();
    }//GEN-LAST:event_CloseActionPerformed
    //==========================================================================
    
    
    //MEMBUKA FORM LAPORAN AKTIVITAS
    private void btnlaporan3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlaporan3ActionPerformed
        laporanaktivitas laporana = new laporanaktivitas();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(laporana);
        laporana.show();
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_btnlaporan3ActionPerformed
    //==========================================================================
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnlaporan;
    private javax.swing.JButton btnlaporan1;
    private javax.swing.JButton btnlaporan2;
    private javax.swing.JButton btnlaporan3;
    private javax.swing.JLabel jLabel10;
    // End of variables declaration//GEN-END:variables
}
