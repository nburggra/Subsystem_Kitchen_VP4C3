/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastorage;

import domain.Consumption;
import domain.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NickB
 */
public class UserDAO {
    
   
    public ArrayList<User> loadUsers() {
    
        ArrayList<User> accountInfo = new ArrayList<>();
        
        DatabaseConnection connection = new DatabaseConnection();
            if(connection.openConnection())
            {
                // If a connection was successfully setup, execute the SELECT statement.
                
                        
                ResultSet resultset = connection.executeSQLSelectStatement(
                    "SELECT username , password FROM user;");
                
            try {
                while(resultset.next()){
                    
                    String name = resultset.getString("username");
                    String password = resultset.getString("password");
      
                    
                    // int GerechtID,String Naam, double Prijs, String Recept, int Bereidingstijd
                    User us = new User(name, password);
                    
                    accountInfo.add(us);
                    
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

  
                connection.closeConnection();
            }
            
            return accountInfo;
    }
    
    
    
}
