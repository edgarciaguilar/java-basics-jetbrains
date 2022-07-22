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
public class CoffeeMachinev2 {
    
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
        boolean flag = true;
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String opcion=scanner.nextLine();       
            switch(opcion) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String option = scanner.nextLine();
                    double waterCups = 0;
                    double milkCups = 0;
                    double beansCups = 0;                   
                    if (option.equals("1")) {
                        waterCups =  Math.floor(water / 250);
                        milkCups = Math.floor(milk / 540);
                        beansCups = Math.floor(beans / 16);
                        if (waterCups < 1){
                            System.out.println("Sorry, not enough water!\n");
                        } else if (milkCups < 1) {
                            System.out.println("Sorry, not enough milk!\n");
                        } else if (beansCups < 1) {
                            System.out.println("Sorry, not enough coffee beans!\n");
                        } else {
                            System.out.println("I have enough resources, making you a coffee!\n");
                            water -=250;
                            beans-=16;
                            cups--;
                            money += 4;
                        }
                    }
                    if (option.equals("2")) {
                        waterCups =  Math.floor(water / 350);
                        milkCups = Math.floor(milk / 75);
                        beansCups = Math.floor(beans / 20);
                        if (waterCups < 1){
                            System.out.println("Sorry, not enough water!\n");
                        } else if (milkCups < 1) {
                            System.out.println("Sorry, not enough milk!\n");
                        } else if (beansCups < 1) {
                            System.out.println("Sorry, not enough coffee beans!\n");
                        } else {
                            System.out.println("I have enough resources, making you a coffee!\n");
                            water -=350;
                            milk-=75;
                            beans-=20;
                            cups--;
                            money += 4;
                        }                                            
                    }
                    if (option.equals("3")) {
                        waterCups =  Math.floor(water / 200);
                        milkCups = Math.floor(milk / 100);
                        beansCups = Math.floor(beans / 12);
                        if (waterCups < 1){
                            System.out.println("Sorry, not enough water!\n");
                        } else if (milkCups < 1) {
                            System.out.println("Sorry, not enough milk!\n");
                        } else if (beansCups < 1) {
                            System.out.println("Sorry, not enough coffee beans!\n");
                        } else {
                            System.out.println("I have enough resources, making you a coffee!\n");
                            water -=200;
                            milk-=100;
                            beans-=12;
                            cups--;
                            money += 4;
                        }                                           
                    }
                    if (option.equals("back")) {
                    
                    }
                    break;
                case "fill":
                    System.out.println("\nWrite how many ml of water you want to add:");
                    water += scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    milk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    beans += scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee you want to add: ");
                    cups += scanner.nextInt();
                    //message();               
                    break;    
                case "take":
                    System.out.println("\nI gave you " + money + "\n");
                    money=0;
                    break;                   
                case "remaining":
                    message();
                    break;
                case "exit":
                    flag = false;
                    break;
                default:
                    break;
            }
        }while(flag);   
    }
}
