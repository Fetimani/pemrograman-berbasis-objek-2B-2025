package com.mycompany.Mahasiswa;

public class MahasiswaBeasiswa extends Mahasiswa {
    private String jenisBeasiswa;

    public MahasiswaBeasiswa(String nama, String nim, String jenisBeasiswa) {
        super(nama, nim);
        this.jenisBeasiswa = jenisBeasiswa;
    }

    public void infoBeasiswa() {
        System.out.println("\n===== 🎓 DATA MAHASISWA BEASISWA =====");
        super.infoMahasiswa();
        System.out.println("🎁 Beasiswa: " + jenisBeasiswa);
    }
}