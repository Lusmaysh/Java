package syamsul;
import javax.swing.*;
public class SYAMSUL53 {
    private static String wb,ket1,jo,ht;
    private static int njo,nht;
    public static void main(String[] args) {
        String lagi="y",ni, rekap="";
        int no=0, ppn=0, gt=0;
        rekap += "-----------------------------------------------------------------------\n";
        rekap += "NO   WISATA   INSTANSI   JUMLAH ORANG    HARGA   TAMABAHAN    TOTAL\n";
        rekap += "-----------------------------------------------------------------------\n";
        
        do
        {
            String info="";
            int tb=0;
            no += 1;
            do
            {
                wb = JOptionPane.showInputDialog("WISATA BAHARI\n1. KAPAL\n2. RESTO\n3. MANCING\nPILIH [1-3]\n");
            }
            while(!("1".equals(wb) || "2".equals(wb) || "3".equals(wb)));
            if("1".equals(wb))
            {
                ket1 ="KAPAL" ;
                ppn=2000;
                
            }
            else if("2".equals(wb))
            {
                ket1 ="RESTO" ;
                ppn=500;
}
            else 
            {
                ket1 ="MANCING"; 
                ppn=50;

            }
            
            ni = JOptionPane.showInputDialog("NAMA INSTANSI\n");
            
            jo = JOptionPane.showInputDialog("JUMLAH ORANG\n");
            njo = Integer.parseInt(jo);
            
            ht = JOptionPane.showInputDialog("HARGA TIKET\n");
            nht = Integer.parseInt(ht);
            
            int tam=ppn*njo;
            tb = (nht*njo)+tam;
            gt+=tb;
            
            info += "1. WISATA        : "+ket1+"\n";
            info += "2. INSATNSI      : "+ni+"\n";
            info += "3. JUMLAH ORANG  : "+jo+"\n";
            info += "4. HARGA TIKET   : "+ht+"\n";
            info += "5. TAMBAHAN      : "+tam+"\n";
            info += "6. TOTAL BAYAR   : "+tb+"\n";
            
            JOptionPane.showMessageDialog(null,info,"REKAP TIKET  NO = "+no,JOptionPane.INFORMATION_MESSAGE);
            rekap += no+"   "+ket1+"   "+ni+"   "+jo+"   "+ht+"   "+tam+"   "+tb+"\n";
            
            do
            {
                lagi = JOptionPane.showInputDialog("INPUT DATA PENGUNJUNG [Y/T]");
            }
            while(!("y".equals(lagi) || "Y".equals(lagi) || "t".equals(lagi) || "T".equals(lagi)));
        }
        while("y".equals(lagi) || "Y".equals(lagi));
        rekap += "\n-----------------------------------------------------------------------\n";
        rekap += "TOTAL KESELURUHAN =  "+gt+"\n";
        JOptionPane.showMessageDialog(null,rekap,"            LAPORAN WISATA            ",JOptionPane.INFORMATION_MESSAGE);

    }
}
