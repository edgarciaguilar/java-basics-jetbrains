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
public class Ticketsv4 {

    public static int tickets = 0;
    public static int currentIncome = 0;

    public static void imprimirSala(String[][] cine) {
        System.out.println("\nCinema:");
        System.out.print("  ");
        for (int i = 0; i < cine[0].length; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        for (int i = 0; i < cine.length; i++) {
            for (int j = 0; j < cine[i].length; j++) {
                if (j == 0) {
                    System.out.print((i + 1) + " ");
                }
                System.out.print(cine[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static String[][] crearSala(int rows, int seats) {
        String[][] cinema = new String[rows][seats];
        for (String[] row : cinema) {
            Arrays.fill(row, "S");
        }
        return cinema;

    }

    public static int calcularPrecioBoleto(int rows, int seats, int chosenRow) {
        int totalAsientos = seats * rows;
        if (totalAsientos <= 60 || chosenRow <= rows / 2) {
            return 10;
        }
        return 8;
    }

    public static float percentage(int rows, int seats) {
        return (tickets * 100) / (rows * seats);
    }

    public static int gananciasTotales(int rows, int seats) {
        int totalAsientos = seats * rows;
        int total = 0;
        if (totalAsientos <= 60) {
            total = totalAsientos * 10;
        } else {
            total = rows % 2 == 0 ? total = (((rows / 2) * seats) * 10) + (((rows / 2) * seats) * 8) : (((rows / 2) * seats) * 10) + (((rows / 2 + 1) * seats) * 8);
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        String[][] cinema = crearSala(rows, seats);
        boolean repeat = true;
        boolean repeat2 = true;
        do {
            System.out.println("\n1. Show the seats\n"
                    + "2. Buy a ticket\n"
                    + "3. Statistics\n"
                    + "0. Exit");
            int answer = scanner.nextInt();
            switch (answer) {
                case 0:
                    repeat = false;
                    break;
                case 1:
                    imprimirSala(cinema);
                    break;
                case 2:
                    do {
                        System.out.println("\nEnter a row number:");
                        int chosenRow = scanner.nextInt();
                        System.out.println("Enter a seat number in that row:");
                        int chosenSeat = scanner.nextInt();
                        if (chosenRow <= rows || chosenSeat <= seats) {
                            if (cinema[chosenRow - 1][chosenSeat - 1] == "B") {
                                System.out.println("That ticket has already been purchased!");
                            } else {
                                cinema[chosenRow - 1][chosenSeat - 1] = "B";
                                int precioBoleto = calcularPrecioBoleto(rows, seats, chosenRow);
                                currentIncome += precioBoleto;
                                System.out.println("\nTicket Price: $" + precioBoleto);
                                tickets++;
                                repeat2 = false;
                            }
                        } else {
                            System.out.println("Wrong input!");
                            repeat2 = true;
                        }
                    } while (repeat2);
                    break;
                case 3:
                    int ventaTotal = gananciasTotales(rows, seats);
                    System.out.println("Number of purchased tickets: " + tickets);
                    String str = String.format("Percentage: %.2f", percentage(rows, seats));
                    System.out.println(str + "%");
                    System.out.println("Current income: " + currentIncome);
                    System.out.println("Total income: $" + ventaTotal);

                    break;
                default:
                    System.out.println("invalid option");
            }

        } while (repeat);
    }

}
