package syamsul;
import javax.swing.*;
public class SYAMSUL58 {
    public static void main(String[] args) {
        float hb=0.0f;
        try
        {
            String n=JOptionPane.showInputDialog("   NILAI ");
            int nn = Integer.parseInt(n);
            String b=JOptionPane.showInputDialog("   BAGI ");
            int nb = Integer.parseInt(b);
            hb = nn/nb;
            JOptionPane.showMessageDialog(null," NILAI BAGI = "+hb," HASIL",JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null," ANDA SALAH TUL^IS");
        }
    }
}