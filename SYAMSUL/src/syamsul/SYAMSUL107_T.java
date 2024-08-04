package syamsul;
import javax.swing.JOptionPane;
public class SYAMSUL107_T {
    public static boolean putar=true;
    public static void main(String[] args) {
        do
        {
            String pil = JOptionPane.showInputDialog("    MENU WM. PADANG JAYA    "
                                                     + "\n 1. NASI PADANG ORIGINAL"
                                                     + "\n 2. NASI PADANG + ESTEH"                             
                                                     + "\n 3. NASI PADANG + RENDANG"
                                                     + "\n 4. NASI PADANG + GULAI AYAM "
                                                     + "\n 5. KELUAR"
                                                     + "\n PILIH [1 - 5]");
            switch(pil){
                case "1":
                    PIL1.total1();
                    break;
                case "2":
                    PIL1.total2();
                    break;
                case "3":
                    PIL1.total3();
                    break;
                case "4":
                    PIL1.total4();
                    break;
                case "5":
                    System.exit(0);putar=false;
                    break;
            }
        }while(putar);
    }
}
