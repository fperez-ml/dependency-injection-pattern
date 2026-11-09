/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.fperez.injectionpattern;

import java.util.List;

/**
 *
 * @author fperez
 */
public class Injectionpattern {

    public static void main(String[] args) {
        EmpleadorCliente empleador = new EmpleadorCliente(new EmpleadorServicio());
        
        List<Empleado> empleados = empleador.getAllEmpleados();
        for(Empleado emp : empleados){
            System.out.println(String.format("ID = %d, Nombre = %s", emp.getId(), emp.getNombre()));
        }
    }
}
