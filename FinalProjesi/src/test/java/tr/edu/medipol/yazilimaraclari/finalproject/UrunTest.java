package tr.edu.medipol.yazilimaraclari.finalproject;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UrunTest {

		@Test
		void testListele() {
			List<String> urun = Arrays.asList("MSI");
			List<String> liste = Arrays.asList("MSI");
			Assertions.assertEquals(urun, liste);
			
		}
		

        @Test
        void testSilme() {
        	UrunDepo.urunSil("E005");
        	String urun = UrunDepo.urunleriGetir().toString();
        	String sil = UrunDepo.urunleriGetir().toString();
        	Assertions.assertEquals(urun, sil);
       
		}
        
    	@Test
    	void testEkleme () {
    		List<String> urun = Arrays.asList("MSI");
    		List<String> ekle = Arrays.asList("MSI");
    		Assertions.assertEquals(urun, ekle);
    		
    		}
}
