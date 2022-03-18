/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100;

import java.util.ArrayList;
import java.util.Collections;
import uk.ac.rgu.cm2100.Pizza;
import uk.ac.rgu.cm2100.Drink;
import uk.ac.rgu.cm2100.Side;
import uk.ac.rgu.cm2100.IOrder;        
import uk.ac.rgu.cm2100.IOrder;
import uk.ac.rgu.cm2100.IMenuItem;
import uk.ac.rgu.cm2100.PizzaTopping;
        
/**
 *
 * @author  Teo Kis (1804944)
 * Component 1 Part 1 - 08/11/2021
 */

public class Order implements IOrder {
    private ArrayList<String> items;

    public Order(ArrayList<String> items) {
        this.items = (ArrayList<String>) Collections.EMPTY_LIST;
    }
    
   
    @Override
    public void addItem(IMenuItem item){
        items.addAll(items);
    }
    
    public int total(IMenuItem price){
      return Pizza.price.sum;  
    }
    
    public void print(IMenuItem print){
      return "IMenuItem.item" + "/n ""+ "IMenuItem.price";
    }
    
    @Override
    public void writeToFile(){
    
    return Pizza.getDescription + "," + Drink.getDescription + ","+ Side.getDescription;
    }
    }   
    
    
    
        
         
 }
