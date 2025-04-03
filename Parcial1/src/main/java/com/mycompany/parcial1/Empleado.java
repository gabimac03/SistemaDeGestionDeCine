/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1;

import java.util.ArrayList;

/**
 *
 * @author Desarrollo
 */
public class Empleado {
    private String nombre;
    private int dni;
    private ArrayList<Cine> cines = new ArrayList();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public ArrayList<Cine> getCines() {
        return cines;
    }

    public void setCines(ArrayList<Cine> cines) {
        this.cines = cines;
    }

    
    
    
    
}
