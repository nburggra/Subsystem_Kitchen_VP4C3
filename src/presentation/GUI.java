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
public class GUI extends JPanel {

     }
    class Paneel extends JPanel { 
    public JTextField  inputVak1, inputVak2, inputVak3, inputVak4, inputVak5; 
    private JButton knop1;
    private JPanel paneelCenter;
    
    public Paneel() {
    setLayout( new BorderLayout() );
    
    paneelCenter = new JPanel();
    
    paneelCenter.setLayout( new GridLayout(5,1 ) );
    
    paneelCenter.add(knop1 = new JButton( "gerecht toevoegen" ));
    knop1.addActionListener(new Knop1Handler() );
    
                   
    }
     class Knop1Handler implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            
            inputVak1.setText(" ");
            inputVak2.setText(" ");
            inputVak3.setText(" ");
            inputVak4.setText(" ");
            inputVak5.setText(" ");
        }
    }
}
