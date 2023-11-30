package syamsul;
import javax.swing.*;
public class SYAMSUL56 {
    private static String kelamin;
    private static int nl;
    public static void main(String[] args) {
        String lagi="y";
        boolean c;
        do
        {
            String info="";
            String nama=JOptionPane.showInputDialog("MASUKAN NAMA");
            do
            {
                kelamin=JOptionPane.showInputDialog("MASUKAN JENIS KELAMIN [L/P]");
            }
            while(!("l".equals(kelamin) || "L".equals(kelamin) || "p".equals(kelamin) || "P".equals(kelamin)));

            do
            {
                String nilai=JOptionPane.showInputDialog("MASUKAN NILAI 0 - 100");
                nl=Integer.parseInt(nilai);
                boolean a=nl>=0;
                boolean b=nl<=100;
                c=a&b;
            }
            while(!(c));
            
            String jenis="PEREMPUAN";
            if("l".equals(kelamin) || "L".equals(kelamin)) {
                jenis="LAKI-LAKI";
            }
            
            String keterangan;
            if(nl<=59){
                keterangan = "TIDAK LULUS";
            }
            else {
                keterangan = "LULUS";
            }
            
            String hasil="";
            if(nl<=30){
                hasil = "E";
            }
            else if(nl<=59){
                hasil = "D";
            }
            else if(nl<=70){
                hasil = "C";
            }
            else if(nl<=80){
                hasil = "B";
            }
            else {
                hasil = "A";
            }
            
            info +="\n Nama Siswa       = "+nama;
            info +="\n JENIS KELAMIN    = "+jenis;
            info +="\n NILAI            = "+nl;
            info +="\n HASIL            = "+keterangan;
            info +="\n GRADE            = "+hasil;
            
            JOptionPane.showMessageDialog(null, info,"HASIL PENILAIAN UJIAN",JOptionPane.INFORMATION_MESSAGE);
            info = "";
            
            do
            {
                lagi = JOptionPane.showInputDialog("INPUT DATA LAGI [Y/T]");
            }
            while(!("y".equals(lagi) || "Y".equals(lagi) || "t".equals(lagi) || "T".equals(lagi)));
        }
        while ("y".equals(lagi) || "Y".equals(lagi));
    }
}