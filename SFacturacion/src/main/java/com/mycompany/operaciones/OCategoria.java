/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.operaciones;

import com.mycompany.dao.Categoria;
import com.mycompany.entity.ECategoria;
import com.mycompany.model.MCategoria;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christian
 */
public class OCategoria {    
    public List<ECategoria> get(){
        MCategoria op = new MCategoria();
        List<Categoria> lista = op.get();
        //
        List<ECategoria> datos = new ArrayList<ECategoria>();
        for(Categoria c : lista){
            ECategoria bean = new ECategoria();
            bean.setCatCod(c.getCatCod());
            bean.setCatDes(c.getCatDes());
            bean.setVista(c.getVista());            
            datos.add(bean);
        }        
        return datos;
    }
    public ECategoria getCategoria(ECategoria obj){        
        MCategoria op = new MCategoria();
        Categoria dao = new Categoria();
        //
        dao.setCatCod(obj.getCatCod());
        //
        Categoria aux = op.getCategoria(dao);
        //
        ECategoria datos = new ECategoria();
        datos.setCatCod(aux.getCatCod());
        datos.setCatDes(aux.getCatDes());
        datos.setVista(aux.getVista());        
        return datos;
    }
    public void saveCategoria(ECategoria obj){
        Categoria dao = new Categoria();
        dao.setCatDes(obj.getCatDes());
        dao.setVista(obj.getVista());
        MCategoria op = new MCategoria();
        op.saveCategoria(dao);
    }
    public void deleteCategoria(ECategoria obj){
        Categoria dao = new Categoria();
        dao.setCatCod(obj.getCatCod());
        MCategoria op = new MCategoria();
        op.deleteCategoria(dao);
    }
    public void updateCategoria(ECategoria obj){
        Categoria dao = new Categoria();
        dao.setCatCod(obj.getCatCod());
        dao.setCatDes(obj.getCatDes());
        dao.setVista(obj.getVista());
        MCategoria op = new MCategoria();
        op.updateCategoria(dao);
    }
}
