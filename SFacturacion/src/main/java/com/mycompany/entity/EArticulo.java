
package com.mycompany.entity;

import java.math.BigDecimal;

public class EArticulo {
    private Integer artCod;
     private Integer catCod;
     private String artNom;
     private String artUni;
     private BigDecimal artPre;
     private Integer artStk;
     private Integer vista;

    public EArticulo() {
    }

    public EArticulo(Integer artCod, Integer catCod, String artNom, String artUni, BigDecimal artPre, Integer artStk, Integer vista) {
        this.artCod = artCod;
        this.catCod = catCod;
        this.artNom = artNom;
        this.artUni = artUni;
        this.artPre = artPre;
        this.artStk = artStk;
        this.vista = vista;
    }

    public Integer getArtCod() {
        return artCod;
    }

    public void setArtCod(Integer artCod) {
        this.artCod = artCod;
    }

    public Integer getCatCod() {
        return catCod;
    }

    public void setCatCod(Integer catCod) {
        this.catCod = catCod;
    }

    public String getArtNom() {
        return artNom;
    }

    public void setArtNom(String artNom) {
        this.artNom = artNom;
    }

    public String getArtUni() {
        return artUni;
    }

    public void setArtUni(String artUni) {
        this.artUni = artUni;
    }

    public BigDecimal getArtPre() {
        return artPre;
    }

    public void setArtPre(BigDecimal artPre) {
        this.artPre = artPre;
    }

    public Integer getArtStk() {
        return artStk;
    }

    public void setArtStk(Integer artStk) {
        this.artStk = artStk;
    }

    public Integer getVista() {
        return vista;
    }

    public void setVista(Integer vista) {
        this.vista = vista;
    }
    
}
