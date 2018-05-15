/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author benedictus tyo
 */
public class C_Admin {

    public static void setAdmin() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        conn = Koneksi.getDBConnection();
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from Admin");
            while (rs.next()) {
                Admin pg = new Admin(rs.getString(1), rs.getString(2));
                Admin.addatur_jadwal(pg);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void Admin(Admin pg) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
       
        Statement st = null;
        ResultSet rs = null;

        conn = Koneksi.getDBConnection();

        String Nama = pg.getNama();
        String password = pg.getPassword();

        try {
            ps = conn.prepareStatement("insert into Admin values(?,?)");
            ps.setString(1, Nama);
            ps.setString(2, password);

            ps.executeUpdate();
            conn.commit();
            Admin.addatur_jadwal(pg);
       } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
