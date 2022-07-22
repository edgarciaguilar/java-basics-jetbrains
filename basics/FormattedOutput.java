/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jetbrains.basics;

/**
 *
 * @author Edgar
 */
public class FormattedOutput {
    public static void main(String[] args) {
    int age = 22;
    char initial = 'M';
    String surname = "Anderson";
    double height = 1.72;

    String details = String.format(
            "My name is %c. %s.%nMy age is %d.%nMy height is %.2f.",
            initial, surname, age, height);
    System.out.println(details); 
    
    /*
    *using formatted(Object... args) it applies to JDK 17
   
    
    details = "My name is %c. %s.%nMy age is %d.%nMy height is %.2f."
            .formatted(initial, surname, age, height);

    System.out.println(details2); */
    }
}
