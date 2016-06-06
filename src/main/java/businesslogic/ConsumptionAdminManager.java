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
    
    ArrayList<Consumption> consumptions;
    
        public ConsumptionAdminManager(){
        
        consumptions = (new ConsumptionDAO()).loadConsumptions();
        
        
        
        }
        
            public Consumption findConsumption(String name)
    {
        name = name.toLowerCase();
        Consumption ge = null;
        for(Consumption g : consumptions)
        {
            if (g.getNaam().toLowerCase().equals(name))
            {
                ge = g;
                break;
            }
        }
        
        return ge;
    }
            
    
          public void saveConsumption(String name, double price, String recipe, int preparationTime){
      
          Consumption g = new Consumption(0, name, price, recipe, preparationTime);
          
          (new ConsumptionDAO()).saveConsumption(g);
      
      }
}
