package syamsul;
import javax.swing.JOptionPane;
public class SYAMSUL70 {
    private static String lagi="y",ket,nm,jk,tb,bb,info;
    private static int x=-1,no=0;
    private static float ftb=0.0f,fbb=0.0f,tt=0.0f,gt=0.0f,ttb=0.0f;
    private static boolean putar=true;
    public static void main(String[] args) {
        String n[];
        n = new String[5];
        
        String k[];
        k = new String[5];
        
        float t[];
        t = new float[5];

        float b[];
        b = new float[5];

        do
        {
            if(x == 4)
            {
                JOptionPane.showMessageDialog(null,"DATA SUDAH PENUH");
                lagi="t";
            }
            else 
            {
                info="";x++;
                nm=JOptionPane.showInputDialog(" MASUKAN NAMA ANDA");
                n[x]=nm;
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
                k[x]=ket;
                
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
                t[x]=ftb;
                
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
                b[x]=fbb;
                
                info += " NAMA MAHASISWA  = [ "+n[x]+" ]\n";
                info += " JENIS KELAMIN   = [ "+k[x]+" ]\n";
                info += " TINGGI BADAN    = [ "+ftb+" ]\n";
                info += " BERAT BADAN     = [ "+fbb+" ]\n";
                JOptionPane.showMessageDialog(null,info,"LAPORAN   NO = "+(x+1),JOptionPane.INFORMATION_MESSAGE);
                
                do
                {
                    lagi = JOptionPane.showInputDialog("INPUT DATA LAGI [Y/T]");
                }
                while(!("y".equals(lagi) || "Y".equals(lagi)|| "t".equals(lagi) || "T".equals(lagi)));
            }
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
            no++;
            info+="  "+(y+1)+"    "+n[y]+"    "+k[y]+"    "+t[y]+"    "+b[y]+"\n";
            tt+=t[y];
            ttb+=b[y];
            gt+=tt+ttb;
        }
        info+="-------------------------------------------------\n";
        info+="   TOTAL TINGGI           =  "+tt+"\n";
        info+="   TOTAL BERAT BADAN      =  "+ttb+"\n";
        info+="   TOTAL KESELURUHAN      =  "+gt+"\n";
        
        JOptionPane.showMessageDialog(null,info,"LAPORAN REKAP",JOptionPane.INFORMATION_MESSAGE);
        
    }
}
