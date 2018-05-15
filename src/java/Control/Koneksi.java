package Control;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author NOVITA
 */
public class Koneksi {
    public Koneksi(){
//        try {
////            conn.close();
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage(), "Exception", 0);
//        }
    }
    public static Connection getDBConnection(){
        String host = "localhost"; //jika dikampus, maka gunakan host 172.23.9.185
        String port = "1521"; 
        String db = "xe"; //jika login dikampus maka gunakan dbname nya ORCL
        String usr = "moses"; //sesuaikan password dan username kalian
        String pwd = "moses";
//        String host = "localhost"; //jika dikampus, maka gunakan host 172.23.9.185
//        String port = "1521"; 
//        String db = "xe"; //jika login dikampus maka gunakan dbname nya ORCL
//        String usr = "SYSTEM"; //sesuaikan password dan username kalian
//        String pwd = "HR";
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch(ClassNotFoundException ex){
            System.out.println("Maaf driver class tidak ditemukan");
            System.out.println(ex.getMessage());
        }
        Connection conn = null;
        try{
            conn = DriverManager.getConnection("jdbc:oracle:thin:@"+host+":"+port+":"+db,usr,pwd);
        }catch(SQLException ex){
            System.out.println("Koneksi Gagal");
            System.out.println(ex.getMessage());
        }
        if (conn!=null) {
            System.out.println("Koneksi Berhasil");
        }else{
            System.out.println("Koneksi Gagal");
        }
        return conn;
    }
    public static void main(String[] args) {
        getDBConnection();
    }
     Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
