/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ti.umy.dataktp.ti.umy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author LENOVO
 */

@Controller
public class fileController {
    
    @RequestMapping("/dataktp")
    public String tampilData (Model model) {
        
        ArrayList<List<String>> data = new ArrayList<>() ;
        
        data.add(Arrays.asList("ID","Nomor KTP","Nama","Alamat"));
        data.add(Arrays.asList("001","2000013","Muhammad","Yogyakarta"));
        data.add(Arrays.asList("002","2000015","Syafii","Bali"));
        data.add(Arrays.asList("003","2000134","Maarif","Jawa Tengah"));
        data.add(Arrays.asList("004","2000233","Siti","Jawa Barat"));
        data.add(Arrays.asList("005","2000144","Istiqomah","Jawa Timur"));
        data.add(Arrays.asList("006","2000678","Muh","Jakarta"));
        data.add(Arrays.asList("007","2000778","Hamidi","Aceh"));
        data.add(Arrays.asList("008","2000448","Panca","Kalimantan Barat"));
        data.add(Arrays.asList("009","2000618","Sari","Kalimantan Tengah"));
        data.add(Arrays.asList("010","2000731","Puput","Maluku"));
        data.add(Arrays.asList("011","2000701","Hanun","Sumatra Utara"));
        data.add(Arrays.asList("012","2000220","Eka","Sumatra Barat"));
        data.add(Arrays.asList("013","2000340","Latifa","Jawa Tengah"));
        data.add(Arrays.asList("014","2000110","Arkan","Jawa Tengah"));
        data.add(Arrays.asList("015","2000983","Iqbal","Yogyakarta"));
        data.add(Arrays.asList("016","2000377","Angga","Jawa Timur"));
        data.add(Arrays.asList("017","2000664","Dheva","Jawa Barat"));
        data.add(Arrays.asList("018","2000022","Ning","Jawa Barat"));
        data.add(Arrays.asList("019","2000059","Ayu","Maluku"));
        data.add(Arrays.asList("020","2000569","Eni","Maluku"));
        
        model.addAttribute("tabel", data);
        
        return "view";
    }
}
