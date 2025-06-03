package com.mycompany.Buku;

public class BukuNonFiksi extends Buku {
    private String topik;

    public BukuNonFiksi(String judul, String penulis, String topik) {
        super(judul, penulis);
        this.topik = topik;
    }

    public void infoNonFiksi() {
        System.out.println("\n📖 [Buku Non-Fiksi]");
        super.info();
        System.out.println("📚 Topik   : " + topik);
    }
}