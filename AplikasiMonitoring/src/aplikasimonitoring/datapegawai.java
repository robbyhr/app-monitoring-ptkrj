
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
import javax.swing.table.DefaultTableModel;
public class datapegawai extends javax.swing.JInternalFrame {
    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    String sql;
//==============================================================================    

    
    //DATA TABLE (UPDATE)
    public datapegawai() {
        initComponents();
        datatable();
        autonumber();
        datacombo();
        dataijasah();
    }
    //========================================================================== 
  
    
    //MENGKOSONGKAN KOLOM
    public void kosongkan(){
        txtnama.setText("");
        txtktp.setText("");
        txttanggal.setDate(null);
        txttmptlahir.setText("");
        txttelpon.setText("");
        txtalamat.setText("");
    }
    //==========================================================================
    
    
    //MENYAMBUNGKAN DATABASE KE DALAM TABLE
    public void datatable() {
        DefaultTableModel tbl= new DefaultTableModel();
        tbl.addColumn("Kode");
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
        tabelpegawai.setModel(tbl);
        try{
            Statement statement=(Statement)conek.GetConnection().createStatement();
            ResultSet res=statement.executeQuery("select * from tblpegawai");
            while(res.next())
            {
                tbl.addRow(new Object[]{
                   res.getString("kode"),
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
                tabelpegawai.setModel(tbl);  
            }
        }catch (Exception e){
            
        }
    }
    //==========================================================================

    
    //MENAMPILKAN DATA DARI DATABASE KE COMBOBOX
    public void datacombo(){
    txtgrup.removeAllItems();
        try{
        java.sql.Statement statement = (java.sql.Statement)conek.GetConnection().createStatement();
        ResultSet res = statement.executeQuery("select * from tblgrup");
        
        while(res.next()){
            String name = res.getString("nama_grup");
            txtgrup.addItem(name);
        }
        res.last();
        }catch (Exception e){
        }
        
        datatable();
    }
    //==========================================================================
    
    
    //MENAMPILKAN DATA DARI DATABASE KE COMBOBOX
    public void dataijasah(){
    txtijasah.removeAllItems();
        try{
        java.sql.Statement statement = (java.sql.Statement)conek.GetConnection().createStatement();
        ResultSet res = statement.executeQuery("select * from tblijasah");
        
        while(res.next()){
            String name = res.getString("jenis_ijasah");
            txtijasah.addItem(name);
        }
        res.last();
        }catch (Exception e){
        }
        
        datatable();
    }
    //==========================================================================  
      
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        buttongender = new javax.swing.ButtonGroup();
        buttonpengalaman = new javax.swing.ButtonGroup();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        icon = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        txttelpon = new javax.swing.JTextField();
        txtktp = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        kosong = new javax.swing.JButton();
        btninput = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        txtgrup = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelpegawai = new javax.swing.JTable();
        txtkode = new javax.swing.JTextField();
        tambahgroup = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txttmptlahir = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtijasah = new javax.swing.JComboBox<>();
        txttanggal = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtpengalaman1 = new javax.swing.JRadioButton();
        txtpengalaman2 = new javax.swing.JRadioButton();
        laki = new javax.swing.JRadioButton();
        perempuan = new javax.swing.JRadioButton();
        background1 = new javax.swing.JLabel();

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Kode");

        jToggleButton1.setText("jToggleButton1");

        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DATA");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 180, 50));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/close.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 38, -1));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/editicon.png"))); // NOI18N
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        jLabel13.setFont(new java.awt.Font("Trajan Pro", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("MENU");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        txtalamat.setColumns(20);
        txtalamat.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        txtalamat.setRows(5);
        jScrollPane1.setViewportView(txtalamat);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 180, 120));

        txttelpon.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        txttelpon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelponKeyTyped(evt);
            }
        });
        getContentPane().add(txttelpon, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 180, 30));

        txtktp.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        txtktp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtktpActionPerformed(evt);
            }
        });
        txtktp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtktpKeyTyped(evt);
            }
        });
        getContentPane().add(txtktp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 190, 30));

        txtnama.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 190, 30));

        jLabel2.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel2.setText("Nama Lengkap");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        jLabel12.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel12.setText("No KTP");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, -1, -1));

        jLabel9.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel9.setText("No Telepon");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel5.setText("Alamat");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel3.setText("Kode");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel1.setText("Group");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        kosong.setBackground(new java.awt.Color(255, 204, 0));
        kosong.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        kosong.setForeground(new java.awt.Color(255, 255, 255));
        kosong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/clear.png"))); // NOI18N
        kosong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kosongActionPerformed(evt);
            }
        });
        getContentPane().add(kosong, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 60, 55));

        btninput.setBackground(new java.awt.Color(255, 204, 0));
        btninput.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        btninput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/addpersonal.png"))); // NOI18N
        btninput.setText("INPUT");
        btninput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninputActionPerformed(evt);
            }
        });
        getContentPane().add(btninput, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 140, 55));

        btnhapus.setBackground(new java.awt.Color(255, 204, 0));
        btnhapus.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/delete.png"))); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 140, 55));

        btnedit.setBackground(new java.awt.Color(255, 204, 0));
        btnedit.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/edit.png"))); // NOI18N
        btnedit.setText("EDIT");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        getContentPane().add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 140, 55));

        txtgrup.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        getContentPane().add(txtgrup, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 140, 30));

        tabelpegawai.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelpegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelpegawaiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelpegawai);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 780, 170));

        txtkode.setEditable(false);
        txtkode.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        txtkode.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(txtkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 190, 30));

        tambahgroup.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tambahgroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/addgroup.png"))); // NOI18N
        tambahgroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahgroupActionPerformed(evt);
            }
        });
        getContentPane().add(tambahgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 40, 40));

        jLabel14.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel14.setText("Tanggal Lahir");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, -1, -1));

        txttmptlahir.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        getContentPane().add(txttmptlahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 190, 30));

        jLabel15.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel15.setText("Tempat Lahir");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, -1, -1));

        jLabel16.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel16.setText("Ijasah Terakhir");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, -1, -1));

        txtijasah.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        getContentPane().add(txtijasah, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 180, 30));

        txttanggal.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        getContentPane().add(txttanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 190, 30));

        jLabel17.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel17.setText("Jenis Kelamin");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, -1, -1));

        jLabel18.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel18.setText("Pengalaman");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, -1, -1));

        buttonpengalaman.add(txtpengalaman1);
        txtpengalaman1.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        txtpengalaman1.setText("Ya");
        getContentPane().add(txtpengalaman1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, -1, 30));

        buttonpengalaman.add(txtpengalaman2);
        txtpengalaman2.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        txtpengalaman2.setText("Tidak");
        getContentPane().add(txtpengalaman2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, -1, 30));

        buttongender.add(laki);
        laki.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        laki.setText("Laki-Laki");
        getContentPane().add(laki, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 623, -1, 30));

        buttongender.add(perempuan);
        perempuan.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        perempuan.setText("Perempuan");
        getContentPane().add(perempuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 623, -1, 30));

        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/color.jpg"))); // NOI18N
        background1.setMaximumSize(new java.awt.Dimension(960, 541));
        getContentPane().add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //MENGATUR FIELD KODE, MENJADI AUTO NUMBER
    private void autonumber(){
        txtkode.setText("");

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
            JOptionPane.showMessageDialog(rootPane,"DATABASE BELUM NYALA!");
        }
    }
    //==========================================================================
    
    
    //MENGEDIT DATA TABLE
    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        String pengalaman = null; //(String) txtpengalaman.getSelectedItem();
        String status     = null;
        String formattanggal ="yyyy-MM-dd" ; 
        SimpleDateFormat ft = new SimpleDateFormat(formattanggal); //ft = FORMAT TANGGAL
        String tanggal = String.valueOf(ft.format(txttanggal.getDate()));
        String grup       = (String) txtgrup.getSelectedItem();
        String ijasah     = (String) txtijasah.getSelectedItem();
  
            if(txtpengalaman1.isSelected())
        {
            pengalaman = "Ada";
        }
        else if (txtpengalaman2.isSelected())
        {
            pengalaman = "Tidak Ada";
        }

            if(laki.isSelected())
        {
            status = "Laki-laki";
        }
        else if (perempuan.isSelected())
        {
            status = "Perempuan";
        }
        
        try{
            Statement statement = (Statement) conek.GetConnection().createStatement();
            statement.executeUpdate("UPDATE tblpegawai SET nama='"+txtnama.getText()+"',ktp='"+txtktp.getText()+"',tgllahir='"+tanggal+"',tmptlahir='"+txttmptlahir.getText()+"',ijasah='"+ijasah+"',status='"+status+"',pengalaman='"+pengalaman+"',telp='"+txttelpon.getText()+"',alamat='"+txtalamat.getText()+"',grup='"+grup+"' WHERE kode= '"+ txtkode.getText()+"'");
            statement.close();                                                                                                                                                                                                                                                                                                      
            JOptionPane.showMessageDialog(rootPane, "DATA BERHASIL DISIMPAN");
        }catch (Exception t){
           JOptionPane.showMessageDialog(rootPane, "DATA GAGAL DISIMPAN");
        }
        kosongkan();
        datatable();
        autonumber();
        
    }//GEN-LAST:event_btneditActionPerformed
    //==========================================================================
    
    
    //TOMBOL EXIT
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed
    //==========================================================================

    
    //MENGHAPUS DATA DIDALAM TABLE
    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        try {
        Statement statement = (Statement) conek.GetConnection().createStatement();
        statement.executeUpdate("DELETE from tblpegawai where kode=('" + txtkode.getText() + "');");
        JOptionPane.showMessageDialog(rootPane, "DATA BERHASIL TERHAPUS");

        }catch (Exception t ) {
            JOptionPane.showMessageDialog(rootPane, "GAGAL TERHAPUS");
        }
        datatable();
    }//GEN-LAST:event_btnhapusActionPerformed
    //==========================================================================
    
    
    //MENAMPILKAN DATA TABLE KE FIELD KETIKA DIKLIK (EVENT BUTTON CLICK)
    private void tabelpegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelpegawaiMouseClicked
        try {
            DefaultTableModel tabel= (DefaultTableModel)tabelpegawai.getModel();
            String formattanggal ="yyyy-MM-dd" ;
            Date tanggal = new SimpleDateFormat(formattanggal).parse((String)tabel.getValueAt(tabelpegawai.getSelectedRow(), 4)); //ft = FORMAT TANGGAL
            txttanggal.setDate(tanggal);
            txtkode.setText(tabelpegawai.getValueAt(tabelpegawai.getSelectedRow(), 0).toString());
            txtgrup.setSelectedItem(tabelpegawai.getValueAt(tabelpegawai.getSelectedRow(), 2).toString());
            txtnama.setText(tabelpegawai.getValueAt(tabelpegawai.getSelectedRow(), 1).toString());
            txtktp.setText(tabelpegawai.getValueAt(tabelpegawai.getSelectedRow(), 3).toString());
            txttmptlahir.setText(tabelpegawai.getValueAt(tabelpegawai.getSelectedRow(), 5).toString());
            txtijasah.setSelectedItem(tabelpegawai.getValueAt(tabelpegawai.getSelectedRow(), 6).toString());
            String kelamin = tabelpegawai.getValueAt(tabelpegawai.getSelectedRow(), 7).toString();
            if(kelamin.equals("Laki-laki")){
                laki.setSelected(true);
                perempuan.setSelected(false);
            }
            else{
                perempuan.setSelected(true);
                laki.setSelected(false);
            }
            
            String pengalaman = tabelpegawai.getValueAt(tabelpegawai.getSelectedRow(), 8).toString();
            if(pengalaman.equals("Ya")){
                txtpengalaman1.setSelected(true);
                txtpengalaman2.setSelected(false);
            }
            else{
                txtpengalaman2.setSelected(true);
                txtpengalaman1.setSelected(false);
            }
            txttelpon.setText(tabelpegawai.getValueAt(tabelpegawai.getSelectedRow(), 9).toString());
            txtalamat.setText(tabelpegawai.getValueAt(tabelpegawai.getSelectedRow(), 10).toString());
            
            datatable();
        } catch (ParseException ex) {
            Logger.getLogger(datapegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabelpegawaiMouseClicked
    //==========================================================================
    
    
    //MENAMPILKAN FORM GROUP
    private void tambahgroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahgroupActionPerformed
        grouppegawai groupp = new grouppegawai();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(groupp);
        groupp.show();
        this.dispose();
        //formgroup.setVisible(true);
        //txtnamagroup.setText("");
    }//GEN-LAST:event_tambahgroupActionPerformed
    //===========================================================================
    
    
    //INPUTAN DATA KE DALAM DATABASE
    private void btninputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputActionPerformed
         String kode= txtkode.getText();
        String nama = txtnama.getText();
        String ktp = txtktp.getText();
        String formattanggal ="yyyy-MM-dd" ; 
        SimpleDateFormat ft = new SimpleDateFormat(formattanggal); //ft = FORMAT TANGGAL
        String tanggal = String.valueOf(ft.format(txttanggal.getDate()));
        String tmptlahir = txttmptlahir.getText();
        String telp = txttelpon.getText();
        String alamat = txtalamat.getText();
        String ijasah = (String) txtijasah.getSelectedItem();
        String status = ""; //(String) txtstatus.getSelectedItem();
        String grup = (String) txtgrup.getSelectedItem();
        String pengalaman = ""; //(String) txtpengalaman.getSelectedItem();
        
            if(txtpengalaman1.isSelected())
        {
            pengalaman = "Ada";
        }
        else if (txtpengalaman2.isSelected())
        {
            pengalaman = "Tidak Ada";
        }

            if(laki.isSelected())
        {
            status = "Laki-laki";
        }
        else if (perempuan.isSelected())
        {
            status = "Perempuan";
        }
            
        try{
            sql = "SELECT * FROM tblpegawai WHERE nama='"+txtnama.getText()+"'";
            Statement statement = (Statement) conek.GetConnection().createStatement();
            rs = statement.executeQuery(sql);
            if (rs.next()){
                if(txtnama.getText().equals(rs.getString("nama"))){
                    JOptionPane.showMessageDialog(rootPane, "NAMA SUDAH ADA");
                }
            }else{
                statement.executeUpdate("insert into tblpegawai VALUES ('" + nama + "','" + ktp + "','" + tanggal + "','" + tmptlahir + "','" + ijasah +"','" + status + "','" + pengalaman + "','" + telp + "','" + alamat + "','" + kode + "','" + grup + "');");
                statement.close();
                JOptionPane.showMessageDialog(rootPane, "DATA KARYAWAN BERHASIL DISIMPAN");
            }
            
        }catch (Exception t){
            JOptionPane.showMessageDialog(rootPane, "DATA KARYAWAN GAGAL DISIMPAN");
        }
        
        kosongkan();
        datatable();
        autonumber();
       
    }//GEN-LAST:event_btninputActionPerformed
    //===========================================================================
    
    
    //BUTTON BERSIHKAN FIELDS
    private void kosongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kosongActionPerformed
        
        txtnama.setText("");
        txtktp.setText("");
         txttanggal.setDate(null);
        //txttanggal.setDateFormatString("");
        txttmptlahir.setText("");
        txttelpon.setText("");
        txtalamat.setText("");
        autonumber();
        datacombo();
        dataijasah();
       
    }//GEN-LAST:event_kosongActionPerformed
    //==========================================================================
    
    
    //MENGATUR HANYA INPUT ANGKA SAJA DAN 12 DIGIT SAJA
    private void txtktpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtktpKeyTyped
        char enter=evt.getKeyChar();

        if(!(Character.isDigit(enter)))
        {
            evt.consume();
        }
        if ( txtktp.getText().length() == 16 ) {
        evt.consume();
        }
    }//GEN-LAST:event_txtktpKeyTyped
    //==========================================================================
    
    
    //MENGATUR HANYA INPUT ANGKA SAJA DAN 12 DIGIT SAJA
    private void txttelponKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelponKeyTyped
        char enter=evt.getKeyChar();

        if(!(Character.isDigit(enter)))
        {
            evt.consume();
        }
        if ( txttelpon.getText().length() == 12 ) {
        evt.consume();
        }
    }//GEN-LAST:event_txttelponKeyTyped
    //==========================================================================
    
    
    //
    private void txtktpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtktpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtktpActionPerformed
    //==========================================================================

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background1;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btninput;
    private javax.swing.ButtonGroup buttongender;
    private javax.swing.ButtonGroup buttonpengalaman;
    private javax.swing.JLabel icon;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton kosong;
    private javax.swing.JRadioButton laki;
    private javax.swing.JRadioButton perempuan;
    private javax.swing.JTable tabelpegawai;
    private javax.swing.JButton tambahgroup;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JComboBox<String> txtgrup;
    private javax.swing.JComboBox<String> txtijasah;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtktp;
    private javax.swing.JTextField txtnama;
    private javax.swing.JRadioButton txtpengalaman1;
    private javax.swing.JRadioButton txtpengalaman2;
    private com.toedter.calendar.JDateChooser txttanggal;
    private javax.swing.JTextField txttelpon;
    private javax.swing.JTextField txttmptlahir;
    // End of variables declaration//GEN-END:variables
}
