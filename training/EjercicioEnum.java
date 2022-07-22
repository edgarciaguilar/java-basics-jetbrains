/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jetbrains.training;

/**
 *
 * @author Edgar
 */
public class EjercicioEnum {
    
    public enum UserStatus {
        PENDING, ACTIVE, BLOCKED
    }
    
    enum DayOfWeek {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
    public static void main(String[] args) {
        UserStatus activo = UserStatus.ACTIVE;
        UserStatus bloqueado = UserStatus.valueOf("BLOCKED");
        UserStatus[] estados = UserStatus.values();
        UserStatus status = UserStatus.PENDING;// some status

        System.out.println(activo);
        System.out.println(activo.name());
        System.out.println(bloqueado);
        System.out.println(bloqueado.ordinal());
        System.out.println(estados[0]);
        System.out.println(activo == UserStatus.ACTIVE); // true
        
 
        switch (status) {
            case PENDING:
                System.out.println("You need to wait a little.");
                break;
            case ACTIVE:
                System.out.println("No problems, you may pass here.");
                break;
            case BLOCKED:
                System.out.println("Stop! You can't pass here.");
                break;
            default:
                System.out.println("Unsupported enum constant.");
        }
        System.out.println("Next the list of enum");
        for (UserStatus iterarEnum : UserStatus.values()) {
            System.out.println(iterarEnum);
        }
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
    }
    
}
