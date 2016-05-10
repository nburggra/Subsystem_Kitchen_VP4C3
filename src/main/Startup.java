/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import domain.Order;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author NickB
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame Frame = new JFrame();
       Frame.setSize(400, 300);
       Frame.setDefaultCloseOperation(
       JFrame.EXIT_ON_CLOSE);    
       Frame.setTitle("Hartige Hap");
       Frame.setContentPane(new presentation.GUI());
       Frame.setVisible(true);
       
       
 
       
       
    }
    
}
