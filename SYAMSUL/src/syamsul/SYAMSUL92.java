package syamsul;
import javax.swing.JOptionPane;
public class SYAMSUL92 {
    private static String lagi="y",ket,nm,jk,tb,bb,info,ed,pil,hd,dh;
    private static int x=-1,no_rekap=0,no_data=0,nr,hp=0,sisa,hal,x1,x2;
    private static float ftb=0.0f,fbb=0.0f,tt=0.0f,gt=0.0f,ttb=0.0f,rt=0.0f,rb=0.0f;
    private static boolean putar=true,selesai,n_ruang;
    public static void main(String[] args) {
        
        String nama[];
        nama = new String[10];
        
        String kelamin[];
        kelamin = new String[10];
        
        float tinggi[];
        tinggi = new float[10];

        float berat[];
        berat = new float[10];
        do
        {
            if(x==9)
            {
                JOptionPane.showMessageDialog(null,"DATA SUDAH PENUH");
                lagi="t";
            }
            else
            {
                x++;
                info="";
                nm=JOptionPane.showInputDialog(" MASUKAN NAMA ANDA");
                nama[x]=nm;
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
                kelamin[x]=ket;
                
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
                tinggi[x]=ftb;
                
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
                berat[x]=fbb;
                
                info += " NAMA MAHASISWA  =  "+nama[x]+" \n";
                info += " JENIS KELAMIN   =  "+kelamin[x]+" \n";
                info += " TINGGI BADAN    =  "+ftb+" \n";
                info += " BERAT BADAN     =  "+fbb+" \n";
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
        info+="                           REKAP DATA                   \n";
        info+="---------------------------------------------------------------\n";
        info+="     NO        NAMA        KELAMIN       TINGGI       BERAT    \n";
        info+="---------------------------------------------------------------\n";
        for(int y=0;y<=x;y++)
        {
            no_rekap++;
            info+="  "+no_rekap+"    "+nama[y]+"    "+kelamin[y]+"    "+tinggi[y]+"    "+berat[y]+"\n";
            tt+=tinggi[y];
            ttb+=berat[y];
        }
        rt=tt/no_rekap;
        rb=ttb/no_rekap;
        info+="-------------------------------------------------\n";
        info+="   RATA-RATA TINGGI           =  "+rt+"\n";
        info+="   RATA-RATA BERAT BADAN      =  "+rb+"\n";
        JOptionPane.showMessageDialog(null,info,"LAPORAN REKAP",JOptionPane.INFORMATION_MESSAGE);

        do
        {
            do
            {
                ed = JOptionPane.showInputDialog("EDIT DATA [Y/T]");
                ed=ed.toLowerCase();
            }
            while (!(("y".equals(ed)) | ("t".equals(ed))));
            if("y".equals(ed))
            {
                do
                {
                    try
                    {
                        do
                        {
                            String nrr = JOptionPane.showInputDialog("NOMOR RUANG [1 - "+(x+1)+"]");
                            nr = Integer.parseInt(nrr);
                        }
                        while (!(nr>=1 & (nr<=x+1)));
                        selesai=false;
                    }
                    catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null,"INPUT SALAH");
                        selesai = true;
                    }
                }
                while(selesai);
                
                pil = JOptionPane.showInputDialog("DATA YANG AKAN DI EDIT[1-4]\n"
                        + "\n1. NAMA\n2. JENIS KELAMIN\n3. TINGGI BADAN\n4. BERAT BADAN\n");
                switch(pil){
                    case "1": 
                        nm=JOptionPane.showInputDialog(" MASUKAN NAMA ANDA");
                        nama[nr-1]=nm;
                        break;
                    case "2": 
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
                        kelamin[nr-1]=ket;
                        break;
                    case "3": 
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
                        tinggi[nr-1]=ftb;
                        break;
                    default: 
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
                        berat[nr-1]=fbb;
                        break;
            }   
                no_data++;
                info = "";
                info += " NO : "+no_data+" \n";
                info += " NAMA MAHASISWA  =  "+nama[nr-1]+" \n";
                info += " JENIS KELAMIN   =  "+kelamin[nr-1]+" \n";
                info += " TINGGI BADAN    =  "+tinggi[nr-1]+" \n";
                info += " BERAT BADAN     =  "+berat[nr-1]+" \n";
                JOptionPane.showMessageDialog(null,info,"LAPORAN HASIL EDIT",JOptionPane.INFORMATION_MESSAGE);
                putar=true;
            }
            else
            {
                putar=false;
            }
        }
        while(putar);
        
        info="";
        info+="                           REKAP DATA                   \n";
        info+="---------------------------------------------------------------\n";
        info+="     NO        NAMA        KELAMIN       TINGGI       BERAT    \n";
        info+="---------------------------------------------------------------\n";
        no_rekap=0;
        for(int y=0;y<=x;y++)
        {
            no_rekap++;
            info+="  "+no_rekap+"    "+nama[y]+"    "+kelamin[y]+"    "+tinggi[y]+"    "+berat[y]+"\n";
            tt+=tinggi[y];
            ttb+=berat[y];
        }
        rt=tt/no_rekap;
        rb=ttb/no_rekap;
        info+="-------------------------------------------------\n";
        info+="   RATA-RATA TINGGI           =  "+rt+"\n";
        info+="   RATA-RATA BERAT BADAN      =  "+rb+"\n";
        JOptionPane.showMessageDialog(null,info,"LAPORAN REKAP",JOptionPane.INFORMATION_MESSAGE);
        
        do
        {
        do
        {
            hd = JOptionPane.showInputDialog("HAPUS DATA [Y/T]").toLowerCase();
        }
        while(!("y".equals(hd) || "t".equals(hd) ));
        if("y".equals(hd))
        {
            
            do
            {
                try
                {

                  dh = JOptionPane.showInputDialog("DATA HAPUS [ 1 - "+(x+1)+" ]");
                  hp= Integer.parseInt(dh);
                  putar = false;
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null,"Data salah");
                    putar = true;
                }
            }
            while(putar || (!(hp>=1 && hp <=(x+1))));

            if(hp>=1 && hp <=(x+1)) // user
            {
                JOptionPane.showMessageDialog(null,"DATA YANG DIHAPUS\n "
                                                 + " NO = "+hp+"\n"
                                                 + "     NAMA     = "+nama[hp-1]+"\n" 
                                                 + "     KELAMIN  = "+kelamin[hp-1]+"\n"
                                                 + "     TINGGI   = "+tinggi[hp-1]+"\n"
                                                 + "     BERAT    = "+berat[hp-1]+"\n");

                for (int j=(hp-1); j<=x-1; j=j + 1)
                {
                   nama[j]= nama[j+1];
                   kelamin[j] = kelamin[j+1];
                   tinggi[j] = tinggi[j+1];
                   berat[j] = berat[j+1];// array
                }
                x = x -1;
                if(x==-1)
                {
                    JOptionPane.showMessageDialog(null," DATA SUDAH HABIS \n    KOSONG   \n KELUAR PROGRAM");
                    System.exit(0);
                }

                info="";
                no_rekap=0;
                tt=0;
                ttb=0;
                rt=0;
                rb=0;

                info+="                           REKAP DATA                   \n";
                info+="---------------------------------------------------------------\n";
                info+="     NO        NAMA        KELAMIN       TINGGI       BERAT    \n";
                info+="---------------------------------------------------------------\n";
                for(int y=0;y<=x;y++)
                {
                    no_rekap++;
                    info+="  "+no_rekap+"    "+nama[y]+"    "+kelamin[y]+"    "+tinggi[y]+"    "+berat[y]+"\n";
                    tt+=tinggi[y];
                    ttb+=berat[y];
                }
                rt=tt/no_rekap;
                rb=ttb/no_rekap;
                info+="-------------------------------------------------\n";
                info+="   RATA-RATA TINGGI           =  "+rt+"\n";
                info+="   RATA-RATA BERAT BADAN      =  "+rb+"\n";
                JOptionPane.showMessageDialog(null,info,"LAPORAN REKAP",JOptionPane.INFORMATION_MESSAGE);
            }
            putar=true;
        }
        else
        {
            putar=false;
        }
        }
        while(putar);
        
