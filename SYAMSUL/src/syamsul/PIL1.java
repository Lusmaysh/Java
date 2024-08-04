package syamsul;
import javax.swing.JOptionPane;
public class PIL1 {
    void total(String pes, int harga)
    {
        boolean putar=true;
        do
        {
            try
            {
                String e= JOptionPane.showInputDialog("JUMLAH PORSI YANG INGIN DIPESAN");
                int ne= Integer.parseInt(e);
                int pp = ne * harga;
                JOptionPane.showMessageDialog(null,"PESANAN = "+pes+" \nTOTAL PESANAN = "+ne+"\nTOTAL BAYAR = "+pp);
                putar=false;
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null," ANDA SALAH INPUT\n ULANGI LAGI");
                putar=true;
            }
        }
        while(putar);
    }
}