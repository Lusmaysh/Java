package syamsul;
public class SYAMSUL10 {
    public static void main(String[] args)
    {
        int a=12, b=4, c=1, d=0, e=6, f=2, g=0, h=1;
        while (c<=5)
        {
            d = a*b*c;
            g = d+e-f;
            System.out.println(a+"\t * "+b+"\t * "+c+"\t = "+d+"\t + "+e+"\t - "+f+"\t = "+g);
            b = b + h;
            c = c + 1;
            e = e * 2;
            f = f + 1;
            h = h + 1;
        }
    }
}