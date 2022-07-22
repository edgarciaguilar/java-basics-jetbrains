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
public class Collatz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        //int temp=0;
        if (num==1){
            System.out.print(num);            
        }else{
            System.out.print(num+" ");
        do{
            if(num%2==0){
                num=num/2;
            }else{
                num=num*3+1;                
            }
           // System.out.print(num%2==0 ? num=num/2 : num=num*3+1);
            System.out.print(num+" ");
        }while(num != 1);
        }
    }
}
