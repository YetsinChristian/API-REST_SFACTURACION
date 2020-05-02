package com.mycompany.entity;

import java.math.BigDecimal;

public class EFacCabe {
    private Integer facNum;
    private Integer cliCod;
    private Integer venCod;
    private String facFec;
    private Character facTipo;
    private int facEst;
    private BigDecimal facSubt;
    private BigDecimal facIgv;
    private BigDecimal facTot;
    private Integer vista;

    public EFacCabe() {
    }
    
    public EFacCabe(Integer facNum, Integer cliCod, Integer venCod, String facFec, Character facTipo, int facEst, BigDecimal facSubt, BigDecimal facIgv, BigDecimal facTot, Integer vista) {
        this.facNum = facNum;
        this.cliCod = cliCod;
        this.venCod = venCod;
        this.facFec = facFec;
        this.facTipo = facTipo;
        this.facEst = facEst;
        this.facSubt = facSubt;
        this.facIgv = facIgv;
        this.facTot = facTot;
        this.vista = vista;
    }

    public Integer getFacNum() {
        return facNum;
    }

    public void setFacNum(Integer facNum) {
        this.facNum = facNum;
    }

    public Integer getCliCod() {
        return cliCod;
    }

    public void setCliCod(Integer cliCod) {
        this.cliCod = cliCod;
    }

    public Integer getVenCod() {
        return venCod;
    }

    public void setVenCod(Integer venCod) {
        this.venCod = venCod;
    }

    public String getFacFec() {
        return facFec;
    }

    public void setFacFec(String facFec) {
        this.facFec = facFec;
    }

    public Character getFacTipo() {
        return facTipo;
    }

    public void setFacTipo(Character facTipo) {
        this.facTipo = facTipo;
    }

    public int getFacEst() {
        return facEst;
    }

    public void setFacEst(int facEst) {
        this.facEst = facEst;
    }

    public BigDecimal getFacSubt() {
        return facSubt;
    }

    public void setFacSubt(BigDecimal facSubt) {
        this.facSubt = facSubt;
    }

    public BigDecimal getFacIgv() {
        return facIgv;
    }

    public void setFacIgv(BigDecimal facIgv) {
        this.facIgv = facIgv;
    }

    public BigDecimal getFacTot() {
        return facTot;
    }

    public void setFacTot(BigDecimal facTot) {
        this.facTot = facTot;
    }

    public Integer getVista() {
        return vista;
    }

    public void setVista(Integer vista) {
        this.vista = vista;
    }
    
}
