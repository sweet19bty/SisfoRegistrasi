/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Database.Database;
import java.util.ArrayList;
import java.util.Scanner;
import Model.dosen1;
import Model.Aplikasi;
import Model.mahasiswa1;
import Model.matakuliah1;

/**
 *
 * @author Win7
 */
public class Aplikasi {

    private ArrayList<Orang> orang;
    private ArrayList<matakuliah1> mk;
    private ArrayList<Kelas> kel;
    private ArrayList<dosen1> dsn;
    private ArrayList<mahasiswa1> mhs;
    dosen1 d;
    matakuliah1 mt;
    mahasiswa1 m;
    Database dbs;

    public Aplikasi() {
        dsn = new ArrayList<>();
        mk = new ArrayList<>();
        kel = new ArrayList<>();
        mhs = new ArrayList<>();
    }

    public void addMahasiswa(mahasiswa1 m) {
        mhs.add(m);
    }

    public ArrayList<dosen1> getDosen() {
        return dsn;
    }
    
    public ArrayList<mahasiswa1> getMahasiswa (){
        return mhs;
    }

    public void deleteMahasiswa(mahasiswa1 m) {
        mhs.remove(m);
    }

    public void addMatakuliah(matakuliah1 m) {
        mk.add(m);
    }

    public ArrayList<matakuliah1> getMk() {
        return mk;
    }

    public void InputDosen(String nama, String email, String noInduk, String alamat) {
        dosen1 d1 = new dosen1(nama, email, noInduk, alamat);
        dsn.add(d1);
    }

    public Kelas SearchKelas(String input) {
        for (int i = 0; i < 5; i++) {
            if (input.equals(kel.get(i).getIdKelas())) {
                return kel.get(i);
            }
        }
        return null;
    }

    public mahasiswa1 SearchMahasiswa(String input2) {
        for (int i = 0; i < 5; i++) {
            if (input2.equals(m.getNoInduk())) {
                return mhs.get(i);
            }
        }
        return null;
    }

    public dosen1 SearchDosen(String input3) {
        for (int i = 0; i < 5; i++) {
            if (input3.equals(d.getNoInduk())) {
                return dsn.get(i);
            }
        }
        return null;
    }

    public String SearchMatakuliah(String input4) {
        for (int i = 0; i < 5; i++) {
            if (input4.equals(m.getNoInduk())) {
                return m.getNoInduk();
            }
        }
        return null;
    }

    public void SaveDataDosen(ArrayList<dosen1> d) {
        dbs.SaveDataDosen(d);
    }

    public ArrayList<dosen1> LoadDataDosen() {
        return dbs.LoadDosen();
    }

    public void InputMatakuliah(String idMatakuliah, String nama) { //InputMatakuliah
        matakuliah1 m1 = new matakuliah1(idMatakuliah, nama);
        mk.add(mt);
    }

    public Kelas InputKelas(String idKelas, dosen1 dosen, matakuliah1 matakuliah) { //inputKelas
        Kelas k = new Kelas(idKelas, dosen, matakuliah);
        return k;
    }

    public void HapusKelas(String b, int i) { //HapusKelas
        kel.remove(SearchKelas(b));
    }

    public void ViewKelas(String c, int i) { //ViewKelas
        for (Kelas k : kel) {
            System.out.println(k);
        }
    }

    public void inputMahasiswa(String nama, String email, String noInduk, String alamat) {
        mahasiswa1 m = new mahasiswa1(nama, email, noInduk, alamat);
        orang.add(m);
    }

    public void ViewMahasiswa() {
        for (Orang o : orang) {
            if (o instanceof mahasiswa1) {
                System.out.println(o);
            }
        }
    }

    public void mainMenu() {
        Scanner ahiy = new Scanner(System.in);
        String dosen, mahasiswa, matakuliah;
        int menu;

        System.out.println("Registrasi Mata Kuliah");
        System.out.println("1. Input Dosen");
        System.out.println("2. Input Mahasiswa");
        System.out.println("3. Input Matakuliah");
        System.out.println("4. Input Kelas");
        System.out.println("5. Hapus Kelas");
        System.out.println("6. View Kelas");
        System.out.println("7. View Data Mahasiswa");
        System.out.println("Masukan Pilihan : ");
        menu = ahiy.nextInt();
        switch (menu) {
            case 1:
                Scanner ahoy = new Scanner(System.in);
                System.out.println("Masukan kode : ");
                String noInduk = ahoy.nextLine();
                System.out.println("Masukan nama : ");
                String nama = ahoy.nextLine();
                System.out.println("Masukan alamat : ");
                String alamat = ahoy.nextLine();
                System.out.println("Masukan email : ");
                String email = ahoy.nextLine();
                InputDosen(nama, alamat, email, noInduk);
                break;

            case 2:
                Scanner ahay = new Scanner(System.in);
                System.out.println("Masukan Nama Mahasiswa : ");
                String namaMhs = ahay.nextLine();
                System.out.println("Masukan Email Mahasiswa : ");
                String emailMhs = ahay.nextLine();
                System.out.println("Masukan Nomor Induk Mahasiswa : ");
                String noIndukMhs = ahay.nextLine();
                System.out.println("Masukan Alamat Mahasiswa : ");
                String alamatMhs = ahay.nextLine();
                inputMahasiswa(namaMhs, emailMhs, noIndukMhs, alamatMhs);
                break;

            case 3:
                Scanner ahuy = new Scanner(System.in);
                String namaMK,
                 kodeMK,
                 kodeDosenMK,
                 namaDosen,
                 shift;
                System.out.println("Masukan Nama Mata Kuliah : ");
                namaMK = ahuy.nextLine();
                System.out.println("Masukan Kode Mata Kuliah : ");
                kodeMK = ahuy.nextLine();
                InputMatakuliah(kodeMK, namaMK);
                break;

            case 4:
                Scanner yoyoy = new Scanner(System.in);
                System.out.println("Masukkan Id Kelas : ");
                String idKelas = yoyoy.nextLine();
                System.out.println("Masukkan Id Dosen : ");
                String iddos = yoyoy.nextLine();
                String dos;
                //dos = 
                SearchDosen(iddos);
                System.out.println("");
                System.out.println("Masukkan Id Matakuliah : ");
                String idmk = yoyoy.nextLine();
                String matkul;
                matkul = SearchMatakuliah(idmk);
               // InputKelas(idKelas,dos,matkul);

        }

    }
}
