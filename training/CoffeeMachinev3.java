/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jetbrains.training;

/**
 *
 * @author Edgar
 */
public class CoffeeMachinev3 {
    
    enum State{
       CHOOSING_ACTION, CHOOSING_COFFEE, FILLING_WATER, FILLING_MILK, FILLING_BEANS, FILLING_CUPS 
    }
    
    static State state = State.CHOOSING_ACTION;
    static int money=500;
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9; 

    static void imprimirEstado(){
        System.out.println("The coffee machine has:\n" +
                               water + " ml of water\n" +
                               milk + " ml of milk\n" +
                               beans + " g of coffee beans\n" +
                               cups + " disposable cups\n" +
                               "$" + money +" of money\n");
    }
    
    
    public static void main(String[] args) {
        imprimirEstado();
    }
    
}



