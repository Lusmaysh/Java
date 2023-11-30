package syamsul;
import javax.swing.JOptionPane;
public class SYAMSUL59 
{
    private static String a,d,up,ket, ket1,info="";
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
            String tempat ="";
            do
            {
               a = JOptionPane.showInputDialog("  ARISAN \n1. UANG  \n2. BARANG\n");
            }
             while(!("1".equals(a) || "2".equals(a)));
            
            if ("2".equals(a))
            {
             do
             {
              d = JOptionPane.showInputDialog("  DAFTAR BARANG"
                   + " \n1. TV  \n2. KULKAS \n3. MOTOR \n");
             }
             while(!("1".equals(d) || "2".equals(d) || "3".equals(d)));
             
                if("1".equals(d))
                {
                    hd = 300000;
                }
                else if("2".equals(d))
                {
                    hd = 500000;
                }
                else
                {
                    hd = 2500000;
                }
             JOptionPane.showMessageDialog(null,"ANDA BAYAR \n    "+hd);       
            }
            else
            {
                ket1= " UMUM ";
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
      
      if("1".equals(a))
      {
         ket="  UANG "; 
      }
      else
      {
          ket =" BARANG ";
      }
      
     if("1".equals(d))
      {
         ket1="  TV "; 
      }
     else if("2".equals(d))
      {
          ket1 =" KULKAS ";
      } 
     else if("3".equals(d))
     {
         ket1 =" MOTOR ";
     }
     
     if("1".equals(a))
     {
         ket1=" UMUM ";
     }
     tb = nup + hd;
     
     tempat += "   ARISAN      =  "+ket+"\n";
     tempat += "   UANG POKOK  =  "+up+"\n";
     if("2".equals(a))
     {
     tempat += "   BARANG      =  "+ket1+"\n";   
     }
     tempat += "   TOTAL BAYAR =  "+tb+"\n";
     ttb= ttb +tb;
     gt=gt + tb;
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
