/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastorage;

import domain.Consumption;
import domain.Order;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sven
 */
public class ConsumptionDAO {
   public ConsumptionDAO()    {
        // Nothing to be initialized. This is a stateless class. Constructor
        // has been added to explicitely make this clear.
    }
    
    public void saveConsumption(Consumption consumption)
    { 
        if(consumption != null)
        {
            // First open a database connnection
            DatabaseConnection connection = new DatabaseConnection();
            if(connection.openConnection())
            {
                try 
                {
                    PreparedStatement prest;

                    // If a connection was successfully setup, execute the SELECT statement.
                    String s = String.format("INSERT INTO consumption (ConsumptionName,ConsumptionPrice,"
                            + "ConsumptionTime) VALUES('%s','%f','%d');", 
                            consumption.getNaam(), consumption.getPrice(), 
                                                    consumption.getPreparationTime());

                    prest = connection.getConnection().prepareStatement(s, 
                            Statement.RETURN_GENERATED_KEYS);

                    prest.executeUpdate();
                    
                    ResultSet resultset = prest.getGeneratedKeys();


                    while(resultset.next()){

                        // returned generate consumptionID from previous query
                       int consumptionId = resultset.getInt(1);


                        String execStr = String.format("INSERT INTO consumption_product("
                                + "ConsumptionID, Description) "
                                + "VALUES('%d','%s')", consumptionId, 
                                consumption.getRecipe());
                        connection.executeSQLInsertStatement(execStr);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ConsumptionDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public ArrayList<Consumption> loadConsumptions() {
    
        ArrayList<Consumption> consumptions = new ArrayList<>();
        
        DatabaseConnection connection = new DatabaseConnection();
            if(connection.openConnection())
            {
                // If a connection was successfully setup, execute the SELECT statement.
                
                        
                ResultSet resultset = connection.executeSQLSelectStatement(
                    "SELECT * FROM recipe;");
                
            try {
                while(resultset.next()){
                    
                    int consumptionID = resultset.getInt("ConsumptionID");
                    String name = resultset.getString("ConsumptionName");
                    double price =  resultset.getDouble("ConsumptionPrice");
                    int preparationTime = resultset.getInt("ConsumptionTime");
                    String recipe = resultset.getString("Description");
                   
                    
                    // int GerechtID,String Naam, double Prijs, String Recept, int Bereidingstijd
                    Consumption g = new Consumption(consumptionID, name, price, recipe, preparationTime);
                    
                    consumptions.add(g);
                    
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConsumptionDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

  
                connection.closeConnection();
            }
            
            return consumptions;
    }
} 