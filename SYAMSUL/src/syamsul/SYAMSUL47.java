package syamsul;
import java.util.Scanner;
public class SYAMSUL47 {
    public static void main(String[] args) {
        String nm,kt;
        int um,us;
        Scanner inputsiswa = new Scanner(System.in);
        System.out.println("    INPUT DATA SISWA");
        System.out.println("   ------------------\n");
        System.out.print(" 1. NAMA      : ");nm=inputsiswa.next();
        System.out.print(" 2. KOTA      : ");kt=inputsiswa.next();
        System.out.print(" 3. UMUR      : ");um=inputsiswa.nextInt();
        System.out.print(" 4. UANG SAKU : Rp.");us=inputsiswa.nextInt();
        System.out.println("  =================== ");
        System.out.println("  DATA YANG ANDA INPUT \n");
        System.out.println(" 1. NAMA      : "+nm);
        System.out.println(" 2. KOTA      : "+kt);
        System.out.println(" 3. UMUR      : "+um);
        System.out.println(" 4. UANG SAKU : Rp."+us);
        System.out.println(" ++++++++++++++++++++++++++++++");
        System.out.println("\nSYAMSUL HIDAYAT 23.240.0130");
    }
}
