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
    
    private Order order;
    
    /**
     * Constructor voor Loan. Omdat een Loan niet zonder Member en Copy
     * kan, zijn deze direct als input voor de constructor vereist.
     * 
     * @param member het Member voor wie de Loan geldt
     * @param copy het Copy dat het Member heeft geleend
     * @param returnDate datum op welke het copy geretourneerd dient te worden.
     */
    public Order(Order order)
    {
        this.order = order;
    }
    
    /**
     * Accessor methode om het betrokken Member voor deze Order op te halen.
     * @return het betrokken Member
     */
    public Order getOrder()
    {
        return order;
    }
    
    /**
     * Accessor methode om het betrokken Copy voor deze Order op te halen.
     * @return het betrokken Copy
     */
    
    /**
     * Accessor methode om de retourdaum voor deze Order op te halen.
     * @return de retourdatum
     */
}