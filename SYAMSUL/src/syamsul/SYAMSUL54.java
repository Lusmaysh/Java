package syamsul;
import javax.swing.*;
public class SYAMSUL54 {
    public static void main(String[] args) {
        String info="";
        int BAYAR=0;
        String NM_BRG=JOptionPane.showInputDialog("NAMA BARANG");
        String HG_BRG=JOptionPane.showInputDialog("HARGA BARANG");
        int HARGA=Integer.parseInt(HG_BRG);
        String PT_BRG=JOptionPane.showInputDialog("POTONGAN HARGA");
        int POTONG=Integer.parseInt(PT_BRG);

        BAYAR=HARGA-POTONG;
        info +="\n Nama      = "+NM_BRG;
        info +="\n HARGA     = "+HARGA;
        info +="\n POTONGAN  = "+POTONG;
        info +="\n BAYAR     = "+BAYAR;
        JOptionPane.showMessageDialog(null, info,"INFORMASI HARGA",JOptionPane.INFORMATION_MESSAGE);
        info = "";
        System.exit(0);
    }
}