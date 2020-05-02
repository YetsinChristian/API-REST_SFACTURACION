package com.mycompany.operaciones;

import com.mycompany.dao.Clientes;
import com.mycompany.dao.FacCabe;
import com.mycompany.dao.Vendedor;
import com.mycompany.entity.EFacCabe;
import com.mycompany.model.MFacCabe;
import java.util.ArrayList;
import java.util.List;

public class OFacCabe {
    public List<EFacCabe> get(){
        MFacCabe op = new MFacCabe();
        List<FacCabe> lista = op.get();
        //
        List<EFacCabe> datos = new ArrayList<EFacCabe>();
        for(FacCabe c : lista){
            EFacCabe bean = new EFacCabe();
            bean.setFacNum(c.getFacNum());
            bean.setCliCod(c.getClientes().getCliCod());
            bean.setFacTipo(c.getFacTipo());
            bean.setVenCod(c.getVendedor().getVenCod());
            bean.setFacEst(c.getFacEst());
            bean.setFacSubt(c.getFacSubt());
            bean.setFacIgv(c.getFacIgv());
            bean.setFacTot(c.getFacTot());
            bean.setVista(c.getVista());
            datos.add(bean);
        }        
        return datos;
    }
    public EFacCabe getFacCabe(EFacCabe obj){        
        MFacCabe op = new MFacCabe();
        FacCabe dao = new FacCabe();
        //
        dao.setFacNum(obj.getFacNum());
        //
        FacCabe aux = op.getFacCabe(dao);
        //
        EFacCabe datos = new EFacCabe();        
        datos.setFacNum(aux.getFacNum());
        datos.setFacFec(aux.getFacFec());
        datos.setCliCod(aux.getClientes().getCliCod());
        datos.setFacTipo(aux.getFacTipo());
        datos.setVenCod(aux.getVendedor().getVenCod());
        datos.setFacEst(aux.getFacEst());
        datos.setFacSubt(aux.getFacSubt());
        datos.setFacIgv(aux.getFacIgv());
        datos.setFacTot(aux.getFacTot());
        datos.setVista(aux.getVista());
        return datos;
    }
    public void saveFacCabe(EFacCabe obj){
        FacCabe dao = new FacCabe();                
        
        dao.setFacFec(obj.getFacFec());
        //
        Clientes auxCli = new Clientes();
        auxCli.setCliCod(obj.getCliCod());
        dao.setClientes(auxCli);        
        //
        dao.setFacTipo(obj.getFacTipo());
        //
        Vendedor auxVen = new Vendedor();
        auxVen.setVenCod(obj.getVenCod());
        dao.setVendedor(auxVen);
        //
        dao.setFacEst(obj.getFacEst());
        dao.setFacSubt(obj.getFacSubt());
        dao.setFacIgv(obj.getFacIgv());
        dao.setFacTot(obj.getFacTot());
        dao.setVista(obj.getVista());
        MFacCabe op = new MFacCabe();
        op.saveFacCabe(dao);
    }
    public void deleteFacCabe(EFacCabe obj){
        FacCabe dao = new FacCabe();
        dao.setFacNum(obj.getFacNum());
        MFacCabe op = new MFacCabe();
        op.deleteFacCabe(dao);
    }
    public void updateFacCabe(EFacCabe obj){
        FacCabe dao = new FacCabe();                
        
        dao.setFacNum(obj.getFacNum());
        dao.setFacFec(obj.getFacFec());
        //
        Clientes auxCli = new Clientes();
        auxCli.setCliCod(obj.getCliCod());
        dao.setClientes(auxCli);        
        //
        dao.setFacTipo(obj.getFacTipo());
        //
        Vendedor auxVen = new Vendedor();
        auxVen.setVenCod(obj.getVenCod());
        dao.setVendedor(auxVen);
        //
        dao.setFacEst(obj.getFacEst());
        dao.setFacSubt(obj.getFacSubt());
        dao.setFacIgv(obj.getFacIgv());
        dao.setFacTot(obj.getFacTot());
        dao.setVista(obj.getVista());
        MFacCabe op = new MFacCabe();
        op.updateFacCabe(dao);
    }
}
