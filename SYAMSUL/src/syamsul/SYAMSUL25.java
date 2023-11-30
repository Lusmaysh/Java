package syamsul;
public class SYAMSUL25 
{
    public static void main(String[] args) 
    {
        int ut=1, a=15, b=3, ut2=3;
        while (ut<=2)
        {
            int t=0, c=0;
            while (ut2>=1)
            {
                c = a+a+a+b;
                int ut3 = 3;
                while (ut3>=1)
                {
                    System.out.print(a+" + ");
                    ut3 = ut3-1;
                }
                System.out.println(b+" = "+c);
                a = a+1;
                b = b+1;
                t = t+c;
                ut2 = ut2-1;
            }
            b = 4; ut2 = 4;
            System.out.println("---------- +");
            System.out.println("total  "+t);
            ut = ut+1;
        }
        System.out.println("\nSYAMSUL HIDAYAT 23.240.0130");
    }
}