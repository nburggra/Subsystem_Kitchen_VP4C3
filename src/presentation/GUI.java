/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author NickB
 */
public class GUI extends JPanel{

     
    public JTextField  inputVak1, inputVak2, inputVak3, inputVak4, inputVak5; 
    private JLabel input1, input2, input3, input4, input5;
    private JButton knop1;

    
    public GUI() {
    
        setLayout( null );
        
        inputVak1 = new JTextField( 10 );
        inputVak2 = new JTextField( 10 );
        inputVak3 = new JTextField( 10 );
        inputVak4 = new JTextField( 10 );
        
        input1 = new JLabel("Naam gerecht");
        input2 = new JLabel("Prijs");
        input3 = new JLabel("Recept");
        input4 = new JLabel("bereidingstijd");
        
        knop1 = new JButton("gerecht toevoegen");
        
        add(inputVak1);
        add(inputVak2);
        add(inputVak3);       
        add(inputVak4);

        
        add( input1);
        add( input2);
        add( input3);
        add( input4);
        
        add( knop1);
        
        input1.setBounds( 80, 50, 120, 20);
        inputVak1.setBounds( 180, 50, 90, 20);
        
        input2.setBounds( 80, 80, 120, 20);
        inputVak2.setBounds(180, 80, 90, 20);
        
        input3.setBounds( 80, 110, 120, 20);
        inputVak3.setBounds(180, 110, 90, 20);
        
        input4.setBounds( 80, 140, 120, 20);
        inputVak4.setBounds( 180, 140, 90, 20);
        
        knop1.setBounds( 80, 180, 150, 20);
        
     class Knop1Handler implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            
            inputVak1.setText(" ");
            inputVak2.setText(" ");
            inputVak3.setText(" ");
            inputVak4.setText(" ");

        }
    }
}
}