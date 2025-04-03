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
public class Cine {
    private String nombre;
    private String direccion;
    private ArrayList<Pelicula> peliculas = new ArrayList();
    private ArrayList<Venta> ventas = new ArrayList();
    private ArrayList<SalaVip> salaVip = new ArrayList();
    private ArrayList<Sala> salas = new ArrayList();
    private ArrayList<Compra> compras = new ArrayList();
    private ArrayList<Empleado> empleados = new ArrayList();
    
    public Cine() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void addPeliculas(Pelicula peliculas) {
        this.peliculas.add(peliculas);
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void addVentas(Venta ventas) {
        this.ventas.add(ventas);
    }

    public ArrayList<SalaVip> getSalaVip() {
        return salaVip;
    }

    public void addSalaVip(SalaVip salaVip) {
        this.salaVip.add(salaVip);
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void addSalas(Sala salas) {
        this.salas.add(salas);
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void addCompras(Compra compras) {
        this.compras.add(compras);
        
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void addEmpleados(Empleado empleados) {
        this.empleados.add(empleados);
    }
    
    
    
    
    
    
    
}
