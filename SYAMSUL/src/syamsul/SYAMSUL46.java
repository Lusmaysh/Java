package syamsul;
import javax.swing.JOptionPane;
public class SYAMSUL46 {
    public static void main(String[] args) {
        String tampung=" ";
        for (int nilai=1;nilai<=5;nilai++) {
            tampung += nilai+" ";
        }
        tampung += "\n SYAMSUL HIDAYAT 23.240.0130";
        JOptionPane.showMessageDialog(null,tampung,"DERET",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
