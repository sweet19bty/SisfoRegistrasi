/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.Awal;
import View.InputMahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Win7
 */
public class ControllerInputMahasiswa implements ActionListener {
    private Aplikasi Model;
    private InputMahasiswa inputMahasiswa;
    
    public ControllerInputMahasiswa(Aplikasi Model){
        this.Model = Model;
        inputMahasiswa = new InputMahasiswa();
        inputMahasiswa.setVisible(true);
        inputMahasiswa.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if(source.equals(inputMahasiswa.getBeranda())){
            inputMahasiswa.dispose();
            new Awal();
        }
        else if(source.equals(inputMahasiswa.getTambah())){
            if(inputMahasiswa.getNIM().equals(""));
            JOptionPane.showMessageDialog(null, "NIM tidak boleh kosong");
        }
        
    }
}
