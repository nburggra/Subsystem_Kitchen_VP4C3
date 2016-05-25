/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import datastorage.GerechtDAO;
import domain.Gerecht;
import java.util.ArrayList;

/**
 *
 * @author NickB
 */
public class GerechtAdminManager {
    
    ArrayList<Gerecht> gerechten;
    
        public GerechtAdminManager(){
        
        gerechten = (new GerechtDAO()).loadGerechten();
        
        
        
        }
        
            public Gerecht findGerecht(String name)
    {
        name = name.toLowerCase();
        Gerecht ge = null;
        for(Gerecht g : gerechten)
        {
            if (g.getNaam().toLowerCase().equals(name))
            {
                ge = g;
                break;
            }
        }
        
        return ge;
    }
            
    
          public void saveGerecht(String Naam, double Prijs, String Recept, int Bereidingstijd){
      
          Gerecht g = new Gerecht(0, Naam, Prijs, Recept, Bereidingstijd);
          
          (new GerechtDAO()).saveGerecht(g);
      
      }
}
