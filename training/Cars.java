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
public class Cars {
    
    String brand;
    String color;
    String owner;
    String[] datos;
    

    public Cars(String brand, String color, String owner, String[] datos) {
        this.brand = brand;
        this.color = color;
        this.owner = owner;
        this.datos = datos;
    }

    public Cars() {
    }

    @Override
    public String toString() {
        return "Cars{" + "brand=" + brand + ", color=" + color + ", owner=" + owner + ", datos=" + datos.toString() + '}';
    }


    


}
    class Selling{
        public static void main(String[] args) {
            Cars vocho = new Cars("VW","Red","Edgar",new String[]{"Rines deportivos", "Sapicaderas anchas"});
            System.out.println(vocho.toString());
        }
    }