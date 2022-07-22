/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jetbrains.cinema;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Edgar
 */
public class Tickets {

    public static String room[][] = null;

    public static void dibujarSala() {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row_num = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seat_num = scanner.nextInt();
        String room[][] = new String[row_num][seat_num];
        //dibujarSala();
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
        System.out.println("Enter a row number:");
        int rowNumber = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int seatNumber = scanner.nextInt();
        room[rowNumber - 1][seatNumber - 1] = "B";
        int res = 10;
        //int middle = row_num % 2 == 0?0:1;
        if (row_num * seat_num <= 60) {
            res = 10;
        } else if (rowNumber <= row_num /2 ){
            res = 10;
        } else {
            res = 8;
        }
        System.out.println("Ticket price: $" + res);
        //System.out.println("Filas pares: "+middle);
        System.out.println("Cinema:");

        System.out.print("  ");
        a = 1;
        for (int q = 1; q <= room[0].length; q++) {
            System.out.print(q + " ");
        }
        System.out.println("");
        for (int x = 0; x < room.length; x++) {
            System.out.print(x + 1 + " ");
            for (int y = 0; y < room[x].length; y++) {
                System.out.print(room[x][y] + " ");
            }
            System.out.println();

        }
    }
}
