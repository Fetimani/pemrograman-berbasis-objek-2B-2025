package com.mycompany.prak;

public class PRAK {

    public static void main(String[] args) {
        
        kampus utm = new kampus("Universitas Trunojoyo Madura", "Jl. Raya Telang, Madura");
        utm.tampilkanInfoKampus();

        System.out.println();

        
        matakuliah mk1 = new matakuliah("SI101", "PBO", 3);
        matakuliah mk2 = new matakuliah("SI102", "Struktur Data", 3);
        matakuliah mk3 = new matakuliah("SI103", "Basis Data", 2);
        matakuliah mk4 = new matakuliah("SI104", "Jaringan Komputer", 3);
        matakuliah mk5 = new matakuliah("SI105", "Kalkulus", 3);
        matakuliah mk6 = new matakuliah("SI106", "Pemrograman Dasar", 3);
        matakuliah mk7 = new matakuliah("SI107", "Matematika Diskrit", 2);
        matakuliah mk8 = new matakuliah("SI108", "Etika Profesi", 2);

      
        mahasiswa m1 = new mahasiswa("Budi", "2312345678", "Sistem Informasi");
        mahasiswa m2 = new mahasiswa("Ani", "2312345679", "Sistem Informasi");
        mahasiswa m3 = new mahasiswa("Rina", "2312345680", "Sistem Informasi");
        mahasiswa m4 = new mahasiswa("Tono", "2312345681", "Sistem Informasi");
        mahasiswa m5 = new mahasiswa("Lisa", "2312345682", "Sistem Informasi");
        mahasiswa m6 = new mahasiswa("Dika", "2312345683", "Sistem Informasi");

       
        m1.tambahMatkul(mk1); m1.tambahMatkul(mk2); m1.tambahMatkul(mk3); m1.tambahMatkul(mk4);
        m2.tambahMatkul(mk1); m2.tambahMatkul(mk5); m2.tambahMatkul(mk6); m2.tambahMatkul(mk7);
        m3.tambahMatkul(mk2); m3.tambahMatkul(mk3); m3.tambahMatkul(mk8); m3.tambahMatkul(mk4);
        m4.tambahMatkul(mk1); m4.tambahMatkul(mk2); m4.tambahMatkul(mk3); m4.tambahMatkul(mk5);
        m5.tambahMatkul(mk4); m5.tambahMatkul(mk6); m5.tambahMatkul(mk7); m5.tambahMatkul(mk8);
        m6.tambahMatkul(mk1); m6.tambahMatkul(mk2); m6.tambahMatkul(mk6); m6.tambahMatkul(mk7);

        System.out.println();

       
        m1.tampilkanData();
        m2.tampilkanData();
        m3.tampilkanData();
        m4.tampilkanData();
        m5.tampilkanData();
        m6.tampilkanData();

        mahasiswa.tampilkanJumlahMahasiswa();
    }
}
