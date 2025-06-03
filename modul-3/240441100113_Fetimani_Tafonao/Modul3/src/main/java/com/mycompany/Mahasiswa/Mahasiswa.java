package com.mycompany.Mahasiswa;

public class Mahasiswa {
    protected String nama;
    protected String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void infoMahasiswa() {
        System.out.println("📚 Nama: " + nama);
        System.out.println("🆔 NIM : " + nim);
    }
}