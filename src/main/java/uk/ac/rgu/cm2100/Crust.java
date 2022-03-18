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
public enum Crust {
    ITALIAN,
    STUFFED,
    THICK,
    THIN;
    
    @Override
    public String toString(){
        return this.name().toLowerCase(); 

    }  
    
}
