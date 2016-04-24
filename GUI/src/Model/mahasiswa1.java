/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Adrian G Nurcahyo
 */
public class mahasiswa1 extends Orang{
private ArrayList<Kelas> kel; 

    public mahasiswa1(String nama, String email, String noInduk, String alamat) {
        super(nama, email, noInduk, alamat);
        kel = new ArrayList();
    }

    public ArrayList<Kelas> getKel() {
        return kel;
    }

    public void setKel(ArrayList<Kelas> kel) {
        this.kel = kel;
    }
    
    
    


    
    
    
}
