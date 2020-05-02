package com.mycompany.operaciones;

import com.mycompany.dao.Articulos;
import com.mycompany.dao.FacCabe;
import com.mycompany.dao.FacDeta;
import com.mycompany.entity.EFacCabe;
import com.mycompany.entity.EFacDeta;
import com.mycompany.model.MFacDeta;
import java.util.ArrayList;
import java.util.List;

public class OFacDeta {
    
    public List<EFacDeta> get(EFacCabe obj){        
        List<EFacDeta> datos = new ArrayList<EFacDeta>();
        FacCabe auxFacCabe = new FacCabe();
        auxFacCabe.setFacNum(obj.getFacNum());
        MFacDeta op = new MFacDeta();        
        List<FacDeta> dao = op.get(auxFacCabe);
        for(FacDeta c : dao){
            EFacDeta bean = new EFacDeta();
            bean.setDfacNum(c.getDfacNum());
            bean.setFacNum(c.getFacCabe().getFacNum());
            bean.setArtCod(c.getArticulos().getArtCod());
            bean.setArtCan(c.getArtCan());
            bean.setPrecioArt(c.getPrecioArt());
            datos.add(bean);
        }
        return datos;
    }
    
    
    public void saveFacDeta(EFacDeta obj){
        FacDeta dao = new FacDeta();                
        //        
        FacCabe auxFacCabe = new FacCabe();
        auxFacCabe.setFacNum(obj.getFacNum());
        dao.setFacCabe(auxFacCabe);
        //
        Articulos auxArt = new Articulos();
        auxArt.setArtCod(obj.getArtCod());
        dao.setArticulos(auxArt);
        //
        dao.setArtCan(obj.getArtCan());
        dao.setPrecioArt(obj.getPrecioArt());
        MFacDeta op = new MFacDeta();
        op.saveFacDeta(dao);
    }
    
    public void deleteFacDeta(EFacCabe obj){        
        FacCabe auxFacCabe = new FacCabe();
        auxFacCabe.setFacNum(obj.getFacNum());
        MFacDeta op = new MFacDeta();        
        List<FacDeta> dao = op.get(auxFacCabe);
        for(FacDeta c : dao){                                    
            MFacDeta op2 = new MFacDeta();
            op2.deleteFacDeta(c);
        }                        
    }
}
