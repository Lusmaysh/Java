package syamsul;
import javax.swing.*;
public class SYAMSUL57 {
    private static String kelamin,kt;
    public static void main(String[] args) {
        String ulang="y",ket,rekap="";
        int no=0,gt=0;
        rekap += "                      HASIL LAPORAN                    \n"
               + "----------------------------------------------------------------------------------\n"
               + " NO    NAMA    KELAMIN     JUMLAH    HARGA   PAJAK     KOTA TUJUAN   TOTAL BAYAR \n"
               + "-----------------------------------------------------------------------------------\n";
        do
        {
            no++;
            String info="";
            String nama=JOptionPane.showInputDialog("MASUKAN NAMA ANDA");
            do
            {
                kelamin=JOptionPane.showInputDialog("MASUKAN JENIS KELAMIN [L/P]");
            }
            while(!("l".equals(kelamin) || "L".equals(kelamin) || "p".equals(kelamin) || "P".equals(kelamin)));
            String jenis="PEREMPUAN";
            if("l".equals(kelamin) || "L".equals(kelamin)) {
                jenis="LAKI-LAKI";
            }
            
            String jo=JOptionPane.showInputDialog("JUMLAH ORANG");
            int njo=Integer.parseInt(jo);
            
            String ht=JOptionPane.showInputDialog("HARGA TIKET/ORANG");
            int nht=Integer.parseInt(ht);
            
            String pjk=JOptionPane.showInputDialog("BIAYA ADMIN");
            int ppn=Integer.parseInt(pjk);
            
            do
            {
                kt=JOptionPane.showInputDialog("KOTA TUJUAN [1-6]\n1. JAKARTA\n2. YOGYAKARTA\n3. BANDUNG\n4. MALANG\n5. MAKASSAR\n6. PADANG");
            }
            while(!("1".equals(kt) || "2".equals(kt) || "3".equals(kt) || "3".equals(kt) || "4".equals(kt) || "5".equals(kt) || "6".equals(kt)));
            if ("1".equals(kt)){
                ket="JAKARTA";
            }
            else if ("2".equals(kt)){
                ket="YOGYAKARTA";
            }
            else if ("3".equals(kt)){
                ket="BANDUNG";
            }
            else if ("4".equals(kt)){
                ket="MALANG";
            }
            else if ("5".equals(kt)){
                ket="MAKASSAR";
            }
            else{
                ket="PADANG";
            }
            
            int tb=njo*nht+ppn;gt+=tb;
            info += " 1. NAMA               = "+nama+"\n";
            info += " 2. JENIS KELAMIN      = "+jenis+"\n";
            info += " 3. JUMLAH ORANG       = "+jo+"\n";
            info += " 4. HARGA TIKET/ORANG  = "+ht+"\n";
            info += " 5. BIAYA ADMIN        = "+pjk+"\n";
            info += " 6. KOTA TUJUAN        = "+ket+"\n";
            info += " 7. TOTAL BIAYA        = "+tb+"\n";
            JOptionPane.showMessageDialog(null,info,"DATA PENUMPANG",JOptionPane.INFORMATION_MESSAGE);
            rekap+=" "+no+"     "+nama+"     "+jenis+"     "+jo+"     "+ht+"     "+pjk+"     "+ket+"     "+tb+"\n";
            
            do
            {
                ulang = JOptionPane.showInputDialog("INPUT DATA LAGI [Y/T]");
            }
            while(!("y".equals(ulang) || "Y".equals(ulang) || "t".equals(ulang) || "T".equals(ulang)));
        }
        while ("y".equals(ulang) || "Y".equals(ulang));
        rekap+="----------------------------------------------------------------------------------\n"
             + "        TOTAL KESELURUHAN = "+gt+"\n";
        JOptionPane.showMessageDialog(null,rekap,"LAPORAN BIAYA TIKET",JOptionPane.INFORMATION_MESSAGE);
    }
}