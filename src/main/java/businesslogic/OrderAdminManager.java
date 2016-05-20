/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;
import datastorage.GerechtDAO;
import datastorage.OrderDAO;
import domain.Gerecht;
import domain.Order;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author NickB
 */
public class OrderAdminManager {
    
    ArrayList<Gerecht> gerechten;
    private String orders;
    
    public OrderAdminManager()
    {
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
            
      public String findOrder()
    {   
        
        return orders;
    }
      
      public void saveGerecht(String Naam, double Prijs, String Recept, int Bereidingstijd){
      
          Gerecht g = new Gerecht(0, Naam, Prijs, Recept, Bereidingstijd);
          
          (new GerechtDAO()).saveGerecht(g);
      
      }
    
}
