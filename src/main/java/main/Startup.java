


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import datastorage.GerechtDAO;
import domain.Gerecht;
import domain.Order;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Locale;

/**
 *
 * @author NickB
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.ENGLISH);
       
       ArrayList<Gerecht> vg = (new GerechtDAO()).loadGerechten();
       
       for(Gerecht g : vg){
       
       g.print();
       }
       
       Gerecht g = new Gerecht(007,"Voorbeeld7",5.50,"Voorbeeld7recept",6);
       
       (new GerechtDAO()).saveGerecht(g);
        
       JFrame Frame = new JFrame();
       Frame.setSize(500, 400);
       Frame.setDefaultCloseOperation(
       JFrame.EXIT_ON_CLOSE);    
       Frame.setTitle("Hartige Hap");
       Frame.setContentPane(new presentation.GUI4());
       Frame.setVisible(true);
       
 
       
       
    }
    
}
