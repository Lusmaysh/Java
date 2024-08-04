package syamsul; //63
public class SYAMSUL99 {
    static String nama;
    static int tahun_s=2017, tahun_1=1998,umur;
    static double IPK;
    public static void main(String[] args) {
        nama = "Wildan";
        System.out.println("Nama Saya: "+nama);
        System.out.println("Umur Saya: "+Umur_Saya()+" Tahun");
        NilaiIPK();
    }
    static int Umur_Saya()
    {
        umur = tahun_s - tahun_1;
        return umur;
    }
    static void NilaiIPK()
    {
        IPK = 4.0;
        System.out.println("Nilai IPK Saya: "+IPK);
    }
}
