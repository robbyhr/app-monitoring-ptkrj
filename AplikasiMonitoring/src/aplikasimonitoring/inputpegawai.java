
package aplikasimonitoring;

//KOMPONEN 
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import koneksi.conek;
import javax.swing.table.DefaultTableModel;
//==============================================================================


//FUNCTION
public class inputpegawai extends javax.swing.JInternalFrame {
    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    String sql;
    public inputpegawai() {
        initComponents();
        hideform();
        datacombo();
        autonumbergroup();
        autonumberkaryawan();
    }
//==============================================================================
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupgenre = new javax.swing.ButtonGroup();
        grouppengalaman = new javax.swing.ButtonGroup();
        formgroup = new javax.swing.JInternalFrame();
        jLabel32 = new javax.swing.JLabel();
        txtkodegroup = new javax.swing.JTextField();
        txtnamagroup = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Close = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        buttoninput2 = new javax.swing.JButton();
        buttoninput1 = new javax.swing.JButton();
        buttoninput = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        icon1 = new javax.swing.JLabel();
        txtgrup = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        txttelp = new javax.swing.JTextField();
        txtijasah = new javax.swing.JComboBox<>();
        txttmptlahir = new javax.swing.JTextField();
        txttgllahir = new javax.swing.JTextField();
        txtktp = new javax.swing.JTextField();
        txtnamalengkap = new javax.swing.JTextField();
        pengalaman1 = new javax.swing.JRadioButton();
        pengalaman2 = new javax.swing.JRadioButton();
        status1 = new javax.swing.JRadioButton();
        status2 = new javax.swing.JRadioButton();
        tambahgroup = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        background1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formgroup.setVisible(true);
        formgroup.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("KODE");
        formgroup.getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtkodegroup.setEditable(false);
        txtkodegroup.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        formgroup.getContentPane().add(txtkodegroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 110, 30));

        txtnamagroup.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        txtnamagroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamagroupActionPerformed(evt);
            }
        });
        formgroup.getContentPane().add(txtnamagroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 180, 30));

        jLabel31.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("NAMA GROUP");
        formgroup.getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("GROUP");
        formgroup.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 230, 50));

        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/close.png"))); // NOI18N
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        formgroup.getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 38, -1));

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/group.png"))); // NOI18N
        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        formgroup.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 150, 50));

        background.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/color.jpg"))); // NOI18N
        formgroup.getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 260));

        getContentPane().add(formgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 410, 290));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("INPUT");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 180, 50));

        buttoninput2.setBackground(new java.awt.Color(255, 153, 0));
        buttoninput2.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        buttoninput2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/find.png"))); // NOI18N
        buttoninput2.setText("Cari");
        buttoninput2.setSelected(true);
        buttoninput2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoninput2ActionPerformed(evt);
            }
        });
        getContentPane().add(buttoninput2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, 150, 55));

        buttoninput1.setBackground(new java.awt.Color(255, 153, 0));
        buttoninput1.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        buttoninput1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/tambah.png"))); // NOI18N
        buttoninput1.setText("DATA");
        buttoninput1.setSelected(true);
        buttoninput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoninput1ActionPerformed(evt);
            }
        });
        getContentPane().add(buttoninput1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 150, 55));

        buttoninput.setBackground(new java.awt.Color(255, 153, 0));
        buttoninput.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        buttoninput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/addpersonal.png"))); // NOI18N
        buttoninput.setText("TAMBAH");
        buttoninput.setSelected(true);
        buttoninput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoninputActionPerformed(evt);
            }
        });
        getContentPane().add(buttoninput, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, 55));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/close.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 38, -1));

        jLabel13.setFont(new java.awt.Font("Trajan Pro", 3, 18)); // NOI18N
        jLabel13.setText("PERUSAHAAN");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        jLabel12.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Kode Karyawan");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));

        txtkode.setEditable(false);
        txtkode.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        getContentPane().add(txtkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 220, 30));

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/company.png"))); // NOI18N
        getContentPane().add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, -1, -1));

        txtgrup.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        getContentPane().add(txtgrup, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 220, 30));

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Group");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        txtalamat.setColumns(20);
        txtalamat.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        txtalamat.setRows(5);
        jScrollPane3.setViewportView(txtalamat);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 250, -1));

        txttelp.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        getContentPane().add(txttelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 220, 30));

        txtijasah.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        txtijasah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SD", "SMP", "SMA/SLTA", "S1", "S2" }));
        getContentPane().add(txtijasah, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 220, 30));

        txttmptlahir.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        txttmptlahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttmptlahirActionPerformed(evt);
            }
        });
        getContentPane().add(txttmptlahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 220, 30));

        txttgllahir.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        getContentPane().add(txttgllahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 220, 30));

        txtktp.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        getContentPane().add(txtktp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 220, 30));

        txtnamalengkap.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        getContentPane().add(txtnamalengkap, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 220, 30));

        grouppengalaman.add(pengalaman1);
        pengalaman1.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        pengalaman1.setText("Ada");
        getContentPane().add(pengalaman1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, 30));

        grouppengalaman.add(pengalaman2);
        pengalaman2.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        pengalaman2.setText("Tidak Ada");
        getContentPane().add(pengalaman2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, 30));

        groupgenre.add(status1);
        status1.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        status1.setText("Laki-laki");
        getContentPane().add(status1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, 30));

        groupgenre.add(status2);
        status2.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        status2.setText("Perempuan");
        getContentPane().add(status2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, 30));

        tambahgroup.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tambahgroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/addgroup.png"))); // NOI18N
        tambahgroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahgroupActionPerformed(evt);
            }
        });
        getContentPane().add(tambahgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, 40, 40));

        jLabel22.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Nama Lengkap");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel30.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("No KTP");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel23.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Tanggah Lahir");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel24.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Tempat Lahir");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel26.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Ijasah Terakhir");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel27.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Jenis Kelamin");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel28.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Pengalaman Kerja");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabel29.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("No Telepon");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel25.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Alamat");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/pesonal.png"))); // NOI18N
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel11.setFont(new java.awt.Font("Trajan Pro", 3, 18)); // NOI18N
        jLabel11.setText("PERSONAL");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/color.jpg"))); // NOI18N
        background1.setMaximumSize(new java.awt.Dimension(960, 541));
        getContentPane().add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //MENYEMBUNYIKAN FORM GROUP
    private void hideform(){
    try{
        formgroup.setVisible(false);
    }catch (Exception e){
    
        }
    }
    //==========================================================================
    
    //MENAMPILKAN DATABASE KE COMBOBOX
        private void datacombo()
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
    
        
    //EXIT
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
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

               txtkodegroup.setText("G" + Nol + AN);
            } else {
               txtkodegroup.setText("G01");
            }

           }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           }
    }
    //==========================================================================
    
    
    //MENGATUR FIELD KODE, MENJADI AUTO NUMBER
    private void autonumberkaryawan(){
                try{
        sql = "select * from tblpegawai order by kode desc";
        Statement st = (Statement) conek.getConnection().createStatement();
        rs = st.executeQuery(sql);
                if (rs.next()) {
                String kode = rs.getString("kode").substring(1);
                String AN = "" + (Integer.parseInt(kode) + 1);
                String Nol = "";

                if(AN.length()==1)
                {Nol = "0";}
                else if(AN.length()==2)
                {Nol = "";}

               txtkode.setText("P" + Nol + AN);
            } else {
               txtkode.setText("P01");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"SALAH INPUTAN ATAU DATABASE BELUM NYALA!");
        }
    }
    //==========================================================================
    

    //INPUT DATA KE DALAM DATABASE
    private void buttoninputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoninputActionPerformed
        String kode= txtkode.getText();
        String nama = txtnamalengkap.getText();
        String ktp = txtktp.getText();
        String tgllahir = txttgllahir.getText();
        String tmptlahir = txttmptlahir.getText();
        String telp = txttelp.getText();
        String alamat = txtalamat.getText();
        String ijasah = (String) txtijasah.getSelectedItem();
        String status = null; //(String) txtstatus.getSelectedItem();
        String grup = (String) txtgrup.getSelectedItem();
        String pengalaman = null; //(String) txtpengalaman.getSelectedItem();
        
            if(pengalaman1.isSelected())
        {
            pengalaman = "Ada";
        }
        else if (pengalaman2.isSelected())
        {
            pengalaman = "Tidak Ada";
        }

            if(status1.isSelected())
        {
            status = "Laki-laki";
        }
        else if (status2.isSelected())
        {
            status = "Perempuan";
        }
            
        try{
            Statement statement = (Statement) conek.GetConnection().createStatement();
            statement.executeUpdate("insert into tblpegawai VALUES ('" + nama + "','" + ktp + "','" + tgllahir + "','" + tmptlahir + "','" + ijasah +"','" + status + "','" + pengalaman + "','" + telp + "','" + alamat + "','" + kode + "','" + grup + "');");
            statement.close();
            JOptionPane.showMessageDialog(rootPane, "DATA KARYAWAN BERHASIL DISIMPAN");
        }catch (Exception t){
            JOptionPane.showMessageDialog(rootPane, "DATA KARYAWAN GAGAL DISIMPAN");
        }
        //datacombo();
        autonumberkaryawan();
        
        txtnamalengkap.setText("");
        txtktp.setText("");
        txttgllahir.setText("");
        txttmptlahir.setText("");
        txttelp.setText("");
        txtalamat.setText("");
       
    }//GEN-LAST:event_buttoninputActionPerformed
    //==========================================================================
    
    
    //==========================================================================
    private void txttmptlahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttmptlahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttmptlahirActionPerformed
    //==========================================================================
    
    
    //
    private void tambahgroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahgroupActionPerformed
        /*
        grouppegawai groupp = new grouppegawai();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(groupp);
        groupp.show();
        this.dispose();
        */
        formgroup.setVisible(true);
        txtnamagroup.setText("");
    }//GEN-LAST:event_tambahgroupActionPerformed
    //==========================================================================
    
    
    //Close Form
    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        formgroup.setVisible(false);
    }//GEN-LAST:event_CloseActionPerformed
    //==========================================================================
    
    
    //INPUT DATA GROUP KE DATABASE
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String kode = txtkodegroup.getText();
        String nama = txtnamagroup.getText();
        try{
            java.sql.Statement statement = (java.sql.Statement) conek.GetConnection().createStatement();
            statement.executeUpdate("insert into tblgrup VALUES ('" + kode + "','" + nama +"');");
            statement.close();
            JOptionPane.showMessageDialog(rootPane, "DATA BERHASIL DISIMPAN");
            datacombo();
            formgroup.setVisible(false);
        }catch (Exception t){
            JOptionPane.showMessageDialog(rootPane, "DATA GAGAL DISIMPAN");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtnamagroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamagroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamagroupActionPerformed

    private void buttoninput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoninput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttoninput1ActionPerformed

    private void buttoninput2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoninput2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttoninput2ActionPerformed
    //==========================================================================
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JLabel background;
    private javax.swing.JLabel background1;
    private javax.swing.JButton buttoninput;
    private javax.swing.JButton buttoninput1;
    private javax.swing.JButton buttoninput2;
    private javax.swing.JInternalFrame formgroup;
    private javax.swing.ButtonGroup groupgenre;
    private javax.swing.ButtonGroup grouppengalaman;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton pengalaman1;
    private javax.swing.JRadioButton pengalaman2;
    private javax.swing.JRadioButton status1;
    private javax.swing.JRadioButton status2;
    private javax.swing.JButton tambahgroup;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JComboBox<String> txtgrup;
    private javax.swing.JComboBox<String> txtijasah;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtkodegroup;
    private javax.swing.JTextField txtktp;
    private javax.swing.JTextField txtnamagroup;
    private javax.swing.JTextField txtnamalengkap;
    private javax.swing.JTextField txttelp;
    private javax.swing.JTextField txttgllahir;
    private javax.swing.JTextField txttmptlahir;
    // End of variables declaration//GEN-END:variables
}
