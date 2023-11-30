package syamsul;
import javax.swing.*;
public class SYAMSUL52 {
    private static String kt,fa,ket,ket1;
    private static int  njo,nfa,nhg;
    public static void main(String[] args) {
        String lagi = "y", rekap="";
        int no=0, gt=0;
        rekap += "                      HASIL LAPORAN                    \n"
               + "-------------------------------------------------------\n"
               + "NO    KOTA    JUMLAH  HARGA   FASILITAS   TOTAL BAYAR \n"
               + "-------------------------------------------------------\n";
        do
        {
            no++;
            int tb=0;
            String info="";
            
            do
            {
                kt=JOptionPane.showInputDialog("KOTA TUJUAN\n1. SEMARANG\n2. PEKALONGAN\nPILIH [1-2]\n");
            }
            while(!("1".equals(kt) || "2".equals(kt)));
            if ("1".equals(kt)){
                ket1="SEMARANG";
            }
            else{
                ket1="PEKALONGAN";
            }

            String jo=JOptionPane.showInputDialog("JUMLAH ORANG/PENUMPANG");
            njo=Integer.parseInt(jo);
            
            String hg=JOptionPane.showInputDialog("HARGA TIKET/ORANG");
            nhg=Integer.parseInt(hg);
            
            do
            {
                fa=JOptionPane.showInputDialog("FASILITAS\n1. MAKAN+MINUM\n2. SNACK\n3. MINUM\nPILIH [1-3]\n");

            }
            while(!("1".equals(fa) || "2".equals(fa) || "3".equals(fa)));
            if ("1".equals(fa)){
                ket="MAKANAN+MINUMAN";
            }
            else if ("2".equals(fa)){
                ket="SNACK";
            }
            else{
                ket="MINUMAN";
            }
            
            tb=njo*nhg;
            gt+=tb;
            info += " KOTA          = "+ket1+"\n"
                  + " JUMLAH        = "+jo+"\n"
                  + " HARGA         = "+hg+"\n"
                  + " FASILITAS     = "+ket+"\n"
                  + " TOTAL BAYAR   = "+tb+"\n";
            JOptionPane.showMessageDialog(null,info,"NO = "+no+"       REKAP DATA",JOptionPane.INFORMATION_MESSAGE);
            rekap += " "+no+"     "+ket1+"     "+njo+"     "+nhg+"     "+ket+"      "+tb+"\n";
            
            do
            {
                lagi = JOptionPane.showInputDialog("INPUT DATA LAGI [Y/T]");
            }
            while(!("y".equals(lagi) || "Y".equals(lagi) || "t".equals(lagi) || "T".equals(lagi)));
        }
        while ("y".equals(lagi) || "Y".equals(lagi));
        rekap+=" ------------------------------------------------------------\n"
             + "        TOTAL KESELURUHAN = "+gt+"\n";
        JOptionPane.showMessageDialog(null,rekap,"LAPORAN REKAP PENUMPANG",JOptionPane.INFORMATION_MESSAGE);

    }
}