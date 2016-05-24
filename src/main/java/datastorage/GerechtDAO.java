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
import java.util.logging.Level;
import java.util.logging.Logger;

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
     * Tries to  the loans for the given in the persistent data store, in
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
    public Gerecht saveGerecht(Gerecht gerecht)
    {
        
        
        if(gerecht != null)
        {
            // First open a database connnection
            DatabaseConnection connection = new DatabaseConnection();
            if(connection.openConnection())
            {
                // If a connection was successfully setup, execute the SELECT statement.
                String s = String.format( "INSERT INTO gerechten (Naam,Prijs,"
                        + "Recept,Bereidingstijd) VALUES('%s','%f','%s','%d');", 
                        gerecht.getNaam(), gerecht.getPrijs(), 
                        gerecht.getRecept(), gerecht.getBereidingstijd());
                
                // System.out.print(s);
                
                ResultSet resultset = connection.executeSQLInsertStatement(s);

  
                connection.closeConnection();
            }
        }
        
       return gerecht; 
    }
    
    public ArrayList<Gerecht> loadGerechten() {
    
        ArrayList<Gerecht> gerechten = new ArrayList<>();
        
        DatabaseConnection connection = new DatabaseConnection();
            if(connection.openConnection())
            {
                // If a connection was successfully setup, execute the SELECT statement.
                
                        
                ResultSet resultset = connection.executeSQLSelectStatement(
                    "SELECT * FROM gerechten;");
                
            try {
                while(resultset.next()){
                    
                    int gerechtID = resultset.getInt("GerechtID");
                    String naam = resultset.getString("Naam");
                    double prijs =  resultset.getDouble("Prijs");
                    String recept = resultset.getString("Recept");
                    int bereidingstijd = resultset.getInt("Bereidingstijd");
                    
                    // int GerechtID,String Naam, double Prijs, String Recept, int Bereidingstijd
                    Gerecht g = new Gerecht(gerechtID, naam, prijs, recept, bereidingstijd);
                    
                    gerechten.add(g);
                    
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(GerechtDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

  
                connection.closeConnection();
            }
            
            return gerechten;
    }
} 