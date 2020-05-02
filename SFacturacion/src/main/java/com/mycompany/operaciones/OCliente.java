package com.mycompany.operaciones;

import com.mycompany.dao.Clientes;
import com.mycompany.entity.ECliente;
import com.mycompany.model.MCliente;
import java.util.ArrayList;
import java.util.List;

public class OCliente {
    public List<ECliente> get(){
        MCliente op = new MCliente();
        List<Clientes> lista = op.get();
        //
        List<ECliente> datos = new ArrayList<ECliente>();
        for(Clientes c : lista){
            ECliente bean = new ECliente();
            bean.setCliCod(c.getCliCod());
            bean.setCliNom(c.getCliNom());
            bean.setCliTel(c.getCliTel());            
            bean.setCliCor(c.getCliCor());            
            bean.setCliDir(c.getCliDir());            
            bean.setCliCre(c.getCliCre());            
            bean.setVista(c.getVista());            
            datos.add(bean);
        }        
        return datos;
    }
    public ECliente getCliente(ECliente obj){        
        MCliente op = new MCliente();
        Clientes dao = new Clientes();
        //
        dao.setCliCod(obj.getCliCod());
        //
        Clientes aux = op.getCliente(dao);
        //
        ECliente datos = new ECliente();
        datos.setCliCod(aux.getCliCod());
        datos.setCliNom(aux.getCliNom());
        datos.setCliTel(aux.getCliTel());        
        datos.setCliCor(aux.getCliCor());
        datos.setCliDir(aux.getCliDir());
        datos.setCliCre(aux.getCliCre());
        datos.setVista(aux.getVista());
        return datos;
    }
    public void saveCliente(ECliente obj){
        Clientes dao = new Clientes();        
        dao.setCliNom(obj.getCliNom());
        dao.setCliTel(obj.getCliTel());        
        dao.setCliCor(obj.getCliCor());
        dao.setCliDir(obj.getCliDir());
        dao.setCliCre(obj.getCliCre());
        dao.setVista(obj.getVista());
        MCliente op = new MCliente();
        op.saveCliente(dao);
    }
    public void deleteCliente(ECliente obj){
        Clientes dao = new Clientes();
        dao.setCliCod(obj.getCliCod());
        MCliente op = new MCliente();
        op.deleteCliente(dao);
    }
    public void updateCliente(ECliente obj){
        Clientes dao = new Clientes();
        dao.setCliCod(obj.getCliCod());
        dao.setCliNom(obj.getCliNom());
        dao.setCliTel(obj.getCliTel());        
        dao.setCliCor(obj.getCliCor());
        dao.setCliDir(obj.getCliDir());
        dao.setCliCre(obj.getCliCre());
        dao.setVista(obj.getVista());
        MCliente op = new MCliente();
        op.updateCliente(dao);
    }
}
