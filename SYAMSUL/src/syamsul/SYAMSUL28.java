package syamsul;
public class SYAMSUL28 
{
    public static void main(String[] args) 
    {
        int utama=3;
        while (utama<=5)
        {
            int tt=0, jm=0, sarang=12;
            do
            {
                jm = sarang+utama;
                System.out.println("\t"+sarang+" + "+utama+" = "+jm);
                tt = tt+jm;
                sarang = sarang+1;
            }
            while(sarang<=14);
            System.out.println("\t--------- +");
            System.out.println("\ttotal  "+tt);
            utama = utama+1;
        }
        System.out.println("\nSYAMSUL HIDAYAT 23.240.0130");
    }
}