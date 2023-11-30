package syamsul;
import javax.swing.*;
public class SYAMSUL67 {
    private static String nh,ip,jk,info,ket,lagi="y";
    private static int x=-1,no=0;
    private static float nip=0.0f,ti=0.0f,rr=0.0f;
    private static boolean putar=true;
    public static void main(String[] args) {
        String hewan[]; hewan = new String[10];
        float penyakit[]; penyakit = new float[10];
        String jenis[]; jenis = new String[10];
        
        do
        {
            if(x == 9)
            {
                JOptionPane.showMessageDialog(null," DATA PENUH \n DAN KELUAR");
                lagi="t";
            }
            else
            {
            x++;
            info="";
            nh=JOptionPane.showInputDialog("NAMA HEWAN");
            do
            {
                try
                {
                    ip=JOptionPane.showInputDialog(" INDEX PENYAKIT\n -2.00 S/D 5.00");
                    nip=Float.parseFloat(ip);
                    putar=false;
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null," ANDA SALAH INPUT\n ULANGI LAGI");
                    putar=true;
                }
            }
            while(putar || (!(nip>=-2.00 && nip<=5.00)));

            do
            {
                jk=JOptionPane.showInputDialog(" JENIS KELAMIN [J/B] \n J = JANTAN \n B = BETINA");
            }
            while(!("j".equals(jk) || "J".equals(jk) || "b".equals(jk) || "B".equals(jk)));
            hewan[x]=nh;
            penyakit[x]=nip;
            jenis[x]=jk;
            ket="BETINA";
            if("j".equals(jenis[x]) || "J".equals(jenis[x]))
            {
                ket="JANTAN";
            }
            
            info += " NAMA HEWAM      = [ "+hewan[x]+" ]\n";
            info += " INDEX PENYAKIT  = [ "+penyakit[x]+" ]\n";
            info += " JENIS KELAMIN   = [ "+ket+" ]\n";
            JOptionPane.showMessageDialog(null,info,"LAPORAN   NO = "+(x+1),JOptionPane.INFORMATION_MESSAGE);
        
            do
            {
                lagi = JOptionPane.showInputDialog(" INPUT DATA HEWAN [Y/T]");
            }
            while(!("y".equals(lagi) || "Y".equals(lagi)|| "t".equals(lagi) || "T".equals(lagi)));
            }
        }
        while("y".equals(lagi) || "Y".equals(lagi));
        info="";
        info+="                    REKAP DATA                   \n";
        info+="-------------------------------------------------\n";
        info+="     NO        NAMA        INDEX        JENIS    \n";
        info+="-------------------------------------------------\n";
        for(int y=0;y<=x;y++)
        {
            no++;
            ket="BETINA";
            if("j".equals(jenis[y]) || "J".equals(jenis[y]))
            {
                ket="JANTAN";
            }
            info+="  "+no+"    "+hewan[y]+"    "+penyakit[y]+"    "+ket+"\n";
            ti+=penyakit[y];
        }
        rr=ti/no;
        info+="-------------------------------------------------\n";
        info+="   TOTAL INDEX          =  "+ti+"\n";
        info+="   RATA RATA INDEX      =  "+rr+"\n";
        
        JOptionPane.showMessageDialog(null,info,"LAPORAN HEWAN",JOptionPane.INFORMATION_MESSAGE);
    }
}