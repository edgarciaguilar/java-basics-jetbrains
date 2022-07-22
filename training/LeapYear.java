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
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "Leap" : "Regular");
        
        /*boolean condition = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (condition) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }   */ }
}
