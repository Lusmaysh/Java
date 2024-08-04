package syamsul;//68
public class SYAMSUL104 {
    void makan(String makan)
    {
        System.out.println("Hi");
        System.out.println("SAYA SEDANG MAKAN "+makan);
    }
    static void minuman(String minum)
    {
        System.out.println("SAYA SEDANG MINUM "+minum);
    }
    public static void main(String[] args) {
        minuman("KOPI");
        SYAMSUL104 saya = new SYAMSUL104();
        saya.makan("NASI GORENG");
    }
}
