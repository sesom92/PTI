/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.sql.Date;

/**
 *
 * @author benedictus tyo
 */
public class Event_TW {
    private String id_event_tw;
    private String nama_event_tw;
    private String tmpt_event;
    private Date tgl_event_tw;
    private Date bts_dftr;
    private double kuota;
    private String deskripsi;
    
    private static Event_TW log_in;
    private static ArrayList<Event_TW> daftarEvent_TW = new ArrayList<>();

    public Event_TW(String id_event_tw, String nama_event_tw, String tmpt_event, Date tgl_event_tw, Date bts_dftr, double kuota, String deskripsi) {
        this.id_event_tw = id_event_tw;
        this.nama_event_tw = nama_event_tw;
        this.tmpt_event = tmpt_event;
        this.tgl_event_tw = tgl_event_tw;
        this.bts_dftr = bts_dftr;
        this.kuota = kuota;
        this.deskripsi = deskripsi;
    }

    

    public String getId_event_tw() {
        return id_event_tw;
    }

    public void setId_event_tw(String id_event_tw) {
        this.id_event_tw = id_event_tw;
    }

    public String getNama_event_tw() {
        return nama_event_tw;
    }

    public void setNama_event_tw(String nama_event_tw) {
        this.nama_event_tw = nama_event_tw;
    }

    public Date getTgl_event_tw() {
        return tgl_event_tw;
    }

    public void setTgl_event_tw(Date tgl_event_tw) {
        this.tgl_event_tw = tgl_event_tw;
    }

    public String getTmpt_event() {
        return tmpt_event;
    }

    public void setTmpt_event(String tmpt_event) {
        this.tmpt_event = tmpt_event;
    }

    public Date getBts_dftr() {
        return bts_dftr;
    }

    public void setBts_dftr(Date bts_dftr) {
        this.bts_dftr = bts_dftr;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public double getKuota() {
        return kuota;
    }

    public void setKuota(double kuota) {
        this.kuota = kuota;
    }

    public static Event_TW getLog_in() {
        return log_in;
    }

    public static ArrayList<Event_TW> getDaftarEvent_TW() {
        return daftarEvent_TW;
    }

    public static void setLog_in(Event_TW log_in) {
        Event_TW.log_in = log_in;
    }

    public static void setDaftarEvent_TW(ArrayList<Event_TW> daftarEvent_TW) {
        Event_TW.daftarEvent_TW = daftarEvent_TW;
    }
    
    public static void clear() {
        daftarEvent_TW = new ArrayList<>();
    }
    
}