/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author benedictus tyo
 */
public class Daftar {
    private String id_mhs;
    private String tgl_pendaf;
    private String id_event_tw;
    private String status_hadir;
    private String status_cetak;

    public Daftar(String id_mhs, String tgl_pendaf, String id_event_tw, String status_hadir, String status_cetak) {
        this.id_mhs = id_mhs;
        this.tgl_pendaf = tgl_pendaf;
        this.id_event_tw = id_event_tw;
        this.status_hadir = status_hadir;
        this.status_cetak = status_cetak;
    }

    public String getId_mhs() {
        return id_mhs;
    }

    public void setId_mhs(String id_mhs) {
        this.id_mhs = id_mhs;
    }

    public String getTgl_pendaf() {
        return tgl_pendaf;
    }

    public void setTgl_pendaf(String tgl_pendaf) {
        this.tgl_pendaf = tgl_pendaf;
    }

    public String getId_event_tw() {
        return id_event_tw;
    }

    public void setId_event_tw(String id_event_tw) {
        this.id_event_tw = id_event_tw;
    }

    public String getStatus_hadir() {
        return status_hadir;
    }

    public void setStatus_hadir(String status_hadir) {
        this.status_hadir = status_hadir;
    }

    public String getStatus_cetak() {
        return status_cetak;
    }

    public void setStatus_cetak(String status_cetak) {
        this.status_cetak = status_cetak;
    }
    
}
