
package koneksi;

//INI ADALAH SEBUAH KOMPONEN DALAM KODING
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//==============================================================================

//KODING INI ADALAH SEBUAH KONEKSI UNTUK MENGHUBUNGKAN KE DATABASE(MENJADI KOMPONEN DAN AKAN DI PANGGIL)
public class conek {
    private static Connection koneksi;
    
    public static Connection GetConnection()throws SQLException{
        if (koneksi == null){
            new Driver();
            
            koneksi=DriverManager.getConnection("jdbc:mysql://localhost/aplikasi_monitoring","root","");
            
        }
        return koneksi;
    }
public static Connection getConnection() {
        Connection connection = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/aplikasi_monitoring"; //ganti dengan database mu
        String user = "root";
        String password = "";
        if (connection == null) {
            try {
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException | SQLException error) {
               System.exit(0);
            }

        }
        return connection;
    }
}
