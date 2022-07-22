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
public class PacienteDemo {
    public static void main(String[] args) {
        Paciente jose = new Paciente();
        jose.name="Jose";
        jose.height=1.7f;
        jose.age=39;
        
        System.out.println(jose.name + " " + jose.age + " " + jose.height);
    }
    
}

class Paciente{

    String name;
    int age;
    float height;
}
