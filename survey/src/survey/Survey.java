package survey;
import javax.swing.JOptionPane;
public class Survey {
    // VARIABLE GLOBAL
    static String lagi="y",cover="",kelas="1P42",kel="1",sumber="BENDAN - BINAGRIYA";
    static boolean putar=true;
    static int x=0,ned,z,tr=0;
    public static String toko[],alamat[],pemilik[],usaha[],penjualan[],pembeli[],cabang[],email[],sosmed[],telp[],nikah[],olshop[];
    public static String nama[],nim[];
    public static int modal[];

    // prosedur untuk input data dan edit
    static void data_input(int x){
        // membuat objek lol dari file inp.java
        inp lol = new inp();
        // memangil prosedur dari file inp.java menggunakan objek lol
        toko[x]=lol.toko();
        alamat[x]=lol.alamat();
        pemilik[x]=lol.pemilik();
        usaha[x]=lol.usaha();
        modal[x]=lol.modal();
        penjualan[x]=lol.penjualan();
        pembeli[x]=lol.pembeli();
        cabang[x]=lol.cabang();
        email[x]=lol.email();
        sosmed[x]=lol.sosmed();
        telp[x]=lol.telp();
        nikah[x]=lol.nikah();
        olshop[x]=lol.olshop();
    }

    // MAIN
    public static void main(String[] args) {
        // untuk memberikan jumlah ruang kepada array
        toko = new String[100];alamat = new String[100];pemilik = new String[100];usaha = new String[100];modal = new int[100];penjualan = new String[100];pembeli = new String[100];cabang = new String[100];email = new String[100];sosmed = new String[100];telp = new String[100];nikah = new String[100];olshop = new String[100];
        nama=new String[10];nim=new String[10];
        /*
        String toko[] = {"PAWOM MBOK'E","AGEN KELAPA MUDA MAS HERI", "TERAS KURINCI", "TEH POCI", "BATAGOR PAK ANTON", "WARUNG MAKAN BU KUS", "SEBLAK BANDUNG", "WARUNG NASI MAS AGUS", "Warung Makan Mba'yah", "Ayam Bakar Bumbu Bali", "KOST PUTRI BU ERNI", "RM. PADANG JAYA", "WARUNG MAKAN BU KUS BENDAN", "HATTA POCI", "WARUNG KOPI BU SOLEKHA", "IGA BAKAR", "LESEHAN PONDOK RIZQI", "ES COKLAT KHADRI", "OTAK-OTAK KRISPI BERKAH SUKSES", "MEBEL MATARAM"};
        String alamat[] = {"JL KURINCI NO 36-38, BENDAN","JL KURINCI NO 36-38, BENDAN", "JL. KURINCI NO. 38B, BENDAN", "JL KURINCI NO 36-38, BENDAN", "LAPANGAN MATARAM", "LAPANGAN MATARAM", "LAPANGAN MATARAM", "JL KURINCI NO.19", "LAPANGAN MATARAM", "LAPANGAN MATARAM","JL KURINCI 38B BENDAN", "JL KURINCI, RUKO DEPAN PASAR PODOSUGIH", "JL KURINCI 12", "LAPANAGAN MATARAM", "LAPANGAN MATARAM", "LAPANGAN MATARAM", "LAPANGAN MATARAM", "LAPANGAN MATARAM", "JL KURINCI", "JL KURINCI"};
        String pemilik[] = {"JAHOED KHOERUDDIN","HERI SETIAWAN", "ERNI", "PAK ALDO", "PAK ANTON", "BU KUS", "TEH AAM", "AGUS SETIAWAN"};
        String usaha[] = {"MAKANAN","MAKANAN", "MAKANAN", "MAKANAN", "MAKANAN", "MAKANAN", "MAKANAN", "MAKANAN"};
        int modal[] = {500000000,3000000, 1000000, 5000000, 5000000, 3000000, 4000000, 2500000};
        String penjualan[] = {"DALAM NEGERI","DALAM NEGERI","DALAM NEGERI", "DALAM NEGERI", "DALAM NEGERI", "DALAM NEGERI", "DALAM NEGERI", "DALAM NEGERI"};
        String pembeli[] = {"DOMESTIK","CAMPURAN", "CAMPURAN", "DOMESTIK", "DOMESTIK", "DOMESTIK", "DOMESTIK", "DOMESTIK"};
        String cabang[] = {"TIDAK ADA","TIDAK ADA", "TIDAK ADA","ADA", "TIDAK ADA", "TIDAK ADA", "TIDAK ADA", "TIDAK ADA"};
        String email[] = {"rud_pekalongan@yahoo.com","setiawanheri1603@gmail.com", "-", "-", "-", "-", "-", "-"};
        String sosmed[] = {"WA","FB", "WA", "DLL", "WA", "WA", "WA", "DLL"};
        String telp[] = {"08156662222","085869638410", "085229129987", "085274664214", "-", "085727000350", "083857232665", "-"};
        String nikah[] = {"NIKAH","NIKAH", "NIKAH", "NIKAH", "NIKAH", "NIKAH", "NIKAH", "NIKAH"};
        String olshop[] = {"ADA","ADA","TIDAK ADA", "TIDAK ADA", "TIDAK ADA", "TIDAK ADA", "TIDAK ADA", "TIDAK ADA"};
        */
        
        // bagian print cover
        for(int z=0;z<=3;z++){
            if(z==0){
                nama[z]=JOptionPane.showInputDialog("NAMA KETUA KELOMPOK");
                nim[z]=JOptionPane.showInputDialog("NIM KETUA KELOMPOK");
            }else{
                nama[z]=JOptionPane.showInputDialog("NAMA ANGGOTA KE "+z);
                nim[z]=JOptionPane.showInputDialog("NIM ANGGOTA KE "+z);
            }
        }
        cover+="TUGAS ALGORITMA PEMROGRAMAN(JAVA)\n";
        cover+="  SEMESTER SATU TAHUN 2023/2024\n";
        cover+="                 DOSEN :\n";
        cover+="     MOSSES AIDJILI, M.Kom.\n\n";
        cover+="             REKAP LAPORAN\n";
        cover+="          NAMA KETUA KELOMPOK\n";
        cover+="      NIM                       NAMA\n";
        cover+="      "+nim[0]+"   "+nama[0]+"\n\n";
        cover+="          KELAS     = "+kelas+"\n";
        cover+="          KELOMPOK  = "+kel+"\n\n";
        cover+="          NIM                     NAMA                             NILAI\n";
        cover+="      "+nim[1]+"   "+nama[1]+"\n";
        cover+="      "+nim[2]+"   "+nama[2]+"             100\n";
        cover+="      "+nim[3]+"   "+nama[3]+"\n\n";
        cover+="      SUMBER DATA DI "+sumber;
        JOptionPane.showMessageDialog(null, cover);
        
        // tampilan menu 
        do
        {
            String pil = JOptionPane.showInputDialog("    MENU SISTEM PEDAGANG\n"
                                                   + "      KOTA PEKALONGAN\n"
                                                   + "       DAN SEKITARNYA\n"
                                                     + "\n 1. INPUT DATA PEDAGANG"
                                                     + "\n 2. EDIT DATA PEDAGANG"                             
                                                     + "\n 3. HAPUS DATA PEDAGANG"
                                                     + "\n 4. LAPORAN DATA PEDAGANG"
                                                     + "\n 5. LAPORAN STATISTIK"
                                                     + "\n 6. LAPORAN ALAMAT USAHA"
                                                     + "\n 7. LAPORAN INOVASI MAHASISWA"
                                                     + "\n 8. EXIT"
                                                     + "\n             PILIH [1 - 8]");
            switch(pil)
            {
                case "1":
                    do
                    {
                        // print cover peranak
                        // jika sisa x dibagi 5 sama dengan 0
                        if(x%5==0 && x<20){
                            if(x<=4){
                                tr=0;
                            }
                            cover="";
                            cover+="TUGAS ALGORITMA PEMROGRAMAN(JAVA)\n";
                            cover+="  SEMESTER SATU TAHUN 2023/2024\n";
                            cover+="                 DOSEN :\n";
                            cover+="     MOSSES AIDJILI, M.Kom.\n\n";
                            cover+="  NAMA      = ["+nama[tr]+"]\n";
                            cover+="  NIM       = ["+nim[tr]+"]\n";
                            cover+="  KELAS     = ["+kelas+"]\n";
                            cover+="  KELOMPOK  = ["+kel+"]\n";
                            cover+="SUMBER DATA DI "+sumber;
                            JOptionPane.showMessageDialog(null, cover);
                            tr++;
                        }
                        // memanggil prosedur data_input
                        data_input(x);
                        // membuat objek out dari file rekap.java
                        rekap out = new rekap();
                        // menampilkan data setelah di input
                        out.rekap((x+1),"INPUT",toko[x], alamat[x], pemilik[x], usaha[x], modal[x], penjualan[x], pembeli[x], cabang[x], email[x], sosmed[x], telp[x], nikah[x], olshop[x]);
                        //x=x+1
                        x++;
                        do
                        {
                            lagi = JOptionPane.showInputDialog("INPUT DATA LAGI [Y/T] ").toLowerCase();
                            if (x == 99)
                            {
                                JOptionPane.showMessageDialog(null,"DATA SUDAH PENUH");
                                lagi ="t";
                            }
                        }
                        while (!("y".equals(lagi)|"t".equals(lagi) ));
                    }
                    while ("y".equals(lagi));
                    break;
                case "2":
                    do{
                        // membuat objek out dari file rekap.java
                        rekap out = new rekap();
                        // keluar otomatis jika data masih kosong (belum di input)
                        if(x==0){
                            JOptionPane.showMessageDialog(null,"DATA KOSONG");
                            break;
                        }
                        // memanggil prosedur milih_data dari file rekap.java
                        z=out.milih_data(" DATA EDIT [1-"+x+"]", x)-1;
                        // menampilkan data sebelum di edit
                        out.rekap((z+1),"INPUT",toko[z], alamat[z], pemilik[z], usaha[z], modal[z], penjualan[z], pembeli[z], cabang[z], email[z], sosmed[z], telp[z], nikah[z], olshop[z]);
                        // memanggil prosedur data_input
                        data_input(z);
                        // menampilkan data setelah di edit
                        out.rekap((z+1),"EDIT",toko[z], alamat[z], pemilik[z], usaha[z], modal[z], penjualan[z], pembeli[z], cabang[z], email[z], sosmed[z], telp[z], nikah[z], olshop[z]);
                        do
                        {
                            lagi = JOptionPane.showInputDialog("EDIT DATA LAGI [Y/T] ").toLowerCase();
                        }
                        while (!("y".equals(lagi)|"t".equals(lagi) ));
                    }
                    while ("y".equals(lagi));
                    break;
                case "3":
                    do{
                        // keluar otomatis jika data masih kosong (belum di input)
                        if(x==0){
                            JOptionPane.showMessageDialog(null,"DATA KOSONG");
                            break;
                        }
                        // membuat objek out dari file rekap.java
                        rekap out = new rekap();
                        // memanggil prosedur milih_data dari file rekap.java
                        z=out.milih_data(" DATA HAPUS [1-"+x+"]", x);
                        // menampilkan data yang akan dihapus
                        out.rekap(z,"HAPUS",toko[z-1], alamat[z-1], pemilik[z-1], usaha[z-1], modal[z-1], penjualan[z-1], pembeli[z-1], cabang[z-1], email[z-1], sosmed[z-1], telp[z-1], nikah[z-1], olshop[z-1]);
                        // proses menghapus data
                        for (int j=(z-1); j<=x-1; j++)
                        {
                           toko[j]= toko[j+1];
                           alamat[j] = alamat[j+1];
                           pemilik[j] = pemilik[j+1];
                           usaha[j] = usaha[j+1];
                           modal[j] = modal[j+1];
                           penjualan[j] = penjualan[j+1];
                           pembeli[j] = pembeli[j+1];
                           cabang[j] = cabang[j+1];
                           email[j] = email[j+1];
                           sosmed[j] = sosmed[j+1];
                           telp[j] = telp[j+1];
                           nikah[j] = nikah[j+1];
                           olshop[j] = olshop[j+1];
                        }
                        //x=x-1
                        //x dikurang 1 karena ada 1 data yang dihapus sehingga pergerakan ruang array sama 
                        x--;
                        if(x == 0)
                        {
                            JOptionPane.showMessageDialog(null," DATA SUDAH HABIS \n    KOSONG   \n KELUAR PROGRAM");
                            break;
                        }
                        do
                        {
                            lagi = JOptionPane.showInputDialog("HAPUS DATA LAGI [Y/T] ").toLowerCase();
                        }
                        while (!("y".equals(lagi)|"t".equals(lagi) ));
                    }
                    while ("y".equals(lagi));
                    break;
                case "4":
                    // keluar otomatis jika data masih kosong (belum di input)
                    if(x==0){
                        JOptionPane.showMessageDialog(null,"DATA KOSONG");
                        break;
                    }
                    dataPedagang.lap(x, 4);
                    break;
                case "5":
                    // keluar otomatis jika data masih kosong (belum di input)
                    if(x==0){
                        JOptionPane.showMessageDialog(null,"DATA KOSONG");
                        break;
                    }
                    statistik.lap(x, 4);
                    break;
                case "6":
                    // keluar otomatis jika data masih kosong (belum di input)
                    if(x==0){
                        JOptionPane.showMessageDialog(null,"DATA KOSONG");
                        break;
                    }
                    alamat1.lap(x, 6);
                    alamat2.lap(x, 6);
                    break;
                case "7":
                    // keluar otomatis jika data masih kosong (belum di input)
                    if(x==0){
                        JOptionPane.showMessageDialog(null,"DATA KOSONG");
                        break;
                    }
                    inovasi.lap(x, 10);
                    break;
                case "8":
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"ANDA SALAH TULIS\n ULANGI");
                    continue;
            }
        }
        while(putar);
    }
    
}