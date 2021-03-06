package tr.edu.medipol.yazilimaraclari.finalproject;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/urun")
public class UrunlerRestApi {

    @GetMapping("/listele")
    public List<Urun> listele(){
        return UrunDepo.urunleriGetir();
    }
    
        @PostMapping("/ekle")
    public Urun ekle(@RequestBody Urun urun) {
    	UrunDepo.urunEkle(urun);
    	return urun;
    }
    
    
}
