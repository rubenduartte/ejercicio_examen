/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.ejercicio.bean;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Ruben
 */
@Named(value = "empleadoBean")
@SessionScoped
public class EmpleadoBean implements Serializable{

    /**
     * Creates a new instance of EmpleadoBean
     */
    public EmpleadoBean() {
    }
    
}
