package survey;
import javax.swing.JOptionPane;
public class alamat1 {
    static void lap(int data,int p){
        
        int hal=0,sisa=0,x1=0,x2=0,h,tdata=0;
        int em=0,tel=0,fb=0,wa=0,ig=0,tele=0,dll=0;
        int tem=0,ttel=0,tfb=0,twa=0,tig=0,ttele=0,tdll=0;
        
        sisa = data%p;
        if(sisa == 0)
        {
            hal = data/p; //Rumus pada kelipatan (tergantung nilai p)
        }
        else
        {
            hal = data/p+1; //untuk rumus bukan kelipatan (tergantung nilai p)
        }

        if(hal==1)
        {
            // x1 data pertama, x2 data terakhir (dalam satu halaman)
            x1=1;x2=data;
        }
        else
        {
            // x1 data pertama, x2 data terakhir (dalam satu halaman)
            x1=1;x2=p;
        }
        
        for(h=1;h<=hal;h++) // h (halaman), hal (halaman terakhir) UTAMA
        {
            // variabel total untuk satu halaman setelah itu diriset
            em=0;tel=0;fb=0;wa=0;ig=0;tele=0;dll=0;
            // header halaman
            String tampil ="";
            tampil +=" HAL : "+h+"                    TANGGAL : 7/DESEMBER/2023\n";
            tampil +=" ========================================================\n";
            tampil +="   NO | NAMA TOKO | MEDIA SOSIAL | EMAIL | TELPON/HP\n";
            tampil +=" ========================================================\n";
            if(h == hal && sisa!=0) // h adalah halaman yang bergerak, hal adalah halaman akhir
            {
                x2 = sisa;// halaman terakhir
            }
            for(int t=x1; t<=x2;t++) // BERSARANG
            {
                Survey y = new Survey();
                tampil+=" "+t+"  "+y.toko[tdata]+"  "+y.sosmed[tdata]+"  "+y.email[tdata]+"  "+y.telp[tdata]+"\n";
                if(!(y.email[tdata].equals("-")))
                {
                    em++;
                }
                if(!(y.telp[tdata].equals("-")))
                {
                    tel++;
                }
                switch(y.sosmed[tdata])
                {
                    case "FB":
                        fb++;
                        break;
                    case "WA":
                        wa++;
                        break;
                    case "IG":
                        ig++;
                        break;
                    case "TELEGRAM":
                        tele++;
                        break;
                    case "DLL":
                        dll++;
                        break;
                }
                tdata++;
            }
            // variabel untuk menampung grand total data
            tem+=em;ttel+=tel;tfb+=fb;twa+=wa;tig+=ig;ttele+=tele;tdll+=dll;
            // footer halaman
            tampil +=" ========================================================\n";
            tampil += " JUMLAH TOKO YANG MEMILIKI EMAIL   : "+em+"\n";
            tampil += " JUMLAH TOKO YANG MEMILIKI TELPON  : "+tel+"\n";
            tampil += " FB = "+fb+"  WA = "+wa+"  IG = "+ig+"  TELEGRAM = "+tele+"  DLL = "+dll+"\n";
            // jika sudah mencapai halaman terakhir maka tampilkan grand total
            if(h==hal){
                tampil +=" ========================================================\n\n";
                tampil += " TOTAL KESELURUHAN    EMAIL =  "+tem+"  TELPON = "+ttel+"\n";
                tampil += " TOTAL MEDIA SOSIAL :\n";
                tampil += " FB = "+tfb+"  WA = "+twa+"  IG = "+tig+"  TELEGRAM = "+ttele+"  DLL = "+tdll+"\n";
            }
            JOptionPane.showMessageDialog(null,tampil,"LAPORAN ALAMAT USAHA",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}