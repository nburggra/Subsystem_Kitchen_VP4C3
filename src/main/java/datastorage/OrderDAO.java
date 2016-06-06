/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastorage;

import domain.Consumption;
import domain.Order;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ppthgast
 */
public class OrderDAO
{
    public OrderDAO()
    {
        // Nothing to be initialized. This is a stateless class. Constructor
        // has been added to explicitely make this clear.
    }
    
    /**
     * Tries to find the loans for the given in the persistent data store, in
     * this case a MySQL database.In this POC, the lend copies of the books are
     * not loaded - it is out of scope for now.
     * 
     * @param member identifies the member whose loans are to be
     * loaded from the database
     * 
     * @return an ArrayList object containing the Loan objects that were found.
     * In case no loan could be found, still a valid ArrayList object is returned.
     * It does not contain any objects.
     */
   public ArrayList<Order> loadOrders() {
    
        ArrayList<Order> orderLijst = new ArrayList<>();
        
        DatabaseConnection connection = new DatabaseConnection();
            if(connection.openConnection())
            {
                // If a connection was successfully setup, execute the SELECT statement.
                
                        
                ResultSet resultset = connection.executeSQLSelectStatement(
                    "SELECT * FROM `ordercontent` WHERE `ConsumptionType` = 'Meal' ");
                
            try {
                while(resultset.next()){
                    
                    int orderID = resultset.getInt("OrderID");
                    String consumption = resultset.getString("Consumption");
                    String consumptionType =  resultset.getString("ConsumptionType");
                    String status = resultset.getString("Status");
                    
                    
                    // public Order(int bestellingID , int tafelID , String omschrijving , boolean Status)
                    Order o = new Order(orderID, consumption, consumptionType, status);
                    
                    orderLijst.add(o);
                    
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConsumptionDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

  
                connection.closeConnection();
            }
            
            return orderLijst;
    }
   
        public void changeOrderStatus(int orderId, String Status){
   
            DatabaseConnection connection = new DatabaseConnection();
            if(connection.openConnection())
            {
                // If a connection was successfully setup, execute the SELECT statement.
                
                String execStr = String.format("UPDATE `ordercontent` SET Status='%s'"
                        + " WHERE OrderID='%d'", Status, orderId);
                        
                // System.out.println(execStr);
                
                connection.executeSQLUpdateStatement(execStr);

                connection.closeConnection();
            }
   
   }
   
        public void insertIntoOrder(Order o){
            
            DatabaseConnection connection = new DatabaseConnection();
            if(connection.openConnection())
            {
               String execStr = String.format("INSERT INTO `ordercontent` "
                       + "(`OrderID`, `Consumption`, `ConsumptionType`, `Status`) "
                       + "VALUES ('%d', '%s', '%s', '%s')"
                       , o.getOrderID() , o.getConsumption() 
                       , o.getConsumptionType() , o.getStatus());
               
               connection.executeSQLInsertStatement(execStr);
               
               connection.closeConnection();
            }
        }
            
        public void deleteFromOrder(String consumption, int orderId){
             DatabaseConnection connection = new DatabaseConnection();
            if(connection.openConnection())
            {
               String execStr = String.format(
               "DELETE FROM `ordercontent` WHERE consumption='%s' AND OrderID='%d'"
               , consumption, orderId);
               
               connection.executeSQLDeleteStatement(execStr);
               
               connection.closeConnection();
                       
            }
        }
            
   
   
   }
   
   
   

 

