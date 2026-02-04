/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividades;

/**
 *
 * @author Jose
 */
public class Actividades {

    public static void main(String[] args) {
        persona persol, persol2;
        persol = new persona();
        System.out.println(persol);
        persol2 = new persona();
        System.out.println(persol2);
        persol.nombre = "edad";
        persol.apellido = "ramirez";
        persol.edad = 23;
        persol.imprimir();
        persol2.nombre = "elo";
        persol2.apellido = "mar";
        persol2.edad = 12;
        persol2.imprimir();
              
    }
}

class persona {
    String nombre;
    String apellido;
    int edad;
    
    void imprimir() {
        System.out.println("nombre: " + nombre);
        System.out.println("apellido: " + apellido);
        System.out.println("edad: " + edad);
    }
}