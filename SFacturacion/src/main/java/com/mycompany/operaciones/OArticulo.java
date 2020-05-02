package com.mycompany.operaciones;

import com.mycompany.dao.Articulos;
import com.mycompany.dao.Categoria;
import com.mycompany.entity.EArticulo;
import com.mycompany.model.MArticulo;
import java.util.ArrayList;
import java.util.List;

public class OArticulo {
    public List<EArticulo> get(){
        MArticulo op = new MArticulo();
        List<Articulos> lista = op.get();
        //
        List<EArticulo> datos = new ArrayList<EArticulo>();
        for(Articulos c : lista){
            EArticulo bean = new EArticulo();
            bean.setArtCod(c.getArtCod());
            bean.setArtNom(c.getArtNom());
            bean.setArtUni(c.getArtUni());
            bean.setArtPre(c.getArtPre());
            bean.setArtStk(c.getArtStk());
            bean.setCatCod(c.getCategoria().getCatCod() );            
            bean.setVista(c.getVista());
            datos.add(bean);
        }        
        return datos;
    }
    public EArticulo getArticulo(EArticulo obj){        
        MArticulo op = new MArticulo();
        Articulos dao = new Articulos();
        //
        dao.setArtCod(obj.getArtCod());
        //
        Articulos aux = op.getArticulo(dao);
        //
        EArticulo datos = new EArticulo();        
        datos.setArtCod(aux.getArtCod());
        datos.setArtNom(aux.getArtNom());
        datos.setArtUni(aux.getArtUni());
        datos.setArtPre(aux.getArtPre());
        datos.setArtStk(aux.getArtStk());
        datos.setCatCod(aux.getCategoria().getCatCod() );            
        datos.setVista(aux.getVista());
        return datos;
    }
    public void saveArticulo(EArticulo obj){
        Articulos dao = new Articulos();        
        dao.setArtNom(obj.getArtNom());
        dao.setArtUni(obj.getArtUni());
        dao.setArtPre(obj.getArtPre());
        dao.setArtStk(obj.getArtStk());
        //
        Categoria auxCat = new Categoria();
        auxCat.setCatCod(obj.getCatCod());
        dao.setCategoria(auxCat);        
        //
        dao.setVista(obj.getVista());
        MArticulo op = new MArticulo();
        op.saveArticulo(dao);
    }
    public void deleteArticulo(EArticulo obj){
        Articulos dao = new Articulos();
        dao.setArtCod(obj.getArtCod());
        MArticulo op = new MArticulo();
        op.deleteArticulo(dao);
    }
    public void updateArticulo(EArticulo obj){
        Articulos dao = new Articulos();
        dao.setArtCod(obj.getArtCod());
        dao.setArtNom(obj.getArtNom());
        dao.setArtUni(obj.getArtUni());
        dao.setArtPre(obj.getArtPre());
        dao.setArtStk(obj.getArtStk());
        //
        Categoria auxCat = new Categoria();
        auxCat.setCatCod(obj.getCatCod());
        dao.setCategoria(auxCat);        
        //
        dao.setVista(obj.getVista());
        MArticulo op = new MArticulo();
        op.updateArticulo(dao);
    }
}
