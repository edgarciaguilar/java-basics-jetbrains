/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jetbrains.basics;
import java.util.*;
/**
 *
 * @author Edgar
 */
public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        int[][] arreglo = new int[valor][valor];
         for (int i = 0; i < valor; i++) {
             for (int j = 0; j < valor; j++) {
                arreglo[i][j] = j - i;
                System.out.print(Math.abs(j - i) + " ");
             }
             System.out.println();
        }
        
    }
    
}
