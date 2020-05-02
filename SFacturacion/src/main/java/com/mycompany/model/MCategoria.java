/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import com.mycompany.dao.Categoria;
import com.mycompany.dao.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Christian
 */
public class MCategoria {
    //Obtener lista de categorias
    public List<Categoria> get(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        List<Categoria> datos = ses.createCriteria(Categoria.class).add(Restrictions.like("vista", 1)).list();                                
        return datos;
    }
    //Obtener una categoria por id
    public Categoria getCategoria(Categoria obj){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        Categoria datos = (Categoria)ses.get(Categoria.class, obj.getCatCod()) ;        
        return datos;
    }
    //Crear nuevo objeto
    public void saveCategoria(Categoria obj){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        ses.save(obj);
        ses.beginTransaction().commit();
        ses.close();
    }
    //Eliminar un objeto
    public void deleteCategoria(Categoria obj){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        Categoria dao = (Categoria)ses.get(Categoria.class, obj.getCatCod());        
        dao.setVista(0);
        ses.update(dao);
        ses.beginTransaction().commit();
        ses.close();
    }
    //Editar un objeto
    public void updateCategoria(Categoria obj){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        Categoria dao = (Categoria)ses.get(Categoria.class, obj.getCatCod());
        dao.setCatDes(obj.getCatDes());
        dao.setVista(obj.getVista());
        ses.update(dao);
        ses.beginTransaction().commit();
        ses.close();
    }
}
