/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Collections;
import uk.ac.rgu.cm2100.Pizza;
import uk.ac.rgu.cm2100.Drink;
import uk.ac.rgu.cm2100.Side;
import uk.ac.rgu.cm2100.IOrder;        
import uk.ac.rgu.cm2100.IOrder;
import uk.ac.rgu.cm2100.IMenuItem;
import uk.ac.rgu.cm2100.PizzaTopping;
/*
 *
 * @author  Teo Kis (1804944)
 * Component 1 Part 1 - 08/11/2021
 */
public class Pizza implements IMenuItem {

    public Pizza(String name, Crust crust, PizzaTopping toppings) {
        this.toppings = (ArrayList<String>) Collections.EMPTY_LIST;
        this.name = name;
        this.crust = crust;
       
    }
    
    private String name;
    private Crust crust;
    
    private ArrayList<String> toppings;
    private int BASE_PRICE = 10;
    
    
    public PizzaTopping[] addToppings (PizzaTopping...toppings){
        toppings.addAll(Arrays.asList(PizzaTopping.class));
        
        //toppings = addAll(PizzaTopping.class);
       return toppings;
    }

    public Crust getCrust() {
        return crust;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    
    @Override
    public int getPrice() {
    return this.BASE_PRICE + PizzaTopping.price;    
    }

    
    @Override
    public String getDescription() {
       return name + this.BASE_PRICE + this.crust + this.toppings;    
    }
    
    public String toString(){
    return this.getDescription();
    }
    
    

    

    
    
    
    
    
    
    
   
    
    
}

