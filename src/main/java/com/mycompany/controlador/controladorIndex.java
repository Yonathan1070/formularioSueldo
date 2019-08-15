/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Yonathan
 */
@ManagedBean
@SessionScoped
public class controladorIndex {

    private String nombre;
    private Double sueldoDia;
    private Integer diasTrabajados;
    private String idiomasDominados[];
    /**
     * Creates a new instance of controladorIndex
     */
    public controladorIndex() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSueldoDia() {
        return sueldoDia;
    }

    public void setSueldoDia(Double sueldoDia) {
        this.sueldoDia = sueldoDia;
    }

    public Integer getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(Integer diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public String[] getIdiomasDominados() {
        return idiomasDominados;
    }

    public void setIdiomasDominados(String[] idiomasDominados) {
        this.idiomasDominados = idiomasDominados;
    }
}
