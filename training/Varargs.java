/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jetbrains.training;
import java.util.Arrays;
/**
 *
 * @author Edgar
 */
public class Varargs {
    
    public static void swapFirstAndLastElements(int[] nums) { // nums is an array
        if (nums.length < 1) {
            return; // it returns nothing, i.e. just exits the method
        }

        int temp = nums[nums.length - 1]; // save the last element in a temporary local variable
        nums[nums.length - 1] = nums[0];  // now, the last element becomes the first
        nums[0] = temp;                   // now, the former first element becomes the last
    }    
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 }; // numbers

        System.out.println(Arrays.toString(numbers)); // before swapping

        swapFirstAndLastElements(numbers); // swapping

        System.out.println(Arrays.toString(numbers)); // after swapping        
    }
}
