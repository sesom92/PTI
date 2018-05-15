/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author benedictus tyo
 */
public class Event_W {
    private String id_mhs;
    private String nama_mhs;
    private double password;
    private String no_telp;
    private String email ;
    private String jenis_kelamin;
    private String prodi;
    
    private static Event_W log_in;
    private static ArrayList<Event_W> daftarEvent_W = new ArrayList<>();

    public Event_W(String id_mhs, String nama_mhs, double password, String no_telp, String email, String jenis_kelamin, String prodi) {
        this.id_mhs = id_mhs;
        this.nama_mhs = nama_mhs;
        this.password = password;
        this.no_telp = no_telp;
        this.email = email;
        this.jenis_kelamin = jenis_kelamin;
        this.prodi = prodi;
    }

    public String getId_mhs() {
        return id_mhs;
    }

    public void setId_mhs(String id_mhs) {
        this.id_mhs = id_mhs;
    }

    public String getNama_mhs() {
        return nama_mhs;
    }

    public void setNama_mhs(String nama_mhs) {
        this.nama_mhs = nama_mhs;
    }

    public double getPassword() {
        return password;
    }

    public void setPassword(double password) {
        this.password = password;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public static Event_W getLog_in() {
        return log_in;
    }

    public static ArrayList<Event_W> getDaftarEvent_W() {
        return daftarEvent_W;
    }

    public static void setLog_in(Event_W log_in) {
        Event_W.log_in = log_in;
    }

    public static void setDaftarEvent_W(ArrayList<Event_W> daftarEvent_W) {
        Event_W.daftarEvent_W = daftarEvent_W;
    }
    
    public static void clear() {
        daftarEvent_W = new ArrayList<>();
    }
    
    
    
}
