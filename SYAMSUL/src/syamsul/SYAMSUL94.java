package syamsul; // p13-k2
public class SYAMSUL94 {
    String n="INDONESIA";
    int p = 100000, lhr = 4800;
    double kem=14400;
    public static void main(String[] args) {
        SYAMSUL94 data = new SYAMSUL94();
        System.out.println("NAMA NEGARA \""+data.negara()+"\"");
        System.out.println("JUMLAH PENDUDUK "+data.penduduk()+" JIWA");
        System.out.println("INDEX KELAHIRAN "+data.kelahiran());
        System.out.println("INDEX KEMATIAN "+data.kematian());
    }
    String negara()
    {
        return n;
    }
    int penduduk()
    {
        return p + lhr;
    }
    float kelahiran()
    {
        return p / lhr;
    }
    double kematian()
    {
        return (p + lhr) / kem;
    }
}