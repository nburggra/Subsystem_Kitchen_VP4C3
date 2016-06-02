/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import datastorage.ConsumptionDAO;
import domain.Consumption;
import java.util.ArrayList;

/**
 *
 * @author NickB
 */
public class ConsumptionAdminManager {
    
    ArrayList<Consumption> gerechten;
    
        public ConsumptionAdminManager(){
        
        gerechten = (new ConsumptionDAO()).loadGerechten();
        
        
        
        }
        
            public Consumption findGerecht(String name)
    {
        name = name.toLowerCase();
        Consumption ge = null;
        for(Consumption g : gerechten)
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
      
          Consumption g = new Consumption(0, Naam, Prijs, Recept, Bereidingstijd);
          
          (new ConsumptionDAO()).saveGerecht(g);
      
      }
}
