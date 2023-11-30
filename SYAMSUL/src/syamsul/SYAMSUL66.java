package syamsul;
import javax.swing.*;
public class SYAMSUL66 {
    private static String lagi="y",info="",kota,prov,ik,ket,ket1,ikp,nm,nik,rekap="";
    private static int no=0;
    private static float t=0f,rt1=0f,rt2=0f,fik=0.0f,fikp=0.0f,tfik=0.0f,tfikp=0.0f;
    private static double gt=0.0;
    private static boolean loop=true;
    public static void main(String[] args) {
        rekap+="                                 LAPORAN DATA                                        \n";
        rekap+="=================================================================================\n";
        rekap+=" NAMA       KODE         KOTA        DAERAH     INDEX KEMISKINAN     INDEX KEPADATAN          TOTAL\n";
        rekap+="=================================================================================\n";
        do
        {
            no++;t=0f;
            info="";
            nm=JOptionPane.showInputDialog("MASUKAN NAMA ANDA");
            nik=JOptionPane.showInputDialog("MASUKAN KODE PENGENAL ANDA");
            
            do
            {
                kota=JOptionPane.showInputDialog("NAMA KOTA TINGGAL\n1. BOGOR\n2. PEKALOGAN\n3. BANTEN");
            }
            while(!("1".equals(kota)||"2".equals(kota)||"3".equals(kota)));
            ket="BOGOR";
            if("2".equals(kota))
            {
                ket="PEKALONGAN";
            }
            else if("3".equals(kota))
            {
                ket="BANTEN";
            }
            
            
            do
            {
                prov=JOptionPane.showInputDialog("DAERAH \n1. JAWA BARAT\n2. JAWA TENGAH\n3. JAWA TIMUR");
            }
            while(!("1".equals(prov)||"2".equals(prov)||"3".equals(prov)));
            ket1="JAWA TIMUR";
            if("1".equals(prov))
            {
                ket1="JAWA BARAT";
            }
            else if("2".equals(prov))
            {
                ket1="JAWA TENGAH";
            }
            
            do
            {
                try
                {
                    loop=false;
                    ik=JOptionPane.showInputDialog("INDEX KEMISKINAN\n[-5.00 S/D 5.00]");
                    fik=Float.parseFloat(ik);
                }
                catch(Exception e)
                {
                    loop=true;
                    JOptionPane.showMessageDialog(null,"ISI INPUT SALAH, ULANGI LAGI");
                }
            }
            while(loop || (!(fik>=-5.00 && fik<=5.00)));
            
            loop=true;
            do
            {
                try
                {
                    loop=false;
                    ikp=JOptionPane.showInputDialog("INDEX KEPADATAN PENDUDUK\n[0 S/D 10.00]");
                    fikp=Float.parseFloat(ikp);
                }
                catch(Exception e)
                {
                    loop=true;
                    JOptionPane.showMessageDialog(null,"ISI INPUT SALAH, ULANGI LAGI");
                }
            }
            while(loop || !(fikp>=0.0 && fikp<=10.00));
            
            t+=fik+fikp;
            tfik+=fik;
            tfikp+=fikp;
            gt+=t;
            
            info+=" NAMA USER        = "+nm+"\n";
            info+=" KODE USER        = "+nik+"\n";
            info+=" KOTA TINGGAL     = "+ket+"\n";
            info+=" DAERAH           = "+ket1+"\n";
            info+=" INDEX KEMISKINAN = "+fik+"\n";
            info+=" INDEX KEPADATAN  = "+fikp+"\n";
            JOptionPane.showMessageDialog(null,info,"NO = "+no+"  LAPORAN DATA SEMENTARA",JOptionPane.INFORMATION_MESSAGE);
            
            rekap+=" "+nm+"      "+nik+"      "+ket+"      "+ket1+"          "+fik+"            "+fikp+"            "+t+"\n";
            
            do
            {
                lagi = JOptionPane.showInputDialog("INPUT DATA LAGI [Y/T]");
            }
            while(!("y".equals(lagi) || "Y".equals(lagi)|| "t".equals(lagi) || "T".equals(lagi)));
        }
        while("y".equals(lagi) || "Y".equals(lagi));
        rt1=tfik/no;
        rt2=tfikp/no;
        rekap+="=================================================================================\n";
        rekap+="    RATA RATA INDEX KEMISKINAN           = "+rt1+"\n";
        rekap+="    RATA RATA INDEX KEPADATAN PENDUDUK   = "+rt2+"\n";
        rekap+="    GRAND TOTAL                          = "+gt+"\n";
        JOptionPane.showMessageDialog(null,rekap,"REKAP DATA",JOptionPane.INFORMATION_MESSAGE);
    }
}