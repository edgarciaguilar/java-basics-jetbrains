/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jetbrains.basics;
import java.util.Arrays;
/**
 *
 * @author Edgar
 */
public class BidimensionalArray1 {
    public static void main(String[] args) {
        int[][] twoDimArray = {

            {3, 4, 5},  // [0]
            {6, 7, 8},  // [1]
            {5, 3, 7, 10},//[2]
            {2, 9, 8, 10}    
           //0  1  2
        };
//        System.out.println(twoDimArray[0][1]);
//        System.out.println(twoDimArray[1][2]);
//        System.out.println(twoDimArray[2][3]);
        
        //for (int i = 2; i < twoDimArray.length; i++) {
//             System.out.println(Arrays.toString(twoDimArray[i]));
//             break;
        for (int i = 0; i < twoDimArray.length; i++) {
                System.out.print(twoDimArray[2][i] + " ");    
        }
        
        int[][] c = { 
   { 40, 30, 25, 30, 15},
   { 13, 12, 16 },
   { 101, 125, 114, 131 }
}; 

//System.out.print(c.length + " ");
//for (int[] nestedArray : c) {
//   System.out.print(nestedArray.length + " ");
//}
    }

}
