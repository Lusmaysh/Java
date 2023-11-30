package syamsul;
public class SYAMSUL32 {
    public static void main(String[] args){
        int ut=2, a=20, b=9, gt=0, sp=9;
        while(ut<=5)
        {
            int sp1=sp, t=0, c=0;
            while(sp1>=1)
            {
                System.out.print(" ");
                sp1--;
            }
            int br = ut;
            while(br>=2)
            {
                System.out.print(a+" ");
                t += a;
                a--;
                br--;
            }
            t += b;
            System.out.println("+ "+b+" = "+ t);
            b--;
            gt += t;
            sp -= 3;
            ut++;
        }
        System.out.println("======================= + ");
        System.out.println("total keseluruhan  "+gt);
        System.out.println("\nSYAMSUL HIDAYAT 23.240.0130");
    }
}
