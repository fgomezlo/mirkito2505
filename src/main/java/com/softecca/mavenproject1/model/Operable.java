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
public interface Operable {
 
    public boolean vender(Activo obj1, Activo obj2);
    
    public boolean comprar(Activo obj1, Activo obj2);
}
