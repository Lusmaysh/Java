package syamsul;
import javax.swing.*;
public class SYAMSUL61 {
    public static void main(String[] args) {
        String tampil ="";
        float rata = 0f;
        double def = 0.25, koreksi;
        
        String ujian1 = JOptionPane.showInputDialog("NILAI UJIAN 1");
        int nil1=Integer.parseInt(ujian1);
        String ujian2 = JOptionPane.showInputDialog("NILAI UJIAN 2");
        int nil2=Integer.parseInt(ujian2);
        
        rata= (nil1+nil2)/2;
        koreksi = rata*def;
        tampil += "             HASIL UJIAN           \n";
        tampil += "===================================\n";
        tampil += " 1. NILAI UJIAN 1  = "+nil1+"\n";
        tampil += " 2. NILAI UJIAN 2  = "+nil2+"\n";
        tampil += "-----------------------------------\n";
        tampil += " RATA - RATA NILAI = "+rata+"\n";
        tampil += " HASIL DEFINISI    = "+koreksi+"\n";
        JOptionPane.showMessageDialog(null,tampil,"HASIL UJIAN",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
