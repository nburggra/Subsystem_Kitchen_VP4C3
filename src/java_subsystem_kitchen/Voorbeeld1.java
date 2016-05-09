package java_subsystem_kitchen;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NickB
 */
public class JavaGUI extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   JFrame frame = new JavaGUI();
   frame.setSize( 400, 200);
   frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
   frame.setTitle( "Java GUI");
   frame.setContentPane( new FlowLayoutpaneel() );
   frame.setVisible(true);
    }
}

class FlowLayoutpaneel extends JPanel {
    private JTextField t1, t2, t3, t4, t5;
    
    public FlowLayoutpaneel() {
        t1 = new JTextField( "een", 20 );
        t2 = new JTextField( "twee", 20 );
        t3 = new JTextField( "drie", 20 );
        t4 = new JTextField( "vier", 20 );
        t5 = new JTextField( "vijf", 20 );
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        
    }
}