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
public class ProductOfNumbersFromAtoB {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write how many ml of water the coffee machine has:");
            int waterTank = scanner.nextInt();
            System.out.println("Write how many ml of milk the coffee machine has:");
            int milkTank = scanner.nextInt();
            System.out.println("Write how many grams of coffee beans the coffee machine has:");
            int beansTank = scanner.nextInt();
            System.out.println("Write how many cups of coffee you will need:");
            int cups = scanner.nextInt(); 
            int water = (int) Math.floor(waterTank / 200);
            int milk = (int) Math.floor(milkTank / 50);
            int beans = (int) Math.floor(beansTank / 15);
            int smallest = 0;
            smallest = water <= milk ? water : milk;
            smallest = smallest <= beans ? smallest : beans;
            int waste = smallest - cups;
            if (waste == 0) {
                System.out.println("Yes, I can make that amount of coffee");
            } else if (waste > 0) {
                System.out.println("Yes, I can make that amount of coffee (and even " + waste + " more than that)");
            } else {
                System.out.println("No, I can make only " + smallest + " cup(s) of coffee");
            }         
    }
    }    

