
package com.mycompany.model;

import com.mycompany.dao.Clientes;
import com.mycompany.dao.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class MCliente {
    //Obtener lista de objetos
    public List<Clientes> get(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        List<Clientes> datos = ses.createCriteria(Clientes.class).add(Restrictions.like("vista", 1)).list();   
        return datos;
    }
    //Obtener objeto por id
    public Clientes getCliente(Clientes obj){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        Clientes datos = (Clientes)ses.get(Clientes.class, obj.getCliCod()) ;        
        return datos;
    }
    //Crear nuevo objeto
    public void saveCliente(Clientes obj){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        ses.save(obj);
        ses.beginTransaction().commit();
        ses.close();
    }
    //Eliminar un objeto
    public void deleteCliente(Clientes obj){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        Clientes dao = (Clientes)ses.get(Clientes.class, obj.getCliCod());        
        dao.setVista(0);
        ses.update(dao);
        ses.beginTransaction().commit();
        ses.close();
    }
    //Editar un objeto
    public void updateCliente(Clientes obj){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        Clientes dao = (Clientes)ses.get(Clientes.class, obj.getCliCod());
        dao.setCliNom(obj.getCliNom());
        dao.setCliTel(obj.getCliTel());
        dao.setCliCor(obj.getCliCor());
        dao.setCliDir(obj.getCliDir());
        dao.setCliCre(obj.getCliCre());
        dao.setVista(obj.getVista());
        ses.update(dao);
        ses.beginTransaction().commit();
        ses.close();
    }
}
