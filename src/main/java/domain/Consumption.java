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
public class Consumption {
    
    private int consumptionID;
    private String name;
    private double price;
    private String recipe;
    private int preparationTime;
    
    
 
    public Consumption(int GerechtID,String Naam, double Prijs, String Recept, int Bereidingstijd)
    {
        this.consumptionID = GerechtID;
        this.name = Naam;
        this.price = Prijs;
        this.recipe = Recept;
        this.preparationTime = Bereidingstijd;
        
              
    }
    public int getGerechtID(){
        return consumptionID;
    }
    public void setGerechtID(int GerechtID){
        
    }
    
    public String getNaam(){
        return name;
    }
    public void setNaam(String Naam){
        this.name = Naam;
    }
    
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    
    public String getRecipe(){
        return recipe;
    }
    public void setRecipe (String recipe){
        this.recipe = recipe;
    }
    
    
    public int getPreparationTime(){
        return preparationTime;
    }
    public void setPreparationTime(int preparationTime){
        this.preparationTime = preparationTime;
    }
    
    public void print(){
    
    System.out.printf("naam = %s , recept = %s , prijs = %f , "
            + "bereidingstijd = %d\n", name,recipe,price,preparationTime);
    }
}
