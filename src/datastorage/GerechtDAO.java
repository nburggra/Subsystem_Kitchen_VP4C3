/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastorage;

import domain.Gerecht;
import domain.Order;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Sven
 */
public class GerechtDAO {
   public GerechtDAO()    {
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
    public Gerecht addGerecht(Gerecht gerecht)
    {
        
        
        if(gerecht != null)
        {
            // First open a database connnection
            DatabaseConnection connection = new DatabaseConnection();
            if(connection.openConnection())
            {
                // If a connection was successfully setup, execute the SELECT statement.
                
                        
                ResultSet resultset = connection.executeSQLSelectStatement(
                    "INSERT INTO gerecht (Naam,Prijs,Recept,Bereidgstijd) VALUES('')");

  
                connection.closeConnection();
            }
        }
        
       return gerecht; 
    }
} 