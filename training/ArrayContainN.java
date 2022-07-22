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
public class ArrayContainN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
    
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        int number = scanner.nextInt();
        boolean flag = false;
        for (int num : array) {
            if (num == number){
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    } 
}
