package syamsul; //P14-M71
import javax.swing.*;
public class SYAMSUL105_14_M {
    public static void main(String[] args) {
        String suarakucing = "";
        String suaraayam = "";
        String suaratikus = "";
        
        KUCING meong = new KUCING();
        suarakucing = meong.lolong();
        JOptionPane.showMessageDialog(null,"SUARA KUCING .... "+" "+suarakucing+"\n BENARKAN SUARA KUCING");
        suarakucing = meong.lolong1();
        JOptionPane.showMessageDialog(null,"SUARA KUCING INPUTAN \n"+suarakucing);
        
        AYAM kokok = new AYAM();
        suaraayam = kokok.petok();
        JOptionPane.showMessageDialog(null,"SUARA AYAM ......  "+suaraayam+"\n BENARKAN SUARA AYAM");
        suaraayam = kokok.petok1();
        JOptionPane.showMessageDialog(null,"SUARA AYAM INPUTAN\n"+suaraayam);
        
        TIKUS cicit = new TIKUS();
        suaratikus = cicit.yiyit();
        JOptionPane.showMessageDialog(null,"SUARA TIKUS .....  "+suaratikus+"\n BENARKAN SUARA TIKUS");
        suaratikus = cicit.yiyit1();
        JOptionPane.showMessageDialog(null,"SUARA TIKUS INPUTAN\n"+suaratikus);
    }
}