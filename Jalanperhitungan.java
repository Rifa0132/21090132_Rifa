import Model.perhitungan;

public class Jalanperhitungan {
    public static void main(String[] args) {
        perhitungan s = new perhitungan(4, 6, 0);

        s.printjudul();

        int HasilTambah = s.hitungtmbah(4, 6);
        System.out.println(HasilTambah);

        int Hasilkli = s.hitungkli(4, 6);
        System.out.println(Hasilkli);
    }
}
