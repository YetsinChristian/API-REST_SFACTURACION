
package com.mycompany.entity;

import java.math.BigDecimal;

public class ECliente {
    private Integer cliCod;
    private String cliNom;
    private String cliTel;
    private String cliCor;
    private String cliDir;
    private BigDecimal cliCre;
    private Integer vista;

    public ECliente() {
    }

    public ECliente(Integer cliCod, String cliNom, String cliTel, String cliCor, String cliDir, BigDecimal cliCre, Integer vista) {
        this.cliCod = cliCod;
        this.cliNom = cliNom;
        this.cliTel = cliTel;
        this.cliCor = cliCor;
        this.cliDir = cliDir;
        this.cliCre = cliCre;
        this.vista = vista;
    }

    public Integer getCliCod() {
        return cliCod;
    }

    public void setCliCod(Integer cliCod) {
        this.cliCod = cliCod;
    }

    public String getCliNom() {
        return cliNom;
    }

    public void setCliNom(String cliNom) {
        this.cliNom = cliNom;
    }

    public String getCliTel() {
        return cliTel;
    }

    public void setCliTel(String cliTel) {
        this.cliTel = cliTel;
    }

    public String getCliCor() {
        return cliCor;
    }

    public void setCliCor(String cliCor) {
        this.cliCor = cliCor;
    }

    public String getCliDir() {
        return cliDir;
    }

    public void setCliDir(String cliDir) {
        this.cliDir = cliDir;
    }

    public BigDecimal getCliCre() {
        return cliCre;
    }

    public void setCliCre(BigDecimal cliCre) {
        this.cliCre = cliCre;
    }

    public Integer getVista() {
        return vista;
    }

    public void setVista(Integer vista) {
        this.vista = vista;
    }
    
    
}
