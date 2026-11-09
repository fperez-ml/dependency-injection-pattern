/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.fperez.injectionpattern;

import java.util.List;

/**
 *
 * @author fperez
 */
public class EmpleadorCliente {
    
    //Atributo del Tipo Interfaz
    private Empleador empleador;

    //El argumento del constructor es del tipo interfaz
    public EmpleadorCliente(Empleador empleador) {
        this.empleador = empleador;
    }

    public List<Empleado> getAllEmpleados(){
        return empleador.getAllEmpleados();
    }
    
    
}
