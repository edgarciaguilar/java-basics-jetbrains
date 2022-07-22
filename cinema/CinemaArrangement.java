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
public class CinemaArrangement {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Cinema:");
//        System.out.println("  1 2 3 4 5 6 7 8");
//        for (int i = 1; i < 8; i++) {
//            System.out.println(i+" S S S S S S S S");
//        }
//        System.out.print("Cinema:");
//        int seats = 9;
//        int rows = 8;
//        for (int i = 0; i < rows; i++) {
//            System.out.println(" ");
//            if (i == 0) {
//                for (int j = 0; j < seats; j++) {
//                    if (j == 0) {
//                        System.out.print("  ");
//                    } else {
//                        System.out.print(j + " ");
//                    }
//                }
//            } else {
//                for (int j = 0; j <= seats - 1; j++) {
//                    if (j == 0) {
//                        System.out.print(i + " ");
//                    } else {
//                        System.out.print("S ");
//                    }
//                }
//            }
//        }
//        System.out.println("\n");
       System.out.println("Enter the number of rows:");
        int row_num = scan.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seat_num = scan.nextInt();
        String room[][] = new String[row_num][seat_num];
        int a = 1;
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int q = 1; q <= room[0].length; q++) {
            System.out.print(q + " ");
        }
        System.out.println("");
        for (int i = 0; i < room.length; i++) {
            System.out.print(a + " ");
            a++;
            for (int j = 0; j < room[i].length; j++) {
                room[i][j] = "S";
                System.out.print(room[i][j] + " ");
            }
            System.out.println();
        }
    }
}
