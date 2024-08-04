package survey;
import javax.swing.JOptionPane;
public class inovasi {
    static void lap(int data,int p){
        
        int hal=0,sisa=0,x1=0,x2=0,h,tdata=0;
        int ada=0,tada=0;
        
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
            ada=0;tada=0;
            // header halaman
            String tampil ="";
            tampil +=" HAL : "+h+"                    TANGGAL : 7 DESEMBER 2023\n";
            tampil +=" ========================================================\n";
            tampil +="   NO          NAMA TOKO        ONLINE SHOP\n";
            tampil +=" ========================================================\n";
            if(h == hal && sisa!=0) // h adalah halaman yang bergerak, hal adalah halaman akhir
            {
                x2 = sisa;// halaman terakhir
            }
            for(int t=x1; t<=x2;t++) // BERSARANG
            {
                Survey y = new Survey();
                tampil+=" "+t+"    "+y.toko[tdata]+"    "+y.olshop[tdata]+"\n";
                switch(y.olshop[tdata])
                {
                    case "ADA":
                        ada++;
                        break;
                    case "TIDAK ADA":
                        tada++;
                        break;
                }
                tdata++;
            }
            // footer halaman
            tampil +=" ========================================================\n";
            tampil += " JUMLAH TOKO YANG MEMILIKI ONLINE SHOP       : "+ada+"\n";
            tampil += " JUMLAH TOKO YANG TIDAK MEMILIKI ONLINE SHOP : "+tada+"\n";
            JOptionPane.showMessageDialog(null,tampil,"LAPORAN INOVASI MAHASISWA",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}