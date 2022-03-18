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

        public class Side implements IMenuItem {
        private String name;
        private int price;

    public Side(String name, int price) {
        this.name = name;
        this.price = price;
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

    @Override
    public String getDescription() {
        return name+price;
    }

   
      
   
}

