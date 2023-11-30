package syamsul;
public class SYAMSUL30
{
    public static void main(String[] args)
    {
        int b=2, t=0, br=3, c;
        while(b<=4)
        {
            int a=1;
            while (br>=1){
                c = a+b;
                System.out.println("\t"+a+" + "+b+" = "+c);
                t = t+c;
                a = a+1;
                br = br-1;
            }
            br = 4;
            b = b+2;
        }
        System.out.println("\t---------- +");
        System.out.println("\ttotal  "+t);
        System.out.println("\nSYAMSUL HIDAYAT 23.240.0130");
    }
}