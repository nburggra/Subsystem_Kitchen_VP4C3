/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author ppthgast
 */
public class Order {
    
    private int orderID;
    private String consumption;
    private String consumptionType;
    private String status;
    
    /**
     * Constructor voor Loan. Omdat een Loan niet zonder Member en Copy
     * kan, zijn deze direct als input voor de constructor vereist.
     * 
     * @param member het Member voor wie de Loan geldt
     * @param copy het Copy dat het Member heeft geleend
     * @param returnDate datum op welke het copy geretourneerd dient te worden.
     */
    public Order(int orderID, String consumption, String consumptionType , String status)
    {
        this.orderID = orderID;
        this.consumption = consumption;
        this.consumptionType = consumptionType;
        this.status = status;
        
    }
    
    
        public int getOrderID(){
        
            
            return orderID;
        }
        
        public void setOrderID(int orderID){
        
            this.orderID = orderID;
        }
        
        
        public String getConsumption(){
        
            return consumption;
        }
        
        public void setConsumption(String consumption){
        
            this.consumption = consumption;
        }
        
        public String getConsumptionType(){
        
            return consumptionType;
        }
        
        public void setConsumptionType(String consumptionType){
        
            this.consumptionType = consumptionType;
        }
        
        public String getStatus(){ 
            
            return status; 
        }
        
        
        
        public void setStatus(String status){
        
            this.status = status;
        }
        
        
        
    
    /**
     * Accessor methode om het betrokken Member voor deze Order op te halen.
     * @return het betrokken Member
     */

    

    /**
     * Accessor methode om het betrokken Copy voor deze Order op te halen.
     * @return het betrokken Copy
     */
    
    /**
     * Accessor methode om de retourdaum voor deze Order op te halen.
     * @return de retourdatum
     */
}