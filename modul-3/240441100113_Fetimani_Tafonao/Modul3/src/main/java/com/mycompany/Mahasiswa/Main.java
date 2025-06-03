package com.mycompany.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        // Mahasiswa Reguler
        MahasiswaReguler m1 = new MahasiswaReguler("Fetimani Tafonao", "220001", "SI-3A");
        MahasiswaReguler m2 = new MahasiswaReguler("Dian Ayu", "220003", "SI-3B");
        m1.infoReguler();
        m2.infoReguler();

        // Mahasiswa Beasiswa
        MahasiswaBeasiswa b1 = new MahasiswaBeasiswa("Sari Putri", "220002", "KIP Kuliah");
        MahasiswaBeasiswa b2 = new MahasiswaBeasiswa("Budi Setiawan", "220004", "Beasiswa Prestasi");
        b1.infoBeasiswa();
        b2.infoBeasiswa();
    }
}