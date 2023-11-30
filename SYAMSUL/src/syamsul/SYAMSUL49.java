package syamsul;
public class SYAMSUL49 {
    public static void main(String[] args) {
        System.out.println(" DAFTAR INDEX DAGANG");
        System.out.println("---------------------");
        System.out.println(" NO    NILAI    HARGA\n");
        int t1=0, t2=0, z=50;
        for(int a=1,b=25,c=100;a<=6;a++) {
            System.out.println(a+"    "+b+"    "+c);
            t1+=b; t2+=c;
            b+=5;
            c+=z;
            z+=10;
        }
        System.out.println("---------------------");
        System.out.println("Total = "+t1+"    "+t2);
        System.out.println("\nSYAMSUL HIDAYAT 23.240.0130");
    }
}
