/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jetbrains.training;
import java.util.Scanner;
/**
 *
 * @author Edgar
 */
public class CoffeeMachinev1 {
    
    static int water=400;
    static int milk=540;
    static int beans=120;
    static int cups=9;
    static int money=550;
    
    static void message(){
            System.out.println("\nThe coffee machine has:\n" +
                               water + " ml of water\n" +
                               milk + " ml of milk\n" +
                               beans + " g of coffee beans\n" +
                               cups + " disposable cups\n" +
                               "$" + money +" of money\n");        
    }
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            message();

            System.out.println("Write action (buy, fill, take):");
            String resp = scanner.nextLine();
            switch (resp) {
                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    water += scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    milk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    beans += scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee you want to add: ");
                    cups += scanner.nextInt();
                    message();
                    break;
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    int option = scanner.nextInt();
                    if (option == 1) {
                        water -=250;
                        beans-=16;
                        money+=4;
                        cups--;
                        message();
                    } else if (option == 2) {
                        water -=350;
                        milk-=75;
                        beans-=20;
                        money+=7;
                        cups--;  
                        message();
                    } else {
                        water -=200;
                        milk-=100;
                        beans-=12;
                        money+=6;
                        cups--; 
                        message();
                    }
                    break;
                case "take":
                    System.out.println("I gave you $"+money+"\n");
                    money=0;
                    message();  
                    break;                  
            }             
    }
}
