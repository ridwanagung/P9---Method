public class CetakTruk {

    public static void main(String arg[]){
        Truk truk = new Truk(1000);
        System.out.println ("Muatan maksimal :" +truk.getMuatanMaks());
        truk.tambahMuatan1(500.0);
        System.out.println (" Tambah muatan  : 500");
        truk.tambahMuatan1(350.0);
        System.out.println (" Tambah muatan  : 350");
        truk.tambahMuatan1(100.0);
        System.out.println (" Tambah muatan  : 100");
        truk.tambahMuatan1(150.0);
        System.out.println (" Tambah muatan  : 150");
        System.out.println ("Muatan sekarang = " + truk.getMuatan());
    }
}