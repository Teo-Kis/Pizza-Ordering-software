package uk.ac.rgu.cm2100;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import uk.ac.rgu.cm2100.IMenuItem;

/**
 *
 * @author  Teo Kis (1804944)
 * Component 1 Part 1 - 08/11/2021
 */
public class Drink implements IMenuItem {
    private String name;
    private int price;
    private boolean alcohol;

    public Drink(String name, int price, boolean alcohol) {
        this.name = name;
        this.price = price;
        this.alcohol = alcohol;
    }
            
    public String toString(){
        return this.getDescription();
    }
    
    @Override
    public int getPrice() {
     return price;
        }

    @Override
    public String getDescription() {
       return name + price + alcohol; 
    }

    @Override
    public String getName() {
        return name;
    }
    
}
