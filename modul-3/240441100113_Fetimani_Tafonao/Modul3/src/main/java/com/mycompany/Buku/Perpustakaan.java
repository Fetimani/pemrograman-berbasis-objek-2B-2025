package com.mycompany.Buku;

import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<BukuFiksi> koleksiFiksi = new ArrayList<>();
    private ArrayList<BukuNonFiksi> koleksiNonFiksi = new ArrayList<>();

    public void tambahBukuFiksi(BukuFiksi buku) {
        koleksiFiksi.add(buku);
    }

    public void tambahBukuNonFiksi(BukuNonFiksi buku) {
        koleksiNonFiksi.add(buku);
    }

    public void tampilkanKoleksi() {
        System.out.println("\n===== 📚 KOLEKSI BUKU DI PERPUSTAKAAN =====");
        for (BukuFiksi fiksi : koleksiFiksi) {
            fiksi.infoFiksi();
        }
        for (BukuNonFiksi nonFiksi : koleksiNonFiksi) {
            nonFiksi.infoNonFiksi();
        }
    }
}