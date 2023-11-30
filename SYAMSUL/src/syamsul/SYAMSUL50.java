package syamsul;
import javax.swing.JOptionPane;
public class SYAMSUL50 {
    public static void main(String[] args) {
        String cetak=" ";
        cetak += "\n DAFTAR INDEX DAGANG";
        cetak += "\n------------------------------------";
        cetak += "\n   NO   NILAI   HARGA\n";
        int t1=0, t2=0, z=50;
        for(int a=1,b=25,c=100;a<=6;a++) {
            cetak += "\n    "+a+"       "+b+"       "+c;
            t1+=b; t2+=c;
            b+=5;
            c+=z;
            z+=10;
        }
        cetak += "\n--------------------------------------";
        cetak += "\nTotal =  "+t1+"     "+t2+"\n";
        cetak += "\nSYAMSUL HIDAYAT 23.240.0130";
        JOptionPane.showMessageDialog(null,cetak,"DAFTAR INDEX BANK MULYA",JOptionPane.INFORMATION_MESSAGE);
    }
}
