package com.mycompany.Buku;

public class Buku {
    protected String judul;
    protected String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public void info() {
        System.out.println("📘 Judul : " + judul);
        System.out.println("✍️ Penulis : " + penulis);
    }
}