package survey;
import javax.swing.JOptionPane;
public class dataPedagang {
    static void lap(int data,int p){
        
        int hal=0,sisa=0,x1=0,x2=0,h;
        int pk=0,sr=0,mkn=0,bb=0,st=0,bp=0,el=0,dll=0;
        int tpk=0,tsr=0,tmkn=0,tbb=0,tst=0,tbp=0,tel=0,tdll=0;
        
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
        
        for(h=1;h<=hal;h++) // h (halaman), hal (halaman terakhir) PERULANGAN UTAMA
        {
            // variabel total untuk satu halaman setelah itu diriset
            pk=0;sr=0;mkn=0;bb=0;st=0;bp=0;el=0;dll=0;
            // header halaman
            String tampil ="";
            tampil +=" TANGGAL : 7 DESEMBER 2023                    HAL : "+h+"\n";
            tampil +=" ========================================================\n";
            tampil +="   NO | NAMA TOKO | ALAMAT | NAMA PEMILIK | JENIS USAHA\n";
            tampil +=" ========================================================\n";
            if(h == hal) // h adalah halaman yang bergerak, hal adalah halaman akhir
            {
                x2 = data;// halaman terakhir
            }
            for(int t=x1; t<=x2;t++) // BERSARANG
            {
                Survey y = new Survey();
                tampil+=" "+t+"  "+y.toko[t-1]+"  "+y.alamat[t-1]+"  "+y.pemilik[t-1]+"  "+y.usaha[t-1]+"\n";
                if("PAKAIAN".equals(y.usaha[t-1])){
                    pk++;
                }else if("SARUNG".equals(y.usaha[t-1])){
                    sr++;
                }else if("MAKANAN".equals(y.usaha[t-1])){
                    mkn++;
                }else if("BARANG BEKAS".equals(y.usaha[t-1])){
                    bb++;
                }else if("SEPATU / TAS".equals(y.usaha[t-1])){
                    st++;
                }else if("BAHAN POKOK".equals(y.usaha[t-1])){
                    bp++;
                }else if("ELEKTRONIK".equals(y.usaha[t-1])){
                    el++;
                }else{
                    dll++;
                }
            }
            // variabel untuk menampung grand total data
            tpk+=pk;tsr+=sr;tmkn+=mkn;tbb+=bb;tst+=st;tbp+=bp;tel+=el;tdll+=dll;
            tampil +=" ========================================================\n";
            tampil +=" PAKAIAN      : "+pk+"      SEPATU / TAS : "+st+"\n";
            tampil +=" SARUNG       : "+sr+"      BAHAN POKOK  : "+bp+"\n";
            tampil +=" MAKANAN      : "+mkn+"     ELEKTRONIK   : "+el+"\n";
            tampil +=" BARANG BEKAS : "+bb+"      LAIN - LAIN  : "+dll+"\n";
            JOptionPane.showMessageDialog(null,tampil);
            
            // agar halaman selanjutnya melanjutkan nomor data terakhir (contoh: hal 1 no.1-5, hal 2 no.6-10)
            x1 += p;
            x2 += p;
        }
        String tampil ="";
        tampil +=" TANGGAL : 7 DESEMBER 2023                    HAL : "+h+"\n";
        tampil +=" ========================================================\n";
        tampil +=" PAKAIAN      : "+tpk+"      SEPATU / TAS : "+tst+"\n";
        tampil +=" SARUNG       : "+tsr+"      BAHAN POKOK  : "+tbp+"\n";
        tampil +=" MAKANAN      : "+tmkn+"     ELEKTRONIK   : "+tel+"\n";
        tampil +=" BARANG BEKAS : "+tbb+"      LAIN - LAIN  : "+tdll+"\n";
        JOptionPane.showMessageDialog(null,tampil,"LAPORAN REKAP DATA PEDAGANG",JOptionPane.INFORMATION_MESSAGE);
    }
}