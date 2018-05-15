/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Control.*;
import Model.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Reinardus
 */
public class C_Event {

    private static Connection conn;

    public C_Event(Connection koneksi) {
        this.conn = koneksi;
    }

    public static C_Event getKoneksi() {
        Control.Koneksi k = new Koneksi();
        C_Event kon = new C_Event(k.getDBConnection());
        return kon;
    }

    public ArrayList<Event_TW> SelectEvent() {
        try {
            ArrayList<Event_TW> jadwalEvent = new ArrayList<>();
            String sql = "select * from EVENT_TW order by id_event_tw";

            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                String id_event_tw = result.getString(1);
                String nama_event_tw = result.getString(2);
                Date tgl_event_tw = result.getDate(3);
                String tmpt_event = result.getString(4);
                Date bts_dftr = result.getDate(5);
                String deskripsi = result.getString(6);
                double kuota = result.getDouble(7);

                jadwalEvent.add(new Event_TW(id_event_tw, nama_event_tw, tmpt_event, tgl_event_tw, bts_dftr, kuota, deskripsi));
            }
            conn.commit();
            conn.close();

            return jadwalEvent;
        } catch (SQLException ex) {
            return null;
        }
    }

    public Event_TW FindEvent(String findId) {
        try {
            String sql = "select * EVENT_TW where id_event_tw='" + findId + "'";

            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet result = statement.executeQuery(sql);
            Event_TW ev = null;
            while (result.next()) {
                String id_event_tw = result.getString(1);
                String nama_event_tw = result.getString(2);
                Date tgl_event_tw = result.getDate(3);
                String tmpt_event = result.getString(4);
                Date bts_dftr = result.getDate(5);
                String deskripsi = result.getString(6);
                double kuota = result.getDouble(7);

                ev = new Event_TW(id_event_tw, nama_event_tw, tmpt_event, tgl_event_tw, bts_dftr, kuota, deskripsi);
            }
            conn.commit();
            conn.close();

            return ev;
        } catch (SQLException ex) {
            return null;
        }
    }

    public static void InsertEvent(Event_TW ev) {
        String sql = "insert into EVENTTDK_WAJIB (id_event, nama_event, tanggal_event, tempat_event, batas_pendaftaran, deskripsi_event, kuota_event) "
                + "values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, ev.getId_event_tw());
            st.setString(2, ev.getNama_event_tw());
            st.setDate(3,ev.getTgl_event_tw());
            st.setString(4, ev.getTmpt_event());
            st.setDate(5, ev.getBts_dftr());
            st.setString(6, ev.getDeskripsi());
            st.setDouble(7, ev.getKuota());

            st.executeUpdate();
            conn.commit();
            conn.close();
        } catch (SQLException ex) {

        }
    }

    public void deleteEvent(String id_event_tw) {
        String sql = "delete from EVENT_TW where id_event_tw = ?";

        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, id_event_tw);

            st.executeUpdate();
            conn.commit();
            conn.close();

        } catch (SQLException ex) {
        }
    }

    public void updateEvent(Event_TW ev) {
        String id_event_tw = ev.getId_event_tw();
        String nama_event_tw = ev.getNama_event_tw();
        Date tgl_event_tw = (Date) ev.getTgl_event_tw();
        String tmpt_event = ev.getTmpt_event();
        java.util.Date bts_dftr = ev.getBts_dftr();
        String deskripsi = ev.getDeskripsi();
        double kuota = ev.getKuota();

        String sql = "update EVENT_TW set  nama_event=?, "
                + "tanggal_event=?, tempat_event=?, batas_daftar=?, "
                + "deskripsi=?, kuota=? "
                + "where id_event_tw=?";

        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, ev.getId_event_tw());
            st.setString(2, ev.getNama_event_tw());
            st.setDate(3, (Date) ev.getTgl_event_tw());
            st.setString(4, ev.getTmpt_event());
            st.setDate(5, (java.sql.Date) ev.getBts_dftr());
            st.setString(6, ev.getDeskripsi());
            st.setDouble(7, ev.getKuota());

            st.executeUpdate();
            conn.commit();
            conn.close();
        } catch (SQLException ex) {
        }
    }

}
