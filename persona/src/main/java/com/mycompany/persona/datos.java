/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persona;

/**
 *
 * @author Jose
 */
public class datos {

    public static void main(String[] args) {
        persona perso = new persona();
        perso.setNombre("ruben");
        perso.setApellido("hernandez");
        perso.setEdad(33);
        perso.setGenero("m");
        
        System.out.println("nombre: " + perso.getNombre());
        System.out.println("apellido: " + perso.getApellido());
        System.out.println("edad: " + perso.getEdad());
        System.out.println("genero: " + perso.getGenero());
        
        perso.imprimirdatos();
    }
}