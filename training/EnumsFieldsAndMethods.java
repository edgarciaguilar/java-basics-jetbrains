/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jetbrains.training;

/**
 *
 * @author Edgar
 * extending the functionality of the enum and add values to the constants 
 */
public class EnumsFieldsAndMethods {
    public enum ChargeLevel {
        FULL(4, "green"),
        HIGH(3, "green"),
        MEDIUM(2, "yellow"),
        LOW(1, "red");

        int sections;
        String color;

        ChargeLevel(int sections, String color) {
            this.sections = sections;
            this.color = color;
        }

        public int getSections() {
            return sections;
        }

        public String getColor() {
            return color;
        }
        
        public static ChargeLevel findByNumberOfSections(int sections) {
        for (ChargeLevel value: values()) {
            if (value.sections == sections) {
                return value;
            }
        }
        return null;
    }
    }    
    public static void main(String[] args) {
        System.out.println(ChargeLevel.FULL.color);
        System.out.println(ChargeLevel.MEDIUM.sections);
        System.out.println(ChargeLevel.findByNumberOfSections(2));
    }
}
