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
public class IsVowel {
    public static boolean isVowel1(char ch) {
        /* solucion 1
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
            || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'
            || ch == 'U'){
                return true;
            }
        return false;
        solucion 2
        */
        return "AEIOU".contains(String.valueOf(ch));
        //return "aAeEiIoOuU".contains(String.valueOf(ch));
        /* solucion 3
                // write your code here
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char var : vowels) {
            if (Character.compare(ch, var) == 0) {
                return true;
            }
        } return false;
        */
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel1(letter) ? "YES" : "NO");
    }    
}
