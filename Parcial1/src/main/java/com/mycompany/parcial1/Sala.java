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
public class Sala {
    protected int numero;
    protected int capacidad;
    protected ArrayList<Funcion> funciones = new ArrayList();

    public Sala() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Funcion> getFunciones() {
        return funciones;
    }

    public void addFunciones(Funcion funciones) {
        this.funciones.add(funciones);
    }
    
    
    
}
