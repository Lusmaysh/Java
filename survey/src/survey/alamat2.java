package survey;
import javax.swing.JOptionPane;
public class alamat2 {
    static void lap(int data, int p){
        
        int hal=0,sisa=0,x1=0,x2=0,h,tdata=0,mdl;
        
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
            mdl=0;
            // header halaman
            String tampil="";
            tampil="";
            tampil+="                   LAPORAN ALAMAT PEDAGANG DI BENDAN\n";
            tampil+="                  PEKALONGAN BULAN DESEMBER TAHUN 2023\n";
            tampil +=" HAL : "+h+"                    \n";
            tampil +=" ====================================================================\n";
            tampil +="   NO | NAMA TOKO | ALAMAT | NAMA PEMILIK | STATUS\n";
            tampil +=" ====================================================================\n";
            if(h == hal && sisa!=0) // h adalah halaman yang bergerak, hal adalah halaman akhir
            {
                x2 = sisa;// halaman terakhir
            }
            for(int t=x1; t<=x2;t++) // BERSARANG
            {
                Survey y = new Survey();
                tampil+=" "+t+"  "+y.toko[tdata]+"  "+y.alamat[tdata]+"  "+y.pemilik[tdata]+"  "+y.nikah[tdata]+"\n";
                mdl+=y.modal[tdata];tdata++;
            }
            // footer halaman
            tampil +=" ====================================================================\n";
            tampil += " TOTAL KESELURUHAN MODAL : "+mdl+"        [TEKAN ENTER UNTUK LANJUT]\n";
            JOptionPane.showMessageDialog(null,tampil);
        }
    }
}
