/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.Awal;
import View.InputDosen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Win7
 */
public class ControllerMenuAwal implements ActionListener {

    private Awal awal;
    private Aplikasi model;

    public ControllerMenuAwal(Aplikasi model) {
        this.model = model;
        awal = new Awal();
        awal.setVisible(true);
        awal.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(awal.getInputDosen())) {
            awal.dispose();
            new InputDosen();
            new ControllerInputDosen(model);
        }
        if (source.equals(awal.getInputMahasiswa())) {
            awal.dispose();
            new ControllerInputMahasiswa(model);

        }
    }
}
