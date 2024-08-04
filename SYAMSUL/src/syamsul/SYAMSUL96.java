package syamsul; //P13-M60-K4
public class SYAMSUL96 {
    public static String nama,makanan;
    public static void main(String[] args) {
        SYAMSUL96 Hewan = new SYAMSUL96();
        System.out.println("======= KUCING ========");
        Hewan.Kucing();
        System.out.println("======= KUCING ========");
        Hewan.Kambing();        
    }
    void Kucing()
    {
        nama = "PUS MEONG";
        makanan = "Daging pakai saos";
        System.out.println("NAMA KUCING SAYA ADALAH "+nama);
        System.out.println("KUCING SAYA SUKA MAKAN "+makanan);
    }
    void Kambing()
    {
        nama = "EMBEK EMBE";
        makanan = "Rumput Gajah";
        System.out.println("NAMA KAMBING SAYA ADALAH "+nama);
        System.out.println("KAMBING SAYA SUKA MAKAN "+makanan);
    }
}
