
package com.mycompany.model;

import com.mycompany.dao.FacCabe;
import com.mycompany.dao.FacDeta;
import com.mycompany.dao.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MFacDeta {
    //Obtener lista de objetos pertenecientes a otro objeto
    public List<FacDeta> get(FacCabe obj){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();        
        Query qry = ses.createQuery("from FacDeta where facCabe=?");
        qry.setInteger(0, obj.getFacNum());        
        List<FacDeta> datos = qry.list();
        ses.close();
        return datos;
    }
    //Obtener objeto por id
//    public FacDeta getFacDeta(FacDeta obj){
//        SessionFactory sf = HibernateUtil.getSessionFactory();
//        Session ses = sf.openSession();
//        FacDeta datos = (FacDeta)ses.get(FacDeta.class, obj.getDfacNum()) ;        
//        return datos;
//    }
    //Crear nuevo objeto
    public void saveFacDeta(FacDeta obj){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        ses.save(obj);
        ses.beginTransaction().commit();
        ses.close();
    }
    //Eliminar un objeto
    public void deleteFacDeta(FacDeta obj){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        ses.delete(obj);
        ses.beginTransaction().commit();
        ses.close();
    }
//    //Editar un objeto
//    public void updateFacDeta(FacDeta obj){
//        SessionFactory sf = HibernateUtil.getSessionFactory();
//        Session ses = sf.openSession();
//        FacDeta dao = (FacDeta)ses.get(FacDeta.class, obj.getDfacNum());
//        dao.setFacCabe(obj.getFacCabe());        
//        dao.setArticulos(obj.getArticulos());        
//        dao.setArtCan(obj.getArtCan());
//        dao.setPrecioArt(obj.getPrecioArt());       
//        ses.update(dao);
//        ses.beginTransaction().commit();
//        ses.close();
//    }
}
