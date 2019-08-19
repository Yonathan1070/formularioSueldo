/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controlador;

import com.mycompany.modelo.ModeloSueldo;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 * declaracion de la clase controladorSueldo
 * @author Yonathan Bohorquez
 * @author Manuel Bohorquez
 * @version 18-08-2019 1.0
 */
@ManagedBean
@RequestScoped
public class ControladorSueldo {
    //Declaracion de los atributos privador de la clase
    private String nombre;
    private Double sueldoDia;
    private Integer diasTrabajados;
    private String idiomasDominados[];
    private Double sueldoTotal;
    ModeloSueldo modelo;

    @ManagedProperty("#{ControladorIndex}")
    private ControladorIndex index;
    /**
     * Creacion nueva instancia de controladorSueldo
     */
    public ControladorSueldo() {
        modelo = new ModeloSueldo();
    }

    public Double getSueldoTotal() {
        return sueldoTotal;
    }

    public void setSueldoTotal(Double sueldoTotal) {
        this.sueldoTotal = sueldoTotal;
    }

    public ControladorIndex getIndex() {
        return index;
    }

    public void setIndex(ControladorIndex index) {
        this.index = index;
    }

    public void obtenerSueldo() {
        this.sueldoTotal=modelo.obtenerSueldo(this.getIndex().getSueldoDia(), this.getIndex().getDiasTrabajados(), this.getIndex().getIdiomasDominados());
    }
}
