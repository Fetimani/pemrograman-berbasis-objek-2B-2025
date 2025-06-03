package com.mycompany.Buku;

public class BukuFiksi extends Buku {
    private String genre;

    public BukuFiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        this.genre = genre;
    }

    public void infoFiksi() {
        System.out.println("\n📖 [Buku Fiksi]");
        super.info();
        System.out.println("🎭 Genre   : " + genre);
    }
}