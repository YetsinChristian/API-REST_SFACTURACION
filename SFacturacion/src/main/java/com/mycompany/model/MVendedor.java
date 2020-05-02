
package com.mycompany.model;

import com.mycompany.dao.HibernateUtil;
import com.mycompany.dao.Vendedor;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class MVendedor {
    //Obtener lista de objetos
    public List<Vendedor> get(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        List<Vendedor> datos = ses.createCriteria(Vendedor.class).add(Restrictions.like("vista", 1)).list();   
        return datos;
    }
    //Obtener objeto por id
    public Vendedor getVendedor(Vendedor obj){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        Vendedor datos = (Vendedor)ses.get(Vendedor.class, obj.getVenCod()) ;        
        return datos;
    }
    //Crear nuevo objeto
    public void saveVendedor(Vendedor obj){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        ses.save(obj);
        ses.beginTransaction().commit();
        ses.close();
    }
    //Eliminar un objeto
    public void deleteVendedor(Vendedor obj){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        Vendedor dao = (Vendedor)ses.get(Vendedor.class, obj.getVenCod());        
        dao.setVista(0);
        ses.update(dao);
        ses.beginTransaction().commit();
        ses.close();
    }
    //Editar un objeto
    public void updateVendedor(Vendedor obj){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        Vendedor dao = (Vendedor)ses.get(Vendedor.class, obj.getVenCod());
        dao.setVenNom(obj.getVenNom());
        dao.setVenApe(obj.getVenApe());
        dao.setVenFnac(obj.getVenFnac());        
        dao.setVenCel(obj.getVenCel());
        dao.setVenFing(obj.getVenFing());
        dao.setVenLogin(obj.getVenLogin());
        dao.setVenClave(obj.getVenClave());
        dao.setVista(obj.getVista());
        ses.update(dao);
        ses.beginTransaction().commit();
        ses.close();
    }
}
