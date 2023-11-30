package syamsul;
import javax.swing.*;
public class SYAMSUL72 {
    private static String ga, ket = "", lagi = "y", tempat = "",ed;
    private static int n = 0, x, z, k = 0, b = 0;
    private static boolean putar = true;
    public static void main(String[] args){
        
        String tk [] = null;
        tk = new String [101];
        
        x = -1;
        
        do
        {
            x = x + 1;
            
        do
        {
            ga = JOptionPane.showInputDialog("GIZI ANAK TK\n"
                    + "A. KURANG\n"
                    + "B. BAIK\n");
            
            switch(ga)
            {
                case "A" : {
                            ket = "KURANG";
                            putar = false;
                            break;
                           }
                
                case "B" : {
                            ket = "BAIK";
                            putar = false;
                            break;
                           }
                
                default : 
                           {
                            n = n + 1;
                            JOptionPane.showMessageDialog(null, "DATA SALAH, ULANGI"+"\nINI KE = "+n+"\n");
                            
                            if(n==3)
                            {
                                JOptionPane.showMessageDialog(null,"SUDAH 3, KELUAR");
                                System.exit(0);
                            }
                            
                            putar = true;
                           }
            }
        }
        while(putar);
        tk[x] = ga;
        
        JOptionPane.showMessageDialog(null, "GIZI ANAK = "+ket);
        
        do
        {
            lagi = JOptionPane.showInputDialog("INPUT GIZI [Y/T]");
        }
        while(!("y".equals(lagi) || "Y".equals(lagi) || "t".equals(lagi) || "T".equals(lagi)));
        }
        while("y".equals(lagi) || "Y".equals(lagi));
        
        z = 0;
        tempat += "          GIZI ANAK TK          \n";
        tempat += "--------------------------------\n";
        tempat += "  NO  ANAK KE  GIZI   KETERANGAN\n";
        tempat += "--------------------------------\n";
        for(int y = 0; y<=x; y = y + 1)
        {
            z = z + 1;
            switch(tk[y])
            {
                case "A" : {
                            ket = "KURANG";
                            k = k + 1;
                            break;
                           }
                
                case "B" : {
                            ket = "BAIK";
                            b = b + 1;
                            break;
                           }
            }
            tempat += " "+z+" Anak "+z+"  "+tk[y]+"  "+ket+"\n";
        }
        tempat += "--------------------------------\n";
        tempat += "         TOTAL GIZI BAIK = "+b+"\n";
        tempat += "       TOTAL GIZI KURANG = "+k+"\n";
        JOptionPane.showMessageDialog(null, tempat, "REKAP LAPORAN", JOptionPane.INFORMATION_MESSAGE);
        
    }
}