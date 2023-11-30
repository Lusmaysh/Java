package syamsul;
public class SYAMSUL64 {
    public static void main(String[] args) {
        int x=10;
        try
        {
            x/=4;
            System.out.println("INI NILAI YANG BENAR DARI HASIL BAGI = "+x);
        }
        catch(Exception e)
        {
            System.out.println("INI NILAI YANG SALAH = "+x);
        }
    }
}