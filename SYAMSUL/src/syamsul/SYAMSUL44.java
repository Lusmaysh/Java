package syamsul;
import java.util.Scanner;
public class SYAMSUL44 {
    public static void main(String[] args)
    {
        String ns;
        int hl,jl,bb,ppn;
        Scanner saham = new Scanner(System.in);
        System.out.println("\tBURSA SAHAM\n");
        System.out.print(" 1. NAMA SAHAM    : ");ns = saham.next();
        System.out.print(" 2. HARGA / LOT   : ");hl = saham.nextInt();
        System.out.print(" 3. JUMLAH LOT    : ");jl = saham.nextInt();
        System.out.println(" ------------------------");
        System.out.print(" 4. BIAYA BELI    : ");bb = saham.nextInt();
        System.out.print(" 5. PAJAK PPN     : ");ppn = saham.nextInt();
        System.out.println(" ------------------------");
        System.out.println(" "+ns+" DENGAN HARGA /LOT ADALAH "+hl);
        int tb=hl*jl*100+bb+ppn;
        System.out.println(" DENGAN JUMLAH LOT "+jl+" TOTAL BAYAR "+tb);
        System.out.println(" ------------------------");
        System.out.println(" TERIMAKASIH ANDA SUDAH MEMBELI "+ns);
        System.out.println(" SYAMSUL HIDAYAT 23.240.0130");
    }
}
