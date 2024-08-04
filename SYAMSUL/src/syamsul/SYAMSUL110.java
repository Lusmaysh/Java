package syamsul;
import javax.swing.JOptionPane;
public class SYAMSUL110 {
    public static boolean putar=true;
    public static void main(String[] args) {
        PIL1 data = new PIL1();
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
                    data.total("NASI PADANG ORIGINAL",10000);
                    break;
                case "2":
                    data.total("NASI PADANG + ESTEH",15000);
                    break;
                case "3":
                    data.total("NASI PADANG + ESTEH",13000);
                    break;
                case "4":
                    data.total("NASI PADANG + GULAI AYAM",20000);
                    break;
                case "5":
                    System.exit(0);putar=false;
                    break;
            }
        }while(putar);
    }
}