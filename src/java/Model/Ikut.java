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
public class Ikut {
    private String id_mhs;
    private String id_event_wajib;

    public Ikut(String id_mhs, String id_event_wajib) {
        this.id_mhs = id_mhs;
        this.id_event_wajib = id_event_wajib;
    }

    public String getId_mhs() {
        return id_mhs;
    }

    public void setId_mhs(String id_mhs) {
        this.id_mhs = id_mhs;
    }

    public String getId_event_wajib() {
        return id_event_wajib;
    }

    public void setId_event_wajib(String id_event_wajib) {
        this.id_event_wajib = id_event_wajib;
    }
    
}
