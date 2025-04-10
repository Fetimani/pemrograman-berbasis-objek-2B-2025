import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data mahasiswa 1
        System.out.println("=== Input Mahasiswa 1 ===");
        System.out.print("Nama: ");
        String nama1 = input.nextLine();
        System.out.print("NIM: ");
        String nim1 = input.nextLine();
        System.out.print("Prodi: ");
        String prodi1 = input.nextLine();
        System.out.print("Alamat: ");
        String alamat1 = input.nextLine();
        Mahasiswa mhs1 = new Mahasiswa(nama1, nim1, prodi1, alamat1);

        // Input data mahasiswa 2
        System.out.println("\n=== Input Mahasiswa 2 ===");
        System.out.print("Nama: ");
        String nama2 = input.nextLine();
        System.out.print("NIM: ");
        String nim2 = input.nextLine();
        System.out.print("Prodi: ");
        String prodi2 = input.nextLine();
        System.out.print("Alamat: ");
        String alamat2 = input.nextLine();
        Mahasiswa mhs2 = new Mahasiswa(nama2, nim2, prodi2, alamat2);

        // Input data mahasiswa 3
        System.out.println("\n=== Input Mahasiswa 3 ===");
        System.out.print("Nama: ");
        String nama3 = input.nextLine();
        System.out.print("NIM: ");
        String nim3 = input.nextLine();
        System.out.print("Prodi: ");
        String prodi3 = input.nextLine();
        System.out.print("Alamat: ");
        String alamat3 = input.nextLine();
        Mahasiswa mhs3 = new Mahasiswa(nama3, nim3, prodi3, alamat3);

        // Tampilkan data mahasiswa (tanpa loop)
        System.out.println("\n=== Data Mahasiswa 1 ===");
        mhs1.tampilkanData();

        System.out.println("\n=== Data Mahasiswa 2 ===");
        mhs2.tampilkanData();

        System.out.println("\n=== Data Mahasiswa 3 ===");
        mhs3.tampilkanData();

        input.close();
    }
}

// Class Mahasiswa
class Mahasiswa {
    String nama, nim, prodi, alamat;

    Mahasiswa(String nama, String nim, String prodi, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
    }

    void tampilkanData() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Prodi    : " + prodi);
        System.out.println("Alamat   : " + alamat);
    }
}
