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
public class InputInAMethod {
    Scanner scanner;
    
    public static String ingresar(){
        Scanner scanner = new Scanner(System.in); 
        String valor = scanner.nextLine();
        return valor;
    }
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Valor ingresado: "+ ingresar());
    }
}