        sisa = (x+1)%3;
        if(sisa == 0)
        {
            hal = (x+1)/3; //Rumus pada kelipatan 3
        }
        else
        {
            hal = (x+1)/3+1; //untuk rumus bukan kelipatan 3
        }
        
        if(hal==1)
        {
            x1=1;x2=(x+1);
        }
        else
        {
            x1=1;x2=3;
        }
        for(int h=1;h<=hal;h++) // h (halaman), hal (halaman terakhir) UTAMA
        {
            JOptionPane.showMessageDialog(null,"DATA AKAN MASUK \nKE HALAMAN  =  "+h);
            no_rekap=0;tt=0;ttb=0;rt=0;rb=0;
            info="";
            info+="                           REKAP DATA                   \n";
            info+="---------------------------------------------------------------\n";
            info+="     NO        NAMA        KELAMIN       TINGGI       BERAT    \n";
            info+="---------------------------------------------------------------\n";
            if(h == hal) // h adalah halaman yang bergerak, hal adalah halaman akhir
            {
                x2 = (x+1); // halaman terakhir
            }
            for(int y=x1;y<=x2;y++)
                {
                    no_rekap++;
                    info+="  "+no_rekap+"    "+nama[y-1]+"    "+kelamin[y-1]+"    "+tinggi[y-1]+"    "+berat[y-1]+"\n";
                    tt+=tinggi[y-1];
                    ttb+=berat[y-1];
                }
            rt=tt/no_rekap;
            rb=ttb/no_rekap;
            info+="-------------------------------------------------\n";
            info+="   RATA-RATA TINGGI           =  "+rt+"\n";
            info+="   RATA-RATA BERAT BADAN      =  "+rb+"\n";
            JOptionPane.showMessageDialog(null,info,"LAPORAN REKAP",JOptionPane.INFORMATION_MESSAGE);
            
            x1 += 3; // rumus umum
            x2 += 3; // rumus yang dipakai hanya bukan pada halaman terakhir
        }
        JOptionPane.showMessageDialog(null,"DATA SELESAI \nSELURUHNYA");
    }
}    