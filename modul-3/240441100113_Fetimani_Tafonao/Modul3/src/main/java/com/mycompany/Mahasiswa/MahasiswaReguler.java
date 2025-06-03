package com.mycompany.Mahasiswa;

public class MahasiswaReguler extends Mahasiswa {
    private String kelas;

    public MahasiswaReguler(String nama, String nim, String kelas) {
        super(nama, nim);
        this.kelas = kelas;
    }

    public void infoReguler() {
        System.out.println("\n===== 👨‍🎓 DATA MAHASISWA REGULER =====");
        super.infoMahasiswa();
        System.out.println("🏫 Kelas   : " + kelas);
    }
}