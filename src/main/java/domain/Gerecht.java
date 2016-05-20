/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Sven
 */
public class Gerecht {
    
    private int GerechtID;
    private String Naam;
    private double Prijs;
    private String Recept;
    private int Bereidingstijd;
    
    
 
    public Gerecht(int GerechtID,String Naam, double Prijs, String Recept, int Bereidingstijd)
    {
        this.GerechtID = GerechtID;
        this.Naam = Naam;
        this.Prijs = Prijs;
        this.Recept = Recept;
        this.Bereidingstijd = Bereidingstijd;
        
              
    }
    public int getGerechtID(){
        return GerechtID;
    }
    public void setGerechtID(int GerechtID){
        
    }
    
    public String getNaam(){
        return Naam;
    }
    public void setNaam(String Naam){
        this.Naam = Naam;
    }
    
    public double getPrijs(){
        return Prijs;
    }
    public void setPrijs(double Prijs){
        this.Prijs = Prijs;
    }
    
    public String getRecept(){
        return Recept;
    }
    public void setRecept (String Recept){
        this.Recept = Recept;
    }
    
    
    public int getBereidingstijd(){
        return Bereidingstijd;
    }
    public void setBereidingstijd(int Bereidingstijd){
        this.Bereidingstijd = Bereidingstijd;
    }
    
    public void print(){
    
    System.out.printf("naam = %s , recept = %s , prijs = %f , "
            + "bereidingstijd = %d\n", Naam,Recept,Prijs,Bereidingstijd);
    }
}
