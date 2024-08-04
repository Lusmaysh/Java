package syamsul;
import javax.swing.JOptionPane;
public class TOT {
    static void sebut(String kata)
    {
        boolean putar=true;
        do
        {
            try
            {
                String k1 = JOptionPane.showInputDialog("BERAPA KALI KATA \n"+kata+" DIULANG");
                int k2=Integer.parseInt(k1);
                String t="";
                t+="ANDA MEMILIKI KATA "+kata+" "+k2+"x\n";
                for (int x=k2;x>=1;x--){
                    t+=kata+"\n";
                }
                JOptionPane.showMessageDialog(null,t);
                putar=false;
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"ANDA SALAH TULIS\n ULANGI");
            }
        }
        while(putar);
}
