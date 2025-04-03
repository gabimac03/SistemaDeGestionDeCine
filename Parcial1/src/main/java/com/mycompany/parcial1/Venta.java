/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Desarrollo
 */
public class Venta {
    private Date fecha;
    private ArrayList<Funcion> funciones = new ArrayList();
    private ArrayList<Cliente> clientes = new ArrayList();
    private Pago pago;

    public Venta() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Funcion> getFunciones() {
        return funciones;
    }

    public void addFunciones(Funcion funciones) {
        this.funciones.add(funciones);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void addClientes(Cliente clientes) {
        this.clientes.add(clientes);
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
    
    
}
