package Service;

import Model.Negara;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class NegaraService
{
    static HashMap<Integer, Negara> negaraHashMap = getNegaraHashMap();

    public NegaraService()
    {
        super();
        if(negaraHashMap == null)
        {
            negaraHashMap = new HashMap<Integer, Negara>();
//            Object
            Negara indonesiaNegara = new Negara(1, "Indonesia", 2300000, "Rupiah");
            Negara jepangNegara    = new Negara(2, "Jepang", 2350000, "Yen");
            Negara malaysiaNegara  = new Negara(3, "Malaysia", 1500000,"Ringgit");
            Negara amerikaNegara   = new Negara(4, "Amerika", 2100000,"Dollar");

            negaraHashMap.put(1, indonesiaNegara);
            negaraHashMap.put(2, jepangNegara);
            negaraHashMap.put(3, malaysiaNegara);
            negaraHashMap.put(4, amerikaNegara);
        }
    }
    public List getAllNegara()
    {
        List negara = new ArrayList(negaraHashMap.values());
        return negara;
    }
    public Negara getNegara(int id)
    {
        Negara negara = negaraHashMap.get(id);
        return negara;
    }
    public Negara addNegara(Negara negara)
    {
        negara.setId(negaraHashMap.size() + 1);
        negaraHashMap.put(negara.getId(), negara);
        return negara;
    }
    public Negara updateNegara(Negara negara)
    {
        if(negara.getId() <= 0)
        {
            return null;
        }
        else
        {
            negaraHashMap.put(negara.getId(), negara);
            return negara;
        }
    }
    public void deleteNegara(int id)
    {
        negaraHashMap.remove(id);
    }
    public static HashMap<Integer, Negara> getNegaraHashMap()
    {
        return negaraHashMap;
    }
}
