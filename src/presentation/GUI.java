/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import businesslogic.OrderAdminManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author NickB
 */
public class GUI extends JPanel{

     
    public JTextField  inputVakNaam, inputVakNr, inputVakPrijs, inputVakTijd;
    public JTextArea outputVak;
    private JLabel labelNaam, labelNr, labelPrijs, labelTijd;
    private JButton knopToevoegen, knopZoekNaam, knopZoekNr;

    private OrderAdminManager orderAdminManager;
    
    public GUI() {
    
        setLayout( null );
        
        orderAdminManager = new OrderAdminManager();
        
        inputVakNaam = new JTextField(32);
        inputVakNr = new JTextField(4);
        inputVakPrijs = new JTextField(5);
        inputVakTijd = new JTextField(3);
        outputVak = new JTextArea();
        
        
        labelNaam = new JLabel("Naam gerecht");
        labelNr = new JLabel("Product ID");
        labelPrijs = new JLabel("Prijs");
        labelTijd = new JLabel("ber. tijd");
        
        knopToevoegen = new JButton("Gerecht toevoegen");
        knopZoekNaam = new JButton("Zoek op naam");
        knopZoekNr = new JButton("Update Bestelling");
        
        add(inputVakNaam);
        add(inputVakNr);
        add(inputVakPrijs);       
        add(inputVakTijd);
        add(outputVak);

        
        add(labelNaam);
        add(labelNr);
        add(labelPrijs);
        add(labelTijd);
        
        add(knopToevoegen);
        add(knopZoekNaam);
        add(knopZoekNr);
        
        inputVakNaam.setBounds(110,40,80,20);
        inputVakNr.setBounds(110,70,80,20);
        inputVakPrijs.setBounds(250,40,80,20);
        inputVakTijd.setBounds(250,70,80,20);
        
        outputVak.setBounds(20,120,340,80);
        
        labelNaam.setBounds(20,40,80,20);
        labelNr.setBounds(20,70,80,20);
        labelPrijs.setBounds(200,40,80,20);
        labelTijd.setBounds(200,70,80,20);
        
        knopToevoegen.setBounds(10,230,120,20);
        knopZoekNaam.setBounds(130,230,120,20);
        knopZoekNr.setBounds(250,230,120,20);
        
        knopToevoegen.addActionListener( new KnopToevoegenHandler() );
        knopZoekNaam.addActionListener( new KnopZoekNaamHandler() );
        knopZoekNr.addActionListener( new KnopZoekNrHandler() );
    }
    
     class KnopToevoegenHandler implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            
            String naam = inputVakNaam.getText();
            //inputVakNr.getText();
            double prijs = Double.parseDouble(inputVakPrijs.getText());
            int tijd = Integer.parseInt(inputVakTijd.getText());
            String gerecht = "temp"; 
                    
            orderAdminManager.saveGerecht(naam, prijs, gerecht, tijd);
            
            inputVakNaam.setText(" ");
            inputVakNr.setText(" ");
            inputVakPrijs.setText(" ");
            inputVakTijd.setText(" ");
            
            

        }
    }
     class KnopZoekNaamHandler implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            
            inputVakNaam.setText(" ");
            inputVakNr.setText(" ");
            inputVakPrijs.setText(" ");
            inputVakTijd.setText(" ");

        }
    }
     class KnopZoekNrHandler implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            
            outputVak.setText("" + orderAdminManager.findOrder());

        }
    }
}
