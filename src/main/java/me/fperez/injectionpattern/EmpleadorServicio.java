/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.fperez.injectionpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fperez
 */
public class EmpleadorServicio implements Empleador{

    @Override
    public List<Empleado> getAllEmpleados() {
        List<Empleado> listaEmpleados = new ArrayList<Empleado>();
        
        listaEmpleados.add(new Empleado(1,"Francisco Perez"));
        listaEmpleados.add(new Empleado(2,"Javier Perez"));
        listaEmpleados.add(new Empleado(3,"Antonio Gonzalez"));
        
        return listaEmpleados;
    }
    
}
