package syamsul;
public class SYAMSUL105 {
    static void kenal(String nama)
    {
        System.out.println("HALO PERKENALKAN NAMA SAYA "+nama);
    }
    void boi(int umur)
    {
        System.out.println("UMUR SAYA : "+umur);
    }
    public static void main(String[] args) {
        kenal("SYAMSUL HIDAYAT");
        SYAMSUL105 d = new SYAMSUL105();
        d.boi(18);
    }
}