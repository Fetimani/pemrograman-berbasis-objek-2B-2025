package com.mycompany.Buku;

public class Main {
    public static void main(String[] args) {
        // Perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBukuFiksi(new BukuFiksi("Dilan", "Pidi Baiq", "Romance"));
        perpustakaan.tambahBukuFiksi(new BukuFiksi("Harry Potter", "J.K. Rowling", "Fantasy"));
        perpustakaan.tambahBukuNonFiksi(new BukuNonFiksi("Filosofi Teras", "Henry Manampiring", "Psikologi"));
        perpustakaan.tambahBukuNonFiksi(new BukuNonFiksi("Atomic Habits", "James Clear", "Pengembangan Diri"));
        perpustakaan.tampilkanKoleksi();
    }
}