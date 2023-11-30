package syamsul;
import java.util.Scanner;
public class SYAMSUL51 {
    public static void main(String[] args) {
        Scanner beli=new Scanner(System.in);
        String loop="Y";
        int tjb=0,tb=0;
        while (("y".equals(loop)|("Y".equals(loop))))
        {
            System.out.print("No: ");int no=beli.nextInt();
            System.out.println("      TOKO MAKMUR SEJAHTERA");
            System.out.println("-----------------------------------");
            System.out.println("      PEMBELIAN KONSUMEN");
            System.out.print(" 1. NAMA BARANG     ");String nb=beli.next();
            System.out.print(" 2. HARGA BARANG    ");int hb=beli.nextInt();
            System.out.print(" 3. JUMLAH BARANG   ");int jb=beli.nextInt();
            int jh=jb*hb;
            System.out.println("    JUMLAH HARGA  :"+jh);
            System.out.println("    "+nb+"  TOTAL   "+jh);
            System.out.print("    INPUT DATA LAGI [Y/T] = ");loop=beli.next();
            tjb+=jb;
            tb+=jh;
            System.out.println("=====================================");
            System.out.println("            REKAP BARANG    ");
            System.out.println(" 1. TOTAL JUMLAH BARANG = "+tjb);
            System.out.println(" 2. TOTAL BAYAR         = "+tb);
            System.out.println("=====================================");
            System.out.println("-------------------------------------");
            System.out.println("            TERIMAKASIH");

        } 
    }
}
