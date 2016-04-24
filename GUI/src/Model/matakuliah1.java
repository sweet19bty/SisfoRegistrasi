/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Adrian G Nurcahyo
 */
public class matakuliah1  {
private String idMatakuliah;
private String nama;

    public matakuliah1(String idMatakuliah, String nama) {
        this.idMatakuliah = idMatakuliah;
        this.nama = nama;
    }

    public String getIdMatakuliah() {
        return idMatakuliah;
    }

    public void setIdMatakuliah(String idMatakuliah) {
        this.idMatakuliah = idMatakuliah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "matakuliah1{" + "idMatakuliah=" + idMatakuliah + ", nama=" + nama + '}';
    }



    
}
