/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100;

/*
 *
 * @author  Teo Kis (1804944)
 * Component 1 Part 1 - 08/11/2021
 */
public class PizzaTopping {

    String pepperoni;
    String tomato;
    String cheese;
    String veggies;
    
    /**
     *
     * @param name
     * @param price
     */
    public PizzaTopping(String name, int price) {
        this.name = name;
        this.price = price;
        
        System.out.println(name+price);
    }

     String name;
     int price;
    
  
    @Override
    public String toString(){
        return name + " ";
      
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
   
}
