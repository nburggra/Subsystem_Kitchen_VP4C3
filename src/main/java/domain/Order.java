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
    
    private int bestellingID;
    private int tafelID;
    private String omschrijving;
    private boolean status;
    
    /**
     * Constructor voor Loan. Omdat een Loan niet zonder Member en Copy
     * kan, zijn deze direct als input voor de constructor vereist.
     * 
     * @param member het Member voor wie de Loan geldt
     * @param copy het Copy dat het Member heeft geleend
     * @param returnDate datum op welke het copy geretourneerd dient te worden.
     */
    public Order(int bestellingID , int tafelID , String omschrijving , boolean status)
    {
        this.bestellingID = bestellingID;
        this.tafelID = tafelID;
        this.omschrijving = omschrijving;
    }
    
    
        public int getBestellingID(){
        
            
            return bestellingID;
        }
        
        public void setBestellingID(int bestellingID){
        
            this.bestellingID = bestellingID;
        }
        
        public int getTafelID(){
        
            return tafelID;
        }
        
        public void setTafelID(int tafelID){
        
            this.tafelID = tafelID;
        }
        
        public String getOmschrijving(){
        
            return omschrijving;
        }
        
        public void setOmschrijving(String omschrijving){
        
            this.omschrijving = omschrijving;
        }
        
        public boolean getStatus(){ return status; }
        
        public void setStatus(){}
        
        
        
    
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