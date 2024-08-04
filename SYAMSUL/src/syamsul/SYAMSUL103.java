package syamsul; //67
public class SYAMSUL103 {
    public static void main(String[] args) {
        int s=12;
        int luas=luaskubus(s);
        System.out.println(luas);
    }
    static int luaspersegi(int sisi)
    {
        return sisi*sisi;
    }
    static int luaskubus(int sisi)
    {
        return 6 * luaspersegi(sisi);
    }
}
