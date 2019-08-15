/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelo;

import com.mycompany.controlador.controladorSueldo;

/**
 *
 * @author Yonathan
 */
public class modeloSueldo {
    
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
