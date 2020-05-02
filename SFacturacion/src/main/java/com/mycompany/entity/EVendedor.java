
package com.mycompany.entity;

public class EVendedor {
    private Integer venCod;
    private String venNom;
    private String venApe;
    private String venFnac;
    private String venCel;
    private String venFing;
    private String venLogin;
    private String venClave;
    private Integer vista;

    public EVendedor() {
    }

    public EVendedor(Integer venCod, String venNom, String venApe, String venFnac, String venCel, String venFing, String venLogin, String venClave, Integer vista) {
        this.venCod = venCod;
        this.venNom = venNom;
        this.venApe = venApe;
        this.venFnac = venFnac;
        this.venCel = venCel;
        this.venFing = venFing;
        this.venLogin = venLogin;
        this.venClave = venClave;
        this.vista = vista;
    }

    public Integer getVenCod() {
        return venCod;
    }

    public void setVenCod(Integer venCod) {
        this.venCod = venCod;
    }

    public String getVenNom() {
        return venNom;
    }

    public void setVenNom(String venNom) {
        this.venNom = venNom;
    }

    public String getVenApe() {
        return venApe;
    }

    public void setVenApe(String venApe) {
        this.venApe = venApe;
    }

    public String getVenFnac() {
        return venFnac;
    }

    public void setVenFnac(String venFnac) {
        this.venFnac = venFnac;
    }

    public String getVenCel() {
        return venCel;
    }

    public void setVenCel(String venCel) {
        this.venCel = venCel;
    }

    public String getVenFing() {
        return venFing;
    }

    public void setVenFing(String venFing) {
        this.venFing = venFing;
    }

    public String getVenLogin() {
        return venLogin;
    }

    public void setVenLogin(String venLogin) {
        this.venLogin = venLogin;
    }

    public String getVenClave() {
        return venClave;
    }

    public void setVenClave(String venClave) {
        this.venClave = venClave;
    }

    public Integer getVista() {
        return vista;
    }

    public void setVista(Integer vista) {
        this.vista = vista;
    }
    
    
}
