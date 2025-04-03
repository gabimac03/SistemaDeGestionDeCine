/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parcial1;



/**
 *
 * @author Desarrollo
 */
public class Parcial1 {

    public static void main(String[] args) {
        Cine cinepolis = new Cine();
        cinepolis.setNombre("Cinepolis");
        
        Empleado emp1 = new Empleado();
        emp1.setDni(2525);
        emp1.setNombre("Marcos");
        Empleado emp2 = new Empleado();
        emp2.setDni(2526);
        emp2.setNombre("Lucas");
        
        
        
        Pelicula pelicula1 = new Pelicula();
        Pelicula pelicula2 = new Pelicula();
        Pelicula pelicula3 = new Pelicula();
        Pelicula pelicula4 = new Pelicula();
        
        pelicula1.setTitulo("No hables con extraños");
        pelicula1.setGenero(Genero.ACCION);
        
        pelicula2.setTitulo("Romper el circulo");
        pelicula2.setGenero(Genero.COMEDIA);
        
        pelicula3.setTitulo("Beaatlejuice");
        pelicula3.setGenero(Genero.DRAMA);
        
        pelicula4.setTitulo("El Guason 2");
        pelicula4.setGenero(Genero.SUSPENSO);
        
        Entrada entrada1 = new Entrada();
        Entrada entrada2 = new Entrada();
        Entrada entrada3 = new Entrada();
        Entrada entrada4 = new Entrada();
        
        entrada1.setAsiento("25");
        entrada1.setPrecio(5000);
        
        entrada2.setAsiento("26");
        entrada2.setPrecio(5000);
        
        entrada3.setAsiento("27");
        entrada3.setPrecio(5000);
        
        entrada4.setAsiento("28");
        entrada4.setPrecio(5000);
        
        Funcion funcion1 = new Funcion();
        Funcion funcion2 = new Funcion();
        Funcion funcion3 = new Funcion();
        Funcion funcion4 = new Funcion();
        
        funcion1.setHorario("23:45");
        funcion1.setPelicula(pelicula1);
        funcion1.addEntradas(entrada1);
        
        funcion2.setHorario("22:00");
        funcion2.setPelicula(pelicula2);
        funcion2.addEntradas(entrada2);
        
        funcion3.setHorario("21:00");
        funcion3.setPelicula(pelicula3);
        funcion3.addEntradas(entrada3);
        
        funcion4.setHorario("20:00");
        funcion4.setPelicula(pelicula4);
        funcion4.addEntradas(entrada4);
        
      
        
        SalaVip salavip1 = new SalaVip();
        salavip1.setNumero(10);
        salavip1.addFunciones(funcion1);
        salavip1.addFunciones(funcion2);
        
        SalaVip salavip2 = new SalaVip();
        salavip2.setNumero(9);
        salavip2.addFunciones(funcion3);
        salavip2.addFunciones(funcion4);
        
        Sala sala1 = new Sala();
        sala1.setNumero(8);
        sala1.addFunciones(funcion1);
        sala1.addFunciones(funcion2);
        
        Sala sala2 = new Sala();
        sala2.setNumero(7);
        sala2.addFunciones(funcion3);
        sala2.addFunciones(funcion4);
        

        cinepolis.addEmpleados(emp1);
        cinepolis.addEmpleados(emp2);
        cinepolis.addSalaVip(salavip1);
        cinepolis.addSalaVip(salavip2);
        cinepolis.addSalas(sala1);
        cinepolis.addSalas(sala2);
        
        
        System.out.println("-------------- EMPLEADOS --------");
        System.out.println("Empleado 1: " + cinepolis.getEmpleados().get(0).getNombre() +
                "DNI: " + cinepolis.getEmpleados().get(0).getDni());
        System.out.println("\n\n Empleado 2: " + cinepolis.getEmpleados().get(1).getNombre() +
                "DNI: " + cinepolis.getEmpleados().get(1).getDni());
        
        System.out.println("En el cine " + cinepolis.getNombre() + " hay dos 4 funciones: " + 
                "\n\n En la sala: " +
                cinepolis.getSalas().get(0).getNumero() +
                "\n Darán la pelicula: " + 
                cinepolis.getSalas().get(0).getFunciones().get(0).getPelicula().getTitulo() +
                "\n Con las entradas, en el asiento: " +
                cinepolis.getSalas().get(0).getFunciones().get(0).getEntradas().get(0).getAsiento() +
                "\n Precio: " +
                cinepolis.getSalas().get(0).getFunciones().get(0).getEntradas().get(0).getPrecio() +
                
                "\n\n En la sala: " +
                cinepolis.getSalas().get(1).getNumero() +
                "\n Daran la pelicula: " +
                cinepolis.getSalas().get(1).getFunciones().get(1).getPelicula().getTitulo() +
                "\n Con las entradas: en el asiento: " +
                cinepolis.getSalas().get(1).getFunciones().get(1).getEntradas().get(0).getAsiento() +
                "\n Precio: " + 
                cinepolis.getSalas().get(1).getFunciones().get(1).getEntradas().get(0).getPrecio() +
                
                "\n\n En la sala VIP: " +
                cinepolis.getSalaVip().get(1).getNumero() +
                "\n Daran la pelicula: " +
                cinepolis.getSalaVip().get(1).getFunciones().get(0).getPelicula().getTitulo() +
                "\n Con las entradas: en el asiento: " +
                cinepolis.getSalaVip().get(1).getFunciones().get(0).getEntradas().get(0).getAsiento() +
                "\n Precio: " + 
                cinepolis.getSalaVip().get(1).getFunciones().get(0).getEntradas().get(0).getPrecio() +
                
                "\n\n En la sala VIP: " +
                cinepolis.getSalaVip().get(0).getNumero() +
                "\n Daran la pelicula: " +
                cinepolis.getSalaVip().get(0).getFunciones().get(1).getPelicula().getTitulo() +
                "\n Con las entradas: en el asiento: " +
                cinepolis.getSalaVip().get(0).getFunciones().get(0).getEntradas().get(0).getAsiento() +
                "\n Precio: " + 
                cinepolis.getSalaVip().get(0).getFunciones().get(0).getEntradas().get(0).getPrecio() 
                
                );
              
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Gabriel");
        cliente1.setEmail("gabimacocco@gmail.com");
        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Rodrigo");
        cliente2.setEmail("rodrigo@gmail.com");
                
        Venta venta1 = new Venta();
        venta1.addFunciones(funcion1);
        venta1.addClientes(cliente1);
        cinepolis.addVentas(venta1);
        
        System.out.println("\n\n La venta realizada al cliente:  " + cinepolis.getVentas().get(0).getClientes().get(0).getNombre() +
                "\n Con correo: " + cinepolis.getVentas().get(0).getClientes().get(0).getEmail() +
                "\n Con funcion en horario: " + cinepolis.getVentas().get(0).getFunciones().get(0).getHorario() +
                "\n Con la entrada numero: " + cinepolis.getVentas().get(0).getFunciones().get(0).getEntradas().get(0).getAsiento() +
                "\n Precio: " + cinepolis.getVentas().get(0).getFunciones().get(0).getEntradas().get(0).getPrecio() + 
                "\n Con la pelicula: " + cinepolis.getVentas().get(0).getFunciones().get(0).getPelicula().getTitulo() + " . Genero: " +
                cinepolis.getVentas().get(0).getFunciones().get(0).getPelicula().getGenero());

        Venta venta2 = new Venta();
        venta2.addClientes(cliente2);
        venta2.addFunciones(funcion3);
        cinepolis.addVentas(venta2);
        
       
       System.out.println("\n\n La venta realizada al cliente:  " + cinepolis.getVentas().get(1).getClientes().get(0).getNombre() +
               "\n Con correo: " + cinepolis.getVentas().get(1).getClientes().get(0).getEmail() +
                "\n Con funcion en horario: " + cinepolis.getVentas().get(1).getFunciones().get(0).getHorario() +
                "\n Con la entrada numero: " + cinepolis.getVentas().get(1).getFunciones().get(0).getEntradas().get(0).getAsiento() +
                "\n Precio: " + cinepolis.getVentas().get(1).getFunciones().get(0).getEntradas().get(0).getPrecio() + 
                "\n Con la pelicula: " + cinepolis.getVentas().get(1).getFunciones().get(0).getPelicula().getTitulo() + " . Genero: " +
                cinepolis.getVentas().get(1).getFunciones().get(0).getPelicula().getGenero());
      
        
        
    }
}


