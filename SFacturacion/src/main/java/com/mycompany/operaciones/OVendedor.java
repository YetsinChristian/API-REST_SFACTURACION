package com.mycompany.operaciones;

import com.mycompany.dao.Vendedor;
import com.mycompany.entity.EVendedor;
import com.mycompany.model.MVendedor;
import java.util.ArrayList;
import java.util.List;

public class OVendedor {
    public List<EVendedor> get(){
        MVendedor op = new MVendedor();
        List<Vendedor> lista = op.get();
        //
        List<EVendedor> datos = new ArrayList<EVendedor>();
        for(Vendedor c : lista){
            EVendedor bean = new EVendedor();
            bean.setVenCod(c.getVenCod());
            bean.setVenNom(c.getVenNom());
            bean.setVenApe(c.getVenApe());
            bean.setVenFnac(c.getVenFnac());
            bean.setVenCel(c.getVenCel());
            bean.setVenFing(c.getVenFing());
            bean.setVenLogin(c.getVenLogin());
            bean.setVenClave(c.getVenClave());
            bean.setVista(c.getVista());
            datos.add(bean);
        }        
        return datos;
    }
    public EVendedor getVendedor(EVendedor obj){        
        MVendedor op = new MVendedor();
        Vendedor dao = new Vendedor();
        //
        dao.setVenCod(obj.getVenCod());
        //
        Vendedor aux = op.getVendedor(dao);
        //
        EVendedor datos = new EVendedor();        
        datos.setVenCod(aux.getVenCod());
        datos.setVenNom(aux.getVenNom());
        datos.setVenApe(aux.getVenApe());
        datos.setVenFnac(aux.getVenFnac());
        datos.setVenCel(aux.getVenCel());
        datos.setVenFing(aux.getVenFing());
        datos.setVenLogin(aux.getVenLogin());
        datos.setVenClave(aux.getVenClave());
        datos.setVista(aux.getVista());
        return datos;
    }
    public void saveVendedor(EVendedor obj){
        Vendedor dao = new Vendedor();        
        dao.setVenNom(obj.getVenNom());
        dao.setVenApe(obj.getVenApe());
        dao.setVenFnac(obj.getVenFnac());
        dao.setVenCel(obj.getVenCel());
        dao.setVenFing(obj.getVenFing());
        dao.setVenLogin(obj.getVenLogin());
        dao.setVenClave(obj.getVenClave());
        dao.setVista(obj.getVista());
        MVendedor op = new MVendedor();
        op.saveVendedor(dao);
    }
    public void deleteVendedor(EVendedor obj){
        Vendedor dao = new Vendedor();
        dao.setVenCod(obj.getVenCod());
        MVendedor op = new MVendedor();
        op.deleteVendedor(dao);
    }
    public void updateVendedor(EVendedor obj){
        Vendedor dao = new Vendedor();
        dao.setVenCod(obj.getVenCod());
        dao.setVenNom(obj.getVenNom());
        dao.setVenApe(obj.getVenApe());
        dao.setVenFnac(obj.getVenFnac());
        dao.setVenCel(obj.getVenCel());
        dao.setVenFing(obj.getVenFing());
        dao.setVenLogin(obj.getVenLogin());
        dao.setVenClave(obj.getVenClave());
        dao.setVista(obj.getVista());
        MVendedor op = new MVendedor();
        op.updateVendedor(dao);
    }
}
