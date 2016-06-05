/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import datastorage.UserDAO;
import domain.User;
import java.util.ArrayList;

/**
 *
 * @author NickB
 */
public class UserAdminManager {
    
    private UserDAO userDAO = new UserDAO();
    
    ArrayList<User> accountInfo;
    
    public UserAdminManager(){
    
        accountInfo = (new UserDAO()).loadUsers();
    
    }
    
    public User matchLogin(String name, String password){
    
        User li = null;
        
        for(User l : accountInfo){
        
        
            if(l.getName().equals(name) && l.getPassword().equals(password)){
            
                li = l;
                break;
                
            }
        }
        
        return li;
    }
}
