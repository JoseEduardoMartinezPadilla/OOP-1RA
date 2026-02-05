/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persona;

/**
 * * @author bisonte
 */

public class persona {
    //atributos
    private String nombre;
    private String apellidos;
    private int edad;
    private String genero;
    
    //constructores
    
    //comportamientos //interfaz
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String valor) {
        nombre = valor;
    }
    
    public String getApellido() {
        return apellidos;
    }
    
    public void setApellido(String valor) {
        apellidos = valor;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int valor) {
        edad = valor;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String valor) {
        genero = valor;
    }
    
    public void imprimirdatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
    }
}