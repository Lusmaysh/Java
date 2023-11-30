package syamsul;
public class SYAMSUL23 
{
    public static void main(String[] args) 
    {
        int ut=2, ck = 15;
        while (ut<=4)
        {
            int br = 1, t = 0; 
            while(br<=4)
            {
                System.out.println("           "+ck);
                t = t + ck;
                ck = ck + 5;
                br = br + 1;
            }
            System.out.println("---------------- +");
            System.out.println(" TOTAL =   "+t);
            ut = ut + 2;
        }
        System.out.println("\nSYAMSUL HIDAYAT 23.240.0130");
    }
} 