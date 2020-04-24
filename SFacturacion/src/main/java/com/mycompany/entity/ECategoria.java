/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

/**
 *
 * @author Christian
 */
public class ECategoria {
    private Integer catCod;
    private String catDes;
    private Integer vista;    

    public ECategoria() {
    }

    public ECategoria(Integer catCod, String catDes, Integer vista) {
        this.catCod = catCod;
        this.catDes = catDes;
        this.vista = vista;        
    }

    public Integer getCatCod() {
        return catCod;
    }

    public void setCatCod(Integer catCod) {
        this.catCod = catCod;
    }

    public String getCatDes() {
        return catDes;
    }

    public void setCatDes(String catDes) {
        this.catDes = catDes;
    }

    public Integer getVista() {
        return vista;
    }

    public void setVista(Integer vista) {
        this.vista = vista;
    }        
}
