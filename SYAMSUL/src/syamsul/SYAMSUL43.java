package syamsul;
import javax.swing.JOptionPane;
public class SYAMSUL43 {
    public static void main(String[] args)
    {
        String tampil=" ";
        for(int a=2;a<=10;a+=2)
        {
            tampil += a+" ";
        }
        tampil+="\n SYAMSUL HIDAYAT 23.240.0130";
        JOptionPane.showMessageDialog(null,tampil,"WHILE",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
