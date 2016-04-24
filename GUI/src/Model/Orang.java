/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Win7
 */
public abstract class Orang {
    protected String nama;
    protected String email;
    protected String noInduk;
    protected String alamat;

    public Orang(String nama, String email, String noInduk, String alamat) {
        this.nama = nama;
        this.email = email;
        this.noInduk = noInduk;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoInduk() {
        return noInduk;
    }

    public void setNoInduk(String noInduk) {
        this.noInduk = noInduk;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return "Orang{" + "nama=" + nama + ", email=" + email + ", noInduk=" + noInduk + ", alamat=" + alamat + '}';
    }
    
}
