/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.ControllerAwal;
import Controller.ControllerMenuAwal;

/**
 *
 * @author Win7
 */
public class Driver {
    public static void main (String [] args){
        Aplikasi ap = new Aplikasi ();
        new ControllerMenuAwal(ap);
        //ap.mainMenu();
    }
    
}