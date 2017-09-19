/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.ejercicio.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import py.com.ejercicio.entidad.Empleado;
import py.com.ejercicio.manager.EmpleadoFacade;

/**
 *
 * @author Ruben
 */
@Named(value = "empleadoBean")
@SessionScoped
public class EmpleadoBean implements Serializable {

    private Empleado selected;
    private List<Empleado> item = new ArrayList<>();

    @EJB
    private EmpleadoFacade empleadoEJB;

    public EmpleadoBean() {
    }

    @PostConstruct
    public void init() {

        selected = new Empleado();
        item = empleadoEJB.findAll();

    }

    public String salvar() {

        if (getSelected() != null) {

            if (selected != null && selected.getId() == null) {

                empleadoEJB.create(selected);

                FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Registro Agregado", "Agregado");
                FacesContext.getCurrentInstance().addMessage(null, message);

                limpiar();
                item = empleadoEJB.findAll();
                return "empleadoList";
            }

            empleadoEJB.edit(selected);
            limpiar();
        }

        return "empleadoList";

    }

    public void limpiar() {

        selected = new Empleado();

    }

    public Empleado getSelected() {
        return selected;
    }

    public void setSelected(Empleado selected) {
        this.selected = selected;
    }

    public List<Empleado> getItem() {
        return item;
    }

    public void setItem(List<Empleado> item) {
        this.item = item;
    }

    public EmpleadoFacade getEmpleadoEJB() {
        return empleadoEJB;
    }

    public void setEmpleadoEJB(EmpleadoFacade empleadoEJB) {
        this.empleadoEJB = empleadoEJB;
    }

}
