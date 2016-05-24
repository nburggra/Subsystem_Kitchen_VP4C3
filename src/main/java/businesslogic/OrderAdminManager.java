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
    
    private OrderDAO orderDAO = new OrderDAO();
    ArrayList<Order> orderLijst;

    public ArrayList<Order> getOrderLijst() {
        return orderLijst;
    }
    
    private String orders;
    
    public OrderAdminManager()
    {

        orderLijst = new ArrayList<>();
        
        //   public Order(int bestellingID , int tafelID , String omschrijving , boolean status)
        orderLijst.add( new Order(1,3,"Pizza","Received") );
        orderLijst.add( new Order(2,4,"salade","Received") );
        orderLijst.add( new Order(3,2,"toetje","Received") );
        orderLijst.add( new Order(4,1,"soep","Received") );
    }
    


            
      public String findOrder()
    {   
      
        orderDAO.loadOrder();
        
        return orders;
    }
    
    
}
