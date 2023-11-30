package syamsul;
import javax.swing.*;
public class SYAMSUL55 {
    public static void main(String[] args) {
        String ulang="y";
        do
        {
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
            do
            {
                ulang = JOptionPane.showInputDialog("INPUT DATA BARANG [Y/T]");
            }
            while(!("y".equals(ulang) || "Y".equals(ulang) || "t".equals(ulang) || "T".equals(ulang)));
        }
        while ("y".equals(ulang) || "Y".equals(ulang));
        System.exit(0);

    }
}