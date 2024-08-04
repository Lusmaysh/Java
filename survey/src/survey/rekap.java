package survey;
import javax.swing.JOptionPane;
public class rekap {
    static void rekap(int no,String judul,String a,String b,String c,String d,int e,String f,String g,String h,String i,String j,String k,String l,String m){
        String rekap="";
        rekap+=
          "           "+judul+" DATA PEDAGANG\n"
        + "1. NAMA TOKO                                                :  ["+a+"]\n"
        + "2. ALAMAT                                                      :  ["+b+"]\n"
        + "3. NAMA PEMILIK                                            :  ["+c+"]\n"
        + "4. JENIS USAHA                                             :  ["+d+"]\n"
        + "5. MODAL                                                        :  ["+e+"]\n"
        + "6. PENJUALAN                                                :  ["+f+"]\n"
        + "7. PEMBELI                                                      :  ["+g+"]\n"
        + "8. CABANG                                                       :  ["+h+"]\n"
        + "9. ALAMAT EMAIL                                           :  ["+i+"]\n"
        + "10. SOSIAL MEDIA                                          :  ["+j+"]\n"
        + "11. NO TELPON / HP                                       :  ["+k+"]\n"
        + "12. STATUS PEMILIK [NIKAH] / [BELUM] =  ["+l+"] N/B\n"
        + "13. ONLINE SHOP                                          :  ["+m+"]  (MAHASISWA)\n";
       JOptionPane.showMessageDialog(null,rekap,"DATA = "+no,JOptionPane.INFORMATION_MESSAGE);
    }
    
    int milih_data(String tam,int max){
        String a;
        int convert=0;
        boolean p;
        do
        {
            try
            {
                a = JOptionPane.showInputDialog(tam);
                convert = Integer.parseInt(a);p = false;
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,"ERROR , DATA SALAH INPUT");p = true;
            }
        }while (p || (!(convert >=1 && convert <= max)) );
        return convert;
    }
}