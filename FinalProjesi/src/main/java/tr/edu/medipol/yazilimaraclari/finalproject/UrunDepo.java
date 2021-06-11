package tr.edu.medipol.yazilimaraclari.finalproject;

import java.util.*;

public final class UrunDepo {

    private static final List<Urun> URUNLER = new ArrayList<>(); 
    static {
    	URUNLER.add( new Urun("Canon Fotoğraf Makinesi"  ,"E001") );
    	URUNLER.add( new Urun("Monster Laptop"      ,"E002") );
    	URUNLER.add( new Urun("MSI Laptop"  ,"E003") );
    	URUNLER.add( new Urun("Alienware Bilgisayar" ,"E004") );
    }
    
    private UrunDepo() {
        
    }
    
    public static List<Urun> urunleriGetir() {
        return URUNLER;
    }
    
    public static List<Urun> urunEkle(Urun urun) {
        URUNLER.add(urun);
        return URUNLER;
    }
    
    public static List<Urun> urunSil(String id){
        for(Urun u : URUNLER) {
            if( u.getId().equals(id) ) {
                URUNLER.remove(u);
            }
        }
        
        return URUNLER;
    }
    
}