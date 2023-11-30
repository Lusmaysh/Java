package syamsul;
import javax.swing.JOptionPane;
public class SYAMSUL60 
{
    private static String a,d,up,ket, ket1,info="",l,dt,s,status,lok;
    private static int hd, nup, tb,no=0, gt =0, ttb=0;
    private static boolean putar=true;
    private static float rr=0.0f;
    public static void main(String[] args) 
    {
        String lagi="y";
        info +="                     REKAP  DATA                   \n";
        info +="--------------------------------------------------- \n";
        info +="  NO   ARISAN   UANG POKOK  DAFTAR    TOTAL         \n";
        info +="--------------------------------------------------- \n";
        do
        {
            no = no +1;
            ket1="";

            String tempat ="";
            do
            {
               a = JOptionPane.showInputDialog("  ARISAN \n1. UANG  \n2. BARANG\n3. JALAN-JALAN\n");
            }
            while(!("1".equals(a) || "2".equals(a) || "3".equals(a)));
            ket1= " UMUM ";
            ket="  UANG ";
            if ("2".equals(a))
            {
             ket =" BARANG ";
             do
             {
              d = JOptionPane.showInputDialog("  DAFTAR BARANG"
                   + " \n1. TV  \n2. KULKAS \n3. MOTOR \n");
             }
             while(!("1".equals(d) || "2".equals(d) || "3".equals(d)));
                hd=0;
                if("1".equals(d))
                {
                    hd = 300000;
                    ket1="  TV "; 

                }
                else if("2".equals(d))
                {
                    hd = 500000;
                    ket1="  KULKAS "; 
                }
                else
                {
                    hd = 2500000;
                    ket1="  MOTOR "; 

                }
             JOptionPane.showMessageDialog(null,"ANDA BAYAR \n    "+hd);       
            }
            else if("3".equals(a))
            {
                ket="  JALAN-JALAN "; 
                do
                {
                    l=JOptionPane.showInputDialog("  LOKASI \n1. DALAM NEGERI  \n2. LUAR NEGERI\n");
                }
                while(!("1".equals(l) || "2".equals(l)));
                if("1".equals(l))
                {
                    dt = JOptionPane.showInputDialog(" DANA TAMBAHAN");
                    hd = Integer.parseInt(dt);
                    ket1="DALAM NEGERI";

                }
                else
                {
                    dt = JOptionPane.showInputDialog(" DANA KHUSUS");
                    hd = Integer.parseInt(dt);
                    ket1="LUAR NEGERI";
                }
                s = JOptionPane.showInputDialog(" STATUS\n1. KELUARGA\n2. PERORANGAN\n");
                status = "KELUARGA";
                if ("2".equals(s))
                {
                    status="PERORANGAN";
                }
            }
           
      do
      {
          try
          {
            up = JOptionPane.showInputDialog(" uang pokok");
            nup = Integer.parseInt(up); putar = false;
          }
          catch (Exception e)
          {
              JOptionPane.showMessageDialog(null,"ANDA SALAH TULIS");putar=true;
          }
      }
      while (putar);

     tb = nup + hd;
     ttb= ttb +tb;
     gt=gt + tb;
     tempat += "   ARISAN      =  "+ket+"\n";
     tempat += "   UANG POKOK  =  "+up+"\n";
     if("2".equals(a))
     {
     tempat += "   BARANG      =  "+ket1+"\n";   
     }
     else if("3".equals(a))
     {
        tempat += "   LOKASI      =  "+ket1+"\n";   
        tempat += "   DANA KHUSUS      =  "+hd+"\n";   
        tempat += "   STATUS      =  "+status+"\n";   

     }
     tempat += "   TOTAL BAYAR =  "+tb+"\n";
     
JOptionPane.showMessageDialog(null,tempat," REKAP ",JOptionPane.INFORMATION_MESSAGE);
 info +=" "+no+"    "+ket+"     "+up+ "     "+ket1+"     "+tb+"\n";
 
     
            do
            {
                lagi = JOptionPane.showInputDialog("INPUT DATA [Y/T]");
            }
            while(!("y".equals(lagi) || "Y".equals(lagi)|| "t".equals(lagi) || "T".equals(lagi)));
            
        }
        while("y".equals(lagi) || "Y".equals(lagi) );
        rr = ttb/no;
   info +="--------------------------------------------------- \n";
   info +="        RATA - RATA  ARISAN     = "+rr+"\n";
   info +="        TOTAL ARISAN            = "+gt+"\n";
 JOptionPane.showMessageDialog(null,info," LAPORAN ARISAN ",JOptionPane.INFORMATION_MESSAGE);
   
        
    }
}
