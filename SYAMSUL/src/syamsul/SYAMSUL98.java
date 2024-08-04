package syamsul; //62
public class SYAMSUL98 {
    String hewan = "domba";
    int kandang1=20,kandang2=100,hasil;
    public static void main(String[] args) {
        SYAMSUL98 data = new SYAMSUL98();
        System.out.println("Jenis Hewan: "+data.jenis());
        System.out.println("Jumlahnya: "+data.jumlah()+" Ekor");
    }
    String jenis()
    {
        return hewan;
    }
    int jumlah()
    {
        hasil=kandang1+kandang2;
        return hasil;
    }
}
