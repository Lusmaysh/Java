package syamsul;
import javax.swing.JOptionPane;
public class SYAMSUL107 {
    public static void main(String[] args) {
        String suarakucing = "";
        String suaraayam = "";
        String suaratikus = "";
        
        KUCING meong = new KUCING();
        suarakucing = meong.lolong();
        JOptionPane.showMessageDialog(null,"SUARA KUCING .... "+" "+suarakucing+"\n BENARKAN SUARA KUCING");
        
        AYAM kokok = new AYAM();
        suaraayam = kokok.petok();
        JOptionPane.showMessageDialog(null,"SUARA AYAM ......  "+suaraayam+"\n BENARKAN SUARA AYAM");
        
        TIKUS cicit = new TIKUS();
        suaratikus = cicit.yiyit();
        JOptionPane.showMessageDialog(null,"SUARA TIKUS .....  "+suaratikus+"\n BENARKAN SUARA TIKUS");
    }
}
