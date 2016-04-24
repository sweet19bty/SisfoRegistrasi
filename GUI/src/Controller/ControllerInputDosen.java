/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.dosen1;
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
public class ControllerInputDosen implements ActionListener {

    private Aplikasi Model;
    private Awal awal;
    private InputDosen inputDosen;
    ArrayList<dosen1> dsn;

    public ControllerInputDosen(Aplikasi Model) {
        this.Model = Model;
        inputDosen = new InputDosen();
        inputDosen.setVisible(true);
        inputDosen.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source.equals(inputDosen.getBeranda())) {
            inputDosen.dispose();
            new Awal();
        } 
        else if (source.equals(inputDosen.getTambah())) {
            if (inputDosen.getNamaDosen().equals("")) {
                JOptionPane.showMessageDialog(null, "Nama Tidak boleh Koosong");
            }
            if (inputDosen.getNomorInduk().equals("")) {
                JOptionPane.showMessageDialog(null, "No induk Tidak boleh Koosong");
            }
            if (inputDosen.getEmailDosen().equals("")) {
                JOptionPane.showMessageDialog(null, "email Tidak boleh Koosong");
            }
            if (inputDosen.getAlamatDosen().equals("")) {
                JOptionPane.showMessageDialog(null, "AlamatTidak boleh Koosong");
            } else {
                String nama = inputDosen.getNamaDosen();
                String email = inputDosen.getEmailDosen();
                String NIP = inputDosen.getNomorInduk();
                String alamat = inputDosen.getAlamatDosen();
                Model.InputDosen(nama, email, NIP, alamat);
            }
                dsn = Model.getDosen();
                Model.SaveDataDosen(dsn);
                inputDosen.dispose();
                new Awal();

           
        }
    }
}
