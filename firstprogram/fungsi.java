package firstprogram;
import firstprogram.Nama;
public class fungsi {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int z = 7;
        int w = 8;

        Nama.Syahbana("Athar");
        Nama.Syahbana("Ashila");
        Nama.Syahbana("Dio");
        tambah(x,y);
        tambah(x,z);
        tambah(y,z);
        tambah(x,w);
        tambah(y,w);
        tambah(z,w);
    }

    public static int tambah(int a, int b){
        int hasilTambah = a+b;
        System.out.println("Hasil tambah "+a+" dan "+b+" adalah = "+hasilTambah);
        return hasilTambah;
    }
}
