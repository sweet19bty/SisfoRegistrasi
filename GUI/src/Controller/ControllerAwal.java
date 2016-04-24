/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Kelas;
import Model.Orang;
import Model.dosen1;
import Model.mahasiswa1;
import Model.matakuliah1;
import View.Awal;
import View.HapusKelas;
import View.InputDosen;
import View.InputKelas;
import View.InputMahasiswa;
import View.InputMatakuliah;
import View.ViewDataMahasiswa;
import View.ViewKelas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Win7
 */
public class ControllerAwal implements ActionListener {

    InputDosen id;
    Awal a;
    HapusKelas hk;
    InputKelas ik;
    InputMahasiswa im;
    ViewDataMahasiswa vdm;
    ViewKelas vk;
    Aplikasi Model;
    Object view;
    InputMatakuliah imk;
    ArrayList<dosen1> dsn;

    public ControllerAwal(Aplikasi Model) {
        this.Model = Model;
        Awal_awal();
//        a = new Awal();
//        a.addActionListener(this);
//        a.setVisible(true);
    }

    public void Awal_awal() {
        a = new Awal();
        a.setVisible(true);
        a.addActionListener((ActionListener) this);
        view = a;
    }

    public void InputDosen1() {
        id = new InputDosen();
        id.setVisible(true);
        id.addActionListener((ActionListener) this);
        view = id;

    }

    public void InputKelas1() {
        ik = new InputKelas();
        ik.setVisible(true);
        ik.addActionListener((ActionListener) this);
        view = ik;
    }

    public void InputMahasiswa1() {
        im = new InputMahasiswa();
        im.setVisible(true);
        im.addActionListener((ActionListener) this);
        view = im;
    }

    public void InputMatakuliah1() {
        imk = new InputMatakuliah();
        imk.setVisible(true);
        imk.addActionListener((ActionListener) this);
        view = imk;
    }

    public void ViewDataMahasiswa1() {
        vdm = new ViewDataMahasiswa();
        vdm.setVisible(true);
        vdm.addActionListener((ActionListener) this);
        view = vdm;
    }

    public void ViewKelas1() {
        vk = new ViewKelas();
        vk.setVisible(true);
        vk.addActionListener((ActionListener) this);
        view = vk;
    }

    public void HapusKelas1() {
        hk = new HapusKelas();
        hk.setVisible(true);
        hk.addActionListener((ActionListener) this);
        view = hk;
    }

//    public void ActionPerformanced(ActionEvent e) {
//        Object source = e.getSource();
//        if (view instanceof Awal) {
//            if (source.equals(a.getInputDosen())) {
//                InputDosen1();
//                a.dispose();
//            } else if (source.equals(a.getViewDataMahasiswa())) {
//                ViewDataMahasiswa1();
//                a.dispose();
//            } else if (source.equals(a.getInputMahasiswa())) {
//                InputMahasiswa1();
//                a.dispose();
//            } else if (source.equals(a.getInputKelas())) {
//                InputKelas1();
//                a.dispose();
//            } else if (source.equals(a.getViewKelas())) {
//                InputKelas1();
//                a.dispose();
//            } else if (source.equals(a.getHapusKelas())) {
//                HapusKelas1();
//                a.dispose();
//            }
//
//        }
//    }
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (view instanceof Awal) {
            if (source.equals(a.getInputDosen())) {
                new InputDosen();
                a.dispose();
            } else if (source.equals(a.getViewDataMahasiswa())) {
                ViewDataMahasiswa1();
                a.dispose();
            } else if (source.equals(a.getInputMahasiswa())) {
                InputMahasiswa1();
                a.dispose();
            } else if (source.equals(a.getInputKelas())) {
                InputKelas1();
                a.dispose();
            } else if (source.equals(a.getViewKelas())) {
                InputKelas1();
                a.dispose();
            } else if (source.equals(a.getHapusKelas())) {
                HapusKelas1();
                a.dispose();
            } else if (source.equals(a.getInputMataKuliah())) {
                InputMatakuliah1();
                a.dispose();
            }

        } else if (view instanceof ViewDataMahasiswa) {
            if (source.equals(vdm.getBeranda())) {
                Awal_awal();
                vdm.dispose();
            }
        } else if (view instanceof InputDosen) {
            if (source.equals(id.getBeranda())) {
                Awal_awal();
                id.dispose();
            } else if (source.equals(id.getTambah())) {
//                Model.getOrang().add(new dosen1(id.getNamaDosen(), id.getEmailDosen(), id.getNomorInduk(), id.getAlamatDosen()));

            }
        } else if (view instanceof InputKelas) {
            if (source.equals(ik.getBeranda())) {
                Awal_awal();
                ik.dispose();
            }
        } else if (view instanceof ViewDataMahasiswa) {
            if (source.equals(vdm.getBeranda())) {
                Awal_awal();
                vdm.dispose();
            }
        } else if (view instanceof ViewKelas) {
            if (source.equals(vk.getBeranda())) {
                Awal_awal();
                vk.dispose();
            }
        } else if (view instanceof HapusKelas) {
            if (source.equals(hk.getBeranda())) {
                Awal_awal();
                hk.dispose();
            }
        } else if (view instanceof InputMahasiswa) {
            if (source.equals(im.getBeranda())) {
                Awal_awal();
                im.dispose();
            } else if (source.equals(im.getTambah())) {
               // Model.getOrang().add(new mahasiswa1(im.getNamaMahasiswa(), im.getEmailMahasiswa(), im.getNIM(), im.getAlamat()));

            }

        } else if (view instanceof InputMatakuliah) {
            if (source.equals(imk.getBeranda())) {
                Awal_awal();
                imk.dispose();

            } else if (source.equals(imk.getTambah())) {
                Model.getMk().add(new matakuliah1(imk.getIdMatakuliah(), imk.getNama()));

            }

        }
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void actionPerformedInputDosen(ActionEvent e) {
        Object source = e.getSource();

        if (source.equals(id.getBeranda())) {
            id.dispose();
            new Awal();
        }
        if (source.equals(id.getTambah())) {
            if (id.getNamaDosen().equals("")) {
                JOptionPane.showMessageDialog(null, "Nama Tidak boleh Koosong");
            }
            if (id.getNomorInduk().equals("")) {
                JOptionPane.showMessageDialog(null, "No induk Tidak boleh Koosong");
            }
            if (id.getEmailDosen().equals("")) {
                JOptionPane.showMessageDialog(null, "email Tidak boleh Koosong");
            }
            if (id.getAlamatDosen().equals("")) {
                JOptionPane.showMessageDialog(null, "AlamatTidak boleh Koosong");
            }
            else {
                String nama = id.getNamaDosen();
                String email = id.getEmailDosen();
                String NIP = id.getNomorInduk();
                String alamat = id.getAlamatDosen();
                Model.InputDosen(nama, email, NIP, alamat);
                
                dsn = Model.getDosen();
                Model.SaveDataDosen(dsn);
                id.dispose();
                new Awal();
                
                }
            }
        }



    }
