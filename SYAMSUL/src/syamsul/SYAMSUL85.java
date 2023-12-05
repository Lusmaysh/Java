package syamsul;
import javax.swing.JOptionPane;
public class SYAMSUL85 
{
    public static String hasil, laporan, ket, grade, ed="y",ded,info="",hd,dh;
    public static float sem_ipk = 0f, sem=0f, tot_ipk=0f, rata_nil=0f , rata_ipk=0f;
    public static int uji, x , ll =0 , tl=0 , z = 0, tot_nil=0,ned;
    public static int no_data,hp,hal,x1,x2,sisa,g;
    public static boolean putar=true, ptr = true;
    public static void main (String[] args)
    {
        no_data =0;
        String nama[]=null;
        nama = new String[8];
        int nilai[];
        nilai = new int[8];
        float ipk[];
        ipk = new float[8];
        x=-1;
        boolean lanjut = true, lewat = true;
        String lapor="",lagi ="y";
        boolean keluar =true;
        do
        {
            if (x == 8 )
            {
                JOptionPane.showMessageDialog(null,"DATA SUDAH PENUH");
            }
            else
            {
                do
                {
                    x = x +1; no_data = no_data + 1;
                    String hasil ="";
                    String nm = JOptionPane.showInputDialog("NAMA MAHASISWA ");
                    nama[x] = nm;
                    do
                    {
                        try
                        {
                            do
                            {
                                String nu = JOptionPane.showInputDialog("NILAI UJIAN (0-100) ");
                                uji = Integer.parseInt(nu);
                                lanjut = false;
                            }
                            while (!(uji >= 0 & uji <= 100));
                        }
                        catch (Exception e)
                        {
                            lanjut = true;
                            JOptionPane.showMessageDialog(null,"ERROR , DATA SALAH INPUT");
                        }
                    }
                    while (lanjut);
                    nilai[x] = uji;
                    if (uji <=30)
                    {
                        grade ="E";
                    }
                    else if ( uji <=59)
                    {
                        grade = "D";
                    }
                    else if (uji <=70)
                    {
                        grade ="C";
                    }
                    else if (uji <=80)
                    {
                        grade ="B";
                    }
                    else
                    {
                        grade ="A";
                    }

                    do
                    {
                        try
                        {
                            do
                            {
                                String sem = JOptionPane.showInputDialog("IPK SEMESTER [0-4.00] ");
                                sem_ipk = Float.parseFloat(sem);
                                lewat = false;
                            }
                            while (!(sem_ipk >= 0 & sem_ipk <= 4.00));
                        }
                        catch (Exception e)
                        {
                            lewat = true;
                            JOptionPane.showMessageDialog(null,"ERROR , DATA SALAH INPUT");
                        }
                    }
                    while (lewat);
                    ipk[x] = sem_ipk;
                    if (sem_ipk >=2.00)
                    {
                        ket ="LULUS";
                    }
                    else
                    {
                        ket = "TIDAK LULUS";
                    }

                    hasil += " NO : "+no_data+"\n";
                    hasil += " HASIL DATA MAHASISWA \n";
                    hasil += " NAMA = "+ nama[x]+"\n";
                    hasil += " NILAI = "+ nilai[x]+"\n";
                    hasil += " GRADE = "+ grade +"\n";
                    hasil += " IPK = "+ ipk[x]+" KET "+ket+"\n";
                    JOptionPane.showMessageDialog(null,hasil,"DATA MAHASISWA",JOptionPane.INFORMATION_MESSAGE);

                    do
                    {
                        lagi = JOptionPane.showInputDialog("INPUT DATA [Y/T] ");
                        if (x == 7)
                        {
                            JOptionPane.showMessageDialog(null,"DATA SUDAH PENUH");
                            lagi ="T";
                        }
                    }
                    while (!(("y".equals(lagi)) | ("Y".equals(lagi)) | ("t".equals(lagi)) | ("T".equals(lagi))));
                }
                while (("y".equals(lagi)) | ("Y".equals(lagi)));
            }
            keluar = false;
        }
        while (keluar);
        z = 0;
        lapor += " LAPORAN HASIL PENILAIAN MAHASISWA \n";
        lapor += " ==================================================\n";
        lapor += " NO    NAMA     NILAI    GRADE   IPK    KETERANGAN \n";
        lapor += " ==================================================\n";
        
        for (int y=0; y<=x; y=y+1)
        {
            z = z + 1;
            if (nilai[y] <=30)
            {
                grade ="E";
            }
            else if ( nilai[y] <=59)
            {
                grade = "D";
            }
            else if (nilai[y] <=70)
            {
                grade ="C";
            }
            else if (nilai[y] <=80)
            {
                grade ="B";
            }
            else
            {
                grade ="A";
            }
            
            if (ipk[y] >=2.00)
            {
                ket ="LULUS"; ll = ll + 1;
            }
            else
            {
                ket = "TIDAK LULUS"; tl = tl + 1;
            }
            tot_nil = tot_nil + nilai[y];
            tot_ipk = tot_ipk + ipk[y];
 lapor += "  "+z+"     "+nama[y]+"     " +nilai[y]+"      "+grade+"     "+ipk[y]+"    "+ket+"\n";
        }
        rata_nil = tot_nil /z;
        rata_ipk = tot_ipk / z;
        lapor += " ==================================================\n";
        lapor += " RATA RATA NILAI = "+rata_nil+" \n";
        lapor += " RATA RATA IPK   = "+rata_ipk+" \n";
        lapor += " LULUS           = "+ll +"\n";
        lapor += " TIDAK LULUS     = "+tl +"\n";
        lapor += " ==================================================\n";
        JOptionPane.showMessageDialog(null,lapor,"LAPORAN HASIL DATA MAHASISWA",JOptionPane.INFORMATION_MESSAGE);

      do
      { 
        ed = JOptionPane.showInputDialog("EDIT DATA [Y/T]");
        if("y".equals(ed) || "Y".equals(ed))
        {
            putar = false;
        }
        else if ("t".equals(ed) || "T".equals(ed))
                {
                    putar = false;
                }
        else
        {
            JOptionPane.showMessageDialog(null,"ANDA SALAH INPUT, ULANGI");
            putar= true;
        }
      }
      while(putar);
     if("y".equals(ed) || "Y".equals(ed)) 
     {
      do
      {
      try 
      {
       ded =  JOptionPane.showInputDialog(null,"DATA EDIT [ 1 - "+(x+1)+" ]");
       ned = Integer.parseInt(ded); putar = false;
      }
      catch (Exception e)
      {
         JOptionPane.showMessageDialog(null,"Data salah"); putar= true;
      }
      }
      while(putar || (!(ned>=1 && ned<=(x+1))));
       info ="";
       info += "  NO  = "+ned+"\n";
       info += "\n";
       info += "     NAMA       =  [ "+nama[ned-1]+" ]\n";
       info += "     NILAI      =  [ "+nilai[ned-1]+" ]\n";
       info += "     IPK        =  [ "+ipk[ned-1]+" ]\n";
JOptionPane.showMessageDialog(null,info,"DATA EDIT",JOptionPane.INFORMATION_MESSAGE);       
 String nm = JOptionPane.showInputDialog("[ "+nama[ned-1]+"]\nNAMA MAHASISWA ");
  nama[ned-1] = nm;  
 do
        {
         try
           {
            do
             {
       String nu = JOptionPane.showInputDialog("[ "+nilai[ned-1]+" ]\n NILAI UJIAN (0-100) ");
             uji = Integer.parseInt(nu);
             lanjut = false;
             }
             while (!(uji >= 0 & uji <= 100));
             }
             catch (Exception e)
              {
              lanjut = true;
              JOptionPane.showMessageDialog(null,"ERROR , DATA SALAH INPUT");
            }
          }
        while (lanjut);
       nilai[ned-1] = uji; 
 do
       {
          try
             {
                do
               {
            String sem = JOptionPane.showInputDialog("[ "+ipk[ned-1]+" ]\nIPK SEMESTER [0-4.00] ");
            sem_ipk = Float.parseFloat(sem);
              lewat = false;
                }
           while (!(sem_ipk >= 0 & sem_ipk <= 4.00));
             }
            catch (Exception e)
             {
             lewat = true;
             JOptionPane.showMessageDialog(null,"ERROR , DATA SALAH INPUT");
              }
              }
             while (lewat);
             ipk[ned-1] = sem_ipk;      
  info ="";
       info += "  NO  = "+ned+"\n";
       info += "\n";
       info += "     NAMA       =  [ "+nama[ned-1]+" ]\n";
       info += "     NILAI      =  [ "+nilai[ned-1]+" ]\n";
       info += "     IPK        =  [ "+ipk[ned-1]+" ]\n";
JOptionPane.showMessageDialog(null,info,"DATA BARU HASIL EDIT",JOptionPane.INFORMATION_MESSAGE);       
z = 0;
rata_nil=0;
lapor="";
        lapor += " LAPORAN HASIL EDIT PENILAIAN MAHASISWA \n";
        lapor += " ==================================================\n";
        lapor += " NO    NAMA     NILAI    GRADE   IPK    KETERANGAN \n";
        lapor += " ==================================================\n";
        
        for (int y=0; y<=x; y=y+1)
        {
            z = z + 1;
            if (nilai[y] <=30)
            {
                grade ="E";
            }
            else if ( nilai[y] <=59)
            {
                grade = "D";
            }
            else if (nilai[y] <=70)
            {
                grade ="C";
            }
            else if (nilai[y] <=80)
            {
                grade ="B";
            }
            else
            {
                grade ="A";
            }
            
            if (ipk[y] >=2.00)
            {
                ket ="LULUS"; ll = ll + 1;
            }
            else
            {
                ket = "TIDAK LULUS"; tl = tl + 1;
            }
            tot_nil = tot_nil + nilai[y];
            tot_ipk = tot_ipk + ipk[y];
 lapor += "  "+z+"     "+nama[y]+"     " +nilai[y]+"      "+grade+"     "+ipk[y]+"    "+ket+"\n";
        }
        rata_nil = tot_nil /z;
        rata_ipk = tot_ipk / z;
        lapor += " ==================================================\n";
        lapor += " RATA RATA NILAI = "+rata_nil+" \n";
        lapor += " RATA RATA IPK   = "+rata_ipk+" \n";
        lapor += " LULUS           = "+ll +"\n";
        lapor += " TIDAK LULUS     = "+tl +"\n";
        lapor += " ==================================================\n";
        JOptionPane.showMessageDialog(null,lapor,"LAPORAN HASIL EDIT MAHASISWA",JOptionPane.INFORMATION_MESSAGE);
     }
        do
        {
        do
        {
            hd = JOptionPane.showInputDialog("HAPUS DATA [Y/T]");
        }
        while(!("y".equals(hd) || "Y".equals(hd) || "t".equals(hd) || "T".equals(hd)));
        
        if("y".equals(hd) || "Y".equals(hd)) 
       {
           
   do
   {
       try
       {
         
         dh = JOptionPane.showInputDialog("DATA HAPUS [ 1 - "+(x+1)+" ]");
         hp= Integer.parseInt(dh);
         ptr = false;
       }
       catch (Exception e)
       {
           JOptionPane.showMessageDialog(null,"Data salah");
           ptr = true;
       }
   }
   while(ptr || (!(hp>=1 && hp <=(x+1))));
        
     
     if(hp>=1 && hp <=x) // user
     {
         JOptionPane.showMessageDialog(null,"DATA YANG DIHAPUS\n "
                                          + " NO = "+hp+"\n"
                                          + "     NAMA  = "+nama[hp-1]+"\n" 
                                          + "     NILAI = "+nilai[hp-1]+"\n"
                                          + "     IPK   = "+ipk[hp-1]+"\n");
         
         for (int j=(hp-1); j<=x-1; j=j + 1)
         {
            nama[j]= nama[j+1];
            nilai[j] = nilai[j+1];
            ipk[j] = ipk[j+1];// array
         }                
     }
     
        x = x -1;
        if(x==-1)
        {
            JOptionPane.showMessageDialog(null," DATA SUDAH HABIS \n    KOSONG   \n KELUAR PROGRAM");
            System.exit(0);
        }
        z = 0; 
        rata_nil=0;
        tot_nil =0;
        rata_ipk = 0;
        tot_ipk = 0;
        ll = 0;
        tl = 0;
        
        lapor="";
        lapor += "    LAPORAN HASIL HAPUS PENILAIAN MAHASISWA \n";
        lapor += " ==================================================\n";
        lapor += " NO    NAMA     NILAI    GRADE   IPK    KETERANGAN \n";
        lapor += " ==================================================\n";
        
        for (int y=0; y<=x; y=y+1)
        { 
            z = z + 1;
            if (nilai[y] <=30)
            {
                grade ="E";
            }
            else if ( nilai[y] <=59)
            {
                grade = "D";
            }
            else if (nilai[y] <=70)
            {
                grade ="C";
            }
            else if (nilai[y] <=80)
            {
                grade ="B";
            }
            else
            {
                grade ="A";
            }
            
            if (ipk[y] >=2.00)
            {
                ket ="LULUS"; ll = ll + 1;
            }
            else
            {
                ket = "TIDAK LULUS"; tl = tl + 1;
            }
            tot_nil = tot_nil + nilai[y];
            tot_ipk = tot_ipk + ipk[y];
 lapor += "  "+z+"     "+nama[y]+"     " +nilai[y]+"      "+grade+"     "+ipk[y]+"    "+ket+"\n";
        }
        rata_nil = tot_nil /z;
        rata_ipk = tot_ipk / z;
        lapor += " ==================================================\n";
        lapor += " RATA RATA NILAI = "+rata_nil+" \n";
        lapor += " RATA RATA IPK   = "+rata_ipk+" \n";
        lapor += " LULUS           = "+ll +"\n";
        lapor += " TIDAK LULUS     = "+tl +"\n";
        lapor += " ==================================================\n";
        JOptionPane.showMessageDialog(null,lapor,"LAPORAN HASIL EDIT MAHASISWA",JOptionPane.INFORMATION_MESSAGE);
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
        System.out.println(" JUMLAH DATA     =  "+(x+1));
        System.out.println(" JUMLAH HALAMAN  =  "+hal+"\n");
        
        z = 0; // no urut tabel
        for(int h=1;h<=hal;h++) // h (halaman), hal (halaman terakhir) UTAMA
        {
            JOptionPane.showMessageDialog(null,"DATA AKAN MASUK \nKE HALAMAN  =  "+h);
            rata_nil=0;
            tot_nil =0;
            rata_ipk = 0;
            tot_ipk = 0;
            ll = 0;
            tl = 0;
            g = 0;
            lapor="";
            lapor += " HAL = "+h+"\n";
            lapor += " LAPORAN HASIL PERHALAMAN "+h+" PENILAIAN MAHASISWA \n";
            lapor += " ==================================================\n";
            lapor += " NO    NAMA     NILAI    GRADE   IPK    KETERANGAN \n";
            lapor += " ==================================================\n";
            if(h == hal) // h adalah halaman yang bergerak, hal adalah halaman akhir
            {
                // halaman terakhir
                x2 = (x+1);
            }
            for(int t=x1; t<=x2; t++) // BERSARANG (t = user)
            {
                z = z + 1;g++;
                if (nilai[t-1] <=30)
                {
                    grade ="E";
                }
                else if ( nilai[t-1] <=59)
                {
                    grade = "D";
                }
                else if (nilai[t-1] <=70)
                {
                    grade ="C";
                }
                else if (nilai[t-1] <=80)
                {
                    grade ="B";
                }
                else
                {
                    grade ="A";
                }

                if (ipk[t-1] >=2.00)
                {
                    ket ="LULUS"; ll = ll + 1;
                }
                else
                {
                    ket = "TIDAK LULUS"; tl = tl + 1;
                }
                tot_nil = tot_nil + nilai[t-1];
                tot_ipk = tot_ipk + ipk[t-1];
                lapor += "  "+z+"     "+nama[t-1]+"     " +nilai[t-1]+"      "+grade+"     "+ipk[t-1]+"    "+ket+"\n";
            }
            rata_nil = tot_nil /g;
            rata_ipk = tot_ipk /g;
            lapor += " ==================================================\n";
            lapor += " RATA RATA NILAI = "+rata_nil+" \n";
            lapor += " RATA RATA IPK   = "+rata_ipk+" \n";
            lapor += " LULUS           = "+ll +"\n";
            lapor += " TIDAK LULUS     = "+tl +"\n";
            lapor += " ==================================================\n";
            JOptionPane.showMessageDialog(null,lapor,"LAPORAN HASIL EDIT MAHASISWA",JOptionPane.INFORMATION_MESSAGE);
            
            x1 += 3; // rumus umum
            x2 += 3; // rumus yang dipakai hanya bukan pada halaman terakhir
        }
        JOptionPane.showMessageDialog(null,"DATA SELESAI \nSELURUHNYA");
    }
}