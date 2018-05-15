/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author sesom92
 */
public class Mahasiswa {

    private String id_mhs;
    private String nama;
    private String password;
    private String no_telp;
    private String email;
    private String Prodi;
    private String Jenis_kelamin;

    private static Mahasiswa log_in;
    private static ArrayList<Mahasiswa> daftarMember = new ArrayList<>();

    public Mahasiswa(String id_mhs, String nama, String password, String no_telp, String email, String Prodi, String Jenis_kelamin) {
        this.id_mhs = id_mhs;
        this.nama = nama;
        this.password = password;
        this.no_telp = no_telp;
        this.email = email;
        this.Prodi = Prodi;
        this.Jenis_kelamin = Jenis_kelamin;
    }

    public String getId_mhs() {
        return id_mhs;
    }

    public void setId_mhs(String id_mhs) {
        this.id_mhs = id_mhs;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJenis_kelamin() {
        return Jenis_kelamin;
    }

    public void setJenis_kelamin(String Jenis_kelamin) {
        this.Jenis_kelamin = Jenis_kelamin;
    }

    public String getProdi() {
        return Prodi;
    }

    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
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

    public static Mahasiswa getLog_in() {
        return log_in;
    }

    public static void setLog_in(Mahasiswa log_in) {
        Mahasiswa.log_in = log_in;
    }

    public static ArrayList<Mahasiswa> getDaftarMember() {
        return daftarMember;
    }

    public static void addDaftarMember(Mahasiswa data) {
        daftarMember.add(data);
    }

    public static void setDaftarMember(ArrayList<Mahasiswa> daftarMember) {
        Mahasiswa.daftarMember = daftarMember;
    }

    public static void clear() {
        daftarMember = new ArrayList<>();
    }

}
