package survey;
import javax.swing.JOptionPane;
public class statistik {
    static void lap(int data,int p){
        int hal=0,sisa=0,x1=0,x2=0,h,tdata=0;
        int dom=0,cam=0,luar=0,dneg=0,lneg=0,ddl=0,ta=0,a=0,mdl=0;
        int tdom=0,tcam=0,tluar=0,tdneg=0,tlneg=0,tddl=0,tta=0,gta=0,tmdl=0;
        
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
        
        for(h=1;h<=hal;h++) // h (halaman), hal (halaman terakhir) (PERULANGAN UTAMA)
        {
            // variabel total untuk satu halaman setelah itu diriset
            dom=0;cam=0;luar=0;dneg=0;lneg=0;ddl=0;ta=0;a=0;mdl=0;
            // header halaman
            String tampil ="";
            tampil +=" TANGGAL : 7 DESEMBER 2023                    HAL : "+h+"\n";
            tampil +=" ========================================================\n";
            tampil +="   NO | TOKO | MODAL | PENJUALAN | PEMBELI | CABANG\n";
            tampil +=" ========================================================\n";
            if(h == hal && sisa!=0) // h adalah halaman yang bergerak, hal adalah halaman akhir
            {
                x2 = sisa;// halaman terakhir
            }
            for(int t=x1; t<=x2;t++) // PERULANGAN BERSARANG
            {
                Survey y = new Survey();
                tampil+=" "+t+"  "+y.toko[tdata]+"  "+y.modal[tdata]+"  "+y.penjualan[tdata]+"  "+y.pembeli[tdata]+"  "+y.cabang[tdata]+"\n";
                switch(y.pembeli[tdata])
                {
                    case "DOMESTIK":
                        dom++;
                        break;
                    case "CAMPURAN":
                        cam++;
                        break;
                    case "LUAR":
                        luar++;
                        break;
                }
                switch(y.penjualan[tdata])
                {
                    case "DALAM NEGERI":
                        dneg++;
                        break;
                    case "LUAR NEGERI":
                        lneg++;
                        break;
                    case "DALAM DAN LUAR NEGERI":
                        ddl++;
                        break;
                }
                switch(y.cabang[tdata])
                {
                    case "TIDAK ADA":
                        ta++;
                        break;
                    case"ADA":
                        a++;
                        break;
                }
                mdl+=y.modal[tdata];
                tdata++;
            }
            // variabel untuk menampung grand total data
            tdom+=dom;tcam+=cam;tluar+=luar;tdneg+=dneg;tlneg+=lneg;tddl+=ddl;tta+=ta;gta+=a;tmdl+=mdl;
            // footer perhalaman
            tampil += " ==================================================\n";
            tampil += " PEMBELI     : D="+dom+"  C="+cam+"  L="+luar+"\n";
            tampil += " PENJUALAN   : D="+dneg+"  L="+lneg+"  S="+ddl+"\n";
            tampil += " CABANG      : T="+ta+"  A="+a+"\n";
            tampil += " TOTAL MODAL : "+mdl+"\n";
            JOptionPane.showMessageDialog(null,tampil,"LAPORAN STATISTIK PEDAGANG",JOptionPane.INFORMATION_MESSAGE);
        }
        // halaman tambahan untuk menampilkan grand total dari semua data
        String tampil ="";
        tampil += " TANGGAL:7 DESEMBER 2023              HAL = "+h+"\n";
        tampil += " ==================================================\n";
        tampil += " PEMBELI   : D="+tdom+"\n"
                + "             C="+tcam+"\n"
                + "             L="+tluar+"\n";
        tampil += " PENJUALAN : D="+tdneg+"\n"
                + "             L="+tlneg+"\n"
                + "             S="+tddl+"\n";
        tampil += " CABANG    : T="+tta+"\n"
                + "             A="+gta+"\n";
        tampil += " RATA-RATA MODAL = "+(tmdl/tdata)+"\n";
        JOptionPane.showMessageDialog(null,tampil,"LAPORAN REKAP STATISTIK PEDAGANG",JOptionPane.INFORMATION_MESSAGE);
    }
}