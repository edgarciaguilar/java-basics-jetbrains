/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jetbrains.cinema;

/**
 *
 * @author Edgar
 */

import java.util.Arrays;
import java.util.Scanner;
public class Ticketsv2 {


    public static int determineSeatPrice(int rows, int seats, int chosenRow) {
        int totalSeats = rows * seats;
        if (totalSeats <= 60 || chosenRow <= rows / 2) {
            return 10;
        }
            return 8;
    }

    public static void printCinema(String[][] cinema) {
        System.out.println("\nCinema:");
        // Print Header Row
        System.out.print("  ");
        // Assuming all rows have the same number of seats
        // Checking first row as they should all be the same length
        for (int i = 0; i < cinema[0].length; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                    // Print Leading Number for Each Row
                    if (j == 0) {
                        System.out.print((i + 1) + " ");
                    }
                    System.out.print(cinema[i][j] + " ");
                }
            System.out.println("");
        }
    }

    public static String[][] createCinema(int rows, int seats) {
        String[][] cinema = new String[rows][seats];
        for (String[] row: cinema) {
            Arrays.fill(row, "S");
        }
        printCinema(cinema);
        return cinema;
    }



    public static void main(String[] args) {
        // Prompt for Cinema Rows & Columns
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();

        // Create Cinema
        String[][] cinema = createCinema(rows, seats);

        // Prompt for Seat Assignment
        System.out.println("\nEnter a row number:");
        int chosenRow = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int chosenSeat = scanner.nextInt();

        // Determine Seat Price
        int chosenSeatPrice = determineSeatPrice(rows, seats, chosenRow);
        System.out.println("\nTicket Price: $" + chosenSeatPrice);

        // Update Seating Chart
        // Adjust for zero-based index
        cinema[chosenRow - 1][chosenSeat - 1] = "B";
        printCinema(cinema);
    }
}
