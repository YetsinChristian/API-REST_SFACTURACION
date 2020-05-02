package com.mycompany.entity;

import java.math.BigDecimal;

public class EFacDeta {
    private Integer dfacNum;
    private Integer artCod;
    private Integer facNum;
    private Integer artCan;
    private BigDecimal precioArt;

    public EFacDeta() {
    }
    
    public EFacDeta(Integer dfacNum, Integer artCod, Integer facNum, Integer artCan, BigDecimal precioArt) {
        this.dfacNum = dfacNum;
        this.artCod = artCod;
        this.facNum = facNum;
        this.artCan = artCan;
        this.precioArt = precioArt;
    }

    public Integer getDfacNum() {
        return dfacNum;
    }

    public void setDfacNum(Integer dfacNum) {
        this.dfacNum = dfacNum;
    }

    public Integer getArtCod() {
        return artCod;
    }

    public void setArtCod(Integer artCod) {
        this.artCod = artCod;
    }

    public Integer getFacNum() {
        return facNum;
    }

    public void setFacNum(Integer facNum) {
        this.facNum = facNum;
    }

    public Integer getArtCan() {
        return artCan;
    }

    public void setArtCan(Integer artCan) {
        this.artCan = artCan;
    }

    public BigDecimal getPrecioArt() {
        return precioArt;
    }

    public void setPrecioArt(BigDecimal precioArt) {
        this.precioArt = precioArt;
    }
    
}
