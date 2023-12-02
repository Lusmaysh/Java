package syamsul;
import java.util.Scanner;
public class SYAMSUL84 {
    public static void main(String[] args) 
    {
        int dt=0,hal=0,sisa=0,x1=0,x2=0;
        
        dt = 78;
        sisa = dt%3;
        if(sisa == 0)
        {
            hal = dt/3; //Rumus pada kelipatan 3
        }
        else
        {
            hal = dt/3+1; //untuk rumus bukan kelipatan 3
        }
        
        if(hal==1)
        {
            x1=1;x2=dt;
        }
        else
        {
            x1=1;x2=3;
        }
        System.out.println(" JUMLAH DATA     =  "+dt);
        System.out.println(" JUMLAH HALAMAN  =  "+hal+"\n");
        
        for(int h=1;h<=hal;h++) // h (halaman), hal (halaman terakhir) UTAMA
        {
            System.out.println(" HAL = "+h);
            System.out.println("   ==============");
            System.out.println("         NO      ");
            System.out.println("   ==============");
            if(h == hal) // h adalah halaman yang bergerak, hal adalah halaman akhir
            {
                // halaman terakhir
                x2 = dt;
            }
            for(int t=x1; t<=x2;t++) // BERSARANG
            {
                System.out.println("         "+t);
            }
            System.out.println("   ==============");
            
            x1 += 3; // rumus umum
            x2 += 3; // rumus yang dipakai hanya bukan pada halaman terakhir
        }
    }
}