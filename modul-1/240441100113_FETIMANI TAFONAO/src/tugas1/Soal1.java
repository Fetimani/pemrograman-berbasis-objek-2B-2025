public class Soal1 {
    public static void main(String[] args) {
        // Buat 5 objek Manusia
        Manusia m1 = new Manusia("Andi", 20, "Surabaya");
        Manusia m2 = new Manusia("Budi", 22, "Malang");
        Manusia m3 = new Manusia("Citra", 19, "Sidoarjo");
        Manusia m4 = new Manusia("Dewi", 21, "Madura");
        Manusia m5 = new Manusia("Eko", 23, "Gresik");

        // Tampilkan data tiap manusia (tanpa perulangan)
        System.out.println("Data Manusia ke-1");
        m1.berjalan();
        m1.berlari();
        m1.info();

        System.out.println("\nData Manusia ke-2");
        m2.berjalan();
        m2.berlari();
        m2.info();

        System.out.println("\nData Manusia ke-3");
        m3.berjalan();
        m3.berlari();
        m3.info();

        System.out.println("\nData Manusia ke-4");
        m4.berjalan();
        m4.berlari();
        m4.info();

        System.out.println("\nData Manusia ke-5");
        m5.berjalan();
        m5.berlari();
        m5.info();
    }
}

// Class Manusia
class Manusia {
    String nama;
    int umur;
    String alamat;

    Manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    void berjalan() {
        System.out.println(nama + " sedang berjalan...");
    }

    void berlari() {
        System.out.println(nama + " sedang berlari...");
    }

    void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Alamat: " + alamat);
    }
}
