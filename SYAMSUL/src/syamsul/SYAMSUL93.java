package syamsul; // p13-k1
public class SYAMSUL93 {
    public static int harga;
    void pertalite()
    {
        harga = 10000;
        System.out.println(" HARGA PERTALITE PER LITER RP."+harga);
    }
    void pertamax()
    {
        harga = 15000;
        System.out.println(" HARGA PERTAMAX PER LITER RP."+harga);
    }
    void solar()
    {
        harga = 6500;
        System.out.println(" HARGA SOLAR PER LITER RP."+harga);
    }
    public static void main(String[] args) {
        SYAMSUL93 bensin = new SYAMSUL93();
        System.out.println("\n======== PERTALITE ========");
        bensin.pertalite();
        System.out.println("\n======== PERTAMAX =========");
        bensin.pertamax();
        System.out.println("\n========  SOLAR   =========");
        bensin.solar();
    }
}
       bensin.solar();
    }
}
