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
public class FizzBuzz {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        for (int x=min; x <= max; x++) {
            if(x%3==0 && x%5==0){
                System.out.println("FizzBuzz");
                continue;                
            }
            else if(x%3==0){
                System.out.println("Fizz");
                continue;
            } else if (x%5==0){
                System.out.println("Buzz");
                continue;
            }
            System.out.println(x);
        }
    }
}
