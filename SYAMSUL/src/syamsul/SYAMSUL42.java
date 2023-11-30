package syamsul;
import java.util.Scanner;
public class SYAMSUL42 {
    public static void main(String[] args) {
        String NI;
        int JK, BK;
        Scanner mahasiswa = new Scanner(System.in);
        System.out.println("\tPENERIMAAN MAHASISWA");
        System.out.println("\t--------------------");
        System.out.print(" 1. NAMA INSTANSI       : ");NI = mahasiswa.next();
        System.out.print(" 2. JUMLAH KARYAWAN     : ");JK = mahasiswa.nextInt();
        System.out.print(" 3. BIAYA KULIAH/ORANG  : ");BK = mahasiswa.nextInt();
        System.out.println(" ------------------------");
        System.out.println(" "+NI+" JUMLAH KARYAWAN "+JK);
        int TBK=JK*BK;
        System.out.println(" TOTAL BIAYA KULIAH Rp."+TBK);
        System.out.println(" ------------------------");
        System.out.println(" TERIMAKASIH KEPADA "+NI);
        System.out.println(" @SYAMSUL HIDAYAT 23.240.0130");
        
    }
}
