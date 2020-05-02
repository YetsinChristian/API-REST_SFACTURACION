
package com.mycompany.model;

import com.mycompany.dao.FacCabe;
import com.mycompany.dao.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class MFacCabe {
    //Obtener lista de objetos
    public List<FacCabe> get(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        List<FacCabe> datos = ses.createCriteria(FacCabe.class).add(Restrictions.like("vista", 1)).list();   
        return datos;
    }
    //Obtener objeto por id
    public FacCabe getFacCabe(FacCabe obj){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        FacCabe datos = (FacCabe)ses.get(FacCabe.class, obj.getFacNum()) ;        
        return datos;
    }
    //Crear nuevo objeto
    public void saveFacCabe(FacCabe obj){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        ses.save(obj);
        ses.beginTransaction().commit();
        ses.close();
    }
    //Eliminar un objeto
    public void deleteFacCabe(FacCabe obj){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        FacCabe dao = (FacCabe)ses.get(FacCabe.class, obj.getFacNum());        
        dao.setVista(0);
        ses.update(dao);
        ses.beginTransaction().commit();
        ses.close();
    }
    //Editar un objeto
    public void updateFacCabe(FacCabe obj){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        FacCabe dao = (FacCabe)ses.get(FacCabe.class, obj.getFacNum());
        dao.setFacFec(obj.getFacFec());
        dao.setClientes(obj.getClientes());
        dao.setFacTipo(obj.getFacTipo());        
        dao.setVendedor(obj.getVendedor());
        dao.setFacEst(obj.getFacEst());
        dao.setFacSubt(obj.getFacSubt());       
        dao.setFacIgv(obj.getFacIgv());       
        dao.setFacTot(obj.getFacTot());       
        dao.setVista(obj.getVista());       
        ses.update(dao);
        ses.beginTransaction().commit();
        ses.close();
    }
}

