
package com.mycompany.model;

import com.mycompany.dao.Articulos;
import com.mycompany.dao.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;


public class MArticulo {
    //Obtener lista de objetos
    public List<Articulos> get(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        List<Articulos> datos = ses.createCriteria(Articulos.class).add(Restrictions.like("vista", 1)).list();   
        return datos;
    }
    //Obtener objeto por id
    public Articulos getArticulo(Articulos obj){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        Articulos datos = (Articulos)ses.get(Articulos.class, obj.getArtCod()) ;        
        return datos;
    }
    //Crear nuevo objeto
    public void saveArticulo(Articulos obj){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        ses.save(obj);
        ses.beginTransaction().commit();
        ses.close();
    }
    //Eliminar un objeto
    public void deleteArticulo(Articulos obj){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        Articulos dao = (Articulos)ses.get(Articulos.class, obj.getArtCod());        
        dao.setVista(0);
        ses.update(dao);
        ses.beginTransaction().commit();
        ses.close();
    }
    //Editar un objeto
    public void updateArticulo(Articulos obj){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        Articulos dao = (Articulos)ses.get(Articulos.class, obj.getArtCod());
        dao.setArtNom(obj.getArtNom());
        dao.setArtUni(obj.getArtUni());
        dao.setArtPre(obj.getArtPre());        
        dao.setArtStk(obj.getArtStk());
        dao.setCategoria(obj.getCategoria());
        dao.setVista(obj.getVista());       
        ses.update(dao);
        ses.beginTransaction().commit();
        ses.close();
    }
}
