/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;
import datastorage.ConsumptionDAO;
import datastorage.OrderDAO;
import domain.Consumption;
import domain.Order;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author NickB
 */
public class OrderAdminManager {
    
    private OrderDAO orderDAO = new OrderDAO();
    
        public OrderAdminManager()
    {

        orderLijst = (new OrderDAO()).loadOrders();
        
        
        
        //   public Order(int bestellingID , int tafelID , String omschrijving , boolean status)
     //   orderLijst.add( new Order(1,3,"Pizza","Received") );
     //  orderLijst.add( new Order(2,4,"salade","Received") );
     //   orderLijst.add( new Order(3,2,"toetje","Received") );
     //  orderLijst.add( new Order(4,1,"soep","Received") );
        
     //  orderLijst = (new OrderDAO().loadOrders());
    }
    

    ArrayList<Order> orderLijst;

    public ArrayList<Order> getOrderLijst() {
        return orderLijst;
    }
    
    public void updateOrderStatus(String status, int orderId)
    {
        (new OrderDAO()).changeOrderStatus(orderId, status);
    }
    
    public void deleteFromOrder(String consumption, int orderId){
        
        (new OrderDAO()).deleteFromOrder(consumption, orderId);
    }
    
    public void refreshOrdersList()
    {
         orderLijst = (new OrderDAO()).loadOrders();
    }
    

    
   
    //private String orders;
    

                
    //  public String findOrder()
   // {   
      
   //     orderDAO.loadOrders();
        
     //   return orders;
   // }
    
    
}
