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
public class Admin {

    private String Username;
    private String password;

    private static Admin log_in;
    private static ArrayList<Admin> daftarPengurus = new ArrayList<>();

    public Admin(String nama, String password) {
        this.Username = nama;
        this.password = password;
    }

    public String getNama() {
        return Username;
    }

    public void setNama(String nama) {
        this.Username = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void setLog_in(Admin log_in) {
        Admin.log_in = log_in;
    }

    public static void setDaftarPengurus(ArrayList<Admin> daftarPengurus) {
        Admin.daftarPengurus = daftarPengurus;
    }

    public static void clear() {
        daftarPengurus = new ArrayList<>();
    }

    public static void addatur_jadwal(Admin data) {
        Admin.addatur_jadwal(data);
    }

}
