package survey;
import javax.swing.JOptionPane;
public class inp {
    static String ket,a;
    static boolean p=true;
    static int con;
    String toko(){
        do {            
            a=JOptionPane.showInputDialog("MASUKAN NAMA TOKO");
            if(a.isEmpty()){
                JOptionPane.showMessageDialog(null, "DATA TIDAK BOLEH KOSONG");
            }
        } while(a.isEmpty());
        return a;
    }
    String alamat(){
        do {            
            a=JOptionPane.showInputDialog("MASUKAN ALAMAT TOKO");
            if(a.isEmpty()){
                JOptionPane.showMessageDialog(null, "DATA TIDAK BOLEH KOSONG");
            }
        } while(a.isEmpty());
        return a;
    }
    String pemilik(){
        do {            
            a=JOptionPane.showInputDialog("MASUKAN NAMA PEMILIK TOKO");
            if(a.isEmpty()){
                JOptionPane.showMessageDialog(null, "DATA TIDAK BOLEH KOSONG");
            }
        } while(a.isEmpty());
        return a;
    }
    String usaha(){
        do
        {
            a=JOptionPane.showInputDialog("MASUKAN JENIS USAHA\n"
                    + "1. PAKAIAN       2.SARUNG\n"
                    + "3. MAKANAN       4.SEPATU / TAS\n"
                    + "5. ELEKTRONIK    6.BARANG BEKAS\n"
                    + "7. BAHAN POKOK   8. LAIN - LAIN\n"
                    + "PILIH [1-8]");
        }
        while(!("1".equals(a)|"2".equals(a)|"3".equals(a)|"4".equals(a)|"5".equals(a)|"6".equals(a)|"7".equals(a)|"8".equals(a) ));
        switch(a){
            case "1":
                ket="PAKAIAN";
                break;
            case "2":
                ket="SARUNG";
                break;
            case "3":
                ket="MAKANAN";
                break;
            case "4":
                ket="SEPATU / TAS";
                break;
            case "5":
                ket="ELEKTRONIK";
                break;
            case "6":
                ket="BARANG BEKAS";
                break;
            case "7":
                ket="BAHAN POKOK";
                break;
            case "8":
                ket="LAIN - LAIN";
                break;
        }
        return ket;
    }
    int modal(){
        do
        {
            try
            {
                a = JOptionPane.showInputDialog("MASUKAN MODAL USAHA");
                con = Integer.parseInt(a);
                p = false;
            }
            catch (NumberFormatException e)
            {
                p = true;
                JOptionPane.showMessageDialog(null,"ERROR , DATA SALAH INPUT");
            }
        }while (p);
        return con;
    }
    String penjualan(){
        do
        {
            a=JOptionPane.showInputDialog("MASUKAN JENIS PENJUALAN\n"
                    + "D. DALAM NEGERI\n"
                    + "L. LUAR NEGERI\n"
                    + "S. DALAM DAN LUAR NEGERI\n"
                    + "PILIH [D / L / S]").toUpperCase();
        }
        while(!("D".equals(a)|"L".equals(a)|"S".equals(a) ));
        switch(a){
            case "D":
                ket="DALAM NEGERI";
                break;
            case "L":
                ket="LUAR NEGERI";
                break;
            case "S":
                ket="DALAM DAN LUAR NEGERI";
                break;
        }
        return ket;
    }
    String pembeli(){
        do
        {
            a=JOptionPane.showInputDialog("MASUKAN JENIS PEMBELI\n"
                    + "D. DOMESTIK\n"
                    + "L. LUAR\n"
                    + "C. CAMPURAN\n"
                    + "PILIH [D / L / C]").toUpperCase();
        }
        while(!("D".equals(a)|"L".equals(a)|"C".equals(a) ));
        switch(a){
            case "D":
                ket="DOMESTIK";
                break;
            case "L":
                ket="LUAR";
                break;
            case "C":
                ket="CAMPURAN";
                break;
        }
        return ket;
    }
    String cabang(){
        do
        {
            a=JOptionPane.showInputDialog("APAKAH MEMILIKI CABANG\n"
                    + "T. TIDAK ADA\n"
                    + "A. ADA\n"
                    + "PILIH [T / A]").toUpperCase();
        }
        while(!("T".equals(a)|"A".equals(a) ));
        switch(a){
            case "T":
                ket="TIDAK ADA";
                break;
            case "A":
                ket="ADA";
                break;
        }
        return ket;
    }
    String email(){
        a = JOptionPane.showInputDialog("MASUKAN ALAMAT EMAIL PEMILIK TOKO");
        if(a.equals("")){
            return "-";
        }else{
            return a;
        }
    }
    String sosmed(){
        do
        {
            a=JOptionPane.showInputDialog("MASUKAN JENIS SOSIAL MEDIA YANG DIGUNAKAN\n"
                    + "1. FB   2. WA   3. IG   4. TELEGRAM   5. DLL\n"
                    + "PILIH [1-5]");
        }
        while(!("1".equals(a)|"2".equals(a)|"3".equals(a)|"4".equals(a)|"5".equals(a) ));
        switch(a){
            case "1":
                ket="FB";
                break;
            case "2":
                ket="WA";
                break;
            case "3":
                ket="IG";
                break;
            case "4":
                ket="TELEGRAM";
                break;
            case "5":
                ket="DLL";
                break;
        }
        return ket;
    }
    String telp(){
        do
        {
            try
            {
                a = JOptionPane.showInputDialog("MASUKAN NOMOR TELPON/HP PEMILIK TOKO");
                if (a.equals("")){
                    return "-";
                }
                con = Integer.parseInt(a);
                p = false;
            }
            catch (NumberFormatException e)
            {
                p = true;
                JOptionPane.showMessageDialog(null,"ERROR , DATA SALAH INPUT");
            }
        }while (p);
        if(a.equals("")){
            return "-";
        }else{
            return a;
        }
    }
    String nikah(){
        do
        {
            a=JOptionPane.showInputDialog("MASUKAN STATUS PEMILIK [NIKAH]/[BELUM]\n[N / B]").toUpperCase();
        }
        while(!("N".equals(a)|"B".equals(a) ));
        switch(a){
            case "N":
                ket="NIKAH";
                break;
            case "B":
                ket="BELUM";
                break;
        }
        return ket;
    }
    String olshop(){
        do
        {
            a=JOptionPane.showInputDialog("APAKAH PEMILIK MEMILIKI ONLINE SHOP\n1. ADA 2. TIDAK\n  PILIH[1 / 2]");
        }
        while(!("1".equals(a)|"2".equals(a) ));
        switch(a){
            case "1":
                ket="ADA";
                break;
            case "2":
                ket="TIDAK ADA";
                break;
        }
        return ket;
    }
}
