package syamsul;//56
import javax.swing.JOptionPane;
public class SYAMSUL90 {
    private static boolean putar=true;
    public static void main(String[] args) {
        int jh,h,x1,x2;
        String tampil="";
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
        if(jh==1)
        {
            x1=1;
            x2=x;
        }
        else
        {
            x1=1;
            x2=3;
        }
        for(int y=1;y<=jh;y++)
        {
        tampil += "HAL = "+y+"\n";
        tampil += "    INFORMASI DATA\n";
        tampil += "----------------------\n";
        tampil += "         NO\n";
        tampil += "----------------------\n";
        if(y==jh)
        {
            x2=x;
        }
        for(int z=x1;z<=x2;z++)
        {
            tampil += "         "+z+"\n";
        }
        tampil += "----------------------\n";
        JOptionPane.showMessageDialog(null,tampil,"INFORMASI DATA",JOptionPane.INFORMATION_MESSAGE);
        tampil ="";
        x1+=3;
        x2+=3;
        }
    }
}