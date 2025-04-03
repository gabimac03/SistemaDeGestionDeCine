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
public class Compra {
    private Date fecha;
    private ArrayList<Insumo> insumos = new ArrayList();
    private ArrayList<Proovedor> proovedores = new ArrayList();
    
    
    public Compra() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Insumo> getInsumos() {
        return insumos;
    }

    public void addInsumos(Insumo insumos) {
        this.insumos.add(insumos);
    }

    public ArrayList<Proovedor> getProovedores() {
        return proovedores;
    }

    public void setProovedores(ArrayList<Proovedor> proovedores) {
        this.proovedores = proovedores;
    }
    
    
    
}
