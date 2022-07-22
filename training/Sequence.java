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
public class Sequence {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int tope = scanner.nextInt();
        boolean bandera = false;
        int cont=0;
        if (tope ==1){
            System.out.print("1");
        } else if(tope==2){
            System.out.print("1 2");
        } else {
        for (int i = 1; i < tope; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
                cont++;
                if (tope == cont){
                    bandera = true;
                    break;
                }
            }
            if (bandera){
                break;
            }
        }
        }*/
        //System.out.println(cont);
        /*3
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean flag = false;
        int x = -1;
        for (int i = 1; i < n; i++) {
            int count = 0;
            while (i > count) {
                x++;
                if (x == n) {
                    flag = true;
                    break;
                } else {
                    System.out.print(i);
                    count++;
                }
            }
            if (flag == true) {
                break;
            }
        }
*/
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int value = scanner.nextInt();
        int counter = 0;
        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= i; j++) {
                counter += 1;
                if (counter <= value) {
                    System.out.print(i + " ");
                }
            }
        }
    }
    
}
