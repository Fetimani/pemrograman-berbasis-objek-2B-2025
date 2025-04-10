public class soal3 {
    public static void main(String[] args) {
        // Buat objek Kucing
        Kucing k1 = new Kucing("Milo", "Putih", 2);
        Kucing k2 = new Kucing("Oyen", "Orange", 1);
        Kucing k3 = new Kucing("Blacky", "Hitam", 3);

        // Buat objek Burung
        Burung b1 = new Burung("Cendet", "Abu-abu", true);
        Burung b2 = new Burung("Beo", "Hitam", true);
        Burung b3 = new Burung("Ayam", "Coklat", false);

        // Buat objek Ikan
        Ikan i1 = new Ikan("Cupang", "Merah", "Air Tawar");
        Ikan i2 = new Ikan("Koi", "Putih Merah", "Air Tawar");
        Ikan i3 = new Ikan("Lumba-lumba", "Abu", "Air Laut");

        // Looping manual pakai if-else (tanpa array)
        for (int i = 1; i <= 3; i++) {
            System.out.println("\n=== Kucing ke-" + i + " ===");
            switch (i) {
                case 1:
                    k1.suara();
                    k1.info();
                    break;
                case 2:
                    k2.suara();
                    k2.info();
                    break;
                default:
                    k3.suara();
                    k3.info();
                    break;
            }
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("\n=== Burung ke-" + i + " ===");
            if (i == 1) {
                b1.terbang(); b1.info();
            } else if (i == 2) {
                b2.terbang(); b2.info();
            } else {
                b3.terbang(); b3.info();
            }
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("\n=== Ikan ke-" + i + " ===");
            if (i == 1) {
                i1.berenang(); i1.info();
            } else if (i == 2) {
                i2.berenang(); i2.info();
            } else {
                i3.berenang(); i3.info();
            }
        }
    }
}

// Class Kucing
class Kucing {
    String nama, warna;
    int umur;

    Kucing(String nama, String warna, int umur) {
        this.nama = nama;
        this.warna = warna;
        this.umur = umur;
    }

    void suara() {
        System.out.println(nama + " mengeong: Meoong~");
    }

    void info() {
        System.out.println("Nama: " + nama + ", Warna: " + warna + ", Umur: " + umur + " tahun");
    }
}

// Class Burung
class Burung {
    String nama, warna;
    boolean bisaTerbang;

    Burung(String nama, String warna, boolean bisaTerbang) {
        this.nama = nama;
        this.warna = warna;
        this.bisaTerbang = bisaTerbang;
    }

    void terbang() {
        if (bisaTerbang) {
            System.out.println(nama + " sedang terbang...");
        } else {
            System.out.println(nama + " tidak bisa terbang.");
        }
    }

    void info() {
        System.out.println("Nama: " + nama + ", Warna: " + warna + ", Bisa Terbang: " + bisaTerbang);
    }
}

// Class Ikan
class Ikan {
    String nama, warna, jenisAir;

    Ikan(String nama, String warna, String jenisAir) {
        this.nama = nama;
        this.warna = warna;
        this.jenisAir = jenisAir;
    }

    void berenang() {
        System.out.println(nama + " sedang berenang di " + jenisAir);
    }

    void info() {
        System.out.println("Nama: " + nama + ", Warna: " + warna + ", Jenis Air: " + jenisAir);
    }
}
