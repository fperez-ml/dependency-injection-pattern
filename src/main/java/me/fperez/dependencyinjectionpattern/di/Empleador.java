/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package me.fperez.dependencyinjectionpattern.di;

import me.fperez.dependencyinjectionpattern.modelo.Empleado;
import java.util.List;

/**
 *
 * @author fperez
 */
public interface Empleador {
    
    List<Empleado> getAllEmpleados();
    
}
