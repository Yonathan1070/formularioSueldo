/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelo;

import com.mycompany.controlador.ControladorSueldo;

/**
 * Declaracion de la clase ModeloSueldo
 * @author Yonathan Bohorquez
 * @author Manuel Bohorquez
 * @version 18-08-2019 1.0
 */
public class ModeloSueldo {
    //Metodo que realiza las operaciones de multiplicacion de sueldo * dias mas el valor adicional segun el idioma seleccionado
    public Double obtenerSueldo(Double sueldo, Integer dias, String idiomas[]){
        String ingles = "ingles";
        String espanol = "español";
        String frances = "frances";
        String aleman = "aleman";
        
        Double total = sueldo*dias;
        for (String idioma : idiomas) {
            if(espanol.contains(idioma)){
                total=total+100000;
            }
            if(ingles.contains(idioma)){
                total=total+200000;
            }
            if(frances.contains(idioma)){
                total=total+300000;
            }
            if(aleman.contains(idioma)){
                total=total+400000;
            }
        }
        return total;
    }
}
