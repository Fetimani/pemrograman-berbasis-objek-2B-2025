package com.mycompany.prak;

import java.util.ArrayList;

public class mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private ArrayList<matakuliah> daftarMatkul = new ArrayList<>();
    private static int jumlahMahasiswa = 0;

    public mahasiswa(String nama, String nim, String prodi) {
        if (isValidNIM(nim)) {
            this.nama = nama;
            this.nim = nim;
            this.prodi = prodi;
            jumlahMahasiswa++;
        } else {
            System.out.println("NIM tidak valid untuk mahasiswa: " + nama);
        }
    }

    public void tambahMatkul(matakuliah mk) {
        daftarMatkul.add(mk);
    }

    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Prodi: " + prodi);
        System.out.println("Daftar Mata Kuliah:");
        for (matakuliah mk : daftarMatkul) {
            System.out.println("  - " + mk);
        }
        System.out.println();
    }

    public static boolean isValidNIM(String nim) {
        return nim.startsWith("23") && nim.length() == 10;
    }

    public static void tampilkanJumlahMahasiswa() {
        System.out.println("Total Mahasiswa: " + jumlahMahasiswa);
    }
}
 