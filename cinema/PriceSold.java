/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jetbrains.cinema;
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class PriceSold {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        int res=0;
        if (rows * seats <= 60){
            res = rows * seats * 10;
        } else {
            if (rows%2==0){
                res = ((rows/2)*10*seats)+((rows/2)*8*seats);
            }else{
                res = ((rows/2)*10*seats)+((rows/2+1)*8*seats);
            }
        }
        System.out.println("Total income:\n"+"$"+res);
    }
    
}
