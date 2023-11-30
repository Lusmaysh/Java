package syamsul;
import javax.swing.JOptionPane;
public class SYAMSUL77DEF {
    private static String lagi="y",ket,nm,jk,tb,bb,info;
    private static int x=-1,no_rekap=0,no_data=0;
    private static float ftb=0.0f,fbb=0.0f,tt=0.0f,gt=0.0f,ttb=0.0f,rt=0.0f,rb=0.0f;
    private static boolean putar=true;
    public static void main(String[] args) {
        String nama[];
        nama = new String[4];
        
        String kelamin[];
        kelamin = new String[4];
        
        float tinggi[];
        tinggi = new float[4];

        float berat[];
        berat = new float[4];
        do
        {
            if(x==3)
            {
                JOptionPane.showMessageDialog(null,"DATA SUDAH PENUH");
            }
            else
            {
                x++;no_data++;
                info="";x++;
                nm=JOptionPane.showInputDialog(" MASUKAN NAMA ANDA");
                nama[x]=nm;
                do
                {
                    jk=JOptionPane.showInputDialog(" JENIS KELAMIN [L / P] \n L = LAKI LAKI \n P = PEREMPUAN");
                }
                while(!("l".equals(jk) || "L".equals(jk) || "p".equals(jk) || "P".equals(jk)));
                ket="PEREMPUAN";
                if("l".equals(jk) || "L".equals(jk))
                {
                    ket="LAKI LAKI";
                }
                kelamin[x]=ket;
                
                do
                {
                    try
                    {
                        tb=JOptionPane.showInputDialog(" TINGGI BADAN ANDA");
                        ftb=Float.parseFloat(tb);
                        putar=false;
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null," ANDA SALAH INPUT\n ULANGI LAGI");
                        putar=true;
                    }
                }
                while(putar || (!(ftb>=0 && ftb<=200.00)));
                tinggi[x]=ftb;
                
                do
                {
                    try
                    {
                        bb=JOptionPane.showInputDialog(" BERAT BADAN ANDA");
                        fbb=Float.parseFloat(bb);
                        putar=false;
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null," ANDA SALAH INPUT\n ULANGI LAGI");
                        putar=true;
                    }
                }
                while(putar || (!(fbb>=0 && fbb<=200.00)));
                berat[x]=fbb;
                
                info += " NO : "+no_data+" \n";
                info += " NAMA MAHASISWA  =  "+nama[x]+" \n";
                info += " JENIS KELAMIN   =  "+kelamin[x]+" \n";
                info += " TINGGI BADAN    =  "+ftb+" \n";
                info += " BERAT BADAN     =  "+fbb+" \n";
                JOptionPane.showMessageDialog(null,info,"LAPORAN   NO = "+(x+1),JOptionPane.INFORMATION_MESSAGE);
                do
                {
                    lagi = JOptionPane.showInputDialog("INPUT DATA LAGI [Y/T]");
                }
                while(!("y".equals(lagi) || "Y".equals(lagi)|| "t".equals(lagi) || "T".equals(lagi)));
            }
            lagi="t";
        }
        while("y".equals(lagi) || "Y".equals(lagi));   
        
        info="";
        info="";
        info+="                           REKAP DATA                   \n";
        info+="---------------------------------------------------------------\n";
        info+="     NO        NAMA        KELAMIN       TINGGI       BERAT    \n";
        info+="---------------------------------------------------------------\n";
        for(int y=0;y<=x;y++)
        {
            no_rekap++;
            info+="  "+no_rekap+"    "+nama[y]+"    "+kelamin[y]+"    "+tinggi[y]+"    "+berat[y]+"\n";
            tt+=tinggi[y];
            ttb+=berat[y];
        }
        rt=tt/no_rekap;
        rb=ttb/no_rekap;
        info+="-------------------------------------------------\n";
        info+="   RATA-RATA TINGGI           =  "+rt+"\n";
        info+="   RATA-RATA BERAT BADAN      =  "+rb+"\n";
        JOptionPane.showMessageDialog(null,info,"LAPORAN REKAP",JOptionPane.INFORMATION_MESSAGE);
    }
}    
