package syamsul;
public class SYAMSUL31 
{
    public static void main(String[] args)
    {
        int ut=2, a=7, c=2, d=0;
        while(ut<=4)
        {
            int t=0, b=5, ut2=ut;
            do
            {
                d = a+b-c;
                System.out.println(a+" + "+b+" - "+c+" = "+d);
                t = t+d;
                a = a+1;
                b = b-1;
                c = c+1;
                ut2 = ut2-1;
            }
            while(ut2>=1);
            System.out.println("============ +");
            System.out.println("total  "+t);
            ut = ut+1;
        }
        System.out.println("\nSYAMSUL HIDAYAT 23.240.0130");
    }
}