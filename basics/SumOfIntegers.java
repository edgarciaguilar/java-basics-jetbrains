/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jetbrains.basics;
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        String str = Integer.toString(numero);
        int sum=0;
        for (int n = 0; n <str.length (); n ++) {
            sum+=Character.getNumericValue(str.charAt(n)); 
        }
        System.out.println("total: "+sum);
    }
    
}
