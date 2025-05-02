/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softecca.mavenproject1.model;

/**
 *
 * @author franciscogomezlopez
 */
public class Activo implements Operable {

    protected String nombre;

    @Override
    public boolean vender(Activo obj1, Activo obj2) {
        System.out.println("Soy la accion para vender" + this.nombre);
        return true;
    }

    @Override
    public boolean comprar(Activo obj1, Activo obj2) {
        System.out.println("Soy la accion para comprar" + this.nombre);
        return true;
    }
    
}
