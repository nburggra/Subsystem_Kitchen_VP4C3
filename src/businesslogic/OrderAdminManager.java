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
    
    private String orders;
    
    

    
      public String findOrder()
    {   
        
        return orders;
    }
      
      public void saveGerecht(String Naam, double Prijs, String Recept, int Bereidingstijd){
      
          Gerecht g = new Gerecht(0, Naam, Prijs, Recept, Bereidingstijd);
          
          (new GerechtDAO()).saveGerecht(g);
      
      }
    
}
