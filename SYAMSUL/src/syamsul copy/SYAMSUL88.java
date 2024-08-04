package syamsul;//54
import javax.swing.JOptionPane;
public class SYAMSUL88 {
    public static void main(String[] args) {
        int jh,h;
        String data = JOptionPane.showInputDialog("MASUKAN JUMLAH DATA");
        int x =Integer.parseInt(data);
        h=x%3;
        if(h==0)
        {
            jh=x/3;
        }
        else
        {
            jh=(x/3)+1;
        }
        JOptionPane.showMessageDialog(null, "JUMLAH DATA = "+data+"\nJUMLAH HALAMAN = "+jh+"\n");
    }
}
