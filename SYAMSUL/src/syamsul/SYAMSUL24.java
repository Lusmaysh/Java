package syamsul;
public class SYAMSUL24 
{
    public static void main(String[] args)
    {
        int ut=1, a=14, b=2, c=0, f=0;
        while(ut<=2)
        {
            int d=5, e=4, t=0;
            while(d<=7)
            {
                c = a+b;
                f = c*d-e;
                System.out.println(a+" + "+b+" = "+c+" * "+d+" - "+e+" = "+f);
                t = t+f;
                a = a+1;
                d = d+1;
                e = e-1;
            }
            System.out.println("-------------- +");
            System.out.println("total =   "+t);
            b = b+2;
            ut = ut+1;
        }
        System.out.println("\nSYAMSUL HIDAYAT 23.240.0130");
    }
}