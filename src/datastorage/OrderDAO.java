/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastorage;

import domain.Order;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;


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
    public Order findOrder(Order order)
    {
        ArrayList<Order> orders = new ArrayList<>();
        
        if(order != null)
        {
            // First open a database connnection
            DatabaseConnection connection = new DatabaseConnection();
            if(connection.openConnection())
            {
                // If a connection was successfully setup, execute the SELECT statement.
                
                ResultSet resultset = connection.executeSQLSelectStatement(
                    "SELECT * FROM bestelling");

                if(resultset != null)
                {
                    try
                    {
                        while(resultset.next())
                        {
                            // The value for the CopyID in the row is ignored
                            // for this POC: no Copy objects are loaded. Having the
                            // Loan objects without the Copy objects will do fine
                            // to determine whether the owning Member can be removed.
                        int orderIDFromDb = resultset.getInt("orderID");
                        int tafelIDFromDb = resultset.getInt("tafelID");
                        String omschrijvingFromDb = resultset.getString("omschrijving");

                        order = new Order(
                            orderIDFromDb,
                            tafelIDFromDb,
                            omschrijvingFromDb);
                        
                        

                            
                       }
                    }
                    catch(SQLException e)
                    {
                        System.out.println(e);
                   
                    }
                }
                // else an error occurred leave array list empty.

                // We had a database connection opened. Since we're finished,
                // we need to close it.
                connection.closeConnection();
            }
        }
        
        return order;
    }
}