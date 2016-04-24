/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Win7
 */
public class Kelas {
    private String idKelas;
    private dosen1 dosen;
    private matakuliah1 matakuliah;

    public Kelas(String idKelas, dosen1 dosen, matakuliah1 matakuliah) {
        this.idKelas = idKelas;
        this.dosen = dosen;
        this.matakuliah = matakuliah;
        
        
    }

    public String getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(String idKelas) {
        this.idKelas = idKelas;
    }

    public dosen1 getDosen() {
        return dosen;
    }

    public void setDosen(dosen1 dosen) {
        this.dosen = dosen;
    }

    public matakuliah1 getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(matakuliah1 matakuliah) {
        this.matakuliah = matakuliah;
    }

    @Override
    public String toString() {
        return "Kelas{" + "idKelas=" + idKelas + ", dosen=" + dosen + ", matakuliah=" + matakuliah + '}';
    }

    
    }
    
