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
public class C_Mahasiswa {

    public static void setDaftar_member() {
        Koneksi conn = null;
        Statement st = null;
        ResultSet rs = null;

        Connection koneksi = conn.getDBConnection();
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from Mahasiswa");
            while (rs.next()) {
                Mahasiswa pg = new Mahasiswa(rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7));
                Mahasiswa.addDaftarMember(pg);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                rs.close();
                st.close();
                koneksi.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void inputDatadiri(Mahasiswa pg) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;

        conn = Koneksi.getDBConnection();

        String id_Mhs = pg.getId_mhs();
        String Nama = pg.getNama();
        String password = pg.getPassword();
        String jenis_kelamin = pg.getJenis_kelamin();
        String prodi = pg.getProdi();
        String no_telp = pg.getNo_telp();
        String email = pg.getEmail();

        try {
            ps = conn.prepareStatement("insert into MAHASISWAUKM values (?,?,?,?,?,?,?)");
            ps.setString(1, id_Mhs);
            ps.setString(2, Nama);
            ps.setString(3, password);
            ps.setString(4, no_telp);
            ps.setString(5, email);
            ps.setString(6, prodi);
            ps.setString(7, jenis_kelamin);
            ps.executeQuery();
            ps.executeUpdate();
            conn.commit();
            Mahasiswa.addDaftarMember(pg);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void updateData(int indeksPg, Mahasiswa pgBaru) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;

        conn = Koneksi.getDBConnection();

        String id_Mhs = pgBaru.getId_mhs();
        String Nama = pgBaru.getNama();
        String password = pgBaru.getPassword();
        String jenis_kelamin = pgBaru.getJenis_kelamin();
        String prodi = pgBaru.getProdi();
        String no_telp = pgBaru.getNo_telp();
        String email = pgBaru.getEmail();

        try {
            ps = conn.prepareStatement("update Mahasiswa set id_mhs = ?, Nama = ? "
                    + ", password = ?, jenis_kelamin = ?, prodi = ?, no_telp = ?"
                    + ", where id_mhs = ?");

            ps.setString(1, id_Mhs);
            ps.setString(2, Nama);
            ps.setString(3, password);
            ps.setString(4, jenis_kelamin);
            ps.setString(5, prodi);
            ps.setString(6, no_telp);
            ps.setString(7, email);

            Mahasiswa.getDaftarMember().get(indeksPg).getId_mhs();
            Mahasiswa.getDaftarMember().get(indeksPg).getNama();
            Mahasiswa.getDaftarMember().get(indeksPg).getPassword();
            Mahasiswa.getDaftarMember().get(indeksPg).getJenis_kelamin();
            Mahasiswa.getDaftarMember().get(indeksPg).getProdi();
            Mahasiswa.getDaftarMember().get(indeksPg).getNo_telp();
            Mahasiswa.getDaftarMember().get(indeksPg).getEmail();

            conn.commit();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());

            }
        }
    }
}
