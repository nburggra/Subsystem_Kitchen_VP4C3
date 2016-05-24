/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import businesslogic.GerechtAdminManager;
import businesslogic.OrderAdminManager;
import domain.Gerecht;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author NickB
 */

/*
 *  Inactive class 
 *  GUI2 now active
 * 
 */

public class GUIunactive extends JPanel{

    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelList;
    private javax.swing.JPanel jPanelInsert;
    private javax.swing.JPanel jPanelSettings;
    private javax.swing.JTabbedPane tabLogin , tabList , tabInsert , tabSettings;
    
    
    public JTextField  inputVakNaam, inputVakNr, inputVakPrijs, inputVakTijd;
    public JTextArea outputVak;
    private JLabel labelNaam, labelNr, labelPrijs, labelTijd;
    private JButton knopToevoegen, knopZoekNaam, knopZoekNr;

    private OrderAdminManager orderAdminManager;
    private GerechtAdminManager gerechtAdminManager = new GerechtAdminManager();
    
    public GUIunactive() {
    
        setLayout( null );
        
        orderAdminManager = new OrderAdminManager();
        
        tabLogin = new JTabbedPane();
        
        tabList = new JTabbedPane();
        tabInsert = new JTabbedPane();
        tabSettings = new JTabbedPane();
        
        jPanelLogin = new JPanel();
        jPanelList = new JPanel();
        jPanelInsert = new JPanel();
        jPanelSettings = new JPanel();
        
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
        
        tabLogin.addTab("Login", jPanelLogin);
        tabList.addTab("Lijst", jPanelList);
        tabInsert.addTab("Gerecht toevoegen", jPanelInsert);
        tabSettings.addTab("Instellingen", jPanelSettings);
        
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
        
        add(tabLogin);
        add(tabList);
        add(tabInsert);
        add(tabSettings);
        
        
        
        
        
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
        knopZoekNr.addActionListener( new RefreshHandler() );
    }
    
     class KnopToevoegenHandler implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            
            String naam = inputVakNaam.getText();
            //inputVakNr.getText();
            try
            {
                double prijs = Double.parseDouble(inputVakPrijs.getText());
                int tijd = Integer.parseInt(inputVakTijd.getText());
                String gerecht = "temp"; 

                gerechtAdminManager.saveGerecht(naam, prijs, gerecht, tijd);

                setTextfieldsBlank();
            }
            catch(NumberFormatException nfe)
            {
                System.out.printf("exception");
                setTextfieldsBlank();
            }
            

        }
    }
     class KnopZoekNaamHandler implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            
            String nameInput = inputVakNaam.getText();
            Gerecht g = gerechtAdminManager.findGerecht(nameInput);
            
            if (g == null)
            {
                setTextfieldsBlank();
            }
            else
            {
                String txt = String.format("Naam: %s, ID: %d, Prijs: %f"
                        + ", Tijd: %d\n", g.getNaam(), g.getGerechtID(),
                        g.getPrijs(), g.getBereidingstijd());
                
                appendToOutputTextArea(txt);
            
            }
        }
    }

     public void appendToOutputTextArea(String txt)
     {
         outputVak.setText(outputVak.getText() + txt);
     }
    public void setTextfieldsBlank() {
        setTextFieldsText("","","","");
    }

    public void setTextFieldsText(String Naam, String Nr, String Prijs, 
            String Tijd) {
        inputVakNaam.setText(Naam);
        inputVakNr.setText(Nr);
        inputVakPrijs.setText(Prijs);
        inputVakTijd.setText(Tijd);
    }
     class RefreshHandler implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            
            orderAdminManager.findOrder();

        }
}
}
